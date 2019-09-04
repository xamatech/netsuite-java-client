/**
 * ManufacturingRoutingSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ManufacturingRoutingSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoCalculateLag;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billOfMaterials;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lagAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField lagType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField lagUnits;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingCostTemplate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField operationName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField operationYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField sequence;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField setupTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public ManufacturingRoutingSearchBasic() {
    }

    public ManufacturingRoutingSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoCalculateLag,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billOfMaterials,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lagAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField lagType,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField lagUnits,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingCostTemplate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField operationName,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField operationYield,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runRate,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField sequence,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField setupTime,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.autoCalculateLag = autoCalculateLag;
        this.billOfMaterials = billOfMaterials;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
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
     * Gets the autoCalculateLag value for this ManufacturingRoutingSearchBasic.
     * 
     * @return autoCalculateLag
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this ManufacturingRoutingSearchBasic.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }


    /**
     * Gets the billOfMaterials value for this ManufacturingRoutingSearchBasic.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this ManufacturingRoutingSearchBasic.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }


    /**
     * Gets the externalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ManufacturingRoutingSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ManufacturingRoutingSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ManufacturingRoutingSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ManufacturingRoutingSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefault value for this ManufacturingRoutingSearchBasic.
     * 
     * @return isDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this ManufacturingRoutingSearchBasic.
     * 
     * @param isDefault
     */
    public void setIsDefault(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the isInactive value for this ManufacturingRoutingSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ManufacturingRoutingSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the item value for this ManufacturingRoutingSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this ManufacturingRoutingSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lagAmount value for this ManufacturingRoutingSearchBasic.
     * 
     * @return lagAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingRoutingSearchBasic.
     * 
     * @param lagAmount
     */
    public void setLagAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lagAmount) {
        this.lagAmount = lagAmount;
    }


    /**
     * Gets the lagType value for this ManufacturingRoutingSearchBasic.
     * 
     * @return lagType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingRoutingSearchBasic.
     * 
     * @param lagType
     */
    public void setLagType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField lagType) {
        this.lagType = lagType;
    }


    /**
     * Gets the lagUnits value for this ManufacturingRoutingSearchBasic.
     * 
     * @return lagUnits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingRoutingSearchBasic.
     * 
     * @param lagUnits
     */
    public void setLagUnits(com.netsuite.webservices.platform.core_2019_1.SearchStringField lagUnits) {
        this.lagUnits = lagUnits;
    }


    /**
     * Gets the location value for this ManufacturingRoutingSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ManufacturingRoutingSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the manufacturingCostTemplate value for this ManufacturingRoutingSearchBasic.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingRoutingSearchBasic.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingRoutingSearchBasic.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingRoutingSearchBasic.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }


    /**
     * Gets the memo value for this ManufacturingRoutingSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ManufacturingRoutingSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the name value for this ManufacturingRoutingSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this ManufacturingRoutingSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the operationName value for this ManufacturingRoutingSearchBasic.
     * 
     * @return operationName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this ManufacturingRoutingSearchBasic.
     * 
     * @param operationName
     */
    public void setOperationName(com.netsuite.webservices.platform.core_2019_1.SearchStringField operationName) {
        this.operationName = operationName;
    }


    /**
     * Gets the operationYield value for this ManufacturingRoutingSearchBasic.
     * 
     * @return operationYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOperationYield() {
        return operationYield;
    }


    /**
     * Sets the operationYield value for this ManufacturingRoutingSearchBasic.
     * 
     * @param operationYield
     */
    public void setOperationYield(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField operationYield) {
        this.operationYield = operationYield;
    }


    /**
     * Gets the runRate value for this ManufacturingRoutingSearchBasic.
     * 
     * @return runRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingRoutingSearchBasic.
     * 
     * @param runRate
     */
    public void setRunRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField runRate) {
        this.runRate = runRate;
    }


    /**
     * Gets the sequence value for this ManufacturingRoutingSearchBasic.
     * 
     * @return sequence
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ManufacturingRoutingSearchBasic.
     * 
     * @param sequence
     */
    public void setSequence(com.netsuite.webservices.platform.core_2019_1.SearchLongField sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the setupTime value for this ManufacturingRoutingSearchBasic.
     * 
     * @return setupTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingRoutingSearchBasic.
     * 
     * @param setupTime
     */
    public void setSetupTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField setupTime) {
        this.setupTime = setupTime;
    }


    /**
     * Gets the subsidiary value for this ManufacturingRoutingSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ManufacturingRoutingSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the customFieldList value for this ManufacturingRoutingSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ManufacturingRoutingSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingSearchBasic)) return false;
        ManufacturingRoutingSearchBasic other = (ManufacturingRoutingSearchBasic) obj;
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
              this.autoCalculateLag.equals(other.getAutoCalculateLag()))) &&
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              this.billOfMaterials.equals(other.getBillOfMaterials()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lagAmount==null && other.getLagAmount()==null) || 
             (this.lagAmount!=null &&
              this.lagAmount.equals(other.getLagAmount()))) &&
            ((this.lagType==null && other.getLagType()==null) || 
             (this.lagType!=null &&
              this.lagType.equals(other.getLagType()))) &&
            ((this.lagUnits==null && other.getLagUnits()==null) || 
             (this.lagUnits!=null &&
              this.lagUnits.equals(other.getLagUnits()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate()))) &&
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.operationName==null && other.getOperationName()==null) || 
             (this.operationName!=null &&
              this.operationName.equals(other.getOperationName()))) &&
            ((this.operationYield==null && other.getOperationYield()==null) || 
             (this.operationYield!=null &&
              this.operationYield.equals(other.getOperationYield()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              this.runRate.equals(other.getRunRate()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              this.setupTime.equals(other.getSetupTime()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
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
            _hashCode += getAutoCalculateLag().hashCode();
        }
        if (getBillOfMaterials() != null) {
            _hashCode += getBillOfMaterials().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLagAmount() != null) {
            _hashCode += getLagAmount().hashCode();
        }
        if (getLagType() != null) {
            _hashCode += getLagType().hashCode();
        }
        if (getLagUnits() != null) {
            _hashCode += getLagUnits().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getManufacturingCostTemplate() != null) {
            _hashCode += getManufacturingCostTemplate().hashCode();
        }
        if (getManufacturingWorkCenter() != null) {
            _hashCode += getManufacturingWorkCenter().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOperationName() != null) {
            _hashCode += getOperationName().hashCode();
        }
        if (getOperationYield() != null) {
            _hashCode += getOperationYield().hashCode();
        }
        if (getRunRate() != null) {
            _hashCode += getRunRate().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getSetupTime() != null) {
            _hashCode += getSetupTime().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefault"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "operationYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
