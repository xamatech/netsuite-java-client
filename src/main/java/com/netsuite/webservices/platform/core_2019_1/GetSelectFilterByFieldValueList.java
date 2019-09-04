/**
 * GetSelectFilterByFieldValueList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class GetSelectFilterByFieldValueList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValue[] filterBy;

    public GetSelectFilterByFieldValueList() {
    }

    public GetSelectFilterByFieldValueList(
           com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValue[] filterBy) {
           this.filterBy = filterBy;
    }


    /**
     * Gets the filterBy value for this GetSelectFilterByFieldValueList.
     * 
     * @return filterBy
     */
    public com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValue[] getFilterBy() {
        return filterBy;
    }


    /**
     * Sets the filterBy value for this GetSelectFilterByFieldValueList.
     * 
     * @param filterBy
     */
    public void setFilterBy(com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValue[] filterBy) {
        this.filterBy = filterBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValue getFilterBy(int i) {
        return this.filterBy[i];
    }

    public void setFilterBy(int i, com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValue _value) {
        this.filterBy[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSelectFilterByFieldValueList)) return false;
        GetSelectFilterByFieldValueList other = (GetSelectFilterByFieldValueList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterBy==null && other.getFilterBy()==null) || 
             (this.filterBy!=null &&
              java.util.Arrays.equals(this.filterBy, other.getFilterBy())));
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
        if (getFilterBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterBy(), i);
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
        new org.apache.axis.description.TypeDesc(GetSelectFilterByFieldValueList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValueList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "filterBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValue"));
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
