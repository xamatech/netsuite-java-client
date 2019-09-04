/**
 * MerchandiseHierarchyNodeHierarchyVersions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class MerchandiseHierarchyNodeHierarchyVersions  implements java.io.Serializable {
    private java.lang.Boolean isIncluded;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyVersion;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyLevel;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parentNode;

    public MerchandiseHierarchyNodeHierarchyVersions() {
    }

    public MerchandiseHierarchyNodeHierarchyVersions(
           java.lang.Boolean isIncluded,
           com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyVersion,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyLevel,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parentNode) {
           this.isIncluded = isIncluded;
           this.hierarchyVersion = hierarchyVersion;
           this.startDate = startDate;
           this.endDate = endDate;
           this.hierarchyLevel = hierarchyLevel;
           this.parentNode = parentNode;
    }


    /**
     * Gets the isIncluded value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @return isIncluded
     */
    public java.lang.Boolean getIsIncluded() {
        return isIncluded;
    }


    /**
     * Sets the isIncluded value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @param isIncluded
     */
    public void setIsIncluded(java.lang.Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }


    /**
     * Gets the hierarchyVersion value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @return hierarchyVersion
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHierarchyVersion() {
        return hierarchyVersion;
    }


    /**
     * Sets the hierarchyVersion value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @param hierarchyVersion
     */
    public void setHierarchyVersion(com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }


    /**
     * Gets the startDate value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the hierarchyLevel value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @return hierarchyLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHierarchyLevel() {
        return hierarchyLevel;
    }


    /**
     * Sets the hierarchyLevel value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @param hierarchyLevel
     */
    public void setHierarchyLevel(com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }


    /**
     * Gets the parentNode value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @return parentNode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParentNode() {
        return parentNode;
    }


    /**
     * Sets the parentNode value for this MerchandiseHierarchyNodeHierarchyVersions.
     * 
     * @param parentNode
     */
    public void setParentNode(com.netsuite.webservices.platform.core_2019_1.RecordRef parentNode) {
        this.parentNode = parentNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeHierarchyVersions)) return false;
        MerchandiseHierarchyNodeHierarchyVersions other = (MerchandiseHierarchyNodeHierarchyVersions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isIncluded==null && other.getIsIncluded()==null) || 
             (this.isIncluded!=null &&
              this.isIncluded.equals(other.getIsIncluded()))) &&
            ((this.hierarchyVersion==null && other.getHierarchyVersion()==null) || 
             (this.hierarchyVersion!=null &&
              this.hierarchyVersion.equals(other.getHierarchyVersion()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.hierarchyLevel==null && other.getHierarchyLevel()==null) || 
             (this.hierarchyLevel!=null &&
              this.hierarchyLevel.equals(other.getHierarchyLevel()))) &&
            ((this.parentNode==null && other.getParentNode()==null) || 
             (this.parentNode!=null &&
              this.parentNode.equals(other.getParentNode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIsIncluded() != null) {
            _hashCode += getIsIncluded().hashCode();
        }
        if (getHierarchyVersion() != null) {
            _hashCode += getHierarchyVersion().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getHierarchyLevel() != null) {
            _hashCode += getHierarchyLevel().hashCode();
        }
        if (getParentNode() != null) {
            _hashCode += getParentNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchandiseHierarchyNodeHierarchyVersions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeHierarchyVersions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hierarchyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hierarchyLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "parentNode"));
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
