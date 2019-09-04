/**
 * DetachBasicReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class DetachBasicReference  extends com.netsuite.webservices.platform.core_2019_1.DetachReference  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.BaseRef detachedRecord;

    public DetachBasicReference() {
    }

    public DetachBasicReference(
           com.netsuite.webservices.platform.core_2019_1.BaseRef detachFrom,
           com.netsuite.webservices.platform.core_2019_1.BaseRef detachedRecord) {
        super(
            detachFrom);
        this.detachedRecord = detachedRecord;
    }


    /**
     * Gets the detachedRecord value for this DetachBasicReference.
     * 
     * @return detachedRecord
     */
    public com.netsuite.webservices.platform.core_2019_1.BaseRef getDetachedRecord() {
        return detachedRecord;
    }


    /**
     * Sets the detachedRecord value for this DetachBasicReference.
     * 
     * @param detachedRecord
     */
    public void setDetachedRecord(com.netsuite.webservices.platform.core_2019_1.BaseRef detachedRecord) {
        this.detachedRecord = detachedRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetachBasicReference)) return false;
        DetachBasicReference other = (DetachBasicReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detachedRecord==null && other.getDetachedRecord()==null) || 
             (this.detachedRecord!=null &&
              this.detachedRecord.equals(other.getDetachedRecord())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDetachedRecord() != null) {
            _hashCode += getDetachedRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetachBasicReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DetachBasicReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detachedRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "detachedRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "BaseRef"));
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
