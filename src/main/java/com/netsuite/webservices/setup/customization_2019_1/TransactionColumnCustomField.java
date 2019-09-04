/**
 * TransactionColumnCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class TransactionColumnCustomField  extends com.netsuite.webservices.setup.customization_2019_1.CustomFieldType  implements java.io.Serializable {
    private java.lang.String label;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef owner;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef selectRecordType;

    private java.lang.Boolean storeValue;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore;

    private java.lang.Boolean availableToSso;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType displayType;

    private java.lang.Long displayWidth;

    private java.lang.Long displayHeight;

    private java.lang.String help;

    private java.lang.String linkText;

    private java.lang.Boolean isMandatory;

    private java.lang.Long maxLength;

    private java.lang.Double minValue;

    private java.lang.Double maxValue;

    private java.lang.Boolean defaultChecked;

    private java.lang.String defaultValue;

    private java.lang.Boolean isFormula;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault dynamicDefault;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFrom;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFilterBy;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customSegment;

    private java.lang.Boolean colExpense;

    private java.lang.Boolean colPurchase;

    private java.lang.Boolean colSale;

    private java.lang.Boolean colOpportunity;

    private java.lang.Boolean colStore;

    private java.lang.Boolean colStoreHidden;

    private java.lang.Boolean colJournal;

    private java.lang.Boolean colBuild;

    private java.lang.Boolean colExpenseReport;

    private java.lang.Boolean colTime;

    private java.lang.Boolean colTransferOrder;

    private java.lang.Boolean colTimeGroup;

    private java.lang.Boolean colItemReceipt;

    private java.lang.Boolean colItemReceiptOrder;

    private java.lang.Boolean colItemFulfillment;

    private java.lang.Boolean colItemFulfillmentOrder;

    private java.lang.Boolean colPrintFlag;

    private java.lang.Boolean colPickingTicket;

    private java.lang.Boolean colPackingSlip;

    private java.lang.Boolean colReturnForm;

    private java.lang.Boolean colStoreWithGroups;

    private java.lang.Boolean colGroupOnInvoices;

    private java.lang.Boolean colKitItem;

    private com.netsuite.webservices.setup.customization_2019_1.TransactionColumnCustomFieldFilterList filterList;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList roleAccessList;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList deptAccessList;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList subAccessList;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList translationsList;

    private java.lang.String internalId;  // attribute

    public TransactionColumnCustomField() {
    }

    public TransactionColumnCustomField(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType,
           java.lang.String scriptId,
           java.lang.String internalId,
           java.lang.String label,
           com.netsuite.webservices.platform.core_2019_1.RecordRef owner,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef selectRecordType,
           java.lang.Boolean storeValue,
           com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore,
           java.lang.Boolean availableToSso,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType displayType,
           java.lang.Long displayWidth,
           java.lang.Long displayHeight,
           java.lang.String help,
           java.lang.String linkText,
           java.lang.Boolean isMandatory,
           java.lang.Long maxLength,
           java.lang.Double minValue,
           java.lang.Double maxValue,
           java.lang.Boolean defaultChecked,
           java.lang.String defaultValue,
           java.lang.Boolean isFormula,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault dynamicDefault,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFrom,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFilterBy,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customSegment,
           java.lang.Boolean colExpense,
           java.lang.Boolean colPurchase,
           java.lang.Boolean colSale,
           java.lang.Boolean colOpportunity,
           java.lang.Boolean colStore,
           java.lang.Boolean colStoreHidden,
           java.lang.Boolean colJournal,
           java.lang.Boolean colBuild,
           java.lang.Boolean colExpenseReport,
           java.lang.Boolean colTime,
           java.lang.Boolean colTransferOrder,
           java.lang.Boolean colTimeGroup,
           java.lang.Boolean colItemReceipt,
           java.lang.Boolean colItemReceiptOrder,
           java.lang.Boolean colItemFulfillment,
           java.lang.Boolean colItemFulfillmentOrder,
           java.lang.Boolean colPrintFlag,
           java.lang.Boolean colPickingTicket,
           java.lang.Boolean colPackingSlip,
           java.lang.Boolean colReturnForm,
           java.lang.Boolean colStoreWithGroups,
           java.lang.Boolean colGroupOnInvoices,
           java.lang.Boolean colKitItem,
           com.netsuite.webservices.setup.customization_2019_1.TransactionColumnCustomFieldFilterList filterList,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel,
           com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList roleAccessList,
           com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList deptAccessList,
           com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList subAccessList,
           com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList translationsList) {
        super(
            nullFieldList,
            fieldType,
            scriptId);
        this.internalId = internalId;
        this.label = label;
        this.owner = owner;
        this.description = description;
        this.selectRecordType = selectRecordType;
        this.storeValue = storeValue;
        this.insertBefore = insertBefore;
        this.availableToSso = availableToSso;
        this.displayType = displayType;
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        this.help = help;
        this.linkText = linkText;
        this.isMandatory = isMandatory;
        this.maxLength = maxLength;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.defaultChecked = defaultChecked;
        this.defaultValue = defaultValue;
        this.isFormula = isFormula;
        this.defaultSelection = defaultSelection;
        this.dynamicDefault = dynamicDefault;
        this.sourceList = sourceList;
        this.sourceFrom = sourceFrom;
        this.sourceFilterBy = sourceFilterBy;
        this.customSegment = customSegment;
        this.colExpense = colExpense;
        this.colPurchase = colPurchase;
        this.colSale = colSale;
        this.colOpportunity = colOpportunity;
        this.colStore = colStore;
        this.colStoreHidden = colStoreHidden;
        this.colJournal = colJournal;
        this.colBuild = colBuild;
        this.colExpenseReport = colExpenseReport;
        this.colTime = colTime;
        this.colTransferOrder = colTransferOrder;
        this.colTimeGroup = colTimeGroup;
        this.colItemReceipt = colItemReceipt;
        this.colItemReceiptOrder = colItemReceiptOrder;
        this.colItemFulfillment = colItemFulfillment;
        this.colItemFulfillmentOrder = colItemFulfillmentOrder;
        this.colPrintFlag = colPrintFlag;
        this.colPickingTicket = colPickingTicket;
        this.colPackingSlip = colPackingSlip;
        this.colReturnForm = colReturnForm;
        this.colStoreWithGroups = colStoreWithGroups;
        this.colGroupOnInvoices = colGroupOnInvoices;
        this.colKitItem = colKitItem;
        this.filterList = filterList;
        this.accessLevel = accessLevel;
        this.searchLevel = searchLevel;
        this.roleAccessList = roleAccessList;
        this.deptAccessList = deptAccessList;
        this.subAccessList = subAccessList;
        this.translationsList = translationsList;
    }


    /**
     * Gets the label value for this TransactionColumnCustomField.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this TransactionColumnCustomField.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the owner value for this TransactionColumnCustomField.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TransactionColumnCustomField.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the description value for this TransactionColumnCustomField.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransactionColumnCustomField.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the selectRecordType value for this TransactionColumnCustomField.
     * 
     * @return selectRecordType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSelectRecordType() {
        return selectRecordType;
    }


    /**
     * Sets the selectRecordType value for this TransactionColumnCustomField.
     * 
     * @param selectRecordType
     */
    public void setSelectRecordType(com.netsuite.webservices.platform.core_2019_1.RecordRef selectRecordType) {
        this.selectRecordType = selectRecordType;
    }


    /**
     * Gets the storeValue value for this TransactionColumnCustomField.
     * 
     * @return storeValue
     */
    public java.lang.Boolean getStoreValue() {
        return storeValue;
    }


    /**
     * Sets the storeValue value for this TransactionColumnCustomField.
     * 
     * @param storeValue
     */
    public void setStoreValue(java.lang.Boolean storeValue) {
        this.storeValue = storeValue;
    }


    /**
     * Gets the insertBefore value for this TransactionColumnCustomField.
     * 
     * @return insertBefore
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInsertBefore() {
        return insertBefore;
    }


    /**
     * Sets the insertBefore value for this TransactionColumnCustomField.
     * 
     * @param insertBefore
     */
    public void setInsertBefore(com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore) {
        this.insertBefore = insertBefore;
    }


    /**
     * Gets the availableToSso value for this TransactionColumnCustomField.
     * 
     * @return availableToSso
     */
    public java.lang.Boolean getAvailableToSso() {
        return availableToSso;
    }


    /**
     * Sets the availableToSso value for this TransactionColumnCustomField.
     * 
     * @param availableToSso
     */
    public void setAvailableToSso(java.lang.Boolean availableToSso) {
        this.availableToSso = availableToSso;
    }


    /**
     * Gets the displayType value for this TransactionColumnCustomField.
     * 
     * @return displayType
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this TransactionColumnCustomField.
     * 
     * @param displayType
     */
    public void setDisplayType(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the displayWidth value for this TransactionColumnCustomField.
     * 
     * @return displayWidth
     */
    public java.lang.Long getDisplayWidth() {
        return displayWidth;
    }


    /**
     * Sets the displayWidth value for this TransactionColumnCustomField.
     * 
     * @param displayWidth
     */
    public void setDisplayWidth(java.lang.Long displayWidth) {
        this.displayWidth = displayWidth;
    }


    /**
     * Gets the displayHeight value for this TransactionColumnCustomField.
     * 
     * @return displayHeight
     */
    public java.lang.Long getDisplayHeight() {
        return displayHeight;
    }


    /**
     * Sets the displayHeight value for this TransactionColumnCustomField.
     * 
     * @param displayHeight
     */
    public void setDisplayHeight(java.lang.Long displayHeight) {
        this.displayHeight = displayHeight;
    }


    /**
     * Gets the help value for this TransactionColumnCustomField.
     * 
     * @return help
     */
    public java.lang.String getHelp() {
        return help;
    }


    /**
     * Sets the help value for this TransactionColumnCustomField.
     * 
     * @param help
     */
    public void setHelp(java.lang.String help) {
        this.help = help;
    }


    /**
     * Gets the linkText value for this TransactionColumnCustomField.
     * 
     * @return linkText
     */
    public java.lang.String getLinkText() {
        return linkText;
    }


    /**
     * Sets the linkText value for this TransactionColumnCustomField.
     * 
     * @param linkText
     */
    public void setLinkText(java.lang.String linkText) {
        this.linkText = linkText;
    }


    /**
     * Gets the isMandatory value for this TransactionColumnCustomField.
     * 
     * @return isMandatory
     */
    public java.lang.Boolean getIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this TransactionColumnCustomField.
     * 
     * @param isMandatory
     */
    public void setIsMandatory(java.lang.Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the maxLength value for this TransactionColumnCustomField.
     * 
     * @return maxLength
     */
    public java.lang.Long getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this TransactionColumnCustomField.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Long maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minValue value for this TransactionColumnCustomField.
     * 
     * @return minValue
     */
    public java.lang.Double getMinValue() {
        return minValue;
    }


    /**
     * Sets the minValue value for this TransactionColumnCustomField.
     * 
     * @param minValue
     */
    public void setMinValue(java.lang.Double minValue) {
        this.minValue = minValue;
    }


    /**
     * Gets the maxValue value for this TransactionColumnCustomField.
     * 
     * @return maxValue
     */
    public java.lang.Double getMaxValue() {
        return maxValue;
    }


    /**
     * Sets the maxValue value for this TransactionColumnCustomField.
     * 
     * @param maxValue
     */
    public void setMaxValue(java.lang.Double maxValue) {
        this.maxValue = maxValue;
    }


    /**
     * Gets the defaultChecked value for this TransactionColumnCustomField.
     * 
     * @return defaultChecked
     */
    public java.lang.Boolean getDefaultChecked() {
        return defaultChecked;
    }


    /**
     * Sets the defaultChecked value for this TransactionColumnCustomField.
     * 
     * @param defaultChecked
     */
    public void setDefaultChecked(java.lang.Boolean defaultChecked) {
        this.defaultChecked = defaultChecked;
    }


    /**
     * Gets the defaultValue value for this TransactionColumnCustomField.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this TransactionColumnCustomField.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the isFormula value for this TransactionColumnCustomField.
     * 
     * @return isFormula
     */
    public java.lang.Boolean getIsFormula() {
        return isFormula;
    }


    /**
     * Sets the isFormula value for this TransactionColumnCustomField.
     * 
     * @param isFormula
     */
    public void setIsFormula(java.lang.Boolean isFormula) {
        this.isFormula = isFormula;
    }


    /**
     * Gets the defaultSelection value for this TransactionColumnCustomField.
     * 
     * @return defaultSelection
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultSelection() {
        return defaultSelection;
    }


    /**
     * Sets the defaultSelection value for this TransactionColumnCustomField.
     * 
     * @param defaultSelection
     */
    public void setDefaultSelection(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection) {
        this.defaultSelection = defaultSelection;
    }


    /**
     * Gets the dynamicDefault value for this TransactionColumnCustomField.
     * 
     * @return dynamicDefault
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault getDynamicDefault() {
        return dynamicDefault;
    }


    /**
     * Sets the dynamicDefault value for this TransactionColumnCustomField.
     * 
     * @param dynamicDefault
     */
    public void setDynamicDefault(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault dynamicDefault) {
        this.dynamicDefault = dynamicDefault;
    }


    /**
     * Gets the sourceList value for this TransactionColumnCustomField.
     * 
     * @return sourceList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceList() {
        return sourceList;
    }


    /**
     * Sets the sourceList value for this TransactionColumnCustomField.
     * 
     * @param sourceList
     */
    public void setSourceList(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceList) {
        this.sourceList = sourceList;
    }


    /**
     * Gets the sourceFrom value for this TransactionColumnCustomField.
     * 
     * @return sourceFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceFrom() {
        return sourceFrom;
    }


    /**
     * Sets the sourceFrom value for this TransactionColumnCustomField.
     * 
     * @param sourceFrom
     */
    public void setSourceFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFrom) {
        this.sourceFrom = sourceFrom;
    }


    /**
     * Gets the sourceFilterBy value for this TransactionColumnCustomField.
     * 
     * @return sourceFilterBy
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceFilterBy() {
        return sourceFilterBy;
    }


    /**
     * Sets the sourceFilterBy value for this TransactionColumnCustomField.
     * 
     * @param sourceFilterBy
     */
    public void setSourceFilterBy(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFilterBy) {
        this.sourceFilterBy = sourceFilterBy;
    }


    /**
     * Gets the customSegment value for this TransactionColumnCustomField.
     * 
     * @return customSegment
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomSegment() {
        return customSegment;
    }


    /**
     * Sets the customSegment value for this TransactionColumnCustomField.
     * 
     * @param customSegment
     */
    public void setCustomSegment(com.netsuite.webservices.platform.core_2019_1.RecordRef customSegment) {
        this.customSegment = customSegment;
    }


    /**
     * Gets the colExpense value for this TransactionColumnCustomField.
     * 
     * @return colExpense
     */
    public java.lang.Boolean getColExpense() {
        return colExpense;
    }


    /**
     * Sets the colExpense value for this TransactionColumnCustomField.
     * 
     * @param colExpense
     */
    public void setColExpense(java.lang.Boolean colExpense) {
        this.colExpense = colExpense;
    }


    /**
     * Gets the colPurchase value for this TransactionColumnCustomField.
     * 
     * @return colPurchase
     */
    public java.lang.Boolean getColPurchase() {
        return colPurchase;
    }


    /**
     * Sets the colPurchase value for this TransactionColumnCustomField.
     * 
     * @param colPurchase
     */
    public void setColPurchase(java.lang.Boolean colPurchase) {
        this.colPurchase = colPurchase;
    }


    /**
     * Gets the colSale value for this TransactionColumnCustomField.
     * 
     * @return colSale
     */
    public java.lang.Boolean getColSale() {
        return colSale;
    }


    /**
     * Sets the colSale value for this TransactionColumnCustomField.
     * 
     * @param colSale
     */
    public void setColSale(java.lang.Boolean colSale) {
        this.colSale = colSale;
    }


    /**
     * Gets the colOpportunity value for this TransactionColumnCustomField.
     * 
     * @return colOpportunity
     */
    public java.lang.Boolean getColOpportunity() {
        return colOpportunity;
    }


    /**
     * Sets the colOpportunity value for this TransactionColumnCustomField.
     * 
     * @param colOpportunity
     */
    public void setColOpportunity(java.lang.Boolean colOpportunity) {
        this.colOpportunity = colOpportunity;
    }


    /**
     * Gets the colStore value for this TransactionColumnCustomField.
     * 
     * @return colStore
     */
    public java.lang.Boolean getColStore() {
        return colStore;
    }


    /**
     * Sets the colStore value for this TransactionColumnCustomField.
     * 
     * @param colStore
     */
    public void setColStore(java.lang.Boolean colStore) {
        this.colStore = colStore;
    }


    /**
     * Gets the colStoreHidden value for this TransactionColumnCustomField.
     * 
     * @return colStoreHidden
     */
    public java.lang.Boolean getColStoreHidden() {
        return colStoreHidden;
    }


    /**
     * Sets the colStoreHidden value for this TransactionColumnCustomField.
     * 
     * @param colStoreHidden
     */
    public void setColStoreHidden(java.lang.Boolean colStoreHidden) {
        this.colStoreHidden = colStoreHidden;
    }


    /**
     * Gets the colJournal value for this TransactionColumnCustomField.
     * 
     * @return colJournal
     */
    public java.lang.Boolean getColJournal() {
        return colJournal;
    }


    /**
     * Sets the colJournal value for this TransactionColumnCustomField.
     * 
     * @param colJournal
     */
    public void setColJournal(java.lang.Boolean colJournal) {
        this.colJournal = colJournal;
    }


    /**
     * Gets the colBuild value for this TransactionColumnCustomField.
     * 
     * @return colBuild
     */
    public java.lang.Boolean getColBuild() {
        return colBuild;
    }


    /**
     * Sets the colBuild value for this TransactionColumnCustomField.
     * 
     * @param colBuild
     */
    public void setColBuild(java.lang.Boolean colBuild) {
        this.colBuild = colBuild;
    }


    /**
     * Gets the colExpenseReport value for this TransactionColumnCustomField.
     * 
     * @return colExpenseReport
     */
    public java.lang.Boolean getColExpenseReport() {
        return colExpenseReport;
    }


    /**
     * Sets the colExpenseReport value for this TransactionColumnCustomField.
     * 
     * @param colExpenseReport
     */
    public void setColExpenseReport(java.lang.Boolean colExpenseReport) {
        this.colExpenseReport = colExpenseReport;
    }


    /**
     * Gets the colTime value for this TransactionColumnCustomField.
     * 
     * @return colTime
     */
    public java.lang.Boolean getColTime() {
        return colTime;
    }


    /**
     * Sets the colTime value for this TransactionColumnCustomField.
     * 
     * @param colTime
     */
    public void setColTime(java.lang.Boolean colTime) {
        this.colTime = colTime;
    }


    /**
     * Gets the colTransferOrder value for this TransactionColumnCustomField.
     * 
     * @return colTransferOrder
     */
    public java.lang.Boolean getColTransferOrder() {
        return colTransferOrder;
    }


    /**
     * Sets the colTransferOrder value for this TransactionColumnCustomField.
     * 
     * @param colTransferOrder
     */
    public void setColTransferOrder(java.lang.Boolean colTransferOrder) {
        this.colTransferOrder = colTransferOrder;
    }


    /**
     * Gets the colTimeGroup value for this TransactionColumnCustomField.
     * 
     * @return colTimeGroup
     */
    public java.lang.Boolean getColTimeGroup() {
        return colTimeGroup;
    }


    /**
     * Sets the colTimeGroup value for this TransactionColumnCustomField.
     * 
     * @param colTimeGroup
     */
    public void setColTimeGroup(java.lang.Boolean colTimeGroup) {
        this.colTimeGroup = colTimeGroup;
    }


    /**
     * Gets the colItemReceipt value for this TransactionColumnCustomField.
     * 
     * @return colItemReceipt
     */
    public java.lang.Boolean getColItemReceipt() {
        return colItemReceipt;
    }


    /**
     * Sets the colItemReceipt value for this TransactionColumnCustomField.
     * 
     * @param colItemReceipt
     */
    public void setColItemReceipt(java.lang.Boolean colItemReceipt) {
        this.colItemReceipt = colItemReceipt;
    }


    /**
     * Gets the colItemReceiptOrder value for this TransactionColumnCustomField.
     * 
     * @return colItemReceiptOrder
     */
    public java.lang.Boolean getColItemReceiptOrder() {
        return colItemReceiptOrder;
    }


    /**
     * Sets the colItemReceiptOrder value for this TransactionColumnCustomField.
     * 
     * @param colItemReceiptOrder
     */
    public void setColItemReceiptOrder(java.lang.Boolean colItemReceiptOrder) {
        this.colItemReceiptOrder = colItemReceiptOrder;
    }


    /**
     * Gets the colItemFulfillment value for this TransactionColumnCustomField.
     * 
     * @return colItemFulfillment
     */
    public java.lang.Boolean getColItemFulfillment() {
        return colItemFulfillment;
    }


    /**
     * Sets the colItemFulfillment value for this TransactionColumnCustomField.
     * 
     * @param colItemFulfillment
     */
    public void setColItemFulfillment(java.lang.Boolean colItemFulfillment) {
        this.colItemFulfillment = colItemFulfillment;
    }


    /**
     * Gets the colItemFulfillmentOrder value for this TransactionColumnCustomField.
     * 
     * @return colItemFulfillmentOrder
     */
    public java.lang.Boolean getColItemFulfillmentOrder() {
        return colItemFulfillmentOrder;
    }


    /**
     * Sets the colItemFulfillmentOrder value for this TransactionColumnCustomField.
     * 
     * @param colItemFulfillmentOrder
     */
    public void setColItemFulfillmentOrder(java.lang.Boolean colItemFulfillmentOrder) {
        this.colItemFulfillmentOrder = colItemFulfillmentOrder;
    }


    /**
     * Gets the colPrintFlag value for this TransactionColumnCustomField.
     * 
     * @return colPrintFlag
     */
    public java.lang.Boolean getColPrintFlag() {
        return colPrintFlag;
    }


    /**
     * Sets the colPrintFlag value for this TransactionColumnCustomField.
     * 
     * @param colPrintFlag
     */
    public void setColPrintFlag(java.lang.Boolean colPrintFlag) {
        this.colPrintFlag = colPrintFlag;
    }


    /**
     * Gets the colPickingTicket value for this TransactionColumnCustomField.
     * 
     * @return colPickingTicket
     */
    public java.lang.Boolean getColPickingTicket() {
        return colPickingTicket;
    }


    /**
     * Sets the colPickingTicket value for this TransactionColumnCustomField.
     * 
     * @param colPickingTicket
     */
    public void setColPickingTicket(java.lang.Boolean colPickingTicket) {
        this.colPickingTicket = colPickingTicket;
    }


    /**
     * Gets the colPackingSlip value for this TransactionColumnCustomField.
     * 
     * @return colPackingSlip
     */
    public java.lang.Boolean getColPackingSlip() {
        return colPackingSlip;
    }


    /**
     * Sets the colPackingSlip value for this TransactionColumnCustomField.
     * 
     * @param colPackingSlip
     */
    public void setColPackingSlip(java.lang.Boolean colPackingSlip) {
        this.colPackingSlip = colPackingSlip;
    }


    /**
     * Gets the colReturnForm value for this TransactionColumnCustomField.
     * 
     * @return colReturnForm
     */
    public java.lang.Boolean getColReturnForm() {
        return colReturnForm;
    }


    /**
     * Sets the colReturnForm value for this TransactionColumnCustomField.
     * 
     * @param colReturnForm
     */
    public void setColReturnForm(java.lang.Boolean colReturnForm) {
        this.colReturnForm = colReturnForm;
    }


    /**
     * Gets the colStoreWithGroups value for this TransactionColumnCustomField.
     * 
     * @return colStoreWithGroups
     */
    public java.lang.Boolean getColStoreWithGroups() {
        return colStoreWithGroups;
    }


    /**
     * Sets the colStoreWithGroups value for this TransactionColumnCustomField.
     * 
     * @param colStoreWithGroups
     */
    public void setColStoreWithGroups(java.lang.Boolean colStoreWithGroups) {
        this.colStoreWithGroups = colStoreWithGroups;
    }


    /**
     * Gets the colGroupOnInvoices value for this TransactionColumnCustomField.
     * 
     * @return colGroupOnInvoices
     */
    public java.lang.Boolean getColGroupOnInvoices() {
        return colGroupOnInvoices;
    }


    /**
     * Sets the colGroupOnInvoices value for this TransactionColumnCustomField.
     * 
     * @param colGroupOnInvoices
     */
    public void setColGroupOnInvoices(java.lang.Boolean colGroupOnInvoices) {
        this.colGroupOnInvoices = colGroupOnInvoices;
    }


    /**
     * Gets the colKitItem value for this TransactionColumnCustomField.
     * 
     * @return colKitItem
     */
    public java.lang.Boolean getColKitItem() {
        return colKitItem;
    }


    /**
     * Sets the colKitItem value for this TransactionColumnCustomField.
     * 
     * @param colKitItem
     */
    public void setColKitItem(java.lang.Boolean colKitItem) {
        this.colKitItem = colKitItem;
    }


    /**
     * Gets the filterList value for this TransactionColumnCustomField.
     * 
     * @return filterList
     */
    public com.netsuite.webservices.setup.customization_2019_1.TransactionColumnCustomFieldFilterList getFilterList() {
        return filterList;
    }


    /**
     * Sets the filterList value for this TransactionColumnCustomField.
     * 
     * @param filterList
     */
    public void setFilterList(com.netsuite.webservices.setup.customization_2019_1.TransactionColumnCustomFieldFilterList filterList) {
        this.filterList = filterList;
    }


    /**
     * Gets the accessLevel value for this TransactionColumnCustomField.
     * 
     * @return accessLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this TransactionColumnCustomField.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the searchLevel value for this TransactionColumnCustomField.
     * 
     * @return searchLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }


    /**
     * Sets the searchLevel value for this TransactionColumnCustomField.
     * 
     * @param searchLevel
     */
    public void setSearchLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }


    /**
     * Gets the roleAccessList value for this TransactionColumnCustomField.
     * 
     * @return roleAccessList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList getRoleAccessList() {
        return roleAccessList;
    }


    /**
     * Sets the roleAccessList value for this TransactionColumnCustomField.
     * 
     * @param roleAccessList
     */
    public void setRoleAccessList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList roleAccessList) {
        this.roleAccessList = roleAccessList;
    }


    /**
     * Gets the deptAccessList value for this TransactionColumnCustomField.
     * 
     * @return deptAccessList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList getDeptAccessList() {
        return deptAccessList;
    }


    /**
     * Sets the deptAccessList value for this TransactionColumnCustomField.
     * 
     * @param deptAccessList
     */
    public void setDeptAccessList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList deptAccessList) {
        this.deptAccessList = deptAccessList;
    }


    /**
     * Gets the subAccessList value for this TransactionColumnCustomField.
     * 
     * @return subAccessList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList getSubAccessList() {
        return subAccessList;
    }


    /**
     * Sets the subAccessList value for this TransactionColumnCustomField.
     * 
     * @param subAccessList
     */
    public void setSubAccessList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList subAccessList) {
        this.subAccessList = subAccessList;
    }


    /**
     * Gets the translationsList value for this TransactionColumnCustomField.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this TransactionColumnCustomField.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the internalId value for this TransactionColumnCustomField.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TransactionColumnCustomField.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionColumnCustomField)) return false;
        TransactionColumnCustomField other = (TransactionColumnCustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.selectRecordType==null && other.getSelectRecordType()==null) || 
             (this.selectRecordType!=null &&
              this.selectRecordType.equals(other.getSelectRecordType()))) &&
            ((this.storeValue==null && other.getStoreValue()==null) || 
             (this.storeValue!=null &&
              this.storeValue.equals(other.getStoreValue()))) &&
            ((this.insertBefore==null && other.getInsertBefore()==null) || 
             (this.insertBefore!=null &&
              this.insertBefore.equals(other.getInsertBefore()))) &&
            ((this.availableToSso==null && other.getAvailableToSso()==null) || 
             (this.availableToSso!=null &&
              this.availableToSso.equals(other.getAvailableToSso()))) &&
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.displayWidth==null && other.getDisplayWidth()==null) || 
             (this.displayWidth!=null &&
              this.displayWidth.equals(other.getDisplayWidth()))) &&
            ((this.displayHeight==null && other.getDisplayHeight()==null) || 
             (this.displayHeight!=null &&
              this.displayHeight.equals(other.getDisplayHeight()))) &&
            ((this.help==null && other.getHelp()==null) || 
             (this.help!=null &&
              this.help.equals(other.getHelp()))) &&
            ((this.linkText==null && other.getLinkText()==null) || 
             (this.linkText!=null &&
              this.linkText.equals(other.getLinkText()))) &&
            ((this.isMandatory==null && other.getIsMandatory()==null) || 
             (this.isMandatory!=null &&
              this.isMandatory.equals(other.getIsMandatory()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.minValue==null && other.getMinValue()==null) || 
             (this.minValue!=null &&
              this.minValue.equals(other.getMinValue()))) &&
            ((this.maxValue==null && other.getMaxValue()==null) || 
             (this.maxValue!=null &&
              this.maxValue.equals(other.getMaxValue()))) &&
            ((this.defaultChecked==null && other.getDefaultChecked()==null) || 
             (this.defaultChecked!=null &&
              this.defaultChecked.equals(other.getDefaultChecked()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.isFormula==null && other.getIsFormula()==null) || 
             (this.isFormula!=null &&
              this.isFormula.equals(other.getIsFormula()))) &&
            ((this.defaultSelection==null && other.getDefaultSelection()==null) || 
             (this.defaultSelection!=null &&
              this.defaultSelection.equals(other.getDefaultSelection()))) &&
            ((this.dynamicDefault==null && other.getDynamicDefault()==null) || 
             (this.dynamicDefault!=null &&
              this.dynamicDefault.equals(other.getDynamicDefault()))) &&
            ((this.sourceList==null && other.getSourceList()==null) || 
             (this.sourceList!=null &&
              this.sourceList.equals(other.getSourceList()))) &&
            ((this.sourceFrom==null && other.getSourceFrom()==null) || 
             (this.sourceFrom!=null &&
              this.sourceFrom.equals(other.getSourceFrom()))) &&
            ((this.sourceFilterBy==null && other.getSourceFilterBy()==null) || 
             (this.sourceFilterBy!=null &&
              this.sourceFilterBy.equals(other.getSourceFilterBy()))) &&
            ((this.customSegment==null && other.getCustomSegment()==null) || 
             (this.customSegment!=null &&
              this.customSegment.equals(other.getCustomSegment()))) &&
            ((this.colExpense==null && other.getColExpense()==null) || 
             (this.colExpense!=null &&
              this.colExpense.equals(other.getColExpense()))) &&
            ((this.colPurchase==null && other.getColPurchase()==null) || 
             (this.colPurchase!=null &&
              this.colPurchase.equals(other.getColPurchase()))) &&
            ((this.colSale==null && other.getColSale()==null) || 
             (this.colSale!=null &&
              this.colSale.equals(other.getColSale()))) &&
            ((this.colOpportunity==null && other.getColOpportunity()==null) || 
             (this.colOpportunity!=null &&
              this.colOpportunity.equals(other.getColOpportunity()))) &&
            ((this.colStore==null && other.getColStore()==null) || 
             (this.colStore!=null &&
              this.colStore.equals(other.getColStore()))) &&
            ((this.colStoreHidden==null && other.getColStoreHidden()==null) || 
             (this.colStoreHidden!=null &&
              this.colStoreHidden.equals(other.getColStoreHidden()))) &&
            ((this.colJournal==null && other.getColJournal()==null) || 
             (this.colJournal!=null &&
              this.colJournal.equals(other.getColJournal()))) &&
            ((this.colBuild==null && other.getColBuild()==null) || 
             (this.colBuild!=null &&
              this.colBuild.equals(other.getColBuild()))) &&
            ((this.colExpenseReport==null && other.getColExpenseReport()==null) || 
             (this.colExpenseReport!=null &&
              this.colExpenseReport.equals(other.getColExpenseReport()))) &&
            ((this.colTime==null && other.getColTime()==null) || 
             (this.colTime!=null &&
              this.colTime.equals(other.getColTime()))) &&
            ((this.colTransferOrder==null && other.getColTransferOrder()==null) || 
             (this.colTransferOrder!=null &&
              this.colTransferOrder.equals(other.getColTransferOrder()))) &&
            ((this.colTimeGroup==null && other.getColTimeGroup()==null) || 
             (this.colTimeGroup!=null &&
              this.colTimeGroup.equals(other.getColTimeGroup()))) &&
            ((this.colItemReceipt==null && other.getColItemReceipt()==null) || 
             (this.colItemReceipt!=null &&
              this.colItemReceipt.equals(other.getColItemReceipt()))) &&
            ((this.colItemReceiptOrder==null && other.getColItemReceiptOrder()==null) || 
             (this.colItemReceiptOrder!=null &&
              this.colItemReceiptOrder.equals(other.getColItemReceiptOrder()))) &&
            ((this.colItemFulfillment==null && other.getColItemFulfillment()==null) || 
             (this.colItemFulfillment!=null &&
              this.colItemFulfillment.equals(other.getColItemFulfillment()))) &&
            ((this.colItemFulfillmentOrder==null && other.getColItemFulfillmentOrder()==null) || 
             (this.colItemFulfillmentOrder!=null &&
              this.colItemFulfillmentOrder.equals(other.getColItemFulfillmentOrder()))) &&
            ((this.colPrintFlag==null && other.getColPrintFlag()==null) || 
             (this.colPrintFlag!=null &&
              this.colPrintFlag.equals(other.getColPrintFlag()))) &&
            ((this.colPickingTicket==null && other.getColPickingTicket()==null) || 
             (this.colPickingTicket!=null &&
              this.colPickingTicket.equals(other.getColPickingTicket()))) &&
            ((this.colPackingSlip==null && other.getColPackingSlip()==null) || 
             (this.colPackingSlip!=null &&
              this.colPackingSlip.equals(other.getColPackingSlip()))) &&
            ((this.colReturnForm==null && other.getColReturnForm()==null) || 
             (this.colReturnForm!=null &&
              this.colReturnForm.equals(other.getColReturnForm()))) &&
            ((this.colStoreWithGroups==null && other.getColStoreWithGroups()==null) || 
             (this.colStoreWithGroups!=null &&
              this.colStoreWithGroups.equals(other.getColStoreWithGroups()))) &&
            ((this.colGroupOnInvoices==null && other.getColGroupOnInvoices()==null) || 
             (this.colGroupOnInvoices!=null &&
              this.colGroupOnInvoices.equals(other.getColGroupOnInvoices()))) &&
            ((this.colKitItem==null && other.getColKitItem()==null) || 
             (this.colKitItem!=null &&
              this.colKitItem.equals(other.getColKitItem()))) &&
            ((this.filterList==null && other.getFilterList()==null) || 
             (this.filterList!=null &&
              this.filterList.equals(other.getFilterList()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.searchLevel==null && other.getSearchLevel()==null) || 
             (this.searchLevel!=null &&
              this.searchLevel.equals(other.getSearchLevel()))) &&
            ((this.roleAccessList==null && other.getRoleAccessList()==null) || 
             (this.roleAccessList!=null &&
              this.roleAccessList.equals(other.getRoleAccessList()))) &&
            ((this.deptAccessList==null && other.getDeptAccessList()==null) || 
             (this.deptAccessList!=null &&
              this.deptAccessList.equals(other.getDeptAccessList()))) &&
            ((this.subAccessList==null && other.getSubAccessList()==null) || 
             (this.subAccessList!=null &&
              this.subAccessList.equals(other.getSubAccessList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSelectRecordType() != null) {
            _hashCode += getSelectRecordType().hashCode();
        }
        if (getStoreValue() != null) {
            _hashCode += getStoreValue().hashCode();
        }
        if (getInsertBefore() != null) {
            _hashCode += getInsertBefore().hashCode();
        }
        if (getAvailableToSso() != null) {
            _hashCode += getAvailableToSso().hashCode();
        }
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getDisplayWidth() != null) {
            _hashCode += getDisplayWidth().hashCode();
        }
        if (getDisplayHeight() != null) {
            _hashCode += getDisplayHeight().hashCode();
        }
        if (getHelp() != null) {
            _hashCode += getHelp().hashCode();
        }
        if (getLinkText() != null) {
            _hashCode += getLinkText().hashCode();
        }
        if (getIsMandatory() != null) {
            _hashCode += getIsMandatory().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getMinValue() != null) {
            _hashCode += getMinValue().hashCode();
        }
        if (getMaxValue() != null) {
            _hashCode += getMaxValue().hashCode();
        }
        if (getDefaultChecked() != null) {
            _hashCode += getDefaultChecked().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getIsFormula() != null) {
            _hashCode += getIsFormula().hashCode();
        }
        if (getDefaultSelection() != null) {
            _hashCode += getDefaultSelection().hashCode();
        }
        if (getDynamicDefault() != null) {
            _hashCode += getDynamicDefault().hashCode();
        }
        if (getSourceList() != null) {
            _hashCode += getSourceList().hashCode();
        }
        if (getSourceFrom() != null) {
            _hashCode += getSourceFrom().hashCode();
        }
        if (getSourceFilterBy() != null) {
            _hashCode += getSourceFilterBy().hashCode();
        }
        if (getCustomSegment() != null) {
            _hashCode += getCustomSegment().hashCode();
        }
        if (getColExpense() != null) {
            _hashCode += getColExpense().hashCode();
        }
        if (getColPurchase() != null) {
            _hashCode += getColPurchase().hashCode();
        }
        if (getColSale() != null) {
            _hashCode += getColSale().hashCode();
        }
        if (getColOpportunity() != null) {
            _hashCode += getColOpportunity().hashCode();
        }
        if (getColStore() != null) {
            _hashCode += getColStore().hashCode();
        }
        if (getColStoreHidden() != null) {
            _hashCode += getColStoreHidden().hashCode();
        }
        if (getColJournal() != null) {
            _hashCode += getColJournal().hashCode();
        }
        if (getColBuild() != null) {
            _hashCode += getColBuild().hashCode();
        }
        if (getColExpenseReport() != null) {
            _hashCode += getColExpenseReport().hashCode();
        }
        if (getColTime() != null) {
            _hashCode += getColTime().hashCode();
        }
        if (getColTransferOrder() != null) {
            _hashCode += getColTransferOrder().hashCode();
        }
        if (getColTimeGroup() != null) {
            _hashCode += getColTimeGroup().hashCode();
        }
        if (getColItemReceipt() != null) {
            _hashCode += getColItemReceipt().hashCode();
        }
        if (getColItemReceiptOrder() != null) {
            _hashCode += getColItemReceiptOrder().hashCode();
        }
        if (getColItemFulfillment() != null) {
            _hashCode += getColItemFulfillment().hashCode();
        }
        if (getColItemFulfillmentOrder() != null) {
            _hashCode += getColItemFulfillmentOrder().hashCode();
        }
        if (getColPrintFlag() != null) {
            _hashCode += getColPrintFlag().hashCode();
        }
        if (getColPickingTicket() != null) {
            _hashCode += getColPickingTicket().hashCode();
        }
        if (getColPackingSlip() != null) {
            _hashCode += getColPackingSlip().hashCode();
        }
        if (getColReturnForm() != null) {
            _hashCode += getColReturnForm().hashCode();
        }
        if (getColStoreWithGroups() != null) {
            _hashCode += getColStoreWithGroups().hashCode();
        }
        if (getColGroupOnInvoices() != null) {
            _hashCode += getColGroupOnInvoices().hashCode();
        }
        if (getColKitItem() != null) {
            _hashCode += getColKitItem().hashCode();
        }
        if (getFilterList() != null) {
            _hashCode += getFilterList().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getSearchLevel() != null) {
            _hashCode += getSearchLevel().hashCode();
        }
        if (getRoleAccessList() != null) {
            _hashCode += getRoleAccessList().hashCode();
        }
        if (getDeptAccessList() != null) {
            _hashCode += getDeptAccessList().hashCode();
        }
        if (getSubAccessList() != null) {
            _hashCode += getSubAccessList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionColumnCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "TransactionColumnCustomField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectRecordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "selectRecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "storeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "insertBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToSso");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "availableToSso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "displayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationDisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "displayWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "displayHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("help");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "help"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "linkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "isMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "minValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "maxValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "defaultChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "isFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "defaultSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "dynamicDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationDynamicDefault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "sourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "sourceFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFilterBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "sourceFilterBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "customSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colExpense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colExpense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colPurchase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colPurchase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colSale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colSale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colStoreHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colStoreHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colJournal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colJournal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colExpenseReport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colExpenseReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colTransferOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colTransferOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colTimeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colTimeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colItemReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colItemReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colItemReceiptOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colItemReceiptOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colItemFulfillment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colItemFulfillment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colItemFulfillmentOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colItemFulfillmentOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colPrintFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colPrintFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colPickingTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colPickingTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colPackingSlip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colPackingSlip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colReturnForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colReturnForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colStoreWithGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colStoreWithGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colGroupOnInvoices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colGroupOnInvoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colKitItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "colKitItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "filterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilterList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "searchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "roleAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomFieldRoleAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "deptAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "subAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomFieldSubAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomFieldTranslationsList"));
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
