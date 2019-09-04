/**
 * PostingTransactionSummaryFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class PostingTransactionSummaryFilter  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRefList period;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList account;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList parentItem;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRefList book;

    public PostingTransactionSummaryFilter() {
    }

    public PostingTransactionSummaryFilter(
           com.netsuite.webservices.platform.core_2019_1.RecordRefList period,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList account,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList parentItem,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList item,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList department,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList location,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRefList book) {
           this.period = period;
           this.account = account;
           this.parentItem = parentItem;
           this.item = item;
           this.entity = entity;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.subsidiary = subsidiary;
           this.book = book;
    }


    /**
     * Gets the period value for this PostingTransactionSummaryFilter.
     * 
     * @return period
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PostingTransactionSummaryFilter.
     * 
     * @param period
     */
    public void setPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRefList period) {
        this.period = period;
    }


    /**
     * Gets the account value for this PostingTransactionSummaryFilter.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PostingTransactionSummaryFilter.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRefList account) {
        this.account = account;
    }


    /**
     * Gets the parentItem value for this PostingTransactionSummaryFilter.
     * 
     * @return parentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this PostingTransactionSummaryFilter.
     * 
     * @param parentItem
     */
    public void setParentItem(com.netsuite.webservices.platform.core_2019_1.RecordRefList parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the item value for this PostingTransactionSummaryFilter.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getItem() {
        return item;
    }


    /**
     * Sets the item value for this PostingTransactionSummaryFilter.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRefList item) {
        this.item = item;
    }


    /**
     * Gets the entity value for this PostingTransactionSummaryFilter.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PostingTransactionSummaryFilter.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRefList entity) {
        this.entity = entity;
    }


    /**
     * Gets the department value for this PostingTransactionSummaryFilter.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PostingTransactionSummaryFilter.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRefList department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PostingTransactionSummaryFilter.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PostingTransactionSummaryFilter.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRefList _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PostingTransactionSummaryFilter.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PostingTransactionSummaryFilter.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRefList location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this PostingTransactionSummaryFilter.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PostingTransactionSummaryFilter.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRefList subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the book value for this PostingTransactionSummaryFilter.
     * 
     * @return book
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRefList getBook() {
        return book;
    }


    /**
     * Sets the book value for this PostingTransactionSummaryFilter.
     * 
     * @param book
     */
    public void setBook(com.netsuite.webservices.platform.core_2019_1.RecordRefList book) {
        this.book = book;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostingTransactionSummaryFilter)) return false;
        PostingTransactionSummaryFilter other = (PostingTransactionSummaryFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.parentItem==null && other.getParentItem()==null) || 
             (this.parentItem!=null &&
              this.parentItem.equals(other.getParentItem()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.book==null && other.getBook()==null) || 
             (this.book!=null &&
              this.book.equals(other.getBook())));
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getParentItem() != null) {
            _hashCode += getParentItem().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getBook() != null) {
            _hashCode += getBook().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostingTransactionSummaryFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "PostingTransactionSummaryFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "book"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRefList"));
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
