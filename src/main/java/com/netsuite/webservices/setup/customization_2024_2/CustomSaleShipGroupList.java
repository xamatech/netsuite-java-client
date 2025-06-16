/**
 * CustomSaleShipGroupList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2024_2;

public class CustomSaleShipGroupList  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2024_2.CustomSaleShipGroup[] customSaleShipgroup;

    private boolean replaceAll;  // attribute

    public CustomSaleShipGroupList() {
    }

    public CustomSaleShipGroupList(
           com.netsuite.webservices.setup.customization_2024_2.CustomSaleShipGroup[] customSaleShipgroup,
           boolean replaceAll) {
           this.customSaleShipgroup = customSaleShipgroup;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the customSaleShipgroup value for this CustomSaleShipGroupList.
     * 
     * @return customSaleShipgroup
     */
    public com.netsuite.webservices.setup.customization_2024_2.CustomSaleShipGroup[] getCustomSaleShipgroup() {
        return customSaleShipgroup;
    }


    /**
     * Sets the customSaleShipgroup value for this CustomSaleShipGroupList.
     * 
     * @param customSaleShipgroup
     */
    public void setCustomSaleShipgroup(com.netsuite.webservices.setup.customization_2024_2.CustomSaleShipGroup[] customSaleShipgroup) {
        this.customSaleShipgroup = customSaleShipgroup;
    }

    public com.netsuite.webservices.setup.customization_2024_2.CustomSaleShipGroup getCustomSaleShipgroup(int i) {
        return this.customSaleShipgroup[i];
    }

    public void setCustomSaleShipgroup(int i, com.netsuite.webservices.setup.customization_2024_2.CustomSaleShipGroup _value) {
        this.customSaleShipgroup[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomSaleShipGroupList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomSaleShipGroupList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomSaleShipGroupList)) return false;
        CustomSaleShipGroupList other = (CustomSaleShipGroupList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customSaleShipgroup==null && other.getCustomSaleShipgroup()==null) || 
             (this.customSaleShipgroup!=null &&
              java.util.Arrays.equals(this.customSaleShipgroup, other.getCustomSaleShipgroup()))) &&
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
        if (getCustomSaleShipgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSaleShipgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSaleShipgroup(), i);
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
        new org.apache.axis.description.TypeDesc(CustomSaleShipGroupList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomSaleShipGroupList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSaleShipgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "customSaleShipgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2024_2.setup.webservices.netsuite.com", "CustomSaleShipGroup"));
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
