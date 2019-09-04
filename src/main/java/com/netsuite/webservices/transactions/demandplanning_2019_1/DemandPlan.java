/**
 * DemandPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2019_1;

public class DemandPlan  implements java.io.Serializable {
    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Double calculatedQuantity;

    private com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlanList periodDemandPlanList;

    public DemandPlan() {
    }

    public DemandPlan(
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Double calculatedQuantity,
           com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlanList periodDemandPlanList) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.calculatedQuantity = calculatedQuantity;
           this.periodDemandPlanList = periodDemandPlanList;
    }


    /**
     * Gets the startDate value for this DemandPlan.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DemandPlan.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DemandPlan.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DemandPlan.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the calculatedQuantity value for this DemandPlan.
     * 
     * @return calculatedQuantity
     */
    public java.lang.Double getCalculatedQuantity() {
        return calculatedQuantity;
    }


    /**
     * Sets the calculatedQuantity value for this DemandPlan.
     * 
     * @param calculatedQuantity
     */
    public void setCalculatedQuantity(java.lang.Double calculatedQuantity) {
        this.calculatedQuantity = calculatedQuantity;
    }


    /**
     * Gets the periodDemandPlanList value for this DemandPlan.
     * 
     * @return periodDemandPlanList
     */
    public com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlanList getPeriodDemandPlanList() {
        return periodDemandPlanList;
    }


    /**
     * Sets the periodDemandPlanList value for this DemandPlan.
     * 
     * @param periodDemandPlanList
     */
    public void setPeriodDemandPlanList(com.netsuite.webservices.transactions.demandplanning_2019_1.PeriodDemandPlanList periodDemandPlanList) {
        this.periodDemandPlanList = periodDemandPlanList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DemandPlan)) return false;
        DemandPlan other = (DemandPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.calculatedQuantity==null && other.getCalculatedQuantity()==null) || 
             (this.calculatedQuantity!=null &&
              this.calculatedQuantity.equals(other.getCalculatedQuantity()))) &&
            ((this.periodDemandPlanList==null && other.getPeriodDemandPlanList()==null) || 
             (this.periodDemandPlanList!=null &&
              this.periodDemandPlanList.equals(other.getPeriodDemandPlanList())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCalculatedQuantity() != null) {
            _hashCode += getCalculatedQuantity().hashCode();
        }
        if (getPeriodDemandPlanList() != null) {
            _hashCode += getPeriodDemandPlanList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DemandPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "DemandPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "calculatedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDemandPlanList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "periodDemandPlanList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:demandplanning_2019_1.transactions.webservices.netsuite.com", "PeriodDemandPlanList"));
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
