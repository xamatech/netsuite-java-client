/**
 * SubsidiaryNexusList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class SubsidiaryNexusList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexus[] nexus;

    private boolean replaceAll;  // attribute

    public SubsidiaryNexusList() {
    }

    public SubsidiaryNexusList(
           com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexus[] nexus,
           boolean replaceAll) {
           this.nexus = nexus;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the nexus value for this SubsidiaryNexusList.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexus[] getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this SubsidiaryNexusList.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexus[] nexus) {
        this.nexus = nexus;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexus getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryNexus _value) {
        this.nexus[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SubsidiaryNexusList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SubsidiaryNexusList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiaryNexusList)) return false;
        SubsidiaryNexusList other = (SubsidiaryNexusList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              java.util.Arrays.equals(this.nexus, other.getNexus()))) &&
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
        if (getNexus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexus(), i);
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
        new org.apache.axis.description.TypeDesc(SubsidiaryNexusList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryNexusList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryNexus"));
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
