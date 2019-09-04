/**
 * ManufacturingRoutingRoutingStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingRoutingRoutingStep  implements java.io.Serializable {
    private java.lang.Long operationSequence;

    private java.lang.String operationName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingWorkCenter;

    private java.lang.Long machineResources;

    private java.lang.Long laborResources;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingCostTemplate;

    private java.lang.Double setupTime;

    private java.lang.Double runRate;

    private com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType lagType;

    private java.lang.Long lagAmount;

    private java.lang.String lagUnits;

    public ManufacturingRoutingRoutingStep() {
    }

    public ManufacturingRoutingRoutingStep(
           java.lang.Long operationSequence,
           java.lang.String operationName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingWorkCenter,
           java.lang.Long machineResources,
           java.lang.Long laborResources,
           com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingCostTemplate,
           java.lang.Double setupTime,
           java.lang.Double runRate,
           com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType lagType,
           java.lang.Long lagAmount,
           java.lang.String lagUnits) {
           this.operationSequence = operationSequence;
           this.operationName = operationName;
           this.manufacturingWorkCenter = manufacturingWorkCenter;
           this.machineResources = machineResources;
           this.laborResources = laborResources;
           this.manufacturingCostTemplate = manufacturingCostTemplate;
           this.setupTime = setupTime;
           this.runRate = runRate;
           this.lagType = lagType;
           this.lagAmount = lagAmount;
           this.lagUnits = lagUnits;
    }


    /**
     * Gets the operationSequence value for this ManufacturingRoutingRoutingStep.
     * 
     * @return operationSequence
     */
    public java.lang.Long getOperationSequence() {
        return operationSequence;
    }


    /**
     * Sets the operationSequence value for this ManufacturingRoutingRoutingStep.
     * 
     * @param operationSequence
     */
    public void setOperationSequence(java.lang.Long operationSequence) {
        this.operationSequence = operationSequence;
    }


    /**
     * Gets the operationName value for this ManufacturingRoutingRoutingStep.
     * 
     * @return operationName
     */
    public java.lang.String getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this ManufacturingRoutingRoutingStep.
     * 
     * @param operationName
     */
    public void setOperationName(java.lang.String operationName) {
        this.operationName = operationName;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingRoutingRoutingStep.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingRoutingRoutingStep.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }


    /**
     * Gets the machineResources value for this ManufacturingRoutingRoutingStep.
     * 
     * @return machineResources
     */
    public java.lang.Long getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this ManufacturingRoutingRoutingStep.
     * 
     * @param machineResources
     */
    public void setMachineResources(java.lang.Long machineResources) {
        this.machineResources = machineResources;
    }


    /**
     * Gets the laborResources value for this ManufacturingRoutingRoutingStep.
     * 
     * @return laborResources
     */
    public java.lang.Long getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this ManufacturingRoutingRoutingStep.
     * 
     * @param laborResources
     */
    public void setLaborResources(java.lang.Long laborResources) {
        this.laborResources = laborResources;
    }


    /**
     * Gets the manufacturingCostTemplate value for this ManufacturingRoutingRoutingStep.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingRoutingRoutingStep.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }


    /**
     * Gets the setupTime value for this ManufacturingRoutingRoutingStep.
     * 
     * @return setupTime
     */
    public java.lang.Double getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingRoutingRoutingStep.
     * 
     * @param setupTime
     */
    public void setSetupTime(java.lang.Double setupTime) {
        this.setupTime = setupTime;
    }


    /**
     * Gets the runRate value for this ManufacturingRoutingRoutingStep.
     * 
     * @return runRate
     */
    public java.lang.Double getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingRoutingRoutingStep.
     * 
     * @param runRate
     */
    public void setRunRate(java.lang.Double runRate) {
        this.runRate = runRate;
    }


    /**
     * Gets the lagType value for this ManufacturingRoutingRoutingStep.
     * 
     * @return lagType
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingRoutingRoutingStep.
     * 
     * @param lagType
     */
    public void setLagType(com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingLagType lagType) {
        this.lagType = lagType;
    }


    /**
     * Gets the lagAmount value for this ManufacturingRoutingRoutingStep.
     * 
     * @return lagAmount
     */
    public java.lang.Long getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingRoutingRoutingStep.
     * 
     * @param lagAmount
     */
    public void setLagAmount(java.lang.Long lagAmount) {
        this.lagAmount = lagAmount;
    }


    /**
     * Gets the lagUnits value for this ManufacturingRoutingRoutingStep.
     * 
     * @return lagUnits
     */
    public java.lang.String getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingRoutingRoutingStep.
     * 
     * @param lagUnits
     */
    public void setLagUnits(java.lang.String lagUnits) {
        this.lagUnits = lagUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingRoutingStep)) return false;
        ManufacturingRoutingRoutingStep other = (ManufacturingRoutingRoutingStep) obj;
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
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              this.machineResources.equals(other.getMachineResources()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              this.laborResources.equals(other.getLaborResources()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              this.setupTime.equals(other.getSetupTime()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              this.runRate.equals(other.getRunRate()))) &&
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
        if (getOperationSequence() != null) {
            _hashCode += getOperationSequence().hashCode();
        }
        if (getOperationName() != null) {
            _hashCode += getOperationName().hashCode();
        }
        if (getManufacturingWorkCenter() != null) {
            _hashCode += getManufacturingWorkCenter().hashCode();
        }
        if (getMachineResources() != null) {
            _hashCode += getMachineResources().hashCode();
        }
        if (getLaborResources() != null) {
            _hashCode += getLaborResources().hashCode();
        }
        if (getManufacturingCostTemplate() != null) {
            _hashCode += getManufacturingCostTemplate().hashCode();
        }
        if (getSetupTime() != null) {
            _hashCode += getSetupTime().hashCode();
        }
        if (getRunRate() != null) {
            _hashCode += getRunRate().hashCode();
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
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingRoutingStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "operationSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
