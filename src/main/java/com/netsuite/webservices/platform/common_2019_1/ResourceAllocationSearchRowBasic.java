/**
 * ResourceAllocationSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ResourceAllocationSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] allocationType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] allocationUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] project;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] notes;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] numberHours;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] percentOfTime;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] requestedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public ResourceAllocationSearchRowBasic() {
    }

    public ResourceAllocationSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] allocationType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] allocationUnit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] approvalStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] project,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] notes,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] numberHours,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] percentOfTime,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] requestedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.allocationType = allocationType;
        this.allocationUnit = allocationUnit;
        this.approvalStatus = approvalStatus;
        this.project = project;
        this.customer = customer;
        this.endDate = endDate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.nextApprover = nextApprover;
        this.notes = notes;
        this.numberHours = numberHours;
        this.percentOfTime = percentOfTime;
        this.requestedBy = requestedBy;
        this.resource = resource;
        this.startDate = startDate;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the allocationType value for this ResourceAllocationSearchRowBasic.
     * 
     * @return allocationType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAllocationType() {
        return allocationType;
    }


    /**
     * Sets the allocationType value for this ResourceAllocationSearchRowBasic.
     * 
     * @param allocationType
     */
    public void setAllocationType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] allocationType) {
        this.allocationType = allocationType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAllocationType(int i) {
        return this.allocationType[i];
    }

    public void setAllocationType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.allocationType[i] = _value;
    }


    /**
     * Gets the allocationUnit value for this ResourceAllocationSearchRowBasic.
     * 
     * @return allocationUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAllocationUnit() {
        return allocationUnit;
    }


    /**
     * Sets the allocationUnit value for this ResourceAllocationSearchRowBasic.
     * 
     * @param allocationUnit
     */
    public void setAllocationUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] allocationUnit) {
        this.allocationUnit = allocationUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAllocationUnit(int i) {
        return this.allocationUnit[i];
    }

    public void setAllocationUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.allocationUnit[i] = _value;
    }


    /**
     * Gets the approvalStatus value for this ResourceAllocationSearchRowBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this ResourceAllocationSearchRowBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getApprovalStatus(int i) {
        return this.approvalStatus[i];
    }

    public void setApprovalStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.approvalStatus[i] = _value;
    }


    /**
     * Gets the project value for this ResourceAllocationSearchRowBasic.
     * 
     * @return project
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProject() {
        return project;
    }


    /**
     * Sets the project value for this ResourceAllocationSearchRowBasic.
     * 
     * @param project
     */
    public void setProject(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] project) {
        this.project = project;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProject(int i) {
        return this.project[i];
    }

    public void setProject(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.project[i] = _value;
    }


    /**
     * Gets the customer value for this ResourceAllocationSearchRowBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ResourceAllocationSearchRowBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }


    /**
     * Gets the endDate value for this ResourceAllocationSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ResourceAllocationSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the externalId value for this ResourceAllocationSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ResourceAllocationSearchRowBasic.
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
     * Gets the internalId value for this ResourceAllocationSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ResourceAllocationSearchRowBasic.
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
     * Gets the nextApprover value for this ResourceAllocationSearchRowBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this ResourceAllocationSearchRowBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover) {
        this.nextApprover = nextApprover;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getNextApprover(int i) {
        return this.nextApprover[i];
    }

    public void setNextApprover(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.nextApprover[i] = _value;
    }


    /**
     * Gets the notes value for this ResourceAllocationSearchRowBasic.
     * 
     * @return notes
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ResourceAllocationSearchRowBasic.
     * 
     * @param notes
     */
    public void setNotes(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] notes) {
        this.notes = notes;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNotes(int i) {
        return this.notes[i];
    }

    public void setNotes(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.notes[i] = _value;
    }


    /**
     * Gets the numberHours value for this ResourceAllocationSearchRowBasic.
     * 
     * @return numberHours
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getNumberHours() {
        return numberHours;
    }


    /**
     * Sets the numberHours value for this ResourceAllocationSearchRowBasic.
     * 
     * @param numberHours
     */
    public void setNumberHours(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] numberHours) {
        this.numberHours = numberHours;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getNumberHours(int i) {
        return this.numberHours[i];
    }

    public void setNumberHours(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.numberHours[i] = _value;
    }


    /**
     * Gets the percentOfTime value for this ResourceAllocationSearchRowBasic.
     * 
     * @return percentOfTime
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPercentOfTime() {
        return percentOfTime;
    }


    /**
     * Sets the percentOfTime value for this ResourceAllocationSearchRowBasic.
     * 
     * @param percentOfTime
     */
    public void setPercentOfTime(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] percentOfTime) {
        this.percentOfTime = percentOfTime;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPercentOfTime(int i) {
        return this.percentOfTime[i];
    }

    public void setPercentOfTime(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.percentOfTime[i] = _value;
    }


    /**
     * Gets the requestedBy value for this ResourceAllocationSearchRowBasic.
     * 
     * @return requestedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRequestedBy() {
        return requestedBy;
    }


    /**
     * Sets the requestedBy value for this ResourceAllocationSearchRowBasic.
     * 
     * @param requestedBy
     */
    public void setRequestedBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] requestedBy) {
        this.requestedBy = requestedBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRequestedBy(int i) {
        return this.requestedBy[i];
    }

    public void setRequestedBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.requestedBy[i] = _value;
    }


    /**
     * Gets the resource value for this ResourceAllocationSearchRowBasic.
     * 
     * @return resource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ResourceAllocationSearchRowBasic.
     * 
     * @param resource
     */
    public void setResource(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource) {
        this.resource = resource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.resource[i] = _value;
    }


    /**
     * Gets the startDate value for this ResourceAllocationSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ResourceAllocationSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ResourceAllocationSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ResourceAllocationSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceAllocationSearchRowBasic)) return false;
        ResourceAllocationSearchRowBasic other = (ResourceAllocationSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.allocationType, other.getAllocationType()))) &&
            ((this.allocationUnit==null && other.getAllocationUnit()==null) || 
             (this.allocationUnit!=null &&
              java.util.Arrays.equals(this.allocationUnit, other.getAllocationUnit()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              java.util.Arrays.equals(this.approvalStatus, other.getApprovalStatus()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              java.util.Arrays.equals(this.project, other.getProject()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              java.util.Arrays.equals(this.nextApprover, other.getNextApprover()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.numberHours==null && other.getNumberHours()==null) || 
             (this.numberHours!=null &&
              java.util.Arrays.equals(this.numberHours, other.getNumberHours()))) &&
            ((this.percentOfTime==null && other.getPercentOfTime()==null) || 
             (this.percentOfTime!=null &&
              java.util.Arrays.equals(this.percentOfTime, other.getPercentOfTime()))) &&
            ((this.requestedBy==null && other.getRequestedBy()==null) || 
             (this.requestedBy!=null &&
              java.util.Arrays.equals(this.requestedBy, other.getRequestedBy()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllocationType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllocationType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllocationUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllocationUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllocationUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
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
        if (getNextApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumberHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumberHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumberHours(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPercentOfTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentOfTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentOfTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
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
        new org.apache.axis.description.TypeDesc(ResourceAllocationSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "allocationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "numberHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentOfTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "percentOfTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "requestedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
