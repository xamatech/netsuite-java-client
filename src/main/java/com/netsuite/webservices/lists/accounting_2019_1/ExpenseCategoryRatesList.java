/**
 * ExpenseCategoryRatesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ExpenseCategoryRatesList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.ExpenseCategoryRates[] expenseCategoryRates;

    private boolean replaceAll;  // attribute

    public ExpenseCategoryRatesList() {
    }

    public ExpenseCategoryRatesList(
           com.netsuite.webservices.lists.accounting_2019_1.ExpenseCategoryRates[] expenseCategoryRates,
           boolean replaceAll) {
           this.expenseCategoryRates = expenseCategoryRates;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the expenseCategoryRates value for this ExpenseCategoryRatesList.
     * 
     * @return expenseCategoryRates
     */
    public com.netsuite.webservices.lists.accounting_2019_1.ExpenseCategoryRates[] getExpenseCategoryRates() {
        return expenseCategoryRates;
    }


    /**
     * Sets the expenseCategoryRates value for this ExpenseCategoryRatesList.
     * 
     * @param expenseCategoryRates
     */
    public void setExpenseCategoryRates(com.netsuite.webservices.lists.accounting_2019_1.ExpenseCategoryRates[] expenseCategoryRates) {
        this.expenseCategoryRates = expenseCategoryRates;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.ExpenseCategoryRates getExpenseCategoryRates(int i) {
        return this.expenseCategoryRates[i];
    }

    public void setExpenseCategoryRates(int i, com.netsuite.webservices.lists.accounting_2019_1.ExpenseCategoryRates _value) {
        this.expenseCategoryRates[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ExpenseCategoryRatesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ExpenseCategoryRatesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpenseCategoryRatesList)) return false;
        ExpenseCategoryRatesList other = (ExpenseCategoryRatesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expenseCategoryRates==null && other.getExpenseCategoryRates()==null) || 
             (this.expenseCategoryRates!=null &&
              java.util.Arrays.equals(this.expenseCategoryRates, other.getExpenseCategoryRates()))) &&
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
        if (getExpenseCategoryRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseCategoryRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseCategoryRates(), i);
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
        new org.apache.axis.description.TypeDesc(ExpenseCategoryRatesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ExpenseCategoryRatesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategoryRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "expenseCategoryRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ExpenseCategoryRates"));
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
