/**
 * ManufacturingRoutingSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ManufacturingRoutingSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoCalculateLag;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billOfMaterials;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lagAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] lagType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lagUnits;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingCostTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] operationName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] operationYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sequence;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] setupTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ManufacturingRoutingSearchRowBasic() {
    }

    public ManufacturingRoutingSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoCalculateLag,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billOfMaterials,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lagAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] lagType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lagUnits,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingCostTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] operationName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] operationYield,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sequence,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] setupTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.autoCalculateLag = autoCalculateLag;
        this.billOfMaterials = billOfMaterials;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.item = item;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.location = location;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.memo = memo;
        this.name = name;
        this.operationName = operationName;
        this.operationYield = operationYield;
        this.runRate = runRate;
        this.sequence = sequence;
        this.setupTime = setupTime;
        this.subsidiary = subsidiary;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the autoCalculateLag value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return autoCalculateLag
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAutoCalculateLag(int i) {
        return this.autoCalculateLag[i];
    }

    public void setAutoCalculateLag(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.autoCalculateLag[i] = _value;
    }


    /**
     * Gets the billOfMaterials value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillOfMaterials(int i) {
        return this.billOfMaterials[i];
    }

    public void setBillOfMaterials(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billOfMaterials[i] = _value;
    }


    /**
     * Gets the externalId value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the internalId value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the isDefault value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return isDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param isDefault
     */
    public void setIsDefault(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefault) {
        this.isDefault = isDefault;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsDefault(int i) {
        return this.isDefault[i];
    }

    public void setIsDefault(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isDefault[i] = _value;
    }


    /**
     * Gets the isInactive value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the item value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the lagAmount value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return lagAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param lagAmount
     */
    public void setLagAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lagAmount) {
        this.lagAmount = lagAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLagAmount(int i) {
        return this.lagAmount[i];
    }

    public void setLagAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.lagAmount[i] = _value;
    }


    /**
     * Gets the lagType value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return lagType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param lagType
     */
    public void setLagType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] lagType) {
        this.lagType = lagType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLagType(int i) {
        return this.lagType[i];
    }

    public void setLagType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.lagType[i] = _value;
    }


    /**
     * Gets the lagUnits value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return lagUnits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param lagUnits
     */
    public void setLagUnits(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lagUnits) {
        this.lagUnits = lagUnits;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLagUnits(int i) {
        return this.lagUnits[i];
    }

    public void setLagUnits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.lagUnits[i] = _value;
    }


    /**
     * Gets the location value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the manufacturingCostTemplate value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getManufacturingCostTemplate(int i) {
        return this.manufacturingCostTemplate[i];
    }

    public void setManufacturingCostTemplate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.manufacturingCostTemplate[i] = _value;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getManufacturingWorkCenter(int i) {
        return this.manufacturingWorkCenter[i];
    }

    public void setManufacturingWorkCenter(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.manufacturingWorkCenter[i] = _value;
    }


    /**
     * Gets the memo value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the name value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the operationName value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return operationName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param operationName
     */
    public void setOperationName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] operationName) {
        this.operationName = operationName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getOperationName(int i) {
        return this.operationName[i];
    }

    public void setOperationName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.operationName[i] = _value;
    }


    /**
     * Gets the operationYield value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return operationYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOperationYield() {
        return operationYield;
    }


    /**
     * Sets the operationYield value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param operationYield
     */
    public void setOperationYield(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] operationYield) {
        this.operationYield = operationYield;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOperationYield(int i) {
        return this.operationYield[i];
    }

    public void setOperationYield(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.operationYield[i] = _value;
    }


    /**
     * Gets the runRate value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return runRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param runRate
     */
    public void setRunRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] runRate) {
        this.runRate = runRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRunRate(int i) {
        return this.runRate[i];
    }

    public void setRunRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.runRate[i] = _value;
    }


    /**
     * Gets the sequence value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return sequence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param sequence
     */
    public void setSequence(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sequence) {
        this.sequence = sequence;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getSequence(int i) {
        return this.sequence[i];
    }

    public void setSequence(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.sequence[i] = _value;
    }


    /**
     * Gets the setupTime value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return setupTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param setupTime
     */
    public void setSetupTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] setupTime) {
        this.setupTime = setupTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSetupTime(int i) {
        return this.setupTime[i];
    }

    public void setSetupTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.setupTime[i] = _value;
    }


    /**
     * Gets the subsidiary value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ManufacturingRoutingSearchRowBasic.
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
     * Gets the customFieldList value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ManufacturingRoutingSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingSearchRowBasic)) return false;
        ManufacturingRoutingSearchRowBasic other = (ManufacturingRoutingSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoCalculateLag==null && other.getAutoCalculateLag()==null) || 
             (this.autoCalculateLag!=null &&
              java.util.Arrays.equals(this.autoCalculateLag, other.getAutoCalculateLag()))) &&
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              java.util.Arrays.equals(this.billOfMaterials, other.getBillOfMaterials()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              java.util.Arrays.equals(this.isDefault, other.getIsDefault()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lagAmount==null && other.getLagAmount()==null) || 
             (this.lagAmount!=null &&
              java.util.Arrays.equals(this.lagAmount, other.getLagAmount()))) &&
            ((this.lagType==null && other.getLagType()==null) || 
             (this.lagType!=null &&
              java.util.Arrays.equals(this.lagType, other.getLagType()))) &&
            ((this.lagUnits==null && other.getLagUnits()==null) || 
             (this.lagUnits!=null &&
              java.util.Arrays.equals(this.lagUnits, other.getLagUnits()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              java.util.Arrays.equals(this.manufacturingCostTemplate, other.getManufacturingCostTemplate()))) &&
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              java.util.Arrays.equals(this.manufacturingWorkCenter, other.getManufacturingWorkCenter()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.operationName==null && other.getOperationName()==null) || 
             (this.operationName!=null &&
              java.util.Arrays.equals(this.operationName, other.getOperationName()))) &&
            ((this.operationYield==null && other.getOperationYield()==null) || 
             (this.operationYield!=null &&
              java.util.Arrays.equals(this.operationYield, other.getOperationYield()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              java.util.Arrays.equals(this.runRate, other.getRunRate()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              java.util.Arrays.equals(this.sequence, other.getSequence()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              java.util.Arrays.equals(this.setupTime, other.getSetupTime()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
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
        if (getAutoCalculateLag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoCalculateLag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoCalculateLag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillOfMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillOfMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillOfMaterials(), i);
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
        if (getIsDefault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDefault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDefault(), i);
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
        if (getLagAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagUnits(), i);
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
        if (getManufacturingCostTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingCostTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingCostTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingWorkCenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingWorkCenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingWorkCenter(), i);
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationYield() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationYield());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationYield(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSequence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSequence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSequence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSetupTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSetupTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSetupTime(), i);
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billOfMaterials"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefault"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "operationYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
