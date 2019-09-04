/**
 * TransferOrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class TransferOrderItem  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Long line;

    private java.lang.Double quantityAvailable;

    private java.lang.Double quantityOnHand;

    private java.lang.Double quantityBackOrdered;

    private java.lang.Double quantityCommitted;

    private java.lang.Double quantityFulfilled;

    private java.lang.Double quantityPacked;

    private java.lang.Double quantityPicked;

    private java.lang.Double quantityReceived;

    private java.lang.Double quantity;

    private java.lang.Double rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private java.lang.Double amount;

    private java.lang.String description;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String serialNumbers;

    private com.netsuite.webservices.transactions.inventory_2019_1.types.TransferOrderItemCommitInventory commitInventory;

    private java.lang.Double orderPriority;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private java.lang.Boolean isClosed;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private java.lang.Double lastPurchasePrice;

    private java.lang.Double averageCost;

    private java.util.Calendar expectedShipDate;

    private java.util.Calendar expectedReceiptDate;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public TransferOrderItem() {
    }

    public TransferOrderItem(
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Long line,
           java.lang.Double quantityAvailable,
           java.lang.Double quantityOnHand,
           java.lang.Double quantityBackOrdered,
           java.lang.Double quantityCommitted,
           java.lang.Double quantityFulfilled,
           java.lang.Double quantityPacked,
           java.lang.Double quantityPicked,
           java.lang.Double quantityReceived,
           java.lang.Double quantity,
           java.lang.Double rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           java.lang.Double amount,
           java.lang.String description,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String serialNumbers,
           com.netsuite.webservices.transactions.inventory_2019_1.types.TransferOrderItemCommitInventory commitInventory,
           java.lang.Double orderPriority,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           java.lang.Boolean isClosed,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           java.lang.Double lastPurchasePrice,
           java.lang.Double averageCost,
           java.util.Calendar expectedShipDate,
           java.util.Calendar expectedReceiptDate,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.item = item;
           this.line = line;
           this.quantityAvailable = quantityAvailable;
           this.quantityOnHand = quantityOnHand;
           this.quantityBackOrdered = quantityBackOrdered;
           this.quantityCommitted = quantityCommitted;
           this.quantityFulfilled = quantityFulfilled;
           this.quantityPacked = quantityPacked;
           this.quantityPicked = quantityPicked;
           this.quantityReceived = quantityReceived;
           this.quantity = quantity;
           this.rate = rate;
           this.units = units;
           this.amount = amount;
           this.description = description;
           this.inventoryDetail = inventoryDetail;
           this.serialNumbers = serialNumbers;
           this.commitInventory = commitInventory;
           this.orderPriority = orderPriority;
           this.options = options;
           this.isClosed = isClosed;
           this.department = department;
           this._class = _class;
           this.lastPurchasePrice = lastPurchasePrice;
           this.averageCost = averageCost;
           this.expectedShipDate = expectedShipDate;
           this.expectedReceiptDate = expectedReceiptDate;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the item value for this TransferOrderItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransferOrderItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the line value for this TransferOrderItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this TransferOrderItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the quantityAvailable value for this TransferOrderItem.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this TransferOrderItem.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityOnHand value for this TransferOrderItem.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this TransferOrderItem.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantityBackOrdered value for this TransferOrderItem.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this TransferOrderItem.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCommitted value for this TransferOrderItem.
     * 
     * @return quantityCommitted
     */
    public java.lang.Double getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this TransferOrderItem.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(java.lang.Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityFulfilled value for this TransferOrderItem.
     * 
     * @return quantityFulfilled
     */
    public java.lang.Double getQuantityFulfilled() {
        return quantityFulfilled;
    }


    /**
     * Sets the quantityFulfilled value for this TransferOrderItem.
     * 
     * @param quantityFulfilled
     */
    public void setQuantityFulfilled(java.lang.Double quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }


    /**
     * Gets the quantityPacked value for this TransferOrderItem.
     * 
     * @return quantityPacked
     */
    public java.lang.Double getQuantityPacked() {
        return quantityPacked;
    }


    /**
     * Sets the quantityPacked value for this TransferOrderItem.
     * 
     * @param quantityPacked
     */
    public void setQuantityPacked(java.lang.Double quantityPacked) {
        this.quantityPacked = quantityPacked;
    }


    /**
     * Gets the quantityPicked value for this TransferOrderItem.
     * 
     * @return quantityPicked
     */
    public java.lang.Double getQuantityPicked() {
        return quantityPicked;
    }


    /**
     * Sets the quantityPicked value for this TransferOrderItem.
     * 
     * @param quantityPicked
     */
    public void setQuantityPicked(java.lang.Double quantityPicked) {
        this.quantityPicked = quantityPicked;
    }


    /**
     * Gets the quantityReceived value for this TransferOrderItem.
     * 
     * @return quantityReceived
     */
    public java.lang.Double getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this TransferOrderItem.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(java.lang.Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the quantity value for this TransferOrderItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TransferOrderItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the rate value for this TransferOrderItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TransferOrderItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the units value for this TransferOrderItem.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this TransferOrderItem.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the amount value for this TransferOrderItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferOrderItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this TransferOrderItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransferOrderItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the inventoryDetail value for this TransferOrderItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this TransferOrderItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the serialNumbers value for this TransferOrderItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this TransferOrderItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the commitInventory value for this TransferOrderItem.
     * 
     * @return commitInventory
     */
    public com.netsuite.webservices.transactions.inventory_2019_1.types.TransferOrderItemCommitInventory getCommitInventory() {
        return commitInventory;
    }


    /**
     * Sets the commitInventory value for this TransferOrderItem.
     * 
     * @param commitInventory
     */
    public void setCommitInventory(com.netsuite.webservices.transactions.inventory_2019_1.types.TransferOrderItemCommitInventory commitInventory) {
        this.commitInventory = commitInventory;
    }


    /**
     * Gets the orderPriority value for this TransferOrderItem.
     * 
     * @return orderPriority
     */
    public java.lang.Double getOrderPriority() {
        return orderPriority;
    }


    /**
     * Sets the orderPriority value for this TransferOrderItem.
     * 
     * @param orderPriority
     */
    public void setOrderPriority(java.lang.Double orderPriority) {
        this.orderPriority = orderPriority;
    }


    /**
     * Gets the options value for this TransferOrderItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this TransferOrderItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the isClosed value for this TransferOrderItem.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this TransferOrderItem.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the department value for this TransferOrderItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TransferOrderItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this TransferOrderItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TransferOrderItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the lastPurchasePrice value for this TransferOrderItem.
     * 
     * @return lastPurchasePrice
     */
    public java.lang.Double getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this TransferOrderItem.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(java.lang.Double lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }


    /**
     * Gets the averageCost value for this TransferOrderItem.
     * 
     * @return averageCost
     */
    public java.lang.Double getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this TransferOrderItem.
     * 
     * @param averageCost
     */
    public void setAverageCost(java.lang.Double averageCost) {
        this.averageCost = averageCost;
    }


    /**
     * Gets the expectedShipDate value for this TransferOrderItem.
     * 
     * @return expectedShipDate
     */
    public java.util.Calendar getExpectedShipDate() {
        return expectedShipDate;
    }


    /**
     * Sets the expectedShipDate value for this TransferOrderItem.
     * 
     * @param expectedShipDate
     */
    public void setExpectedShipDate(java.util.Calendar expectedShipDate) {
        this.expectedShipDate = expectedShipDate;
    }


    /**
     * Gets the expectedReceiptDate value for this TransferOrderItem.
     * 
     * @return expectedReceiptDate
     */
    public java.util.Calendar getExpectedReceiptDate() {
        return expectedReceiptDate;
    }


    /**
     * Sets the expectedReceiptDate value for this TransferOrderItem.
     * 
     * @param expectedReceiptDate
     */
    public void setExpectedReceiptDate(java.util.Calendar expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }


    /**
     * Gets the customFieldList value for this TransferOrderItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TransferOrderItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferOrderItem)) return false;
        TransferOrderItem other = (TransferOrderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityFulfilled==null && other.getQuantityFulfilled()==null) || 
             (this.quantityFulfilled!=null &&
              this.quantityFulfilled.equals(other.getQuantityFulfilled()))) &&
            ((this.quantityPacked==null && other.getQuantityPacked()==null) || 
             (this.quantityPacked!=null &&
              this.quantityPacked.equals(other.getQuantityPacked()))) &&
            ((this.quantityPicked==null && other.getQuantityPicked()==null) || 
             (this.quantityPicked!=null &&
              this.quantityPicked.equals(other.getQuantityPicked()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              this.quantityReceived.equals(other.getQuantityReceived()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.commitInventory==null && other.getCommitInventory()==null) || 
             (this.commitInventory!=null &&
              this.commitInventory.equals(other.getCommitInventory()))) &&
            ((this.orderPriority==null && other.getOrderPriority()==null) || 
             (this.orderPriority!=null &&
              this.orderPriority.equals(other.getOrderPriority()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              this.lastPurchasePrice.equals(other.getLastPurchasePrice()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              this.averageCost.equals(other.getAverageCost()))) &&
            ((this.expectedShipDate==null && other.getExpectedShipDate()==null) || 
             (this.expectedShipDate!=null &&
              this.expectedShipDate.equals(other.getExpectedShipDate()))) &&
            ((this.expectedReceiptDate==null && other.getExpectedReceiptDate()==null) || 
             (this.expectedReceiptDate!=null &&
              this.expectedReceiptDate.equals(other.getExpectedReceiptDate()))) &&
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityFulfilled() != null) {
            _hashCode += getQuantityFulfilled().hashCode();
        }
        if (getQuantityPacked() != null) {
            _hashCode += getQuantityPacked().hashCode();
        }
        if (getQuantityPicked() != null) {
            _hashCode += getQuantityPicked().hashCode();
        }
        if (getQuantityReceived() != null) {
            _hashCode += getQuantityReceived().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getCommitInventory() != null) {
            _hashCode += getCommitInventory().hashCode();
        }
        if (getOrderPriority() != null) {
            _hashCode += getOrderPriority().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLastPurchasePrice() != null) {
            _hashCode += getLastPurchasePrice().hashCode();
        }
        if (getAverageCost() != null) {
            _hashCode += getAverageCost().hashCode();
        }
        if (getExpectedShipDate() != null) {
            _hashCode += getExpectedShipDate().hashCode();
        }
        if (getExpectedReceiptDate() != null) {
            _hashCode += getExpectedReceiptDate().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferOrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "TransferOrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityOnHand"));
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
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityReceived"));
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
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "rate"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "amount"));
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
        elemField.setFieldName("commitInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "commitInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2019_1.transactions.webservices.netsuite.com", "TransferOrderItemCommitInventory"));
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
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "lastPurchasePrice"));
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
        elemField.setFieldName("expectedShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "expectedShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "expectedReceiptDate"));
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
