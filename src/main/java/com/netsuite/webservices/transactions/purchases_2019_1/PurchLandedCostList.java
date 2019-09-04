/**
 * PurchLandedCostList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class PurchLandedCostList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.LandedCostSummary[] landedCost;

    private boolean replaceAll;  // attribute

    public PurchLandedCostList() {
    }

    public PurchLandedCostList(
           com.netsuite.webservices.platform.common_2019_1.LandedCostSummary[] landedCost,
           boolean replaceAll) {
           this.landedCost = landedCost;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the landedCost value for this PurchLandedCostList.
     * 
     * @return landedCost
     */
    public com.netsuite.webservices.platform.common_2019_1.LandedCostSummary[] getLandedCost() {
        return landedCost;
    }


    /**
     * Sets the landedCost value for this PurchLandedCostList.
     * 
     * @param landedCost
     */
    public void setLandedCost(com.netsuite.webservices.platform.common_2019_1.LandedCostSummary[] landedCost) {
        this.landedCost = landedCost;
    }

    public com.netsuite.webservices.platform.common_2019_1.LandedCostSummary getLandedCost(int i) {
        return this.landedCost[i];
    }

    public void setLandedCost(int i, com.netsuite.webservices.platform.common_2019_1.LandedCostSummary _value) {
        this.landedCost[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PurchLandedCostList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PurchLandedCostList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchLandedCostList)) return false;
        PurchLandedCostList other = (PurchLandedCostList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.landedCost==null && other.getLandedCost()==null) || 
             (this.landedCost!=null &&
              java.util.Arrays.equals(this.landedCost, other.getLandedCost()))) &&
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
        if (getLandedCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCost(), i);
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
        new org.apache.axis.description.TypeDesc(PurchLandedCostList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "PurchLandedCostList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "LandedCostSummary"));
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
