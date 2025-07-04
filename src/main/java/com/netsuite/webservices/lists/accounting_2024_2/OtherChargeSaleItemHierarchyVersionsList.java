/**
 * OtherChargeSaleItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class OtherChargeSaleItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.OtherChargeSaleItemHierarchyVersions[] otherChargeSaleItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public OtherChargeSaleItemHierarchyVersionsList() {
    }

    public OtherChargeSaleItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.OtherChargeSaleItemHierarchyVersions[] otherChargeSaleItemHierarchyVersions,
           boolean replaceAll) {
           this.otherChargeSaleItemHierarchyVersions = otherChargeSaleItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the otherChargeSaleItemHierarchyVersions value for this OtherChargeSaleItemHierarchyVersionsList.
     * 
     * @return otherChargeSaleItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.OtherChargeSaleItemHierarchyVersions[] getOtherChargeSaleItemHierarchyVersions() {
        return otherChargeSaleItemHierarchyVersions;
    }


    /**
     * Sets the otherChargeSaleItemHierarchyVersions value for this OtherChargeSaleItemHierarchyVersionsList.
     * 
     * @param otherChargeSaleItemHierarchyVersions
     */
    public void setOtherChargeSaleItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.OtherChargeSaleItemHierarchyVersions[] otherChargeSaleItemHierarchyVersions) {
        this.otherChargeSaleItemHierarchyVersions = otherChargeSaleItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.OtherChargeSaleItemHierarchyVersions getOtherChargeSaleItemHierarchyVersions(int i) {
        return this.otherChargeSaleItemHierarchyVersions[i];
    }

    public void setOtherChargeSaleItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.OtherChargeSaleItemHierarchyVersions _value) {
        this.otherChargeSaleItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this OtherChargeSaleItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this OtherChargeSaleItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherChargeSaleItemHierarchyVersionsList)) return false;
        OtherChargeSaleItemHierarchyVersionsList other = (OtherChargeSaleItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherChargeSaleItemHierarchyVersions==null && other.getOtherChargeSaleItemHierarchyVersions()==null) || 
             (this.otherChargeSaleItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.otherChargeSaleItemHierarchyVersions, other.getOtherChargeSaleItemHierarchyVersions()))) &&
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
        if (getOtherChargeSaleItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherChargeSaleItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherChargeSaleItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(OtherChargeSaleItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "OtherChargeSaleItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherChargeSaleItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "otherChargeSaleItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "OtherChargeSaleItemHierarchyVersions"));
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
