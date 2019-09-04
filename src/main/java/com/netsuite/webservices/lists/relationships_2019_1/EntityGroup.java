/**
 * EntityGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class EntityGroup  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String groupName;

    private com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType groupType;

    private java.lang.String email;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef groupOwner;

    private java.lang.Boolean isSavedSearch;

    private com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType parentGroupType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef savedSearch;

    private java.lang.Boolean isSalesTeam;

    private java.lang.String comments;

    private java.lang.Boolean isPrivate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef restrictionGroup;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean isSalesRep;

    private java.lang.Boolean isSupportRep;

    private java.lang.Boolean isProductTeam;

    private java.lang.Boolean isFunctionalTeam;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueRole;

    private java.lang.Boolean isManufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private java.lang.Long machineResources;

    private java.lang.Long laborResources;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public EntityGroup() {
    }

    public EntityGroup(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String groupName,
           com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType groupType,
           java.lang.String email,
           com.netsuite.webservices.platform.core_2019_1.RecordRef groupOwner,
           java.lang.Boolean isSavedSearch,
           com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType parentGroupType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef savedSearch,
           java.lang.Boolean isSalesTeam,
           java.lang.String comments,
           java.lang.Boolean isPrivate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef restrictionGroup,
           java.lang.Boolean isInactive,
           java.lang.Boolean isSalesRep,
           java.lang.Boolean isSupportRep,
           java.lang.Boolean isProductTeam,
           java.lang.Boolean isFunctionalTeam,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueRole,
           java.lang.Boolean isManufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           java.lang.Long machineResources,
           java.lang.Long laborResources,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.email = email;
        this.groupOwner = groupOwner;
        this.isSavedSearch = isSavedSearch;
        this.parentGroupType = parentGroupType;
        this.savedSearch = savedSearch;
        this.isSalesTeam = isSalesTeam;
        this.comments = comments;
        this.isPrivate = isPrivate;
        this.restrictionGroup = restrictionGroup;
        this.isInactive = isInactive;
        this.isSalesRep = isSalesRep;
        this.isSupportRep = isSupportRep;
        this.isProductTeam = isProductTeam;
        this.isFunctionalTeam = isFunctionalTeam;
        this.issueRole = issueRole;
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
        this.subsidiary = subsidiary;
        this.machineResources = machineResources;
        this.laborResources = laborResources;
        this.workCalendar = workCalendar;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the groupName value for this EntityGroup.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this EntityGroup.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupType value for this EntityGroup.
     * 
     * @return groupType
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this EntityGroup.
     * 
     * @param groupType
     */
    public void setGroupType(com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType groupType) {
        this.groupType = groupType;
    }


    /**
     * Gets the email value for this EntityGroup.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EntityGroup.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the groupOwner value for this EntityGroup.
     * 
     * @return groupOwner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getGroupOwner() {
        return groupOwner;
    }


    /**
     * Sets the groupOwner value for this EntityGroup.
     * 
     * @param groupOwner
     */
    public void setGroupOwner(com.netsuite.webservices.platform.core_2019_1.RecordRef groupOwner) {
        this.groupOwner = groupOwner;
    }


    /**
     * Gets the isSavedSearch value for this EntityGroup.
     * 
     * @return isSavedSearch
     */
    public java.lang.Boolean getIsSavedSearch() {
        return isSavedSearch;
    }


    /**
     * Sets the isSavedSearch value for this EntityGroup.
     * 
     * @param isSavedSearch
     */
    public void setIsSavedSearch(java.lang.Boolean isSavedSearch) {
        this.isSavedSearch = isSavedSearch;
    }


    /**
     * Gets the parentGroupType value for this EntityGroup.
     * 
     * @return parentGroupType
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType getParentGroupType() {
        return parentGroupType;
    }


    /**
     * Sets the parentGroupType value for this EntityGroup.
     * 
     * @param parentGroupType
     */
    public void setParentGroupType(com.netsuite.webservices.lists.relationships_2019_1.types.EntityGroupType parentGroupType) {
        this.parentGroupType = parentGroupType;
    }


    /**
     * Gets the savedSearch value for this EntityGroup.
     * 
     * @return savedSearch
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSavedSearch() {
        return savedSearch;
    }


    /**
     * Sets the savedSearch value for this EntityGroup.
     * 
     * @param savedSearch
     */
    public void setSavedSearch(com.netsuite.webservices.platform.core_2019_1.RecordRef savedSearch) {
        this.savedSearch = savedSearch;
    }


    /**
     * Gets the isSalesTeam value for this EntityGroup.
     * 
     * @return isSalesTeam
     */
    public java.lang.Boolean getIsSalesTeam() {
        return isSalesTeam;
    }


    /**
     * Sets the isSalesTeam value for this EntityGroup.
     * 
     * @param isSalesTeam
     */
    public void setIsSalesTeam(java.lang.Boolean isSalesTeam) {
        this.isSalesTeam = isSalesTeam;
    }


    /**
     * Gets the comments value for this EntityGroup.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EntityGroup.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the isPrivate value for this EntityGroup.
     * 
     * @return isPrivate
     */
    public java.lang.Boolean getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this EntityGroup.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(java.lang.Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the restrictionGroup value for this EntityGroup.
     * 
     * @return restrictionGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRestrictionGroup() {
        return restrictionGroup;
    }


    /**
     * Sets the restrictionGroup value for this EntityGroup.
     * 
     * @param restrictionGroup
     */
    public void setRestrictionGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef restrictionGroup) {
        this.restrictionGroup = restrictionGroup;
    }


    /**
     * Gets the isInactive value for this EntityGroup.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EntityGroup.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isSalesRep value for this EntityGroup.
     * 
     * @return isSalesRep
     */
    public java.lang.Boolean getIsSalesRep() {
        return isSalesRep;
    }


    /**
     * Sets the isSalesRep value for this EntityGroup.
     * 
     * @param isSalesRep
     */
    public void setIsSalesRep(java.lang.Boolean isSalesRep) {
        this.isSalesRep = isSalesRep;
    }


    /**
     * Gets the isSupportRep value for this EntityGroup.
     * 
     * @return isSupportRep
     */
    public java.lang.Boolean getIsSupportRep() {
        return isSupportRep;
    }


    /**
     * Sets the isSupportRep value for this EntityGroup.
     * 
     * @param isSupportRep
     */
    public void setIsSupportRep(java.lang.Boolean isSupportRep) {
        this.isSupportRep = isSupportRep;
    }


    /**
     * Gets the isProductTeam value for this EntityGroup.
     * 
     * @return isProductTeam
     */
    public java.lang.Boolean getIsProductTeam() {
        return isProductTeam;
    }


    /**
     * Sets the isProductTeam value for this EntityGroup.
     * 
     * @param isProductTeam
     */
    public void setIsProductTeam(java.lang.Boolean isProductTeam) {
        this.isProductTeam = isProductTeam;
    }


    /**
     * Gets the isFunctionalTeam value for this EntityGroup.
     * 
     * @return isFunctionalTeam
     */
    public java.lang.Boolean getIsFunctionalTeam() {
        return isFunctionalTeam;
    }


    /**
     * Sets the isFunctionalTeam value for this EntityGroup.
     * 
     * @param isFunctionalTeam
     */
    public void setIsFunctionalTeam(java.lang.Boolean isFunctionalTeam) {
        this.isFunctionalTeam = isFunctionalTeam;
    }


    /**
     * Gets the issueRole value for this EntityGroup.
     * 
     * @return issueRole
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueRole() {
        return issueRole;
    }


    /**
     * Sets the issueRole value for this EntityGroup.
     * 
     * @param issueRole
     */
    public void setIssueRole(com.netsuite.webservices.platform.core_2019_1.RecordRef issueRole) {
        this.issueRole = issueRole;
    }


    /**
     * Gets the isManufacturingWorkCenter value for this EntityGroup.
     * 
     * @return isManufacturingWorkCenter
     */
    public java.lang.Boolean getIsManufacturingWorkCenter() {
        return isManufacturingWorkCenter;
    }


    /**
     * Sets the isManufacturingWorkCenter value for this EntityGroup.
     * 
     * @param isManufacturingWorkCenter
     */
    public void setIsManufacturingWorkCenter(java.lang.Boolean isManufacturingWorkCenter) {
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
    }


    /**
     * Gets the subsidiary value for this EntityGroup.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EntityGroup.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the machineResources value for this EntityGroup.
     * 
     * @return machineResources
     */
    public java.lang.Long getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this EntityGroup.
     * 
     * @param machineResources
     */
    public void setMachineResources(java.lang.Long machineResources) {
        this.machineResources = machineResources;
    }


    /**
     * Gets the laborResources value for this EntityGroup.
     * 
     * @return laborResources
     */
    public java.lang.Long getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this EntityGroup.
     * 
     * @param laborResources
     */
    public void setLaborResources(java.lang.Long laborResources) {
        this.laborResources = laborResources;
    }


    /**
     * Gets the workCalendar value for this EntityGroup.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this EntityGroup.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.RecordRef workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the customFieldList value for this EntityGroup.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EntityGroup.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this EntityGroup.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EntityGroup.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this EntityGroup.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EntityGroup.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityGroup)) return false;
        EntityGroup other = (EntityGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupType==null && other.getGroupType()==null) || 
             (this.groupType!=null &&
              this.groupType.equals(other.getGroupType()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.groupOwner==null && other.getGroupOwner()==null) || 
             (this.groupOwner!=null &&
              this.groupOwner.equals(other.getGroupOwner()))) &&
            ((this.isSavedSearch==null && other.getIsSavedSearch()==null) || 
             (this.isSavedSearch!=null &&
              this.isSavedSearch.equals(other.getIsSavedSearch()))) &&
            ((this.parentGroupType==null && other.getParentGroupType()==null) || 
             (this.parentGroupType!=null &&
              this.parentGroupType.equals(other.getParentGroupType()))) &&
            ((this.savedSearch==null && other.getSavedSearch()==null) || 
             (this.savedSearch!=null &&
              this.savedSearch.equals(other.getSavedSearch()))) &&
            ((this.isSalesTeam==null && other.getIsSalesTeam()==null) || 
             (this.isSalesTeam!=null &&
              this.isSalesTeam.equals(other.getIsSalesTeam()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.restrictionGroup==null && other.getRestrictionGroup()==null) || 
             (this.restrictionGroup!=null &&
              this.restrictionGroup.equals(other.getRestrictionGroup()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isSalesRep==null && other.getIsSalesRep()==null) || 
             (this.isSalesRep!=null &&
              this.isSalesRep.equals(other.getIsSalesRep()))) &&
            ((this.isSupportRep==null && other.getIsSupportRep()==null) || 
             (this.isSupportRep!=null &&
              this.isSupportRep.equals(other.getIsSupportRep()))) &&
            ((this.isProductTeam==null && other.getIsProductTeam()==null) || 
             (this.isProductTeam!=null &&
              this.isProductTeam.equals(other.getIsProductTeam()))) &&
            ((this.isFunctionalTeam==null && other.getIsFunctionalTeam()==null) || 
             (this.isFunctionalTeam!=null &&
              this.isFunctionalTeam.equals(other.getIsFunctionalTeam()))) &&
            ((this.issueRole==null && other.getIssueRole()==null) || 
             (this.issueRole!=null &&
              this.issueRole.equals(other.getIssueRole()))) &&
            ((this.isManufacturingWorkCenter==null && other.getIsManufacturingWorkCenter()==null) || 
             (this.isManufacturingWorkCenter!=null &&
              this.isManufacturingWorkCenter.equals(other.getIsManufacturingWorkCenter()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              this.machineResources.equals(other.getMachineResources()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              this.laborResources.equals(other.getLaborResources()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar()))) &&
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
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupType() != null) {
            _hashCode += getGroupType().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getGroupOwner() != null) {
            _hashCode += getGroupOwner().hashCode();
        }
        if (getIsSavedSearch() != null) {
            _hashCode += getIsSavedSearch().hashCode();
        }
        if (getParentGroupType() != null) {
            _hashCode += getParentGroupType().hashCode();
        }
        if (getSavedSearch() != null) {
            _hashCode += getSavedSearch().hashCode();
        }
        if (getIsSalesTeam() != null) {
            _hashCode += getIsSalesTeam().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getRestrictionGroup() != null) {
            _hashCode += getRestrictionGroup().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsSalesRep() != null) {
            _hashCode += getIsSalesRep().hashCode();
        }
        if (getIsSupportRep() != null) {
            _hashCode += getIsSupportRep().hashCode();
        }
        if (getIsProductTeam() != null) {
            _hashCode += getIsProductTeam().hashCode();
        }
        if (getIsFunctionalTeam() != null) {
            _hashCode += getIsFunctionalTeam().hashCode();
        }
        if (getIssueRole() != null) {
            _hashCode += getIssueRole().hashCode();
        }
        if (getIsManufacturingWorkCenter() != null) {
            _hashCode += getIsManufacturingWorkCenter().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getMachineResources() != null) {
            _hashCode += getMachineResources().hashCode();
        }
        if (getLaborResources() != null) {
            _hashCode += getLaborResources().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
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
        new org.apache.axis.description.TypeDesc(EntityGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "EntityGroup"));
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
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "groupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "EntityGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "groupOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSavedSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isSavedSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "EntityGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savedSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "savedSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isSalesTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictionGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "restrictionGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isSalesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSupportRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isSupportRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isProductTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFunctionalTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isFunctionalTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "issueRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isManufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isManufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
