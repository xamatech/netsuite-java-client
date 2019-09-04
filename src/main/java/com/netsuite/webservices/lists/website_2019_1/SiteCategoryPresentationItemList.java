/**
 * SiteCategoryPresentationItemList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.website_2019_1;

public class SiteCategoryPresentationItemList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.PresentationItem[] presentationItem;

    private boolean replaceAll;  // attribute

    public SiteCategoryPresentationItemList() {
    }

    public SiteCategoryPresentationItemList(
           com.netsuite.webservices.platform.common_2019_1.PresentationItem[] presentationItem,
           boolean replaceAll) {
           this.presentationItem = presentationItem;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the presentationItem value for this SiteCategoryPresentationItemList.
     * 
     * @return presentationItem
     */
    public com.netsuite.webservices.platform.common_2019_1.PresentationItem[] getPresentationItem() {
        return presentationItem;
    }


    /**
     * Sets the presentationItem value for this SiteCategoryPresentationItemList.
     * 
     * @param presentationItem
     */
    public void setPresentationItem(com.netsuite.webservices.platform.common_2019_1.PresentationItem[] presentationItem) {
        this.presentationItem = presentationItem;
    }

    public com.netsuite.webservices.platform.common_2019_1.PresentationItem getPresentationItem(int i) {
        return this.presentationItem[i];
    }

    public void setPresentationItem(int i, com.netsuite.webservices.platform.common_2019_1.PresentationItem _value) {
        this.presentationItem[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SiteCategoryPresentationItemList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SiteCategoryPresentationItemList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteCategoryPresentationItemList)) return false;
        SiteCategoryPresentationItemList other = (SiteCategoryPresentationItemList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.presentationItem==null && other.getPresentationItem()==null) || 
             (this.presentationItem!=null &&
              java.util.Arrays.equals(this.presentationItem, other.getPresentationItem()))) &&
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
        if (getPresentationItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPresentationItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPresentationItem(), i);
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
        new org.apache.axis.description.TypeDesc(SiteCategoryPresentationItemList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "SiteCategoryPresentationItemList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "presentationItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PresentationItem"));
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
