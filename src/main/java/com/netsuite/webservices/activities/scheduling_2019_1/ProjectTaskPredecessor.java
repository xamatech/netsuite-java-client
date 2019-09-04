/**
 * ProjectTaskPredecessor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class ProjectTaskPredecessor  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef task;

    private com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskPredecessorPredecessorType type;

    private java.lang.Double lagDays;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public ProjectTaskPredecessor() {
    }

    public ProjectTaskPredecessor(
           com.netsuite.webservices.platform.core_2019_1.RecordRef task,
           com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskPredecessorPredecessorType type,
           java.lang.Double lagDays,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.task = task;
           this.type = type;
           this.lagDays = lagDays;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the task value for this ProjectTaskPredecessor.
     * 
     * @return task
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTask() {
        return task;
    }


    /**
     * Sets the task value for this ProjectTaskPredecessor.
     * 
     * @param task
     */
    public void setTask(com.netsuite.webservices.platform.core_2019_1.RecordRef task) {
        this.task = task;
    }


    /**
     * Gets the type value for this ProjectTaskPredecessor.
     * 
     * @return type
     */
    public com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskPredecessorPredecessorType getType() {
        return type;
    }


    /**
     * Sets the type value for this ProjectTaskPredecessor.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.activities.scheduling_2019_1.types.ProjectTaskPredecessorPredecessorType type) {
        this.type = type;
    }


    /**
     * Gets the lagDays value for this ProjectTaskPredecessor.
     * 
     * @return lagDays
     */
    public java.lang.Double getLagDays() {
        return lagDays;
    }


    /**
     * Sets the lagDays value for this ProjectTaskPredecessor.
     * 
     * @param lagDays
     */
    public void setLagDays(java.lang.Double lagDays) {
        this.lagDays = lagDays;
    }


    /**
     * Gets the startDate value for this ProjectTaskPredecessor.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskPredecessor.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ProjectTaskPredecessor.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskPredecessor.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskPredecessor)) return false;
        ProjectTaskPredecessor other = (ProjectTaskPredecessor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.task==null && other.getTask()==null) || 
             (this.task!=null &&
              this.task.equals(other.getTask()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.lagDays==null && other.getLagDays()==null) || 
             (this.lagDays!=null &&
              this.lagDays.equals(other.getLagDays()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getTask() != null) {
            _hashCode += getTask().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLagDays() != null) {
            _hashCode += getLagDays().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskPredecessor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskPredecessor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "task"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorPredecessorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "lagDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
