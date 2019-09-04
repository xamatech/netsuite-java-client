/**
 * BomRevisionComponentList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class BomRevisionComponentList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent[] bomRevisionComponent;

    private boolean replaceAll;  // attribute

    public BomRevisionComponentList() {
    }

    public BomRevisionComponentList(
           com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent[] bomRevisionComponent,
           boolean replaceAll) {
           this.bomRevisionComponent = bomRevisionComponent;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the bomRevisionComponent value for this BomRevisionComponentList.
     * 
     * @return bomRevisionComponent
     */
    public com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent[] getBomRevisionComponent() {
        return bomRevisionComponent;
    }


    /**
     * Sets the bomRevisionComponent value for this BomRevisionComponentList.
     * 
     * @param bomRevisionComponent
     */
    public void setBomRevisionComponent(com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent[] bomRevisionComponent) {
        this.bomRevisionComponent = bomRevisionComponent;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent getBomRevisionComponent(int i) {
        return this.bomRevisionComponent[i];
    }

    public void setBomRevisionComponent(int i, com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent _value) {
        this.bomRevisionComponent[i] = _value;
    }


    /**
     * Gets the replaceAll value for this BomRevisionComponentList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this BomRevisionComponentList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomRevisionComponentList)) return false;
        BomRevisionComponentList other = (BomRevisionComponentList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bomRevisionComponent==null && other.getBomRevisionComponent()==null) || 
             (this.bomRevisionComponent!=null &&
              java.util.Arrays.equals(this.bomRevisionComponent, other.getBomRevisionComponent()))) &&
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
        if (getBomRevisionComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBomRevisionComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBomRevisionComponent(), i);
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
        new org.apache.axis.description.TypeDesc(BomRevisionComponentList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BomRevisionComponentList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomRevisionComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "bomRevisionComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BomRevisionComponent"));
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
