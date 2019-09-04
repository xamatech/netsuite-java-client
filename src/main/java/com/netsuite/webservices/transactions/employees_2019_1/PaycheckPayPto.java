/**
 * PaycheckPayPto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2019_1;

public class PaycheckPayPto  implements java.io.Serializable {
    private java.lang.Long payItem;

    private java.lang.String payItemName;

    private java.lang.Double hoursAccrued;

    private java.lang.Double hoursUsed;

    private java.lang.Double hoursBalance;

    public PaycheckPayPto() {
    }

    public PaycheckPayPto(
           java.lang.Long payItem,
           java.lang.String payItemName,
           java.lang.Double hoursAccrued,
           java.lang.Double hoursUsed,
           java.lang.Double hoursBalance) {
           this.payItem = payItem;
           this.payItemName = payItemName;
           this.hoursAccrued = hoursAccrued;
           this.hoursUsed = hoursUsed;
           this.hoursBalance = hoursBalance;
    }


    /**
     * Gets the payItem value for this PaycheckPayPto.
     * 
     * @return payItem
     */
    public java.lang.Long getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this PaycheckPayPto.
     * 
     * @param payItem
     */
    public void setPayItem(java.lang.Long payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the payItemName value for this PaycheckPayPto.
     * 
     * @return payItemName
     */
    public java.lang.String getPayItemName() {
        return payItemName;
    }


    /**
     * Sets the payItemName value for this PaycheckPayPto.
     * 
     * @param payItemName
     */
    public void setPayItemName(java.lang.String payItemName) {
        this.payItemName = payItemName;
    }


    /**
     * Gets the hoursAccrued value for this PaycheckPayPto.
     * 
     * @return hoursAccrued
     */
    public java.lang.Double getHoursAccrued() {
        return hoursAccrued;
    }


    /**
     * Sets the hoursAccrued value for this PaycheckPayPto.
     * 
     * @param hoursAccrued
     */
    public void setHoursAccrued(java.lang.Double hoursAccrued) {
        this.hoursAccrued = hoursAccrued;
    }


    /**
     * Gets the hoursUsed value for this PaycheckPayPto.
     * 
     * @return hoursUsed
     */
    public java.lang.Double getHoursUsed() {
        return hoursUsed;
    }


    /**
     * Sets the hoursUsed value for this PaycheckPayPto.
     * 
     * @param hoursUsed
     */
    public void setHoursUsed(java.lang.Double hoursUsed) {
        this.hoursUsed = hoursUsed;
    }


    /**
     * Gets the hoursBalance value for this PaycheckPayPto.
     * 
     * @return hoursBalance
     */
    public java.lang.Double getHoursBalance() {
        return hoursBalance;
    }


    /**
     * Sets the hoursBalance value for this PaycheckPayPto.
     * 
     * @param hoursBalance
     */
    public void setHoursBalance(java.lang.Double hoursBalance) {
        this.hoursBalance = hoursBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayPto)) return false;
        PaycheckPayPto other = (PaycheckPayPto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              this.payItem.equals(other.getPayItem()))) &&
            ((this.payItemName==null && other.getPayItemName()==null) || 
             (this.payItemName!=null &&
              this.payItemName.equals(other.getPayItemName()))) &&
            ((this.hoursAccrued==null && other.getHoursAccrued()==null) || 
             (this.hoursAccrued!=null &&
              this.hoursAccrued.equals(other.getHoursAccrued()))) &&
            ((this.hoursUsed==null && other.getHoursUsed()==null) || 
             (this.hoursUsed!=null &&
              this.hoursUsed.equals(other.getHoursUsed()))) &&
            ((this.hoursBalance==null && other.getHoursBalance()==null) || 
             (this.hoursBalance!=null &&
              this.hoursBalance.equals(other.getHoursBalance())));
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
        if (getPayItem() != null) {
            _hashCode += getPayItem().hashCode();
        }
        if (getPayItemName() != null) {
            _hashCode += getPayItemName().hashCode();
        }
        if (getHoursAccrued() != null) {
            _hashCode += getHoursAccrued().hashCode();
        }
        if (getHoursUsed() != null) {
            _hashCode += getHoursUsed().hashCode();
        }
        if (getHoursBalance() != null) {
            _hashCode += getHoursBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayPto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "PaycheckPayPto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "payItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursAccrued");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "hoursAccrued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "hoursUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2019_1.transactions.webservices.netsuite.com", "hoursBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
