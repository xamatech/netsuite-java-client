/**
 * SearchColumnBooleanCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class SearchColumnBooleanCustomField  extends com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomField  implements java.io.Serializable {
    private java.lang.Boolean searchValue;

    public SearchColumnBooleanCustomField() {
    }

    public SearchColumnBooleanCustomField(
           java.lang.String internalId,
           java.lang.String scriptId,
           java.lang.String customLabel,
           java.lang.Boolean searchValue) {
        super(
            internalId,
            scriptId,
            customLabel);
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchValue value for this SearchColumnBooleanCustomField.
     * 
     * @return searchValue
     */
    public java.lang.Boolean getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchColumnBooleanCustomField.
     * 
     * @param searchValue
     */
    public void setSearchValue(java.lang.Boolean searchValue) {
        this.searchValue = searchValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchColumnBooleanCustomField)) return false;
        SearchColumnBooleanCustomField other = (SearchColumnBooleanCustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              this.searchValue.equals(other.getSearchValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSearchValue() != null) {
            _hashCode += getSearchValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchColumnBooleanCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanCustomField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
