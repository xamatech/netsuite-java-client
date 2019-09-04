/**
 * EmployeeEarning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeEarning  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem;

    private java.lang.String payRate;

    private java.lang.Boolean primaryEarning;

    private java.lang.Double defaultHours;

    private java.lang.Boolean inactive;

    private java.lang.Boolean defaultEarning;

    private java.util.Calendar effectiveDate;

    private java.util.Calendar expirationDate;

    public EmployeeEarning() {
    }

    public EmployeeEarning(
           com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem,
           java.lang.String payRate,
           java.lang.Boolean primaryEarning,
           java.lang.Double defaultHours,
           java.lang.Boolean inactive,
           java.lang.Boolean defaultEarning,
           java.util.Calendar effectiveDate,
           java.util.Calendar expirationDate) {
           this.payrollItem = payrollItem;
           this.payRate = payRate;
           this.primaryEarning = primaryEarning;
           this.defaultHours = defaultHours;
           this.inactive = inactive;
           this.defaultEarning = defaultEarning;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the payrollItem value for this EmployeeEarning.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this EmployeeEarning.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the payRate value for this EmployeeEarning.
     * 
     * @return payRate
     */
    public java.lang.String getPayRate() {
        return payRate;
    }


    /**
     * Sets the payRate value for this EmployeeEarning.
     * 
     * @param payRate
     */
    public void setPayRate(java.lang.String payRate) {
        this.payRate = payRate;
    }


    /**
     * Gets the primaryEarning value for this EmployeeEarning.
     * 
     * @return primaryEarning
     */
    public java.lang.Boolean getPrimaryEarning() {
        return primaryEarning;
    }


    /**
     * Sets the primaryEarning value for this EmployeeEarning.
     * 
     * @param primaryEarning
     */
    public void setPrimaryEarning(java.lang.Boolean primaryEarning) {
        this.primaryEarning = primaryEarning;
    }


    /**
     * Gets the defaultHours value for this EmployeeEarning.
     * 
     * @return defaultHours
     */
    public java.lang.Double getDefaultHours() {
        return defaultHours;
    }


    /**
     * Sets the defaultHours value for this EmployeeEarning.
     * 
     * @param defaultHours
     */
    public void setDefaultHours(java.lang.Double defaultHours) {
        this.defaultHours = defaultHours;
    }


    /**
     * Gets the inactive value for this EmployeeEarning.
     * 
     * @return inactive
     */
    public java.lang.Boolean getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this EmployeeEarning.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Boolean inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the defaultEarning value for this EmployeeEarning.
     * 
     * @return defaultEarning
     */
    public java.lang.Boolean getDefaultEarning() {
        return defaultEarning;
    }


    /**
     * Sets the defaultEarning value for this EmployeeEarning.
     * 
     * @param defaultEarning
     */
    public void setDefaultEarning(java.lang.Boolean defaultEarning) {
        this.defaultEarning = defaultEarning;
    }


    /**
     * Gets the effectiveDate value for this EmployeeEarning.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this EmployeeEarning.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this EmployeeEarning.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this EmployeeEarning.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeEarning)) return false;
        EmployeeEarning other = (EmployeeEarning) obj;
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
            ((this.payRate==null && other.getPayRate()==null) || 
             (this.payRate!=null &&
              this.payRate.equals(other.getPayRate()))) &&
            ((this.primaryEarning==null && other.getPrimaryEarning()==null) || 
             (this.primaryEarning!=null &&
              this.primaryEarning.equals(other.getPrimaryEarning()))) &&
            ((this.defaultHours==null && other.getDefaultHours()==null) || 
             (this.defaultHours!=null &&
              this.defaultHours.equals(other.getDefaultHours()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.defaultEarning==null && other.getDefaultEarning()==null) || 
             (this.defaultEarning!=null &&
              this.defaultEarning.equals(other.getDefaultEarning()))) &&
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
        if (getPayRate() != null) {
            _hashCode += getPayRate().hashCode();
        }
        if (getPrimaryEarning() != null) {
            _hashCode += getPrimaryEarning().hashCode();
        }
        if (getDefaultHours() != null) {
            _hashCode += getDefaultHours().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getDefaultEarning() != null) {
            _hashCode += getDefaultEarning().hashCode();
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
        new org.apache.axis.description.TypeDesc(EmployeeEarning.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeEarning"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "payRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "primaryEarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "defaultHours"));
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
        elemField.setFieldName("defaultEarning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "defaultEarning"));
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
