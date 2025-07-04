/**
 * RecordRefList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2024_2;

public class RecordRefList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.RecordRef[] recordRef;

    public RecordRefList() {
    }

    public RecordRefList(
           com.netsuite.webservices.platform.core_2024_2.RecordRef[] recordRef) {
           this.recordRef = recordRef;
    }


    /**
     * Gets the recordRef value for this RecordRefList.
     * 
     * @return recordRef
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef[] getRecordRef() {
        return recordRef;
    }


    /**
     * Sets the recordRef value for this RecordRefList.
     * 
     * @param recordRef
     */
    public void setRecordRef(com.netsuite.webservices.platform.core_2024_2.RecordRef[] recordRef) {
        this.recordRef = recordRef;
    }

    public com.netsuite.webservices.platform.core_2024_2.RecordRef getRecordRef(int i) {
        return this.recordRef[i];
    }

    public void setRecordRef(int i, com.netsuite.webservices.platform.core_2024_2.RecordRef _value) {
        this.recordRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordRefList)) return false;
        RecordRefList other = (RecordRefList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordRef==null && other.getRecordRef()==null) || 
             (this.recordRef!=null &&
              java.util.Arrays.equals(this.recordRef, other.getRecordRef())));
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
        if (getRecordRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordRefList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRefList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "recordRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
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
