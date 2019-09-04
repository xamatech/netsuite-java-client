/**
 * ContactSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class ContactSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic parentCustomerJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic parentJobJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic parentPartnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic parentVendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic purchasedItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic upsellItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public ContactSearch() {
    }

    public ContactSearch(
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic parentCustomerJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic parentJobJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic parentPartnerJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic parentVendorJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic purchasedItemJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic upsellItemJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.callJoin = callJoin;
        this.campaignResponseJoin = campaignResponseJoin;
        this.caseJoin = caseJoin;
        this.customerJoin = customerJoin;
        this.customerPrimaryJoin = customerPrimaryJoin;
        this.eventJoin = eventJoin;
        this.fileJoin = fileJoin;
        this.jobJoin = jobJoin;
        this.jobPrimaryJoin = jobPrimaryJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.opportunityJoin = opportunityJoin;
        this.parentCustomerJoin = parentCustomerJoin;
        this.parentJobJoin = parentJobJoin;
        this.parentPartnerJoin = parentPartnerJoin;
        this.parentVendorJoin = parentVendorJoin;
        this.partnerJoin = partnerJoin;
        this.partnerPrimaryJoin = partnerPrimaryJoin;
        this.purchasedItemJoin = purchasedItemJoin;
        this.taskJoin = taskJoin;
        this.transactionJoin = transactionJoin;
        this.upsellItemJoin = upsellItemJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
        this.vendorPrimaryJoin = vendorPrimaryJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ContactSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ContactSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the callJoin value for this ContactSearch.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this ContactSearch.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the campaignResponseJoin value for this ContactSearch.
     * 
     * @return campaignResponseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this ContactSearch.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the caseJoin value for this ContactSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this ContactSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the customerJoin value for this ContactSearch.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this ContactSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the customerPrimaryJoin value for this ContactSearch.
     * 
     * @return customerPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getCustomerPrimaryJoin() {
        return customerPrimaryJoin;
    }


    /**
     * Sets the customerPrimaryJoin value for this ContactSearch.
     * 
     * @param customerPrimaryJoin
     */
    public void setCustomerPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic customerPrimaryJoin) {
        this.customerPrimaryJoin = customerPrimaryJoin;
    }


    /**
     * Gets the eventJoin value for this ContactSearch.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this ContactSearch.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the fileJoin value for this ContactSearch.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this ContactSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the jobJoin value for this ContactSearch.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this ContactSearch.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the jobPrimaryJoin value for this ContactSearch.
     * 
     * @return jobPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getJobPrimaryJoin() {
        return jobPrimaryJoin;
    }


    /**
     * Sets the jobPrimaryJoin value for this ContactSearch.
     * 
     * @param jobPrimaryJoin
     */
    public void setJobPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobPrimaryJoin) {
        this.jobPrimaryJoin = jobPrimaryJoin;
    }


    /**
     * Gets the messagesJoin value for this ContactSearch.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this ContactSearch.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the messagesFromJoin value for this ContactSearch.
     * 
     * @return messagesFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this ContactSearch.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this ContactSearch.
     * 
     * @return messagesToJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this ContactSearch.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the opportunityJoin value for this ContactSearch.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this ContactSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the parentCustomerJoin value for this ContactSearch.
     * 
     * @return parentCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getParentCustomerJoin() {
        return parentCustomerJoin;
    }


    /**
     * Sets the parentCustomerJoin value for this ContactSearch.
     * 
     * @param parentCustomerJoin
     */
    public void setParentCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic parentCustomerJoin) {
        this.parentCustomerJoin = parentCustomerJoin;
    }


    /**
     * Gets the parentJobJoin value for this ContactSearch.
     * 
     * @return parentJobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getParentJobJoin() {
        return parentJobJoin;
    }


    /**
     * Sets the parentJobJoin value for this ContactSearch.
     * 
     * @param parentJobJoin
     */
    public void setParentJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic parentJobJoin) {
        this.parentJobJoin = parentJobJoin;
    }


    /**
     * Gets the parentPartnerJoin value for this ContactSearch.
     * 
     * @return parentPartnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic getParentPartnerJoin() {
        return parentPartnerJoin;
    }


    /**
     * Sets the parentPartnerJoin value for this ContactSearch.
     * 
     * @param parentPartnerJoin
     */
    public void setParentPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic parentPartnerJoin) {
        this.parentPartnerJoin = parentPartnerJoin;
    }


    /**
     * Gets the parentVendorJoin value for this ContactSearch.
     * 
     * @return parentVendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getParentVendorJoin() {
        return parentVendorJoin;
    }


    /**
     * Sets the parentVendorJoin value for this ContactSearch.
     * 
     * @param parentVendorJoin
     */
    public void setParentVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic parentVendorJoin) {
        this.parentVendorJoin = parentVendorJoin;
    }


    /**
     * Gets the partnerJoin value for this ContactSearch.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this ContactSearch.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the partnerPrimaryJoin value for this ContactSearch.
     * 
     * @return partnerPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic getPartnerPrimaryJoin() {
        return partnerPrimaryJoin;
    }


    /**
     * Sets the partnerPrimaryJoin value for this ContactSearch.
     * 
     * @param partnerPrimaryJoin
     */
    public void setPartnerPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerPrimaryJoin) {
        this.partnerPrimaryJoin = partnerPrimaryJoin;
    }


    /**
     * Gets the purchasedItemJoin value for this ContactSearch.
     * 
     * @return purchasedItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getPurchasedItemJoin() {
        return purchasedItemJoin;
    }


    /**
     * Sets the purchasedItemJoin value for this ContactSearch.
     * 
     * @param purchasedItemJoin
     */
    public void setPurchasedItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic purchasedItemJoin) {
        this.purchasedItemJoin = purchasedItemJoin;
    }


    /**
     * Gets the taskJoin value for this ContactSearch.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this ContactSearch.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the transactionJoin value for this ContactSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ContactSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the upsellItemJoin value for this ContactSearch.
     * 
     * @return upsellItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getUpsellItemJoin() {
        return upsellItemJoin;
    }


    /**
     * Sets the upsellItemJoin value for this ContactSearch.
     * 
     * @param upsellItemJoin
     */
    public void setUpsellItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic upsellItemJoin) {
        this.upsellItemJoin = upsellItemJoin;
    }


    /**
     * Gets the userJoin value for this ContactSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ContactSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this ContactSearch.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this ContactSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the vendorJoin value for this ContactSearch.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this ContactSearch.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the vendorPrimaryJoin value for this ContactSearch.
     * 
     * @return vendorPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic getVendorPrimaryJoin() {
        return vendorPrimaryJoin;
    }


    /**
     * Sets the vendorPrimaryJoin value for this ContactSearch.
     * 
     * @param vendorPrimaryJoin
     */
    public void setVendorPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic vendorPrimaryJoin) {
        this.vendorPrimaryJoin = vendorPrimaryJoin;
    }


    /**
     * Gets the customSearchJoin value for this ContactSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ContactSearch.
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
        if (!(obj instanceof ContactSearch)) return false;
        ContactSearch other = (ContactSearch) obj;
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
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.campaignResponseJoin==null && other.getCampaignResponseJoin()==null) || 
             (this.campaignResponseJoin!=null &&
              this.campaignResponseJoin.equals(other.getCampaignResponseJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.customerPrimaryJoin==null && other.getCustomerPrimaryJoin()==null) || 
             (this.customerPrimaryJoin!=null &&
              this.customerPrimaryJoin.equals(other.getCustomerPrimaryJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.jobPrimaryJoin==null && other.getJobPrimaryJoin()==null) || 
             (this.jobPrimaryJoin!=null &&
              this.jobPrimaryJoin.equals(other.getJobPrimaryJoin()))) &&
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
            ((this.parentCustomerJoin==null && other.getParentCustomerJoin()==null) || 
             (this.parentCustomerJoin!=null &&
              this.parentCustomerJoin.equals(other.getParentCustomerJoin()))) &&
            ((this.parentJobJoin==null && other.getParentJobJoin()==null) || 
             (this.parentJobJoin!=null &&
              this.parentJobJoin.equals(other.getParentJobJoin()))) &&
            ((this.parentPartnerJoin==null && other.getParentPartnerJoin()==null) || 
             (this.parentPartnerJoin!=null &&
              this.parentPartnerJoin.equals(other.getParentPartnerJoin()))) &&
            ((this.parentVendorJoin==null && other.getParentVendorJoin()==null) || 
             (this.parentVendorJoin!=null &&
              this.parentVendorJoin.equals(other.getParentVendorJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.partnerPrimaryJoin==null && other.getPartnerPrimaryJoin()==null) || 
             (this.partnerPrimaryJoin!=null &&
              this.partnerPrimaryJoin.equals(other.getPartnerPrimaryJoin()))) &&
            ((this.purchasedItemJoin==null && other.getPurchasedItemJoin()==null) || 
             (this.purchasedItemJoin!=null &&
              this.purchasedItemJoin.equals(other.getPurchasedItemJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.upsellItemJoin==null && other.getUpsellItemJoin()==null) || 
             (this.upsellItemJoin!=null &&
              this.upsellItemJoin.equals(other.getUpsellItemJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin()))) &&
            ((this.vendorPrimaryJoin==null && other.getVendorPrimaryJoin()==null) || 
             (this.vendorPrimaryJoin!=null &&
              this.vendorPrimaryJoin.equals(other.getVendorPrimaryJoin()))) &&
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
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
        }
        if (getCampaignResponseJoin() != null) {
            _hashCode += getCampaignResponseJoin().hashCode();
        }
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getCustomerPrimaryJoin() != null) {
            _hashCode += getCustomerPrimaryJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getJobPrimaryJoin() != null) {
            _hashCode += getJobPrimaryJoin().hashCode();
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
        if (getParentCustomerJoin() != null) {
            _hashCode += getParentCustomerJoin().hashCode();
        }
        if (getParentJobJoin() != null) {
            _hashCode += getParentJobJoin().hashCode();
        }
        if (getParentPartnerJoin() != null) {
            _hashCode += getParentPartnerJoin().hashCode();
        }
        if (getParentVendorJoin() != null) {
            _hashCode += getParentVendorJoin().hashCode();
        }
        if (getPartnerJoin() != null) {
            _hashCode += getPartnerJoin().hashCode();
        }
        if (getPartnerPrimaryJoin() != null) {
            _hashCode += getPartnerPrimaryJoin().hashCode();
        }
        if (getPurchasedItemJoin() != null) {
            _hashCode += getPurchasedItemJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUpsellItemJoin() != null) {
            _hashCode += getUpsellItemJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        if (getVendorPrimaryJoin() != null) {
            _hashCode += getVendorPrimaryJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(ContactSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignResponseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesFromJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesFromJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesToJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "messagesToJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCustomerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentCustomerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentJobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentJobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentPartnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentPartnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentVendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentVendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasedItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "purchasedItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upsellItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "upsellItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "vendorPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customSearchJoin"));
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
