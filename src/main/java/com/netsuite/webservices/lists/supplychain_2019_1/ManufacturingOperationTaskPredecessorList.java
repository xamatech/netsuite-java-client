/**
 * ManufacturingOperationTaskPredecessorList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingOperationTaskPredecessorList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessor[] manufacturingOperationTaskPredecessor;

    private boolean replaceAll;  // attribute

    public ManufacturingOperationTaskPredecessorList() {
    }

    public ManufacturingOperationTaskPredecessorList(
           com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessor[] manufacturingOperationTaskPredecessor,
           boolean replaceAll) {
           this.manufacturingOperationTaskPredecessor = manufacturingOperationTaskPredecessor;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the manufacturingOperationTaskPredecessor value for this ManufacturingOperationTaskPredecessorList.
     * 
     * @return manufacturingOperationTaskPredecessor
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessor[] getManufacturingOperationTaskPredecessor() {
        return manufacturingOperationTaskPredecessor;
    }


    /**
     * Sets the manufacturingOperationTaskPredecessor value for this ManufacturingOperationTaskPredecessorList.
     * 
     * @param manufacturingOperationTaskPredecessor
     */
    public void setManufacturingOperationTaskPredecessor(com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessor[] manufacturingOperationTaskPredecessor) {
        this.manufacturingOperationTaskPredecessor = manufacturingOperationTaskPredecessor;
    }

    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessor getManufacturingOperationTaskPredecessor(int i) {
        return this.manufacturingOperationTaskPredecessor[i];
    }

    public void setManufacturingOperationTaskPredecessor(int i, com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessor _value) {
        this.manufacturingOperationTaskPredecessor[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ManufacturingOperationTaskPredecessorList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ManufacturingOperationTaskPredecessorList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingOperationTaskPredecessorList)) return false;
        ManufacturingOperationTaskPredecessorList other = (ManufacturingOperationTaskPredecessorList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturingOperationTaskPredecessor==null && other.getManufacturingOperationTaskPredecessor()==null) || 
             (this.manufacturingOperationTaskPredecessor!=null &&
              java.util.Arrays.equals(this.manufacturingOperationTaskPredecessor, other.getManufacturingOperationTaskPredecessor()))) &&
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
        if (getManufacturingOperationTaskPredecessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingOperationTaskPredecessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingOperationTaskPredecessor(), i);
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
        new org.apache.axis.description.TypeDesc(ManufacturingOperationTaskPredecessorList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingOperationTaskPredecessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingOperationTaskPredecessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessor"));
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
