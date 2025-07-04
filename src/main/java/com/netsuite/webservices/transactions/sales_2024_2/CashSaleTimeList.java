/**
 * CashSaleTimeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2024_2;

public class CashSaleTimeList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2024_2.CashSaleTime[] time;

    private boolean replaceAll;  // attribute

    public CashSaleTimeList() {
    }

    public CashSaleTimeList(
           com.netsuite.webservices.transactions.sales_2024_2.CashSaleTime[] time,
           boolean replaceAll) {
           this.time = time;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the time value for this CashSaleTimeList.
     * 
     * @return time
     */
    public com.netsuite.webservices.transactions.sales_2024_2.CashSaleTime[] getTime() {
        return time;
    }


    /**
     * Sets the time value for this CashSaleTimeList.
     * 
     * @param time
     */
    public void setTime(com.netsuite.webservices.transactions.sales_2024_2.CashSaleTime[] time) {
        this.time = time;
    }

    public com.netsuite.webservices.transactions.sales_2024_2.CashSaleTime getTime(int i) {
        return this.time[i];
    }

    public void setTime(int i, com.netsuite.webservices.transactions.sales_2024_2.CashSaleTime _value) {
        this.time[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CashSaleTimeList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CashSaleTimeList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CashSaleTimeList)) return false;
        CashSaleTimeList other = (CashSaleTimeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              java.util.Arrays.equals(this.time, other.getTime()))) &&
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
        if (getTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTime(), i);
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
        new org.apache.axis.description.TypeDesc(CashSaleTimeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "CashSaleTimeList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "CashSaleTime"));
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
