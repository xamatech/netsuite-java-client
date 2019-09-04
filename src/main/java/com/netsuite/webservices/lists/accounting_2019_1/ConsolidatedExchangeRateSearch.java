/**
 * ConsolidatedExchangeRateSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ConsolidatedExchangeRateSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic fromSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchBasic periodJoin;

    private com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic toSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    public ConsolidatedExchangeRateSearch() {
    }

    public ConsolidatedExchangeRateSearch(
           com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic fromSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchBasic periodJoin,
           com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic toSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.basic = basic;
        this.fromSubsidiaryJoin = fromSubsidiaryJoin;
        this.periodJoin = periodJoin;
        this.toSubsidiaryJoin = toSubsidiaryJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this ConsolidatedExchangeRateSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ConsolidatedExchangeRateSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the fromSubsidiaryJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @return fromSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic getFromSubsidiaryJoin() {
        return fromSubsidiaryJoin;
    }


    /**
     * Sets the fromSubsidiaryJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @param fromSubsidiaryJoin
     */
    public void setFromSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic fromSubsidiaryJoin) {
        this.fromSubsidiaryJoin = fromSubsidiaryJoin;
    }


    /**
     * Gets the periodJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @return periodJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchBasic getPeriodJoin() {
        return periodJoin;
    }


    /**
     * Sets the periodJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @param periodJoin
     */
    public void setPeriodJoin(com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchBasic periodJoin) {
        this.periodJoin = periodJoin;
    }


    /**
     * Gets the toSubsidiaryJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @return toSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic getToSubsidiaryJoin() {
        return toSubsidiaryJoin;
    }


    /**
     * Sets the toSubsidiaryJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @param toSubsidiaryJoin
     */
    public void setToSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchBasic toSubsidiaryJoin) {
        this.toSubsidiaryJoin = toSubsidiaryJoin;
    }


    /**
     * Gets the userJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ConsolidatedExchangeRateSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearch)) return false;
        ConsolidatedExchangeRateSearch other = (ConsolidatedExchangeRateSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.fromSubsidiaryJoin==null && other.getFromSubsidiaryJoin()==null) || 
             (this.fromSubsidiaryJoin!=null &&
              this.fromSubsidiaryJoin.equals(other.getFromSubsidiaryJoin()))) &&
            ((this.periodJoin==null && other.getPeriodJoin()==null) || 
             (this.periodJoin!=null &&
              this.periodJoin.equals(other.getPeriodJoin()))) &&
            ((this.toSubsidiaryJoin==null && other.getToSubsidiaryJoin()==null) || 
             (this.toSubsidiaryJoin!=null &&
              this.toSubsidiaryJoin.equals(other.getToSubsidiaryJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getFromSubsidiaryJoin() != null) {
            _hashCode += getFromSubsidiaryJoin().hashCode();
        }
        if (getPeriodJoin() != null) {
            _hashCode += getPeriodJoin().hashCode();
        }
        if (getToSubsidiaryJoin() != null) {
            _hashCode += getToSubsidiaryJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidatedExchangeRateSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRateSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fromSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "periodJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingPeriodSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "toSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
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
