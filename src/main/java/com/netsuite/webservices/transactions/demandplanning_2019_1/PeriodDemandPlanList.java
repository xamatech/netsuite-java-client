/**
 * PeriodDemandPlanList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2019_1;

public class PeriodDemandPlanList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlan[] periodDemandPlan;

    public PeriodDemandPlanList() {
    }

    public PeriodDemandPlanList(
           com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlan[] periodDemandPlan) {
           this.periodDemandPlan = periodDemandPlan;
    }


    /**
     * Gets the periodDemandPlan value for this PeriodDemandPlanList.
     * 
     * @return periodDemandPlan
     */
    public com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlan[] getPeriodDemandPlan() {
        return periodDemandPlan;
    }


    /**
     * Sets the periodDemandPlan value for this PeriodDemandPlanList.
     * 
     * @param periodDemandPlan
     */
    public void setPeriodDemandPlan(com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlan[] periodDemandPlan) {
        this.periodDemandPlan = periodDemandPlan;
    }

    public com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlan getPeriodDemandPlan(int i) {
        return this.periodDemandPlan[i];
    }

    public void setPeriodDemandPlan(int i, com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlan _value) {
        this.periodDemandPlan[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PeriodDemandPlanList)) return false;
        PeriodDemandPlanList other = (PeriodDemandPlanList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.periodDemandPlan==null && other.getPeriodDemandPlan()==null) || 
             (this.periodDemandPlan!=null &&
              java.util.Arrays.equals(this.periodDemandPlan, other.getPeriodDemandPlan())));
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
        if (getPeriodDemandPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodDemandPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodDemandPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PeriodDemandPlanList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "PeriodDemandPlanList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDemandPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "periodDemandPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "PeriodDemandPlan"));
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
