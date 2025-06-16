/**
 * EmployeeCorporateCardsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2024_2;

public class EmployeeCorporateCardsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.employees_2024_2.EmployeeCorporateCards[] corporateCards;

    private boolean replaceAll;  // attribute

    public EmployeeCorporateCardsList() {
    }

    public EmployeeCorporateCardsList(
           com.netsuite.webservices.lists.employees_2024_2.EmployeeCorporateCards[] corporateCards,
           boolean replaceAll) {
           this.corporateCards = corporateCards;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the corporateCards value for this EmployeeCorporateCardsList.
     * 
     * @return corporateCards
     */
    public com.netsuite.webservices.lists.employees_2024_2.EmployeeCorporateCards[] getCorporateCards() {
        return corporateCards;
    }


    /**
     * Sets the corporateCards value for this EmployeeCorporateCardsList.
     * 
     * @param corporateCards
     */
    public void setCorporateCards(com.netsuite.webservices.lists.employees_2024_2.EmployeeCorporateCards[] corporateCards) {
        this.corporateCards = corporateCards;
    }

    public com.netsuite.webservices.lists.employees_2024_2.EmployeeCorporateCards getCorporateCards(int i) {
        return this.corporateCards[i];
    }

    public void setCorporateCards(int i, com.netsuite.webservices.lists.employees_2024_2.EmployeeCorporateCards _value) {
        this.corporateCards[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EmployeeCorporateCardsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EmployeeCorporateCardsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeCorporateCardsList)) return false;
        EmployeeCorporateCardsList other = (EmployeeCorporateCardsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.corporateCards==null && other.getCorporateCards()==null) || 
             (this.corporateCards!=null &&
              java.util.Arrays.equals(this.corporateCards, other.getCorporateCards()))) &&
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
        if (getCorporateCards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorporateCards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorporateCards(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeCorporateCardsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "EmployeeCorporateCardsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "corporateCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "EmployeeCorporateCards"));
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
