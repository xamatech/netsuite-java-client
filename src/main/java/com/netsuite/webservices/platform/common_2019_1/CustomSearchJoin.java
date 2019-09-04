/**
 * CustomSearchJoin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CustomSearchJoin  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.CustomizationRef customizationRef;

    private com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic searchRecordBasic;

    public CustomSearchJoin() {
    }

    public CustomSearchJoin(
           com.netsuite.webservices.platform.core_2019_1.CustomizationRef customizationRef,
           com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic searchRecordBasic) {
           this.customizationRef = customizationRef;
           this.searchRecordBasic = searchRecordBasic;
    }


    /**
     * Gets the customizationRef value for this CustomSearchJoin.
     * 
     * @return customizationRef
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomizationRef getCustomizationRef() {
        return customizationRef;
    }


    /**
     * Sets the customizationRef value for this CustomSearchJoin.
     * 
     * @param customizationRef
     */
    public void setCustomizationRef(com.netsuite.webservices.platform.core_2019_1.CustomizationRef customizationRef) {
        this.customizationRef = customizationRef;
    }


    /**
     * Gets the searchRecordBasic value for this CustomSearchJoin.
     * 
     * @return searchRecordBasic
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic getSearchRecordBasic() {
        return searchRecordBasic;
    }


    /**
     * Sets the searchRecordBasic value for this CustomSearchJoin.
     * 
     * @param searchRecordBasic
     */
    public void setSearchRecordBasic(com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic searchRecordBasic) {
        this.searchRecordBasic = searchRecordBasic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomSearchJoin)) return false;
        CustomSearchJoin other = (CustomSearchJoin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customizationRef==null && other.getCustomizationRef()==null) || 
             (this.customizationRef!=null &&
              this.customizationRef.equals(other.getCustomizationRef()))) &&
            ((this.searchRecordBasic==null && other.getSearchRecordBasic()==null) || 
             (this.searchRecordBasic!=null &&
              this.searchRecordBasic.equals(other.getSearchRecordBasic())));
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
        if (getCustomizationRef() != null) {
            _hashCode += getCustomizationRef().hashCode();
        }
        if (getSearchRecordBasic() != null) {
            _hashCode += getSearchRecordBasic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomSearchJoin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customizationRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomizationRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchRecordBasic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "searchRecordBasic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchRecordBasic"));
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
