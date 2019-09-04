/**
 * ProjectTaskAssignmentSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ProjectTaskAssignmentSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkBaseline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossProfitBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] price;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] priceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] resourceName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serviceItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serviceItemDesc;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCostBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPriceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] units;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar;

    public ProjectTaskAssignmentSearchRowBasic() {
    }

    public ProjectTaskAssignmentSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualWork,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkBaseline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossProfit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossProfitBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] price,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] priceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] resource,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] resourceName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serviceItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serviceItemDesc,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCostBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPriceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] units,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar) {
        this.actualWork = actualWork;
        this.cost = cost;
        this.costBase = costBase;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.grossProfit = grossProfit;
        this.grossProfitBase = grossProfitBase;
        this.internalId = internalId;
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
     * Gets the actualWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return actualWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param actualWork
     */
    public void setActualWork(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] actualWork) {
        this.actualWork = actualWork;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getActualWork(int i) {
        return this.actualWork[i];
    }

    public void setActualWork(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.actualWork[i] = _value;
    }


    /**
     * Gets the cost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }


    /**
     * Gets the costBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return costBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param costBase
     */
    public void setCostBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costBase) {
        this.costBase = costBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostBase(int i) {
        return this.costBase[i];
    }

    public void setCostBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costBase[i] = _value;
    }


    /**
     * Gets the endDate value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the estimatedWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return estimatedWork
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedWork(int i) {
        return this.estimatedWork[i];
    }

    public void setEstimatedWork(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedWork[i] = _value;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedWorkBaseline(int i) {
        return this.estimatedWorkBaseline[i];
    }

    public void setEstimatedWorkBaseline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedWorkBaseline[i] = _value;
    }


    /**
     * Gets the grossProfit value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return grossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGrossProfit() {
        return grossProfit;
    }


    /**
     * Sets the grossProfit value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param grossProfit
     */
    public void setGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossProfit) {
        this.grossProfit = grossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGrossProfit(int i) {
        return this.grossProfit[i];
    }

    public void setGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.grossProfit[i] = _value;
    }


    /**
     * Gets the grossProfitBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return grossProfitBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGrossProfitBase() {
        return grossProfitBase;
    }


    /**
     * Sets the grossProfitBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param grossProfitBase
     */
    public void setGrossProfitBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossProfitBase) {
        this.grossProfitBase = grossProfitBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGrossProfitBase(int i) {
        return this.grossProfitBase[i];
    }

    public void setGrossProfitBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.grossProfitBase[i] = _value;
    }


    /**
     * Gets the internalId value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the price value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return price
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param price
     */
    public void setPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] price) {
        this.price = price;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPrice(int i) {
        return this.price[i];
    }

    public void setPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.price[i] = _value;
    }


    /**
     * Gets the priceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return priceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPriceBase() {
        return priceBase;
    }


    /**
     * Sets the priceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param priceBase
     */
    public void setPriceBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] priceBase) {
        this.priceBase = priceBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPriceBase(int i) {
        return this.priceBase[i];
    }

    public void setPriceBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.priceBase[i] = _value;
    }


    /**
     * Gets the resource value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return resource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the resourceName value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return resourceName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param resourceName
     */
    public void setResourceName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] resourceName) {
        this.resourceName = resourceName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getResourceName(int i) {
        return this.resourceName[i];
    }

    public void setResourceName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.resourceName[i] = _value;
    }


    /**
     * Gets the serviceItem value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return serviceItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getServiceItem() {
        return serviceItem;
    }


    /**
     * Sets the serviceItem value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param serviceItem
     */
    public void setServiceItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serviceItem) {
        this.serviceItem = serviceItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getServiceItem(int i) {
        return this.serviceItem[i];
    }

    public void setServiceItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serviceItem[i] = _value;
    }


    /**
     * Gets the serviceItemDesc value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return serviceItemDesc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getServiceItemDesc() {
        return serviceItemDesc;
    }


    /**
     * Sets the serviceItemDesc value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param serviceItemDesc
     */
    public void setServiceItemDesc(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serviceItemDesc) {
        this.serviceItemDesc = serviceItemDesc;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getServiceItemDesc(int i) {
        return this.serviceItemDesc[i];
    }

    public void setServiceItemDesc(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serviceItemDesc[i] = _value;
    }


    /**
     * Gets the startDate value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the unitCost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitCost
     */
    public void setUnitCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCost) {
        this.unitCost = unitCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitCost(int i) {
        return this.unitCost[i];
    }

    public void setUnitCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitCost[i] = _value;
    }


    /**
     * Gets the unitCostBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitCostBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitCostBase() {
        return unitCostBase;
    }


    /**
     * Sets the unitCostBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitCostBase
     */
    public void setUnitCostBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCostBase) {
        this.unitCostBase = unitCostBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitCostBase(int i) {
        return this.unitCostBase[i];
    }

    public void setUnitCostBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitCostBase[i] = _value;
    }


    /**
     * Gets the unitPrice value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPrice) {
        this.unitPrice = unitPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitPrice(int i) {
        return this.unitPrice[i];
    }

    public void setUnitPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitPrice[i] = _value;
    }


    /**
     * Gets the unitPriceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitPriceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitPriceBase() {
        return unitPriceBase;
    }


    /**
     * Sets the unitPriceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitPriceBase
     */
    public void setUnitPriceBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitPriceBase) {
        this.unitPriceBase = unitPriceBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitPriceBase(int i) {
        return this.unitPriceBase[i];
    }

    public void setUnitPriceBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitPriceBase[i] = _value;
    }


    /**
     * Gets the units value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] units) {
        this.units = units;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.units[i] = _value;
    }


    /**
     * Gets the workCalendar value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this ProjectTaskAssignmentSearchRowBasic.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskAssignmentSearchRowBasic)) return false;
        ProjectTaskAssignmentSearchRowBasic other = (ProjectTaskAssignmentSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.actualWork, other.getActualWork()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              java.util.Arrays.equals(this.costBase, other.getCostBase()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              java.util.Arrays.equals(this.estimatedWork, other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              java.util.Arrays.equals(this.estimatedWorkBaseline, other.getEstimatedWorkBaseline()))) &&
            ((this.grossProfit==null && other.getGrossProfit()==null) || 
             (this.grossProfit!=null &&
              java.util.Arrays.equals(this.grossProfit, other.getGrossProfit()))) &&
            ((this.grossProfitBase==null && other.getGrossProfitBase()==null) || 
             (this.grossProfitBase!=null &&
              java.util.Arrays.equals(this.grossProfitBase, other.getGrossProfitBase()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              java.util.Arrays.equals(this.price, other.getPrice()))) &&
            ((this.priceBase==null && other.getPriceBase()==null) || 
             (this.priceBase!=null &&
              java.util.Arrays.equals(this.priceBase, other.getPriceBase()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              java.util.Arrays.equals(this.resourceName, other.getResourceName()))) &&
            ((this.serviceItem==null && other.getServiceItem()==null) || 
             (this.serviceItem!=null &&
              java.util.Arrays.equals(this.serviceItem, other.getServiceItem()))) &&
            ((this.serviceItemDesc==null && other.getServiceItemDesc()==null) || 
             (this.serviceItemDesc!=null &&
              java.util.Arrays.equals(this.serviceItemDesc, other.getServiceItemDesc()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              java.util.Arrays.equals(this.unitCost, other.getUnitCost()))) &&
            ((this.unitCostBase==null && other.getUnitCostBase()==null) || 
             (this.unitCostBase!=null &&
              java.util.Arrays.equals(this.unitCostBase, other.getUnitCostBase()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              java.util.Arrays.equals(this.unitPrice, other.getUnitPrice()))) &&
            ((this.unitPriceBase==null && other.getUnitPriceBase()==null) || 
             (this.unitPriceBase!=null &&
              java.util.Arrays.equals(this.unitPriceBase, other.getUnitPriceBase()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              java.util.Arrays.equals(this.units, other.getUnits()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              java.util.Arrays.equals(this.workCalendar, other.getWorkCalendar())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualWork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBase(), i);
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
        if (getEstimatedWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWorkBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossProfitBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossProfitBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossProfitBase(), i);
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
        if (getPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceBase(), i);
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
        if (getResourceName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceItemDesc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceItemDesc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceItemDesc(), i);
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
        if (getUnitCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitCostBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitCostBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitCostBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPriceBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPriceBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPriceBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnits(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskAssignmentSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossProfitBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossProfitBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItemDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serviceItemDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitCostBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPriceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPriceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
