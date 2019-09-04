/**
 * PaycheckSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class PaycheckSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] amendedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] batchNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] checkDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasGLImpact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] hours;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payrollItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payrollItemType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] subjectWages;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxableWages;

    public PaycheckSearchRowBasic() {
    }

    public PaycheckSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] amendedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] batchNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] checkDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasGLImpact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] hours,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payrollItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payrollItemType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] subjectWages,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxableWages) {
        this.account = account;
        this.amendedDate = amendedDate;
        this.amount = amount;
        this.batchNumber = batchNumber;
        this.checkDate = checkDate;
        this.employee = employee;
        this.externalId = externalId;
        this.hasGLImpact = hasGLImpact;
        this.hours = hours;
        this.internalId = internalId;
        this.payrollItem = payrollItem;
        this.payrollItemType = payrollItemType;
        this.subjectWages = subjectWages;
        this.taxableWages = taxableWages;
    }


    /**
     * Gets the account value for this PaycheckSearchRowBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaycheckSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account) {
        this.account = account;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the amendedDate value for this PaycheckSearchRowBasic.
     * 
     * @return amendedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getAmendedDate() {
        return amendedDate;
    }


    /**
     * Sets the amendedDate value for this PaycheckSearchRowBasic.
     * 
     * @param amendedDate
     */
    public void setAmendedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] amendedDate) {
        this.amendedDate = amendedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getAmendedDate(int i) {
        return this.amendedDate[i];
    }

    public void setAmendedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.amendedDate[i] = _value;
    }


    /**
     * Gets the amount value for this PaycheckSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaycheckSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the batchNumber value for this PaycheckSearchRowBasic.
     * 
     * @return batchNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this PaycheckSearchRowBasic.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] batchNumber) {
        this.batchNumber = batchNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getBatchNumber(int i) {
        return this.batchNumber[i];
    }

    public void setBatchNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.batchNumber[i] = _value;
    }


    /**
     * Gets the checkDate value for this PaycheckSearchRowBasic.
     * 
     * @return checkDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCheckDate() {
        return checkDate;
    }


    /**
     * Sets the checkDate value for this PaycheckSearchRowBasic.
     * 
     * @param checkDate
     */
    public void setCheckDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] checkDate) {
        this.checkDate = checkDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCheckDate(int i) {
        return this.checkDate[i];
    }

    public void setCheckDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.checkDate[i] = _value;
    }


    /**
     * Gets the employee value for this PaycheckSearchRowBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this PaycheckSearchRowBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] employee) {
        this.employee = employee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEmployee(int i) {
        return this.employee[i];
    }

    public void setEmployee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.employee[i] = _value;
    }


    /**
     * Gets the externalId value for this PaycheckSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaycheckSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the hasGLImpact value for this PaycheckSearchRowBasic.
     * 
     * @return hasGLImpact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getHasGLImpact() {
        return hasGLImpact;
    }


    /**
     * Sets the hasGLImpact value for this PaycheckSearchRowBasic.
     * 
     * @param hasGLImpact
     */
    public void setHasGLImpact(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasGLImpact) {
        this.hasGLImpact = hasGLImpact;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getHasGLImpact(int i) {
        return this.hasGLImpact[i];
    }

    public void setHasGLImpact(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.hasGLImpact[i] = _value;
    }


    /**
     * Gets the hours value for this PaycheckSearchRowBasic.
     * 
     * @return hours
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this PaycheckSearchRowBasic.
     * 
     * @param hours
     */
    public void setHours(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] hours) {
        this.hours = hours;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getHours(int i) {
        return this.hours[i];
    }

    public void setHours(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.hours[i] = _value;
    }


    /**
     * Gets the internalId value for this PaycheckSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaycheckSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the payrollItem value for this PaycheckSearchRowBasic.
     * 
     * @return payrollItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPayrollItem() {
        return payrollItem;
    }


    /**
     * Sets the payrollItem value for this PaycheckSearchRowBasic.
     * 
     * @param payrollItem
     */
    public void setPayrollItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payrollItem) {
        this.payrollItem = payrollItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPayrollItem(int i) {
        return this.payrollItem[i];
    }

    public void setPayrollItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.payrollItem[i] = _value;
    }


    /**
     * Gets the payrollItemType value for this PaycheckSearchRowBasic.
     * 
     * @return payrollItemType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPayrollItemType() {
        return payrollItemType;
    }


    /**
     * Sets the payrollItemType value for this PaycheckSearchRowBasic.
     * 
     * @param payrollItemType
     */
    public void setPayrollItemType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payrollItemType) {
        this.payrollItemType = payrollItemType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPayrollItemType(int i) {
        return this.payrollItemType[i];
    }

    public void setPayrollItemType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.payrollItemType[i] = _value;
    }


    /**
     * Gets the subjectWages value for this PaycheckSearchRowBasic.
     * 
     * @return subjectWages
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSubjectWages() {
        return subjectWages;
    }


    /**
     * Sets the subjectWages value for this PaycheckSearchRowBasic.
     * 
     * @param subjectWages
     */
    public void setSubjectWages(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] subjectWages) {
        this.subjectWages = subjectWages;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSubjectWages(int i) {
        return this.subjectWages[i];
    }

    public void setSubjectWages(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.subjectWages[i] = _value;
    }


    /**
     * Gets the taxableWages value for this PaycheckSearchRowBasic.
     * 
     * @return taxableWages
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTaxableWages() {
        return taxableWages;
    }


    /**
     * Sets the taxableWages value for this PaycheckSearchRowBasic.
     * 
     * @param taxableWages
     */
    public void setTaxableWages(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxableWages) {
        this.taxableWages = taxableWages;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTaxableWages(int i) {
        return this.taxableWages[i];
    }

    public void setTaxableWages(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.taxableWages[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckSearchRowBasic)) return false;
        PaycheckSearchRowBasic other = (PaycheckSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.amendedDate==null && other.getAmendedDate()==null) || 
             (this.amendedDate!=null &&
              java.util.Arrays.equals(this.amendedDate, other.getAmendedDate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              java.util.Arrays.equals(this.batchNumber, other.getBatchNumber()))) &&
            ((this.checkDate==null && other.getCheckDate()==null) || 
             (this.checkDate!=null &&
              java.util.Arrays.equals(this.checkDate, other.getCheckDate()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              java.util.Arrays.equals(this.employee, other.getEmployee()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.hasGLImpact==null && other.getHasGLImpact()==null) || 
             (this.hasGLImpact!=null &&
              java.util.Arrays.equals(this.hasGLImpact, other.getHasGLImpact()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              java.util.Arrays.equals(this.hours, other.getHours()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.payrollItem==null && other.getPayrollItem()==null) || 
             (this.payrollItem!=null &&
              java.util.Arrays.equals(this.payrollItem, other.getPayrollItem()))) &&
            ((this.payrollItemType==null && other.getPayrollItemType()==null) || 
             (this.payrollItemType!=null &&
              java.util.Arrays.equals(this.payrollItemType, other.getPayrollItemType()))) &&
            ((this.subjectWages==null && other.getSubjectWages()==null) || 
             (this.subjectWages!=null &&
              java.util.Arrays.equals(this.subjectWages, other.getSubjectWages()))) &&
            ((this.taxableWages==null && other.getTaxableWages()==null) || 
             (this.taxableWages!=null &&
              java.util.Arrays.equals(this.taxableWages, other.getTaxableWages())));
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
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmendedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmendedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmendedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getBatchNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCheckDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCheckDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCheckDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasGLImpact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHasGLImpact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHasGLImpact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHours(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollItemType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollItemType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollItemType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubjectWages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjectWages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjectWages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxableWages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxableWages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxableWages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PaycheckSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amendedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "batchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "checkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasGLImpact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasGLImpact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectWages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subjectWages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableWages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxableWages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
