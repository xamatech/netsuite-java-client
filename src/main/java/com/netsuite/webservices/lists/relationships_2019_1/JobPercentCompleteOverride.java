/**
 * JobPercentCompleteOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobPercentCompleteOverride  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef period;

    private java.lang.Double percent;

    private java.lang.String comments;

    public JobPercentCompleteOverride() {
    }

    public JobPercentCompleteOverride(
           com.netsuite.webservices.platform.core_2019_1.RecordRef period,
           java.lang.Double percent,
           java.lang.String comments) {
           this.period = period;
           this.percent = percent;
           this.comments = comments;
    }


    /**
     * Gets the period value for this JobPercentCompleteOverride.
     * 
     * @return period
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this JobPercentCompleteOverride.
     * 
     * @param period
     */
    public void setPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef period) {
        this.period = period;
    }


    /**
     * Gets the percent value for this JobPercentCompleteOverride.
     * 
     * @return percent
     */
    public java.lang.Double getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this JobPercentCompleteOverride.
     * 
     * @param percent
     */
    public void setPercent(java.lang.Double percent) {
        this.percent = percent;
    }


    /**
     * Gets the comments value for this JobPercentCompleteOverride.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this JobPercentCompleteOverride.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobPercentCompleteOverride)) return false;
        JobPercentCompleteOverride other = (JobPercentCompleteOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobPercentCompleteOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobPercentCompleteOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
