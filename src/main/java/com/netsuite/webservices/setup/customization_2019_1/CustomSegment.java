/**
 * CustomSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomSegment  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String label;

    private java.lang.String scriptId;

    private java.lang.String recordScriptId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef recordType;

    private com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean showInList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList filteredByList;

    private java.lang.Boolean hasGLImpact;

    private java.lang.String help;

    private java.lang.String description;

    private java.lang.Boolean isMandatory;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection;

    private java.lang.String internalId;  // attribute

    public CustomSegment() {
    }

    public CustomSegment(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String label,
           java.lang.String scriptId,
           java.lang.String recordScriptId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef recordType,
           com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType,
           java.lang.Boolean isInactive,
           java.lang.Boolean showInList,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList filteredByList,
           java.lang.Boolean hasGLImpact,
           java.lang.String help,
           java.lang.String description,
           java.lang.Boolean isMandatory,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.label = label;
        this.scriptId = scriptId;
        this.recordScriptId = recordScriptId;
        this.recordType = recordType;
        this.fieldType = fieldType;
        this.isInactive = isInactive;
        this.showInList = showInList;
        this.filteredByList = filteredByList;
        this.hasGLImpact = hasGLImpact;
        this.help = help;
        this.description = description;
        this.isMandatory = isMandatory;
        this.defaultSelection = defaultSelection;
    }


    /**
     * Gets the label value for this CustomSegment.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomSegment.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the scriptId value for this CustomSegment.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CustomSegment.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the recordScriptId value for this CustomSegment.
     * 
     * @return recordScriptId
     */
    public java.lang.String getRecordScriptId() {
        return recordScriptId;
    }


    /**
     * Sets the recordScriptId value for this CustomSegment.
     * 
     * @param recordScriptId
     */
    public void setRecordScriptId(java.lang.String recordScriptId) {
        this.recordScriptId = recordScriptId;
    }


    /**
     * Gets the recordType value for this CustomSegment.
     * 
     * @return recordType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this CustomSegment.
     * 
     * @param recordType
     */
    public void setRecordType(com.netsuite.webservices.platform.core_2019_1.RecordRef recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the fieldType value for this CustomSegment.
     * 
     * @return fieldType
     */
    public com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this CustomSegment.
     * 
     * @param fieldType
     */
    public void setFieldType(com.netsuite.webservices.setup.customization_2019_1.types.CustomizationFieldType fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the isInactive value for this CustomSegment.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomSegment.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the showInList value for this CustomSegment.
     * 
     * @return showInList
     */
    public java.lang.Boolean getShowInList() {
        return showInList;
    }


    /**
     * Sets the showInList value for this CustomSegment.
     * 
     * @param showInList
     */
    public void setShowInList(java.lang.Boolean showInList) {
        this.showInList = showInList;
    }


    /**
     * Gets the filteredByList value for this CustomSegment.
     * 
     * @return filteredByList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getFilteredByList() {
        return filteredByList;
    }


    /**
     * Sets the filteredByList value for this CustomSegment.
     * 
     * @param filteredByList
     */
    public void setFilteredByList(com.netsuite.webservices.platform.core_2019_1.RecordRefList filteredByList) {
        this.filteredByList = filteredByList;
    }


    /**
     * Gets the hasGLImpact value for this CustomSegment.
     * 
     * @return hasGLImpact
     */
    public java.lang.Boolean getHasGLImpact() {
        return hasGLImpact;
    }


    /**
     * Sets the hasGLImpact value for this CustomSegment.
     * 
     * @param hasGLImpact
     */
    public void setHasGLImpact(java.lang.Boolean hasGLImpact) {
        this.hasGLImpact = hasGLImpact;
    }


    /**
     * Gets the help value for this CustomSegment.
     * 
     * @return help
     */
    public java.lang.String getHelp() {
        return help;
    }


    /**
     * Sets the help value for this CustomSegment.
     * 
     * @param help
     */
    public void setHelp(java.lang.String help) {
        this.help = help;
    }


    /**
     * Gets the description value for this CustomSegment.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomSegment.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isMandatory value for this CustomSegment.
     * 
     * @return isMandatory
     */
    public java.lang.Boolean getIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this CustomSegment.
     * 
     * @param isMandatory
     */
    public void setIsMandatory(java.lang.Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the defaultSelection value for this CustomSegment.
     * 
     * @return defaultSelection
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultSelection() {
        return defaultSelection;
    }


    /**
     * Sets the defaultSelection value for this CustomSegment.
     * 
     * @param defaultSelection
     */
    public void setDefaultSelection(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultSelection) {
        this.defaultSelection = defaultSelection;
    }


    /**
     * Gets the internalId value for this CustomSegment.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomSegment.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomSegment)) return false;
        CustomSegment other = (CustomSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
            ((this.recordScriptId==null && other.getRecordScriptId()==null) || 
             (this.recordScriptId!=null &&
              this.recordScriptId.equals(other.getRecordScriptId()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.showInList==null && other.getShowInList()==null) || 
             (this.showInList!=null &&
              this.showInList.equals(other.getShowInList()))) &&
            ((this.filteredByList==null && other.getFilteredByList()==null) || 
             (this.filteredByList!=null &&
              this.filteredByList.equals(other.getFilteredByList()))) &&
            ((this.hasGLImpact==null && other.getHasGLImpact()==null) || 
             (this.hasGLImpact!=null &&
              this.hasGLImpact.equals(other.getHasGLImpact()))) &&
            ((this.help==null && other.getHelp()==null) || 
             (this.help!=null &&
              this.help.equals(other.getHelp()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isMandatory==null && other.getIsMandatory()==null) || 
             (this.isMandatory!=null &&
              this.isMandatory.equals(other.getIsMandatory()))) &&
            ((this.defaultSelection==null && other.getDefaultSelection()==null) || 
             (this.defaultSelection!=null &&
              this.defaultSelection.equals(other.getDefaultSelection()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        if (getRecordScriptId() != null) {
            _hashCode += getRecordScriptId().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getShowInList() != null) {
            _hashCode += getShowInList().hashCode();
        }
        if (getFilteredByList() != null) {
            _hashCode += getFilteredByList().hashCode();
        }
        if (getHasGLImpact() != null) {
            _hashCode += getHasGLImpact().hashCode();
        }
        if (getHelp() != null) {
            _hashCode += getHelp().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsMandatory() != null) {
            _hashCode += getIsMandatory().hashCode();
        }
        if (getDefaultSelection() != null) {
            _hashCode += getDefaultSelection().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomSegment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordScriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordScriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2019_1.setup.webservices.netsuite.com", "CustomizationFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showInList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "showInList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filteredByList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "filteredByList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasGLImpact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "hasGLImpact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("help");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "help"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "isMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "defaultSelection"));
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
