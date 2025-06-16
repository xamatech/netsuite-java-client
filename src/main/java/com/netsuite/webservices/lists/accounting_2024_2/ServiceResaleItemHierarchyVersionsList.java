/**
 * ServiceResaleItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class ServiceResaleItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2024_2.ServiceResaleItemHierarchyVersions[] serviceResaleItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public ServiceResaleItemHierarchyVersionsList() {
    }

    public ServiceResaleItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2024_2.ServiceResaleItemHierarchyVersions[] serviceResaleItemHierarchyVersions,
           boolean replaceAll) {
           this.serviceResaleItemHierarchyVersions = serviceResaleItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the serviceResaleItemHierarchyVersions value for this ServiceResaleItemHierarchyVersionsList.
     * 
     * @return serviceResaleItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2024_2.ServiceResaleItemHierarchyVersions[] getServiceResaleItemHierarchyVersions() {
        return serviceResaleItemHierarchyVersions;
    }


    /**
     * Sets the serviceResaleItemHierarchyVersions value for this ServiceResaleItemHierarchyVersionsList.
     * 
     * @param serviceResaleItemHierarchyVersions
     */
    public void setServiceResaleItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2024_2.ServiceResaleItemHierarchyVersions[] serviceResaleItemHierarchyVersions) {
        this.serviceResaleItemHierarchyVersions = serviceResaleItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2024_2.ServiceResaleItemHierarchyVersions getServiceResaleItemHierarchyVersions(int i) {
        return this.serviceResaleItemHierarchyVersions[i];
    }

    public void setServiceResaleItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2024_2.ServiceResaleItemHierarchyVersions _value) {
        this.serviceResaleItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ServiceResaleItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ServiceResaleItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceResaleItemHierarchyVersionsList)) return false;
        ServiceResaleItemHierarchyVersionsList other = (ServiceResaleItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceResaleItemHierarchyVersions==null && other.getServiceResaleItemHierarchyVersions()==null) || 
             (this.serviceResaleItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.serviceResaleItemHierarchyVersions, other.getServiceResaleItemHierarchyVersions()))) &&
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
        if (getServiceResaleItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceResaleItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceResaleItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceResaleItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "ServiceResaleItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceResaleItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "serviceResaleItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "ServiceResaleItemHierarchyVersions"));
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
