/**
 * InventoryTransferInventory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class InventoryTransferInventory  implements java.io.Serializable {
    private java.lang.Long line;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private java.lang.Double quantityOnHand;

    private java.lang.Double adjustQtyBy;

    private java.lang.String serialNumbers;

    private java.lang.String fromBinNumbers;

    private java.lang.String toBinNumbers;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public InventoryTransferInventory() {
    }

    public InventoryTransferInventory(
           java.lang.Long line,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           java.lang.Double quantityOnHand,
           java.lang.Double adjustQtyBy,
           java.lang.String serialNumbers,
           java.lang.String fromBinNumbers,
           java.lang.String toBinNumbers,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
           this.line = line;
           this.item = item;
           this.description = description;
           this.units = units;
           this.quantityOnHand = quantityOnHand;
           this.adjustQtyBy = adjustQtyBy;
           this.serialNumbers = serialNumbers;
           this.fromBinNumbers = fromBinNumbers;
           this.toBinNumbers = toBinNumbers;
           this.inventoryDetail = inventoryDetail;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the line value for this InventoryTransferInventory.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this InventoryTransferInventory.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the item value for this InventoryTransferInventory.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this InventoryTransferInventory.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the description value for this InventoryTransferInventory.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InventoryTransferInventory.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the units value for this InventoryTransferInventory.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this InventoryTransferInventory.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the quantityOnHand value for this InventoryTransferInventory.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this InventoryTransferInventory.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the adjustQtyBy value for this InventoryTransferInventory.
     * 
     * @return adjustQtyBy
     */
    public java.lang.Double getAdjustQtyBy() {
        return adjustQtyBy;
    }


    /**
     * Sets the adjustQtyBy value for this InventoryTransferInventory.
     * 
     * @param adjustQtyBy
     */
    public void setAdjustQtyBy(java.lang.Double adjustQtyBy) {
        this.adjustQtyBy = adjustQtyBy;
    }


    /**
     * Gets the serialNumbers value for this InventoryTransferInventory.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this InventoryTransferInventory.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the fromBinNumbers value for this InventoryTransferInventory.
     * 
     * @return fromBinNumbers
     */
    public java.lang.String getFromBinNumbers() {
        return fromBinNumbers;
    }


    /**
     * Sets the fromBinNumbers value for this InventoryTransferInventory.
     * 
     * @param fromBinNumbers
     */
    public void setFromBinNumbers(java.lang.String fromBinNumbers) {
        this.fromBinNumbers = fromBinNumbers;
    }


    /**
     * Gets the toBinNumbers value for this InventoryTransferInventory.
     * 
     * @return toBinNumbers
     */
    public java.lang.String getToBinNumbers() {
        return toBinNumbers;
    }


    /**
     * Sets the toBinNumbers value for this InventoryTransferInventory.
     * 
     * @param toBinNumbers
     */
    public void setToBinNumbers(java.lang.String toBinNumbers) {
        this.toBinNumbers = toBinNumbers;
    }


    /**
     * Gets the inventoryDetail value for this InventoryTransferInventory.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this InventoryTransferInventory.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the customFieldList value for this InventoryTransferInventory.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InventoryTransferInventory.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryTransferInventory)) return false;
        InventoryTransferInventory other = (InventoryTransferInventory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.adjustQtyBy==null && other.getAdjustQtyBy()==null) || 
             (this.adjustQtyBy!=null &&
              this.adjustQtyBy.equals(other.getAdjustQtyBy()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.fromBinNumbers==null && other.getFromBinNumbers()==null) || 
             (this.fromBinNumbers!=null &&
              this.fromBinNumbers.equals(other.getFromBinNumbers()))) &&
            ((this.toBinNumbers==null && other.getToBinNumbers()==null) || 
             (this.toBinNumbers!=null &&
              this.toBinNumbers.equals(other.getToBinNumbers()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
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
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getAdjustQtyBy() != null) {
            _hashCode += getAdjustQtyBy().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getFromBinNumbers() != null) {
            _hashCode += getFromBinNumbers().hashCode();
        }
        if (getToBinNumbers() != null) {
            _hashCode += getToBinNumbers().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryTransferInventory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "InventoryTransferInventory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustQtyBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "adjustQtyBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromBinNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "fromBinNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBinNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "toBinNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
