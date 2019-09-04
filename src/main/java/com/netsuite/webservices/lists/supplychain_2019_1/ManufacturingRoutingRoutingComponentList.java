/**
 * ManufacturingRoutingRoutingComponentList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingRoutingRoutingComponentList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingComponent[] manufacturingRoutingRoutingComponent;

    private boolean replaceAll;  // attribute

    public ManufacturingRoutingRoutingComponentList() {
    }

    public ManufacturingRoutingRoutingComponentList(
           com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingComponent[] manufacturingRoutingRoutingComponent,
           boolean replaceAll) {
           this.manufacturingRoutingRoutingComponent = manufacturingRoutingRoutingComponent;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the manufacturingRoutingRoutingComponent value for this ManufacturingRoutingRoutingComponentList.
     * 
     * @return manufacturingRoutingRoutingComponent
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingComponent[] getManufacturingRoutingRoutingComponent() {
        return manufacturingRoutingRoutingComponent;
    }


    /**
     * Sets the manufacturingRoutingRoutingComponent value for this ManufacturingRoutingRoutingComponentList.
     * 
     * @param manufacturingRoutingRoutingComponent
     */
    public void setManufacturingRoutingRoutingComponent(com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingComponent[] manufacturingRoutingRoutingComponent) {
        this.manufacturingRoutingRoutingComponent = manufacturingRoutingRoutingComponent;
    }

    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingComponent getManufacturingRoutingRoutingComponent(int i) {
        return this.manufacturingRoutingRoutingComponent[i];
    }

    public void setManufacturingRoutingRoutingComponent(int i, com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingRoutingRoutingComponent _value) {
        this.manufacturingRoutingRoutingComponent[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ManufacturingRoutingRoutingComponentList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ManufacturingRoutingRoutingComponentList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingRoutingComponentList)) return false;
        ManufacturingRoutingRoutingComponentList other = (ManufacturingRoutingRoutingComponentList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturingRoutingRoutingComponent==null && other.getManufacturingRoutingRoutingComponent()==null) || 
             (this.manufacturingRoutingRoutingComponent!=null &&
              java.util.Arrays.equals(this.manufacturingRoutingRoutingComponent, other.getManufacturingRoutingRoutingComponent()))) &&
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
        if (getManufacturingRoutingRoutingComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingRoutingRoutingComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingRoutingRoutingComponent(), i);
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
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingRoutingComponentList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingComponentList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingRoutingRoutingComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingRoutingRoutingComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingComponent"));
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
