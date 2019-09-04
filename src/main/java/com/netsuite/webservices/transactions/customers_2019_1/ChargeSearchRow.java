/**
 * ChargeSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2019_1;

public class ChargeSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ChargeSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic billingAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic billingScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic chargeEmployeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic invoiceJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic salesOrderJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.UsageSearchRowBasic usageJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public ChargeSearchRow() {
    }

    public ChargeSearchRow(
           com.netsuite.webservices.platform.common_2019_1.ChargeSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic billingAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic billingScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic chargeEmployeeJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic invoiceJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic salesOrderJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.UsageSearchRowBasic usageJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.billingAccountJoin = billingAccountJoin;
        this.billingScheduleJoin = billingScheduleJoin;
        this.chargeEmployeeJoin = chargeEmployeeJoin;
        this.customerJoin = customerJoin;
        this.invoiceJoin = invoiceJoin;
        this.itemJoin = itemJoin;
        this.jobJoin = jobJoin;
        this.salesOrderJoin = salesOrderJoin;
        this.timeJoin = timeJoin;
        this.transactionJoin = transactionJoin;
        this.usageJoin = usageJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ChargeSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ChargeSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ChargeSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ChargeSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the billingAccountJoin value for this ChargeSearchRow.
     * 
     * @return billingAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }


    /**
     * Sets the billingAccountJoin value for this ChargeSearchRow.
     * 
     * @param billingAccountJoin
     */
    public void setBillingAccountJoin(com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic billingAccountJoin) {
        this.billingAccountJoin = billingAccountJoin;
    }


    /**
     * Gets the billingScheduleJoin value for this ChargeSearchRow.
     * 
     * @return billingScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }


    /**
     * Sets the billingScheduleJoin value for this ChargeSearchRow.
     * 
     * @param billingScheduleJoin
     */
    public void setBillingScheduleJoin(com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic billingScheduleJoin) {
        this.billingScheduleJoin = billingScheduleJoin;
    }


    /**
     * Gets the chargeEmployeeJoin value for this ChargeSearchRow.
     * 
     * @return chargeEmployeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getChargeEmployeeJoin() {
        return chargeEmployeeJoin;
    }


    /**
     * Sets the chargeEmployeeJoin value for this ChargeSearchRow.
     * 
     * @param chargeEmployeeJoin
     */
    public void setChargeEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic chargeEmployeeJoin) {
        this.chargeEmployeeJoin = chargeEmployeeJoin;
    }


    /**
     * Gets the customerJoin value for this ChargeSearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this ChargeSearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the invoiceJoin value for this ChargeSearchRow.
     * 
     * @return invoiceJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getInvoiceJoin() {
        return invoiceJoin;
    }


    /**
     * Sets the invoiceJoin value for this ChargeSearchRow.
     * 
     * @param invoiceJoin
     */
    public void setInvoiceJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic invoiceJoin) {
        this.invoiceJoin = invoiceJoin;
    }


    /**
     * Gets the itemJoin value for this ChargeSearchRow.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this ChargeSearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the jobJoin value for this ChargeSearchRow.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this ChargeSearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the salesOrderJoin value for this ChargeSearchRow.
     * 
     * @return salesOrderJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }


    /**
     * Sets the salesOrderJoin value for this ChargeSearchRow.
     * 
     * @param salesOrderJoin
     */
    public void setSalesOrderJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic salesOrderJoin) {
        this.salesOrderJoin = salesOrderJoin;
    }


    /**
     * Gets the timeJoin value for this ChargeSearchRow.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this ChargeSearchRow.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the transactionJoin value for this ChargeSearchRow.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ChargeSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the usageJoin value for this ChargeSearchRow.
     * 
     * @return usageJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.UsageSearchRowBasic getUsageJoin() {
        return usageJoin;
    }


    /**
     * Sets the usageJoin value for this ChargeSearchRow.
     * 
     * @param usageJoin
     */
    public void setUsageJoin(com.netsuite.webservices.platform.common_2019_1.UsageSearchRowBasic usageJoin) {
        this.usageJoin = usageJoin;
    }


    /**
     * Gets the userJoin value for this ChargeSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ChargeSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the customSearchJoin value for this ChargeSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ChargeSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeSearchRow)) return false;
        ChargeSearchRow other = (ChargeSearchRow) obj;
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
            ((this.billingAccountJoin==null && other.getBillingAccountJoin()==null) || 
             (this.billingAccountJoin!=null &&
              this.billingAccountJoin.equals(other.getBillingAccountJoin()))) &&
            ((this.billingScheduleJoin==null && other.getBillingScheduleJoin()==null) || 
             (this.billingScheduleJoin!=null &&
              this.billingScheduleJoin.equals(other.getBillingScheduleJoin()))) &&
            ((this.chargeEmployeeJoin==null && other.getChargeEmployeeJoin()==null) || 
             (this.chargeEmployeeJoin!=null &&
              this.chargeEmployeeJoin.equals(other.getChargeEmployeeJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.invoiceJoin==null && other.getInvoiceJoin()==null) || 
             (this.invoiceJoin!=null &&
              this.invoiceJoin.equals(other.getInvoiceJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.salesOrderJoin==null && other.getSalesOrderJoin()==null) || 
             (this.salesOrderJoin!=null &&
              this.salesOrderJoin.equals(other.getSalesOrderJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.usageJoin==null && other.getUsageJoin()==null) || 
             (this.usageJoin!=null &&
              this.usageJoin.equals(other.getUsageJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBillingAccountJoin() != null) {
            _hashCode += getBillingAccountJoin().hashCode();
        }
        if (getBillingScheduleJoin() != null) {
            _hashCode += getBillingScheduleJoin().hashCode();
        }
        if (getChargeEmployeeJoin() != null) {
            _hashCode += getChargeEmployeeJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getInvoiceJoin() != null) {
            _hashCode += getInvoiceJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getSalesOrderJoin() != null) {
            _hashCode += getSalesOrderJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUsageJoin() != null) {
            _hashCode += getUsageJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
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
        new org.apache.axis.description.TypeDesc(ChargeSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "ChargeSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ChargeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billingAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "billingScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingScheduleSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeEmployeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "chargeEmployeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "invoiceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "salesOrderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "usageJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "UsageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2019_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
