/**
 * ItemFulfillmentTermsOfSaleFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class ItemFulfillmentTermsOfSaleFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentTermsOfSaleFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __cfr = "_cfr";
    public static final java.lang.String __cif = "_cif";
    public static final java.lang.String __cip = "_cip";
    public static final java.lang.String __cpt = "_cpt";
    public static final java.lang.String __dap = "_dap";
    public static final java.lang.String __dat = "_dat";
    public static final java.lang.String __ddp = "_ddp";
    public static final java.lang.String __ddu = "_ddu";
    public static final java.lang.String __exw = "_exw";
    public static final java.lang.String __fca = "_fca";
    public static final java.lang.String __fob = "_fob";
    public static final ItemFulfillmentTermsOfSaleFedEx _cfr = new ItemFulfillmentTermsOfSaleFedEx(__cfr);
    public static final ItemFulfillmentTermsOfSaleFedEx _cif = new ItemFulfillmentTermsOfSaleFedEx(__cif);
    public static final ItemFulfillmentTermsOfSaleFedEx _cip = new ItemFulfillmentTermsOfSaleFedEx(__cip);
    public static final ItemFulfillmentTermsOfSaleFedEx _cpt = new ItemFulfillmentTermsOfSaleFedEx(__cpt);
    public static final ItemFulfillmentTermsOfSaleFedEx _dap = new ItemFulfillmentTermsOfSaleFedEx(__dap);
    public static final ItemFulfillmentTermsOfSaleFedEx _dat = new ItemFulfillmentTermsOfSaleFedEx(__dat);
    public static final ItemFulfillmentTermsOfSaleFedEx _ddp = new ItemFulfillmentTermsOfSaleFedEx(__ddp);
    public static final ItemFulfillmentTermsOfSaleFedEx _ddu = new ItemFulfillmentTermsOfSaleFedEx(__ddu);
    public static final ItemFulfillmentTermsOfSaleFedEx _exw = new ItemFulfillmentTermsOfSaleFedEx(__exw);
    public static final ItemFulfillmentTermsOfSaleFedEx _fca = new ItemFulfillmentTermsOfSaleFedEx(__fca);
    public static final ItemFulfillmentTermsOfSaleFedEx _fob = new ItemFulfillmentTermsOfSaleFedEx(__fob);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentTermsOfSaleFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentTermsOfSaleFedEx enumeration = (ItemFulfillmentTermsOfSaleFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentTermsOfSaleFedEx fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentTermsOfSaleFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentTermsOfSaleFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
