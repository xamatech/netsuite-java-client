/**
 * Budget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.financial_2019_1;

public class Budget  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef year;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customer;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef category;

    private com.netsuite.webservices.transactions.financial_2019_1.types.BudgetBudgetType budgetType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double periodAmount1;

    private java.lang.Double periodAmount2;

    private java.lang.Double periodAmount3;

    private java.lang.Double periodAmount4;

    private java.lang.Double periodAmount5;

    private java.lang.Double periodAmount6;

    private java.lang.Double periodAmount7;

    private java.lang.Double periodAmount8;

    private java.lang.Double periodAmount9;

    private java.lang.Double periodAmount10;

    private java.lang.Double periodAmount11;

    private java.lang.Double periodAmount12;

    private java.lang.Double periodAmount13;

    private java.lang.Double periodAmount14;

    private java.lang.Double periodAmount15;

    private java.lang.Double periodAmount16;

    private java.lang.Double periodAmount17;

    private java.lang.Double periodAmount18;

    private java.lang.Double periodAmount19;

    private java.lang.Double periodAmount20;

    private java.lang.Double periodAmount21;

    private java.lang.Double periodAmount22;

    private java.lang.Double periodAmount23;

    private java.lang.Double periodAmount24;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    public Budget() {
    }

    public Budget(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef year,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customer,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef category,
           com.netsuite.webservices.transactions.financial_2019_1.types.BudgetBudgetType budgetType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double periodAmount1,
           java.lang.Double periodAmount2,
           java.lang.Double periodAmount3,
           java.lang.Double periodAmount4,
           java.lang.Double periodAmount5,
           java.lang.Double periodAmount6,
           java.lang.Double periodAmount7,
           java.lang.Double periodAmount8,
           java.lang.Double periodAmount9,
           java.lang.Double periodAmount10,
           java.lang.Double periodAmount11,
           java.lang.Double periodAmount12,
           java.lang.Double periodAmount13,
           java.lang.Double periodAmount14,
           java.lang.Double periodAmount15,
           java.lang.Double periodAmount16,
           java.lang.Double periodAmount17,
           java.lang.Double periodAmount18,
           java.lang.Double periodAmount19,
           java.lang.Double periodAmount20,
           java.lang.Double periodAmount21,
           java.lang.Double periodAmount22,
           java.lang.Double periodAmount23,
           java.lang.Double periodAmount24,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef accountingBook,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.year = year;
        this.customer = customer;
        this.item = item;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.account = account;
        this.subsidiary = subsidiary;
        this.category = category;
        this.budgetType = budgetType;
        this.currency = currency;
        this.periodAmount1 = periodAmount1;
        this.periodAmount2 = periodAmount2;
        this.periodAmount3 = periodAmount3;
        this.periodAmount4 = periodAmount4;
        this.periodAmount5 = periodAmount5;
        this.periodAmount6 = periodAmount6;
        this.periodAmount7 = periodAmount7;
        this.periodAmount8 = periodAmount8;
        this.periodAmount9 = periodAmount9;
        this.periodAmount10 = periodAmount10;
        this.periodAmount11 = periodAmount11;
        this.periodAmount12 = periodAmount12;
        this.periodAmount13 = periodAmount13;
        this.periodAmount14 = periodAmount14;
        this.periodAmount15 = periodAmount15;
        this.periodAmount16 = periodAmount16;
        this.periodAmount17 = periodAmount17;
        this.periodAmount18 = periodAmount18;
        this.periodAmount19 = periodAmount19;
        this.periodAmount20 = periodAmount20;
        this.periodAmount21 = periodAmount21;
        this.periodAmount22 = periodAmount22;
        this.periodAmount23 = periodAmount23;
        this.periodAmount24 = periodAmount24;
        this.amount = amount;
        this.accountingBook = accountingBook;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the year value for this Budget.
     * 
     * @return year
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getYear() {
        return year;
    }


    /**
     * Sets the year value for this Budget.
     * 
     * @param year
     */
    public void setYear(com.netsuite.webservices.platform.core_2019_1.RecordRef year) {
        this.year = year;
    }


    /**
     * Gets the customer value for this Budget.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Budget.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2019_1.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the item value for this Budget.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this Budget.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the _class value for this Budget.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Budget.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this Budget.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Budget.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Budget.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Budget.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the account value for this Budget.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Budget.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the subsidiary value for this Budget.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Budget.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the category value for this Budget.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Budget.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the budgetType value for this Budget.
     * 
     * @return budgetType
     */
    public com.netsuite.webservices.transactions.financial_2019_1.types.BudgetBudgetType getBudgetType() {
        return budgetType;
    }


    /**
     * Sets the budgetType value for this Budget.
     * 
     * @param budgetType
     */
    public void setBudgetType(com.netsuite.webservices.transactions.financial_2019_1.types.BudgetBudgetType budgetType) {
        this.budgetType = budgetType;
    }


    /**
     * Gets the currency value for this Budget.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Budget.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the periodAmount1 value for this Budget.
     * 
     * @return periodAmount1
     */
    public java.lang.Double getPeriodAmount1() {
        return periodAmount1;
    }


    /**
     * Sets the periodAmount1 value for this Budget.
     * 
     * @param periodAmount1
     */
    public void setPeriodAmount1(java.lang.Double periodAmount1) {
        this.periodAmount1 = periodAmount1;
    }


    /**
     * Gets the periodAmount2 value for this Budget.
     * 
     * @return periodAmount2
     */
    public java.lang.Double getPeriodAmount2() {
        return periodAmount2;
    }


    /**
     * Sets the periodAmount2 value for this Budget.
     * 
     * @param periodAmount2
     */
    public void setPeriodAmount2(java.lang.Double periodAmount2) {
        this.periodAmount2 = periodAmount2;
    }


    /**
     * Gets the periodAmount3 value for this Budget.
     * 
     * @return periodAmount3
     */
    public java.lang.Double getPeriodAmount3() {
        return periodAmount3;
    }


    /**
     * Sets the periodAmount3 value for this Budget.
     * 
     * @param periodAmount3
     */
    public void setPeriodAmount3(java.lang.Double periodAmount3) {
        this.periodAmount3 = periodAmount3;
    }


    /**
     * Gets the periodAmount4 value for this Budget.
     * 
     * @return periodAmount4
     */
    public java.lang.Double getPeriodAmount4() {
        return periodAmount4;
    }


    /**
     * Sets the periodAmount4 value for this Budget.
     * 
     * @param periodAmount4
     */
    public void setPeriodAmount4(java.lang.Double periodAmount4) {
        this.periodAmount4 = periodAmount4;
    }


    /**
     * Gets the periodAmount5 value for this Budget.
     * 
     * @return periodAmount5
     */
    public java.lang.Double getPeriodAmount5() {
        return periodAmount5;
    }


    /**
     * Sets the periodAmount5 value for this Budget.
     * 
     * @param periodAmount5
     */
    public void setPeriodAmount5(java.lang.Double periodAmount5) {
        this.periodAmount5 = periodAmount5;
    }


    /**
     * Gets the periodAmount6 value for this Budget.
     * 
     * @return periodAmount6
     */
    public java.lang.Double getPeriodAmount6() {
        return periodAmount6;
    }


    /**
     * Sets the periodAmount6 value for this Budget.
     * 
     * @param periodAmount6
     */
    public void setPeriodAmount6(java.lang.Double periodAmount6) {
        this.periodAmount6 = periodAmount6;
    }


    /**
     * Gets the periodAmount7 value for this Budget.
     * 
     * @return periodAmount7
     */
    public java.lang.Double getPeriodAmount7() {
        return periodAmount7;
    }


    /**
     * Sets the periodAmount7 value for this Budget.
     * 
     * @param periodAmount7
     */
    public void setPeriodAmount7(java.lang.Double periodAmount7) {
        this.periodAmount7 = periodAmount7;
    }


    /**
     * Gets the periodAmount8 value for this Budget.
     * 
     * @return periodAmount8
     */
    public java.lang.Double getPeriodAmount8() {
        return periodAmount8;
    }


    /**
     * Sets the periodAmount8 value for this Budget.
     * 
     * @param periodAmount8
     */
    public void setPeriodAmount8(java.lang.Double periodAmount8) {
        this.periodAmount8 = periodAmount8;
    }


    /**
     * Gets the periodAmount9 value for this Budget.
     * 
     * @return periodAmount9
     */
    public java.lang.Double getPeriodAmount9() {
        return periodAmount9;
    }


    /**
     * Sets the periodAmount9 value for this Budget.
     * 
     * @param periodAmount9
     */
    public void setPeriodAmount9(java.lang.Double periodAmount9) {
        this.periodAmount9 = periodAmount9;
    }


    /**
     * Gets the periodAmount10 value for this Budget.
     * 
     * @return periodAmount10
     */
    public java.lang.Double getPeriodAmount10() {
        return periodAmount10;
    }


    /**
     * Sets the periodAmount10 value for this Budget.
     * 
     * @param periodAmount10
     */
    public void setPeriodAmount10(java.lang.Double periodAmount10) {
        this.periodAmount10 = periodAmount10;
    }


    /**
     * Gets the periodAmount11 value for this Budget.
     * 
     * @return periodAmount11
     */
    public java.lang.Double getPeriodAmount11() {
        return periodAmount11;
    }


    /**
     * Sets the periodAmount11 value for this Budget.
     * 
     * @param periodAmount11
     */
    public void setPeriodAmount11(java.lang.Double periodAmount11) {
        this.periodAmount11 = periodAmount11;
    }


    /**
     * Gets the periodAmount12 value for this Budget.
     * 
     * @return periodAmount12
     */
    public java.lang.Double getPeriodAmount12() {
        return periodAmount12;
    }


    /**
     * Sets the periodAmount12 value for this Budget.
     * 
     * @param periodAmount12
     */
    public void setPeriodAmount12(java.lang.Double periodAmount12) {
        this.periodAmount12 = periodAmount12;
    }


    /**
     * Gets the periodAmount13 value for this Budget.
     * 
     * @return periodAmount13
     */
    public java.lang.Double getPeriodAmount13() {
        return periodAmount13;
    }


    /**
     * Sets the periodAmount13 value for this Budget.
     * 
     * @param periodAmount13
     */
    public void setPeriodAmount13(java.lang.Double periodAmount13) {
        this.periodAmount13 = periodAmount13;
    }


    /**
     * Gets the periodAmount14 value for this Budget.
     * 
     * @return periodAmount14
     */
    public java.lang.Double getPeriodAmount14() {
        return periodAmount14;
    }


    /**
     * Sets the periodAmount14 value for this Budget.
     * 
     * @param periodAmount14
     */
    public void setPeriodAmount14(java.lang.Double periodAmount14) {
        this.periodAmount14 = periodAmount14;
    }


    /**
     * Gets the periodAmount15 value for this Budget.
     * 
     * @return periodAmount15
     */
    public java.lang.Double getPeriodAmount15() {
        return periodAmount15;
    }


    /**
     * Sets the periodAmount15 value for this Budget.
     * 
     * @param periodAmount15
     */
    public void setPeriodAmount15(java.lang.Double periodAmount15) {
        this.periodAmount15 = periodAmount15;
    }


    /**
     * Gets the periodAmount16 value for this Budget.
     * 
     * @return periodAmount16
     */
    public java.lang.Double getPeriodAmount16() {
        return periodAmount16;
    }


    /**
     * Sets the periodAmount16 value for this Budget.
     * 
     * @param periodAmount16
     */
    public void setPeriodAmount16(java.lang.Double periodAmount16) {
        this.periodAmount16 = periodAmount16;
    }


    /**
     * Gets the periodAmount17 value for this Budget.
     * 
     * @return periodAmount17
     */
    public java.lang.Double getPeriodAmount17() {
        return periodAmount17;
    }


    /**
     * Sets the periodAmount17 value for this Budget.
     * 
     * @param periodAmount17
     */
    public void setPeriodAmount17(java.lang.Double periodAmount17) {
        this.periodAmount17 = periodAmount17;
    }


    /**
     * Gets the periodAmount18 value for this Budget.
     * 
     * @return periodAmount18
     */
    public java.lang.Double getPeriodAmount18() {
        return periodAmount18;
    }


    /**
     * Sets the periodAmount18 value for this Budget.
     * 
     * @param periodAmount18
     */
    public void setPeriodAmount18(java.lang.Double periodAmount18) {
        this.periodAmount18 = periodAmount18;
    }


    /**
     * Gets the periodAmount19 value for this Budget.
     * 
     * @return periodAmount19
     */
    public java.lang.Double getPeriodAmount19() {
        return periodAmount19;
    }


    /**
     * Sets the periodAmount19 value for this Budget.
     * 
     * @param periodAmount19
     */
    public void setPeriodAmount19(java.lang.Double periodAmount19) {
        this.periodAmount19 = periodAmount19;
    }


    /**
     * Gets the periodAmount20 value for this Budget.
     * 
     * @return periodAmount20
     */
    public java.lang.Double getPeriodAmount20() {
        return periodAmount20;
    }


    /**
     * Sets the periodAmount20 value for this Budget.
     * 
     * @param periodAmount20
     */
    public void setPeriodAmount20(java.lang.Double periodAmount20) {
        this.periodAmount20 = periodAmount20;
    }


    /**
     * Gets the periodAmount21 value for this Budget.
     * 
     * @return periodAmount21
     */
    public java.lang.Double getPeriodAmount21() {
        return periodAmount21;
    }


    /**
     * Sets the periodAmount21 value for this Budget.
     * 
     * @param periodAmount21
     */
    public void setPeriodAmount21(java.lang.Double periodAmount21) {
        this.periodAmount21 = periodAmount21;
    }


    /**
     * Gets the periodAmount22 value for this Budget.
     * 
     * @return periodAmount22
     */
    public java.lang.Double getPeriodAmount22() {
        return periodAmount22;
    }


    /**
     * Sets the periodAmount22 value for this Budget.
     * 
     * @param periodAmount22
     */
    public void setPeriodAmount22(java.lang.Double periodAmount22) {
        this.periodAmount22 = periodAmount22;
    }


    /**
     * Gets the periodAmount23 value for this Budget.
     * 
     * @return periodAmount23
     */
    public java.lang.Double getPeriodAmount23() {
        return periodAmount23;
    }


    /**
     * Sets the periodAmount23 value for this Budget.
     * 
     * @param periodAmount23
     */
    public void setPeriodAmount23(java.lang.Double periodAmount23) {
        this.periodAmount23 = periodAmount23;
    }


    /**
     * Gets the periodAmount24 value for this Budget.
     * 
     * @return periodAmount24
     */
    public java.lang.Double getPeriodAmount24() {
        return periodAmount24;
    }


    /**
     * Sets the periodAmount24 value for this Budget.
     * 
     * @param periodAmount24
     */
    public void setPeriodAmount24(java.lang.Double periodAmount24) {
        this.periodAmount24 = periodAmount24;
    }


    /**
     * Gets the amount value for this Budget.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Budget.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the accountingBook value for this Budget.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this Budget.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.RecordRef accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the customFieldList value for this Budget.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Budget.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Budget.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Budget.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Budget)) return false;
        Budget other = (Budget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.budgetType==null && other.getBudgetType()==null) || 
             (this.budgetType!=null &&
              this.budgetType.equals(other.getBudgetType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.periodAmount1==null && other.getPeriodAmount1()==null) || 
             (this.periodAmount1!=null &&
              this.periodAmount1.equals(other.getPeriodAmount1()))) &&
            ((this.periodAmount2==null && other.getPeriodAmount2()==null) || 
             (this.periodAmount2!=null &&
              this.periodAmount2.equals(other.getPeriodAmount2()))) &&
            ((this.periodAmount3==null && other.getPeriodAmount3()==null) || 
             (this.periodAmount3!=null &&
              this.periodAmount3.equals(other.getPeriodAmount3()))) &&
            ((this.periodAmount4==null && other.getPeriodAmount4()==null) || 
             (this.periodAmount4!=null &&
              this.periodAmount4.equals(other.getPeriodAmount4()))) &&
            ((this.periodAmount5==null && other.getPeriodAmount5()==null) || 
             (this.periodAmount5!=null &&
              this.periodAmount5.equals(other.getPeriodAmount5()))) &&
            ((this.periodAmount6==null && other.getPeriodAmount6()==null) || 
             (this.periodAmount6!=null &&
              this.periodAmount6.equals(other.getPeriodAmount6()))) &&
            ((this.periodAmount7==null && other.getPeriodAmount7()==null) || 
             (this.periodAmount7!=null &&
              this.periodAmount7.equals(other.getPeriodAmount7()))) &&
            ((this.periodAmount8==null && other.getPeriodAmount8()==null) || 
             (this.periodAmount8!=null &&
              this.periodAmount8.equals(other.getPeriodAmount8()))) &&
            ((this.periodAmount9==null && other.getPeriodAmount9()==null) || 
             (this.periodAmount9!=null &&
              this.periodAmount9.equals(other.getPeriodAmount9()))) &&
            ((this.periodAmount10==null && other.getPeriodAmount10()==null) || 
             (this.periodAmount10!=null &&
              this.periodAmount10.equals(other.getPeriodAmount10()))) &&
            ((this.periodAmount11==null && other.getPeriodAmount11()==null) || 
             (this.periodAmount11!=null &&
              this.periodAmount11.equals(other.getPeriodAmount11()))) &&
            ((this.periodAmount12==null && other.getPeriodAmount12()==null) || 
             (this.periodAmount12!=null &&
              this.periodAmount12.equals(other.getPeriodAmount12()))) &&
            ((this.periodAmount13==null && other.getPeriodAmount13()==null) || 
             (this.periodAmount13!=null &&
              this.periodAmount13.equals(other.getPeriodAmount13()))) &&
            ((this.periodAmount14==null && other.getPeriodAmount14()==null) || 
             (this.periodAmount14!=null &&
              this.periodAmount14.equals(other.getPeriodAmount14()))) &&
            ((this.periodAmount15==null && other.getPeriodAmount15()==null) || 
             (this.periodAmount15!=null &&
              this.periodAmount15.equals(other.getPeriodAmount15()))) &&
            ((this.periodAmount16==null && other.getPeriodAmount16()==null) || 
             (this.periodAmount16!=null &&
              this.periodAmount16.equals(other.getPeriodAmount16()))) &&
            ((this.periodAmount17==null && other.getPeriodAmount17()==null) || 
             (this.periodAmount17!=null &&
              this.periodAmount17.equals(other.getPeriodAmount17()))) &&
            ((this.periodAmount18==null && other.getPeriodAmount18()==null) || 
             (this.periodAmount18!=null &&
              this.periodAmount18.equals(other.getPeriodAmount18()))) &&
            ((this.periodAmount19==null && other.getPeriodAmount19()==null) || 
             (this.periodAmount19!=null &&
              this.periodAmount19.equals(other.getPeriodAmount19()))) &&
            ((this.periodAmount20==null && other.getPeriodAmount20()==null) || 
             (this.periodAmount20!=null &&
              this.periodAmount20.equals(other.getPeriodAmount20()))) &&
            ((this.periodAmount21==null && other.getPeriodAmount21()==null) || 
             (this.periodAmount21!=null &&
              this.periodAmount21.equals(other.getPeriodAmount21()))) &&
            ((this.periodAmount22==null && other.getPeriodAmount22()==null) || 
             (this.periodAmount22!=null &&
              this.periodAmount22.equals(other.getPeriodAmount22()))) &&
            ((this.periodAmount23==null && other.getPeriodAmount23()==null) || 
             (this.periodAmount23!=null &&
              this.periodAmount23.equals(other.getPeriodAmount23()))) &&
            ((this.periodAmount24==null && other.getPeriodAmount24()==null) || 
             (this.periodAmount24!=null &&
              this.periodAmount24.equals(other.getPeriodAmount24()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBudgetType() != null) {
            _hashCode += getBudgetType().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPeriodAmount1() != null) {
            _hashCode += getPeriodAmount1().hashCode();
        }
        if (getPeriodAmount2() != null) {
            _hashCode += getPeriodAmount2().hashCode();
        }
        if (getPeriodAmount3() != null) {
            _hashCode += getPeriodAmount3().hashCode();
        }
        if (getPeriodAmount4() != null) {
            _hashCode += getPeriodAmount4().hashCode();
        }
        if (getPeriodAmount5() != null) {
            _hashCode += getPeriodAmount5().hashCode();
        }
        if (getPeriodAmount6() != null) {
            _hashCode += getPeriodAmount6().hashCode();
        }
        if (getPeriodAmount7() != null) {
            _hashCode += getPeriodAmount7().hashCode();
        }
        if (getPeriodAmount8() != null) {
            _hashCode += getPeriodAmount8().hashCode();
        }
        if (getPeriodAmount9() != null) {
            _hashCode += getPeriodAmount9().hashCode();
        }
        if (getPeriodAmount10() != null) {
            _hashCode += getPeriodAmount10().hashCode();
        }
        if (getPeriodAmount11() != null) {
            _hashCode += getPeriodAmount11().hashCode();
        }
        if (getPeriodAmount12() != null) {
            _hashCode += getPeriodAmount12().hashCode();
        }
        if (getPeriodAmount13() != null) {
            _hashCode += getPeriodAmount13().hashCode();
        }
        if (getPeriodAmount14() != null) {
            _hashCode += getPeriodAmount14().hashCode();
        }
        if (getPeriodAmount15() != null) {
            _hashCode += getPeriodAmount15().hashCode();
        }
        if (getPeriodAmount16() != null) {
            _hashCode += getPeriodAmount16().hashCode();
        }
        if (getPeriodAmount17() != null) {
            _hashCode += getPeriodAmount17().hashCode();
        }
        if (getPeriodAmount18() != null) {
            _hashCode += getPeriodAmount18().hashCode();
        }
        if (getPeriodAmount19() != null) {
            _hashCode += getPeriodAmount19().hashCode();
        }
        if (getPeriodAmount20() != null) {
            _hashCode += getPeriodAmount20().hashCode();
        }
        if (getPeriodAmount21() != null) {
            _hashCode += getPeriodAmount21().hashCode();
        }
        if (getPeriodAmount22() != null) {
            _hashCode += getPeriodAmount22().hashCode();
        }
        if (getPeriodAmount23() != null) {
            _hashCode += getPeriodAmount23().hashCode();
        }
        if (getPeriodAmount24() != null) {
            _hashCode += getPeriodAmount24().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Budget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "Budget"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "budgetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.financial_2019_1.transactions.webservices.netsuite.com", "BudgetBudgetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount7");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount9");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount10");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount11");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount12");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount13");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount13"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount14");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount14"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount15");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount15"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount16");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount16"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount17");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount17"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount18");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount18"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount19");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount19"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount20");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount20"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount21");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount21"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount22");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount22"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount23");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount23"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount24");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "periodAmount24"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
