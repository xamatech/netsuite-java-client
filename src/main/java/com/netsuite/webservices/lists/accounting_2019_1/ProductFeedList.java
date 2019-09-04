/**
 * ProductFeedList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ProductFeedList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2019_1.types.ItemProductFeed[] productFeed;

    public ProductFeedList() {
    }

    public ProductFeedList(
           com.netsuite.webservices.lists.accounting_2019_1.types.ItemProductFeed[] productFeed) {
           this.productFeed = productFeed;
    }


    /**
     * Gets the productFeed value for this ProductFeedList.
     * 
     * @return productFeed
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemProductFeed[] getProductFeed() {
        return productFeed;
    }


    /**
     * Sets the productFeed value for this ProductFeedList.
     * 
     * @param productFeed
     */
    public void setProductFeed(com.netsuite.webservices.lists.accounting_2019_1.types.ItemProductFeed[] productFeed) {
        this.productFeed = productFeed;
    }

    public com.netsuite.webservices.lists.accounting_2019_1.types.ItemProductFeed getProductFeed(int i) {
        return this.productFeed[i];
    }

    public void setProductFeed(int i, com.netsuite.webservices.lists.accounting_2019_1.types.ItemProductFeed _value) {
        this.productFeed[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductFeedList)) return false;
        ProductFeedList other = (ProductFeedList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productFeed==null && other.getProductFeed()==null) || 
             (this.productFeed!=null &&
              java.util.Arrays.equals(this.productFeed, other.getProductFeed())));
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
        if (getProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductFeedList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ProductFeedList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "productFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "ItemProductFeed"));
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
