/**
 * IssueRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1.types;

public class IssueRelationship implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IssueRelationship(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __blocks = "_blocks";
    public static final java.lang.String __dependsOn = "_dependsOn";
    public static final java.lang.String __duplicatedBy = "_duplicatedBy";
    public static final java.lang.String __duplicates = "_duplicates";
    public static final java.lang.String __followedUpBy = "_followedUpBy";
    public static final java.lang.String __followUpFor = "_followUpFor";
    public static final java.lang.String __injectedBy = "_injectedBy";
    public static final java.lang.String __injects = "_injects";
    public static final java.lang.String __isBlockedBy = "_isBlockedBy";
    public static final java.lang.String __isRequiredFor = "_isRequiredFor";
    public static final java.lang.String __relatedTo = "_relatedTo";
    public static final IssueRelationship _blocks = new IssueRelationship(__blocks);
    public static final IssueRelationship _dependsOn = new IssueRelationship(__dependsOn);
    public static final IssueRelationship _duplicatedBy = new IssueRelationship(__duplicatedBy);
    public static final IssueRelationship _duplicates = new IssueRelationship(__duplicates);
    public static final IssueRelationship _followedUpBy = new IssueRelationship(__followedUpBy);
    public static final IssueRelationship _followUpFor = new IssueRelationship(__followUpFor);
    public static final IssueRelationship _injectedBy = new IssueRelationship(__injectedBy);
    public static final IssueRelationship _injects = new IssueRelationship(__injects);
    public static final IssueRelationship _isBlockedBy = new IssueRelationship(__isBlockedBy);
    public static final IssueRelationship _isRequiredFor = new IssueRelationship(__isRequiredFor);
    public static final IssueRelationship _relatedTo = new IssueRelationship(__relatedTo);
    public java.lang.String getValue() { return _value_;}
    public static IssueRelationship fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IssueRelationship enumeration = (IssueRelationship)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IssueRelationship fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueRelationship.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.support_2019_1.lists.webservices.netsuite.com", "IssueRelationship"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
