/**
 * GiftCertificateSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class GiftCertificateSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountAvailableBilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expirationDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incomeAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isActive;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField liabilityAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField message;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField originalAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField purchaseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField sender;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public GiftCertificateSearchBasic() {
    }

    public GiftCertificateSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountAvailableBilled,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountRemaining,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField expirationDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertCode,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incomeAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isActive,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField liabilityAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField message,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField originalAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField purchaseDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField sender,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.amountAvailableBilled = amountAvailableBilled;
        this.amountRemaining = amountRemaining;
        this.createdDate = createdDate;
        this.email = email;
        this.expirationDate = expirationDate;
        this.giftCertCode = giftCertCode;
        this.incomeAccount = incomeAccount;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isActive = isActive;
        this.item = item;
        this.liabilityAccount = liabilityAccount;
        this.message = message;
        this.name = name;
        this.originalAmount = originalAmount;
        this.purchaseDate = purchaseDate;
        this.sender = sender;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amountAvailableBilled value for this GiftCertificateSearchBasic.
     * 
     * @return amountAvailableBilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmountAvailableBilled() {
        return amountAvailableBilled;
    }


    /**
     * Sets the amountAvailableBilled value for this GiftCertificateSearchBasic.
     * 
     * @param amountAvailableBilled
     */
    public void setAmountAvailableBilled(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountAvailableBilled) {
        this.amountAvailableBilled = amountAvailableBilled;
    }


    /**
     * Gets the amountRemaining value for this GiftCertificateSearchBasic.
     * 
     * @return amountRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this GiftCertificateSearchBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }


    /**
     * Gets the createdDate value for this GiftCertificateSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this GiftCertificateSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email value for this GiftCertificateSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GiftCertificateSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the expirationDate value for this GiftCertificateSearchBasic.
     * 
     * @return expirationDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this GiftCertificateSearchBasic.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the giftCertCode value for this GiftCertificateSearchBasic.
     * 
     * @return giftCertCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertCode() {
        return giftCertCode;
    }


    /**
     * Sets the giftCertCode value for this GiftCertificateSearchBasic.
     * 
     * @param giftCertCode
     */
    public void setGiftCertCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertCode) {
        this.giftCertCode = giftCertCode;
    }


    /**
     * Gets the incomeAccount value for this GiftCertificateSearchBasic.
     * 
     * @return incomeAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this GiftCertificateSearchBasic.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the internalId value for this GiftCertificateSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this GiftCertificateSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this GiftCertificateSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this GiftCertificateSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isActive value for this GiftCertificateSearchBasic.
     * 
     * @return isActive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this GiftCertificateSearchBasic.
     * 
     * @param isActive
     */
    public void setIsActive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the item value for this GiftCertificateSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this GiftCertificateSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the liabilityAccount value for this GiftCertificateSearchBasic.
     * 
     * @return liabilityAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLiabilityAccount() {
        return liabilityAccount;
    }


    /**
     * Sets the liabilityAccount value for this GiftCertificateSearchBasic.
     * 
     * @param liabilityAccount
     */
    public void setLiabilityAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }


    /**
     * Gets the message value for this GiftCertificateSearchBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GiftCertificateSearchBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the name value for this GiftCertificateSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this GiftCertificateSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the originalAmount value for this GiftCertificateSearchBasic.
     * 
     * @return originalAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOriginalAmount() {
        return originalAmount;
    }


    /**
     * Sets the originalAmount value for this GiftCertificateSearchBasic.
     * 
     * @param originalAmount
     */
    public void setOriginalAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField originalAmount) {
        this.originalAmount = originalAmount;
    }


    /**
     * Gets the purchaseDate value for this GiftCertificateSearchBasic.
     * 
     * @return purchaseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this GiftCertificateSearchBasic.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the sender value for this GiftCertificateSearchBasic.
     * 
     * @return sender
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this GiftCertificateSearchBasic.
     * 
     * @param sender
     */
    public void setSender(com.netsuite.webservices.platform.core_2019_1.SearchStringField sender) {
        this.sender = sender;
    }


    /**
     * Gets the customFieldList value for this GiftCertificateSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this GiftCertificateSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertificateSearchBasic)) return false;
        GiftCertificateSearchBasic other = (GiftCertificateSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountAvailableBilled==null && other.getAmountAvailableBilled()==null) || 
             (this.amountAvailableBilled!=null &&
              this.amountAvailableBilled.equals(other.getAmountAvailableBilled()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              this.amountRemaining.equals(other.getAmountRemaining()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.giftCertCode==null && other.getGiftCertCode()==null) || 
             (this.giftCertCode!=null &&
              this.giftCertCode.equals(other.getGiftCertCode()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              this.incomeAccount.equals(other.getIncomeAccount()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.liabilityAccount==null && other.getLiabilityAccount()==null) || 
             (this.liabilityAccount!=null &&
              this.liabilityAccount.equals(other.getLiabilityAccount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.originalAmount==null && other.getOriginalAmount()==null) || 
             (this.originalAmount!=null &&
              this.originalAmount.equals(other.getOriginalAmount()))) &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
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
        if (getAmountAvailableBilled() != null) {
            _hashCode += getAmountAvailableBilled().hashCode();
        }
        if (getAmountRemaining() != null) {
            _hashCode += getAmountRemaining().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getGiftCertCode() != null) {
            _hashCode += getGiftCertCode().hashCode();
        }
        if (getIncomeAccount() != null) {
            _hashCode += getIncomeAccount().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLiabilityAccount() != null) {
            _hashCode += getLiabilityAccount().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOriginalAmount() != null) {
            _hashCode += getOriginalAmount().hashCode();
        }
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftCertificateSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "GiftCertificateSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAvailableBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountAvailableBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incomeAccount"));
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
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
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
        elemField.setFieldName("originalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "originalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
