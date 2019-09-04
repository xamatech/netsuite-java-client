/**
 * FairValuePriceSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class FairValuePriceSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fairValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fairValueFormula;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fairValueRangePolicy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] highValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] highValuePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isVsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemRevenueCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lowValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lowValuePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unitsType;

    public FairValuePriceSearchRowBasic() {
    }

    public FairValuePriceSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fairValue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fairValueFormula,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fairValueRangePolicy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] highValue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] highValuePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isVsoePrice,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemRevenueCategory,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lowValue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lowValuePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] units,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] unitsType) {
        this.currency = currency;
        this.endDate = endDate;
        this.externalId = externalId;
        this.fairValue = fairValue;
        this.fairValueFormula = fairValueFormula;
        this.fairValueRangePolicy = fairValueRangePolicy;
        this.highValue = highValue;
        this.highValuePercent = highValuePercent;
        this.internalId = internalId;
        this.isVsoePrice = isVsoePrice;
        this.item = item;
        this.itemRevenueCategory = itemRevenueCategory;
        this.lowValue = lowValue;
        this.lowValuePercent = lowValuePercent;
        this.startDate = startDate;
        this.units = units;
        this.unitsType = unitsType;
    }


    /**
     * Gets the currency value for this FairValuePriceSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this FairValuePriceSearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the endDate value for this FairValuePriceSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FairValuePriceSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the externalId value for this FairValuePriceSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FairValuePriceSearchRowBasic.
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
     * Gets the fairValue value for this FairValuePriceSearchRowBasic.
     * 
     * @return fairValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFairValue() {
        return fairValue;
    }


    /**
     * Sets the fairValue value for this FairValuePriceSearchRowBasic.
     * 
     * @param fairValue
     */
    public void setFairValue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fairValue) {
        this.fairValue = fairValue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFairValue(int i) {
        return this.fairValue[i];
    }

    public void setFairValue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fairValue[i] = _value;
    }


    /**
     * Gets the fairValueFormula value for this FairValuePriceSearchRowBasic.
     * 
     * @return fairValueFormula
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getFairValueFormula() {
        return fairValueFormula;
    }


    /**
     * Sets the fairValueFormula value for this FairValuePriceSearchRowBasic.
     * 
     * @param fairValueFormula
     */
    public void setFairValueFormula(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fairValueFormula) {
        this.fairValueFormula = fairValueFormula;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getFairValueFormula(int i) {
        return this.fairValueFormula[i];
    }

    public void setFairValueFormula(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.fairValueFormula[i] = _value;
    }


    /**
     * Gets the fairValueRangePolicy value for this FairValuePriceSearchRowBasic.
     * 
     * @return fairValueRangePolicy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getFairValueRangePolicy() {
        return fairValueRangePolicy;
    }


    /**
     * Sets the fairValueRangePolicy value for this FairValuePriceSearchRowBasic.
     * 
     * @param fairValueRangePolicy
     */
    public void setFairValueRangePolicy(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fairValueRangePolicy) {
        this.fairValueRangePolicy = fairValueRangePolicy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getFairValueRangePolicy(int i) {
        return this.fairValueRangePolicy[i];
    }

    public void setFairValueRangePolicy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.fairValueRangePolicy[i] = _value;
    }


    /**
     * Gets the highValue value for this FairValuePriceSearchRowBasic.
     * 
     * @return highValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getHighValue() {
        return highValue;
    }


    /**
     * Sets the highValue value for this FairValuePriceSearchRowBasic.
     * 
     * @param highValue
     */
    public void setHighValue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] highValue) {
        this.highValue = highValue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getHighValue(int i) {
        return this.highValue[i];
    }

    public void setHighValue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.highValue[i] = _value;
    }


    /**
     * Gets the highValuePercent value for this FairValuePriceSearchRowBasic.
     * 
     * @return highValuePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getHighValuePercent() {
        return highValuePercent;
    }


    /**
     * Sets the highValuePercent value for this FairValuePriceSearchRowBasic.
     * 
     * @param highValuePercent
     */
    public void setHighValuePercent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] highValuePercent) {
        this.highValuePercent = highValuePercent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getHighValuePercent(int i) {
        return this.highValuePercent[i];
    }

    public void setHighValuePercent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.highValuePercent[i] = _value;
    }


    /**
     * Gets the internalId value for this FairValuePriceSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this FairValuePriceSearchRowBasic.
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
     * Gets the isVsoePrice value for this FairValuePriceSearchRowBasic.
     * 
     * @return isVsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsVsoePrice() {
        return isVsoePrice;
    }


    /**
     * Sets the isVsoePrice value for this FairValuePriceSearchRowBasic.
     * 
     * @param isVsoePrice
     */
    public void setIsVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isVsoePrice) {
        this.isVsoePrice = isVsoePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsVsoePrice(int i) {
        return this.isVsoePrice[i];
    }

    public void setIsVsoePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isVsoePrice[i] = _value;
    }


    /**
     * Gets the item value for this FairValuePriceSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this FairValuePriceSearchRowBasic.
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
     * Gets the itemRevenueCategory value for this FairValuePriceSearchRowBasic.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this FairValuePriceSearchRowBasic.
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
     * Gets the lowValue value for this FairValuePriceSearchRowBasic.
     * 
     * @return lowValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLowValue() {
        return lowValue;
    }


    /**
     * Sets the lowValue value for this FairValuePriceSearchRowBasic.
     * 
     * @param lowValue
     */
    public void setLowValue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lowValue) {
        this.lowValue = lowValue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLowValue(int i) {
        return this.lowValue[i];
    }

    public void setLowValue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.lowValue[i] = _value;
    }


    /**
     * Gets the lowValuePercent value for this FairValuePriceSearchRowBasic.
     * 
     * @return lowValuePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLowValuePercent() {
        return lowValuePercent;
    }


    /**
     * Sets the lowValuePercent value for this FairValuePriceSearchRowBasic.
     * 
     * @param lowValuePercent
     */
    public void setLowValuePercent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] lowValuePercent) {
        this.lowValuePercent = lowValuePercent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLowValuePercent(int i) {
        return this.lowValuePercent[i];
    }

    public void setLowValuePercent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.lowValuePercent[i] = _value;
    }


    /**
     * Gets the startDate value for this FairValuePriceSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FairValuePriceSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the units value for this FairValuePriceSearchRowBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnits() {
        return units;
    }


    /**
     * Sets the units value for this FairValuePriceSearchRowBasic.
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
     * Gets the unitsType value for this FairValuePriceSearchRowBasic.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this FairValuePriceSearchRowBasic.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FairValuePriceSearchRowBasic)) return false;
        FairValuePriceSearchRowBasic other = (FairValuePriceSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fairValue==null && other.getFairValue()==null) || 
             (this.fairValue!=null &&
              java.util.Arrays.equals(this.fairValue, other.getFairValue()))) &&
            ((this.fairValueFormula==null && other.getFairValueFormula()==null) || 
             (this.fairValueFormula!=null &&
              java.util.Arrays.equals(this.fairValueFormula, other.getFairValueFormula()))) &&
            ((this.fairValueRangePolicy==null && other.getFairValueRangePolicy()==null) || 
             (this.fairValueRangePolicy!=null &&
              java.util.Arrays.equals(this.fairValueRangePolicy, other.getFairValueRangePolicy()))) &&
            ((this.highValue==null && other.getHighValue()==null) || 
             (this.highValue!=null &&
              java.util.Arrays.equals(this.highValue, other.getHighValue()))) &&
            ((this.highValuePercent==null && other.getHighValuePercent()==null) || 
             (this.highValuePercent!=null &&
              java.util.Arrays.equals(this.highValuePercent, other.getHighValuePercent()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isVsoePrice==null && other.getIsVsoePrice()==null) || 
             (this.isVsoePrice!=null &&
              java.util.Arrays.equals(this.isVsoePrice, other.getIsVsoePrice()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.itemRevenueCategory==null && other.getItemRevenueCategory()==null) || 
             (this.itemRevenueCategory!=null &&
              java.util.Arrays.equals(this.itemRevenueCategory, other.getItemRevenueCategory()))) &&
            ((this.lowValue==null && other.getLowValue()==null) || 
             (this.lowValue!=null &&
              java.util.Arrays.equals(this.lowValue, other.getLowValue()))) &&
            ((this.lowValuePercent==null && other.getLowValuePercent()==null) || 
             (this.lowValuePercent!=null &&
              java.util.Arrays.equals(this.lowValuePercent, other.getLowValuePercent()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              java.util.Arrays.equals(this.units, other.getUnits()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              java.util.Arrays.equals(this.unitsType, other.getUnitsType())));
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
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
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
        if (getFairValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFairValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFairValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFairValueFormula() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFairValueFormula());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFairValueFormula(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFairValueRangePolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFairValueRangePolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFairValueRangePolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHighValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHighValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHighValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHighValuePercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHighValuePercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHighValuePercent(), i);
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
        if (getIsVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsVsoePrice(), i);
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
        if (getLowValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLowValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLowValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLowValuePercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLowValuePercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLowValuePercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FairValuePriceSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FairValuePriceSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
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
        elemField.setFieldName("fairValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fairValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairValueFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fairValueFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairValueRangePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fairValueRangePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "highValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValuePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "highValuePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("isVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isVsoePrice"));
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
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lowValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValuePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lowValuePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
