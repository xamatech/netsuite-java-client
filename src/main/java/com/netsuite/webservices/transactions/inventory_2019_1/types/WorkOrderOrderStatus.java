/**
 * WorkOrderOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1.types;

public class WorkOrderOrderStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WorkOrderOrderStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __built = "_built";
    public static final java.lang.String __cancelled = "_cancelled";
    public static final java.lang.String __closed = "_closed";
    public static final java.lang.String __inProcess = "_inProcess";
    public static final java.lang.String __planned = "_planned";
    public static final java.lang.String __released = "_released";
    public static final java.lang.String __undefined = "_undefined";
    public static final WorkOrderOrderStatus _built = new WorkOrderOrderStatus(__built);
    public static final WorkOrderOrderStatus _cancelled = new WorkOrderOrderStatus(__cancelled);
    public static final WorkOrderOrderStatus _closed = new WorkOrderOrderStatus(__closed);
    public static final WorkOrderOrderStatus _inProcess = new WorkOrderOrderStatus(__inProcess);
    public static final WorkOrderOrderStatus _planned = new WorkOrderOrderStatus(__planned);
    public static final WorkOrderOrderStatus _released = new WorkOrderOrderStatus(__released);
    public static final WorkOrderOrderStatus _undefined = new WorkOrderOrderStatus(__undefined);
    public java.lang.String getValue() { return _value_;}
    public static WorkOrderOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WorkOrderOrderStatus enumeration = (WorkOrderOrderStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WorkOrderOrderStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WorkOrderOrderStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderOrderStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
