/**
 * ManufacturingOperationTaskPredecessor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingOperationTaskPredecessor  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef task;

    private com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskPredecessorPredecessorType type;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType lagType;

    private java.lang.Long lagAmount;

    private java.lang.String lagUnits;

    public ManufacturingOperationTaskPredecessor() {
    }

    public ManufacturingOperationTaskPredecessor(
           com.netsuite.webservices.platform.core_2019_1.RecordRef task,
           com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskPredecessorPredecessorType type,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType lagType,
           java.lang.Long lagAmount,
           java.lang.String lagUnits) {
           this.task = task;
           this.type = type;
           this.startDate = startDate;
           this.endDate = endDate;
           this.lagType = lagType;
           this.lagAmount = lagAmount;
           this.lagUnits = lagUnits;
    }


    /**
     * Gets the task value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return task
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTask() {
        return task;
    }


    /**
     * Sets the task value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param task
     */
    public void setTask(com.netsuite.webservices.platform.core_2019_1.RecordRef task) {
        this.task = task;
    }


    /**
     * Gets the type value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return type
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskPredecessorPredecessorType getType() {
        return type;
    }


    /**
     * Sets the type value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskPredecessorPredecessorType type) {
        this.type = type;
    }


    /**
     * Gets the startDate value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the lagType value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return lagType
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param lagType
     */
    public void setLagType(com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType lagType) {
        this.lagType = lagType;
    }


    /**
     * Gets the lagAmount value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return lagAmount
     */
    public java.lang.Long getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param lagAmount
     */
    public void setLagAmount(java.lang.Long lagAmount) {
        this.lagAmount = lagAmount;
    }


    /**
     * Gets the lagUnits value for this ManufacturingOperationTaskPredecessor.
     * 
     * @return lagUnits
     */
    public java.lang.String getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingOperationTaskPredecessor.
     * 
     * @param lagUnits
     */
    public void setLagUnits(java.lang.String lagUnits) {
        this.lagUnits = lagUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingOperationTaskPredecessor)) return false;
        ManufacturingOperationTaskPredecessor other = (ManufacturingOperationTaskPredecessor) obj;
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.lagType==null && other.getLagType()==null) || 
             (this.lagType!=null &&
              this.lagType.equals(other.getLagType()))) &&
            ((this.lagAmount==null && other.getLagAmount()==null) || 
             (this.lagAmount!=null &&
              this.lagAmount.equals(other.getLagAmount()))) &&
            ((this.lagUnits==null && other.getLagUnits()==null) || 
             (this.lagUnits!=null &&
              this.lagUnits.equals(other.getLagUnits())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLagType() != null) {
            _hashCode += getLagType().hashCode();
        }
        if (getLagAmount() != null) {
            _hashCode += getLagAmount().hashCode();
        }
        if (getLagUnits() != null) {
            _hashCode += getLagUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingOperationTaskPredecessor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "task"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorPredecessorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingLagType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "lagUnits"));
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
