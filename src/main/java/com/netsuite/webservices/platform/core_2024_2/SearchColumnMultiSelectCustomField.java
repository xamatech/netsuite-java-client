/**
 * SearchColumnMultiSelectCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2024_2;

public class SearchColumnMultiSelectCustomField  extends com.netsuite.webservices.platform.core_2024_2.SearchColumnCustomField  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.ListOrRecordRef[] searchValue;

    public SearchColumnMultiSelectCustomField() {
    }

    public SearchColumnMultiSelectCustomField(
           java.lang.String internalId,
           java.lang.String scriptId,
           java.lang.String customLabel,
           com.netsuite.webservices.platform.core_2024_2.ListOrRecordRef[] searchValue) {
        super(
            internalId,
            scriptId,
            customLabel);
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchValue value for this SearchColumnMultiSelectCustomField.
     * 
     * @return searchValue
     */
    public com.netsuite.webservices.platform.core_2024_2.ListOrRecordRef[] getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchColumnMultiSelectCustomField.
     * 
     * @param searchValue
     */
    public void setSearchValue(com.netsuite.webservices.platform.core_2024_2.ListOrRecordRef[] searchValue) {
        this.searchValue = searchValue;
    }

    public com.netsuite.webservices.platform.core_2024_2.ListOrRecordRef getSearchValue(int i) {
        return this.searchValue[i];
    }

    public void setSearchValue(int i, com.netsuite.webservices.platform.core_2024_2.ListOrRecordRef _value) {
        this.searchValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchColumnMultiSelectCustomField)) return false;
        SearchColumnMultiSelectCustomField other = (SearchColumnMultiSelectCustomField) obj;
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
              java.util.Arrays.equals(this.searchValue, other.getSearchValue())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchValue(), i);
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
        new org.apache.axis.description.TypeDesc(SearchColumnMultiSelectCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnMultiSelectCustomField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "ListOrRecordRef"));
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
