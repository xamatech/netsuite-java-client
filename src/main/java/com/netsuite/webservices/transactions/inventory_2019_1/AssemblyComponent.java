/**
 * AssemblyComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class AssemblyComponent  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Double quantity;

    private java.lang.Double quantityOnHand;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail componentInventoryDetail;

    private java.lang.String componentNumbers;

    private java.lang.String binNumbers;

    private java.lang.Long lineNumber;

    public AssemblyComponent() {
    }

    public AssemblyComponent(
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Double quantity,
           java.lang.Double quantityOnHand,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail componentInventoryDetail,
           java.lang.String componentNumbers,
           java.lang.String binNumbers,
           java.lang.Long lineNumber) {
           this.item = item;
           this.quantity = quantity;
           this.quantityOnHand = quantityOnHand;
           this.componentInventoryDetail = componentInventoryDetail;
           this.componentNumbers = componentNumbers;
           this.binNumbers = binNumbers;
           this.lineNumber = lineNumber;
    }


    /**
     * Gets the item value for this AssemblyComponent.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this AssemblyComponent.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the quantity value for this AssemblyComponent.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this AssemblyComponent.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quantityOnHand value for this AssemblyComponent.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this AssemblyComponent.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the componentInventoryDetail value for this AssemblyComponent.
     * 
     * @return componentInventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getComponentInventoryDetail() {
        return componentInventoryDetail;
    }


    /**
     * Sets the componentInventoryDetail value for this AssemblyComponent.
     * 
     * @param componentInventoryDetail
     */
    public void setComponentInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail componentInventoryDetail) {
        this.componentInventoryDetail = componentInventoryDetail;
    }


    /**
     * Gets the componentNumbers value for this AssemblyComponent.
     * 
     * @return componentNumbers
     */
    public java.lang.String getComponentNumbers() {
        return componentNumbers;
    }


    /**
     * Sets the componentNumbers value for this AssemblyComponent.
     * 
     * @param componentNumbers
     */
    public void setComponentNumbers(java.lang.String componentNumbers) {
        this.componentNumbers = componentNumbers;
    }


    /**
     * Gets the binNumbers value for this AssemblyComponent.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this AssemblyComponent.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the lineNumber value for this AssemblyComponent.
     * 
     * @return lineNumber
     */
    public java.lang.Long getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this AssemblyComponent.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyComponent)) return false;
        AssemblyComponent other = (AssemblyComponent) obj;
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
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.componentInventoryDetail==null && other.getComponentInventoryDetail()==null) || 
             (this.componentInventoryDetail!=null &&
              this.componentInventoryDetail.equals(other.getComponentInventoryDetail()))) &&
            ((this.componentNumbers==null && other.getComponentNumbers()==null) || 
             (this.componentNumbers!=null &&
              this.componentNumbers.equals(other.getComponentNumbers()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber())));
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getComponentInventoryDetail() != null) {
            _hashCode += getComponentInventoryDetail().hashCode();
        }
        if (getComponentNumbers() != null) {
            _hashCode += getComponentNumbers().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssemblyComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "AssemblyComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentInventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "componentInventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "componentNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
