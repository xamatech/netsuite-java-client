/**
 * InventoryCostRevaluationCostComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.inventory_2019_1;

public class InventoryCostRevaluationCostComponent  implements java.io.Serializable {
    private java.lang.Double cost;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef componentItem;

    private java.lang.Double quantity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef units;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory;

    public InventoryCostRevaluationCostComponent() {
    }

    public InventoryCostRevaluationCostComponent(
           java.lang.Double cost,
           com.netsuite.webservices.platform.core_2019_1.RecordRef componentItem,
           java.lang.Double quantity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef units,
           com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
           this.cost = cost;
           this.componentItem = componentItem;
           this.quantity = quantity;
           this.units = units;
           this.costCategory = costCategory;
    }


    /**
     * Gets the cost value for this InventoryCostRevaluationCostComponent.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this InventoryCostRevaluationCostComponent.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the componentItem value for this InventoryCostRevaluationCostComponent.
     * 
     * @return componentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getComponentItem() {
        return componentItem;
    }


    /**
     * Sets the componentItem value for this InventoryCostRevaluationCostComponent.
     * 
     * @param componentItem
     */
    public void setComponentItem(com.netsuite.webservices.platform.core_2019_1.RecordRef componentItem) {
        this.componentItem = componentItem;
    }


    /**
     * Gets the quantity value for this InventoryCostRevaluationCostComponent.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this InventoryCostRevaluationCostComponent.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this InventoryCostRevaluationCostComponent.
     * 
     * @return units
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this InventoryCostRevaluationCostComponent.
     * 
     * @param units
     */
    public void setUnits(com.netsuite.webservices.platform.core_2019_1.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the costCategory value for this InventoryCostRevaluationCostComponent.
     * 
     * @return costCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this InventoryCostRevaluationCostComponent.
     * 
     * @param costCategory
     */
    public void setCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef costCategory) {
        this.costCategory = costCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryCostRevaluationCostComponent)) return false;
        InventoryCostRevaluationCostComponent other = (InventoryCostRevaluationCostComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.componentItem==null && other.getComponentItem()==null) || 
             (this.componentItem!=null &&
              this.componentItem.equals(other.getComponentItem()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              this.costCategory.equals(other.getCostCategory())));
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
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getComponentItem() != null) {
            _hashCode += getComponentItem().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryCostRevaluationCostComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "InventoryCostRevaluationCostComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "componentItem"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2019_1.transactions.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
