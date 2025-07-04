/**
 * InvoiceSalesTeamList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2024_2;

public class InvoiceSalesTeamList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2024_2.InvoiceSalesTeam[] salesTeam;

    private boolean replaceAll;  // attribute

    public InvoiceSalesTeamList() {
    }

    public InvoiceSalesTeamList(
           com.netsuite.webservices.transactions.sales_2024_2.InvoiceSalesTeam[] salesTeam,
           boolean replaceAll) {
           this.salesTeam = salesTeam;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the salesTeam value for this InvoiceSalesTeamList.
     * 
     * @return salesTeam
     */
    public com.netsuite.webservices.transactions.sales_2024_2.InvoiceSalesTeam[] getSalesTeam() {
        return salesTeam;
    }


    /**
     * Sets the salesTeam value for this InvoiceSalesTeamList.
     * 
     * @param salesTeam
     */
    public void setSalesTeam(com.netsuite.webservices.transactions.sales_2024_2.InvoiceSalesTeam[] salesTeam) {
        this.salesTeam = salesTeam;
    }

    public com.netsuite.webservices.transactions.sales_2024_2.InvoiceSalesTeam getSalesTeam(int i) {
        return this.salesTeam[i];
    }

    public void setSalesTeam(int i, com.netsuite.webservices.transactions.sales_2024_2.InvoiceSalesTeam _value) {
        this.salesTeam[i] = _value;
    }


    /**
     * Gets the replaceAll value for this InvoiceSalesTeamList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this InvoiceSalesTeamList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceSalesTeamList)) return false;
        InvoiceSalesTeamList other = (InvoiceSalesTeamList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salesTeam==null && other.getSalesTeam()==null) || 
             (this.salesTeam!=null &&
              java.util.Arrays.equals(this.salesTeam, other.getSalesTeam()))) &&
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
        if (getSalesTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeam(), i);
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
        new org.apache.axis.description.TypeDesc(InvoiceSalesTeamList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "InvoiceSalesTeamList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "salesTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "InvoiceSalesTeam"));
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
