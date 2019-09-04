/**
 * BomRevisionComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class BomRevisionComponent  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.String description;

    private java.lang.Double componentYield;

    private java.lang.Double bomQuantity;

    private com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource;

    private java.lang.Double quantity;

    private java.lang.String units;

    private java.lang.String internalId;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public BomRevisionComponent() {
    }

    public BomRevisionComponent(
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.String description,
           java.lang.Double componentYield,
           java.lang.Double bomQuantity,
           com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource,
           java.lang.Double quantity,
           java.lang.String units,
           java.lang.String internalId,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.item = item;
           this.description = description;
           this.componentYield = componentYield;
           this.bomQuantity = bomQuantity;
           this.itemSource = itemSource;
           this.quantity = quantity;
           this.units = units;
           this.internalId = internalId;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the item value for this BomRevisionComponent.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this BomRevisionComponent.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the description value for this BomRevisionComponent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BomRevisionComponent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the componentYield value for this BomRevisionComponent.
     * 
     * @return componentYield
     */
    public java.lang.Double getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this BomRevisionComponent.
     * 
     * @param componentYield
     */
    public void setComponentYield(java.lang.Double componentYield) {
        this.componentYield = componentYield;
    }


    /**
     * Gets the bomQuantity value for this BomRevisionComponent.
     * 
     * @return bomQuantity
     */
    public java.lang.Double getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this BomRevisionComponent.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(java.lang.Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the itemSource value for this BomRevisionComponent.
     * 
     * @return itemSource
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ItemSource getItemSource() {
        return itemSource;
    }


    /**
     * Sets the itemSource value for this BomRevisionComponent.
     * 
     * @param itemSource
     */
    public void setItemSource(com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource) {
        this.itemSource = itemSource;
    }


    /**
     * Gets the quantity value for this BomRevisionComponent.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BomRevisionComponent.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this BomRevisionComponent.
     * 
     * @return units
     */
    public java.lang.String getUnits() {
        return units;
    }


    /**
     * Sets the units value for this BomRevisionComponent.
     * 
     * @param units
     */
    public void setUnits(java.lang.String units) {
        this.units = units;
    }


    /**
     * Gets the internalId value for this BomRevisionComponent.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BomRevisionComponent.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the customFieldList value for this BomRevisionComponent.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BomRevisionComponent.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomRevisionComponent)) return false;
        BomRevisionComponent other = (BomRevisionComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              this.componentYield.equals(other.getComponentYield()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.itemSource==null && other.getItemSource()==null) || 
             (this.itemSource!=null &&
              this.itemSource.equals(other.getItemSource()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getComponentYield() != null) {
            _hashCode += getComponentYield().hashCode();
        }
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getItemSource() != null) {
            _hashCode += getItemSource().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BomRevisionComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "BomRevisionComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "ItemSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
