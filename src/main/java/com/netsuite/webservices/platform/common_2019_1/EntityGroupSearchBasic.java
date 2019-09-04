/**
 * EntityGroupSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class EntityGroupSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField groupName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupOwner;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDynamic;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isManufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrivate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField laborResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField machineResources;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public EntityGroupSearchBasic() {
    }

    public EntityGroupSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField groupName,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupOwner,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDynamic,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isManufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrivate,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField laborResources,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField machineResources,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.email = email;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.groupName = groupName;
        this.groupOwner = groupOwner;
        this.groupType = groupType;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDynamic = isDynamic;
        this.isInactive = isInactive;
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
        this.isPrivate = isPrivate;
        this.laborResources = laborResources;
        this.lastModifiedDate = lastModifiedDate;
        this.machineResources = machineResources;
        this.subsidiary = subsidiary;
        this.workCalendar = workCalendar;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the email value for this EntityGroupSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EntityGroupSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the externalId value for this EntityGroupSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EntityGroupSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this EntityGroupSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this EntityGroupSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the groupName value for this EntityGroupSearchBasic.
     * 
     * @return groupName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this EntityGroupSearchBasic.
     * 
     * @param groupName
     */
    public void setGroupName(com.netsuite.webservices.platform.core_2019_1.SearchStringField groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupOwner value for this EntityGroupSearchBasic.
     * 
     * @return groupOwner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getGroupOwner() {
        return groupOwner;
    }


    /**
     * Sets the groupOwner value for this EntityGroupSearchBasic.
     * 
     * @param groupOwner
     */
    public void setGroupOwner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupOwner) {
        this.groupOwner = groupOwner;
    }


    /**
     * Gets the groupType value for this EntityGroupSearchBasic.
     * 
     * @return groupType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this EntityGroupSearchBasic.
     * 
     * @param groupType
     */
    public void setGroupType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupType) {
        this.groupType = groupType;
    }


    /**
     * Gets the internalId value for this EntityGroupSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EntityGroupSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this EntityGroupSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this EntityGroupSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDynamic value for this EntityGroupSearchBasic.
     * 
     * @return isDynamic
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDynamic() {
        return isDynamic;
    }


    /**
     * Sets the isDynamic value for this EntityGroupSearchBasic.
     * 
     * @param isDynamic
     */
    public void setIsDynamic(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDynamic) {
        this.isDynamic = isDynamic;
    }


    /**
     * Gets the isInactive value for this EntityGroupSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EntityGroupSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isManufacturingWorkCenter value for this EntityGroupSearchBasic.
     * 
     * @return isManufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsManufacturingWorkCenter() {
        return isManufacturingWorkCenter;
    }


    /**
     * Sets the isManufacturingWorkCenter value for this EntityGroupSearchBasic.
     * 
     * @param isManufacturingWorkCenter
     */
    public void setIsManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isManufacturingWorkCenter) {
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
    }


    /**
     * Gets the isPrivate value for this EntityGroupSearchBasic.
     * 
     * @return isPrivate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this EntityGroupSearchBasic.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the laborResources value for this EntityGroupSearchBasic.
     * 
     * @return laborResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this EntityGroupSearchBasic.
     * 
     * @param laborResources
     */
    public void setLaborResources(com.netsuite.webservices.platform.core_2019_1.SearchLongField laborResources) {
        this.laborResources = laborResources;
    }


    /**
     * Gets the lastModifiedDate value for this EntityGroupSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EntityGroupSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the machineResources value for this EntityGroupSearchBasic.
     * 
     * @return machineResources
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this EntityGroupSearchBasic.
     * 
     * @param machineResources
     */
    public void setMachineResources(com.netsuite.webservices.platform.core_2019_1.SearchLongField machineResources) {
        this.machineResources = machineResources;
    }


    /**
     * Gets the subsidiary value for this EntityGroupSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EntityGroupSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the workCalendar value for this EntityGroupSearchBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this EntityGroupSearchBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the customFieldList value for this EntityGroupSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EntityGroupSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityGroupSearchBasic)) return false;
        EntityGroupSearchBasic other = (EntityGroupSearchBasic) obj;
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
              this.email.equals(other.getEmail()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupOwner==null && other.getGroupOwner()==null) || 
             (this.groupOwner!=null &&
              this.groupOwner.equals(other.getGroupOwner()))) &&
            ((this.groupType==null && other.getGroupType()==null) || 
             (this.groupType!=null &&
              this.groupType.equals(other.getGroupType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDynamic==null && other.getIsDynamic()==null) || 
             (this.isDynamic!=null &&
              this.isDynamic.equals(other.getIsDynamic()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isManufacturingWorkCenter==null && other.getIsManufacturingWorkCenter()==null) || 
             (this.isManufacturingWorkCenter!=null &&
              this.isManufacturingWorkCenter.equals(other.getIsManufacturingWorkCenter()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              this.laborResources.equals(other.getLaborResources()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              this.machineResources.equals(other.getMachineResources()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar()))) &&
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
            _hashCode += getEmail().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupOwner() != null) {
            _hashCode += getGroupOwner().hashCode();
        }
        if (getGroupType() != null) {
            _hashCode += getGroupType().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDynamic() != null) {
            _hashCode += getIsDynamic().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsManufacturingWorkCenter() != null) {
            _hashCode += getIsManufacturingWorkCenter().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getLaborResources() != null) {
            _hashCode += getLaborResources().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getMachineResources() != null) {
            _hashCode += getMachineResources().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityGroupSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityGroupSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isDynamic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDynamic"));
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
        elemField.setFieldName("isManufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isManufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
