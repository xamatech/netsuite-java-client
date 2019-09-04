/**
 * BinTransferInventory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class BinTransferInventory  implements java.io.Serializable {
    private java.lang.Long line;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.String description;

    private java.lang.String preferredBin;

    private java.lang.Double quantity;

    private java.lang.String itemUnitsLabel;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String fromBins;

    private java.lang.String toBins;

    public BinTransferInventory() {
    }

    public BinTransferInventory(
           java.lang.Long line,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.String description,
           java.lang.String preferredBin,
           java.lang.Double quantity,
           java.lang.String itemUnitsLabel,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String fromBins,
           java.lang.String toBins) {
           this.line = line;
           this.item = item;
           this.description = description;
           this.preferredBin = preferredBin;
           this.quantity = quantity;
           this.itemUnitsLabel = itemUnitsLabel;
           this.inventoryDetail = inventoryDetail;
           this.fromBins = fromBins;
           this.toBins = toBins;
    }


    /**
     * Gets the line value for this BinTransferInventory.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this BinTransferInventory.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the item value for this BinTransferInventory.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this BinTransferInventory.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the description value for this BinTransferInventory.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BinTransferInventory.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the preferredBin value for this BinTransferInventory.
     * 
     * @return preferredBin
     */
    public java.lang.String getPreferredBin() {
        return preferredBin;
    }


    /**
     * Sets the preferredBin value for this BinTransferInventory.
     * 
     * @param preferredBin
     */
    public void setPreferredBin(java.lang.String preferredBin) {
        this.preferredBin = preferredBin;
    }


    /**
     * Gets the quantity value for this BinTransferInventory.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BinTransferInventory.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the itemUnitsLabel value for this BinTransferInventory.
     * 
     * @return itemUnitsLabel
     */
    public java.lang.String getItemUnitsLabel() {
        return itemUnitsLabel;
    }


    /**
     * Sets the itemUnitsLabel value for this BinTransferInventory.
     * 
     * @param itemUnitsLabel
     */
    public void setItemUnitsLabel(java.lang.String itemUnitsLabel) {
        this.itemUnitsLabel = itemUnitsLabel;
    }


    /**
     * Gets the inventoryDetail value for this BinTransferInventory.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this BinTransferInventory.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the fromBins value for this BinTransferInventory.
     * 
     * @return fromBins
     */
    public java.lang.String getFromBins() {
        return fromBins;
    }


    /**
     * Sets the fromBins value for this BinTransferInventory.
     * 
     * @param fromBins
     */
    public void setFromBins(java.lang.String fromBins) {
        this.fromBins = fromBins;
    }


    /**
     * Gets the toBins value for this BinTransferInventory.
     * 
     * @return toBins
     */
    public java.lang.String getToBins() {
        return toBins;
    }


    /**
     * Sets the toBins value for this BinTransferInventory.
     * 
     * @param toBins
     */
    public void setToBins(java.lang.String toBins) {
        this.toBins = toBins;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinTransferInventory)) return false;
        BinTransferInventory other = (BinTransferInventory) obj;
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
            ((this.preferredBin==null && other.getPreferredBin()==null) || 
             (this.preferredBin!=null &&
              this.preferredBin.equals(other.getPreferredBin()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.itemUnitsLabel==null && other.getItemUnitsLabel()==null) || 
             (this.itemUnitsLabel!=null &&
              this.itemUnitsLabel.equals(other.getItemUnitsLabel()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.fromBins==null && other.getFromBins()==null) || 
             (this.fromBins!=null &&
              this.fromBins.equals(other.getFromBins()))) &&
            ((this.toBins==null && other.getToBins()==null) || 
             (this.toBins!=null &&
              this.toBins.equals(other.getToBins())));
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
        if (getPreferredBin() != null) {
            _hashCode += getPreferredBin().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getItemUnitsLabel() != null) {
            _hashCode += getItemUnitsLabel().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getFromBins() != null) {
            _hashCode += getFromBins().hashCode();
        }
        if (getToBins() != null) {
            _hashCode += getToBins().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BinTransferInventory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "BinTransferInventory"));
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
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUnitsLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemUnitsLabel"));
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
        elemField.setFieldName("fromBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "fromBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "toBins"));
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
