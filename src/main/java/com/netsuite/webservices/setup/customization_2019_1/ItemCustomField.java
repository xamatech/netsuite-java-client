/**
 * ItemCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class ItemCustomField  extends com.netsuite.webservices.setup.customization_2019_1.CustomFieldType  implements java.io.Serializable {
    private java.lang.String label;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef owner;

    private java.lang.Boolean itemMatrix;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef selectRecordType;

    private java.lang.Boolean storeValue;

    private java.lang.Boolean showInList;

    private java.lang.Boolean globalSearch;

    private java.lang.Boolean isParent;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subtab;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType displayType;

    private java.lang.Long displayWidth;

    private java.lang.Long displayHeight;

    private java.lang.String help;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parentSubtab;

    private java.lang.String linkText;

    private java.lang.Boolean isMandatory;

    private java.lang.Boolean checkSpelling;

    private java.lang.Long maxLength;

    private java.lang.Double minValue;

    private java.lang.Double maxValue;

    private java.lang.Boolean defaultChecked;

    private java.lang.String defaultValue;

    private java.lang.Boolean isFormula;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault dynamicDefault;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef searchDefault;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef searchCompareField;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFrom;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFilterBy;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customSegment;

    private java.lang.Boolean appliesToInventory;

    private java.lang.Boolean appliesToNonInventory;

    private java.lang.Boolean appliesToService;

    private java.lang.Boolean appliesToOtherCharge;

    private java.lang.Boolean appliesToGroup;

    private java.lang.Boolean appliesToKit;

    private java.lang.Boolean appliesToItemAssembly;

    private java.lang.Boolean availableToSso;

    private com.netsuite.webservices.setup.customization_2019_1.types.ItemCustomFieldItemSubType itemSubType;

    private com.netsuite.webservices.setup.customization_2019_1.ItemCustomFieldFilterList filterList;

    private java.lang.Boolean appliesToPriceList;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList roleAccessList;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList deptAccessList;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList subAccessList;

    private com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList translationsList;

    private java.lang.String internalId;  // attribute

    public ItemCustomField() {
    }

    public ItemCustomField(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType,
           java.lang.String scriptId,
           java.lang.String internalId,
           java.lang.String label,
           com.netsuite.webservices.platform.core_2019_1.RecordRef owner,
           java.lang.Boolean itemMatrix,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef selectRecordType,
           java.lang.Boolean storeValue,
           java.lang.Boolean showInList,
           java.lang.Boolean globalSearch,
           java.lang.Boolean isParent,
           com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subtab,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType displayType,
           java.lang.Long displayWidth,
           java.lang.Long displayHeight,
           java.lang.String help,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parentSubtab,
           java.lang.String linkText,
           java.lang.Boolean isMandatory,
           java.lang.Boolean checkSpelling,
           java.lang.Long maxLength,
           java.lang.Double minValue,
           java.lang.Double maxValue,
           java.lang.Boolean defaultChecked,
           java.lang.String defaultValue,
           java.lang.Boolean isFormula,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault dynamicDefault,
           com.netsuite.webservices.platform.core_2019_1.RecordRef searchDefault,
           com.netsuite.webservices.platform.core_2019_1.RecordRef searchCompareField,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFrom,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFilterBy,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customSegment,
           java.lang.Boolean appliesToInventory,
           java.lang.Boolean appliesToNonInventory,
           java.lang.Boolean appliesToService,
           java.lang.Boolean appliesToOtherCharge,
           java.lang.Boolean appliesToGroup,
           java.lang.Boolean appliesToKit,
           java.lang.Boolean appliesToItemAssembly,
           java.lang.Boolean availableToSso,
           com.netsuite.webservices.setup.customization_2019_1.types.ItemCustomFieldItemSubType itemSubType,
           com.netsuite.webservices.setup.customization_2019_1.ItemCustomFieldFilterList filterList,
           java.lang.Boolean appliesToPriceList,
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
        this.itemMatrix = itemMatrix;
        this.description = description;
        this.selectRecordType = selectRecordType;
        this.storeValue = storeValue;
        this.showInList = showInList;
        this.globalSearch = globalSearch;
        this.isParent = isParent;
        this.insertBefore = insertBefore;
        this.subtab = subtab;
        this.displayType = displayType;
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        this.help = help;
        this.parentSubtab = parentSubtab;
        this.linkText = linkText;
        this.isMandatory = isMandatory;
        this.checkSpelling = checkSpelling;
        this.maxLength = maxLength;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.defaultChecked = defaultChecked;
        this.defaultValue = defaultValue;
        this.isFormula = isFormula;
        this.defaultSelection = defaultSelection;
        this.dynamicDefault = dynamicDefault;
        this.searchDefault = searchDefault;
        this.searchCompareField = searchCompareField;
        this.sourceList = sourceList;
        this.sourceFrom = sourceFrom;
        this.sourceFilterBy = sourceFilterBy;
        this.customSegment = customSegment;
        this.appliesToInventory = appliesToInventory;
        this.appliesToNonInventory = appliesToNonInventory;
        this.appliesToService = appliesToService;
        this.appliesToOtherCharge = appliesToOtherCharge;
        this.appliesToGroup = appliesToGroup;
        this.appliesToKit = appliesToKit;
        this.appliesToItemAssembly = appliesToItemAssembly;
        this.availableToSso = availableToSso;
        this.itemSubType = itemSubType;
        this.filterList = filterList;
        this.appliesToPriceList = appliesToPriceList;
        this.accessLevel = accessLevel;
        this.searchLevel = searchLevel;
        this.roleAccessList = roleAccessList;
        this.deptAccessList = deptAccessList;
        this.subAccessList = subAccessList;
        this.translationsList = translationsList;
    }


    /**
     * Gets the label value for this ItemCustomField.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ItemCustomField.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the owner value for this ItemCustomField.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ItemCustomField.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the itemMatrix value for this ItemCustomField.
     * 
     * @return itemMatrix
     */
    public java.lang.Boolean getItemMatrix() {
        return itemMatrix;
    }


    /**
     * Sets the itemMatrix value for this ItemCustomField.
     * 
     * @param itemMatrix
     */
    public void setItemMatrix(java.lang.Boolean itemMatrix) {
        this.itemMatrix = itemMatrix;
    }


    /**
     * Gets the description value for this ItemCustomField.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ItemCustomField.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the selectRecordType value for this ItemCustomField.
     * 
     * @return selectRecordType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSelectRecordType() {
        return selectRecordType;
    }


    /**
     * Sets the selectRecordType value for this ItemCustomField.
     * 
     * @param selectRecordType
     */
    public void setSelectRecordType(com.netsuite.webservices.platform.core_2019_1.RecordRef selectRecordType) {
        this.selectRecordType = selectRecordType;
    }


    /**
     * Gets the storeValue value for this ItemCustomField.
     * 
     * @return storeValue
     */
    public java.lang.Boolean getStoreValue() {
        return storeValue;
    }


    /**
     * Sets the storeValue value for this ItemCustomField.
     * 
     * @param storeValue
     */
    public void setStoreValue(java.lang.Boolean storeValue) {
        this.storeValue = storeValue;
    }


    /**
     * Gets the showInList value for this ItemCustomField.
     * 
     * @return showInList
     */
    public java.lang.Boolean getShowInList() {
        return showInList;
    }


    /**
     * Sets the showInList value for this ItemCustomField.
     * 
     * @param showInList
     */
    public void setShowInList(java.lang.Boolean showInList) {
        this.showInList = showInList;
    }


    /**
     * Gets the globalSearch value for this ItemCustomField.
     * 
     * @return globalSearch
     */
    public java.lang.Boolean getGlobalSearch() {
        return globalSearch;
    }


    /**
     * Sets the globalSearch value for this ItemCustomField.
     * 
     * @param globalSearch
     */
    public void setGlobalSearch(java.lang.Boolean globalSearch) {
        this.globalSearch = globalSearch;
    }


    /**
     * Gets the isParent value for this ItemCustomField.
     * 
     * @return isParent
     */
    public java.lang.Boolean getIsParent() {
        return isParent;
    }


    /**
     * Sets the isParent value for this ItemCustomField.
     * 
     * @param isParent
     */
    public void setIsParent(java.lang.Boolean isParent) {
        this.isParent = isParent;
    }


    /**
     * Gets the insertBefore value for this ItemCustomField.
     * 
     * @return insertBefore
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInsertBefore() {
        return insertBefore;
    }


    /**
     * Sets the insertBefore value for this ItemCustomField.
     * 
     * @param insertBefore
     */
    public void setInsertBefore(com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore) {
        this.insertBefore = insertBefore;
    }


    /**
     * Gets the subtab value for this ItemCustomField.
     * 
     * @return subtab
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubtab() {
        return subtab;
    }


    /**
     * Sets the subtab value for this ItemCustomField.
     * 
     * @param subtab
     */
    public void setSubtab(com.netsuite.webservices.platform.core_2019_1.RecordRef subtab) {
        this.subtab = subtab;
    }


    /**
     * Gets the displayType value for this ItemCustomField.
     * 
     * @return displayType
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this ItemCustomField.
     * 
     * @param displayType
     */
    public void setDisplayType(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDisplayType displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the displayWidth value for this ItemCustomField.
     * 
     * @return displayWidth
     */
    public java.lang.Long getDisplayWidth() {
        return displayWidth;
    }


    /**
     * Sets the displayWidth value for this ItemCustomField.
     * 
     * @param displayWidth
     */
    public void setDisplayWidth(java.lang.Long displayWidth) {
        this.displayWidth = displayWidth;
    }


    /**
     * Gets the displayHeight value for this ItemCustomField.
     * 
     * @return displayHeight
     */
    public java.lang.Long getDisplayHeight() {
        return displayHeight;
    }


    /**
     * Sets the displayHeight value for this ItemCustomField.
     * 
     * @param displayHeight
     */
    public void setDisplayHeight(java.lang.Long displayHeight) {
        this.displayHeight = displayHeight;
    }


    /**
     * Gets the help value for this ItemCustomField.
     * 
     * @return help
     */
    public java.lang.String getHelp() {
        return help;
    }


    /**
     * Sets the help value for this ItemCustomField.
     * 
     * @param help
     */
    public void setHelp(java.lang.String help) {
        this.help = help;
    }


    /**
     * Gets the parentSubtab value for this ItemCustomField.
     * 
     * @return parentSubtab
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParentSubtab() {
        return parentSubtab;
    }


    /**
     * Sets the parentSubtab value for this ItemCustomField.
     * 
     * @param parentSubtab
     */
    public void setParentSubtab(com.netsuite.webservices.platform.core_2019_1.RecordRef parentSubtab) {
        this.parentSubtab = parentSubtab;
    }


    /**
     * Gets the linkText value for this ItemCustomField.
     * 
     * @return linkText
     */
    public java.lang.String getLinkText() {
        return linkText;
    }


    /**
     * Sets the linkText value for this ItemCustomField.
     * 
     * @param linkText
     */
    public void setLinkText(java.lang.String linkText) {
        this.linkText = linkText;
    }


    /**
     * Gets the isMandatory value for this ItemCustomField.
     * 
     * @return isMandatory
     */
    public java.lang.Boolean getIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this ItemCustomField.
     * 
     * @param isMandatory
     */
    public void setIsMandatory(java.lang.Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the checkSpelling value for this ItemCustomField.
     * 
     * @return checkSpelling
     */
    public java.lang.Boolean getCheckSpelling() {
        return checkSpelling;
    }


    /**
     * Sets the checkSpelling value for this ItemCustomField.
     * 
     * @param checkSpelling
     */
    public void setCheckSpelling(java.lang.Boolean checkSpelling) {
        this.checkSpelling = checkSpelling;
    }


    /**
     * Gets the maxLength value for this ItemCustomField.
     * 
     * @return maxLength
     */
    public java.lang.Long getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this ItemCustomField.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Long maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minValue value for this ItemCustomField.
     * 
     * @return minValue
     */
    public java.lang.Double getMinValue() {
        return minValue;
    }


    /**
     * Sets the minValue value for this ItemCustomField.
     * 
     * @param minValue
     */
    public void setMinValue(java.lang.Double minValue) {
        this.minValue = minValue;
    }


    /**
     * Gets the maxValue value for this ItemCustomField.
     * 
     * @return maxValue
     */
    public java.lang.Double getMaxValue() {
        return maxValue;
    }


    /**
     * Sets the maxValue value for this ItemCustomField.
     * 
     * @param maxValue
     */
    public void setMaxValue(java.lang.Double maxValue) {
        this.maxValue = maxValue;
    }


    /**
     * Gets the defaultChecked value for this ItemCustomField.
     * 
     * @return defaultChecked
     */
    public java.lang.Boolean getDefaultChecked() {
        return defaultChecked;
    }


    /**
     * Sets the defaultChecked value for this ItemCustomField.
     * 
     * @param defaultChecked
     */
    public void setDefaultChecked(java.lang.Boolean defaultChecked) {
        this.defaultChecked = defaultChecked;
    }


    /**
     * Gets the defaultValue value for this ItemCustomField.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this ItemCustomField.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the isFormula value for this ItemCustomField.
     * 
     * @return isFormula
     */
    public java.lang.Boolean getIsFormula() {
        return isFormula;
    }


    /**
     * Sets the isFormula value for this ItemCustomField.
     * 
     * @param isFormula
     */
    public void setIsFormula(java.lang.Boolean isFormula) {
        this.isFormula = isFormula;
    }


    /**
     * Gets the defaultSelection value for this ItemCustomField.
     * 
     * @return defaultSelection
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultSelection() {
        return defaultSelection;
    }


    /**
     * Sets the defaultSelection value for this ItemCustomField.
     * 
     * @param defaultSelection
     */
    public void setDefaultSelection(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection) {
        this.defaultSelection = defaultSelection;
    }


    /**
     * Gets the dynamicDefault value for this ItemCustomField.
     * 
     * @return dynamicDefault
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault getDynamicDefault() {
        return dynamicDefault;
    }


    /**
     * Sets the dynamicDefault value for this ItemCustomField.
     * 
     * @param dynamicDefault
     */
    public void setDynamicDefault(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationDynamicDefault dynamicDefault) {
        this.dynamicDefault = dynamicDefault;
    }


    /**
     * Gets the searchDefault value for this ItemCustomField.
     * 
     * @return searchDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSearchDefault() {
        return searchDefault;
    }


    /**
     * Sets the searchDefault value for this ItemCustomField.
     * 
     * @param searchDefault
     */
    public void setSearchDefault(com.netsuite.webservices.platform.core_2019_1.RecordRef searchDefault) {
        this.searchDefault = searchDefault;
    }


    /**
     * Gets the searchCompareField value for this ItemCustomField.
     * 
     * @return searchCompareField
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSearchCompareField() {
        return searchCompareField;
    }


    /**
     * Sets the searchCompareField value for this ItemCustomField.
     * 
     * @param searchCompareField
     */
    public void setSearchCompareField(com.netsuite.webservices.platform.core_2019_1.RecordRef searchCompareField) {
        this.searchCompareField = searchCompareField;
    }


    /**
     * Gets the sourceList value for this ItemCustomField.
     * 
     * @return sourceList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceList() {
        return sourceList;
    }


    /**
     * Sets the sourceList value for this ItemCustomField.
     * 
     * @param sourceList
     */
    public void setSourceList(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceList) {
        this.sourceList = sourceList;
    }


    /**
     * Gets the sourceFrom value for this ItemCustomField.
     * 
     * @return sourceFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceFrom() {
        return sourceFrom;
    }


    /**
     * Sets the sourceFrom value for this ItemCustomField.
     * 
     * @param sourceFrom
     */
    public void setSourceFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFrom) {
        this.sourceFrom = sourceFrom;
    }


    /**
     * Gets the sourceFilterBy value for this ItemCustomField.
     * 
     * @return sourceFilterBy
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceFilterBy() {
        return sourceFilterBy;
    }


    /**
     * Sets the sourceFilterBy value for this ItemCustomField.
     * 
     * @param sourceFilterBy
     */
    public void setSourceFilterBy(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceFilterBy) {
        this.sourceFilterBy = sourceFilterBy;
    }


    /**
     * Gets the customSegment value for this ItemCustomField.
     * 
     * @return customSegment
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomSegment() {
        return customSegment;
    }


    /**
     * Sets the customSegment value for this ItemCustomField.
     * 
     * @param customSegment
     */
    public void setCustomSegment(com.netsuite.webservices.platform.core_2019_1.RecordRef customSegment) {
        this.customSegment = customSegment;
    }


    /**
     * Gets the appliesToInventory value for this ItemCustomField.
     * 
     * @return appliesToInventory
     */
    public java.lang.Boolean getAppliesToInventory() {
        return appliesToInventory;
    }


    /**
     * Sets the appliesToInventory value for this ItemCustomField.
     * 
     * @param appliesToInventory
     */
    public void setAppliesToInventory(java.lang.Boolean appliesToInventory) {
        this.appliesToInventory = appliesToInventory;
    }


    /**
     * Gets the appliesToNonInventory value for this ItemCustomField.
     * 
     * @return appliesToNonInventory
     */
    public java.lang.Boolean getAppliesToNonInventory() {
        return appliesToNonInventory;
    }


    /**
     * Sets the appliesToNonInventory value for this ItemCustomField.
     * 
     * @param appliesToNonInventory
     */
    public void setAppliesToNonInventory(java.lang.Boolean appliesToNonInventory) {
        this.appliesToNonInventory = appliesToNonInventory;
    }


    /**
     * Gets the appliesToService value for this ItemCustomField.
     * 
     * @return appliesToService
     */
    public java.lang.Boolean getAppliesToService() {
        return appliesToService;
    }


    /**
     * Sets the appliesToService value for this ItemCustomField.
     * 
     * @param appliesToService
     */
    public void setAppliesToService(java.lang.Boolean appliesToService) {
        this.appliesToService = appliesToService;
    }


    /**
     * Gets the appliesToOtherCharge value for this ItemCustomField.
     * 
     * @return appliesToOtherCharge
     */
    public java.lang.Boolean getAppliesToOtherCharge() {
        return appliesToOtherCharge;
    }


    /**
     * Sets the appliesToOtherCharge value for this ItemCustomField.
     * 
     * @param appliesToOtherCharge
     */
    public void setAppliesToOtherCharge(java.lang.Boolean appliesToOtherCharge) {
        this.appliesToOtherCharge = appliesToOtherCharge;
    }


    /**
     * Gets the appliesToGroup value for this ItemCustomField.
     * 
     * @return appliesToGroup
     */
    public java.lang.Boolean getAppliesToGroup() {
        return appliesToGroup;
    }


    /**
     * Sets the appliesToGroup value for this ItemCustomField.
     * 
     * @param appliesToGroup
     */
    public void setAppliesToGroup(java.lang.Boolean appliesToGroup) {
        this.appliesToGroup = appliesToGroup;
    }


    /**
     * Gets the appliesToKit value for this ItemCustomField.
     * 
     * @return appliesToKit
     */
    public java.lang.Boolean getAppliesToKit() {
        return appliesToKit;
    }


    /**
     * Sets the appliesToKit value for this ItemCustomField.
     * 
     * @param appliesToKit
     */
    public void setAppliesToKit(java.lang.Boolean appliesToKit) {
        this.appliesToKit = appliesToKit;
    }


    /**
     * Gets the appliesToItemAssembly value for this ItemCustomField.
     * 
     * @return appliesToItemAssembly
     */
    public java.lang.Boolean getAppliesToItemAssembly() {
        return appliesToItemAssembly;
    }


    /**
     * Sets the appliesToItemAssembly value for this ItemCustomField.
     * 
     * @param appliesToItemAssembly
     */
    public void setAppliesToItemAssembly(java.lang.Boolean appliesToItemAssembly) {
        this.appliesToItemAssembly = appliesToItemAssembly;
    }


    /**
     * Gets the availableToSso value for this ItemCustomField.
     * 
     * @return availableToSso
     */
    public java.lang.Boolean getAvailableToSso() {
        return availableToSso;
    }


    /**
     * Sets the availableToSso value for this ItemCustomField.
     * 
     * @param availableToSso
     */
    public void setAvailableToSso(java.lang.Boolean availableToSso) {
        this.availableToSso = availableToSso;
    }


    /**
     * Gets the itemSubType value for this ItemCustomField.
     * 
     * @return itemSubType
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.ItemCustomFieldItemSubType getItemSubType() {
        return itemSubType;
    }


    /**
     * Sets the itemSubType value for this ItemCustomField.
     * 
     * @param itemSubType
     */
    public void setItemSubType(com.netsuite.webservices.setup.customization_2019_1.types.ItemCustomFieldItemSubType itemSubType) {
        this.itemSubType = itemSubType;
    }


    /**
     * Gets the filterList value for this ItemCustomField.
     * 
     * @return filterList
     */
    public com.netsuite.webservices.setup.customization_2019_1.ItemCustomFieldFilterList getFilterList() {
        return filterList;
    }


    /**
     * Sets the filterList value for this ItemCustomField.
     * 
     * @param filterList
     */
    public void setFilterList(com.netsuite.webservices.setup.customization_2019_1.ItemCustomFieldFilterList filterList) {
        this.filterList = filterList;
    }


    /**
     * Gets the appliesToPriceList value for this ItemCustomField.
     * 
     * @return appliesToPriceList
     */
    public java.lang.Boolean getAppliesToPriceList() {
        return appliesToPriceList;
    }


    /**
     * Sets the appliesToPriceList value for this ItemCustomField.
     * 
     * @param appliesToPriceList
     */
    public void setAppliesToPriceList(java.lang.Boolean appliesToPriceList) {
        this.appliesToPriceList = appliesToPriceList;
    }


    /**
     * Gets the accessLevel value for this ItemCustomField.
     * 
     * @return accessLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this ItemCustomField.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the searchLevel value for this ItemCustomField.
     * 
     * @return searchLevel
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }


    /**
     * Sets the searchLevel value for this ItemCustomField.
     * 
     * @param searchLevel
     */
    public void setSearchLevel(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }


    /**
     * Gets the roleAccessList value for this ItemCustomField.
     * 
     * @return roleAccessList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList getRoleAccessList() {
        return roleAccessList;
    }


    /**
     * Sets the roleAccessList value for this ItemCustomField.
     * 
     * @param roleAccessList
     */
    public void setRoleAccessList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldRoleAccessList roleAccessList) {
        this.roleAccessList = roleAccessList;
    }


    /**
     * Gets the deptAccessList value for this ItemCustomField.
     * 
     * @return deptAccessList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList getDeptAccessList() {
        return deptAccessList;
    }


    /**
     * Sets the deptAccessList value for this ItemCustomField.
     * 
     * @param deptAccessList
     */
    public void setDeptAccessList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldDepartmentAccessList deptAccessList) {
        this.deptAccessList = deptAccessList;
    }


    /**
     * Gets the subAccessList value for this ItemCustomField.
     * 
     * @return subAccessList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList getSubAccessList() {
        return subAccessList;
    }


    /**
     * Sets the subAccessList value for this ItemCustomField.
     * 
     * @param subAccessList
     */
    public void setSubAccessList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldSubAccessList subAccessList) {
        this.subAccessList = subAccessList;
    }


    /**
     * Gets the translationsList value for this ItemCustomField.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this ItemCustomField.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.setup.customization_2019_1.CustomFieldTranslationsList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the internalId value for this ItemCustomField.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemCustomField.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemCustomField)) return false;
        ItemCustomField other = (ItemCustomField) obj;
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
            ((this.itemMatrix==null && other.getItemMatrix()==null) || 
             (this.itemMatrix!=null &&
              this.itemMatrix.equals(other.getItemMatrix()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.selectRecordType==null && other.getSelectRecordType()==null) || 
             (this.selectRecordType!=null &&
              this.selectRecordType.equals(other.getSelectRecordType()))) &&
            ((this.storeValue==null && other.getStoreValue()==null) || 
             (this.storeValue!=null &&
              this.storeValue.equals(other.getStoreValue()))) &&
            ((this.showInList==null && other.getShowInList()==null) || 
             (this.showInList!=null &&
              this.showInList.equals(other.getShowInList()))) &&
            ((this.globalSearch==null && other.getGlobalSearch()==null) || 
             (this.globalSearch!=null &&
              this.globalSearch.equals(other.getGlobalSearch()))) &&
            ((this.isParent==null && other.getIsParent()==null) || 
             (this.isParent!=null &&
              this.isParent.equals(other.getIsParent()))) &&
            ((this.insertBefore==null && other.getInsertBefore()==null) || 
             (this.insertBefore!=null &&
              this.insertBefore.equals(other.getInsertBefore()))) &&
            ((this.subtab==null && other.getSubtab()==null) || 
             (this.subtab!=null &&
              this.subtab.equals(other.getSubtab()))) &&
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
            ((this.parentSubtab==null && other.getParentSubtab()==null) || 
             (this.parentSubtab!=null &&
              this.parentSubtab.equals(other.getParentSubtab()))) &&
            ((this.linkText==null && other.getLinkText()==null) || 
             (this.linkText!=null &&
              this.linkText.equals(other.getLinkText()))) &&
            ((this.isMandatory==null && other.getIsMandatory()==null) || 
             (this.isMandatory!=null &&
              this.isMandatory.equals(other.getIsMandatory()))) &&
            ((this.checkSpelling==null && other.getCheckSpelling()==null) || 
             (this.checkSpelling!=null &&
              this.checkSpelling.equals(other.getCheckSpelling()))) &&
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
            ((this.searchDefault==null && other.getSearchDefault()==null) || 
             (this.searchDefault!=null &&
              this.searchDefault.equals(other.getSearchDefault()))) &&
            ((this.searchCompareField==null && other.getSearchCompareField()==null) || 
             (this.searchCompareField!=null &&
              this.searchCompareField.equals(other.getSearchCompareField()))) &&
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
            ((this.appliesToInventory==null && other.getAppliesToInventory()==null) || 
             (this.appliesToInventory!=null &&
              this.appliesToInventory.equals(other.getAppliesToInventory()))) &&
            ((this.appliesToNonInventory==null && other.getAppliesToNonInventory()==null) || 
             (this.appliesToNonInventory!=null &&
              this.appliesToNonInventory.equals(other.getAppliesToNonInventory()))) &&
            ((this.appliesToService==null && other.getAppliesToService()==null) || 
             (this.appliesToService!=null &&
              this.appliesToService.equals(other.getAppliesToService()))) &&
            ((this.appliesToOtherCharge==null && other.getAppliesToOtherCharge()==null) || 
             (this.appliesToOtherCharge!=null &&
              this.appliesToOtherCharge.equals(other.getAppliesToOtherCharge()))) &&
            ((this.appliesToGroup==null && other.getAppliesToGroup()==null) || 
             (this.appliesToGroup!=null &&
              this.appliesToGroup.equals(other.getAppliesToGroup()))) &&
            ((this.appliesToKit==null && other.getAppliesToKit()==null) || 
             (this.appliesToKit!=null &&
              this.appliesToKit.equals(other.getAppliesToKit()))) &&
            ((this.appliesToItemAssembly==null && other.getAppliesToItemAssembly()==null) || 
             (this.appliesToItemAssembly!=null &&
              this.appliesToItemAssembly.equals(other.getAppliesToItemAssembly()))) &&
            ((this.availableToSso==null && other.getAvailableToSso()==null) || 
             (this.availableToSso!=null &&
              this.availableToSso.equals(other.getAvailableToSso()))) &&
            ((this.itemSubType==null && other.getItemSubType()==null) || 
             (this.itemSubType!=null &&
              this.itemSubType.equals(other.getItemSubType()))) &&
            ((this.filterList==null && other.getFilterList()==null) || 
             (this.filterList!=null &&
              this.filterList.equals(other.getFilterList()))) &&
            ((this.appliesToPriceList==null && other.getAppliesToPriceList()==null) || 
             (this.appliesToPriceList!=null &&
              this.appliesToPriceList.equals(other.getAppliesToPriceList()))) &&
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
        if (getItemMatrix() != null) {
            _hashCode += getItemMatrix().hashCode();
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
        if (getShowInList() != null) {
            _hashCode += getShowInList().hashCode();
        }
        if (getGlobalSearch() != null) {
            _hashCode += getGlobalSearch().hashCode();
        }
        if (getIsParent() != null) {
            _hashCode += getIsParent().hashCode();
        }
        if (getInsertBefore() != null) {
            _hashCode += getInsertBefore().hashCode();
        }
        if (getSubtab() != null) {
            _hashCode += getSubtab().hashCode();
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
        if (getParentSubtab() != null) {
            _hashCode += getParentSubtab().hashCode();
        }
        if (getLinkText() != null) {
            _hashCode += getLinkText().hashCode();
        }
        if (getIsMandatory() != null) {
            _hashCode += getIsMandatory().hashCode();
        }
        if (getCheckSpelling() != null) {
            _hashCode += getCheckSpelling().hashCode();
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
        if (getSearchDefault() != null) {
            _hashCode += getSearchDefault().hashCode();
        }
        if (getSearchCompareField() != null) {
            _hashCode += getSearchCompareField().hashCode();
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
        if (getAppliesToInventory() != null) {
            _hashCode += getAppliesToInventory().hashCode();
        }
        if (getAppliesToNonInventory() != null) {
            _hashCode += getAppliesToNonInventory().hashCode();
        }
        if (getAppliesToService() != null) {
            _hashCode += getAppliesToService().hashCode();
        }
        if (getAppliesToOtherCharge() != null) {
            _hashCode += getAppliesToOtherCharge().hashCode();
        }
        if (getAppliesToGroup() != null) {
            _hashCode += getAppliesToGroup().hashCode();
        }
        if (getAppliesToKit() != null) {
            _hashCode += getAppliesToKit().hashCode();
        }
        if (getAppliesToItemAssembly() != null) {
            _hashCode += getAppliesToItemAssembly().hashCode();
        }
        if (getAvailableToSso() != null) {
            _hashCode += getAvailableToSso().hashCode();
        }
        if (getItemSubType() != null) {
            _hashCode += getItemSubType().hashCode();
        }
        if (getFilterList() != null) {
            _hashCode += getFilterList().hashCode();
        }
        if (getAppliesToPriceList() != null) {
            _hashCode += getAppliesToPriceList().hashCode();
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
        new org.apache.axis.description.TypeDesc(ItemCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "ItemCustomField"));
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
        elemField.setFieldName("itemMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "itemMatrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("showInList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "showInList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "globalSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "isParent"));
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
        elemField.setFieldName("subtab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "subtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("parentSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "parentSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("checkSpelling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "checkSpelling"));
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
        elemField.setFieldName("searchDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "searchDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCompareField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "searchCompareField"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("appliesToInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToNonInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToNonInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToOtherCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToOtherCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToKit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToKit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToItemAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToItemAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("itemSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "itemSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "ItemCustomFieldItemSubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "filterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "ItemCustomFieldFilterList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesToPriceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "appliesToPriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
