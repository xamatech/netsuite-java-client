/**
 * ItemNumberCustomFieldFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class ItemNumberCustomFieldFilter  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef fldFilter;

    private java.lang.Boolean fldFilterChecked;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFilterCompareType fldFilterCompareType;

    private java.lang.String fldFilterVal;

    private java.lang.Boolean fldFilterNotNull;

    private java.lang.Boolean fldfilterNull;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fldCompareField;

    public ItemNumberCustomFieldFilter() {
    }

    public ItemNumberCustomFieldFilter(
           com.netsuite.webservices.platform.core_2019_1.RecordRef fldFilter,
           java.lang.Boolean fldFilterChecked,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFilterCompareType fldFilterCompareType,
           java.lang.String fldFilterVal,
           java.lang.Boolean fldFilterNotNull,
           java.lang.Boolean fldfilterNull,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fldCompareField) {
           this.fldFilter = fldFilter;
           this.fldFilterChecked = fldFilterChecked;
           this.fldFilterCompareType = fldFilterCompareType;
           this.fldFilterVal = fldFilterVal;
           this.fldFilterNotNull = fldFilterNotNull;
           this.fldfilterNull = fldfilterNull;
           this.fldCompareField = fldCompareField;
    }


    /**
     * Gets the fldFilter value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldFilter
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFldFilter() {
        return fldFilter;
    }


    /**
     * Sets the fldFilter value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldFilter
     */
    public void setFldFilter(com.netsuite.webservices.platform.core_2019_1.RecordRef fldFilter) {
        this.fldFilter = fldFilter;
    }


    /**
     * Gets the fldFilterChecked value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldFilterChecked
     */
    public java.lang.Boolean getFldFilterChecked() {
        return fldFilterChecked;
    }


    /**
     * Sets the fldFilterChecked value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldFilterChecked
     */
    public void setFldFilterChecked(java.lang.Boolean fldFilterChecked) {
        this.fldFilterChecked = fldFilterChecked;
    }


    /**
     * Gets the fldFilterCompareType value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldFilterCompareType
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFilterCompareType getFldFilterCompareType() {
        return fldFilterCompareType;
    }


    /**
     * Sets the fldFilterCompareType value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldFilterCompareType
     */
    public void setFldFilterCompareType(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFilterCompareType fldFilterCompareType) {
        this.fldFilterCompareType = fldFilterCompareType;
    }


    /**
     * Gets the fldFilterVal value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldFilterVal
     */
    public java.lang.String getFldFilterVal() {
        return fldFilterVal;
    }


    /**
     * Sets the fldFilterVal value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldFilterVal
     */
    public void setFldFilterVal(java.lang.String fldFilterVal) {
        this.fldFilterVal = fldFilterVal;
    }


    /**
     * Gets the fldFilterNotNull value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldFilterNotNull
     */
    public java.lang.Boolean getFldFilterNotNull() {
        return fldFilterNotNull;
    }


    /**
     * Sets the fldFilterNotNull value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldFilterNotNull
     */
    public void setFldFilterNotNull(java.lang.Boolean fldFilterNotNull) {
        this.fldFilterNotNull = fldFilterNotNull;
    }


    /**
     * Gets the fldfilterNull value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldfilterNull
     */
    public java.lang.Boolean getFldfilterNull() {
        return fldfilterNull;
    }


    /**
     * Sets the fldfilterNull value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldfilterNull
     */
    public void setFldfilterNull(java.lang.Boolean fldfilterNull) {
        this.fldfilterNull = fldfilterNull;
    }


    /**
     * Gets the fldCompareField value for this ItemNumberCustomFieldFilter.
     * 
     * @return fldCompareField
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFldCompareField() {
        return fldCompareField;
    }


    /**
     * Sets the fldCompareField value for this ItemNumberCustomFieldFilter.
     * 
     * @param fldCompareField
     */
    public void setFldCompareField(com.netsuite.webservices.platform.core_2019_1.RecordRef fldCompareField) {
        this.fldCompareField = fldCompareField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemNumberCustomFieldFilter)) return false;
        ItemNumberCustomFieldFilter other = (ItemNumberCustomFieldFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fldFilter==null && other.getFldFilter()==null) || 
             (this.fldFilter!=null &&
              this.fldFilter.equals(other.getFldFilter()))) &&
            ((this.fldFilterChecked==null && other.getFldFilterChecked()==null) || 
             (this.fldFilterChecked!=null &&
              this.fldFilterChecked.equals(other.getFldFilterChecked()))) &&
            ((this.fldFilterCompareType==null && other.getFldFilterCompareType()==null) || 
             (this.fldFilterCompareType!=null &&
              this.fldFilterCompareType.equals(other.getFldFilterCompareType()))) &&
            ((this.fldFilterVal==null && other.getFldFilterVal()==null) || 
             (this.fldFilterVal!=null &&
              this.fldFilterVal.equals(other.getFldFilterVal()))) &&
            ((this.fldFilterNotNull==null && other.getFldFilterNotNull()==null) || 
             (this.fldFilterNotNull!=null &&
              this.fldFilterNotNull.equals(other.getFldFilterNotNull()))) &&
            ((this.fldfilterNull==null && other.getFldfilterNull()==null) || 
             (this.fldfilterNull!=null &&
              this.fldfilterNull.equals(other.getFldfilterNull()))) &&
            ((this.fldCompareField==null && other.getFldCompareField()==null) || 
             (this.fldCompareField!=null &&
              this.fldCompareField.equals(other.getFldCompareField())));
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
        if (getFldFilter() != null) {
            _hashCode += getFldFilter().hashCode();
        }
        if (getFldFilterChecked() != null) {
            _hashCode += getFldFilterChecked().hashCode();
        }
        if (getFldFilterCompareType() != null) {
            _hashCode += getFldFilterCompareType().hashCode();
        }
        if (getFldFilterVal() != null) {
            _hashCode += getFldFilterVal().hashCode();
        }
        if (getFldFilterNotNull() != null) {
            _hashCode += getFldFilterNotNull().hashCode();
        }
        if (getFldfilterNull() != null) {
            _hashCode += getFldfilterNull().hashCode();
        }
        if (getFldCompareField() != null) {
            _hashCode += getFldCompareField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemNumberCustomFieldFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "ItemNumberCustomFieldFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldFilterChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterCompareType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldFilterCompareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationFilterCompareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterVal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldFilterVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterNotNull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldFilterNotNull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldfilterNull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldfilterNull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldCompareField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fldCompareField"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
