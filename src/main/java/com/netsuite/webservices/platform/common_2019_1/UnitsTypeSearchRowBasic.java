/**
 * UnitsTypeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class UnitsTypeSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] abbreviation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] baseUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] conversionRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInActive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pluralAbbreviation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pluralName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] unitName;

    public UnitsTypeSearchRowBasic() {
    }

    public UnitsTypeSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] abbreviation,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] baseUnit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] conversionRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInActive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pluralAbbreviation,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pluralName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] unitName) {
        this.abbreviation = abbreviation;
        this.baseUnit = baseUnit;
        this.conversionRate = conversionRate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInActive = isInActive;
        this.name = name;
        this.pluralAbbreviation = pluralAbbreviation;
        this.pluralName = pluralName;
        this.unitName = unitName;
    }


    /**
     * Gets the abbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @return abbreviation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] abbreviation) {
        this.abbreviation = abbreviation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAbbreviation(int i) {
        return this.abbreviation[i];
    }

    public void setAbbreviation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.abbreviation[i] = _value;
    }


    /**
     * Gets the baseUnit value for this UnitsTypeSearchRowBasic.
     * 
     * @return baseUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getBaseUnit() {
        return baseUnit;
    }


    /**
     * Sets the baseUnit value for this UnitsTypeSearchRowBasic.
     * 
     * @param baseUnit
     */
    public void setBaseUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] baseUnit) {
        this.baseUnit = baseUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getBaseUnit(int i) {
        return this.baseUnit[i];
    }

    public void setBaseUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.baseUnit[i] = _value;
    }


    /**
     * Gets the conversionRate value for this UnitsTypeSearchRowBasic.
     * 
     * @return conversionRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this UnitsTypeSearchRowBasic.
     * 
     * @param conversionRate
     */
    public void setConversionRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] conversionRate) {
        this.conversionRate = conversionRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getConversionRate(int i) {
        return this.conversionRate[i];
    }

    public void setConversionRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.conversionRate[i] = _value;
    }


    /**
     * Gets the externalId value for this UnitsTypeSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this UnitsTypeSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the internalId value for this UnitsTypeSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this UnitsTypeSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isInActive value for this UnitsTypeSearchRowBasic.
     * 
     * @return isInActive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInActive() {
        return isInActive;
    }


    /**
     * Sets the isInActive value for this UnitsTypeSearchRowBasic.
     * 
     * @param isInActive
     */
    public void setIsInActive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInActive) {
        this.isInActive = isInActive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInActive(int i) {
        return this.isInActive[i];
    }

    public void setIsInActive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInActive[i] = _value;
    }


    /**
     * Gets the name value for this UnitsTypeSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this UnitsTypeSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the pluralAbbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @return pluralAbbreviation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPluralAbbreviation() {
        return pluralAbbreviation;
    }


    /**
     * Sets the pluralAbbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @param pluralAbbreviation
     */
    public void setPluralAbbreviation(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPluralAbbreviation(int i) {
        return this.pluralAbbreviation[i];
    }

    public void setPluralAbbreviation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pluralAbbreviation[i] = _value;
    }


    /**
     * Gets the pluralName value for this UnitsTypeSearchRowBasic.
     * 
     * @return pluralName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPluralName() {
        return pluralName;
    }


    /**
     * Sets the pluralName value for this UnitsTypeSearchRowBasic.
     * 
     * @param pluralName
     */
    public void setPluralName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pluralName) {
        this.pluralName = pluralName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPluralName(int i) {
        return this.pluralName[i];
    }

    public void setPluralName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pluralName[i] = _value;
    }


    /**
     * Gets the unitName value for this UnitsTypeSearchRowBasic.
     * 
     * @return unitName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this UnitsTypeSearchRowBasic.
     * 
     * @param unitName
     */
    public void setUnitName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] unitName) {
        this.unitName = unitName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUnitName(int i) {
        return this.unitName[i];
    }

    public void setUnitName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.unitName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitsTypeSearchRowBasic)) return false;
        UnitsTypeSearchRowBasic other = (UnitsTypeSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              java.util.Arrays.equals(this.abbreviation, other.getAbbreviation()))) &&
            ((this.baseUnit==null && other.getBaseUnit()==null) || 
             (this.baseUnit!=null &&
              java.util.Arrays.equals(this.baseUnit, other.getBaseUnit()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              java.util.Arrays.equals(this.conversionRate, other.getConversionRate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInActive==null && other.getIsInActive()==null) || 
             (this.isInActive!=null &&
              java.util.Arrays.equals(this.isInActive, other.getIsInActive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.pluralAbbreviation==null && other.getPluralAbbreviation()==null) || 
             (this.pluralAbbreviation!=null &&
              java.util.Arrays.equals(this.pluralAbbreviation, other.getPluralAbbreviation()))) &&
            ((this.pluralName==null && other.getPluralName()==null) || 
             (this.pluralName!=null &&
              java.util.Arrays.equals(this.pluralName, other.getPluralName()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              java.util.Arrays.equals(this.unitName, other.getUnitName())));
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
        if (getAbbreviation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbbreviation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbbreviation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConversionRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInActive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInActive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInActive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPluralAbbreviation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPluralAbbreviation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPluralAbbreviation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPluralName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPluralName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPluralName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitsTypeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "UnitsTypeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
