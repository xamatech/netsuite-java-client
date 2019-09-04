/**
 * MerchandiseHierarchyNodeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class MerchandiseHierarchyNodeSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] hierarchyLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] hierarchyVersion;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parentNode;

    public MerchandiseHierarchyNodeSearchRowBasic() {
    }

    public MerchandiseHierarchyNodeSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] hierarchyLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] hierarchyVersion,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parentNode) {
        this.description = description;
        this.externalId = externalId;
        this.hierarchyLevel = hierarchyLevel;
        this.hierarchyVersion = hierarchyVersion;
        this.internalId = internalId;
        this.name = name;
        this.parentNode = parentNode;
    }


    /**
     * Gets the description value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MerchandiseHierarchyNodeSearchRowBasic.
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
     * Gets the externalId value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this MerchandiseHierarchyNodeSearchRowBasic.
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
     * Gets the hierarchyLevel value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return hierarchyLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getHierarchyLevel() {
        return hierarchyLevel;
    }


    /**
     * Sets the hierarchyLevel value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @param hierarchyLevel
     */
    public void setHierarchyLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getHierarchyLevel(int i) {
        return this.hierarchyLevel[i];
    }

    public void setHierarchyLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.hierarchyLevel[i] = _value;
    }


    /**
     * Gets the hierarchyVersion value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return hierarchyVersion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getHierarchyVersion() {
        return hierarchyVersion;
    }


    /**
     * Sets the hierarchyVersion value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @param hierarchyVersion
     */
    public void setHierarchyVersion(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getHierarchyVersion(int i) {
        return this.hierarchyVersion[i];
    }

    public void setHierarchyVersion(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.hierarchyVersion[i] = _value;
    }


    /**
     * Gets the internalId value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this MerchandiseHierarchyNodeSearchRowBasic.
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
     * Gets the name value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this MerchandiseHierarchyNodeSearchRowBasic.
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
     * Gets the parentNode value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @return parentNode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getParentNode() {
        return parentNode;
    }


    /**
     * Sets the parentNode value for this MerchandiseHierarchyNodeSearchRowBasic.
     * 
     * @param parentNode
     */
    public void setParentNode(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parentNode) {
        this.parentNode = parentNode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getParentNode(int i) {
        return this.parentNode[i];
    }

    public void setParentNode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.parentNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeSearchRowBasic)) return false;
        MerchandiseHierarchyNodeSearchRowBasic other = (MerchandiseHierarchyNodeSearchRowBasic) obj;
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
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.hierarchyLevel==null && other.getHierarchyLevel()==null) || 
             (this.hierarchyLevel!=null &&
              java.util.Arrays.equals(this.hierarchyLevel, other.getHierarchyLevel()))) &&
            ((this.hierarchyVersion==null && other.getHierarchyVersion()==null) || 
             (this.hierarchyVersion!=null &&
              java.util.Arrays.equals(this.hierarchyVersion, other.getHierarchyVersion()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.parentNode==null && other.getParentNode()==null) || 
             (this.parentNode!=null &&
              java.util.Arrays.equals(this.parentNode, other.getParentNode())));
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
        if (getHierarchyLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchyLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchyLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHierarchyVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHierarchyVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHierarchyVersion(), i);
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
        if (getParentNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentNode(), i);
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
        new org.apache.axis.description.TypeDesc(MerchandiseHierarchyNodeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("hierarchyLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hierarchyLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hierarchyVersion"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parentNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
