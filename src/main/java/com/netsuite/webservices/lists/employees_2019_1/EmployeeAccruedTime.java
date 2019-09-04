/**
 * EmployeeAccruedTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeAccruedTime  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem;

    private java.lang.Double accruedHours;

    private java.lang.Double accrualRate;

    private java.lang.Double monetaryRate;

    private java.lang.Boolean resetAccruedHoursAtYearEnd;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeAccruedTimeAccrualMethod accrualMethod;

    private java.lang.Double maximumAccruedHours;

    private java.lang.Boolean inactive;

    private java.util.Calendar effectiveDate;

    private java.util.Calendar expirationDate;

    public EmployeeAccruedTime() {
    }

    public EmployeeAccruedTime(
           com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem,
           java.lang.Double accruedHours,
           java.lang.Double accrualRate,
           java.lang.Double monetaryRate,
           java.lang.Boolean resetAccruedHoursAtYearEnd,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeAccruedTimeAccrualMethod accrualMethod,
           java.lang.Double maximumAccruedHours,
           java.lang.Boolean inactive,
           java.util.Calendar effectiveDate,
           java.util.Calendar expirationDate) {
           this.payrollItem = payrollItem;
           this.accruedHours = accruedHours;
           this.accrualRate = accrualRate;
           this.monetaryRate = monetaryRate;
           this.resetAccruedHoursAtYearEnd = resetAccruedHoursAtYearEnd;
           this.accrualMethod = accrualMethod;
           this.maximumAccruedHours = maximumAccruedHours;
           this.inactive = inactive;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the payrollItem value for this EmployeeAccruedTime.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this EmployeeAccruedTime.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the accruedHours value for this EmployeeAccruedTime.
     * 
     * @return accruedHours
     */
    public java.lang.Double getAccruedHours() {
        return accruedHours;
    }


    /**
     * Sets the accruedHours value for this EmployeeAccruedTime.
     * 
     * @param accruedHours
     */
    public void setAccruedHours(java.lang.Double accruedHours) {
        this.accruedHours = accruedHours;
    }


    /**
     * Gets the accrualRate value for this EmployeeAccruedTime.
     * 
     * @return accrualRate
     */
    public java.lang.Double getAccrualRate() {
        return accrualRate;
    }


    /**
     * Sets the accrualRate value for this EmployeeAccruedTime.
     * 
     * @param accrualRate
     */
    public void setAccrualRate(java.lang.Double accrualRate) {
        this.accrualRate = accrualRate;
    }


    /**
     * Gets the monetaryRate value for this EmployeeAccruedTime.
     * 
     * @return monetaryRate
     */
    public java.lang.Double getMonetaryRate() {
        return monetaryRate;
    }


    /**
     * Sets the monetaryRate value for this EmployeeAccruedTime.
     * 
     * @param monetaryRate
     */
    public void setMonetaryRate(java.lang.Double monetaryRate) {
        this.monetaryRate = monetaryRate;
    }


    /**
     * Gets the resetAccruedHoursAtYearEnd value for this EmployeeAccruedTime.
     * 
     * @return resetAccruedHoursAtYearEnd
     */
    public java.lang.Boolean getResetAccruedHoursAtYearEnd() {
        return resetAccruedHoursAtYearEnd;
    }


    /**
     * Sets the resetAccruedHoursAtYearEnd value for this EmployeeAccruedTime.
     * 
     * @param resetAccruedHoursAtYearEnd
     */
    public void setResetAccruedHoursAtYearEnd(java.lang.Boolean resetAccruedHoursAtYearEnd) {
        this.resetAccruedHoursAtYearEnd = resetAccruedHoursAtYearEnd;
    }


    /**
     * Gets the accrualMethod value for this EmployeeAccruedTime.
     * 
     * @return accrualMethod
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeAccruedTimeAccrualMethod getAccrualMethod() {
        return accrualMethod;
    }


    /**
     * Sets the accrualMethod value for this EmployeeAccruedTime.
     * 
     * @param accrualMethod
     */
    public void setAccrualMethod(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeAccruedTimeAccrualMethod accrualMethod) {
        this.accrualMethod = accrualMethod;
    }


    /**
     * Gets the maximumAccruedHours value for this EmployeeAccruedTime.
     * 
     * @return maximumAccruedHours
     */
    public java.lang.Double getMaximumAccruedHours() {
        return maximumAccruedHours;
    }


    /**
     * Sets the maximumAccruedHours value for this EmployeeAccruedTime.
     * 
     * @param maximumAccruedHours
     */
    public void setMaximumAccruedHours(java.lang.Double maximumAccruedHours) {
        this.maximumAccruedHours = maximumAccruedHours;
    }


    /**
     * Gets the inactive value for this EmployeeAccruedTime.
     * 
     * @return inactive
     */
    public java.lang.Boolean getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this EmployeeAccruedTime.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Boolean inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the effectiveDate value for this EmployeeAccruedTime.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this EmployeeAccruedTime.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this EmployeeAccruedTime.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this EmployeeAccruedTime.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeAccruedTime)) return false;
        EmployeeAccruedTime other = (EmployeeAccruedTime) obj;
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
            ((this.accruedHours==null && other.getAccruedHours()==null) || 
             (this.accruedHours!=null &&
              this.accruedHours.equals(other.getAccruedHours()))) &&
            ((this.accrualRate==null && other.getAccrualRate()==null) || 
             (this.accrualRate!=null &&
              this.accrualRate.equals(other.getAccrualRate()))) &&
            ((this.monetaryRate==null && other.getMonetaryRate()==null) || 
             (this.monetaryRate!=null &&
              this.monetaryRate.equals(other.getMonetaryRate()))) &&
            ((this.resetAccruedHoursAtYearEnd==null && other.getResetAccruedHoursAtYearEnd()==null) || 
             (this.resetAccruedHoursAtYearEnd!=null &&
              this.resetAccruedHoursAtYearEnd.equals(other.getResetAccruedHoursAtYearEnd()))) &&
            ((this.accrualMethod==null && other.getAccrualMethod()==null) || 
             (this.accrualMethod!=null &&
              this.accrualMethod.equals(other.getAccrualMethod()))) &&
            ((this.maximumAccruedHours==null && other.getMaximumAccruedHours()==null) || 
             (this.maximumAccruedHours!=null &&
              this.maximumAccruedHours.equals(other.getMaximumAccruedHours()))) &&
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
        if (getAccruedHours() != null) {
            _hashCode += getAccruedHours().hashCode();
        }
        if (getAccrualRate() != null) {
            _hashCode += getAccrualRate().hashCode();
        }
        if (getMonetaryRate() != null) {
            _hashCode += getMonetaryRate().hashCode();
        }
        if (getResetAccruedHoursAtYearEnd() != null) {
            _hashCode += getResetAccruedHoursAtYearEnd().hashCode();
        }
        if (getAccrualMethod() != null) {
            _hashCode += getAccrualMethod().hashCode();
        }
        if (getMaximumAccruedHours() != null) {
            _hashCode += getMaximumAccruedHours().hashCode();
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
        new org.apache.axis.description.TypeDesc(EmployeeAccruedTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeAccruedTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accruedHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accruedHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accrualRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accrualRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monetaryRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "monetaryRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetAccruedHoursAtYearEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "resetAccruedHoursAtYearEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accrualMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accrualMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeAccrualMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumAccruedHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "maximumAccruedHours"));
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
