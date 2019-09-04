/**
 * TaxDetailSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxDetailSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField lineNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxBasis;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField tranId;

    public TaxDetailSearchBasic() {
    }

    public TaxDetailSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField lineNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxBasis,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxCode,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxRate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField tranId) {
        this.account = account;
        this.lineNumber = lineNumber;
        this.taxAmount = taxAmount;
        this.taxBasis = taxBasis;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
        this.taxType = taxType;
        this.tranId = tranId;
    }


    /**
     * Gets the account value for this TaxDetailSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TaxDetailSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account) {
        this.account = account;
    }


    /**
     * Gets the lineNumber value for this TaxDetailSearchBasic.
     * 
     * @return lineNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this TaxDetailSearchBasic.
     * 
     * @param lineNumber
     */
    public void setLineNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the taxAmount value for this TaxDetailSearchBasic.
     * 
     * @return taxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxDetailSearchBasic.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxBasis value for this TaxDetailSearchBasic.
     * 
     * @return taxBasis
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTaxBasis() {
        return taxBasis;
    }


    /**
     * Sets the taxBasis value for this TaxDetailSearchBasic.
     * 
     * @param taxBasis
     */
    public void setTaxBasis(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxBasis) {
        this.taxBasis = taxBasis;
    }


    /**
     * Gets the taxCode value for this TaxDetailSearchBasic.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TaxDetailSearchBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate value for this TaxDetailSearchBasic.
     * 
     * @return taxRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TaxDetailSearchBasic.
     * 
     * @param taxRate
     */
    public void setTaxRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxType value for this TaxDetailSearchBasic.
     * 
     * @return taxType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxDetailSearchBasic.
     * 
     * @param taxType
     */
    public void setTaxType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the tranId value for this TaxDetailSearchBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TaxDetailSearchBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField tranId) {
        this.tranId = tranId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxDetailSearchBasic)) return false;
        TaxDetailSearchBasic other = (TaxDetailSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxBasis==null && other.getTaxBasis()==null) || 
             (this.taxBasis!=null &&
              this.taxBasis.equals(other.getTaxBasis()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxBasis() != null) {
            _hashCode += getTaxBasis().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxDetailSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
