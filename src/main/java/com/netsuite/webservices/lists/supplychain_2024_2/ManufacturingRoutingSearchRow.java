/**
 * ManufacturingRoutingSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.supplychain_2024_2;

public class ManufacturingRoutingSearchRow  extends com.netsuite.webservices.platform.core_2024_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.ManufacturingRoutingSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin;

    private com.netsuite.webservices.platform.common_2024_2.ManufacturingCostTemplateSearchRowBasic manufacturingCostTemplateJoin;

    private com.netsuite.webservices.platform.common_2024_2.EntityGroupSearchRowBasic manufacturingWorkCenterJoin;

    private com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin;

    public ManufacturingRoutingSearchRow() {
    }

    public ManufacturingRoutingSearchRow(
           com.netsuite.webservices.platform.common_2024_2.ManufacturingRoutingSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin,
           com.netsuite.webservices.platform.common_2024_2.ManufacturingCostTemplateSearchRowBasic manufacturingCostTemplateJoin,
           com.netsuite.webservices.platform.common_2024_2.EntityGroupSearchRowBasic manufacturingWorkCenterJoin,
           com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.itemJoin = itemJoin;
        this.locationJoin = locationJoin;
        this.manufacturingCostTemplateJoin = manufacturingCostTemplateJoin;
        this.manufacturingWorkCenterJoin = manufacturingWorkCenterJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ManufacturingRoutingSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2024_2.ManufacturingRoutingSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ManufacturingRoutingSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2024_2.ManufacturingRoutingSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the itemJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the locationJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @return locationJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the manufacturingCostTemplateJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @return manufacturingCostTemplateJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.ManufacturingCostTemplateSearchRowBasic getManufacturingCostTemplateJoin() {
        return manufacturingCostTemplateJoin;
    }


    /**
     * Sets the manufacturingCostTemplateJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @param manufacturingCostTemplateJoin
     */
    public void setManufacturingCostTemplateJoin(com.netsuite.webservices.platform.common_2024_2.ManufacturingCostTemplateSearchRowBasic manufacturingCostTemplateJoin) {
        this.manufacturingCostTemplateJoin = manufacturingCostTemplateJoin;
    }


    /**
     * Gets the manufacturingWorkCenterJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @return manufacturingWorkCenterJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EntityGroupSearchRowBasic getManufacturingWorkCenterJoin() {
        return manufacturingWorkCenterJoin;
    }


    /**
     * Sets the manufacturingWorkCenterJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @param manufacturingWorkCenterJoin
     */
    public void setManufacturingWorkCenterJoin(com.netsuite.webservices.platform.common_2024_2.EntityGroupSearchRowBasic manufacturingWorkCenterJoin) {
        this.manufacturingWorkCenterJoin = manufacturingWorkCenterJoin;
    }


    /**
     * Gets the userJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the customSearchJoin value for this ManufacturingRoutingSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ManufacturingRoutingSearchRow.
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
        if (!(obj instanceof ManufacturingRoutingSearchRow)) return false;
        ManufacturingRoutingSearchRow other = (ManufacturingRoutingSearchRow) obj;
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
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.locationJoin==null && other.getLocationJoin()==null) || 
             (this.locationJoin!=null &&
              this.locationJoin.equals(other.getLocationJoin()))) &&
            ((this.manufacturingCostTemplateJoin==null && other.getManufacturingCostTemplateJoin()==null) || 
             (this.manufacturingCostTemplateJoin!=null &&
              this.manufacturingCostTemplateJoin.equals(other.getManufacturingCostTemplateJoin()))) &&
            ((this.manufacturingWorkCenterJoin==null && other.getManufacturingWorkCenterJoin()==null) || 
             (this.manufacturingWorkCenterJoin!=null &&
              this.manufacturingWorkCenterJoin.equals(other.getManufacturingWorkCenterJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
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
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getLocationJoin() != null) {
            _hashCode += getLocationJoin().hashCode();
        }
        if (getManufacturingCostTemplateJoin() != null) {
            _hashCode += getManufacturingCostTemplateJoin().hashCode();
        }
        if (getManufacturingWorkCenterJoin() != null) {
            _hashCode += getManufacturingWorkCenterJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "ManufacturingRoutingSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ManufacturingRoutingSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingCostTemplateJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "manufacturingCostTemplateJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ManufacturingCostTemplateSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenterJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "manufacturingWorkCenterJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EntityGroupSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:supplychain_2024_2.lists.webservices.netsuite.com", "customSearchJoin"));
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
