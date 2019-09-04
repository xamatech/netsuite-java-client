/**
 * ProjectTaskPredecessorList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class ProjectTaskPredecessorList  implements java.io.Serializable {
    private com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessor[] projectTaskPredecessor;

    private boolean replaceAll;  // attribute

    public ProjectTaskPredecessorList() {
    }

    public ProjectTaskPredecessorList(
           com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessor[] projectTaskPredecessor,
           boolean replaceAll) {
           this.projectTaskPredecessor = projectTaskPredecessor;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the projectTaskPredecessor value for this ProjectTaskPredecessorList.
     * 
     * @return projectTaskPredecessor
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessor[] getProjectTaskPredecessor() {
        return projectTaskPredecessor;
    }


    /**
     * Sets the projectTaskPredecessor value for this ProjectTaskPredecessorList.
     * 
     * @param projectTaskPredecessor
     */
    public void setProjectTaskPredecessor(com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessor[] projectTaskPredecessor) {
        this.projectTaskPredecessor = projectTaskPredecessor;
    }

    public com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessor getProjectTaskPredecessor(int i) {
        return this.projectTaskPredecessor[i];
    }

    public void setProjectTaskPredecessor(int i, com.netsuite.webservices.activities.scheduling_2019_1.ProjectTaskPredecessor _value) {
        this.projectTaskPredecessor[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ProjectTaskPredecessorList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ProjectTaskPredecessorList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskPredecessorList)) return false;
        ProjectTaskPredecessorList other = (ProjectTaskPredecessorList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectTaskPredecessor==null && other.getProjectTaskPredecessor()==null) || 
             (this.projectTaskPredecessor!=null &&
              java.util.Arrays.equals(this.projectTaskPredecessor, other.getProjectTaskPredecessor()))) &&
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
        if (getProjectTaskPredecessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectTaskPredecessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectTaskPredecessor(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectTaskPredecessorList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskPredecessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "projectTaskPredecessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskPredecessor"));
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
