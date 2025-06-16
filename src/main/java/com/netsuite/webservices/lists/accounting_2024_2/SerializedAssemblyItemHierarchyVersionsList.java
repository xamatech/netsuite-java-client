/**
 * SerializedAssemblyItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class SerializedAssemblyItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.SerializedAssemblyItemHierarchyVersions[] serializedAssemblyItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public SerializedAssemblyItemHierarchyVersionsList() {
    }

    public SerializedAssemblyItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.SerializedAssemblyItemHierarchyVersions[] serializedAssemblyItemHierarchyVersions,
           boolean replaceAll) {
           this.serializedAssemblyItemHierarchyVersions = serializedAssemblyItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the serializedAssemblyItemHierarchyVersions value for this SerializedAssemblyItemHierarchyVersionsList.
     * 
     * @return serializedAssemblyItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.SerializedAssemblyItemHierarchyVersions[] getSerializedAssemblyItemHierarchyVersions() {
        return serializedAssemblyItemHierarchyVersions;
    }


    /**
     * Sets the serializedAssemblyItemHierarchyVersions value for this SerializedAssemblyItemHierarchyVersionsList.
     * 
     * @param serializedAssemblyItemHierarchyVersions
     */
    public void setSerializedAssemblyItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.SerializedAssemblyItemHierarchyVersions[] serializedAssemblyItemHierarchyVersions) {
        this.serializedAssemblyItemHierarchyVersions = serializedAssemblyItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.SerializedAssemblyItemHierarchyVersions getSerializedAssemblyItemHierarchyVersions(int i) {
        return this.serializedAssemblyItemHierarchyVersions[i];
    }

    public void setSerializedAssemblyItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.SerializedAssemblyItemHierarchyVersions _value) {
        this.serializedAssemblyItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SerializedAssemblyItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SerializedAssemblyItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerializedAssemblyItemHierarchyVersionsList)) return false;
        SerializedAssemblyItemHierarchyVersionsList other = (SerializedAssemblyItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serializedAssemblyItemHierarchyVersions==null && other.getSerializedAssemblyItemHierarchyVersions()==null) || 
             (this.serializedAssemblyItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.serializedAssemblyItemHierarchyVersions, other.getSerializedAssemblyItemHierarchyVersions()))) &&
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
        if (getSerializedAssemblyItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerializedAssemblyItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerializedAssemblyItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(SerializedAssemblyItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "SerializedAssemblyItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serializedAssemblyItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "serializedAssemblyItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "SerializedAssemblyItemHierarchyVersions"));
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
