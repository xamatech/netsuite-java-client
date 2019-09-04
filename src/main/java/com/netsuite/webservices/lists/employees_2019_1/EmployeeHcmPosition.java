/**
 * EmployeeHcmPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeHcmPosition  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef position;

    private java.lang.Boolean primaryPosition;

    private java.lang.String positionId;

    private java.lang.Double positionAllocation;

    private java.lang.Double fullTimeEquivalent;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef employmentCategory;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef reportsTo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    public EmployeeHcmPosition() {
    }

    public EmployeeHcmPosition(
           com.netsuite.webservices.platform.core_2019_1.RecordRef position,
           java.lang.Boolean primaryPosition,
           java.lang.String positionId,
           java.lang.Double positionAllocation,
           java.lang.Double fullTimeEquivalent,
           com.netsuite.webservices.platform.core_2019_1.RecordRef employmentCategory,
           com.netsuite.webservices.platform.core_2019_1.RecordRef reportsTo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
           this.position = position;
           this.primaryPosition = primaryPosition;
           this.positionId = positionId;
           this.positionAllocation = positionAllocation;
           this.fullTimeEquivalent = fullTimeEquivalent;
           this.employmentCategory = employmentCategory;
           this.reportsTo = reportsTo;
           this.subsidiary = subsidiary;
           this.location = location;
    }


    /**
     * Gets the position value for this EmployeeHcmPosition.
     * 
     * @return position
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPosition() {
        return position;
    }


    /**
     * Sets the position value for this EmployeeHcmPosition.
     * 
     * @param position
     */
    public void setPosition(com.netsuite.webservices.platform.core_2019_1.RecordRef position) {
        this.position = position;
    }


    /**
     * Gets the primaryPosition value for this EmployeeHcmPosition.
     * 
     * @return primaryPosition
     */
    public java.lang.Boolean getPrimaryPosition() {
        return primaryPosition;
    }


    /**
     * Sets the primaryPosition value for this EmployeeHcmPosition.
     * 
     * @param primaryPosition
     */
    public void setPrimaryPosition(java.lang.Boolean primaryPosition) {
        this.primaryPosition = primaryPosition;
    }


    /**
     * Gets the positionId value for this EmployeeHcmPosition.
     * 
     * @return positionId
     */
    public java.lang.String getPositionId() {
        return positionId;
    }


    /**
     * Sets the positionId value for this EmployeeHcmPosition.
     * 
     * @param positionId
     */
    public void setPositionId(java.lang.String positionId) {
        this.positionId = positionId;
    }


    /**
     * Gets the positionAllocation value for this EmployeeHcmPosition.
     * 
     * @return positionAllocation
     */
    public java.lang.Double getPositionAllocation() {
        return positionAllocation;
    }


    /**
     * Sets the positionAllocation value for this EmployeeHcmPosition.
     * 
     * @param positionAllocation
     */
    public void setPositionAllocation(java.lang.Double positionAllocation) {
        this.positionAllocation = positionAllocation;
    }


    /**
     * Gets the fullTimeEquivalent value for this EmployeeHcmPosition.
     * 
     * @return fullTimeEquivalent
     */
    public java.lang.Double getFullTimeEquivalent() {
        return fullTimeEquivalent;
    }


    /**
     * Sets the fullTimeEquivalent value for this EmployeeHcmPosition.
     * 
     * @param fullTimeEquivalent
     */
    public void setFullTimeEquivalent(java.lang.Double fullTimeEquivalent) {
        this.fullTimeEquivalent = fullTimeEquivalent;
    }


    /**
     * Gets the employmentCategory value for this EmployeeHcmPosition.
     * 
     * @return employmentCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEmploymentCategory() {
        return employmentCategory;
    }


    /**
     * Sets the employmentCategory value for this EmployeeHcmPosition.
     * 
     * @param employmentCategory
     */
    public void setEmploymentCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef employmentCategory) {
        this.employmentCategory = employmentCategory;
    }


    /**
     * Gets the reportsTo value for this EmployeeHcmPosition.
     * 
     * @return reportsTo
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReportsTo() {
        return reportsTo;
    }


    /**
     * Sets the reportsTo value for this EmployeeHcmPosition.
     * 
     * @param reportsTo
     */
    public void setReportsTo(com.netsuite.webservices.platform.core_2019_1.RecordRef reportsTo) {
        this.reportsTo = reportsTo;
    }


    /**
     * Gets the subsidiary value for this EmployeeHcmPosition.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EmployeeHcmPosition.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the location value for this EmployeeHcmPosition.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this EmployeeHcmPosition.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeHcmPosition)) return false;
        EmployeeHcmPosition other = (EmployeeHcmPosition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.primaryPosition==null && other.getPrimaryPosition()==null) || 
             (this.primaryPosition!=null &&
              this.primaryPosition.equals(other.getPrimaryPosition()))) &&
            ((this.positionId==null && other.getPositionId()==null) || 
             (this.positionId!=null &&
              this.positionId.equals(other.getPositionId()))) &&
            ((this.positionAllocation==null && other.getPositionAllocation()==null) || 
             (this.positionAllocation!=null &&
              this.positionAllocation.equals(other.getPositionAllocation()))) &&
            ((this.fullTimeEquivalent==null && other.getFullTimeEquivalent()==null) || 
             (this.fullTimeEquivalent!=null &&
              this.fullTimeEquivalent.equals(other.getFullTimeEquivalent()))) &&
            ((this.employmentCategory==null && other.getEmploymentCategory()==null) || 
             (this.employmentCategory!=null &&
              this.employmentCategory.equals(other.getEmploymentCategory()))) &&
            ((this.reportsTo==null && other.getReportsTo()==null) || 
             (this.reportsTo!=null &&
              this.reportsTo.equals(other.getReportsTo()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getPrimaryPosition() != null) {
            _hashCode += getPrimaryPosition().hashCode();
        }
        if (getPositionId() != null) {
            _hashCode += getPositionId().hashCode();
        }
        if (getPositionAllocation() != null) {
            _hashCode += getPositionAllocation().hashCode();
        }
        if (getFullTimeEquivalent() != null) {
            _hashCode += getFullTimeEquivalent().hashCode();
        }
        if (getEmploymentCategory() != null) {
            _hashCode += getEmploymentCategory().hashCode();
        }
        if (getReportsTo() != null) {
            _hashCode += getReportsTo().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeHcmPosition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeHcmPosition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "primaryPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "positionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "positionAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTimeEquivalent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "fullTimeEquivalent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employmentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "employmentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "reportsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "location"));
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
