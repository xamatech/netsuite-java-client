/**
 * SubsidiarySearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class SubsidiarySearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic addressJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic defaultAdvanceToApplyAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic returnAddressJoin;

    private com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic shippingAddressJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public SubsidiarySearchRow() {
    }

    public SubsidiarySearchRow(
           com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic addressJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic defaultAdvanceToApplyAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic returnAddressJoin,
           com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic shippingAddressJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.addressJoin = addressJoin;
        this.defaultAdvanceToApplyAccountJoin = defaultAdvanceToApplyAccountJoin;
        this.returnAddressJoin = returnAddressJoin;
        this.shippingAddressJoin = shippingAddressJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this SubsidiarySearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this SubsidiarySearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the addressJoin value for this SubsidiarySearchRow.
     * 
     * @return addressJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic getAddressJoin() {
        return addressJoin;
    }


    /**
     * Sets the addressJoin value for this SubsidiarySearchRow.
     * 
     * @param addressJoin
     */
    public void setAddressJoin(com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic addressJoin) {
        this.addressJoin = addressJoin;
    }


    /**
     * Gets the defaultAdvanceToApplyAccountJoin value for this SubsidiarySearchRow.
     * 
     * @return defaultAdvanceToApplyAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic getDefaultAdvanceToApplyAccountJoin() {
        return defaultAdvanceToApplyAccountJoin;
    }


    /**
     * Sets the defaultAdvanceToApplyAccountJoin value for this SubsidiarySearchRow.
     * 
     * @param defaultAdvanceToApplyAccountJoin
     */
    public void setDefaultAdvanceToApplyAccountJoin(com.netsuite.webservices.platform.common_2019_1.AccountSearchRowBasic defaultAdvanceToApplyAccountJoin) {
        this.defaultAdvanceToApplyAccountJoin = defaultAdvanceToApplyAccountJoin;
    }


    /**
     * Gets the returnAddressJoin value for this SubsidiarySearchRow.
     * 
     * @return returnAddressJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic getReturnAddressJoin() {
        return returnAddressJoin;
    }


    /**
     * Sets the returnAddressJoin value for this SubsidiarySearchRow.
     * 
     * @param returnAddressJoin
     */
    public void setReturnAddressJoin(com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic returnAddressJoin) {
        this.returnAddressJoin = returnAddressJoin;
    }


    /**
     * Gets the shippingAddressJoin value for this SubsidiarySearchRow.
     * 
     * @return shippingAddressJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }


    /**
     * Sets the shippingAddressJoin value for this SubsidiarySearchRow.
     * 
     * @param shippingAddressJoin
     */
    public void setShippingAddressJoin(com.netsuite.webservices.platform.common_2019_1.AddressSearchRowBasic shippingAddressJoin) {
        this.shippingAddressJoin = shippingAddressJoin;
    }


    /**
     * Gets the userJoin value for this SubsidiarySearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this SubsidiarySearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the customSearchJoin value for this SubsidiarySearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this SubsidiarySearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiarySearchRow)) return false;
        SubsidiarySearchRow other = (SubsidiarySearchRow) obj;
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
            ((this.addressJoin==null && other.getAddressJoin()==null) || 
             (this.addressJoin!=null &&
              this.addressJoin.equals(other.getAddressJoin()))) &&
            ((this.defaultAdvanceToApplyAccountJoin==null && other.getDefaultAdvanceToApplyAccountJoin()==null) || 
             (this.defaultAdvanceToApplyAccountJoin!=null &&
              this.defaultAdvanceToApplyAccountJoin.equals(other.getDefaultAdvanceToApplyAccountJoin()))) &&
            ((this.returnAddressJoin==null && other.getReturnAddressJoin()==null) || 
             (this.returnAddressJoin!=null &&
              this.returnAddressJoin.equals(other.getReturnAddressJoin()))) &&
            ((this.shippingAddressJoin==null && other.getShippingAddressJoin()==null) || 
             (this.shippingAddressJoin!=null &&
              this.shippingAddressJoin.equals(other.getShippingAddressJoin()))) &&
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
        if (getAddressJoin() != null) {
            _hashCode += getAddressJoin().hashCode();
        }
        if (getDefaultAdvanceToApplyAccountJoin() != null) {
            _hashCode += getDefaultAdvanceToApplyAccountJoin().hashCode();
        }
        if (getReturnAddressJoin() != null) {
            _hashCode += getReturnAddressJoin().hashCode();
        }
        if (getShippingAddressJoin() != null) {
            _hashCode += getShippingAddressJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubsidiarySearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "SubsidiarySearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "addressJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAdvanceToApplyAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "defaultAdvanceToApplyAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddressJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "returnAddressJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddressJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "shippingAddressJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
