/**
 * InboundShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2019_1;

public class InboundShipment  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String shipmentNumber;

    private java.lang.String externalDocumentNumber;

    private com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentShipmentStatus shipmentStatus;

    private java.util.Calendar expectedShippingDate;

    private java.util.Calendar actualShippingDate;

    private java.util.Calendar expectedDeliveryDate;

    private java.util.Calendar actualDeliveryDate;

    private java.lang.String shipmentMemo;

    private java.lang.String vesselNumber;

    private java.lang.String billOfLading;

    private com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentLandedCostList landedCostList;

    private com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItemsList itemsList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipmentBaseCurrency;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public InboundShipment() {
    }

    public InboundShipment(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String shipmentNumber,
           java.lang.String externalDocumentNumber,
           com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentShipmentStatus shipmentStatus,
           java.util.Calendar expectedShippingDate,
           java.util.Calendar actualShippingDate,
           java.util.Calendar expectedDeliveryDate,
           java.util.Calendar actualDeliveryDate,
           java.lang.String shipmentMemo,
           java.lang.String vesselNumber,
           java.lang.String billOfLading,
           com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentLandedCostList landedCostList,
           com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItemsList itemsList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipmentBaseCurrency,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.shipmentNumber = shipmentNumber;
        this.externalDocumentNumber = externalDocumentNumber;
        this.shipmentStatus = shipmentStatus;
        this.expectedShippingDate = expectedShippingDate;
        this.actualShippingDate = actualShippingDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.actualDeliveryDate = actualDeliveryDate;
        this.shipmentMemo = shipmentMemo;
        this.vesselNumber = vesselNumber;
        this.billOfLading = billOfLading;
        this.landedCostList = landedCostList;
        this.itemsList = itemsList;
        this.shipmentBaseCurrency = shipmentBaseCurrency;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this InboundShipment.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this InboundShipment.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the shipmentNumber value for this InboundShipment.
     * 
     * @return shipmentNumber
     */
    public java.lang.String getShipmentNumber() {
        return shipmentNumber;
    }


    /**
     * Sets the shipmentNumber value for this InboundShipment.
     * 
     * @param shipmentNumber
     */
    public void setShipmentNumber(java.lang.String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }


    /**
     * Gets the externalDocumentNumber value for this InboundShipment.
     * 
     * @return externalDocumentNumber
     */
    public java.lang.String getExternalDocumentNumber() {
        return externalDocumentNumber;
    }


    /**
     * Sets the externalDocumentNumber value for this InboundShipment.
     * 
     * @param externalDocumentNumber
     */
    public void setExternalDocumentNumber(java.lang.String externalDocumentNumber) {
        this.externalDocumentNumber = externalDocumentNumber;
    }


    /**
     * Gets the shipmentStatus value for this InboundShipment.
     * 
     * @return shipmentStatus
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }


    /**
     * Sets the shipmentStatus value for this InboundShipment.
     * 
     * @param shipmentStatus
     */
    public void setShipmentStatus(com.netsuite.webservices.transactions.purchases_2019_1.types.InboundShipmentShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }


    /**
     * Gets the expectedShippingDate value for this InboundShipment.
     * 
     * @return expectedShippingDate
     */
    public java.util.Calendar getExpectedShippingDate() {
        return expectedShippingDate;
    }


    /**
     * Sets the expectedShippingDate value for this InboundShipment.
     * 
     * @param expectedShippingDate
     */
    public void setExpectedShippingDate(java.util.Calendar expectedShippingDate) {
        this.expectedShippingDate = expectedShippingDate;
    }


    /**
     * Gets the actualShippingDate value for this InboundShipment.
     * 
     * @return actualShippingDate
     */
    public java.util.Calendar getActualShippingDate() {
        return actualShippingDate;
    }


    /**
     * Sets the actualShippingDate value for this InboundShipment.
     * 
     * @param actualShippingDate
     */
    public void setActualShippingDate(java.util.Calendar actualShippingDate) {
        this.actualShippingDate = actualShippingDate;
    }


    /**
     * Gets the expectedDeliveryDate value for this InboundShipment.
     * 
     * @return expectedDeliveryDate
     */
    public java.util.Calendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }


    /**
     * Sets the expectedDeliveryDate value for this InboundShipment.
     * 
     * @param expectedDeliveryDate
     */
    public void setExpectedDeliveryDate(java.util.Calendar expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }


    /**
     * Gets the actualDeliveryDate value for this InboundShipment.
     * 
     * @return actualDeliveryDate
     */
    public java.util.Calendar getActualDeliveryDate() {
        return actualDeliveryDate;
    }


    /**
     * Sets the actualDeliveryDate value for this InboundShipment.
     * 
     * @param actualDeliveryDate
     */
    public void setActualDeliveryDate(java.util.Calendar actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }


    /**
     * Gets the shipmentMemo value for this InboundShipment.
     * 
     * @return shipmentMemo
     */
    public java.lang.String getShipmentMemo() {
        return shipmentMemo;
    }


    /**
     * Sets the shipmentMemo value for this InboundShipment.
     * 
     * @param shipmentMemo
     */
    public void setShipmentMemo(java.lang.String shipmentMemo) {
        this.shipmentMemo = shipmentMemo;
    }


    /**
     * Gets the vesselNumber value for this InboundShipment.
     * 
     * @return vesselNumber
     */
    public java.lang.String getVesselNumber() {
        return vesselNumber;
    }


    /**
     * Sets the vesselNumber value for this InboundShipment.
     * 
     * @param vesselNumber
     */
    public void setVesselNumber(java.lang.String vesselNumber) {
        this.vesselNumber = vesselNumber;
    }


    /**
     * Gets the billOfLading value for this InboundShipment.
     * 
     * @return billOfLading
     */
    public java.lang.String getBillOfLading() {
        return billOfLading;
    }


    /**
     * Sets the billOfLading value for this InboundShipment.
     * 
     * @param billOfLading
     */
    public void setBillOfLading(java.lang.String billOfLading) {
        this.billOfLading = billOfLading;
    }


    /**
     * Gets the landedCostList value for this InboundShipment.
     * 
     * @return landedCostList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentLandedCostList getLandedCostList() {
        return landedCostList;
    }


    /**
     * Sets the landedCostList value for this InboundShipment.
     * 
     * @param landedCostList
     */
    public void setLandedCostList(com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentLandedCostList landedCostList) {
        this.landedCostList = landedCostList;
    }


    /**
     * Gets the itemsList value for this InboundShipment.
     * 
     * @return itemsList
     */
    public com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItemsList getItemsList() {
        return itemsList;
    }


    /**
     * Sets the itemsList value for this InboundShipment.
     * 
     * @param itemsList
     */
    public void setItemsList(com.netsuite.webservices.transactions.purchases_2019_1.InboundShipmentItemsList itemsList) {
        this.itemsList = itemsList;
    }


    /**
     * Gets the shipmentBaseCurrency value for this InboundShipment.
     * 
     * @return shipmentBaseCurrency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipmentBaseCurrency() {
        return shipmentBaseCurrency;
    }


    /**
     * Sets the shipmentBaseCurrency value for this InboundShipment.
     * 
     * @param shipmentBaseCurrency
     */
    public void setShipmentBaseCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef shipmentBaseCurrency) {
        this.shipmentBaseCurrency = shipmentBaseCurrency;
    }


    /**
     * Gets the customFieldList value for this InboundShipment.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InboundShipment.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this InboundShipment.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InboundShipment.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this InboundShipment.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InboundShipment.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipment)) return false;
        InboundShipment other = (InboundShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.shipmentNumber==null && other.getShipmentNumber()==null) || 
             (this.shipmentNumber!=null &&
              this.shipmentNumber.equals(other.getShipmentNumber()))) &&
            ((this.externalDocumentNumber==null && other.getExternalDocumentNumber()==null) || 
             (this.externalDocumentNumber!=null &&
              this.externalDocumentNumber.equals(other.getExternalDocumentNumber()))) &&
            ((this.shipmentStatus==null && other.getShipmentStatus()==null) || 
             (this.shipmentStatus!=null &&
              this.shipmentStatus.equals(other.getShipmentStatus()))) &&
            ((this.expectedShippingDate==null && other.getExpectedShippingDate()==null) || 
             (this.expectedShippingDate!=null &&
              this.expectedShippingDate.equals(other.getExpectedShippingDate()))) &&
            ((this.actualShippingDate==null && other.getActualShippingDate()==null) || 
             (this.actualShippingDate!=null &&
              this.actualShippingDate.equals(other.getActualShippingDate()))) &&
            ((this.expectedDeliveryDate==null && other.getExpectedDeliveryDate()==null) || 
             (this.expectedDeliveryDate!=null &&
              this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate()))) &&
            ((this.actualDeliveryDate==null && other.getActualDeliveryDate()==null) || 
             (this.actualDeliveryDate!=null &&
              this.actualDeliveryDate.equals(other.getActualDeliveryDate()))) &&
            ((this.shipmentMemo==null && other.getShipmentMemo()==null) || 
             (this.shipmentMemo!=null &&
              this.shipmentMemo.equals(other.getShipmentMemo()))) &&
            ((this.vesselNumber==null && other.getVesselNumber()==null) || 
             (this.vesselNumber!=null &&
              this.vesselNumber.equals(other.getVesselNumber()))) &&
            ((this.billOfLading==null && other.getBillOfLading()==null) || 
             (this.billOfLading!=null &&
              this.billOfLading.equals(other.getBillOfLading()))) &&
            ((this.landedCostList==null && other.getLandedCostList()==null) || 
             (this.landedCostList!=null &&
              this.landedCostList.equals(other.getLandedCostList()))) &&
            ((this.itemsList==null && other.getItemsList()==null) || 
             (this.itemsList!=null &&
              this.itemsList.equals(other.getItemsList()))) &&
            ((this.shipmentBaseCurrency==null && other.getShipmentBaseCurrency()==null) || 
             (this.shipmentBaseCurrency!=null &&
              this.shipmentBaseCurrency.equals(other.getShipmentBaseCurrency()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getShipmentNumber() != null) {
            _hashCode += getShipmentNumber().hashCode();
        }
        if (getExternalDocumentNumber() != null) {
            _hashCode += getExternalDocumentNumber().hashCode();
        }
        if (getShipmentStatus() != null) {
            _hashCode += getShipmentStatus().hashCode();
        }
        if (getExpectedShippingDate() != null) {
            _hashCode += getExpectedShippingDate().hashCode();
        }
        if (getActualShippingDate() != null) {
            _hashCode += getActualShippingDate().hashCode();
        }
        if (getExpectedDeliveryDate() != null) {
            _hashCode += getExpectedDeliveryDate().hashCode();
        }
        if (getActualDeliveryDate() != null) {
            _hashCode += getActualDeliveryDate().hashCode();
        }
        if (getShipmentMemo() != null) {
            _hashCode += getShipmentMemo().hashCode();
        }
        if (getVesselNumber() != null) {
            _hashCode += getVesselNumber().hashCode();
        }
        if (getBillOfLading() != null) {
            _hashCode += getBillOfLading().hashCode();
        }
        if (getLandedCostList() != null) {
            _hashCode += getLandedCostList().hashCode();
        }
        if (getItemsList() != null) {
            _hashCode += getItemsList().hashCode();
        }
        if (getShipmentBaseCurrency() != null) {
            _hashCode += getShipmentBaseCurrency().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDocumentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "externalDocumentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentShipmentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedShippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expectedShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShippingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "actualShippingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "expectedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "actualDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentMemo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vesselNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "vesselNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfLading");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "billOfLading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "landedCostList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentLandedCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "itemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "InboundShipmentItemsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentBaseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "shipmentBaseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
