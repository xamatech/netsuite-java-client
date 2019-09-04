/**
 * DepositPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.bank_2019_1;

public class DepositPayment  implements java.io.Serializable {
    private java.lang.Boolean deposit;

    private java.lang.Long id;

    private java.util.Calendar docDate;

    private java.lang.String type;

    private java.lang.String docNumber;

    private java.lang.String memo;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private java.lang.String refNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.lang.Double transactionAmount;

    private java.lang.Double paymentAmount;

    private java.lang.Long lineId;

    public DepositPayment() {
    }

    public DepositPayment(
           java.lang.Boolean deposit,
           java.lang.Long id,
           java.util.Calendar docDate,
           java.lang.String type,
           java.lang.String docNumber,
           java.lang.String memo,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           java.lang.String refNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.lang.Double transactionAmount,
           java.lang.Double paymentAmount,
           java.lang.Long lineId) {
           this.deposit = deposit;
           this.id = id;
           this.docDate = docDate;
           this.type = type;
           this.docNumber = docNumber;
           this.memo = memo;
           this.paymentMethod = paymentMethod;
           this.refNum = refNum;
           this.entity = entity;
           this.currency = currency;
           this.transactionAmount = transactionAmount;
           this.paymentAmount = paymentAmount;
           this.lineId = lineId;
    }


    /**
     * Gets the deposit value for this DepositPayment.
     * 
     * @return deposit
     */
    public java.lang.Boolean getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this DepositPayment.
     * 
     * @param deposit
     */
    public void setDeposit(java.lang.Boolean deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the id value for this DepositPayment.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this DepositPayment.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the docDate value for this DepositPayment.
     * 
     * @return docDate
     */
    public java.util.Calendar getDocDate() {
        return docDate;
    }


    /**
     * Sets the docDate value for this DepositPayment.
     * 
     * @param docDate
     */
    public void setDocDate(java.util.Calendar docDate) {
        this.docDate = docDate;
    }


    /**
     * Gets the type value for this DepositPayment.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DepositPayment.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the docNumber value for this DepositPayment.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this DepositPayment.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the memo value for this DepositPayment.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this DepositPayment.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the paymentMethod value for this DepositPayment.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this DepositPayment.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the refNum value for this DepositPayment.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this DepositPayment.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the entity value for this DepositPayment.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this DepositPayment.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the currency value for this DepositPayment.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DepositPayment.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the transactionAmount value for this DepositPayment.
     * 
     * @return transactionAmount
     */
    public java.lang.Double getTransactionAmount() {
        return transactionAmount;
    }


    /**
     * Sets the transactionAmount value for this DepositPayment.
     * 
     * @param transactionAmount
     */
    public void setTransactionAmount(java.lang.Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    /**
     * Gets the paymentAmount value for this DepositPayment.
     * 
     * @return paymentAmount
     */
    public java.lang.Double getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this DepositPayment.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(java.lang.Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the lineId value for this DepositPayment.
     * 
     * @return lineId
     */
    public java.lang.Long getLineId() {
        return lineId;
    }


    /**
     * Sets the lineId value for this DepositPayment.
     * 
     * @param lineId
     */
    public void setLineId(java.lang.Long lineId) {
        this.lineId = lineId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositPayment)) return false;
        DepositPayment other = (DepositPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.docDate==null && other.getDocDate()==null) || 
             (this.docDate!=null &&
              this.docDate.equals(other.getDocDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.transactionAmount==null && other.getTransactionAmount()==null) || 
             (this.transactionAmount!=null &&
              this.transactionAmount.equals(other.getTransactionAmount()))) &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.lineId==null && other.getLineId()==null) || 
             (this.lineId!=null &&
              this.lineId.equals(other.getLineId())));
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
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDocDate() != null) {
            _hashCode += getDocDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTransactionAmount() != null) {
            _hashCode += getTransactionAmount().hashCode();
        }
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getLineId() != null) {
            _hashCode += getLineId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "DepositPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "docDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "docNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "paymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:bank_2019_1.transactions.webservices.netsuite.com", "lineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
