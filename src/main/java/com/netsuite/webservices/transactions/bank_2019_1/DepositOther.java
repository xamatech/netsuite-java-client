/**
 * DepositOther.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.bank_2019_1;

public class DepositOther  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private java.lang.Double amount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private java.lang.String refNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private java.lang.String memo;

    public DepositOther() {
    }

    public DepositOther(
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           java.lang.Double amount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           java.lang.String refNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           java.lang.String memo) {
           this.entity = entity;
           this.amount = amount;
           this.account = account;
           this.paymentMethod = paymentMethod;
           this.refNum = refNum;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.memo = memo;
    }


    /**
     * Gets the entity value for this DepositOther.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this DepositOther.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the amount value for this DepositOther.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DepositOther.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the account value for this DepositOther.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this DepositOther.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the paymentMethod value for this DepositOther.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this DepositOther.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the refNum value for this DepositOther.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this DepositOther.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the department value for this DepositOther.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this DepositOther.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this DepositOther.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this DepositOther.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this DepositOther.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this DepositOther.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this DepositOther.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this DepositOther.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositOther)) return false;
        DepositOther other = (DepositOther) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
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
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositOther.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "DepositOther"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "refNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "memo"));
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
