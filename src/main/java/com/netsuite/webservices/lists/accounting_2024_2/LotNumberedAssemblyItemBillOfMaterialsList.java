/**
 * LotNumberedAssemblyItemBillOfMaterialsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class LotNumberedAssemblyItemBillOfMaterialsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.LotNumberedAssemblyItemBillOfMaterials[] lotNumberedAssemblyItemBillOfMaterials;

    private boolean replaceAll;  // attribute

    public LotNumberedAssemblyItemBillOfMaterialsList() {
    }

    public LotNumberedAssemblyItemBillOfMaterialsList(
           com.netsuite.webservices.lists.accounting_2024_2.LotNumberedAssemblyItemBillOfMaterials[] lotNumberedAssemblyItemBillOfMaterials,
           boolean replaceAll) {
           this.lotNumberedAssemblyItemBillOfMaterials = lotNumberedAssemblyItemBillOfMaterials;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the lotNumberedAssemblyItemBillOfMaterials value for this LotNumberedAssemblyItemBillOfMaterialsList.
     * 
     * @return lotNumberedAssemblyItemBillOfMaterials
     */
    public com.netsuite.webservices.lists.accounting_2024_2.LotNumberedAssemblyItemBillOfMaterials[] getLotNumberedAssemblyItemBillOfMaterials() {
        return lotNumberedAssemblyItemBillOfMaterials;
    }


    /**
     * Sets the lotNumberedAssemblyItemBillOfMaterials value for this LotNumberedAssemblyItemBillOfMaterialsList.
     * 
     * @param lotNumberedAssemblyItemBillOfMaterials
     */
    public void setLotNumberedAssemblyItemBillOfMaterials(com.netsuite.webservices.lists.accounting_2024_2.LotNumberedAssemblyItemBillOfMaterials[] lotNumberedAssemblyItemBillOfMaterials) {
        this.lotNumberedAssemblyItemBillOfMaterials = lotNumberedAssemblyItemBillOfMaterials;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.LotNumberedAssemblyItemBillOfMaterials getLotNumberedAssemblyItemBillOfMaterials(int i) {
        return this.lotNumberedAssemblyItemBillOfMaterials[i];
    }

    public void setLotNumberedAssemblyItemBillOfMaterials(int i, com.netsuite.webservices.lists.accounting_2024_2.LotNumberedAssemblyItemBillOfMaterials _value) {
        this.lotNumberedAssemblyItemBillOfMaterials[i] = _value;
    }


    /**
     * Gets the replaceAll value for this LotNumberedAssemblyItemBillOfMaterialsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this LotNumberedAssemblyItemBillOfMaterialsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LotNumberedAssemblyItemBillOfMaterialsList)) return false;
        LotNumberedAssemblyItemBillOfMaterialsList other = (LotNumberedAssemblyItemBillOfMaterialsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lotNumberedAssemblyItemBillOfMaterials==null && other.getLotNumberedAssemblyItemBillOfMaterials()==null) || 
             (this.lotNumberedAssemblyItemBillOfMaterials!=null &&
              java.util.Arrays.equals(this.lotNumberedAssemblyItemBillOfMaterials, other.getLotNumberedAssemblyItemBillOfMaterials()))) &&
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
        if (getLotNumberedAssemblyItemBillOfMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLotNumberedAssemblyItemBillOfMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLotNumberedAssemblyItemBillOfMaterials(), i);
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
        new org.apache.axis.description.TypeDesc(LotNumberedAssemblyItemBillOfMaterialsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterialsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotNumberedAssemblyItemBillOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "lotNumberedAssemblyItemBillOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterials"));
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
