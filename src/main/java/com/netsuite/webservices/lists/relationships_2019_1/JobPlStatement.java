/**
 * JobPlStatement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobPlStatement  implements java.io.Serializable {
    private java.lang.String costCategory;

    private java.lang.Double revenue;

    private java.lang.Double cost;

    private java.lang.Double profit;

    private java.lang.Double margin;

    public JobPlStatement() {
    }

    public JobPlStatement(
           java.lang.String costCategory,
           java.lang.Double revenue,
           java.lang.Double cost,
           java.lang.Double profit,
           java.lang.Double margin) {
           this.costCategory = costCategory;
           this.revenue = revenue;
           this.cost = cost;
           this.profit = profit;
           this.margin = margin;
    }


    /**
     * Gets the costCategory value for this JobPlStatement.
     * 
     * @return costCategory
     */
    public java.lang.String getCostCategory() {
        return costCategory;
    }


    /**
     * Sets the costCategory value for this JobPlStatement.
     * 
     * @param costCategory
     */
    public void setCostCategory(java.lang.String costCategory) {
        this.costCategory = costCategory;
    }


    /**
     * Gets the revenue value for this JobPlStatement.
     * 
     * @return revenue
     */
    public java.lang.Double getRevenue() {
        return revenue;
    }


    /**
     * Sets the revenue value for this JobPlStatement.
     * 
     * @param revenue
     */
    public void setRevenue(java.lang.Double revenue) {
        this.revenue = revenue;
    }


    /**
     * Gets the cost value for this JobPlStatement.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this JobPlStatement.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the profit value for this JobPlStatement.
     * 
     * @return profit
     */
    public java.lang.Double getProfit() {
        return profit;
    }


    /**
     * Sets the profit value for this JobPlStatement.
     * 
     * @param profit
     */
    public void setProfit(java.lang.Double profit) {
        this.profit = profit;
    }


    /**
     * Gets the margin value for this JobPlStatement.
     * 
     * @return margin
     */
    public java.lang.Double getMargin() {
        return margin;
    }


    /**
     * Sets the margin value for this JobPlStatement.
     * 
     * @param margin
     */
    public void setMargin(java.lang.Double margin) {
        this.margin = margin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobPlStatement)) return false;
        JobPlStatement other = (JobPlStatement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.costCategory==null && other.getCostCategory()==null) || 
             (this.costCategory!=null &&
              this.costCategory.equals(other.getCostCategory()))) &&
            ((this.revenue==null && other.getRevenue()==null) || 
             (this.revenue!=null &&
              this.revenue.equals(other.getRevenue()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.profit==null && other.getProfit()==null) || 
             (this.profit!=null &&
              this.profit.equals(other.getProfit()))) &&
            ((this.margin==null && other.getMargin()==null) || 
             (this.margin!=null &&
              this.margin.equals(other.getMargin())));
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
        if (getCostCategory() != null) {
            _hashCode += getCostCategory().hashCode();
        }
        if (getRevenue() != null) {
            _hashCode += getRevenue().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getProfit() != null) {
            _hashCode += getProfit().hashCode();
        }
        if (getMargin() != null) {
            _hashCode += getMargin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobPlStatement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPlStatement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "profit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "margin"));
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
