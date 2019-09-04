/**
 * ItemAccountMappingItemAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class ItemAccountMappingItemAccount implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemAccountMappingItemAccount(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __asset = "_asset";
    public static final java.lang.String __costOfGoods = "_costOfGoods";
    public static final java.lang.String __customerReturnVariance = "_customerReturnVariance";
    public static final java.lang.String __deferral = "_deferral";
    public static final java.lang.String __deferredRevenue = "_deferredRevenue";
    public static final java.lang.String __discount = "_discount";
    public static final java.lang.String __dropShipExpense = "_dropShipExpense";
    public static final java.lang.String __exchangeRateVariance = "_exchangeRateVariance";
    public static final java.lang.String __expense = "_expense";
    public static final java.lang.String __foreignCurrencyAdjustmentRevenueAccount = "_foreignCurrencyAdjustmentRevenueAccount";
    public static final java.lang.String __gainLoss = "_gainLoss";
    public static final java.lang.String __income = "_income";
    public static final java.lang.String __intercompanyCostOfGoods = "_intercompanyCostOfGoods";
    public static final java.lang.String __intercompanyDeferredRevenue = "_intercompanyDeferredRevenue";
    public static final java.lang.String __intercompanyExpense = "_intercompanyExpense";
    public static final java.lang.String __intercompanyIncome = "_intercompanyIncome";
    public static final java.lang.String __liability = "_liability";
    public static final java.lang.String __markup = "_markup";
    public static final java.lang.String __payment = "_payment";
    public static final java.lang.String __priceVariance = "_priceVariance";
    public static final java.lang.String __productionPriceVariance = "_productionPriceVariance";
    public static final java.lang.String __productionQuantityVariance = "_productionQuantityVariance";
    public static final java.lang.String __purchasePriceVariance = "_purchasePriceVariance";
    public static final java.lang.String __quantityVariance = "_quantityVariance";
    public static final java.lang.String __scrap = "_scrap";
    public static final java.lang.String __unbuildVariance = "_unbuildVariance";
    public static final java.lang.String __vendorReturnVariance = "_vendorReturnVariance";
    public static final java.lang.String __wipVariance = "_wipVariance";
    public static final java.lang.String __workInProcess = "_workInProcess";
    public static final java.lang.String __writeOff = "_writeOff";
    public static final ItemAccountMappingItemAccount _asset = new ItemAccountMappingItemAccount(__asset);
    public static final ItemAccountMappingItemAccount _costOfGoods = new ItemAccountMappingItemAccount(__costOfGoods);
    public static final ItemAccountMappingItemAccount _customerReturnVariance = new ItemAccountMappingItemAccount(__customerReturnVariance);
    public static final ItemAccountMappingItemAccount _deferral = new ItemAccountMappingItemAccount(__deferral);
    public static final ItemAccountMappingItemAccount _deferredRevenue = new ItemAccountMappingItemAccount(__deferredRevenue);
    public static final ItemAccountMappingItemAccount _discount = new ItemAccountMappingItemAccount(__discount);
    public static final ItemAccountMappingItemAccount _dropShipExpense = new ItemAccountMappingItemAccount(__dropShipExpense);
    public static final ItemAccountMappingItemAccount _exchangeRateVariance = new ItemAccountMappingItemAccount(__exchangeRateVariance);
    public static final ItemAccountMappingItemAccount _expense = new ItemAccountMappingItemAccount(__expense);
    public static final ItemAccountMappingItemAccount _foreignCurrencyAdjustmentRevenueAccount = new ItemAccountMappingItemAccount(__foreignCurrencyAdjustmentRevenueAccount);
    public static final ItemAccountMappingItemAccount _gainLoss = new ItemAccountMappingItemAccount(__gainLoss);
    public static final ItemAccountMappingItemAccount _income = new ItemAccountMappingItemAccount(__income);
    public static final ItemAccountMappingItemAccount _intercompanyCostOfGoods = new ItemAccountMappingItemAccount(__intercompanyCostOfGoods);
    public static final ItemAccountMappingItemAccount _intercompanyDeferredRevenue = new ItemAccountMappingItemAccount(__intercompanyDeferredRevenue);
    public static final ItemAccountMappingItemAccount _intercompanyExpense = new ItemAccountMappingItemAccount(__intercompanyExpense);
    public static final ItemAccountMappingItemAccount _intercompanyIncome = new ItemAccountMappingItemAccount(__intercompanyIncome);
    public static final ItemAccountMappingItemAccount _liability = new ItemAccountMappingItemAccount(__liability);
    public static final ItemAccountMappingItemAccount _markup = new ItemAccountMappingItemAccount(__markup);
    public static final ItemAccountMappingItemAccount _payment = new ItemAccountMappingItemAccount(__payment);
    public static final ItemAccountMappingItemAccount _priceVariance = new ItemAccountMappingItemAccount(__priceVariance);
    public static final ItemAccountMappingItemAccount _productionPriceVariance = new ItemAccountMappingItemAccount(__productionPriceVariance);
    public static final ItemAccountMappingItemAccount _productionQuantityVariance = new ItemAccountMappingItemAccount(__productionQuantityVariance);
    public static final ItemAccountMappingItemAccount _purchasePriceVariance = new ItemAccountMappingItemAccount(__purchasePriceVariance);
    public static final ItemAccountMappingItemAccount _quantityVariance = new ItemAccountMappingItemAccount(__quantityVariance);
    public static final ItemAccountMappingItemAccount _scrap = new ItemAccountMappingItemAccount(__scrap);
    public static final ItemAccountMappingItemAccount _unbuildVariance = new ItemAccountMappingItemAccount(__unbuildVariance);
    public static final ItemAccountMappingItemAccount _vendorReturnVariance = new ItemAccountMappingItemAccount(__vendorReturnVariance);
    public static final ItemAccountMappingItemAccount _wipVariance = new ItemAccountMappingItemAccount(__wipVariance);
    public static final ItemAccountMappingItemAccount _workInProcess = new ItemAccountMappingItemAccount(__workInProcess);
    public static final ItemAccountMappingItemAccount _writeOff = new ItemAccountMappingItemAccount(__writeOff);
    public java.lang.String getValue() { return _value_;}
    public static ItemAccountMappingItemAccount fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemAccountMappingItemAccount enumeration = (ItemAccountMappingItemAccount)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemAccountMappingItemAccount fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemAccountMappingItemAccount.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemAccountMappingItemAccount"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
