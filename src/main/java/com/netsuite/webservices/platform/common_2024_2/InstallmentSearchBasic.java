/**
 * InstallmentSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class InstallmentSearchBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amountPaid;

    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amountRemaining;

    private com.netsuite.webservices.platform.core_2024_2.SearchLongField daysOverdue;

    private com.netsuite.webservices.platform.core_2024_2.SearchDateField dueDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmount;

    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmountPaid;

    private com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmountRemaining;

    private com.netsuite.webservices.platform.core_2024_2.SearchLongField installmentNumber;

    private com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList;

    public InstallmentSearchBasic() {
    }

    public InstallmentSearchBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amount,
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amountPaid,
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amountRemaining,
           com.netsuite.webservices.platform.core_2024_2.SearchLongField daysOverdue,
           com.netsuite.webservices.platform.core_2024_2.SearchDateField dueDate,
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmount,
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmountPaid,
           com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmountRemaining,
           com.netsuite.webservices.platform.core_2024_2.SearchLongField installmentNumber,
           com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.amountRemaining = amountRemaining;
        this.daysOverdue = daysOverdue;
        this.dueDate = dueDate;
        this.fxAmount = fxAmount;
        this.fxAmountPaid = fxAmountPaid;
        this.fxAmountRemaining = fxAmountRemaining;
        this.installmentNumber = installmentNumber;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amount value for this InstallmentSearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InstallmentSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountPaid value for this InstallmentSearchBasic.
     * 
     * @return amountPaid
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this InstallmentSearchBasic.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amountPaid) {
        this.amountPaid = amountPaid;
    }


    /**
     * Gets the amountRemaining value for this InstallmentSearchBasic.
     * 
     * @return amountRemaining
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this InstallmentSearchBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }


    /**
     * Gets the daysOverdue value for this InstallmentSearchBasic.
     * 
     * @return daysOverdue
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchLongField getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this InstallmentSearchBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(com.netsuite.webservices.platform.core_2024_2.SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }


    /**
     * Gets the dueDate value for this InstallmentSearchBasic.
     * 
     * @return dueDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDateField getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InstallmentSearchBasic.
     * 
     * @param dueDate
     */
    public void setDueDate(com.netsuite.webservices.platform.core_2024_2.SearchDateField dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the fxAmount value for this InstallmentSearchBasic.
     * 
     * @return fxAmount
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this InstallmentSearchBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmount) {
        this.fxAmount = fxAmount;
    }


    /**
     * Gets the fxAmountPaid value for this InstallmentSearchBasic.
     * 
     * @return fxAmountPaid
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getFxAmountPaid() {
        return fxAmountPaid;
    }


    /**
     * Sets the fxAmountPaid value for this InstallmentSearchBasic.
     * 
     * @param fxAmountPaid
     */
    public void setFxAmountPaid(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmountPaid) {
        this.fxAmountPaid = fxAmountPaid;
    }


    /**
     * Gets the fxAmountRemaining value for this InstallmentSearchBasic.
     * 
     * @return fxAmountRemaining
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchDoubleField getFxAmountRemaining() {
        return fxAmountRemaining;
    }


    /**
     * Sets the fxAmountRemaining value for this InstallmentSearchBasic.
     * 
     * @param fxAmountRemaining
     */
    public void setFxAmountRemaining(com.netsuite.webservices.platform.core_2024_2.SearchDoubleField fxAmountRemaining) {
        this.fxAmountRemaining = fxAmountRemaining;
    }


    /**
     * Gets the installmentNumber value for this InstallmentSearchBasic.
     * 
     * @return installmentNumber
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchLongField getInstallmentNumber() {
        return installmentNumber;
    }


    /**
     * Sets the installmentNumber value for this InstallmentSearchBasic.
     * 
     * @param installmentNumber
     */
    public void setInstallmentNumber(com.netsuite.webservices.platform.core_2024_2.SearchLongField installmentNumber) {
        this.installmentNumber = installmentNumber;
    }


    /**
     * Gets the customFieldList value for this InstallmentSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InstallmentSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstallmentSearchBasic)) return false;
        InstallmentSearchBasic other = (InstallmentSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              this.amountPaid.equals(other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              this.amountRemaining.equals(other.getAmountRemaining()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              this.daysOverdue.equals(other.getDaysOverdue()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              this.fxAmount.equals(other.getFxAmount()))) &&
            ((this.fxAmountPaid==null && other.getFxAmountPaid()==null) || 
             (this.fxAmountPaid!=null &&
              this.fxAmountPaid.equals(other.getFxAmountPaid()))) &&
            ((this.fxAmountRemaining==null && other.getFxAmountRemaining()==null) || 
             (this.fxAmountRemaining!=null &&
              this.fxAmountRemaining.equals(other.getFxAmountRemaining()))) &&
            ((this.installmentNumber==null && other.getInstallmentNumber()==null) || 
             (this.installmentNumber!=null &&
              this.installmentNumber.equals(other.getInstallmentNumber()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountPaid() != null) {
            _hashCode += getAmountPaid().hashCode();
        }
        if (getAmountRemaining() != null) {
            _hashCode += getAmountRemaining().hashCode();
        }
        if (getDaysOverdue() != null) {
            _hashCode += getDaysOverdue().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getFxAmount() != null) {
            _hashCode += getFxAmount().hashCode();
        }
        if (getFxAmountPaid() != null) {
            _hashCode += getFxAmountPaid().hashCode();
        }
        if (getFxAmountRemaining() != null) {
            _hashCode += getFxAmountRemaining().hashCode();
        }
        if (getInstallmentNumber() != null) {
            _hashCode += getInstallmentNumber().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstallmentSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "InstallmentSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "fxAmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "fxAmountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "installmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
