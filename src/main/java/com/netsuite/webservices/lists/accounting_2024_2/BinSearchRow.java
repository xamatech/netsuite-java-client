/**
 * BinSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class BinSearchRow  extends com.netsuite.webservices.platform.core_2024_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.BinSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin;

    public BinSearchRow() {
    }

    public BinSearchRow(
           com.netsuite.webservices.platform.common_2024_2.BinSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this BinSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2024_2.BinSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this BinSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2024_2.BinSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the userJoin value for this BinSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this BinSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the customSearchJoin value for this BinSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this BinSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinSearchRow)) return false;
        BinSearchRow other = (BinSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
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
        new org.apache.axis.description.TypeDesc(BinSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "BinSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
