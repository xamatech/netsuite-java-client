/**
 * ItemGroupHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class ItemGroupHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.ItemGroupHierarchyVersions[] itemGroupHierarchyVersions;

    private boolean replaceAll;  // attribute

    public ItemGroupHierarchyVersionsList() {
    }

    public ItemGroupHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.ItemGroupHierarchyVersions[] itemGroupHierarchyVersions,
           boolean replaceAll) {
           this.itemGroupHierarchyVersions = itemGroupHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the itemGroupHierarchyVersions value for this ItemGroupHierarchyVersionsList.
     * 
     * @return itemGroupHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.ItemGroupHierarchyVersions[] getItemGroupHierarchyVersions() {
        return itemGroupHierarchyVersions;
    }


    /**
     * Sets the itemGroupHierarchyVersions value for this ItemGroupHierarchyVersionsList.
     * 
     * @param itemGroupHierarchyVersions
     */
    public void setItemGroupHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.ItemGroupHierarchyVersions[] itemGroupHierarchyVersions) {
        this.itemGroupHierarchyVersions = itemGroupHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.ItemGroupHierarchyVersions getItemGroupHierarchyVersions(int i) {
        return this.itemGroupHierarchyVersions[i];
    }

    public void setItemGroupHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.ItemGroupHierarchyVersions _value) {
        this.itemGroupHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ItemGroupHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ItemGroupHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemGroupHierarchyVersionsList)) return false;
        ItemGroupHierarchyVersionsList other = (ItemGroupHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemGroupHierarchyVersions==null && other.getItemGroupHierarchyVersions()==null) || 
             (this.itemGroupHierarchyVersions!=null &&
              java.util.Arrays.equals(this.itemGroupHierarchyVersions, other.getItemGroupHierarchyVersions()))) &&
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
        if (getItemGroupHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemGroupHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemGroupHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(ItemGroupHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "ItemGroupHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemGroupHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "itemGroupHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "ItemGroupHierarchyVersions"));
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
