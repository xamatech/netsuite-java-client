/**
 * TaxDetailsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxDetailsList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.TaxDetails[] taxDetails;

    private boolean replaceAll;  // attribute

    public TaxDetailsList() {
    }

    public TaxDetailsList(
           com.netsuite.webservices.platform.common_2019_1.TaxDetails[] taxDetails,
           boolean replaceAll) {
           this.taxDetails = taxDetails;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the taxDetails value for this TaxDetailsList.
     * 
     * @return taxDetails
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetails[] getTaxDetails() {
        return taxDetails;
    }


    /**
     * Sets the taxDetails value for this TaxDetailsList.
     * 
     * @param taxDetails
     */
    public void setTaxDetails(com.netsuite.webservices.platform.common_2019_1.TaxDetails[] taxDetails) {
        this.taxDetails = taxDetails;
    }

    public com.netsuite.webservices.platform.common_2019_1.TaxDetails getTaxDetails(int i) {
        return this.taxDetails[i];
    }

    public void setTaxDetails(int i, com.netsuite.webservices.platform.common_2019_1.TaxDetails _value) {
        this.taxDetails[i] = _value;
    }


    /**
     * Gets the replaceAll value for this TaxDetailsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this TaxDetailsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxDetailsList)) return false;
        TaxDetailsList other = (TaxDetailsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxDetails==null && other.getTaxDetails()==null) || 
             (this.taxDetails!=null &&
              java.util.Arrays.equals(this.taxDetails, other.getTaxDetails()))) &&
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
        if (getTaxDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxDetails(), i);
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
        new org.apache.axis.description.TypeDesc(TaxDetailsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetails"));
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
