/**
 * PaycheckJournalCompanyContribution.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2024_2;

public class PaycheckJournalCompanyContribution  implements java.io.Serializable {
    private java.lang.Long id;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef payrollItem;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef department;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef _class;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef location;

    private com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList;

    public PaycheckJournalCompanyContribution() {
    }

    public PaycheckJournalCompanyContribution(
           java.lang.Long id,
           com.netsuite.webservices.platform.core_2024_2.RecordRef payrollItem,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2024_2.RecordRef department,
           com.netsuite.webservices.platform.core_2024_2.RecordRef _class,
           com.netsuite.webservices.platform.core_2024_2.RecordRef location,
           com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList) {
           this.id = id;
           this.payrollItem = payrollItem;
           this.amount = amount;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the id value for this PaycheckJournalCompanyContribution.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this PaycheckJournalCompanyContribution.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the payrollItem value for this PaycheckJournalCompanyContribution.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this PaycheckJournalCompanyContribution.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2024_2.RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the amount value for this PaycheckJournalCompanyContribution.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckJournalCompanyContribution.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the department value for this PaycheckJournalCompanyContribution.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PaycheckJournalCompanyContribution.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2024_2.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PaycheckJournalCompanyContribution.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PaycheckJournalCompanyContribution.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2024_2.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PaycheckJournalCompanyContribution.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PaycheckJournalCompanyContribution.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2024_2.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the customFieldList value for this PaycheckJournalCompanyContribution.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PaycheckJournalCompanyContribution.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckJournalCompanyContribution)) return false;
        PaycheckJournalCompanyContribution other = (PaycheckJournalCompanyContribution) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              this.payrollItem.equals(other.getPayrollItem()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPayrollItem() != null) {
            _hashCode += getPayrollItem().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckJournalCompanyContribution.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "PaycheckJournalCompanyContribution"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
