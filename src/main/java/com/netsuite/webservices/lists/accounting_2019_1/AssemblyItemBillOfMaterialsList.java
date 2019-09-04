/**
 * AssemblyItemBillOfMaterialsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class AssemblyItemBillOfMaterialsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.AssemblyItemBillOfMaterials[] assemblyItemBillOfMaterials;

    private boolean replaceAll;  // attribute

    public AssemblyItemBillOfMaterialsList() {
    }

    public AssemblyItemBillOfMaterialsList(
           com.netsuite.webservices.lists.accounting_2019_1.AssemblyItemBillOfMaterials[] assemblyItemBillOfMaterials,
           boolean replaceAll) {
           this.assemblyItemBillOfMaterials = assemblyItemBillOfMaterials;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the assemblyItemBillOfMaterials value for this AssemblyItemBillOfMaterialsList.
     * 
     * @return assemblyItemBillOfMaterials
     */
    public com.netsuite.webservices.lists.accounting_2019_1.AssemblyItemBillOfMaterials[] getAssemblyItemBillOfMaterials() {
        return assemblyItemBillOfMaterials;
    }


    /**
     * Sets the assemblyItemBillOfMaterials value for this AssemblyItemBillOfMaterialsList.
     * 
     * @param assemblyItemBillOfMaterials
     */
    public void setAssemblyItemBillOfMaterials(com.netsuite.webservices.lists.accounting_2019_1.AssemblyItemBillOfMaterials[] assemblyItemBillOfMaterials) {
        this.assemblyItemBillOfMaterials = assemblyItemBillOfMaterials;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.AssemblyItemBillOfMaterials getAssemblyItemBillOfMaterials(int i) {
        return this.assemblyItemBillOfMaterials[i];
    }

    public void setAssemblyItemBillOfMaterials(int i, com.netsuite.webservices.lists.accounting_2019_1.AssemblyItemBillOfMaterials _value) {
        this.assemblyItemBillOfMaterials[i] = _value;
    }


    /**
     * Gets the replaceAll value for this AssemblyItemBillOfMaterialsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this AssemblyItemBillOfMaterialsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyItemBillOfMaterialsList)) return false;
        AssemblyItemBillOfMaterialsList other = (AssemblyItemBillOfMaterialsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assemblyItemBillOfMaterials==null && other.getAssemblyItemBillOfMaterials()==null) || 
             (this.assemblyItemBillOfMaterials!=null &&
              java.util.Arrays.equals(this.assemblyItemBillOfMaterials, other.getAssemblyItemBillOfMaterials()))) &&
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
        if (getAssemblyItemBillOfMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssemblyItemBillOfMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssemblyItemBillOfMaterials(), i);
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
        new org.apache.axis.description.TypeDesc(AssemblyItemBillOfMaterialsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterialsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assemblyItemBillOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "assemblyItemBillOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterials"));
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
