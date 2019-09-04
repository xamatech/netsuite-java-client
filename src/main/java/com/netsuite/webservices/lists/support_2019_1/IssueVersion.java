/**
 * IssueVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2019_1;

public class IssueVersion  implements java.io.Serializable {
    private java.lang.Boolean primary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef version;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef build;

    public IssueVersion() {
    }

    public IssueVersion(
           java.lang.Boolean primary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef version,
           com.netsuite.webservices.platform.core_2019_1.RecordRef build) {
           this.primary = primary;
           this.version = version;
           this.build = build;
    }


    /**
     * Gets the primary value for this IssueVersion.
     * 
     * @return primary
     */
    public java.lang.Boolean getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this IssueVersion.
     * 
     * @param primary
     */
    public void setPrimary(java.lang.Boolean primary) {
        this.primary = primary;
    }


    /**
     * Gets the version value for this IssueVersion.
     * 
     * @return version
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getVersion() {
        return version;
    }


    /**
     * Sets the version value for this IssueVersion.
     * 
     * @param version
     */
    public void setVersion(com.netsuite.webservices.platform.core_2019_1.RecordRef version) {
        this.version = version;
    }


    /**
     * Gets the build value for this IssueVersion.
     * 
     * @return build
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBuild() {
        return build;
    }


    /**
     * Sets the build value for this IssueVersion.
     * 
     * @param build
     */
    public void setBuild(com.netsuite.webservices.platform.core_2019_1.RecordRef build) {
        this.build = build;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueVersion)) return false;
        IssueVersion other = (IssueVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild())));
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
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "IssueVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2019_1.lists.webservices.netsuite.com", "build"));
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
