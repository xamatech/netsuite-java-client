/**
 * TransactionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class TransactionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __assemblyBuild = "_assemblyBuild";
    public static final java.lang.String __assemblyUnbuild = "_assemblyUnbuild";
    public static final java.lang.String __binTransfer = "_binTransfer";
    public static final java.lang.String __binWorksheet = "_binWorksheet";
    public static final java.lang.String __cashRefund = "_cashRefund";
    public static final java.lang.String __cashSale = "_cashSale";
    public static final java.lang.String __check = "_check";
    public static final java.lang.String __creditMemo = "_creditMemo";
    public static final java.lang.String __custom = "_custom";
    public static final java.lang.String __customerDeposit = "_customerDeposit";
    public static final java.lang.String __customerPayment = "_customerPayment";
    public static final java.lang.String __customerRefund = "_customerRefund";
    public static final java.lang.String __deposit = "_deposit";
    public static final java.lang.String __depositApplication = "_depositApplication";
    public static final java.lang.String __estimate = "_estimate";
    public static final java.lang.String __expenseReport = "_expenseReport";
    public static final java.lang.String __inboundShipment = "_inboundShipment";
    public static final java.lang.String __inventoryAdjustment = "_inventoryAdjustment";
    public static final java.lang.String __inventoryCostRevaluation = "_inventoryCostRevaluation";
    public static final java.lang.String __inventoryTransfer = "_inventoryTransfer";
    public static final java.lang.String __invoice = "_invoice";
    public static final java.lang.String __itemFulfillment = "_itemFulfillment";
    public static final java.lang.String __itemReceipt = "_itemReceipt";
    public static final java.lang.String __journal = "_journal";
    public static final java.lang.String __opportunity = "_opportunity";
    public static final java.lang.String __paycheck = "_paycheck";
    public static final java.lang.String __paycheckJournal = "_paycheckJournal";
    public static final java.lang.String __periodEndJournal = "_periodEndJournal";
    public static final java.lang.String __purchaseOrder = "_purchaseOrder";
    public static final java.lang.String __requisition = "_requisition";
    public static final java.lang.String __returnAuthorization = "_returnAuthorization";
    public static final java.lang.String __salesOrder = "_salesOrder";
    public static final java.lang.String __transferOrder = "_transferOrder";
    public static final java.lang.String __vendorBill = "_vendorBill";
    public static final java.lang.String __vendorCredit = "_vendorCredit";
    public static final java.lang.String __vendorPayment = "_vendorPayment";
    public static final java.lang.String __vendorReturnAuthorization = "_vendorReturnAuthorization";
    public static final java.lang.String __workOrder = "_workOrder";
    public static final java.lang.String __workOrderClose = "_workOrderClose";
    public static final java.lang.String __workOrderCompletion = "_workOrderCompletion";
    public static final java.lang.String __workOrderIssue = "_workOrderIssue";
    public static final TransactionType _assemblyBuild = new TransactionType(__assemblyBuild);
    public static final TransactionType _assemblyUnbuild = new TransactionType(__assemblyUnbuild);
    public static final TransactionType _binTransfer = new TransactionType(__binTransfer);
    public static final TransactionType _binWorksheet = new TransactionType(__binWorksheet);
    public static final TransactionType _cashRefund = new TransactionType(__cashRefund);
    public static final TransactionType _cashSale = new TransactionType(__cashSale);
    public static final TransactionType _check = new TransactionType(__check);
    public static final TransactionType _creditMemo = new TransactionType(__creditMemo);
    public static final TransactionType _custom = new TransactionType(__custom);
    public static final TransactionType _customerDeposit = new TransactionType(__customerDeposit);
    public static final TransactionType _customerPayment = new TransactionType(__customerPayment);
    public static final TransactionType _customerRefund = new TransactionType(__customerRefund);
    public static final TransactionType _deposit = new TransactionType(__deposit);
    public static final TransactionType _depositApplication = new TransactionType(__depositApplication);
    public static final TransactionType _estimate = new TransactionType(__estimate);
    public static final TransactionType _expenseReport = new TransactionType(__expenseReport);
    public static final TransactionType _inboundShipment = new TransactionType(__inboundShipment);
    public static final TransactionType _inventoryAdjustment = new TransactionType(__inventoryAdjustment);
    public static final TransactionType _inventoryCostRevaluation = new TransactionType(__inventoryCostRevaluation);
    public static final TransactionType _inventoryTransfer = new TransactionType(__inventoryTransfer);
    public static final TransactionType _invoice = new TransactionType(__invoice);
    public static final TransactionType _itemFulfillment = new TransactionType(__itemFulfillment);
    public static final TransactionType _itemReceipt = new TransactionType(__itemReceipt);
    public static final TransactionType _journal = new TransactionType(__journal);
    public static final TransactionType _opportunity = new TransactionType(__opportunity);
    public static final TransactionType _paycheck = new TransactionType(__paycheck);
    public static final TransactionType _paycheckJournal = new TransactionType(__paycheckJournal);
    public static final TransactionType _periodEndJournal = new TransactionType(__periodEndJournal);
    public static final TransactionType _purchaseOrder = new TransactionType(__purchaseOrder);
    public static final TransactionType _requisition = new TransactionType(__requisition);
    public static final TransactionType _returnAuthorization = new TransactionType(__returnAuthorization);
    public static final TransactionType _salesOrder = new TransactionType(__salesOrder);
    public static final TransactionType _transferOrder = new TransactionType(__transferOrder);
    public static final TransactionType _vendorBill = new TransactionType(__vendorBill);
    public static final TransactionType _vendorCredit = new TransactionType(__vendorCredit);
    public static final TransactionType _vendorPayment = new TransactionType(__vendorPayment);
    public static final TransactionType _vendorReturnAuthorization = new TransactionType(__vendorReturnAuthorization);
    public static final TransactionType _workOrder = new TransactionType(__workOrder);
    public static final TransactionType _workOrderClose = new TransactionType(__workOrderClose);
    public static final TransactionType _workOrderCompletion = new TransactionType(__workOrderCompletion);
    public static final TransactionType _workOrderIssue = new TransactionType(__workOrderIssue);
    public java.lang.String getValue() { return _value_;}
    public static TransactionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionType enumeration = (TransactionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
