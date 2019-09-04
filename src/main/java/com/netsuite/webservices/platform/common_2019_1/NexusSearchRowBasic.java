/**
 * NexusSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class NexusSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parentNexus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxAgency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxDateFromFulfillment;

    public NexusSearchRowBasic() {
    }

    public NexusSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parentNexus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxAgency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxDateFromFulfillment) {
        this.country = country;
        this.description = description;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.parentNexus = parentNexus;
        this.state = state;
        this.taxAgency = taxAgency;
        this.taxDateFromFulfillment = taxDateFromFulfillment;
    }


    /**
     * Gets the country value for this NexusSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this NexusSearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the description value for this NexusSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NexusSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the externalId value for this NexusSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this NexusSearchRowBasic.
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
     * Gets the internalId value for this NexusSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this NexusSearchRowBasic.
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
     * Gets the isInactive value for this NexusSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this NexusSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the parentNexus value for this NexusSearchRowBasic.
     * 
     * @return parentNexus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getParentNexus() {
        return parentNexus;
    }


    /**
     * Sets the parentNexus value for this NexusSearchRowBasic.
     * 
     * @param parentNexus
     */
    public void setParentNexus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parentNexus) {
        this.parentNexus = parentNexus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getParentNexus(int i) {
        return this.parentNexus[i];
    }

    public void setParentNexus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.parentNexus[i] = _value;
    }


    /**
     * Gets the state value for this NexusSearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this NexusSearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the taxAgency value for this NexusSearchRowBasic.
     * 
     * @return taxAgency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxAgency() {
        return taxAgency;
    }


    /**
     * Sets the taxAgency value for this NexusSearchRowBasic.
     * 
     * @param taxAgency
     */
    public void setTaxAgency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxAgency) {
        this.taxAgency = taxAgency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxAgency(int i) {
        return this.taxAgency[i];
    }

    public void setTaxAgency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxAgency[i] = _value;
    }


    /**
     * Gets the taxDateFromFulfillment value for this NexusSearchRowBasic.
     * 
     * @return taxDateFromFulfillment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTaxDateFromFulfillment() {
        return taxDateFromFulfillment;
    }


    /**
     * Sets the taxDateFromFulfillment value for this NexusSearchRowBasic.
     * 
     * @param taxDateFromFulfillment
     */
    public void setTaxDateFromFulfillment(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxDateFromFulfillment) {
        this.taxDateFromFulfillment = taxDateFromFulfillment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTaxDateFromFulfillment(int i) {
        return this.taxDateFromFulfillment[i];
    }

    public void setTaxDateFromFulfillment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.taxDateFromFulfillment[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NexusSearchRowBasic)) return false;
        NexusSearchRowBasic other = (NexusSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.parentNexus==null && other.getParentNexus()==null) || 
             (this.parentNexus!=null &&
              java.util.Arrays.equals(this.parentNexus, other.getParentNexus()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.taxAgency==null && other.getTaxAgency()==null) || 
             (this.taxAgency!=null &&
              java.util.Arrays.equals(this.taxAgency, other.getTaxAgency()))) &&
            ((this.taxDateFromFulfillment==null && other.getTaxDateFromFulfillment()==null) || 
             (this.taxDateFromFulfillment!=null &&
              java.util.Arrays.equals(this.taxDateFromFulfillment, other.getTaxDateFromFulfillment())));
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
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentNexus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentNexus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentNexus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxAgency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxAgency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxAgency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxDateFromFulfillment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxDateFromFulfillment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxDateFromFulfillment(), i);
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
        new org.apache.axis.description.TypeDesc(NexusSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NexusSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parentNexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDateFromFulfillment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxDateFromFulfillment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
