/**
 * ItemFulfillmentPackageUspsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class ItemFulfillmentPackageUspsList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageUsps[] packageUsps;

    private boolean replaceAll;  // attribute

    public ItemFulfillmentPackageUspsList() {
    }

    public ItemFulfillmentPackageUspsList(
           com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageUsps[] packageUsps,
           boolean replaceAll) {
           this.packageUsps = packageUsps;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the packageUsps value for this ItemFulfillmentPackageUspsList.
     * 
     * @return packageUsps
     */
    public com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageUsps[] getPackageUsps() {
        return packageUsps;
    }


    /**
     * Sets the packageUsps value for this ItemFulfillmentPackageUspsList.
     * 
     * @param packageUsps
     */
    public void setPackageUsps(com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageUsps[] packageUsps) {
        this.packageUsps = packageUsps;
    }

    public com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageUsps getPackageUsps(int i) {
        return this.packageUsps[i];
    }

    public void setPackageUsps(int i, com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillmentPackageUsps _value) {
        this.packageUsps[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ItemFulfillmentPackageUspsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ItemFulfillmentPackageUspsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageUspsList)) return false;
        ItemFulfillmentPackageUspsList other = (ItemFulfillmentPackageUspsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageUsps==null && other.getPackageUsps()==null) || 
             (this.packageUsps!=null &&
              java.util.Arrays.equals(this.packageUsps, other.getPackageUsps()))) &&
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
        if (getPackageUsps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageUsps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageUsps(), i);
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageUspsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageUsps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "packageUsps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUsps"));
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
