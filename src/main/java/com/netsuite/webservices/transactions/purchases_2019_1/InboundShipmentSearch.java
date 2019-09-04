/**
 * InboundShipmentSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class InboundShipmentSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.InboundShipmentSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic itemReceiptJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic purchaseOrderJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public InboundShipmentSearch() {
    }

    public InboundShipmentSearch(
           com.netsuite.webservices.platform.common_2019_1.InboundShipmentSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic itemReceiptJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic purchaseOrderJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.itemJoin = itemJoin;
        this.itemReceiptJoin = itemReceiptJoin;
        this.purchaseOrderJoin = purchaseOrderJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this InboundShipmentSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.InboundShipmentSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this InboundShipmentSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.InboundShipmentSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the itemJoin value for this InboundShipmentSearch.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this InboundShipmentSearch.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the itemReceiptJoin value for this InboundShipmentSearch.
     * 
     * @return itemReceiptJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getItemReceiptJoin() {
        return itemReceiptJoin;
    }


    /**
     * Sets the itemReceiptJoin value for this InboundShipmentSearch.
     * 
     * @param itemReceiptJoin
     */
    public void setItemReceiptJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic itemReceiptJoin) {
        this.itemReceiptJoin = itemReceiptJoin;
    }


    /**
     * Gets the purchaseOrderJoin value for this InboundShipmentSearch.
     * 
     * @return purchaseOrderJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }


    /**
     * Sets the purchaseOrderJoin value for this InboundShipmentSearch.
     * 
     * @param purchaseOrderJoin
     */
    public void setPurchaseOrderJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic purchaseOrderJoin) {
        this.purchaseOrderJoin = purchaseOrderJoin;
    }


    /**
     * Gets the vendorJoin value for this InboundShipmentSearch.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this InboundShipmentSearch.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the customSearchJoin value for this InboundShipmentSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this InboundShipmentSearch.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentSearch)) return false;
        InboundShipmentSearch other = (InboundShipmentSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.itemReceiptJoin==null && other.getItemReceiptJoin()==null) || 
             (this.itemReceiptJoin!=null &&
              this.itemReceiptJoin.equals(other.getItemReceiptJoin()))) &&
            ((this.purchaseOrderJoin==null && other.getPurchaseOrderJoin()==null) || 
             (this.purchaseOrderJoin!=null &&
              this.purchaseOrderJoin.equals(other.getPurchaseOrderJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getItemReceiptJoin() != null) {
            _hashCode += getItemReceiptJoin().hashCode();
        }
        if (getPurchaseOrderJoin() != null) {
            _hashCode += getPurchaseOrderJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
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
        new org.apache.axis.description.TypeDesc(InboundShipmentSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InboundShipmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemReceiptJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemReceiptJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "purchaseOrderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
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
