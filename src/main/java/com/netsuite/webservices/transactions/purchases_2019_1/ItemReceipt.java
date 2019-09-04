/**
 * ItemReceipt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class ItemReceipt  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.Double exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.lang.String currencyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private java.util.Calendar tranDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef partner;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef inboundShipment;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemFulfillment;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.common_2019_1.types.LandedCostMethod landedCostMethod;

    private java.lang.Boolean landedCostPerLine;

    private com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptItemList itemList;

    private com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptExpenseList expenseList;

    private com.netsuite.webservices.transactions.purchases_2019_1.PurchLandedCostList landedCostsList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ItemReceipt() {
    }

    public ItemReceipt(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.Double exchangeRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.lang.String currencyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           java.util.Calendar tranDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef partner,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef inboundShipment,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemFulfillment,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.common_2019_1.types.LandedCostMethod landedCostMethod,
           java.lang.Boolean landedCostPerLine,
           com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptItemList itemList,
           com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptExpenseList expenseList,
           com.netsuite.webservices.transactions.purchases_2019_1.PurchLandedCostList landedCostsList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.exchangeRate = exchangeRate;
        this.entity = entity;
        this.currencyName = currencyName;
        this.subsidiary = subsidiary;
        this.createdFrom = createdFrom;
        this.tranDate = tranDate;
        this.partner = partner;
        this.postingPeriod = postingPeriod;
        this.tranId = tranId;
        this.inboundShipment = inboundShipment;
        this.memo = memo;
        this.itemFulfillment = itemFulfillment;
        this.currency = currency;
        this.landedCostMethod = landedCostMethod;
        this.landedCostPerLine = landedCostPerLine;
        this.itemList = itemList;
        this.expenseList = expenseList;
        this.landedCostsList = landedCostsList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this ItemReceipt.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ItemReceipt.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this ItemReceipt.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ItemReceipt.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this ItemReceipt.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ItemReceipt.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the exchangeRate value for this ItemReceipt.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this ItemReceipt.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the entity value for this ItemReceipt.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this ItemReceipt.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the currencyName value for this ItemReceipt.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this ItemReceipt.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the subsidiary value for this ItemReceipt.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemReceipt.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the createdFrom value for this ItemReceipt.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this ItemReceipt.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the tranDate value for this ItemReceipt.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this ItemReceipt.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the partner value for this ItemReceipt.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this ItemReceipt.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the postingPeriod value for this ItemReceipt.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this ItemReceipt.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the tranId value for this ItemReceipt.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this ItemReceipt.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the inboundShipment value for this ItemReceipt.
     * 
     * @return inboundShipment
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInboundShipment() {
        return inboundShipment;
    }


    /**
     * Sets the inboundShipment value for this ItemReceipt.
     * 
     * @param inboundShipment
     */
    public void setInboundShipment(com.netsuite.webservices.platform.core_2019_1.RecordRef inboundShipment) {
        this.inboundShipment = inboundShipment;
    }


    /**
     * Gets the memo value for this ItemReceipt.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ItemReceipt.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the itemFulfillment value for this ItemReceipt.
     * 
     * @return itemFulfillment
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemFulfillment() {
        return itemFulfillment;
    }


    /**
     * Sets the itemFulfillment value for this ItemReceipt.
     * 
     * @param itemFulfillment
     */
    public void setItemFulfillment(com.netsuite.webservices.platform.core_2019_1.RecordRef itemFulfillment) {
        this.itemFulfillment = itemFulfillment;
    }


    /**
     * Gets the currency value for this ItemReceipt.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ItemReceipt.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the landedCostMethod value for this ItemReceipt.
     * 
     * @return landedCostMethod
     */
    public com.netsuite.webservices.platform.common_2019_1.types.LandedCostMethod getLandedCostMethod() {
        return landedCostMethod;
    }


    /**
     * Sets the landedCostMethod value for this ItemReceipt.
     * 
     * @param landedCostMethod
     */
    public void setLandedCostMethod(com.netsuite.webservices.platform.common_2019_1.types.LandedCostMethod landedCostMethod) {
        this.landedCostMethod = landedCostMethod;
    }


    /**
     * Gets the landedCostPerLine value for this ItemReceipt.
     * 
     * @return landedCostPerLine
     */
    public java.lang.Boolean getLandedCostPerLine() {
        return landedCostPerLine;
    }


    /**
     * Sets the landedCostPerLine value for this ItemReceipt.
     * 
     * @param landedCostPerLine
     */
    public void setLandedCostPerLine(java.lang.Boolean landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }


    /**
     * Gets the itemList value for this ItemReceipt.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this ItemReceipt.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the expenseList value for this ItemReceipt.
     * 
     * @return expenseList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptExpenseList getExpenseList() {
        return expenseList;
    }


    /**
     * Sets the expenseList value for this ItemReceipt.
     * 
     * @param expenseList
     */
    public void setExpenseList(com.netsuite.webservices.transactions.purchases_2019_1.ItemReceiptExpenseList expenseList) {
        this.expenseList = expenseList;
    }


    /**
     * Gets the landedCostsList value for this ItemReceipt.
     * 
     * @return landedCostsList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.PurchLandedCostList getLandedCostsList() {
        return landedCostsList;
    }


    /**
     * Sets the landedCostsList value for this ItemReceipt.
     * 
     * @param landedCostsList
     */
    public void setLandedCostsList(com.netsuite.webservices.transactions.purchases_2019_1.PurchLandedCostList landedCostsList) {
        this.landedCostsList = landedCostsList;
    }


    /**
     * Gets the accountingBookDetailList value for this ItemReceipt.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this ItemReceipt.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the customFieldList value for this ItemReceipt.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemReceipt.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ItemReceipt.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemReceipt.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ItemReceipt.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemReceipt.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemReceipt)) return false;
        ItemReceipt other = (ItemReceipt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.inboundShipment==null && other.getInboundShipment()==null) || 
             (this.inboundShipment!=null &&
              this.inboundShipment.equals(other.getInboundShipment()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.itemFulfillment==null && other.getItemFulfillment()==null) || 
             (this.itemFulfillment!=null &&
              this.itemFulfillment.equals(other.getItemFulfillment()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.landedCostMethod==null && other.getLandedCostMethod()==null) || 
             (this.landedCostMethod!=null &&
              this.landedCostMethod.equals(other.getLandedCostMethod()))) &&
            ((this.landedCostPerLine==null && other.getLandedCostPerLine()==null) || 
             (this.landedCostPerLine!=null &&
              this.landedCostPerLine.equals(other.getLandedCostPerLine()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.expenseList==null && other.getExpenseList()==null) || 
             (this.expenseList!=null &&
              this.expenseList.equals(other.getExpenseList()))) &&
            ((this.landedCostsList==null && other.getLandedCostsList()==null) || 
             (this.landedCostsList!=null &&
              this.landedCostsList.equals(other.getLandedCostsList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getInboundShipment() != null) {
            _hashCode += getInboundShipment().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getItemFulfillment() != null) {
            _hashCode += getItemFulfillment().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getLandedCostMethod() != null) {
            _hashCode += getLandedCostMethod().hashCode();
        }
        if (getLandedCostPerLine() != null) {
            _hashCode += getLandedCostPerLine().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getExpenseList() != null) {
            _hashCode += getExpenseList().hashCode();
        }
        if (getLandedCostsList() != null) {
            _hashCode += getLandedCostsList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemReceipt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "ItemReceipt"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "inboundShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFulfillment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemFulfillment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "LandedCostMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "ItemReceiptItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "ItemReceiptExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchLandedCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
