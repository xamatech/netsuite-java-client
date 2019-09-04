/**
 * EmployeeRatesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeRatesList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.employees_2019_1.EmployeeRates[] employeeRates;

    private boolean replaceAll;  // attribute

    public EmployeeRatesList() {
    }

    public EmployeeRatesList(
           com.netsuite.webservices.lists.employees_2019_1.EmployeeRates[] employeeRates,
           boolean replaceAll) {
           this.employeeRates = employeeRates;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the employeeRates value for this EmployeeRatesList.
     * 
     * @return employeeRates
     */
    public com.netsuite.webservices.lists.employees_2019_1.EmployeeRates[] getEmployeeRates() {
        return employeeRates;
    }


    /**
     * Sets the employeeRates value for this EmployeeRatesList.
     * 
     * @param employeeRates
     */
    public void setEmployeeRates(com.netsuite.webservices.lists.employees_2019_1.EmployeeRates[] employeeRates) {
        this.employeeRates = employeeRates;
    }

    public com.netsuite.webservices.lists.employees_2019_1.EmployeeRates getEmployeeRates(int i) {
        return this.employeeRates[i];
    }

    public void setEmployeeRates(int i, com.netsuite.webservices.lists.employees_2019_1.EmployeeRates _value) {
        this.employeeRates[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EmployeeRatesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EmployeeRatesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeRatesList)) return false;
        EmployeeRatesList other = (EmployeeRatesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeRates==null && other.getEmployeeRates()==null) || 
             (this.employeeRates!=null &&
              java.util.Arrays.equals(this.employeeRates, other.getEmployeeRates()))) &&
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
        if (getEmployeeRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeRates(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeRatesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeRatesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employeeRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeRates"));
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
