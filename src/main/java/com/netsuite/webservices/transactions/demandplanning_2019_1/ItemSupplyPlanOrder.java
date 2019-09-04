/**
 * ItemSupplyPlanOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2019_1;

public class ItemSupplyPlanOrder  implements java.io.Serializable {
    private java.lang.Long orderLineId;

    private java.util.Calendar orderDate;

    private java.util.Calendar receiptDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceLocation;

    private java.lang.Double quantity;

    private java.lang.Boolean orderCreated;

    private com.netsuite.webservices.transactions.demandplanning_2019_1.types.ItemSupplyPlanOrderType orderType;

    public ItemSupplyPlanOrder() {
    }

    public ItemSupplyPlanOrder(
           java.lang.Long orderLineId,
           java.util.Calendar orderDate,
           java.util.Calendar receiptDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceLocation,
           java.lang.Double quantity,
           java.lang.Boolean orderCreated,
           com.netsuite.webservices.transactions.demandplanning_2019_1.types.ItemSupplyPlanOrderType orderType) {
           this.orderLineId = orderLineId;
           this.orderDate = orderDate;
           this.receiptDate = receiptDate;
           this.sourceLocation = sourceLocation;
           this.quantity = quantity;
           this.orderCreated = orderCreated;
           this.orderType = orderType;
    }


    /**
     * Gets the orderLineId value for this ItemSupplyPlanOrder.
     * 
     * @return orderLineId
     */
    public java.lang.Long getOrderLineId() {
        return orderLineId;
    }


    /**
     * Sets the orderLineId value for this ItemSupplyPlanOrder.
     * 
     * @param orderLineId
     */
    public void setOrderLineId(java.lang.Long orderLineId) {
        this.orderLineId = orderLineId;
    }


    /**
     * Gets the orderDate value for this ItemSupplyPlanOrder.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this ItemSupplyPlanOrder.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the receiptDate value for this ItemSupplyPlanOrder.
     * 
     * @return receiptDate
     */
    public java.util.Calendar getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this ItemSupplyPlanOrder.
     * 
     * @param receiptDate
     */
    public void setReceiptDate(java.util.Calendar receiptDate) {
        this.receiptDate = receiptDate;
    }


    /**
     * Gets the sourceLocation value for this ItemSupplyPlanOrder.
     * 
     * @return sourceLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceLocation() {
        return sourceLocation;
    }


    /**
     * Sets the sourceLocation value for this ItemSupplyPlanOrder.
     * 
     * @param sourceLocation
     */
    public void setSourceLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceLocation) {
        this.sourceLocation = sourceLocation;
    }


    /**
     * Gets the quantity value for this ItemSupplyPlanOrder.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemSupplyPlanOrder.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the orderCreated value for this ItemSupplyPlanOrder.
     * 
     * @return orderCreated
     */
    public java.lang.Boolean getOrderCreated() {
        return orderCreated;
    }


    /**
     * Sets the orderCreated value for this ItemSupplyPlanOrder.
     * 
     * @param orderCreated
     */
    public void setOrderCreated(java.lang.Boolean orderCreated) {
        this.orderCreated = orderCreated;
    }


    /**
     * Gets the orderType value for this ItemSupplyPlanOrder.
     * 
     * @return orderType
     */
    public com.netsuite.webservices.transactions.demandplanning_2019_1.types.ItemSupplyPlanOrderType getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this ItemSupplyPlanOrder.
     * 
     * @param orderType
     */
    public void setOrderType(com.netsuite.webservices.transactions.demandplanning_2019_1.types.ItemSupplyPlanOrderType orderType) {
        this.orderType = orderType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSupplyPlanOrder)) return false;
        ItemSupplyPlanOrder other = (ItemSupplyPlanOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderLineId==null && other.getOrderLineId()==null) || 
             (this.orderLineId!=null &&
              this.orderLineId.equals(other.getOrderLineId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              this.receiptDate.equals(other.getReceiptDate()))) &&
            ((this.sourceLocation==null && other.getSourceLocation()==null) || 
             (this.sourceLocation!=null &&
              this.sourceLocation.equals(other.getSourceLocation()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.orderCreated==null && other.getOrderCreated()==null) || 
             (this.orderCreated!=null &&
              this.orderCreated.equals(other.getOrderCreated()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType())));
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
        if (getOrderLineId() != null) {
            _hashCode += getOrderLineId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getReceiptDate() != null) {
            _hashCode += getReceiptDate().hashCode();
        }
        if (getSourceLocation() != null) {
            _hashCode += getSourceLocation().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getOrderCreated() != null) {
            _hashCode += getOrderCreated().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSupplyPlanOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "orderLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "receiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "sourceLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "orderCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.demandplanning_2019_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrderType"));
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
