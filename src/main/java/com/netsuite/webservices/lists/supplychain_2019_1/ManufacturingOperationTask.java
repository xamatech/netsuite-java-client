/**
 * ManufacturingOperationTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingOperationTask  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingCostTemplate;

    private java.lang.String title;

    private java.lang.Long operationSequence;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef workOrder;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef order;

    private com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskStatus status;

    private java.lang.String message;

    private java.lang.Double estimatedWork;

    private java.lang.Double actualWork;

    private java.lang.Double remainingWork;

    private java.lang.Double inputQuantity;

    private java.lang.Double completedQuantity;

    private java.lang.Double setupTime;

    private java.lang.Double runRate;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Boolean autoCalculateLag;

    private java.lang.Long machineResources;

    private java.lang.Long laborResources;

    private com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetailList costDetailList;

    private com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessorList predecessorList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ManufacturingOperationTask() {
    }

    public ManufacturingOperationTask(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingCostTemplate,
           java.lang.String title,
           java.lang.Long operationSequence,
           com.netsuite.webservices.platform.core_2019_1.RecordRef workOrder,
           com.netsuite.webservices.platform.core_2019_1.RecordRef order,
           com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskStatus status,
           java.lang.String message,
           java.lang.Double estimatedWork,
           java.lang.Double actualWork,
           java.lang.Double remainingWork,
           java.lang.Double inputQuantity,
           java.lang.Double completedQuantity,
           java.lang.Double setupTime,
           java.lang.Double runRate,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Boolean autoCalculateLag,
           java.lang.Long machineResources,
           java.lang.Long laborResources,
           com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetailList costDetailList,
           com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessorList predecessorList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.title = title;
        this.operationSequence = operationSequence;
        this.workOrder = workOrder;
        this.order = order;
        this.status = status;
        this.message = message;
        this.estimatedWork = estimatedWork;
        this.actualWork = actualWork;
        this.remainingWork = remainingWork;
        this.inputQuantity = inputQuantity;
        this.completedQuantity = completedQuantity;
        this.setupTime = setupTime;
        this.runRate = runRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.autoCalculateLag = autoCalculateLag;
        this.machineResources = machineResources;
        this.laborResources = laborResources;
        this.costDetailList = costDetailList;
        this.predecessorList = predecessorList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this ManufacturingOperationTask.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ManufacturingOperationTask.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingOperationTask.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingOperationTask.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }


    /**
     * Gets the manufacturingCostTemplate value for this ManufacturingOperationTask.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingOperationTask.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2019_1.RecordRef manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }


    /**
     * Gets the title value for this ManufacturingOperationTask.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ManufacturingOperationTask.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the operationSequence value for this ManufacturingOperationTask.
     * 
     * @return operationSequence
     */
    public java.lang.Long getOperationSequence() {
        return operationSequence;
    }


    /**
     * Sets the operationSequence value for this ManufacturingOperationTask.
     * 
     * @param operationSequence
     */
    public void setOperationSequence(java.lang.Long operationSequence) {
        this.operationSequence = operationSequence;
    }


    /**
     * Gets the workOrder value for this ManufacturingOperationTask.
     * 
     * @return workOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWorkOrder() {
        return workOrder;
    }


    /**
     * Sets the workOrder value for this ManufacturingOperationTask.
     * 
     * @param workOrder
     */
    public void setWorkOrder(com.netsuite.webservices.platform.core_2019_1.RecordRef workOrder) {
        this.workOrder = workOrder;
    }


    /**
     * Gets the order value for this ManufacturingOperationTask.
     * 
     * @return order
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ManufacturingOperationTask.
     * 
     * @param order
     */
    public void setOrder(com.netsuite.webservices.platform.core_2019_1.RecordRef order) {
        this.order = order;
    }


    /**
     * Gets the status value for this ManufacturingOperationTask.
     * 
     * @return status
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ManufacturingOperationTask.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.lists.supplychain_2019_1.types.ManufacturingOperationTaskStatus status) {
        this.status = status;
    }


    /**
     * Gets the message value for this ManufacturingOperationTask.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ManufacturingOperationTask.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the estimatedWork value for this ManufacturingOperationTask.
     * 
     * @return estimatedWork
     */
    public java.lang.Double getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ManufacturingOperationTask.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(java.lang.Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the actualWork value for this ManufacturingOperationTask.
     * 
     * @return actualWork
     */
    public java.lang.Double getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ManufacturingOperationTask.
     * 
     * @param actualWork
     */
    public void setActualWork(java.lang.Double actualWork) {
        this.actualWork = actualWork;
    }


    /**
     * Gets the remainingWork value for this ManufacturingOperationTask.
     * 
     * @return remainingWork
     */
    public java.lang.Double getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ManufacturingOperationTask.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(java.lang.Double remainingWork) {
        this.remainingWork = remainingWork;
    }


    /**
     * Gets the inputQuantity value for this ManufacturingOperationTask.
     * 
     * @return inputQuantity
     */
    public java.lang.Double getInputQuantity() {
        return inputQuantity;
    }


    /**
     * Sets the inputQuantity value for this ManufacturingOperationTask.
     * 
     * @param inputQuantity
     */
    public void setInputQuantity(java.lang.Double inputQuantity) {
        this.inputQuantity = inputQuantity;
    }


    /**
     * Gets the completedQuantity value for this ManufacturingOperationTask.
     * 
     * @return completedQuantity
     */
    public java.lang.Double getCompletedQuantity() {
        return completedQuantity;
    }


    /**
     * Sets the completedQuantity value for this ManufacturingOperationTask.
     * 
     * @param completedQuantity
     */
    public void setCompletedQuantity(java.lang.Double completedQuantity) {
        this.completedQuantity = completedQuantity;
    }


    /**
     * Gets the setupTime value for this ManufacturingOperationTask.
     * 
     * @return setupTime
     */
    public java.lang.Double getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingOperationTask.
     * 
     * @param setupTime
     */
    public void setSetupTime(java.lang.Double setupTime) {
        this.setupTime = setupTime;
    }


    /**
     * Gets the runRate value for this ManufacturingOperationTask.
     * 
     * @return runRate
     */
    public java.lang.Double getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingOperationTask.
     * 
     * @param runRate
     */
    public void setRunRate(java.lang.Double runRate) {
        this.runRate = runRate;
    }


    /**
     * Gets the startDate value for this ManufacturingOperationTask.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ManufacturingOperationTask.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ManufacturingOperationTask.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ManufacturingOperationTask.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the autoCalculateLag value for this ManufacturingOperationTask.
     * 
     * @return autoCalculateLag
     */
    public java.lang.Boolean getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this ManufacturingOperationTask.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(java.lang.Boolean autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }


    /**
     * Gets the machineResources value for this ManufacturingOperationTask.
     * 
     * @return machineResources
     */
    public java.lang.Long getMachineResources() {
        return machineResources;
    }


    /**
     * Sets the machineResources value for this ManufacturingOperationTask.
     * 
     * @param machineResources
     */
    public void setMachineResources(java.lang.Long machineResources) {
        this.machineResources = machineResources;
    }


    /**
     * Gets the laborResources value for this ManufacturingOperationTask.
     * 
     * @return laborResources
     */
    public java.lang.Long getLaborResources() {
        return laborResources;
    }


    /**
     * Sets the laborResources value for this ManufacturingOperationTask.
     * 
     * @param laborResources
     */
    public void setLaborResources(java.lang.Long laborResources) {
        this.laborResources = laborResources;
    }


    /**
     * Gets the costDetailList value for this ManufacturingOperationTask.
     * 
     * @return costDetailList
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetailList getCostDetailList() {
        return costDetailList;
    }


    /**
     * Sets the costDetailList value for this ManufacturingOperationTask.
     * 
     * @param costDetailList
     */
    public void setCostDetailList(com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingCostDetailList costDetailList) {
        this.costDetailList = costDetailList;
    }


    /**
     * Gets the predecessorList value for this ManufacturingOperationTask.
     * 
     * @return predecessorList
     */
    public com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }


    /**
     * Sets the predecessorList value for this ManufacturingOperationTask.
     * 
     * @param predecessorList
     */
    public void setPredecessorList(com.netsuite.webservices.lists.supplychain_2019_1.ManufacturingOperationTaskPredecessorList predecessorList) {
        this.predecessorList = predecessorList;
    }


    /**
     * Gets the customFieldList value for this ManufacturingOperationTask.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ManufacturingOperationTask.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ManufacturingOperationTask.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ManufacturingOperationTask.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ManufacturingOperationTask.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ManufacturingOperationTask.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingOperationTask)) return false;
        ManufacturingOperationTask other = (ManufacturingOperationTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.operationSequence==null && other.getOperationSequence()==null) || 
             (this.operationSequence!=null &&
              this.operationSequence.equals(other.getOperationSequence()))) &&
            ((this.workOrder==null && other.getWorkOrder()==null) || 
             (this.workOrder!=null &&
              this.workOrder.equals(other.getWorkOrder()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              this.actualWork.equals(other.getActualWork()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              this.remainingWork.equals(other.getRemainingWork()))) &&
            ((this.inputQuantity==null && other.getInputQuantity()==null) || 
             (this.inputQuantity!=null &&
              this.inputQuantity.equals(other.getInputQuantity()))) &&
            ((this.completedQuantity==null && other.getCompletedQuantity()==null) || 
             (this.completedQuantity!=null &&
              this.completedQuantity.equals(other.getCompletedQuantity()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              this.setupTime.equals(other.getSetupTime()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              this.runRate.equals(other.getRunRate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.autoCalculateLag==null && other.getAutoCalculateLag()==null) || 
             (this.autoCalculateLag!=null &&
              this.autoCalculateLag.equals(other.getAutoCalculateLag()))) &&
            ((this.machineResources==null && other.getMachineResources()==null) || 
             (this.machineResources!=null &&
              this.machineResources.equals(other.getMachineResources()))) &&
            ((this.laborResources==null && other.getLaborResources()==null) || 
             (this.laborResources!=null &&
              this.laborResources.equals(other.getLaborResources()))) &&
            ((this.costDetailList==null && other.getCostDetailList()==null) || 
             (this.costDetailList!=null &&
              this.costDetailList.equals(other.getCostDetailList()))) &&
            ((this.predecessorList==null && other.getPredecessorList()==null) || 
             (this.predecessorList!=null &&
              this.predecessorList.equals(other.getPredecessorList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getManufacturingWorkCenter() != null) {
            _hashCode += getManufacturingWorkCenter().hashCode();
        }
        if (getManufacturingCostTemplate() != null) {
            _hashCode += getManufacturingCostTemplate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getOperationSequence() != null) {
            _hashCode += getOperationSequence().hashCode();
        }
        if (getWorkOrder() != null) {
            _hashCode += getWorkOrder().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getActualWork() != null) {
            _hashCode += getActualWork().hashCode();
        }
        if (getRemainingWork() != null) {
            _hashCode += getRemainingWork().hashCode();
        }
        if (getInputQuantity() != null) {
            _hashCode += getInputQuantity().hashCode();
        }
        if (getCompletedQuantity() != null) {
            _hashCode += getCompletedQuantity().hashCode();
        }
        if (getSetupTime() != null) {
            _hashCode += getSetupTime().hashCode();
        }
        if (getRunRate() != null) {
            _hashCode += getRunRate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAutoCalculateLag() != null) {
            _hashCode += getAutoCalculateLag().hashCode();
        }
        if (getMachineResources() != null) {
            _hashCode += getMachineResources().hashCode();
        }
        if (getLaborResources() != null) {
            _hashCode += getLaborResources().hashCode();
        }
        if (getCostDetailList() != null) {
            _hashCode += getCostDetailList().hashCode();
        }
        if (getPredecessorList() != null) {
            _hashCode += getPredecessorList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingOperationTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTask"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "operationSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "workOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("costDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "costDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingCostDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "predecessorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
