/**
 * ManufacturingOperationTaskPredecessorPredecessorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1.types;

public class ManufacturingOperationTaskPredecessorPredecessorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManufacturingOperationTaskPredecessorPredecessorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __finishToFinish = "_finishToFinish";
    public static final java.lang.String __finishToStart = "_finishToStart";
    public static final java.lang.String __startToFinish = "_startToFinish";
    public static final java.lang.String __startToStart = "_startToStart";
    public static final ManufacturingOperationTaskPredecessorPredecessorType _finishToFinish = new ManufacturingOperationTaskPredecessorPredecessorType(__finishToFinish);
    public static final ManufacturingOperationTaskPredecessorPredecessorType _finishToStart = new ManufacturingOperationTaskPredecessorPredecessorType(__finishToStart);
    public static final ManufacturingOperationTaskPredecessorPredecessorType _startToFinish = new ManufacturingOperationTaskPredecessorPredecessorType(__startToFinish);
    public static final ManufacturingOperationTaskPredecessorPredecessorType _startToStart = new ManufacturingOperationTaskPredecessorPredecessorType(__startToStart);
    public java.lang.String getValue() { return _value_;}
    public static ManufacturingOperationTaskPredecessorPredecessorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManufacturingOperationTaskPredecessorPredecessorType enumeration = (ManufacturingOperationTaskPredecessorPredecessorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManufacturingOperationTaskPredecessorPredecessorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManufacturingOperationTaskPredecessorPredecessorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorPredecessorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
