/**
 * EntityGroupSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class EntityGroupSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDynamic;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isManufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPrivate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] laborResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] machineResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] savedSearch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] size;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public EntityGroupSearchRowBasic() {
    }

    public EntityGroupSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDynamic,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isManufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPrivate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] laborResources,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] machineResources,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] savedSearch,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] size,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.email = email;
        this.externalId = externalId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.internalId = internalId;
        this.isDynamic = isDynamic;
        this.isInactive = isInactive;
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
        this.isPrivate = isPrivate;
        this.laborResources = laborResources;
        this.lastModifiedDate = lastModifiedDate;
        this.machineResources = machineResources;
        this.owner = owner;
        this.savedSearch = savedSearch;
        this.size = size;
        this.subsidiary = subsidiary;
        this.workCalendar = workCalendar;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the email value for this EntityGroupSearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EntityGroupSearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email) {
        this.email = email;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the externalId value for this EntityGroupSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EntityGroupSearchRowBasic.
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
     * Gets the groupName value for this EntityGroupSearchRowBasic.
     * 
     * @return groupName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this EntityGroupSearchRowBasic.
     * 
     * @param groupName
     */
    public void setGroupName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupName) {
        this.groupName = groupName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGroupName(int i) {
        return this.groupName[i];
    }

    public void setGroupName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.groupName[i] = _value;
    }


    /**
     * Gets the groupType value for this EntityGroupSearchRowBasic.
     * 
     * @return groupType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this EntityGroupSearchRowBasic.
     * 
     * @param groupType
     */
    public void setGroupType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupType) {
        this.groupType = groupType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGroupType(int i) {
        return this.groupType[i];
    }

    public void setGroupType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.groupType[i] = _value;
    }


    /**
     * Gets the internalId value for this EntityGroupSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EntityGroupSearchRowBasic.
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
     * Gets the isDynamic value for this EntityGroupSearchRowBasic.
     * 
     * @return isDynamic
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDynamic() {
        return isDynamic;
    }


    /**
     * Sets the isDynamic value for this EntityGroupSearchRowBasic.
     * 
     * @param isDynamic
     */
    public void setIsDynamic(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDynamic) {
        this.isDynamic = isDynamic;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsDynamic(int i) {
        return this.isDynamic[i];
    }

    public void setIsDynamic(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isDynamic[i] = _value;
    }


    /**
     * Gets the isInactive value for this EntityGroupSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EntityGroupSearchRowBasic.
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
     * Gets the isManufacturingWorkCenter value for this EntityGroupSearchRowBasic.
     * 
     * @return isManufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsManufacturingWorkCenter() {
        return isManufacturingWorkCenter;
    }


    /**
     * Sets the isManufacturingWorkCenter value for this EntityGroupSearchRowBasic.
     * 
     * @param isManufacturingWorkCenter
     */
    public void setIsManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isManufacturingWorkCenter) {
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsManufacturingWorkCenter(int i) {
        return this.isManufacturingWorkCenter[i];
    }

    public void setIsManufacturingWorkCenter(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isManufacturingWorkCenter[i] = _value;
    }


    /**
     * Gets the isPrivate value for this EntityGroupSearchRowBasic.
     * 
     * @return isPrivate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this EntityGroupSearchRowBasic.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPrivate) {
        this.isPrivate = isPrivate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsPrivate(int i) {
        return this.isPrivate[i];
    }

    public void setIsPrivate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isPrivate[i] = _value;
    }


    /**
     * Gets the laborResources value for this EntityGroupSearchRowBasic.
     * 
     * @return laborResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this EntityGroupSearchRowBasic.
     * 
     * @param laborResources
     */
    public void setLaborResources(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] laborResources) {
        this.laborResources = laborResources;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLaborResources(int i) {
        return this.laborResources[i];
    }

    public void setLaborResources(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.laborResources[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this EntityGroupSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EntityGroupSearchRowBasic.
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
     * Gets the machineResources value for this EntityGroupSearchRowBasic.
     * 
     * @return machineResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this EntityGroupSearchRowBasic.
     * 
     * @param machineResources
     */
    public void setMachineResources(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] machineResources) {
        this.machineResources = machineResources;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getMachineResources(int i) {
        return this.machineResources[i];
    }

    public void setMachineResources(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.machineResources[i] = _value;
    }


    /**
     * Gets the owner value for this EntityGroupSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this EntityGroupSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the savedSearch value for this EntityGroupSearchRowBasic.
     * 
     * @return savedSearch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSavedSearch() {
        return savedSearch;
    }


    /**
     * Sets the savedSearch value for this EntityGroupSearchRowBasic.
     * 
     * @param savedSearch
     */
    public void setSavedSearch(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] savedSearch) {
        this.savedSearch = savedSearch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSavedSearch(int i) {
        return this.savedSearch[i];
    }

    public void setSavedSearch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.savedSearch[i] = _value;
    }


    /**
     * Gets the size value for this EntityGroupSearchRowBasic.
     * 
     * @return size
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getSize() {
        return size;
    }


    /**
     * Sets the size value for this EntityGroupSearchRowBasic.
     * 
     * @param size
     */
    public void setSize(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] size) {
        this.size = size;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getSize(int i) {
        return this.size[i];
    }

    public void setSize(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.size[i] = _value;
    }


    /**
     * Gets the subsidiary value for this EntityGroupSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EntityGroupSearchRowBasic.
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
     * Gets the workCalendar value for this EntityGroupSearchRowBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this EntityGroupSearchRowBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.workCalendar[i] = _value;
    }


    /**
     * Gets the customFieldList value for this EntityGroupSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EntityGroupSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityGroupSearchRowBasic)) return false;
        EntityGroupSearchRowBasic other = (EntityGroupSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              java.util.Arrays.equals(this.groupName, other.getGroupName()))) &&
            ((this.groupType==null && other.getGroupType()==null) || 
             (this.groupType!=null &&
              java.util.Arrays.equals(this.groupType, other.getGroupType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isDynamic==null && other.getIsDynamic()==null) || 
             (this.isDynamic!=null &&
              java.util.Arrays.equals(this.isDynamic, other.getIsDynamic()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isManufacturingWorkCenter==null && other.getIsManufacturingWorkCenter()==null) || 
             (this.isManufacturingWorkCenter!=null &&
              java.util.Arrays.equals(this.isManufacturingWorkCenter, other.getIsManufacturingWorkCenter()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              java.util.Arrays.equals(this.isPrivate, other.getIsPrivate()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              java.util.Arrays.equals(this.laborResources, other.getLaborResources()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              java.util.Arrays.equals(this.machineResources, other.getMachineResources()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.savedSearch==null && other.getSavedSearch()==null) || 
             (this.savedSearch!=null &&
              java.util.Arrays.equals(this.savedSearch, other.getSavedSearch()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              java.util.Arrays.equals(this.size, other.getSize()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              java.util.Arrays.equals(this.workCalendar, other.getWorkCalendar()))) &&
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
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
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
        if (getGroupName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupType(), i);
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
        if (getIsDynamic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDynamic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDynamic(), i);
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
        if (getIsManufacturingWorkCenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsManufacturingWorkCenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsManufacturingWorkCenter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsPrivate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsPrivate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsPrivate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLaborResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLaborResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLaborResources(), i);
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
        if (getMachineResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMachineResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMachineResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSavedSearch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSavedSearch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSavedSearch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSize(), i);
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
        if (getWorkCalendar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkCalendar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkCalendar(), i);
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
        new org.apache.axis.description.TypeDesc(EntityGroupSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityGroupSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
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
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isDynamic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDynamic"));
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
        elemField.setFieldName("isManufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isManufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savedSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "savedSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "workCalendar"));
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
