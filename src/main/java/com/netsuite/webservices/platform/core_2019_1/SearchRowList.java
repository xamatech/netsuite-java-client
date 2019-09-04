/**
 * SearchRowList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1;

public class SearchRowList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchRow[] searchRow;

    public SearchRowList() {
    }

    public SearchRowList(
           com.netsuite.webservices.platform.core_2019_1.SearchRow[] searchRow) {
           this.searchRow = searchRow;
    }


    /**
     * Gets the searchRow value for this SearchRowList.
     * 
     * @return searchRow
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchRow[] getSearchRow() {
        return searchRow;
    }


    /**
     * Sets the searchRow value for this SearchRowList.
     * 
     * @param searchRow
     */
    public void setSearchRow(com.netsuite.webservices.platform.core_2019_1.SearchRow[] searchRow) {
        this.searchRow = searchRow;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchRow getSearchRow(int i) {
        return this.searchRow[i];
    }

    public void setSearchRow(int i, com.netsuite.webservices.platform.core_2019_1.SearchRow _value) {
        this.searchRow[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchRowList)) return false;
        SearchRowList other = (SearchRowList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchRow==null && other.getSearchRow()==null) || 
             (this.searchRow!=null &&
              java.util.Arrays.equals(this.searchRow, other.getSearchRow())));
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
        if (getSearchRow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchRow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchRow(), i);
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
        new org.apache.axis.description.TypeDesc(SearchRowList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchRowList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchRow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "searchRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchRow"));
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
