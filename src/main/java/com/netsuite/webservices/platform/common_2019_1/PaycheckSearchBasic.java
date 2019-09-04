/**
 * PaycheckSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class PaycheckSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField batchNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField checkDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasGLImpact;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payrollItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payrollItemType;

    public PaycheckSearchBasic() {
    }

    public PaycheckSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField batchNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField checkDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasGLImpact,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payrollItem,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payrollItemType) {
        this.account = account;
        this.batchNumber = batchNumber;
        this.checkDate = checkDate;
        this.employee = employee;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.hasGLImpact = hasGLImpact;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.payrollItem = payrollItem;
        this.payrollItemType = payrollItemType;
    }


    /**
     * Gets the account value for this PaycheckSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaycheckSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account) {
        this.account = account;
    }


    /**
     * Gets the batchNumber value for this PaycheckSearchBasic.
     * 
     * @return batchNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this PaycheckSearchBasic.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the checkDate value for this PaycheckSearchBasic.
     * 
     * @return checkDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCheckDate() {
        return checkDate;
    }


    /**
     * Sets the checkDate value for this PaycheckSearchBasic.
     * 
     * @param checkDate
     */
    public void setCheckDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField checkDate) {
        this.checkDate = checkDate;
    }


    /**
     * Gets the employee value for this PaycheckSearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this PaycheckSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee) {
        this.employee = employee;
    }


    /**
     * Gets the externalId value for this PaycheckSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaycheckSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this PaycheckSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this PaycheckSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the hasGLImpact value for this PaycheckSearchBasic.
     * 
     * @return hasGLImpact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getHasGLImpact() {
        return hasGLImpact;
    }


    /**
     * Sets the hasGLImpact value for this PaycheckSearchBasic.
     * 
     * @param hasGLImpact
     */
    public void setHasGLImpact(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasGLImpact) {
        this.hasGLImpact = hasGLImpact;
    }


    /**
     * Gets the internalId value for this PaycheckSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaycheckSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this PaycheckSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this PaycheckSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the payrollItem value for this PaycheckSearchBasic.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this PaycheckSearchBasic.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payrollItem) {
        this.payrollItem = payrollItem;
    }


    /**
     * Gets the payrollItemType value for this PaycheckSearchBasic.
     * 
     * @return payrollItemType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPayrollItemType() {
        return payrollItemType;
    }


    /**
     * Sets the payrollItemType value for this PaycheckSearchBasic.
     * 
     * @param payrollItemType
     */
    public void setPayrollItemType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payrollItemType) {
        this.payrollItemType = payrollItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckSearchBasic)) return false;
        PaycheckSearchBasic other = (PaycheckSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.checkDate==null && other.getCheckDate()==null) || 
             (this.checkDate!=null &&
              this.checkDate.equals(other.getCheckDate()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.hasGLImpact==null && other.getHasGLImpact()==null) || 
             (this.hasGLImpact!=null &&
              this.hasGLImpact.equals(other.getHasGLImpact()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              this.payrollItem.equals(other.getPayrollItem()))) &&
            ((this.payrollItemType==null && other.getPayrollItemType()==null) || 
             (this.payrollItemType!=null &&
              this.payrollItemType.equals(other.getPayrollItemType())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getCheckDate() != null) {
            _hashCode += getCheckDate().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getHasGLImpact() != null) {
            _hashCode += getHasGLImpact().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getPayrollItem() != null) {
            _hashCode += getPayrollItem().hashCode();
        }
        if (getPayrollItemType() != null) {
            _hashCode += getPayrollItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PaycheckSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "batchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "checkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasGLImpact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasGLImpact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
