/**
 * InventoryDetailSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InventoryDetailSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity;

    public InventoryDetailSearchRowBasic() {
    }

    public InventoryDetailSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] binNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity) {
        this.binNumber = binNumber;
        this.externalId = externalId;
        this.internalId = internalId;
        this.inventoryNumber = inventoryNumber;
        this.quantity = quantity;
    }


    /**
     * Gets the binNumber value for this InventoryDetailSearchRowBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this InventoryDetailSearchRowBasic.
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
     * Gets the externalId value for this InventoryDetailSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InventoryDetailSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the internalId value for this InventoryDetailSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InventoryDetailSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the inventoryNumber value for this InventoryDetailSearchRowBasic.
     * 
     * @return inventoryNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInventoryNumber() {
        return inventoryNumber;
    }


    /**
     * Sets the inventoryNumber value for this InventoryDetailSearchRowBasic.
     * 
     * @param inventoryNumber
     */
    public void setInventoryNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInventoryNumber(int i) {
        return this.inventoryNumber[i];
    }

    public void setInventoryNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.inventoryNumber[i] = _value;
    }


    /**
     * Gets the quantity value for this InventoryDetailSearchRowBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this InventoryDetailSearchRowBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryDetailSearchRowBasic)) return false;
        InventoryDetailSearchRowBasic other = (InventoryDetailSearchRowBasic) obj;
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
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inventoryNumber==null && other.getInventoryNumber()==null) || 
             (this.inventoryNumber!=null &&
              java.util.Arrays.equals(this.inventoryNumber, other.getInventoryNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity())));
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
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInventoryNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventoryNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventoryNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantity(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryDetailSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
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
