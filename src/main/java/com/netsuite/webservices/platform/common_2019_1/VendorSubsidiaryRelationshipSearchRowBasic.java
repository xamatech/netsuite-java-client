/**
 * VendorSubsidiaryRelationshipSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class VendorSubsidiaryRelationshipSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balancebase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] baseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditlimit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inTransitBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inTransitBalanceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isprimarysub;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] primaryCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxitem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledorders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledordersbase;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public VendorSubsidiaryRelationshipSearchRowBasic() {
    }

    public VendorSubsidiaryRelationshipSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balancebase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] baseCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditlimit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inTransitBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inTransitBalanceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isprimarysub,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] primaryCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxitem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledorders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledordersbase,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.balance = balance;
        this.balancebase = balancebase;
        this.baseCurrency = baseCurrency;
        this.creditlimit = creditlimit;
        this.entity = entity;
        this.externalId = externalId;
        this.internalId = internalId;
        this.inTransitBalance = inTransitBalance;
        this.inTransitBalanceBase = inTransitBalanceBase;
        this.isprimarysub = isprimarysub;
        this.primaryCurrency = primaryCurrency;
        this.subsidiary = subsidiary;
        this.taxitem = taxitem;
        this.unbilledorders = unbilledorders;
        this.unbilledordersbase = unbilledordersbase;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the balance value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this VendorSubsidiaryRelationshipSearchRowBasic.
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
     * Gets the balancebase value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return balancebase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBalancebase() {
        return balancebase;
    }


    /**
     * Sets the balancebase value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param balancebase
     */
    public void setBalancebase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balancebase) {
        this.balancebase = balancebase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBalancebase(int i) {
        return this.balancebase[i];
    }

    public void setBalancebase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.balancebase[i] = _value;
    }


    /**
     * Gets the baseCurrency value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return baseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBaseCurrency(int i) {
        return this.baseCurrency[i];
    }

    public void setBaseCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.baseCurrency[i] = _value;
    }


    /**
     * Gets the creditlimit value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return creditlimit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCreditlimit() {
        return creditlimit;
    }


    /**
     * Sets the creditlimit value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param creditlimit
     */
    public void setCreditlimit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditlimit) {
        this.creditlimit = creditlimit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCreditlimit(int i) {
        return this.creditlimit[i];
    }

    public void setCreditlimit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.creditlimit[i] = _value;
    }


    /**
     * Gets the entity value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the externalId value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this VendorSubsidiaryRelationshipSearchRowBasic.
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
     * Gets the internalId value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this VendorSubsidiaryRelationshipSearchRowBasic.
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
     * Gets the inTransitBalance value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return inTransitBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getInTransitBalance() {
        return inTransitBalance;
    }


    /**
     * Sets the inTransitBalance value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param inTransitBalance
     */
    public void setInTransitBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inTransitBalance) {
        this.inTransitBalance = inTransitBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getInTransitBalance(int i) {
        return this.inTransitBalance[i];
    }

    public void setInTransitBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.inTransitBalance[i] = _value;
    }


    /**
     * Gets the inTransitBalanceBase value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return inTransitBalanceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getInTransitBalanceBase() {
        return inTransitBalanceBase;
    }


    /**
     * Sets the inTransitBalanceBase value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param inTransitBalanceBase
     */
    public void setInTransitBalanceBase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] inTransitBalanceBase) {
        this.inTransitBalanceBase = inTransitBalanceBase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getInTransitBalanceBase(int i) {
        return this.inTransitBalanceBase[i];
    }

    public void setInTransitBalanceBase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.inTransitBalanceBase[i] = _value;
    }


    /**
     * Gets the isprimarysub value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return isprimarysub
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsprimarysub() {
        return isprimarysub;
    }


    /**
     * Sets the isprimarysub value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param isprimarysub
     */
    public void setIsprimarysub(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isprimarysub) {
        this.isprimarysub = isprimarysub;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsprimarysub(int i) {
        return this.isprimarysub[i];
    }

    public void setIsprimarysub(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isprimarysub[i] = _value;
    }


    /**
     * Gets the primaryCurrency value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return primaryCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPrimaryCurrency() {
        return primaryCurrency;
    }


    /**
     * Sets the primaryCurrency value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param primaryCurrency
     */
    public void setPrimaryCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] primaryCurrency) {
        this.primaryCurrency = primaryCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPrimaryCurrency(int i) {
        return this.primaryCurrency[i];
    }

    public void setPrimaryCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.primaryCurrency[i] = _value;
    }


    /**
     * Gets the subsidiary value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this VendorSubsidiaryRelationshipSearchRowBasic.
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
     * Gets the taxitem value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return taxitem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxitem() {
        return taxitem;
    }


    /**
     * Sets the taxitem value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param taxitem
     */
    public void setTaxitem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxitem) {
        this.taxitem = taxitem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxitem(int i) {
        return this.taxitem[i];
    }

    public void setTaxitem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxitem[i] = _value;
    }


    /**
     * Gets the unbilledorders value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return unbilledorders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnbilledorders() {
        return unbilledorders;
    }


    /**
     * Sets the unbilledorders value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param unbilledorders
     */
    public void setUnbilledorders(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledorders) {
        this.unbilledorders = unbilledorders;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnbilledorders(int i) {
        return this.unbilledorders[i];
    }

    public void setUnbilledorders(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unbilledorders[i] = _value;
    }


    /**
     * Gets the unbilledordersbase value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return unbilledordersbase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnbilledordersbase() {
        return unbilledordersbase;
    }


    /**
     * Sets the unbilledordersbase value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param unbilledordersbase
     */
    public void setUnbilledordersbase(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledordersbase) {
        this.unbilledordersbase = unbilledordersbase;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnbilledordersbase(int i) {
        return this.unbilledordersbase[i];
    }

    public void setUnbilledordersbase(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unbilledordersbase[i] = _value;
    }


    /**
     * Gets the customFieldList value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this VendorSubsidiaryRelationshipSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorSubsidiaryRelationshipSearchRowBasic)) return false;
        VendorSubsidiaryRelationshipSearchRowBasic other = (VendorSubsidiaryRelationshipSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.balancebase==null && other.getBalancebase()==null) || 
             (this.balancebase!=null &&
              java.util.Arrays.equals(this.balancebase, other.getBalancebase()))) &&
            ((this.baseCurrency==null && other.getBaseCurrency()==null) || 
             (this.baseCurrency!=null &&
              java.util.Arrays.equals(this.baseCurrency, other.getBaseCurrency()))) &&
            ((this.creditlimit==null && other.getCreditlimit()==null) || 
             (this.creditlimit!=null &&
              java.util.Arrays.equals(this.creditlimit, other.getCreditlimit()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inTransitBalance==null && other.getInTransitBalance()==null) || 
             (this.inTransitBalance!=null &&
              java.util.Arrays.equals(this.inTransitBalance, other.getInTransitBalance()))) &&
            ((this.inTransitBalanceBase==null && other.getInTransitBalanceBase()==null) || 
             (this.inTransitBalanceBase!=null &&
              java.util.Arrays.equals(this.inTransitBalanceBase, other.getInTransitBalanceBase()))) &&
            ((this.isprimarysub==null && other.getIsprimarysub()==null) || 
             (this.isprimarysub!=null &&
              java.util.Arrays.equals(this.isprimarysub, other.getIsprimarysub()))) &&
            ((this.primaryCurrency==null && other.getPrimaryCurrency()==null) || 
             (this.primaryCurrency!=null &&
              java.util.Arrays.equals(this.primaryCurrency, other.getPrimaryCurrency()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.taxitem==null && other.getTaxitem()==null) || 
             (this.taxitem!=null &&
              java.util.Arrays.equals(this.taxitem, other.getTaxitem()))) &&
            ((this.unbilledorders==null && other.getUnbilledorders()==null) || 
             (this.unbilledorders!=null &&
              java.util.Arrays.equals(this.unbilledorders, other.getUnbilledorders()))) &&
            ((this.unbilledordersbase==null && other.getUnbilledordersbase()==null) || 
             (this.unbilledordersbase!=null &&
              java.util.Arrays.equals(this.unbilledordersbase, other.getUnbilledordersbase()))) &&
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
        if (getBalancebase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancebase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalancebase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditlimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditlimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditlimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
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
        if (getInTransitBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInTransitBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInTransitBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInTransitBalanceBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInTransitBalanceBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInTransitBalanceBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsprimarysub() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsprimarysub());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsprimarysub(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryCurrency(), i);
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
        if (getTaxitem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxitem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxitem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnbilledorders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnbilledorders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnbilledorders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnbilledordersbase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnbilledordersbase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnbilledordersbase(), i);
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
        new org.apache.axis.description.TypeDesc(VendorSubsidiaryRelationshipSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSubsidiaryRelationshipSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancebase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balancebase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditlimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditlimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inTransitBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inTransitBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inTransitBalanceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inTransitBalanceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isprimarysub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isprimarysub"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "primaryCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("taxitem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxitem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledorders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledorders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledordersbase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledordersbase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
