/**
 * ResourceAllocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class ResourceAllocation  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef requestedby;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationApprovalStatus approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef allocationResource;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef project;

    private java.lang.String notes;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Double allocationAmount;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationAllocationUnit allocationUnit;

    private java.lang.Double numberHours;

    private java.lang.Double percentOfTime;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef allocationType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ResourceAllocation() {
    }

    public ResourceAllocation(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef requestedby,
           com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationApprovalStatus approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover,
           com.netsuite.webservices.platform.core_2019_1.RecordRef allocationResource,
           com.netsuite.webservices.platform.core_2019_1.RecordRef project,
           java.lang.String notes,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Double allocationAmount,
           com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationAllocationUnit allocationUnit,
           java.lang.Double numberHours,
           java.lang.Double percentOfTime,
           com.netsuite.webservices.platform.core_2019_1.RecordRef allocationType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.requestedby = requestedby;
        this.approvalStatus = approvalStatus;
        this.nextApprover = nextApprover;
        this.allocationResource = allocationResource;
        this.project = project;
        this.notes = notes;
        this.startDate = startDate;
        this.endDate = endDate;
        this.allocationAmount = allocationAmount;
        this.allocationUnit = allocationUnit;
        this.numberHours = numberHours;
        this.percentOfTime = percentOfTime;
        this.allocationType = allocationType;
        this.customForm = customForm;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the requestedby value for this ResourceAllocation.
     * 
     * @return requestedby
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRequestedby() {
        return requestedby;
    }


    /**
     * Sets the requestedby value for this ResourceAllocation.
     * 
     * @param requestedby
     */
    public void setRequestedby(com.netsuite.webservices.platform.core_2019_1.RecordRef requestedby) {
        this.requestedby = requestedby;
    }


    /**
     * Gets the approvalStatus value for this ResourceAllocation.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this ResourceAllocation.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the nextApprover value for this ResourceAllocation.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this ResourceAllocation.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the allocationResource value for this ResourceAllocation.
     * 
     * @return allocationResource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAllocationResource() {
        return allocationResource;
    }


    /**
     * Sets the allocationResource value for this ResourceAllocation.
     * 
     * @param allocationResource
     */
    public void setAllocationResource(com.netsuite.webservices.platform.core_2019_1.RecordRef allocationResource) {
        this.allocationResource = allocationResource;
    }


    /**
     * Gets the project value for this ResourceAllocation.
     * 
     * @return project
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProject() {
        return project;
    }


    /**
     * Sets the project value for this ResourceAllocation.
     * 
     * @param project
     */
    public void setProject(com.netsuite.webservices.platform.core_2019_1.RecordRef project) {
        this.project = project;
    }


    /**
     * Gets the notes value for this ResourceAllocation.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ResourceAllocation.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the startDate value for this ResourceAllocation.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ResourceAllocation.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ResourceAllocation.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ResourceAllocation.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the allocationAmount value for this ResourceAllocation.
     * 
     * @return allocationAmount
     */
    public java.lang.Double getAllocationAmount() {
        return allocationAmount;
    }


    /**
     * Sets the allocationAmount value for this ResourceAllocation.
     * 
     * @param allocationAmount
     */
    public void setAllocationAmount(java.lang.Double allocationAmount) {
        this.allocationAmount = allocationAmount;
    }


    /**
     * Gets the allocationUnit value for this ResourceAllocation.
     * 
     * @return allocationUnit
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationAllocationUnit getAllocationUnit() {
        return allocationUnit;
    }


    /**
     * Sets the allocationUnit value for this ResourceAllocation.
     * 
     * @param allocationUnit
     */
    public void setAllocationUnit(com.netsuite.webservices.activities.scheduling_2019_1.types.ResourceAllocationAllocationUnit allocationUnit) {
        this.allocationUnit = allocationUnit;
    }


    /**
     * Gets the numberHours value for this ResourceAllocation.
     * 
     * @return numberHours
     */
    public java.lang.Double getNumberHours() {
        return numberHours;
    }


    /**
     * Sets the numberHours value for this ResourceAllocation.
     * 
     * @param numberHours
     */
    public void setNumberHours(java.lang.Double numberHours) {
        this.numberHours = numberHours;
    }


    /**
     * Gets the percentOfTime value for this ResourceAllocation.
     * 
     * @return percentOfTime
     */
    public java.lang.Double getPercentOfTime() {
        return percentOfTime;
    }


    /**
     * Sets the percentOfTime value for this ResourceAllocation.
     * 
     * @param percentOfTime
     */
    public void setPercentOfTime(java.lang.Double percentOfTime) {
        this.percentOfTime = percentOfTime;
    }


    /**
     * Gets the allocationType value for this ResourceAllocation.
     * 
     * @return allocationType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAllocationType() {
        return allocationType;
    }


    /**
     * Sets the allocationType value for this ResourceAllocation.
     * 
     * @param allocationType
     */
    public void setAllocationType(com.netsuite.webservices.platform.core_2019_1.RecordRef allocationType) {
        this.allocationType = allocationType;
    }


    /**
     * Gets the customForm value for this ResourceAllocation.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ResourceAllocation.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the customFieldList value for this ResourceAllocation.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ResourceAllocation.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ResourceAllocation.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ResourceAllocation.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ResourceAllocation.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ResourceAllocation.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceAllocation)) return false;
        ResourceAllocation other = (ResourceAllocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestedby==null && other.getRequestedby()==null) || 
             (this.requestedby!=null &&
              this.requestedby.equals(other.getRequestedby()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
            ((this.allocationResource==null && other.getAllocationResource()==null) || 
             (this.allocationResource!=null &&
              this.allocationResource.equals(other.getAllocationResource()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.allocationAmount==null && other.getAllocationAmount()==null) || 
             (this.allocationAmount!=null &&
              this.allocationAmount.equals(other.getAllocationAmount()))) &&
            ((this.allocationUnit==null && other.getAllocationUnit()==null) || 
             (this.allocationUnit!=null &&
              this.allocationUnit.equals(other.getAllocationUnit()))) &&
            ((this.numberHours==null && other.getNumberHours()==null) || 
             (this.numberHours!=null &&
              this.numberHours.equals(other.getNumberHours()))) &&
            ((this.percentOfTime==null && other.getPercentOfTime()==null) || 
             (this.percentOfTime!=null &&
              this.percentOfTime.equals(other.getPercentOfTime()))) &&
            ((this.allocationType==null && other.getAllocationType()==null) || 
             (this.allocationType!=null &&
              this.allocationType.equals(other.getAllocationType()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
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
        if (getRequestedby() != null) {
            _hashCode += getRequestedby().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
        }
        if (getAllocationResource() != null) {
            _hashCode += getAllocationResource().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAllocationAmount() != null) {
            _hashCode += getAllocationAmount().hashCode();
        }
        if (getAllocationUnit() != null) {
            _hashCode += getAllocationUnit().hashCode();
        }
        if (getNumberHours() != null) {
            _hashCode += getNumberHours().hashCode();
        }
        if (getPercentOfTime() != null) {
            _hashCode += getPercentOfTime().hashCode();
        }
        if (getAllocationType() != null) {
            _hashCode += getAllocationType().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResourceAllocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ResourceAllocation"));
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
        elemField.setFieldName("requestedby");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "requestedby"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "ResourceAllocationApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "allocationResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "allocationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "allocationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "ResourceAllocationAllocationUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "numberHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOfTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "percentOfTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "allocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customFieldList"));
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
