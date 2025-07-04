/**
 * ItemDemandPlanSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2024_2;

public class ItemDemandPlanSearchRow  extends com.netsuite.webservices.platform.core_2024_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.ItemDemandPlanSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic lastAlternateSourceItemJoin;

    private com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin;

    private com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin;

    public ItemDemandPlanSearchRow() {
    }

    public ItemDemandPlanSearchRow(
           com.netsuite.webservices.platform.common_2024_2.ItemDemandPlanSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic lastAlternateSourceItemJoin,
           com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin,
           com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.itemJoin = itemJoin;
        this.lastAlternateSourceItemJoin = lastAlternateSourceItemJoin;
        this.locationJoin = locationJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ItemDemandPlanSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2024_2.ItemDemandPlanSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ItemDemandPlanSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2024_2.ItemDemandPlanSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the itemJoin value for this ItemDemandPlanSearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this ItemDemandPlanSearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the lastAlternateSourceItemJoin value for this ItemDemandPlanSearchRow.
     * 
     * @return lastAlternateSourceItemJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic getLastAlternateSourceItemJoin() {
        return lastAlternateSourceItemJoin;
    }


    /**
     * Sets the lastAlternateSourceItemJoin value for this ItemDemandPlanSearchRow.
     * 
     * @param lastAlternateSourceItemJoin
     */
    public void setLastAlternateSourceItemJoin(com.netsuite.webservices.platform.common_2024_2.ItemSearchRowBasic lastAlternateSourceItemJoin) {
        this.lastAlternateSourceItemJoin = lastAlternateSourceItemJoin;
    }


    /**
     * Gets the locationJoin value for this ItemDemandPlanSearchRow.
     * 
     * @return locationJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this ItemDemandPlanSearchRow.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(com.netsuite.webservices.platform.common_2024_2.LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the userJoin value for this ItemDemandPlanSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ItemDemandPlanSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the customSearchJoin value for this ItemDemandPlanSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ItemDemandPlanSearchRow.
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
        if (!(obj instanceof ItemDemandPlanSearchRow)) return false;
        ItemDemandPlanSearchRow other = (ItemDemandPlanSearchRow) obj;
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
            ((this.lastAlternateSourceItemJoin==null && other.getLastAlternateSourceItemJoin()==null) || 
             (this.lastAlternateSourceItemJoin!=null &&
              this.lastAlternateSourceItemJoin.equals(other.getLastAlternateSourceItemJoin()))) &&
            ((this.locationJoin==null && other.getLocationJoin()==null) || 
             (this.locationJoin!=null &&
              this.locationJoin.equals(other.getLocationJoin()))) &&
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
        if (getLastAlternateSourceItemJoin() != null) {
            _hashCode += getLastAlternateSourceItemJoin().hashCode();
        }
        if (getLocationJoin() != null) {
            _hashCode += getLocationJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(ItemDemandPlanSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "ItemDemandPlanSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ItemDemandPlanSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAlternateSourceItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "lastAlternateSourceItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2024_2.transactions.webservices.netsuite.com", "customSearchJoin"));
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
