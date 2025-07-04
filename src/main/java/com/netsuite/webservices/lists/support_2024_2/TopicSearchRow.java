/**
 * TopicSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.support_2024_2;

public class TopicSearchRow  extends com.netsuite.webservices.platform.core_2024_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.TopicSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2024_2.SolutionSearchRowBasic solutionJoin;

    private com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin;

    public TopicSearchRow() {
    }

    public TopicSearchRow(
           com.netsuite.webservices.platform.common_2024_2.TopicSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2024_2.SolutionSearchRowBasic solutionJoin,
           com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin) {
        this.basic = basic;
        this.solutionJoin = solutionJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this TopicSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2024_2.TopicSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TopicSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2024_2.TopicSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the solutionJoin value for this TopicSearchRow.
     * 
     * @return solutionJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.SolutionSearchRowBasic getSolutionJoin() {
        return solutionJoin;
    }


    /**
     * Sets the solutionJoin value for this TopicSearchRow.
     * 
     * @param solutionJoin
     */
    public void setSolutionJoin(com.netsuite.webservices.platform.common_2024_2.SolutionSearchRowBasic solutionJoin) {
        this.solutionJoin = solutionJoin;
    }


    /**
     * Gets the userJoin value for this TopicSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this TopicSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2024_2.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopicSearchRow)) return false;
        TopicSearchRow other = (TopicSearchRow) obj;
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
            ((this.solutionJoin==null && other.getSolutionJoin()==null) || 
             (this.solutionJoin!=null &&
              this.solutionJoin.equals(other.getSolutionJoin()))) &&
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
        if (getSolutionJoin() != null) {
            _hashCode += getSolutionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopicSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2024_2.lists.webservices.netsuite.com", "TopicSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2024_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "TopicSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2024_2.lists.webservices.netsuite.com", "solutionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "SolutionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2024_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
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
