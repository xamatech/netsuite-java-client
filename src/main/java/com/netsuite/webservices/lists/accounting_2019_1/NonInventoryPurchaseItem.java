/**
 * NonInventoryPurchaseItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class NonInventoryPurchaseItem  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String purchaseDescription;

    private java.lang.Double cost;

    private java.lang.String costUnits;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String itemId;

    private java.lang.String upcCode;

    private java.lang.String displayName;

    private java.lang.Boolean includeChildren;

    private java.lang.String vendorName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.Boolean isInactive;

    private java.lang.String matrixItemNameTemplate;

    private java.lang.Boolean availableToPartners;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate;

    private java.lang.String residual;

    private java.lang.Long amortizationPeriod;

    private java.lang.Boolean isFulfillable;

    private java.lang.Boolean generateAccruals;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory;

    private java.lang.Double purchaseOrderQuantity;

    private java.lang.Double purchaseOrderAmount;

    private java.lang.Double purchaseOrderQuantityDiff;

    private java.lang.Double receiptQuantity;

    private java.lang.Double receiptAmount;

    private java.lang.Double receiptQuantityDiff;

    private java.lang.String currency;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList;

    private com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList;

    private com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode;

    private com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef vendor;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public NonInventoryPurchaseItem() {
    }

    public NonInventoryPurchaseItem(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           java.lang.String purchaseDescription,
           java.lang.Double cost,
           java.lang.String costUnits,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String itemId,
           java.lang.String upcCode,
           java.lang.String displayName,
           java.lang.Boolean includeChildren,
           java.lang.String vendorName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.Boolean isInactive,
           java.lang.String matrixItemNameTemplate,
           java.lang.Boolean availableToPartners,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule,
           com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate,
           java.lang.String residual,
           java.lang.Long amortizationPeriod,
           java.lang.Boolean isFulfillable,
           java.lang.Boolean generateAccruals,
           com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory,
           java.lang.Double purchaseOrderQuantity,
           java.lang.Double purchaseOrderAmount,
           java.lang.Double purchaseOrderQuantityDiff,
           java.lang.Double receiptQuantity,
           java.lang.Double receiptAmount,
           java.lang.Double receiptQuantityDiff,
           java.lang.String currency,
           com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList,
           com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList,
           com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode,
           com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef vendor,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.purchaseDescription = purchaseDescription;
        this.cost = cost;
        this.costUnits = costUnits;
        this.expenseAccount = expenseAccount;
        this.issueProduct = issueProduct;
        this.isTaxable = isTaxable;
        this.matrixType = matrixType;
        this.unitsType = unitsType;
        this.purchaseUnit = purchaseUnit;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.includeChildren = includeChildren;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isInactive = isInactive;
        this.matrixItemNameTemplate = matrixItemNameTemplate;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiaryList = subsidiaryList;
        this.taxSchedule = taxSchedule;
        this.deferralAccount = deferralAccount;
        this.amortizationTemplate = amortizationTemplate;
        this.residual = residual;
        this.amortizationPeriod = amortizationPeriod;
        this.isFulfillable = isFulfillable;
        this.generateAccruals = generateAccruals;
        this.accountingBookDetailList = accountingBookDetailList;
        this.costCategory = costCategory;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.currency = currency;
        this.itemOptionsList = itemOptionsList;
        this.matrixOptionList = matrixOptionList;
        this.itemVendorList = itemVendorList;
        this.purchaseTaxCode = purchaseTaxCode;
        this.salesTaxCode = salesTaxCode;
        this.translationsList = translationsList;
        this.vendor = vendor;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this NonInventoryPurchaseItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this NonInventoryPurchaseItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this NonInventoryPurchaseItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this NonInventoryPurchaseItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the purchaseDescription value for this NonInventoryPurchaseItem.
     * 
     * @return purchaseDescription
     */
    public java.lang.String getPurchaseDescription() {
        return purchaseDescription;
    }


    /**
     * Sets the purchaseDescription value for this NonInventoryPurchaseItem.
     * 
     * @param purchaseDescription
     */
    public void setPurchaseDescription(java.lang.String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }


    /**
     * Gets the cost value for this NonInventoryPurchaseItem.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this NonInventoryPurchaseItem.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the costUnits value for this NonInventoryPurchaseItem.
     * 
     * @return costUnits
     */
    public java.lang.String getCostUnits() {
        return costUnits;
    }


    /**
     * Sets the costUnits value for this NonInventoryPurchaseItem.
     * 
     * @param costUnits
     */
    public void setCostUnits(java.lang.String costUnits) {
        this.costUnits = costUnits;
    }


    /**
     * Gets the expenseAccount value for this NonInventoryPurchaseItem.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this NonInventoryPurchaseItem.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the issueProduct value for this NonInventoryPurchaseItem.
     * 
     * @return issueProduct
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this NonInventoryPurchaseItem.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(com.netsuite.webservices.platform.core_2019_1.RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the isTaxable value for this NonInventoryPurchaseItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this NonInventoryPurchaseItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the matrixType value for this NonInventoryPurchaseItem.
     * 
     * @return matrixType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType getMatrixType() {
        return matrixType;
    }


    /**
     * Sets the matrixType value for this NonInventoryPurchaseItem.
     * 
     * @param matrixType
     */
    public void setMatrixType(com.netsuite.webservices.lists.accounting_2019_1.types.ItemMatrixType matrixType) {
        this.matrixType = matrixType;
    }


    /**
     * Gets the unitsType value for this NonInventoryPurchaseItem.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this NonInventoryPurchaseItem.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the purchaseUnit value for this NonInventoryPurchaseItem.
     * 
     * @return purchaseUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this NonInventoryPurchaseItem.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }


    /**
     * Gets the customForm value for this NonInventoryPurchaseItem.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this NonInventoryPurchaseItem.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the itemId value for this NonInventoryPurchaseItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this NonInventoryPurchaseItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the upcCode value for this NonInventoryPurchaseItem.
     * 
     * @return upcCode
     */
    public java.lang.String getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this NonInventoryPurchaseItem.
     * 
     * @param upcCode
     */
    public void setUpcCode(java.lang.String upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the displayName value for this NonInventoryPurchaseItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this NonInventoryPurchaseItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the includeChildren value for this NonInventoryPurchaseItem.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this NonInventoryPurchaseItem.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the vendorName value for this NonInventoryPurchaseItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this NonInventoryPurchaseItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the parent value for this NonInventoryPurchaseItem.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this NonInventoryPurchaseItem.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isInactive value for this NonInventoryPurchaseItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this NonInventoryPurchaseItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the matrixItemNameTemplate value for this NonInventoryPurchaseItem.
     * 
     * @return matrixItemNameTemplate
     */
    public java.lang.String getMatrixItemNameTemplate() {
        return matrixItemNameTemplate;
    }


    /**
     * Sets the matrixItemNameTemplate value for this NonInventoryPurchaseItem.
     * 
     * @param matrixItemNameTemplate
     */
    public void setMatrixItemNameTemplate(java.lang.String matrixItemNameTemplate) {
        this.matrixItemNameTemplate = matrixItemNameTemplate;
    }


    /**
     * Gets the availableToPartners value for this NonInventoryPurchaseItem.
     * 
     * @return availableToPartners
     */
    public java.lang.Boolean getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this NonInventoryPurchaseItem.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(java.lang.Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the department value for this NonInventoryPurchaseItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this NonInventoryPurchaseItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this NonInventoryPurchaseItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this NonInventoryPurchaseItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this NonInventoryPurchaseItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this NonInventoryPurchaseItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiaryList value for this NonInventoryPurchaseItem.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this NonInventoryPurchaseItem.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the taxSchedule value for this NonInventoryPurchaseItem.
     * 
     * @return taxSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this NonInventoryPurchaseItem.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the deferralAccount value for this NonInventoryPurchaseItem.
     * 
     * @return deferralAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeferralAccount() {
        return deferralAccount;
    }


    /**
     * Sets the deferralAccount value for this NonInventoryPurchaseItem.
     * 
     * @param deferralAccount
     */
    public void setDeferralAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef deferralAccount) {
        this.deferralAccount = deferralAccount;
    }


    /**
     * Gets the amortizationTemplate value for this NonInventoryPurchaseItem.
     * 
     * @return amortizationTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAmortizationTemplate() {
        return amortizationTemplate;
    }


    /**
     * Sets the amortizationTemplate value for this NonInventoryPurchaseItem.
     * 
     * @param amortizationTemplate
     */
    public void setAmortizationTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationTemplate) {
        this.amortizationTemplate = amortizationTemplate;
    }


    /**
     * Gets the residual value for this NonInventoryPurchaseItem.
     * 
     * @return residual
     */
    public java.lang.String getResidual() {
        return residual;
    }


    /**
     * Sets the residual value for this NonInventoryPurchaseItem.
     * 
     * @param residual
     */
    public void setResidual(java.lang.String residual) {
        this.residual = residual;
    }


    /**
     * Gets the amortizationPeriod value for this NonInventoryPurchaseItem.
     * 
     * @return amortizationPeriod
     */
    public java.lang.Long getAmortizationPeriod() {
        return amortizationPeriod;
    }


    /**
     * Sets the amortizationPeriod value for this NonInventoryPurchaseItem.
     * 
     * @param amortizationPeriod
     */
    public void setAmortizationPeriod(java.lang.Long amortizationPeriod) {
        this.amortizationPeriod = amortizationPeriod;
    }


    /**
     * Gets the isFulfillable value for this NonInventoryPurchaseItem.
     * 
     * @return isFulfillable
     */
    public java.lang.Boolean getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this NonInventoryPurchaseItem.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(java.lang.Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the generateAccruals value for this NonInventoryPurchaseItem.
     * 
     * @return generateAccruals
     */
    public java.lang.Boolean getGenerateAccruals() {
        return generateAccruals;
    }


    /**
     * Sets the generateAccruals value for this NonInventoryPurchaseItem.
     * 
     * @param generateAccruals
     */
    public void setGenerateAccruals(java.lang.Boolean generateAccruals) {
        this.generateAccruals = generateAccruals;
    }


    /**
     * Gets the accountingBookDetailList value for this NonInventoryPurchaseItem.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this NonInventoryPurchaseItem.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.lists.accounting_2019_1.ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the costCategory value for this NonInventoryPurchaseItem.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this NonInventoryPurchaseItem.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the purchaseOrderQuantity value for this NonInventoryPurchaseItem.
     * 
     * @return purchaseOrderQuantity
     */
    public java.lang.Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this NonInventoryPurchaseItem.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(java.lang.Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }


    /**
     * Gets the purchaseOrderAmount value for this NonInventoryPurchaseItem.
     * 
     * @return purchaseOrderAmount
     */
    public java.lang.Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this NonInventoryPurchaseItem.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(java.lang.Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this NonInventoryPurchaseItem.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public java.lang.Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this NonInventoryPurchaseItem.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(java.lang.Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }


    /**
     * Gets the receiptQuantity value for this NonInventoryPurchaseItem.
     * 
     * @return receiptQuantity
     */
    public java.lang.Double getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this NonInventoryPurchaseItem.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(java.lang.Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }


    /**
     * Gets the receiptAmount value for this NonInventoryPurchaseItem.
     * 
     * @return receiptAmount
     */
    public java.lang.Double getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this NonInventoryPurchaseItem.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(java.lang.Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }


    /**
     * Gets the receiptQuantityDiff value for this NonInventoryPurchaseItem.
     * 
     * @return receiptQuantityDiff
     */
    public java.lang.Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this NonInventoryPurchaseItem.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(java.lang.Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }


    /**
     * Gets the currency value for this NonInventoryPurchaseItem.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this NonInventoryPurchaseItem.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the itemOptionsList value for this NonInventoryPurchaseItem.
     * 
     * @return itemOptionsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }


    /**
     * Sets the itemOptionsList value for this NonInventoryPurchaseItem.
     * 
     * @param itemOptionsList
     */
    public void setItemOptionsList(com.netsuite.webservices.lists.accounting_2019_1.ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }


    /**
     * Gets the matrixOptionList value for this NonInventoryPurchaseItem.
     * 
     * @return matrixOptionList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList getMatrixOptionList() {
        return matrixOptionList;
    }


    /**
     * Sets the matrixOptionList value for this NonInventoryPurchaseItem.
     * 
     * @param matrixOptionList
     */
    public void setMatrixOptionList(com.netsuite.webservices.lists.accounting_2019_1.MatrixOptionList matrixOptionList) {
        this.matrixOptionList = matrixOptionList;
    }


    /**
     * Gets the itemVendorList value for this NonInventoryPurchaseItem.
     * 
     * @return itemVendorList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList getItemVendorList() {
        return itemVendorList;
    }


    /**
     * Sets the itemVendorList value for this NonInventoryPurchaseItem.
     * 
     * @param itemVendorList
     */
    public void setItemVendorList(com.netsuite.webservices.lists.accounting_2019_1.ItemVendorList itemVendorList) {
        this.itemVendorList = itemVendorList;
    }


    /**
     * Gets the purchaseTaxCode value for this NonInventoryPurchaseItem.
     * 
     * @return purchaseTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseTaxCode() {
        return purchaseTaxCode;
    }


    /**
     * Sets the purchaseTaxCode value for this NonInventoryPurchaseItem.
     * 
     * @param purchaseTaxCode
     */
    public void setPurchaseTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }


    /**
     * Gets the salesTaxCode value for this NonInventoryPurchaseItem.
     * 
     * @return salesTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this NonInventoryPurchaseItem.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }


    /**
     * Gets the translationsList value for this NonInventoryPurchaseItem.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.TranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this NonInventoryPurchaseItem.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.lists.accounting_2019_1.TranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the vendor value for this NonInventoryPurchaseItem.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this NonInventoryPurchaseItem.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the customFieldList value for this NonInventoryPurchaseItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this NonInventoryPurchaseItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this NonInventoryPurchaseItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this NonInventoryPurchaseItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this NonInventoryPurchaseItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this NonInventoryPurchaseItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NonInventoryPurchaseItem)) return false;
        NonInventoryPurchaseItem other = (NonInventoryPurchaseItem) obj;
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
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costUnits==null && other.getCostUnits()==null) || 
             (this.costUnits!=null &&
              this.costUnits.equals(other.getCostUnits()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              this.expenseAccount.equals(other.getExpenseAccount()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.matrixType==null && other.getMatrixType()==null) || 
             (this.matrixType!=null &&
              this.matrixType.equals(other.getMatrixType()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              this.purchaseUnit.equals(other.getPurchaseUnit()))) &&
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
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
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
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
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
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.generateAccruals==null && other.getGenerateAccruals()==null) || 
             (this.generateAccruals!=null &&
              this.generateAccruals.equals(other.getGenerateAccruals()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
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
            ((this.purchaseTaxCode==null && other.getPurchaseTaxCode()==null) || 
             (this.purchaseTaxCode!=null &&
              this.purchaseTaxCode.equals(other.getPurchaseTaxCode()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              this.salesTaxCode.equals(other.getSalesTaxCode()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
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
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostUnits() != null) {
            _hashCode += getCostUnits().hashCode();
        }
        if (getExpenseAccount() != null) {
            _hashCode += getExpenseAccount().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getMatrixType() != null) {
            _hashCode += getMatrixType().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getPurchaseUnit() != null) {
            _hashCode += getPurchaseUnit().hashCode();
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
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
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
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
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
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getGenerateAccruals() != null) {
            _hashCode += getGenerateAccruals().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
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
        if (getPurchaseTaxCode() != null) {
            _hashCode += getPurchaseTaxCode().hashCode();
        }
        if (getSalesTaxCode() != null) {
            _hashCode += getSalesTaxCode().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
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
        new org.apache.axis.description.TypeDesc(NonInventoryPurchaseItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "NonInventoryPurchaseItem"));
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
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "issueProduct"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList"));
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
        elemField.setFieldName("purchaseTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "purchaseTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
