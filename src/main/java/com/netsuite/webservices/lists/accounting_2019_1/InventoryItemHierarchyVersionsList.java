/**
 * InventoryItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class InventoryItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.InventoryItemHierarchyVersions[] inventoryItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public InventoryItemHierarchyVersionsList() {
    }

    public InventoryItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2019_1.InventoryItemHierarchyVersions[] inventoryItemHierarchyVersions,
           boolean replaceAll) {
           this.inventoryItemHierarchyVersions = inventoryItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the inventoryItemHierarchyVersions value for this InventoryItemHierarchyVersionsList.
     * 
     * @return inventoryItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2019_1.InventoryItemHierarchyVersions[] getInventoryItemHierarchyVersions() {
        return inventoryItemHierarchyVersions;
    }


    /**
     * Sets the inventoryItemHierarchyVersions value for this InventoryItemHierarchyVersionsList.
     * 
     * @param inventoryItemHierarchyVersions
     */
    public void setInventoryItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2019_1.InventoryItemHierarchyVersions[] inventoryItemHierarchyVersions) {
        this.inventoryItemHierarchyVersions = inventoryItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.InventoryItemHierarchyVersions getInventoryItemHierarchyVersions(int i) {
        return this.inventoryItemHierarchyVersions[i];
    }

    public void setInventoryItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2019_1.InventoryItemHierarchyVersions _value) {
        this.inventoryItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this InventoryItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this InventoryItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItemHierarchyVersionsList)) return false;
        InventoryItemHierarchyVersionsList other = (InventoryItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inventoryItemHierarchyVersions==null && other.getInventoryItemHierarchyVersions()==null) || 
             (this.inventoryItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.inventoryItemHierarchyVersions, other.getInventoryItemHierarchyVersions()))) &&
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
        if (getInventoryItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventoryItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventoryItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "InventoryItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inventoryItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "InventoryItemHierarchyVersions"));
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
