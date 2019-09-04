/**
 * JobPercentCompleteOverrideList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobPercentCompleteOverrideList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverride[] jobPercentCompleteOverride;

    private boolean replaceAll;  // attribute

    public JobPercentCompleteOverrideList() {
    }

    public JobPercentCompleteOverrideList(
           com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverride[] jobPercentCompleteOverride,
           boolean replaceAll) {
           this.jobPercentCompleteOverride = jobPercentCompleteOverride;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the jobPercentCompleteOverride value for this JobPercentCompleteOverrideList.
     * 
     * @return jobPercentCompleteOverride
     */
    public com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverride[] getJobPercentCompleteOverride() {
        return jobPercentCompleteOverride;
    }


    /**
     * Sets the jobPercentCompleteOverride value for this JobPercentCompleteOverrideList.
     * 
     * @param jobPercentCompleteOverride
     */
    public void setJobPercentCompleteOverride(com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverride[] jobPercentCompleteOverride) {
        this.jobPercentCompleteOverride = jobPercentCompleteOverride;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverride getJobPercentCompleteOverride(int i) {
        return this.jobPercentCompleteOverride[i];
    }

    public void setJobPercentCompleteOverride(int i, com.netsuite.webservices.lists.relationships_2019_1.JobPercentCompleteOverride _value) {
        this.jobPercentCompleteOverride[i] = _value;
    }


    /**
     * Gets the replaceAll value for this JobPercentCompleteOverrideList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this JobPercentCompleteOverrideList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobPercentCompleteOverrideList)) return false;
        JobPercentCompleteOverrideList other = (JobPercentCompleteOverrideList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobPercentCompleteOverride==null && other.getJobPercentCompleteOverride()==null) || 
             (this.jobPercentCompleteOverride!=null &&
              java.util.Arrays.equals(this.jobPercentCompleteOverride, other.getJobPercentCompleteOverride()))) &&
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
        if (getJobPercentCompleteOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobPercentCompleteOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobPercentCompleteOverride(), i);
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
        new org.apache.axis.description.TypeDesc(JobPercentCompleteOverrideList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPercentCompleteOverrideList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPercentCompleteOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobPercentCompleteOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPercentCompleteOverride"));
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
