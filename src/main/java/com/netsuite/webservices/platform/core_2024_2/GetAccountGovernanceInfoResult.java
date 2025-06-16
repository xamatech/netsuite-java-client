/**
 * GetAccountGovernanceInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2024_2;

public class GetAccountGovernanceInfoResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2024_2.Status status;

    private java.lang.Long accountConcurrencyLimit;

    private java.lang.Long unallocatedConcurrencyLimit;

    public GetAccountGovernanceInfoResult() {
    }

    public GetAccountGovernanceInfoResult(
           com.netsuite.webservices.platform.core_2024_2.Status status,
           java.lang.Long accountConcurrencyLimit,
           java.lang.Long unallocatedConcurrencyLimit) {
           this.status = status;
           this.accountConcurrencyLimit = accountConcurrencyLimit;
           this.unallocatedConcurrencyLimit = unallocatedConcurrencyLimit;
    }


    /**
     * Gets the status value for this GetAccountGovernanceInfoResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2024_2.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetAccountGovernanceInfoResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2024_2.Status status) {
        this.status = status;
    }


    /**
     * Gets the accountConcurrencyLimit value for this GetAccountGovernanceInfoResult.
     * 
     * @return accountConcurrencyLimit
     */
    public java.lang.Long getAccountConcurrencyLimit() {
        return accountConcurrencyLimit;
    }


    /**
     * Sets the accountConcurrencyLimit value for this GetAccountGovernanceInfoResult.
     * 
     * @param accountConcurrencyLimit
     */
    public void setAccountConcurrencyLimit(java.lang.Long accountConcurrencyLimit) {
        this.accountConcurrencyLimit = accountConcurrencyLimit;
    }


    /**
     * Gets the unallocatedConcurrencyLimit value for this GetAccountGovernanceInfoResult.
     * 
     * @return unallocatedConcurrencyLimit
     */
    public java.lang.Long getUnallocatedConcurrencyLimit() {
        return unallocatedConcurrencyLimit;
    }


    /**
     * Sets the unallocatedConcurrencyLimit value for this GetAccountGovernanceInfoResult.
     * 
     * @param unallocatedConcurrencyLimit
     */
    public void setUnallocatedConcurrencyLimit(java.lang.Long unallocatedConcurrencyLimit) {
        this.unallocatedConcurrencyLimit = unallocatedConcurrencyLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountGovernanceInfoResult)) return false;
        GetAccountGovernanceInfoResult other = (GetAccountGovernanceInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.accountConcurrencyLimit==null && other.getAccountConcurrencyLimit()==null) || 
             (this.accountConcurrencyLimit!=null &&
              this.accountConcurrencyLimit.equals(other.getAccountConcurrencyLimit()))) &&
            ((this.unallocatedConcurrencyLimit==null && other.getUnallocatedConcurrencyLimit()==null) || 
             (this.unallocatedConcurrencyLimit!=null &&
              this.unallocatedConcurrencyLimit.equals(other.getUnallocatedConcurrencyLimit())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAccountConcurrencyLimit() != null) {
            _hashCode += getAccountConcurrencyLimit().hashCode();
        }
        if (getUnallocatedConcurrencyLimit() != null) {
            _hashCode += getUnallocatedConcurrencyLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountGovernanceInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "GetAccountGovernanceInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountConcurrencyLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "accountConcurrencyLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unallocatedConcurrencyLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "unallocatedConcurrencyLimit"));
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
