/**
 * SearchPreferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2019_1;

public class SearchPreferences  implements java.io.Serializable {
    private java.lang.Boolean bodyFieldsOnly;

    private java.lang.Boolean returnSearchColumns;

    private java.lang.Integer pageSize;

    public SearchPreferences() {
    }

    public SearchPreferences(
           java.lang.Boolean bodyFieldsOnly,
           java.lang.Boolean returnSearchColumns,
           java.lang.Integer pageSize) {
           this.bodyFieldsOnly = bodyFieldsOnly;
           this.returnSearchColumns = returnSearchColumns;
           this.pageSize = pageSize;
    }


    /**
     * Gets the bodyFieldsOnly value for this SearchPreferences.
     * 
     * @return bodyFieldsOnly
     */
    public java.lang.Boolean getBodyFieldsOnly() {
        return bodyFieldsOnly;
    }


    /**
     * Sets the bodyFieldsOnly value for this SearchPreferences.
     * 
     * @param bodyFieldsOnly
     */
    public void setBodyFieldsOnly(java.lang.Boolean bodyFieldsOnly) {
        this.bodyFieldsOnly = bodyFieldsOnly;
    }


    /**
     * Gets the returnSearchColumns value for this SearchPreferences.
     * 
     * @return returnSearchColumns
     */
    public java.lang.Boolean getReturnSearchColumns() {
        return returnSearchColumns;
    }


    /**
     * Sets the returnSearchColumns value for this SearchPreferences.
     * 
     * @param returnSearchColumns
     */
    public void setReturnSearchColumns(java.lang.Boolean returnSearchColumns) {
        this.returnSearchColumns = returnSearchColumns;
    }


    /**
     * Gets the pageSize value for this SearchPreferences.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this SearchPreferences.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchPreferences)) return false;
        SearchPreferences other = (SearchPreferences) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bodyFieldsOnly==null && other.getBodyFieldsOnly()==null) || 
             (this.bodyFieldsOnly!=null &&
              this.bodyFieldsOnly.equals(other.getBodyFieldsOnly()))) &&
            ((this.returnSearchColumns==null && other.getReturnSearchColumns()==null) || 
             (this.returnSearchColumns!=null &&
              this.returnSearchColumns.equals(other.getReturnSearchColumns()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize())));
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
        if (getBodyFieldsOnly() != null) {
            _hashCode += getBodyFieldsOnly().hashCode();
        }
        if (getReturnSearchColumns() != null) {
            _hashCode += getReturnSearchColumns().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchPreferences.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "SearchPreferences"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyFieldsOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "bodyFieldsOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnSearchColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "returnSearchColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
