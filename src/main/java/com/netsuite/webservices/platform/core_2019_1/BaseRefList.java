/**
 * BaseRefList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class BaseRefList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.BaseRef[] baseRef;

    public BaseRefList() {
    }

    public BaseRefList(
           com.netsuite.webservices.platform.core_2019_1.BaseRef[] baseRef) {
           this.baseRef = baseRef;
    }


    /**
     * Gets the baseRef value for this BaseRefList.
     * 
     * @return baseRef
     */
    public com.netsuite.webservices.platform.core_2019_1.BaseRef[] getBaseRef() {
        return baseRef;
    }


    /**
     * Sets the baseRef value for this BaseRefList.
     * 
     * @param baseRef
     */
    public void setBaseRef(com.netsuite.webservices.platform.core_2019_1.BaseRef[] baseRef) {
        this.baseRef = baseRef;
    }

    public com.netsuite.webservices.platform.core_2019_1.BaseRef getBaseRef(int i) {
        return this.baseRef[i];
    }

    public void setBaseRef(int i, com.netsuite.webservices.platform.core_2019_1.BaseRef _value) {
        this.baseRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseRefList)) return false;
        BaseRefList other = (BaseRefList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseRef==null && other.getBaseRef()==null) || 
             (this.baseRef!=null &&
              java.util.Arrays.equals(this.baseRef, other.getBaseRef())));
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
        if (getBaseRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseRef(), i);
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
        new org.apache.axis.description.TypeDesc(BaseRefList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "BaseRefList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "baseRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "BaseRef"));
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
