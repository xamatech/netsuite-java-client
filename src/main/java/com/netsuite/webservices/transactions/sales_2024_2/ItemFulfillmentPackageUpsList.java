/**
 * ItemFulfillmentPackageUpsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2024_2;

public class ItemFulfillmentPackageUpsList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2024_2.ItemFulfillmentPackageUps[] packageUps;

    private boolean replaceAll;  // attribute

    public ItemFulfillmentPackageUpsList() {
    }

    public ItemFulfillmentPackageUpsList(
           com.netsuite.webservices.transactions.sales_2024_2.ItemFulfillmentPackageUps[] packageUps,
           boolean replaceAll) {
           this.packageUps = packageUps;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the packageUps value for this ItemFulfillmentPackageUpsList.
     * 
     * @return packageUps
     */
    public com.netsuite.webservices.transactions.sales_2024_2.ItemFulfillmentPackageUps[] getPackageUps() {
        return packageUps;
    }


    /**
     * Sets the packageUps value for this ItemFulfillmentPackageUpsList.
     * 
     * @param packageUps
     */
    public void setPackageUps(com.netsuite.webservices.transactions.sales_2024_2.ItemFulfillmentPackageUps[] packageUps) {
        this.packageUps = packageUps;
    }

    public com.netsuite.webservices.transactions.sales_2024_2.ItemFulfillmentPackageUps getPackageUps(int i) {
        return this.packageUps[i];
    }

    public void setPackageUps(int i, com.netsuite.webservices.transactions.sales_2024_2.ItemFulfillmentPackageUps _value) {
        this.packageUps[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ItemFulfillmentPackageUpsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ItemFulfillmentPackageUpsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageUpsList)) return false;
        ItemFulfillmentPackageUpsList other = (ItemFulfillmentPackageUpsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageUps==null && other.getPackageUps()==null) || 
             (this.packageUps!=null &&
              java.util.Arrays.equals(this.packageUps, other.getPackageUps()))) &&
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
        if (getPackageUps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageUps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageUps(), i);
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageUpsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "packageUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2024_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUps"));
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
