/**
 * BudgetSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BudgetSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] account;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] category;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] classnohierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] customer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] departmentnohierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] global;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationnohierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiarynohierarchy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] year;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] year2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public BudgetSearchRowBasic() {
    }

    public BudgetSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] account,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] category,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] _class,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] classnohierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] customer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] department,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] departmentnohierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] global,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationnohierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiarynohierarchy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] year,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] year2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.account = account;
        this.accountingBook = accountingBook;
        this.amount = amount;
        this.category = category;
        this._class = _class;
        this.classnohierarchy = classnohierarchy;
        this.currency = currency;
        this.customer = customer;
        this.department = department;
        this.departmentnohierarchy = departmentnohierarchy;
        this.global = global;
        this.internalId = internalId;
        this.item = item;
        this.location = location;
        this.locationnohierarchy = locationnohierarchy;
        this.subsidiary = subsidiary;
        this.subsidiarynohierarchy = subsidiarynohierarchy;
        this.year = year;
        this.year2 = year2;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the account value for this BudgetSearchRowBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this BudgetSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] account) {
        this.account = account;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the accountingBook value for this BudgetSearchRowBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this BudgetSearchRowBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.accountingBook[i] = _value;
    }


    /**
     * Gets the amount value for this BudgetSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BudgetSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the category value for this BudgetSearchRowBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this BudgetSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] category) {
        this.category = category;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the _class value for this BudgetSearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this BudgetSearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] _class) {
        this._class = _class;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the classnohierarchy value for this BudgetSearchRowBasic.
     * 
     * @return classnohierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getClassnohierarchy() {
        return classnohierarchy;
    }


    /**
     * Sets the classnohierarchy value for this BudgetSearchRowBasic.
     * 
     * @param classnohierarchy
     */
    public void setClassnohierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] classnohierarchy) {
        this.classnohierarchy = classnohierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getClassnohierarchy(int i) {
        return this.classnohierarchy[i];
    }

    public void setClassnohierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.classnohierarchy[i] = _value;
    }


    /**
     * Gets the currency value for this BudgetSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BudgetSearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the customer value for this BudgetSearchRowBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this BudgetSearchRowBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] customer) {
        this.customer = customer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.customer[i] = _value;
    }


    /**
     * Gets the department value for this BudgetSearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this BudgetSearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] department) {
        this.department = department;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the departmentnohierarchy value for this BudgetSearchRowBasic.
     * 
     * @return departmentnohierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDepartmentnohierarchy() {
        return departmentnohierarchy;
    }


    /**
     * Sets the departmentnohierarchy value for this BudgetSearchRowBasic.
     * 
     * @param departmentnohierarchy
     */
    public void setDepartmentnohierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] departmentnohierarchy) {
        this.departmentnohierarchy = departmentnohierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDepartmentnohierarchy(int i) {
        return this.departmentnohierarchy[i];
    }

    public void setDepartmentnohierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.departmentnohierarchy[i] = _value;
    }


    /**
     * Gets the global value for this BudgetSearchRowBasic.
     * 
     * @return global
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGlobal() {
        return global;
    }


    /**
     * Sets the global value for this BudgetSearchRowBasic.
     * 
     * @param global
     */
    public void setGlobal(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] global) {
        this.global = global;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getGlobal(int i) {
        return this.global[i];
    }

    public void setGlobal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.global[i] = _value;
    }


    /**
     * Gets the internalId value for this BudgetSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BudgetSearchRowBasic.
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
     * Gets the item value for this BudgetSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this BudgetSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the location value for this BudgetSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this BudgetSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the locationnohierarchy value for this BudgetSearchRowBasic.
     * 
     * @return locationnohierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocationnohierarchy() {
        return locationnohierarchy;
    }


    /**
     * Sets the locationnohierarchy value for this BudgetSearchRowBasic.
     * 
     * @param locationnohierarchy
     */
    public void setLocationnohierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locationnohierarchy) {
        this.locationnohierarchy = locationnohierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocationnohierarchy(int i) {
        return this.locationnohierarchy[i];
    }

    public void setLocationnohierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.locationnohierarchy[i] = _value;
    }


    /**
     * Gets the subsidiary value for this BudgetSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this BudgetSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the subsidiarynohierarchy value for this BudgetSearchRowBasic.
     * 
     * @return subsidiarynohierarchy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSubsidiarynohierarchy() {
        return subsidiarynohierarchy;
    }


    /**
     * Sets the subsidiarynohierarchy value for this BudgetSearchRowBasic.
     * 
     * @param subsidiarynohierarchy
     */
    public void setSubsidiarynohierarchy(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] subsidiarynohierarchy) {
        this.subsidiarynohierarchy = subsidiarynohierarchy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSubsidiarynohierarchy(int i) {
        return this.subsidiarynohierarchy[i];
    }

    public void setSubsidiarynohierarchy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.subsidiarynohierarchy[i] = _value;
    }


    /**
     * Gets the year value for this BudgetSearchRowBasic.
     * 
     * @return year
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getYear() {
        return year;
    }


    /**
     * Sets the year value for this BudgetSearchRowBasic.
     * 
     * @param year
     */
    public void setYear(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] year) {
        this.year = year;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getYear(int i) {
        return this.year[i];
    }

    public void setYear(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.year[i] = _value;
    }


    /**
     * Gets the year2 value for this BudgetSearchRowBasic.
     * 
     * @return year2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getYear2() {
        return year2;
    }


    /**
     * Sets the year2 value for this BudgetSearchRowBasic.
     * 
     * @param year2
     */
    public void setYear2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] year2) {
        this.year2 = year2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getYear2(int i) {
        return this.year2[i];
    }

    public void setYear2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.year2[i] = _value;
    }


    /**
     * Gets the customFieldList value for this BudgetSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BudgetSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetSearchRowBasic)) return false;
        BudgetSearchRowBasic other = (BudgetSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.classnohierarchy==null && other.getClassnohierarchy()==null) || 
             (this.classnohierarchy!=null &&
              java.util.Arrays.equals(this.classnohierarchy, other.getClassnohierarchy()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.departmentnohierarchy==null && other.getDepartmentnohierarchy()==null) || 
             (this.departmentnohierarchy!=null &&
              java.util.Arrays.equals(this.departmentnohierarchy, other.getDepartmentnohierarchy()))) &&
            ((this.global==null && other.getGlobal()==null) || 
             (this.global!=null &&
              java.util.Arrays.equals(this.global, other.getGlobal()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.locationnohierarchy==null && other.getLocationnohierarchy()==null) || 
             (this.locationnohierarchy!=null &&
              java.util.Arrays.equals(this.locationnohierarchy, other.getLocationnohierarchy()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.subsidiarynohierarchy==null && other.getSubsidiarynohierarchy()==null) || 
             (this.subsidiarynohierarchy!=null &&
              java.util.Arrays.equals(this.subsidiarynohierarchy, other.getSubsidiarynohierarchy()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              java.util.Arrays.equals(this.year, other.getYear()))) &&
            ((this.year2==null && other.getYear2()==null) || 
             (this.year2!=null &&
              java.util.Arrays.equals(this.year2, other.getYear2()))) &&
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
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClassnohierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassnohierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassnohierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
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
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartmentnohierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartmentnohierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartmentnohierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobal(), i);
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
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationnohierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationnohierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationnohierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiarynohierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiarynohierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiarynohierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getYear() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYear());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYear(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getYear2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYear2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYear2(), i);
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
        new org.apache.axis.description.TypeDesc(BudgetSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BudgetSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classnohierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "classnohierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentnohierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "departmentnohierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("global");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "global"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationnohierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationnohierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiarynohierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiarynohierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "year2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
