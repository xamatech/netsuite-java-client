/**
 * GetItemAvailabilityResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class GetItemAvailabilityResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.Status status;

    private com.netsuite.webservices.platform.core_2019_1.ItemAvailabilityList itemAvailabilityList;

    public GetItemAvailabilityResult() {
    }

    public GetItemAvailabilityResult(
           com.netsuite.webservices.platform.core_2019_1.Status status,
           com.netsuite.webservices.platform.core_2019_1.ItemAvailabilityList itemAvailabilityList) {
           this.status = status;
           this.itemAvailabilityList = itemAvailabilityList;
    }


    /**
     * Gets the status value for this GetItemAvailabilityResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetItemAvailabilityResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.Status status) {
        this.status = status;
    }


    /**
     * Gets the itemAvailabilityList value for this GetItemAvailabilityResult.
     * 
     * @return itemAvailabilityList
     */
    public com.netsuite.webservices.platform.core_2019_1.ItemAvailabilityList getItemAvailabilityList() {
        return itemAvailabilityList;
    }


    /**
     * Sets the itemAvailabilityList value for this GetItemAvailabilityResult.
     * 
     * @param itemAvailabilityList
     */
    public void setItemAvailabilityList(com.netsuite.webservices.platform.core_2019_1.ItemAvailabilityList itemAvailabilityList) {
        this.itemAvailabilityList = itemAvailabilityList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItemAvailabilityResult)) return false;
        GetItemAvailabilityResult other = (GetItemAvailabilityResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.itemAvailabilityList==null && other.getItemAvailabilityList()==null) || 
             (this.itemAvailabilityList!=null &&
              this.itemAvailabilityList.equals(other.getItemAvailabilityList())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getItemAvailabilityList() != null) {
            _hashCode += getItemAvailabilityList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemAvailabilityResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetItemAvailabilityResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAvailabilityList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "itemAvailabilityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "ItemAvailabilityList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
