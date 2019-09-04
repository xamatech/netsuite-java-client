/**
 * InvoiceItemCostList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class InvoiceItemCostList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCost[] itemCost;

    private boolean replaceAll;  // attribute

    public InvoiceItemCostList() {
    }

    public InvoiceItemCostList(
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCost[] itemCost,
           boolean replaceAll) {
           this.itemCost = itemCost;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the itemCost value for this InvoiceItemCostList.
     * 
     * @return itemCost
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCost[] getItemCost() {
        return itemCost;
    }


    /**
     * Sets the itemCost value for this InvoiceItemCostList.
     * 
     * @param itemCost
     */
    public void setItemCost(com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCost[] itemCost) {
        this.itemCost = itemCost;
    }

    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCost getItemCost(int i) {
        return this.itemCost[i];
    }

    public void setItemCost(int i, com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCost _value) {
        this.itemCost[i] = _value;
    }


    /**
     * Gets the replaceAll value for this InvoiceItemCostList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this InvoiceItemCostList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceItemCostList)) return false;
        InvoiceItemCostList other = (InvoiceItemCostList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemCost==null && other.getItemCost()==null) || 
             (this.itemCost!=null &&
              java.util.Arrays.equals(this.itemCost, other.getItemCost()))) &&
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
        if (getItemCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemCost(), i);
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
        new org.apache.axis.description.TypeDesc(InvoiceItemCostList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceItemCostList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceItemCost"));
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
