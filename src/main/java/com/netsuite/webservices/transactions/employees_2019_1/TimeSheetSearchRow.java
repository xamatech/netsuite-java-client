/**
 * TimeSheetSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class TimeSheetSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeBillJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic timeEntryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public TimeSheetSearchRow() {
    }

    public TimeSheetSearchRow(
           com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeBillJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic timeEntryJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.employeeJoin = employeeJoin;
        this.timeBillJoin = timeBillJoin;
        this.timeEntryJoin = timeEntryJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this TimeSheetSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TimeSheetSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.TimeSheetSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the employeeJoin value for this TimeSheetSearchRow.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this TimeSheetSearchRow.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the timeBillJoin value for this TimeSheetSearchRow.
     * 
     * @return timeBillJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic getTimeBillJoin() {
        return timeBillJoin;
    }


    /**
     * Sets the timeBillJoin value for this TimeSheetSearchRow.
     * 
     * @param timeBillJoin
     */
    public void setTimeBillJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeBillJoin) {
        this.timeBillJoin = timeBillJoin;
    }


    /**
     * Gets the timeEntryJoin value for this TimeSheetSearchRow.
     * 
     * @return timeEntryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic getTimeEntryJoin() {
        return timeEntryJoin;
    }


    /**
     * Sets the timeEntryJoin value for this TimeSheetSearchRow.
     * 
     * @param timeEntryJoin
     */
    public void setTimeEntryJoin(com.netsuite.webservices.platform.common_2019_1.TimeEntrySearchRowBasic timeEntryJoin) {
        this.timeEntryJoin = timeEntryJoin;
    }


    /**
     * Gets the customSearchJoin value for this TimeSheetSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this TimeSheetSearchRow.
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
        if (!(obj instanceof TimeSheetSearchRow)) return false;
        TimeSheetSearchRow other = (TimeSheetSearchRow) obj;
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
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.timeBillJoin==null && other.getTimeBillJoin()==null) || 
             (this.timeBillJoin!=null &&
              this.timeBillJoin.equals(other.getTimeBillJoin()))) &&
            ((this.timeEntryJoin==null && other.getTimeEntryJoin()==null) || 
             (this.timeEntryJoin!=null &&
              this.timeEntryJoin.equals(other.getTimeEntryJoin()))) &&
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
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getTimeBillJoin() != null) {
            _hashCode += getTimeBillJoin().hashCode();
        }
        if (getTimeEntryJoin() != null) {
            _hashCode += getTimeEntryJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(TimeSheetSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeSheetSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeSheetSearchRowBasic"));
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
        elemField.setFieldName("timeBillJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "timeBillJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeEntryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "timeEntryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeEntrySearchRowBasic"));
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
