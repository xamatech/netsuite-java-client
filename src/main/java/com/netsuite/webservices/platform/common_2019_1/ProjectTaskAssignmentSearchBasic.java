/**
 * ProjectTaskAssignmentSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ProjectTaskAssignmentSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossProfitBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField price;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField priceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resource;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField resourceName;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField serviceItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField serviceItemDesc;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCostBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPriceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField units;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar;

    public ProjectTaskAssignmentSearchBasic() {
    }

    public ProjectTaskAssignmentSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualWork,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBase,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossProfitBase,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField price,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField priceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resource,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField resourceName,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField serviceItem,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField serviceItemDesc,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCost,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCostBase,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPriceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField units,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar) {
        this.actualWork = actualWork;
        this.cost = cost;
        this.costBase = costBase;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.grossProfit = grossProfit;
        this.grossProfitBase = grossProfitBase;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.price = price;
        this.priceBase = priceBase;
        this.resource = resource;
        this.resourceName = resourceName;
        this.serviceItem = serviceItem;
        this.serviceItemDesc = serviceItemDesc;
        this.startDate = startDate;
        this.unitCost = unitCost;
        this.unitCostBase = unitCostBase;
        this.unitPrice = unitPrice;
        this.unitPriceBase = unitPriceBase;
        this.units = units;
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the actualWork value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return actualWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param actualWork
     */
    public void setActualWork(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField actualWork) {
        this.actualWork = actualWork;
    }


    /**
     * Gets the cost value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the costBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return costBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param costBase
     */
    public void setCostBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costBase) {
        this.costBase = costBase;
    }


    /**
     * Gets the endDate value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the estimatedWork value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return estimatedWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }


    /**
     * Gets the grossProfit value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return grossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGrossProfit() {
        return grossProfit;
    }


    /**
     * Sets the grossProfit value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param grossProfit
     */
    public void setGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossProfit) {
        this.grossProfit = grossProfit;
    }


    /**
     * Gets the grossProfitBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return grossProfitBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGrossProfitBase() {
        return grossProfitBase;
    }


    /**
     * Sets the grossProfitBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param grossProfitBase
     */
    public void setGrossProfitBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossProfitBase) {
        this.grossProfitBase = grossProfitBase;
    }


    /**
     * Gets the internalId value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the price value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return price
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField price) {
        this.price = price;
    }


    /**
     * Gets the priceBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return priceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getPriceBase() {
        return priceBase;
    }


    /**
     * Sets the priceBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param priceBase
     */
    public void setPriceBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField priceBase) {
        this.priceBase = priceBase;
    }


    /**
     * Gets the resource value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return resource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param resource
     */
    public void setResource(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField resource) {
        this.resource = resource;
    }


    /**
     * Gets the resourceName value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return resourceName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param resourceName
     */
    public void setResourceName(com.netsuite.webservices.platform.core_2019_1.SearchStringField resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * Gets the serviceItem value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return serviceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getServiceItem() {
        return serviceItem;
    }


    /**
     * Sets the serviceItem value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param serviceItem
     */
    public void setServiceItem(com.netsuite.webservices.platform.core_2019_1.SearchStringField serviceItem) {
        this.serviceItem = serviceItem;
    }


    /**
     * Gets the serviceItemDesc value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return serviceItemDesc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getServiceItemDesc() {
        return serviceItemDesc;
    }


    /**
     * Sets the serviceItemDesc value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param serviceItemDesc
     */
    public void setServiceItemDesc(com.netsuite.webservices.platform.core_2019_1.SearchStringField serviceItemDesc) {
        this.serviceItemDesc = serviceItemDesc;
    }


    /**
     * Gets the startDate value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the unitCost value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return unitCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param unitCost
     */
    public void setUnitCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the unitCostBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return unitCostBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitCostBase() {
        return unitCostBase;
    }


    /**
     * Sets the unitCostBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param unitCostBase
     */
    public void setUnitCostBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCostBase) {
        this.unitCostBase = unitCostBase;
    }


    /**
     * Gets the unitPrice value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return unitPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the unitPriceBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return unitPriceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitPriceBase() {
        return unitPriceBase;
    }


    /**
     * Sets the unitPriceBase value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param unitPriceBase
     */
    public void setUnitPriceBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPriceBase) {
        this.unitPriceBase = unitPriceBase;
    }


    /**
     * Gets the units value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField units) {
        this.units = units;
    }


    /**
     * Gets the workCalendar value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this ProjectTaskAssignmentSearchBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskAssignmentSearchBasic)) return false;
        ProjectTaskAssignmentSearchBasic other = (ProjectTaskAssignmentSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              this.actualWork.equals(other.getActualWork()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              this.costBase.equals(other.getCostBase()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline()))) &&
            ((this.grossProfit==null && other.getGrossProfit()==null) || 
             (this.grossProfit!=null &&
              this.grossProfit.equals(other.getGrossProfit()))) &&
            ((this.grossProfitBase==null && other.getGrossProfitBase()==null) || 
             (this.grossProfitBase!=null &&
              this.grossProfitBase.equals(other.getGrossProfitBase()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceBase==null && other.getPriceBase()==null) || 
             (this.priceBase!=null &&
              this.priceBase.equals(other.getPriceBase()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource()))) &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              this.resourceName.equals(other.getResourceName()))) &&
            ((this.serviceItem==null && other.getServiceItem()==null) || 
             (this.serviceItem!=null &&
              this.serviceItem.equals(other.getServiceItem()))) &&
            ((this.serviceItemDesc==null && other.getServiceItemDesc()==null) || 
             (this.serviceItemDesc!=null &&
              this.serviceItemDesc.equals(other.getServiceItemDesc()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.unitCostBase==null && other.getUnitCostBase()==null) || 
             (this.unitCostBase!=null &&
              this.unitCostBase.equals(other.getUnitCostBase()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.unitPriceBase==null && other.getUnitPriceBase()==null) || 
             (this.unitPriceBase!=null &&
              this.unitPriceBase.equals(other.getUnitPriceBase()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar())));
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
        if (getActualWork() != null) {
            _hashCode += getActualWork().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostBase() != null) {
            _hashCode += getCostBase().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getEstimatedWorkBaseline() != null) {
            _hashCode += getEstimatedWorkBaseline().hashCode();
        }
        if (getGrossProfit() != null) {
            _hashCode += getGrossProfit().hashCode();
        }
        if (getGrossProfitBase() != null) {
            _hashCode += getGrossProfitBase().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceBase() != null) {
            _hashCode += getPriceBase().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        if (getResourceName() != null) {
            _hashCode += getResourceName().hashCode();
        }
        if (getServiceItem() != null) {
            _hashCode += getServiceItem().hashCode();
        }
        if (getServiceItemDesc() != null) {
            _hashCode += getServiceItemDesc().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getUnitCostBase() != null) {
            _hashCode += getUnitCostBase().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getUnitPriceBase() != null) {
            _hashCode += getUnitPriceBase().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskAssignmentSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossProfitBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossProfitBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItemDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serviceItemDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitCostBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPriceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPriceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
