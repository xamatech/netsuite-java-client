/**
 * LocationBusinessHours.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2019_1;

public class LocationBusinessHours  implements java.io.Serializable {
    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private java.lang.Boolean isSunday;

    private java.lang.Boolean isMonday;

    private java.lang.Boolean isTuesday;

    private java.lang.Boolean isWednesday;

    private java.lang.Boolean isThursday;

    private java.lang.Boolean isFriday;

    private java.lang.Boolean isSaturday;

    private java.util.Calendar sameDayPickupCutOffTime;

    public LocationBusinessHours() {
    }

    public LocationBusinessHours(
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           java.lang.Boolean isSunday,
           java.lang.Boolean isMonday,
           java.lang.Boolean isTuesday,
           java.lang.Boolean isWednesday,
           java.lang.Boolean isThursday,
           java.lang.Boolean isFriday,
           java.lang.Boolean isSaturday,
           java.util.Calendar sameDayPickupCutOffTime) {
           this.startTime = startTime;
           this.endTime = endTime;
           this.isSunday = isSunday;
           this.isMonday = isMonday;
           this.isTuesday = isTuesday;
           this.isWednesday = isWednesday;
           this.isThursday = isThursday;
           this.isFriday = isFriday;
           this.isSaturday = isSaturday;
           this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }


    /**
     * Gets the startTime value for this LocationBusinessHours.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this LocationBusinessHours.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this LocationBusinessHours.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this LocationBusinessHours.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the isSunday value for this LocationBusinessHours.
     * 
     * @return isSunday
     */
    public java.lang.Boolean getIsSunday() {
        return isSunday;
    }


    /**
     * Sets the isSunday value for this LocationBusinessHours.
     * 
     * @param isSunday
     */
    public void setIsSunday(java.lang.Boolean isSunday) {
        this.isSunday = isSunday;
    }


    /**
     * Gets the isMonday value for this LocationBusinessHours.
     * 
     * @return isMonday
     */
    public java.lang.Boolean getIsMonday() {
        return isMonday;
    }


    /**
     * Sets the isMonday value for this LocationBusinessHours.
     * 
     * @param isMonday
     */
    public void setIsMonday(java.lang.Boolean isMonday) {
        this.isMonday = isMonday;
    }


    /**
     * Gets the isTuesday value for this LocationBusinessHours.
     * 
     * @return isTuesday
     */
    public java.lang.Boolean getIsTuesday() {
        return isTuesday;
    }


    /**
     * Sets the isTuesday value for this LocationBusinessHours.
     * 
     * @param isTuesday
     */
    public void setIsTuesday(java.lang.Boolean isTuesday) {
        this.isTuesday = isTuesday;
    }


    /**
     * Gets the isWednesday value for this LocationBusinessHours.
     * 
     * @return isWednesday
     */
    public java.lang.Boolean getIsWednesday() {
        return isWednesday;
    }


    /**
     * Sets the isWednesday value for this LocationBusinessHours.
     * 
     * @param isWednesday
     */
    public void setIsWednesday(java.lang.Boolean isWednesday) {
        this.isWednesday = isWednesday;
    }


    /**
     * Gets the isThursday value for this LocationBusinessHours.
     * 
     * @return isThursday
     */
    public java.lang.Boolean getIsThursday() {
        return isThursday;
    }


    /**
     * Sets the isThursday value for this LocationBusinessHours.
     * 
     * @param isThursday
     */
    public void setIsThursday(java.lang.Boolean isThursday) {
        this.isThursday = isThursday;
    }


    /**
     * Gets the isFriday value for this LocationBusinessHours.
     * 
     * @return isFriday
     */
    public java.lang.Boolean getIsFriday() {
        return isFriday;
    }


    /**
     * Sets the isFriday value for this LocationBusinessHours.
     * 
     * @param isFriday
     */
    public void setIsFriday(java.lang.Boolean isFriday) {
        this.isFriday = isFriday;
    }


    /**
     * Gets the isSaturday value for this LocationBusinessHours.
     * 
     * @return isSaturday
     */
    public java.lang.Boolean getIsSaturday() {
        return isSaturday;
    }


    /**
     * Sets the isSaturday value for this LocationBusinessHours.
     * 
     * @param isSaturday
     */
    public void setIsSaturday(java.lang.Boolean isSaturday) {
        this.isSaturday = isSaturday;
    }


    /**
     * Gets the sameDayPickupCutOffTime value for this LocationBusinessHours.
     * 
     * @return sameDayPickupCutOffTime
     */
    public java.util.Calendar getSameDayPickupCutOffTime() {
        return sameDayPickupCutOffTime;
    }


    /**
     * Sets the sameDayPickupCutOffTime value for this LocationBusinessHours.
     * 
     * @param sameDayPickupCutOffTime
     */
    public void setSameDayPickupCutOffTime(java.util.Calendar sameDayPickupCutOffTime) {
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationBusinessHours)) return false;
        LocationBusinessHours other = (LocationBusinessHours) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.isSunday==null && other.getIsSunday()==null) || 
             (this.isSunday!=null &&
              this.isSunday.equals(other.getIsSunday()))) &&
            ((this.isMonday==null && other.getIsMonday()==null) || 
             (this.isMonday!=null &&
              this.isMonday.equals(other.getIsMonday()))) &&
            ((this.isTuesday==null && other.getIsTuesday()==null) || 
             (this.isTuesday!=null &&
              this.isTuesday.equals(other.getIsTuesday()))) &&
            ((this.isWednesday==null && other.getIsWednesday()==null) || 
             (this.isWednesday!=null &&
              this.isWednesday.equals(other.getIsWednesday()))) &&
            ((this.isThursday==null && other.getIsThursday()==null) || 
             (this.isThursday!=null &&
              this.isThursday.equals(other.getIsThursday()))) &&
            ((this.isFriday==null && other.getIsFriday()==null) || 
             (this.isFriday!=null &&
              this.isFriday.equals(other.getIsFriday()))) &&
            ((this.isSaturday==null && other.getIsSaturday()==null) || 
             (this.isSaturday!=null &&
              this.isSaturday.equals(other.getIsSaturday()))) &&
            ((this.sameDayPickupCutOffTime==null && other.getSameDayPickupCutOffTime()==null) || 
             (this.sameDayPickupCutOffTime!=null &&
              this.sameDayPickupCutOffTime.equals(other.getSameDayPickupCutOffTime())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getIsSunday() != null) {
            _hashCode += getIsSunday().hashCode();
        }
        if (getIsMonday() != null) {
            _hashCode += getIsMonday().hashCode();
        }
        if (getIsTuesday() != null) {
            _hashCode += getIsTuesday().hashCode();
        }
        if (getIsWednesday() != null) {
            _hashCode += getIsWednesday().hashCode();
        }
        if (getIsThursday() != null) {
            _hashCode += getIsThursday().hashCode();
        }
        if (getIsFriday() != null) {
            _hashCode += getIsFriday().hashCode();
        }
        if (getIsSaturday() != null) {
            _hashCode += getIsSaturday().hashCode();
        }
        if (getSameDayPickupCutOffTime() != null) {
            _hashCode += getSameDayPickupCutOffTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationBusinessHours.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "LocationBusinessHours"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSunday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isSunday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMonday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isMonday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTuesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isTuesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWednesday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isWednesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isThursday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isThursday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFriday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isFriday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSaturday");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "isSaturday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameDayPickupCutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2019_1.lists.webservices.netsuite.com", "sameDayPickupCutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
