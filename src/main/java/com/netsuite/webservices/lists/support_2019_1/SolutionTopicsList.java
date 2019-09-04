/**
 * SolutionTopicsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class SolutionTopicsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.support_2019_1.SolutionTopics[] topics;

    private boolean replaceAll;  // attribute

    public SolutionTopicsList() {
    }

    public SolutionTopicsList(
           com.netsuite.webservices.lists.support_2019_1.SolutionTopics[] topics,
           boolean replaceAll) {
           this.topics = topics;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the topics value for this SolutionTopicsList.
     * 
     * @return topics
     */
    public com.netsuite.webservices.lists.support_2019_1.SolutionTopics[] getTopics() {
        return topics;
    }


    /**
     * Sets the topics value for this SolutionTopicsList.
     * 
     * @param topics
     */
    public void setTopics(com.netsuite.webservices.lists.support_2019_1.SolutionTopics[] topics) {
        this.topics = topics;
    }

    public com.netsuite.webservices.lists.support_2019_1.SolutionTopics getTopics(int i) {
        return this.topics[i];
    }

    public void setTopics(int i, com.netsuite.webservices.lists.support_2019_1.SolutionTopics _value) {
        this.topics[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SolutionTopicsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SolutionTopicsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolutionTopicsList)) return false;
        SolutionTopicsList other = (SolutionTopicsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.topics==null && other.getTopics()==null) || 
             (this.topics!=null &&
              java.util.Arrays.equals(this.topics, other.getTopics()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getTopics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolutionTopicsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SolutionTopicsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "topics"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SolutionTopics"));
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
