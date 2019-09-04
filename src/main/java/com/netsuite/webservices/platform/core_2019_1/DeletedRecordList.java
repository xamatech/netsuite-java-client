/**
 * DeletedRecordList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class DeletedRecordList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.DeletedRecord[] deletedRecord;

    public DeletedRecordList() {
    }

    public DeletedRecordList(
           com.netsuite.webservices.platform.core_2019_1.DeletedRecord[] deletedRecord) {
           this.deletedRecord = deletedRecord;
    }


    /**
     * Gets the deletedRecord value for this DeletedRecordList.
     * 
     * @return deletedRecord
     */
    public com.netsuite.webservices.platform.core_2019_1.DeletedRecord[] getDeletedRecord() {
        return deletedRecord;
    }


    /**
     * Sets the deletedRecord value for this DeletedRecordList.
     * 
     * @param deletedRecord
     */
    public void setDeletedRecord(com.netsuite.webservices.platform.core_2019_1.DeletedRecord[] deletedRecord) {
        this.deletedRecord = deletedRecord;
    }

    public com.netsuite.webservices.platform.core_2019_1.DeletedRecord getDeletedRecord(int i) {
        return this.deletedRecord[i];
    }

    public void setDeletedRecord(int i, com.netsuite.webservices.platform.core_2019_1.DeletedRecord _value) {
        this.deletedRecord[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletedRecordList)) return false;
        DeletedRecordList other = (DeletedRecordList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletedRecord==null && other.getDeletedRecord()==null) || 
             (this.deletedRecord!=null &&
              java.util.Arrays.equals(this.deletedRecord, other.getDeletedRecord())));
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
        if (getDeletedRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedRecord(), i);
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
        new org.apache.axis.description.TypeDesc(DeletedRecordList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DeletedRecordList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "deletedRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DeletedRecord"));
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
