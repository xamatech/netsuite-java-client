/**
 * PriceLevelSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class PriceLevelSearchRowBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] discountPct;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isOnline;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] name;

    public PriceLevelSearchRowBasic() {
    }

    public PriceLevelSearchRowBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] discountPct,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isOnline,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] name) {
        this.discountPct = discountPct;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.isOnline = isOnline;
        this.name = name;
    }


    /**
     * Gets the discountPct value for this PriceLevelSearchRowBasic.
     * 
     * @return discountPct
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getDiscountPct() {
        return discountPct;
    }


    /**
     * Sets the discountPct value for this PriceLevelSearchRowBasic.
     * 
     * @param discountPct
     */
    public void setDiscountPct(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] discountPct) {
        this.discountPct = discountPct;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getDiscountPct(int i) {
        return this.discountPct[i];
    }

    public void setDiscountPct(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.discountPct[i] = _value;
    }


    /**
     * Gets the externalId value for this PriceLevelSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PriceLevelSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the internalId value for this PriceLevelSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PriceLevelSearchRowBasic.
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
     * Gets the isInactive value for this PriceLevelSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PriceLevelSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isOnline value for this PriceLevelSearchRowBasic.
     * 
     * @return isOnline
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this PriceLevelSearchRowBasic.
     * 
     * @param isOnline
     */
    public void setIsOnline(com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isOnline) {
        this.isOnline = isOnline;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField getIsOnline(int i) {
        return this.isOnline[i];
    }

    public void setIsOnline(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField _value) {
        this.isOnline[i] = _value;
    }


    /**
     * Gets the name value for this PriceLevelSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this PriceLevelSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceLevelSearchRowBasic)) return false;
        PriceLevelSearchRowBasic other = (PriceLevelSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.discountPct==null && other.getDiscountPct()==null) || 
             (this.discountPct!=null &&
              java.util.Arrays.equals(this.discountPct, other.getDiscountPct()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              java.util.Arrays.equals(this.isOnline, other.getIsOnline()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName())));
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
        if (getDiscountPct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountPct(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsOnline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOnline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOnline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
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
        new org.apache.axis.description.TypeDesc(PriceLevelSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PriceLevelSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "discountPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "name"));
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
