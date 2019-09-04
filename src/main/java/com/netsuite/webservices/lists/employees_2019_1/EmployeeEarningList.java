/**
 * EmployeeEarningList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeEarningList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.employees_2019_1.EmployeeEarning[] employeeEarning;

    private boolean replaceAll;  // attribute

    public EmployeeEarningList() {
    }

    public EmployeeEarningList(
           com.netsuite.webservices.lists.employees_2019_1.EmployeeEarning[] employeeEarning,
           boolean replaceAll) {
           this.employeeEarning = employeeEarning;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the employeeEarning value for this EmployeeEarningList.
     * 
     * @return employeeEarning
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeEarning[] getEmployeeEarning() {
        return employeeEarning;
    }


    /**
     * Sets the employeeEarning value for this EmployeeEarningList.
     * 
     * @param employeeEarning
     */
    public void setEmployeeEarning(com.netsuite.webservices.lists.employees_2019_1.EmployeeEarning[] employeeEarning) {
        this.employeeEarning = employeeEarning;
    }

    public com.netsuite.webservices.lists.employees_2019_1.EmployeeEarning getEmployeeEarning(int i) {
        return this.employeeEarning[i];
    }

    public void setEmployeeEarning(int i, com.netsuite.webservices.lists.employees_2019_1.EmployeeEarning _value) {
        this.employeeEarning[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EmployeeEarningList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EmployeeEarningList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeEarningList)) return false;
        EmployeeEarningList other = (EmployeeEarningList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeEarning==null && other.getEmployeeEarning()==null) || 
             (this.employeeEarning!=null &&
              java.util.Arrays.equals(this.employeeEarning, other.getEmployeeEarning()))) &&
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
        if (getEmployeeEarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeEarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeEarning(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeEarningList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeEarningList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeEarning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employeeEarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeEarning"));
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
