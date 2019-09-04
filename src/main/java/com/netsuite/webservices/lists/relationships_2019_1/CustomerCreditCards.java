/**
 * CustomerCreditCards.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerCreditCards  implements java.io.Serializable {
    private java.lang.String internalId;

    private java.lang.String ccNumber;

    private java.util.Calendar ccExpireDate;

    private java.lang.String ccName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef cardState;

    private java.util.Calendar stateFrom;

    private java.lang.String debitcardIssueNo;

    private java.lang.String ccMemo;

    private java.util.Calendar validfrom;

    private java.lang.Boolean ccDefault;

    public CustomerCreditCards() {
    }

    public CustomerCreditCards(
           java.lang.String internalId,
           java.lang.String ccNumber,
           java.util.Calendar ccExpireDate,
           java.lang.String ccName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef cardState,
           java.util.Calendar stateFrom,
           java.lang.String debitcardIssueNo,
           java.lang.String ccMemo,
           java.util.Calendar validfrom,
           java.lang.Boolean ccDefault) {
           this.internalId = internalId;
           this.ccNumber = ccNumber;
           this.ccExpireDate = ccExpireDate;
           this.ccName = ccName;
           this.paymentMethod = paymentMethod;
           this.cardState = cardState;
           this.stateFrom = stateFrom;
           this.debitcardIssueNo = debitcardIssueNo;
           this.ccMemo = ccMemo;
           this.validfrom = validfrom;
           this.ccDefault = ccDefault;
    }


    /**
     * Gets the internalId value for this CustomerCreditCards.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerCreditCards.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the ccNumber value for this CustomerCreditCards.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this CustomerCreditCards.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccExpireDate value for this CustomerCreditCards.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this CustomerCreditCards.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this CustomerCreditCards.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this CustomerCreditCards.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the paymentMethod value for this CustomerCreditCards.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CustomerCreditCards.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the cardState value for this CustomerCreditCards.
     * 
     * @return cardState
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCardState() {
        return cardState;
    }


    /**
     * Sets the cardState value for this CustomerCreditCards.
     * 
     * @param cardState
     */
    public void setCardState(com.netsuite.webservices.platform.core_2019_1.RecordRef cardState) {
        this.cardState = cardState;
    }


    /**
     * Gets the stateFrom value for this CustomerCreditCards.
     * 
     * @return stateFrom
     */
    public java.util.Calendar getStateFrom() {
        return stateFrom;
    }


    /**
     * Sets the stateFrom value for this CustomerCreditCards.
     * 
     * @param stateFrom
     */
    public void setStateFrom(java.util.Calendar stateFrom) {
        this.stateFrom = stateFrom;
    }


    /**
     * Gets the debitcardIssueNo value for this CustomerCreditCards.
     * 
     * @return debitcardIssueNo
     */
    public java.lang.String getDebitcardIssueNo() {
        return debitcardIssueNo;
    }


    /**
     * Sets the debitcardIssueNo value for this CustomerCreditCards.
     * 
     * @param debitcardIssueNo
     */
    public void setDebitcardIssueNo(java.lang.String debitcardIssueNo) {
        this.debitcardIssueNo = debitcardIssueNo;
    }


    /**
     * Gets the ccMemo value for this CustomerCreditCards.
     * 
     * @return ccMemo
     */
    public java.lang.String getCcMemo() {
        return ccMemo;
    }


    /**
     * Sets the ccMemo value for this CustomerCreditCards.
     * 
     * @param ccMemo
     */
    public void setCcMemo(java.lang.String ccMemo) {
        this.ccMemo = ccMemo;
    }


    /**
     * Gets the validfrom value for this CustomerCreditCards.
     * 
     * @return validfrom
     */
    public java.util.Calendar getValidfrom() {
        return validfrom;
    }


    /**
     * Sets the validfrom value for this CustomerCreditCards.
     * 
     * @param validfrom
     */
    public void setValidfrom(java.util.Calendar validfrom) {
        this.validfrom = validfrom;
    }


    /**
     * Gets the ccDefault value for this CustomerCreditCards.
     * 
     * @return ccDefault
     */
    public java.lang.Boolean getCcDefault() {
        return ccDefault;
    }


    /**
     * Sets the ccDefault value for this CustomerCreditCards.
     * 
     * @param ccDefault
     */
    public void setCcDefault(java.lang.Boolean ccDefault) {
        this.ccDefault = ccDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCreditCards)) return false;
        CustomerCreditCards other = (CustomerCreditCards) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.cardState==null && other.getCardState()==null) || 
             (this.cardState!=null &&
              this.cardState.equals(other.getCardState()))) &&
            ((this.stateFrom==null && other.getStateFrom()==null) || 
             (this.stateFrom!=null &&
              this.stateFrom.equals(other.getStateFrom()))) &&
            ((this.debitcardIssueNo==null && other.getDebitcardIssueNo()==null) || 
             (this.debitcardIssueNo!=null &&
              this.debitcardIssueNo.equals(other.getDebitcardIssueNo()))) &&
            ((this.ccMemo==null && other.getCcMemo()==null) || 
             (this.ccMemo!=null &&
              this.ccMemo.equals(other.getCcMemo()))) &&
            ((this.validfrom==null && other.getValidfrom()==null) || 
             (this.validfrom!=null &&
              this.validfrom.equals(other.getValidfrom()))) &&
            ((this.ccDefault==null && other.getCcDefault()==null) || 
             (this.ccDefault!=null &&
              this.ccDefault.equals(other.getCcDefault())));
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getCardState() != null) {
            _hashCode += getCardState().hashCode();
        }
        if (getStateFrom() != null) {
            _hashCode += getStateFrom().hashCode();
        }
        if (getDebitcardIssueNo() != null) {
            _hashCode += getDebitcardIssueNo().hashCode();
        }
        if (getCcMemo() != null) {
            _hashCode += getCcMemo().hashCode();
        }
        if (getValidfrom() != null) {
            _hashCode += getValidfrom().hashCode();
        }
        if (getCcDefault() != null) {
            _hashCode += getCcDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCreditCards.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerCreditCards"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "cardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "stateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitcardIssueNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "debitcardIssueNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ccMemo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "validfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ccDefault"));
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
