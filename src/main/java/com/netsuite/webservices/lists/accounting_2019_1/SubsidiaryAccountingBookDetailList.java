/**
 * SubsidiaryAccountingBookDetailList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class SubsidiaryAccountingBookDetailList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetail[] subsidiaryAccountingBookDetail;

    private boolean replaceAll;  // attribute

    public SubsidiaryAccountingBookDetailList() {
    }

    public SubsidiaryAccountingBookDetailList(
           com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetail[] subsidiaryAccountingBookDetail,
           boolean replaceAll) {
           this.subsidiaryAccountingBookDetail = subsidiaryAccountingBookDetail;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the subsidiaryAccountingBookDetail value for this SubsidiaryAccountingBookDetailList.
     * 
     * @return subsidiaryAccountingBookDetail
     */
    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetail[] getSubsidiaryAccountingBookDetail() {
        return subsidiaryAccountingBookDetail;
    }


    /**
     * Sets the subsidiaryAccountingBookDetail value for this SubsidiaryAccountingBookDetailList.
     * 
     * @param subsidiaryAccountingBookDetail
     */
    public void setSubsidiaryAccountingBookDetail(com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetail[] subsidiaryAccountingBookDetail) {
        this.subsidiaryAccountingBookDetail = subsidiaryAccountingBookDetail;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetail getSubsidiaryAccountingBookDetail(int i) {
        return this.subsidiaryAccountingBookDetail[i];
    }

    public void setSubsidiaryAccountingBookDetail(int i, com.netsuite.webservices.lists.accounting_2019_1.SubsidiaryAccountingBookDetail _value) {
        this.subsidiaryAccountingBookDetail[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SubsidiaryAccountingBookDetailList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SubsidiaryAccountingBookDetailList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiaryAccountingBookDetailList)) return false;
        SubsidiaryAccountingBookDetailList other = (SubsidiaryAccountingBookDetailList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subsidiaryAccountingBookDetail==null && other.getSubsidiaryAccountingBookDetail()==null) || 
             (this.subsidiaryAccountingBookDetail!=null &&
              java.util.Arrays.equals(this.subsidiaryAccountingBookDetail, other.getSubsidiaryAccountingBookDetail()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getSubsidiaryAccountingBookDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryAccountingBookDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiaryAccountingBookDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubsidiaryAccountingBookDetailList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryAccountingBookDetailList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryAccountingBookDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "subsidiaryAccountingBookDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiaryAccountingBookDetail"));
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
