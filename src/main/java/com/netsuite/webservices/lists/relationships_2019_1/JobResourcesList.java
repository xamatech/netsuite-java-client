/**
 * JobResourcesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobResourcesList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.JobResources[] jobResources;

    private boolean replaceAll;  // attribute

    public JobResourcesList() {
    }

    public JobResourcesList(
           com.netsuite.webservices.lists.relationships_2019_1.JobResources[] jobResources,
           boolean replaceAll) {
           this.jobResources = jobResources;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the jobResources value for this JobResourcesList.
     * 
     * @return jobResources
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobResources[] getJobResources() {
        return jobResources;
    }


    /**
     * Sets the jobResources value for this JobResourcesList.
     * 
     * @param jobResources
     */
    public void setJobResources(com.netsuite.webservices.lists.relationships_2019_1.JobResources[] jobResources) {
        this.jobResources = jobResources;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.JobResources getJobResources(int i) {
        return this.jobResources[i];
    }

    public void setJobResources(int i, com.netsuite.webservices.lists.relationships_2019_1.JobResources _value) {
        this.jobResources[i] = _value;
    }


    /**
     * Gets the replaceAll value for this JobResourcesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this JobResourcesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobResourcesList)) return false;
        JobResourcesList other = (JobResourcesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobResources==null && other.getJobResources()==null) || 
             (this.jobResources!=null &&
              java.util.Arrays.equals(this.jobResources, other.getJobResources()))) &&
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
        if (getJobResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobResources(), i);
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
        new org.apache.axis.description.TypeDesc(JobResourcesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobResourcesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobResources"));
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
