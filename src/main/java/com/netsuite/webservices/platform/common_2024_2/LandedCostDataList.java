/**
 * LandedCostDataList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class LandedCostDataList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.LandedCostData[] landedCostData;

    private boolean replaceAll;  // attribute

    public LandedCostDataList() {
    }

    public LandedCostDataList(
           com.netsuite.webservices.platform.common_2024_2.LandedCostData[] landedCostData,
           boolean replaceAll) {
           this.landedCostData = landedCostData;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the landedCostData value for this LandedCostDataList.
     * 
     * @return landedCostData
     */
    public com.netsuite.webservices.platform.common_2024_2.LandedCostData[] getLandedCostData() {
        return landedCostData;
    }


    /**
     * Sets the landedCostData value for this LandedCostDataList.
     * 
     * @param landedCostData
     */
    public void setLandedCostData(com.netsuite.webservices.platform.common_2024_2.LandedCostData[] landedCostData) {
        this.landedCostData = landedCostData;
    }

    public com.netsuite.webservices.platform.common_2024_2.LandedCostData getLandedCostData(int i) {
        return this.landedCostData[i];
    }

    public void setLandedCostData(int i, com.netsuite.webservices.platform.common_2024_2.LandedCostData _value) {
        this.landedCostData[i] = _value;
    }


    /**
     * Gets the replaceAll value for this LandedCostDataList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this LandedCostDataList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LandedCostDataList)) return false;
        LandedCostDataList other = (LandedCostDataList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.landedCostData==null && other.getLandedCostData()==null) || 
             (this.landedCostData!=null &&
              java.util.Arrays.equals(this.landedCostData, other.getLandedCostData()))) &&
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
        if (getLandedCostData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostData(), i);
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
        new org.apache.axis.description.TypeDesc(LandedCostDataList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "LandedCostDataList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "landedCostData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "LandedCostData"));
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
