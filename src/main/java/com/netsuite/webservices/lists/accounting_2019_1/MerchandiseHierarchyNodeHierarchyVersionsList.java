/**
 * MerchandiseHierarchyNodeHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class MerchandiseHierarchyNodeHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.MerchandiseHierarchyNodeHierarchyVersions[] merchandiseHierarchyNodeHierarchyVersions;

    private boolean replaceAll;  // attribute

    public MerchandiseHierarchyNodeHierarchyVersionsList() {
    }

    public MerchandiseHierarchyNodeHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2019_1.MerchandiseHierarchyNodeHierarchyVersions[] merchandiseHierarchyNodeHierarchyVersions,
           boolean replaceAll) {
           this.merchandiseHierarchyNodeHierarchyVersions = merchandiseHierarchyNodeHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the merchandiseHierarchyNodeHierarchyVersions value for this MerchandiseHierarchyNodeHierarchyVersionsList.
     * 
     * @return merchandiseHierarchyNodeHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2019_1.MerchandiseHierarchyNodeHierarchyVersions[] getMerchandiseHierarchyNodeHierarchyVersions() {
        return merchandiseHierarchyNodeHierarchyVersions;
    }


    /**
     * Sets the merchandiseHierarchyNodeHierarchyVersions value for this MerchandiseHierarchyNodeHierarchyVersionsList.
     * 
     * @param merchandiseHierarchyNodeHierarchyVersions
     */
    public void setMerchandiseHierarchyNodeHierarchyVersions(com.netsuite.webservices.lists.accounting_2019_1.MerchandiseHierarchyNodeHierarchyVersions[] merchandiseHierarchyNodeHierarchyVersions) {
        this.merchandiseHierarchyNodeHierarchyVersions = merchandiseHierarchyNodeHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.MerchandiseHierarchyNodeHierarchyVersions getMerchandiseHierarchyNodeHierarchyVersions(int i) {
        return this.merchandiseHierarchyNodeHierarchyVersions[i];
    }

    public void setMerchandiseHierarchyNodeHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2019_1.MerchandiseHierarchyNodeHierarchyVersions _value) {
        this.merchandiseHierarchyNodeHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this MerchandiseHierarchyNodeHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this MerchandiseHierarchyNodeHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeHierarchyVersionsList)) return false;
        MerchandiseHierarchyNodeHierarchyVersionsList other = (MerchandiseHierarchyNodeHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchandiseHierarchyNodeHierarchyVersions==null && other.getMerchandiseHierarchyNodeHierarchyVersions()==null) || 
             (this.merchandiseHierarchyNodeHierarchyVersions!=null &&
              java.util.Arrays.equals(this.merchandiseHierarchyNodeHierarchyVersions, other.getMerchandiseHierarchyNodeHierarchyVersions()))) &&
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
        if (getMerchandiseHierarchyNodeHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchandiseHierarchyNodeHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchandiseHierarchyNodeHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(MerchandiseHierarchyNodeHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandiseHierarchyNodeHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "merchandiseHierarchyNodeHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeHierarchyVersions"));
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
