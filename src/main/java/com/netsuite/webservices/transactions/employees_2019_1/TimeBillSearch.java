/**
 * TimeBillSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class TimeBillSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ChargeSearchBasic chargeJoin;

    private com.netsuite.webservices.platform.common_2019_1.ClassificationSearchBasic classJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.DepartmentSearchBasic departmentJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.LocationSearchBasic locationJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic projectTaskJoin;

    private com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin;

    private com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchBasic timeSheetJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public TimeBillSearch() {
    }

    public TimeBillSearch(
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ChargeSearchBasic chargeJoin,
           com.netsuite.webservices.platform.common_2019_1.ClassificationSearchBasic classJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.DepartmentSearchBasic departmentJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.LocationSearchBasic locationJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic projectTaskJoin,
           com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin,
           com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchBasic timeSheetJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.callJoin = callJoin;
        this.caseJoin = caseJoin;
        this.chargeJoin = chargeJoin;
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
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
        this.timeSheetJoin = timeSheetJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this TimeBillSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TimeBillSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the callJoin value for this TimeBillSearch.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this TimeBillSearch.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the caseJoin value for this TimeBillSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this TimeBillSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the chargeJoin value for this TimeBillSearch.
     * 
     * @return chargeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ChargeSearchBasic getChargeJoin() {
        return chargeJoin;
    }


    /**
     * Sets the chargeJoin value for this TimeBillSearch.
     * 
     * @param chargeJoin
     */
    public void setChargeJoin(com.netsuite.webservices.platform.common_2019_1.ChargeSearchBasic chargeJoin) {
        this.chargeJoin = chargeJoin;
    }


    /**
     * Gets the classJoin value for this TimeBillSearch.
     * 
     * @return classJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ClassificationSearchBasic getClassJoin() {
        return classJoin;
    }


    /**
     * Sets the classJoin value for this TimeBillSearch.
     * 
     * @param classJoin
     */
    public void setClassJoin(com.netsuite.webservices.platform.common_2019_1.ClassificationSearchBasic classJoin) {
        this.classJoin = classJoin;
    }


    /**
     * Gets the customerJoin value for this TimeBillSearch.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this TimeBillSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the departmentJoin value for this TimeBillSearch.
     * 
     * @return departmentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.DepartmentSearchBasic getDepartmentJoin() {
        return departmentJoin;
    }


    /**
     * Sets the departmentJoin value for this TimeBillSearch.
     * 
     * @param departmentJoin
     */
    public void setDepartmentJoin(com.netsuite.webservices.platform.common_2019_1.DepartmentSearchBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }


    /**
     * Gets the employeeJoin value for this TimeBillSearch.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this TimeBillSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the eventJoin value for this TimeBillSearch.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this TimeBillSearch.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the itemJoin value for this TimeBillSearch.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this TimeBillSearch.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the jobJoin value for this TimeBillSearch.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this TimeBillSearch.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the locationJoin value for this TimeBillSearch.
     * 
     * @return locationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this TimeBillSearch.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(com.netsuite.webservices.platform.common_2019_1.LocationSearchBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the projectTaskJoin value for this TimeBillSearch.
     * 
     * @return projectTaskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }


    /**
     * Sets the projectTaskJoin value for this TimeBillSearch.
     * 
     * @param projectTaskJoin
     */
    public void setProjectTaskJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskSearchBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }


    /**
     * Gets the projectTaskAssignmentJoin value for this TimeBillSearch.
     * 
     * @return projectTaskAssignmentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }


    /**
     * Sets the projectTaskAssignmentJoin value for this TimeBillSearch.
     * 
     * @param projectTaskAssignmentJoin
     */
    public void setProjectTaskAssignmentJoin(com.netsuite.webservices.platform.common_2019_1.ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin) {
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
    }


    /**
     * Gets the resourceAllocationJoin value for this TimeBillSearch.
     * 
     * @return resourceAllocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }


    /**
     * Sets the resourceAllocationJoin value for this TimeBillSearch.
     * 
     * @param resourceAllocationJoin
     */
    public void setResourceAllocationJoin(com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }


    /**
     * Gets the taskJoin value for this TimeBillSearch.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this TimeBillSearch.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the userJoin value for this TimeBillSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this TimeBillSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the vendorJoin value for this TimeBillSearch.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this TimeBillSearch.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the timeSheetJoin value for this TimeBillSearch.
     * 
     * @return timeSheetJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchBasic getTimeSheetJoin() {
        return timeSheetJoin;
    }


    /**
     * Sets the timeSheetJoin value for this TimeBillSearch.
     * 
     * @param timeSheetJoin
     */
    public void setTimeSheetJoin(com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchBasic timeSheetJoin) {
        this.timeSheetJoin = timeSheetJoin;
    }


    /**
     * Gets the customSearchJoin value for this TimeBillSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this TimeBillSearch.
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
        if (!(obj instanceof TimeBillSearch)) return false;
        TimeBillSearch other = (TimeBillSearch) obj;
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
            ((this.chargeJoin==null && other.getChargeJoin()==null) || 
             (this.chargeJoin!=null &&
              this.chargeJoin.equals(other.getChargeJoin()))) &&
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
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
            ((this.timeSheetJoin==null && other.getTimeSheetJoin()==null) || 
             (this.timeSheetJoin!=null &&
              this.timeSheetJoin.equals(other.getTimeSheetJoin()))) &&
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
        if (getChargeJoin() != null) {
            _hashCode += getChargeJoin().hashCode();
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
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        if (getTimeSheetJoin() != null) {
            _hashCode += getTimeSheetJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(TimeBillSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeBillSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "chargeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ChargeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ClassificationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "DepartmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskAssignmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "projectTaskAssignmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSheetJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "timeSheetJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeSheetSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "customSearchJoin"));
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
