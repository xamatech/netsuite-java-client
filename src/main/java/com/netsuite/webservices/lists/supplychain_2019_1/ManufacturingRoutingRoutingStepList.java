/**
 * ManufacturingRoutingRoutingStepList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingRoutingRoutingStepList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingStep[] manufacturingRoutingRoutingStep;

    private boolean replaceAll;  // attribute

    public ManufacturingRoutingRoutingStepList() {
    }

    public ManufacturingRoutingRoutingStepList(
           com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingStep[] manufacturingRoutingRoutingStep,
           boolean replaceAll) {
           this.manufacturingRoutingRoutingStep = manufacturingRoutingRoutingStep;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the manufacturingRoutingRoutingStep value for this ManufacturingRoutingRoutingStepList.
     * 
     * @return manufacturingRoutingRoutingStep
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingStep[] getManufacturingRoutingRoutingStep() {
        return manufacturingRoutingRoutingStep;
    }


    /**
     * Sets the manufacturingRoutingRoutingStep value for this ManufacturingRoutingRoutingStepList.
     * 
     * @param manufacturingRoutingRoutingStep
     */
    public void setManufacturingRoutingRoutingStep(com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingStep[] manufacturingRoutingRoutingStep) {
        this.manufacturingRoutingRoutingStep = manufacturingRoutingRoutingStep;
    }

    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingStep getManufacturingRoutingRoutingStep(int i) {
        return this.manufacturingRoutingRoutingStep[i];
    }

    public void setManufacturingRoutingRoutingStep(int i, com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingStep _value) {
        this.manufacturingRoutingRoutingStep[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ManufacturingRoutingRoutingStepList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ManufacturingRoutingRoutingStepList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingRoutingStepList)) return false;
        ManufacturingRoutingRoutingStepList other = (ManufacturingRoutingRoutingStepList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturingRoutingRoutingStep==null && other.getManufacturingRoutingRoutingStep()==null) || 
             (this.manufacturingRoutingRoutingStep!=null &&
              java.util.Arrays.equals(this.manufacturingRoutingRoutingStep, other.getManufacturingRoutingRoutingStep()))) &&
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
        if (getManufacturingRoutingRoutingStep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingRoutingRoutingStep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingRoutingRoutingStep(), i);
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
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingRoutingStepList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingStepList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingRoutingRoutingStep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingRoutingRoutingStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingStep"));
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
