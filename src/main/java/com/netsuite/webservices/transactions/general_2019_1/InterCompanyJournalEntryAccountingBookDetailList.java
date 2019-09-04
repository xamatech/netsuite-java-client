/**
 * InterCompanyJournalEntryAccountingBookDetailList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.general_2019_1;

public class InterCompanyJournalEntryAccountingBookDetailList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.general_2019_1.InterCompanyJournalEntryAccountingBookDetail[] interCompanyJournalEntryAccountingBookDetail;

    private boolean replaceAll;  // attribute

    public InterCompanyJournalEntryAccountingBookDetailList() {
    }

    public InterCompanyJournalEntryAccountingBookDetailList(
           com.netsuite.webservices.transactions.general_2019_1.InterCompanyJournalEntryAccountingBookDetail[] interCompanyJournalEntryAccountingBookDetail,
           boolean replaceAll) {
           this.interCompanyJournalEntryAccountingBookDetail = interCompanyJournalEntryAccountingBookDetail;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the interCompanyJournalEntryAccountingBookDetail value for this InterCompanyJournalEntryAccountingBookDetailList.
     * 
     * @return interCompanyJournalEntryAccountingBookDetail
     */
    public com.netsuite.webservices.transactions.general_2019_1.InterCompanyJournalEntryAccountingBookDetail[] getInterCompanyJournalEntryAccountingBookDetail() {
        return interCompanyJournalEntryAccountingBookDetail;
    }


    /**
     * Sets the interCompanyJournalEntryAccountingBookDetail value for this InterCompanyJournalEntryAccountingBookDetailList.
     * 
     * @param interCompanyJournalEntryAccountingBookDetail
     */
    public void setInterCompanyJournalEntryAccountingBookDetail(com.netsuite.webservices.transactions.general_2019_1.InterCompanyJournalEntryAccountingBookDetail[] interCompanyJournalEntryAccountingBookDetail) {
        this.interCompanyJournalEntryAccountingBookDetail = interCompanyJournalEntryAccountingBookDetail;
    }

    public com.netsuite.webservices.transactions.general_2019_1.InterCompanyJournalEntryAccountingBookDetail getInterCompanyJournalEntryAccountingBookDetail(int i) {
        return this.interCompanyJournalEntryAccountingBookDetail[i];
    }

    public void setInterCompanyJournalEntryAccountingBookDetail(int i, com.netsuite.webservices.transactions.general_2019_1.InterCompanyJournalEntryAccountingBookDetail _value) {
        this.interCompanyJournalEntryAccountingBookDetail[i] = _value;
    }


    /**
     * Gets the replaceAll value for this InterCompanyJournalEntryAccountingBookDetailList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this InterCompanyJournalEntryAccountingBookDetailList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterCompanyJournalEntryAccountingBookDetailList)) return false;
        InterCompanyJournalEntryAccountingBookDetailList other = (InterCompanyJournalEntryAccountingBookDetailList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interCompanyJournalEntryAccountingBookDetail==null && other.getInterCompanyJournalEntryAccountingBookDetail()==null) || 
             (this.interCompanyJournalEntryAccountingBookDetail!=null &&
              java.util.Arrays.equals(this.interCompanyJournalEntryAccountingBookDetail, other.getInterCompanyJournalEntryAccountingBookDetail()))) &&
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
        if (getInterCompanyJournalEntryAccountingBookDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterCompanyJournalEntryAccountingBookDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterCompanyJournalEntryAccountingBookDetail(), i);
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
        new org.apache.axis.description.TypeDesc(InterCompanyJournalEntryAccountingBookDetailList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryAccountingBookDetailList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interCompanyJournalEntryAccountingBookDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "interCompanyJournalEntryAccountingBookDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:general_2019_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryAccountingBookDetail"));
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
