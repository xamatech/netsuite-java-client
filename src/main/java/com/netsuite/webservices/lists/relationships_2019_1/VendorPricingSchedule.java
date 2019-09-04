/**
 * VendorPricingSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class VendorPricingSchedule  implements java.io.Serializable {
    private java.lang.String scheduleName;

    private java.lang.Double scheduleDiscount;

    public VendorPricingSchedule() {
    }

    public VendorPricingSchedule(
           java.lang.String scheduleName,
           java.lang.Double scheduleDiscount) {
           this.scheduleName = scheduleName;
           this.scheduleDiscount = scheduleDiscount;
    }


    /**
     * Gets the scheduleName value for this VendorPricingSchedule.
     * 
     * @return scheduleName
     */
    public java.lang.String getScheduleName() {
        return scheduleName;
    }


    /**
     * Sets the scheduleName value for this VendorPricingSchedule.
     * 
     * @param scheduleName
     */
    public void setScheduleName(java.lang.String scheduleName) {
        this.scheduleName = scheduleName;
    }


    /**
     * Gets the scheduleDiscount value for this VendorPricingSchedule.
     * 
     * @return scheduleDiscount
     */
    public java.lang.Double getScheduleDiscount() {
        return scheduleDiscount;
    }


    /**
     * Sets the scheduleDiscount value for this VendorPricingSchedule.
     * 
     * @param scheduleDiscount
     */
    public void setScheduleDiscount(java.lang.Double scheduleDiscount) {
        this.scheduleDiscount = scheduleDiscount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorPricingSchedule)) return false;
        VendorPricingSchedule other = (VendorPricingSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleName==null && other.getScheduleName()==null) || 
             (this.scheduleName!=null &&
              this.scheduleName.equals(other.getScheduleName()))) &&
            ((this.scheduleDiscount==null && other.getScheduleDiscount()==null) || 
             (this.scheduleDiscount!=null &&
              this.scheduleDiscount.equals(other.getScheduleDiscount())));
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
        if (getScheduleName() != null) {
            _hashCode += getScheduleName().hashCode();
        }
        if (getScheduleDiscount() != null) {
            _hashCode += getScheduleDiscount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorPricingSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorPricingSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "scheduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "scheduleDiscount"));
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
