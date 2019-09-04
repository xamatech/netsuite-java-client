/**
 * PayrollItemItemTypeNoHierarchy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1.types;

public class PayrollItemItemTypeNoHierarchy implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PayrollItemItemTypeNoHierarchy(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __addition = "_addition";
    public static final java.lang.String __commission = "_commission";
    public static final java.lang.String __deduction = "_deduction";
    public static final java.lang.String __directDeposit = "_directDeposit";
    public static final java.lang.String __disability = "_disability";
    public static final java.lang.String __earning = "_earning";
    public static final java.lang.String __employerContribution = "_employerContribution";
    public static final java.lang.String __expense = "_expense";
    public static final java.lang.String __federal = "_federal";
    public static final java.lang.String __medicare = "_medicare";
    public static final java.lang.String __other = "_other";
    public static final java.lang.String __salary = "_salary";
    public static final java.lang.String __sick = "_sick";
    public static final java.lang.String __socialSecurity = "_socialSecurity";
    public static final java.lang.String __state = "_state";
    public static final java.lang.String __tax = "_tax";
    public static final java.lang.String __unemployment = "_unemployment";
    public static final java.lang.String __vacation = "_vacation";
    public static final java.lang.String __wage = "_wage";
    public static final PayrollItemItemTypeNoHierarchy _addition = new PayrollItemItemTypeNoHierarchy(__addition);
    public static final PayrollItemItemTypeNoHierarchy _commission = new PayrollItemItemTypeNoHierarchy(__commission);
    public static final PayrollItemItemTypeNoHierarchy _deduction = new PayrollItemItemTypeNoHierarchy(__deduction);
    public static final PayrollItemItemTypeNoHierarchy _directDeposit = new PayrollItemItemTypeNoHierarchy(__directDeposit);
    public static final PayrollItemItemTypeNoHierarchy _disability = new PayrollItemItemTypeNoHierarchy(__disability);
    public static final PayrollItemItemTypeNoHierarchy _earning = new PayrollItemItemTypeNoHierarchy(__earning);
    public static final PayrollItemItemTypeNoHierarchy _employerContribution = new PayrollItemItemTypeNoHierarchy(__employerContribution);
    public static final PayrollItemItemTypeNoHierarchy _expense = new PayrollItemItemTypeNoHierarchy(__expense);
    public static final PayrollItemItemTypeNoHierarchy _federal = new PayrollItemItemTypeNoHierarchy(__federal);
    public static final PayrollItemItemTypeNoHierarchy _medicare = new PayrollItemItemTypeNoHierarchy(__medicare);
    public static final PayrollItemItemTypeNoHierarchy _other = new PayrollItemItemTypeNoHierarchy(__other);
    public static final PayrollItemItemTypeNoHierarchy _salary = new PayrollItemItemTypeNoHierarchy(__salary);
    public static final PayrollItemItemTypeNoHierarchy _sick = new PayrollItemItemTypeNoHierarchy(__sick);
    public static final PayrollItemItemTypeNoHierarchy _socialSecurity = new PayrollItemItemTypeNoHierarchy(__socialSecurity);
    public static final PayrollItemItemTypeNoHierarchy _state = new PayrollItemItemTypeNoHierarchy(__state);
    public static final PayrollItemItemTypeNoHierarchy _tax = new PayrollItemItemTypeNoHierarchy(__tax);
    public static final PayrollItemItemTypeNoHierarchy _unemployment = new PayrollItemItemTypeNoHierarchy(__unemployment);
    public static final PayrollItemItemTypeNoHierarchy _vacation = new PayrollItemItemTypeNoHierarchy(__vacation);
    public static final PayrollItemItemTypeNoHierarchy _wage = new PayrollItemItemTypeNoHierarchy(__wage);
    public java.lang.String getValue() { return _value_;}
    public static PayrollItemItemTypeNoHierarchy fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PayrollItemItemTypeNoHierarchy enumeration = (PayrollItemItemTypeNoHierarchy)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PayrollItemItemTypeNoHierarchy fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PayrollItemItemTypeNoHierarchy.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "PayrollItemItemTypeNoHierarchy"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
