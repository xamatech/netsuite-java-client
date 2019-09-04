/**
 * ItemFulfillmentPackageFedExList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class ItemFulfillmentPackageFedExList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageFedEx[] packageFedEx;

    private boolean replaceAll;  // attribute

    public ItemFulfillmentPackageFedExList() {
    }

    public ItemFulfillmentPackageFedExList(
           com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageFedEx[] packageFedEx,
           boolean replaceAll) {
           this.packageFedEx = packageFedEx;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the packageFedEx value for this ItemFulfillmentPackageFedExList.
     * 
     * @return packageFedEx
     */
    public com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageFedEx[] getPackageFedEx() {
        return packageFedEx;
    }


    /**
     * Sets the packageFedEx value for this ItemFulfillmentPackageFedExList.
     * 
     * @param packageFedEx
     */
    public void setPackageFedEx(com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageFedEx[] packageFedEx) {
        this.packageFedEx = packageFedEx;
    }

    public com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageFedEx getPackageFedEx(int i) {
        return this.packageFedEx[i];
    }

    public void setPackageFedEx(int i, com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageFedEx _value) {
        this.packageFedEx[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ItemFulfillmentPackageFedExList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ItemFulfillmentPackageFedExList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageFedExList)) return false;
        ItemFulfillmentPackageFedExList other = (ItemFulfillmentPackageFedExList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageFedEx==null && other.getPackageFedEx()==null) || 
             (this.packageFedEx!=null &&
              java.util.Arrays.equals(this.packageFedEx, other.getPackageFedEx()))) &&
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
        if (getPackageFedEx() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageFedEx());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageFedEx(), i);
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedExList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedEx"));
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
