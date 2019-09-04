/**
 * DimensionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class DimensionList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.DimensionRef[] dimension;

    public DimensionList() {
    }

    public DimensionList(
           com.netsuite.webservices.platform.core_2019_1.DimensionRef[] dimension) {
           this.dimension = dimension;
    }


    /**
     * Gets the dimension value for this DimensionList.
     * 
     * @return dimension
     */
    public com.netsuite.webservices.platform.core_2019_1.DimensionRef[] getDimension() {
        return dimension;
    }


    /**
     * Sets the dimension value for this DimensionList.
     * 
     * @param dimension
     */
    public void setDimension(com.netsuite.webservices.platform.core_2019_1.DimensionRef[] dimension) {
        this.dimension = dimension;
    }

    public com.netsuite.webservices.platform.core_2019_1.DimensionRef getDimension(int i) {
        return this.dimension[i];
    }

    public void setDimension(int i, com.netsuite.webservices.platform.core_2019_1.DimensionRef _value) {
        this.dimension[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DimensionList)) return false;
        DimensionList other = (DimensionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dimension==null && other.getDimension()==null) || 
             (this.dimension!=null &&
              java.util.Arrays.equals(this.dimension, other.getDimension())));
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
        if (getDimension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimension());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimension(), i);
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
        new org.apache.axis.description.TypeDesc(DimensionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DimensionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DimensionRef"));
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
