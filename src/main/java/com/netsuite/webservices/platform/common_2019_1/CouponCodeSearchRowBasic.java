/**
 * CouponCodeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CouponCodeSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] code;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateSent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] promotion;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] useCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] used;

    public CouponCodeSearchRowBasic() {
    }

    public CouponCodeSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] code,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateSent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] promotion,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recipient,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] useCount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] used) {
        this.code = code;
        this.dateSent = dateSent;
        this.externalId = externalId;
        this.id = id;
        this.internalId = internalId;
        this.promotion = promotion;
        this.recipient = recipient;
        this.useCount = useCount;
        this.used = used;
    }


    /**
     * Gets the code value for this CouponCodeSearchRowBasic.
     * 
     * @return code
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCode() {
        return code;
    }


    /**
     * Sets the code value for this CouponCodeSearchRowBasic.
     * 
     * @param code
     */
    public void setCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] code) {
        this.code = code;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCode(int i) {
        return this.code[i];
    }

    public void setCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.code[i] = _value;
    }


    /**
     * Gets the dateSent value for this CouponCodeSearchRowBasic.
     * 
     * @return dateSent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateSent() {
        return dateSent;
    }


    /**
     * Sets the dateSent value for this CouponCodeSearchRowBasic.
     * 
     * @param dateSent
     */
    public void setDateSent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateSent) {
        this.dateSent = dateSent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateSent(int i) {
        return this.dateSent[i];
    }

    public void setDateSent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateSent[i] = _value;
    }


    /**
     * Gets the externalId value for this CouponCodeSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CouponCodeSearchRowBasic.
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
     * Gets the id value for this CouponCodeSearchRowBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this CouponCodeSearchRowBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id) {
        this.id = id;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the internalId value for this CouponCodeSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CouponCodeSearchRowBasic.
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
     * Gets the promotion value for this CouponCodeSearchRowBasic.
     * 
     * @return promotion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this CouponCodeSearchRowBasic.
     * 
     * @param promotion
     */
    public void setPromotion(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] promotion) {
        this.promotion = promotion;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPromotion(int i) {
        return this.promotion[i];
    }

    public void setPromotion(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.promotion[i] = _value;
    }


    /**
     * Gets the recipient value for this CouponCodeSearchRowBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CouponCodeSearchRowBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recipient) {
        this.recipient = recipient;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRecipient(int i) {
        return this.recipient[i];
    }

    public void setRecipient(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.recipient[i] = _value;
    }


    /**
     * Gets the useCount value for this CouponCodeSearchRowBasic.
     * 
     * @return useCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getUseCount() {
        return useCount;
    }


    /**
     * Sets the useCount value for this CouponCodeSearchRowBasic.
     * 
     * @param useCount
     */
    public void setUseCount(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] useCount) {
        this.useCount = useCount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getUseCount(int i) {
        return this.useCount[i];
    }

    public void setUseCount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.useCount[i] = _value;
    }


    /**
     * Gets the used value for this CouponCodeSearchRowBasic.
     * 
     * @return used
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getUsed() {
        return used;
    }


    /**
     * Sets the used value for this CouponCodeSearchRowBasic.
     * 
     * @param used
     */
    public void setUsed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] used) {
        this.used = used;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getUsed(int i) {
        return this.used[i];
    }

    public void setUsed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.used[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponCodeSearchRowBasic)) return false;
        CouponCodeSearchRowBasic other = (CouponCodeSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              java.util.Arrays.equals(this.code, other.getCode()))) &&
            ((this.dateSent==null && other.getDateSent()==null) || 
             (this.dateSent!=null &&
              java.util.Arrays.equals(this.dateSent, other.getDateSent()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              java.util.Arrays.equals(this.promotion, other.getPromotion()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              java.util.Arrays.equals(this.recipient, other.getRecipient()))) &&
            ((this.useCount==null && other.getUseCount()==null) || 
             (this.useCount!=null &&
              java.util.Arrays.equals(this.useCount, other.getUseCount()))) &&
            ((this.used==null && other.getUsed()==null) || 
             (this.used!=null &&
              java.util.Arrays.equals(this.used, other.getUsed())));
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
        if (getCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateSent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateSent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateSent(), i);
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
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
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
        if (getPromotion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsed(), i);
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
        new org.apache.axis.description.TypeDesc(CouponCodeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CouponCodeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "used"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
