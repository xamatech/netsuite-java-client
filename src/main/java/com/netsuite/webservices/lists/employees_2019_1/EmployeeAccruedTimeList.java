/**
 * EmployeeAccruedTimeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeAccruedTimeList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTime[] employeeAccruedTime;

    private boolean replaceAll;  // attribute

    public EmployeeAccruedTimeList() {
    }

    public EmployeeAccruedTimeList(
           com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTime[] employeeAccruedTime,
           boolean replaceAll) {
           this.employeeAccruedTime = employeeAccruedTime;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the employeeAccruedTime value for this EmployeeAccruedTimeList.
     * 
     * @return employeeAccruedTime
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTime[] getEmployeeAccruedTime() {
        return employeeAccruedTime;
    }


    /**
     * Sets the employeeAccruedTime value for this EmployeeAccruedTimeList.
     * 
     * @param employeeAccruedTime
     */
    public void setEmployeeAccruedTime(com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTime[] employeeAccruedTime) {
        this.employeeAccruedTime = employeeAccruedTime;
    }

    public com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTime getEmployeeAccruedTime(int i) {
        return this.employeeAccruedTime[i];
    }

    public void setEmployeeAccruedTime(int i, com.netsuite.webservices.lists.employees_2019_1.EmployeeAccruedTime _value) {
        this.employeeAccruedTime[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EmployeeAccruedTimeList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EmployeeAccruedTimeList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeAccruedTimeList)) return false;
        EmployeeAccruedTimeList other = (EmployeeAccruedTimeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeAccruedTime==null && other.getEmployeeAccruedTime()==null) || 
             (this.employeeAccruedTime!=null &&
              java.util.Arrays.equals(this.employeeAccruedTime, other.getEmployeeAccruedTime()))) &&
            this.replaceAll == other.isReplaceAll();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEmployeeAccruedTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeAccruedTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeAccruedTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeAccruedTimeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeAccruedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employeeAccruedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAccruedTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
