/**
 * PaymentOptionSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class PaymentOptionSearchBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField paymentInstrumentType;

    public PaymentOptionSearchBasic() {
    }

    public PaymentOptionSearchBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField paymentInstrumentType) {
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.paymentInstrumentType = paymentInstrumentType;
    }


    /**
     * Gets the internalId value for this PaymentOptionSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentOptionSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this PaymentOptionSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this PaymentOptionSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the paymentInstrumentType value for this PaymentOptionSearchBasic.
     * 
     * @return paymentInstrumentType
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField getPaymentInstrumentType() {
        return paymentInstrumentType;
    }


    /**
     * Sets the paymentInstrumentType value for this PaymentOptionSearchBasic.
     * 
     * @param paymentInstrumentType
     */
    public void setPaymentInstrumentType(com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField paymentInstrumentType) {
        this.paymentInstrumentType = paymentInstrumentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentOptionSearchBasic)) return false;
        PaymentOptionSearchBasic other = (PaymentOptionSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.paymentInstrumentType==null && other.getPaymentInstrumentType()==null) || 
             (this.paymentInstrumentType!=null &&
              this.paymentInstrumentType.equals(other.getPaymentInstrumentType())));
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getPaymentInstrumentType() != null) {
            _hashCode += getPaymentInstrumentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentOptionSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PaymentOptionSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paymentInstrumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
