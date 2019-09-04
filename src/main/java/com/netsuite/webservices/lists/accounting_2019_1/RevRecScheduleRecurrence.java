/**
 * RevRecScheduleRecurrence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class RevRecScheduleRecurrence  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef incomeaccount;

    private java.lang.Long periodOffset;

    private java.lang.String recamount;

    public RevRecScheduleRecurrence() {
    }

    public RevRecScheduleRecurrence(
           com.netsuite.webservices.platform.core_2019_1.RecordRef incomeaccount,
           java.lang.Long periodOffset,
           java.lang.String recamount) {
           this.incomeaccount = incomeaccount;
           this.periodOffset = periodOffset;
           this.recamount = recamount;
    }


    /**
     * Gets the incomeaccount value for this RevRecScheduleRecurrence.
     * 
     * @return incomeaccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIncomeaccount() {
        return incomeaccount;
    }


    /**
     * Sets the incomeaccount value for this RevRecScheduleRecurrence.
     * 
     * @param incomeaccount
     */
    public void setIncomeaccount(com.netsuite.webservices.platform.core_2019_1.RecordRef incomeaccount) {
        this.incomeaccount = incomeaccount;
    }


    /**
     * Gets the periodOffset value for this RevRecScheduleRecurrence.
     * 
     * @return periodOffset
     */
    public java.lang.Long getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecScheduleRecurrence.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(java.lang.Long periodOffset) {
        this.periodOffset = periodOffset;
    }


    /**
     * Gets the recamount value for this RevRecScheduleRecurrence.
     * 
     * @return recamount
     */
    public java.lang.String getRecamount() {
        return recamount;
    }


    /**
     * Sets the recamount value for this RevRecScheduleRecurrence.
     * 
     * @param recamount
     */
    public void setRecamount(java.lang.String recamount) {
        this.recamount = recamount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecScheduleRecurrence)) return false;
        RevRecScheduleRecurrence other = (RevRecScheduleRecurrence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.incomeaccount==null && other.getIncomeaccount()==null) || 
             (this.incomeaccount!=null &&
              this.incomeaccount.equals(other.getIncomeaccount()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              this.periodOffset.equals(other.getPeriodOffset()))) &&
            ((this.recamount==null && other.getRecamount()==null) || 
             (this.recamount!=null &&
              this.recamount.equals(other.getRecamount())));
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
        if (getIncomeaccount() != null) {
            _hashCode += getIncomeaccount().hashCode();
        }
        if (getPeriodOffset() != null) {
            _hashCode += getPeriodOffset().hashCode();
        }
        if (getRecamount() != null) {
            _hashCode += getRecamount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevRecScheduleRecurrence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "incomeaccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recamount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recamount"));
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
