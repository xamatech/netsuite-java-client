/**
 * BillingScheduleMilestone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class BillingScheduleMilestone  implements java.io.Serializable {
    private java.lang.Long milestoneId;

    private java.lang.Double milestoneAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef milestoneTerms;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef projectTask;

    private java.util.Calendar milestoneDate;

    private java.lang.Boolean milestoneCompleted;

    private java.util.Calendar milestoneActualCompletionDate;

    private java.lang.String comments;

    public BillingScheduleMilestone() {
    }

    public BillingScheduleMilestone(
           java.lang.Long milestoneId,
           java.lang.Double milestoneAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef milestoneTerms,
           com.netsuite.webservices.platform.core_2019_1.RecordRef projectTask,
           java.util.Calendar milestoneDate,
           java.lang.Boolean milestoneCompleted,
           java.util.Calendar milestoneActualCompletionDate,
           java.lang.String comments) {
           this.milestoneId = milestoneId;
           this.milestoneAmount = milestoneAmount;
           this.milestoneTerms = milestoneTerms;
           this.projectTask = projectTask;
           this.milestoneDate = milestoneDate;
           this.milestoneCompleted = milestoneCompleted;
           this.milestoneActualCompletionDate = milestoneActualCompletionDate;
           this.comments = comments;
    }


    /**
     * Gets the milestoneId value for this BillingScheduleMilestone.
     * 
     * @return milestoneId
     */
    public java.lang.Long getMilestoneId() {
        return milestoneId;
    }


    /**
     * Sets the milestoneId value for this BillingScheduleMilestone.
     * 
     * @param milestoneId
     */
    public void setMilestoneId(java.lang.Long milestoneId) {
        this.milestoneId = milestoneId;
    }


    /**
     * Gets the milestoneAmount value for this BillingScheduleMilestone.
     * 
     * @return milestoneAmount
     */
    public java.lang.Double getMilestoneAmount() {
        return milestoneAmount;
    }


    /**
     * Sets the milestoneAmount value for this BillingScheduleMilestone.
     * 
     * @param milestoneAmount
     */
    public void setMilestoneAmount(java.lang.Double milestoneAmount) {
        this.milestoneAmount = milestoneAmount;
    }


    /**
     * Gets the milestoneTerms value for this BillingScheduleMilestone.
     * 
     * @return milestoneTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMilestoneTerms() {
        return milestoneTerms;
    }


    /**
     * Sets the milestoneTerms value for this BillingScheduleMilestone.
     * 
     * @param milestoneTerms
     */
    public void setMilestoneTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef milestoneTerms) {
        this.milestoneTerms = milestoneTerms;
    }


    /**
     * Gets the projectTask value for this BillingScheduleMilestone.
     * 
     * @return projectTask
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getProjectTask() {
        return projectTask;
    }


    /**
     * Sets the projectTask value for this BillingScheduleMilestone.
     * 
     * @param projectTask
     */
    public void setProjectTask(com.netsuite.webservices.platform.core_2019_1.RecordRef projectTask) {
        this.projectTask = projectTask;
    }


    /**
     * Gets the milestoneDate value for this BillingScheduleMilestone.
     * 
     * @return milestoneDate
     */
    public java.util.Calendar getMilestoneDate() {
        return milestoneDate;
    }


    /**
     * Sets the milestoneDate value for this BillingScheduleMilestone.
     * 
     * @param milestoneDate
     */
    public void setMilestoneDate(java.util.Calendar milestoneDate) {
        this.milestoneDate = milestoneDate;
    }


    /**
     * Gets the milestoneCompleted value for this BillingScheduleMilestone.
     * 
     * @return milestoneCompleted
     */
    public java.lang.Boolean getMilestoneCompleted() {
        return milestoneCompleted;
    }


    /**
     * Sets the milestoneCompleted value for this BillingScheduleMilestone.
     * 
     * @param milestoneCompleted
     */
    public void setMilestoneCompleted(java.lang.Boolean milestoneCompleted) {
        this.milestoneCompleted = milestoneCompleted;
    }


    /**
     * Gets the milestoneActualCompletionDate value for this BillingScheduleMilestone.
     * 
     * @return milestoneActualCompletionDate
     */
    public java.util.Calendar getMilestoneActualCompletionDate() {
        return milestoneActualCompletionDate;
    }


    /**
     * Sets the milestoneActualCompletionDate value for this BillingScheduleMilestone.
     * 
     * @param milestoneActualCompletionDate
     */
    public void setMilestoneActualCompletionDate(java.util.Calendar milestoneActualCompletionDate) {
        this.milestoneActualCompletionDate = milestoneActualCompletionDate;
    }


    /**
     * Gets the comments value for this BillingScheduleMilestone.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this BillingScheduleMilestone.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingScheduleMilestone)) return false;
        BillingScheduleMilestone other = (BillingScheduleMilestone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.milestoneId==null && other.getMilestoneId()==null) || 
             (this.milestoneId!=null &&
              this.milestoneId.equals(other.getMilestoneId()))) &&
            ((this.milestoneAmount==null && other.getMilestoneAmount()==null) || 
             (this.milestoneAmount!=null &&
              this.milestoneAmount.equals(other.getMilestoneAmount()))) &&
            ((this.milestoneTerms==null && other.getMilestoneTerms()==null) || 
             (this.milestoneTerms!=null &&
              this.milestoneTerms.equals(other.getMilestoneTerms()))) &&
            ((this.projectTask==null && other.getProjectTask()==null) || 
             (this.projectTask!=null &&
              this.projectTask.equals(other.getProjectTask()))) &&
            ((this.milestoneDate==null && other.getMilestoneDate()==null) || 
             (this.milestoneDate!=null &&
              this.milestoneDate.equals(other.getMilestoneDate()))) &&
            ((this.milestoneCompleted==null && other.getMilestoneCompleted()==null) || 
             (this.milestoneCompleted!=null &&
              this.milestoneCompleted.equals(other.getMilestoneCompleted()))) &&
            ((this.milestoneActualCompletionDate==null && other.getMilestoneActualCompletionDate()==null) || 
             (this.milestoneActualCompletionDate!=null &&
              this.milestoneActualCompletionDate.equals(other.getMilestoneActualCompletionDate()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getMilestoneId() != null) {
            _hashCode += getMilestoneId().hashCode();
        }
        if (getMilestoneAmount() != null) {
            _hashCode += getMilestoneAmount().hashCode();
        }
        if (getMilestoneTerms() != null) {
            _hashCode += getMilestoneTerms().hashCode();
        }
        if (getProjectTask() != null) {
            _hashCode += getProjectTask().hashCode();
        }
        if (getMilestoneDate() != null) {
            _hashCode += getMilestoneDate().hashCode();
        }
        if (getMilestoneCompleted() != null) {
            _hashCode += getMilestoneCompleted().hashCode();
        }
        if (getMilestoneActualCompletionDate() != null) {
            _hashCode += getMilestoneActualCompletionDate().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingScheduleMilestone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BillingScheduleMilestone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneActualCompletionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "milestoneActualCompletionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "comments"));
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
