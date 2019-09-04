/**
 * ItemMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ItemMember  implements java.io.Serializable {
    private java.lang.String memberDescr;

    private java.lang.Double componentYield;

    private java.lang.Double bomQuantity;

    private com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource;

    private java.lang.Double quantity;

    private java.lang.String memberUnit;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral;

    private com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule;

    private java.lang.String taxcode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private java.lang.Double taxrate;

    private java.util.Calendar effectiveDate;

    private java.util.Calendar obsoleteDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef effectiveRevision;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef obsoleteRevision;

    private java.lang.Long lineNumber;

    private java.lang.String memberKey;

    public ItemMember() {
    }

    public ItemMember(
           java.lang.String memberDescr,
           java.lang.Double componentYield,
           java.lang.Double bomQuantity,
           com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource,
           java.lang.Double quantity,
           java.lang.String memberUnit,
           com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral,
           com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule,
           java.lang.String taxcode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           java.lang.Double taxrate,
           java.util.Calendar effectiveDate,
           java.util.Calendar obsoleteDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef effectiveRevision,
           com.netsuite.webservices.platform.core_2019_1.RecordRef obsoleteRevision,
           java.lang.Long lineNumber,
           java.lang.String memberKey) {
           this.memberDescr = memberDescr;
           this.componentYield = componentYield;
           this.bomQuantity = bomQuantity;
           this.itemSource = itemSource;
           this.quantity = quantity;
           this.memberUnit = memberUnit;
           this.vsoeDeferral = vsoeDeferral;
           this.vsoePermitDiscount = vsoePermitDiscount;
           this.vsoeDelivered = vsoeDelivered;
           this.taxSchedule = taxSchedule;
           this.taxcode = taxcode;
           this.item = item;
           this.taxrate = taxrate;
           this.effectiveDate = effectiveDate;
           this.obsoleteDate = obsoleteDate;
           this.effectiveRevision = effectiveRevision;
           this.obsoleteRevision = obsoleteRevision;
           this.lineNumber = lineNumber;
           this.memberKey = memberKey;
    }


    /**
     * Gets the memberDescr value for this ItemMember.
     * 
     * @return memberDescr
     */
    public java.lang.String getMemberDescr() {
        return memberDescr;
    }


    /**
     * Sets the memberDescr value for this ItemMember.
     * 
     * @param memberDescr
     */
    public void setMemberDescr(java.lang.String memberDescr) {
        this.memberDescr = memberDescr;
    }


    /**
     * Gets the componentYield value for this ItemMember.
     * 
     * @return componentYield
     */
    public java.lang.Double getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this ItemMember.
     * 
     * @param componentYield
     */
    public void setComponentYield(java.lang.Double componentYield) {
        this.componentYield = componentYield;
    }


    /**
     * Gets the bomQuantity value for this ItemMember.
     * 
     * @return bomQuantity
     */
    public java.lang.Double getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this ItemMember.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(java.lang.Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the itemSource value for this ItemMember.
     * 
     * @return itemSource
     */
    public com.netsuite.webservices.platform.common_2019_1.types.ItemSource getItemSource() {
        return itemSource;
    }


    /**
     * Sets the itemSource value for this ItemMember.
     * 
     * @param itemSource
     */
    public void setItemSource(com.netsuite.webservices.platform.common_2019_1.types.ItemSource itemSource) {
        this.itemSource = itemSource;
    }


    /**
     * Gets the quantity value for this ItemMember.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemMember.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the memberUnit value for this ItemMember.
     * 
     * @return memberUnit
     */
    public java.lang.String getMemberUnit() {
        return memberUnit;
    }


    /**
     * Sets the memberUnit value for this ItemMember.
     * 
     * @param memberUnit
     */
    public void setMemberUnit(java.lang.String memberUnit) {
        this.memberUnit = memberUnit;
    }


    /**
     * Gets the vsoeDeferral value for this ItemMember.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ItemMember.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.common_2019_1.types.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this ItemMember.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ItemMember.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.common_2019_1.types.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this ItemMember.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ItemMember.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the taxSchedule value for this ItemMember.
     * 
     * @return taxSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ItemMember.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the taxcode value for this ItemMember.
     * 
     * @return taxcode
     */
    public java.lang.String getTaxcode() {
        return taxcode;
    }


    /**
     * Sets the taxcode value for this ItemMember.
     * 
     * @param taxcode
     */
    public void setTaxcode(java.lang.String taxcode) {
        this.taxcode = taxcode;
    }


    /**
     * Gets the item value for this ItemMember.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemMember.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the taxrate value for this ItemMember.
     * 
     * @return taxrate
     */
    public java.lang.Double getTaxrate() {
        return taxrate;
    }


    /**
     * Sets the taxrate value for this ItemMember.
     * 
     * @param taxrate
     */
    public void setTaxrate(java.lang.Double taxrate) {
        this.taxrate = taxrate;
    }


    /**
     * Gets the effectiveDate value for this ItemMember.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ItemMember.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the obsoleteDate value for this ItemMember.
     * 
     * @return obsoleteDate
     */
    public java.util.Calendar getObsoleteDate() {
        return obsoleteDate;
    }


    /**
     * Sets the obsoleteDate value for this ItemMember.
     * 
     * @param obsoleteDate
     */
    public void setObsoleteDate(java.util.Calendar obsoleteDate) {
        this.obsoleteDate = obsoleteDate;
    }


    /**
     * Gets the effectiveRevision value for this ItemMember.
     * 
     * @return effectiveRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEffectiveRevision() {
        return effectiveRevision;
    }


    /**
     * Sets the effectiveRevision value for this ItemMember.
     * 
     * @param effectiveRevision
     */
    public void setEffectiveRevision(com.netsuite.webservices.platform.core_2019_1.RecordRef effectiveRevision) {
        this.effectiveRevision = effectiveRevision;
    }


    /**
     * Gets the obsoleteRevision value for this ItemMember.
     * 
     * @return obsoleteRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getObsoleteRevision() {
        return obsoleteRevision;
    }


    /**
     * Sets the obsoleteRevision value for this ItemMember.
     * 
     * @param obsoleteRevision
     */
    public void setObsoleteRevision(com.netsuite.webservices.platform.core_2019_1.RecordRef obsoleteRevision) {
        this.obsoleteRevision = obsoleteRevision;
    }


    /**
     * Gets the lineNumber value for this ItemMember.
     * 
     * @return lineNumber
     */
    public java.lang.Long getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this ItemMember.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.Long lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the memberKey value for this ItemMember.
     * 
     * @return memberKey
     */
    public java.lang.String getMemberKey() {
        return memberKey;
    }


    /**
     * Sets the memberKey value for this ItemMember.
     * 
     * @param memberKey
     */
    public void setMemberKey(java.lang.String memberKey) {
        this.memberKey = memberKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemMember)) return false;
        ItemMember other = (ItemMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberDescr==null && other.getMemberDescr()==null) || 
             (this.memberDescr!=null &&
              this.memberDescr.equals(other.getMemberDescr()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              this.componentYield.equals(other.getComponentYield()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.itemSource==null && other.getItemSource()==null) || 
             (this.itemSource!=null &&
              this.itemSource.equals(other.getItemSource()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.memberUnit==null && other.getMemberUnit()==null) || 
             (this.memberUnit!=null &&
              this.memberUnit.equals(other.getMemberUnit()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.taxcode==null && other.getTaxcode()==null) || 
             (this.taxcode!=null &&
              this.taxcode.equals(other.getTaxcode()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.taxrate==null && other.getTaxrate()==null) || 
             (this.taxrate!=null &&
              this.taxrate.equals(other.getTaxrate()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.obsoleteDate==null && other.getObsoleteDate()==null) || 
             (this.obsoleteDate!=null &&
              this.obsoleteDate.equals(other.getObsoleteDate()))) &&
            ((this.effectiveRevision==null && other.getEffectiveRevision()==null) || 
             (this.effectiveRevision!=null &&
              this.effectiveRevision.equals(other.getEffectiveRevision()))) &&
            ((this.obsoleteRevision==null && other.getObsoleteRevision()==null) || 
             (this.obsoleteRevision!=null &&
              this.obsoleteRevision.equals(other.getObsoleteRevision()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.memberKey==null && other.getMemberKey()==null) || 
             (this.memberKey!=null &&
              this.memberKey.equals(other.getMemberKey())));
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
        if (getMemberDescr() != null) {
            _hashCode += getMemberDescr().hashCode();
        }
        if (getComponentYield() != null) {
            _hashCode += getComponentYield().hashCode();
        }
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getItemSource() != null) {
            _hashCode += getItemSource().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getMemberUnit() != null) {
            _hashCode += getMemberUnit().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getTaxcode() != null) {
            _hashCode += getTaxcode().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getTaxrate() != null) {
            _hashCode += getTaxrate().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getObsoleteDate() != null) {
            _hashCode += getObsoleteDate().hashCode();
        }
        if (getEffectiveRevision() != null) {
            _hashCode += getEffectiveRevision().hashCode();
        }
        if (getObsoleteRevision() != null) {
            _hashCode += getObsoleteRevision().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getMemberKey() != null) {
            _hashCode += getMemberKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ItemMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memberDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "ItemSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memberUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxcode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxrate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "obsoleteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "effectiveRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsoleteRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "obsoleteRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memberKey"));
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
