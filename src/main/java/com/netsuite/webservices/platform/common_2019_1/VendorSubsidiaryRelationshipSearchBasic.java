/**
 * VendorSubsidiaryRelationshipSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class VendorSubsidiaryRelationshipSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balanceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField baseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inTransitBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inTransitBalanceBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrimarySub;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField primaryCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrdersBase;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public VendorSubsidiaryRelationshipSearchBasic() {
    }

    public VendorSubsidiaryRelationshipSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balanceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField baseCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inTransitBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inTransitBalanceBase,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrimarySub,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField primaryCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrdersBase,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.balance = balance;
        this.balanceBase = balanceBase;
        this.baseCurrency = baseCurrency;
        this.creditLimit = creditLimit;
        this.entity = entity;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.inTransitBalance = inTransitBalance;
        this.inTransitBalanceBase = inTransitBalanceBase;
        this.isPrimarySub = isPrimarySub;
        this.primaryCurrency = primaryCurrency;
        this.subsidiary = subsidiary;
        this.taxItem = taxItem;
        this.unbilledOrders = unbilledOrders;
        this.unbilledOrdersBase = unbilledOrdersBase;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the balance value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance) {
        this.balance = balance;
    }


    /**
     * Gets the balanceBase value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return balanceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBalanceBase() {
        return balanceBase;
    }


    /**
     * Sets the balanceBase value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param balanceBase
     */
    public void setBalanceBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balanceBase) {
        this.balanceBase = balanceBase;
    }


    /**
     * Gets the baseCurrency value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return baseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * Sets the baseCurrency value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param baseCurrency
     */
    public void setBaseCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField baseCurrency) {
        this.baseCurrency = baseCurrency;
    }


    /**
     * Gets the creditLimit value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return creditLimit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the entity value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity) {
        this.entity = entity;
    }


    /**
     * Gets the externalId value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the inTransitBalance value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return inTransitBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getInTransitBalance() {
        return inTransitBalance;
    }


    /**
     * Sets the inTransitBalance value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param inTransitBalance
     */
    public void setInTransitBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inTransitBalance) {
        this.inTransitBalance = inTransitBalance;
    }


    /**
     * Gets the inTransitBalanceBase value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return inTransitBalanceBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getInTransitBalanceBase() {
        return inTransitBalanceBase;
    }


    /**
     * Sets the inTransitBalanceBase value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param inTransitBalanceBase
     */
    public void setInTransitBalanceBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField inTransitBalanceBase) {
        this.inTransitBalanceBase = inTransitBalanceBase;
    }


    /**
     * Gets the isPrimarySub value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return isPrimarySub
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPrimarySub() {
        return isPrimarySub;
    }


    /**
     * Sets the isPrimarySub value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param isPrimarySub
     */
    public void setIsPrimarySub(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPrimarySub) {
        this.isPrimarySub = isPrimarySub;
    }


    /**
     * Gets the primaryCurrency value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return primaryCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPrimaryCurrency() {
        return primaryCurrency;
    }


    /**
     * Sets the primaryCurrency value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param primaryCurrency
     */
    public void setPrimaryCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField primaryCurrency) {
        this.primaryCurrency = primaryCurrency;
    }


    /**
     * Gets the subsidiary value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxItem value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the unbilledOrders value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return unbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the unbilledOrdersBase value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return unbilledOrdersBase
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnbilledOrdersBase() {
        return unbilledOrdersBase;
    }


    /**
     * Sets the unbilledOrdersBase value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param unbilledOrdersBase
     */
    public void setUnbilledOrdersBase(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrdersBase) {
        this.unbilledOrdersBase = unbilledOrdersBase;
    }


    /**
     * Gets the customFieldList value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this VendorSubsidiaryRelationshipSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorSubsidiaryRelationshipSearchBasic)) return false;
        VendorSubsidiaryRelationshipSearchBasic other = (VendorSubsidiaryRelationshipSearchBasic) obj;
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
              this.balance.equals(other.getBalance()))) &&
            ((this.balanceBase==null && other.getBalanceBase()==null) || 
             (this.balanceBase!=null &&
              this.balanceBase.equals(other.getBalanceBase()))) &&
            ((this.baseCurrency==null && other.getBaseCurrency()==null) || 
             (this.baseCurrency!=null &&
              this.baseCurrency.equals(other.getBaseCurrency()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
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
            ((this.inTransitBalance==null && other.getInTransitBalance()==null) || 
             (this.inTransitBalance!=null &&
              this.inTransitBalance.equals(other.getInTransitBalance()))) &&
            ((this.inTransitBalanceBase==null && other.getInTransitBalanceBase()==null) || 
             (this.inTransitBalanceBase!=null &&
              this.inTransitBalanceBase.equals(other.getInTransitBalanceBase()))) &&
            ((this.isPrimarySub==null && other.getIsPrimarySub()==null) || 
             (this.isPrimarySub!=null &&
              this.isPrimarySub.equals(other.getIsPrimarySub()))) &&
            ((this.primaryCurrency==null && other.getPrimaryCurrency()==null) || 
             (this.primaryCurrency!=null &&
              this.primaryCurrency.equals(other.getPrimaryCurrency()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.unbilledOrdersBase==null && other.getUnbilledOrdersBase()==null) || 
             (this.unbilledOrdersBase!=null &&
              this.unbilledOrdersBase.equals(other.getUnbilledOrdersBase()))) &&
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
            _hashCode += getBalance().hashCode();
        }
        if (getBalanceBase() != null) {
            _hashCode += getBalanceBase().hashCode();
        }
        if (getBaseCurrency() != null) {
            _hashCode += getBaseCurrency().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
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
        if (getInTransitBalance() != null) {
            _hashCode += getInTransitBalance().hashCode();
        }
        if (getInTransitBalanceBase() != null) {
            _hashCode += getInTransitBalanceBase().hashCode();
        }
        if (getIsPrimarySub() != null) {
            _hashCode += getIsPrimarySub().hashCode();
        }
        if (getPrimaryCurrency() != null) {
            _hashCode += getPrimaryCurrency().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getUnbilledOrdersBase() != null) {
            _hashCode += getUnbilledOrdersBase().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorSubsidiaryRelationshipSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSubsidiaryRelationshipSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balanceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entity"));
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
        elemField.setFieldName("inTransitBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inTransitBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inTransitBalanceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inTransitBalanceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimarySub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPrimarySub"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "primaryCurrency"));
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
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledOrdersBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledOrdersBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
