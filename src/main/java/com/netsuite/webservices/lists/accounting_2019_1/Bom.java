/**
 * Bom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class Bom  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String name;

    private java.lang.Boolean usedOnAssembly;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean useComponentYield;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef legacyBomForAssembly;

    private java.lang.Boolean availableForAllAssemblies;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToAssembliesList;

    private java.lang.Boolean availableForAllLocations;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToLocationsList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList;

    private java.lang.Boolean includeChildren;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Bom() {
    }

    public Bom(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String name,
           java.lang.Boolean usedOnAssembly,
           java.util.Calendar createdDate,
           java.lang.Boolean isInactive,
           java.lang.Boolean useComponentYield,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef legacyBomForAssembly,
           java.lang.Boolean availableForAllAssemblies,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToAssembliesList,
           java.lang.Boolean availableForAllLocations,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToLocationsList,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList,
           java.lang.Boolean includeChildren,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.name = name;
        this.usedOnAssembly = usedOnAssembly;
        this.createdDate = createdDate;
        this.isInactive = isInactive;
        this.useComponentYield = useComponentYield;
        this.memo = memo;
        this.legacyBomForAssembly = legacyBomForAssembly;
        this.availableForAllAssemblies = availableForAllAssemblies;
        this.restrictToAssembliesList = restrictToAssembliesList;
        this.availableForAllLocations = availableForAllLocations;
        this.restrictToLocationsList = restrictToLocationsList;
        this.subsidiaryList = subsidiaryList;
        this.includeChildren = includeChildren;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Bom.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Bom.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the name value for this Bom.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Bom.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the usedOnAssembly value for this Bom.
     * 
     * @return usedOnAssembly
     */
    public java.lang.Boolean getUsedOnAssembly() {
        return usedOnAssembly;
    }


    /**
     * Sets the usedOnAssembly value for this Bom.
     * 
     * @param usedOnAssembly
     */
    public void setUsedOnAssembly(java.lang.Boolean usedOnAssembly) {
        this.usedOnAssembly = usedOnAssembly;
    }


    /**
     * Gets the createdDate value for this Bom.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Bom.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isInactive value for this Bom.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Bom.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the useComponentYield value for this Bom.
     * 
     * @return useComponentYield
     */
    public java.lang.Boolean getUseComponentYield() {
        return useComponentYield;
    }


    /**
     * Sets the useComponentYield value for this Bom.
     * 
     * @param useComponentYield
     */
    public void setUseComponentYield(java.lang.Boolean useComponentYield) {
        this.useComponentYield = useComponentYield;
    }


    /**
     * Gets the memo value for this Bom.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this Bom.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the legacyBomForAssembly value for this Bom.
     * 
     * @return legacyBomForAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLegacyBomForAssembly() {
        return legacyBomForAssembly;
    }


    /**
     * Sets the legacyBomForAssembly value for this Bom.
     * 
     * @param legacyBomForAssembly
     */
    public void setLegacyBomForAssembly(com.netsuite.webservices.platform.core_2019_1.RecordRef legacyBomForAssembly) {
        this.legacyBomForAssembly = legacyBomForAssembly;
    }


    /**
     * Gets the availableForAllAssemblies value for this Bom.
     * 
     * @return availableForAllAssemblies
     */
    public java.lang.Boolean getAvailableForAllAssemblies() {
        return availableForAllAssemblies;
    }


    /**
     * Sets the availableForAllAssemblies value for this Bom.
     * 
     * @param availableForAllAssemblies
     */
    public void setAvailableForAllAssemblies(java.lang.Boolean availableForAllAssemblies) {
        this.availableForAllAssemblies = availableForAllAssemblies;
    }


    /**
     * Gets the restrictToAssembliesList value for this Bom.
     * 
     * @return restrictToAssembliesList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getRestrictToAssembliesList() {
        return restrictToAssembliesList;
    }


    /**
     * Sets the restrictToAssembliesList value for this Bom.
     * 
     * @param restrictToAssembliesList
     */
    public void setRestrictToAssembliesList(com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToAssembliesList) {
        this.restrictToAssembliesList = restrictToAssembliesList;
    }


    /**
     * Gets the availableForAllLocations value for this Bom.
     * 
     * @return availableForAllLocations
     */
    public java.lang.Boolean getAvailableForAllLocations() {
        return availableForAllLocations;
    }


    /**
     * Sets the availableForAllLocations value for this Bom.
     * 
     * @param availableForAllLocations
     */
    public void setAvailableForAllLocations(java.lang.Boolean availableForAllLocations) {
        this.availableForAllLocations = availableForAllLocations;
    }


    /**
     * Gets the restrictToLocationsList value for this Bom.
     * 
     * @return restrictToLocationsList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getRestrictToLocationsList() {
        return restrictToLocationsList;
    }


    /**
     * Sets the restrictToLocationsList value for this Bom.
     * 
     * @param restrictToLocationsList
     */
    public void setRestrictToLocationsList(com.netsuite.webservices.platform.core_2019_1.RecordRefList restrictToLocationsList) {
        this.restrictToLocationsList = restrictToLocationsList;
    }


    /**
     * Gets the subsidiaryList value for this Bom.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this Bom.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the includeChildren value for this Bom.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this Bom.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the customFieldList value for this Bom.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Bom.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Bom.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Bom.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Bom.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Bom.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bom)) return false;
        Bom other = (Bom) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.usedOnAssembly==null && other.getUsedOnAssembly()==null) || 
             (this.usedOnAssembly!=null &&
              this.usedOnAssembly.equals(other.getUsedOnAssembly()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.useComponentYield==null && other.getUseComponentYield()==null) || 
             (this.useComponentYield!=null &&
              this.useComponentYield.equals(other.getUseComponentYield()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.legacyBomForAssembly==null && other.getLegacyBomForAssembly()==null) || 
             (this.legacyBomForAssembly!=null &&
              this.legacyBomForAssembly.equals(other.getLegacyBomForAssembly()))) &&
            ((this.availableForAllAssemblies==null && other.getAvailableForAllAssemblies()==null) || 
             (this.availableForAllAssemblies!=null &&
              this.availableForAllAssemblies.equals(other.getAvailableForAllAssemblies()))) &&
            ((this.restrictToAssembliesList==null && other.getRestrictToAssembliesList()==null) || 
             (this.restrictToAssembliesList!=null &&
              this.restrictToAssembliesList.equals(other.getRestrictToAssembliesList()))) &&
            ((this.availableForAllLocations==null && other.getAvailableForAllLocations()==null) || 
             (this.availableForAllLocations!=null &&
              this.availableForAllLocations.equals(other.getAvailableForAllLocations()))) &&
            ((this.restrictToLocationsList==null && other.getRestrictToLocationsList()==null) || 
             (this.restrictToLocationsList!=null &&
              this.restrictToLocationsList.equals(other.getRestrictToLocationsList()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUsedOnAssembly() != null) {
            _hashCode += getUsedOnAssembly().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getUseComponentYield() != null) {
            _hashCode += getUseComponentYield().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getLegacyBomForAssembly() != null) {
            _hashCode += getLegacyBomForAssembly().hashCode();
        }
        if (getAvailableForAllAssemblies() != null) {
            _hashCode += getAvailableForAllAssemblies().hashCode();
        }
        if (getRestrictToAssembliesList() != null) {
            _hashCode += getRestrictToAssembliesList().hashCode();
        }
        if (getAvailableForAllLocations() != null) {
            _hashCode += getAvailableForAllLocations().hashCode();
        }
        if (getRestrictToLocationsList() != null) {
            _hashCode += getRestrictToLocationsList().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
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
        new org.apache.axis.description.TypeDesc(Bom.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "Bom"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedOnAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "usedOnAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legacyBomForAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "legacyBomForAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForAllAssemblies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "availableForAllAssemblies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToAssembliesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "restrictToAssembliesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForAllLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "availableForAllLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToLocationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "restrictToLocationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
