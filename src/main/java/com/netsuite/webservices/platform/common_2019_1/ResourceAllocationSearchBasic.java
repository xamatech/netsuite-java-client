/**
 * ResourceAllocationSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ResourceAllocationSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField allocationType;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField allocationUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField notes;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField numberHours;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField percentOfTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField project;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField requestedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resource;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public ResourceAllocationSearchBasic() {
    }

    public ResourceAllocationSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField allocationType,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField allocationUnit,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nextApprover,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField notes,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField numberHours,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField percentOfTime,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField project,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField requestedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resource,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.allocationType = allocationType;
        this.allocationUnit = allocationUnit;
        this.approvalStatus = approvalStatus;
        this.customer = customer;
        this.endDate = endDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.nextApprover = nextApprover;
        this.notes = notes;
        this.numberHours = numberHours;
        this.percentOfTime = percentOfTime;
        this.project = project;
        this.requestedBy = requestedBy;
        this.resource = resource;
        this.startDate = startDate;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the allocationType value for this ResourceAllocationSearchBasic.
     * 
     * @return allocationType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAllocationType() {
        return allocationType;
    }


    /**
     * Sets the allocationType value for this ResourceAllocationSearchBasic.
     * 
     * @param allocationType
     */
    public void setAllocationType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField allocationType) {
        this.allocationType = allocationType;
    }


    /**
     * Gets the allocationUnit value for this ResourceAllocationSearchBasic.
     * 
     * @return allocationUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAllocationUnit() {
        return allocationUnit;
    }


    /**
     * Sets the allocationUnit value for this ResourceAllocationSearchBasic.
     * 
     * @param allocationUnit
     */
    public void setAllocationUnit(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField allocationUnit) {
        this.allocationUnit = allocationUnit;
    }


    /**
     * Gets the approvalStatus value for this ResourceAllocationSearchBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this ResourceAllocationSearchBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the customer value for this ResourceAllocationSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ResourceAllocationSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the endDate value for this ResourceAllocationSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ResourceAllocationSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the externalId value for this ResourceAllocationSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ResourceAllocationSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ResourceAllocationSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ResourceAllocationSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this ResourceAllocationSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ResourceAllocationSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ResourceAllocationSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ResourceAllocationSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the nextApprover value for this ResourceAllocationSearchBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this ResourceAllocationSearchBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the notes value for this ResourceAllocationSearchBasic.
     * 
     * @return notes
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ResourceAllocationSearchBasic.
     * 
     * @param notes
     */
    public void setNotes(com.netsuite.webservices.platform.core_2019_1.SearchStringField notes) {
        this.notes = notes;
    }


    /**
     * Gets the numberHours value for this ResourceAllocationSearchBasic.
     * 
     * @return numberHours
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getNumberHours() {
        return numberHours;
    }


    /**
     * Sets the numberHours value for this ResourceAllocationSearchBasic.
     * 
     * @param numberHours
     */
    public void setNumberHours(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField numberHours) {
        this.numberHours = numberHours;
    }


    /**
     * Gets the percentOfTime value for this ResourceAllocationSearchBasic.
     * 
     * @return percentOfTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPercentOfTime() {
        return percentOfTime;
    }


    /**
     * Sets the percentOfTime value for this ResourceAllocationSearchBasic.
     * 
     * @param percentOfTime
     */
    public void setPercentOfTime(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField percentOfTime) {
        this.percentOfTime = percentOfTime;
    }


    /**
     * Gets the project value for this ResourceAllocationSearchBasic.
     * 
     * @return project
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProject() {
        return project;
    }


    /**
     * Sets the project value for this ResourceAllocationSearchBasic.
     * 
     * @param project
     */
    public void setProject(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField project) {
        this.project = project;
    }


    /**
     * Gets the requestedBy value for this ResourceAllocationSearchBasic.
     * 
     * @return requestedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRequestedBy() {
        return requestedBy;
    }


    /**
     * Sets the requestedBy value for this ResourceAllocationSearchBasic.
     * 
     * @param requestedBy
     */
    public void setRequestedBy(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField requestedBy) {
        this.requestedBy = requestedBy;
    }


    /**
     * Gets the resource value for this ResourceAllocationSearchBasic.
     * 
     * @return resource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ResourceAllocationSearchBasic.
     * 
     * @param resource
     */
    public void setResource(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resource) {
        this.resource = resource;
    }


    /**
     * Gets the startDate value for this ResourceAllocationSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ResourceAllocationSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the customFieldList value for this ResourceAllocationSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ResourceAllocationSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceAllocationSearchBasic)) return false;
        ResourceAllocationSearchBasic other = (ResourceAllocationSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allocationType==null && other.getAllocationType()==null) || 
             (this.allocationType!=null &&
              this.allocationType.equals(other.getAllocationType()))) &&
            ((this.allocationUnit==null && other.getAllocationUnit()==null) || 
             (this.allocationUnit!=null &&
              this.allocationUnit.equals(other.getAllocationUnit()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.numberHours==null && other.getNumberHours()==null) || 
             (this.numberHours!=null &&
              this.numberHours.equals(other.getNumberHours()))) &&
            ((this.percentOfTime==null && other.getPercentOfTime()==null) || 
             (this.percentOfTime!=null &&
              this.percentOfTime.equals(other.getPercentOfTime()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.requestedBy==null && other.getRequestedBy()==null) || 
             (this.requestedBy!=null &&
              this.requestedBy.equals(other.getRequestedBy()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
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
        if (getAllocationType() != null) {
            _hashCode += getAllocationType().hashCode();
        }
        if (getAllocationUnit() != null) {
            _hashCode += getAllocationUnit().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNumberHours() != null) {
            _hashCode += getNumberHours().hashCode();
        }
        if (getPercentOfTime() != null) {
            _hashCode += getPercentOfTime().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getRequestedBy() != null) {
            _hashCode += getRequestedBy().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceAllocationSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allocationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
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
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numberHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOfTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentOfTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "requestedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
