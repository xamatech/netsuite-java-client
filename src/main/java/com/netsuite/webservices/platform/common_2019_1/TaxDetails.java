/**
 * TaxDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxDetails  implements java.io.Serializable {
    private java.lang.String taxDetailsReference;

    private java.lang.String lineType;

    private java.lang.String lineName;

    private java.lang.Double netAmount;

    private java.lang.Double grossAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode;

    private java.lang.Double taxBasis;

    private java.lang.Double taxRate;

    private java.lang.Double taxAmount;

    private java.lang.String calcDetail;

    public TaxDetails() {
    }

    public TaxDetails(
           java.lang.String taxDetailsReference,
           java.lang.String lineType,
           java.lang.String lineName,
           java.lang.Double netAmount,
           java.lang.Double grossAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode,
           java.lang.Double taxBasis,
           java.lang.Double taxRate,
           java.lang.Double taxAmount,
           java.lang.String calcDetail) {
           this.taxDetailsReference = taxDetailsReference;
           this.lineType = lineType;
           this.lineName = lineName;
           this.netAmount = netAmount;
           this.grossAmount = grossAmount;
           this.taxType = taxType;
           this.taxCode = taxCode;
           this.taxBasis = taxBasis;
           this.taxRate = taxRate;
           this.taxAmount = taxAmount;
           this.calcDetail = calcDetail;
    }


    /**
     * Gets the taxDetailsReference value for this TaxDetails.
     * 
     * @return taxDetailsReference
     */
    public java.lang.String getTaxDetailsReference() {
        return taxDetailsReference;
    }


    /**
     * Sets the taxDetailsReference value for this TaxDetails.
     * 
     * @param taxDetailsReference
     */
    public void setTaxDetailsReference(java.lang.String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }


    /**
     * Gets the lineType value for this TaxDetails.
     * 
     * @return lineType
     */
    public java.lang.String getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this TaxDetails.
     * 
     * @param lineType
     */
    public void setLineType(java.lang.String lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the lineName value for this TaxDetails.
     * 
     * @return lineName
     */
    public java.lang.String getLineName() {
        return lineName;
    }


    /**
     * Sets the lineName value for this TaxDetails.
     * 
     * @param lineName
     */
    public void setLineName(java.lang.String lineName) {
        this.lineName = lineName;
    }


    /**
     * Gets the netAmount value for this TaxDetails.
     * 
     * @return netAmount
     */
    public java.lang.Double getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this TaxDetails.
     * 
     * @param netAmount
     */
    public void setNetAmount(java.lang.Double netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the grossAmount value for this TaxDetails.
     * 
     * @return grossAmount
     */
    public java.lang.Double getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this TaxDetails.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(java.lang.Double grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the taxType value for this TaxDetails.
     * 
     * @return taxType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxDetails.
     * 
     * @param taxType
     */
    public void setTaxType(com.netsuite.webservices.platform.core_2019_1.RecordRef taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the taxCode value for this TaxDetails.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TaxDetails.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxBasis value for this TaxDetails.
     * 
     * @return taxBasis
     */
    public java.lang.Double getTaxBasis() {
        return taxBasis;
    }


    /**
     * Sets the taxBasis value for this TaxDetails.
     * 
     * @param taxBasis
     */
    public void setTaxBasis(java.lang.Double taxBasis) {
        this.taxBasis = taxBasis;
    }


    /**
     * Gets the taxRate value for this TaxDetails.
     * 
     * @return taxRate
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TaxDetails.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxAmount value for this TaxDetails.
     * 
     * @return taxAmount
     */
    public java.lang.Double getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxDetails.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Double taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the calcDetail value for this TaxDetails.
     * 
     * @return calcDetail
     */
    public java.lang.String getCalcDetail() {
        return calcDetail;
    }


    /**
     * Sets the calcDetail value for this TaxDetails.
     * 
     * @param calcDetail
     */
    public void setCalcDetail(java.lang.String calcDetail) {
        this.calcDetail = calcDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxDetails)) return false;
        TaxDetails other = (TaxDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxDetailsReference==null && other.getTaxDetailsReference()==null) || 
             (this.taxDetailsReference!=null &&
              this.taxDetailsReference.equals(other.getTaxDetailsReference()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.lineName==null && other.getLineName()==null) || 
             (this.lineName!=null &&
              this.lineName.equals(other.getLineName()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxBasis==null && other.getTaxBasis()==null) || 
             (this.taxBasis!=null &&
              this.taxBasis.equals(other.getTaxBasis()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.calcDetail==null && other.getCalcDetail()==null) || 
             (this.calcDetail!=null &&
              this.calcDetail.equals(other.getCalcDetail())));
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
        if (getTaxDetailsReference() != null) {
            _hashCode += getTaxDetailsReference().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getLineName() != null) {
            _hashCode += getLineName().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxBasis() != null) {
            _hashCode += getTaxBasis().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getCalcDetail() != null) {
            _hashCode += getCalcDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "calcDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
