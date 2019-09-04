/**
 * FairValuePrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class FairValuePrice  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory;

    private java.lang.Double fairValue;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fairValueFormula;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private com.netsuite.webservices.lists.accounting_2019_1.types.FairValuePriceFairValueRangePolicy fairValueRangePolicy;

    private java.lang.Double lowValue;

    private java.lang.Double lowValuePercent;

    private java.lang.Double highValue;

    private java.lang.Double highValuePercent;

    private java.lang.Boolean isVsoePrice;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private com.netsuite.webservices.platform.core_2019_1.DimensionList dimensionList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public FairValuePrice() {
    }

    public FairValuePrice(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory,
           java.lang.Double fairValue,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fairValueFormula,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           com.netsuite.webservices.lists.accounting_2019_1.types.FairValuePriceFairValueRangePolicy fairValueRangePolicy,
           java.lang.Double lowValue,
           java.lang.Double lowValuePercent,
           java.lang.Double highValue,
           java.lang.Double highValuePercent,
           java.lang.Boolean isVsoePrice,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList,
           com.netsuite.webservices.platform.core_2019_1.DimensionList dimensionList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.item = item;
        this.itemRevenueCategory = itemRevenueCategory;
        this.fairValue = fairValue;
        this.fairValueFormula = fairValueFormula;
        this.currency = currency;
        this.unitsType = unitsType;
        this.units = units;
        this.fairValueRangePolicy = fairValueRangePolicy;
        this.lowValue = lowValue;
        this.lowValuePercent = lowValuePercent;
        this.highValue = highValue;
        this.highValuePercent = highValuePercent;
        this.isVsoePrice = isVsoePrice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customFieldList = customFieldList;
        this.dimensionList = dimensionList;
    }


    /**
     * Gets the customForm value for this FairValuePrice.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this FairValuePrice.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the item value for this FairValuePrice.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this FairValuePrice.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the itemRevenueCategory value for this FairValuePrice.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this FairValuePrice.
     * 
     * @param itemRevenueCategory
     */
    public void setItemRevenueCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }


    /**
     * Gets the fairValue value for this FairValuePrice.
     * 
     * @return fairValue
     */
    public java.lang.Double getFairValue() {
        return fairValue;
    }


    /**
     * Sets the fairValue value for this FairValuePrice.
     * 
     * @param fairValue
     */
    public void setFairValue(java.lang.Double fairValue) {
        this.fairValue = fairValue;
    }


    /**
     * Gets the fairValueFormula value for this FairValuePrice.
     * 
     * @return fairValueFormula
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFairValueFormula() {
        return fairValueFormula;
    }


    /**
     * Sets the fairValueFormula value for this FairValuePrice.
     * 
     * @param fairValueFormula
     */
    public void setFairValueFormula(com.netsuite.webservices.platform.core_2019_1.RecordRef fairValueFormula) {
        this.fairValueFormula = fairValueFormula;
    }


    /**
     * Gets the currency value for this FairValuePrice.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this FairValuePrice.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the unitsType value for this FairValuePrice.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this FairValuePrice.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.RecordRef unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the units value for this FairValuePrice.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this FairValuePrice.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the fairValueRangePolicy value for this FairValuePrice.
     * 
     * @return fairValueRangePolicy
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.FairValuePriceFairValueRangePolicy getFairValueRangePolicy() {
        return fairValueRangePolicy;
    }


    /**
     * Sets the fairValueRangePolicy value for this FairValuePrice.
     * 
     * @param fairValueRangePolicy
     */
    public void setFairValueRangePolicy(com.netsuite.webservices.lists.accounting_2019_1.types.FairValuePriceFairValueRangePolicy fairValueRangePolicy) {
        this.fairValueRangePolicy = fairValueRangePolicy;
    }


    /**
     * Gets the lowValue value for this FairValuePrice.
     * 
     * @return lowValue
     */
    public java.lang.Double getLowValue() {
        return lowValue;
    }


    /**
     * Sets the lowValue value for this FairValuePrice.
     * 
     * @param lowValue
     */
    public void setLowValue(java.lang.Double lowValue) {
        this.lowValue = lowValue;
    }


    /**
     * Gets the lowValuePercent value for this FairValuePrice.
     * 
     * @return lowValuePercent
     */
    public java.lang.Double getLowValuePercent() {
        return lowValuePercent;
    }


    /**
     * Sets the lowValuePercent value for this FairValuePrice.
     * 
     * @param lowValuePercent
     */
    public void setLowValuePercent(java.lang.Double lowValuePercent) {
        this.lowValuePercent = lowValuePercent;
    }


    /**
     * Gets the highValue value for this FairValuePrice.
     * 
     * @return highValue
     */
    public java.lang.Double getHighValue() {
        return highValue;
    }


    /**
     * Sets the highValue value for this FairValuePrice.
     * 
     * @param highValue
     */
    public void setHighValue(java.lang.Double highValue) {
        this.highValue = highValue;
    }


    /**
     * Gets the highValuePercent value for this FairValuePrice.
     * 
     * @return highValuePercent
     */
    public java.lang.Double getHighValuePercent() {
        return highValuePercent;
    }


    /**
     * Sets the highValuePercent value for this FairValuePrice.
     * 
     * @param highValuePercent
     */
    public void setHighValuePercent(java.lang.Double highValuePercent) {
        this.highValuePercent = highValuePercent;
    }


    /**
     * Gets the isVsoePrice value for this FairValuePrice.
     * 
     * @return isVsoePrice
     */
    public java.lang.Boolean getIsVsoePrice() {
        return isVsoePrice;
    }


    /**
     * Sets the isVsoePrice value for this FairValuePrice.
     * 
     * @param isVsoePrice
     */
    public void setIsVsoePrice(java.lang.Boolean isVsoePrice) {
        this.isVsoePrice = isVsoePrice;
    }


    /**
     * Gets the startDate value for this FairValuePrice.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FairValuePrice.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FairValuePrice.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FairValuePrice.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the customFieldList value for this FairValuePrice.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this FairValuePrice.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the dimensionList value for this FairValuePrice.
     * 
     * @return dimensionList
     */
    public com.netsuite.webservices.platform.core_2019_1.DimensionList getDimensionList() {
        return dimensionList;
    }


    /**
     * Sets the dimensionList value for this FairValuePrice.
     * 
     * @param dimensionList
     */
    public void setDimensionList(com.netsuite.webservices.platform.core_2019_1.DimensionList dimensionList) {
        this.dimensionList = dimensionList;
    }


    /**
     * Gets the internalId value for this FairValuePrice.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this FairValuePrice.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this FairValuePrice.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FairValuePrice.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FairValuePrice)) return false;
        FairValuePrice other = (FairValuePrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemRevenueCategory==null && other.getItemRevenueCategory()==null) || 
             (this.itemRevenueCategory!=null &&
              this.itemRevenueCategory.equals(other.getItemRevenueCategory()))) &&
            ((this.fairValue==null && other.getFairValue()==null) || 
             (this.fairValue!=null &&
              this.fairValue.equals(other.getFairValue()))) &&
            ((this.fairValueFormula==null && other.getFairValueFormula()==null) || 
             (this.fairValueFormula!=null &&
              this.fairValueFormula.equals(other.getFairValueFormula()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.fairValueRangePolicy==null && other.getFairValueRangePolicy()==null) || 
             (this.fairValueRangePolicy!=null &&
              this.fairValueRangePolicy.equals(other.getFairValueRangePolicy()))) &&
            ((this.lowValue==null && other.getLowValue()==null) || 
             (this.lowValue!=null &&
              this.lowValue.equals(other.getLowValue()))) &&
            ((this.lowValuePercent==null && other.getLowValuePercent()==null) || 
             (this.lowValuePercent!=null &&
              this.lowValuePercent.equals(other.getLowValuePercent()))) &&
            ((this.highValue==null && other.getHighValue()==null) || 
             (this.highValue!=null &&
              this.highValue.equals(other.getHighValue()))) &&
            ((this.highValuePercent==null && other.getHighValuePercent()==null) || 
             (this.highValuePercent!=null &&
              this.highValuePercent.equals(other.getHighValuePercent()))) &&
            ((this.isVsoePrice==null && other.getIsVsoePrice()==null) || 
             (this.isVsoePrice!=null &&
              this.isVsoePrice.equals(other.getIsVsoePrice()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.dimensionList==null && other.getDimensionList()==null) || 
             (this.dimensionList!=null &&
              this.dimensionList.equals(other.getDimensionList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemRevenueCategory() != null) {
            _hashCode += getItemRevenueCategory().hashCode();
        }
        if (getFairValue() != null) {
            _hashCode += getFairValue().hashCode();
        }
        if (getFairValueFormula() != null) {
            _hashCode += getFairValueFormula().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getFairValueRangePolicy() != null) {
            _hashCode += getFairValueRangePolicy().hashCode();
        }
        if (getLowValue() != null) {
            _hashCode += getLowValue().hashCode();
        }
        if (getLowValuePercent() != null) {
            _hashCode += getLowValuePercent().hashCode();
        }
        if (getHighValue() != null) {
            _hashCode += getHighValue().hashCode();
        }
        if (getHighValuePercent() != null) {
            _hashCode += getHighValuePercent().hashCode();
        }
        if (getIsVsoePrice() != null) {
            _hashCode += getIsVsoePrice().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getDimensionList() != null) {
            _hashCode += getDimensionList().hashCode();
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
        new org.apache.axis.description.TypeDesc(FairValuePrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "FairValuePrice"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("fairValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fairValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairValueFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fairValueFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairValueRangePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fairValueRangePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "FairValuePriceFairValueRangePolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lowValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValuePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lowValuePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "highValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValuePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "highValuePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isVsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "dimensionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DimensionList"));
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
