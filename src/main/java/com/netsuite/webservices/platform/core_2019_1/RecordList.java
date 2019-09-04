/**
 * RecordList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class RecordList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.Record[] record;

    public RecordList() {
    }

    public RecordList(
           com.netsuite.webservices.platform.core_2019_1.Record[] record) {
           this.record = record;
    }


    /**
     * Gets the record value for this RecordList.
     * 
     * @return record
     */
    public com.netsuite.webservices.platform.core_2019_1.Record[] getRecord() {
        return record;
    }


    /**
     * Sets the record value for this RecordList.
     * 
     * @param record
     */
    public void setRecord(com.netsuite.webservices.platform.core_2019_1.Record[] record) {
        this.record = record;
    }

    public com.netsuite.webservices.platform.core_2019_1.Record getRecord(int i) {
        return this.record[i];
    }

    public void setRecord(int i, com.netsuite.webservices.platform.core_2019_1.Record _value) {
        this.record[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordList)) return false;
        RecordList other = (RecordList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.record==null && other.getRecord()==null) || 
             (this.record!=null &&
              java.util.Arrays.equals(this.record, other.getRecord())));
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
        if (getRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecord(), i);
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
        new org.apache.axis.description.TypeDesc(RecordList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "record"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Record"));
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
