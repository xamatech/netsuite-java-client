/**
 * AccountLocalizationsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class AccountLocalizationsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizations[] accountLocalizations;

    private boolean replaceAll;  // attribute

    public AccountLocalizationsList() {
    }

    public AccountLocalizationsList(
           com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizations[] accountLocalizations,
           boolean replaceAll) {
           this.accountLocalizations = accountLocalizations;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the accountLocalizations value for this AccountLocalizationsList.
     * 
     * @return accountLocalizations
     */
    public com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizations[] getAccountLocalizations() {
        return accountLocalizations;
    }


    /**
     * Sets the accountLocalizations value for this AccountLocalizationsList.
     * 
     * @param accountLocalizations
     */
    public void setAccountLocalizations(com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizations[] accountLocalizations) {
        this.accountLocalizations = accountLocalizations;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizations getAccountLocalizations(int i) {
        return this.accountLocalizations[i];
    }

    public void setAccountLocalizations(int i, com.netsuite.webservices.lists.accounting_2019_1.AccountLocalizations _value) {
        this.accountLocalizations[i] = _value;
    }


    /**
     * Gets the replaceAll value for this AccountLocalizationsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this AccountLocalizationsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountLocalizationsList)) return false;
        AccountLocalizationsList other = (AccountLocalizationsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountLocalizations==null && other.getAccountLocalizations()==null) || 
             (this.accountLocalizations!=null &&
              java.util.Arrays.equals(this.accountLocalizations, other.getAccountLocalizations()))) &&
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
        if (getAccountLocalizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountLocalizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountLocalizations(), i);
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
        new org.apache.axis.description.TypeDesc(AccountLocalizationsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountLocalizationsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountLocalizations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "accountLocalizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "AccountLocalizations"));
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
