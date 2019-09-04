/**
 * DepositOtherList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.bank_2019_1;

public class DepositOtherList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.bank_2019_1.DepositOther[] depositOther;

    private boolean replaceAll;  // attribute

    public DepositOtherList() {
    }

    public DepositOtherList(
           com.netsuite.webservices.transactions.bank_2019_1.DepositOther[] depositOther,
           boolean replaceAll) {
           this.depositOther = depositOther;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the depositOther value for this DepositOtherList.
     * 
     * @return depositOther
     */
    public com.netsuite.webservices.transactions.bank_2019_1.DepositOther[] getDepositOther() {
        return depositOther;
    }


    /**
     * Sets the depositOther value for this DepositOtherList.
     * 
     * @param depositOther
     */
    public void setDepositOther(com.netsuite.webservices.transactions.bank_2019_1.DepositOther[] depositOther) {
        this.depositOther = depositOther;
    }

    public com.netsuite.webservices.transactions.bank_2019_1.DepositOther getDepositOther(int i) {
        return this.depositOther[i];
    }

    public void setDepositOther(int i, com.netsuite.webservices.transactions.bank_2019_1.DepositOther _value) {
        this.depositOther[i] = _value;
    }


    /**
     * Gets the replaceAll value for this DepositOtherList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this DepositOtherList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositOtherList)) return false;
        DepositOtherList other = (DepositOtherList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositOther==null && other.getDepositOther()==null) || 
             (this.depositOther!=null &&
              java.util.Arrays.equals(this.depositOther, other.getDepositOther()))) &&
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
        if (getDepositOther() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositOther());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositOther(), i);
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
        new org.apache.axis.description.TypeDesc(DepositOtherList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "DepositOtherList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositOther");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "depositOther"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "DepositOther"));
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
