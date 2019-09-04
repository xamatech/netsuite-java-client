/**
 * BomSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BomSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableForAllAssemblies;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableForAllLocations;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] legacyBomForAssembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] restrictToAssemblies;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] restrictToLocations;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] revisionName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiaryNoHierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useComponentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] usedOnAssembly;

    public BomSearchRowBasic() {
    }

    public BomSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableForAllAssemblies,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableForAllLocations,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeChildren,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] legacyBomForAssembly,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] restrictToAssemblies,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] restrictToLocations,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] revisionName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiaryNoHierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useComponentYield,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] usedOnAssembly) {
        this.availableForAllAssemblies = availableForAllAssemblies;
        this.availableForAllLocations = availableForAllLocations;
        this.createdDate = createdDate;
        this.externalId = externalId;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.legacyBomForAssembly = legacyBomForAssembly;
        this.memo = memo;
        this.name = name;
        this.restrictToAssemblies = restrictToAssemblies;
        this.restrictToLocations = restrictToLocations;
        this.revisionName = revisionName;
        this.subsidiary = subsidiary;
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
        this.useComponentYield = useComponentYield;
        this.usedOnAssembly = usedOnAssembly;
    }


    /**
     * Gets the availableForAllAssemblies value for this BomSearchRowBasic.
     * 
     * @return availableForAllAssemblies
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableForAllAssemblies() {
        return availableForAllAssemblies;
    }


    /**
     * Sets the availableForAllAssemblies value for this BomSearchRowBasic.
     * 
     * @param availableForAllAssemblies
     */
    public void setAvailableForAllAssemblies(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableForAllAssemblies) {
        this.availableForAllAssemblies = availableForAllAssemblies;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableForAllAssemblies(int i) {
        return this.availableForAllAssemblies[i];
    }

    public void setAvailableForAllAssemblies(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableForAllAssemblies[i] = _value;
    }


    /**
     * Gets the availableForAllLocations value for this BomSearchRowBasic.
     * 
     * @return availableForAllLocations
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableForAllLocations() {
        return availableForAllLocations;
    }


    /**
     * Sets the availableForAllLocations value for this BomSearchRowBasic.
     * 
     * @param availableForAllLocations
     */
    public void setAvailableForAllLocations(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableForAllLocations) {
        this.availableForAllLocations = availableForAllLocations;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableForAllLocations(int i) {
        return this.availableForAllLocations[i];
    }

    public void setAvailableForAllLocations(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableForAllLocations[i] = _value;
    }


    /**
     * Gets the createdDate value for this BomSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BomSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the externalId value for this BomSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BomSearchRowBasic.
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
     * Gets the includeChildren value for this BomSearchRowBasic.
     * 
     * @return includeChildren
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this BomSearchRowBasic.
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
     * Gets the internalId value for this BomSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BomSearchRowBasic.
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
     * Gets the isInactive value for this BomSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this BomSearchRowBasic.
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
     * Gets the legacyBomForAssembly value for this BomSearchRowBasic.
     * 
     * @return legacyBomForAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLegacyBomForAssembly() {
        return legacyBomForAssembly;
    }


    /**
     * Sets the legacyBomForAssembly value for this BomSearchRowBasic.
     * 
     * @param legacyBomForAssembly
     */
    public void setLegacyBomForAssembly(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] legacyBomForAssembly) {
        this.legacyBomForAssembly = legacyBomForAssembly;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLegacyBomForAssembly(int i) {
        return this.legacyBomForAssembly[i];
    }

    public void setLegacyBomForAssembly(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.legacyBomForAssembly[i] = _value;
    }


    /**
     * Gets the memo value for this BomSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this BomSearchRowBasic.
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
     * Gets the name value for this BomSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this BomSearchRowBasic.
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
     * Gets the restrictToAssemblies value for this BomSearchRowBasic.
     * 
     * @return restrictToAssemblies
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRestrictToAssemblies() {
        return restrictToAssemblies;
    }


    /**
     * Sets the restrictToAssemblies value for this BomSearchRowBasic.
     * 
     * @param restrictToAssemblies
     */
    public void setRestrictToAssemblies(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] restrictToAssemblies) {
        this.restrictToAssemblies = restrictToAssemblies;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRestrictToAssemblies(int i) {
        return this.restrictToAssemblies[i];
    }

    public void setRestrictToAssemblies(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.restrictToAssemblies[i] = _value;
    }


    /**
     * Gets the restrictToLocations value for this BomSearchRowBasic.
     * 
     * @return restrictToLocations
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRestrictToLocations() {
        return restrictToLocations;
    }


    /**
     * Sets the restrictToLocations value for this BomSearchRowBasic.
     * 
     * @param restrictToLocations
     */
    public void setRestrictToLocations(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] restrictToLocations) {
        this.restrictToLocations = restrictToLocations;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRestrictToLocations(int i) {
        return this.restrictToLocations[i];
    }

    public void setRestrictToLocations(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.restrictToLocations[i] = _value;
    }


    /**
     * Gets the revisionName value for this BomSearchRowBasic.
     * 
     * @return revisionName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRevisionName() {
        return revisionName;
    }


    /**
     * Sets the revisionName value for this BomSearchRowBasic.
     * 
     * @param revisionName
     */
    public void setRevisionName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] revisionName) {
        this.revisionName = revisionName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRevisionName(int i) {
        return this.revisionName[i];
    }

    public void setRevisionName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.revisionName[i] = _value;
    }


    /**
     * Gets the subsidiary value for this BomSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this BomSearchRowBasic.
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
     * Gets the subsidiaryNoHierarchy value for this BomSearchRowBasic.
     * 
     * @return subsidiaryNoHierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiaryNoHierarchy() {
        return subsidiaryNoHierarchy;
    }


    /**
     * Sets the subsidiaryNoHierarchy value for this BomSearchRowBasic.
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
     * Gets the useComponentYield value for this BomSearchRowBasic.
     * 
     * @return useComponentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUseComponentYield() {
        return useComponentYield;
    }


    /**
     * Sets the useComponentYield value for this BomSearchRowBasic.
     * 
     * @param useComponentYield
     */
    public void setUseComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUseComponentYield(int i) {
        return this.useComponentYield[i];
    }

    public void setUseComponentYield(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.useComponentYield[i] = _value;
    }


    /**
     * Gets the usedOnAssembly value for this BomSearchRowBasic.
     * 
     * @return usedOnAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUsedOnAssembly() {
        return usedOnAssembly;
    }


    /**
     * Sets the usedOnAssembly value for this BomSearchRowBasic.
     * 
     * @param usedOnAssembly
     */
    public void setUsedOnAssembly(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] usedOnAssembly) {
        this.usedOnAssembly = usedOnAssembly;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUsedOnAssembly(int i) {
        return this.usedOnAssembly[i];
    }

    public void setUsedOnAssembly(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.usedOnAssembly[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomSearchRowBasic)) return false;
        BomSearchRowBasic other = (BomSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableForAllAssemblies==null && other.getAvailableForAllAssemblies()==null) || 
             (this.availableForAllAssemblies!=null &&
              java.util.Arrays.equals(this.availableForAllAssemblies, other.getAvailableForAllAssemblies()))) &&
            ((this.availableForAllLocations==null && other.getAvailableForAllLocations()==null) || 
             (this.availableForAllLocations!=null &&
              java.util.Arrays.equals(this.availableForAllLocations, other.getAvailableForAllLocations()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              java.util.Arrays.equals(this.includeChildren, other.getIncludeChildren()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.legacyBomForAssembly==null && other.getLegacyBomForAssembly()==null) || 
             (this.legacyBomForAssembly!=null &&
              java.util.Arrays.equals(this.legacyBomForAssembly, other.getLegacyBomForAssembly()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.restrictToAssemblies==null && other.getRestrictToAssemblies()==null) || 
             (this.restrictToAssemblies!=null &&
              java.util.Arrays.equals(this.restrictToAssemblies, other.getRestrictToAssemblies()))) &&
            ((this.restrictToLocations==null && other.getRestrictToLocations()==null) || 
             (this.restrictToLocations!=null &&
              java.util.Arrays.equals(this.restrictToLocations, other.getRestrictToLocations()))) &&
            ((this.revisionName==null && other.getRevisionName()==null) || 
             (this.revisionName!=null &&
              java.util.Arrays.equals(this.revisionName, other.getRevisionName()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.subsidiaryNoHierarchy==null && other.getSubsidiaryNoHierarchy()==null) || 
             (this.subsidiaryNoHierarchy!=null &&
              java.util.Arrays.equals(this.subsidiaryNoHierarchy, other.getSubsidiaryNoHierarchy()))) &&
            ((this.useComponentYield==null && other.getUseComponentYield()==null) || 
             (this.useComponentYield!=null &&
              java.util.Arrays.equals(this.useComponentYield, other.getUseComponentYield()))) &&
            ((this.usedOnAssembly==null && other.getUsedOnAssembly()==null) || 
             (this.usedOnAssembly!=null &&
              java.util.Arrays.equals(this.usedOnAssembly, other.getUsedOnAssembly())));
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
        if (getAvailableForAllAssemblies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableForAllAssemblies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableForAllAssemblies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableForAllLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableForAllLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableForAllLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
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
        if (getLegacyBomForAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegacyBomForAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegacyBomForAssembly(), i);
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
        if (getRestrictToAssemblies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRestrictToAssemblies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRestrictToAssemblies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRestrictToLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRestrictToLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRestrictToLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevisionName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevisionName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevisionName(), i);
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
        if (getUseComponentYield() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseComponentYield());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseComponentYield(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsedOnAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsedOnAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsedOnAssembly(), i);
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
        new org.apache.axis.description.TypeDesc(BomSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BomSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForAllAssemblies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableForAllAssemblies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForAllLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableForAllLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legacyBomForAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "legacyBomForAssembly"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToAssemblies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "restrictToAssemblies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "restrictToLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revisionName"));
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
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedOnAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "usedOnAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
