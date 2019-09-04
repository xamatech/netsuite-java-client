/**
 * BomSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class BomSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableForAllAssemblies;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableForAllLocations;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField legacyBomForAssembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField restrictToAssemblies;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField restrictToLocations;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useComponentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usedOnAssembly;

    public BomSearchBasic() {
    }

    public BomSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableForAllAssemblies,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableForAllLocations,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField legacyBomForAssembly,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField memo,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField restrictToAssemblies,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField restrictToLocations,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useComponentYield,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usedOnAssembly) {
        this.availableForAllAssemblies = availableForAllAssemblies;
        this.availableForAllLocations = availableForAllLocations;
        this.createdDate = createdDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.legacyBomForAssembly = legacyBomForAssembly;
        this.memo = memo;
        this.name = name;
        this.restrictToAssemblies = restrictToAssemblies;
        this.restrictToLocations = restrictToLocations;
        this.subsidiary = subsidiary;
        this.useComponentYield = useComponentYield;
        this.usedOnAssembly = usedOnAssembly;
    }


    /**
     * Gets the availableForAllAssemblies value for this BomSearchBasic.
     * 
     * @return availableForAllAssemblies
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAvailableForAllAssemblies() {
        return availableForAllAssemblies;
    }


    /**
     * Sets the availableForAllAssemblies value for this BomSearchBasic.
     * 
     * @param availableForAllAssemblies
     */
    public void setAvailableForAllAssemblies(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableForAllAssemblies) {
        this.availableForAllAssemblies = availableForAllAssemblies;
    }


    /**
     * Gets the availableForAllLocations value for this BomSearchBasic.
     * 
     * @return availableForAllLocations
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAvailableForAllLocations() {
        return availableForAllLocations;
    }


    /**
     * Sets the availableForAllLocations value for this BomSearchBasic.
     * 
     * @param availableForAllLocations
     */
    public void setAvailableForAllLocations(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableForAllLocations) {
        this.availableForAllLocations = availableForAllLocations;
    }


    /**
     * Gets the createdDate value for this BomSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BomSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the externalId value for this BomSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this BomSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this BomSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this BomSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the includeChildren value for this BomSearchBasic.
     * 
     * @return includeChildren
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this BomSearchBasic.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the internalId value for this BomSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BomSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this BomSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this BomSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this BomSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this BomSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the legacyBomForAssembly value for this BomSearchBasic.
     * 
     * @return legacyBomForAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLegacyBomForAssembly() {
        return legacyBomForAssembly;
    }


    /**
     * Sets the legacyBomForAssembly value for this BomSearchBasic.
     * 
     * @param legacyBomForAssembly
     */
    public void setLegacyBomForAssembly(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField legacyBomForAssembly) {
        this.legacyBomForAssembly = legacyBomForAssembly;
    }


    /**
     * Gets the memo value for this BomSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this BomSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the name value for this BomSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this BomSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the restrictToAssemblies value for this BomSearchBasic.
     * 
     * @return restrictToAssemblies
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRestrictToAssemblies() {
        return restrictToAssemblies;
    }


    /**
     * Sets the restrictToAssemblies value for this BomSearchBasic.
     * 
     * @param restrictToAssemblies
     */
    public void setRestrictToAssemblies(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField restrictToAssemblies) {
        this.restrictToAssemblies = restrictToAssemblies;
    }


    /**
     * Gets the restrictToLocations value for this BomSearchBasic.
     * 
     * @return restrictToLocations
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRestrictToLocations() {
        return restrictToLocations;
    }


    /**
     * Sets the restrictToLocations value for this BomSearchBasic.
     * 
     * @param restrictToLocations
     */
    public void setRestrictToLocations(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField restrictToLocations) {
        this.restrictToLocations = restrictToLocations;
    }


    /**
     * Gets the subsidiary value for this BomSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this BomSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the useComponentYield value for this BomSearchBasic.
     * 
     * @return useComponentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUseComponentYield() {
        return useComponentYield;
    }


    /**
     * Sets the useComponentYield value for this BomSearchBasic.
     * 
     * @param useComponentYield
     */
    public void setUseComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField useComponentYield) {
        this.useComponentYield = useComponentYield;
    }


    /**
     * Gets the usedOnAssembly value for this BomSearchBasic.
     * 
     * @return usedOnAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getUsedOnAssembly() {
        return usedOnAssembly;
    }


    /**
     * Sets the usedOnAssembly value for this BomSearchBasic.
     * 
     * @param usedOnAssembly
     */
    public void setUsedOnAssembly(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField usedOnAssembly) {
        this.usedOnAssembly = usedOnAssembly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomSearchBasic)) return false;
        BomSearchBasic other = (BomSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableForAllAssemblies==null && other.getAvailableForAllAssemblies()==null) || 
             (this.availableForAllAssemblies!=null &&
              this.availableForAllAssemblies.equals(other.getAvailableForAllAssemblies()))) &&
            ((this.availableForAllLocations==null && other.getAvailableForAllLocations()==null) || 
             (this.availableForAllLocations!=null &&
              this.availableForAllLocations.equals(other.getAvailableForAllLocations()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
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
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.legacyBomForAssembly==null && other.getLegacyBomForAssembly()==null) || 
             (this.legacyBomForAssembly!=null &&
              this.legacyBomForAssembly.equals(other.getLegacyBomForAssembly()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.restrictToAssemblies==null && other.getRestrictToAssemblies()==null) || 
             (this.restrictToAssemblies!=null &&
              this.restrictToAssemblies.equals(other.getRestrictToAssemblies()))) &&
            ((this.restrictToLocations==null && other.getRestrictToLocations()==null) || 
             (this.restrictToLocations!=null &&
              this.restrictToLocations.equals(other.getRestrictToLocations()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.useComponentYield==null && other.getUseComponentYield()==null) || 
             (this.useComponentYield!=null &&
              this.useComponentYield.equals(other.getUseComponentYield()))) &&
            ((this.usedOnAssembly==null && other.getUsedOnAssembly()==null) || 
             (this.usedOnAssembly!=null &&
              this.usedOnAssembly.equals(other.getUsedOnAssembly())));
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
        if (getAvailableForAllAssemblies() != null) {
            _hashCode += getAvailableForAllAssemblies().hashCode();
        }
        if (getAvailableForAllLocations() != null) {
            _hashCode += getAvailableForAllLocations().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
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
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLegacyBomForAssembly() != null) {
            _hashCode += getLegacyBomForAssembly().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRestrictToAssemblies() != null) {
            _hashCode += getRestrictToAssemblies().hashCode();
        }
        if (getRestrictToLocations() != null) {
            _hashCode += getRestrictToLocations().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getUseComponentYield() != null) {
            _hashCode += getUseComponentYield().hashCode();
        }
        if (getUsedOnAssembly() != null) {
            _hashCode += getUsedOnAssembly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BomSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BomSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForAllAssemblies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableForAllAssemblies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForAllLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableForAllLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legacyBomForAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "legacyBomForAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToAssemblies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "restrictToAssemblies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "restrictToLocations"));
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
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedOnAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "usedOnAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
