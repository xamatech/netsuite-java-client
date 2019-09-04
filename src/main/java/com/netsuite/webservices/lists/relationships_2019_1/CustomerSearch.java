/**
 * CustomerSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class CustomerSearch  extends com.netsuite.webservices.platform.core_2019_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic basic;

    private com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic billingAccountJoin;

    private com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic billingScheduleJoin;

    private com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin;

    private com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin;

    private com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin;

    private com.netsuite.webservices.platform.common_2019_1.FileSearchBasic hostedPageJoin;

    private com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin;

    private com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic leadSourceJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin;

    private com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin;

    private com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic mseSubsidiaryJoin;

    private com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin;

    private com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic parentCustomerJoin;

    private com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin;

    private com.netsuite.webservices.platform.common_2019_1.PricingSearchBasic pricingJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic purchasedItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic salesRepJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic subCustomerJoin;

    private com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin;

    private com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic taxRegistrationJoin;

    private com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic topLevelParentJoin;

    private com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic upsellItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin;

    private com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchBasic webSiteCategoryJoin;

    private com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic webSiteItemJoin;

    private com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin;

    public CustomerSearch() {
    }

    public CustomerSearch(
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic basic,
           com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic billingAccountJoin,
           com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic billingScheduleJoin,
           com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin,
           com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin,
           com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin,
           com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin,
           com.netsuite.webservices.platform.common_2019_1.FileSearchBasic hostedPageJoin,
           com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin,
           com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic leadSourceJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin,
           com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin,
           com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic mseSubsidiaryJoin,
           com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin,
           com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic parentCustomerJoin,
           com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin,
           com.netsuite.webservices.platform.common_2019_1.PricingSearchBasic pricingJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic purchasedItemJoin,
           com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic salesRepJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic subCustomerJoin,
           com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin,
           com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic taxRegistrationJoin,
           com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic topLevelParentJoin,
           com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic upsellItemJoin,
           com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin,
           com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchBasic webSiteCategoryJoin,
           com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic webSiteItemJoin,
           com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] customSearchJoin) {
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
     * Gets the basic value for this CustomerSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this CustomerSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the billingAccountJoin value for this CustomerSearch.
     * 
     * @return billingAccountJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }


    /**
     * Sets the billingAccountJoin value for this CustomerSearch.
     * 
     * @param billingAccountJoin
     */
    public void setBillingAccountJoin(com.netsuite.webservices.platform.common_2019_1.BillingAccountSearchBasic billingAccountJoin) {
        this.billingAccountJoin = billingAccountJoin;
    }


    /**
     * Gets the billingScheduleJoin value for this CustomerSearch.
     * 
     * @return billingScheduleJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }


    /**
     * Sets the billingScheduleJoin value for this CustomerSearch.
     * 
     * @param billingScheduleJoin
     */
    public void setBillingScheduleJoin(com.netsuite.webservices.platform.common_2019_1.BillingScheduleSearchBasic billingScheduleJoin) {
        this.billingScheduleJoin = billingScheduleJoin;
    }


    /**
     * Gets the callJoin value for this CustomerSearch.
     * 
     * @return callJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this CustomerSearch.
     * 
     * @param callJoin
     */
    public void setCallJoin(com.netsuite.webservices.platform.common_2019_1.PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the campaignResponseJoin value for this CustomerSearch.
     * 
     * @return campaignResponseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this CustomerSearch.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the caseJoin value for this CustomerSearch.
     * 
     * @return caseJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this CustomerSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(com.netsuite.webservices.platform.common_2019_1.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the contactJoin value for this CustomerSearch.
     * 
     * @return contactJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this CustomerSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this CustomerSearch.
     * 
     * @return contactPrimaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this CustomerSearch.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(com.netsuite.webservices.platform.common_2019_1.ContactSearchBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the eventJoin value for this CustomerSearch.
     * 
     * @return eventJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this CustomerSearch.
     * 
     * @param eventJoin
     */
    public void setEventJoin(com.netsuite.webservices.platform.common_2019_1.CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the fileJoin value for this CustomerSearch.
     * 
     * @return fileJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this CustomerSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the hostedPageJoin value for this CustomerSearch.
     * 
     * @return hostedPageJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.FileSearchBasic getHostedPageJoin() {
        return hostedPageJoin;
    }


    /**
     * Sets the hostedPageJoin value for this CustomerSearch.
     * 
     * @param hostedPageJoin
     */
    public void setHostedPageJoin(com.netsuite.webservices.platform.common_2019_1.FileSearchBasic hostedPageJoin) {
        this.hostedPageJoin = hostedPageJoin;
    }


    /**
     * Gets the jobJoin value for this CustomerSearch.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.JobSearchBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this CustomerSearch.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2019_1.JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the leadSourceJoin value for this CustomerSearch.
     * 
     * @return leadSourceJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }


    /**
     * Sets the leadSourceJoin value for this CustomerSearch.
     * 
     * @param leadSourceJoin
     */
    public void setLeadSourceJoin(com.netsuite.webservices.platform.common_2019_1.CampaignSearchBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }


    /**
     * Gets the messagesJoin value for this CustomerSearch.
     * 
     * @return messagesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this CustomerSearch.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the messagesFromJoin value for this CustomerSearch.
     * 
     * @return messagesFromJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this CustomerSearch.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this CustomerSearch.
     * 
     * @return messagesToJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this CustomerSearch.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(com.netsuite.webservices.platform.common_2019_1.MessageSearchBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the mseSubsidiaryJoin value for this CustomerSearch.
     * 
     * @return mseSubsidiaryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic getMseSubsidiaryJoin() {
        return mseSubsidiaryJoin;
    }


    /**
     * Sets the mseSubsidiaryJoin value for this CustomerSearch.
     * 
     * @param mseSubsidiaryJoin
     */
    public void setMseSubsidiaryJoin(com.netsuite.webservices.platform.common_2019_1.MseSubsidiarySearchBasic mseSubsidiaryJoin) {
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
    }


    /**
     * Gets the opportunityJoin value for this CustomerSearch.
     * 
     * @return opportunityJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this CustomerSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(com.netsuite.webservices.platform.common_2019_1.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this CustomerSearch.
     * 
     * @return originatingLeadJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this CustomerSearch.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(com.netsuite.webservices.platform.common_2019_1.OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the parentCustomerJoin value for this CustomerSearch.
     * 
     * @return parentCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getParentCustomerJoin() {
        return parentCustomerJoin;
    }


    /**
     * Sets the parentCustomerJoin value for this CustomerSearch.
     * 
     * @param parentCustomerJoin
     */
    public void setParentCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic parentCustomerJoin) {
        this.parentCustomerJoin = parentCustomerJoin;
    }


    /**
     * Gets the partnerJoin value for this CustomerSearch.
     * 
     * @return partnerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this CustomerSearch.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(com.netsuite.webservices.platform.common_2019_1.PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the pricingJoin value for this CustomerSearch.
     * 
     * @return pricingJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.PricingSearchBasic getPricingJoin() {
        return pricingJoin;
    }


    /**
     * Sets the pricingJoin value for this CustomerSearch.
     * 
     * @param pricingJoin
     */
    public void setPricingJoin(com.netsuite.webservices.platform.common_2019_1.PricingSearchBasic pricingJoin) {
        this.pricingJoin = pricingJoin;
    }


    /**
     * Gets the purchasedItemJoin value for this CustomerSearch.
     * 
     * @return purchasedItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getPurchasedItemJoin() {
        return purchasedItemJoin;
    }


    /**
     * Sets the purchasedItemJoin value for this CustomerSearch.
     * 
     * @param purchasedItemJoin
     */
    public void setPurchasedItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic purchasedItemJoin) {
        this.purchasedItemJoin = purchasedItemJoin;
    }


    /**
     * Gets the resourceAllocationJoin value for this CustomerSearch.
     * 
     * @return resourceAllocationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }


    /**
     * Sets the resourceAllocationJoin value for this CustomerSearch.
     * 
     * @param resourceAllocationJoin
     */
    public void setResourceAllocationJoin(com.netsuite.webservices.platform.common_2019_1.ResourceAllocationSearchBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }


    /**
     * Gets the salesRepJoin value for this CustomerSearch.
     * 
     * @return salesRepJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getSalesRepJoin() {
        return salesRepJoin;
    }


    /**
     * Sets the salesRepJoin value for this CustomerSearch.
     * 
     * @param salesRepJoin
     */
    public void setSalesRepJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }


    /**
     * Gets the subCustomerJoin value for this CustomerSearch.
     * 
     * @return subCustomerJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getSubCustomerJoin() {
        return subCustomerJoin;
    }


    /**
     * Sets the subCustomerJoin value for this CustomerSearch.
     * 
     * @param subCustomerJoin
     */
    public void setSubCustomerJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic subCustomerJoin) {
        this.subCustomerJoin = subCustomerJoin;
    }


    /**
     * Gets the taskJoin value for this CustomerSearch.
     * 
     * @return taskJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this CustomerSearch.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(com.netsuite.webservices.platform.common_2019_1.TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the taxRegistrationJoin value for this CustomerSearch.
     * 
     * @return taxRegistrationJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic getTaxRegistrationJoin() {
        return taxRegistrationJoin;
    }


    /**
     * Sets the taxRegistrationJoin value for this CustomerSearch.
     * 
     * @param taxRegistrationJoin
     */
    public void setTaxRegistrationJoin(com.netsuite.webservices.platform.common_2019_1.EntityTaxRegistrationSearchBasic taxRegistrationJoin) {
        this.taxRegistrationJoin = taxRegistrationJoin;
    }


    /**
     * Gets the timeJoin value for this CustomerSearch.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this CustomerSearch.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2019_1.TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the topLevelParentJoin value for this CustomerSearch.
     * 
     * @return topLevelParentJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic getTopLevelParentJoin() {
        return topLevelParentJoin;
    }


    /**
     * Sets the topLevelParentJoin value for this CustomerSearch.
     * 
     * @param topLevelParentJoin
     */
    public void setTopLevelParentJoin(com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic topLevelParentJoin) {
        this.topLevelParentJoin = topLevelParentJoin;
    }


    /**
     * Gets the transactionJoin value for this CustomerSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this CustomerSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the upsellItemJoin value for this CustomerSearch.
     * 
     * @return upsellItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getUpsellItemJoin() {
        return upsellItemJoin;
    }


    /**
     * Sets the upsellItemJoin value for this CustomerSearch.
     * 
     * @param upsellItemJoin
     */
    public void setUpsellItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic upsellItemJoin) {
        this.upsellItemJoin = upsellItemJoin;
    }


    /**
     * Gets the userJoin value for this CustomerSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this CustomerSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2019_1.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this CustomerSearch.
     * 
     * @return userNotesJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this CustomerSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(com.netsuite.webservices.platform.common_2019_1.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the webSiteCategoryJoin value for this CustomerSearch.
     * 
     * @return webSiteCategoryJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchBasic getWebSiteCategoryJoin() {
        return webSiteCategoryJoin;
    }


    /**
     * Sets the webSiteCategoryJoin value for this CustomerSearch.
     * 
     * @param webSiteCategoryJoin
     */
    public void setWebSiteCategoryJoin(com.netsuite.webservices.platform.common_2019_1.SiteCategorySearchBasic webSiteCategoryJoin) {
        this.webSiteCategoryJoin = webSiteCategoryJoin;
    }


    /**
     * Gets the webSiteItemJoin value for this CustomerSearch.
     * 
     * @return webSiteItemJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic getWebSiteItemJoin() {
        return webSiteItemJoin;
    }


    /**
     * Sets the webSiteItemJoin value for this CustomerSearch.
     * 
     * @param webSiteItemJoin
     */
    public void setWebSiteItemJoin(com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic webSiteItemJoin) {
        this.webSiteItemJoin = webSiteItemJoin;
    }


    /**
     * Gets the customSearchJoin value for this CustomerSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2019_1.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this CustomerSearch.
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
        if (!(obj instanceof CustomerSearch)) return false;
        CustomerSearch other = (CustomerSearch) obj;
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
        new org.apache.axis.description.TypeDesc(CustomerSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingAccountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingScheduleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billingScheduleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic"));
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
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
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
        elemField.setFieldName("hostedPageJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "hostedPageJoin"));
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
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
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
        elemField.setFieldName("mseSubsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "mseSubsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "MseSubsidiarySearchBasic"));
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
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
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
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "pricingJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "PricingSearchBasic"));
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
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCustomerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subCustomerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
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
        elemField.setFieldName("taxRegistrationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topLevelParentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "topLevelParentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
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
        elemField.setFieldName("webSiteCategoryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "webSiteCategoryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SiteCategorySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSiteItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "webSiteItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
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
