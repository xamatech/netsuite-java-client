/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class Location  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String name;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.Boolean includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList;

    private java.lang.Boolean isInactive;

    private java.lang.String tranPrefix;

    private com.netsuite.webservices.platform.common_2019_1.Address mainAddress;

    private com.netsuite.webservices.platform.common_2019_1.Address returnAddress;

    private com.netsuite.webservices.lists.accounting_2019_1.types.LocationType locationType;

    private com.netsuite.webservices.lists.accounting_2019_1.types.LocationTimeZone timeZone;

    private java.lang.Double latitude;

    private java.lang.Double longitude;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef logo;

    private java.lang.Boolean useBins;

    private java.lang.Boolean makeInventoryAvailable;

    private java.lang.Boolean makeInventoryAvailableStore;

    private com.netsuite.webservices.lists.accounting_2019_1.types.LocationGeolocationMethod geolocationMethod;

    private com.netsuite.webservices.lists.accounting_2019_1.types.LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting;

    private java.util.Calendar nextPickupCutOffTime;

    private java.lang.Long bufferStock;

    private java.lang.Boolean allowStorePickup;

    private java.lang.Double storePickupBufferStock;

    private java.lang.Long dailyShippingCapacity;

    private java.lang.Long totalShippingCapacity;

    private com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList includeLocationRegionsList;

    private com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList excludeLocationRegionsList;

    private com.netsuite.webservices.lists.accounting_2019_1.LocationBusinessHoursList businessHoursList;

    private com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList classTranslationList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Location() {
    }

    public Location(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.Boolean includeChildren,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList,
           java.lang.Boolean isInactive,
           java.lang.String tranPrefix,
           com.netsuite.webservices.platform.common_2019_1.Address mainAddress,
           com.netsuite.webservices.platform.common_2019_1.Address returnAddress,
           com.netsuite.webservices.lists.accounting_2019_1.types.LocationType locationType,
           com.netsuite.webservices.lists.accounting_2019_1.types.LocationTimeZone timeZone,
           java.lang.Double latitude,
           java.lang.Double longitude,
           com.netsuite.webservices.platform.core_2019_1.RecordRef logo,
           java.lang.Boolean useBins,
           java.lang.Boolean makeInventoryAvailable,
           java.lang.Boolean makeInventoryAvailableStore,
           com.netsuite.webservices.lists.accounting_2019_1.types.LocationGeolocationMethod geolocationMethod,
           com.netsuite.webservices.lists.accounting_2019_1.types.LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting,
           java.util.Calendar nextPickupCutOffTime,
           java.lang.Long bufferStock,
           java.lang.Boolean allowStorePickup,
           java.lang.Double storePickupBufferStock,
           java.lang.Long dailyShippingCapacity,
           java.lang.Long totalShippingCapacity,
           com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList includeLocationRegionsList,
           com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList excludeLocationRegionsList,
           com.netsuite.webservices.lists.accounting_2019_1.LocationBusinessHoursList businessHoursList,
           com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList classTranslationList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.parent = parent;
        this.includeChildren = includeChildren;
        this.subsidiaryList = subsidiaryList;
        this.isInactive = isInactive;
        this.tranPrefix = tranPrefix;
        this.mainAddress = mainAddress;
        this.returnAddress = returnAddress;
        this.locationType = locationType;
        this.timeZone = timeZone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.logo = logo;
        this.useBins = useBins;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.geolocationMethod = geolocationMethod;
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
        this.nextPickupCutOffTime = nextPickupCutOffTime;
        this.bufferStock = bufferStock;
        this.allowStorePickup = allowStorePickup;
        this.storePickupBufferStock = storePickupBufferStock;
        this.dailyShippingCapacity = dailyShippingCapacity;
        this.totalShippingCapacity = totalShippingCapacity;
        this.includeLocationRegionsList = includeLocationRegionsList;
        this.excludeLocationRegionsList = excludeLocationRegionsList;
        this.businessHoursList = businessHoursList;
        this.classTranslationList = classTranslationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the name value for this Location.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Location.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this Location.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Location.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the includeChildren value for this Location.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this Location.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the subsidiaryList value for this Location.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this Location.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the isInactive value for this Location.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Location.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the tranPrefix value for this Location.
     * 
     * @return tranPrefix
     */
    public java.lang.String getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this Location.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(java.lang.String tranPrefix) {
        this.tranPrefix = tranPrefix;
    }


    /**
     * Gets the mainAddress value for this Location.
     * 
     * @return mainAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getMainAddress() {
        return mainAddress;
    }


    /**
     * Sets the mainAddress value for this Location.
     * 
     * @param mainAddress
     */
    public void setMainAddress(com.netsuite.webservices.platform.common_2019_1.Address mainAddress) {
        this.mainAddress = mainAddress;
    }


    /**
     * Gets the returnAddress value for this Location.
     * 
     * @return returnAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this Location.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.netsuite.webservices.platform.common_2019_1.Address returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the locationType value for this Location.
     * 
     * @return locationType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.LocationType getLocationType() {
        return locationType;
    }


    /**
     * Sets the locationType value for this Location.
     * 
     * @param locationType
     */
    public void setLocationType(com.netsuite.webservices.lists.accounting_2019_1.types.LocationType locationType) {
        this.locationType = locationType;
    }


    /**
     * Gets the timeZone value for this Location.
     * 
     * @return timeZone
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.LocationTimeZone getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this Location.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.netsuite.webservices.lists.accounting_2019_1.types.LocationTimeZone timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the latitude value for this Location.
     * 
     * @return latitude
     */
    public java.lang.Double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Location.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.Double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this Location.
     * 
     * @return longitude
     */
    public java.lang.Double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Location.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.Double longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the logo value for this Location.
     * 
     * @return logo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this Location.
     * 
     * @param logo
     */
    public void setLogo(com.netsuite.webservices.platform.core_2019_1.RecordRef logo) {
        this.logo = logo;
    }


    /**
     * Gets the useBins value for this Location.
     * 
     * @return useBins
     */
    public java.lang.Boolean getUseBins() {
        return useBins;
    }


    /**
     * Sets the useBins value for this Location.
     * 
     * @param useBins
     */
    public void setUseBins(java.lang.Boolean useBins) {
        this.useBins = useBins;
    }


    /**
     * Gets the makeInventoryAvailable value for this Location.
     * 
     * @return makeInventoryAvailable
     */
    public java.lang.Boolean getMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }


    /**
     * Sets the makeInventoryAvailable value for this Location.
     * 
     * @param makeInventoryAvailable
     */
    public void setMakeInventoryAvailable(java.lang.Boolean makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }


    /**
     * Gets the makeInventoryAvailableStore value for this Location.
     * 
     * @return makeInventoryAvailableStore
     */
    public java.lang.Boolean getMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }


    /**
     * Sets the makeInventoryAvailableStore value for this Location.
     * 
     * @param makeInventoryAvailableStore
     */
    public void setMakeInventoryAvailableStore(java.lang.Boolean makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }


    /**
     * Gets the geolocationMethod value for this Location.
     * 
     * @return geolocationMethod
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.LocationGeolocationMethod getGeolocationMethod() {
        return geolocationMethod;
    }


    /**
     * Sets the geolocationMethod value for this Location.
     * 
     * @param geolocationMethod
     */
    public void setGeolocationMethod(com.netsuite.webservices.lists.accounting_2019_1.types.LocationGeolocationMethod geolocationMethod) {
        this.geolocationMethod = geolocationMethod;
    }


    /**
     * Gets the autoAssignmentRegionSetting value for this Location.
     * 
     * @return autoAssignmentRegionSetting
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.LocationAutoAssignmentRegionSetting getAutoAssignmentRegionSetting() {
        return autoAssignmentRegionSetting;
    }


    /**
     * Sets the autoAssignmentRegionSetting value for this Location.
     * 
     * @param autoAssignmentRegionSetting
     */
    public void setAutoAssignmentRegionSetting(com.netsuite.webservices.lists.accounting_2019_1.types.LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting) {
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
    }


    /**
     * Gets the nextPickupCutOffTime value for this Location.
     * 
     * @return nextPickupCutOffTime
     */
    public java.util.Calendar getNextPickupCutOffTime() {
        return nextPickupCutOffTime;
    }


    /**
     * Sets the nextPickupCutOffTime value for this Location.
     * 
     * @param nextPickupCutOffTime
     */
    public void setNextPickupCutOffTime(java.util.Calendar nextPickupCutOffTime) {
        this.nextPickupCutOffTime = nextPickupCutOffTime;
    }


    /**
     * Gets the bufferStock value for this Location.
     * 
     * @return bufferStock
     */
    public java.lang.Long getBufferStock() {
        return bufferStock;
    }


    /**
     * Sets the bufferStock value for this Location.
     * 
     * @param bufferStock
     */
    public void setBufferStock(java.lang.Long bufferStock) {
        this.bufferStock = bufferStock;
    }


    /**
     * Gets the allowStorePickup value for this Location.
     * 
     * @return allowStorePickup
     */
    public java.lang.Boolean getAllowStorePickup() {
        return allowStorePickup;
    }


    /**
     * Sets the allowStorePickup value for this Location.
     * 
     * @param allowStorePickup
     */
    public void setAllowStorePickup(java.lang.Boolean allowStorePickup) {
        this.allowStorePickup = allowStorePickup;
    }


    /**
     * Gets the storePickupBufferStock value for this Location.
     * 
     * @return storePickupBufferStock
     */
    public java.lang.Double getStorePickupBufferStock() {
        return storePickupBufferStock;
    }


    /**
     * Sets the storePickupBufferStock value for this Location.
     * 
     * @param storePickupBufferStock
     */
    public void setStorePickupBufferStock(java.lang.Double storePickupBufferStock) {
        this.storePickupBufferStock = storePickupBufferStock;
    }


    /**
     * Gets the dailyShippingCapacity value for this Location.
     * 
     * @return dailyShippingCapacity
     */
    public java.lang.Long getDailyShippingCapacity() {
        return dailyShippingCapacity;
    }


    /**
     * Sets the dailyShippingCapacity value for this Location.
     * 
     * @param dailyShippingCapacity
     */
    public void setDailyShippingCapacity(java.lang.Long dailyShippingCapacity) {
        this.dailyShippingCapacity = dailyShippingCapacity;
    }


    /**
     * Gets the totalShippingCapacity value for this Location.
     * 
     * @return totalShippingCapacity
     */
    public java.lang.Long getTotalShippingCapacity() {
        return totalShippingCapacity;
    }


    /**
     * Sets the totalShippingCapacity value for this Location.
     * 
     * @param totalShippingCapacity
     */
    public void setTotalShippingCapacity(java.lang.Long totalShippingCapacity) {
        this.totalShippingCapacity = totalShippingCapacity;
    }


    /**
     * Gets the includeLocationRegionsList value for this Location.
     * 
     * @return includeLocationRegionsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList getIncludeLocationRegionsList() {
        return includeLocationRegionsList;
    }


    /**
     * Sets the includeLocationRegionsList value for this Location.
     * 
     * @param includeLocationRegionsList
     */
    public void setIncludeLocationRegionsList(com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList includeLocationRegionsList) {
        this.includeLocationRegionsList = includeLocationRegionsList;
    }


    /**
     * Gets the excludeLocationRegionsList value for this Location.
     * 
     * @return excludeLocationRegionsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList getExcludeLocationRegionsList() {
        return excludeLocationRegionsList;
    }


    /**
     * Sets the excludeLocationRegionsList value for this Location.
     * 
     * @param excludeLocationRegionsList
     */
    public void setExcludeLocationRegionsList(com.netsuite.webservices.lists.accounting_2019_1.LocationRegionsList excludeLocationRegionsList) {
        this.excludeLocationRegionsList = excludeLocationRegionsList;
    }


    /**
     * Gets the businessHoursList value for this Location.
     * 
     * @return businessHoursList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.LocationBusinessHoursList getBusinessHoursList() {
        return businessHoursList;
    }


    /**
     * Sets the businessHoursList value for this Location.
     * 
     * @param businessHoursList
     */
    public void setBusinessHoursList(com.netsuite.webservices.lists.accounting_2019_1.LocationBusinessHoursList businessHoursList) {
        this.businessHoursList = businessHoursList;
    }


    /**
     * Gets the classTranslationList value for this Location.
     * 
     * @return classTranslationList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }


    /**
     * Sets the classTranslationList value for this Location.
     * 
     * @param classTranslationList
     */
    public void setClassTranslationList(com.netsuite.webservices.lists.accounting_2019_1.ClassTranslationList classTranslationList) {
        this.classTranslationList = classTranslationList;
    }


    /**
     * Gets the customFieldList value for this Location.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Location.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Location.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Location.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Location.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Location.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              this.tranPrefix.equals(other.getTranPrefix()))) &&
            ((this.mainAddress==null && other.getMainAddress()==null) || 
             (this.mainAddress!=null &&
              this.mainAddress.equals(other.getMainAddress()))) &&
            ((this.returnAddress==null && other.getReturnAddress()==null) || 
             (this.returnAddress!=null &&
              this.returnAddress.equals(other.getReturnAddress()))) &&
            ((this.locationType==null && other.getLocationType()==null) || 
             (this.locationType!=null &&
              this.locationType.equals(other.getLocationType()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.useBins==null && other.getUseBins()==null) || 
             (this.useBins!=null &&
              this.useBins.equals(other.getUseBins()))) &&
            ((this.makeInventoryAvailable==null && other.getMakeInventoryAvailable()==null) || 
             (this.makeInventoryAvailable!=null &&
              this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable()))) &&
            ((this.makeInventoryAvailableStore==null && other.getMakeInventoryAvailableStore()==null) || 
             (this.makeInventoryAvailableStore!=null &&
              this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore()))) &&
            ((this.geolocationMethod==null && other.getGeolocationMethod()==null) || 
             (this.geolocationMethod!=null &&
              this.geolocationMethod.equals(other.getGeolocationMethod()))) &&
            ((this.autoAssignmentRegionSetting==null && other.getAutoAssignmentRegionSetting()==null) || 
             (this.autoAssignmentRegionSetting!=null &&
              this.autoAssignmentRegionSetting.equals(other.getAutoAssignmentRegionSetting()))) &&
            ((this.nextPickupCutOffTime==null && other.getNextPickupCutOffTime()==null) || 
             (this.nextPickupCutOffTime!=null &&
              this.nextPickupCutOffTime.equals(other.getNextPickupCutOffTime()))) &&
            ((this.bufferStock==null && other.getBufferStock()==null) || 
             (this.bufferStock!=null &&
              this.bufferStock.equals(other.getBufferStock()))) &&
            ((this.allowStorePickup==null && other.getAllowStorePickup()==null) || 
             (this.allowStorePickup!=null &&
              this.allowStorePickup.equals(other.getAllowStorePickup()))) &&
            ((this.storePickupBufferStock==null && other.getStorePickupBufferStock()==null) || 
             (this.storePickupBufferStock!=null &&
              this.storePickupBufferStock.equals(other.getStorePickupBufferStock()))) &&
            ((this.dailyShippingCapacity==null && other.getDailyShippingCapacity()==null) || 
             (this.dailyShippingCapacity!=null &&
              this.dailyShippingCapacity.equals(other.getDailyShippingCapacity()))) &&
            ((this.totalShippingCapacity==null && other.getTotalShippingCapacity()==null) || 
             (this.totalShippingCapacity!=null &&
              this.totalShippingCapacity.equals(other.getTotalShippingCapacity()))) &&
            ((this.includeLocationRegionsList==null && other.getIncludeLocationRegionsList()==null) || 
             (this.includeLocationRegionsList!=null &&
              this.includeLocationRegionsList.equals(other.getIncludeLocationRegionsList()))) &&
            ((this.excludeLocationRegionsList==null && other.getExcludeLocationRegionsList()==null) || 
             (this.excludeLocationRegionsList!=null &&
              this.excludeLocationRegionsList.equals(other.getExcludeLocationRegionsList()))) &&
            ((this.businessHoursList==null && other.getBusinessHoursList()==null) || 
             (this.businessHoursList!=null &&
              this.businessHoursList.equals(other.getBusinessHoursList()))) &&
            ((this.classTranslationList==null && other.getClassTranslationList()==null) || 
             (this.classTranslationList!=null &&
              this.classTranslationList.equals(other.getClassTranslationList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getTranPrefix() != null) {
            _hashCode += getTranPrefix().hashCode();
        }
        if (getMainAddress() != null) {
            _hashCode += getMainAddress().hashCode();
        }
        if (getReturnAddress() != null) {
            _hashCode += getReturnAddress().hashCode();
        }
        if (getLocationType() != null) {
            _hashCode += getLocationType().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getUseBins() != null) {
            _hashCode += getUseBins().hashCode();
        }
        if (getMakeInventoryAvailable() != null) {
            _hashCode += getMakeInventoryAvailable().hashCode();
        }
        if (getMakeInventoryAvailableStore() != null) {
            _hashCode += getMakeInventoryAvailableStore().hashCode();
        }
        if (getGeolocationMethod() != null) {
            _hashCode += getGeolocationMethod().hashCode();
        }
        if (getAutoAssignmentRegionSetting() != null) {
            _hashCode += getAutoAssignmentRegionSetting().hashCode();
        }
        if (getNextPickupCutOffTime() != null) {
            _hashCode += getNextPickupCutOffTime().hashCode();
        }
        if (getBufferStock() != null) {
            _hashCode += getBufferStock().hashCode();
        }
        if (getAllowStorePickup() != null) {
            _hashCode += getAllowStorePickup().hashCode();
        }
        if (getStorePickupBufferStock() != null) {
            _hashCode += getStorePickupBufferStock().hashCode();
        }
        if (getDailyShippingCapacity() != null) {
            _hashCode += getDailyShippingCapacity().hashCode();
        }
        if (getTotalShippingCapacity() != null) {
            _hashCode += getTotalShippingCapacity().hashCode();
        }
        if (getIncludeLocationRegionsList() != null) {
            _hashCode += getIncludeLocationRegionsList().hashCode();
        }
        if (getExcludeLocationRegionsList() != null) {
            _hashCode += getExcludeLocationRegionsList().hashCode();
        }
        if (getBusinessHoursList() != null) {
            _hashCode += getBusinessHoursList().hashCode();
        }
        if (getClassTranslationList() != null) {
            _hashCode += getClassTranslationList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Location"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "mainAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "locationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "LocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "LocationTimeZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geolocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "geolocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "LocationGeolocationMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAssignmentRegionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "autoAssignmentRegionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "LocationAutoAssignmentRegionSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPickupCutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nextPickupCutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "bufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowStorePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "allowStorePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storePickupBufferStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "storePickupBufferStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyShippingCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "dailyShippingCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalShippingCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "totalShippingCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeLocationRegionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "includeLocationRegionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "LocationRegionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeLocationRegionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "excludeLocationRegionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "LocationRegionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHoursList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "businessHoursList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "LocationBusinessHoursList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classTranslationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "classTranslationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ClassTranslationList"));
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
