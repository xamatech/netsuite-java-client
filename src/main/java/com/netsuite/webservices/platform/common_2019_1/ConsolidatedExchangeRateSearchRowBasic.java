/**
 * ConsolidatedExchangeRateSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ConsolidatedExchangeRateSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingBook;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] averageRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] closed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currentRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fromCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fromSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] historicalRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] periodEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] periodName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] periodStartDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] toCurrency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] toSubsidiary;

    public ConsolidatedExchangeRateSearchRowBasic() {
    }

    public ConsolidatedExchangeRateSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingBook,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] averageRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] closed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currentRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fromCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fromSubsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] historicalRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] periodEndDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] periodName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] periodStartDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] toCurrency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] toSubsidiary) {
        this.accountingBook = accountingBook;
        this.averageRate = averageRate;
        this.closed = closed;
        this.currentRate = currentRate;
        this.externalId = externalId;
        this.fromCurrency = fromCurrency;
        this.fromSubsidiary = fromSubsidiary;
        this.historicalRate = historicalRate;
        this.internalId = internalId;
        this.periodEndDate = periodEndDate;
        this.periodName = periodName;
        this.periodStartDate = periodStartDate;
        this.toCurrency = toCurrency;
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the accountingBook value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.accountingBook[i] = _value;
    }


    /**
     * Gets the averageRate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return averageRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAverageRate() {
        return averageRate;
    }


    /**
     * Sets the averageRate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param averageRate
     */
    public void setAverageRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] averageRate) {
        this.averageRate = averageRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAverageRate(int i) {
        return this.averageRate[i];
    }

    public void setAverageRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.averageRate[i] = _value;
    }


    /**
     * Gets the closed value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return closed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param closed
     */
    public void setClosed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.closed[i] = _value;
    }


    /**
     * Gets the currentRate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return currentRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCurrentRate() {
        return currentRate;
    }


    /**
     * Sets the currentRate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param currentRate
     */
    public void setCurrentRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] currentRate) {
        this.currentRate = currentRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCurrentRate(int i) {
        return this.currentRate[i];
    }

    public void setCurrentRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.currentRate[i] = _value;
    }


    /**
     * Gets the externalId value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ConsolidatedExchangeRateSearchRowBasic.
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
     * Gets the fromCurrency value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return fromCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFromCurrency() {
        return fromCurrency;
    }


    /**
     * Sets the fromCurrency value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param fromCurrency
     */
    public void setFromCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFromCurrency(int i) {
        return this.fromCurrency[i];
    }

    public void setFromCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.fromCurrency[i] = _value;
    }


    /**
     * Gets the fromSubsidiary value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return fromSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFromSubsidiary() {
        return fromSubsidiary;
    }


    /**
     * Sets the fromSubsidiary value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param fromSubsidiary
     */
    public void setFromSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFromSubsidiary(int i) {
        return this.fromSubsidiary[i];
    }

    public void setFromSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.fromSubsidiary[i] = _value;
    }


    /**
     * Gets the historicalRate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return historicalRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHistoricalRate() {
        return historicalRate;
    }


    /**
     * Sets the historicalRate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param historicalRate
     */
    public void setHistoricalRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] historicalRate) {
        this.historicalRate = historicalRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getHistoricalRate(int i) {
        return this.historicalRate[i];
    }

    public void setHistoricalRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.historicalRate[i] = _value;
    }


    /**
     * Gets the internalId value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ConsolidatedExchangeRateSearchRowBasic.
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
     * Gets the periodEndDate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return periodEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getPeriodEndDate() {
        return periodEndDate;
    }


    /**
     * Sets the periodEndDate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param periodEndDate
     */
    public void setPeriodEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getPeriodEndDate(int i) {
        return this.periodEndDate[i];
    }

    public void setPeriodEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.periodEndDate[i] = _value;
    }


    /**
     * Gets the periodName value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return periodName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPeriodName() {
        return periodName;
    }


    /**
     * Sets the periodName value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param periodName
     */
    public void setPeriodName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] periodName) {
        this.periodName = periodName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPeriodName(int i) {
        return this.periodName[i];
    }

    public void setPeriodName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.periodName[i] = _value;
    }


    /**
     * Gets the periodStartDate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return periodStartDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getPeriodStartDate() {
        return periodStartDate;
    }


    /**
     * Sets the periodStartDate value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param periodStartDate
     */
    public void setPeriodStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getPeriodStartDate(int i) {
        return this.periodStartDate[i];
    }

    public void setPeriodStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.periodStartDate[i] = _value;
    }


    /**
     * Gets the toCurrency value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return toCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getToCurrency() {
        return toCurrency;
    }


    /**
     * Sets the toCurrency value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param toCurrency
     */
    public void setToCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] toCurrency) {
        this.toCurrency = toCurrency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getToCurrency(int i) {
        return this.toCurrency[i];
    }

    public void setToCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.toCurrency[i] = _value;
    }


    /**
     * Gets the toSubsidiary value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @return toSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this ConsolidatedExchangeRateSearchRowBasic.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getToSubsidiary(int i) {
        return this.toSubsidiary[i];
    }

    public void setToSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.toSubsidiary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearchRowBasic)) return false;
        ConsolidatedExchangeRateSearchRowBasic other = (ConsolidatedExchangeRateSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.averageRate==null && other.getAverageRate()==null) || 
             (this.averageRate!=null &&
              java.util.Arrays.equals(this.averageRate, other.getAverageRate()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              java.util.Arrays.equals(this.closed, other.getClosed()))) &&
            ((this.currentRate==null && other.getCurrentRate()==null) || 
             (this.currentRate!=null &&
              java.util.Arrays.equals(this.currentRate, other.getCurrentRate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fromCurrency==null && other.getFromCurrency()==null) || 
             (this.fromCurrency!=null &&
              java.util.Arrays.equals(this.fromCurrency, other.getFromCurrency()))) &&
            ((this.fromSubsidiary==null && other.getFromSubsidiary()==null) || 
             (this.fromSubsidiary!=null &&
              java.util.Arrays.equals(this.fromSubsidiary, other.getFromSubsidiary()))) &&
            ((this.historicalRate==null && other.getHistoricalRate()==null) || 
             (this.historicalRate!=null &&
              java.util.Arrays.equals(this.historicalRate, other.getHistoricalRate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.periodEndDate==null && other.getPeriodEndDate()==null) || 
             (this.periodEndDate!=null &&
              java.util.Arrays.equals(this.periodEndDate, other.getPeriodEndDate()))) &&
            ((this.periodName==null && other.getPeriodName()==null) || 
             (this.periodName!=null &&
              java.util.Arrays.equals(this.periodName, other.getPeriodName()))) &&
            ((this.periodStartDate==null && other.getPeriodStartDate()==null) || 
             (this.periodStartDate!=null &&
              java.util.Arrays.equals(this.periodStartDate, other.getPeriodStartDate()))) &&
            ((this.toCurrency==null && other.getToCurrency()==null) || 
             (this.toCurrency!=null &&
              java.util.Arrays.equals(this.toCurrency, other.getToCurrency()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              java.util.Arrays.equals(this.toSubsidiary, other.getToSubsidiary())));
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
        if (getAccountingBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAverageRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAverageRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAverageRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentRate(), i);
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
        if (getFromCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFromCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFromCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFromSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFromSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFromSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistoricalRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoricalRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoricalRate(), i);
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
        if (getPeriodEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidatedExchangeRateSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "averageRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currentRate"));
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
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fromCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "historicalRate"));
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
        elemField.setFieldName("periodEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "periodStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
