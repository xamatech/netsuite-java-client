/**
 * PostingTransactionSummaryField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class PostingTransactionSummaryField  implements java.io.Serializable {
    private java.lang.Boolean period;

    private java.lang.Boolean account;

    private java.lang.Boolean parentItem;

    private java.lang.Boolean item;

    private java.lang.Boolean entity;

    private java.lang.Boolean department;

    private java.lang.Boolean _class;

    private java.lang.Boolean location;

    private java.lang.Boolean subsidiary;

    private java.lang.Boolean book;

    public PostingTransactionSummaryField() {
    }

    public PostingTransactionSummaryField(
           java.lang.Boolean period,
           java.lang.Boolean account,
           java.lang.Boolean parentItem,
           java.lang.Boolean item,
           java.lang.Boolean entity,
           java.lang.Boolean department,
           java.lang.Boolean _class,
           java.lang.Boolean location,
           java.lang.Boolean subsidiary,
           java.lang.Boolean book) {
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
     * Gets the period value for this PostingTransactionSummaryField.
     * 
     * @return period
     */
    public java.lang.Boolean getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PostingTransactionSummaryField.
     * 
     * @param period
     */
    public void setPeriod(java.lang.Boolean period) {
        this.period = period;
    }


    /**
     * Gets the account value for this PostingTransactionSummaryField.
     * 
     * @return account
     */
    public java.lang.Boolean getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PostingTransactionSummaryField.
     * 
     * @param account
     */
    public void setAccount(java.lang.Boolean account) {
        this.account = account;
    }


    /**
     * Gets the parentItem value for this PostingTransactionSummaryField.
     * 
     * @return parentItem
     */
    public java.lang.Boolean getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this PostingTransactionSummaryField.
     * 
     * @param parentItem
     */
    public void setParentItem(java.lang.Boolean parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the item value for this PostingTransactionSummaryField.
     * 
     * @return item
     */
    public java.lang.Boolean getItem() {
        return item;
    }


    /**
     * Sets the item value for this PostingTransactionSummaryField.
     * 
     * @param item
     */
    public void setItem(java.lang.Boolean item) {
        this.item = item;
    }


    /**
     * Gets the entity value for this PostingTransactionSummaryField.
     * 
     * @return entity
     */
    public java.lang.Boolean getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this PostingTransactionSummaryField.
     * 
     * @param entity
     */
    public void setEntity(java.lang.Boolean entity) {
        this.entity = entity;
    }


    /**
     * Gets the department value for this PostingTransactionSummaryField.
     * 
     * @return department
     */
    public java.lang.Boolean getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PostingTransactionSummaryField.
     * 
     * @param department
     */
    public void setDepartment(java.lang.Boolean department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PostingTransactionSummaryField.
     * 
     * @return _class
     */
    public java.lang.Boolean get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PostingTransactionSummaryField.
     * 
     * @param _class
     */
    public void set_class(java.lang.Boolean _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PostingTransactionSummaryField.
     * 
     * @return location
     */
    public java.lang.Boolean getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PostingTransactionSummaryField.
     * 
     * @param location
     */
    public void setLocation(java.lang.Boolean location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this PostingTransactionSummaryField.
     * 
     * @return subsidiary
     */
    public java.lang.Boolean getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PostingTransactionSummaryField.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(java.lang.Boolean subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the book value for this PostingTransactionSummaryField.
     * 
     * @return book
     */
    public java.lang.Boolean getBook() {
        return book;
    }


    /**
     * Sets the book value for this PostingTransactionSummaryField.
     * 
     * @param book
     */
    public void setBook(java.lang.Boolean book) {
        this.book = book;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostingTransactionSummaryField)) return false;
        PostingTransactionSummaryField other = (PostingTransactionSummaryField) obj;
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
        new org.apache.axis.description.TypeDesc(PostingTransactionSummaryField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "PostingTransactionSummaryField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "book"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
