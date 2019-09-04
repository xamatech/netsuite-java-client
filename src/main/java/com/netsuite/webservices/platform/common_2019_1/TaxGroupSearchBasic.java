/**
 * TaxGroupSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TaxGroupSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchStringField city;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField county;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField itemId;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField piggyBack;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField state;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem1;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem2;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice1;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice2;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField zip;

    public TaxGroupSearchBasic() {
    }

    public TaxGroupSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchStringField city,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField county,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField itemId,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField piggyBack,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField state,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem1,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem2,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxType,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice1,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice2,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField zip) {
        this.city = city;
        this.country = country;
        this.county = county;
        this.description = description;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.itemId = itemId;
        this.piggyBack = piggyBack;
        this.rate = rate;
        this.state = state;
        this.subsidiary = subsidiary;
        this.taxItem1 = taxItem1;
        this.taxItem2 = taxItem2;
        this.taxType = taxType;
        this.unitPrice1 = unitPrice1;
        this.unitPrice2 = unitPrice2;
        this.zip = zip;
    }


    /**
     * Gets the city value for this TaxGroupSearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this TaxGroupSearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the country value for this TaxGroupSearchBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this TaxGroupSearchBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this TaxGroupSearchBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this TaxGroupSearchBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the description value for this TaxGroupSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxGroupSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the externalId value for this TaxGroupSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaxGroupSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TaxGroupSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TaxGroupSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the includeChildren value for this TaxGroupSearchBasic.
     * 
     * @return includeChildren
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this TaxGroupSearchBasic.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the internalId value for this TaxGroupSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaxGroupSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TaxGroupSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TaxGroupSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefault value for this TaxGroupSearchBasic.
     * 
     * @return isDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this TaxGroupSearchBasic.
     * 
     * @param isDefault
     */
    public void setIsDefault(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the isInactive value for this TaxGroupSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TaxGroupSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the itemId value for this TaxGroupSearchBasic.
     * 
     * @return itemId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this TaxGroupSearchBasic.
     * 
     * @param itemId
     */
    public void setItemId(com.netsuite.webservices.platform.core_2019_1.SearchStringField itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the piggyBack value for this TaxGroupSearchBasic.
     * 
     * @return piggyBack
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPiggyBack() {
        return piggyBack;
    }


    /**
     * Sets the piggyBack value for this TaxGroupSearchBasic.
     * 
     * @param piggyBack
     */
    public void setPiggyBack(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField piggyBack) {
        this.piggyBack = piggyBack;
    }


    /**
     * Gets the rate value for this TaxGroupSearchBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TaxGroupSearchBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField rate) {
        this.rate = rate;
    }


    /**
     * Gets the state value for this TaxGroupSearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getState() {
        return state;
    }


    /**
     * Sets the state value for this TaxGroupSearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this TaxGroupSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TaxGroupSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxItem1 value for this TaxGroupSearchBasic.
     * 
     * @return taxItem1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxItem1() {
        return taxItem1;
    }


    /**
     * Sets the taxItem1 value for this TaxGroupSearchBasic.
     * 
     * @param taxItem1
     */
    public void setTaxItem1(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem1) {
        this.taxItem1 = taxItem1;
    }


    /**
     * Gets the taxItem2 value for this TaxGroupSearchBasic.
     * 
     * @return taxItem2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxItem2() {
        return taxItem2;
    }


    /**
     * Sets the taxItem2 value for this TaxGroupSearchBasic.
     * 
     * @param taxItem2
     */
    public void setTaxItem2(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem2) {
        this.taxItem2 = taxItem2;
    }


    /**
     * Gets the taxType value for this TaxGroupSearchBasic.
     * 
     * @return taxType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxGroupSearchBasic.
     * 
     * @param taxType
     */
    public void setTaxType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the unitPrice1 value for this TaxGroupSearchBasic.
     * 
     * @return unitPrice1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitPrice1() {
        return unitPrice1;
    }


    /**
     * Sets the unitPrice1 value for this TaxGroupSearchBasic.
     * 
     * @param unitPrice1
     */
    public void setUnitPrice1(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }


    /**
     * Gets the unitPrice2 value for this TaxGroupSearchBasic.
     * 
     * @return unitPrice2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitPrice2() {
        return unitPrice2;
    }


    /**
     * Sets the unitPrice2 value for this TaxGroupSearchBasic.
     * 
     * @param unitPrice2
     */
    public void setUnitPrice2(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }


    /**
     * Gets the zip value for this TaxGroupSearchBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this TaxGroupSearchBasic.
     * 
     * @param zip
     */
    public void setZip(com.netsuite.webservices.platform.core_2019_1.SearchStringField zip) {
        this.zip = zip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxGroupSearchBasic)) return false;
        TaxGroupSearchBasic other = (TaxGroupSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.piggyBack==null && other.getPiggyBack()==null) || 
             (this.piggyBack!=null &&
              this.piggyBack.equals(other.getPiggyBack()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxItem1==null && other.getTaxItem1()==null) || 
             (this.taxItem1!=null &&
              this.taxItem1.equals(other.getTaxItem1()))) &&
            ((this.taxItem2==null && other.getTaxItem2()==null) || 
             (this.taxItem2!=null &&
              this.taxItem2.equals(other.getTaxItem2()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.unitPrice1==null && other.getUnitPrice1()==null) || 
             (this.unitPrice1!=null &&
              this.unitPrice1.equals(other.getUnitPrice1()))) &&
            ((this.unitPrice2==null && other.getUnitPrice2()==null) || 
             (this.unitPrice2!=null &&
              this.unitPrice2.equals(other.getUnitPrice2()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getPiggyBack() != null) {
            _hashCode += getPiggyBack().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxItem1() != null) {
            _hashCode += getTaxItem1().hashCode();
        }
        if (getTaxItem2() != null) {
            _hashCode += getTaxItem2().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getUnitPrice1() != null) {
            _hashCode += getUnitPrice1().hashCode();
        }
        if (getUnitPrice2() != null) {
            _hashCode += getUnitPrice2().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxGroupSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxGroupSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piggyBack");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "piggyBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitPrice2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
