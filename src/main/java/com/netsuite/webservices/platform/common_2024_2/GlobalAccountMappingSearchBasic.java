/**
 * GlobalAccountMappingSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class GlobalAccountMappingSearchBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField accountingBook;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectCustomField customDimension;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField destinationAccount;

    private com.netsuite.webservices.platform.core_2024_2.SearchDateField effectiveDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField sourceAccount;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList;

    public GlobalAccountMappingSearchBasic() {
    }

    public GlobalAccountMappingSearchBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField accountingBook,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField _class,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectCustomField customDimension,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField department,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField destinationAccount,
           com.netsuite.webservices.platform.core_2024_2.SearchDateField effectiveDate,
           com.netsuite.webservices.platform.core_2024_2.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2024_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField location,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField sourceAccount,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList) {
        this.accountingBook = accountingBook;
        this._class = _class;
        this.customDimension = customDimension;
        this.department = department;
        this.destinationAccount = destinationAccount;
        this.effectiveDate = effectiveDate;
        this.endDate = endDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.location = location;
        this.sourceAccount = sourceAccount;
        this.subsidiary = subsidiary;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountingBook value for this GlobalAccountMappingSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this GlobalAccountMappingSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the _class value for this GlobalAccountMappingSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this GlobalAccountMappingSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the customDimension value for this GlobalAccountMappingSearchBasic.
     * 
     * @return customDimension
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectCustomField getCustomDimension() {
        return customDimension;
    }


    /**
     * Sets the customDimension value for this GlobalAccountMappingSearchBasic.
     * 
     * @param customDimension
     */
    public void setCustomDimension(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectCustomField customDimension) {
        this.customDimension = customDimension;
    }


    /**
     * Gets the department value for this GlobalAccountMappingSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this GlobalAccountMappingSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the destinationAccount value for this GlobalAccountMappingSearchBasic.
     * 
     * @return destinationAccount
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getDestinationAccount() {
        return destinationAccount;
    }


    /**
     * Sets the destinationAccount value for this GlobalAccountMappingSearchBasic.
     * 
     * @param destinationAccount
     */
    public void setDestinationAccount(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField destinationAccount) {
        this.destinationAccount = destinationAccount;
    }


    /**
     * Gets the effectiveDate value for this GlobalAccountMappingSearchBasic.
     * 
     * @return effectiveDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDateField getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this GlobalAccountMappingSearchBasic.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(com.netsuite.webservices.platform.core_2024_2.SearchDateField effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the endDate value for this GlobalAccountMappingSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GlobalAccountMappingSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2024_2.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the externalId value for this GlobalAccountMappingSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this GlobalAccountMappingSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this GlobalAccountMappingSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this GlobalAccountMappingSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2024_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this GlobalAccountMappingSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this GlobalAccountMappingSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this GlobalAccountMappingSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this GlobalAccountMappingSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the location value for this GlobalAccountMappingSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this GlobalAccountMappingSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the sourceAccount value for this GlobalAccountMappingSearchBasic.
     * 
     * @return sourceAccount
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getSourceAccount() {
        return sourceAccount;
    }


    /**
     * Sets the sourceAccount value for this GlobalAccountMappingSearchBasic.
     * 
     * @param sourceAccount
     */
    public void setSourceAccount(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField sourceAccount) {
        this.sourceAccount = sourceAccount;
    }


    /**
     * Gets the subsidiary value for this GlobalAccountMappingSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this GlobalAccountMappingSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the customFieldList value for this GlobalAccountMappingSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this GlobalAccountMappingSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalAccountMappingSearchBasic)) return false;
        GlobalAccountMappingSearchBasic other = (GlobalAccountMappingSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.customDimension==null && other.getCustomDimension()==null) || 
             (this.customDimension!=null &&
              this.customDimension.equals(other.getCustomDimension()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.destinationAccount==null && other.getDestinationAccount()==null) || 
             (this.destinationAccount!=null &&
              this.destinationAccount.equals(other.getDestinationAccount()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.sourceAccount==null && other.getSourceAccount()==null) || 
             (this.sourceAccount!=null &&
              this.sourceAccount.equals(other.getSourceAccount()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
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
        int _hashCode = super.hashCode();
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCustomDimension() != null) {
            _hashCode += getCustomDimension().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDestinationAccount() != null) {
            _hashCode += getDestinationAccount().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSourceAccount() != null) {
            _hashCode += getSourceAccount().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalAccountMappingSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "GlobalAccountMappingSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectCustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "destinationAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "sourceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
