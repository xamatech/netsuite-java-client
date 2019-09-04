/**
 * PeriodDemandPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2019_1;

public class PeriodDemandPlan  implements java.io.Serializable {
    private double quantity;

    private com.netsuite.webservices.transactions.demandplanning_2019_1.types.DayOfTheWeek dayOfTheWeek;

    public PeriodDemandPlan() {
    }

    public PeriodDemandPlan(
           double quantity,
           com.netsuite.webservices.transactions.demandplanning_2019_1.types.DayOfTheWeek dayOfTheWeek) {
           this.quantity = quantity;
           this.dayOfTheWeek = dayOfTheWeek;
    }


    /**
     * Gets the quantity value for this PeriodDemandPlan.
     * 
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PeriodDemandPlan.
     * 
     * @param quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the dayOfTheWeek value for this PeriodDemandPlan.
     * 
     * @return dayOfTheWeek
     */
    public com.netsuite.webservices.transactions.demandplanning_2019_1.types.DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }


    /**
     * Sets the dayOfTheWeek value for this PeriodDemandPlan.
     * 
     * @param dayOfTheWeek
     */
    public void setDayOfTheWeek(com.netsuite.webservices.transactions.demandplanning_2019_1.types.DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PeriodDemandPlan)) return false;
        PeriodDemandPlan other = (PeriodDemandPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.quantity == other.getQuantity() &&
            ((this.dayOfTheWeek==null && other.getDayOfTheWeek()==null) || 
             (this.dayOfTheWeek!=null &&
              this.dayOfTheWeek.equals(other.getDayOfTheWeek())));
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
        _hashCode += new Double(getQuantity()).hashCode();
        if (getDayOfTheWeek() != null) {
            _hashCode += getDayOfTheWeek().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PeriodDemandPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "PeriodDemandPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfTheWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "dayOfTheWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.demandplanning_2019_1.transactions.webservices.netsuite.com", "DayOfTheWeek"));
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
