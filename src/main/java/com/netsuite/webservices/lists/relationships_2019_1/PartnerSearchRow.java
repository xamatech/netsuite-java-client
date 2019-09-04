/**
 * PartnerSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class PartnerSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic taxRegistrationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public PartnerSearchRow() {
    }

    public PartnerSearchRow(
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic taxRegistrationJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.campaignResponseJoin = campaignResponseJoin;
        this.contactJoin = contactJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.customerJoin = customerJoin;
        this.fileJoin = fileJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.opportunityJoin = opportunityJoin;
        this.taxRegistrationJoin = taxRegistrationJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this PartnerSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this PartnerSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the campaignResponseJoin value for this PartnerSearchRow.
     * 
     * @return campaignResponseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this PartnerSearchRow.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the contactJoin value for this PartnerSearchRow.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this PartnerSearchRow.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this PartnerSearchRow.
     * 
     * @return contactPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this PartnerSearchRow.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the customerJoin value for this PartnerSearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this PartnerSearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the fileJoin value for this PartnerSearchRow.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this PartnerSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the messagesJoin value for this PartnerSearchRow.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this PartnerSearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the messagesFromJoin value for this PartnerSearchRow.
     * 
     * @return messagesFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this PartnerSearchRow.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this PartnerSearchRow.
     * 
     * @return messagesToJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this PartnerSearchRow.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the opportunityJoin value for this PartnerSearchRow.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this PartnerSearchRow.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the taxRegistrationJoin value for this PartnerSearchRow.
     * 
     * @return taxRegistrationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic getTaxRegistrationJoin() {
        return taxRegistrationJoin;
    }


    /**
     * Sets the taxRegistrationJoin value for this PartnerSearchRow.
     * 
     * @param taxRegistrationJoin
     */
    public void setTaxRegistrationJoin(com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic taxRegistrationJoin) {
        this.taxRegistrationJoin = taxRegistrationJoin;
    }


    /**
     * Gets the transactionJoin value for this PartnerSearchRow.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this PartnerSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this PartnerSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this PartnerSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this PartnerSearchRow.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this PartnerSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the customSearchJoin value for this PartnerSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this PartnerSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartnerSearchRow)) return false;
        PartnerSearchRow other = (PartnerSearchRow) obj;
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
            ((this.campaignResponseJoin==null && other.getCampaignResponseJoin()==null) || 
             (this.campaignResponseJoin!=null &&
              this.campaignResponseJoin.equals(other.getCampaignResponseJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.contactPrimaryJoin==null && other.getContactPrimaryJoin()==null) || 
             (this.contactPrimaryJoin!=null &&
              this.contactPrimaryJoin.equals(other.getContactPrimaryJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.messagesFromJoin==null && other.getMessagesFromJoin()==null) || 
             (this.messagesFromJoin!=null &&
              this.messagesFromJoin.equals(other.getMessagesFromJoin()))) &&
            ((this.messagesToJoin==null && other.getMessagesToJoin()==null) || 
             (this.messagesToJoin!=null &&
              this.messagesToJoin.equals(other.getMessagesToJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.taxRegistrationJoin==null && other.getTaxRegistrationJoin()==null) || 
             (this.taxRegistrationJoin!=null &&
              this.taxRegistrationJoin.equals(other.getTaxRegistrationJoin()))) &&
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
        if (getCampaignResponseJoin() != null) {
            _hashCode += getCampaignResponseJoin().hashCode();
        }
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getContactPrimaryJoin() != null) {
            _hashCode += getContactPrimaryJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getMessagesFromJoin() != null) {
            _hashCode += getMessagesFromJoin().hashCode();
        }
        if (getMessagesToJoin() != null) {
            _hashCode += getMessagesToJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getTaxRegistrationJoin() != null) {
            _hashCode += getTaxRegistrationJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(PartnerSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "PartnerSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignResponseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesFromJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesFromJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesToJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesToJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
