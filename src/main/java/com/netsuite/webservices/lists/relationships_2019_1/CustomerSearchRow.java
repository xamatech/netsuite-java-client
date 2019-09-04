/**
 * CustomerSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerSearchRow  extends com.netsuite.webservices.platform.core_2019_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic billingAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic billingScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic hostedPageJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin;

    private com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchRowBasic mseSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic originatingLeadJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic parentCustomerJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic pricingJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic purchasedItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic resourceAllocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic subCustomerJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic taxRegistrationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic topLevelParentJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic upsellItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchRowBasic webSiteCategoryJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic webSiteItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin;

    public CustomerSearchRow() {
    }

    public CustomerSearchRow(
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic billingAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic billingScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic hostedPageJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin,
           com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchRowBasic mseSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic originatingLeadJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic parentCustomerJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic pricingJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic purchasedItemJoin,
           com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic resourceAllocationJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic subCustomerJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic taxRegistrationJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic topLevelParentJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic upsellItemJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchRowBasic webSiteCategoryJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic webSiteItemJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.billingAccountJoin = billingAccountJoin;
        this.billingScheduleJoin = billingScheduleJoin;
        this.callJoin = callJoin;
        this.campaignResponseJoin = campaignResponseJoin;
        this.caseJoin = caseJoin;
        this.contactJoin = contactJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.eventJoin = eventJoin;
        this.fileJoin = fileJoin;
        this.hostedPageJoin = hostedPageJoin;
        this.jobJoin = jobJoin;
        this.leadSourceJoin = leadSourceJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.parentCustomerJoin = parentCustomerJoin;
        this.partnerJoin = partnerJoin;
        this.pricingJoin = pricingJoin;
        this.purchasedItemJoin = purchasedItemJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.salesRepJoin = salesRepJoin;
        this.subCustomerJoin = subCustomerJoin;
        this.taskJoin = taskJoin;
        this.taxRegistrationJoin = taxRegistrationJoin;
        this.timeJoin = timeJoin;
        this.topLevelParentJoin = topLevelParentJoin;
        this.transactionJoin = transactionJoin;
        this.upsellItemJoin = upsellItemJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.webSiteCategoryJoin = webSiteCategoryJoin;
        this.webSiteItemJoin = webSiteItemJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this CustomerSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this CustomerSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the billingAccountJoin value for this CustomerSearchRow.
     * 
     * @return billingAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }


    /**
     * Sets the billingAccountJoin value for this CustomerSearchRow.
     * 
     * @param billingAccountJoin
     */
    public void setBillingAccountJoin(com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchRowBasic billingAccountJoin) {
        this.billingAccountJoin = billingAccountJoin;
    }


    /**
     * Gets the billingScheduleJoin value for this CustomerSearchRow.
     * 
     * @return billingScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }


    /**
     * Sets the billingScheduleJoin value for this CustomerSearchRow.
     * 
     * @param billingScheduleJoin
     */
    public void setBillingScheduleJoin(com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchRowBasic billingScheduleJoin) {
        this.billingScheduleJoin = billingScheduleJoin;
    }


    /**
     * Gets the callJoin value for this CustomerSearchRow.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this CustomerSearchRow.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the campaignResponseJoin value for this CustomerSearchRow.
     * 
     * @return campaignResponseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this CustomerSearchRow.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the caseJoin value for this CustomerSearchRow.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this CustomerSearchRow.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the contactJoin value for this CustomerSearchRow.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this CustomerSearchRow.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this CustomerSearchRow.
     * 
     * @return contactPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this CustomerSearchRow.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchRowBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the eventJoin value for this CustomerSearchRow.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this CustomerSearchRow.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the fileJoin value for this CustomerSearchRow.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this CustomerSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the hostedPageJoin value for this CustomerSearchRow.
     * 
     * @return hostedPageJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic getHostedPageJoin() {
        return hostedPageJoin;
    }


    /**
     * Sets the hostedPageJoin value for this CustomerSearchRow.
     * 
     * @param hostedPageJoin
     */
    public void setHostedPageJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchRowBasic hostedPageJoin) {
        this.hostedPageJoin = hostedPageJoin;
    }


    /**
     * Gets the jobJoin value for this CustomerSearchRow.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this CustomerSearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the leadSourceJoin value for this CustomerSearchRow.
     * 
     * @return leadSourceJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }


    /**
     * Sets the leadSourceJoin value for this CustomerSearchRow.
     * 
     * @param leadSourceJoin
     */
    public void setLeadSourceJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchRowBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }


    /**
     * Gets the messagesJoin value for this CustomerSearchRow.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this CustomerSearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the messagesFromJoin value for this CustomerSearchRow.
     * 
     * @return messagesFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this CustomerSearchRow.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this CustomerSearchRow.
     * 
     * @return messagesToJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this CustomerSearchRow.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchRowBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the mseSubsidiaryJoin value for this CustomerSearchRow.
     * 
     * @return mseSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchRowBasic getMseSubsidiaryJoin() {
        return mseSubsidiaryJoin;
    }


    /**
     * Sets the mseSubsidiaryJoin value for this CustomerSearchRow.
     * 
     * @param mseSubsidiaryJoin
     */
    public void setMseSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchRowBasic mseSubsidiaryJoin) {
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
    }


    /**
     * Gets the opportunityJoin value for this CustomerSearchRow.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this CustomerSearchRow.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this CustomerSearchRow.
     * 
     * @return originatingLeadJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this CustomerSearchRow.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchRowBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the parentCustomerJoin value for this CustomerSearchRow.
     * 
     * @return parentCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getParentCustomerJoin() {
        return parentCustomerJoin;
    }


    /**
     * Sets the parentCustomerJoin value for this CustomerSearchRow.
     * 
     * @param parentCustomerJoin
     */
    public void setParentCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic parentCustomerJoin) {
        this.parentCustomerJoin = parentCustomerJoin;
    }


    /**
     * Gets the partnerJoin value for this CustomerSearchRow.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this CustomerSearchRow.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the pricingJoin value for this CustomerSearchRow.
     * 
     * @return pricingJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic getPricingJoin() {
        return pricingJoin;
    }


    /**
     * Sets the pricingJoin value for this CustomerSearchRow.
     * 
     * @param pricingJoin
     */
    public void setPricingJoin(com.netsuite.webservices.platform.common_2019_1.PricingSearchRowBasic pricingJoin) {
        this.pricingJoin = pricingJoin;
    }


    /**
     * Gets the purchasedItemJoin value for this CustomerSearchRow.
     * 
     * @return purchasedItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getPurchasedItemJoin() {
        return purchasedItemJoin;
    }


    /**
     * Sets the purchasedItemJoin value for this CustomerSearchRow.
     * 
     * @param purchasedItemJoin
     */
    public void setPurchasedItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic purchasedItemJoin) {
        this.purchasedItemJoin = purchasedItemJoin;
    }


    /**
     * Gets the resourceAllocationJoin value for this CustomerSearchRow.
     * 
     * @return resourceAllocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }


    /**
     * Sets the resourceAllocationJoin value for this CustomerSearchRow.
     * 
     * @param resourceAllocationJoin
     */
    public void setResourceAllocationJoin(com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchRowBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }


    /**
     * Gets the salesRepJoin value for this CustomerSearchRow.
     * 
     * @return salesRepJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }


    /**
     * Sets the salesRepJoin value for this CustomerSearchRow.
     * 
     * @param salesRepJoin
     */
    public void setSalesRepJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }


    /**
     * Gets the subCustomerJoin value for this CustomerSearchRow.
     * 
     * @return subCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getSubCustomerJoin() {
        return subCustomerJoin;
    }


    /**
     * Sets the subCustomerJoin value for this CustomerSearchRow.
     * 
     * @param subCustomerJoin
     */
    public void setSubCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic subCustomerJoin) {
        this.subCustomerJoin = subCustomerJoin;
    }


    /**
     * Gets the taskJoin value for this CustomerSearchRow.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this CustomerSearchRow.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the taxRegistrationJoin value for this CustomerSearchRow.
     * 
     * @return taxRegistrationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic getTaxRegistrationJoin() {
        return taxRegistrationJoin;
    }


    /**
     * Sets the taxRegistrationJoin value for this CustomerSearchRow.
     * 
     * @param taxRegistrationJoin
     */
    public void setTaxRegistrationJoin(com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchRowBasic taxRegistrationJoin) {
        this.taxRegistrationJoin = taxRegistrationJoin;
    }


    /**
     * Gets the timeJoin value for this CustomerSearchRow.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this CustomerSearchRow.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the topLevelParentJoin value for this CustomerSearchRow.
     * 
     * @return topLevelParentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic getTopLevelParentJoin() {
        return topLevelParentJoin;
    }


    /**
     * Sets the topLevelParentJoin value for this CustomerSearchRow.
     * 
     * @param topLevelParentJoin
     */
    public void setTopLevelParentJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic topLevelParentJoin) {
        this.topLevelParentJoin = topLevelParentJoin;
    }


    /**
     * Gets the transactionJoin value for this CustomerSearchRow.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this CustomerSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the upsellItemJoin value for this CustomerSearchRow.
     * 
     * @return upsellItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getUpsellItemJoin() {
        return upsellItemJoin;
    }


    /**
     * Sets the upsellItemJoin value for this CustomerSearchRow.
     * 
     * @param upsellItemJoin
     */
    public void setUpsellItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic upsellItemJoin) {
        this.upsellItemJoin = upsellItemJoin;
    }


    /**
     * Gets the userJoin value for this CustomerSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this CustomerSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this CustomerSearchRow.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this CustomerSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the webSiteCategoryJoin value for this CustomerSearchRow.
     * 
     * @return webSiteCategoryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchRowBasic getWebSiteCategoryJoin() {
        return webSiteCategoryJoin;
    }


    /**
     * Sets the webSiteCategoryJoin value for this CustomerSearchRow.
     * 
     * @param webSiteCategoryJoin
     */
    public void setWebSiteCategoryJoin(com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchRowBasic webSiteCategoryJoin) {
        this.webSiteCategoryJoin = webSiteCategoryJoin;
    }


    /**
     * Gets the webSiteItemJoin value for this CustomerSearchRow.
     * 
     * @return webSiteItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic getWebSiteItemJoin() {
        return webSiteItemJoin;
    }


    /**
     * Sets the webSiteItemJoin value for this CustomerSearchRow.
     * 
     * @param webSiteItemJoin
     */
    public void setWebSiteItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic webSiteItemJoin) {
        this.webSiteItemJoin = webSiteItemJoin;
    }


    /**
     * Gets the customSearchJoin value for this CustomerSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this CustomerSearchRow.
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
        if (!(obj instanceof CustomerSearchRow)) return false;
        CustomerSearchRow other = (CustomerSearchRow) obj;
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
            ((this.billingAccountJoin==null && other.getBillingAccountJoin()==null) || 
             (this.billingAccountJoin!=null &&
              this.billingAccountJoin.equals(other.getBillingAccountJoin()))) &&
            ((this.billingScheduleJoin==null && other.getBillingScheduleJoin()==null) || 
             (this.billingScheduleJoin!=null &&
              this.billingScheduleJoin.equals(other.getBillingScheduleJoin()))) &&
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.campaignResponseJoin==null && other.getCampaignResponseJoin()==null) || 
             (this.campaignResponseJoin!=null &&
              this.campaignResponseJoin.equals(other.getCampaignResponseJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.contactPrimaryJoin==null && other.getContactPrimaryJoin()==null) || 
             (this.contactPrimaryJoin!=null &&
              this.contactPrimaryJoin.equals(other.getContactPrimaryJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.hostedPageJoin==null && other.getHostedPageJoin()==null) || 
             (this.hostedPageJoin!=null &&
              this.hostedPageJoin.equals(other.getHostedPageJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.leadSourceJoin==null && other.getLeadSourceJoin()==null) || 
             (this.leadSourceJoin!=null &&
              this.leadSourceJoin.equals(other.getLeadSourceJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.messagesFromJoin==null && other.getMessagesFromJoin()==null) || 
             (this.messagesFromJoin!=null &&
              this.messagesFromJoin.equals(other.getMessagesFromJoin()))) &&
            ((this.messagesToJoin==null && other.getMessagesToJoin()==null) || 
             (this.messagesToJoin!=null &&
              this.messagesToJoin.equals(other.getMessagesToJoin()))) &&
            ((this.mseSubsidiaryJoin==null && other.getMseSubsidiaryJoin()==null) || 
             (this.mseSubsidiaryJoin!=null &&
              this.mseSubsidiaryJoin.equals(other.getMseSubsidiaryJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
            ((this.parentCustomerJoin==null && other.getParentCustomerJoin()==null) || 
             (this.parentCustomerJoin!=null &&
              this.parentCustomerJoin.equals(other.getParentCustomerJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.pricingJoin==null && other.getPricingJoin()==null) || 
             (this.pricingJoin!=null &&
              this.pricingJoin.equals(other.getPricingJoin()))) &&
            ((this.purchasedItemJoin==null && other.getPurchasedItemJoin()==null) || 
             (this.purchasedItemJoin!=null &&
              this.purchasedItemJoin.equals(other.getPurchasedItemJoin()))) &&
            ((this.resourceAllocationJoin==null && other.getResourceAllocationJoin()==null) || 
             (this.resourceAllocationJoin!=null &&
              this.resourceAllocationJoin.equals(other.getResourceAllocationJoin()))) &&
            ((this.salesRepJoin==null && other.getSalesRepJoin()==null) || 
             (this.salesRepJoin!=null &&
              this.salesRepJoin.equals(other.getSalesRepJoin()))) &&
            ((this.subCustomerJoin==null && other.getSubCustomerJoin()==null) || 
             (this.subCustomerJoin!=null &&
              this.subCustomerJoin.equals(other.getSubCustomerJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.taxRegistrationJoin==null && other.getTaxRegistrationJoin()==null) || 
             (this.taxRegistrationJoin!=null &&
              this.taxRegistrationJoin.equals(other.getTaxRegistrationJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.topLevelParentJoin==null && other.getTopLevelParentJoin()==null) || 
             (this.topLevelParentJoin!=null &&
              this.topLevelParentJoin.equals(other.getTopLevelParentJoin()))) &&
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
            ((this.webSiteCategoryJoin==null && other.getWebSiteCategoryJoin()==null) || 
             (this.webSiteCategoryJoin!=null &&
              this.webSiteCategoryJoin.equals(other.getWebSiteCategoryJoin()))) &&
            ((this.webSiteItemJoin==null && other.getWebSiteItemJoin()==null) || 
             (this.webSiteItemJoin!=null &&
              this.webSiteItemJoin.equals(other.getWebSiteItemJoin()))) &&
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
        if (getBillingAccountJoin() != null) {
            _hashCode += getBillingAccountJoin().hashCode();
        }
        if (getBillingScheduleJoin() != null) {
            _hashCode += getBillingScheduleJoin().hashCode();
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
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getContactPrimaryJoin() != null) {
            _hashCode += getContactPrimaryJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getHostedPageJoin() != null) {
            _hashCode += getHostedPageJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getLeadSourceJoin() != null) {
            _hashCode += getLeadSourceJoin().hashCode();
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
        if (getMseSubsidiaryJoin() != null) {
            _hashCode += getMseSubsidiaryJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getOriginatingLeadJoin() != null) {
            _hashCode += getOriginatingLeadJoin().hashCode();
        }
        if (getParentCustomerJoin() != null) {
            _hashCode += getParentCustomerJoin().hashCode();
        }
        if (getPartnerJoin() != null) {
            _hashCode += getPartnerJoin().hashCode();
        }
        if (getPricingJoin() != null) {
            _hashCode += getPricingJoin().hashCode();
        }
        if (getPurchasedItemJoin() != null) {
            _hashCode += getPurchasedItemJoin().hashCode();
        }
        if (getResourceAllocationJoin() != null) {
            _hashCode += getResourceAllocationJoin().hashCode();
        }
        if (getSalesRepJoin() != null) {
            _hashCode += getSalesRepJoin().hashCode();
        }
        if (getSubCustomerJoin() != null) {
            _hashCode += getSubCustomerJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getTaxRegistrationJoin() != null) {
            _hashCode += getTaxRegistrationJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getTopLevelParentJoin() != null) {
            _hashCode += getTopLevelParentJoin().hashCode();
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
        if (getWebSiteCategoryJoin() != null) {
            _hashCode += getWebSiteCategoryJoin().hashCode();
        }
        if (getWebSiteItemJoin() != null) {
            _hashCode += getWebSiteItemJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomerSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingScheduleSearchRowBasic"));
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
        elemField.setFieldName("hostedPageJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "hostedPageJoin"));
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
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
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
        elemField.setFieldName("mseSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "mseSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MseSubsidiarySearchRowBasic"));
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
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
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
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "pricingJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PricingSearchRowBasic"));
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
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCustomerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subCustomerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
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
        elemField.setFieldName("taxRegistrationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topLevelParentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "topLevelParentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
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
        elemField.setFieldName("webSiteCategoryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "webSiteCategoryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SiteCategorySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSiteItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "webSiteItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
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
