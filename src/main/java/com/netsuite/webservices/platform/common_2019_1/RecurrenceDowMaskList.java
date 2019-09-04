/**
 * RecurrenceDowMaskList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class RecurrenceDowMaskList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow[] recurrenceDowMask;

    public RecurrenceDowMaskList() {
    }

    public RecurrenceDowMaskList(
           com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow[] recurrenceDowMask) {
           this.recurrenceDowMask = recurrenceDowMask;
    }


    /**
     * Gets the recurrenceDowMask value for this RecurrenceDowMaskList.
     * 
     * @return recurrenceDowMask
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow[] getRecurrenceDowMask() {
        return recurrenceDowMask;
    }


    /**
     * Sets the recurrenceDowMask value for this RecurrenceDowMaskList.
     * 
     * @param recurrenceDowMask
     */
    public void setRecurrenceDowMask(com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow[] recurrenceDowMask) {
        this.recurrenceDowMask = recurrenceDowMask;
    }

    public com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow getRecurrenceDowMask(int i) {
        return this.recurrenceDowMask[i];
    }

    public void setRecurrenceDowMask(int i, com.netsuite.webservices.platform.common_2019_1.types.RecurrenceDow _value) {
        this.recurrenceDowMask[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecurrenceDowMaskList)) return false;
        RecurrenceDowMaskList other = (RecurrenceDowMaskList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recurrenceDowMask==null && other.getRecurrenceDowMask()==null) || 
             (this.recurrenceDowMask!=null &&
              java.util.Arrays.equals(this.recurrenceDowMask, other.getRecurrenceDowMask())));
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
        if (getRecurrenceDowMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrenceDowMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrenceDowMask(), i);
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
        new org.apache.axis.description.TypeDesc(RecurrenceDowMaskList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDowMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrenceDowMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RecurrenceDow"));
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
