/**
 * CouponCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1;

public class CouponCode  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef promotion;

    private java.lang.String code;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef recipient;

    private java.util.Calendar dateSent;

    private java.lang.Boolean used;

    private java.lang.Long useCount;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CouponCode() {
    }

    public CouponCode(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef promotion,
           java.lang.String code,
           com.netsuite.webservices.platform.core_2019_1.RecordRef recipient,
           java.util.Calendar dateSent,
           java.lang.Boolean used,
           java.lang.Long useCount) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.promotion = promotion;
        this.code = code;
        this.recipient = recipient;
        this.dateSent = dateSent;
        this.used = used;
        this.useCount = useCount;
    }


    /**
     * Gets the promotion value for this CouponCode.
     * 
     * @return promotion
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this CouponCode.
     * 
     * @param promotion
     */
    public void setPromotion(com.netsuite.webservices.platform.core_2019_1.RecordRef promotion) {
        this.promotion = promotion;
    }


    /**
     * Gets the code value for this CouponCode.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CouponCode.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the recipient value for this CouponCode.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CouponCode.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2019_1.RecordRef recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the dateSent value for this CouponCode.
     * 
     * @return dateSent
     */
    public java.util.Calendar getDateSent() {
        return dateSent;
    }


    /**
     * Sets the dateSent value for this CouponCode.
     * 
     * @param dateSent
     */
    public void setDateSent(java.util.Calendar dateSent) {
        this.dateSent = dateSent;
    }


    /**
     * Gets the used value for this CouponCode.
     * 
     * @return used
     */
    public java.lang.Boolean getUsed() {
        return used;
    }


    /**
     * Sets the used value for this CouponCode.
     * 
     * @param used
     */
    public void setUsed(java.lang.Boolean used) {
        this.used = used;
    }


    /**
     * Gets the useCount value for this CouponCode.
     * 
     * @return useCount
     */
    public java.lang.Long getUseCount() {
        return useCount;
    }


    /**
     * Sets the useCount value for this CouponCode.
     * 
     * @param useCount
     */
    public void setUseCount(java.lang.Long useCount) {
        this.useCount = useCount;
    }


    /**
     * Gets the internalId value for this CouponCode.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CouponCode.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CouponCode.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CouponCode.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponCode)) return false;
        CouponCode other = (CouponCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              this.promotion.equals(other.getPromotion()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.dateSent==null && other.getDateSent()==null) || 
             (this.dateSent!=null &&
              this.dateSent.equals(other.getDateSent()))) &&
            ((this.used==null && other.getUsed()==null) || 
             (this.used!=null &&
              this.used.equals(other.getUsed()))) &&
            ((this.useCount==null && other.getUseCount()==null) || 
             (this.useCount!=null &&
              this.useCount.equals(other.getUseCount()))) &&
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
        if (getPromotion() != null) {
            _hashCode += getPromotion().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getDateSent() != null) {
            _hashCode += getDateSent().hashCode();
        }
        if (getUsed() != null) {
            _hashCode += getUsed().hashCode();
        }
        if (getUseCount() != null) {
            _hashCode += getUseCount().hashCode();
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
        new org.apache.axis.description.TypeDesc(CouponCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "CouponCode"));
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
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2019_1.lists.webservices.netsuite.com", "useCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
