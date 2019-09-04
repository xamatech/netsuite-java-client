/**
 * EmployeeDeduction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeDeduction  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem;

    private java.lang.String rate;

    private java.lang.Double limit;

    private java.lang.Boolean inactive;

    private java.util.Calendar effectiveDate;

    private java.util.Calendar expirationDate;

    public EmployeeDeduction() {
    }

    public EmployeeDeduction(
           com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem,
           java.lang.String rate,
           java.lang.Double limit,
           java.lang.Boolean inactive,
           java.util.Calendar effectiveDate,
           java.util.Calendar expirationDate) {
           this.payrollItem = payrollItem;
           this.rate = rate;
           this.limit = limit;
           this.inactive = inactive;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the payrollItem value for this EmployeeDeduction.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this EmployeeDeduction.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the rate value for this EmployeeDeduction.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this EmployeeDeduction.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the limit value for this EmployeeDeduction.
     * 
     * @return limit
     */
    public java.lang.Double getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this EmployeeDeduction.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Double limit) {
        this.limit = limit;
    }


    /**
     * Gets the inactive value for this EmployeeDeduction.
     * 
     * @return inactive
     */
    public java.lang.Boolean getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this EmployeeDeduction.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Boolean inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the effectiveDate value for this EmployeeDeduction.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this EmployeeDeduction.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this EmployeeDeduction.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this EmployeeDeduction.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeDeduction)) return false;
        EmployeeDeduction other = (EmployeeDeduction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              this.payrollItem.equals(other.getPayrollItem()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getPayrollItem() != null) {
            _hashCode += getPayrollItem().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeDeduction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeDeduction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
