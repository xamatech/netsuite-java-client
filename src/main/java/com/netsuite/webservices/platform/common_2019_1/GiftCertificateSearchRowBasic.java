/**
 * GiftCertificateSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class GiftCertificateSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amtAvailBilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expirationDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcActive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] incomeAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] liabilityAcct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] originalAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] purchaseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] sender;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public GiftCertificateSearchRowBasic() {
    }

    public GiftCertificateSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountRemaining,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amtAvailBilled,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expirationDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcActive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] incomeAcct,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] liabilityAcct,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] originalAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] purchaseDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] sender,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.amountRemaining = amountRemaining;
        this.amtAvailBilled = amtAvailBilled;
        this.createdDate = createdDate;
        this.email = email;
        this.expirationDate = expirationDate;
        this.gcActive = gcActive;
        this.giftCertCode = giftCertCode;
        this.incomeAcct = incomeAcct;
        this.internalId = internalId;
        this.item = item;
        this.liabilityAcct = liabilityAcct;
        this.message = message;
        this.name = name;
        this.originalAmount = originalAmount;
        this.purchaseDate = purchaseDate;
        this.sender = sender;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amountRemaining value for this GiftCertificateSearchRowBasic.
     * 
     * @return amountRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this GiftCertificateSearchRowBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }


    /**
     * Gets the amtAvailBilled value for this GiftCertificateSearchRowBasic.
     * 
     * @return amtAvailBilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmtAvailBilled() {
        return amtAvailBilled;
    }


    /**
     * Sets the amtAvailBilled value for this GiftCertificateSearchRowBasic.
     * 
     * @param amtAvailBilled
     */
    public void setAmtAvailBilled(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amtAvailBilled) {
        this.amtAvailBilled = amtAvailBilled;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmtAvailBilled(int i) {
        return this.amtAvailBilled[i];
    }

    public void setAmtAvailBilled(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amtAvailBilled[i] = _value;
    }


    /**
     * Gets the createdDate value for this GiftCertificateSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this GiftCertificateSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the email value for this GiftCertificateSearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GiftCertificateSearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email) {
        this.email = email;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the expirationDate value for this GiftCertificateSearchRowBasic.
     * 
     * @return expirationDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this GiftCertificateSearchRowBasic.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expirationDate) {
        this.expirationDate = expirationDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpirationDate(int i) {
        return this.expirationDate[i];
    }

    public void setExpirationDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expirationDate[i] = _value;
    }


    /**
     * Gets the gcActive value for this GiftCertificateSearchRowBasic.
     * 
     * @return gcActive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGcActive() {
        return gcActive;
    }


    /**
     * Sets the gcActive value for this GiftCertificateSearchRowBasic.
     * 
     * @param gcActive
     */
    public void setGcActive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcActive) {
        this.gcActive = gcActive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getGcActive(int i) {
        return this.gcActive[i];
    }

    public void setGcActive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.gcActive[i] = _value;
    }


    /**
     * Gets the giftCertCode value for this GiftCertificateSearchRowBasic.
     * 
     * @return giftCertCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCertCode() {
        return giftCertCode;
    }


    /**
     * Sets the giftCertCode value for this GiftCertificateSearchRowBasic.
     * 
     * @param giftCertCode
     */
    public void setGiftCertCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCertCode) {
        this.giftCertCode = giftCertCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCertCode(int i) {
        return this.giftCertCode[i];
    }

    public void setGiftCertCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCertCode[i] = _value;
    }


    /**
     * Gets the incomeAcct value for this GiftCertificateSearchRowBasic.
     * 
     * @return incomeAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getIncomeAcct() {
        return incomeAcct;
    }


    /**
     * Sets the incomeAcct value for this GiftCertificateSearchRowBasic.
     * 
     * @param incomeAcct
     */
    public void setIncomeAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] incomeAcct) {
        this.incomeAcct = incomeAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getIncomeAcct(int i) {
        return this.incomeAcct[i];
    }

    public void setIncomeAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.incomeAcct[i] = _value;
    }


    /**
     * Gets the internalId value for this GiftCertificateSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this GiftCertificateSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the item value for this GiftCertificateSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this GiftCertificateSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the liabilityAcct value for this GiftCertificateSearchRowBasic.
     * 
     * @return liabilityAcct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLiabilityAcct() {
        return liabilityAcct;
    }


    /**
     * Sets the liabilityAcct value for this GiftCertificateSearchRowBasic.
     * 
     * @param liabilityAcct
     */
    public void setLiabilityAcct(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] liabilityAcct) {
        this.liabilityAcct = liabilityAcct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLiabilityAcct(int i) {
        return this.liabilityAcct[i];
    }

    public void setLiabilityAcct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.liabilityAcct[i] = _value;
    }


    /**
     * Gets the message value for this GiftCertificateSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GiftCertificateSearchRowBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message) {
        this.message = message;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.message[i] = _value;
    }


    /**
     * Gets the name value for this GiftCertificateSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this GiftCertificateSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the originalAmount value for this GiftCertificateSearchRowBasic.
     * 
     * @return originalAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOriginalAmount() {
        return originalAmount;
    }


    /**
     * Sets the originalAmount value for this GiftCertificateSearchRowBasic.
     * 
     * @param originalAmount
     */
    public void setOriginalAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] originalAmount) {
        this.originalAmount = originalAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOriginalAmount(int i) {
        return this.originalAmount[i];
    }

    public void setOriginalAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.originalAmount[i] = _value;
    }


    /**
     * Gets the purchaseDate value for this GiftCertificateSearchRowBasic.
     * 
     * @return purchaseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this GiftCertificateSearchRowBasic.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getPurchaseDate(int i) {
        return this.purchaseDate[i];
    }

    public void setPurchaseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.purchaseDate[i] = _value;
    }


    /**
     * Gets the sender value for this GiftCertificateSearchRowBasic.
     * 
     * @return sender
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this GiftCertificateSearchRowBasic.
     * 
     * @param sender
     */
    public void setSender(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] sender) {
        this.sender = sender;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSender(int i) {
        return this.sender[i];
    }

    public void setSender(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.sender[i] = _value;
    }


    /**
     * Gets the customFieldList value for this GiftCertificateSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this GiftCertificateSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertificateSearchRowBasic)) return false;
        GiftCertificateSearchRowBasic other = (GiftCertificateSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              java.util.Arrays.equals(this.amountRemaining, other.getAmountRemaining()))) &&
            ((this.amtAvailBilled==null && other.getAmtAvailBilled()==null) || 
             (this.amtAvailBilled!=null &&
              java.util.Arrays.equals(this.amtAvailBilled, other.getAmtAvailBilled()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              java.util.Arrays.equals(this.expirationDate, other.getExpirationDate()))) &&
            ((this.gcActive==null && other.getGcActive()==null) || 
             (this.gcActive!=null &&
              java.util.Arrays.equals(this.gcActive, other.getGcActive()))) &&
            ((this.giftCertCode==null && other.getGiftCertCode()==null) || 
             (this.giftCertCode!=null &&
              java.util.Arrays.equals(this.giftCertCode, other.getGiftCertCode()))) &&
            ((this.incomeAcct==null && other.getIncomeAcct()==null) || 
             (this.incomeAcct!=null &&
              java.util.Arrays.equals(this.incomeAcct, other.getIncomeAcct()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.liabilityAcct==null && other.getLiabilityAcct()==null) || 
             (this.liabilityAcct!=null &&
              java.util.Arrays.equals(this.liabilityAcct, other.getLiabilityAcct()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.originalAmount==null && other.getOriginalAmount()==null) || 
             (this.originalAmount!=null &&
              java.util.Arrays.equals(this.originalAmount, other.getOriginalAmount()))) &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              java.util.Arrays.equals(this.purchaseDate, other.getPurchaseDate()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              java.util.Arrays.equals(this.sender, other.getSender()))) &&
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
        if (getAmountRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountRemaining(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmtAvailBilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmtAvailBilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmtAvailBilled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirationDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpirationDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpirationDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcActive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcActive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcActive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncomeAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncomeAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncomeAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiabilityAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiabilityAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiabilityAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginalAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginalAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginalAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSender() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSender());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSender(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftCertificateSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "GiftCertificateSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amtAvailBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amtAvailBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incomeAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "liabilityAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "originalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
