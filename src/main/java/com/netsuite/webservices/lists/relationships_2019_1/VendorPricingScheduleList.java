/**
 * VendorPricingScheduleList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class VendorPricingScheduleList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.relationships_2019_1.VendorPricingSchedule[] pricingSchedule;

    private boolean replaceAll;  // attribute

    public VendorPricingScheduleList() {
    }

    public VendorPricingScheduleList(
           com.netsuite.webservices.lists.relationships_2019_1.VendorPricingSchedule[] pricingSchedule,
           boolean replaceAll) {
           this.pricingSchedule = pricingSchedule;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the pricingSchedule value for this VendorPricingScheduleList.
     * 
     * @return pricingSchedule
     */
    public com.netsuite.webservices.lists.relationships_2019_1.VendorPricingSchedule[] getPricingSchedule() {
        return pricingSchedule;
    }


    /**
     * Sets the pricingSchedule value for this VendorPricingScheduleList.
     * 
     * @param pricingSchedule
     */
    public void setPricingSchedule(com.netsuite.webservices.lists.relationships_2019_1.VendorPricingSchedule[] pricingSchedule) {
        this.pricingSchedule = pricingSchedule;
    }

    public com.netsuite.webservices.lists.relationships_2019_1.VendorPricingSchedule getPricingSchedule(int i) {
        return this.pricingSchedule[i];
    }

    public void setPricingSchedule(int i, com.netsuite.webservices.lists.relationships_2019_1.VendorPricingSchedule _value) {
        this.pricingSchedule[i] = _value;
    }


    /**
     * Gets the replaceAll value for this VendorPricingScheduleList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this VendorPricingScheduleList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorPricingScheduleList)) return false;
        VendorPricingScheduleList other = (VendorPricingScheduleList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricingSchedule==null && other.getPricingSchedule()==null) || 
             (this.pricingSchedule!=null &&
              java.util.Arrays.equals(this.pricingSchedule, other.getPricingSchedule()))) &&
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
        if (getPricingSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingSchedule(), i);
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
        new org.apache.axis.description.TypeDesc(VendorPricingScheduleList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorPricingScheduleList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "pricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "VendorPricingSchedule"));
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
