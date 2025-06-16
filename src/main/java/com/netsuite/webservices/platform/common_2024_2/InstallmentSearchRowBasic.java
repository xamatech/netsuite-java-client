/**
 * InstallmentSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2024_2;

public class InstallmentSearchRowBasic  extends com.netsuite.webservices.platform.core_2024_2.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amountPaid;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amountRemaining;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] daysOverdue;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] dueDate;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmount;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmountPaid;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmountRemaining;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] installmentNumber;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] status;

    private com.netsuite.webservices.platform.core_2024_2.SearchColumnCustomFieldList customFieldList;

    public InstallmentSearchRowBasic() {
    }

    public InstallmentSearchRowBasic(
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amount,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amountPaid,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amountRemaining,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] daysOverdue,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] dueDate,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmount,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmountPaid,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmountRemaining,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] installmentNumber,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] status,
           com.netsuite.webservices.platform.core_2024_2.SearchColumnCustomFieldList customFieldList) {
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.amountRemaining = amountRemaining;
        this.daysOverdue = daysOverdue;
        this.dueDate = dueDate;
        this.fxAmount = fxAmount;
        this.fxAmountPaid = fxAmountPaid;
        this.fxAmountRemaining = fxAmountRemaining;
        this.installmentNumber = installmentNumber;
        this.status = status;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amount value for this InstallmentSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InstallmentSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the amountPaid value for this InstallmentSearchRowBasic.
     * 
     * @return amountPaid
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this InstallmentSearchRowBasic.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amountPaid) {
        this.amountPaid = amountPaid;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getAmountPaid(int i) {
        return this.amountPaid[i];
    }

    public void setAmountPaid(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.amountPaid[i] = _value;
    }


    /**
     * Gets the amountRemaining value for this InstallmentSearchRowBasic.
     * 
     * @return amountRemaining
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this InstallmentSearchRowBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }


    /**
     * Gets the daysOverdue value for this InstallmentSearchRowBasic.
     * 
     * @return daysOverdue
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this InstallmentSearchRowBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField getDaysOverdue(int i) {
        return this.daysOverdue[i];
    }

    public void setDaysOverdue(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField _value) {
        this.daysOverdue[i] = _value;
    }


    /**
     * Gets the dueDate value for this InstallmentSearchRowBasic.
     * 
     * @return dueDate
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InstallmentSearchRowBasic.
     * 
     * @param dueDate
     */
    public void setDueDate(com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField[] dueDate) {
        this.dueDate = dueDate;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDateField _value) {
        this.dueDate[i] = _value;
    }


    /**
     * Gets the fxAmount value for this InstallmentSearchRowBasic.
     * 
     * @return fxAmount
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this InstallmentSearchRowBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }


    /**
     * Gets the fxAmountPaid value for this InstallmentSearchRowBasic.
     * 
     * @return fxAmountPaid
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getFxAmountPaid() {
        return fxAmountPaid;
    }


    /**
     * Sets the fxAmountPaid value for this InstallmentSearchRowBasic.
     * 
     * @param fxAmountPaid
     */
    public void setFxAmountPaid(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmountPaid) {
        this.fxAmountPaid = fxAmountPaid;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getFxAmountPaid(int i) {
        return this.fxAmountPaid[i];
    }

    public void setFxAmountPaid(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.fxAmountPaid[i] = _value;
    }


    /**
     * Gets the fxAmountRemaining value for this InstallmentSearchRowBasic.
     * 
     * @return fxAmountRemaining
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] getFxAmountRemaining() {
        return fxAmountRemaining;
    }


    /**
     * Sets the fxAmountRemaining value for this InstallmentSearchRowBasic.
     * 
     * @param fxAmountRemaining
     */
    public void setFxAmountRemaining(com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField[] fxAmountRemaining) {
        this.fxAmountRemaining = fxAmountRemaining;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField getFxAmountRemaining(int i) {
        return this.fxAmountRemaining[i];
    }

    public void setFxAmountRemaining(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnDoubleField _value) {
        this.fxAmountRemaining[i] = _value;
    }


    /**
     * Gets the installmentNumber value for this InstallmentSearchRowBasic.
     * 
     * @return installmentNumber
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] getInstallmentNumber() {
        return installmentNumber;
    }


    /**
     * Sets the installmentNumber value for this InstallmentSearchRowBasic.
     * 
     * @param installmentNumber
     */
    public void setInstallmentNumber(com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField[] installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField getInstallmentNumber(int i) {
        return this.installmentNumber[i];
    }

    public void setInstallmentNumber(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnLongField _value) {
        this.installmentNumber[i] = _value;
    }


    /**
     * Gets the status value for this InstallmentSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InstallmentSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2024_2.SearchColumnStringField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the customFieldList value for this InstallmentSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2024_2.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InstallmentSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2024_2.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstallmentSearchRowBasic)) return false;
        InstallmentSearchRowBasic other = (InstallmentSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              java.util.Arrays.equals(this.amountPaid, other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              java.util.Arrays.equals(this.amountRemaining, other.getAmountRemaining()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              java.util.Arrays.equals(this.daysOverdue, other.getDaysOverdue()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              java.util.Arrays.equals(this.dueDate, other.getDueDate()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              java.util.Arrays.equals(this.fxAmount, other.getFxAmount()))) &&
            ((this.fxAmountPaid==null && other.getFxAmountPaid()==null) || 
             (this.fxAmountPaid!=null &&
              java.util.Arrays.equals(this.fxAmountPaid, other.getFxAmountPaid()))) &&
            ((this.fxAmountRemaining==null && other.getFxAmountRemaining()==null) || 
             (this.fxAmountRemaining!=null &&
              java.util.Arrays.equals(this.fxAmountRemaining, other.getFxAmountRemaining()))) &&
            ((this.installmentNumber==null && other.getInstallmentNumber()==null) || 
             (this.installmentNumber!=null &&
              java.util.Arrays.equals(this.installmentNumber, other.getInstallmentNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountPaid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountPaid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountPaid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountRemaining(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysOverdue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOverdue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOverdue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDueDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDueDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDueDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAmountPaid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAmountPaid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAmountPaid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAmountRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAmountRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAmountRemaining(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInstallmentNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstallmentNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstallmentNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstallmentSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "InstallmentSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "fxAmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "fxAmountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "installmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
