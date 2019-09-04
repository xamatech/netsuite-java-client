/**
 * GetDeletedResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class GetDeletedResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.Status status;

    private java.lang.Integer totalRecords;

    private java.lang.Integer pageSize;

    private java.lang.Integer totalPages;

    private java.lang.Integer pageIndex;

    private com.netsuite.webservices.platform.core_2019_1.DeletedRecordList deletedRecordList;

    public GetDeletedResult() {
    }

    public GetDeletedResult(
           com.netsuite.webservices.platform.core_2019_1.Status status,
           java.lang.Integer totalRecords,
           java.lang.Integer pageSize,
           java.lang.Integer totalPages,
           java.lang.Integer pageIndex,
           com.netsuite.webservices.platform.core_2019_1.DeletedRecordList deletedRecordList) {
           this.status = status;
           this.totalRecords = totalRecords;
           this.pageSize = pageSize;
           this.totalPages = totalPages;
           this.pageIndex = pageIndex;
           this.deletedRecordList = deletedRecordList;
    }


    /**
     * Gets the status value for this GetDeletedResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetDeletedResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.Status status) {
        this.status = status;
    }


    /**
     * Gets the totalRecords value for this GetDeletedResult.
     * 
     * @return totalRecords
     */
    public java.lang.Integer getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetDeletedResult.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Integer totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the pageSize value for this GetDeletedResult.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetDeletedResult.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the totalPages value for this GetDeletedResult.
     * 
     * @return totalPages
     */
    public java.lang.Integer getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this GetDeletedResult.
     * 
     * @param totalPages
     */
    public void setTotalPages(java.lang.Integer totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the pageIndex value for this GetDeletedResult.
     * 
     * @return pageIndex
     */
    public java.lang.Integer getPageIndex() {
        return pageIndex;
    }


    /**
     * Sets the pageIndex value for this GetDeletedResult.
     * 
     * @param pageIndex
     */
    public void setPageIndex(java.lang.Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * Gets the deletedRecordList value for this GetDeletedResult.
     * 
     * @return deletedRecordList
     */
    public com.netsuite.webservices.platform.core_2019_1.DeletedRecordList getDeletedRecordList() {
        return deletedRecordList;
    }


    /**
     * Sets the deletedRecordList value for this GetDeletedResult.
     * 
     * @param deletedRecordList
     */
    public void setDeletedRecordList(com.netsuite.webservices.platform.core_2019_1.DeletedRecordList deletedRecordList) {
        this.deletedRecordList = deletedRecordList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeletedResult)) return false;
        GetDeletedResult other = (GetDeletedResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.pageIndex==null && other.getPageIndex()==null) || 
             (this.pageIndex!=null &&
              this.pageIndex.equals(other.getPageIndex()))) &&
            ((this.deletedRecordList==null && other.getDeletedRecordList()==null) || 
             (this.deletedRecordList!=null &&
              this.deletedRecordList.equals(other.getDeletedRecordList())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getPageIndex() != null) {
            _hashCode += getPageIndex().hashCode();
        }
        if (getDeletedRecordList() != null) {
            _hashCode += getDeletedRecordList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeletedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "GetDeletedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "totalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "pageIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedRecordList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "deletedRecordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "DeletedRecordList"));
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
