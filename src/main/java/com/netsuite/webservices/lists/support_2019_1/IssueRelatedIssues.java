/**
 * IssueRelatedIssues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class IssueRelatedIssues  implements java.io.Serializable {
    private com.netsuite.webservices.lists.support_2019_1.types.IssueRelationship relationship;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueNumber;

    private java.lang.String relationshipComment;

    public IssueRelatedIssues() {
    }

    public IssueRelatedIssues(
           com.netsuite.webservices.lists.support_2019_1.types.IssueRelationship relationship,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueNumber,
           java.lang.String relationshipComment) {
           this.relationship = relationship;
           this.issueNumber = issueNumber;
           this.relationshipComment = relationshipComment;
    }


    /**
     * Gets the relationship value for this IssueRelatedIssues.
     * 
     * @return relationship
     */
    public com.netsuite.webservices.lists.support_2019_1.types.IssueRelationship getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this IssueRelatedIssues.
     * 
     * @param relationship
     */
    public void setRelationship(com.netsuite.webservices.lists.support_2019_1.types.IssueRelationship relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the issueNumber value for this IssueRelatedIssues.
     * 
     * @return issueNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this IssueRelatedIssues.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(com.netsuite.webservices.platform.core_2019_1.RecordRef issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the relationshipComment value for this IssueRelatedIssues.
     * 
     * @return relationshipComment
     */
    public java.lang.String getRelationshipComment() {
        return relationshipComment;
    }


    /**
     * Sets the relationshipComment value for this IssueRelatedIssues.
     * 
     * @param relationshipComment
     */
    public void setRelationshipComment(java.lang.String relationshipComment) {
        this.relationshipComment = relationshipComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueRelatedIssues)) return false;
        IssueRelatedIssues other = (IssueRelatedIssues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              this.relationship.equals(other.getRelationship()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.relationshipComment==null && other.getRelationshipComment()==null) || 
             (this.relationshipComment!=null &&
              this.relationshipComment.equals(other.getRelationshipComment())));
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
        if (getRelationship() != null) {
            _hashCode += getRelationship().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getRelationshipComment() != null) {
            _hashCode += getRelationshipComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueRelatedIssues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueRelatedIssues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.support_2019_1.lists.webservices.netsuite.com", "IssueRelationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "relationshipComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
