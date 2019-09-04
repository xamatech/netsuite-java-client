/**
 * InboundShipmentItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class InboundShipmentItems  implements java.io.Serializable {
    private java.lang.Long id;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseOrder;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipmentItem;

    private java.lang.String shipmentItemDescription;

    private java.lang.String poVendor;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef receivingLocation;

    private java.lang.Double quantityReceived;

    private java.lang.Double quantityExpected;

    private java.lang.Double quantityRemaining;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef unit;

    private java.lang.Double poRate;

    private java.lang.Double expectedRate;

    private java.lang.Double shipmentItemExchangeRate;

    private java.util.Calendar shipmentItemEffectiveDate;

    private java.lang.Double unitLandedCost;

    private java.lang.Double totalUnitCost;

    private java.lang.Double shipmentItemAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef poCurrency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm;

    public InboundShipmentItems() {
    }

    public InboundShipmentItems(
           java.lang.Long id,
           com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseOrder,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipmentItem,
           java.lang.String shipmentItemDescription,
           java.lang.String poVendor,
           com.netsuite.webservices.platform.core_2019_1.RecordRef receivingLocation,
           java.lang.Double quantityReceived,
           java.lang.Double quantityExpected,
           java.lang.Double quantityRemaining,
           com.netsuite.webservices.platform.core_2019_1.RecordRef unit,
           java.lang.Double poRate,
           java.lang.Double expectedRate,
           java.lang.Double shipmentItemExchangeRate,
           java.util.Calendar shipmentItemEffectiveDate,
           java.lang.Double unitLandedCost,
           java.lang.Double totalUnitCost,
           java.lang.Double shipmentItemAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef poCurrency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm) {
           this.id = id;
           this.purchaseOrder = purchaseOrder;
           this.shipmentItem = shipmentItem;
           this.shipmentItemDescription = shipmentItemDescription;
           this.poVendor = poVendor;
           this.receivingLocation = receivingLocation;
           this.quantityReceived = quantityReceived;
           this.quantityExpected = quantityExpected;
           this.quantityRemaining = quantityRemaining;
           this.unit = unit;
           this.poRate = poRate;
           this.expectedRate = expectedRate;
           this.shipmentItemExchangeRate = shipmentItemExchangeRate;
           this.shipmentItemEffectiveDate = shipmentItemEffectiveDate;
           this.unitLandedCost = unitLandedCost;
           this.totalUnitCost = totalUnitCost;
           this.shipmentItemAmount = shipmentItemAmount;
           this.poCurrency = poCurrency;
           this.incoterm = incoterm;
    }


    /**
     * Gets the id value for this InboundShipmentItems.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this InboundShipmentItems.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the purchaseOrder value for this InboundShipmentItems.
     * 
     * @return purchaseOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this InboundShipmentItems.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(com.netsuite.webservices.platform.core_2019_1.RecordRef purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }


    /**
     * Gets the shipmentItem value for this InboundShipmentItems.
     * 
     * @return shipmentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipmentItem() {
        return shipmentItem;
    }


    /**
     * Sets the shipmentItem value for this InboundShipmentItems.
     * 
     * @param shipmentItem
     */
    public void setShipmentItem(com.netsuite.webservices.platform.core_2019_1.RecordRef shipmentItem) {
        this.shipmentItem = shipmentItem;
    }


    /**
     * Gets the shipmentItemDescription value for this InboundShipmentItems.
     * 
     * @return shipmentItemDescription
     */
    public java.lang.String getShipmentItemDescription() {
        return shipmentItemDescription;
    }


    /**
     * Sets the shipmentItemDescription value for this InboundShipmentItems.
     * 
     * @param shipmentItemDescription
     */
    public void setShipmentItemDescription(java.lang.String shipmentItemDescription) {
        this.shipmentItemDescription = shipmentItemDescription;
    }


    /**
     * Gets the poVendor value for this InboundShipmentItems.
     * 
     * @return poVendor
     */
    public java.lang.String getPoVendor() {
        return poVendor;
    }


    /**
     * Sets the poVendor value for this InboundShipmentItems.
     * 
     * @param poVendor
     */
    public void setPoVendor(java.lang.String poVendor) {
        this.poVendor = poVendor;
    }


    /**
     * Gets the receivingLocation value for this InboundShipmentItems.
     * 
     * @return receivingLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReceivingLocation() {
        return receivingLocation;
    }


    /**
     * Sets the receivingLocation value for this InboundShipmentItems.
     * 
     * @param receivingLocation
     */
    public void setReceivingLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef receivingLocation) {
        this.receivingLocation = receivingLocation;
    }


    /**
     * Gets the quantityReceived value for this InboundShipmentItems.
     * 
     * @return quantityReceived
     */
    public java.lang.Double getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this InboundShipmentItems.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(java.lang.Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the quantityExpected value for this InboundShipmentItems.
     * 
     * @return quantityExpected
     */
    public java.lang.Double getQuantityExpected() {
        return quantityExpected;
    }


    /**
     * Sets the quantityExpected value for this InboundShipmentItems.
     * 
     * @param quantityExpected
     */
    public void setQuantityExpected(java.lang.Double quantityExpected) {
        this.quantityExpected = quantityExpected;
    }


    /**
     * Gets the quantityRemaining value for this InboundShipmentItems.
     * 
     * @return quantityRemaining
     */
    public java.lang.Double getQuantityRemaining() {
        return quantityRemaining;
    }


    /**
     * Sets the quantityRemaining value for this InboundShipmentItems.
     * 
     * @param quantityRemaining
     */
    public void setQuantityRemaining(java.lang.Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }


    /**
     * Gets the unit value for this InboundShipmentItems.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this InboundShipmentItems.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.RecordRef unit) {
        this.unit = unit;
    }


    /**
     * Gets the poRate value for this InboundShipmentItems.
     * 
     * @return poRate
     */
    public java.lang.Double getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this InboundShipmentItems.
     * 
     * @param poRate
     */
    public void setPoRate(java.lang.Double poRate) {
        this.poRate = poRate;
    }


    /**
     * Gets the expectedRate value for this InboundShipmentItems.
     * 
     * @return expectedRate
     */
    public java.lang.Double getExpectedRate() {
        return expectedRate;
    }


    /**
     * Sets the expectedRate value for this InboundShipmentItems.
     * 
     * @param expectedRate
     */
    public void setExpectedRate(java.lang.Double expectedRate) {
        this.expectedRate = expectedRate;
    }


    /**
     * Gets the shipmentItemExchangeRate value for this InboundShipmentItems.
     * 
     * @return shipmentItemExchangeRate
     */
    public java.lang.Double getShipmentItemExchangeRate() {
        return shipmentItemExchangeRate;
    }


    /**
     * Sets the shipmentItemExchangeRate value for this InboundShipmentItems.
     * 
     * @param shipmentItemExchangeRate
     */
    public void setShipmentItemExchangeRate(java.lang.Double shipmentItemExchangeRate) {
        this.shipmentItemExchangeRate = shipmentItemExchangeRate;
    }


    /**
     * Gets the shipmentItemEffectiveDate value for this InboundShipmentItems.
     * 
     * @return shipmentItemEffectiveDate
     */
    public java.util.Calendar getShipmentItemEffectiveDate() {
        return shipmentItemEffectiveDate;
    }


    /**
     * Sets the shipmentItemEffectiveDate value for this InboundShipmentItems.
     * 
     * @param shipmentItemEffectiveDate
     */
    public void setShipmentItemEffectiveDate(java.util.Calendar shipmentItemEffectiveDate) {
        this.shipmentItemEffectiveDate = shipmentItemEffectiveDate;
    }


    /**
     * Gets the unitLandedCost value for this InboundShipmentItems.
     * 
     * @return unitLandedCost
     */
    public java.lang.Double getUnitLandedCost() {
        return unitLandedCost;
    }


    /**
     * Sets the unitLandedCost value for this InboundShipmentItems.
     * 
     * @param unitLandedCost
     */
    public void setUnitLandedCost(java.lang.Double unitLandedCost) {
        this.unitLandedCost = unitLandedCost;
    }


    /**
     * Gets the totalUnitCost value for this InboundShipmentItems.
     * 
     * @return totalUnitCost
     */
    public java.lang.Double getTotalUnitCost() {
        return totalUnitCost;
    }


    /**
     * Sets the totalUnitCost value for this InboundShipmentItems.
     * 
     * @param totalUnitCost
     */
    public void setTotalUnitCost(java.lang.Double totalUnitCost) {
        this.totalUnitCost = totalUnitCost;
    }


    /**
     * Gets the shipmentItemAmount value for this InboundShipmentItems.
     * 
     * @return shipmentItemAmount
     */
    public java.lang.Double getShipmentItemAmount() {
        return shipmentItemAmount;
    }


    /**
     * Sets the shipmentItemAmount value for this InboundShipmentItems.
     * 
     * @param shipmentItemAmount
     */
    public void setShipmentItemAmount(java.lang.Double shipmentItemAmount) {
        this.shipmentItemAmount = shipmentItemAmount;
    }


    /**
     * Gets the poCurrency value for this InboundShipmentItems.
     * 
     * @return poCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPoCurrency() {
        return poCurrency;
    }


    /**
     * Sets the poCurrency value for this InboundShipmentItems.
     * 
     * @param poCurrency
     */
    public void setPoCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef poCurrency) {
        this.poCurrency = poCurrency;
    }


    /**
     * Gets the incoterm value for this InboundShipmentItems.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this InboundShipmentItems.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.RecordRef incoterm) {
        this.incoterm = incoterm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentItems)) return false;
        InboundShipmentItems other = (InboundShipmentItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              this.purchaseOrder.equals(other.getPurchaseOrder()))) &&
            ((this.shipmentItem==null && other.getShipmentItem()==null) || 
             (this.shipmentItem!=null &&
              this.shipmentItem.equals(other.getShipmentItem()))) &&
            ((this.shipmentItemDescription==null && other.getShipmentItemDescription()==null) || 
             (this.shipmentItemDescription!=null &&
              this.shipmentItemDescription.equals(other.getShipmentItemDescription()))) &&
            ((this.poVendor==null && other.getPoVendor()==null) || 
             (this.poVendor!=null &&
              this.poVendor.equals(other.getPoVendor()))) &&
            ((this.receivingLocation==null && other.getReceivingLocation()==null) || 
             (this.receivingLocation!=null &&
              this.receivingLocation.equals(other.getReceivingLocation()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              this.quantityReceived.equals(other.getQuantityReceived()))) &&
            ((this.quantityExpected==null && other.getQuantityExpected()==null) || 
             (this.quantityExpected!=null &&
              this.quantityExpected.equals(other.getQuantityExpected()))) &&
            ((this.quantityRemaining==null && other.getQuantityRemaining()==null) || 
             (this.quantityRemaining!=null &&
              this.quantityRemaining.equals(other.getQuantityRemaining()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              this.poRate.equals(other.getPoRate()))) &&
            ((this.expectedRate==null && other.getExpectedRate()==null) || 
             (this.expectedRate!=null &&
              this.expectedRate.equals(other.getExpectedRate()))) &&
            ((this.shipmentItemExchangeRate==null && other.getShipmentItemExchangeRate()==null) || 
             (this.shipmentItemExchangeRate!=null &&
              this.shipmentItemExchangeRate.equals(other.getShipmentItemExchangeRate()))) &&
            ((this.shipmentItemEffectiveDate==null && other.getShipmentItemEffectiveDate()==null) || 
             (this.shipmentItemEffectiveDate!=null &&
              this.shipmentItemEffectiveDate.equals(other.getShipmentItemEffectiveDate()))) &&
            ((this.unitLandedCost==null && other.getUnitLandedCost()==null) || 
             (this.unitLandedCost!=null &&
              this.unitLandedCost.equals(other.getUnitLandedCost()))) &&
            ((this.totalUnitCost==null && other.getTotalUnitCost()==null) || 
             (this.totalUnitCost!=null &&
              this.totalUnitCost.equals(other.getTotalUnitCost()))) &&
            ((this.shipmentItemAmount==null && other.getShipmentItemAmount()==null) || 
             (this.shipmentItemAmount!=null &&
              this.shipmentItemAmount.equals(other.getShipmentItemAmount()))) &&
            ((this.poCurrency==null && other.getPoCurrency()==null) || 
             (this.poCurrency!=null &&
              this.poCurrency.equals(other.getPoCurrency()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPurchaseOrder() != null) {
            _hashCode += getPurchaseOrder().hashCode();
        }
        if (getShipmentItem() != null) {
            _hashCode += getShipmentItem().hashCode();
        }
        if (getShipmentItemDescription() != null) {
            _hashCode += getShipmentItemDescription().hashCode();
        }
        if (getPoVendor() != null) {
            _hashCode += getPoVendor().hashCode();
        }
        if (getReceivingLocation() != null) {
            _hashCode += getReceivingLocation().hashCode();
        }
        if (getQuantityReceived() != null) {
            _hashCode += getQuantityReceived().hashCode();
        }
        if (getQuantityExpected() != null) {
            _hashCode += getQuantityExpected().hashCode();
        }
        if (getQuantityRemaining() != null) {
            _hashCode += getQuantityRemaining().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getPoRate() != null) {
            _hashCode += getPoRate().hashCode();
        }
        if (getExpectedRate() != null) {
            _hashCode += getExpectedRate().hashCode();
        }
        if (getShipmentItemExchangeRate() != null) {
            _hashCode += getShipmentItemExchangeRate().hashCode();
        }
        if (getShipmentItemEffectiveDate() != null) {
            _hashCode += getShipmentItemEffectiveDate().hashCode();
        }
        if (getUnitLandedCost() != null) {
            _hashCode += getUnitLandedCost().hashCode();
        }
        if (getTotalUnitCost() != null) {
            _hashCode += getTotalUnitCost().hashCode();
        }
        if (getShipmentItemAmount() != null) {
            _hashCode += getShipmentItemAmount().hashCode();
        }
        if (getPoCurrency() != null) {
            _hashCode += getPoCurrency().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundShipmentItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "receivingLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityExpected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "quantityExpected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expectedRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItemExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentItemExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItemEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentItemEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "unitLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "totalUnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItemAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentItemAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "poCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "incoterm"));
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
