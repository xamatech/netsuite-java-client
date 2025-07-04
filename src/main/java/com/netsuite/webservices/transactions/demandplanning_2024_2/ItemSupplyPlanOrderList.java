/**
 * ItemSupplyPlanOrderList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2024_2;

public class ItemSupplyPlanOrderList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.demandplanning_2024_2.ItemSupplyPlanOrder[] itemSupplyPlanOrder;

    private boolean replaceAll;  // attribute

    public ItemSupplyPlanOrderList() {
    }

    public ItemSupplyPlanOrderList(
           com.netsuite.webservices.transactions.demandplanning_2024_2.ItemSupplyPlanOrder[] itemSupplyPlanOrder,
           boolean replaceAll) {
           this.itemSupplyPlanOrder = itemSupplyPlanOrder;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the itemSupplyPlanOrder value for this ItemSupplyPlanOrderList.
     * 
     * @return itemSupplyPlanOrder
     */
    public com.netsuite.webservices.transactions.demandplanning_2024_2.ItemSupplyPlanOrder[] getItemSupplyPlanOrder() {
        return itemSupplyPlanOrder;
    }


    /**
     * Sets the itemSupplyPlanOrder value for this ItemSupplyPlanOrderList.
     * 
     * @param itemSupplyPlanOrder
     */
    public void setItemSupplyPlanOrder(com.netsuite.webservices.transactions.demandplanning_2024_2.ItemSupplyPlanOrder[] itemSupplyPlanOrder) {
        this.itemSupplyPlanOrder = itemSupplyPlanOrder;
    }

    public com.netsuite.webservices.transactions.demandplanning_2024_2.ItemSupplyPlanOrder getItemSupplyPlanOrder(int i) {
        return this.itemSupplyPlanOrder[i];
    }

    public void setItemSupplyPlanOrder(int i, com.netsuite.webservices.transactions.demandplanning_2024_2.ItemSupplyPlanOrder _value) {
        this.itemSupplyPlanOrder[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ItemSupplyPlanOrderList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ItemSupplyPlanOrderList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSupplyPlanOrderList)) return false;
        ItemSupplyPlanOrderList other = (ItemSupplyPlanOrderList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemSupplyPlanOrder==null && other.getItemSupplyPlanOrder()==null) || 
             (this.itemSupplyPlanOrder!=null &&
              java.util.Arrays.equals(this.itemSupplyPlanOrder, other.getItemSupplyPlanOrder()))) &&
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
        if (getItemSupplyPlanOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemSupplyPlanOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemSupplyPlanOrder(), i);
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
        new org.apache.axis.description.TypeDesc(ItemSupplyPlanOrderList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "ItemSupplyPlanOrderList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSupplyPlanOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "itemSupplyPlanOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "ItemSupplyPlanOrder"));
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
