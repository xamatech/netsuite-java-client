/**
 * InventoryAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class InventoryAssignment  implements java.io.Serializable {
    private java.lang.String internalId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef issueInventoryNumber;

    private java.lang.String receiptInventoryNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef binNumber;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef toBinNumber;

    private java.lang.Double quantity;

    private java.util.Calendar expirationDate;

    private java.lang.Double quantityAvailable;

    public InventoryAssignment() {
    }

    public InventoryAssignment(
           java.lang.String internalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef issueInventoryNumber,
           java.lang.String receiptInventoryNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef binNumber,
           com.netsuite.webservices.platform.core_2019_1.RecordRef toBinNumber,
           java.lang.Double quantity,
           java.util.Calendar expirationDate,
           java.lang.Double quantityAvailable) {
           this.internalId = internalId;
           this.issueInventoryNumber = issueInventoryNumber;
           this.receiptInventoryNumber = receiptInventoryNumber;
           this.binNumber = binNumber;
           this.toBinNumber = toBinNumber;
           this.quantity = quantity;
           this.expirationDate = expirationDate;
           this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the internalId value for this InventoryAssignment.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InventoryAssignment.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the issueInventoryNumber value for this InventoryAssignment.
     * 
     * @return issueInventoryNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIssueInventoryNumber() {
        return issueInventoryNumber;
    }


    /**
     * Sets the issueInventoryNumber value for this InventoryAssignment.
     * 
     * @param issueInventoryNumber
     */
    public void setIssueInventoryNumber(com.netsuite.webservices.platform.core_2019_1.RecordRef issueInventoryNumber) {
        this.issueInventoryNumber = issueInventoryNumber;
    }


    /**
     * Gets the receiptInventoryNumber value for this InventoryAssignment.
     * 
     * @return receiptInventoryNumber
     */
    public java.lang.String getReceiptInventoryNumber() {
        return receiptInventoryNumber;
    }


    /**
     * Sets the receiptInventoryNumber value for this InventoryAssignment.
     * 
     * @param receiptInventoryNumber
     */
    public void setReceiptInventoryNumber(java.lang.String receiptInventoryNumber) {
        this.receiptInventoryNumber = receiptInventoryNumber;
    }


    /**
     * Gets the binNumber value for this InventoryAssignment.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this InventoryAssignment.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.RecordRef binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the toBinNumber value for this InventoryAssignment.
     * 
     * @return toBinNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getToBinNumber() {
        return toBinNumber;
    }


    /**
     * Sets the toBinNumber value for this InventoryAssignment.
     * 
     * @param toBinNumber
     */
    public void setToBinNumber(com.netsuite.webservices.platform.core_2019_1.RecordRef toBinNumber) {
        this.toBinNumber = toBinNumber;
    }


    /**
     * Gets the quantity value for this InventoryAssignment.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this InventoryAssignment.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the expirationDate value for this InventoryAssignment.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this InventoryAssignment.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the quantityAvailable value for this InventoryAssignment.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this InventoryAssignment.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryAssignment)) return false;
        InventoryAssignment other = (InventoryAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.issueInventoryNumber==null && other.getIssueInventoryNumber()==null) || 
             (this.issueInventoryNumber!=null &&
              this.issueInventoryNumber.equals(other.getIssueInventoryNumber()))) &&
            ((this.receiptInventoryNumber==null && other.getReceiptInventoryNumber()==null) || 
             (this.receiptInventoryNumber!=null &&
              this.receiptInventoryNumber.equals(other.getReceiptInventoryNumber()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.toBinNumber==null && other.getToBinNumber()==null) || 
             (this.toBinNumber!=null &&
              this.toBinNumber.equals(other.getToBinNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable())));
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getIssueInventoryNumber() != null) {
            _hashCode += getIssueInventoryNumber().hashCode();
        }
        if (getReceiptInventoryNumber() != null) {
            _hashCode += getReceiptInventoryNumber().hashCode();
        }
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getToBinNumber() != null) {
            _hashCode += getToBinNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "InventoryAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueInventoryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "issueInventoryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptInventoryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptInventoryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBinNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toBinNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityAvailable"));
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
