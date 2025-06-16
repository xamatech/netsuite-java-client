/**
 * PaymentOptionSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class PaymentOptionSearchRowBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] mask;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] paymentInstrumentType;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentMethod;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] preserveOnFile;

    public PaymentOptionSearchRowBasic() {
    }

    public PaymentOptionSearchRowBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] mask,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] paymentInstrumentType,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentMethod,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] preserveOnFile) {
        this.internalId = internalId;
        this.mask = mask;
        this.paymentInstrumentType = paymentInstrumentType;
        this.paymentMethod = paymentMethod;
        this.preserveOnFile = preserveOnFile;
    }


    /**
     * Gets the internalId value for this PaymentOptionSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentOptionSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the mask value for this PaymentOptionSearchRowBasic.
     * 
     * @return mask
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this PaymentOptionSearchRowBasic.
     * 
     * @param mask
     */
    public void setMask(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] mask) {
        this.mask = mask;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getMask(int i) {
        return this.mask[i];
    }

    public void setMask(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.mask[i] = _value;
    }


    /**
     * Gets the paymentInstrumentType value for this PaymentOptionSearchRowBasic.
     * 
     * @return paymentInstrumentType
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] getPaymentInstrumentType() {
        return paymentInstrumentType;
    }


    /**
     * Sets the paymentInstrumentType value for this PaymentOptionSearchRowBasic.
     * 
     * @param paymentInstrumentType
     */
    public void setPaymentInstrumentType(com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField[] paymentInstrumentType) {
        this.paymentInstrumentType = paymentInstrumentType;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField getPaymentInstrumentType(int i) {
        return this.paymentInstrumentType[i];
    }

    public void setPaymentInstrumentType(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnEnumSelectField _value) {
        this.paymentInstrumentType[i] = _value;
    }


    /**
     * Gets the paymentMethod value for this PaymentOptionSearchRowBasic.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this PaymentOptionSearchRowBasic.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }


    /**
     * Gets the preserveOnFile value for this PaymentOptionSearchRowBasic.
     * 
     * @return preserveOnFile
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getPreserveOnFile() {
        return preserveOnFile;
    }


    /**
     * Sets the preserveOnFile value for this PaymentOptionSearchRowBasic.
     * 
     * @param preserveOnFile
     */
    public void setPreserveOnFile(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getPreserveOnFile(int i) {
        return this.preserveOnFile[i];
    }

    public void setPreserveOnFile(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.preserveOnFile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentOptionSearchRowBasic)) return false;
        PaymentOptionSearchRowBasic other = (PaymentOptionSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.mask==null && other.getMask()==null) || 
             (this.mask!=null &&
              java.util.Arrays.equals(this.mask, other.getMask()))) &&
            ((this.paymentInstrumentType==null && other.getPaymentInstrumentType()==null) || 
             (this.paymentInstrumentType!=null &&
              java.util.Arrays.equals(this.paymentInstrumentType, other.getPaymentInstrumentType()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              java.util.Arrays.equals(this.paymentMethod, other.getPaymentMethod()))) &&
            ((this.preserveOnFile==null && other.getPreserveOnFile()==null) || 
             (this.preserveOnFile!=null &&
              java.util.Arrays.equals(this.preserveOnFile, other.getPreserveOnFile())));
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
        if (getMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentInstrumentType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInstrumentType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInstrumentType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreserveOnFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreserveOnFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreserveOnFile(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentOptionSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PaymentOptionSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paymentInstrumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
