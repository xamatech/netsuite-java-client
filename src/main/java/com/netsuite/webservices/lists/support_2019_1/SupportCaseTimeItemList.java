/**
 * SupportCaseTimeItemList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class SupportCaseTimeItemList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.TimeItem[] timeItem;

    private boolean replaceAll;  // attribute

    public SupportCaseTimeItemList() {
    }

    public SupportCaseTimeItemList(
           com.netsuite.webservices.platform.common_2019_1.TimeItem[] timeItem,
           boolean replaceAll) {
           this.timeItem = timeItem;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the timeItem value for this SupportCaseTimeItemList.
     * 
     * @return timeItem
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeItem[] getTimeItem() {
        return timeItem;
    }


    /**
     * Sets the timeItem value for this SupportCaseTimeItemList.
     * 
     * @param timeItem
     */
    public void setTimeItem(com.netsuite.webservices.platform.common_2019_1.TimeItem[] timeItem) {
        this.timeItem = timeItem;
    }

    public com.netsuite.webservices.platform.common_2019_1.TimeItem getTimeItem(int i) {
        return this.timeItem[i];
    }

    public void setTimeItem(int i, com.netsuite.webservices.platform.common_2019_1.TimeItem _value) {
        this.timeItem[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SupportCaseTimeItemList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SupportCaseTimeItemList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseTimeItemList)) return false;
        SupportCaseTimeItemList other = (SupportCaseTimeItemList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeItem==null && other.getTimeItem()==null) || 
             (this.timeItem!=null &&
              java.util.Arrays.equals(this.timeItem, other.getTimeItem()))) &&
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
        if (getTimeItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeItem(), i);
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
        new org.apache.axis.description.TypeDesc(SupportCaseTimeItemList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SupportCaseTimeItemList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "timeItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeItem"));
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
