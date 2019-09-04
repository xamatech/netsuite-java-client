/**
 * TimeSheetTimeGrid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class TimeSheetTimeGrid  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry sunday;

    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry monday;

    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry tuesday;

    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry wednesday;

    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry thursday;

    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry friday;

    private com.netsuite.webservices.transactions.employees_2019_1.TimeEntry saturday;

    public TimeSheetTimeGrid() {
    }

    public TimeSheetTimeGrid(
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry sunday,
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry monday,
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry tuesday,
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry wednesday,
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry thursday,
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry friday,
           com.netsuite.webservices.transactions.employees_2019_1.TimeEntry saturday) {
           this.sunday = sunday;
           this.monday = monday;
           this.tuesday = tuesday;
           this.wednesday = wednesday;
           this.thursday = thursday;
           this.friday = friday;
           this.saturday = saturday;
    }


    /**
     * Gets the sunday value for this TimeSheetTimeGrid.
     * 
     * @return sunday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getSunday() {
        return sunday;
    }


    /**
     * Sets the sunday value for this TimeSheetTimeGrid.
     * 
     * @param sunday
     */
    public void setSunday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry sunday) {
        this.sunday = sunday;
    }


    /**
     * Gets the monday value for this TimeSheetTimeGrid.
     * 
     * @return monday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getMonday() {
        return monday;
    }


    /**
     * Sets the monday value for this TimeSheetTimeGrid.
     * 
     * @param monday
     */
    public void setMonday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry monday) {
        this.monday = monday;
    }


    /**
     * Gets the tuesday value for this TimeSheetTimeGrid.
     * 
     * @return tuesday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getTuesday() {
        return tuesday;
    }


    /**
     * Sets the tuesday value for this TimeSheetTimeGrid.
     * 
     * @param tuesday
     */
    public void setTuesday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry tuesday) {
        this.tuesday = tuesday;
    }


    /**
     * Gets the wednesday value for this TimeSheetTimeGrid.
     * 
     * @return wednesday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getWednesday() {
        return wednesday;
    }


    /**
     * Sets the wednesday value for this TimeSheetTimeGrid.
     * 
     * @param wednesday
     */
    public void setWednesday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry wednesday) {
        this.wednesday = wednesday;
    }


    /**
     * Gets the thursday value for this TimeSheetTimeGrid.
     * 
     * @return thursday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getThursday() {
        return thursday;
    }


    /**
     * Sets the thursday value for this TimeSheetTimeGrid.
     * 
     * @param thursday
     */
    public void setThursday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry thursday) {
        this.thursday = thursday;
    }


    /**
     * Gets the friday value for this TimeSheetTimeGrid.
     * 
     * @return friday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getFriday() {
        return friday;
    }


    /**
     * Sets the friday value for this TimeSheetTimeGrid.
     * 
     * @param friday
     */
    public void setFriday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry friday) {
        this.friday = friday;
    }


    /**
     * Gets the saturday value for this TimeSheetTimeGrid.
     * 
     * @return saturday
     */
    public com.netsuite.webservices.transactions.employees_2019_1.TimeEntry getSaturday() {
        return saturday;
    }


    /**
     * Sets the saturday value for this TimeSheetTimeGrid.
     * 
     * @param saturday
     */
    public void setSaturday(com.netsuite.webservices.transactions.employees_2019_1.TimeEntry saturday) {
        this.saturday = saturday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeSheetTimeGrid)) return false;
        TimeSheetTimeGrid other = (TimeSheetTimeGrid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sunday==null && other.getSunday()==null) || 
             (this.sunday!=null &&
              this.sunday.equals(other.getSunday()))) &&
            ((this.monday==null && other.getMonday()==null) || 
             (this.monday!=null &&
              this.monday.equals(other.getMonday()))) &&
            ((this.tuesday==null && other.getTuesday()==null) || 
             (this.tuesday!=null &&
              this.tuesday.equals(other.getTuesday()))) &&
            ((this.wednesday==null && other.getWednesday()==null) || 
             (this.wednesday!=null &&
              this.wednesday.equals(other.getWednesday()))) &&
            ((this.thursday==null && other.getThursday()==null) || 
             (this.thursday!=null &&
              this.thursday.equals(other.getThursday()))) &&
            ((this.friday==null && other.getFriday()==null) || 
             (this.friday!=null &&
              this.friday.equals(other.getFriday()))) &&
            ((this.saturday==null && other.getSaturday()==null) || 
             (this.saturday!=null &&
              this.saturday.equals(other.getSaturday())));
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
        if (getSunday() != null) {
            _hashCode += getSunday().hashCode();
        }
        if (getMonday() != null) {
            _hashCode += getMonday().hashCode();
        }
        if (getTuesday() != null) {
            _hashCode += getTuesday().hashCode();
        }
        if (getWednesday() != null) {
            _hashCode += getWednesday().hashCode();
        }
        if (getThursday() != null) {
            _hashCode += getThursday().hashCode();
        }
        if (getFriday() != null) {
            _hashCode += getFriday().hashCode();
        }
        if (getSaturday() != null) {
            _hashCode += getSaturday().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeSheetTimeGrid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeSheetTimeGrid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "sunday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "monday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "tuesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "wednesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "thursday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "friday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "saturday"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "TimeEntry"));
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
