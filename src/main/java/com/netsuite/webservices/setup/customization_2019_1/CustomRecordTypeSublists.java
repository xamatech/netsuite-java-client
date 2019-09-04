/**
 * CustomRecordTypeSublists.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2019_1;

public class CustomRecordTypeSublists  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef recordSearch;

    private java.lang.String recordDescr;

    private com.netsuite.webservices.setup.customization_2019_1.LanguageValueList recordDescrLanguageValueList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef recordTab;

    private java.lang.String recordId;

    public CustomRecordTypeSublists() {
    }

    public CustomRecordTypeSublists(
           com.netsuite.webservices.platform.core_2019_1.RecordRef recordSearch,
           java.lang.String recordDescr,
           com.netsuite.webservices.setup.customization_2019_1.LanguageValueList recordDescrLanguageValueList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef recordTab,
           java.lang.String recordId) {
           this.recordSearch = recordSearch;
           this.recordDescr = recordDescr;
           this.recordDescrLanguageValueList = recordDescrLanguageValueList;
           this.recordTab = recordTab;
           this.recordId = recordId;
    }


    /**
     * Gets the recordSearch value for this CustomRecordTypeSublists.
     * 
     * @return recordSearch
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecordSearch() {
        return recordSearch;
    }


    /**
     * Sets the recordSearch value for this CustomRecordTypeSublists.
     * 
     * @param recordSearch
     */
    public void setRecordSearch(com.netsuite.webservices.platform.core_2019_1.RecordRef recordSearch) {
        this.recordSearch = recordSearch;
    }


    /**
     * Gets the recordDescr value for this CustomRecordTypeSublists.
     * 
     * @return recordDescr
     */
    public java.lang.String getRecordDescr() {
        return recordDescr;
    }


    /**
     * Sets the recordDescr value for this CustomRecordTypeSublists.
     * 
     * @param recordDescr
     */
    public void setRecordDescr(java.lang.String recordDescr) {
        this.recordDescr = recordDescr;
    }


    /**
     * Gets the recordDescrLanguageValueList value for this CustomRecordTypeSublists.
     * 
     * @return recordDescrLanguageValueList
     */
    public com.netsuite.webservices.setup.customization_2019_1.LanguageValueList getRecordDescrLanguageValueList() {
        return recordDescrLanguageValueList;
    }


    /**
     * Sets the recordDescrLanguageValueList value for this CustomRecordTypeSublists.
     * 
     * @param recordDescrLanguageValueList
     */
    public void setRecordDescrLanguageValueList(com.netsuite.webservices.setup.customization_2019_1.LanguageValueList recordDescrLanguageValueList) {
        this.recordDescrLanguageValueList = recordDescrLanguageValueList;
    }


    /**
     * Gets the recordTab value for this CustomRecordTypeSublists.
     * 
     * @return recordTab
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecordTab() {
        return recordTab;
    }


    /**
     * Sets the recordTab value for this CustomRecordTypeSublists.
     * 
     * @param recordTab
     */
    public void setRecordTab(com.netsuite.webservices.platform.core_2019_1.RecordRef recordTab) {
        this.recordTab = recordTab;
    }


    /**
     * Gets the recordId value for this CustomRecordTypeSublists.
     * 
     * @return recordId
     */
    public java.lang.String getRecordId() {
        return recordId;
    }


    /**
     * Sets the recordId value for this CustomRecordTypeSublists.
     * 
     * @param recordId
     */
    public void setRecordId(java.lang.String recordId) {
        this.recordId = recordId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeSublists)) return false;
        CustomRecordTypeSublists other = (CustomRecordTypeSublists) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordSearch==null && other.getRecordSearch()==null) || 
             (this.recordSearch!=null &&
              this.recordSearch.equals(other.getRecordSearch()))) &&
            ((this.recordDescr==null && other.getRecordDescr()==null) || 
             (this.recordDescr!=null &&
              this.recordDescr.equals(other.getRecordDescr()))) &&
            ((this.recordDescrLanguageValueList==null && other.getRecordDescrLanguageValueList()==null) || 
             (this.recordDescrLanguageValueList!=null &&
              this.recordDescrLanguageValueList.equals(other.getRecordDescrLanguageValueList()))) &&
            ((this.recordTab==null && other.getRecordTab()==null) || 
             (this.recordTab!=null &&
              this.recordTab.equals(other.getRecordTab()))) &&
            ((this.recordId==null && other.getRecordId()==null) || 
             (this.recordId!=null &&
              this.recordId.equals(other.getRecordId())));
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
        if (getRecordSearch() != null) {
            _hashCode += getRecordSearch().hashCode();
        }
        if (getRecordDescr() != null) {
            _hashCode += getRecordDescr().hashCode();
        }
        if (getRecordDescrLanguageValueList() != null) {
            _hashCode += getRecordDescrLanguageValueList().hashCode();
        }
        if (getRecordTab() != null) {
            _hashCode += getRecordTab().hashCode();
        }
        if (getRecordId() != null) {
            _hashCode += getRecordId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeSublists.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "CustomRecordTypeSublists"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordDescrLanguageValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordDescrLanguageValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "LanguageValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2019_1.setup.webservices.netsuite.com", "recordId"));
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
