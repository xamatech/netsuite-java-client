/**
 * MessageSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.general.communication_2019_1;

public class MessageSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchBasic attachmentsJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic authorJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic entityJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic recipientJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin;

    public MessageSearch() {
    }

    public MessageSearch(
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.FileSearchBasic attachmentsJoin,
           com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic authorJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic entityJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic recipientJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin) {
        this.basic = basic;
        this.attachmentsJoin = attachmentsJoin;
        this.authorJoin = authorJoin;
        this.campaignJoin = campaignJoin;
        this.caseJoin = caseJoin;
        this.contactJoin = contactJoin;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.entityJoin = entityJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.partnerJoin = partnerJoin;
        this.recipientJoin = recipientJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the basic value for this MessageSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this MessageSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the attachmentsJoin value for this MessageSearch.
     * 
     * @return attachmentsJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchBasic getAttachmentsJoin() {
        return attachmentsJoin;
    }


    /**
     * Sets the attachmentsJoin value for this MessageSearch.
     * 
     * @param attachmentsJoin
     */
    public void setAttachmentsJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchBasic attachmentsJoin) {
        this.attachmentsJoin = attachmentsJoin;
    }


    /**
     * Gets the authorJoin value for this MessageSearch.
     * 
     * @return authorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic getAuthorJoin() {
        return authorJoin;
    }


    /**
     * Sets the authorJoin value for this MessageSearch.
     * 
     * @param authorJoin
     */
    public void setAuthorJoin(com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic authorJoin) {
        this.authorJoin = authorJoin;
    }


    /**
     * Gets the campaignJoin value for this MessageSearch.
     * 
     * @return campaignJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic getCampaignJoin() {
        return campaignJoin;
    }


    /**
     * Sets the campaignJoin value for this MessageSearch.
     * 
     * @param campaignJoin
     */
    public void setCampaignJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignJoin) {
        this.campaignJoin = campaignJoin;
    }


    /**
     * Gets the caseJoin value for this MessageSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this MessageSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the contactJoin value for this MessageSearch.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this MessageSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the customerJoin value for this MessageSearch.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this MessageSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the employeeJoin value for this MessageSearch.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this MessageSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the entityJoin value for this MessageSearch.
     * 
     * @return entityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic getEntityJoin() {
        return entityJoin;
    }


    /**
     * Sets the entityJoin value for this MessageSearch.
     * 
     * @param entityJoin
     */
    public void setEntityJoin(com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic entityJoin) {
        this.entityJoin = entityJoin;
    }


    /**
     * Gets the opportunityJoin value for this MessageSearch.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this MessageSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this MessageSearch.
     * 
     * @return originatingLeadJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this MessageSearch.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the partnerJoin value for this MessageSearch.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this MessageSearch.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the recipientJoin value for this MessageSearch.
     * 
     * @return recipientJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic getRecipientJoin() {
        return recipientJoin;
    }


    /**
     * Sets the recipientJoin value for this MessageSearch.
     * 
     * @param recipientJoin
     */
    public void setRecipientJoin(com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic recipientJoin) {
        this.recipientJoin = recipientJoin;
    }


    /**
     * Gets the transactionJoin value for this MessageSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this MessageSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this MessageSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this MessageSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the vendorJoin value for this MessageSearch.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this MessageSearch.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageSearch)) return false;
        MessageSearch other = (MessageSearch) obj;
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
            ((this.attachmentsJoin==null && other.getAttachmentsJoin()==null) || 
             (this.attachmentsJoin!=null &&
              this.attachmentsJoin.equals(other.getAttachmentsJoin()))) &&
            ((this.authorJoin==null && other.getAuthorJoin()==null) || 
             (this.authorJoin!=null &&
              this.authorJoin.equals(other.getAuthorJoin()))) &&
            ((this.campaignJoin==null && other.getCampaignJoin()==null) || 
             (this.campaignJoin!=null &&
              this.campaignJoin.equals(other.getCampaignJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.entityJoin==null && other.getEntityJoin()==null) || 
             (this.entityJoin!=null &&
              this.entityJoin.equals(other.getEntityJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.recipientJoin==null && other.getRecipientJoin()==null) || 
             (this.recipientJoin!=null &&
              this.recipientJoin.equals(other.getRecipientJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin())));
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
        if (getAttachmentsJoin() != null) {
            _hashCode += getAttachmentsJoin().hashCode();
        }
        if (getAuthorJoin() != null) {
            _hashCode += getAuthorJoin().hashCode();
        }
        if (getCampaignJoin() != null) {
            _hashCode += getCampaignJoin().hashCode();
        }
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getEntityJoin() != null) {
            _hashCode += getEntityJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getOriginatingLeadJoin() != null) {
            _hashCode += getOriginatingLeadJoin().hashCode();
        }
        if (getPartnerJoin() != null) {
            _hashCode += getPartnerJoin().hashCode();
        }
        if (getRecipientJoin() != null) {
            _hashCode += getRecipientJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "MessageSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentsJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "attachmentsJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "authorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "campaignJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "entityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "recipientJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
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
