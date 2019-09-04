/**
 * CostCategoryItemCostType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1.types;

public class CostCategoryItemCostType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CostCategoryItemCostType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __laborRun = "_laborRun";
    public static final java.lang.String __laborRunOverhead = "_laborRunOverhead";
    public static final java.lang.String __laborSetup = "_laborSetup";
    public static final java.lang.String __laborSetupOverhead = "_laborSetupOverhead";
    public static final java.lang.String __landed = "_landed";
    public static final java.lang.String __machineRun = "_machineRun";
    public static final java.lang.String __machineRunOverhead = "_machineRunOverhead";
    public static final java.lang.String __machineSetup = "_machineSetup";
    public static final java.lang.String __machineSetupOverhead = "_machineSetupOverhead";
    public static final java.lang.String __material = "_material";
    public static final java.lang.String __materialOverhead = "_materialOverhead";
    public static final java.lang.String __service = "_service";
    public static final CostCategoryItemCostType _laborRun = new CostCategoryItemCostType(__laborRun);
    public static final CostCategoryItemCostType _laborRunOverhead = new CostCategoryItemCostType(__laborRunOverhead);
    public static final CostCategoryItemCostType _laborSetup = new CostCategoryItemCostType(__laborSetup);
    public static final CostCategoryItemCostType _laborSetupOverhead = new CostCategoryItemCostType(__laborSetupOverhead);
    public static final CostCategoryItemCostType _landed = new CostCategoryItemCostType(__landed);
    public static final CostCategoryItemCostType _machineRun = new CostCategoryItemCostType(__machineRun);
    public static final CostCategoryItemCostType _machineRunOverhead = new CostCategoryItemCostType(__machineRunOverhead);
    public static final CostCategoryItemCostType _machineSetup = new CostCategoryItemCostType(__machineSetup);
    public static final CostCategoryItemCostType _machineSetupOverhead = new CostCategoryItemCostType(__machineSetupOverhead);
    public static final CostCategoryItemCostType _material = new CostCategoryItemCostType(__material);
    public static final CostCategoryItemCostType _materialOverhead = new CostCategoryItemCostType(__materialOverhead);
    public static final CostCategoryItemCostType _service = new CostCategoryItemCostType(__service);
    public java.lang.String getValue() { return _value_;}
    public static CostCategoryItemCostType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CostCategoryItemCostType enumeration = (CostCategoryItemCostType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CostCategoryItemCostType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CostCategoryItemCostType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "CostCategoryItemCostType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
