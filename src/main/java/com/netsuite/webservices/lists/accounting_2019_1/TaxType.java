/**
 * TaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class TaxType  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.Boolean doesNotAddToTotal;

    private java.lang.Boolean postToItemCost;

    private java.lang.Boolean taxInNetAmount;

    private java.lang.Boolean reverseCharge;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusAccountsList nexusAccountsList;

    private com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusesTaxList nexusesTaxList;

    private com.netsuite.webservices.platform.common_2019_1.types.Country country;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public TaxType() {
    }

    public TaxType(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           java.lang.String description,
           java.lang.Boolean doesNotAddToTotal,
           java.lang.Boolean postToItemCost,
           java.lang.Boolean taxInNetAmount,
           java.lang.Boolean reverseCharge,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusAccountsList nexusAccountsList,
           com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusesTaxList nexusesTaxList,
           com.netsuite.webservices.platform.common_2019_1.types.Country country) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.description = description;
        this.doesNotAddToTotal = doesNotAddToTotal;
        this.postToItemCost = postToItemCost;
        this.taxInNetAmount = taxInNetAmount;
        this.reverseCharge = reverseCharge;
        this.isInactive = isInactive;
        this.nexusAccountsList = nexusAccountsList;
        this.nexusesTaxList = nexusesTaxList;
        this.country = country;
    }


    /**
     * Gets the name value for this TaxType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TaxType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TaxType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the doesNotAddToTotal value for this TaxType.
     * 
     * @return doesNotAddToTotal
     */
    public java.lang.Boolean getDoesNotAddToTotal() {
        return doesNotAddToTotal;
    }


    /**
     * Sets the doesNotAddToTotal value for this TaxType.
     * 
     * @param doesNotAddToTotal
     */
    public void setDoesNotAddToTotal(java.lang.Boolean doesNotAddToTotal) {
        this.doesNotAddToTotal = doesNotAddToTotal;
    }


    /**
     * Gets the postToItemCost value for this TaxType.
     * 
     * @return postToItemCost
     */
    public java.lang.Boolean getPostToItemCost() {
        return postToItemCost;
    }


    /**
     * Sets the postToItemCost value for this TaxType.
     * 
     * @param postToItemCost
     */
    public void setPostToItemCost(java.lang.Boolean postToItemCost) {
        this.postToItemCost = postToItemCost;
    }


    /**
     * Gets the taxInNetAmount value for this TaxType.
     * 
     * @return taxInNetAmount
     */
    public java.lang.Boolean getTaxInNetAmount() {
        return taxInNetAmount;
    }


    /**
     * Sets the taxInNetAmount value for this TaxType.
     * 
     * @param taxInNetAmount
     */
    public void setTaxInNetAmount(java.lang.Boolean taxInNetAmount) {
        this.taxInNetAmount = taxInNetAmount;
    }


    /**
     * Gets the reverseCharge value for this TaxType.
     * 
     * @return reverseCharge
     */
    public java.lang.Boolean getReverseCharge() {
        return reverseCharge;
    }


    /**
     * Sets the reverseCharge value for this TaxType.
     * 
     * @param reverseCharge
     */
    public void setReverseCharge(java.lang.Boolean reverseCharge) {
        this.reverseCharge = reverseCharge;
    }


    /**
     * Gets the isInactive value for this TaxType.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TaxType.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the nexusAccountsList value for this TaxType.
     * 
     * @return nexusAccountsList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusAccountsList getNexusAccountsList() {
        return nexusAccountsList;
    }


    /**
     * Sets the nexusAccountsList value for this TaxType.
     * 
     * @param nexusAccountsList
     */
    public void setNexusAccountsList(com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusAccountsList nexusAccountsList) {
        this.nexusAccountsList = nexusAccountsList;
    }


    /**
     * Gets the nexusesTaxList value for this TaxType.
     * 
     * @return nexusesTaxList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusesTaxList getNexusesTaxList() {
        return nexusesTaxList;
    }


    /**
     * Sets the nexusesTaxList value for this TaxType.
     * 
     * @param nexusesTaxList
     */
    public void setNexusesTaxList(com.netsuite.webservices.lists.accounting_2019_1.TaxTypeNexusesTaxList nexusesTaxList) {
        this.nexusesTaxList = nexusesTaxList;
    }


    /**
     * Gets the country value for this TaxType.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this TaxType.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.common_2019_1.types.Country country) {
        this.country = country;
    }


    /**
     * Gets the internalId value for this TaxType.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaxType.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this TaxType.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaxType.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxType)) return false;
        TaxType other = (TaxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.doesNotAddToTotal==null && other.getDoesNotAddToTotal()==null) || 
             (this.doesNotAddToTotal!=null &&
              this.doesNotAddToTotal.equals(other.getDoesNotAddToTotal()))) &&
            ((this.postToItemCost==null && other.getPostToItemCost()==null) || 
             (this.postToItemCost!=null &&
              this.postToItemCost.equals(other.getPostToItemCost()))) &&
            ((this.taxInNetAmount==null && other.getTaxInNetAmount()==null) || 
             (this.taxInNetAmount!=null &&
              this.taxInNetAmount.equals(other.getTaxInNetAmount()))) &&
            ((this.reverseCharge==null && other.getReverseCharge()==null) || 
             (this.reverseCharge!=null &&
              this.reverseCharge.equals(other.getReverseCharge()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.nexusAccountsList==null && other.getNexusAccountsList()==null) || 
             (this.nexusAccountsList!=null &&
              this.nexusAccountsList.equals(other.getNexusAccountsList()))) &&
            ((this.nexusesTaxList==null && other.getNexusesTaxList()==null) || 
             (this.nexusesTaxList!=null &&
              this.nexusesTaxList.equals(other.getNexusesTaxList()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDoesNotAddToTotal() != null) {
            _hashCode += getDoesNotAddToTotal().hashCode();
        }
        if (getPostToItemCost() != null) {
            _hashCode += getPostToItemCost().hashCode();
        }
        if (getTaxInNetAmount() != null) {
            _hashCode += getTaxInNetAmount().hashCode();
        }
        if (getReverseCharge() != null) {
            _hashCode += getReverseCharge().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getNexusAccountsList() != null) {
            _hashCode += getNexusAccountsList().hashCode();
        }
        if (getNexusesTaxList() != null) {
            _hashCode += getNexusesTaxList().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
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
        new org.apache.axis.description.TypeDesc(TaxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TaxType"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doesNotAddToTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "doesNotAddToTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postToItemCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "postToItemCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "taxInNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "reverseCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusAccountsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexusAccountsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TaxTypeNexusAccountsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusesTaxList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexusesTaxList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TaxTypeNexusesTaxList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
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
