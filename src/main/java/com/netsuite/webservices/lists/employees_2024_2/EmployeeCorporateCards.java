/**
 * EmployeeCorporateCards.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2024_2;

public class EmployeeCorporateCards  implements java.io.Serializable {
    private java.lang.String embossedName;

    private java.util.Calendar expiration;

    private com.netsuite.webservices.platform.core_2024_2.RecordRef corporateCardProfile;

    public EmployeeCorporateCards() {
    }

    public EmployeeCorporateCards(
           java.lang.String embossedName,
           java.util.Calendar expiration,
           com.netsuite.webservices.platform.core_2024_2.RecordRef corporateCardProfile) {
           this.embossedName = embossedName;
           this.expiration = expiration;
           this.corporateCardProfile = corporateCardProfile;
    }


    /**
     * Gets the embossedName value for this EmployeeCorporateCards.
     * 
     * @return embossedName
     */
    public java.lang.String getEmbossedName() {
        return embossedName;
    }


    /**
     * Sets the embossedName value for this EmployeeCorporateCards.
     * 
     * @param embossedName
     */
    public void setEmbossedName(java.lang.String embossedName) {
        this.embossedName = embossedName;
    }


    /**
     * Gets the expiration value for this EmployeeCorporateCards.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this EmployeeCorporateCards.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the corporateCardProfile value for this EmployeeCorporateCards.
     * 
     * @return corporateCardProfile
     */
    public com.netsuite.webservices.platform.core_2024_2.RecordRef getCorporateCardProfile() {
        return corporateCardProfile;
    }


    /**
     * Sets the corporateCardProfile value for this EmployeeCorporateCards.
     * 
     * @param corporateCardProfile
     */
    public void setCorporateCardProfile(com.netsuite.webservices.platform.core_2024_2.RecordRef corporateCardProfile) {
        this.corporateCardProfile = corporateCardProfile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeCorporateCards)) return false;
        EmployeeCorporateCards other = (EmployeeCorporateCards) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.embossedName==null && other.getEmbossedName()==null) || 
             (this.embossedName!=null &&
              this.embossedName.equals(other.getEmbossedName()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.corporateCardProfile==null && other.getCorporateCardProfile()==null) || 
             (this.corporateCardProfile!=null &&
              this.corporateCardProfile.equals(other.getCorporateCardProfile())));
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
        if (getEmbossedName() != null) {
            _hashCode += getEmbossedName().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getCorporateCardProfile() != null) {
            _hashCode += getCorporateCardProfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeCorporateCards.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "EmployeeCorporateCards"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embossedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "embossedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateCardProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2024_2.lists.webservices.netsuite.com", "corporateCardProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2024_2.platform.webservices.netsuite.com", "RecordRef"));
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
