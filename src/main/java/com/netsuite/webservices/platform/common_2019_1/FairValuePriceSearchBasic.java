/**
 * FairValuePriceSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class FairValuePriceSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fairValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fairValueFormula;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fairValueRangePolicy;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField highValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField highValuePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevenueCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lowValue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lowValuePercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType;

    public FairValuePriceSearchBasic() {
    }

    public FairValuePriceSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fairValue,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fairValueFormula,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fairValueRangePolicy,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField highValue,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField highValuePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoePrice,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevenueCategory,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lowValue,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lowValuePercent,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType) {
        this.currency = currency;
        this.endDate = endDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fairValue = fairValue;
        this.fairValueFormula = fairValueFormula;
        this.fairValueRangePolicy = fairValueRangePolicy;
        this.highValue = highValue;
        this.highValuePercent = highValuePercent;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isVsoePrice = isVsoePrice;
        this.item = item;
        this.itemRevenueCategory = itemRevenueCategory;
        this.lowValue = lowValue;
        this.lowValuePercent = lowValuePercent;
        this.startDate = startDate;
        this.unitsType = unitsType;
    }


    /**
     * Gets the currency value for this FairValuePriceSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this FairValuePriceSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the endDate value for this FairValuePriceSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FairValuePriceSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the externalId value for this FairValuePriceSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FairValuePriceSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this FairValuePriceSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this FairValuePriceSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fairValue value for this FairValuePriceSearchBasic.
     * 
     * @return fairValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFairValue() {
        return fairValue;
    }


    /**
     * Sets the fairValue value for this FairValuePriceSearchBasic.
     * 
     * @param fairValue
     */
    public void setFairValue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fairValue) {
        this.fairValue = fairValue;
    }


    /**
     * Gets the fairValueFormula value for this FairValuePriceSearchBasic.
     * 
     * @return fairValueFormula
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFairValueFormula() {
        return fairValueFormula;
    }


    /**
     * Sets the fairValueFormula value for this FairValuePriceSearchBasic.
     * 
     * @param fairValueFormula
     */
    public void setFairValueFormula(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fairValueFormula) {
        this.fairValueFormula = fairValueFormula;
    }


    /**
     * Gets the fairValueRangePolicy value for this FairValuePriceSearchBasic.
     * 
     * @return fairValueRangePolicy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getFairValueRangePolicy() {
        return fairValueRangePolicy;
    }


    /**
     * Sets the fairValueRangePolicy value for this FairValuePriceSearchBasic.
     * 
     * @param fairValueRangePolicy
     */
    public void setFairValueRangePolicy(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fairValueRangePolicy) {
        this.fairValueRangePolicy = fairValueRangePolicy;
    }


    /**
     * Gets the highValue value for this FairValuePriceSearchBasic.
     * 
     * @return highValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getHighValue() {
        return highValue;
    }


    /**
     * Sets the highValue value for this FairValuePriceSearchBasic.
     * 
     * @param highValue
     */
    public void setHighValue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField highValue) {
        this.highValue = highValue;
    }


    /**
     * Gets the highValuePercent value for this FairValuePriceSearchBasic.
     * 
     * @return highValuePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getHighValuePercent() {
        return highValuePercent;
    }


    /**
     * Sets the highValuePercent value for this FairValuePriceSearchBasic.
     * 
     * @param highValuePercent
     */
    public void setHighValuePercent(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField highValuePercent) {
        this.highValuePercent = highValuePercent;
    }


    /**
     * Gets the internalId value for this FairValuePriceSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this FairValuePriceSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this FairValuePriceSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this FairValuePriceSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isVsoePrice value for this FairValuePriceSearchBasic.
     * 
     * @return isVsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsVsoePrice() {
        return isVsoePrice;
    }


    /**
     * Sets the isVsoePrice value for this FairValuePriceSearchBasic.
     * 
     * @param isVsoePrice
     */
    public void setIsVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoePrice) {
        this.isVsoePrice = isVsoePrice;
    }


    /**
     * Gets the item value for this FairValuePriceSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this FairValuePriceSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the itemRevenueCategory value for this FairValuePriceSearchBasic.
     * 
     * @return itemRevenueCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemRevenueCategory() {
        return itemRevenueCategory;
    }


    /**
     * Sets the itemRevenueCategory value for this FairValuePriceSearchBasic.
     * 
     * @param itemRevenueCategory
     */
    public void setItemRevenueCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }


    /**
     * Gets the lowValue value for this FairValuePriceSearchBasic.
     * 
     * @return lowValue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLowValue() {
        return lowValue;
    }


    /**
     * Sets the lowValue value for this FairValuePriceSearchBasic.
     * 
     * @param lowValue
     */
    public void setLowValue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lowValue) {
        this.lowValue = lowValue;
    }


    /**
     * Gets the lowValuePercent value for this FairValuePriceSearchBasic.
     * 
     * @return lowValuePercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLowValuePercent() {
        return lowValuePercent;
    }


    /**
     * Sets the lowValuePercent value for this FairValuePriceSearchBasic.
     * 
     * @param lowValuePercent
     */
    public void setLowValuePercent(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField lowValuePercent) {
        this.lowValuePercent = lowValuePercent;
    }


    /**
     * Gets the startDate value for this FairValuePriceSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FairValuePriceSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the unitsType value for this FairValuePriceSearchBasic.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this FairValuePriceSearchBasic.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FairValuePriceSearchBasic)) return false;
        FairValuePriceSearchBasic other = (FairValuePriceSearchBasic) obj;
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
              this.currency.equals(other.getCurrency()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fairValue==null && other.getFairValue()==null) || 
             (this.fairValue!=null &&
              this.fairValue.equals(other.getFairValue()))) &&
            ((this.fairValueFormula==null && other.getFairValueFormula()==null) || 
             (this.fairValueFormula!=null &&
              this.fairValueFormula.equals(other.getFairValueFormula()))) &&
            ((this.fairValueRangePolicy==null && other.getFairValueRangePolicy()==null) || 
             (this.fairValueRangePolicy!=null &&
              this.fairValueRangePolicy.equals(other.getFairValueRangePolicy()))) &&
            ((this.highValue==null && other.getHighValue()==null) || 
             (this.highValue!=null &&
              this.highValue.equals(other.getHighValue()))) &&
            ((this.highValuePercent==null && other.getHighValuePercent()==null) || 
             (this.highValuePercent!=null &&
              this.highValuePercent.equals(other.getHighValuePercent()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isVsoePrice==null && other.getIsVsoePrice()==null) || 
             (this.isVsoePrice!=null &&
              this.isVsoePrice.equals(other.getIsVsoePrice()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemRevenueCategory==null && other.getItemRevenueCategory()==null) || 
             (this.itemRevenueCategory!=null &&
              this.itemRevenueCategory.equals(other.getItemRevenueCategory()))) &&
            ((this.lowValue==null && other.getLowValue()==null) || 
             (this.lowValue!=null &&
              this.lowValue.equals(other.getLowValue()))) &&
            ((this.lowValuePercent==null && other.getLowValuePercent()==null) || 
             (this.lowValuePercent!=null &&
              this.lowValuePercent.equals(other.getLowValuePercent()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType())));
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
            _hashCode += getCurrency().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFairValue() != null) {
            _hashCode += getFairValue().hashCode();
        }
        if (getFairValueFormula() != null) {
            _hashCode += getFairValueFormula().hashCode();
        }
        if (getFairValueRangePolicy() != null) {
            _hashCode += getFairValueRangePolicy().hashCode();
        }
        if (getHighValue() != null) {
            _hashCode += getHighValue().hashCode();
        }
        if (getHighValuePercent() != null) {
            _hashCode += getHighValuePercent().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsVsoePrice() != null) {
            _hashCode += getIsVsoePrice().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemRevenueCategory() != null) {
            _hashCode += getItemRevenueCategory().hashCode();
        }
        if (getLowValue() != null) {
            _hashCode += getLowValue().hashCode();
        }
        if (getLowValuePercent() != null) {
            _hashCode += getLowValuePercent().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FairValuePriceSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FairValuePriceSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("fairValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fairValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairValueFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fairValueFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairValueRangePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fairValueRangePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "highValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highValuePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "highValuePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isVsoePrice"));
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
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lowValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowValuePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lowValuePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
