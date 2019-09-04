/**
 * JobPlStatementList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobPlStatementList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.JobPlStatement[] jobPlStatement;

    private boolean replaceAll;  // attribute

    public JobPlStatementList() {
    }

    public JobPlStatementList(
           com.netsuite.webservices.lists.relationships_2019_1.JobPlStatement[] jobPlStatement,
           boolean replaceAll) {
           this.jobPlStatement = jobPlStatement;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the jobPlStatement value for this JobPlStatementList.
     * 
     * @return jobPlStatement
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobPlStatement[] getJobPlStatement() {
        return jobPlStatement;
    }


    /**
     * Sets the jobPlStatement value for this JobPlStatementList.
     * 
     * @param jobPlStatement
     */
    public void setJobPlStatement(com.netsuite.webservices.lists.relationships_2019_1.JobPlStatement[] jobPlStatement) {
        this.jobPlStatement = jobPlStatement;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.JobPlStatement getJobPlStatement(int i) {
        return this.jobPlStatement[i];
    }

    public void setJobPlStatement(int i, com.netsuite.webservices.lists.relationships_2019_1.JobPlStatement _value) {
        this.jobPlStatement[i] = _value;
    }


    /**
     * Gets the replaceAll value for this JobPlStatementList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this JobPlStatementList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobPlStatementList)) return false;
        JobPlStatementList other = (JobPlStatementList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobPlStatement==null && other.getJobPlStatement()==null) || 
             (this.jobPlStatement!=null &&
              java.util.Arrays.equals(this.jobPlStatement, other.getJobPlStatement()))) &&
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
        if (getJobPlStatement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobPlStatement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobPlStatement(), i);
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
        new org.apache.axis.description.TypeDesc(JobPlStatementList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPlStatementList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPlStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobPlStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPlStatement"));
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
