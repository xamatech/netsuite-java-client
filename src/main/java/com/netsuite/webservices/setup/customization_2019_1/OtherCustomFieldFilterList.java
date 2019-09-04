/**
 * OtherCustomFieldFilterList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class OtherCustomFieldFilterList  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2019_1.OtherCustomFieldFilter[] filter;

    private boolean replaceAll;  // attribute

    public OtherCustomFieldFilterList() {
    }

    public OtherCustomFieldFilterList(
           com.netsuite.webservices.setup.customization_2019_1.OtherCustomFieldFilter[] filter,
           boolean replaceAll) {
           this.filter = filter;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the filter value for this OtherCustomFieldFilterList.
     * 
     * @return filter
     */
    public com.netsuite.webservices.setup.customization_2019_1.OtherCustomFieldFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this OtherCustomFieldFilterList.
     * 
     * @param filter
     */
    public void setFilter(com.netsuite.webservices.setup.customization_2019_1.OtherCustomFieldFilter[] filter) {
        this.filter = filter;
    }

    public com.netsuite.webservices.setup.customization_2019_1.OtherCustomFieldFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, com.netsuite.webservices.setup.customization_2019_1.OtherCustomFieldFilter _value) {
        this.filter[i] = _value;
    }


    /**
     * Gets the replaceAll value for this OtherCustomFieldFilterList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this OtherCustomFieldFilterList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherCustomFieldFilterList)) return false;
        OtherCustomFieldFilterList other = (OtherCustomFieldFilterList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter()))) &&
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
        if (getFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilter(), i);
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
        new org.apache.axis.description.TypeDesc(OtherCustomFieldFilterList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "OtherCustomFieldFilterList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "OtherCustomFieldFilter"));
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
