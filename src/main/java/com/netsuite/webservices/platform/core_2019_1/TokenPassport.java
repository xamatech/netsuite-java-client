/**
 * TokenPassport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class TokenPassport  implements java.io.Serializable {
    private java.lang.String account;

    private java.lang.String consumerKey;

    private java.lang.String token;

    private java.lang.String nonce;

    private long timestamp;

    private com.netsuite.webservices.platform.core_2019_1.TokenPassportSignature signature;

    public TokenPassport() {
    }

    public TokenPassport(
           java.lang.String account,
           java.lang.String consumerKey,
           java.lang.String token,
           java.lang.String nonce,
           long timestamp,
           com.netsuite.webservices.platform.core_2019_1.TokenPassportSignature signature) {
           this.account = account;
           this.consumerKey = consumerKey;
           this.token = token;
           this.nonce = nonce;
           this.timestamp = timestamp;
           this.signature = signature;
    }


    /**
     * Gets the account value for this TokenPassport.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TokenPassport.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the consumerKey value for this TokenPassport.
     * 
     * @return consumerKey
     */
    public java.lang.String getConsumerKey() {
        return consumerKey;
    }


    /**
     * Sets the consumerKey value for this TokenPassport.
     * 
     * @param consumerKey
     */
    public void setConsumerKey(java.lang.String consumerKey) {
        this.consumerKey = consumerKey;
    }


    /**
     * Gets the token value for this TokenPassport.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this TokenPassport.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the nonce value for this TokenPassport.
     * 
     * @return nonce
     */
    public java.lang.String getNonce() {
        return nonce;
    }


    /**
     * Sets the nonce value for this TokenPassport.
     * 
     * @param nonce
     */
    public void setNonce(java.lang.String nonce) {
        this.nonce = nonce;
    }


    /**
     * Gets the timestamp value for this TokenPassport.
     * 
     * @return timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TokenPassport.
     * 
     * @param timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the signature value for this TokenPassport.
     * 
     * @return signature
     */
    public com.netsuite.webservices.platform.core_2019_1.TokenPassportSignature getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TokenPassport.
     * 
     * @param signature
     */
    public void setSignature(com.netsuite.webservices.platform.core_2019_1.TokenPassportSignature signature) {
        this.signature = signature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenPassport)) return false;
        TokenPassport other = (TokenPassport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.consumerKey==null && other.getConsumerKey()==null) || 
             (this.consumerKey!=null &&
              this.consumerKey.equals(other.getConsumerKey()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.nonce==null && other.getNonce()==null) || 
             (this.nonce!=null &&
              this.nonce.equals(other.getNonce()))) &&
            this.timestamp == other.getTimestamp() &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getConsumerKey() != null) {
            _hashCode += getConsumerKey().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getNonce() != null) {
            _hashCode += getNonce().hashCode();
        }
        _hashCode += new Long(getTimestamp()).hashCode();
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenPassport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "TokenPassport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "consumerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "nonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "TokenPassportSignature"));
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
