/**
 * BudgetExchangeRateList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class BudgetExchangeRateList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate[] budgetExchangeRate;

    public BudgetExchangeRateList() {
    }

    public BudgetExchangeRateList(
           com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate[] budgetExchangeRate) {
           this.budgetExchangeRate = budgetExchangeRate;
    }


    /**
     * Gets the budgetExchangeRate value for this BudgetExchangeRateList.
     * 
     * @return budgetExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate[] getBudgetExchangeRate() {
        return budgetExchangeRate;
    }


    /**
     * Sets the budgetExchangeRate value for this BudgetExchangeRateList.
     * 
     * @param budgetExchangeRate
     */
    public void setBudgetExchangeRate(com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate[] budgetExchangeRate) {
        this.budgetExchangeRate = budgetExchangeRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate getBudgetExchangeRate(int i) {
        return this.budgetExchangeRate[i];
    }

    public void setBudgetExchangeRate(int i, com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate _value) {
        this.budgetExchangeRate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetExchangeRateList)) return false;
        BudgetExchangeRateList other = (BudgetExchangeRateList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budgetExchangeRate==null && other.getBudgetExchangeRate()==null) || 
             (this.budgetExchangeRate!=null &&
              java.util.Arrays.equals(this.budgetExchangeRate, other.getBudgetExchangeRate())));
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
        if (getBudgetExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetExchangeRate(), i);
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
        new org.apache.axis.description.TypeDesc(BudgetExchangeRateList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "BudgetExchangeRateList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "budgetExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "BudgetExchangeRate"));
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
