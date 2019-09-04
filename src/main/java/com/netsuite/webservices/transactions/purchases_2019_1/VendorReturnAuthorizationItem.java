/**
 * VendorReturnAuthorizationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class VendorReturnAuthorizationItem  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.String vendorName;

    private java.lang.Long line;

    private java.lang.Long orderLine;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList serialNumbersList;

    private java.lang.String description;

    private java.lang.String binNumbers;

    private java.lang.String rate;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode;

    private java.lang.Double taxRate1;

    private java.lang.Double taxRate2;

    private java.lang.Double grossAmt;

    private java.lang.Double tax1Amt;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList options;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private java.lang.Boolean isBillable;

    private java.lang.Boolean isClosed;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationSched;

    private java.lang.Boolean isDropShipment;

    private java.lang.Double taxAmount;

    private java.lang.String taxDetailsReference;

    private java.util.Calendar amortizStartDate;

    private java.util.Calendar amortizationEndDate;

    private java.lang.String amortizationResidual;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public VendorReturnAuthorizationItem() {
    }

    public VendorReturnAuthorizationItem(
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.String vendorName,
           java.lang.Long line,
           java.lang.Long orderLine,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList serialNumbersList,
           java.lang.String description,
           java.lang.String binNumbers,
           java.lang.String rate,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode,
           java.lang.Double taxRate1,
           java.lang.Double taxRate2,
           java.lang.Double grossAmt,
           java.lang.Double tax1Amt,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList options,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           java.lang.Boolean isBillable,
           java.lang.Boolean isClosed,
           com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationSched,
           java.lang.Boolean isDropShipment,
           java.lang.Double taxAmount,
           java.lang.String taxDetailsReference,
           java.util.Calendar amortizStartDate,
           java.util.Calendar amortizationEndDate,
           java.lang.String amortizationResidual,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.item = item;
           this.vendorName = vendorName;
           this.line = line;
           this.orderLine = orderLine;
           this.quantity = quantity;
           this.units = units;
           this.inventoryDetail = inventoryDetail;
           this.serialNumbersList = serialNumbersList;
           this.description = description;
           this.binNumbers = binNumbers;
           this.rate = rate;
           this.amount = amount;
           this.taxCode = taxCode;
           this.taxRate1 = taxRate1;
           this.taxRate2 = taxRate2;
           this.grossAmt = grossAmt;
           this.tax1Amt = tax1Amt;
           this.options = options;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.customer = customer;
           this.isBillable = isBillable;
           this.isClosed = isClosed;
           this.amortizationSched = amortizationSched;
           this.isDropShipment = isDropShipment;
           this.taxAmount = taxAmount;
           this.taxDetailsReference = taxDetailsReference;
           this.amortizStartDate = amortizStartDate;
           this.amortizationEndDate = amortizationEndDate;
           this.amortizationResidual = amortizationResidual;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the item value for this VendorReturnAuthorizationItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this VendorReturnAuthorizationItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the vendorName value for this VendorReturnAuthorizationItem.
     * 
     * @return vendorName
     */
    public java.lang.String getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this VendorReturnAuthorizationItem.
     * 
     * @param vendorName
     */
    public void setVendorName(java.lang.String vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the line value for this VendorReturnAuthorizationItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this VendorReturnAuthorizationItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the orderLine value for this VendorReturnAuthorizationItem.
     * 
     * @return orderLine
     */
    public java.lang.Long getOrderLine() {
        return orderLine;
    }


    /**
     * Sets the orderLine value for this VendorReturnAuthorizationItem.
     * 
     * @param orderLine
     */
    public void setOrderLine(java.lang.Long orderLine) {
        this.orderLine = orderLine;
    }


    /**
     * Gets the quantity value for this VendorReturnAuthorizationItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this VendorReturnAuthorizationItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this VendorReturnAuthorizationItem.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this VendorReturnAuthorizationItem.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the inventoryDetail value for this VendorReturnAuthorizationItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this VendorReturnAuthorizationItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the serialNumbersList value for this VendorReturnAuthorizationItem.
     * 
     * @return serialNumbersList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSerialNumbersList() {
        return serialNumbersList;
    }


    /**
     * Sets the serialNumbersList value for this VendorReturnAuthorizationItem.
     * 
     * @param serialNumbersList
     */
    public void setSerialNumbersList(com.netsuite.webservices.platform.core_2019_1.RecordRefList serialNumbersList) {
        this.serialNumbersList = serialNumbersList;
    }


    /**
     * Gets the description value for this VendorReturnAuthorizationItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VendorReturnAuthorizationItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the binNumbers value for this VendorReturnAuthorizationItem.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this VendorReturnAuthorizationItem.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the rate value for this VendorReturnAuthorizationItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this VendorReturnAuthorizationItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the amount value for this VendorReturnAuthorizationItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VendorReturnAuthorizationItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the taxCode value for this VendorReturnAuthorizationItem.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this VendorReturnAuthorizationItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate1 value for this VendorReturnAuthorizationItem.
     * 
     * @return taxRate1
     */
    public java.lang.Double getTaxRate1() {
        return taxRate1;
    }


    /**
     * Sets the taxRate1 value for this VendorReturnAuthorizationItem.
     * 
     * @param taxRate1
     */
    public void setTaxRate1(java.lang.Double taxRate1) {
        this.taxRate1 = taxRate1;
    }


    /**
     * Gets the taxRate2 value for this VendorReturnAuthorizationItem.
     * 
     * @return taxRate2
     */
    public java.lang.Double getTaxRate2() {
        return taxRate2;
    }


    /**
     * Sets the taxRate2 value for this VendorReturnAuthorizationItem.
     * 
     * @param taxRate2
     */
    public void setTaxRate2(java.lang.Double taxRate2) {
        this.taxRate2 = taxRate2;
    }


    /**
     * Gets the grossAmt value for this VendorReturnAuthorizationItem.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this VendorReturnAuthorizationItem.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the tax1Amt value for this VendorReturnAuthorizationItem.
     * 
     * @return tax1Amt
     */
    public java.lang.Double getTax1Amt() {
        return tax1Amt;
    }


    /**
     * Sets the tax1Amt value for this VendorReturnAuthorizationItem.
     * 
     * @param tax1Amt
     */
    public void setTax1Amt(java.lang.Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }


    /**
     * Gets the options value for this VendorReturnAuthorizationItem.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this VendorReturnAuthorizationItem.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the department value for this VendorReturnAuthorizationItem.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this VendorReturnAuthorizationItem.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this VendorReturnAuthorizationItem.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this VendorReturnAuthorizationItem.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this VendorReturnAuthorizationItem.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this VendorReturnAuthorizationItem.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the customer value for this VendorReturnAuthorizationItem.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this VendorReturnAuthorizationItem.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the isBillable value for this VendorReturnAuthorizationItem.
     * 
     * @return isBillable
     */
    public java.lang.Boolean getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this VendorReturnAuthorizationItem.
     * 
     * @param isBillable
     */
    public void setIsBillable(java.lang.Boolean isBillable) {
        this.isBillable = isBillable;
    }


    /**
     * Gets the isClosed value for this VendorReturnAuthorizationItem.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this VendorReturnAuthorizationItem.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the amortizationSched value for this VendorReturnAuthorizationItem.
     * 
     * @return amortizationSched
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAmortizationSched() {
        return amortizationSched;
    }


    /**
     * Sets the amortizationSched value for this VendorReturnAuthorizationItem.
     * 
     * @param amortizationSched
     */
    public void setAmortizationSched(com.netsuite.webservices.platform.core_2019_1.RecordRef amortizationSched) {
        this.amortizationSched = amortizationSched;
    }


    /**
     * Gets the isDropShipment value for this VendorReturnAuthorizationItem.
     * 
     * @return isDropShipment
     */
    public java.lang.Boolean getIsDropShipment() {
        return isDropShipment;
    }


    /**
     * Sets the isDropShipment value for this VendorReturnAuthorizationItem.
     * 
     * @param isDropShipment
     */
    public void setIsDropShipment(java.lang.Boolean isDropShipment) {
        this.isDropShipment = isDropShipment;
    }


    /**
     * Gets the taxAmount value for this VendorReturnAuthorizationItem.
     * 
     * @return taxAmount
     */
    public java.lang.Double getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this VendorReturnAuthorizationItem.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Double taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxDetailsReference value for this VendorReturnAuthorizationItem.
     * 
     * @return taxDetailsReference
     */
    public java.lang.String getTaxDetailsReference() {
        return taxDetailsReference;
    }


    /**
     * Sets the taxDetailsReference value for this VendorReturnAuthorizationItem.
     * 
     * @param taxDetailsReference
     */
    public void setTaxDetailsReference(java.lang.String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }


    /**
     * Gets the amortizStartDate value for this VendorReturnAuthorizationItem.
     * 
     * @return amortizStartDate
     */
    public java.util.Calendar getAmortizStartDate() {
        return amortizStartDate;
    }


    /**
     * Sets the amortizStartDate value for this VendorReturnAuthorizationItem.
     * 
     * @param amortizStartDate
     */
    public void setAmortizStartDate(java.util.Calendar amortizStartDate) {
        this.amortizStartDate = amortizStartDate;
    }


    /**
     * Gets the amortizationEndDate value for this VendorReturnAuthorizationItem.
     * 
     * @return amortizationEndDate
     */
    public java.util.Calendar getAmortizationEndDate() {
        return amortizationEndDate;
    }


    /**
     * Sets the amortizationEndDate value for this VendorReturnAuthorizationItem.
     * 
     * @param amortizationEndDate
     */
    public void setAmortizationEndDate(java.util.Calendar amortizationEndDate) {
        this.amortizationEndDate = amortizationEndDate;
    }


    /**
     * Gets the amortizationResidual value for this VendorReturnAuthorizationItem.
     * 
     * @return amortizationResidual
     */
    public java.lang.String getAmortizationResidual() {
        return amortizationResidual;
    }


    /**
     * Sets the amortizationResidual value for this VendorReturnAuthorizationItem.
     * 
     * @param amortizationResidual
     */
    public void setAmortizationResidual(java.lang.String amortizationResidual) {
        this.amortizationResidual = amortizationResidual;
    }


    /**
     * Gets the customFieldList value for this VendorReturnAuthorizationItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this VendorReturnAuthorizationItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorReturnAuthorizationItem)) return false;
        VendorReturnAuthorizationItem other = (VendorReturnAuthorizationItem) obj;
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
            ((this.orderLine==null && other.getOrderLine()==null) || 
             (this.orderLine!=null &&
              this.orderLine.equals(other.getOrderLine()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.serialNumbersList==null && other.getSerialNumbersList()==null) || 
             (this.serialNumbersList!=null &&
              this.serialNumbersList.equals(other.getSerialNumbersList()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
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
            ((this.tax1Amt==null && other.getTax1Amt()==null) || 
             (this.tax1Amt!=null &&
              this.tax1Amt.equals(other.getTax1Amt()))) &&
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
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              this.isBillable.equals(other.getIsBillable()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.amortizationSched==null && other.getAmortizationSched()==null) || 
             (this.amortizationSched!=null &&
              this.amortizationSched.equals(other.getAmortizationSched()))) &&
            ((this.isDropShipment==null && other.getIsDropShipment()==null) || 
             (this.isDropShipment!=null &&
              this.isDropShipment.equals(other.getIsDropShipment()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxDetailsReference==null && other.getTaxDetailsReference()==null) || 
             (this.taxDetailsReference!=null &&
              this.taxDetailsReference.equals(other.getTaxDetailsReference()))) &&
            ((this.amortizStartDate==null && other.getAmortizStartDate()==null) || 
             (this.amortizStartDate!=null &&
              this.amortizStartDate.equals(other.getAmortizStartDate()))) &&
            ((this.amortizationEndDate==null && other.getAmortizationEndDate()==null) || 
             (this.amortizationEndDate!=null &&
              this.amortizationEndDate.equals(other.getAmortizationEndDate()))) &&
            ((this.amortizationResidual==null && other.getAmortizationResidual()==null) || 
             (this.amortizationResidual!=null &&
              this.amortizationResidual.equals(other.getAmortizationResidual()))) &&
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
        if (getOrderLine() != null) {
            _hashCode += getOrderLine().hashCode();
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
        if (getSerialNumbersList() != null) {
            _hashCode += getSerialNumbersList().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
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
        if (getTax1Amt() != null) {
            _hashCode += getTax1Amt().hashCode();
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getIsBillable() != null) {
            _hashCode += getIsBillable().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getAmortizationSched() != null) {
            _hashCode += getAmortizationSched().hashCode();
        }
        if (getIsDropShipment() != null) {
            _hashCode += getIsDropShipment().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxDetailsReference() != null) {
            _hashCode += getTaxDetailsReference().hashCode();
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorReturnAuthorizationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "serialNumbersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "tax1Amt"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "location"));
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
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationSched");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "amortizationSched"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "isDropShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "amortizStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "amortizationEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationResidual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "amortizationResidual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
