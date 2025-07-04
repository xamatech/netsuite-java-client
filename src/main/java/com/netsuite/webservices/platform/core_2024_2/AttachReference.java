/**
 * AttachReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2024_2;

public abstract class AttachReference  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.BaseRef attachTo;

    public AttachReference() {
    }

    public AttachReference(
           com.netsuite.webservices.platform.core_2024_2.BaseRef attachTo) {
           this.attachTo = attachTo;
    }


    /**
     * Gets the attachTo value for this AttachReference.
     * 
     * @return attachTo
     */
    public com.netsuite.webservices.platform.core_2024_2.BaseRef getAttachTo() {
        return attachTo;
    }


    /**
     * Sets the attachTo value for this AttachReference.
     * 
     * @param attachTo
     */
    public void setAttachTo(com.netsuite.webservices.platform.core_2024_2.BaseRef attachTo) {
        this.attachTo = attachTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachReference)) return false;
        AttachReference other = (AttachReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachTo==null && other.getAttachTo()==null) || 
             (this.attachTo!=null &&
              this.attachTo.equals(other.getAttachTo())));
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
        if (getAttachTo() != null) {
            _hashCode += getAttachTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "AttachReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "attachTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "BaseRef"));
        elemField.setNillable(false);
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
