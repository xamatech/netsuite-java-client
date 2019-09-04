/**
 * EmployeeRates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeRates  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityCurrency;

    private java.lang.Double rate;

    public EmployeeRates() {
    }

    public EmployeeRates(
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityCurrency,
           java.lang.Double rate) {
           this.entityCurrency = entityCurrency;
           this.rate = rate;
    }


    /**
     * Gets the entityCurrency value for this EmployeeRates.
     * 
     * @return entityCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityCurrency() {
        return entityCurrency;
    }


    /**
     * Sets the entityCurrency value for this EmployeeRates.
     * 
     * @param entityCurrency
     */
    public void setEntityCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef entityCurrency) {
        this.entityCurrency = entityCurrency;
    }


    /**
     * Gets the rate value for this EmployeeRates.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this EmployeeRates.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeRates)) return false;
        EmployeeRates other = (EmployeeRates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityCurrency==null && other.getEntityCurrency()==null) || 
             (this.entityCurrency!=null &&
              this.entityCurrency.equals(other.getEntityCurrency()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate())));
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
        if (getEntityCurrency() != null) {
            _hashCode += getEntityCurrency().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeRates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeRates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "entityCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
