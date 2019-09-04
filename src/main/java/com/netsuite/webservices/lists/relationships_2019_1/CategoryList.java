/**
 * CategoryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CategoryList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef[] category;

    public CategoryList() {
    }

    public CategoryList(
           com.netsuite.webservices.platform.core_2019_1.RecordRef[] category) {
           this.category = category;
    }


    /**
     * Gets the category value for this CategoryList.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CategoryList.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef[] category) {
        this.category = category;
    }

    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.netsuite.webservices.platform.core_2019_1.RecordRef _value) {
        this.category[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryList)) return false;
        CategoryList other = (CategoryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory())));
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
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
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
        new org.apache.axis.description.TypeDesc(CategoryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CategoryList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
