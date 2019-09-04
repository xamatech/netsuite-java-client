/**
 * ProjectTaskSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2019_1;

public class ProjectTaskSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic predecessorJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin;

    private com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic successorJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public ProjectTaskSearch() {
    }

    public ProjectTaskSearch(
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic predecessorJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin,
           com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic successorJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.jobJoin = jobJoin;
        this.predecessorJoin = predecessorJoin;
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.successorJoin = successorJoin;
        this.timeJoin = timeJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ProjectTaskSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ProjectTaskSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the jobJoin value for this ProjectTaskSearch.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this ProjectTaskSearch.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the predecessorJoin value for this ProjectTaskSearch.
     * 
     * @return predecessorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic getPredecessorJoin() {
        return predecessorJoin;
    }


    /**
     * Sets the predecessorJoin value for this ProjectTaskSearch.
     * 
     * @param predecessorJoin
     */
    public void setPredecessorJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic predecessorJoin) {
        this.predecessorJoin = predecessorJoin;
    }


    /**
     * Gets the projectTaskAssignmentJoin value for this ProjectTaskSearch.
     * 
     * @return projectTaskAssignmentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }


    /**
     * Sets the projectTaskAssignmentJoin value for this ProjectTaskSearch.
     * 
     * @param projectTaskAssignmentJoin
     */
    public void setProjectTaskAssignmentJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin) {
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
    }


    /**
     * Gets the resourceAllocationJoin value for this ProjectTaskSearch.
     * 
     * @return resourceAllocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }


    /**
     * Sets the resourceAllocationJoin value for this ProjectTaskSearch.
     * 
     * @param resourceAllocationJoin
     */
    public void setResourceAllocationJoin(com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }


    /**
     * Gets the successorJoin value for this ProjectTaskSearch.
     * 
     * @return successorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic getSuccessorJoin() {
        return successorJoin;
    }


    /**
     * Sets the successorJoin value for this ProjectTaskSearch.
     * 
     * @param successorJoin
     */
    public void setSuccessorJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic successorJoin) {
        this.successorJoin = successorJoin;
    }


    /**
     * Gets the timeJoin value for this ProjectTaskSearch.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this ProjectTaskSearch.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the transactionJoin value for this ProjectTaskSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ProjectTaskSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this ProjectTaskSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ProjectTaskSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this ProjectTaskSearch.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this ProjectTaskSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the customSearchJoin value for this ProjectTaskSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ProjectTaskSearch.
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
        if (!(obj instanceof ProjectTaskSearch)) return false;
        ProjectTaskSearch other = (ProjectTaskSearch) obj;
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
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.predecessorJoin==null && other.getPredecessorJoin()==null) || 
             (this.predecessorJoin!=null &&
              this.predecessorJoin.equals(other.getPredecessorJoin()))) &&
            ((this.projectTaskAssignmentJoin==null && other.getProjectTaskAssignmentJoin()==null) || 
             (this.projectTaskAssignmentJoin!=null &&
              this.projectTaskAssignmentJoin.equals(other.getProjectTaskAssignmentJoin()))) &&
            ((this.resourceAllocationJoin==null && other.getResourceAllocationJoin()==null) || 
             (this.resourceAllocationJoin!=null &&
              this.resourceAllocationJoin.equals(other.getResourceAllocationJoin()))) &&
            ((this.successorJoin==null && other.getSuccessorJoin()==null) || 
             (this.successorJoin!=null &&
              this.successorJoin.equals(other.getSuccessorJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
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
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getPredecessorJoin() != null) {
            _hashCode += getPredecessorJoin().hashCode();
        }
        if (getProjectTaskAssignmentJoin() != null) {
            _hashCode += getProjectTaskAssignmentJoin().hashCode();
        }
        if (getResourceAllocationJoin() != null) {
            _hashCode += getResourceAllocationJoin().hashCode();
        }
        if (getSuccessorJoin() != null) {
            _hashCode += getSuccessorJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProjectTaskSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "ProjectTaskSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "predecessorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskAssignmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "projectTaskAssignmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "successorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2019_1.activities.webservices.netsuite.com", "customSearchJoin"));
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
