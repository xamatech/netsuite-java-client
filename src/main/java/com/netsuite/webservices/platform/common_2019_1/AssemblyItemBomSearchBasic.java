/**
 * AssemblyItemBomSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AssemblyItemBomSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billOfMaterials;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField _default;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locations;

    public AssemblyItemBomSearchBasic() {
    }

    public AssemblyItemBomSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assembly,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billOfMaterials,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField _default,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locations) {
        this.assembly = assembly;
        this.billOfMaterials = billOfMaterials;
        this._default = _default;
        this.locations = locations;
    }


    /**
     * Gets the assembly value for this AssemblyItemBomSearchBasic.
     * 
     * @return assembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssembly() {
        return assembly;
    }


    /**
     * Sets the assembly value for this AssemblyItemBomSearchBasic.
     * 
     * @param assembly
     */
    public void setAssembly(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assembly) {
        this.assembly = assembly;
    }


    /**
     * Gets the billOfMaterials value for this AssemblyItemBomSearchBasic.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this AssemblyItemBomSearchBasic.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }


    /**
     * Gets the _default value for this AssemblyItemBomSearchBasic.
     * 
     * @return _default
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this AssemblyItemBomSearchBasic.
     * 
     * @param _default
     */
    public void set_default(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField _default) {
        this._default = _default;
    }


    /**
     * Gets the locations value for this AssemblyItemBomSearchBasic.
     * 
     * @return locations
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this AssemblyItemBomSearchBasic.
     * 
     * @param locations
     */
    public void setLocations(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locations) {
        this.locations = locations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyItemBomSearchBasic)) return false;
        AssemblyItemBomSearchBasic other = (AssemblyItemBomSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assembly==null && other.getAssembly()==null) || 
             (this.assembly!=null &&
              this.assembly.equals(other.getAssembly()))) &&
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              this.billOfMaterials.equals(other.getBillOfMaterials()))) &&
            ((this._default==null && other.get_default()==null) || 
             (this._default!=null &&
              this._default.equals(other.get_default()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              this.locations.equals(other.getLocations())));
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
        if (getAssembly() != null) {
            _hashCode += getAssembly().hashCode();
        }
        if (getBillOfMaterials() != null) {
            _hashCode += getBillOfMaterials().hashCode();
        }
        if (get_default() != null) {
            _hashCode += get_default().hashCode();
        }
        if (getLocations() != null) {
            _hashCode += getLocations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssemblyItemBomSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "default"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
