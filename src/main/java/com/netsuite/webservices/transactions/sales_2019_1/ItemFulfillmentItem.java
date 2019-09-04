/**
 * ItemFulfillmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class ItemFulfillmentItem  implements java.io.Serializable {
    private java.lang.String jobName;

    private java.lang.Boolean itemReceive;

    private java.lang.String itemName;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private java.lang.Double onHand;

    private java.lang.Double quantity;

    private java.lang.String unitsDisplay;

    private java.lang.String createPo;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String binNumbers;

    private java.lang.String serialNumbers;

    private java.lang.String poNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Long orderLine;

    private java.lang.Double quantityRemaining;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private java.lang.Long shipGroup;

    private java.lang.Boolean itemIsFulfilled;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public ItemFulfillmentItem() {
    }

    public ItemFulfillmentItem(
           java.lang.String jobName,
           java.lang.Boolean itemReceive,
           java.lang.String itemName,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           java.lang.Double onHand,
           java.lang.Double quantity,
           java.lang.String unitsDisplay,
           java.lang.String createPo,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String binNumbers,
           java.lang.String serialNumbers,
           java.lang.String poNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Long orderLine,
           java.lang.Double quantityRemaining,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           java.lang.Long shipGroup,
           java.lang.Boolean itemIsFulfilled,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.jobName = jobName;
           this.itemReceive = itemReceive;
           this.itemName = itemName;
           this.description = description;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.onHand = onHand;
           this.quantity = quantity;
           this.unitsDisplay = unitsDisplay;
           this.createPo = createPo;
           this.inventoryDetail = inventoryDetail;
           this.binNumbers = binNumbers;
           this.serialNumbers = serialNumbers;
           this.poNum = poNum;
           this.item = item;
           this.orderLine = orderLine;
           this.quantityRemaining = quantityRemaining;
           this.options = options;
           this.shipGroup = shipGroup;
           this.itemIsFulfilled = itemIsFulfilled;
           this.shipAddress = shipAddress;
           this.shipMethod = shipMethod;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the jobName value for this ItemFulfillmentItem.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this ItemFulfillmentItem.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the itemReceive value for this ItemFulfillmentItem.
     * 
     * @return itemReceive
     */
    public java.lang.Boolean getItemReceive() {
        return itemReceive;
    }


    /**
     * Sets the itemReceive value for this ItemFulfillmentItem.
     * 
     * @param itemReceive
     */
    public void setItemReceive(java.lang.Boolean itemReceive) {
        this.itemReceive = itemReceive;
    }


    /**
     * Gets the itemName value for this ItemFulfillmentItem.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this ItemFulfillmentItem.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the description value for this ItemFulfillmentItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ItemFulfillmentItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the department value for this ItemFulfillmentItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemFulfillmentItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this ItemFulfillmentItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ItemFulfillmentItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this ItemFulfillmentItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemFulfillmentItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the onHand value for this ItemFulfillmentItem.
     * 
     * @return onHand
     */
    public java.lang.Double getOnHand() {
        return onHand;
    }


    /**
     * Sets the onHand value for this ItemFulfillmentItem.
     * 
     * @param onHand
     */
    public void setOnHand(java.lang.Double onHand) {
        this.onHand = onHand;
    }


    /**
     * Gets the quantity value for this ItemFulfillmentItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemFulfillmentItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the unitsDisplay value for this ItemFulfillmentItem.
     * 
     * @return unitsDisplay
     */
    public java.lang.String getUnitsDisplay() {
        return unitsDisplay;
    }


    /**
     * Sets the unitsDisplay value for this ItemFulfillmentItem.
     * 
     * @param unitsDisplay
     */
    public void setUnitsDisplay(java.lang.String unitsDisplay) {
        this.unitsDisplay = unitsDisplay;
    }


    /**
     * Gets the createPo value for this ItemFulfillmentItem.
     * 
     * @return createPo
     */
    public java.lang.String getCreatePo() {
        return createPo;
    }


    /**
     * Sets the createPo value for this ItemFulfillmentItem.
     * 
     * @param createPo
     */
    public void setCreatePo(java.lang.String createPo) {
        this.createPo = createPo;
    }


    /**
     * Gets the inventoryDetail value for this ItemFulfillmentItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this ItemFulfillmentItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the binNumbers value for this ItemFulfillmentItem.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this ItemFulfillmentItem.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the serialNumbers value for this ItemFulfillmentItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this ItemFulfillmentItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the poNum value for this ItemFulfillmentItem.
     * 
     * @return poNum
     */
    public java.lang.String getPoNum() {
        return poNum;
    }


    /**
     * Sets the poNum value for this ItemFulfillmentItem.
     * 
     * @param poNum
     */
    public void setPoNum(java.lang.String poNum) {
        this.poNum = poNum;
    }


    /**
     * Gets the item value for this ItemFulfillmentItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemFulfillmentItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the orderLine value for this ItemFulfillmentItem.
     * 
     * @return orderLine
     */
    public java.lang.Long getOrderLine() {
        return orderLine;
    }


    /**
     * Sets the orderLine value for this ItemFulfillmentItem.
     * 
     * @param orderLine
     */
    public void setOrderLine(java.lang.Long orderLine) {
        this.orderLine = orderLine;
    }


    /**
     * Gets the quantityRemaining value for this ItemFulfillmentItem.
     * 
     * @return quantityRemaining
     */
    public java.lang.Double getQuantityRemaining() {
        return quantityRemaining;
    }


    /**
     * Sets the quantityRemaining value for this ItemFulfillmentItem.
     * 
     * @param quantityRemaining
     */
    public void setQuantityRemaining(java.lang.Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }


    /**
     * Gets the options value for this ItemFulfillmentItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ItemFulfillmentItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the shipGroup value for this ItemFulfillmentItem.
     * 
     * @return shipGroup
     */
    public java.lang.Long getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this ItemFulfillmentItem.
     * 
     * @param shipGroup
     */
    public void setShipGroup(java.lang.Long shipGroup) {
        this.shipGroup = shipGroup;
    }


    /**
     * Gets the itemIsFulfilled value for this ItemFulfillmentItem.
     * 
     * @return itemIsFulfilled
     */
    public java.lang.Boolean getItemIsFulfilled() {
        return itemIsFulfilled;
    }


    /**
     * Sets the itemIsFulfilled value for this ItemFulfillmentItem.
     * 
     * @param itemIsFulfilled
     */
    public void setItemIsFulfilled(java.lang.Boolean itemIsFulfilled) {
        this.itemIsFulfilled = itemIsFulfilled;
    }


    /**
     * Gets the shipAddress value for this ItemFulfillmentItem.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this ItemFulfillmentItem.
     * 
     * @param shipAddress
     */
    public void setShipAddress(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipMethod value for this ItemFulfillmentItem.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this ItemFulfillmentItem.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the customFieldList value for this ItemFulfillmentItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemFulfillmentItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentItem)) return false;
        ItemFulfillmentItem other = (ItemFulfillmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.itemReceive==null && other.getItemReceive()==null) || 
             (this.itemReceive!=null &&
              this.itemReceive.equals(other.getItemReceive()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.onHand==null && other.getOnHand()==null) || 
             (this.onHand!=null &&
              this.onHand.equals(other.getOnHand()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.unitsDisplay==null && other.getUnitsDisplay()==null) || 
             (this.unitsDisplay!=null &&
              this.unitsDisplay.equals(other.getUnitsDisplay()))) &&
            ((this.createPo==null && other.getCreatePo()==null) || 
             (this.createPo!=null &&
              this.createPo.equals(other.getCreatePo()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.poNum==null && other.getPoNum()==null) || 
             (this.poNum!=null &&
              this.poNum.equals(other.getPoNum()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.orderLine==null && other.getOrderLine()==null) || 
             (this.orderLine!=null &&
              this.orderLine.equals(other.getOrderLine()))) &&
            ((this.quantityRemaining==null && other.getQuantityRemaining()==null) || 
             (this.quantityRemaining!=null &&
              this.quantityRemaining.equals(other.getQuantityRemaining()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              this.shipGroup.equals(other.getShipGroup()))) &&
            ((this.itemIsFulfilled==null && other.getItemIsFulfilled()==null) || 
             (this.itemIsFulfilled!=null &&
              this.itemIsFulfilled.equals(other.getItemIsFulfilled()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
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
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getItemReceive() != null) {
            _hashCode += getItemReceive().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getOnHand() != null) {
            _hashCode += getOnHand().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnitsDisplay() != null) {
            _hashCode += getUnitsDisplay().hashCode();
        }
        if (getCreatePo() != null) {
            _hashCode += getCreatePo().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getPoNum() != null) {
            _hashCode += getPoNum().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getOrderLine() != null) {
            _hashCode += getOrderLine().hashCode();
        }
        if (getQuantityRemaining() != null) {
            _hashCode += getQuantityRemaining().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getShipGroup() != null) {
            _hashCode += getShipGroup().hashCode();
        }
        if (getItemIsFulfilled() != null) {
            _hashCode += getItemIsFulfilled().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFulfillmentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "jobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemReceive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemReceive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "onHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "unitsDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createPo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createPo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "poNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemIsFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemIsFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
