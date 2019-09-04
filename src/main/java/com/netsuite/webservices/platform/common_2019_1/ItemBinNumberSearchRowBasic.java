/**
 * ItemBinNumberSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class ItemBinNumberSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnHand;

    public ItemBinNumberSearchRowBasic() {
    }

    public ItemBinNumberSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] binNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnHand) {
        this.binNumber = binNumber;
        this.location = location;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the binNumber value for this ItemBinNumberSearchRowBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this ItemBinNumberSearchRowBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] binNumber) {
        this.binNumber = binNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.binNumber[i] = _value;
    }


    /**
     * Gets the location value for this ItemBinNumberSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemBinNumberSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the quantityAvailable value for this ItemBinNumberSearchRowBasic.
     * 
     * @return quantityAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ItemBinNumberSearchRowBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityAvailable(int i) {
        return this.quantityAvailable[i];
    }

    public void setQuantityAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityAvailable[i] = _value;
    }


    /**
     * Gets the quantityOnHand value for this ItemBinNumberSearchRowBasic.
     * 
     * @return quantityOnHand
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this ItemBinNumberSearchRowBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityOnHand(int i) {
        return this.quantityOnHand[i];
    }

    public void setQuantityOnHand(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityOnHand[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemBinNumberSearchRowBasic)) return false;
        ItemBinNumberSearchRowBasic other = (ItemBinNumberSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              java.util.Arrays.equals(this.quantityAvailable, other.getQuantityAvailable()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              java.util.Arrays.equals(this.quantityOnHand, other.getQuantityOnHand())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityOnHand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityOnHand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityOnHand(), i);
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
        new org.apache.axis.description.TypeDesc(ItemBinNumberSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemBinNumberSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
