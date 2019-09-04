/**
 * JobMilestones.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class JobMilestones  implements java.io.Serializable {
    private java.lang.String milestoneName;

    private java.lang.String milestoneOrder;

    private java.util.Calendar milestoneEstComplete;

    private java.lang.Boolean milestoneCompleted;

    private java.lang.String milestoneComments;

    public JobMilestones() {
    }

    public JobMilestones(
           java.lang.String milestoneName,
           java.lang.String milestoneOrder,
           java.util.Calendar milestoneEstComplete,
           java.lang.Boolean milestoneCompleted,
           java.lang.String milestoneComments) {
           this.milestoneName = milestoneName;
           this.milestoneOrder = milestoneOrder;
           this.milestoneEstComplete = milestoneEstComplete;
           this.milestoneCompleted = milestoneCompleted;
           this.milestoneComments = milestoneComments;
    }


    /**
     * Gets the milestoneName value for this JobMilestones.
     * 
     * @return milestoneName
     */
    public java.lang.String getMilestoneName() {
        return milestoneName;
    }


    /**
     * Sets the milestoneName value for this JobMilestones.
     * 
     * @param milestoneName
     */
    public void setMilestoneName(java.lang.String milestoneName) {
        this.milestoneName = milestoneName;
    }


    /**
     * Gets the milestoneOrder value for this JobMilestones.
     * 
     * @return milestoneOrder
     */
    public java.lang.String getMilestoneOrder() {
        return milestoneOrder;
    }


    /**
     * Sets the milestoneOrder value for this JobMilestones.
     * 
     * @param milestoneOrder
     */
    public void setMilestoneOrder(java.lang.String milestoneOrder) {
        this.milestoneOrder = milestoneOrder;
    }


    /**
     * Gets the milestoneEstComplete value for this JobMilestones.
     * 
     * @return milestoneEstComplete
     */
    public java.util.Calendar getMilestoneEstComplete() {
        return milestoneEstComplete;
    }


    /**
     * Sets the milestoneEstComplete value for this JobMilestones.
     * 
     * @param milestoneEstComplete
     */
    public void setMilestoneEstComplete(java.util.Calendar milestoneEstComplete) {
        this.milestoneEstComplete = milestoneEstComplete;
    }


    /**
     * Gets the milestoneCompleted value for this JobMilestones.
     * 
     * @return milestoneCompleted
     */
    public java.lang.Boolean getMilestoneCompleted() {
        return milestoneCompleted;
    }


    /**
     * Sets the milestoneCompleted value for this JobMilestones.
     * 
     * @param milestoneCompleted
     */
    public void setMilestoneCompleted(java.lang.Boolean milestoneCompleted) {
        this.milestoneCompleted = milestoneCompleted;
    }


    /**
     * Gets the milestoneComments value for this JobMilestones.
     * 
     * @return milestoneComments
     */
    public java.lang.String getMilestoneComments() {
        return milestoneComments;
    }


    /**
     * Sets the milestoneComments value for this JobMilestones.
     * 
     * @param milestoneComments
     */
    public void setMilestoneComments(java.lang.String milestoneComments) {
        this.milestoneComments = milestoneComments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobMilestones)) return false;
        JobMilestones other = (JobMilestones) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.milestoneName==null && other.getMilestoneName()==null) || 
             (this.milestoneName!=null &&
              this.milestoneName.equals(other.getMilestoneName()))) &&
            ((this.milestoneOrder==null && other.getMilestoneOrder()==null) || 
             (this.milestoneOrder!=null &&
              this.milestoneOrder.equals(other.getMilestoneOrder()))) &&
            ((this.milestoneEstComplete==null && other.getMilestoneEstComplete()==null) || 
             (this.milestoneEstComplete!=null &&
              this.milestoneEstComplete.equals(other.getMilestoneEstComplete()))) &&
            ((this.milestoneCompleted==null && other.getMilestoneCompleted()==null) || 
             (this.milestoneCompleted!=null &&
              this.milestoneCompleted.equals(other.getMilestoneCompleted()))) &&
            ((this.milestoneComments==null && other.getMilestoneComments()==null) || 
             (this.milestoneComments!=null &&
              this.milestoneComments.equals(other.getMilestoneComments())));
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
        if (getMilestoneName() != null) {
            _hashCode += getMilestoneName().hashCode();
        }
        if (getMilestoneOrder() != null) {
            _hashCode += getMilestoneOrder().hashCode();
        }
        if (getMilestoneEstComplete() != null) {
            _hashCode += getMilestoneEstComplete().hashCode();
        }
        if (getMilestoneCompleted() != null) {
            _hashCode += getMilestoneCompleted().hashCode();
        }
        if (getMilestoneComments() != null) {
            _hashCode += getMilestoneComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobMilestones.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "JobMilestones"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "milestoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "milestoneOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneEstComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "milestoneEstComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "milestoneCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "milestoneComments"));
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
