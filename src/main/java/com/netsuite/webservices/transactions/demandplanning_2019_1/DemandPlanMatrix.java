/**
 * DemandPlanMatrix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2019_1;

public class DemandPlanMatrix  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.demandplanning_2019_1.DemandPlan[] demandPlan;

    private boolean replaceAll;  // attribute

    public DemandPlanMatrix() {
    }

    public DemandPlanMatrix(
           com.netsuite.webservices.transactions.demandplanning_2019_1.DemandPlan[] demandPlan,
           boolean replaceAll) {
           this.demandPlan = demandPlan;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the demandPlan value for this DemandPlanMatrix.
     * 
     * @return demandPlan
     */
    public com.netsuite.webservices.transactions.demandplanning_2019_1.DemandPlan[] getDemandPlan() {
        return demandPlan;
    }


    /**
     * Sets the demandPlan value for this DemandPlanMatrix.
     * 
     * @param demandPlan
     */
    public void setDemandPlan(com.netsuite.webservices.transactions.demandplanning_2019_1.DemandPlan[] demandPlan) {
        this.demandPlan = demandPlan;
    }

    public com.netsuite.webservices.transactions.demandplanning_2019_1.DemandPlan getDemandPlan(int i) {
        return this.demandPlan[i];
    }

    public void setDemandPlan(int i, com.netsuite.webservices.transactions.demandplanning_2019_1.DemandPlan _value) {
        this.demandPlan[i] = _value;
    }


    /**
     * Gets the replaceAll value for this DemandPlanMatrix.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this DemandPlanMatrix.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DemandPlanMatrix)) return false;
        DemandPlanMatrix other = (DemandPlanMatrix) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.demandPlan==null && other.getDemandPlan()==null) || 
             (this.demandPlan!=null &&
              java.util.Arrays.equals(this.demandPlan, other.getDemandPlan()))) &&
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
        if (getDemandPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemandPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemandPlan(), i);
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
        new org.apache.axis.description.TypeDesc(DemandPlanMatrix.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "DemandPlanMatrix"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "demandPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "DemandPlan"));
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
