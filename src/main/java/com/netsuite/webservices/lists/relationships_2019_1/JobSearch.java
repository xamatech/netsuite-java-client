/**
 * JobSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic billingAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic billingScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic projectTaskJoin;

    private com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public JobSearch() {
    }

    public JobSearch(
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic billingAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic billingScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic projectTaskJoin,
           com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.billingAccountJoin = billingAccountJoin;
        this.billingScheduleJoin = billingScheduleJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.customerJoin = customerJoin;
        this.projectTaskJoin = projectTaskJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.taskJoin = taskJoin;
        this.timeJoin = timeJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this JobSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this JobSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the billingAccountJoin value for this JobSearch.
     * 
     * @return billingAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }


    /**
     * Sets the billingAccountJoin value for this JobSearch.
     * 
     * @param billingAccountJoin
     */
    public void setBillingAccountJoin(com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic billingAccountJoin) {
        this.billingAccountJoin = billingAccountJoin;
    }


    /**
     * Gets the billingScheduleJoin value for this JobSearch.
     * 
     * @return billingScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }


    /**
     * Sets the billingScheduleJoin value for this JobSearch.
     * 
     * @param billingScheduleJoin
     */
    public void setBillingScheduleJoin(com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic billingScheduleJoin) {
        this.billingScheduleJoin = billingScheduleJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this JobSearch.
     * 
     * @return contactPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this JobSearch.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the customerJoin value for this JobSearch.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this JobSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the projectTaskJoin value for this JobSearch.
     * 
     * @return projectTaskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }


    /**
     * Sets the projectTaskJoin value for this JobSearch.
     * 
     * @param projectTaskJoin
     */
    public void setProjectTaskJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }


    /**
     * Gets the resourceAllocationJoin value for this JobSearch.
     * 
     * @return resourceAllocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }


    /**
     * Sets the resourceAllocationJoin value for this JobSearch.
     * 
     * @param resourceAllocationJoin
     */
    public void setResourceAllocationJoin(com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }


    /**
     * Gets the taskJoin value for this JobSearch.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this JobSearch.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the timeJoin value for this JobSearch.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this JobSearch.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the customSearchJoin value for this JobSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this JobSearch.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSearch)) return false;
        JobSearch other = (JobSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.billingAccountJoin==null && other.getBillingAccountJoin()==null) || 
             (this.billingAccountJoin!=null &&
              this.billingAccountJoin.equals(other.getBillingAccountJoin()))) &&
            ((this.billingScheduleJoin==null && other.getBillingScheduleJoin()==null) || 
             (this.billingScheduleJoin!=null &&
              this.billingScheduleJoin.equals(other.getBillingScheduleJoin()))) &&
            ((this.contactPrimaryJoin==null && other.getContactPrimaryJoin()==null) || 
             (this.contactPrimaryJoin!=null &&
              this.contactPrimaryJoin.equals(other.getContactPrimaryJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.projectTaskJoin==null && other.getProjectTaskJoin()==null) || 
             (this.projectTaskJoin!=null &&
              this.projectTaskJoin.equals(other.getProjectTaskJoin()))) &&
            ((this.resourceAllocationJoin==null && other.getResourceAllocationJoin()==null) || 
             (this.resourceAllocationJoin!=null &&
              this.resourceAllocationJoin.equals(other.getResourceAllocationJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getBillingAccountJoin() != null) {
            _hashCode += getBillingAccountJoin().hashCode();
        }
        if (getBillingScheduleJoin() != null) {
            _hashCode += getBillingScheduleJoin().hashCode();
        }
        if (getContactPrimaryJoin() != null) {
            _hashCode += getContactPrimaryJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getProjectTaskJoin() != null) {
            _hashCode += getProjectTaskJoin().hashCode();
        }
        if (getResourceAllocationJoin() != null) {
            _hashCode += getResourceAllocationJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
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
