/**
 * InboundShipmentLandedCost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class InboundShipmentLandedCost  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef landedCostCostCategory;

    private java.lang.Double landedCostAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef landedCostCurrency;

    private java.lang.Double landedCostExchangeRate;

    private java.util.Calendar landedCostEffectiveDate;

    private com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList landedCostShipmentItemsList;

    public InboundShipmentLandedCost() {
    }

    public InboundShipmentLandedCost(
           com.netsuite.webservices.platform.core_2019_1.RecordRef landedCostCostCategory,
           java.lang.Double landedCostAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef landedCostCurrency,
           java.lang.Double landedCostExchangeRate,
           java.util.Calendar landedCostEffectiveDate,
           com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList landedCostShipmentItemsList) {
           this.landedCostCostCategory = landedCostCostCategory;
           this.landedCostAmount = landedCostAmount;
           this.landedCostCurrency = landedCostCurrency;
           this.landedCostExchangeRate = landedCostExchangeRate;
           this.landedCostEffectiveDate = landedCostEffectiveDate;
           this.landedCostAllocationMethod = landedCostAllocationMethod;
           this.landedCostShipmentItemsList = landedCostShipmentItemsList;
    }


    /**
     * Gets the landedCostCostCategory value for this InboundShipmentLandedCost.
     * 
     * @return landedCostCostCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLandedCostCostCategory() {
        return landedCostCostCategory;
    }


    /**
     * Sets the landedCostCostCategory value for this InboundShipmentLandedCost.
     * 
     * @param landedCostCostCategory
     */
    public void setLandedCostCostCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef landedCostCostCategory) {
        this.landedCostCostCategory = landedCostCostCategory;
    }


    /**
     * Gets the landedCostAmount value for this InboundShipmentLandedCost.
     * 
     * @return landedCostAmount
     */
    public java.lang.Double getLandedCostAmount() {
        return landedCostAmount;
    }


    /**
     * Sets the landedCostAmount value for this InboundShipmentLandedCost.
     * 
     * @param landedCostAmount
     */
    public void setLandedCostAmount(java.lang.Double landedCostAmount) {
        this.landedCostAmount = landedCostAmount;
    }


    /**
     * Gets the landedCostCurrency value for this InboundShipmentLandedCost.
     * 
     * @return landedCostCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLandedCostCurrency() {
        return landedCostCurrency;
    }


    /**
     * Sets the landedCostCurrency value for this InboundShipmentLandedCost.
     * 
     * @param landedCostCurrency
     */
    public void setLandedCostCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef landedCostCurrency) {
        this.landedCostCurrency = landedCostCurrency;
    }


    /**
     * Gets the landedCostExchangeRate value for this InboundShipmentLandedCost.
     * 
     * @return landedCostExchangeRate
     */
    public java.lang.Double getLandedCostExchangeRate() {
        return landedCostExchangeRate;
    }


    /**
     * Sets the landedCostExchangeRate value for this InboundShipmentLandedCost.
     * 
     * @param landedCostExchangeRate
     */
    public void setLandedCostExchangeRate(java.lang.Double landedCostExchangeRate) {
        this.landedCostExchangeRate = landedCostExchangeRate;
    }


    /**
     * Gets the landedCostEffectiveDate value for this InboundShipmentLandedCost.
     * 
     * @return landedCostEffectiveDate
     */
    public java.util.Calendar getLandedCostEffectiveDate() {
        return landedCostEffectiveDate;
    }


    /**
     * Sets the landedCostEffectiveDate value for this InboundShipmentLandedCost.
     * 
     * @param landedCostEffectiveDate
     */
    public void setLandedCostEffectiveDate(java.util.Calendar landedCostEffectiveDate) {
        this.landedCostEffectiveDate = landedCostEffectiveDate;
    }


    /**
     * Gets the landedCostAllocationMethod value for this InboundShipmentLandedCost.
     * 
     * @return landedCostAllocationMethod
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentLandedCostAllocationMethod getLandedCostAllocationMethod() {
        return landedCostAllocationMethod;
    }


    /**
     * Sets the landedCostAllocationMethod value for this InboundShipmentLandedCost.
     * 
     * @param landedCostAllocationMethod
     */
    public void setLandedCostAllocationMethod(com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod) {
        this.landedCostAllocationMethod = landedCostAllocationMethod;
    }


    /**
     * Gets the landedCostShipmentItemsList value for this InboundShipmentLandedCost.
     * 
     * @return landedCostShipmentItemsList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getLandedCostShipmentItemsList() {
        return landedCostShipmentItemsList;
    }


    /**
     * Sets the landedCostShipmentItemsList value for this InboundShipmentLandedCost.
     * 
     * @param landedCostShipmentItemsList
     */
    public void setLandedCostShipmentItemsList(com.netsuite.webservices.platform.core_2019_1.RecordRefList landedCostShipmentItemsList) {
        this.landedCostShipmentItemsList = landedCostShipmentItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentLandedCost)) return false;
        InboundShipmentLandedCost other = (InboundShipmentLandedCost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.landedCostCostCategory==null && other.getLandedCostCostCategory()==null) || 
             (this.landedCostCostCategory!=null &&
              this.landedCostCostCategory.equals(other.getLandedCostCostCategory()))) &&
            ((this.landedCostAmount==null && other.getLandedCostAmount()==null) || 
             (this.landedCostAmount!=null &&
              this.landedCostAmount.equals(other.getLandedCostAmount()))) &&
            ((this.landedCostCurrency==null && other.getLandedCostCurrency()==null) || 
             (this.landedCostCurrency!=null &&
              this.landedCostCurrency.equals(other.getLandedCostCurrency()))) &&
            ((this.landedCostExchangeRate==null && other.getLandedCostExchangeRate()==null) || 
             (this.landedCostExchangeRate!=null &&
              this.landedCostExchangeRate.equals(other.getLandedCostExchangeRate()))) &&
            ((this.landedCostEffectiveDate==null && other.getLandedCostEffectiveDate()==null) || 
             (this.landedCostEffectiveDate!=null &&
              this.landedCostEffectiveDate.equals(other.getLandedCostEffectiveDate()))) &&
            ((this.landedCostAllocationMethod==null && other.getLandedCostAllocationMethod()==null) || 
             (this.landedCostAllocationMethod!=null &&
              this.landedCostAllocationMethod.equals(other.getLandedCostAllocationMethod()))) &&
            ((this.landedCostShipmentItemsList==null && other.getLandedCostShipmentItemsList()==null) || 
             (this.landedCostShipmentItemsList!=null &&
              this.landedCostShipmentItemsList.equals(other.getLandedCostShipmentItemsList())));
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
        if (getLandedCostCostCategory() != null) {
            _hashCode += getLandedCostCostCategory().hashCode();
        }
        if (getLandedCostAmount() != null) {
            _hashCode += getLandedCostAmount().hashCode();
        }
        if (getLandedCostCurrency() != null) {
            _hashCode += getLandedCostCurrency().hashCode();
        }
        if (getLandedCostExchangeRate() != null) {
            _hashCode += getLandedCostExchangeRate().hashCode();
        }
        if (getLandedCostEffectiveDate() != null) {
            _hashCode += getLandedCostEffectiveDate().hashCode();
        }
        if (getLandedCostAllocationMethod() != null) {
            _hashCode += getLandedCostAllocationMethod().hashCode();
        }
        if (getLandedCostShipmentItemsList() != null) {
            _hashCode += getLandedCostShipmentItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundShipmentLandedCost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentLandedCost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCostCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostCostCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostAllocationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostAllocationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentLandedCostAllocationMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostShipmentItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostShipmentItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
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
