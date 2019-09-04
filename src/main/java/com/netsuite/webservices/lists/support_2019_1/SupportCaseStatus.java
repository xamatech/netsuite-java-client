/**
 * SupportCaseStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class SupportCaseStatus  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String name;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore;

    private com.netsuite.webservices.lists.support_2019_1.types.SupportCaseStatusStage stage;

    private java.lang.Boolean caseOnHold;

    private java.lang.Boolean autoCloseCase;

    private java.lang.String description;

    private java.lang.Boolean isInactive;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public SupportCaseStatus() {
    }

    public SupportCaseStatus(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore,
           com.netsuite.webservices.lists.support_2019_1.types.SupportCaseStatusStage stage,
           java.lang.Boolean caseOnHold,
           java.lang.Boolean autoCloseCase,
           java.lang.String description,
           java.lang.Boolean isInactive) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.insertBefore = insertBefore;
        this.stage = stage;
        this.caseOnHold = caseOnHold;
        this.autoCloseCase = autoCloseCase;
        this.description = description;
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this SupportCaseStatus.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SupportCaseStatus.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the insertBefore value for this SupportCaseStatus.
     * 
     * @return insertBefore
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getInsertBefore() {
        return insertBefore;
    }


    /**
     * Sets the insertBefore value for this SupportCaseStatus.
     * 
     * @param insertBefore
     */
    public void setInsertBefore(com.netsuite.webservices.platform.core_2019_1.RecordRef insertBefore) {
        this.insertBefore = insertBefore;
    }


    /**
     * Gets the stage value for this SupportCaseStatus.
     * 
     * @return stage
     */
    public com.netsuite.webservices.lists.support_2019_1.types.SupportCaseStatusStage getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this SupportCaseStatus.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.lists.support_2019_1.types.SupportCaseStatusStage stage) {
        this.stage = stage;
    }


    /**
     * Gets the caseOnHold value for this SupportCaseStatus.
     * 
     * @return caseOnHold
     */
    public java.lang.Boolean getCaseOnHold() {
        return caseOnHold;
    }


    /**
     * Sets the caseOnHold value for this SupportCaseStatus.
     * 
     * @param caseOnHold
     */
    public void setCaseOnHold(java.lang.Boolean caseOnHold) {
        this.caseOnHold = caseOnHold;
    }


    /**
     * Gets the autoCloseCase value for this SupportCaseStatus.
     * 
     * @return autoCloseCase
     */
    public java.lang.Boolean getAutoCloseCase() {
        return autoCloseCase;
    }


    /**
     * Sets the autoCloseCase value for this SupportCaseStatus.
     * 
     * @param autoCloseCase
     */
    public void setAutoCloseCase(java.lang.Boolean autoCloseCase) {
        this.autoCloseCase = autoCloseCase;
    }


    /**
     * Gets the description value for this SupportCaseStatus.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SupportCaseStatus.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isInactive value for this SupportCaseStatus.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SupportCaseStatus.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the internalId value for this SupportCaseStatus.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SupportCaseStatus.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this SupportCaseStatus.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SupportCaseStatus.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseStatus)) return false;
        SupportCaseStatus other = (SupportCaseStatus) obj;
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
            ((this.insertBefore==null && other.getInsertBefore()==null) || 
             (this.insertBefore!=null &&
              this.insertBefore.equals(other.getInsertBefore()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.caseOnHold==null && other.getCaseOnHold()==null) || 
             (this.caseOnHold!=null &&
              this.caseOnHold.equals(other.getCaseOnHold()))) &&
            ((this.autoCloseCase==null && other.getAutoCloseCase()==null) || 
             (this.autoCloseCase!=null &&
              this.autoCloseCase.equals(other.getAutoCloseCase()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
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
        if (getInsertBefore() != null) {
            _hashCode += getInsertBefore().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getCaseOnHold() != null) {
            _hashCode += getCaseOnHold().hashCode();
        }
        if (getAutoCloseCase() != null) {
            _hashCode += getAutoCloseCase().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
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
        new org.apache.axis.description.TypeDesc(SupportCaseStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "SupportCaseStatus"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "insertBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.support_2019_1.lists.webservices.netsuite.com", "SupportCaseStatusStage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseOnHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "caseOnHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCloseCase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "autoCloseCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
