/**
 * BillingScheduleSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BillingScheduleSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyToSubtotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField frequency;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inArrears;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField initialAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField initialTerms;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPublic;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField recurrenceCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField recurrencePattern;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recurrenceTerms;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField repeatEvery;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type;

    public BillingScheduleSearchBasic() {
    }

    public BillingScheduleSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyToSubtotal,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField frequency,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inArrears,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField initialAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField initialTerms,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPublic,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField recurrenceCount,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField recurrencePattern,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recurrenceTerms,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField repeatEvery,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type) {
        this.applyToSubtotal = applyToSubtotal;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.frequency = frequency;
        this.inArrears = inArrears;
        this.initialAmount = initialAmount;
        this.initialTerms = initialTerms;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isPublic = isPublic;
        this.name = name;
        this.recurrenceCount = recurrenceCount;
        this.recurrencePattern = recurrencePattern;
        this.recurrenceTerms = recurrenceTerms;
        this.repeatEvery = repeatEvery;
        this.type = type;
    }


    /**
     * Gets the applyToSubtotal value for this BillingScheduleSearchBasic.
     * 
     * @return applyToSubtotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getApplyToSubtotal() {
        return applyToSubtotal;
    }


    /**
     * Sets the applyToSubtotal value for this BillingScheduleSearchBasic.
     * 
     * @param applyToSubtotal
     */
    public void setApplyToSubtotal(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyToSubtotal) {
        this.applyToSubtotal = applyToSubtotal;
    }


    /**
     * Gets the externalId value for this BillingScheduleSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BillingScheduleSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this BillingScheduleSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this BillingScheduleSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the frequency value for this BillingScheduleSearchBasic.
     * 
     * @return frequency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this BillingScheduleSearchBasic.
     * 
     * @param frequency
     */
    public void setFrequency(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the inArrears value for this BillingScheduleSearchBasic.
     * 
     * @return inArrears
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getInArrears() {
        return inArrears;
    }


    /**
     * Sets the inArrears value for this BillingScheduleSearchBasic.
     * 
     * @param inArrears
     */
    public void setInArrears(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inArrears) {
        this.inArrears = inArrears;
    }


    /**
     * Gets the initialAmount value for this BillingScheduleSearchBasic.
     * 
     * @return initialAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this BillingScheduleSearchBasic.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the initialTerms value for this BillingScheduleSearchBasic.
     * 
     * @return initialTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInitialTerms() {
        return initialTerms;
    }


    /**
     * Sets the initialTerms value for this BillingScheduleSearchBasic.
     * 
     * @param initialTerms
     */
    public void setInitialTerms(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField initialTerms) {
        this.initialTerms = initialTerms;
    }


    /**
     * Gets the internalId value for this BillingScheduleSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BillingScheduleSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this BillingScheduleSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this BillingScheduleSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this BillingScheduleSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this BillingScheduleSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isPublic value for this BillingScheduleSearchBasic.
     * 
     * @return isPublic
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPublic() {
        return isPublic;
    }


    /**
     * Sets the isPublic value for this BillingScheduleSearchBasic.
     * 
     * @param isPublic
     */
    public void setIsPublic(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPublic) {
        this.isPublic = isPublic;
    }


    /**
     * Gets the name value for this BillingScheduleSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this BillingScheduleSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the recurrenceCount value for this BillingScheduleSearchBasic.
     * 
     * @return recurrenceCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getRecurrenceCount() {
        return recurrenceCount;
    }


    /**
     * Sets the recurrenceCount value for this BillingScheduleSearchBasic.
     * 
     * @param recurrenceCount
     */
    public void setRecurrenceCount(com.netsuite.webservices.platform.core_2019_1.SearchLongField recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
    }


    /**
     * Gets the recurrencePattern value for this BillingScheduleSearchBasic.
     * 
     * @return recurrencePattern
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getRecurrencePattern() {
        return recurrencePattern;
    }


    /**
     * Sets the recurrencePattern value for this BillingScheduleSearchBasic.
     * 
     * @param recurrencePattern
     */
    public void setRecurrencePattern(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }


    /**
     * Gets the recurrenceTerms value for this BillingScheduleSearchBasic.
     * 
     * @return recurrenceTerms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRecurrenceTerms() {
        return recurrenceTerms;
    }


    /**
     * Sets the recurrenceTerms value for this BillingScheduleSearchBasic.
     * 
     * @param recurrenceTerms
     */
    public void setRecurrenceTerms(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
    }


    /**
     * Gets the repeatEvery value for this BillingScheduleSearchBasic.
     * 
     * @return repeatEvery
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getRepeatEvery() {
        return repeatEvery;
    }


    /**
     * Sets the repeatEvery value for this BillingScheduleSearchBasic.
     * 
     * @param repeatEvery
     */
    public void setRepeatEvery(com.netsuite.webservices.platform.core_2019_1.SearchLongField repeatEvery) {
        this.repeatEvery = repeatEvery;
    }


    /**
     * Gets the type value for this BillingScheduleSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this BillingScheduleSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingScheduleSearchBasic)) return false;
        BillingScheduleSearchBasic other = (BillingScheduleSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applyToSubtotal==null && other.getApplyToSubtotal()==null) || 
             (this.applyToSubtotal!=null &&
              this.applyToSubtotal.equals(other.getApplyToSubtotal()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.inArrears==null && other.getInArrears()==null) || 
             (this.inArrears!=null &&
              this.inArrears.equals(other.getInArrears()))) &&
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              this.initialAmount.equals(other.getInitialAmount()))) &&
            ((this.initialTerms==null && other.getInitialTerms()==null) || 
             (this.initialTerms!=null &&
              this.initialTerms.equals(other.getInitialTerms()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isPublic==null && other.getIsPublic()==null) || 
             (this.isPublic!=null &&
              this.isPublic.equals(other.getIsPublic()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.recurrenceCount==null && other.getRecurrenceCount()==null) || 
             (this.recurrenceCount!=null &&
              this.recurrenceCount.equals(other.getRecurrenceCount()))) &&
            ((this.recurrencePattern==null && other.getRecurrencePattern()==null) || 
             (this.recurrencePattern!=null &&
              this.recurrencePattern.equals(other.getRecurrencePattern()))) &&
            ((this.recurrenceTerms==null && other.getRecurrenceTerms()==null) || 
             (this.recurrenceTerms!=null &&
              this.recurrenceTerms.equals(other.getRecurrenceTerms()))) &&
            ((this.repeatEvery==null && other.getRepeatEvery()==null) || 
             (this.repeatEvery!=null &&
              this.repeatEvery.equals(other.getRepeatEvery()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getApplyToSubtotal() != null) {
            _hashCode += getApplyToSubtotal().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getInArrears() != null) {
            _hashCode += getInArrears().hashCode();
        }
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getInitialTerms() != null) {
            _hashCode += getInitialTerms().hashCode();
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
        if (getIsPublic() != null) {
            _hashCode += getIsPublic().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRecurrenceCount() != null) {
            _hashCode += getRecurrenceCount().hashCode();
        }
        if (getRecurrencePattern() != null) {
            _hashCode += getRecurrencePattern().hashCode();
        }
        if (getRecurrenceTerms() != null) {
            _hashCode += getRecurrenceTerms().hashCode();
        }
        if (getRepeatEvery() != null) {
            _hashCode += getRepeatEvery().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingScheduleSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyToSubtotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyToSubtotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inArrears");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inArrears"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "initialTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPublic"));
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
        elemField.setFieldName("recurrenceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrenceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrencePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrencePattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurrenceTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatEvery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "repeatEvery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
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
