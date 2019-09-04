/**
 * ConsolidatedExchangeRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ConsolidatedExchangeRate  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String postingPeriod;

    private java.lang.String fromSubsidiary;

    private java.lang.String fromCurrency;

    private java.lang.String toSubsidiary;

    private java.lang.String toCurrency;

    private java.lang.Double averageRate;

    private java.lang.Double currentRate;

    private java.lang.Double historicalRate;

    private java.lang.String accountingBook;

    private java.lang.Boolean isPeriodClosed;

    private java.lang.Boolean isDerived;

    private java.lang.Boolean isEliminationSubsidiary;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ConsolidatedExchangeRate() {
    }

    public ConsolidatedExchangeRate(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String postingPeriod,
           java.lang.String fromSubsidiary,
           java.lang.String fromCurrency,
           java.lang.String toSubsidiary,
           java.lang.String toCurrency,
           java.lang.Double averageRate,
           java.lang.Double currentRate,
           java.lang.Double historicalRate,
           java.lang.String accountingBook,
           java.lang.Boolean isPeriodClosed,
           java.lang.Boolean isDerived,
           java.lang.Boolean isEliminationSubsidiary) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.postingPeriod = postingPeriod;
        this.fromSubsidiary = fromSubsidiary;
        this.fromCurrency = fromCurrency;
        this.toSubsidiary = toSubsidiary;
        this.toCurrency = toCurrency;
        this.averageRate = averageRate;
        this.currentRate = currentRate;
        this.historicalRate = historicalRate;
        this.accountingBook = accountingBook;
        this.isPeriodClosed = isPeriodClosed;
        this.isDerived = isDerived;
        this.isEliminationSubsidiary = isEliminationSubsidiary;
    }


    /**
     * Gets the postingPeriod value for this ConsolidatedExchangeRate.
     * 
     * @return postingPeriod
     */
    public java.lang.String getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this ConsolidatedExchangeRate.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(java.lang.String postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the fromSubsidiary value for this ConsolidatedExchangeRate.
     * 
     * @return fromSubsidiary
     */
    public java.lang.String getFromSubsidiary() {
        return fromSubsidiary;
    }


    /**
     * Sets the fromSubsidiary value for this ConsolidatedExchangeRate.
     * 
     * @param fromSubsidiary
     */
    public void setFromSubsidiary(java.lang.String fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }


    /**
     * Gets the fromCurrency value for this ConsolidatedExchangeRate.
     * 
     * @return fromCurrency
     */
    public java.lang.String getFromCurrency() {
        return fromCurrency;
    }


    /**
     * Sets the fromCurrency value for this ConsolidatedExchangeRate.
     * 
     * @param fromCurrency
     */
    public void setFromCurrency(java.lang.String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }


    /**
     * Gets the toSubsidiary value for this ConsolidatedExchangeRate.
     * 
     * @return toSubsidiary
     */
    public java.lang.String getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this ConsolidatedExchangeRate.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(java.lang.String toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the toCurrency value for this ConsolidatedExchangeRate.
     * 
     * @return toCurrency
     */
    public java.lang.String getToCurrency() {
        return toCurrency;
    }


    /**
     * Sets the toCurrency value for this ConsolidatedExchangeRate.
     * 
     * @param toCurrency
     */
    public void setToCurrency(java.lang.String toCurrency) {
        this.toCurrency = toCurrency;
    }


    /**
     * Gets the averageRate value for this ConsolidatedExchangeRate.
     * 
     * @return averageRate
     */
    public java.lang.Double getAverageRate() {
        return averageRate;
    }


    /**
     * Sets the averageRate value for this ConsolidatedExchangeRate.
     * 
     * @param averageRate
     */
    public void setAverageRate(java.lang.Double averageRate) {
        this.averageRate = averageRate;
    }


    /**
     * Gets the currentRate value for this ConsolidatedExchangeRate.
     * 
     * @return currentRate
     */
    public java.lang.Double getCurrentRate() {
        return currentRate;
    }


    /**
     * Sets the currentRate value for this ConsolidatedExchangeRate.
     * 
     * @param currentRate
     */
    public void setCurrentRate(java.lang.Double currentRate) {
        this.currentRate = currentRate;
    }


    /**
     * Gets the historicalRate value for this ConsolidatedExchangeRate.
     * 
     * @return historicalRate
     */
    public java.lang.Double getHistoricalRate() {
        return historicalRate;
    }


    /**
     * Sets the historicalRate value for this ConsolidatedExchangeRate.
     * 
     * @param historicalRate
     */
    public void setHistoricalRate(java.lang.Double historicalRate) {
        this.historicalRate = historicalRate;
    }


    /**
     * Gets the accountingBook value for this ConsolidatedExchangeRate.
     * 
     * @return accountingBook
     */
    public java.lang.String getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ConsolidatedExchangeRate.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(java.lang.String accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the isPeriodClosed value for this ConsolidatedExchangeRate.
     * 
     * @return isPeriodClosed
     */
    public java.lang.Boolean getIsPeriodClosed() {
        return isPeriodClosed;
    }


    /**
     * Sets the isPeriodClosed value for this ConsolidatedExchangeRate.
     * 
     * @param isPeriodClosed
     */
    public void setIsPeriodClosed(java.lang.Boolean isPeriodClosed) {
        this.isPeriodClosed = isPeriodClosed;
    }


    /**
     * Gets the isDerived value for this ConsolidatedExchangeRate.
     * 
     * @return isDerived
     */
    public java.lang.Boolean getIsDerived() {
        return isDerived;
    }


    /**
     * Sets the isDerived value for this ConsolidatedExchangeRate.
     * 
     * @param isDerived
     */
    public void setIsDerived(java.lang.Boolean isDerived) {
        this.isDerived = isDerived;
    }


    /**
     * Gets the isEliminationSubsidiary value for this ConsolidatedExchangeRate.
     * 
     * @return isEliminationSubsidiary
     */
    public java.lang.Boolean getIsEliminationSubsidiary() {
        return isEliminationSubsidiary;
    }


    /**
     * Sets the isEliminationSubsidiary value for this ConsolidatedExchangeRate.
     * 
     * @param isEliminationSubsidiary
     */
    public void setIsEliminationSubsidiary(java.lang.Boolean isEliminationSubsidiary) {
        this.isEliminationSubsidiary = isEliminationSubsidiary;
    }


    /**
     * Gets the internalId value for this ConsolidatedExchangeRate.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ConsolidatedExchangeRate.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ConsolidatedExchangeRate.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ConsolidatedExchangeRate.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRate)) return false;
        ConsolidatedExchangeRate other = (ConsolidatedExchangeRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.fromSubsidiary==null && other.getFromSubsidiary()==null) || 
             (this.fromSubsidiary!=null &&
              this.fromSubsidiary.equals(other.getFromSubsidiary()))) &&
            ((this.fromCurrency==null && other.getFromCurrency()==null) || 
             (this.fromCurrency!=null &&
              this.fromCurrency.equals(other.getFromCurrency()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              this.toSubsidiary.equals(other.getToSubsidiary()))) &&
            ((this.toCurrency==null && other.getToCurrency()==null) || 
             (this.toCurrency!=null &&
              this.toCurrency.equals(other.getToCurrency()))) &&
            ((this.averageRate==null && other.getAverageRate()==null) || 
             (this.averageRate!=null &&
              this.averageRate.equals(other.getAverageRate()))) &&
            ((this.currentRate==null && other.getCurrentRate()==null) || 
             (this.currentRate!=null &&
              this.currentRate.equals(other.getCurrentRate()))) &&
            ((this.historicalRate==null && other.getHistoricalRate()==null) || 
             (this.historicalRate!=null &&
              this.historicalRate.equals(other.getHistoricalRate()))) &&
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              this.accountingBook.equals(other.getAccountingBook()))) &&
            ((this.isPeriodClosed==null && other.getIsPeriodClosed()==null) || 
             (this.isPeriodClosed!=null &&
              this.isPeriodClosed.equals(other.getIsPeriodClosed()))) &&
            ((this.isDerived==null && other.getIsDerived()==null) || 
             (this.isDerived!=null &&
              this.isDerived.equals(other.getIsDerived()))) &&
            ((this.isEliminationSubsidiary==null && other.getIsEliminationSubsidiary()==null) || 
             (this.isEliminationSubsidiary!=null &&
              this.isEliminationSubsidiary.equals(other.getIsEliminationSubsidiary()))) &&
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
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getFromSubsidiary() != null) {
            _hashCode += getFromSubsidiary().hashCode();
        }
        if (getFromCurrency() != null) {
            _hashCode += getFromCurrency().hashCode();
        }
        if (getToSubsidiary() != null) {
            _hashCode += getToSubsidiary().hashCode();
        }
        if (getToCurrency() != null) {
            _hashCode += getToCurrency().hashCode();
        }
        if (getAverageRate() != null) {
            _hashCode += getAverageRate().hashCode();
        }
        if (getCurrentRate() != null) {
            _hashCode += getCurrentRate().hashCode();
        }
        if (getHistoricalRate() != null) {
            _hashCode += getHistoricalRate().hashCode();
        }
        if (getAccountingBook() != null) {
            _hashCode += getAccountingBook().hashCode();
        }
        if (getIsPeriodClosed() != null) {
            _hashCode += getIsPeriodClosed().hashCode();
        }
        if (getIsDerived() != null) {
            _hashCode += getIsDerived().hashCode();
        }
        if (getIsEliminationSubsidiary() != null) {
            _hashCode += getIsEliminationSubsidiary().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConsolidatedExchangeRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRate"));
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
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fromCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "toCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "averageRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currentRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "historicalRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPeriodClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isPeriodClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDerived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isDerived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEliminationSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isEliminationSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
