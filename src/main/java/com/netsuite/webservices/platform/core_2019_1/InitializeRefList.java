/**
 * InitializeRefList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class InitializeRefList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.InitializeRef[] initializeRef;

    public InitializeRefList() {
    }

    public InitializeRefList(
           com.netsuite.webservices.platform.core_2019_1.InitializeRef[] initializeRef) {
           this.initializeRef = initializeRef;
    }


    /**
     * Gets the initializeRef value for this InitializeRefList.
     * 
     * @return initializeRef
     */
    public com.netsuite.webservices.platform.core_2019_1.InitializeRef[] getInitializeRef() {
        return initializeRef;
    }


    /**
     * Sets the initializeRef value for this InitializeRefList.
     * 
     * @param initializeRef
     */
    public void setInitializeRef(com.netsuite.webservices.platform.core_2019_1.InitializeRef[] initializeRef) {
        this.initializeRef = initializeRef;
    }

    public com.netsuite.webservices.platform.core_2019_1.InitializeRef getInitializeRef(int i) {
        return this.initializeRef[i];
    }

    public void setInitializeRef(int i, com.netsuite.webservices.platform.core_2019_1.InitializeRef _value) {
        this.initializeRef[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitializeRefList)) return false;
        InitializeRefList other = (InitializeRefList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.initializeRef==null && other.getInitializeRef()==null) || 
             (this.initializeRef!=null &&
              java.util.Arrays.equals(this.initializeRef, other.getInitializeRef())));
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
        if (getInitializeRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInitializeRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInitializeRef(), i);
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
        new org.apache.axis.description.TypeDesc(InitializeRefList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "InitializeRefList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initializeRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "initializeRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "InitializeRef"));
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
