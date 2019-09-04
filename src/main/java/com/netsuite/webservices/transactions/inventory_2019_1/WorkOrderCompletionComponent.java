/**
 * WorkOrderCompletionComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class WorkOrderCompletionComponent  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Long operationSequenceNumber;

    private java.lang.Double quantityPer;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.common_2019_1.InventoryDetail componentInventoryDetail;

    private java.lang.Long lineNumber;

    public WorkOrderCompletionComponent() {
    }

    public WorkOrderCompletionComponent(
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Long operationSequenceNumber,
           java.lang.Double quantityPer,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.common_2019_1.InventoryDetail componentInventoryDetail,
           java.lang.Long lineNumber) {
           this.item = item;
           this.operationSequenceNumber = operationSequenceNumber;
           this.quantityPer = quantityPer;
           this.quantity = quantity;
           this.componentInventoryDetail = componentInventoryDetail;
           this.lineNumber = lineNumber;
    }


    /**
     * Gets the item value for this WorkOrderCompletionComponent.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this WorkOrderCompletionComponent.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the operationSequenceNumber value for this WorkOrderCompletionComponent.
     * 
     * @return operationSequenceNumber
     */
    public java.lang.Long getOperationSequenceNumber() {
        return operationSequenceNumber;
    }


    /**
     * Sets the operationSequenceNumber value for this WorkOrderCompletionComponent.
     * 
     * @param operationSequenceNumber
     */
    public void setOperationSequenceNumber(java.lang.Long operationSequenceNumber) {
        this.operationSequenceNumber = operationSequenceNumber;
    }


    /**
     * Gets the quantityPer value for this WorkOrderCompletionComponent.
     * 
     * @return quantityPer
     */
    public java.lang.Double getQuantityPer() {
        return quantityPer;
    }


    /**
     * Sets the quantityPer value for this WorkOrderCompletionComponent.
     * 
     * @param quantityPer
     */
    public void setQuantityPer(java.lang.Double quantityPer) {
        this.quantityPer = quantityPer;
    }


    /**
     * Gets the quantity value for this WorkOrderCompletionComponent.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this WorkOrderCompletionComponent.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the componentInventoryDetail value for this WorkOrderCompletionComponent.
     * 
     * @return componentInventoryDetail
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryDetail getComponentInventoryDetail() {
        return componentInventoryDetail;
    }


    /**
     * Sets the componentInventoryDetail value for this WorkOrderCompletionComponent.
     * 
     * @param componentInventoryDetail
     */
    public void setComponentInventoryDetail(com.netsuite.webservices.platform.common_2019_1.InventoryDetail componentInventoryDetail) {
        this.componentInventoryDetail = componentInventoryDetail;
    }


    /**
     * Gets the lineNumber value for this WorkOrderCompletionComponent.
     * 
     * @return lineNumber
     */
    public java.lang.Long getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this WorkOrderCompletionComponent.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkOrderCompletionComponent)) return false;
        WorkOrderCompletionComponent other = (WorkOrderCompletionComponent) obj;
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
            ((this.operationSequenceNumber==null && other.getOperationSequenceNumber()==null) || 
             (this.operationSequenceNumber!=null &&
              this.operationSequenceNumber.equals(other.getOperationSequenceNumber()))) &&
            ((this.quantityPer==null && other.getQuantityPer()==null) || 
             (this.quantityPer!=null &&
              this.quantityPer.equals(other.getQuantityPer()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.componentInventoryDetail==null && other.getComponentInventoryDetail()==null) || 
             (this.componentInventoryDetail!=null &&
              this.componentInventoryDetail.equals(other.getComponentInventoryDetail()))) &&
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
        if (getOperationSequenceNumber() != null) {
            _hashCode += getOperationSequenceNumber().hashCode();
        }
        if (getQuantityPer() != null) {
            _hashCode += getQuantityPer().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getComponentInventoryDetail() != null) {
            _hashCode += getComponentInventoryDetail().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkOrderCompletionComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "WorkOrderCompletionComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "operationSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "quantityPer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("componentInventoryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "componentInventoryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
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
