/**
 * InventoryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InventoryDetail  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.InventoryAssignmentList inventoryAssignmentList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    public InventoryDetail() {
    }

    public InventoryDetail(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           com.netsuite.webservices.platform.common_2019_1.InventoryAssignmentList inventoryAssignmentList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        super(
            nullFieldList);
        this.inventoryAssignmentList = inventoryAssignmentList;
        this.customForm = customForm;
    }


    /**
     * Gets the inventoryAssignmentList value for this InventoryDetail.
     * 
     * @return inventoryAssignmentList
     */
    public com.netsuite.webservices.platform.common_2019_1.InventoryAssignmentList getInventoryAssignmentList() {
        return inventoryAssignmentList;
    }


    /**
     * Sets the inventoryAssignmentList value for this InventoryDetail.
     * 
     * @param inventoryAssignmentList
     */
    public void setInventoryAssignmentList(com.netsuite.webservices.platform.common_2019_1.InventoryAssignmentList inventoryAssignmentList) {
        this.inventoryAssignmentList = inventoryAssignmentList;
    }


    /**
     * Gets the customForm value for this InventoryDetail.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this InventoryDetail.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryDetail)) return false;
        InventoryDetail other = (InventoryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inventoryAssignmentList==null && other.getInventoryAssignmentList()==null) || 
             (this.inventoryAssignmentList!=null &&
              this.inventoryAssignmentList.equals(other.getInventoryAssignmentList()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm())));
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
        if (getInventoryAssignmentList() != null) {
            _hashCode += getInventoryAssignmentList().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryAssignmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryAssignmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryAssignmentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customForm"));
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
