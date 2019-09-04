/**
 * PurchaseRequisitionExpenseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class PurchaseRequisitionExpenseList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpense[] purchaseRequisitionExpense;

    private boolean replaceAll;  // attribute

    public PurchaseRequisitionExpenseList() {
    }

    public PurchaseRequisitionExpenseList(
           com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpense[] purchaseRequisitionExpense,
           boolean replaceAll) {
           this.purchaseRequisitionExpense = purchaseRequisitionExpense;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the purchaseRequisitionExpense value for this PurchaseRequisitionExpenseList.
     * 
     * @return purchaseRequisitionExpense
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpense[] getPurchaseRequisitionExpense() {
        return purchaseRequisitionExpense;
    }


    /**
     * Sets the purchaseRequisitionExpense value for this PurchaseRequisitionExpenseList.
     * 
     * @param purchaseRequisitionExpense
     */
    public void setPurchaseRequisitionExpense(com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpense[] purchaseRequisitionExpense) {
        this.purchaseRequisitionExpense = purchaseRequisitionExpense;
    }

    public com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpense getPurchaseRequisitionExpense(int i) {
        return this.purchaseRequisitionExpense[i];
    }

    public void setPurchaseRequisitionExpense(int i, com.netsuite.webservices.transactions.purchases_2019_1.PurchaseRequisitionExpense _value) {
        this.purchaseRequisitionExpense[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PurchaseRequisitionExpenseList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PurchaseRequisitionExpenseList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseRequisitionExpenseList)) return false;
        PurchaseRequisitionExpenseList other = (PurchaseRequisitionExpenseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purchaseRequisitionExpense==null && other.getPurchaseRequisitionExpense()==null) || 
             (this.purchaseRequisitionExpense!=null &&
              java.util.Arrays.equals(this.purchaseRequisitionExpense, other.getPurchaseRequisitionExpense()))) &&
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
        if (getPurchaseRequisitionExpense() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseRequisitionExpense());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseRequisitionExpense(), i);
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
        new org.apache.axis.description.TypeDesc(PurchaseRequisitionExpenseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpenseList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseRequisitionExpense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "purchaseRequisitionExpense"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpense"));
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
