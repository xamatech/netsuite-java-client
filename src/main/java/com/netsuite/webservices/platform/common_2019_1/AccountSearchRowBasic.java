/**
 * AccountSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AccountSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingContext;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] cashFlowRateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category1099Misc;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] generalRateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] legalName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locale;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedLegalName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] number;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public AccountSearchRowBasic() {
    }

    public AccountSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingContext,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] cashFlowRateType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category1099Misc,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] generalRateType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] legalName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locale,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedLegalName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] number,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.accountingContext = accountingContext;
        this.balance = balance;
        this.cashFlowRateType = cashFlowRateType;
        this.category1099Misc = category1099Misc;
        this.description = description;
        this.externalId = externalId;
        this.generalRateType = generalRateType;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.locale = locale;
        this.localizedLegalName = localizedLegalName;
        this.localizedName = localizedName;
        this.localizedNumber = localizedNumber;
        this.name = name;
        this.number = number;
        this.subsidiary = subsidiary;
        this.type = type;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountingContext value for this AccountSearchRowBasic.
     * 
     * @return accountingContext
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccountingContext() {
        return accountingContext;
    }


    /**
     * Sets the accountingContext value for this AccountSearchRowBasic.
     * 
     * @param accountingContext
     */
    public void setAccountingContext(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingContext) {
        this.accountingContext = accountingContext;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccountingContext(int i) {
        return this.accountingContext[i];
    }

    public void setAccountingContext(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.accountingContext[i] = _value;
    }


    /**
     * Gets the balance value for this AccountSearchRowBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AccountSearchRowBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the cashFlowRateType value for this AccountSearchRowBasic.
     * 
     * @return cashFlowRateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCashFlowRateType() {
        return cashFlowRateType;
    }


    /**
     * Sets the cashFlowRateType value for this AccountSearchRowBasic.
     * 
     * @param cashFlowRateType
     */
    public void setCashFlowRateType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] cashFlowRateType) {
        this.cashFlowRateType = cashFlowRateType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCashFlowRateType(int i) {
        return this.cashFlowRateType[i];
    }

    public void setCashFlowRateType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.cashFlowRateType[i] = _value;
    }


    /**
     * Gets the category1099Misc value for this AccountSearchRowBasic.
     * 
     * @return category1099Misc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCategory1099Misc() {
        return category1099Misc;
    }


    /**
     * Sets the category1099Misc value for this AccountSearchRowBasic.
     * 
     * @param category1099Misc
     */
    public void setCategory1099Misc(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category1099Misc) {
        this.category1099Misc = category1099Misc;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCategory1099Misc(int i) {
        return this.category1099Misc[i];
    }

    public void setCategory1099Misc(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.category1099Misc[i] = _value;
    }


    /**
     * Gets the description value for this AccountSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the externalId value for this AccountSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AccountSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the generalRateType value for this AccountSearchRowBasic.
     * 
     * @return generalRateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGeneralRateType() {
        return generalRateType;
    }


    /**
     * Sets the generalRateType value for this AccountSearchRowBasic.
     * 
     * @param generalRateType
     */
    public void setGeneralRateType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] generalRateType) {
        this.generalRateType = generalRateType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getGeneralRateType(int i) {
        return this.generalRateType[i];
    }

    public void setGeneralRateType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.generalRateType[i] = _value;
    }


    /**
     * Gets the internalId value for this AccountSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountSearchRowBasic.
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
     * Gets the isInactive value for this AccountSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the legalName value for this AccountSearchRowBasic.
     * 
     * @return legalName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this AccountSearchRowBasic.
     * 
     * @param legalName
     */
    public void setLegalName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] legalName) {
        this.legalName = legalName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLegalName(int i) {
        return this.legalName[i];
    }

    public void setLegalName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.legalName[i] = _value;
    }


    /**
     * Gets the locale value for this AccountSearchRowBasic.
     * 
     * @return locale
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this AccountSearchRowBasic.
     * 
     * @param locale
     */
    public void setLocale(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] locale) {
        this.locale = locale;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocale(int i) {
        return this.locale[i];
    }

    public void setLocale(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.locale[i] = _value;
    }


    /**
     * Gets the localizedLegalName value for this AccountSearchRowBasic.
     * 
     * @return localizedLegalName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocalizedLegalName() {
        return localizedLegalName;
    }


    /**
     * Sets the localizedLegalName value for this AccountSearchRowBasic.
     * 
     * @param localizedLegalName
     */
    public void setLocalizedLegalName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedLegalName) {
        this.localizedLegalName = localizedLegalName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocalizedLegalName(int i) {
        return this.localizedLegalName[i];
    }

    public void setLocalizedLegalName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.localizedLegalName[i] = _value;
    }


    /**
     * Gets the localizedName value for this AccountSearchRowBasic.
     * 
     * @return localizedName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocalizedName() {
        return localizedName;
    }


    /**
     * Sets the localizedName value for this AccountSearchRowBasic.
     * 
     * @param localizedName
     */
    public void setLocalizedName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedName) {
        this.localizedName = localizedName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocalizedName(int i) {
        return this.localizedName[i];
    }

    public void setLocalizedName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.localizedName[i] = _value;
    }


    /**
     * Gets the localizedNumber value for this AccountSearchRowBasic.
     * 
     * @return localizedNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLocalizedNumber() {
        return localizedNumber;
    }


    /**
     * Sets the localizedNumber value for this AccountSearchRowBasic.
     * 
     * @param localizedNumber
     */
    public void setLocalizedNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] localizedNumber) {
        this.localizedNumber = localizedNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLocalizedNumber(int i) {
        return this.localizedNumber[i];
    }

    public void setLocalizedNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.localizedNumber[i] = _value;
    }


    /**
     * Gets the name value for this AccountSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountSearchRowBasic.
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
     * Gets the number value for this AccountSearchRowBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AccountSearchRowBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] number) {
        this.number = number;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNumber(int i) {
        return this.number[i];
    }

    public void setNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.number[i] = _value;
    }


    /**
     * Gets the subsidiary value for this AccountSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AccountSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the type value for this AccountSearchRowBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this AccountSearchRowBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the customFieldList value for this AccountSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AccountSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSearchRowBasic)) return false;
        AccountSearchRowBasic other = (AccountSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.accountingContext, other.getAccountingContext()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.cashFlowRateType==null && other.getCashFlowRateType()==null) || 
             (this.cashFlowRateType!=null &&
              java.util.Arrays.equals(this.cashFlowRateType, other.getCashFlowRateType()))) &&
            ((this.category1099Misc==null && other.getCategory1099Misc()==null) || 
             (this.category1099Misc!=null &&
              java.util.Arrays.equals(this.category1099Misc, other.getCategory1099Misc()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.generalRateType==null && other.getGeneralRateType()==null) || 
             (this.generalRateType!=null &&
              java.util.Arrays.equals(this.generalRateType, other.getGeneralRateType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              java.util.Arrays.equals(this.legalName, other.getLegalName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              java.util.Arrays.equals(this.locale, other.getLocale()))) &&
            ((this.localizedLegalName==null && other.getLocalizedLegalName()==null) || 
             (this.localizedLegalName!=null &&
              java.util.Arrays.equals(this.localizedLegalName, other.getLocalizedLegalName()))) &&
            ((this.localizedName==null && other.getLocalizedName()==null) || 
             (this.localizedName!=null &&
              java.util.Arrays.equals(this.localizedName, other.getLocalizedName()))) &&
            ((this.localizedNumber==null && other.getLocalizedNumber()==null) || 
             (this.localizedNumber!=null &&
              java.util.Arrays.equals(this.localizedNumber, other.getLocalizedNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              java.util.Arrays.equals(this.number, other.getNumber()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCashFlowRateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCashFlowRateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCashFlowRateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory1099Misc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory1099Misc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory1099Misc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeneralRateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneralRateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralRateType(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegalName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegalName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegalName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocale() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocale());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocale(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalizedLegalName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedLegalName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedLegalName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalizedName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalizedNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedNumber(), i);
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
        if (getNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(AccountSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashFlowRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cashFlowRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category1099Misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "generalRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedLegalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "localizedLegalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "localizedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "localizedNumber"));
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
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
