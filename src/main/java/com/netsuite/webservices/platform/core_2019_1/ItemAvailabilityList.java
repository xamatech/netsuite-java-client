/**
 * ItemAvailabilityList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class ItemAvailabilityList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.ItemAvailability[] itemAvailability;

    public ItemAvailabilityList() {
    }

    public ItemAvailabilityList(
           com.netsuite.webservices.platform.core_2019_1.ItemAvailability[] itemAvailability) {
           this.itemAvailability = itemAvailability;
    }


    /**
     * Gets the itemAvailability value for this ItemAvailabilityList.
     * 
     * @return itemAvailability
     */
    public com.netsuite.webservices.platform.core_2019_1.ItemAvailability[] getItemAvailability() {
        return itemAvailability;
    }


    /**
     * Sets the itemAvailability value for this ItemAvailabilityList.
     * 
     * @param itemAvailability
     */
    public void setItemAvailability(com.netsuite.webservices.platform.core_2019_1.ItemAvailability[] itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    public com.netsuite.webservices.platform.core_2019_1.ItemAvailability getItemAvailability(int i) {
        return this.itemAvailability[i];
    }

    public void setItemAvailability(int i, com.netsuite.webservices.platform.core_2019_1.ItemAvailability _value) {
        this.itemAvailability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAvailabilityList)) return false;
        ItemAvailabilityList other = (ItemAvailabilityList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemAvailability==null && other.getItemAvailability()==null) || 
             (this.itemAvailability!=null &&
              java.util.Arrays.equals(this.itemAvailability, other.getItemAvailability())));
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
        if (getItemAvailability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAvailability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAvailability(), i);
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
        new org.apache.axis.description.TypeDesc(ItemAvailabilityList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "ItemAvailabilityList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "itemAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "ItemAvailability"));
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
