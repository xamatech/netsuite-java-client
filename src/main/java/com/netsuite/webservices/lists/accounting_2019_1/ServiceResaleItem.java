/**
 * ServiceResaleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ServiceResaleItem  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String purchaseDescription;

    private java.lang.Boolean manufacturingChargeItem;

    private java.lang.Double cost;

    private java.lang.String costUnits;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoExpenseAccount;

    private java.lang.String salesDescription;

    private java.lang.Boolean includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef incomeAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoIncomeAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef saleUnit;

    private java.lang.String costEstimateUnits;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef deferredRevenueAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoDefRevAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate;

    private java.lang.String residual;

    private java.lang.Boolean deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revenueAllocationGroup;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createRevenuePlansOn;

    private java.lang.Boolean directRevenuePosting;

    private java.lang.Boolean contingentRevenueHandling;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revReclassFXAccount;

    private java.lang.Long amortizationPeriod;

    private java.lang.Long minimumQuantity;

    private java.lang.Boolean enforceMinQtyInternally;

    private java.lang.Long maximumQuantity;

    private java.lang.String softDescriptor;

    private java.lang.Boolean pricesIncludeTax;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef quantityPricingSchedule;

    private java.lang.Boolean useMarginalRates;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType overallQuantityPricingType;

    private java.lang.Boolean isFulfillable;

    private java.lang.Boolean generateAccruals;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory;

    private java.lang.Double purchaseOrderQuantity;

    private java.lang.Double purchaseOrderAmount;

    private java.lang.Double purchaseOrderQuantityDiff;

    private java.lang.Double receiptQuantity;

    private java.lang.Double receiptAmount;

    private java.lang.Double receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef pricingGroup;

    private java.lang.String minimumQuantityUnits;

    private java.lang.Double vsoePrice;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory;

    private java.lang.Boolean createJob;

    private java.lang.String matrixItemNameTemplate;

    private java.lang.String storeDisplayName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage;

    private java.lang.String storeDescription;

    private java.lang.String storeDetailedDescription;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeItemTemplate;

    private java.lang.String pageTitle;

    private java.lang.String urlComponent;

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

    private com.netsuite.webservices.lists.accounting_2019_1.ServiceItemTaskTemplatesList itemTaskTemplatesList;

    private java.lang.String featuredDescription;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String itemId;

    private java.lang.String upcCode;

    private java.lang.String displayName;

    private java.lang.String vendorName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isGcoCompliant;

    private java.lang.Boolean offerSupport;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean availableToPartners;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList;

    private java.lang.String currency;

    private com.netsuite.webservices.lists.accounting_2019_1.BillingRatesMatrix billingRatesMatrix;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList;

    private com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList;

    private com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix pricingMatrix;

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

    public ServiceResaleItem() {
    }

    public ServiceResaleItem(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String purchaseDescription,
           java.lang.Boolean manufacturingChargeItem,
           java.lang.Double cost,
           java.lang.String costUnits,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoExpenseAccount,
           java.lang.String salesDescription,
           java.lang.Boolean includeChildren,
           com.netsuite.webservices.platform.core_2019_1.RecordRef incomeAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoIncomeAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit,
           com.netsuite.webservices.platform.core_2019_1.RecordRef saleUnit,
           java.lang.String costEstimateUnits,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef deferredRevenueAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoDefRevAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate,
           java.lang.String residual,
           java.lang.Boolean deferRevRec,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revenueAllocationGroup,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createRevenuePlansOn,
           java.lang.Boolean directRevenuePosting,
           java.lang.Boolean contingentRevenueHandling,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revReclassFXAccount,
           java.lang.Long amortizationPeriod,
           java.lang.Long minimumQuantity,
           java.lang.Boolean enforceMinQtyInternally,
           java.lang.Long maximumQuantity,
           java.lang.String softDescriptor,
           java.lang.Boolean pricesIncludeTax,
           com.netsuite.webservices.platform.core_2019_1.RecordRef quantityPricingSchedule,
           java.lang.Boolean useMarginalRates,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType overallQuantityPricingType,
           java.lang.Boolean isFulfillable,
           java.lang.Boolean generateAccruals,
           com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory,
           java.lang.Double purchaseOrderQuantity,
           java.lang.Double purchaseOrderAmount,
           java.lang.Double purchaseOrderQuantityDiff,
           java.lang.Double receiptQuantity,
           java.lang.Double receiptAmount,
           java.lang.Double receiptQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.RecordRef pricingGroup,
           java.lang.String minimumQuantityUnits,
           java.lang.Double vsoePrice,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral,
           com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory,
           java.lang.Boolean createJob,
           java.lang.String matrixItemNameTemplate,
           java.lang.String storeDisplayName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage,
           java.lang.String storeDescription,
           java.lang.String storeDetailedDescription,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeItemTemplate,
           java.lang.String pageTitle,
           java.lang.String urlComponent,
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
           com.netsuite.webservices.lists.accounting_2019_1.ServiceItemTaskTemplatesList itemTaskTemplatesList,
           java.lang.String featuredDescription,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String itemId,
           java.lang.String upcCode,
           java.lang.String displayName,
           java.lang.String vendorName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.Boolean isOnline,
           java.lang.Boolean isGcoCompliant,
           java.lang.Boolean offerSupport,
           java.lang.Boolean isInactive,
           java.lang.Boolean availableToPartners,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList,
           java.lang.String currency,
           com.netsuite.webservices.lists.accounting_2019_1.BillingRatesMatrix billingRatesMatrix,
           com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList,
           com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList,
           com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList,
           com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix pricingMatrix,
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
        this.manufacturingChargeItem = manufacturingChargeItem;
        this.cost = cost;
        this.costUnits = costUnits;
        this.expenseAccount = expenseAccount;
        this.intercoExpenseAccount = intercoExpenseAccount;
        this.salesDescription = salesDescription;
        this.includeChildren = includeChildren;
        this.incomeAccount = incomeAccount;
        this.intercoIncomeAccount = intercoIncomeAccount;
        this.taxSchedule = taxSchedule;
        this.matrixType = matrixType;
        this.isTaxable = isTaxable;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.unitsType = unitsType;
        this.purchaseUnit = purchaseUnit;
        this.saleUnit = saleUnit;
        this.costEstimateUnits = costEstimateUnits;
        this.issueProduct = issueProduct;
        this.billingSchedule = billingSchedule;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.intercoDefRevAccount = intercoDefRevAccount;
        this.revRecSchedule = revRecSchedule;
        this.deferralAccount = deferralAccount;
        this.amortizationTemplate = amortizationTemplate;
        this.residual = residual;
        this.deferRevRec = deferRevRec;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.revRecForecastRule = revRecForecastRule;
        this.revenueAllocationGroup = revenueAllocationGroup;
        this.createRevenuePlansOn = createRevenuePlansOn;
        this.directRevenuePosting = directRevenuePosting;
        this.contingentRevenueHandling = contingentRevenueHandling;
        this.revReclassFXAccount = revReclassFXAccount;
        this.amortizationPeriod = amortizationPeriod;
        this.minimumQuantity = minimumQuantity;
        this.enforceMinQtyInternally = enforceMinQtyInternally;
        this.maximumQuantity = maximumQuantity;
        this.softDescriptor = softDescriptor;
        this.pricesIncludeTax = pricesIncludeTax;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.useMarginalRates = useMarginalRates;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.isFulfillable = isFulfillable;
        this.generateAccruals = generateAccruals;
        this.costCategory = costCategory;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.pricingGroup = pricingGroup;
        this.minimumQuantityUnits = minimumQuantityUnits;
        this.vsoePrice = vsoePrice;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.itemRevenueCategory = itemRevenueCategory;
        this.createJob = createJob;
        this.matrixItemNameTemplate = matrixItemNameTemplate;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.urlComponent = urlComponent;
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
        this.itemTaskTemplatesList = itemTaskTemplatesList;
        this.featuredDescription = featuredDescription;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isOnline = isOnline;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiaryList = subsidiaryList;
        this.currency = currency;
        this.billingRatesMatrix = billingRatesMatrix;
        this.accountingBookDetailList = accountingBookDetailList;
        this.itemOptionsList = itemOptionsList;
        this.matrixOptionList = matrixOptionList;
        this.itemVendorList = itemVendorList;
        this.pricingMatrix = pricingMatrix;
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
     * Gets the createdDate value for this ServiceResaleItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ServiceResaleItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this ServiceResaleItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ServiceResaleItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the purchaseDescription value for this ServiceResaleItem.
     * 
     * @return purchaseDescription
     */
    public java.lang.String getPurchaseDescription() {
        return purchaseDescription;
    }


    /**
     * Sets the purchaseDescription value for this ServiceResaleItem.
     * 
     * @param purchaseDescription
     */
    public void setPurchaseDescription(java.lang.String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }


    /**
     * Gets the manufacturingChargeItem value for this ServiceResaleItem.
     * 
     * @return manufacturingChargeItem
     */
    public java.lang.Boolean getManufacturingChargeItem() {
        return manufacturingChargeItem;
    }


    /**
     * Sets the manufacturingChargeItem value for this ServiceResaleItem.
     * 
     * @param manufacturingChargeItem
     */
    public void setManufacturingChargeItem(java.lang.Boolean manufacturingChargeItem) {
        this.manufacturingChargeItem = manufacturingChargeItem;
    }


    /**
     * Gets the cost value for this ServiceResaleItem.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ServiceResaleItem.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the costUnits value for this ServiceResaleItem.
     * 
     * @return costUnits
     */
    public java.lang.String getCostUnits() {
        return costUnits;
    }


    /**
     * Sets the costUnits value for this ServiceResaleItem.
     * 
     * @param costUnits
     */
    public void setCostUnits(java.lang.String costUnits) {
        this.costUnits = costUnits;
    }


    /**
     * Gets the expenseAccount value for this ServiceResaleItem.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this ServiceResaleItem.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the intercoExpenseAccount value for this ServiceResaleItem.
     * 
     * @return intercoExpenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoExpenseAccount() {
        return intercoExpenseAccount;
    }


    /**
     * Sets the intercoExpenseAccount value for this ServiceResaleItem.
     * 
     * @param intercoExpenseAccount
     */
    public void setIntercoExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoExpenseAccount) {
        this.intercoExpenseAccount = intercoExpenseAccount;
    }


    /**
     * Gets the salesDescription value for this ServiceResaleItem.
     * 
     * @return salesDescription
     */
    public java.lang.String getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this ServiceResaleItem.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(java.lang.String salesDescription) {
        this.salesDescription = salesDescription;
    }


    /**
     * Gets the includeChildren value for this ServiceResaleItem.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this ServiceResaleItem.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the incomeAccount value for this ServiceResaleItem.
     * 
     * @return incomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this ServiceResaleItem.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the intercoIncomeAccount value for this ServiceResaleItem.
     * 
     * @return intercoIncomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoIncomeAccount() {
        return intercoIncomeAccount;
    }


    /**
     * Sets the intercoIncomeAccount value for this ServiceResaleItem.
     * 
     * @param intercoIncomeAccount
     */
    public void setIntercoIncomeAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoIncomeAccount) {
        this.intercoIncomeAccount = intercoIncomeAccount;
    }


    /**
     * Gets the taxSchedule value for this ServiceResaleItem.
     * 
     * @return taxSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ServiceResaleItem.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the matrixType value for this ServiceResaleItem.
     * 
     * @return matrixType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType getMatrixType() {
        return matrixType;
    }


    /**
     * Sets the matrixType value for this ServiceResaleItem.
     * 
     * @param matrixType
     */
    public void setMatrixType(com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType) {
        this.matrixType = matrixType;
    }


    /**
     * Gets the isTaxable value for this ServiceResaleItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ServiceResaleItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the costEstimateType value for this ServiceResaleItem.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this ServiceResaleItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.common_2019_1.types.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this ServiceResaleItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this ServiceResaleItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the unitsType value for this ServiceResaleItem.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this ServiceResaleItem.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the purchaseUnit value for this ServiceResaleItem.
     * 
     * @return purchaseUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this ServiceResaleItem.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }


    /**
     * Gets the saleUnit value for this ServiceResaleItem.
     * 
     * @return saleUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this ServiceResaleItem.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef saleUnit) {
        this.saleUnit = saleUnit;
    }


    /**
     * Gets the costEstimateUnits value for this ServiceResaleItem.
     * 
     * @return costEstimateUnits
     */
    public java.lang.String getCostEstimateUnits() {
        return costEstimateUnits;
    }


    /**
     * Sets the costEstimateUnits value for this ServiceResaleItem.
     * 
     * @param costEstimateUnits
     */
    public void setCostEstimateUnits(java.lang.String costEstimateUnits) {
        this.costEstimateUnits = costEstimateUnits;
    }


    /**
     * Gets the issueProduct value for this ServiceResaleItem.
     * 
     * @return issueProduct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this ServiceResaleItem.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the billingSchedule value for this ServiceResaleItem.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this ServiceResaleItem.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the deferredRevenueAccount value for this ServiceResaleItem.
     * 
     * @return deferredRevenueAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }


    /**
     * Sets the deferredRevenueAccount value for this ServiceResaleItem.
     * 
     * @param deferredRevenueAccount
     */
    public void setDeferredRevenueAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }


    /**
     * Gets the intercoDefRevAccount value for this ServiceResaleItem.
     * 
     * @return intercoDefRevAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoDefRevAccount() {
        return intercoDefRevAccount;
    }


    /**
     * Sets the intercoDefRevAccount value for this ServiceResaleItem.
     * 
     * @param intercoDefRevAccount
     */
    public void setIntercoDefRevAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoDefRevAccount) {
        this.intercoDefRevAccount = intercoDefRevAccount;
    }


    /**
     * Gets the revRecSchedule value for this ServiceResaleItem.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ServiceResaleItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the deferralAccount value for this ServiceResaleItem.
     * 
     * @return deferralAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeferralAccount() {
        return deferralAccount;
    }


    /**
     * Sets the deferralAccount value for this ServiceResaleItem.
     * 
     * @param deferralAccount
     */
    public void setDeferralAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount) {
        this.deferralAccount = deferralAccount;
    }


    /**
     * Gets the amortizationTemplate value for this ServiceResaleItem.
     * 
     * @return amortizationTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAmortizationTemplate() {
        return amortizationTemplate;
    }


    /**
     * Sets the amortizationTemplate value for this ServiceResaleItem.
     * 
     * @param amortizationTemplate
     */
    public void setAmortizationTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate) {
        this.amortizationTemplate = amortizationTemplate;
    }


    /**
     * Gets the residual value for this ServiceResaleItem.
     * 
     * @return residual
     */
    public java.lang.String getResidual() {
        return residual;
    }


    /**
     * Sets the residual value for this ServiceResaleItem.
     * 
     * @param residual
     */
    public void setResidual(java.lang.String residual) {
        this.residual = residual;
    }


    /**
     * Gets the deferRevRec value for this ServiceResaleItem.
     * 
     * @return deferRevRec
     */
    public java.lang.Boolean getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this ServiceResaleItem.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(java.lang.Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the revenueRecognitionRule value for this ServiceResaleItem.
     * 
     * @return revenueRecognitionRule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }


    /**
     * Sets the revenueRecognitionRule value for this ServiceResaleItem.
     * 
     * @param revenueRecognitionRule
     */
    public void setRevenueRecognitionRule(com.netsuite.webservices.platform.core_2019_1.RecordRef revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }


    /**
     * Gets the revRecForecastRule value for this ServiceResaleItem.
     * 
     * @return revRecForecastRule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }


    /**
     * Sets the revRecForecastRule value for this ServiceResaleItem.
     * 
     * @param revRecForecastRule
     */
    public void setRevRecForecastRule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }


    /**
     * Gets the revenueAllocationGroup value for this ServiceResaleItem.
     * 
     * @return revenueAllocationGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }


    /**
     * Sets the revenueAllocationGroup value for this ServiceResaleItem.
     * 
     * @param revenueAllocationGroup
     */
    public void setRevenueAllocationGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }


    /**
     * Gets the createRevenuePlansOn value for this ServiceResaleItem.
     * 
     * @return createRevenuePlansOn
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }


    /**
     * Sets the createRevenuePlansOn value for this ServiceResaleItem.
     * 
     * @param createRevenuePlansOn
     */
    public void setCreateRevenuePlansOn(com.netsuite.webservices.platform.core_2019_1.RecordRef createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }


    /**
     * Gets the directRevenuePosting value for this ServiceResaleItem.
     * 
     * @return directRevenuePosting
     */
    public java.lang.Boolean getDirectRevenuePosting() {
        return directRevenuePosting;
    }


    /**
     * Sets the directRevenuePosting value for this ServiceResaleItem.
     * 
     * @param directRevenuePosting
     */
    public void setDirectRevenuePosting(java.lang.Boolean directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }


    /**
     * Gets the contingentRevenueHandling value for this ServiceResaleItem.
     * 
     * @return contingentRevenueHandling
     */
    public java.lang.Boolean getContingentRevenueHandling() {
        return contingentRevenueHandling;
    }


    /**
     * Sets the contingentRevenueHandling value for this ServiceResaleItem.
     * 
     * @param contingentRevenueHandling
     */
    public void setContingentRevenueHandling(java.lang.Boolean contingentRevenueHandling) {
        this.contingentRevenueHandling = contingentRevenueHandling;
    }


    /**
     * Gets the revReclassFXAccount value for this ServiceResaleItem.
     * 
     * @return revReclassFXAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevReclassFXAccount() {
        return revReclassFXAccount;
    }


    /**
     * Sets the revReclassFXAccount value for this ServiceResaleItem.
     * 
     * @param revReclassFXAccount
     */
    public void setRevReclassFXAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef revReclassFXAccount) {
        this.revReclassFXAccount = revReclassFXAccount;
    }


    /**
     * Gets the amortizationPeriod value for this ServiceResaleItem.
     * 
     * @return amortizationPeriod
     */
    public java.lang.Long getAmortizationPeriod() {
        return amortizationPeriod;
    }


    /**
     * Sets the amortizationPeriod value for this ServiceResaleItem.
     * 
     * @param amortizationPeriod
     */
    public void setAmortizationPeriod(java.lang.Long amortizationPeriod) {
        this.amortizationPeriod = amortizationPeriod;
    }


    /**
     * Gets the minimumQuantity value for this ServiceResaleItem.
     * 
     * @return minimumQuantity
     */
    public java.lang.Long getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this ServiceResaleItem.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(java.lang.Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the enforceMinQtyInternally value for this ServiceResaleItem.
     * 
     * @return enforceMinQtyInternally
     */
    public java.lang.Boolean getEnforceMinQtyInternally() {
        return enforceMinQtyInternally;
    }


    /**
     * Sets the enforceMinQtyInternally value for this ServiceResaleItem.
     * 
     * @param enforceMinQtyInternally
     */
    public void setEnforceMinQtyInternally(java.lang.Boolean enforceMinQtyInternally) {
        this.enforceMinQtyInternally = enforceMinQtyInternally;
    }


    /**
     * Gets the maximumQuantity value for this ServiceResaleItem.
     * 
     * @return maximumQuantity
     */
    public java.lang.Long getMaximumQuantity() {
        return maximumQuantity;
    }


    /**
     * Sets the maximumQuantity value for this ServiceResaleItem.
     * 
     * @param maximumQuantity
     */
    public void setMaximumQuantity(java.lang.Long maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }


    /**
     * Gets the softDescriptor value for this ServiceResaleItem.
     * 
     * @return softDescriptor
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this ServiceResaleItem.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the pricesIncludeTax value for this ServiceResaleItem.
     * 
     * @return pricesIncludeTax
     */
    public java.lang.Boolean getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this ServiceResaleItem.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(java.lang.Boolean pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }


    /**
     * Gets the quantityPricingSchedule value for this ServiceResaleItem.
     * 
     * @return quantityPricingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this ServiceResaleItem.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }


    /**
     * Gets the useMarginalRates value for this ServiceResaleItem.
     * 
     * @return useMarginalRates
     */
    public java.lang.Boolean getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this ServiceResaleItem.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(java.lang.Boolean useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }


    /**
     * Gets the overallQuantityPricingType value for this ServiceResaleItem.
     * 
     * @return overallQuantityPricingType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this ServiceResaleItem.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(com.netsuite.webservices.lists.accounting_2019_1.types.ItemOverallQuantityPricingType overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }


    /**
     * Gets the isFulfillable value for this ServiceResaleItem.
     * 
     * @return isFulfillable
     */
    public java.lang.Boolean getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this ServiceResaleItem.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(java.lang.Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the generateAccruals value for this ServiceResaleItem.
     * 
     * @return generateAccruals
     */
    public java.lang.Boolean getGenerateAccruals() {
        return generateAccruals;
    }


    /**
     * Sets the generateAccruals value for this ServiceResaleItem.
     * 
     * @param generateAccruals
     */
    public void setGenerateAccruals(java.lang.Boolean generateAccruals) {
        this.generateAccruals = generateAccruals;
    }


    /**
     * Gets the costCategory value for this ServiceResaleItem.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this ServiceResaleItem.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the purchaseOrderQuantity value for this ServiceResaleItem.
     * 
     * @return purchaseOrderQuantity
     */
    public java.lang.Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this ServiceResaleItem.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(java.lang.Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderAmount value for this ServiceResaleItem.
     * 
     * @return purchaseOrderAmount
     */
    public java.lang.Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this ServiceResaleItem.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(java.lang.Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this ServiceResaleItem.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public java.lang.Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this ServiceResaleItem.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(java.lang.Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptQuantity value for this ServiceResaleItem.
     * 
     * @return receiptQuantity
     */
    public java.lang.Double getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this ServiceResaleItem.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(java.lang.Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptAmount value for this ServiceResaleItem.
     * 
     * @return receiptAmount
     */
    public java.lang.Double getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this ServiceResaleItem.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantityDiff value for this ServiceResaleItem.
     * 
     * @return receiptQuantityDiff
     */
    public java.lang.Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this ServiceResaleItem.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(java.lang.Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the pricingGroup value for this ServiceResaleItem.
     * 
     * @return pricingGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this ServiceResaleItem.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the minimumQuantityUnits value for this ServiceResaleItem.
     * 
     * @return minimumQuantityUnits
     */
    public java.lang.String getMinimumQuantityUnits() {
        return minimumQuantityUnits;
    }


    /**
     * Sets the minimumQuantityUnits value for this ServiceResaleItem.
     * 
     * @param minimumQuantityUnits
     */
    public void setMinimumQuantityUnits(java.lang.String minimumQuantityUnits) {
        this.minimumQuantityUnits = minimumQuantityUnits;
    }


    /**
     * Gets the vsoePrice value for this ServiceResaleItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this ServiceResaleItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeSopGroup value for this ServiceResaleItem.
     * 
     * @return vsoeSopGroup
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup getVsoeSopGroup() {
        return vsoeSopGroup;
    }


    /**
     * Sets the vsoeSopGroup value for this ServiceResaleItem.
     * 
     * @param vsoeSopGroup
     */
    public void setVsoeSopGroup(com.netsuite.webservices.platform.common_2019_1.types.VsoeSopGroup vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }


    /**
     * Gets the vsoeDeferral value for this ServiceResaleItem.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ServiceResaleItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this ServiceResaleItem.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ServiceResaleItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this ServiceResaleItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ServiceResaleItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the itemRevenueCategory value for this ServiceResaleItem.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this ServiceResaleItem.
     * 
     * @param itemRevenueCategory
     */
    public void setItemRevenueCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }


    /**
     * Gets the createJob value for this ServiceResaleItem.
     * 
     * @return createJob
     */
    public java.lang.Boolean getCreateJob() {
        return createJob;
    }


    /**
     * Sets the createJob value for this ServiceResaleItem.
     * 
     * @param createJob
     */
    public void setCreateJob(java.lang.Boolean createJob) {
        this.createJob = createJob;
    }


    /**
     * Gets the matrixItemNameTemplate value for this ServiceResaleItem.
     * 
     * @return matrixItemNameTemplate
     */
    public java.lang.String getMatrixItemNameTemplate() {
        return matrixItemNameTemplate;
    }


    /**
     * Sets the matrixItemNameTemplate value for this ServiceResaleItem.
     * 
     * @param matrixItemNameTemplate
     */
    public void setMatrixItemNameTemplate(java.lang.String matrixItemNameTemplate) {
        this.matrixItemNameTemplate = matrixItemNameTemplate;
    }


    /**
     * Gets the storeDisplayName value for this ServiceResaleItem.
     * 
     * @return storeDisplayName
     */
    public java.lang.String getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this ServiceResaleItem.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(java.lang.String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }


    /**
     * Gets the storeDisplayThumbnail value for this ServiceResaleItem.
     * 
     * @return storeDisplayThumbnail
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this ServiceResaleItem.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the storeDisplayImage value for this ServiceResaleItem.
     * 
     * @return storeDisplayImage
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this ServiceResaleItem.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }


    /**
     * Gets the storeDescription value for this ServiceResaleItem.
     * 
     * @return storeDescription
     */
    public java.lang.String getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this ServiceResaleItem.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(java.lang.String storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the storeDetailedDescription value for this ServiceResaleItem.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this ServiceResaleItem.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the storeItemTemplate value for this ServiceResaleItem.
     * 
     * @return storeItemTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }


    /**
     * Sets the storeItemTemplate value for this ServiceResaleItem.
     * 
     * @param storeItemTemplate
     */
    public void setStoreItemTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef storeItemTemplate) {
        this.storeItemTemplate = storeItemTemplate;
    }


    /**
     * Gets the pageTitle value for this ServiceResaleItem.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this ServiceResaleItem.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the urlComponent value for this ServiceResaleItem.
     * 
     * @return urlComponent
     */
    public java.lang.String getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this ServiceResaleItem.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(java.lang.String urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the metaTagHtml value for this ServiceResaleItem.
     * 
     * @return metaTagHtml
     */
    public java.lang.String getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this ServiceResaleItem.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(java.lang.String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the excludeFromSitemap value for this ServiceResaleItem.
     * 
     * @return excludeFromSitemap
     */
    public java.lang.Boolean getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this ServiceResaleItem.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(java.lang.Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the sitemapPriority value for this ServiceResaleItem.
     * 
     * @return sitemapPriority
     */
    public com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this ServiceResaleItem.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the searchKeywords value for this ServiceResaleItem.
     * 
     * @return searchKeywords
     */
    public java.lang.String getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this ServiceResaleItem.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(java.lang.String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the isDonationItem value for this ServiceResaleItem.
     * 
     * @return isDonationItem
     */
    public java.lang.Boolean getIsDonationItem() {
        return isDonationItem;
    }


    /**
     * Sets the isDonationItem value for this ServiceResaleItem.
     * 
     * @param isDonationItem
     */
    public void setIsDonationItem(java.lang.Boolean isDonationItem) {
        this.isDonationItem = isDonationItem;
    }


    /**
     * Gets the showDefaultDonationAmount value for this ServiceResaleItem.
     * 
     * @return showDefaultDonationAmount
     */
    public java.lang.Boolean getShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }


    /**
     * Sets the showDefaultDonationAmount value for this ServiceResaleItem.
     * 
     * @param showDefaultDonationAmount
     */
    public void setShowDefaultDonationAmount(java.lang.Boolean showDefaultDonationAmount) {
        this.showDefaultDonationAmount = showDefaultDonationAmount;
    }


    /**
     * Gets the maxDonationAmount value for this ServiceResaleItem.
     * 
     * @return maxDonationAmount
     */
    public java.lang.Double getMaxDonationAmount() {
        return maxDonationAmount;
    }


    /**
     * Sets the maxDonationAmount value for this ServiceResaleItem.
     * 
     * @param maxDonationAmount
     */
    public void setMaxDonationAmount(java.lang.Double maxDonationAmount) {
        this.maxDonationAmount = maxDonationAmount;
    }


    /**
     * Gets the dontShowPrice value for this ServiceResaleItem.
     * 
     * @return dontShowPrice
     */
    public java.lang.Boolean getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this ServiceResaleItem.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(java.lang.Boolean dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the noPriceMessage value for this ServiceResaleItem.
     * 
     * @return noPriceMessage
     */
    public java.lang.String getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this ServiceResaleItem.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(java.lang.String noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }


    /**
     * Gets the outOfStockMessage value for this ServiceResaleItem.
     * 
     * @return outOfStockMessage
     */
    public java.lang.String getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this ServiceResaleItem.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(java.lang.String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }


    /**
     * Gets the onSpecial value for this ServiceResaleItem.
     * 
     * @return onSpecial
     */
    public java.lang.Boolean getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this ServiceResaleItem.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(java.lang.Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the outOfStockBehavior value for this ServiceResaleItem.
     * 
     * @return outOfStockBehavior
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this ServiceResaleItem.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(com.netsuite.webservices.lists.accounting_2019_1.types.ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the relatedItemsDescription value for this ServiceResaleItem.
     * 
     * @return relatedItemsDescription
     */
    public java.lang.String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }


    /**
     * Sets the relatedItemsDescription value for this ServiceResaleItem.
     * 
     * @param relatedItemsDescription
     */
    public void setRelatedItemsDescription(java.lang.String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }


    /**
     * Gets the specialsDescription value for this ServiceResaleItem.
     * 
     * @return specialsDescription
     */
    public java.lang.String getSpecialsDescription() {
        return specialsDescription;
    }


    /**
     * Sets the specialsDescription value for this ServiceResaleItem.
     * 
     * @param specialsDescription
     */
    public void setSpecialsDescription(java.lang.String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }


    /**
     * Gets the itemTaskTemplatesList value for this ServiceResaleItem.
     * 
     * @return itemTaskTemplatesList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ServiceItemTaskTemplatesList getItemTaskTemplatesList() {
        return itemTaskTemplatesList;
    }


    /**
     * Sets the itemTaskTemplatesList value for this ServiceResaleItem.
     * 
     * @param itemTaskTemplatesList
     */
    public void setItemTaskTemplatesList(com.netsuite.webservices.lists.accounting_2019_1.ServiceItemTaskTemplatesList itemTaskTemplatesList) {
        this.itemTaskTemplatesList = itemTaskTemplatesList;
    }


    /**
     * Gets the featuredDescription value for this ServiceResaleItem.
     * 
     * @return featuredDescription
     */
    public java.lang.String getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this ServiceResaleItem.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(java.lang.String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the customForm value for this ServiceResaleItem.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ServiceResaleItem.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the itemId value for this ServiceResaleItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ServiceResaleItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the upcCode value for this ServiceResaleItem.
     * 
     * @return upcCode
     */
    public java.lang.String getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this ServiceResaleItem.
     * 
     * @param upcCode
     */
    public void setUpcCode(java.lang.String upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the displayName value for this ServiceResaleItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ServiceResaleItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the vendorName value for this ServiceResaleItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this ServiceResaleItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the parent value for this ServiceResaleItem.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ServiceResaleItem.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isOnline value for this ServiceResaleItem.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this ServiceResaleItem.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isGcoCompliant value for this ServiceResaleItem.
     * 
     * @return isGcoCompliant
     */
    public java.lang.Boolean getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this ServiceResaleItem.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(java.lang.Boolean isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the offerSupport value for this ServiceResaleItem.
     * 
     * @return offerSupport
     */
    public java.lang.Boolean getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this ServiceResaleItem.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(java.lang.Boolean offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the isInactive value for this ServiceResaleItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ServiceResaleItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the availableToPartners value for this ServiceResaleItem.
     * 
     * @return availableToPartners
     */
    public java.lang.Boolean getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this ServiceResaleItem.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(java.lang.Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the department value for this ServiceResaleItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ServiceResaleItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this ServiceResaleItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ServiceResaleItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this ServiceResaleItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ServiceResaleItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiaryList value for this ServiceResaleItem.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this ServiceResaleItem.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the currency value for this ServiceResaleItem.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ServiceResaleItem.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the billingRatesMatrix value for this ServiceResaleItem.
     * 
     * @return billingRatesMatrix
     */
    public com.netsuite.webservices.lists.accounting_2019_1.BillingRatesMatrix getBillingRatesMatrix() {
        return billingRatesMatrix;
    }


    /**
     * Sets the billingRatesMatrix value for this ServiceResaleItem.
     * 
     * @param billingRatesMatrix
     */
    public void setBillingRatesMatrix(com.netsuite.webservices.lists.accounting_2019_1.BillingRatesMatrix billingRatesMatrix) {
        this.billingRatesMatrix = billingRatesMatrix;
    }


    /**
     * Gets the accountingBookDetailList value for this ServiceResaleItem.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this ServiceResaleItem.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the itemOptionsList value for this ServiceResaleItem.
     * 
     * @return itemOptionsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }


    /**
     * Sets the itemOptionsList value for this ServiceResaleItem.
     * 
     * @param itemOptionsList
     */
    public void setItemOptionsList(com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }


    /**
     * Gets the matrixOptionList value for this ServiceResaleItem.
     * 
     * @return matrixOptionList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList getMatrixOptionList() {
        return matrixOptionList;
    }


    /**
     * Sets the matrixOptionList value for this ServiceResaleItem.
     * 
     * @param matrixOptionList
     */
    public void setMatrixOptionList(com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList) {
        this.matrixOptionList = matrixOptionList;
    }


    /**
     * Gets the itemVendorList value for this ServiceResaleItem.
     * 
     * @return itemVendorList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList getItemVendorList() {
        return itemVendorList;
    }


    /**
     * Sets the itemVendorList value for this ServiceResaleItem.
     * 
     * @param itemVendorList
     */
    public void setItemVendorList(com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList) {
        this.itemVendorList = itemVendorList;
    }


    /**
     * Gets the pricingMatrix value for this ServiceResaleItem.
     * 
     * @return pricingMatrix
     */
    public com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }


    /**
     * Sets the pricingMatrix value for this ServiceResaleItem.
     * 
     * @param pricingMatrix
     */
    public void setPricingMatrix(com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }


    /**
     * Gets the purchaseTaxCode value for this ServiceResaleItem.
     * 
     * @return purchaseTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseTaxCode() {
        return purchaseTaxCode;
    }


    /**
     * Sets the purchaseTaxCode value for this ServiceResaleItem.
     * 
     * @param purchaseTaxCode
     */
    public void setPurchaseTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }


    /**
     * Gets the rate value for this ServiceResaleItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ServiceResaleItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the salesTaxCode value for this ServiceResaleItem.
     * 
     * @return salesTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this ServiceResaleItem.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }


    /**
     * Gets the siteCategoryList value for this ServiceResaleItem.
     * 
     * @return siteCategoryList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }


    /**
     * Sets the siteCategoryList value for this ServiceResaleItem.
     * 
     * @param siteCategoryList
     */
    public void setSiteCategoryList(com.netsuite.webservices.lists.accounting_2019_1.SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the translationsList value for this ServiceResaleItem.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.TranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this ServiceResaleItem.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the vendor value for this ServiceResaleItem.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ServiceResaleItem.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the presentationItemList value for this ServiceResaleItem.
     * 
     * @return presentationItemList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }


    /**
     * Sets the presentationItemList value for this ServiceResaleItem.
     * 
     * @param presentationItemList
     */
    public void setPresentationItemList(com.netsuite.webservices.lists.accounting_2019_1.PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }


    /**
     * Gets the customFieldList value for this ServiceResaleItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ServiceResaleItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ServiceResaleItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ServiceResaleItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ServiceResaleItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ServiceResaleItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceResaleItem)) return false;
        ServiceResaleItem other = (ServiceResaleItem) obj;
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
            ((this.manufacturingChargeItem==null && other.getManufacturingChargeItem()==null) || 
             (this.manufacturingChargeItem!=null &&
              this.manufacturingChargeItem.equals(other.getManufacturingChargeItem()))) &&
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
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.matrixType==null && other.getMatrixType()==null) || 
             (this.matrixType!=null &&
              this.matrixType.equals(other.getMatrixType()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              this.purchaseUnit.equals(other.getPurchaseUnit()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              this.saleUnit.equals(other.getSaleUnit()))) &&
            ((this.costEstimateUnits==null && other.getCostEstimateUnits()==null) || 
             (this.costEstimateUnits!=null &&
              this.costEstimateUnits.equals(other.getCostEstimateUnits()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.deferredRevenueAccount==null && other.getDeferredRevenueAccount()==null) || 
             (this.deferredRevenueAccount!=null &&
              this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount()))) &&
            ((this.intercoDefRevAccount==null && other.getIntercoDefRevAccount()==null) || 
             (this.intercoDefRevAccount!=null &&
              this.intercoDefRevAccount.equals(other.getIntercoDefRevAccount()))) &&
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
            ((this.contingentRevenueHandling==null && other.getContingentRevenueHandling()==null) || 
             (this.contingentRevenueHandling!=null &&
              this.contingentRevenueHandling.equals(other.getContingentRevenueHandling()))) &&
            ((this.revReclassFXAccount==null && other.getRevReclassFXAccount()==null) || 
             (this.revReclassFXAccount!=null &&
              this.revReclassFXAccount.equals(other.getRevReclassFXAccount()))) &&
            ((this.amortizationPeriod==null && other.getAmortizationPeriod()==null) || 
             (this.amortizationPeriod!=null &&
              this.amortizationPeriod.equals(other.getAmortizationPeriod()))) &&
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
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.generateAccruals==null && other.getGenerateAccruals()==null) || 
             (this.generateAccruals!=null &&
              this.generateAccruals.equals(other.getGenerateAccruals()))) &&
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              this.costCategory.equals(other.getCostCategory()))) &&
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
            ((this.createJob==null && other.getCreateJob()==null) || 
             (this.createJob!=null &&
              this.createJob.equals(other.getCreateJob()))) &&
            ((this.matrixItemNameTemplate==null && other.getMatrixItemNameTemplate()==null) || 
             (this.matrixItemNameTemplate!=null &&
              this.matrixItemNameTemplate.equals(other.getMatrixItemNameTemplate()))) &&
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
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
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
            ((this.itemTaskTemplatesList==null && other.getItemTaskTemplatesList()==null) || 
             (this.itemTaskTemplatesList!=null &&
              this.itemTaskTemplatesList.equals(other.getItemTaskTemplatesList()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
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
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              this.isGcoCompliant.equals(other.getIsGcoCompliant()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              this.offerSupport.equals(other.getOfferSupport()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
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
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.billingRatesMatrix==null && other.getBillingRatesMatrix()==null) || 
             (this.billingRatesMatrix!=null &&
              this.billingRatesMatrix.equals(other.getBillingRatesMatrix()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
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
        if (getManufacturingChargeItem() != null) {
            _hashCode += getManufacturingChargeItem().hashCode();
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
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getMatrixType() != null) {
            _hashCode += getMatrixType().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
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
        if (getCostEstimateUnits() != null) {
            _hashCode += getCostEstimateUnits().hashCode();
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
        if (getIntercoDefRevAccount() != null) {
            _hashCode += getIntercoDefRevAccount().hashCode();
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
        if (getContingentRevenueHandling() != null) {
            _hashCode += getContingentRevenueHandling().hashCode();
        }
        if (getRevReclassFXAccount() != null) {
            _hashCode += getRevReclassFXAccount().hashCode();
        }
        if (getAmortizationPeriod() != null) {
            _hashCode += getAmortizationPeriod().hashCode();
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
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getGenerateAccruals() != null) {
            _hashCode += getGenerateAccruals().hashCode();
        }
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
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
        if (getCreateJob() != null) {
            _hashCode += getCreateJob().hashCode();
        }
        if (getMatrixItemNameTemplate() != null) {
            _hashCode += getMatrixItemNameTemplate().hashCode();
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
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
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
        if (getItemTaskTemplatesList() != null) {
            _hashCode += getItemTaskTemplatesList().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
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
        if (getIsGcoCompliant() != null) {
            _hashCode += getIsGcoCompliant().hashCode();
        }
        if (getOfferSupport() != null) {
            _hashCode += getOfferSupport().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
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
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getBillingRatesMatrix() != null) {
            _hashCode += getBillingRatesMatrix().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
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
        new org.apache.axis.description.TypeDesc(ServiceResaleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ServiceResaleItem"));
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
        elemField.setFieldName("manufacturingChargeItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "manufacturingChargeItem"));
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
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("costEstimateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "costEstimateUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("intercoDefRevAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "intercoDefRevAccount"));
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
        elemField.setFieldName("contingentRevenueHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "contingentRevenueHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revReclassFXAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revReclassFXAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("createJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "createJob"));
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
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "urlComponent"));
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
        elemField.setFieldName("itemTaskTemplatesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemTaskTemplatesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ServiceItemTaskTemplatesList"));
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
        elemField.setFieldName("billingRatesMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "billingRatesMatrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BillingRatesMatrix"));
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
