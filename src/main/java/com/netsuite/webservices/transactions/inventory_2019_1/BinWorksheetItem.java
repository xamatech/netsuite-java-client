/**
 * BinWorksheetItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class BinWorksheetItem  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.String itemName;

    private java.lang.String description;

    private java.lang.Double quantity;

    private java.lang.String itemOnHand;

    private java.lang.String itemUnitsLabel;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail;

    private java.lang.String itemBins;

    private java.lang.String itemBinNumbers;

    private java.lang.String itemBinList;

    private java.lang.String itemPreferBin;

    private java.lang.String itemBlank;

    public BinWorksheetItem() {
    }

    public BinWorksheetItem(
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.String itemName,
           java.lang.String description,
           java.lang.Double quantity,
           java.lang.String itemOnHand,
           java.lang.String itemUnitsLabel,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail,
           java.lang.String itemBins,
           java.lang.String itemBinNumbers,
           java.lang.String itemBinList,
           java.lang.String itemPreferBin,
           java.lang.String itemBlank) {
           this.item = item;
           this.itemName = itemName;
           this.description = description;
           this.quantity = quantity;
           this.itemOnHand = itemOnHand;
           this.itemUnitsLabel = itemUnitsLabel;
           this.inventoryDetail = inventoryDetail;
           this.itemBins = itemBins;
           this.itemBinNumbers = itemBinNumbers;
           this.itemBinList = itemBinList;
           this.itemPreferBin = itemPreferBin;
           this.itemBlank = itemBlank;
    }


    /**
     * Gets the item value for this BinWorksheetItem.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this BinWorksheetItem.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the itemName value for this BinWorksheetItem.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this BinWorksheetItem.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the description value for this BinWorksheetItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BinWorksheetItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the quantity value for this BinWorksheetItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this BinWorksheetItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the itemOnHand value for this BinWorksheetItem.
     * 
     * @return itemOnHand
     */
    public java.lang.String getItemOnHand() {
        return itemOnHand;
    }


    /**
     * Sets the itemOnHand value for this BinWorksheetItem.
     * 
     * @param itemOnHand
     */
    public void setItemOnHand(java.lang.String itemOnHand) {
        this.itemOnHand = itemOnHand;
    }


    /**
     * Gets the itemUnitsLabel value for this BinWorksheetItem.
     * 
     * @return itemUnitsLabel
     */
    public java.lang.String getItemUnitsLabel() {
        return itemUnitsLabel;
    }


    /**
     * Sets the itemUnitsLabel value for this BinWorksheetItem.
     * 
     * @param itemUnitsLabel
     */
    public void setItemUnitsLabel(java.lang.String itemUnitsLabel) {
        this.itemUnitsLabel = itemUnitsLabel;
    }


    /**
     * Gets the inventoryDetail value for this BinWorksheetItem.
     * 
     * @return inventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }


    /**
     * Sets the inventoryDetail value for this BinWorksheetItem.
     * 
     * @param inventoryDetail
     */
    public void setInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }


    /**
     * Gets the itemBins value for this BinWorksheetItem.
     * 
     * @return itemBins
     */
    public java.lang.String getItemBins() {
        return itemBins;
    }


    /**
     * Sets the itemBins value for this BinWorksheetItem.
     * 
     * @param itemBins
     */
    public void setItemBins(java.lang.String itemBins) {
        this.itemBins = itemBins;
    }


    /**
     * Gets the itemBinNumbers value for this BinWorksheetItem.
     * 
     * @return itemBinNumbers
     */
    public java.lang.String getItemBinNumbers() {
        return itemBinNumbers;
    }


    /**
     * Sets the itemBinNumbers value for this BinWorksheetItem.
     * 
     * @param itemBinNumbers
     */
    public void setItemBinNumbers(java.lang.String itemBinNumbers) {
        this.itemBinNumbers = itemBinNumbers;
    }


    /**
     * Gets the itemBinList value for this BinWorksheetItem.
     * 
     * @return itemBinList
     */
    public java.lang.String getItemBinList() {
        return itemBinList;
    }


    /**
     * Sets the itemBinList value for this BinWorksheetItem.
     * 
     * @param itemBinList
     */
    public void setItemBinList(java.lang.String itemBinList) {
        this.itemBinList = itemBinList;
    }


    /**
     * Gets the itemPreferBin value for this BinWorksheetItem.
     * 
     * @return itemPreferBin
     */
    public java.lang.String getItemPreferBin() {
        return itemPreferBin;
    }


    /**
     * Sets the itemPreferBin value for this BinWorksheetItem.
     * 
     * @param itemPreferBin
     */
    public void setItemPreferBin(java.lang.String itemPreferBin) {
        this.itemPreferBin = itemPreferBin;
    }


    /**
     * Gets the itemBlank value for this BinWorksheetItem.
     * 
     * @return itemBlank
     */
    public java.lang.String getItemBlank() {
        return itemBlank;
    }


    /**
     * Sets the itemBlank value for this BinWorksheetItem.
     * 
     * @param itemBlank
     */
    public void setItemBlank(java.lang.String itemBlank) {
        this.itemBlank = itemBlank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinWorksheetItem)) return false;
        BinWorksheetItem other = (BinWorksheetItem) obj;
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
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.itemOnHand==null && other.getItemOnHand()==null) || 
             (this.itemOnHand!=null &&
              this.itemOnHand.equals(other.getItemOnHand()))) &&
            ((this.itemUnitsLabel==null && other.getItemUnitsLabel()==null) || 
             (this.itemUnitsLabel!=null &&
              this.itemUnitsLabel.equals(other.getItemUnitsLabel()))) &&
            ((this.inventoryDetail==null && other.getInventoryDetail()==null) || 
             (this.inventoryDetail!=null &&
              this.inventoryDetail.equals(other.getInventoryDetail()))) &&
            ((this.itemBins==null && other.getItemBins()==null) || 
             (this.itemBins!=null &&
              this.itemBins.equals(other.getItemBins()))) &&
            ((this.itemBinNumbers==null && other.getItemBinNumbers()==null) || 
             (this.itemBinNumbers!=null &&
              this.itemBinNumbers.equals(other.getItemBinNumbers()))) &&
            ((this.itemBinList==null && other.getItemBinList()==null) || 
             (this.itemBinList!=null &&
              this.itemBinList.equals(other.getItemBinList()))) &&
            ((this.itemPreferBin==null && other.getItemPreferBin()==null) || 
             (this.itemPreferBin!=null &&
              this.itemPreferBin.equals(other.getItemPreferBin()))) &&
            ((this.itemBlank==null && other.getItemBlank()==null) || 
             (this.itemBlank!=null &&
              this.itemBlank.equals(other.getItemBlank())));
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
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getItemOnHand() != null) {
            _hashCode += getItemOnHand().hashCode();
        }
        if (getItemUnitsLabel() != null) {
            _hashCode += getItemUnitsLabel().hashCode();
        }
        if (getInventoryDetail() != null) {
            _hashCode += getInventoryDetail().hashCode();
        }
        if (getItemBins() != null) {
            _hashCode += getItemBins().hashCode();
        }
        if (getItemBinNumbers() != null) {
            _hashCode += getItemBinNumbers().hashCode();
        }
        if (getItemBinList() != null) {
            _hashCode += getItemBinList().hashCode();
        }
        if (getItemPreferBin() != null) {
            _hashCode += getItemPreferBin().hashCode();
        }
        if (getItemBlank() != null) {
            _hashCode += getItemBlank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BinWorksheetItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "BinWorksheetItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("itemBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBinNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemBinNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBinList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemBinList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPreferBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemPreferBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBlank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "itemBlank"));
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
