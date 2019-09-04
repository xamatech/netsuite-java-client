/**
 * DeletionReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class DeletionReason  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef deletionReasonCode;

    private java.lang.String deletionReasonMemo;

    public DeletionReason() {
    }

    public DeletionReason(
           com.netsuite.webservices.platform.core_2019_1.RecordRef deletionReasonCode,
           java.lang.String deletionReasonMemo) {
           this.deletionReasonCode = deletionReasonCode;
           this.deletionReasonMemo = deletionReasonMemo;
    }


    /**
     * Gets the deletionReasonCode value for this DeletionReason.
     * 
     * @return deletionReasonCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDeletionReasonCode() {
        return deletionReasonCode;
    }


    /**
     * Sets the deletionReasonCode value for this DeletionReason.
     * 
     * @param deletionReasonCode
     */
    public void setDeletionReasonCode(com.netsuite.webservices.platform.core_2019_1.RecordRef deletionReasonCode) {
        this.deletionReasonCode = deletionReasonCode;
    }


    /**
     * Gets the deletionReasonMemo value for this DeletionReason.
     * 
     * @return deletionReasonMemo
     */
    public java.lang.String getDeletionReasonMemo() {
        return deletionReasonMemo;
    }


    /**
     * Sets the deletionReasonMemo value for this DeletionReason.
     * 
     * @param deletionReasonMemo
     */
    public void setDeletionReasonMemo(java.lang.String deletionReasonMemo) {
        this.deletionReasonMemo = deletionReasonMemo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletionReason)) return false;
        DeletionReason other = (DeletionReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletionReasonCode==null && other.getDeletionReasonCode()==null) || 
             (this.deletionReasonCode!=null &&
              this.deletionReasonCode.equals(other.getDeletionReasonCode()))) &&
            ((this.deletionReasonMemo==null && other.getDeletionReasonMemo()==null) || 
             (this.deletionReasonMemo!=null &&
              this.deletionReasonMemo.equals(other.getDeletionReasonMemo())));
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
        if (getDeletionReasonCode() != null) {
            _hashCode += getDeletionReasonCode().hashCode();
        }
        if (getDeletionReasonMemo() != null) {
            _hashCode += getDeletionReasonMemo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletionReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DeletionReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletionReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "deletionReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletionReasonMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "deletionReasonMemo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
