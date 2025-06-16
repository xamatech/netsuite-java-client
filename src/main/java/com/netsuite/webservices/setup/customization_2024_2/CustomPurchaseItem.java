/**
 * CustomPurchaseItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2024_2;

public class CustomPurchaseItem  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.RecordRef item;

    private java.lang.String vendorName;

    private java.lang.Long line;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef units;

    private com.netsuite.webservices.platform.common_2024_2.InventoryDetail inventoryDetail;

    private java.lang.String description;

    private java.lang.String serialNumbers;

    private java.lang.String binNumbers;

    private java.lang.Double grossAmt;

    private java.lang.String rate;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2024_2.CustomFieldList options;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef department;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef _class;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef location;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef landedCostCategory;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef customer;

    private java.lang.Boolean isBillable;

    private com.netsuite.webservices.platform.common_2024_2.types.TransactionBillVarianceStatus billVarianceStatus;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef amortizationSched;

    private java.util.Calendar amortizStartDate;

    private java.util.Calendar amortizationEndDate;

    private java.lang.String amortizationResidual;

    private java.lang.Double taxAmount;

    private java.lang.String taxDetailsReference;

    private com.netsuite.webservices.platform.common_2024_2.LandedCost landedCost;

    private com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList;

    public CustomPurchaseItem() {
    }

    public CustomPurchaseItem(
           com.netsuite.webservices.platform.core_2024_2.RecordRef item,
           java.lang.String vendorName,
           java.lang.Long line,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2024_2.RecordRef units,
           com.netsuite.webservices.platform.common_2024_2.InventoryDetail inventoryDetail,
           java.lang.String description,
           java.lang.String serialNumbers,
           java.lang.String binNumbers,
           java.lang.Double grossAmt,
           java.lang.String rate,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2024_2.CustomFieldList options,
           com.netsuite.webservices.platform.core_2024_2.RecordRef department,
           com.netsuite.webservices.platform.core_2024_2.RecordRef _class,
           com.netsuite.webservices.platform.core_2024_2.RecordRef location,
           com.netsuite.webservices.platform.core_2024_2.RecordRef landedCostCategory,
           com.netsuite.webservices.platform.core_2024_2.RecordRef customer,
           java.lang.Boolean isBillable,
           com.netsuite.webservices.platform.common_2024_2.types.TransactionBillVarianceStatus billVarianceStatus,
           com.netsuite.webservices.platform.core_2024_2.RecordRef amortizationSched,
           java.util.Calendar amortizStartDate,
           java.util.Calendar amortizationEndDate,
           java.lang.String amortizationResidual,
           java.lang.Double taxAmount,
           java.lang.String taxDetailsReference,
           com.netsuite.webservices.platform.common_2024_2.LandedCost landedCost,
           com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList) {
           this.item = item;
           this.vendorName = vendorName;
           this.line = line;
           this.quantity = quantity;
           this.units = units;
           this.inventoryDetail = inventoryDetail;
           this.description = description;
           this.serialNumbers = serialNumbers;
           this.binNumbers = binNumbers;
           this.grossAmt = grossAmt;
           this.rate = rate;
           this.amount = amount;
           this.options = options;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.landedCostCategory = landedCostCategory;
           this.customer = customer;
           this.isBillable = isBillable;
           this.billVarianceStatus = billVarianceStatus;
           this.amortizationSched = amortizationSched;
           this.amortizStartDate = amortizStartDate;
           this.amortizationEndDate = amortizationEndDate;
           this.amortizationResidual = amortizationResidual;
           this.taxAmount = taxAmount;
           this.taxDetailsReference = taxDetailsReference;
           this.landedCost = landedCost;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the item value for this CustomPurchaseItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this CustomPurchaseItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2024_2.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the vendorName value for this CustomPurchaseItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this CustomPurchaseItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the line value for this CustomPurchaseItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this CustomPurchaseItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the quantity value for this CustomPurchaseItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CustomPurchaseItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this CustomPurchaseItem.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this CustomPurchaseItem.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2024_2.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the inventoryDetail value for this CustomPurchaseItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2024_2.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this CustomPurchaseItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2024_2.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the description value for this CustomPurchaseItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomPurchaseItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the serialNumbers value for this CustomPurchaseItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this CustomPurchaseItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the binNumbers value for this CustomPurchaseItem.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this CustomPurchaseItem.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the grossAmt value for this CustomPurchaseItem.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this CustomPurchaseItem.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the rate value for this CustomPurchaseItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this CustomPurchaseItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the amount value for this CustomPurchaseItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CustomPurchaseItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the options value for this CustomPurchaseItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2024_2.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CustomPurchaseItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2024_2.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the department value for this CustomPurchaseItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CustomPurchaseItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2024_2.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this CustomPurchaseItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CustomPurchaseItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2024_2.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this CustomPurchaseItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CustomPurchaseItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2024_2.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the landedCostCategory value for this CustomPurchaseItem.
     * 
     * @return landedCostCategory
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getLandedCostCategory() {
        return landedCostCategory;
    }


    /**
     * Sets the landedCostCategory value for this CustomPurchaseItem.
     * 
     * @param landedCostCategory
     */
    public void setLandedCostCategory(com.netsuite.webservices.platform.core_2024_2.RecordRef landedCostCategory) {
        this.landedCostCategory = landedCostCategory;
    }


    /**
     * Gets the customer value for this CustomPurchaseItem.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CustomPurchaseItem.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2024_2.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the isBillable value for this CustomPurchaseItem.
     * 
     * @return isBillable
     */
    public java.lang.Boolean getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this CustomPurchaseItem.
     * 
     * @param isBillable
     */
    public void setIsBillable(java.lang.Boolean isBillable) {
        this.isBillable = isBillable;
    }


    /**
     * Gets the billVarianceStatus value for this CustomPurchaseItem.
     * 
     * @return billVarianceStatus
     */
    public com.netsuite.webservices.platform.common_2024_2.types.TransactionBillVarianceStatus getBillVarianceStatus() {
        return billVarianceStatus;
    }


    /**
     * Sets the billVarianceStatus value for this CustomPurchaseItem.
     * 
     * @param billVarianceStatus
     */
    public void setBillVarianceStatus(com.netsuite.webservices.platform.common_2024_2.types.TransactionBillVarianceStatus billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }


    /**
     * Gets the amortizationSched value for this CustomPurchaseItem.
     * 
     * @return amortizationSched
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getAmortizationSched() {
        return amortizationSched;
    }


    /**
     * Sets the amortizationSched value for this CustomPurchaseItem.
     * 
     * @param amortizationSched
     */
    public void setAmortizationSched(com.netsuite.webservices.platform.core_2024_2.RecordRef amortizationSched) {
        this.amortizationSched = amortizationSched;
    }


    /**
     * Gets the amortizStartDate value for this CustomPurchaseItem.
     * 
     * @return amortizStartDate
     */
    public java.util.Calendar getAmortizStartDate() {
        return amortizStartDate;
    }


    /**
     * Sets the amortizStartDate value for this CustomPurchaseItem.
     * 
     * @param amortizStartDate
     */
    public void setAmortizStartDate(java.util.Calendar amortizStartDate) {
        this.amortizStartDate = amortizStartDate;
    }


    /**
     * Gets the amortizationEndDate value for this CustomPurchaseItem.
     * 
     * @return amortizationEndDate
     */
    public java.util.Calendar getAmortizationEndDate() {
        return amortizationEndDate;
    }


    /**
     * Sets the amortizationEndDate value for this CustomPurchaseItem.
     * 
     * @param amortizationEndDate
     */
    public void setAmortizationEndDate(java.util.Calendar amortizationEndDate) {
        this.amortizationEndDate = amortizationEndDate;
    }


    /**
     * Gets the amortizationResidual value for this CustomPurchaseItem.
     * 
     * @return amortizationResidual
     */
    public java.lang.String getAmortizationResidual() {
        return amortizationResidual;
    }


    /**
     * Sets the amortizationResidual value for this CustomPurchaseItem.
     * 
     * @param amortizationResidual
     */
    public void setAmortizationResidual(java.lang.String amortizationResidual) {
        this.amortizationResidual = amortizationResidual;
    }


    /**
     * Gets the taxAmount value for this CustomPurchaseItem.
     * 
     * @return taxAmount
     */
    public java.lang.Double getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this CustomPurchaseItem.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Double taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxDetailsReference value for this CustomPurchaseItem.
     * 
     * @return taxDetailsReference
     */
    public java.lang.String getTaxDetailsReference() {
        return taxDetailsReference;
    }


    /**
     * Sets the taxDetailsReference value for this CustomPurchaseItem.
     * 
     * @param taxDetailsReference
     */
    public void setTaxDetailsReference(java.lang.String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }


    /**
     * Gets the landedCost value for this CustomPurchaseItem.
     * 
     * @return landedCost
     */
    public com.netsuite.webservices.platform.common_2024_2.LandedCost getLandedCost() {
        return landedCost;
    }


    /**
     * Sets the landedCost value for this CustomPurchaseItem.
     * 
     * @param landedCost
     */
    public void setLandedCost(com.netsuite.webservices.platform.common_2024_2.LandedCost landedCost) {
        this.landedCost = landedCost;
    }


    /**
     * Gets the customFieldList value for this CustomPurchaseItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomPurchaseItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPurchaseItem)) return false;
        CustomPurchaseItem other = (CustomPurchaseItem) obj;
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
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
            ((this.grossAmt==null && other.getGrossAmt()==null) || 
             (this.grossAmt!=null &&
              this.grossAmt.equals(other.getGrossAmt()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.landedCostCategory==null && other.getLandedCostCategory()==null) || 
             (this.landedCostCategory!=null &&
              this.landedCostCategory.equals(other.getLandedCostCategory()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              this.isBillable.equals(other.getIsBillable()))) &&
            ((this.billVarianceStatus==null && other.getBillVarianceStatus()==null) || 
             (this.billVarianceStatus!=null &&
              this.billVarianceStatus.equals(other.getBillVarianceStatus()))) &&
            ((this.amortizationSched==null && other.getAmortizationSched()==null) || 
             (this.amortizationSched!=null &&
              this.amortizationSched.equals(other.getAmortizationSched()))) &&
            ((this.amortizStartDate==null && other.getAmortizStartDate()==null) || 
             (this.amortizStartDate!=null &&
              this.amortizStartDate.equals(other.getAmortizStartDate()))) &&
            ((this.amortizationEndDate==null && other.getAmortizationEndDate()==null) || 
             (this.amortizationEndDate!=null &&
              this.amortizationEndDate.equals(other.getAmortizationEndDate()))) &&
            ((this.amortizationResidual==null && other.getAmortizationResidual()==null) || 
             (this.amortizationResidual!=null &&
              this.amortizationResidual.equals(other.getAmortizationResidual()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxDetailsReference==null && other.getTaxDetailsReference()==null) || 
             (this.taxDetailsReference!=null &&
              this.taxDetailsReference.equals(other.getTaxDetailsReference()))) &&
            ((this.landedCost==null && other.getLandedCost()==null) || 
             (this.landedCost!=null &&
              this.landedCost.equals(other.getLandedCost()))) &&
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
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
        }
        if (getGrossAmt() != null) {
            _hashCode += getGrossAmt().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLandedCostCategory() != null) {
            _hashCode += getLandedCostCategory().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getIsBillable() != null) {
            _hashCode += getIsBillable().hashCode();
        }
        if (getBillVarianceStatus() != null) {
            _hashCode += getBillVarianceStatus().hashCode();
        }
        if (getAmortizationSched() != null) {
            _hashCode += getAmortizationSched().hashCode();
        }
        if (getAmortizStartDate() != null) {
            _hashCode += getAmortizStartDate().hashCode();
        }
        if (getAmortizationEndDate() != null) {
            _hashCode += getAmortizationEndDate().hashCode();
        }
        if (getAmortizationResidual() != null) {
            _hashCode += getAmortizationResidual().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxDetailsReference() != null) {
            _hashCode += getTaxDetailsReference().hashCode();
        }
        if (getLandedCost() != null) {
            _hashCode += getLandedCost().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomPurchaseItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomPurchaseItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "landedCostCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2024_2.platform.webservices.netsuite.com", "TransactionBillVarianceStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationSched");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "amortizationSched"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "amortizStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "amortizationEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationResidual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "amortizationResidual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "landedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "LandedCost"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
