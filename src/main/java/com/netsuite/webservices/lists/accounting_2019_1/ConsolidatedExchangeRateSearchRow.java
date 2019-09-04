/**
 * ConsolidatedExchangeRateSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class ConsolidatedExchangeRateSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic fromSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic periodJoin;

    private com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic toSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    public ConsolidatedExchangeRateSearchRow() {
    }

    public ConsolidatedExchangeRateSearchRow(
           com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic fromSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic periodJoin,
           com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic toSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.basic = basic;
        this.fromSubsidiaryJoin = fromSubsidiaryJoin;
        this.periodJoin = periodJoin;
        this.toSubsidiaryJoin = toSubsidiaryJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ConsolidatedExchangeRateSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the fromSubsidiaryJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @return fromSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic getFromSubsidiaryJoin() {
        return fromSubsidiaryJoin;
    }


    /**
     * Sets the fromSubsidiaryJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @param fromSubsidiaryJoin
     */
    public void setFromSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic fromSubsidiaryJoin) {
        this.fromSubsidiaryJoin = fromSubsidiaryJoin;
    }


    /**
     * Gets the periodJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @return periodJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic getPeriodJoin() {
        return periodJoin;
    }


    /**
     * Sets the periodJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @param periodJoin
     */
    public void setPeriodJoin(com.netsuite.webservices.platform.common_2019_1.AccountingPeriodSearchRowBasic periodJoin) {
        this.periodJoin = periodJoin;
    }


    /**
     * Gets the toSubsidiaryJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @return toSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic getToSubsidiaryJoin() {
        return toSubsidiaryJoin;
    }


    /**
     * Sets the toSubsidiaryJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @param toSubsidiaryJoin
     */
    public void setToSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.SubsidiarySearchRowBasic toSubsidiaryJoin) {
        this.toSubsidiaryJoin = toSubsidiaryJoin;
    }


    /**
     * Gets the userJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ConsolidatedExchangeRateSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearchRow)) return false;
        ConsolidatedExchangeRateSearchRow other = (ConsolidatedExchangeRateSearchRow) obj;
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
        new org.apache.axis.description.TypeDesc(ConsolidatedExchangeRateSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "fromSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "periodJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "toSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
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
