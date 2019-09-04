/**
 * AccountLocalizations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class AccountLocalizations  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef accountingContext;

    private java.lang.String acctNumber;

    private java.lang.String acctName;

    private java.lang.String legalName;

    private com.netsuite.webservices.platform.common_2019_1.types.Language locale;

    public AccountLocalizations() {
    }

    public AccountLocalizations(
           com.netsuite.webservices.platform.core_2019_1.RecordRef accountingContext,
           java.lang.String acctNumber,
           java.lang.String acctName,
           java.lang.String legalName,
           com.netsuite.webservices.platform.common_2019_1.types.Language locale) {
           this.accountingContext = accountingContext;
           this.acctNumber = acctNumber;
           this.acctName = acctName;
           this.legalName = legalName;
           this.locale = locale;
    }


    /**
     * Gets the accountingContext value for this AccountLocalizations.
     * 
     * @return accountingContext
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccountingContext() {
        return accountingContext;
    }


    /**
     * Sets the accountingContext value for this AccountLocalizations.
     * 
     * @param accountingContext
     */
    public void setAccountingContext(com.netsuite.webservices.platform.core_2019_1.RecordRef accountingContext) {
        this.accountingContext = accountingContext;
    }


    /**
     * Gets the acctNumber value for this AccountLocalizations.
     * 
     * @return acctNumber
     */
    public java.lang.String getAcctNumber() {
        return acctNumber;
    }


    /**
     * Sets the acctNumber value for this AccountLocalizations.
     * 
     * @param acctNumber
     */
    public void setAcctNumber(java.lang.String acctNumber) {
        this.acctNumber = acctNumber;
    }


    /**
     * Gets the acctName value for this AccountLocalizations.
     * 
     * @return acctName
     */
    public java.lang.String getAcctName() {
        return acctName;
    }


    /**
     * Sets the acctName value for this AccountLocalizations.
     * 
     * @param acctName
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }


    /**
     * Gets the legalName value for this AccountLocalizations.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this AccountLocalizations.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the locale value for this AccountLocalizations.
     * 
     * @return locale
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Language getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this AccountLocalizations.
     * 
     * @param locale
     */
    public void setLocale(com.netsuite.webservices.platform.common_2019_1.types.Language locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountLocalizations)) return false;
        AccountLocalizations other = (AccountLocalizations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountingContext==null && other.getAccountingContext()==null) || 
             (this.accountingContext!=null &&
              this.accountingContext.equals(other.getAccountingContext()))) &&
            ((this.acctNumber==null && other.getAcctNumber()==null) || 
             (this.acctNumber!=null &&
              this.acctNumber.equals(other.getAcctNumber()))) &&
            ((this.acctName==null && other.getAcctName()==null) || 
             (this.acctName!=null &&
              this.acctName.equals(other.getAcctName()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (getAccountingContext() != null) {
            _hashCode += getAccountingContext().hashCode();
        }
        if (getAcctNumber() != null) {
            _hashCode += getAcctNumber().hashCode();
        }
        if (getAcctName() != null) {
            _hashCode += getAcctName().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountLocalizations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountLocalizations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "acctNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "acctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Language"));
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
