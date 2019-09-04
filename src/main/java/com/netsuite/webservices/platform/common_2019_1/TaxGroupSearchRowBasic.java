/**
 * TaxGroupSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxGroupSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] county;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] piggyBack;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stateDisplayName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiaryNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip;

    public TaxGroupSearchRowBasic() {
    }

    public TaxGroupSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] county,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] piggyBack,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stateDisplayName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiaryNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip) {
        this.city = city;
        this.country = country;
        this.county = county;
        this.externalId = externalId;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.itemId = itemId;
        this.piggyBack = piggyBack;
        this.rate = rate;
        this.state = state;
        this.stateDisplayName = stateDisplayName;
        this.subsidiary = subsidiary;
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
        this.taxItem1 = taxItem1;
        this.taxItem2 = taxItem2;
        this.taxType = taxType;
        this.unitPrice1 = unitPrice1;
        this.unitPrice2 = unitPrice2;
        this.zip = zip;
    }


    /**
     * Gets the city value for this TaxGroupSearchRowBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this TaxGroupSearchRowBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city) {
        this.city = city;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.city[i] = _value;
    }


    /**
     * Gets the country value for this TaxGroupSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this TaxGroupSearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the county value for this TaxGroupSearchRowBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCounty() {
        return county;
    }


    /**
     * Sets the county value for this TaxGroupSearchRowBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] county) {
        this.county = county;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCounty(int i) {
        return this.county[i];
    }

    public void setCounty(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.county[i] = _value;
    }


    /**
     * Gets the externalId value for this TaxGroupSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaxGroupSearchRowBasic.
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
     * Gets the includeChildren value for this TaxGroupSearchRowBasic.
     * 
     * @return includeChildren
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this TaxGroupSearchRowBasic.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren) {
        this.includeChildren = includeChildren;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIncludeChildren(int i) {
        return this.includeChildren[i];
    }

    public void setIncludeChildren(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.includeChildren[i] = _value;
    }


    /**
     * Gets the internalId value for this TaxGroupSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaxGroupSearchRowBasic.
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
     * Gets the isDefault value for this TaxGroupSearchRowBasic.
     * 
     * @return isDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this TaxGroupSearchRowBasic.
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
     * Gets the isInactive value for this TaxGroupSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TaxGroupSearchRowBasic.
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
     * Gets the itemId value for this TaxGroupSearchRowBasic.
     * 
     * @return itemId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this TaxGroupSearchRowBasic.
     * 
     * @param itemId
     */
    public void setItemId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemId) {
        this.itemId = itemId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.itemId[i] = _value;
    }


    /**
     * Gets the piggyBack value for this TaxGroupSearchRowBasic.
     * 
     * @return piggyBack
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPiggyBack() {
        return piggyBack;
    }


    /**
     * Sets the piggyBack value for this TaxGroupSearchRowBasic.
     * 
     * @param piggyBack
     */
    public void setPiggyBack(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] piggyBack) {
        this.piggyBack = piggyBack;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPiggyBack(int i) {
        return this.piggyBack[i];
    }

    public void setPiggyBack(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.piggyBack[i] = _value;
    }


    /**
     * Gets the rate value for this TaxGroupSearchRowBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TaxGroupSearchRowBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }


    /**
     * Gets the state value for this TaxGroupSearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this TaxGroupSearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the stateDisplayName value for this TaxGroupSearchRowBasic.
     * 
     * @return stateDisplayName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStateDisplayName() {
        return stateDisplayName;
    }


    /**
     * Sets the stateDisplayName value for this TaxGroupSearchRowBasic.
     * 
     * @param stateDisplayName
     */
    public void setStateDisplayName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stateDisplayName) {
        this.stateDisplayName = stateDisplayName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStateDisplayName(int i) {
        return this.stateDisplayName[i];
    }

    public void setStateDisplayName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.stateDisplayName[i] = _value;
    }


    /**
     * Gets the subsidiary value for this TaxGroupSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TaxGroupSearchRowBasic.
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
     * Gets the subsidiaryNoHierarchy value for this TaxGroupSearchRowBasic.
     * 
     * @return subsidiaryNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiaryNoHierarchy() {
        return subsidiaryNoHierarchy;
    }


    /**
     * Sets the subsidiaryNoHierarchy value for this TaxGroupSearchRowBasic.
     * 
     * @param subsidiaryNoHierarchy
     */
    public void setSubsidiaryNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiaryNoHierarchy) {
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiaryNoHierarchy(int i) {
        return this.subsidiaryNoHierarchy[i];
    }

    public void setSubsidiaryNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiaryNoHierarchy[i] = _value;
    }


    /**
     * Gets the taxItem1 value for this TaxGroupSearchRowBasic.
     * 
     * @return taxItem1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxItem1() {
        return taxItem1;
    }


    /**
     * Sets the taxItem1 value for this TaxGroupSearchRowBasic.
     * 
     * @param taxItem1
     */
    public void setTaxItem1(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem1) {
        this.taxItem1 = taxItem1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxItem1(int i) {
        return this.taxItem1[i];
    }

    public void setTaxItem1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxItem1[i] = _value;
    }


    /**
     * Gets the taxItem2 value for this TaxGroupSearchRowBasic.
     * 
     * @return taxItem2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxItem2() {
        return taxItem2;
    }


    /**
     * Sets the taxItem2 value for this TaxGroupSearchRowBasic.
     * 
     * @param taxItem2
     */
    public void setTaxItem2(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem2) {
        this.taxItem2 = taxItem2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxItem2(int i) {
        return this.taxItem2[i];
    }

    public void setTaxItem2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxItem2[i] = _value;
    }


    /**
     * Gets the taxType value for this TaxGroupSearchRowBasic.
     * 
     * @return taxType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxGroupSearchRowBasic.
     * 
     * @param taxType
     */
    public void setTaxType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxType) {
        this.taxType = taxType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxType(int i) {
        return this.taxType[i];
    }

    public void setTaxType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxType[i] = _value;
    }


    /**
     * Gets the unitPrice1 value for this TaxGroupSearchRowBasic.
     * 
     * @return unitPrice1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitPrice1() {
        return unitPrice1;
    }


    /**
     * Sets the unitPrice1 value for this TaxGroupSearchRowBasic.
     * 
     * @param unitPrice1
     */
    public void setUnitPrice1(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitPrice1(int i) {
        return this.unitPrice1[i];
    }

    public void setUnitPrice1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitPrice1[i] = _value;
    }


    /**
     * Gets the unitPrice2 value for this TaxGroupSearchRowBasic.
     * 
     * @return unitPrice2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitPrice2() {
        return unitPrice2;
    }


    /**
     * Sets the unitPrice2 value for this TaxGroupSearchRowBasic.
     * 
     * @param unitPrice2
     */
    public void setUnitPrice2(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitPrice2(int i) {
        return this.unitPrice2[i];
    }

    public void setUnitPrice2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitPrice2[i] = _value;
    }


    /**
     * Gets the zip value for this TaxGroupSearchRowBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this TaxGroupSearchRowBasic.
     * 
     * @param zip
     */
    public void setZip(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.zip[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxGroupSearchRowBasic)) return false;
        TaxGroupSearchRowBasic other = (TaxGroupSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              java.util.Arrays.equals(this.county, other.getCounty()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              java.util.Arrays.equals(this.includeChildren, other.getIncludeChildren()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              java.util.Arrays.equals(this.isDefault, other.getIsDefault()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              java.util.Arrays.equals(this.itemId, other.getItemId()))) &&
            ((this.piggyBack==null && other.getPiggyBack()==null) || 
             (this.piggyBack!=null &&
              java.util.Arrays.equals(this.piggyBack, other.getPiggyBack()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.stateDisplayName==null && other.getStateDisplayName()==null) || 
             (this.stateDisplayName!=null &&
              java.util.Arrays.equals(this.stateDisplayName, other.getStateDisplayName()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.subsidiaryNoHierarchy==null && other.getSubsidiaryNoHierarchy()==null) || 
             (this.subsidiaryNoHierarchy!=null &&
              java.util.Arrays.equals(this.subsidiaryNoHierarchy, other.getSubsidiaryNoHierarchy()))) &&
            ((this.taxItem1==null && other.getTaxItem1()==null) || 
             (this.taxItem1!=null &&
              java.util.Arrays.equals(this.taxItem1, other.getTaxItem1()))) &&
            ((this.taxItem2==null && other.getTaxItem2()==null) || 
             (this.taxItem2!=null &&
              java.util.Arrays.equals(this.taxItem2, other.getTaxItem2()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              java.util.Arrays.equals(this.taxType, other.getTaxType()))) &&
            ((this.unitPrice1==null && other.getUnitPrice1()==null) || 
             (this.unitPrice1!=null &&
              java.util.Arrays.equals(this.unitPrice1, other.getUnitPrice1()))) &&
            ((this.unitPrice2==null && other.getUnitPrice2()==null) || 
             (this.unitPrice2!=null &&
              java.util.Arrays.equals(this.unitPrice2, other.getUnitPrice2()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              java.util.Arrays.equals(this.zip, other.getZip())));
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
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCounty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCounty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCounty(), i);
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
        if (getIncludeChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeChildren(), i);
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
        if (getItemId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPiggyBack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPiggyBack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPiggyBack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStateDisplayName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateDisplayName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateDisplayName(), i);
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
        if (getSubsidiaryNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiaryNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxItem1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxItem1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxItem1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxItem2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxItem2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxItem2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPrice1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPrice1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPrice1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPrice2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPrice2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPrice2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZip(), i);
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
        new org.apache.axis.description.TypeDesc(TaxGroupSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxGroupSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piggyBack");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "piggyBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stateDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("subsidiaryNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiaryNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
