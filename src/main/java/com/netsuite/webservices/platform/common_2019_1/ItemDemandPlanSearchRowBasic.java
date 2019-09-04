/**
 * ItemDemandPlanSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ItemDemandPlanSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] alternateSourceItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] analysisDuration;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] demandDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] projectionDuration;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] projectionInterval;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] projectionMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] projectionStartDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ItemDemandPlanSearchRowBasic() {
    }

    public ItemDemandPlanSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] alternateSourceItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] analysisDuration,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] demandDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] projectionDuration,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] projectionInterval,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] projectionMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] projectionStartDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.alternateSourceItem = alternateSourceItem;
        this.analysisDuration = analysisDuration;
        this.demandDate = demandDate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.memo = memo;
        this.projectionDuration = projectionDuration;
        this.projectionInterval = projectionInterval;
        this.projectionMethod = projectionMethod;
        this.projectionStartDate = projectionStartDate;
        this.quantity = quantity;
        this.quantityUom = quantityUom;
        this.subsidiary = subsidiary;
        this.units = units;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the alternateSourceItem value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return alternateSourceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAlternateSourceItem() {
        return alternateSourceItem;
    }


    /**
     * Sets the alternateSourceItem value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param alternateSourceItem
     */
    public void setAlternateSourceItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] alternateSourceItem) {
        this.alternateSourceItem = alternateSourceItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAlternateSourceItem(int i) {
        return this.alternateSourceItem[i];
    }

    public void setAlternateSourceItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.alternateSourceItem[i] = _value;
    }


    /**
     * Gets the analysisDuration value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return analysisDuration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getAnalysisDuration() {
        return analysisDuration;
    }


    /**
     * Sets the analysisDuration value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param analysisDuration
     */
    public void setAnalysisDuration(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] analysisDuration) {
        this.analysisDuration = analysisDuration;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getAnalysisDuration(int i) {
        return this.analysisDuration[i];
    }

    public void setAnalysisDuration(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.analysisDuration[i] = _value;
    }


    /**
     * Gets the demandDate value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return demandDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDemandDate() {
        return demandDate;
    }


    /**
     * Sets the demandDate value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param demandDate
     */
    public void setDemandDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] demandDate) {
        this.demandDate = demandDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDemandDate(int i) {
        return this.demandDate[i];
    }

    public void setDemandDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.demandDate[i] = _value;
    }


    /**
     * Gets the externalId value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemDemandPlanSearchRowBasic.
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
     * Gets the internalId value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemDemandPlanSearchRowBasic.
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
     * Gets the item value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemDemandPlanSearchRowBasic.
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
     * Gets the lastModifiedDate value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the location value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemDemandPlanSearchRowBasic.
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
     * Gets the memo value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ItemDemandPlanSearchRowBasic.
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
     * Gets the projectionDuration value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return projectionDuration
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getProjectionDuration() {
        return projectionDuration;
    }


    /**
     * Sets the projectionDuration value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param projectionDuration
     */
    public void setProjectionDuration(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] projectionDuration) {
        this.projectionDuration = projectionDuration;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getProjectionDuration(int i) {
        return this.projectionDuration[i];
    }

    public void setProjectionDuration(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.projectionDuration[i] = _value;
    }


    /**
     * Gets the projectionInterval value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return projectionInterval
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getProjectionInterval() {
        return projectionInterval;
    }


    /**
     * Sets the projectionInterval value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param projectionInterval
     */
    public void setProjectionInterval(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] projectionInterval) {
        this.projectionInterval = projectionInterval;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getProjectionInterval(int i) {
        return this.projectionInterval[i];
    }

    public void setProjectionInterval(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.projectionInterval[i] = _value;
    }


    /**
     * Gets the projectionMethod value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return projectionMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getProjectionMethod() {
        return projectionMethod;
    }


    /**
     * Sets the projectionMethod value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param projectionMethod
     */
    public void setProjectionMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] projectionMethod) {
        this.projectionMethod = projectionMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getProjectionMethod(int i) {
        return this.projectionMethod[i];
    }

    public void setProjectionMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.projectionMethod[i] = _value;
    }


    /**
     * Gets the projectionStartDate value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return projectionStartDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getProjectionStartDate() {
        return projectionStartDate;
    }


    /**
     * Sets the projectionStartDate value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param projectionStartDate
     */
    public void setProjectionStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] projectionStartDate) {
        this.projectionStartDate = projectionStartDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getProjectionStartDate(int i) {
        return this.projectionStartDate[i];
    }

    public void setProjectionStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.projectionStartDate[i] = _value;
    }


    /**
     * Gets the quantity value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }


    /**
     * Gets the quantityUom value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return quantityUom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityUom() {
        return quantityUom;
    }


    /**
     * Sets the quantityUom value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param quantityUom
     */
    public void setQuantityUom(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom) {
        this.quantityUom = quantityUom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityUom(int i) {
        return this.quantityUom[i];
    }

    public void setQuantityUom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityUom[i] = _value;
    }


    /**
     * Gets the subsidiary value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemDemandPlanSearchRowBasic.
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
     * Gets the units value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units) {
        this.units = units;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.units[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ItemDemandPlanSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemDemandPlanSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemDemandPlanSearchRowBasic)) return false;
        ItemDemandPlanSearchRowBasic other = (ItemDemandPlanSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alternateSourceItem==null && other.getAlternateSourceItem()==null) || 
             (this.alternateSourceItem!=null &&
              java.util.Arrays.equals(this.alternateSourceItem, other.getAlternateSourceItem()))) &&
            ((this.analysisDuration==null && other.getAnalysisDuration()==null) || 
             (this.analysisDuration!=null &&
              java.util.Arrays.equals(this.analysisDuration, other.getAnalysisDuration()))) &&
            ((this.demandDate==null && other.getDemandDate()==null) || 
             (this.demandDate!=null &&
              java.util.Arrays.equals(this.demandDate, other.getDemandDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.projectionDuration==null && other.getProjectionDuration()==null) || 
             (this.projectionDuration!=null &&
              java.util.Arrays.equals(this.projectionDuration, other.getProjectionDuration()))) &&
            ((this.projectionInterval==null && other.getProjectionInterval()==null) || 
             (this.projectionInterval!=null &&
              java.util.Arrays.equals(this.projectionInterval, other.getProjectionInterval()))) &&
            ((this.projectionMethod==null && other.getProjectionMethod()==null) || 
             (this.projectionMethod!=null &&
              java.util.Arrays.equals(this.projectionMethod, other.getProjectionMethod()))) &&
            ((this.projectionStartDate==null && other.getProjectionStartDate()==null) || 
             (this.projectionStartDate!=null &&
              java.util.Arrays.equals(this.projectionStartDate, other.getProjectionStartDate()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity()))) &&
            ((this.quantityUom==null && other.getQuantityUom()==null) || 
             (this.quantityUom!=null &&
              java.util.Arrays.equals(this.quantityUom, other.getQuantityUom()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              java.util.Arrays.equals(this.units, other.getUnits()))) &&
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
        if (getAlternateSourceItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateSourceItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateSourceItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnalysisDuration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnalysisDuration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnalysisDuration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDemandDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemandDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemandDate(), i);
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
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
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
        if (getProjectionDuration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectionDuration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectionDuration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectionInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectionInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectionInterval(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectionMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectionMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectionMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectionStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectionStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectionStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityUom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityUom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityUom(), i);
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
        if (getUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnits(), i);
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
        new org.apache.axis.description.TypeDesc(ItemDemandPlanSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemDemandPlanSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateSourceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "alternateSourceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analysisDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "analysisDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "demandDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectionDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectionDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectionInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectionInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectionMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectionMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectionStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectionStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityUom"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "units"));
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
