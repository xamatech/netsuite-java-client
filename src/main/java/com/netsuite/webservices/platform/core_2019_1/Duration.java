/**
 * Duration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class Duration  implements java.io.Serializable {
    private double timeSpan;

    private com.netsuite.webservices.platform.core_2019_1.types.DurationUnit unit;

    public Duration() {
    }

    public Duration(
           double timeSpan,
           com.netsuite.webservices.platform.core_2019_1.types.DurationUnit unit) {
           this.timeSpan = timeSpan;
           this.unit = unit;
    }


    /**
     * Gets the timeSpan value for this Duration.
     * 
     * @return timeSpan
     */
    public double getTimeSpan() {
        return timeSpan;
    }


    /**
     * Sets the timeSpan value for this Duration.
     * 
     * @param timeSpan
     */
    public void setTimeSpan(double timeSpan) {
        this.timeSpan = timeSpan;
    }


    /**
     * Gets the unit value for this Duration.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.types.DurationUnit getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Duration.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.types.DurationUnit unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Duration)) return false;
        Duration other = (Duration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.timeSpan == other.getTimeSpan() &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        _hashCode += new Double(getTimeSpan()).hashCode();
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Duration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSpan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "timeSpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "DurationUnit"));
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
