/**
 * ServiceItemTaskTemplates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ServiceItemTaskTemplates  implements java.io.Serializable {
    private java.lang.String taskName;

    private java.lang.Long taskStartOffset;

    private com.netsuite.webservices.platform.core_2019_1.Duration taskDuration;

    public ServiceItemTaskTemplates() {
    }

    public ServiceItemTaskTemplates(
           java.lang.String taskName,
           java.lang.Long taskStartOffset,
           com.netsuite.webservices.platform.core_2019_1.Duration taskDuration) {
           this.taskName = taskName;
           this.taskStartOffset = taskStartOffset;
           this.taskDuration = taskDuration;
    }


    /**
     * Gets the taskName value for this ServiceItemTaskTemplates.
     * 
     * @return taskName
     */
    public java.lang.String getTaskName() {
        return taskName;
    }


    /**
     * Sets the taskName value for this ServiceItemTaskTemplates.
     * 
     * @param taskName
     */
    public void setTaskName(java.lang.String taskName) {
        this.taskName = taskName;
    }


    /**
     * Gets the taskStartOffset value for this ServiceItemTaskTemplates.
     * 
     * @return taskStartOffset
     */
    public java.lang.Long getTaskStartOffset() {
        return taskStartOffset;
    }


    /**
     * Sets the taskStartOffset value for this ServiceItemTaskTemplates.
     * 
     * @param taskStartOffset
     */
    public void setTaskStartOffset(java.lang.Long taskStartOffset) {
        this.taskStartOffset = taskStartOffset;
    }


    /**
     * Gets the taskDuration value for this ServiceItemTaskTemplates.
     * 
     * @return taskDuration
     */
    public com.netsuite.webservices.platform.core_2019_1.Duration getTaskDuration() {
        return taskDuration;
    }


    /**
     * Sets the taskDuration value for this ServiceItemTaskTemplates.
     * 
     * @param taskDuration
     */
    public void setTaskDuration(com.netsuite.webservices.platform.core_2019_1.Duration taskDuration) {
        this.taskDuration = taskDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceItemTaskTemplates)) return false;
        ServiceItemTaskTemplates other = (ServiceItemTaskTemplates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskName==null && other.getTaskName()==null) || 
             (this.taskName!=null &&
              this.taskName.equals(other.getTaskName()))) &&
            ((this.taskStartOffset==null && other.getTaskStartOffset()==null) || 
             (this.taskStartOffset!=null &&
              this.taskStartOffset.equals(other.getTaskStartOffset()))) &&
            ((this.taskDuration==null && other.getTaskDuration()==null) || 
             (this.taskDuration!=null &&
              this.taskDuration.equals(other.getTaskDuration())));
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
        if (getTaskName() != null) {
            _hashCode += getTaskName().hashCode();
        }
        if (getTaskStartOffset() != null) {
            _hashCode += getTaskStartOffset().hashCode();
        }
        if (getTaskDuration() != null) {
            _hashCode += getTaskDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceItemTaskTemplates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ServiceItemTaskTemplates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taskName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStartOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taskStartOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taskDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Duration"));
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
