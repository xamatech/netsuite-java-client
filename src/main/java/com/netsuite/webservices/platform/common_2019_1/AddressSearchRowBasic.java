/**
 * AddressSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class AddressSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] override;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public AddressSearchRowBasic() {
    }

    public AddressSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] override,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.attention = attention;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.externalId = externalId;
        this.internalId = internalId;
        this.override = override;
        this.phone = phone;
        this.state = state;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this AddressSearchRowBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AddressSearchRowBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address) {
        this.address = address;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the address1 value for this AddressSearchRowBasic.
     * 
     * @return address1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this AddressSearchRowBasic.
     * 
     * @param address1
     */
    public void setAddress1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address1[i] = _value;
    }


    /**
     * Gets the address2 value for this AddressSearchRowBasic.
     * 
     * @return address2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this AddressSearchRowBasic.
     * 
     * @param address2
     */
    public void setAddress2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address2[i] = _value;
    }


    /**
     * Gets the address3 value for this AddressSearchRowBasic.
     * 
     * @return address3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this AddressSearchRowBasic.
     * 
     * @param address3
     */
    public void setAddress3(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address3[i] = _value;
    }


    /**
     * Gets the addressee value for this AddressSearchRowBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this AddressSearchRowBasic.
     * 
     * @param addressee
     */
    public void setAddressee(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressee) {
        this.addressee = addressee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddressee(int i) {
        return this.addressee[i];
    }

    public void setAddressee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.addressee[i] = _value;
    }


    /**
     * Gets the attention value for this AddressSearchRowBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this AddressSearchRowBasic.
     * 
     * @param attention
     */
    public void setAttention(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention) {
        this.attention = attention;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAttention(int i) {
        return this.attention[i];
    }

    public void setAttention(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.attention[i] = _value;
    }


    /**
     * Gets the city value for this AddressSearchRowBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this AddressSearchRowBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city) {
        this.city = city;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.city[i] = _value;
    }


    /**
     * Gets the country value for this AddressSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AddressSearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the countryCode value for this AddressSearchRowBasic.
     * 
     * @return countryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this AddressSearchRowBasic.
     * 
     * @param countryCode
     */
    public void setCountryCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode) {
        this.countryCode = countryCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCountryCode(int i) {
        return this.countryCode[i];
    }

    public void setCountryCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.countryCode[i] = _value;
    }


    /**
     * Gets the externalId value for this AddressSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AddressSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the internalId value for this AddressSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AddressSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the override value for this AddressSearchRowBasic.
     * 
     * @return override
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getOverride() {
        return override;
    }


    /**
     * Sets the override value for this AddressSearchRowBasic.
     * 
     * @param override
     */
    public void setOverride(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] override) {
        this.override = override;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getOverride(int i) {
        return this.override[i];
    }

    public void setOverride(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.override[i] = _value;
    }


    /**
     * Gets the phone value for this AddressSearchRowBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this AddressSearchRowBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the state value for this AddressSearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this AddressSearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the zip value for this AddressSearchRowBasic.
     * 
     * @return zip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this AddressSearchRowBasic.
     * 
     * @param zip
     */
    public void setZip(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.zip[i] = _value;
    }


    /**
     * Gets the customFieldList value for this AddressSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AddressSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressSearchRowBasic)) return false;
        AddressSearchRowBasic other = (AddressSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              java.util.Arrays.equals(this.address1, other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              java.util.Arrays.equals(this.address2, other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              java.util.Arrays.equals(this.address3, other.getAddress3()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              java.util.Arrays.equals(this.addressee, other.getAddressee()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              java.util.Arrays.equals(this.attention, other.getAttention()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              java.util.Arrays.equals(this.override, other.getOverride()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              java.util.Arrays.equals(this.zip, other.getZip()))) &&
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
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
