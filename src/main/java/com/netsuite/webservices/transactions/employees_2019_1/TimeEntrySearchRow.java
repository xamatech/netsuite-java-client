/**
 * TimeEntrySearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class TimeEntrySearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic classJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic departmentJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic locationJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic projectTaskJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin;

    private com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic resourceAllocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic timeSheetJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public TimeEntrySearchRow() {
    }

    public TimeEntrySearchRow(
           com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic classJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic departmentJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic locationJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic projectTaskJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin,
           com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic resourceAllocationJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic timeSheetJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.callJoin = callJoin;
        this.caseJoin = caseJoin;
        this.classJoin = classJoin;
        this.customerJoin = customerJoin;
        this.departmentJoin = departmentJoin;
        this.employeeJoin = employeeJoin;
        this.eventJoin = eventJoin;
        this.itemJoin = itemJoin;
        this.jobJoin = jobJoin;
        this.locationJoin = locationJoin;
        this.projectTaskJoin = projectTaskJoin;
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.taskJoin = taskJoin;
        this.timeSheetJoin = timeSheetJoin;
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this TimeEntrySearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TimeEntrySearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the callJoin value for this TimeEntrySearchRow.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this TimeEntrySearchRow.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the caseJoin value for this TimeEntrySearchRow.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this TimeEntrySearchRow.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the classJoin value for this TimeEntrySearchRow.
     * 
     * @return classJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }


    /**
     * Sets the classJoin value for this TimeEntrySearchRow.
     * 
     * @param classJoin
     */
    public void setClassJoin(com.netsuite.webservices.platform.common_2019_1.ClassificationSearchRowBasic classJoin) {
        this.classJoin = classJoin;
    }


    /**
     * Gets the customerJoin value for this TimeEntrySearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this TimeEntrySearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the departmentJoin value for this TimeEntrySearchRow.
     * 
     * @return departmentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }


    /**
     * Sets the departmentJoin value for this TimeEntrySearchRow.
     * 
     * @param departmentJoin
     */
    public void setDepartmentJoin(com.netsuite.webservices.platform.common_2019_1.DepartmentSearchRowBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }


    /**
     * Gets the employeeJoin value for this TimeEntrySearchRow.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this TimeEntrySearchRow.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the eventJoin value for this TimeEntrySearchRow.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this TimeEntrySearchRow.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the itemJoin value for this TimeEntrySearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this TimeEntrySearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the jobJoin value for this TimeEntrySearchRow.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this TimeEntrySearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the locationJoin value for this TimeEntrySearchRow.
     * 
     * @return locationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this TimeEntrySearchRow.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the projectTaskJoin value for this TimeEntrySearchRow.
     * 
     * @return projectTaskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }


    /**
     * Sets the projectTaskJoin value for this TimeEntrySearchRow.
     * 
     * @param projectTaskJoin
     */
    public void setProjectTaskJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchRowBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }


    /**
     * Gets the projectTaskAssignmentJoin value for this TimeEntrySearchRow.
     * 
     * @return projectTaskAssignmentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchRowBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }


    /**
     * Sets the projectTaskAssignmentJoin value for this TimeEntrySearchRow.
     * 
     * @param projectTaskAssignmentJoin
     */
    public void setProjectTaskAssignmentJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin) {
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
    }


    /**
     * Gets the resourceAllocationJoin value for this TimeEntrySearchRow.
     * 
     * @return resourceAllocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }


    /**
     * Sets the resourceAllocationJoin value for this TimeEntrySearchRow.
     * 
     * @param resourceAllocationJoin
     */
    public void setResourceAllocationJoin(com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }


    /**
     * Gets the taskJoin value for this TimeEntrySearchRow.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this TimeEntrySearchRow.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the timeSheetJoin value for this TimeEntrySearchRow.
     * 
     * @return timeSheetJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic getTimeSheetJoin() {
        return timeSheetJoin;
    }


    /**
     * Sets the timeSheetJoin value for this TimeEntrySearchRow.
     * 
     * @param timeSheetJoin
     */
    public void setTimeSheetJoin(com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic timeSheetJoin) {
        this.timeSheetJoin = timeSheetJoin;
    }


    /**
     * Gets the userJoin value for this TimeEntrySearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this TimeEntrySearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the vendorJoin value for this TimeEntrySearchRow.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this TimeEntrySearchRow.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the customSearchJoin value for this TimeEntrySearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this TimeEntrySearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeEntrySearchRow)) return false;
        TimeEntrySearchRow other = (TimeEntrySearchRow) obj;
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
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.classJoin==null && other.getClassJoin()==null) || 
             (this.classJoin!=null &&
              this.classJoin.equals(other.getClassJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.departmentJoin==null && other.getDepartmentJoin()==null) || 
             (this.departmentJoin!=null &&
              this.departmentJoin.equals(other.getDepartmentJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.locationJoin==null && other.getLocationJoin()==null) || 
             (this.locationJoin!=null &&
              this.locationJoin.equals(other.getLocationJoin()))) &&
            ((this.projectTaskJoin==null && other.getProjectTaskJoin()==null) || 
             (this.projectTaskJoin!=null &&
              this.projectTaskJoin.equals(other.getProjectTaskJoin()))) &&
            ((this.projectTaskAssignmentJoin==null && other.getProjectTaskAssignmentJoin()==null) || 
             (this.projectTaskAssignmentJoin!=null &&
              this.projectTaskAssignmentJoin.equals(other.getProjectTaskAssignmentJoin()))) &&
            ((this.resourceAllocationJoin==null && other.getResourceAllocationJoin()==null) || 
             (this.resourceAllocationJoin!=null &&
              this.resourceAllocationJoin.equals(other.getResourceAllocationJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.timeSheetJoin==null && other.getTimeSheetJoin()==null) || 
             (this.timeSheetJoin!=null &&
              this.timeSheetJoin.equals(other.getTimeSheetJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
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
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
        }
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getClassJoin() != null) {
            _hashCode += getClassJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getDepartmentJoin() != null) {
            _hashCode += getDepartmentJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getLocationJoin() != null) {
            _hashCode += getLocationJoin().hashCode();
        }
        if (getProjectTaskJoin() != null) {
            _hashCode += getProjectTaskJoin().hashCode();
        }
        if (getProjectTaskAssignmentJoin() != null) {
            _hashCode += getProjectTaskAssignmentJoin().hashCode();
        }
        if (getResourceAllocationJoin() != null) {
            _hashCode += getResourceAllocationJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getTimeSheetJoin() != null) {
            _hashCode += getTimeSheetJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(TimeEntrySearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntrySearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeEntrySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ClassificationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "DepartmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskAssignmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "projectTaskAssignmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSheetJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "timeSheetJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeSheetSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
