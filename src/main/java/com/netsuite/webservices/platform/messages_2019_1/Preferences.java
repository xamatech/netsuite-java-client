/**
 * Preferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2019_1;

public class Preferences  implements java.io.Serializable {
    private java.lang.Boolean warningAsError;

    private java.lang.Boolean disableMandatoryCustomFieldValidation;

    private java.lang.Boolean disableSystemNotesForCustomFields;

    private java.lang.Boolean ignoreReadOnlyFields;

    private java.lang.Boolean runServerSuiteScriptAndTriggerWorkflows;

    public Preferences() {
    }

    public Preferences(
           java.lang.Boolean warningAsError,
           java.lang.Boolean disableMandatoryCustomFieldValidation,
           java.lang.Boolean disableSystemNotesForCustomFields,
           java.lang.Boolean ignoreReadOnlyFields,
           java.lang.Boolean runServerSuiteScriptAndTriggerWorkflows) {
           this.warningAsError = warningAsError;
           this.disableMandatoryCustomFieldValidation = disableMandatoryCustomFieldValidation;
           this.disableSystemNotesForCustomFields = disableSystemNotesForCustomFields;
           this.ignoreReadOnlyFields = ignoreReadOnlyFields;
           this.runServerSuiteScriptAndTriggerWorkflows = runServerSuiteScriptAndTriggerWorkflows;
    }


    /**
     * Gets the warningAsError value for this Preferences.
     * 
     * @return warningAsError
     */
    public java.lang.Boolean getWarningAsError() {
        return warningAsError;
    }


    /**
     * Sets the warningAsError value for this Preferences.
     * 
     * @param warningAsError
     */
    public void setWarningAsError(java.lang.Boolean warningAsError) {
        this.warningAsError = warningAsError;
    }


    /**
     * Gets the disableMandatoryCustomFieldValidation value for this Preferences.
     * 
     * @return disableMandatoryCustomFieldValidation
     */
    public java.lang.Boolean getDisableMandatoryCustomFieldValidation() {
        return disableMandatoryCustomFieldValidation;
    }


    /**
     * Sets the disableMandatoryCustomFieldValidation value for this Preferences.
     * 
     * @param disableMandatoryCustomFieldValidation
     */
    public void setDisableMandatoryCustomFieldValidation(java.lang.Boolean disableMandatoryCustomFieldValidation) {
        this.disableMandatoryCustomFieldValidation = disableMandatoryCustomFieldValidation;
    }


    /**
     * Gets the disableSystemNotesForCustomFields value for this Preferences.
     * 
     * @return disableSystemNotesForCustomFields
     */
    public java.lang.Boolean getDisableSystemNotesForCustomFields() {
        return disableSystemNotesForCustomFields;
    }


    /**
     * Sets the disableSystemNotesForCustomFields value for this Preferences.
     * 
     * @param disableSystemNotesForCustomFields
     */
    public void setDisableSystemNotesForCustomFields(java.lang.Boolean disableSystemNotesForCustomFields) {
        this.disableSystemNotesForCustomFields = disableSystemNotesForCustomFields;
    }


    /**
     * Gets the ignoreReadOnlyFields value for this Preferences.
     * 
     * @return ignoreReadOnlyFields
     */
    public java.lang.Boolean getIgnoreReadOnlyFields() {
        return ignoreReadOnlyFields;
    }


    /**
     * Sets the ignoreReadOnlyFields value for this Preferences.
     * 
     * @param ignoreReadOnlyFields
     */
    public void setIgnoreReadOnlyFields(java.lang.Boolean ignoreReadOnlyFields) {
        this.ignoreReadOnlyFields = ignoreReadOnlyFields;
    }


    /**
     * Gets the runServerSuiteScriptAndTriggerWorkflows value for this Preferences.
     * 
     * @return runServerSuiteScriptAndTriggerWorkflows
     */
    public java.lang.Boolean getRunServerSuiteScriptAndTriggerWorkflows() {
        return runServerSuiteScriptAndTriggerWorkflows;
    }


    /**
     * Sets the runServerSuiteScriptAndTriggerWorkflows value for this Preferences.
     * 
     * @param runServerSuiteScriptAndTriggerWorkflows
     */
    public void setRunServerSuiteScriptAndTriggerWorkflows(java.lang.Boolean runServerSuiteScriptAndTriggerWorkflows) {
        this.runServerSuiteScriptAndTriggerWorkflows = runServerSuiteScriptAndTriggerWorkflows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Preferences)) return false;
        Preferences other = (Preferences) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.warningAsError==null && other.getWarningAsError()==null) || 
             (this.warningAsError!=null &&
              this.warningAsError.equals(other.getWarningAsError()))) &&
            ((this.disableMandatoryCustomFieldValidation==null && other.getDisableMandatoryCustomFieldValidation()==null) || 
             (this.disableMandatoryCustomFieldValidation!=null &&
              this.disableMandatoryCustomFieldValidation.equals(other.getDisableMandatoryCustomFieldValidation()))) &&
            ((this.disableSystemNotesForCustomFields==null && other.getDisableSystemNotesForCustomFields()==null) || 
             (this.disableSystemNotesForCustomFields!=null &&
              this.disableSystemNotesForCustomFields.equals(other.getDisableSystemNotesForCustomFields()))) &&
            ((this.ignoreReadOnlyFields==null && other.getIgnoreReadOnlyFields()==null) || 
             (this.ignoreReadOnlyFields!=null &&
              this.ignoreReadOnlyFields.equals(other.getIgnoreReadOnlyFields()))) &&
            ((this.runServerSuiteScriptAndTriggerWorkflows==null && other.getRunServerSuiteScriptAndTriggerWorkflows()==null) || 
             (this.runServerSuiteScriptAndTriggerWorkflows!=null &&
              this.runServerSuiteScriptAndTriggerWorkflows.equals(other.getRunServerSuiteScriptAndTriggerWorkflows())));
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
        if (getWarningAsError() != null) {
            _hashCode += getWarningAsError().hashCode();
        }
        if (getDisableMandatoryCustomFieldValidation() != null) {
            _hashCode += getDisableMandatoryCustomFieldValidation().hashCode();
        }
        if (getDisableSystemNotesForCustomFields() != null) {
            _hashCode += getDisableSystemNotesForCustomFields().hashCode();
        }
        if (getIgnoreReadOnlyFields() != null) {
            _hashCode += getIgnoreReadOnlyFields().hashCode();
        }
        if (getRunServerSuiteScriptAndTriggerWorkflows() != null) {
            _hashCode += getRunServerSuiteScriptAndTriggerWorkflows().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Preferences.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "Preferences"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningAsError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "warningAsError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableMandatoryCustomFieldValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "disableMandatoryCustomFieldValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSystemNotesForCustomFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "disableSystemNotesForCustomFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreReadOnlyFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "ignoreReadOnlyFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runServerSuiteScriptAndTriggerWorkflows");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2019_1.platform.webservices.netsuite.com", "runServerSuiteScriptAndTriggerWorkflows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
