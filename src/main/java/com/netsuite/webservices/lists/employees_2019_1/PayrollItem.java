/**
 * PayrollItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class PayrollItem  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemType;

    private java.lang.String name;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef vendor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef liabilityAccount;

    private java.lang.Boolean employeePaid;

    private com.netsuite.webservices.lists.employees_2019_1.types.PayrollItemAccountCategory accountCategory;

    private java.lang.Boolean inactive;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PayrollItem() {
    }

    public PayrollItem(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemType,
           java.lang.String name,
           com.netsuite.webservices.platform.core_2019_1.RecordRef vendor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef liabilityAccount,
           java.lang.Boolean employeePaid,
           com.netsuite.webservices.lists.employees_2019_1.types.PayrollItemAccountCategory accountCategory,
           java.lang.Boolean inactive,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.subsidiary = subsidiary;
        this.itemType = itemType;
        this.name = name;
        this.vendor = vendor;
        this.expenseAccount = expenseAccount;
        this.liabilityAccount = liabilityAccount;
        this.employeePaid = employeePaid;
        this.accountCategory = accountCategory;
        this.inactive = inactive;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the subsidiary value for this PayrollItem.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PayrollItem.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the itemType value for this PayrollItem.
     * 
     * @return itemType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this PayrollItem.
     * 
     * @param itemType
     */
    public void setItemType(com.netsuite.webservices.platform.core_2019_1.RecordRef itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the name value for this PayrollItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PayrollItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vendor value for this PayrollItem.
     * 
     * @return vendor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this PayrollItem.
     * 
     * @param vendor
     */
    public void setVendor(com.netsuite.webservices.platform.core_2019_1.RecordRef vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the expenseAccount value for this PayrollItem.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this PayrollItem.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }


    /**
     * Gets the liabilityAccount value for this PayrollItem.
     * 
     * @return liabilityAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLiabilityAccount() {
        return liabilityAccount;
    }


    /**
     * Sets the liabilityAccount value for this PayrollItem.
     * 
     * @param liabilityAccount
     */
    public void setLiabilityAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }


    /**
     * Gets the employeePaid value for this PayrollItem.
     * 
     * @return employeePaid
     */
    public java.lang.Boolean getEmployeePaid() {
        return employeePaid;
    }


    /**
     * Sets the employeePaid value for this PayrollItem.
     * 
     * @param employeePaid
     */
    public void setEmployeePaid(java.lang.Boolean employeePaid) {
        this.employeePaid = employeePaid;
    }


    /**
     * Gets the accountCategory value for this PayrollItem.
     * 
     * @return accountCategory
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.PayrollItemAccountCategory getAccountCategory() {
        return accountCategory;
    }


    /**
     * Sets the accountCategory value for this PayrollItem.
     * 
     * @param accountCategory
     */
    public void setAccountCategory(com.netsuite.webservices.lists.employees_2019_1.types.PayrollItemAccountCategory accountCategory) {
        this.accountCategory = accountCategory;
    }


    /**
     * Gets the inactive value for this PayrollItem.
     * 
     * @return inactive
     */
    public java.lang.Boolean getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this PayrollItem.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Boolean inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the customFieldList value for this PayrollItem.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PayrollItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this PayrollItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PayrollItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PayrollItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PayrollItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayrollItem)) return false;
        PayrollItem other = (PayrollItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              this.expenseAccount.equals(other.getExpenseAccount()))) &&
            ((this.liabilityAccount==null && other.getLiabilityAccount()==null) || 
             (this.liabilityAccount!=null &&
              this.liabilityAccount.equals(other.getLiabilityAccount()))) &&
            ((this.employeePaid==null && other.getEmployeePaid()==null) || 
             (this.employeePaid!=null &&
              this.employeePaid.equals(other.getEmployeePaid()))) &&
            ((this.accountCategory==null && other.getAccountCategory()==null) || 
             (this.accountCategory!=null &&
              this.accountCategory.equals(other.getAccountCategory()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getExpenseAccount() != null) {
            _hashCode += getExpenseAccount().hashCode();
        }
        if (getLiabilityAccount() != null) {
            _hashCode += getLiabilityAccount().hashCode();
        }
        if (getEmployeePaid() != null) {
            _hashCode += getEmployeePaid().hashCode();
        }
        if (getAccountCategory() != null) {
            _hashCode += getAccountCategory().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayrollItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "PayrollItem"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeePaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employeePaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accountCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "PayrollItemAccountCategory"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
