/**
 * VendorReturnAuthorizationOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1.types;

public class VendorReturnAuthorizationOrderStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VendorReturnAuthorizationOrderStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __cancelled = "_cancelled";
    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __credited = "_credited";
    public static final java.lang.String __partiallyReturned = "_partiallyReturned";
    public static final java.lang.String __pendingApproval = "_pendingApproval";
    public static final java.lang.String __pendingCredit = "_pendingCredit";
    public static final java.lang.String __pendingCreditPartiallyReturned = "_pendingCreditPartiallyReturned";
    public static final java.lang.String __pendingReturn = "_pendingReturn";
    public static final java.lang.String __undefined = "_undefined";
    public static final VendorReturnAuthorizationOrderStatus _cancelled = new VendorReturnAuthorizationOrderStatus(__cancelled);
    public static final VendorReturnAuthorizationOrderStatus _closed = new VendorReturnAuthorizationOrderStatus(__closed);
    public static final VendorReturnAuthorizationOrderStatus _credited = new VendorReturnAuthorizationOrderStatus(__credited);
    public static final VendorReturnAuthorizationOrderStatus _partiallyReturned = new VendorReturnAuthorizationOrderStatus(__partiallyReturned);
    public static final VendorReturnAuthorizationOrderStatus _pendingApproval = new VendorReturnAuthorizationOrderStatus(__pendingApproval);
    public static final VendorReturnAuthorizationOrderStatus _pendingCredit = new VendorReturnAuthorizationOrderStatus(__pendingCredit);
    public static final VendorReturnAuthorizationOrderStatus _pendingCreditPartiallyReturned = new VendorReturnAuthorizationOrderStatus(__pendingCreditPartiallyReturned);
    public static final VendorReturnAuthorizationOrderStatus _pendingReturn = new VendorReturnAuthorizationOrderStatus(__pendingReturn);
    public static final VendorReturnAuthorizationOrderStatus _undefined = new VendorReturnAuthorizationOrderStatus(__undefined);
    public java.lang.String getValue() { return _value_;}
    public static VendorReturnAuthorizationOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VendorReturnAuthorizationOrderStatus enumeration = (VendorReturnAuthorizationOrderStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VendorReturnAuthorizationOrderStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VendorReturnAuthorizationOrderStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationOrderStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
