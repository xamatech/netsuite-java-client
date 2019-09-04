/**
 * LocationSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class LocationSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] allowStorePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] autoAssignmentRegionSetting;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] bufferStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dailyShippingCapacity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] geolocationMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isFriday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMonday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOffice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSaturday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSunday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isThursday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTuesday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWednesday;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] latitude;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] longitude;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] makeInventoryAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] makeInventoryAvailableStore;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextPickupCutOffTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] sameDayPickupCutOffTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] storePickupBufferStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] timeZone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] totalShippingCapacity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranPrefix;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] usesBins;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public LocationSearchRowBasic() {
    }

    public LocationSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] allowStorePickup,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] autoAssignmentRegionSetting,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] bufferStock,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dailyShippingCapacity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] geolocationMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isFriday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMonday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOffice,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSaturday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSunday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isThursday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTuesday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWednesday,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] latitude,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] longitude,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] makeInventoryAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] makeInventoryAvailableStore,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextPickupCutOffTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] sameDayPickupCutOffTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] storePickupBufferStock,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] timeZone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] totalShippingCapacity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranPrefix,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] usesBins,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.allowStorePickup = allowStorePickup;
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
        this.bufferStock = bufferStock;
        this.city = city;
        this.country = country;
        this.dailyShippingCapacity = dailyShippingCapacity;
        this.endTime = endTime;
        this.externalId = externalId;
        this.geolocationMethod = geolocationMethod;
        this.internalId = internalId;
        this.isFriday = isFriday;
        this.isInactive = isInactive;
        this.isMonday = isMonday;
        this.isOffice = isOffice;
        this.isSaturday = isSaturday;
        this.isSunday = isSunday;
        this.isThursday = isThursday;
        this.isTuesday = isTuesday;
        this.isWednesday = isWednesday;
        this.latitude = latitude;
        this.locationType = locationType;
        this.longitude = longitude;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.nextPickupCutOffTime = nextPickupCutOffTime;
        this.phone = phone;
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
        this.startTime = startTime;
        this.state = state;
        this.storePickupBufferStock = storePickupBufferStock;
        this.subsidiary = subsidiary;
        this.timeZone = timeZone;
        this.totalShippingCapacity = totalShippingCapacity;
        this.tranPrefix = tranPrefix;
        this.usesBins = usesBins;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address1 value for this LocationSearchRowBasic.
     * 
     * @return address1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this LocationSearchRowBasic.
     * 
     * @param address1
     */
    public void setAddress1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address1[i] = _value;
    }


    /**
     * Gets the address2 value for this LocationSearchRowBasic.
     * 
     * @return address2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this LocationSearchRowBasic.
     * 
     * @param address2
     */
    public void setAddress2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address2[i] = _value;
    }


    /**
     * Gets the address3 value for this LocationSearchRowBasic.
     * 
     * @return address3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this LocationSearchRowBasic.
     * 
     * @param address3
     */
    public void setAddress3(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address3[i] = _value;
    }


    /**
     * Gets the allowStorePickup value for this LocationSearchRowBasic.
     * 
     * @return allowStorePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAllowStorePickup() {
        return allowStorePickup;
    }


    /**
     * Sets the allowStorePickup value for this LocationSearchRowBasic.
     * 
     * @param allowStorePickup
     */
    public void setAllowStorePickup(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] allowStorePickup) {
        this.allowStorePickup = allowStorePickup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAllowStorePickup(int i) {
        return this.allowStorePickup[i];
    }

    public void setAllowStorePickup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.allowStorePickup[i] = _value;
    }


    /**
     * Gets the autoAssignmentRegionSetting value for this LocationSearchRowBasic.
     * 
     * @return autoAssignmentRegionSetting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAutoAssignmentRegionSetting() {
        return autoAssignmentRegionSetting;
    }


    /**
     * Sets the autoAssignmentRegionSetting value for this LocationSearchRowBasic.
     * 
     * @param autoAssignmentRegionSetting
     */
    public void setAutoAssignmentRegionSetting(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] autoAssignmentRegionSetting) {
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAutoAssignmentRegionSetting(int i) {
        return this.autoAssignmentRegionSetting[i];
    }

    public void setAutoAssignmentRegionSetting(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.autoAssignmentRegionSetting[i] = _value;
    }


    /**
     * Gets the bufferStock value for this LocationSearchRowBasic.
     * 
     * @return bufferStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getBufferStock() {
        return bufferStock;
    }


    /**
     * Sets the bufferStock value for this LocationSearchRowBasic.
     * 
     * @param bufferStock
     */
    public void setBufferStock(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] bufferStock) {
        this.bufferStock = bufferStock;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getBufferStock(int i) {
        return this.bufferStock[i];
    }

    public void setBufferStock(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.bufferStock[i] = _value;
    }


    /**
     * Gets the city value for this LocationSearchRowBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this LocationSearchRowBasic.
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
     * Gets the country value for this LocationSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this LocationSearchRowBasic.
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
     * Gets the dailyShippingCapacity value for this LocationSearchRowBasic.
     * 
     * @return dailyShippingCapacity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDailyShippingCapacity() {
        return dailyShippingCapacity;
    }


    /**
     * Sets the dailyShippingCapacity value for this LocationSearchRowBasic.
     * 
     * @param dailyShippingCapacity
     */
    public void setDailyShippingCapacity(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] dailyShippingCapacity) {
        this.dailyShippingCapacity = dailyShippingCapacity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDailyShippingCapacity(int i) {
        return this.dailyShippingCapacity[i];
    }

    public void setDailyShippingCapacity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.dailyShippingCapacity[i] = _value;
    }


    /**
     * Gets the endTime value for this LocationSearchRowBasic.
     * 
     * @return endTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this LocationSearchRowBasic.
     * 
     * @param endTime
     */
    public void setEndTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endTime) {
        this.endTime = endTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endTime[i] = _value;
    }


    /**
     * Gets the externalId value for this LocationSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this LocationSearchRowBasic.
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
     * Gets the geolocationMethod value for this LocationSearchRowBasic.
     * 
     * @return geolocationMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGeolocationMethod() {
        return geolocationMethod;
    }


    /**
     * Sets the geolocationMethod value for this LocationSearchRowBasic.
     * 
     * @param geolocationMethod
     */
    public void setGeolocationMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] geolocationMethod) {
        this.geolocationMethod = geolocationMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getGeolocationMethod(int i) {
        return this.geolocationMethod[i];
    }

    public void setGeolocationMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.geolocationMethod[i] = _value;
    }


    /**
     * Gets the internalId value for this LocationSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this LocationSearchRowBasic.
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
     * Gets the isFriday value for this LocationSearchRowBasic.
     * 
     * @return isFriday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsFriday() {
        return isFriday;
    }


    /**
     * Sets the isFriday value for this LocationSearchRowBasic.
     * 
     * @param isFriday
     */
    public void setIsFriday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isFriday) {
        this.isFriday = isFriday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsFriday(int i) {
        return this.isFriday[i];
    }

    public void setIsFriday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isFriday[i] = _value;
    }


    /**
     * Gets the isInactive value for this LocationSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this LocationSearchRowBasic.
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
     * Gets the isMonday value for this LocationSearchRowBasic.
     * 
     * @return isMonday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsMonday() {
        return isMonday;
    }


    /**
     * Sets the isMonday value for this LocationSearchRowBasic.
     * 
     * @param isMonday
     */
    public void setIsMonday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMonday) {
        this.isMonday = isMonday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsMonday(int i) {
        return this.isMonday[i];
    }

    public void setIsMonday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isMonday[i] = _value;
    }


    /**
     * Gets the isOffice value for this LocationSearchRowBasic.
     * 
     * @return isOffice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsOffice() {
        return isOffice;
    }


    /**
     * Sets the isOffice value for this LocationSearchRowBasic.
     * 
     * @param isOffice
     */
    public void setIsOffice(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isOffice) {
        this.isOffice = isOffice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsOffice(int i) {
        return this.isOffice[i];
    }

    public void setIsOffice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isOffice[i] = _value;
    }


    /**
     * Gets the isSaturday value for this LocationSearchRowBasic.
     * 
     * @return isSaturday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSaturday() {
        return isSaturday;
    }


    /**
     * Sets the isSaturday value for this LocationSearchRowBasic.
     * 
     * @param isSaturday
     */
    public void setIsSaturday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSaturday) {
        this.isSaturday = isSaturday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSaturday(int i) {
        return this.isSaturday[i];
    }

    public void setIsSaturday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSaturday[i] = _value;
    }


    /**
     * Gets the isSunday value for this LocationSearchRowBasic.
     * 
     * @return isSunday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSunday() {
        return isSunday;
    }


    /**
     * Sets the isSunday value for this LocationSearchRowBasic.
     * 
     * @param isSunday
     */
    public void setIsSunday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSunday) {
        this.isSunday = isSunday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSunday(int i) {
        return this.isSunday[i];
    }

    public void setIsSunday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSunday[i] = _value;
    }


    /**
     * Gets the isThursday value for this LocationSearchRowBasic.
     * 
     * @return isThursday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsThursday() {
        return isThursday;
    }


    /**
     * Sets the isThursday value for this LocationSearchRowBasic.
     * 
     * @param isThursday
     */
    public void setIsThursday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isThursday) {
        this.isThursday = isThursday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsThursday(int i) {
        return this.isThursday[i];
    }

    public void setIsThursday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isThursday[i] = _value;
    }


    /**
     * Gets the isTuesday value for this LocationSearchRowBasic.
     * 
     * @return isTuesday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsTuesday() {
        return isTuesday;
    }


    /**
     * Sets the isTuesday value for this LocationSearchRowBasic.
     * 
     * @param isTuesday
     */
    public void setIsTuesday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTuesday) {
        this.isTuesday = isTuesday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsTuesday(int i) {
        return this.isTuesday[i];
    }

    public void setIsTuesday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isTuesday[i] = _value;
    }


    /**
     * Gets the isWednesday value for this LocationSearchRowBasic.
     * 
     * @return isWednesday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsWednesday() {
        return isWednesday;
    }


    /**
     * Sets the isWednesday value for this LocationSearchRowBasic.
     * 
     * @param isWednesday
     */
    public void setIsWednesday(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWednesday) {
        this.isWednesday = isWednesday;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsWednesday(int i) {
        return this.isWednesday[i];
    }

    public void setIsWednesday(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isWednesday[i] = _value;
    }


    /**
     * Gets the latitude value for this LocationSearchRowBasic.
     * 
     * @return latitude
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LocationSearchRowBasic.
     * 
     * @param latitude
     */
    public void setLatitude(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] latitude) {
        this.latitude = latitude;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLatitude(int i) {
        return this.latitude[i];
    }

    public void setLatitude(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.latitude[i] = _value;
    }


    /**
     * Gets the locationType value for this LocationSearchRowBasic.
     * 
     * @return locationType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLocationType() {
        return locationType;
    }


    /**
     * Sets the locationType value for this LocationSearchRowBasic.
     * 
     * @param locationType
     */
    public void setLocationType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] locationType) {
        this.locationType = locationType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLocationType(int i) {
        return this.locationType[i];
    }

    public void setLocationType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.locationType[i] = _value;
    }


    /**
     * Gets the longitude value for this LocationSearchRowBasic.
     * 
     * @return longitude
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LocationSearchRowBasic.
     * 
     * @param longitude
     */
    public void setLongitude(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] longitude) {
        this.longitude = longitude;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLongitude(int i) {
        return this.longitude[i];
    }

    public void setLongitude(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.longitude[i] = _value;
    }


    /**
     * Gets the makeInventoryAvailable value for this LocationSearchRowBasic.
     * 
     * @return makeInventoryAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }


    /**
     * Sets the makeInventoryAvailable value for this LocationSearchRowBasic.
     * 
     * @param makeInventoryAvailable
     */
    public void setMakeInventoryAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMakeInventoryAvailable(int i) {
        return this.makeInventoryAvailable[i];
    }

    public void setMakeInventoryAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.makeInventoryAvailable[i] = _value;
    }


    /**
     * Gets the makeInventoryAvailableStore value for this LocationSearchRowBasic.
     * 
     * @return makeInventoryAvailableStore
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }


    /**
     * Sets the makeInventoryAvailableStore value for this LocationSearchRowBasic.
     * 
     * @param makeInventoryAvailableStore
     */
    public void setMakeInventoryAvailableStore(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMakeInventoryAvailableStore(int i) {
        return this.makeInventoryAvailableStore[i];
    }

    public void setMakeInventoryAvailableStore(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.makeInventoryAvailableStore[i] = _value;
    }


    /**
     * Gets the name value for this LocationSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this LocationSearchRowBasic.
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
     * Gets the nameNoHierarchy value for this LocationSearchRowBasic.
     * 
     * @return nameNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNameNoHierarchy() {
        return nameNoHierarchy;
    }


    /**
     * Sets the nameNoHierarchy value for this LocationSearchRowBasic.
     * 
     * @param nameNoHierarchy
     */
    public void setNameNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNameNoHierarchy(int i) {
        return this.nameNoHierarchy[i];
    }

    public void setNameNoHierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.nameNoHierarchy[i] = _value;
    }


    /**
     * Gets the nextPickupCutOffTime value for this LocationSearchRowBasic.
     * 
     * @return nextPickupCutOffTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getNextPickupCutOffTime() {
        return nextPickupCutOffTime;
    }


    /**
     * Sets the nextPickupCutOffTime value for this LocationSearchRowBasic.
     * 
     * @param nextPickupCutOffTime
     */
    public void setNextPickupCutOffTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextPickupCutOffTime) {
        this.nextPickupCutOffTime = nextPickupCutOffTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getNextPickupCutOffTime(int i) {
        return this.nextPickupCutOffTime[i];
    }

    public void setNextPickupCutOffTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.nextPickupCutOffTime[i] = _value;
    }


    /**
     * Gets the phone value for this LocationSearchRowBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this LocationSearchRowBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the sameDayPickupCutOffTime value for this LocationSearchRowBasic.
     * 
     * @return sameDayPickupCutOffTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getSameDayPickupCutOffTime() {
        return sameDayPickupCutOffTime;
    }


    /**
     * Sets the sameDayPickupCutOffTime value for this LocationSearchRowBasic.
     * 
     * @param sameDayPickupCutOffTime
     */
    public void setSameDayPickupCutOffTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] sameDayPickupCutOffTime) {
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getSameDayPickupCutOffTime(int i) {
        return this.sameDayPickupCutOffTime[i];
    }

    public void setSameDayPickupCutOffTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.sameDayPickupCutOffTime[i] = _value;
    }


    /**
     * Gets the startTime value for this LocationSearchRowBasic.
     * 
     * @return startTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this LocationSearchRowBasic.
     * 
     * @param startTime
     */
    public void setStartTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startTime) {
        this.startTime = startTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startTime[i] = _value;
    }


    /**
     * Gets the state value for this LocationSearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this LocationSearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the storePickupBufferStock value for this LocationSearchRowBasic.
     * 
     * @return storePickupBufferStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getStorePickupBufferStock() {
        return storePickupBufferStock;
    }


    /**
     * Sets the storePickupBufferStock value for this LocationSearchRowBasic.
     * 
     * @param storePickupBufferStock
     */
    public void setStorePickupBufferStock(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] storePickupBufferStock) {
        this.storePickupBufferStock = storePickupBufferStock;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getStorePickupBufferStock(int i) {
        return this.storePickupBufferStock[i];
    }

    public void setStorePickupBufferStock(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.storePickupBufferStock[i] = _value;
    }


    /**
     * Gets the subsidiary value for this LocationSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this LocationSearchRowBasic.
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
     * Gets the timeZone value for this LocationSearchRowBasic.
     * 
     * @return timeZone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this LocationSearchRowBasic.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] timeZone) {
        this.timeZone = timeZone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getTimeZone(int i) {
        return this.timeZone[i];
    }

    public void setTimeZone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.timeZone[i] = _value;
    }


    /**
     * Gets the totalShippingCapacity value for this LocationSearchRowBasic.
     * 
     * @return totalShippingCapacity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getTotalShippingCapacity() {
        return totalShippingCapacity;
    }


    /**
     * Sets the totalShippingCapacity value for this LocationSearchRowBasic.
     * 
     * @param totalShippingCapacity
     */
    public void setTotalShippingCapacity(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] totalShippingCapacity) {
        this.totalShippingCapacity = totalShippingCapacity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getTotalShippingCapacity(int i) {
        return this.totalShippingCapacity[i];
    }

    public void setTotalShippingCapacity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.totalShippingCapacity[i] = _value;
    }


    /**
     * Gets the tranPrefix value for this LocationSearchRowBasic.
     * 
     * @return tranPrefix
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this LocationSearchRowBasic.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTranPrefix(int i) {
        return this.tranPrefix[i];
    }

    public void setTranPrefix(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.tranPrefix[i] = _value;
    }


    /**
     * Gets the usesBins value for this LocationSearchRowBasic.
     * 
     * @return usesBins
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUsesBins() {
        return usesBins;
    }


    /**
     * Sets the usesBins value for this LocationSearchRowBasic.
     * 
     * @param usesBins
     */
    public void setUsesBins(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] usesBins) {
        this.usesBins = usesBins;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUsesBins(int i) {
        return this.usesBins[i];
    }

    public void setUsesBins(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.usesBins[i] = _value;
    }


    /**
     * Gets the zip value for this LocationSearchRowBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this LocationSearchRowBasic.
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


    /**
     * Gets the customFieldList value for this LocationSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this LocationSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationSearchRowBasic)) return false;
        LocationSearchRowBasic other = (LocationSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              java.util.Arrays.equals(this.address1, other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              java.util.Arrays.equals(this.address2, other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              java.util.Arrays.equals(this.address3, other.getAddress3()))) &&
            ((this.allowStorePickup==null && other.getAllowStorePickup()==null) || 
             (this.allowStorePickup!=null &&
              java.util.Arrays.equals(this.allowStorePickup, other.getAllowStorePickup()))) &&
            ((this.autoAssignmentRegionSetting==null && other.getAutoAssignmentRegionSetting()==null) || 
             (this.autoAssignmentRegionSetting!=null &&
              java.util.Arrays.equals(this.autoAssignmentRegionSetting, other.getAutoAssignmentRegionSetting()))) &&
            ((this.bufferStock==null && other.getBufferStock()==null) || 
             (this.bufferStock!=null &&
              java.util.Arrays.equals(this.bufferStock, other.getBufferStock()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.dailyShippingCapacity==null && other.getDailyShippingCapacity()==null) || 
             (this.dailyShippingCapacity!=null &&
              java.util.Arrays.equals(this.dailyShippingCapacity, other.getDailyShippingCapacity()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              java.util.Arrays.equals(this.endTime, other.getEndTime()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.geolocationMethod==null && other.getGeolocationMethod()==null) || 
             (this.geolocationMethod!=null &&
              java.util.Arrays.equals(this.geolocationMethod, other.getGeolocationMethod()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isFriday==null && other.getIsFriday()==null) || 
             (this.isFriday!=null &&
              java.util.Arrays.equals(this.isFriday, other.getIsFriday()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isMonday==null && other.getIsMonday()==null) || 
             (this.isMonday!=null &&
              java.util.Arrays.equals(this.isMonday, other.getIsMonday()))) &&
            ((this.isOffice==null && other.getIsOffice()==null) || 
             (this.isOffice!=null &&
              java.util.Arrays.equals(this.isOffice, other.getIsOffice()))) &&
            ((this.isSaturday==null && other.getIsSaturday()==null) || 
             (this.isSaturday!=null &&
              java.util.Arrays.equals(this.isSaturday, other.getIsSaturday()))) &&
            ((this.isSunday==null && other.getIsSunday()==null) || 
             (this.isSunday!=null &&
              java.util.Arrays.equals(this.isSunday, other.getIsSunday()))) &&
            ((this.isThursday==null && other.getIsThursday()==null) || 
             (this.isThursday!=null &&
              java.util.Arrays.equals(this.isThursday, other.getIsThursday()))) &&
            ((this.isTuesday==null && other.getIsTuesday()==null) || 
             (this.isTuesday!=null &&
              java.util.Arrays.equals(this.isTuesday, other.getIsTuesday()))) &&
            ((this.isWednesday==null && other.getIsWednesday()==null) || 
             (this.isWednesday!=null &&
              java.util.Arrays.equals(this.isWednesday, other.getIsWednesday()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              java.util.Arrays.equals(this.latitude, other.getLatitude()))) &&
            ((this.locationType==null && other.getLocationType()==null) || 
             (this.locationType!=null &&
              java.util.Arrays.equals(this.locationType, other.getLocationType()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              java.util.Arrays.equals(this.longitude, other.getLongitude()))) &&
            ((this.makeInventoryAvailable==null && other.getMakeInventoryAvailable()==null) || 
             (this.makeInventoryAvailable!=null &&
              java.util.Arrays.equals(this.makeInventoryAvailable, other.getMakeInventoryAvailable()))) &&
            ((this.makeInventoryAvailableStore==null && other.getMakeInventoryAvailableStore()==null) || 
             (this.makeInventoryAvailableStore!=null &&
              java.util.Arrays.equals(this.makeInventoryAvailableStore, other.getMakeInventoryAvailableStore()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.nameNoHierarchy==null && other.getNameNoHierarchy()==null) || 
             (this.nameNoHierarchy!=null &&
              java.util.Arrays.equals(this.nameNoHierarchy, other.getNameNoHierarchy()))) &&
            ((this.nextPickupCutOffTime==null && other.getNextPickupCutOffTime()==null) || 
             (this.nextPickupCutOffTime!=null &&
              java.util.Arrays.equals(this.nextPickupCutOffTime, other.getNextPickupCutOffTime()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.sameDayPickupCutOffTime==null && other.getSameDayPickupCutOffTime()==null) || 
             (this.sameDayPickupCutOffTime!=null &&
              java.util.Arrays.equals(this.sameDayPickupCutOffTime, other.getSameDayPickupCutOffTime()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              java.util.Arrays.equals(this.startTime, other.getStartTime()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.storePickupBufferStock==null && other.getStorePickupBufferStock()==null) || 
             (this.storePickupBufferStock!=null &&
              java.util.Arrays.equals(this.storePickupBufferStock, other.getStorePickupBufferStock()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              java.util.Arrays.equals(this.timeZone, other.getTimeZone()))) &&
            ((this.totalShippingCapacity==null && other.getTotalShippingCapacity()==null) || 
             (this.totalShippingCapacity!=null &&
              java.util.Arrays.equals(this.totalShippingCapacity, other.getTotalShippingCapacity()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              java.util.Arrays.equals(this.tranPrefix, other.getTranPrefix()))) &&
            ((this.usesBins==null && other.getUsesBins()==null) || 
             (this.usesBins!=null &&
              java.util.Arrays.equals(this.usesBins, other.getUsesBins()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              java.util.Arrays.equals(this.zip, other.getZip()))) &&
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
        if (getAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowStorePickup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowStorePickup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowStorePickup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoAssignmentRegionSetting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoAssignmentRegionSetting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoAssignmentRegionSetting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBufferStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBufferStock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBufferStock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getDailyShippingCapacity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDailyShippingCapacity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDailyShippingCapacity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndTime(), i);
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
        if (getGeolocationMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeolocationMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeolocationMethod(), i);
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
        if (getIsFriday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsFriday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsFriday(), i);
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
        if (getIsMonday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsMonday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsMonday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsOffice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOffice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOffice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSaturday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSaturday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSaturday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSunday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSunday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSunday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsThursday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsThursday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsThursday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsTuesday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsTuesday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsTuesday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsWednesday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsWednesday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsWednesday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatitude() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLatitude());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLatitude(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLongitude() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLongitude());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLongitude(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMakeInventoryAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMakeInventoryAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMakeInventoryAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMakeInventoryAvailableStore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMakeInventoryAvailableStore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMakeInventoryAvailableStore(), i);
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
        if (getNameNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextPickupCutOffTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextPickupCutOffTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextPickupCutOffTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSameDayPickupCutOffTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSameDayPickupCutOffTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSameDayPickupCutOffTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartTime(), i);
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
        if (getStorePickupBufferStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorePickupBufferStock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorePickupBufferStock(), i);
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
        if (getTimeZone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeZone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeZone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalShippingCapacity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalShippingCapacity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalShippingCapacity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranPrefix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranPrefix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranPrefix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsesBins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsesBins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsesBins(), i);
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAssignmentRegionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoAssignmentRegionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("dailyShippingCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dailyShippingCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endTime"));
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
        elemField.setFieldName("geolocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "geolocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("isFriday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isFriday"));
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
        elemField.setFieldName("isMonday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isMonday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSaturday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSaturday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSunday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSunday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isThursday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isThursday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTuesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isTuesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWednesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isWednesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPickupCutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextPickupCutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameDayPickupCutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sameDayPickupCutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storePickupBufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storePickupBufferStock"));
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
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalShippingCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalShippingCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "usesBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
