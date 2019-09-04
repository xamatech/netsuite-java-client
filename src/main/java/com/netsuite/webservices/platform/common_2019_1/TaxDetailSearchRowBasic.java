/**
 * TaxDetailSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxDetailSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] account;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] details;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxBasis;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] tranId;

    public TaxDetailSearchRowBasic() {
    }

    public TaxDetailSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] account,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] details,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxBasis,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] tranId) {
        this.account = account;
        this.details = details;
        this.lineNumber = lineNumber;
        this.taxAmount = taxAmount;
        this.taxBasis = taxBasis;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
        this.taxType = taxType;
        this.tranId = tranId;
    }


    /**
     * Gets the account value for this TaxDetailSearchRowBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TaxDetailSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] account) {
        this.account = account;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the details value for this TaxDetailSearchRowBasic.
     * 
     * @return details
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this TaxDetailSearchRowBasic.
     * 
     * @param details
     */
    public void setDetails(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] details) {
        this.details = details;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.details[i] = _value;
    }


    /**
     * Gets the lineNumber value for this TaxDetailSearchRowBasic.
     * 
     * @return lineNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this TaxDetailSearchRowBasic.
     * 
     * @param lineNumber
     */
    public void setLineNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineNumber) {
        this.lineNumber = lineNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLineNumber(int i) {
        return this.lineNumber[i];
    }

    public void setLineNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.lineNumber[i] = _value;
    }


    /**
     * Gets the taxAmount value for this TaxDetailSearchRowBasic.
     * 
     * @return taxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxDetailSearchRowBasic.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxAmount) {
        this.taxAmount = taxAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTaxAmount(int i) {
        return this.taxAmount[i];
    }

    public void setTaxAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.taxAmount[i] = _value;
    }


    /**
     * Gets the taxBasis value for this TaxDetailSearchRowBasic.
     * 
     * @return taxBasis
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTaxBasis() {
        return taxBasis;
    }


    /**
     * Sets the taxBasis value for this TaxDetailSearchRowBasic.
     * 
     * @param taxBasis
     */
    public void setTaxBasis(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxBasis) {
        this.taxBasis = taxBasis;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTaxBasis(int i) {
        return this.taxBasis[i];
    }

    public void setTaxBasis(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.taxBasis[i] = _value;
    }


    /**
     * Gets the taxCode value for this TaxDetailSearchRowBasic.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TaxDetailSearchRowBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxCode) {
        this.taxCode = taxCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxCode(int i) {
        return this.taxCode[i];
    }

    public void setTaxCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxCode[i] = _value;
    }


    /**
     * Gets the taxRate value for this TaxDetailSearchRowBasic.
     * 
     * @return taxRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TaxDetailSearchRowBasic.
     * 
     * @param taxRate
     */
    public void setTaxRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxRate) {
        this.taxRate = taxRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTaxRate(int i) {
        return this.taxRate[i];
    }

    public void setTaxRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.taxRate[i] = _value;
    }


    /**
     * Gets the taxType value for this TaxDetailSearchRowBasic.
     * 
     * @return taxType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxDetailSearchRowBasic.
     * 
     * @param taxType
     */
    public void setTaxType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxType) {
        this.taxType = taxType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxType(int i) {
        return this.taxType[i];
    }

    public void setTaxType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxType[i] = _value;
    }


    /**
     * Gets the tranId value for this TaxDetailSearchRowBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TaxDetailSearchRowBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] tranId) {
        this.tranId = tranId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.tranId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxDetailSearchRowBasic)) return false;
        TaxDetailSearchRowBasic other = (TaxDetailSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              java.util.Arrays.equals(this.lineNumber, other.getLineNumber()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              java.util.Arrays.equals(this.taxAmount, other.getTaxAmount()))) &&
            ((this.taxBasis==null && other.getTaxBasis()==null) || 
             (this.taxBasis!=null &&
              java.util.Arrays.equals(this.taxBasis, other.getTaxBasis()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              java.util.Arrays.equals(this.taxCode, other.getTaxCode()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              java.util.Arrays.equals(this.taxRate, other.getTaxRate()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              java.util.Arrays.equals(this.taxType, other.getTaxType()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              java.util.Arrays.equals(this.tranId, other.getTranId())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxBasis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxBasis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxBasis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranId(), i);
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
        new org.apache.axis.description.TypeDesc(TaxDetailSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
