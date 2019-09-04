/**
 * WorkOrderCompletionOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class WorkOrderCompletionOperation  implements java.io.Serializable {
    private java.lang.Long operationSequence;

    private java.lang.String operationName;

    private java.lang.String workCenter;

    private java.lang.Long machineResources;

    private java.lang.Long laborResources;

    private java.lang.Double inputQuantity;

    private java.lang.Double quantityRemaining;

    private java.lang.Double predecessorCompletedQuantity;

    private java.lang.Double completedQuantity;

    private java.lang.Boolean recordSetup;

    private java.lang.Double machineSetupTime;

    private java.lang.Double laborSetupTime;

    private java.lang.Double machineRunTime;

    private java.lang.Double laborRunTime;

    public WorkOrderCompletionOperation() {
    }

    public WorkOrderCompletionOperation(
           java.lang.Long operationSequence,
           java.lang.String operationName,
           java.lang.String workCenter,
           java.lang.Long machineResources,
           java.lang.Long laborResources,
           java.lang.Double inputQuantity,
           java.lang.Double quantityRemaining,
           java.lang.Double predecessorCompletedQuantity,
           java.lang.Double completedQuantity,
           java.lang.Boolean recordSetup,
           java.lang.Double machineSetupTime,
           java.lang.Double laborSetupTime,
           java.lang.Double machineRunTime,
           java.lang.Double laborRunTime) {
           this.operationSequence = operationSequence;
           this.operationName = operationName;
           this.workCenter = workCenter;
           this.machineResources = machineResources;
           this.laborResources = laborResources;
           this.inputQuantity = inputQuantity;
           this.quantityRemaining = quantityRemaining;
           this.predecessorCompletedQuantity = predecessorCompletedQuantity;
           this.completedQuantity = completedQuantity;
           this.recordSetup = recordSetup;
           this.machineSetupTime = machineSetupTime;
           this.laborSetupTime = laborSetupTime;
           this.machineRunTime = machineRunTime;
           this.laborRunTime = laborRunTime;
    }


    /**
     * Gets the operationSequence value for this WorkOrderCompletionOperation.
     * 
     * @return operationSequence
     */
    public java.lang.Long getOperationSequence() {
        return operationSequence;
    }


    /**
     * Sets the operationSequence value for this WorkOrderCompletionOperation.
     * 
     * @param operationSequence
     */
    public void setOperationSequence(java.lang.Long operationSequence) {
        this.operationSequence = operationSequence;
    }


    /**
     * Gets the operationName value for this WorkOrderCompletionOperation.
     * 
     * @return operationName
     */
    public java.lang.String getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this WorkOrderCompletionOperation.
     * 
     * @param operationName
     */
    public void setOperationName(java.lang.String operationName) {
        this.operationName = operationName;
    }


    /**
     * Gets the workCenter value for this WorkOrderCompletionOperation.
     * 
     * @return workCenter
     */
    public java.lang.String getWorkCenter() {
        return workCenter;
    }


    /**
     * Sets the workCenter value for this WorkOrderCompletionOperation.
     * 
     * @param workCenter
     */
    public void setWorkCenter(java.lang.String workCenter) {
        this.workCenter = workCenter;
    }


    /**
     * Gets the machineResources value for this WorkOrderCompletionOperation.
     * 
     * @return machineResources
     */
    public java.lang.Long getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this WorkOrderCompletionOperation.
     * 
     * @param machineResources
     */
    public void setMachineResources(java.lang.Long machineResources) {
        this.machineResources = machineResources;
    }


    /**
     * Gets the laborResources value for this WorkOrderCompletionOperation.
     * 
     * @return laborResources
     */
    public java.lang.Long getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this WorkOrderCompletionOperation.
     * 
     * @param laborResources
     */
    public void setLaborResources(java.lang.Long laborResources) {
        this.laborResources = laborResources;
    }


    /**
     * Gets the inputQuantity value for this WorkOrderCompletionOperation.
     * 
     * @return inputQuantity
     */
    public java.lang.Double getInputQuantity() {
        return inputQuantity;
    }


    /**
     * Sets the inputQuantity value for this WorkOrderCompletionOperation.
     * 
     * @param inputQuantity
     */
    public void setInputQuantity(java.lang.Double inputQuantity) {
        this.inputQuantity = inputQuantity;
    }


    /**
     * Gets the quantityRemaining value for this WorkOrderCompletionOperation.
     * 
     * @return quantityRemaining
     */
    public java.lang.Double getQuantityRemaining() {
        return quantityRemaining;
    }


    /**
     * Sets the quantityRemaining value for this WorkOrderCompletionOperation.
     * 
     * @param quantityRemaining
     */
    public void setQuantityRemaining(java.lang.Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }


    /**
     * Gets the predecessorCompletedQuantity value for this WorkOrderCompletionOperation.
     * 
     * @return predecessorCompletedQuantity
     */
    public java.lang.Double getPredecessorCompletedQuantity() {
        return predecessorCompletedQuantity;
    }


    /**
     * Sets the predecessorCompletedQuantity value for this WorkOrderCompletionOperation.
     * 
     * @param predecessorCompletedQuantity
     */
    public void setPredecessorCompletedQuantity(java.lang.Double predecessorCompletedQuantity) {
        this.predecessorCompletedQuantity = predecessorCompletedQuantity;
    }


    /**
     * Gets the completedQuantity value for this WorkOrderCompletionOperation.
     * 
     * @return completedQuantity
     */
    public java.lang.Double getCompletedQuantity() {
        return completedQuantity;
    }


    /**
     * Sets the completedQuantity value for this WorkOrderCompletionOperation.
     * 
     * @param completedQuantity
     */
    public void setCompletedQuantity(java.lang.Double completedQuantity) {
        this.completedQuantity = completedQuantity;
    }


    /**
     * Gets the recordSetup value for this WorkOrderCompletionOperation.
     * 
     * @return recordSetup
     */
    public java.lang.Boolean getRecordSetup() {
        return recordSetup;
    }


    /**
     * Sets the recordSetup value for this WorkOrderCompletionOperation.
     * 
     * @param recordSetup
     */
    public void setRecordSetup(java.lang.Boolean recordSetup) {
        this.recordSetup = recordSetup;
    }


    /**
     * Gets the machineSetupTime value for this WorkOrderCompletionOperation.
     * 
     * @return machineSetupTime
     */
    public java.lang.Double getMachineSetupTime() {
        return machineSetupTime;
    }


    /**
     * Sets the machineSetupTime value for this WorkOrderCompletionOperation.
     * 
     * @param machineSetupTime
     */
    public void setMachineSetupTime(java.lang.Double machineSetupTime) {
        this.machineSetupTime = machineSetupTime;
    }


    /**
     * Gets the laborSetupTime value for this WorkOrderCompletionOperation.
     * 
     * @return laborSetupTime
     */
    public java.lang.Double getLaborSetupTime() {
        return laborSetupTime;
    }


    /**
     * Sets the laborSetupTime value for this WorkOrderCompletionOperation.
     * 
     * @param laborSetupTime
     */
    public void setLaborSetupTime(java.lang.Double laborSetupTime) {
        this.laborSetupTime = laborSetupTime;
    }


    /**
     * Gets the machineRunTime value for this WorkOrderCompletionOperation.
     * 
     * @return machineRunTime
     */
    public java.lang.Double getMachineRunTime() {
        return machineRunTime;
    }


    /**
     * Sets the machineRunTime value for this WorkOrderCompletionOperation.
     * 
     * @param machineRunTime
     */
    public void setMachineRunTime(java.lang.Double machineRunTime) {
        this.machineRunTime = machineRunTime;
    }


    /**
     * Gets the laborRunTime value for this WorkOrderCompletionOperation.
     * 
     * @return laborRunTime
     */
    public java.lang.Double getLaborRunTime() {
        return laborRunTime;
    }


    /**
     * Sets the laborRunTime value for this WorkOrderCompletionOperation.
     * 
     * @param laborRunTime
     */
    public void setLaborRunTime(java.lang.Double laborRunTime) {
        this.laborRunTime = laborRunTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderCompletionOperation)) return false;
        WorkOrderCompletionOperation other = (WorkOrderCompletionOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationSequence==null && other.getOperationSequence()==null) || 
             (this.operationSequence!=null &&
              this.operationSequence.equals(other.getOperationSequence()))) &&
            ((this.operationName==null && other.getOperationName()==null) || 
             (this.operationName!=null &&
              this.operationName.equals(other.getOperationName()))) &&
            ((this.workCenter==null && other.getWorkCenter()==null) || 
             (this.workCenter!=null &&
              this.workCenter.equals(other.getWorkCenter()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              this.machineResources.equals(other.getMachineResources()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              this.laborResources.equals(other.getLaborResources()))) &&
            ((this.inputQuantity==null && other.getInputQuantity()==null) || 
             (this.inputQuantity!=null &&
              this.inputQuantity.equals(other.getInputQuantity()))) &&
            ((this.quantityRemaining==null && other.getQuantityRemaining()==null) || 
             (this.quantityRemaining!=null &&
              this.quantityRemaining.equals(other.getQuantityRemaining()))) &&
            ((this.predecessorCompletedQuantity==null && other.getPredecessorCompletedQuantity()==null) || 
             (this.predecessorCompletedQuantity!=null &&
              this.predecessorCompletedQuantity.equals(other.getPredecessorCompletedQuantity()))) &&
            ((this.completedQuantity==null && other.getCompletedQuantity()==null) || 
             (this.completedQuantity!=null &&
              this.completedQuantity.equals(other.getCompletedQuantity()))) &&
            ((this.recordSetup==null && other.getRecordSetup()==null) || 
             (this.recordSetup!=null &&
              this.recordSetup.equals(other.getRecordSetup()))) &&
            ((this.machineSetupTime==null && other.getMachineSetupTime()==null) || 
             (this.machineSetupTime!=null &&
              this.machineSetupTime.equals(other.getMachineSetupTime()))) &&
            ((this.laborSetupTime==null && other.getLaborSetupTime()==null) || 
             (this.laborSetupTime!=null &&
              this.laborSetupTime.equals(other.getLaborSetupTime()))) &&
            ((this.machineRunTime==null && other.getMachineRunTime()==null) || 
             (this.machineRunTime!=null &&
              this.machineRunTime.equals(other.getMachineRunTime()))) &&
            ((this.laborRunTime==null && other.getLaborRunTime()==null) || 
             (this.laborRunTime!=null &&
              this.laborRunTime.equals(other.getLaborRunTime())));
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
        if (getOperationSequence() != null) {
            _hashCode += getOperationSequence().hashCode();
        }
        if (getOperationName() != null) {
            _hashCode += getOperationName().hashCode();
        }
        if (getWorkCenter() != null) {
            _hashCode += getWorkCenter().hashCode();
        }
        if (getMachineResources() != null) {
            _hashCode += getMachineResources().hashCode();
        }
        if (getLaborResources() != null) {
            _hashCode += getLaborResources().hashCode();
        }
        if (getInputQuantity() != null) {
            _hashCode += getInputQuantity().hashCode();
        }
        if (getQuantityRemaining() != null) {
            _hashCode += getQuantityRemaining().hashCode();
        }
        if (getPredecessorCompletedQuantity() != null) {
            _hashCode += getPredecessorCompletedQuantity().hashCode();
        }
        if (getCompletedQuantity() != null) {
            _hashCode += getCompletedQuantity().hashCode();
        }
        if (getRecordSetup() != null) {
            _hashCode += getRecordSetup().hashCode();
        }
        if (getMachineSetupTime() != null) {
            _hashCode += getMachineSetupTime().hashCode();
        }
        if (getLaborSetupTime() != null) {
            _hashCode += getLaborSetupTime().hashCode();
        }
        if (getMachineRunTime() != null) {
            _hashCode += getMachineRunTime().hashCode();
        }
        if (getLaborRunTime() != null) {
            _hashCode += getLaborRunTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkOrderCompletionOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "operationSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "workCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorCompletedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "predecessorCompletedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "recordSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineSetupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "machineSetupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborSetupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "laborSetupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "machineRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "laborRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
