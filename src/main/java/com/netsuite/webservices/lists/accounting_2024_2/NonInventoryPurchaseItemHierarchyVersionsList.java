/**
 * NonInventoryPurchaseItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class NonInventoryPurchaseItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.NonInventoryPurchaseItemHierarchyVersions[] nonInventoryPurchaseItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public NonInventoryPurchaseItemHierarchyVersionsList() {
    }

    public NonInventoryPurchaseItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.NonInventoryPurchaseItemHierarchyVersions[] nonInventoryPurchaseItemHierarchyVersions,
           boolean replaceAll) {
           this.nonInventoryPurchaseItemHierarchyVersions = nonInventoryPurchaseItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the nonInventoryPurchaseItemHierarchyVersions value for this NonInventoryPurchaseItemHierarchyVersionsList.
     * 
     * @return nonInventoryPurchaseItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.NonInventoryPurchaseItemHierarchyVersions[] getNonInventoryPurchaseItemHierarchyVersions() {
        return nonInventoryPurchaseItemHierarchyVersions;
    }


    /**
     * Sets the nonInventoryPurchaseItemHierarchyVersions value for this NonInventoryPurchaseItemHierarchyVersionsList.
     * 
     * @param nonInventoryPurchaseItemHierarchyVersions
     */
    public void setNonInventoryPurchaseItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.NonInventoryPurchaseItemHierarchyVersions[] nonInventoryPurchaseItemHierarchyVersions) {
        this.nonInventoryPurchaseItemHierarchyVersions = nonInventoryPurchaseItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.NonInventoryPurchaseItemHierarchyVersions getNonInventoryPurchaseItemHierarchyVersions(int i) {
        return this.nonInventoryPurchaseItemHierarchyVersions[i];
    }

    public void setNonInventoryPurchaseItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.NonInventoryPurchaseItemHierarchyVersions _value) {
        this.nonInventoryPurchaseItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this NonInventoryPurchaseItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this NonInventoryPurchaseItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NonInventoryPurchaseItemHierarchyVersionsList)) return false;
        NonInventoryPurchaseItemHierarchyVersionsList other = (NonInventoryPurchaseItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nonInventoryPurchaseItemHierarchyVersions==null && other.getNonInventoryPurchaseItemHierarchyVersions()==null) || 
             (this.nonInventoryPurchaseItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.nonInventoryPurchaseItemHierarchyVersions, other.getNonInventoryPurchaseItemHierarchyVersions()))) &&
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
        if (getNonInventoryPurchaseItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonInventoryPurchaseItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonInventoryPurchaseItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(NonInventoryPurchaseItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "NonInventoryPurchaseItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonInventoryPurchaseItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "nonInventoryPurchaseItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "NonInventoryPurchaseItemHierarchyVersions"));
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
