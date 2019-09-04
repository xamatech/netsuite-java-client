/**
 * ContactSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class ContactSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic parentCustomerJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic parentJobJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic parentPartnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic parentVendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic purchasedItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic upsellItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin;

    private com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public ContactSearchRow() {
    }

    public ContactSearchRow(
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic parentCustomerJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic parentJobJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic parentPartnerJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic parentVendorJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic purchasedItemJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic upsellItemJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin,
           com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
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
     * Gets the basic value for this ContactSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ContactSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the callJoin value for this ContactSearchRow.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this ContactSearchRow.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the campaignResponseJoin value for this ContactSearchRow.
     * 
     * @return campaignResponseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this ContactSearchRow.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the caseJoin value for this ContactSearchRow.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this ContactSearchRow.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the customerJoin value for this ContactSearchRow.
     * 
     * @return customerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this ContactSearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the customerPrimaryJoin value for this ContactSearchRow.
     * 
     * @return customerPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getCustomerPrimaryJoin() {
        return customerPrimaryJoin;
    }


    /**
     * Sets the customerPrimaryJoin value for this ContactSearchRow.
     * 
     * @param customerPrimaryJoin
     */
    public void setCustomerPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic customerPrimaryJoin) {
        this.customerPrimaryJoin = customerPrimaryJoin;
    }


    /**
     * Gets the eventJoin value for this ContactSearchRow.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this ContactSearchRow.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the fileJoin value for this ContactSearchRow.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this ContactSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the jobJoin value for this ContactSearchRow.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this ContactSearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the jobPrimaryJoin value for this ContactSearchRow.
     * 
     * @return jobPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobPrimaryJoin() {
        return jobPrimaryJoin;
    }


    /**
     * Sets the jobPrimaryJoin value for this ContactSearchRow.
     * 
     * @param jobPrimaryJoin
     */
    public void setJobPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobPrimaryJoin) {
        this.jobPrimaryJoin = jobPrimaryJoin;
    }


    /**
     * Gets the messagesJoin value for this ContactSearchRow.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this ContactSearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the messagesFromJoin value for this ContactSearchRow.
     * 
     * @return messagesFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this ContactSearchRow.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this ContactSearchRow.
     * 
     * @return messagesToJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this ContactSearchRow.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the opportunityJoin value for this ContactSearchRow.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this ContactSearchRow.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the parentCustomerJoin value for this ContactSearchRow.
     * 
     * @return parentCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getParentCustomerJoin() {
        return parentCustomerJoin;
    }


    /**
     * Sets the parentCustomerJoin value for this ContactSearchRow.
     * 
     * @param parentCustomerJoin
     */
    public void setParentCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic parentCustomerJoin) {
        this.parentCustomerJoin = parentCustomerJoin;
    }


    /**
     * Gets the parentJobJoin value for this ContactSearchRow.
     * 
     * @return parentJobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getParentJobJoin() {
        return parentJobJoin;
    }


    /**
     * Sets the parentJobJoin value for this ContactSearchRow.
     * 
     * @param parentJobJoin
     */
    public void setParentJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic parentJobJoin) {
        this.parentJobJoin = parentJobJoin;
    }


    /**
     * Gets the parentPartnerJoin value for this ContactSearchRow.
     * 
     * @return parentPartnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getParentPartnerJoin() {
        return parentPartnerJoin;
    }


    /**
     * Sets the parentPartnerJoin value for this ContactSearchRow.
     * 
     * @param parentPartnerJoin
     */
    public void setParentPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic parentPartnerJoin) {
        this.parentPartnerJoin = parentPartnerJoin;
    }


    /**
     * Gets the parentVendorJoin value for this ContactSearchRow.
     * 
     * @return parentVendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getParentVendorJoin() {
        return parentVendorJoin;
    }


    /**
     * Sets the parentVendorJoin value for this ContactSearchRow.
     * 
     * @param parentVendorJoin
     */
    public void setParentVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic parentVendorJoin) {
        this.parentVendorJoin = parentVendorJoin;
    }


    /**
     * Gets the partnerJoin value for this ContactSearchRow.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this ContactSearchRow.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the partnerPrimaryJoin value for this ContactSearchRow.
     * 
     * @return partnerPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getPartnerPrimaryJoin() {
        return partnerPrimaryJoin;
    }


    /**
     * Sets the partnerPrimaryJoin value for this ContactSearchRow.
     * 
     * @param partnerPrimaryJoin
     */
    public void setPartnerPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerPrimaryJoin) {
        this.partnerPrimaryJoin = partnerPrimaryJoin;
    }


    /**
     * Gets the purchasedItemJoin value for this ContactSearchRow.
     * 
     * @return purchasedItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getPurchasedItemJoin() {
        return purchasedItemJoin;
    }


    /**
     * Sets the purchasedItemJoin value for this ContactSearchRow.
     * 
     * @param purchasedItemJoin
     */
    public void setPurchasedItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic purchasedItemJoin) {
        this.purchasedItemJoin = purchasedItemJoin;
    }


    /**
     * Gets the taskJoin value for this ContactSearchRow.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this ContactSearchRow.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the transactionJoin value for this ContactSearchRow.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ContactSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the upsellItemJoin value for this ContactSearchRow.
     * 
     * @return upsellItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getUpsellItemJoin() {
        return upsellItemJoin;
    }


    /**
     * Sets the upsellItemJoin value for this ContactSearchRow.
     * 
     * @param upsellItemJoin
     */
    public void setUpsellItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic upsellItemJoin) {
        this.upsellItemJoin = upsellItemJoin;
    }


    /**
     * Gets the userJoin value for this ContactSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ContactSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this ContactSearchRow.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this ContactSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the vendorJoin value for this ContactSearchRow.
     * 
     * @return vendorJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this ContactSearchRow.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the vendorPrimaryJoin value for this ContactSearchRow.
     * 
     * @return vendorPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic getVendorPrimaryJoin() {
        return vendorPrimaryJoin;
    }


    /**
     * Sets the vendorPrimaryJoin value for this ContactSearchRow.
     * 
     * @param vendorPrimaryJoin
     */
    public void setVendorPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.VendorSearchRowBasic vendorPrimaryJoin) {
        this.vendorPrimaryJoin = vendorPrimaryJoin;
    }


    /**
     * Gets the customSearchJoin value for this ContactSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ContactSearchRow.
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
        if (!(obj instanceof ContactSearchRow)) return false;
        ContactSearchRow other = (ContactSearchRow) obj;
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
        new org.apache.axis.description.TypeDesc(ContactSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
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
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
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
        elemField.setFieldName("customerPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customerPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
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
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "jobPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
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
        elemField.setFieldName("parentCustomerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentCustomerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentJobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentJobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentPartnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentPartnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentVendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parentVendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasedItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "purchasedItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
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
        elemField.setFieldName("upsellItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "upsellItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
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
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "vendorPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
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
