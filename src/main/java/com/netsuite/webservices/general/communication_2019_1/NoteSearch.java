/**
 * NoteSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.general.communication_2019_1;

public class NoteSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic authorJoin;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic entityJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic issueJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.SolutionSearchBasic solutionJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public NoteSearch() {
    }

    public NoteSearch(
           com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic authorJoin,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin,
           com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic entityJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic issueJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.SolutionSearchBasic solutionJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.authorJoin = authorJoin;
        this.callJoin = callJoin;
        this.campaignJoin = campaignJoin;
        this.caseJoin = caseJoin;
        this.contactJoin = contactJoin;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.entityJoin = entityJoin;
        this.eventJoin = eventJoin;
        this.issueJoin = issueJoin;
        this.itemJoin = itemJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.partnerJoin = partnerJoin;
        this.solutionJoin = solutionJoin;
        this.taskJoin = taskJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this NoteSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this NoteSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the authorJoin value for this NoteSearch.
     * 
     * @return authorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getAuthorJoin() {
        return authorJoin;
    }


    /**
     * Sets the authorJoin value for this NoteSearch.
     * 
     * @param authorJoin
     */
    public void setAuthorJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic authorJoin) {
        this.authorJoin = authorJoin;
    }


    /**
     * Gets the callJoin value for this NoteSearch.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this NoteSearch.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the campaignJoin value for this NoteSearch.
     * 
     * @return campaignJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic getCampaignJoin() {
        return campaignJoin;
    }


    /**
     * Sets the campaignJoin value for this NoteSearch.
     * 
     * @param campaignJoin
     */
    public void setCampaignJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignJoin) {
        this.campaignJoin = campaignJoin;
    }


    /**
     * Gets the caseJoin value for this NoteSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this NoteSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the contactJoin value for this NoteSearch.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this NoteSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the customerJoin value for this NoteSearch.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this NoteSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the employeeJoin value for this NoteSearch.
     * 
     * @return employeeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this NoteSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the entityJoin value for this NoteSearch.
     * 
     * @return entityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic getEntityJoin() {
        return entityJoin;
    }


    /**
     * Sets the entityJoin value for this NoteSearch.
     * 
     * @param entityJoin
     */
    public void setEntityJoin(com.netsuite.webservices.platform.common_2019_1.EntitySearchBasic entityJoin) {
        this.entityJoin = entityJoin;
    }


    /**
     * Gets the eventJoin value for this NoteSearch.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this NoteSearch.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the issueJoin value for this NoteSearch.
     * 
     * @return issueJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic getIssueJoin() {
        return issueJoin;
    }


    /**
     * Sets the issueJoin value for this NoteSearch.
     * 
     * @param issueJoin
     */
    public void setIssueJoin(com.netsuite.webservices.platform.common_2019_1.IssueSearchBasic issueJoin) {
        this.issueJoin = issueJoin;
    }


    /**
     * Gets the itemJoin value for this NoteSearch.
     * 
     * @return itemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this NoteSearch.
     * 
     * @param itemJoin
     */
    public void setItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the opportunityJoin value for this NoteSearch.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this NoteSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this NoteSearch.
     * 
     * @return originatingLeadJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this NoteSearch.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the partnerJoin value for this NoteSearch.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this NoteSearch.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the solutionJoin value for this NoteSearch.
     * 
     * @return solutionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SolutionSearchBasic getSolutionJoin() {
        return solutionJoin;
    }


    /**
     * Sets the solutionJoin value for this NoteSearch.
     * 
     * @param solutionJoin
     */
    public void setSolutionJoin(com.netsuite.webservices.platform.common_2019_1.SolutionSearchBasic solutionJoin) {
        this.solutionJoin = solutionJoin;
    }


    /**
     * Gets the taskJoin value for this NoteSearch.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this NoteSearch.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the transactionJoin value for this NoteSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this NoteSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this NoteSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this NoteSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the vendorJoin value for this NoteSearch.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this NoteSearch.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the customSearchJoin value for this NoteSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this NoteSearch.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteSearch)) return false;
        NoteSearch other = (NoteSearch) obj;
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
            ((this.authorJoin==null && other.getAuthorJoin()==null) || 
             (this.authorJoin!=null &&
              this.authorJoin.equals(other.getAuthorJoin()))) &&
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
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
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.issueJoin==null && other.getIssueJoin()==null) || 
             (this.issueJoin!=null &&
              this.issueJoin.equals(other.getIssueJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.solutionJoin==null && other.getSolutionJoin()==null) || 
             (this.solutionJoin!=null &&
              this.solutionJoin.equals(other.getSolutionJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
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
        if (getAuthorJoin() != null) {
            _hashCode += getAuthorJoin().hashCode();
        }
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
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
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getIssueJoin() != null) {
            _hashCode += getIssueJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
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
        if (getSolutionJoin() != null) {
            _hashCode += getSolutionJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(NoteSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "NoteSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "authorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
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
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "issueJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "IssueSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
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
        elemField.setFieldName("solutionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "solutionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SolutionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
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
