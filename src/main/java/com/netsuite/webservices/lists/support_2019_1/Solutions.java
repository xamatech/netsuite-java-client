/**
 * Solutions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class Solutions  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef solution;

    private java.lang.String message;

    public Solutions() {
    }

    public Solutions(
           com.netsuite.webservices.platform.core_2019_1.RecordRef solution,
           java.lang.String message) {
           this.solution = solution;
           this.message = message;
    }


    /**
     * Gets the solution value for this Solutions.
     * 
     * @return solution
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this Solutions.
     * 
     * @param solution
     */
    public void setSolution(com.netsuite.webservices.platform.core_2019_1.RecordRef solution) {
        this.solution = solution;
    }


    /**
     * Gets the message value for this Solutions.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Solutions.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Solutions)) return false;
        Solutions other = (Solutions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Solutions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "Solutions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "message"));
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
