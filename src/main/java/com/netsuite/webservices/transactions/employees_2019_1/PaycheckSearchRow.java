/**
 * PaycheckSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.PaycheckSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic payrollItemJoin;

    public PaycheckSearchRow() {
    }

    public PaycheckSearchRow(
           com.netsuite.webservices.platform.common_2019_1.PaycheckSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic payrollItemJoin) {
        this.basic = basic;
        this.employeeJoin = employeeJoin;
        this.payrollItemJoin = payrollItemJoin;
    }


    /**
     * Gets the basic value for this PaycheckSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.PaycheckSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this PaycheckSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.PaycheckSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the employeeJoin value for this PaycheckSearchRow.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this PaycheckSearchRow.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the payrollItemJoin value for this PaycheckSearchRow.
     * 
     * @return payrollItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }


    /**
     * Sets the payrollItemJoin value for this PaycheckSearchRow.
     * 
     * @param payrollItemJoin
     */
    public void setPayrollItemJoin(com.netsuite.webservices.platform.common_2019_1.PayrollItemSearchRowBasic payrollItemJoin) {
        this.payrollItemJoin = payrollItemJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckSearchRow)) return false;
        PaycheckSearchRow other = (PaycheckSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.payrollItemJoin==null && other.getPayrollItemJoin()==null) || 
             (this.payrollItemJoin!=null &&
              this.payrollItemJoin.equals(other.getPayrollItemJoin())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getPayrollItemJoin() != null) {
            _hashCode += getPayrollItemJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PaycheckSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payrollItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PayrollItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
