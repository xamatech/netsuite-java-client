/**
 * AccountSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AccountSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingContext;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField cashFlowRateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category1099Misc;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField generalRateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField legalName;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locale;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedLegalName;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedName;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField number;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public AccountSearchBasic() {
    }

    public AccountSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingContext,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField cashFlowRateType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category1099Misc,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField generalRateType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField legalName,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locale,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedLegalName,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedName,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField number,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.accountingContext = accountingContext;
        this.balance = balance;
        this.cashFlowRateType = cashFlowRateType;
        this.category1099Misc = category1099Misc;
        this.description = description;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.generalRateType = generalRateType;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.locale = locale;
        this.localizedLegalName = localizedLegalName;
        this.localizedName = localizedName;
        this.localizedNumber = localizedNumber;
        this.name = name;
        this.number = number;
        this.parent = parent;
        this.subsidiary = subsidiary;
        this.type = type;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountingContext value for this AccountSearchBasic.
     * 
     * @return accountingContext
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccountingContext() {
        return accountingContext;
    }


    /**
     * Sets the accountingContext value for this AccountSearchBasic.
     * 
     * @param accountingContext
     */
    public void setAccountingContext(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField accountingContext) {
        this.accountingContext = accountingContext;
    }


    /**
     * Gets the balance value for this AccountSearchBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AccountSearchBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance) {
        this.balance = balance;
    }


    /**
     * Gets the cashFlowRateType value for this AccountSearchBasic.
     * 
     * @return cashFlowRateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCashFlowRateType() {
        return cashFlowRateType;
    }


    /**
     * Sets the cashFlowRateType value for this AccountSearchBasic.
     * 
     * @param cashFlowRateType
     */
    public void setCashFlowRateType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField cashFlowRateType) {
        this.cashFlowRateType = cashFlowRateType;
    }


    /**
     * Gets the category1099Misc value for this AccountSearchBasic.
     * 
     * @return category1099Misc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory1099Misc() {
        return category1099Misc;
    }


    /**
     * Sets the category1099Misc value for this AccountSearchBasic.
     * 
     * @param category1099Misc
     */
    public void setCategory1099Misc(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category1099Misc) {
        this.category1099Misc = category1099Misc;
    }


    /**
     * Gets the description value for this AccountSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the externalId value for this AccountSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AccountSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this AccountSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this AccountSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the generalRateType value for this AccountSearchBasic.
     * 
     * @return generalRateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGeneralRateType() {
        return generalRateType;
    }


    /**
     * Sets the generalRateType value for this AccountSearchBasic.
     * 
     * @param generalRateType
     */
    public void setGeneralRateType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField generalRateType) {
        this.generalRateType = generalRateType;
    }


    /**
     * Gets the internalId value for this AccountSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this AccountSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this AccountSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this AccountSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the legalName value for this AccountSearchBasic.
     * 
     * @return legalName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this AccountSearchBasic.
     * 
     * @param legalName
     */
    public void setLegalName(com.netsuite.webservices.platform.core_2019_1.SearchStringField legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the locale value for this AccountSearchBasic.
     * 
     * @return locale
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this AccountSearchBasic.
     * 
     * @param locale
     */
    public void setLocale(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField locale) {
        this.locale = locale;
    }


    /**
     * Gets the localizedLegalName value for this AccountSearchBasic.
     * 
     * @return localizedLegalName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLocalizedLegalName() {
        return localizedLegalName;
    }


    /**
     * Sets the localizedLegalName value for this AccountSearchBasic.
     * 
     * @param localizedLegalName
     */
    public void setLocalizedLegalName(com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedLegalName) {
        this.localizedLegalName = localizedLegalName;
    }


    /**
     * Gets the localizedName value for this AccountSearchBasic.
     * 
     * @return localizedName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLocalizedName() {
        return localizedName;
    }


    /**
     * Sets the localizedName value for this AccountSearchBasic.
     * 
     * @param localizedName
     */
    public void setLocalizedName(com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedName) {
        this.localizedName = localizedName;
    }


    /**
     * Gets the localizedNumber value for this AccountSearchBasic.
     * 
     * @return localizedNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLocalizedNumber() {
        return localizedNumber;
    }


    /**
     * Sets the localizedNumber value for this AccountSearchBasic.
     * 
     * @param localizedNumber
     */
    public void setLocalizedNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField localizedNumber) {
        this.localizedNumber = localizedNumber;
    }


    /**
     * Gets the name value for this AccountSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the number value for this AccountSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AccountSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField number) {
        this.number = number;
    }


    /**
     * Gets the parent value for this AccountSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this AccountSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the subsidiary value for this AccountSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AccountSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the type value for this AccountSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this AccountSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the customFieldList value for this AccountSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AccountSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSearchBasic)) return false;
        AccountSearchBasic other = (AccountSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingContext==null && other.getAccountingContext()==null) || 
             (this.accountingContext!=null &&
              this.accountingContext.equals(other.getAccountingContext()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.cashFlowRateType==null && other.getCashFlowRateType()==null) || 
             (this.cashFlowRateType!=null &&
              this.cashFlowRateType.equals(other.getCashFlowRateType()))) &&
            ((this.category1099Misc==null && other.getCategory1099Misc()==null) || 
             (this.category1099Misc!=null &&
              this.category1099Misc.equals(other.getCategory1099Misc()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.generalRateType==null && other.getGeneralRateType()==null) || 
             (this.generalRateType!=null &&
              this.generalRateType.equals(other.getGeneralRateType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.localizedLegalName==null && other.getLocalizedLegalName()==null) || 
             (this.localizedLegalName!=null &&
              this.localizedLegalName.equals(other.getLocalizedLegalName()))) &&
            ((this.localizedName==null && other.getLocalizedName()==null) || 
             (this.localizedName!=null &&
              this.localizedName.equals(other.getLocalizedName()))) &&
            ((this.localizedNumber==null && other.getLocalizedNumber()==null) || 
             (this.localizedNumber!=null &&
              this.localizedNumber.equals(other.getLocalizedNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getAccountingContext() != null) {
            _hashCode += getAccountingContext().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getCashFlowRateType() != null) {
            _hashCode += getCashFlowRateType().hashCode();
        }
        if (getCategory1099Misc() != null) {
            _hashCode += getCategory1099Misc().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getGeneralRateType() != null) {
            _hashCode += getGeneralRateType().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getLocalizedLegalName() != null) {
            _hashCode += getLocalizedLegalName().hashCode();
        }
        if (getLocalizedName() != null) {
            _hashCode += getLocalizedName().hashCode();
        }
        if (getLocalizedNumber() != null) {
            _hashCode += getLocalizedNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashFlowRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cashFlowRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category1099Misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("generalRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "generalRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedLegalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "localizedLegalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "localizedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "localizedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
