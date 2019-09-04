/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class Address  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String internalId;

    private com.netsuite.webservices.platform.common_2019_1.types.Country country;

    private java.lang.String attention;

    private java.lang.String addressee;

    private java.lang.String addrPhone;

    private java.lang.String addr1;

    private java.lang.String addr2;

    private java.lang.String addr3;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private java.lang.String addrText;

    private java.lang.Boolean override;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    public Address() {
    }

    public Address(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           com.netsuite.webservices.platform.common_2019_1.types.Country country,
           java.lang.String attention,
           java.lang.String addressee,
           java.lang.String addrPhone,
           java.lang.String addr1,
           java.lang.String addr2,
           java.lang.String addr3,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           java.lang.String addrText,
           java.lang.Boolean override,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.country = country;
        this.attention = attention;
        this.addressee = addressee;
        this.addrPhone = addrPhone;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.addr3 = addr3;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.addrText = addrText;
        this.override = override;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Address.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Address.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the country value for this Address.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Address.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.common_2019_1.types.Country country) {
        this.country = country;
    }


    /**
     * Gets the attention value for this Address.
     * 
     * @return attention
     */
    public java.lang.String getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this Address.
     * 
     * @param attention
     */
    public void setAttention(java.lang.String attention) {
        this.attention = attention;
    }


    /**
     * Gets the addressee value for this Address.
     * 
     * @return addressee
     */
    public java.lang.String getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this Address.
     * 
     * @param addressee
     */
    public void setAddressee(java.lang.String addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addrPhone value for this Address.
     * 
     * @return addrPhone
     */
    public java.lang.String getAddrPhone() {
        return addrPhone;
    }


    /**
     * Sets the addrPhone value for this Address.
     * 
     * @param addrPhone
     */
    public void setAddrPhone(java.lang.String addrPhone) {
        this.addrPhone = addrPhone;
    }


    /**
     * Gets the addr1 value for this Address.
     * 
     * @return addr1
     */
    public java.lang.String getAddr1() {
        return addr1;
    }


    /**
     * Sets the addr1 value for this Address.
     * 
     * @param addr1
     */
    public void setAddr1(java.lang.String addr1) {
        this.addr1 = addr1;
    }


    /**
     * Gets the addr2 value for this Address.
     * 
     * @return addr2
     */
    public java.lang.String getAddr2() {
        return addr2;
    }


    /**
     * Sets the addr2 value for this Address.
     * 
     * @param addr2
     */
    public void setAddr2(java.lang.String addr2) {
        this.addr2 = addr2;
    }


    /**
     * Gets the addr3 value for this Address.
     * 
     * @return addr3
     */
    public java.lang.String getAddr3() {
        return addr3;
    }


    /**
     * Sets the addr3 value for this Address.
     * 
     * @param addr3
     */
    public void setAddr3(java.lang.String addr3) {
        this.addr3 = addr3;
    }


    /**
     * Gets the city value for this Address.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Address.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Address.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Address.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this Address.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Address.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the addrText value for this Address.
     * 
     * @return addrText
     */
    public java.lang.String getAddrText() {
        return addrText;
    }


    /**
     * Sets the addrText value for this Address.
     * 
     * @param addrText
     */
    public void setAddrText(java.lang.String addrText) {
        this.addrText = addrText;
    }


    /**
     * Gets the override value for this Address.
     * 
     * @return override
     */
    public java.lang.Boolean getOverride() {
        return override;
    }


    /**
     * Sets the override value for this Address.
     * 
     * @param override
     */
    public void setOverride(java.lang.Boolean override) {
        this.override = override;
    }


    /**
     * Gets the customFieldList value for this Address.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Address.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addrPhone==null && other.getAddrPhone()==null) || 
             (this.addrPhone!=null &&
              this.addrPhone.equals(other.getAddrPhone()))) &&
            ((this.addr1==null && other.getAddr1()==null) || 
             (this.addr1!=null &&
              this.addr1.equals(other.getAddr1()))) &&
            ((this.addr2==null && other.getAddr2()==null) || 
             (this.addr2!=null &&
              this.addr2.equals(other.getAddr2()))) &&
            ((this.addr3==null && other.getAddr3()==null) || 
             (this.addr3!=null &&
              this.addr3.equals(other.getAddr3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.addrText==null && other.getAddrText()==null) || 
             (this.addrText!=null &&
              this.addrText.equals(other.getAddrText()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddrPhone() != null) {
            _hashCode += getAddrPhone().hashCode();
        }
        if (getAddr1() != null) {
            _hashCode += getAddr1().hashCode();
        }
        if (getAddr2() != null) {
            _hashCode += getAddr2().hashCode();
        }
        if (getAddr3() != null) {
            _hashCode += getAddr3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getAddrText() != null) {
            _hashCode += getAddrText().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addrPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addr3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addrText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
