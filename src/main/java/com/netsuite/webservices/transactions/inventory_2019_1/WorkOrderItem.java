/**
 * WorkOrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class WorkOrderItem  implements java.io.Serializable {
    private java.lang.Long line;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Long operationSequenceNumber;

    private java.lang.Double componentYield;

    private java.lang.Double bomQuantity;

    private java.lang.Double quantityCommitted;

    private java.lang.Double quantityBackOrdered;

    private java.lang.Double quantityAvailable;

    private java.lang.Double averageCost;

    private java.lang.Double lastPurchasePrice;

    private java.lang.Double quantityOnHand;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String serialNumbers;

    private java.lang.Double orderPriority;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor;

    private java.lang.Double poRate;

    private java.lang.Double percentComplete;

    private java.lang.Double contribution;

    private java.lang.String description;

    private com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderItemItemCommitInventory commitInventory;

    private java.util.Calendar plannedIssueDate;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public WorkOrderItem() {
    }

    public WorkOrderItem(
           java.lang.Long line,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Long operationSequenceNumber,
           java.lang.Double componentYield,
           java.lang.Double bomQuantity,
           java.lang.Double quantityCommitted,
           java.lang.Double quantityBackOrdered,
           java.lang.Double quantityAvailable,
           java.lang.Double averageCost,
           java.lang.Double lastPurchasePrice,
           java.lang.Double quantityOnHand,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String serialNumbers,
           java.lang.Double orderPriority,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor,
           java.lang.Double poRate,
           java.lang.Double percentComplete,
           java.lang.Double contribution,
           java.lang.String description,
           com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderItemItemCommitInventory commitInventory,
           java.util.Calendar plannedIssueDate,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.line = line;
           this.item = item;
           this.operationSequenceNumber = operationSequenceNumber;
           this.componentYield = componentYield;
           this.bomQuantity = bomQuantity;
           this.quantityCommitted = quantityCommitted;
           this.quantityBackOrdered = quantityBackOrdered;
           this.quantityAvailable = quantityAvailable;
           this.averageCost = averageCost;
           this.lastPurchasePrice = lastPurchasePrice;
           this.quantityOnHand = quantityOnHand;
           this.quantity = quantity;
           this.units = units;
           this.inventoryDetail = inventoryDetail;
           this.serialNumbers = serialNumbers;
           this.orderPriority = orderPriority;
           this.options = options;
           this.itemSource = itemSource;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.poVendor = poVendor;
           this.poRate = poRate;
           this.percentComplete = percentComplete;
           this.contribution = contribution;
           this.description = description;
           this.commitInventory = commitInventory;
           this.plannedIssueDate = plannedIssueDate;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the line value for this WorkOrderItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this WorkOrderItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the item value for this WorkOrderItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this WorkOrderItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the operationSequenceNumber value for this WorkOrderItem.
     * 
     * @return operationSequenceNumber
     */
    public java.lang.Long getOperationSequenceNumber() {
        return operationSequenceNumber;
    }


    /**
     * Sets the operationSequenceNumber value for this WorkOrderItem.
     * 
     * @param operationSequenceNumber
     */
    public void setOperationSequenceNumber(java.lang.Long operationSequenceNumber) {
        this.operationSequenceNumber = operationSequenceNumber;
    }


    /**
     * Gets the componentYield value for this WorkOrderItem.
     * 
     * @return componentYield
     */
    public java.lang.Double getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this WorkOrderItem.
     * 
     * @param componentYield
     */
    public void setComponentYield(java.lang.Double componentYield) {
        this.componentYield = componentYield;
    }


    /**
     * Gets the bomQuantity value for this WorkOrderItem.
     * 
     * @return bomQuantity
     */
    public java.lang.Double getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this WorkOrderItem.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(java.lang.Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the quantityCommitted value for this WorkOrderItem.
     * 
     * @return quantityCommitted
     */
    public java.lang.Double getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this WorkOrderItem.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(java.lang.Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityBackOrdered value for this WorkOrderItem.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this WorkOrderItem.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityAvailable value for this WorkOrderItem.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this WorkOrderItem.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the averageCost value for this WorkOrderItem.
     * 
     * @return averageCost
     */
    public java.lang.Double getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this WorkOrderItem.
     * 
     * @param averageCost
     */
    public void setAverageCost(java.lang.Double averageCost) {
        this.averageCost = averageCost;
    }


    /**
     * Gets the lastPurchasePrice value for this WorkOrderItem.
     * 
     * @return lastPurchasePrice
     */
    public java.lang.Double getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this WorkOrderItem.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(java.lang.Double lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }


    /**
     * Gets the quantityOnHand value for this WorkOrderItem.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this WorkOrderItem.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantity value for this WorkOrderItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this WorkOrderItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this WorkOrderItem.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this WorkOrderItem.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the inventoryDetail value for this WorkOrderItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this WorkOrderItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the serialNumbers value for this WorkOrderItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this WorkOrderItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the orderPriority value for this WorkOrderItem.
     * 
     * @return orderPriority
     */
    public java.lang.Double getOrderPriority() {
        return orderPriority;
    }


    /**
     * Sets the orderPriority value for this WorkOrderItem.
     * 
     * @param orderPriority
     */
    public void setOrderPriority(java.lang.Double orderPriority) {
        this.orderPriority = orderPriority;
    }


    /**
     * Gets the options value for this WorkOrderItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this WorkOrderItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the itemSource value for this WorkOrderItem.
     * 
     * @return itemSource
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ItemSource getItemSource() {
        return itemSource;
    }


    /**
     * Sets the itemSource value for this WorkOrderItem.
     * 
     * @param itemSource
     */
    public void setItemSource(com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource) {
        this.itemSource = itemSource;
    }


    /**
     * Gets the department value for this WorkOrderItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this WorkOrderItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this WorkOrderItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this WorkOrderItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this WorkOrderItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this WorkOrderItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the poVendor value for this WorkOrderItem.
     * 
     * @return poVendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPoVendor() {
        return poVendor;
    }


    /**
     * Sets the poVendor value for this WorkOrderItem.
     * 
     * @param poVendor
     */
    public void setPoVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor) {
        this.poVendor = poVendor;
    }


    /**
     * Gets the poRate value for this WorkOrderItem.
     * 
     * @return poRate
     */
    public java.lang.Double getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this WorkOrderItem.
     * 
     * @param poRate
     */
    public void setPoRate(java.lang.Double poRate) {
        this.poRate = poRate;
    }


    /**
     * Gets the percentComplete value for this WorkOrderItem.
     * 
     * @return percentComplete
     */
    public java.lang.Double getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this WorkOrderItem.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Double percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the contribution value for this WorkOrderItem.
     * 
     * @return contribution
     */
    public java.lang.Double getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this WorkOrderItem.
     * 
     * @param contribution
     */
    public void setContribution(java.lang.Double contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the description value for this WorkOrderItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WorkOrderItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the commitInventory value for this WorkOrderItem.
     * 
     * @return commitInventory
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderItemItemCommitInventory getCommitInventory() {
        return commitInventory;
    }


    /**
     * Sets the commitInventory value for this WorkOrderItem.
     * 
     * @param commitInventory
     */
    public void setCommitInventory(com.netsuite.webservices.transactions.inventory_2019_1.types.WorkOrderItemItemCommitInventory commitInventory) {
        this.commitInventory = commitInventory;
    }


    /**
     * Gets the plannedIssueDate value for this WorkOrderItem.
     * 
     * @return plannedIssueDate
     */
    public java.util.Calendar getPlannedIssueDate() {
        return plannedIssueDate;
    }


    /**
     * Sets the plannedIssueDate value for this WorkOrderItem.
     * 
     * @param plannedIssueDate
     */
    public void setPlannedIssueDate(java.util.Calendar plannedIssueDate) {
        this.plannedIssueDate = plannedIssueDate;
    }


    /**
     * Gets the customFieldList value for this WorkOrderItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this WorkOrderItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderItem)) return false;
        WorkOrderItem other = (WorkOrderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.operationSequenceNumber==null && other.getOperationSequenceNumber()==null) || 
             (this.operationSequenceNumber!=null &&
              this.operationSequenceNumber.equals(other.getOperationSequenceNumber()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              this.componentYield.equals(other.getComponentYield()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              this.averageCost.equals(other.getAverageCost()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              this.lastPurchasePrice.equals(other.getLastPurchasePrice()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.orderPriority==null && other.getOrderPriority()==null) || 
             (this.orderPriority!=null &&
              this.orderPriority.equals(other.getOrderPriority()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.itemSource==null && other.getItemSource()==null) || 
             (this.itemSource!=null &&
              this.itemSource.equals(other.getItemSource()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.poVendor==null && other.getPoVendor()==null) || 
             (this.poVendor!=null &&
              this.poVendor.equals(other.getPoVendor()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              this.poRate.equals(other.getPoRate()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.commitInventory==null && other.getCommitInventory()==null) || 
             (this.commitInventory!=null &&
              this.commitInventory.equals(other.getCommitInventory()))) &&
            ((this.plannedIssueDate==null && other.getPlannedIssueDate()==null) || 
             (this.plannedIssueDate!=null &&
              this.plannedIssueDate.equals(other.getPlannedIssueDate()))) &&
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
        int _hashCode = 1;
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getOperationSequenceNumber() != null) {
            _hashCode += getOperationSequenceNumber().hashCode();
        }
        if (getComponentYield() != null) {
            _hashCode += getComponentYield().hashCode();
        }
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getAverageCost() != null) {
            _hashCode += getAverageCost().hashCode();
        }
        if (getLastPurchasePrice() != null) {
            _hashCode += getLastPurchasePrice().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getOrderPriority() != null) {
            _hashCode += getOrderPriority().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getItemSource() != null) {
            _hashCode += getItemSource().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPoVendor() != null) {
            _hashCode += getPoVendor().hashCode();
        }
        if (getPoRate() != null) {
            _hashCode += getPoRate().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCommitInventory() != null) {
            _hashCode += getCommitInventory().hashCode();
        }
        if (getPlannedIssueDate() != null) {
            _hashCode += getPlannedIssueDate().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkOrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "operationSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "ItemSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "commitInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderItemItemCommitInventory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "plannedIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
