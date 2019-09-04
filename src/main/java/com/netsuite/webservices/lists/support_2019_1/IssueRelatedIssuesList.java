/**
 * IssueRelatedIssuesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class IssueRelatedIssuesList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssues[] issueRelatedIssues;

    private boolean replaceAll;  // attribute

    public IssueRelatedIssuesList() {
    }

    public IssueRelatedIssuesList(
           com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssues[] issueRelatedIssues,
           boolean replaceAll) {
           this.issueRelatedIssues = issueRelatedIssues;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the issueRelatedIssues value for this IssueRelatedIssuesList.
     * 
     * @return issueRelatedIssues
     */
    public com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssues[] getIssueRelatedIssues() {
        return issueRelatedIssues;
    }


    /**
     * Sets the issueRelatedIssues value for this IssueRelatedIssuesList.
     * 
     * @param issueRelatedIssues
     */
    public void setIssueRelatedIssues(com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssues[] issueRelatedIssues) {
        this.issueRelatedIssues = issueRelatedIssues;
    }

    public com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssues getIssueRelatedIssues(int i) {
        return this.issueRelatedIssues[i];
    }

    public void setIssueRelatedIssues(int i, com.netsuite.webservices.lists.support_2019_1.IssueRelatedIssues _value) {
        this.issueRelatedIssues[i] = _value;
    }


    /**
     * Gets the replaceAll value for this IssueRelatedIssuesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this IssueRelatedIssuesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueRelatedIssuesList)) return false;
        IssueRelatedIssuesList other = (IssueRelatedIssuesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issueRelatedIssues==null && other.getIssueRelatedIssues()==null) || 
             (this.issueRelatedIssues!=null &&
              java.util.Arrays.equals(this.issueRelatedIssues, other.getIssueRelatedIssues()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getIssueRelatedIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueRelatedIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueRelatedIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueRelatedIssuesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueRelatedIssuesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueRelatedIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueRelatedIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueRelatedIssues"));
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
