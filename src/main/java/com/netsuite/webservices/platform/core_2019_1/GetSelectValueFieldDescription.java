/**
 * GetSelectValueFieldDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class GetSelectValueFieldDescription  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.types.RecordType recordType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customRecordType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customTransactionType;

    private java.lang.String sublist;

    private java.lang.String field;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.GetSelectValueFilter filter;

    private com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValueList filterByValueList;

    public GetSelectValueFieldDescription() {
    }

    public GetSelectValueFieldDescription(
           com.netsuite.webservices.platform.core_2019_1.types.RecordType recordType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customRecordType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customTransactionType,
           java.lang.String sublist,
           java.lang.String field,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.GetSelectValueFilter filter,
           com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValueList filterByValueList) {
           this.recordType = recordType;
           this.customRecordType = customRecordType;
           this.customTransactionType = customTransactionType;
           this.sublist = sublist;
           this.field = field;
           this.customForm = customForm;
           this.filter = filter;
           this.filterByValueList = filterByValueList;
    }


    /**
     * Gets the recordType value for this GetSelectValueFieldDescription.
     * 
     * @return recordType
     */
    public com.netsuite.webservices.platform.core_2019_1.types.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this GetSelectValueFieldDescription.
     * 
     * @param recordType
     */
    public void setRecordType(com.netsuite.webservices.platform.core_2019_1.types.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the customRecordType value for this GetSelectValueFieldDescription.
     * 
     * @return customRecordType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomRecordType() {
        return customRecordType;
    }


    /**
     * Sets the customRecordType value for this GetSelectValueFieldDescription.
     * 
     * @param customRecordType
     */
    public void setCustomRecordType(com.netsuite.webservices.platform.core_2019_1.RecordRef customRecordType) {
        this.customRecordType = customRecordType;
    }


    /**
     * Gets the customTransactionType value for this GetSelectValueFieldDescription.
     * 
     * @return customTransactionType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomTransactionType() {
        return customTransactionType;
    }


    /**
     * Sets the customTransactionType value for this GetSelectValueFieldDescription.
     * 
     * @param customTransactionType
     */
    public void setCustomTransactionType(com.netsuite.webservices.platform.core_2019_1.RecordRef customTransactionType) {
        this.customTransactionType = customTransactionType;
    }


    /**
     * Gets the sublist value for this GetSelectValueFieldDescription.
     * 
     * @return sublist
     */
    public java.lang.String getSublist() {
        return sublist;
    }


    /**
     * Sets the sublist value for this GetSelectValueFieldDescription.
     * 
     * @param sublist
     */
    public void setSublist(java.lang.String sublist) {
        this.sublist = sublist;
    }


    /**
     * Gets the field value for this GetSelectValueFieldDescription.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this GetSelectValueFieldDescription.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the customForm value for this GetSelectValueFieldDescription.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this GetSelectValueFieldDescription.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the filter value for this GetSelectValueFieldDescription.
     * 
     * @return filter
     */
    public com.netsuite.webservices.platform.core_2019_1.GetSelectValueFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this GetSelectValueFieldDescription.
     * 
     * @param filter
     */
    public void setFilter(com.netsuite.webservices.platform.core_2019_1.GetSelectValueFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the filterByValueList value for this GetSelectValueFieldDescription.
     * 
     * @return filterByValueList
     */
    public com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValueList getFilterByValueList() {
        return filterByValueList;
    }


    /**
     * Sets the filterByValueList value for this GetSelectValueFieldDescription.
     * 
     * @param filterByValueList
     */
    public void setFilterByValueList(com.netsuite.webservices.platform.core_2019_1.GetSelectFilterByFieldValueList filterByValueList) {
        this.filterByValueList = filterByValueList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSelectValueFieldDescription)) return false;
        GetSelectValueFieldDescription other = (GetSelectValueFieldDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.customRecordType==null && other.getCustomRecordType()==null) || 
             (this.customRecordType!=null &&
              this.customRecordType.equals(other.getCustomRecordType()))) &&
            ((this.customTransactionType==null && other.getCustomTransactionType()==null) || 
             (this.customTransactionType!=null &&
              this.customTransactionType.equals(other.getCustomTransactionType()))) &&
            ((this.sublist==null && other.getSublist()==null) || 
             (this.sublist!=null &&
              this.sublist.equals(other.getSublist()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.filterByValueList==null && other.getFilterByValueList()==null) || 
             (this.filterByValueList!=null &&
              this.filterByValueList.equals(other.getFilterByValueList())));
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
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getCustomRecordType() != null) {
            _hashCode += getCustomRecordType().hashCode();
        }
        if (getCustomTransactionType() != null) {
            _hashCode += getCustomTransactionType().hashCode();
        }
        if (getSublist() != null) {
            _hashCode += getSublist().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getFilterByValueList() != null) {
            _hashCode += getFilterByValueList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSelectValueFieldDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetSelectValueFieldDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customRecordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "customRecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTransactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "customTransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sublist");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "sublist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetSelectValueFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterByValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "filterByValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValueList"));
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
