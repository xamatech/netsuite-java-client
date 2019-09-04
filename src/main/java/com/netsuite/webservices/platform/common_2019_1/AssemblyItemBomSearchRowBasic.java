/**
 * AssemblyItemBomSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AssemblyItemBomSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billOfMaterials;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] _default;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] locations;

    public AssemblyItemBomSearchRowBasic() {
    }

    public AssemblyItemBomSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assembly,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billOfMaterials,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] _default,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] locations) {
        this.assembly = assembly;
        this.billOfMaterials = billOfMaterials;
        this._default = _default;
        this.locations = locations;
    }


    /**
     * Gets the assembly value for this AssemblyItemBomSearchRowBasic.
     * 
     * @return assembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAssembly() {
        return assembly;
    }


    /**
     * Sets the assembly value for this AssemblyItemBomSearchRowBasic.
     * 
     * @param assembly
     */
    public void setAssembly(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assembly) {
        this.assembly = assembly;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAssembly(int i) {
        return this.assembly[i];
    }

    public void setAssembly(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.assembly[i] = _value;
    }


    /**
     * Gets the billOfMaterials value for this AssemblyItemBomSearchRowBasic.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this AssemblyItemBomSearchRowBasic.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillOfMaterials(int i) {
        return this.billOfMaterials[i];
    }

    public void setBillOfMaterials(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billOfMaterials[i] = _value;
    }


    /**
     * Gets the _default value for this AssemblyItemBomSearchRowBasic.
     * 
     * @return _default
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this AssemblyItemBomSearchRowBasic.
     * 
     * @param _default
     */
    public void set_default(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] _default) {
        this._default = _default;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField get_default(int i) {
        return this._default[i];
    }

    public void set_default(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this._default[i] = _value;
    }


    /**
     * Gets the locations value for this AssemblyItemBomSearchRowBasic.
     * 
     * @return locations
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this AssemblyItemBomSearchRowBasic.
     * 
     * @param locations
     */
    public void setLocations(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] locations) {
        this.locations = locations;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.locations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssemblyItemBomSearchRowBasic)) return false;
        AssemblyItemBomSearchRowBasic other = (AssemblyItemBomSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.assembly, other.getAssembly()))) &&
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              java.util.Arrays.equals(this.billOfMaterials, other.getBillOfMaterials()))) &&
            ((this._default==null && other.get_default()==null) || 
             (this._default!=null &&
              java.util.Arrays.equals(this._default, other.get_default()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssembly(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillOfMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillOfMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillOfMaterials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_default() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_default());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_default(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
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
        new org.apache.axis.description.TypeDesc(AssemblyItemBomSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "default"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locations"));
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
