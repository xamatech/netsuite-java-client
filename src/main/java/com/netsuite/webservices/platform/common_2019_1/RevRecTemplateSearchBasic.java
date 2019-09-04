/**
 * RevRecTemplateSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class RevRecTemplateSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField amorPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField amorStartOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorTermSrc;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contraAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField deferralAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField periodOffset;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField targetAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useForeignAmounts;

    public RevRecTemplateSearchBasic() {
    }

    public RevRecTemplateSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorMethod,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField amorPeriod,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField amorStartOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorTermSrc,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contraAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField deferralAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField periodOffset,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField targetAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useForeignAmounts) {
        this.amorMethod = amorMethod;
        this.amorPeriod = amorPeriod;
        this.amorStartOffset = amorStartOffset;
        this.amorTermSrc = amorTermSrc;
        this.amorType = amorType;
        this.contraAccount = contraAccount;
        this.deferralAccount = deferralAccount;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.name = name;
        this.periodOffset = periodOffset;
        this.targetAccount = targetAccount;
        this.useForeignAmounts = useForeignAmounts;
    }


    /**
     * Gets the amorMethod value for this RevRecTemplateSearchBasic.
     * 
     * @return amorMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAmorMethod() {
        return amorMethod;
    }


    /**
     * Sets the amorMethod value for this RevRecTemplateSearchBasic.
     * 
     * @param amorMethod
     */
    public void setAmorMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorMethod) {
        this.amorMethod = amorMethod;
    }


    /**
     * Gets the amorPeriod value for this RevRecTemplateSearchBasic.
     * 
     * @return amorPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getAmorPeriod() {
        return amorPeriod;
    }


    /**
     * Sets the amorPeriod value for this RevRecTemplateSearchBasic.
     * 
     * @param amorPeriod
     */
    public void setAmorPeriod(com.netsuite.webservices.platform.core_2019_1.SearchLongField amorPeriod) {
        this.amorPeriod = amorPeriod;
    }


    /**
     * Gets the amorStartOffset value for this RevRecTemplateSearchBasic.
     * 
     * @return amorStartOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getAmorStartOffset() {
        return amorStartOffset;
    }


    /**
     * Sets the amorStartOffset value for this RevRecTemplateSearchBasic.
     * 
     * @param amorStartOffset
     */
    public void setAmorStartOffset(com.netsuite.webservices.platform.core_2019_1.SearchLongField amorStartOffset) {
        this.amorStartOffset = amorStartOffset;
    }


    /**
     * Gets the amorTermSrc value for this RevRecTemplateSearchBasic.
     * 
     * @return amorTermSrc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAmorTermSrc() {
        return amorTermSrc;
    }


    /**
     * Sets the amorTermSrc value for this RevRecTemplateSearchBasic.
     * 
     * @param amorTermSrc
     */
    public void setAmorTermSrc(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorTermSrc) {
        this.amorTermSrc = amorTermSrc;
    }


    /**
     * Gets the amorType value for this RevRecTemplateSearchBasic.
     * 
     * @return amorType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAmorType() {
        return amorType;
    }


    /**
     * Sets the amorType value for this RevRecTemplateSearchBasic.
     * 
     * @param amorType
     */
    public void setAmorType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField amorType) {
        this.amorType = amorType;
    }


    /**
     * Gets the contraAccount value for this RevRecTemplateSearchBasic.
     * 
     * @return contraAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getContraAccount() {
        return contraAccount;
    }


    /**
     * Sets the contraAccount value for this RevRecTemplateSearchBasic.
     * 
     * @param contraAccount
     */
    public void setContraAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField contraAccount) {
        this.contraAccount = contraAccount;
    }


    /**
     * Gets the deferralAccount value for this RevRecTemplateSearchBasic.
     * 
     * @return deferralAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDeferralAccount() {
        return deferralAccount;
    }


    /**
     * Sets the deferralAccount value for this RevRecTemplateSearchBasic.
     * 
     * @param deferralAccount
     */
    public void setDeferralAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField deferralAccount) {
        this.deferralAccount = deferralAccount;
    }


    /**
     * Gets the externalId value for this RevRecTemplateSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this RevRecTemplateSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this RevRecTemplateSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this RevRecTemplateSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this RevRecTemplateSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RevRecTemplateSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this RevRecTemplateSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this RevRecTemplateSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this RevRecTemplateSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this RevRecTemplateSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this RevRecTemplateSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this RevRecTemplateSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the periodOffset value for this RevRecTemplateSearchBasic.
     * 
     * @return periodOffset
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecTemplateSearchBasic.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(com.netsuite.webservices.platform.core_2019_1.SearchLongField periodOffset) {
        this.periodOffset = periodOffset;
    }


    /**
     * Gets the targetAccount value for this RevRecTemplateSearchBasic.
     * 
     * @return targetAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTargetAccount() {
        return targetAccount;
    }


    /**
     * Sets the targetAccount value for this RevRecTemplateSearchBasic.
     * 
     * @param targetAccount
     */
    public void setTargetAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField targetAccount) {
        this.targetAccount = targetAccount;
    }


    /**
     * Gets the useForeignAmounts value for this RevRecTemplateSearchBasic.
     * 
     * @return useForeignAmounts
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUseForeignAmounts() {
        return useForeignAmounts;
    }


    /**
     * Sets the useForeignAmounts value for this RevRecTemplateSearchBasic.
     * 
     * @param useForeignAmounts
     */
    public void setUseForeignAmounts(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecTemplateSearchBasic)) return false;
        RevRecTemplateSearchBasic other = (RevRecTemplateSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amorMethod==null && other.getAmorMethod()==null) || 
             (this.amorMethod!=null &&
              this.amorMethod.equals(other.getAmorMethod()))) &&
            ((this.amorPeriod==null && other.getAmorPeriod()==null) || 
             (this.amorPeriod!=null &&
              this.amorPeriod.equals(other.getAmorPeriod()))) &&
            ((this.amorStartOffset==null && other.getAmorStartOffset()==null) || 
             (this.amorStartOffset!=null &&
              this.amorStartOffset.equals(other.getAmorStartOffset()))) &&
            ((this.amorTermSrc==null && other.getAmorTermSrc()==null) || 
             (this.amorTermSrc!=null &&
              this.amorTermSrc.equals(other.getAmorTermSrc()))) &&
            ((this.amorType==null && other.getAmorType()==null) || 
             (this.amorType!=null &&
              this.amorType.equals(other.getAmorType()))) &&
            ((this.contraAccount==null && other.getContraAccount()==null) || 
             (this.contraAccount!=null &&
              this.contraAccount.equals(other.getContraAccount()))) &&
            ((this.deferralAccount==null && other.getDeferralAccount()==null) || 
             (this.deferralAccount!=null &&
              this.deferralAccount.equals(other.getDeferralAccount()))) &&
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
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              this.periodOffset.equals(other.getPeriodOffset()))) &&
            ((this.targetAccount==null && other.getTargetAccount()==null) || 
             (this.targetAccount!=null &&
              this.targetAccount.equals(other.getTargetAccount()))) &&
            ((this.useForeignAmounts==null && other.getUseForeignAmounts()==null) || 
             (this.useForeignAmounts!=null &&
              this.useForeignAmounts.equals(other.getUseForeignAmounts())));
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
        if (getAmorMethod() != null) {
            _hashCode += getAmorMethod().hashCode();
        }
        if (getAmorPeriod() != null) {
            _hashCode += getAmorPeriod().hashCode();
        }
        if (getAmorStartOffset() != null) {
            _hashCode += getAmorStartOffset().hashCode();
        }
        if (getAmorTermSrc() != null) {
            _hashCode += getAmorTermSrc().hashCode();
        }
        if (getAmorType() != null) {
            _hashCode += getAmorType().hashCode();
        }
        if (getContraAccount() != null) {
            _hashCode += getContraAccount().hashCode();
        }
        if (getDeferralAccount() != null) {
            _hashCode += getDeferralAccount().hashCode();
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
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPeriodOffset() != null) {
            _hashCode += getPeriodOffset().hashCode();
        }
        if (getTargetAccount() != null) {
            _hashCode += getTargetAccount().hashCode();
        }
        if (getUseForeignAmounts() != null) {
            _hashCode += getUseForeignAmounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevRecTemplateSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "RevRecTemplateSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorStartOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorStartOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorTermSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorTermSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contraAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contraAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferralAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferralAccount"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "targetAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
