/**
 * ManufacturingRoutingRoutingComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2019_1;

public class ManufacturingRoutingRoutingComponent  implements java.io.Serializable {
    private java.lang.String itemName;

    private java.lang.String revision;

    private java.lang.String description;

    private java.lang.Double yield;

    private java.lang.Double bomQuantity;

    private java.lang.Double quantity;

    private java.lang.String units;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef operationDisplayText;

    private java.lang.Long operationSequenceNumber;

    private java.lang.String component;

    private java.lang.String item;

    public ManufacturingRoutingRoutingComponent() {
    }

    public ManufacturingRoutingRoutingComponent(
           java.lang.String itemName,
           java.lang.String revision,
           java.lang.String description,
           java.lang.Double yield,
           java.lang.Double bomQuantity,
           java.lang.Double quantity,
           java.lang.String units,
           com.netsuite.webservices.platform.core_2019_1.RecordRef operationDisplayText,
           java.lang.Long operationSequenceNumber,
           java.lang.String component,
           java.lang.String item) {
           this.itemName = itemName;
           this.revision = revision;
           this.description = description;
           this.yield = yield;
           this.bomQuantity = bomQuantity;
           this.quantity = quantity;
           this.units = units;
           this.operationDisplayText = operationDisplayText;
           this.operationSequenceNumber = operationSequenceNumber;
           this.component = component;
           this.item = item;
    }


    /**
     * Gets the itemName value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the revision value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the description value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the yield value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return yield
     */
    public java.lang.Double getYield() {
        return yield;
    }


    /**
     * Sets the yield value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param yield
     */
    public void setYield(java.lang.Double yield) {
        this.yield = yield;
    }


    /**
     * Gets the bomQuantity value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return bomQuantity
     */
    public java.lang.Double getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(java.lang.Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the quantity value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return units
     */
    public java.lang.String getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param units
     */
    public void setUnits(java.lang.String units) {
        this.units = units;
    }


    /**
     * Gets the operationDisplayText value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return operationDisplayText
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOperationDisplayText() {
        return operationDisplayText;
    }


    /**
     * Sets the operationDisplayText value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param operationDisplayText
     */
    public void setOperationDisplayText(com.netsuite.webservices.platform.core_2019_1.RecordRef operationDisplayText) {
        this.operationDisplayText = operationDisplayText;
    }


    /**
     * Gets the operationSequenceNumber value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return operationSequenceNumber
     */
    public java.lang.Long getOperationSequenceNumber() {
        return operationSequenceNumber;
    }


    /**
     * Sets the operationSequenceNumber value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param operationSequenceNumber
     */
    public void setOperationSequenceNumber(java.lang.Long operationSequenceNumber) {
        this.operationSequenceNumber = operationSequenceNumber;
    }


    /**
     * Gets the component value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return component
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param component
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
    }


    /**
     * Gets the item value for this ManufacturingRoutingRoutingComponent.
     * 
     * @return item
     */
    public java.lang.String getItem() {
        return item;
    }


    /**
     * Sets the item value for this ManufacturingRoutingRoutingComponent.
     * 
     * @param item
     */
    public void setItem(java.lang.String item) {
        this.item = item;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingRoutingComponent)) return false;
        ManufacturingRoutingRoutingComponent other = (ManufacturingRoutingRoutingComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.yield==null && other.getYield()==null) || 
             (this.yield!=null &&
              this.yield.equals(other.getYield()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.operationDisplayText==null && other.getOperationDisplayText()==null) || 
             (this.operationDisplayText!=null &&
              this.operationDisplayText.equals(other.getOperationDisplayText()))) &&
            ((this.operationSequenceNumber==null && other.getOperationSequenceNumber()==null) || 
             (this.operationSequenceNumber!=null &&
              this.operationSequenceNumber.equals(other.getOperationSequenceNumber()))) &&
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem())));
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
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getYield() != null) {
            _hashCode += getYield().hashCode();
        }
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getOperationDisplayText() != null) {
            _hashCode += getOperationDisplayText().hashCode();
        }
        if (getOperationSequenceNumber() != null) {
            _hashCode += getOperationSequenceNumber().hashCode();
        }
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingRoutingComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "yield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDisplayText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "operationDisplayText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "operationSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
