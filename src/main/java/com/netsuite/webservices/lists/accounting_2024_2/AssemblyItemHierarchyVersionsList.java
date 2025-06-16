/**
 * AssemblyItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class AssemblyItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.AssemblyItemHierarchyVersions[] assemblyItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public AssemblyItemHierarchyVersionsList() {
    }

    public AssemblyItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.AssemblyItemHierarchyVersions[] assemblyItemHierarchyVersions,
           boolean replaceAll) {
           this.assemblyItemHierarchyVersions = assemblyItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the assemblyItemHierarchyVersions value for this AssemblyItemHierarchyVersionsList.
     * 
     * @return assemblyItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.AssemblyItemHierarchyVersions[] getAssemblyItemHierarchyVersions() {
        return assemblyItemHierarchyVersions;
    }


    /**
     * Sets the assemblyItemHierarchyVersions value for this AssemblyItemHierarchyVersionsList.
     * 
     * @param assemblyItemHierarchyVersions
     */
    public void setAssemblyItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.AssemblyItemHierarchyVersions[] assemblyItemHierarchyVersions) {
        this.assemblyItemHierarchyVersions = assemblyItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.AssemblyItemHierarchyVersions getAssemblyItemHierarchyVersions(int i) {
        return this.assemblyItemHierarchyVersions[i];
    }

    public void setAssemblyItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.AssemblyItemHierarchyVersions _value) {
        this.assemblyItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this AssemblyItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this AssemblyItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyItemHierarchyVersionsList)) return false;
        AssemblyItemHierarchyVersionsList other = (AssemblyItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assemblyItemHierarchyVersions==null && other.getAssemblyItemHierarchyVersions()==null) || 
             (this.assemblyItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.assemblyItemHierarchyVersions, other.getAssemblyItemHierarchyVersions()))) &&
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
        if (getAssemblyItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssemblyItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssemblyItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(AssemblyItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "AssemblyItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assemblyItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "assemblyItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "AssemblyItemHierarchyVersions"));
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
