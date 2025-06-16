/**
 * OtherChargeResaleItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class OtherChargeResaleItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.OtherChargeResaleItemHierarchyVersions[] otherChargeResaleItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public OtherChargeResaleItemHierarchyVersionsList() {
    }

    public OtherChargeResaleItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.OtherChargeResaleItemHierarchyVersions[] otherChargeResaleItemHierarchyVersions,
           boolean replaceAll) {
           this.otherChargeResaleItemHierarchyVersions = otherChargeResaleItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the otherChargeResaleItemHierarchyVersions value for this OtherChargeResaleItemHierarchyVersionsList.
     * 
     * @return otherChargeResaleItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.OtherChargeResaleItemHierarchyVersions[] getOtherChargeResaleItemHierarchyVersions() {
        return otherChargeResaleItemHierarchyVersions;
    }


    /**
     * Sets the otherChargeResaleItemHierarchyVersions value for this OtherChargeResaleItemHierarchyVersionsList.
     * 
     * @param otherChargeResaleItemHierarchyVersions
     */
    public void setOtherChargeResaleItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.OtherChargeResaleItemHierarchyVersions[] otherChargeResaleItemHierarchyVersions) {
        this.otherChargeResaleItemHierarchyVersions = otherChargeResaleItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.OtherChargeResaleItemHierarchyVersions getOtherChargeResaleItemHierarchyVersions(int i) {
        return this.otherChargeResaleItemHierarchyVersions[i];
    }

    public void setOtherChargeResaleItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.OtherChargeResaleItemHierarchyVersions _value) {
        this.otherChargeResaleItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this OtherChargeResaleItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this OtherChargeResaleItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherChargeResaleItemHierarchyVersionsList)) return false;
        OtherChargeResaleItemHierarchyVersionsList other = (OtherChargeResaleItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherChargeResaleItemHierarchyVersions==null && other.getOtherChargeResaleItemHierarchyVersions()==null) || 
             (this.otherChargeResaleItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.otherChargeResaleItemHierarchyVersions, other.getOtherChargeResaleItemHierarchyVersions()))) &&
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
        if (getOtherChargeResaleItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherChargeResaleItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherChargeResaleItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(OtherChargeResaleItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "OtherChargeResaleItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherChargeResaleItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "otherChargeResaleItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "OtherChargeResaleItemHierarchyVersions"));
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
