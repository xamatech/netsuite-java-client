/**
 * EmployeeDirectDeposit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2019_1;

public class EmployeeDirectDeposit  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Boolean netAccount;

    private java.lang.Boolean savingsAccount;

    private java.lang.Boolean accountPrenoted;

    private com.netsuite.webservices.lists.employees_2019_1.types.EmployeeDirectDepositAccountStatus accountStatus;

    private java.lang.String bankName;

    private java.lang.String bankId;

    private java.lang.String bankNumber;

    private java.lang.String bankRoutingNumber;

    private java.lang.String bankAccountNumber;

    private java.lang.Double amount;

    private java.lang.Boolean inactive;

    public EmployeeDirectDeposit() {
    }

    public EmployeeDirectDeposit(
           java.lang.Long id,
           java.lang.Boolean netAccount,
           java.lang.Boolean savingsAccount,
           java.lang.Boolean accountPrenoted,
           com.netsuite.webservices.lists.employees_2019_1.types.EmployeeDirectDepositAccountStatus accountStatus,
           java.lang.String bankName,
           java.lang.String bankId,
           java.lang.String bankNumber,
           java.lang.String bankRoutingNumber,
           java.lang.String bankAccountNumber,
           java.lang.Double amount,
           java.lang.Boolean inactive) {
           this.id = id;
           this.netAccount = netAccount;
           this.savingsAccount = savingsAccount;
           this.accountPrenoted = accountPrenoted;
           this.accountStatus = accountStatus;
           this.bankName = bankName;
           this.bankId = bankId;
           this.bankNumber = bankNumber;
           this.bankRoutingNumber = bankRoutingNumber;
           this.bankAccountNumber = bankAccountNumber;
           this.amount = amount;
           this.inactive = inactive;
    }


    /**
     * Gets the id value for this EmployeeDirectDeposit.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this EmployeeDirectDeposit.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the netAccount value for this EmployeeDirectDeposit.
     * 
     * @return netAccount
     */
    public java.lang.Boolean getNetAccount() {
        return netAccount;
    }


    /**
     * Sets the netAccount value for this EmployeeDirectDeposit.
     * 
     * @param netAccount
     */
    public void setNetAccount(java.lang.Boolean netAccount) {
        this.netAccount = netAccount;
    }


    /**
     * Gets the savingsAccount value for this EmployeeDirectDeposit.
     * 
     * @return savingsAccount
     */
    public java.lang.Boolean getSavingsAccount() {
        return savingsAccount;
    }


    /**
     * Sets the savingsAccount value for this EmployeeDirectDeposit.
     * 
     * @param savingsAccount
     */
    public void setSavingsAccount(java.lang.Boolean savingsAccount) {
        this.savingsAccount = savingsAccount;
    }


    /**
     * Gets the accountPrenoted value for this EmployeeDirectDeposit.
     * 
     * @return accountPrenoted
     */
    public java.lang.Boolean getAccountPrenoted() {
        return accountPrenoted;
    }


    /**
     * Sets the accountPrenoted value for this EmployeeDirectDeposit.
     * 
     * @param accountPrenoted
     */
    public void setAccountPrenoted(java.lang.Boolean accountPrenoted) {
        this.accountPrenoted = accountPrenoted;
    }


    /**
     * Gets the accountStatus value for this EmployeeDirectDeposit.
     * 
     * @return accountStatus
     */
    public com.netsuite.webservices.lists.employees_2019_1.types.EmployeeDirectDepositAccountStatus getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this EmployeeDirectDeposit.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(com.netsuite.webservices.lists.employees_2019_1.types.EmployeeDirectDepositAccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the bankName value for this EmployeeDirectDeposit.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this EmployeeDirectDeposit.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankId value for this EmployeeDirectDeposit.
     * 
     * @return bankId
     */
    public java.lang.String getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this EmployeeDirectDeposit.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.String bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the bankNumber value for this EmployeeDirectDeposit.
     * 
     * @return bankNumber
     */
    public java.lang.String getBankNumber() {
        return bankNumber;
    }


    /**
     * Sets the bankNumber value for this EmployeeDirectDeposit.
     * 
     * @param bankNumber
     */
    public void setBankNumber(java.lang.String bankNumber) {
        this.bankNumber = bankNumber;
    }


    /**
     * Gets the bankRoutingNumber value for this EmployeeDirectDeposit.
     * 
     * @return bankRoutingNumber
     */
    public java.lang.String getBankRoutingNumber() {
        return bankRoutingNumber;
    }


    /**
     * Sets the bankRoutingNumber value for this EmployeeDirectDeposit.
     * 
     * @param bankRoutingNumber
     */
    public void setBankRoutingNumber(java.lang.String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }


    /**
     * Gets the bankAccountNumber value for this EmployeeDirectDeposit.
     * 
     * @return bankAccountNumber
     */
    public java.lang.String getBankAccountNumber() {
        return bankAccountNumber;
    }


    /**
     * Sets the bankAccountNumber value for this EmployeeDirectDeposit.
     * 
     * @param bankAccountNumber
     */
    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    /**
     * Gets the amount value for this EmployeeDirectDeposit.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this EmployeeDirectDeposit.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the inactive value for this EmployeeDirectDeposit.
     * 
     * @return inactive
     */
    public java.lang.Boolean getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this EmployeeDirectDeposit.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Boolean inactive) {
        this.inactive = inactive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeDirectDeposit)) return false;
        EmployeeDirectDeposit other = (EmployeeDirectDeposit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.netAccount==null && other.getNetAccount()==null) || 
             (this.netAccount!=null &&
              this.netAccount.equals(other.getNetAccount()))) &&
            ((this.savingsAccount==null && other.getSavingsAccount()==null) || 
             (this.savingsAccount!=null &&
              this.savingsAccount.equals(other.getSavingsAccount()))) &&
            ((this.accountPrenoted==null && other.getAccountPrenoted()==null) || 
             (this.accountPrenoted!=null &&
              this.accountPrenoted.equals(other.getAccountPrenoted()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            ((this.bankNumber==null && other.getBankNumber()==null) || 
             (this.bankNumber!=null &&
              this.bankNumber.equals(other.getBankNumber()))) &&
            ((this.bankRoutingNumber==null && other.getBankRoutingNumber()==null) || 
             (this.bankRoutingNumber!=null &&
              this.bankRoutingNumber.equals(other.getBankRoutingNumber()))) &&
            ((this.bankAccountNumber==null && other.getBankAccountNumber()==null) || 
             (this.bankAccountNumber!=null &&
              this.bankAccountNumber.equals(other.getBankAccountNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNetAccount() != null) {
            _hashCode += getNetAccount().hashCode();
        }
        if (getSavingsAccount() != null) {
            _hashCode += getSavingsAccount().hashCode();
        }
        if (getAccountPrenoted() != null) {
            _hashCode += getAccountPrenoted().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        if (getBankNumber() != null) {
            _hashCode += getBankNumber().hashCode();
        }
        if (getBankRoutingNumber() != null) {
            _hashCode += getBankRoutingNumber().hashCode();
        }
        if (getBankAccountNumber() != null) {
            _hashCode += getBankAccountNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeDirectDeposit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "EmployeeDirectDeposit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "netAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savingsAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "savingsAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPrenoted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accountPrenoted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2019_1.lists.webservices.netsuite.com", "EmployeeDirectDepositAccountStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "bankNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRoutingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "bankRoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "bankAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.lists.webservices.netsuite.com", "inactive"));
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
