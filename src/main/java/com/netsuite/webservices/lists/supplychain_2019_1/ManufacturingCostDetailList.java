/**
 * ManufacturingCostDetailList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingCostDetailList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetail[] manufacturingCostDetail;

    private boolean replaceAll;  // attribute

    public ManufacturingCostDetailList() {
    }

    public ManufacturingCostDetailList(
           com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetail[] manufacturingCostDetail,
           boolean replaceAll) {
           this.manufacturingCostDetail = manufacturingCostDetail;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the manufacturingCostDetail value for this ManufacturingCostDetailList.
     * 
     * @return manufacturingCostDetail
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetail[] getManufacturingCostDetail() {
        return manufacturingCostDetail;
    }


    /**
     * Sets the manufacturingCostDetail value for this ManufacturingCostDetailList.
     * 
     * @param manufacturingCostDetail
     */
    public void setManufacturingCostDetail(com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetail[] manufacturingCostDetail) {
        this.manufacturingCostDetail = manufacturingCostDetail;
    }

    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetail getManufacturingCostDetail(int i) {
        return this.manufacturingCostDetail[i];
    }

    public void setManufacturingCostDetail(int i, com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetail _value) {
        this.manufacturingCostDetail[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ManufacturingCostDetailList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ManufacturingCostDetailList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingCostDetailList)) return false;
        ManufacturingCostDetailList other = (ManufacturingCostDetailList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturingCostDetail==null && other.getManufacturingCostDetail()==null) || 
             (this.manufacturingCostDetail!=null &&
              java.util.Arrays.equals(this.manufacturingCostDetail, other.getManufacturingCostDetail()))) &&
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
        if (getManufacturingCostDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingCostDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingCostDetail(), i);
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
        new org.apache.axis.description.TypeDesc(ManufacturingCostDetailList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingCostDetailList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingCostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingCostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingCostDetail"));
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
