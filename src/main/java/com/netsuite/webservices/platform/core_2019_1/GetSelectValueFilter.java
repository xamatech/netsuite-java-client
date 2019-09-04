/**
 * GetSelectValueFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class GetSelectValueFilter  implements java.io.Serializable {
    private java.lang.String filterValue;

    private com.netsuite.webservices.platform.core_2019_1.types.GetSelectValueFilterOperator operator;  // attribute

    public GetSelectValueFilter() {
    }

    public GetSelectValueFilter(
           java.lang.String filterValue,
           com.netsuite.webservices.platform.core_2019_1.types.GetSelectValueFilterOperator operator) {
           this.filterValue = filterValue;
           this.operator = operator;
    }


    /**
     * Gets the filterValue value for this GetSelectValueFilter.
     * 
     * @return filterValue
     */
    public java.lang.String getFilterValue() {
        return filterValue;
    }


    /**
     * Sets the filterValue value for this GetSelectValueFilter.
     * 
     * @param filterValue
     */
    public void setFilterValue(java.lang.String filterValue) {
        this.filterValue = filterValue;
    }


    /**
     * Gets the operator value for this GetSelectValueFilter.
     * 
     * @return operator
     */
    public com.netsuite.webservices.platform.core_2019_1.types.GetSelectValueFilterOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this GetSelectValueFilter.
     * 
     * @param operator
     */
    public void setOperator(com.netsuite.webservices.platform.core_2019_1.types.GetSelectValueFilterOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSelectValueFilter)) return false;
        GetSelectValueFilter other = (GetSelectValueFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterValue==null && other.getFilterValue()==null) || 
             (this.filterValue!=null &&
              this.filterValue.equals(other.getFilterValue()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getFilterValue() != null) {
            _hashCode += getFilterValue().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSelectValueFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetSelectValueFilter"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "GetSelectValueFilterOperator"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "filterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
