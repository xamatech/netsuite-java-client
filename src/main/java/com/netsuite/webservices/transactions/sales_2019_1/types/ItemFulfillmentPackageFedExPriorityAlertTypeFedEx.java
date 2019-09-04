/**
 * ItemFulfillmentPackageFedExPriorityAlertTypeFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class ItemFulfillmentPackageFedExPriorityAlertTypeFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageFedExPriorityAlertTypeFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __fedexPriorityAlert = "_fedexPriorityAlert";
    public static final java.lang.String __fedexPriorityAlertPlus = "_fedexPriorityAlertPlus";
    public static final java.lang.String __noneSelected = "_noneSelected";
    public static final ItemFulfillmentPackageFedExPriorityAlertTypeFedEx _fedexPriorityAlert = new ItemFulfillmentPackageFedExPriorityAlertTypeFedEx(__fedexPriorityAlert);
    public static final ItemFulfillmentPackageFedExPriorityAlertTypeFedEx _fedexPriorityAlertPlus = new ItemFulfillmentPackageFedExPriorityAlertTypeFedEx(__fedexPriorityAlertPlus);
    public static final ItemFulfillmentPackageFedExPriorityAlertTypeFedEx _noneSelected = new ItemFulfillmentPackageFedExPriorityAlertTypeFedEx(__noneSelected);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageFedExPriorityAlertTypeFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageFedExPriorityAlertTypeFedEx enumeration = (ItemFulfillmentPackageFedExPriorityAlertTypeFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageFedExPriorityAlertTypeFedEx fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedExPriorityAlertTypeFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPriorityAlertTypeFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
