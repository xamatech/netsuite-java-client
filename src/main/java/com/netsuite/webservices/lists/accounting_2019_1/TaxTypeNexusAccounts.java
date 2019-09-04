/**
 * TaxTypeNexusAccounts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class TaxTypeNexusAccounts  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef payablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef receivablesAccount;

    public TaxTypeNexusAccounts() {
    }

    public TaxTypeNexusAccounts(
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef payablesAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef receivablesAccount) {
           this.nexus = nexus;
           this.payablesAccount = payablesAccount;
           this.receivablesAccount = receivablesAccount;
    }


    /**
     * Gets the nexus value for this TaxTypeNexusAccounts.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this TaxTypeNexusAccounts.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the payablesAccount value for this TaxTypeNexusAccounts.
     * 
     * @return payablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPayablesAccount() {
        return payablesAccount;
    }


    /**
     * Sets the payablesAccount value for this TaxTypeNexusAccounts.
     * 
     * @param payablesAccount
     */
    public void setPayablesAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef payablesAccount) {
        this.payablesAccount = payablesAccount;
    }


    /**
     * Gets the receivablesAccount value for this TaxTypeNexusAccounts.
     * 
     * @return receivablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReceivablesAccount() {
        return receivablesAccount;
    }


    /**
     * Sets the receivablesAccount value for this TaxTypeNexusAccounts.
     * 
     * @param receivablesAccount
     */
    public void setReceivablesAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxTypeNexusAccounts)) return false;
        TaxTypeNexusAccounts other = (TaxTypeNexusAccounts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.payablesAccount==null && other.getPayablesAccount()==null) || 
             (this.payablesAccount!=null &&
              this.payablesAccount.equals(other.getPayablesAccount()))) &&
            ((this.receivablesAccount==null && other.getReceivablesAccount()==null) || 
             (this.receivablesAccount!=null &&
              this.receivablesAccount.equals(other.getReceivablesAccount())));
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
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getPayablesAccount() != null) {
            _hashCode += getPayablesAccount().hashCode();
        }
        if (getReceivablesAccount() != null) {
            _hashCode += getReceivablesAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxTypeNexusAccounts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "TaxTypeNexusAccounts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
