/**
 * InitializeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1.types;

public class InitializeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InitializeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _assemblyBuild = "assemblyBuild";
    public static final java.lang.String _assemblyUnbuild = "assemblyUnbuild";
    public static final java.lang.String _binWorksheet = "binWorksheet";
    public static final java.lang.String _cashRefund = "cashRefund";
    public static final java.lang.String _cashSale = "cashSale";
    public static final java.lang.String _creditMemo = "creditMemo";
    public static final java.lang.String _customerPayment = "customerPayment";
    public static final java.lang.String _customerRefund = "customerRefund";
    public static final java.lang.String _depositApplication = "depositApplication";
    public static final java.lang.String _estimate = "estimate";
    public static final java.lang.String _invoice = "invoice";
    public static final java.lang.String _itemFulfillment = "itemFulfillment";
    public static final java.lang.String _itemReceipt = "itemReceipt";
    public static final java.lang.String _inventoryTransfer = "inventoryTransfer";
    public static final java.lang.String _purchaseOrder = "purchaseOrder";
    public static final java.lang.String _returnAuthorization = "returnAuthorization";
    public static final java.lang.String _salesOrder = "salesOrder";
    public static final java.lang.String _vendorBill = "vendorBill";
    public static final java.lang.String _vendorCredit = "vendorCredit";
    public static final java.lang.String _vendorReturnAuthorization = "vendorReturnAuthorization";
    public static final java.lang.String _vendorPayment = "vendorPayment";
    public static final java.lang.String _workOrder = "workOrder";
    public static final java.lang.String _workOrderIssue = "workOrderIssue";
    public static final java.lang.String _workOrderCompletion = "workOrderCompletion";
    public static final java.lang.String _workOrderClose = "workOrderClose";
    public static final InitializeType assemblyBuild = new InitializeType(_assemblyBuild);
    public static final InitializeType assemblyUnbuild = new InitializeType(_assemblyUnbuild);
    public static final InitializeType binWorksheet = new InitializeType(_binWorksheet);
    public static final InitializeType cashRefund = new InitializeType(_cashRefund);
    public static final InitializeType cashSale = new InitializeType(_cashSale);
    public static final InitializeType creditMemo = new InitializeType(_creditMemo);
    public static final InitializeType customerPayment = new InitializeType(_customerPayment);
    public static final InitializeType customerRefund = new InitializeType(_customerRefund);
    public static final InitializeType depositApplication = new InitializeType(_depositApplication);
    public static final InitializeType estimate = new InitializeType(_estimate);
    public static final InitializeType invoice = new InitializeType(_invoice);
    public static final InitializeType itemFulfillment = new InitializeType(_itemFulfillment);
    public static final InitializeType itemReceipt = new InitializeType(_itemReceipt);
    public static final InitializeType inventoryTransfer = new InitializeType(_inventoryTransfer);
    public static final InitializeType purchaseOrder = new InitializeType(_purchaseOrder);
    public static final InitializeType returnAuthorization = new InitializeType(_returnAuthorization);
    public static final InitializeType salesOrder = new InitializeType(_salesOrder);
    public static final InitializeType vendorBill = new InitializeType(_vendorBill);
    public static final InitializeType vendorCredit = new InitializeType(_vendorCredit);
    public static final InitializeType vendorReturnAuthorization = new InitializeType(_vendorReturnAuthorization);
    public static final InitializeType vendorPayment = new InitializeType(_vendorPayment);
    public static final InitializeType workOrder = new InitializeType(_workOrder);
    public static final InitializeType workOrderIssue = new InitializeType(_workOrderIssue);
    public static final InitializeType workOrderCompletion = new InitializeType(_workOrderCompletion);
    public static final InitializeType workOrderClose = new InitializeType(_workOrderClose);
    public java.lang.String getValue() { return _value_;}
    public static InitializeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InitializeType enumeration = (InitializeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InitializeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InitializeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "InitializeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
