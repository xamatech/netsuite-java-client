/**
 * LotNumberedAssemblyItemBillOfMaterials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class LotNumberedAssemblyItemBillOfMaterials  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterials;

    private java.lang.String currentRevision;

    private java.lang.Boolean masterDefault;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList defaultForLocationList;

    private java.lang.String inactive;

    private java.lang.String memo;

    public LotNumberedAssemblyItemBillOfMaterials() {
    }

    public LotNumberedAssemblyItemBillOfMaterials(
           com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterials,
           java.lang.String currentRevision,
           java.lang.Boolean masterDefault,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList defaultForLocationList,
           java.lang.String inactive,
           java.lang.String memo) {
           this.billOfMaterials = billOfMaterials;
           this.currentRevision = currentRevision;
           this.masterDefault = masterDefault;
           this.defaultForLocationList = defaultForLocationList;
           this.inactive = inactive;
           this.memo = memo;
    }


    /**
     * Gets the billOfMaterials value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @return billOfMaterials
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillOfMaterials() {
        return billOfMaterials;
    }


    /**
     * Sets the billOfMaterials value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @param billOfMaterials
     */
    public void setBillOfMaterials(com.netsuite.webservices.platform.core_2019_1.RecordRef billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }


    /**
     * Gets the currentRevision value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @return currentRevision
     */
    public java.lang.String getCurrentRevision() {
        return currentRevision;
    }


    /**
     * Sets the currentRevision value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @param currentRevision
     */
    public void setCurrentRevision(java.lang.String currentRevision) {
        this.currentRevision = currentRevision;
    }


    /**
     * Gets the masterDefault value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @return masterDefault
     */
    public java.lang.Boolean getMasterDefault() {
        return masterDefault;
    }


    /**
     * Sets the masterDefault value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @param masterDefault
     */
    public void setMasterDefault(java.lang.Boolean masterDefault) {
        this.masterDefault = masterDefault;
    }


    /**
     * Gets the defaultForLocationList value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @return defaultForLocationList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getDefaultForLocationList() {
        return defaultForLocationList;
    }


    /**
     * Sets the defaultForLocationList value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @param defaultForLocationList
     */
    public void setDefaultForLocationList(com.netsuite.webservices.platform.core_2019_1.RecordRefList defaultForLocationList) {
        this.defaultForLocationList = defaultForLocationList;
    }


    /**
     * Gets the inactive value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @return inactive
     */
    public java.lang.String getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.String inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the memo value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this LotNumberedAssemblyItemBillOfMaterials.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LotNumberedAssemblyItemBillOfMaterials)) return false;
        LotNumberedAssemblyItemBillOfMaterials other = (LotNumberedAssemblyItemBillOfMaterials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billOfMaterials==null && other.getBillOfMaterials()==null) || 
             (this.billOfMaterials!=null &&
              this.billOfMaterials.equals(other.getBillOfMaterials()))) &&
            ((this.currentRevision==null && other.getCurrentRevision()==null) || 
             (this.currentRevision!=null &&
              this.currentRevision.equals(other.getCurrentRevision()))) &&
            ((this.masterDefault==null && other.getMasterDefault()==null) || 
             (this.masterDefault!=null &&
              this.masterDefault.equals(other.getMasterDefault()))) &&
            ((this.defaultForLocationList==null && other.getDefaultForLocationList()==null) || 
             (this.defaultForLocationList!=null &&
              this.defaultForLocationList.equals(other.getDefaultForLocationList()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo())));
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
        if (getBillOfMaterials() != null) {
            _hashCode += getBillOfMaterials().hashCode();
        }
        if (getCurrentRevision() != null) {
            _hashCode += getCurrentRevision().hashCode();
        }
        if (getMasterDefault() != null) {
            _hashCode += getMasterDefault().hashCode();
        }
        if (getDefaultForLocationList() != null) {
            _hashCode += getDefaultForLocationList().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LotNumberedAssemblyItemBillOfMaterials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "LotNumberedAssemblyItemBillOfMaterials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "currentRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "masterDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultForLocationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "defaultForLocationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
