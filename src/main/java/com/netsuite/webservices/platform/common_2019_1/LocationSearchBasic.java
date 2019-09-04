/**
 * LocationSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class LocationSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchStringField address;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowStorePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField autoAssignmentRegionSetting;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField bufferStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField city;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField county;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField dailyShippingCapacity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField geolocationMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isFriday;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMonday;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOffice;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSaturday;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSunday;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isThursday;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTuesday;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWednesday;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField latitude;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField longitude;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField makeInventoryAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField makeInventoryAvailableStore;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField nameNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField nextPickupCutOffTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField sameDayPickupCutOffTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField state;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField storePickupBufferStock;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField timeZone;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField totalShippingCapacity;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField tranprefix;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usesBins;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField zip;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public LocationSearchBasic() {
    }

    public LocationSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchStringField address,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowStorePickup,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField autoAssignmentRegionSetting,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField bufferStock,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField city,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField county,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField dailyShippingCapacity,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endTime,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField geolocationMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isFriday,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMonday,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOffice,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSaturday,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSunday,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isThursday,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTuesday,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWednesday,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField latitude,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationType,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField longitude,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField makeInventoryAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField makeInventoryAvailableStore,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField nameNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField nextPickupCutOffTime,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phone,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField sameDayPickupCutOffTime,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startTime,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField state,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField storePickupBufferStock,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField timeZone,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField totalShippingCapacity,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField tranprefix,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usesBins,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField zip,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.address = address;
        this.allowStorePickup = allowStorePickup;
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
        this.bufferStock = bufferStock;
        this.city = city;
        this.country = country;
        this.county = county;
        this.dailyShippingCapacity = dailyShippingCapacity;
        this.endTime = endTime;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.geolocationMethod = geolocationMethod;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
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
        this.tranprefix = tranprefix;
        this.usesBins = usesBins;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this LocationSearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this LocationSearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the allowStorePickup value for this LocationSearchBasic.
     * 
     * @return allowStorePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAllowStorePickup() {
        return allowStorePickup;
    }


    /**
     * Sets the allowStorePickup value for this LocationSearchBasic.
     * 
     * @param allowStorePickup
     */
    public void setAllowStorePickup(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField allowStorePickup) {
        this.allowStorePickup = allowStorePickup;
    }


    /**
     * Gets the autoAssignmentRegionSetting value for this LocationSearchBasic.
     * 
     * @return autoAssignmentRegionSetting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAutoAssignmentRegionSetting() {
        return autoAssignmentRegionSetting;
    }


    /**
     * Sets the autoAssignmentRegionSetting value for this LocationSearchBasic.
     * 
     * @param autoAssignmentRegionSetting
     */
    public void setAutoAssignmentRegionSetting(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField autoAssignmentRegionSetting) {
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
    }


    /**
     * Gets the bufferStock value for this LocationSearchBasic.
     * 
     * @return bufferStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getBufferStock() {
        return bufferStock;
    }


    /**
     * Sets the bufferStock value for this LocationSearchBasic.
     * 
     * @param bufferStock
     */
    public void setBufferStock(com.netsuite.webservices.platform.core_2019_1.SearchLongField bufferStock) {
        this.bufferStock = bufferStock;
    }


    /**
     * Gets the city value for this LocationSearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this LocationSearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the country value for this LocationSearchBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this LocationSearchBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this LocationSearchBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this LocationSearchBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the dailyShippingCapacity value for this LocationSearchBasic.
     * 
     * @return dailyShippingCapacity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDailyShippingCapacity() {
        return dailyShippingCapacity;
    }


    /**
     * Sets the dailyShippingCapacity value for this LocationSearchBasic.
     * 
     * @param dailyShippingCapacity
     */
    public void setDailyShippingCapacity(com.netsuite.webservices.platform.core_2019_1.SearchLongField dailyShippingCapacity) {
        this.dailyShippingCapacity = dailyShippingCapacity;
    }


    /**
     * Gets the endTime value for this LocationSearchBasic.
     * 
     * @return endTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this LocationSearchBasic.
     * 
     * @param endTime
     */
    public void setEndTime(com.netsuite.webservices.platform.core_2019_1.SearchDateField endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the externalId value for this LocationSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this LocationSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this LocationSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this LocationSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the geolocationMethod value for this LocationSearchBasic.
     * 
     * @return geolocationMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGeolocationMethod() {
        return geolocationMethod;
    }


    /**
     * Sets the geolocationMethod value for this LocationSearchBasic.
     * 
     * @param geolocationMethod
     */
    public void setGeolocationMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField geolocationMethod) {
        this.geolocationMethod = geolocationMethod;
    }


    /**
     * Gets the internalId value for this LocationSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this LocationSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this LocationSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this LocationSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isFriday value for this LocationSearchBasic.
     * 
     * @return isFriday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsFriday() {
        return isFriday;
    }


    /**
     * Sets the isFriday value for this LocationSearchBasic.
     * 
     * @param isFriday
     */
    public void setIsFriday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isFriday) {
        this.isFriday = isFriday;
    }


    /**
     * Gets the isInactive value for this LocationSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this LocationSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isMonday value for this LocationSearchBasic.
     * 
     * @return isMonday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsMonday() {
        return isMonday;
    }


    /**
     * Sets the isMonday value for this LocationSearchBasic.
     * 
     * @param isMonday
     */
    public void setIsMonday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMonday) {
        this.isMonday = isMonday;
    }


    /**
     * Gets the isOffice value for this LocationSearchBasic.
     * 
     * @return isOffice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsOffice() {
        return isOffice;
    }


    /**
     * Sets the isOffice value for this LocationSearchBasic.
     * 
     * @param isOffice
     */
    public void setIsOffice(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isOffice) {
        this.isOffice = isOffice;
    }


    /**
     * Gets the isSaturday value for this LocationSearchBasic.
     * 
     * @return isSaturday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSaturday() {
        return isSaturday;
    }


    /**
     * Sets the isSaturday value for this LocationSearchBasic.
     * 
     * @param isSaturday
     */
    public void setIsSaturday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSaturday) {
        this.isSaturday = isSaturday;
    }


    /**
     * Gets the isSunday value for this LocationSearchBasic.
     * 
     * @return isSunday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSunday() {
        return isSunday;
    }


    /**
     * Sets the isSunday value for this LocationSearchBasic.
     * 
     * @param isSunday
     */
    public void setIsSunday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSunday) {
        this.isSunday = isSunday;
    }


    /**
     * Gets the isThursday value for this LocationSearchBasic.
     * 
     * @return isThursday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsThursday() {
        return isThursday;
    }


    /**
     * Sets the isThursday value for this LocationSearchBasic.
     * 
     * @param isThursday
     */
    public void setIsThursday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isThursday) {
        this.isThursday = isThursday;
    }


    /**
     * Gets the isTuesday value for this LocationSearchBasic.
     * 
     * @return isTuesday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsTuesday() {
        return isTuesday;
    }


    /**
     * Sets the isTuesday value for this LocationSearchBasic.
     * 
     * @param isTuesday
     */
    public void setIsTuesday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTuesday) {
        this.isTuesday = isTuesday;
    }


    /**
     * Gets the isWednesday value for this LocationSearchBasic.
     * 
     * @return isWednesday
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsWednesday() {
        return isWednesday;
    }


    /**
     * Sets the isWednesday value for this LocationSearchBasic.
     * 
     * @param isWednesday
     */
    public void setIsWednesday(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWednesday) {
        this.isWednesday = isWednesday;
    }


    /**
     * Gets the latitude value for this LocationSearchBasic.
     * 
     * @return latitude
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LocationSearchBasic.
     * 
     * @param latitude
     */
    public void setLatitude(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the locationType value for this LocationSearchBasic.
     * 
     * @return locationType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocationType() {
        return locationType;
    }


    /**
     * Sets the locationType value for this LocationSearchBasic.
     * 
     * @param locationType
     */
    public void setLocationType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locationType) {
        this.locationType = locationType;
    }


    /**
     * Gets the longitude value for this LocationSearchBasic.
     * 
     * @return longitude
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LocationSearchBasic.
     * 
     * @param longitude
     */
    public void setLongitude(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the makeInventoryAvailable value for this LocationSearchBasic.
     * 
     * @return makeInventoryAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }


    /**
     * Sets the makeInventoryAvailable value for this LocationSearchBasic.
     * 
     * @param makeInventoryAvailable
     */
    public void setMakeInventoryAvailable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }


    /**
     * Gets the makeInventoryAvailableStore value for this LocationSearchBasic.
     * 
     * @return makeInventoryAvailableStore
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }


    /**
     * Sets the makeInventoryAvailableStore value for this LocationSearchBasic.
     * 
     * @param makeInventoryAvailableStore
     */
    public void setMakeInventoryAvailableStore(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }


    /**
     * Gets the name value for this LocationSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this LocationSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the nameNoHierarchy value for this LocationSearchBasic.
     * 
     * @return nameNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getNameNoHierarchy() {
        return nameNoHierarchy;
    }


    /**
     * Sets the nameNoHierarchy value for this LocationSearchBasic.
     * 
     * @param nameNoHierarchy
     */
    public void setNameNoHierarchy(com.netsuite.webservices.platform.core_2019_1.SearchStringField nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }


    /**
     * Gets the nextPickupCutOffTime value for this LocationSearchBasic.
     * 
     * @return nextPickupCutOffTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getNextPickupCutOffTime() {
        return nextPickupCutOffTime;
    }


    /**
     * Sets the nextPickupCutOffTime value for this LocationSearchBasic.
     * 
     * @param nextPickupCutOffTime
     */
    public void setNextPickupCutOffTime(com.netsuite.webservices.platform.core_2019_1.SearchDateField nextPickupCutOffTime) {
        this.nextPickupCutOffTime = nextPickupCutOffTime;
    }


    /**
     * Gets the phone value for this LocationSearchBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this LocationSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the sameDayPickupCutOffTime value for this LocationSearchBasic.
     * 
     * @return sameDayPickupCutOffTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getSameDayPickupCutOffTime() {
        return sameDayPickupCutOffTime;
    }


    /**
     * Sets the sameDayPickupCutOffTime value for this LocationSearchBasic.
     * 
     * @param sameDayPickupCutOffTime
     */
    public void setSameDayPickupCutOffTime(com.netsuite.webservices.platform.core_2019_1.SearchDateField sameDayPickupCutOffTime) {
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }


    /**
     * Gets the startTime value for this LocationSearchBasic.
     * 
     * @return startTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this LocationSearchBasic.
     * 
     * @param startTime
     */
    public void setStartTime(com.netsuite.webservices.platform.core_2019_1.SearchDateField startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the state value for this LocationSearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this LocationSearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the storePickupBufferStock value for this LocationSearchBasic.
     * 
     * @return storePickupBufferStock
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getStorePickupBufferStock() {
        return storePickupBufferStock;
    }


    /**
     * Sets the storePickupBufferStock value for this LocationSearchBasic.
     * 
     * @param storePickupBufferStock
     */
    public void setStorePickupBufferStock(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField storePickupBufferStock) {
        this.storePickupBufferStock = storePickupBufferStock;
    }


    /**
     * Gets the subsidiary value for this LocationSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this LocationSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the timeZone value for this LocationSearchBasic.
     * 
     * @return timeZone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this LocationSearchBasic.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the totalShippingCapacity value for this LocationSearchBasic.
     * 
     * @return totalShippingCapacity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getTotalShippingCapacity() {
        return totalShippingCapacity;
    }


    /**
     * Sets the totalShippingCapacity value for this LocationSearchBasic.
     * 
     * @param totalShippingCapacity
     */
    public void setTotalShippingCapacity(com.netsuite.webservices.platform.core_2019_1.SearchLongField totalShippingCapacity) {
        this.totalShippingCapacity = totalShippingCapacity;
    }


    /**
     * Gets the tranprefix value for this LocationSearchBasic.
     * 
     * @return tranprefix
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTranprefix() {
        return tranprefix;
    }


    /**
     * Sets the tranprefix value for this LocationSearchBasic.
     * 
     * @param tranprefix
     */
    public void setTranprefix(com.netsuite.webservices.platform.core_2019_1.SearchStringField tranprefix) {
        this.tranprefix = tranprefix;
    }


    /**
     * Gets the usesBins value for this LocationSearchBasic.
     * 
     * @return usesBins
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUsesBins() {
        return usesBins;
    }


    /**
     * Sets the usesBins value for this LocationSearchBasic.
     * 
     * @param usesBins
     */
    public void setUsesBins(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usesBins) {
        this.usesBins = usesBins;
    }


    /**
     * Gets the zip value for this LocationSearchBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this LocationSearchBasic.
     * 
     * @param zip
     */
    public void setZip(com.netsuite.webservices.platform.core_2019_1.SearchStringField zip) {
        this.zip = zip;
    }


    /**
     * Gets the customFieldList value for this LocationSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this LocationSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationSearchBasic)) return false;
        LocationSearchBasic other = (LocationSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.allowStorePickup==null && other.getAllowStorePickup()==null) || 
             (this.allowStorePickup!=null &&
              this.allowStorePickup.equals(other.getAllowStorePickup()))) &&
            ((this.autoAssignmentRegionSetting==null && other.getAutoAssignmentRegionSetting()==null) || 
             (this.autoAssignmentRegionSetting!=null &&
              this.autoAssignmentRegionSetting.equals(other.getAutoAssignmentRegionSetting()))) &&
            ((this.bufferStock==null && other.getBufferStock()==null) || 
             (this.bufferStock!=null &&
              this.bufferStock.equals(other.getBufferStock()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.dailyShippingCapacity==null && other.getDailyShippingCapacity()==null) || 
             (this.dailyShippingCapacity!=null &&
              this.dailyShippingCapacity.equals(other.getDailyShippingCapacity()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.geolocationMethod==null && other.getGeolocationMethod()==null) || 
             (this.geolocationMethod!=null &&
              this.geolocationMethod.equals(other.getGeolocationMethod()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isFriday==null && other.getIsFriday()==null) || 
             (this.isFriday!=null &&
              this.isFriday.equals(other.getIsFriday()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isMonday==null && other.getIsMonday()==null) || 
             (this.isMonday!=null &&
              this.isMonday.equals(other.getIsMonday()))) &&
            ((this.isOffice==null && other.getIsOffice()==null) || 
             (this.isOffice!=null &&
              this.isOffice.equals(other.getIsOffice()))) &&
            ((this.isSaturday==null && other.getIsSaturday()==null) || 
             (this.isSaturday!=null &&
              this.isSaturday.equals(other.getIsSaturday()))) &&
            ((this.isSunday==null && other.getIsSunday()==null) || 
             (this.isSunday!=null &&
              this.isSunday.equals(other.getIsSunday()))) &&
            ((this.isThursday==null && other.getIsThursday()==null) || 
             (this.isThursday!=null &&
              this.isThursday.equals(other.getIsThursday()))) &&
            ((this.isTuesday==null && other.getIsTuesday()==null) || 
             (this.isTuesday!=null &&
              this.isTuesday.equals(other.getIsTuesday()))) &&
            ((this.isWednesday==null && other.getIsWednesday()==null) || 
             (this.isWednesday!=null &&
              this.isWednesday.equals(other.getIsWednesday()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.locationType==null && other.getLocationType()==null) || 
             (this.locationType!=null &&
              this.locationType.equals(other.getLocationType()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.makeInventoryAvailable==null && other.getMakeInventoryAvailable()==null) || 
             (this.makeInventoryAvailable!=null &&
              this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable()))) &&
            ((this.makeInventoryAvailableStore==null && other.getMakeInventoryAvailableStore()==null) || 
             (this.makeInventoryAvailableStore!=null &&
              this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameNoHierarchy==null && other.getNameNoHierarchy()==null) || 
             (this.nameNoHierarchy!=null &&
              this.nameNoHierarchy.equals(other.getNameNoHierarchy()))) &&
            ((this.nextPickupCutOffTime==null && other.getNextPickupCutOffTime()==null) || 
             (this.nextPickupCutOffTime!=null &&
              this.nextPickupCutOffTime.equals(other.getNextPickupCutOffTime()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.sameDayPickupCutOffTime==null && other.getSameDayPickupCutOffTime()==null) || 
             (this.sameDayPickupCutOffTime!=null &&
              this.sameDayPickupCutOffTime.equals(other.getSameDayPickupCutOffTime()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.storePickupBufferStock==null && other.getStorePickupBufferStock()==null) || 
             (this.storePickupBufferStock!=null &&
              this.storePickupBufferStock.equals(other.getStorePickupBufferStock()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.totalShippingCapacity==null && other.getTotalShippingCapacity()==null) || 
             (this.totalShippingCapacity!=null &&
              this.totalShippingCapacity.equals(other.getTotalShippingCapacity()))) &&
            ((this.tranprefix==null && other.getTranprefix()==null) || 
             (this.tranprefix!=null &&
              this.tranprefix.equals(other.getTranprefix()))) &&
            ((this.usesBins==null && other.getUsesBins()==null) || 
             (this.usesBins!=null &&
              this.usesBins.equals(other.getUsesBins()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAllowStorePickup() != null) {
            _hashCode += getAllowStorePickup().hashCode();
        }
        if (getAutoAssignmentRegionSetting() != null) {
            _hashCode += getAutoAssignmentRegionSetting().hashCode();
        }
        if (getBufferStock() != null) {
            _hashCode += getBufferStock().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getDailyShippingCapacity() != null) {
            _hashCode += getDailyShippingCapacity().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getGeolocationMethod() != null) {
            _hashCode += getGeolocationMethod().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsFriday() != null) {
            _hashCode += getIsFriday().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsMonday() != null) {
            _hashCode += getIsMonday().hashCode();
        }
        if (getIsOffice() != null) {
            _hashCode += getIsOffice().hashCode();
        }
        if (getIsSaturday() != null) {
            _hashCode += getIsSaturday().hashCode();
        }
        if (getIsSunday() != null) {
            _hashCode += getIsSunday().hashCode();
        }
        if (getIsThursday() != null) {
            _hashCode += getIsThursday().hashCode();
        }
        if (getIsTuesday() != null) {
            _hashCode += getIsTuesday().hashCode();
        }
        if (getIsWednesday() != null) {
            _hashCode += getIsWednesday().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLocationType() != null) {
            _hashCode += getLocationType().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getMakeInventoryAvailable() != null) {
            _hashCode += getMakeInventoryAvailable().hashCode();
        }
        if (getMakeInventoryAvailableStore() != null) {
            _hashCode += getMakeInventoryAvailableStore().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameNoHierarchy() != null) {
            _hashCode += getNameNoHierarchy().hashCode();
        }
        if (getNextPickupCutOffTime() != null) {
            _hashCode += getNextPickupCutOffTime().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getSameDayPickupCutOffTime() != null) {
            _hashCode += getSameDayPickupCutOffTime().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStorePickupBufferStock() != null) {
            _hashCode += getStorePickupBufferStock().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getTotalShippingCapacity() != null) {
            _hashCode += getTotalShippingCapacity().hashCode();
        }
        if (getTranprefix() != null) {
            _hashCode += getTranprefix().hashCode();
        }
        if (getUsesBins() != null) {
            _hashCode += getUsesBins().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allowStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAssignmentRegionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoAssignmentRegionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyShippingCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dailyShippingCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endTime"));
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
        elemField.setFieldName("geolocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "geolocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("isFriday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isFriday"));
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
        elemField.setFieldName("isMonday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isMonday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSaturday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSaturday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSunday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSunday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isThursday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isThursday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTuesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isTuesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWednesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isWednesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPickupCutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextPickupCutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameDayPickupCutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sameDayPickupCutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storePickupBufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "storePickupBufferStock"));
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
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalShippingCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalShippingCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranprefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "usesBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
