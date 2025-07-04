/**
 * GlobalAccountMappingSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2024_2;

public class GlobalAccountMappingSearchRow  extends com.netsuite.webservices.platform.core_2024_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.GlobalAccountMappingSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2024_2.ClassificationSearchRowBasic classJoin;

    private com.netsuite.webservices.platform.common_2024_2.DepartmentSearchRowBasic departmentJoin;

    private com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic destinationAccountJoin;

    private com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin;

    private com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic sourceAccountJoin;

    private com.netsuite.webservices.platform.common_2024_2.SubsidiarySearchRowBasic subsidiaryJoin;

    private com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin;

    public GlobalAccountMappingSearchRow() {
    }

    public GlobalAccountMappingSearchRow(
           com.netsuite.webservices.platform.common_2024_2.GlobalAccountMappingSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2024_2.ClassificationSearchRowBasic classJoin,
           com.netsuite.webservices.platform.common_2024_2.DepartmentSearchRowBasic departmentJoin,
           com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic destinationAccountJoin,
           com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin,
           com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic sourceAccountJoin,
           com.netsuite.webservices.platform.common_2024_2.SubsidiarySearchRowBasic subsidiaryJoin,
           com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.classJoin = classJoin;
        this.departmentJoin = departmentJoin;
        this.destinationAccountJoin = destinationAccountJoin;
        this.locationJoin = locationJoin;
        this.sourceAccountJoin = sourceAccountJoin;
        this.subsidiaryJoin = subsidiaryJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this GlobalAccountMappingSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2024_2.GlobalAccountMappingSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this GlobalAccountMappingSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2024_2.GlobalAccountMappingSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the classJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return classJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }


    /**
     * Sets the classJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param classJoin
     */
    public void setClassJoin(com.netsuite.webservices.platform.common_2024_2.ClassificationSearchRowBasic classJoin) {
        this.classJoin = classJoin;
    }


    /**
     * Gets the departmentJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return departmentJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }


    /**
     * Sets the departmentJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param departmentJoin
     */
    public void setDepartmentJoin(com.netsuite.webservices.platform.common_2024_2.DepartmentSearchRowBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }


    /**
     * Gets the destinationAccountJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return destinationAccountJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic getDestinationAccountJoin() {
        return destinationAccountJoin;
    }


    /**
     * Sets the destinationAccountJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param destinationAccountJoin
     */
    public void setDestinationAccountJoin(com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic destinationAccountJoin) {
        this.destinationAccountJoin = destinationAccountJoin;
    }


    /**
     * Gets the locationJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return locationJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the sourceAccountJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return sourceAccountJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic getSourceAccountJoin() {
        return sourceAccountJoin;
    }


    /**
     * Sets the sourceAccountJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param sourceAccountJoin
     */
    public void setSourceAccountJoin(com.netsuite.webservices.platform.common_2024_2.AccountSearchRowBasic sourceAccountJoin) {
        this.sourceAccountJoin = sourceAccountJoin;
    }


    /**
     * Gets the subsidiaryJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return subsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }


    /**
     * Sets the subsidiaryJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param subsidiaryJoin
     */
    public void setSubsidiaryJoin(com.netsuite.webservices.platform.common_2024_2.SubsidiarySearchRowBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
    }


    /**
     * Gets the customSearchJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this GlobalAccountMappingSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalAccountMappingSearchRow)) return false;
        GlobalAccountMappingSearchRow other = (GlobalAccountMappingSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.classJoin==null && other.getClassJoin()==null) || 
             (this.classJoin!=null &&
              this.classJoin.equals(other.getClassJoin()))) &&
            ((this.departmentJoin==null && other.getDepartmentJoin()==null) || 
             (this.departmentJoin!=null &&
              this.departmentJoin.equals(other.getDepartmentJoin()))) &&
            ((this.destinationAccountJoin==null && other.getDestinationAccountJoin()==null) || 
             (this.destinationAccountJoin!=null &&
              this.destinationAccountJoin.equals(other.getDestinationAccountJoin()))) &&
            ((this.locationJoin==null && other.getLocationJoin()==null) || 
             (this.locationJoin!=null &&
              this.locationJoin.equals(other.getLocationJoin()))) &&
            ((this.sourceAccountJoin==null && other.getSourceAccountJoin()==null) || 
             (this.sourceAccountJoin!=null &&
              this.sourceAccountJoin.equals(other.getSourceAccountJoin()))) &&
            ((this.subsidiaryJoin==null && other.getSubsidiaryJoin()==null) || 
             (this.subsidiaryJoin!=null &&
              this.subsidiaryJoin.equals(other.getSubsidiaryJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getClassJoin() != null) {
            _hashCode += getClassJoin().hashCode();
        }
        if (getDepartmentJoin() != null) {
            _hashCode += getDepartmentJoin().hashCode();
        }
        if (getDestinationAccountJoin() != null) {
            _hashCode += getDestinationAccountJoin().hashCode();
        }
        if (getLocationJoin() != null) {
            _hashCode += getLocationJoin().hashCode();
        }
        if (getSourceAccountJoin() != null) {
            _hashCode += getSourceAccountJoin().hashCode();
        }
        if (getSubsidiaryJoin() != null) {
            _hashCode += getSubsidiaryJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
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
        new org.apache.axis.description.TypeDesc(GlobalAccountMappingSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "GlobalAccountMappingSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "GlobalAccountMappingSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ClassificationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "DepartmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "destinationAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "sourceAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2024_2.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
