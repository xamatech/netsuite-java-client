/**
 * CustomListSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class CustomListSearchRowBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isOrdered;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] scriptId;

    public CustomListSearchRowBasic() {
    }

    public CustomListSearchRowBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isOrdered,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] scriptId) {
        this.description = description;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.isOrdered = isOrdered;
        this.name = name;
        this.owner = owner;
        this.scriptId = scriptId;
    }


    /**
     * Gets the description value for this CustomListSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomListSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the internalId value for this CustomListSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomListSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isInactive value for this CustomListSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomListSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isOrdered value for this CustomListSearchRowBasic.
     * 
     * @return isOrdered
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] getIsOrdered() {
        return isOrdered;
    }


    /**
     * Sets the isOrdered value for this CustomListSearchRowBasic.
     * 
     * @param isOrdered
     */
    public void setIsOrdered(com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField[] isOrdered) {
        this.isOrdered = isOrdered;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField getIsOrdered(int i) {
        return this.isOrdered[i];
    }

    public void setIsOrdered(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnBooleanField _value) {
        this.isOrdered[i] = _value;
    }


    /**
     * Gets the name value for this CustomListSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomListSearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the owner value for this CustomListSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CustomListSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the scriptId value for this CustomListSearchRowBasic.
     * 
     * @return scriptId
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CustomListSearchRowBasic.
     * 
     * @param scriptId
     */
    public void setScriptId(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] scriptId) {
        this.scriptId = scriptId;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getScriptId(int i) {
        return this.scriptId[i];
    }

    public void setScriptId(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.scriptId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomListSearchRowBasic)) return false;
        CustomListSearchRowBasic other = (CustomListSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isOrdered==null && other.getIsOrdered()==null) || 
             (this.isOrdered!=null &&
              java.util.Arrays.equals(this.isOrdered, other.getIsOrdered()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              java.util.Arrays.equals(this.scriptId, other.getScriptId())));
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
        if (getIsOrdered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOrdered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOrdered(), i);
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
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScriptId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScriptId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScriptId(), i);
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
        new org.apache.axis.description.TypeDesc(CustomListSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "CustomListSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "isOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
