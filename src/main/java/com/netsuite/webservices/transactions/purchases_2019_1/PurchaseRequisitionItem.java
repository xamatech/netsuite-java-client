/**
 * PurchaseRequisitionItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class PurchaseRequisitionItem  implements java.io.Serializable {
    private java.lang.Long line;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.String vendorName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private java.lang.String serialNumbers;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String description;

    private java.lang.Double estimatedRate;

    private java.lang.Double estimatedAmount;

    private java.lang.String rate;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode;

    private java.lang.Double taxRate1;

    private java.lang.Double taxRate2;

    private java.lang.Double grossAmt;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private java.lang.Boolean isBillable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList linkedOrderList;

    private java.lang.String linkedOrderStatus;

    private java.util.Calendar expectedReceiptDate;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean expandItemGroup;

    public PurchaseRequisitionItem() {
    }

    public PurchaseRequisitionItem(
           java.lang.Long line,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.String vendorName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           java.lang.String serialNumbers,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String description,
           java.lang.Double estimatedRate,
           java.lang.Double estimatedAmount,
           java.lang.String rate,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode,
           java.lang.Double taxRate1,
           java.lang.Double taxRate2,
           java.lang.Double grossAmt,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           java.lang.Boolean isBillable,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList linkedOrderList,
           java.lang.String linkedOrderStatus,
           java.util.Calendar expectedReceiptDate,
           java.lang.Boolean isClosed,
           java.lang.Boolean expandItemGroup) {
           this.line = line;
           this.item = item;
           this.vendorName = vendorName;
           this.poVendor = poVendor;
           this.quantity = quantity;
           this.units = units;
           this.serialNumbers = serialNumbers;
           this.inventoryDetail = inventoryDetail;
           this.description = description;
           this.estimatedRate = estimatedRate;
           this.estimatedAmount = estimatedAmount;
           this.rate = rate;
           this.amount = amount;
           this.taxCode = taxCode;
           this.taxRate1 = taxRate1;
           this.taxRate2 = taxRate2;
           this.grossAmt = grossAmt;
           this.options = options;
           this.department = department;
           this._class = _class;
           this.customer = customer;
           this.isBillable = isBillable;
           this.linkedOrderList = linkedOrderList;
           this.linkedOrderStatus = linkedOrderStatus;
           this.expectedReceiptDate = expectedReceiptDate;
           this.isClosed = isClosed;
           this.expandItemGroup = expandItemGroup;
    }


    /**
     * Gets the line value for this PurchaseRequisitionItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this PurchaseRequisitionItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the item value for this PurchaseRequisitionItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this PurchaseRequisitionItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the vendorName value for this PurchaseRequisitionItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this PurchaseRequisitionItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the poVendor value for this PurchaseRequisitionItem.
     * 
     * @return poVendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPoVendor() {
        return poVendor;
    }


    /**
     * Sets the poVendor value for this PurchaseRequisitionItem.
     * 
     * @param poVendor
     */
    public void setPoVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef poVendor) {
        this.poVendor = poVendor;
    }


    /**
     * Gets the quantity value for this PurchaseRequisitionItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PurchaseRequisitionItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this PurchaseRequisitionItem.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this PurchaseRequisitionItem.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the serialNumbers value for this PurchaseRequisitionItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this PurchaseRequisitionItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the inventoryDetail value for this PurchaseRequisitionItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this PurchaseRequisitionItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the description value for this PurchaseRequisitionItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PurchaseRequisitionItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the estimatedRate value for this PurchaseRequisitionItem.
     * 
     * @return estimatedRate
     */
    public java.lang.Double getEstimatedRate() {
        return estimatedRate;
    }


    /**
     * Sets the estimatedRate value for this PurchaseRequisitionItem.
     * 
     * @param estimatedRate
     */
    public void setEstimatedRate(java.lang.Double estimatedRate) {
        this.estimatedRate = estimatedRate;
    }


    /**
     * Gets the estimatedAmount value for this PurchaseRequisitionItem.
     * 
     * @return estimatedAmount
     */
    public java.lang.Double getEstimatedAmount() {
        return estimatedAmount;
    }


    /**
     * Sets the estimatedAmount value for this PurchaseRequisitionItem.
     * 
     * @param estimatedAmount
     */
    public void setEstimatedAmount(java.lang.Double estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }


    /**
     * Gets the rate value for this PurchaseRequisitionItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this PurchaseRequisitionItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the amount value for this PurchaseRequisitionItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PurchaseRequisitionItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the taxCode value for this PurchaseRequisitionItem.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this PurchaseRequisitionItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate1 value for this PurchaseRequisitionItem.
     * 
     * @return taxRate1
     */
    public java.lang.Double getTaxRate1() {
        return taxRate1;
    }


    /**
     * Sets the taxRate1 value for this PurchaseRequisitionItem.
     * 
     * @param taxRate1
     */
    public void setTaxRate1(java.lang.Double taxRate1) {
        this.taxRate1 = taxRate1;
    }


    /**
     * Gets the taxRate2 value for this PurchaseRequisitionItem.
     * 
     * @return taxRate2
     */
    public java.lang.Double getTaxRate2() {
        return taxRate2;
    }


    /**
     * Sets the taxRate2 value for this PurchaseRequisitionItem.
     * 
     * @param taxRate2
     */
    public void setTaxRate2(java.lang.Double taxRate2) {
        this.taxRate2 = taxRate2;
    }


    /**
     * Gets the grossAmt value for this PurchaseRequisitionItem.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this PurchaseRequisitionItem.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the options value for this PurchaseRequisitionItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this PurchaseRequisitionItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the department value for this PurchaseRequisitionItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PurchaseRequisitionItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PurchaseRequisitionItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PurchaseRequisitionItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this PurchaseRequisitionItem.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PurchaseRequisitionItem.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the isBillable value for this PurchaseRequisitionItem.
     * 
     * @return isBillable
     */
    public java.lang.Boolean getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this PurchaseRequisitionItem.
     * 
     * @param isBillable
     */
    public void setIsBillable(java.lang.Boolean isBillable) {
        this.isBillable = isBillable;
    }


    /**
     * Gets the linkedOrderList value for this PurchaseRequisitionItem.
     * 
     * @return linkedOrderList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getLinkedOrderList() {
        return linkedOrderList;
    }


    /**
     * Sets the linkedOrderList value for this PurchaseRequisitionItem.
     * 
     * @param linkedOrderList
     */
    public void setLinkedOrderList(com.netsuite.webservices.platform.core_2019_1.RecordRefList linkedOrderList) {
        this.linkedOrderList = linkedOrderList;
    }


    /**
     * Gets the linkedOrderStatus value for this PurchaseRequisitionItem.
     * 
     * @return linkedOrderStatus
     */
    public java.lang.String getLinkedOrderStatus() {
        return linkedOrderStatus;
    }


    /**
     * Sets the linkedOrderStatus value for this PurchaseRequisitionItem.
     * 
     * @param linkedOrderStatus
     */
    public void setLinkedOrderStatus(java.lang.String linkedOrderStatus) {
        this.linkedOrderStatus = linkedOrderStatus;
    }


    /**
     * Gets the expectedReceiptDate value for this PurchaseRequisitionItem.
     * 
     * @return expectedReceiptDate
     */
    public java.util.Calendar getExpectedReceiptDate() {
        return expectedReceiptDate;
    }


    /**
     * Sets the expectedReceiptDate value for this PurchaseRequisitionItem.
     * 
     * @param expectedReceiptDate
     */
    public void setExpectedReceiptDate(java.util.Calendar expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }


    /**
     * Gets the isClosed value for this PurchaseRequisitionItem.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this PurchaseRequisitionItem.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the expandItemGroup value for this PurchaseRequisitionItem.
     * 
     * @return expandItemGroup
     */
    public java.lang.Boolean getExpandItemGroup() {
        return expandItemGroup;
    }


    /**
     * Sets the expandItemGroup value for this PurchaseRequisitionItem.
     * 
     * @param expandItemGroup
     */
    public void setExpandItemGroup(java.lang.Boolean expandItemGroup) {
        this.expandItemGroup = expandItemGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseRequisitionItem)) return false;
        PurchaseRequisitionItem other = (PurchaseRequisitionItem) obj;
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
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.poVendor==null && other.getPoVendor()==null) || 
             (this.poVendor!=null &&
              this.poVendor.equals(other.getPoVendor()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.estimatedRate==null && other.getEstimatedRate()==null) || 
             (this.estimatedRate!=null &&
              this.estimatedRate.equals(other.getEstimatedRate()))) &&
            ((this.estimatedAmount==null && other.getEstimatedAmount()==null) || 
             (this.estimatedAmount!=null &&
              this.estimatedAmount.equals(other.getEstimatedAmount()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxRate1==null && other.getTaxRate1()==null) || 
             (this.taxRate1!=null &&
              this.taxRate1.equals(other.getTaxRate1()))) &&
            ((this.taxRate2==null && other.getTaxRate2()==null) || 
             (this.taxRate2!=null &&
              this.taxRate2.equals(other.getTaxRate2()))) &&
            ((this.grossAmt==null && other.getGrossAmt()==null) || 
             (this.grossAmt!=null &&
              this.grossAmt.equals(other.getGrossAmt()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              this.isBillable.equals(other.getIsBillable()))) &&
            ((this.linkedOrderList==null && other.getLinkedOrderList()==null) || 
             (this.linkedOrderList!=null &&
              this.linkedOrderList.equals(other.getLinkedOrderList()))) &&
            ((this.linkedOrderStatus==null && other.getLinkedOrderStatus()==null) || 
             (this.linkedOrderStatus!=null &&
              this.linkedOrderStatus.equals(other.getLinkedOrderStatus()))) &&
            ((this.expectedReceiptDate==null && other.getExpectedReceiptDate()==null) || 
             (this.expectedReceiptDate!=null &&
              this.expectedReceiptDate.equals(other.getExpectedReceiptDate()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.expandItemGroup==null && other.getExpandItemGroup()==null) || 
             (this.expandItemGroup!=null &&
              this.expandItemGroup.equals(other.getExpandItemGroup())));
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
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getPoVendor() != null) {
            _hashCode += getPoVendor().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEstimatedRate() != null) {
            _hashCode += getEstimatedRate().hashCode();
        }
        if (getEstimatedAmount() != null) {
            _hashCode += getEstimatedAmount().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxRate1() != null) {
            _hashCode += getTaxRate1().hashCode();
        }
        if (getTaxRate2() != null) {
            _hashCode += getTaxRate2().hashCode();
        }
        if (getGrossAmt() != null) {
            _hashCode += getGrossAmt().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getIsBillable() != null) {
            _hashCode += getIsBillable().hashCode();
        }
        if (getLinkedOrderList() != null) {
            _hashCode += getLinkedOrderList().hashCode();
        }
        if (getLinkedOrderStatus() != null) {
            _hashCode += getLinkedOrderStatus().hashCode();
        }
        if (getExpectedReceiptDate() != null) {
            _hashCode += getExpectedReceiptDate().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getExpandItemGroup() != null) {
            _hashCode += getExpandItemGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseRequisitionItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseRequisitionItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "estimatedRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "estimatedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "linkedOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedOrderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "linkedOrderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandItemGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expandItemGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
