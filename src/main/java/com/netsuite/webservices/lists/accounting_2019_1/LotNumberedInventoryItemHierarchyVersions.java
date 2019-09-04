/**
 * LotNumberedInventoryItemHierarchyVersions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class LotNumberedInventoryItemHierarchyVersions  implements java.io.Serializable {
    private java.lang.Boolean isIncluded;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyVersion;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyNode;

    public LotNumberedInventoryItemHierarchyVersions() {
    }

    public LotNumberedInventoryItemHierarchyVersions(
           java.lang.Boolean isIncluded,
           com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyVersion,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyNode) {
           this.isIncluded = isIncluded;
           this.hierarchyVersion = hierarchyVersion;
           this.startDate = startDate;
           this.endDate = endDate;
           this.hierarchyNode = hierarchyNode;
    }


    /**
     * Gets the isIncluded value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @return isIncluded
     */
    public java.lang.Boolean getIsIncluded() {
        return isIncluded;
    }


    /**
     * Sets the isIncluded value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @param isIncluded
     */
    public void setIsIncluded(java.lang.Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }


    /**
     * Gets the hierarchyVersion value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @return hierarchyVersion
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHierarchyVersion() {
        return hierarchyVersion;
    }


    /**
     * Sets the hierarchyVersion value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @param hierarchyVersion
     */
    public void setHierarchyVersion(com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }


    /**
     * Gets the startDate value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the hierarchyNode value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @return hierarchyNode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHierarchyNode() {
        return hierarchyNode;
    }


    /**
     * Sets the hierarchyNode value for this LotNumberedInventoryItemHierarchyVersions.
     * 
     * @param hierarchyNode
     */
    public void setHierarchyNode(com.netsuite.webservices.platform.core_2019_1.RecordRef hierarchyNode) {
        this.hierarchyNode = hierarchyNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LotNumberedInventoryItemHierarchyVersions)) return false;
        LotNumberedInventoryItemHierarchyVersions other = (LotNumberedInventoryItemHierarchyVersions) obj;
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
            ((this.hierarchyNode==null && other.getHierarchyNode()==null) || 
             (this.hierarchyNode!=null &&
              this.hierarchyNode.equals(other.getHierarchyNode())));
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
        if (getHierarchyNode() != null) {
            _hashCode += getHierarchyNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LotNumberedInventoryItemHierarchyVersions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "LotNumberedInventoryItemHierarchyVersions"));
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
        elemField.setFieldName("hierarchyNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "hierarchyNode"));
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
