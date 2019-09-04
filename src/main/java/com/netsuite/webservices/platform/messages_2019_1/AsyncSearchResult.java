/**
 * AsyncSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2019_1;

public class AsyncSearchResult  extends com.netsuite.webservices.platform.messages_2019_1.AsyncResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchResult searchResult;

    public AsyncSearchResult() {
    }

    public AsyncSearchResult(
           com.netsuite.webservices.platform.core_2019_1.SearchResult searchResult) {
        this.searchResult = searchResult;
    }


    /**
     * Gets the searchResult value for this AsyncSearchResult.
     * 
     * @return searchResult
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchResult getSearchResult() {
        return searchResult;
    }


    /**
     * Sets the searchResult value for this AsyncSearchResult.
     * 
     * @param searchResult
     */
    public void setSearchResult(com.netsuite.webservices.platform.core_2019_1.SearchResult searchResult) {
        this.searchResult = searchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsyncSearchResult)) return false;
        AsyncSearchResult other = (AsyncSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchResult==null && other.getSearchResult()==null) || 
             (this.searchResult!=null &&
              this.searchResult.equals(other.getSearchResult())));
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
        if (getSearchResult() != null) {
            _hashCode += getSearchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsyncSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "AsyncSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchResult"));
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
