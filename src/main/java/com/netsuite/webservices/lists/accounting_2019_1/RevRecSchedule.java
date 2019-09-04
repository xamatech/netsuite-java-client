/**
 * RevRecSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class RevRecSchedule  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String name;

    private com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleAmortizationType amortizationType;

    private com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecurrenceType recurrenceType;

    private com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecogIntervalSrc recogIntervalSrc;

    private java.lang.Long amortizationPeriod;

    private java.lang.Long periodOffset;

    private java.lang.Long revRecOffset;

    private java.lang.Double initialAmount;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrenceList recurrenceList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public RevRecSchedule() {
    }

    public RevRecSchedule(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleAmortizationType amortizationType,
           com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecurrenceType recurrenceType,
           com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecogIntervalSrc recogIntervalSrc,
           java.lang.Long amortizationPeriod,
           java.lang.Long periodOffset,
           java.lang.Long revRecOffset,
           java.lang.Double initialAmount,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrenceList recurrenceList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.amortizationType = amortizationType;
        this.recurrenceType = recurrenceType;
        this.recogIntervalSrc = recogIntervalSrc;
        this.amortizationPeriod = amortizationPeriod;
        this.periodOffset = periodOffset;
        this.revRecOffset = revRecOffset;
        this.initialAmount = initialAmount;
        this.isInactive = isInactive;
        this.recurrenceList = recurrenceList;
    }


    /**
     * Gets the name value for this RevRecSchedule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RevRecSchedule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the amortizationType value for this RevRecSchedule.
     * 
     * @return amortizationType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleAmortizationType getAmortizationType() {
        return amortizationType;
    }


    /**
     * Sets the amortizationType value for this RevRecSchedule.
     * 
     * @param amortizationType
     */
    public void setAmortizationType(com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleAmortizationType amortizationType) {
        this.amortizationType = amortizationType;
    }


    /**
     * Gets the recurrenceType value for this RevRecSchedule.
     * 
     * @return recurrenceType
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecurrenceType getRecurrenceType() {
        return recurrenceType;
    }


    /**
     * Sets the recurrenceType value for this RevRecSchedule.
     * 
     * @param recurrenceType
     */
    public void setRecurrenceType(com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecurrenceType recurrenceType) {
        this.recurrenceType = recurrenceType;
    }


    /**
     * Gets the recogIntervalSrc value for this RevRecSchedule.
     * 
     * @return recogIntervalSrc
     */
    public com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecogIntervalSrc getRecogIntervalSrc() {
        return recogIntervalSrc;
    }


    /**
     * Sets the recogIntervalSrc value for this RevRecSchedule.
     * 
     * @param recogIntervalSrc
     */
    public void setRecogIntervalSrc(com.netsuite.webservices.lists.accounting_2019_1.types.RevRecScheduleRecogIntervalSrc recogIntervalSrc) {
        this.recogIntervalSrc = recogIntervalSrc;
    }


    /**
     * Gets the amortizationPeriod value for this RevRecSchedule.
     * 
     * @return amortizationPeriod
     */
    public java.lang.Long getAmortizationPeriod() {
        return amortizationPeriod;
    }


    /**
     * Sets the amortizationPeriod value for this RevRecSchedule.
     * 
     * @param amortizationPeriod
     */
    public void setAmortizationPeriod(java.lang.Long amortizationPeriod) {
        this.amortizationPeriod = amortizationPeriod;
    }


    /**
     * Gets the periodOffset value for this RevRecSchedule.
     * 
     * @return periodOffset
     */
    public java.lang.Long getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecSchedule.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(java.lang.Long periodOffset) {
        this.periodOffset = periodOffset;
    }


    /**
     * Gets the revRecOffset value for this RevRecSchedule.
     * 
     * @return revRecOffset
     */
    public java.lang.Long getRevRecOffset() {
        return revRecOffset;
    }


    /**
     * Sets the revRecOffset value for this RevRecSchedule.
     * 
     * @param revRecOffset
     */
    public void setRevRecOffset(java.lang.Long revRecOffset) {
        this.revRecOffset = revRecOffset;
    }


    /**
     * Gets the initialAmount value for this RevRecSchedule.
     * 
     * @return initialAmount
     */
    public java.lang.Double getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this RevRecSchedule.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(java.lang.Double initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the isInactive value for this RevRecSchedule.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this RevRecSchedule.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the recurrenceList value for this RevRecSchedule.
     * 
     * @return recurrenceList
     */
    public com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrenceList getRecurrenceList() {
        return recurrenceList;
    }


    /**
     * Sets the recurrenceList value for this RevRecSchedule.
     * 
     * @param recurrenceList
     */
    public void setRecurrenceList(com.netsuite.webservices.lists.accounting_2019_1.RevRecScheduleRecurrenceList recurrenceList) {
        this.recurrenceList = recurrenceList;
    }


    /**
     * Gets the internalId value for this RevRecSchedule.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RevRecSchedule.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this RevRecSchedule.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this RevRecSchedule.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecSchedule)) return false;
        RevRecSchedule other = (RevRecSchedule) obj;
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
            ((this.amortizationType==null && other.getAmortizationType()==null) || 
             (this.amortizationType!=null &&
              this.amortizationType.equals(other.getAmortizationType()))) &&
            ((this.recurrenceType==null && other.getRecurrenceType()==null) || 
             (this.recurrenceType!=null &&
              this.recurrenceType.equals(other.getRecurrenceType()))) &&
            ((this.recogIntervalSrc==null && other.getRecogIntervalSrc()==null) || 
             (this.recogIntervalSrc!=null &&
              this.recogIntervalSrc.equals(other.getRecogIntervalSrc()))) &&
            ((this.amortizationPeriod==null && other.getAmortizationPeriod()==null) || 
             (this.amortizationPeriod!=null &&
              this.amortizationPeriod.equals(other.getAmortizationPeriod()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              this.periodOffset.equals(other.getPeriodOffset()))) &&
            ((this.revRecOffset==null && other.getRevRecOffset()==null) || 
             (this.revRecOffset!=null &&
              this.revRecOffset.equals(other.getRevRecOffset()))) &&
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              this.initialAmount.equals(other.getInitialAmount()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.recurrenceList==null && other.getRecurrenceList()==null) || 
             (this.recurrenceList!=null &&
              this.recurrenceList.equals(other.getRecurrenceList()))) &&
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
        if (getAmortizationType() != null) {
            _hashCode += getAmortizationType().hashCode();
        }
        if (getRecurrenceType() != null) {
            _hashCode += getRecurrenceType().hashCode();
        }
        if (getRecogIntervalSrc() != null) {
            _hashCode += getRecogIntervalSrc().hashCode();
        }
        if (getAmortizationPeriod() != null) {
            _hashCode += getAmortizationPeriod().hashCode();
        }
        if (getPeriodOffset() != null) {
            _hashCode += getPeriodOffset().hashCode();
        }
        if (getRevRecOffset() != null) {
            _hashCode += getRevRecOffset().hashCode();
        }
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getRecurrenceList() != null) {
            _hashCode += getRecurrenceList().hashCode();
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
        new org.apache.axis.description.TypeDesc(RevRecSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "RevRecSchedule"));
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
        elemField.setFieldName("amortizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "amortizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleAmortizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recogIntervalSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recogIntervalSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecogIntervalSrc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizationPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "amortizationPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "revRecOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("recurrenceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "recurrenceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceList"));
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
