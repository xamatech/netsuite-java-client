/**
 * PhoneCallSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.activities.scheduling_2024_2;

public class PhoneCallSearch  extends com.netsuite.webservices.platform.core_2024_2.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2024_2.PhoneCallSearchBasic basic;

    private com.netsuite.webservices.platform.common_2024_2.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2024_2.CustomerSearchBasic companyCustomerJoin;

    private com.netsuite.webservices.platform.common_2024_2.ContactSearchBasic contactJoin;

    private com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2024_2.FileSearchBasic fileJoin;

    private com.netsuite.webservices.platform.common_2024_2.OpportunitySearchBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2024_2.OriginatingLeadSearchBasic originatingLeadJoin;

    private com.netsuite.webservices.platform.common_2024_2.EntitySearchBasic participantJoin;

    private com.netsuite.webservices.platform.common_2024_2.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2024_2.NoteSearchBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2024_2.CustomSearchJoin[] customSearchJoin;

    public PhoneCallSearch() {
    }

    public PhoneCallSearch(
           com.netsuite.webservices.platform.common_2024_2.PhoneCallSearchBasic basic,
           com.netsuite.webservices.platform.common_2024_2.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2024_2.CustomerSearchBasic companyCustomerJoin,
           com.netsuite.webservices.platform.common_2024_2.ContactSearchBasic contactJoin,
           com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic employeeJoin,
           com.netsuite.webservices.platform.common_2024_2.FileSearchBasic fileJoin,
           com.netsuite.webservices.platform.common_2024_2.OpportunitySearchBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2024_2.OriginatingLeadSearchBasic originatingLeadJoin,
           com.netsuite.webservices.platform.common_2024_2.EntitySearchBasic participantJoin,
           com.netsuite.webservices.platform.common_2024_2.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2024_2.NoteSearchBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2024_2.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.caseJoin = caseJoin;
        this.companyCustomerJoin = companyCustomerJoin;
        this.contactJoin = contactJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.participantJoin = participantJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this PhoneCallSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2024_2.PhoneCallSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this PhoneCallSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2024_2.PhoneCallSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the caseJoin value for this PhoneCallSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this PhoneCallSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2024_2.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the companyCustomerJoin value for this PhoneCallSearch.
     * 
     * @return companyCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.CustomerSearchBasic getCompanyCustomerJoin() {
        return companyCustomerJoin;
    }


    /**
     * Sets the companyCustomerJoin value for this PhoneCallSearch.
     * 
     * @param companyCustomerJoin
     */
    public void setCompanyCustomerJoin(com.netsuite.webservices.platform.common_2024_2.CustomerSearchBasic companyCustomerJoin) {
        this.companyCustomerJoin = companyCustomerJoin;
    }


    /**
     * Gets the contactJoin value for this PhoneCallSearch.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this PhoneCallSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2024_2.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the employeeJoin value for this PhoneCallSearch.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this PhoneCallSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the fileJoin value for this PhoneCallSearch.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this PhoneCallSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2024_2.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the opportunityJoin value for this PhoneCallSearch.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this PhoneCallSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2024_2.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this PhoneCallSearch.
     * 
     * @return originatingLeadJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this PhoneCallSearch.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(com.netsuite.webservices.platform.common_2024_2.OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the participantJoin value for this PhoneCallSearch.
     * 
     * @return participantJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EntitySearchBasic getParticipantJoin() {
        return participantJoin;
    }


    /**
     * Sets the participantJoin value for this PhoneCallSearch.
     * 
     * @param participantJoin
     */
    public void setParticipantJoin(com.netsuite.webservices.platform.common_2024_2.EntitySearchBasic participantJoin) {
        this.participantJoin = participantJoin;
    }


    /**
     * Gets the transactionJoin value for this PhoneCallSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this PhoneCallSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2024_2.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this PhoneCallSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this PhoneCallSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2024_2.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this PhoneCallSearch.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this PhoneCallSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2024_2.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the customSearchJoin value for this PhoneCallSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2024_2.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this PhoneCallSearch.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2024_2.CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2024_2.CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2024_2.CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneCallSearch)) return false;
        PhoneCallSearch other = (PhoneCallSearch) obj;
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
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.companyCustomerJoin==null && other.getCompanyCustomerJoin()==null) || 
             (this.companyCustomerJoin!=null &&
              this.companyCustomerJoin.equals(other.getCompanyCustomerJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
            ((this.participantJoin==null && other.getParticipantJoin()==null) || 
             (this.participantJoin!=null &&
              this.participantJoin.equals(other.getParticipantJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
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
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getCompanyCustomerJoin() != null) {
            _hashCode += getCompanyCustomerJoin().hashCode();
        }
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getOriginatingLeadJoin() != null) {
            _hashCode += getOriginatingLeadJoin().hashCode();
        }
        if (getParticipantJoin() != null) {
            _hashCode += getParticipantJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(PhoneCallSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "PhoneCallSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCustomerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "companyCustomerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participantJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "participantJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2024_2.activities.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2024_2.platform.webservices.netsuite.com", "CustomSearchJoin"));
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
