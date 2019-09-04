/**
 * PostingTransactionSummaryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class PostingTransactionSummaryList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummary[] postingTransactionSummary;

    public PostingTransactionSummaryList() {
    }

    public PostingTransactionSummaryList(
           com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummary[] postingTransactionSummary) {
           this.postingTransactionSummary = postingTransactionSummary;
    }


    /**
     * Gets the postingTransactionSummary value for this PostingTransactionSummaryList.
     * 
     * @return postingTransactionSummary
     */
    public com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummary[] getPostingTransactionSummary() {
        return postingTransactionSummary;
    }


    /**
     * Sets the postingTransactionSummary value for this PostingTransactionSummaryList.
     * 
     * @param postingTransactionSummary
     */
    public void setPostingTransactionSummary(com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummary[] postingTransactionSummary) {
        this.postingTransactionSummary = postingTransactionSummary;
    }

    public com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummary getPostingTransactionSummary(int i) {
        return this.postingTransactionSummary[i];
    }

    public void setPostingTransactionSummary(int i, com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummary _value) {
        this.postingTransactionSummary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostingTransactionSummaryList)) return false;
        PostingTransactionSummaryList other = (PostingTransactionSummaryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postingTransactionSummary==null && other.getPostingTransactionSummary()==null) || 
             (this.postingTransactionSummary!=null &&
              java.util.Arrays.equals(this.postingTransactionSummary, other.getPostingTransactionSummary())));
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
        if (getPostingTransactionSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostingTransactionSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostingTransactionSummary(), i);
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
        new org.apache.axis.description.TypeDesc(PostingTransactionSummaryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "PostingTransactionSummaryList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingTransactionSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "postingTransactionSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "PostingTransactionSummary"));
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
