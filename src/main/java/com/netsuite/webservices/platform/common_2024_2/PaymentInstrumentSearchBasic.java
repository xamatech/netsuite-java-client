/**
 * PaymentInstrumentSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class PaymentInstrumentSearchBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField customer;

    private com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField paymentInstrumentType;

    private com.netsuite.webservices.platform.core_2024_2.SearchBooleanField preserveOnFile;

    public PaymentInstrumentSearchBasic() {
    }

    public PaymentInstrumentSearchBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField customer,
           com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField paymentInstrumentType,
           com.netsuite.webservices.platform.core_2024_2.SearchBooleanField preserveOnFile) {
        this.customer = customer;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.paymentInstrumentType = paymentInstrumentType;
        this.preserveOnFile = preserveOnFile;
    }


    /**
     * Gets the customer value for this PaymentInstrumentSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PaymentInstrumentSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the internalId value for this PaymentInstrumentSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentInstrumentSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this PaymentInstrumentSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this PaymentInstrumentSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2024_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this PaymentInstrumentSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PaymentInstrumentSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the paymentInstrumentType value for this PaymentInstrumentSearchBasic.
     * 
     * @return paymentInstrumentType
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField getPaymentInstrumentType() {
        return paymentInstrumentType;
    }


    /**
     * Sets the paymentInstrumentType value for this PaymentInstrumentSearchBasic.
     * 
     * @param paymentInstrumentType
     */
    public void setPaymentInstrumentType(com.netsuite.webservices.platform.core_2024_2.SearchEnumMultiSelectField paymentInstrumentType) {
        this.paymentInstrumentType = paymentInstrumentType;
    }


    /**
     * Gets the preserveOnFile value for this PaymentInstrumentSearchBasic.
     * 
     * @return preserveOnFile
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchBooleanField getPreserveOnFile() {
        return preserveOnFile;
    }


    /**
     * Sets the preserveOnFile value for this PaymentInstrumentSearchBasic.
     * 
     * @param preserveOnFile
     */
    public void setPreserveOnFile(com.netsuite.webservices.platform.core_2024_2.SearchBooleanField preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInstrumentSearchBasic)) return false;
        PaymentInstrumentSearchBasic other = (PaymentInstrumentSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.paymentInstrumentType==null && other.getPaymentInstrumentType()==null) || 
             (this.paymentInstrumentType!=null &&
              this.paymentInstrumentType.equals(other.getPaymentInstrumentType()))) &&
            ((this.preserveOnFile==null && other.getPreserveOnFile()==null) || 
             (this.preserveOnFile!=null &&
              this.preserveOnFile.equals(other.getPreserveOnFile())));
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getPaymentInstrumentType() != null) {
            _hashCode += getPaymentInstrumentType().hashCode();
        }
        if (getPreserveOnFile() != null) {
            _hashCode += getPreserveOnFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentInstrumentSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PaymentInstrumentSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
