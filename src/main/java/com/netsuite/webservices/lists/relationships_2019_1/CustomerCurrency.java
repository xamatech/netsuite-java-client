/**
 * CustomerCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerCurrency  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double balance;

    private java.lang.Double consolBalance;

    private java.lang.Double depositBalance;

    private java.lang.Double consolDepositBalance;

    private java.lang.Double overdueBalance;

    private java.lang.Double consolOverdueBalance;

    private java.lang.Double unbilledOrders;

    private java.lang.Double consolUnbilledOrders;

    private java.lang.Boolean overrideCurrencyFormat;

    private java.lang.String displaySymbol;

    private com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement symbolPlacement;

    public CustomerCurrency() {
    }

    public CustomerCurrency(
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double balance,
           java.lang.Double consolBalance,
           java.lang.Double depositBalance,
           java.lang.Double consolDepositBalance,
           java.lang.Double overdueBalance,
           java.lang.Double consolOverdueBalance,
           java.lang.Double unbilledOrders,
           java.lang.Double consolUnbilledOrders,
           java.lang.Boolean overrideCurrencyFormat,
           java.lang.String displaySymbol,
           com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement symbolPlacement) {
           this.currency = currency;
           this.balance = balance;
           this.consolBalance = consolBalance;
           this.depositBalance = depositBalance;
           this.consolDepositBalance = consolDepositBalance;
           this.overdueBalance = overdueBalance;
           this.consolOverdueBalance = consolOverdueBalance;
           this.unbilledOrders = unbilledOrders;
           this.consolUnbilledOrders = consolUnbilledOrders;
           this.overrideCurrencyFormat = overrideCurrencyFormat;
           this.displaySymbol = displaySymbol;
           this.symbolPlacement = symbolPlacement;
    }


    /**
     * Gets the currency value for this CustomerCurrency.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CustomerCurrency.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the balance value for this CustomerCurrency.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CustomerCurrency.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the consolBalance value for this CustomerCurrency.
     * 
     * @return consolBalance
     */
    public java.lang.Double getConsolBalance() {
        return consolBalance;
    }


    /**
     * Sets the consolBalance value for this CustomerCurrency.
     * 
     * @param consolBalance
     */
    public void setConsolBalance(java.lang.Double consolBalance) {
        this.consolBalance = consolBalance;
    }


    /**
     * Gets the depositBalance value for this CustomerCurrency.
     * 
     * @return depositBalance
     */
    public java.lang.Double getDepositBalance() {
        return depositBalance;
    }


    /**
     * Sets the depositBalance value for this CustomerCurrency.
     * 
     * @param depositBalance
     */
    public void setDepositBalance(java.lang.Double depositBalance) {
        this.depositBalance = depositBalance;
    }


    /**
     * Gets the consolDepositBalance value for this CustomerCurrency.
     * 
     * @return consolDepositBalance
     */
    public java.lang.Double getConsolDepositBalance() {
        return consolDepositBalance;
    }


    /**
     * Sets the consolDepositBalance value for this CustomerCurrency.
     * 
     * @param consolDepositBalance
     */
    public void setConsolDepositBalance(java.lang.Double consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }


    /**
     * Gets the overdueBalance value for this CustomerCurrency.
     * 
     * @return overdueBalance
     */
    public java.lang.Double getOverdueBalance() {
        return overdueBalance;
    }


    /**
     * Sets the overdueBalance value for this CustomerCurrency.
     * 
     * @param overdueBalance
     */
    public void setOverdueBalance(java.lang.Double overdueBalance) {
        this.overdueBalance = overdueBalance;
    }


    /**
     * Gets the consolOverdueBalance value for this CustomerCurrency.
     * 
     * @return consolOverdueBalance
     */
    public java.lang.Double getConsolOverdueBalance() {
        return consolOverdueBalance;
    }


    /**
     * Sets the consolOverdueBalance value for this CustomerCurrency.
     * 
     * @param consolOverdueBalance
     */
    public void setConsolOverdueBalance(java.lang.Double consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }


    /**
     * Gets the unbilledOrders value for this CustomerCurrency.
     * 
     * @return unbilledOrders
     */
    public java.lang.Double getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this CustomerCurrency.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(java.lang.Double unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the consolUnbilledOrders value for this CustomerCurrency.
     * 
     * @return consolUnbilledOrders
     */
    public java.lang.Double getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }


    /**
     * Sets the consolUnbilledOrders value for this CustomerCurrency.
     * 
     * @param consolUnbilledOrders
     */
    public void setConsolUnbilledOrders(java.lang.Double consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }


    /**
     * Gets the overrideCurrencyFormat value for this CustomerCurrency.
     * 
     * @return overrideCurrencyFormat
     */
    public java.lang.Boolean getOverrideCurrencyFormat() {
        return overrideCurrencyFormat;
    }


    /**
     * Sets the overrideCurrencyFormat value for this CustomerCurrency.
     * 
     * @param overrideCurrencyFormat
     */
    public void setOverrideCurrencyFormat(java.lang.Boolean overrideCurrencyFormat) {
        this.overrideCurrencyFormat = overrideCurrencyFormat;
    }


    /**
     * Gets the displaySymbol value for this CustomerCurrency.
     * 
     * @return displaySymbol
     */
    public java.lang.String getDisplaySymbol() {
        return displaySymbol;
    }


    /**
     * Sets the displaySymbol value for this CustomerCurrency.
     * 
     * @param displaySymbol
     */
    public void setDisplaySymbol(java.lang.String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }


    /**
     * Gets the symbolPlacement value for this CustomerCurrency.
     * 
     * @return symbolPlacement
     */
    public com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement getSymbolPlacement() {
        return symbolPlacement;
    }


    /**
     * Sets the symbolPlacement value for this CustomerCurrency.
     * 
     * @param symbolPlacement
     */
    public void setSymbolPlacement(com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement symbolPlacement) {
        this.symbolPlacement = symbolPlacement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCurrency)) return false;
        CustomerCurrency other = (CustomerCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.consolBalance==null && other.getConsolBalance()==null) || 
             (this.consolBalance!=null &&
              this.consolBalance.equals(other.getConsolBalance()))) &&
            ((this.depositBalance==null && other.getDepositBalance()==null) || 
             (this.depositBalance!=null &&
              this.depositBalance.equals(other.getDepositBalance()))) &&
            ((this.consolDepositBalance==null && other.getConsolDepositBalance()==null) || 
             (this.consolDepositBalance!=null &&
              this.consolDepositBalance.equals(other.getConsolDepositBalance()))) &&
            ((this.overdueBalance==null && other.getOverdueBalance()==null) || 
             (this.overdueBalance!=null &&
              this.overdueBalance.equals(other.getOverdueBalance()))) &&
            ((this.consolOverdueBalance==null && other.getConsolOverdueBalance()==null) || 
             (this.consolOverdueBalance!=null &&
              this.consolOverdueBalance.equals(other.getConsolOverdueBalance()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.consolUnbilledOrders==null && other.getConsolUnbilledOrders()==null) || 
             (this.consolUnbilledOrders!=null &&
              this.consolUnbilledOrders.equals(other.getConsolUnbilledOrders()))) &&
            ((this.overrideCurrencyFormat==null && other.getOverrideCurrencyFormat()==null) || 
             (this.overrideCurrencyFormat!=null &&
              this.overrideCurrencyFormat.equals(other.getOverrideCurrencyFormat()))) &&
            ((this.displaySymbol==null && other.getDisplaySymbol()==null) || 
             (this.displaySymbol!=null &&
              this.displaySymbol.equals(other.getDisplaySymbol()))) &&
            ((this.symbolPlacement==null && other.getSymbolPlacement()==null) || 
             (this.symbolPlacement!=null &&
              this.symbolPlacement.equals(other.getSymbolPlacement())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getConsolBalance() != null) {
            _hashCode += getConsolBalance().hashCode();
        }
        if (getDepositBalance() != null) {
            _hashCode += getDepositBalance().hashCode();
        }
        if (getConsolDepositBalance() != null) {
            _hashCode += getConsolDepositBalance().hashCode();
        }
        if (getOverdueBalance() != null) {
            _hashCode += getOverdueBalance().hashCode();
        }
        if (getConsolOverdueBalance() != null) {
            _hashCode += getConsolOverdueBalance().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getConsolUnbilledOrders() != null) {
            _hashCode += getConsolUnbilledOrders().hashCode();
        }
        if (getOverrideCurrencyFormat() != null) {
            _hashCode += getOverrideCurrencyFormat().hashCode();
        }
        if (getDisplaySymbol() != null) {
            _hashCode += getDisplaySymbol().hashCode();
        }
        if (getSymbolPlacement() != null) {
            _hashCode += getSymbolPlacement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerCurrency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideCurrencyFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "overrideCurrencyFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "displaySymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbolPlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "symbolPlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "CurrencySymbolPlacement"));
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
