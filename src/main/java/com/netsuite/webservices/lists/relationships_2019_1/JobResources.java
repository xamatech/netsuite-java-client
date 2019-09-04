/**
 * JobResources.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobResources  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef jobResource;

    private java.lang.String email;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef role;

    public JobResources() {
    }

    public JobResources(
           com.netsuite.webservices.platform.core_2019_1.RecordRef jobResource,
           java.lang.String email,
           com.netsuite.webservices.platform.core_2019_1.RecordRef role) {
           this.jobResource = jobResource;
           this.email = email;
           this.role = role;
    }


    /**
     * Gets the jobResource value for this JobResources.
     * 
     * @return jobResource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJobResource() {
        return jobResource;
    }


    /**
     * Sets the jobResource value for this JobResources.
     * 
     * @param jobResource
     */
    public void setJobResource(com.netsuite.webservices.platform.core_2019_1.RecordRef jobResource) {
        this.jobResource = jobResource;
    }


    /**
     * Gets the email value for this JobResources.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this JobResources.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the role value for this JobResources.
     * 
     * @return role
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRole() {
        return role;
    }


    /**
     * Sets the role value for this JobResources.
     * 
     * @param role
     */
    public void setRole(com.netsuite.webservices.platform.core_2019_1.RecordRef role) {
        this.role = role;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobResources)) return false;
        JobResources other = (JobResources) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobResource==null && other.getJobResource()==null) || 
             (this.jobResource!=null &&
              this.jobResource.equals(other.getJobResource()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole())));
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
        if (getJobResource() != null) {
            _hashCode += getJobResource().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobResources.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobResources"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
