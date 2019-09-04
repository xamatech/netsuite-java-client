/**
 * TransactionLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class TransactionLineType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionLineType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __adjustedQuantity = "_adjustedQuantity";
    public static final java.lang.String __advanceToApplyAmount = "_advanceToApplyAmount";
    public static final java.lang.String __billExchangeRateVariance = "_billExchangeRateVariance";
    public static final java.lang.String __billPriceVariance = "_billPriceVariance";
    public static final java.lang.String __billQuantityVariance = "_billQuantityVariance";
    public static final java.lang.String __countQuantity = "_countQuantity";
    public static final java.lang.String __dropshipExpense = "_dropshipExpense";
    public static final java.lang.String __gainLoss = "_gainLoss";
    public static final java.lang.String __inTransit = "_inTransit";
    public static final java.lang.String __item = "_item";
    public static final java.lang.String __materialOverhead = "_materialOverhead";
    public static final java.lang.String __nonReimbursuableExpenseOffset = "_nonReimbursuableExpenseOffset";
    public static final java.lang.String __nonReimbursuableExpenseOriginal = "_nonReimbursuableExpenseOriginal";
    public static final java.lang.String __ownershipTransfer = "_ownershipTransfer";
    public static final java.lang.String __personalExpensesNettingLine = "_personalExpensesNettingLine";
    public static final java.lang.String __personalExpensesTheExpenseLine = "_personalExpensesTheExpenseLine";
    public static final java.lang.String __pickingLine = "_pickingLine";
    public static final java.lang.String __productionPriceVariance = "_productionPriceVariance";
    public static final java.lang.String __productionQuantityVariance = "_productionQuantityVariance";
    public static final java.lang.String __purchasePriceVariance = "_purchasePriceVariance";
    public static final java.lang.String __receiving = "_receiving";
    public static final java.lang.String __routingItem = "_routingItem";
    public static final java.lang.String __routingWorkInProcess = "_routingWorkInProcess";
    public static final java.lang.String __scrap = "_scrap";
    public static final java.lang.String __shipping = "_shipping";
    public static final java.lang.String __snapshotQuantity = "_snapshotQuantity";
    public static final java.lang.String __stagingLine = "_stagingLine";
    public static final java.lang.String __totalBillVariance = "_totalBillVariance";
    public static final java.lang.String __unbuildVariance = "_unbuildVariance";
    public static final java.lang.String __workInProcess = "_workInProcess";
    public static final java.lang.String __workInProcessVariance = "_workInProcessVariance";
    public static final TransactionLineType _adjustedQuantity = new TransactionLineType(__adjustedQuantity);
    public static final TransactionLineType _advanceToApplyAmount = new TransactionLineType(__advanceToApplyAmount);
    public static final TransactionLineType _billExchangeRateVariance = new TransactionLineType(__billExchangeRateVariance);
    public static final TransactionLineType _billPriceVariance = new TransactionLineType(__billPriceVariance);
    public static final TransactionLineType _billQuantityVariance = new TransactionLineType(__billQuantityVariance);
    public static final TransactionLineType _countQuantity = new TransactionLineType(__countQuantity);
    public static final TransactionLineType _dropshipExpense = new TransactionLineType(__dropshipExpense);
    public static final TransactionLineType _gainLoss = new TransactionLineType(__gainLoss);
    public static final TransactionLineType _inTransit = new TransactionLineType(__inTransit);
    public static final TransactionLineType _item = new TransactionLineType(__item);
    public static final TransactionLineType _materialOverhead = new TransactionLineType(__materialOverhead);
    public static final TransactionLineType _nonReimbursuableExpenseOffset = new TransactionLineType(__nonReimbursuableExpenseOffset);
    public static final TransactionLineType _nonReimbursuableExpenseOriginal = new TransactionLineType(__nonReimbursuableExpenseOriginal);
    public static final TransactionLineType _ownershipTransfer = new TransactionLineType(__ownershipTransfer);
    public static final TransactionLineType _personalExpensesNettingLine = new TransactionLineType(__personalExpensesNettingLine);
    public static final TransactionLineType _personalExpensesTheExpenseLine = new TransactionLineType(__personalExpensesTheExpenseLine);
    public static final TransactionLineType _pickingLine = new TransactionLineType(__pickingLine);
    public static final TransactionLineType _productionPriceVariance = new TransactionLineType(__productionPriceVariance);
    public static final TransactionLineType _productionQuantityVariance = new TransactionLineType(__productionQuantityVariance);
    public static final TransactionLineType _purchasePriceVariance = new TransactionLineType(__purchasePriceVariance);
    public static final TransactionLineType _receiving = new TransactionLineType(__receiving);
    public static final TransactionLineType _routingItem = new TransactionLineType(__routingItem);
    public static final TransactionLineType _routingWorkInProcess = new TransactionLineType(__routingWorkInProcess);
    public static final TransactionLineType _scrap = new TransactionLineType(__scrap);
    public static final TransactionLineType _shipping = new TransactionLineType(__shipping);
    public static final TransactionLineType _snapshotQuantity = new TransactionLineType(__snapshotQuantity);
    public static final TransactionLineType _stagingLine = new TransactionLineType(__stagingLine);
    public static final TransactionLineType _totalBillVariance = new TransactionLineType(__totalBillVariance);
    public static final TransactionLineType _unbuildVariance = new TransactionLineType(__unbuildVariance);
    public static final TransactionLineType _workInProcess = new TransactionLineType(__workInProcess);
    public static final TransactionLineType _workInProcessVariance = new TransactionLineType(__workInProcessVariance);
    public java.lang.String getValue() { return _value_;}
    public static TransactionLineType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionLineType enumeration = (TransactionLineType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionLineType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionLineType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionLineType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
