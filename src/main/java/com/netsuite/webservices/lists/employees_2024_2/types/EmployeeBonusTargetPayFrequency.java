/**
 * EmployeeBonusTargetPayFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2024_2.types;

public class EmployeeBonusTargetPayFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EmployeeBonusTargetPayFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __annually = "_annually";
    public static final java.lang.String __monthly = "_monthly";
    public static final java.lang.String __oneTime = "_oneTime";
    public static final java.lang.String __quarterly = "_quarterly";
    public static final EmployeeBonusTargetPayFrequency _annually = new EmployeeBonusTargetPayFrequency(__annually);
    public static final EmployeeBonusTargetPayFrequency _monthly = new EmployeeBonusTargetPayFrequency(__monthly);
    public static final EmployeeBonusTargetPayFrequency _oneTime = new EmployeeBonusTargetPayFrequency(__oneTime);
    public static final EmployeeBonusTargetPayFrequency _quarterly = new EmployeeBonusTargetPayFrequency(__quarterly);
    public java.lang.String getValue() { return _value_;}
    public static EmployeeBonusTargetPayFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EmployeeBonusTargetPayFrequency enumeration = (EmployeeBonusTargetPayFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EmployeeBonusTargetPayFrequency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EmployeeBonusTargetPayFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2024_2.lists.webservices.netsuite.com", "EmployeeBonusTargetPayFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
