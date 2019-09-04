/**
 * CampaignSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CampaignSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField audience;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField baseCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField campaignEventType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField campaignId;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField channel;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField event;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField expectedRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField family;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSalesCampaign;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField keyword;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manager;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField managerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField number;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField offer;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField promoCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField response;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField responseCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField responseCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField responseComments;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField responseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField scheduleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField searchEngine;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField template;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vertical;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public CampaignSearchBasic() {
    }

    public CampaignSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField audience,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField baseCost,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField campaignEventType,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField campaignId,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField channel,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField event,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField expectedRevenue,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField family,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSalesCampaign,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField keyword,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manager,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField managerRole,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField number,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField offer,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField promoCode,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recipient,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField response,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField responseCategory,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField responseCode,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField responseComments,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField responseDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField scheduleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField searchEngine,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField template,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vertical,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.audience = audience;
        this.baseCost = baseCost;
        this.campaignEventType = campaignEventType;
        this.campaignId = campaignId;
        this.category = category;
        this.channel = channel;
        this.cost = cost;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.event = event;
        this.expectedRevenue = expectedRevenue;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.family = family;
        this.group = group;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isSalesCampaign = isSalesCampaign;
        this.item = item;
        this.keyword = keyword;
        this.lastModifiedDate = lastModifiedDate;
        this.manager = manager;
        this.managerRole = managerRole;
        this.number = number;
        this.offer = offer;
        this.promoCode = promoCode;
        this.recipient = recipient;
        this.response = response;
        this.responseCategory = responseCategory;
        this.responseCode = responseCode;
        this.responseComments = responseComments;
        this.responseDate = responseDate;
        this.scheduleDate = scheduleDate;
        this.searchEngine = searchEngine;
        this.startDate = startDate;
        this.status = status;
        this.subscription = subscription;
        this.template = template;
        this.title = title;
        this.vertical = vertical;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the audience value for this CampaignSearchBasic.
     * 
     * @return audience
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this CampaignSearchBasic.
     * 
     * @param audience
     */
    public void setAudience(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField audience) {
        this.audience = audience;
    }


    /**
     * Gets the baseCost value for this CampaignSearchBasic.
     * 
     * @return baseCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBaseCost() {
        return baseCost;
    }


    /**
     * Sets the baseCost value for this CampaignSearchBasic.
     * 
     * @param baseCost
     */
    public void setBaseCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField baseCost) {
        this.baseCost = baseCost;
    }


    /**
     * Gets the campaignEventType value for this CampaignSearchBasic.
     * 
     * @return campaignEventType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCampaignEventType() {
        return campaignEventType;
    }


    /**
     * Sets the campaignEventType value for this CampaignSearchBasic.
     * 
     * @param campaignEventType
     */
    public void setCampaignEventType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField campaignEventType) {
        this.campaignEventType = campaignEventType;
    }


    /**
     * Gets the campaignId value for this CampaignSearchBasic.
     * 
     * @return campaignId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignSearchBasic.
     * 
     * @param campaignId
     */
    public void setCampaignId(com.netsuite.webservices.platform.core_2019_1.SearchStringField campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the category value for this CampaignSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CampaignSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the channel value for this CampaignSearchBasic.
     * 
     * @return channel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CampaignSearchBasic.
     * 
     * @param channel
     */
    public void setChannel(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField channel) {
        this.channel = channel;
    }


    /**
     * Gets the cost value for this CampaignSearchBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CampaignSearchBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the createdDate value for this CampaignSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CampaignSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this CampaignSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CampaignSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the event value for this CampaignSearchBasic.
     * 
     * @return event
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEvent() {
        return event;
    }


    /**
     * Sets the event value for this CampaignSearchBasic.
     * 
     * @param event
     */
    public void setEvent(com.netsuite.webservices.platform.core_2019_1.SearchStringField event) {
        this.event = event;
    }


    /**
     * Gets the expectedRevenue value for this CampaignSearchBasic.
     * 
     * @return expectedRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this CampaignSearchBasic.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the externalId value for this CampaignSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CampaignSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this CampaignSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this CampaignSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the family value for this CampaignSearchBasic.
     * 
     * @return family
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFamily() {
        return family;
    }


    /**
     * Sets the family value for this CampaignSearchBasic.
     * 
     * @param family
     */
    public void setFamily(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField family) {
        this.family = family;
    }


    /**
     * Gets the group value for this CampaignSearchBasic.
     * 
     * @return group
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CampaignSearchBasic.
     * 
     * @param group
     */
    public void setGroup(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the internalId value for this CampaignSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CampaignSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CampaignSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this CampaignSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CampaignSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isSalesCampaign value for this CampaignSearchBasic.
     * 
     * @return isSalesCampaign
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsSalesCampaign() {
        return isSalesCampaign;
    }


    /**
     * Sets the isSalesCampaign value for this CampaignSearchBasic.
     * 
     * @param isSalesCampaign
     */
    public void setIsSalesCampaign(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isSalesCampaign) {
        this.isSalesCampaign = isSalesCampaign;
    }


    /**
     * Gets the item value for this CampaignSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this CampaignSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the keyword value for this CampaignSearchBasic.
     * 
     * @return keyword
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this CampaignSearchBasic.
     * 
     * @param keyword
     */
    public void setKeyword(com.netsuite.webservices.platform.core_2019_1.SearchStringField keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the lastModifiedDate value for this CampaignSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CampaignSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the manager value for this CampaignSearchBasic.
     * 
     * @return manager
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this CampaignSearchBasic.
     * 
     * @param manager
     */
    public void setManager(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerRole value for this CampaignSearchBasic.
     * 
     * @return managerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManagerRole() {
        return managerRole;
    }


    /**
     * Sets the managerRole value for this CampaignSearchBasic.
     * 
     * @param managerRole
     */
    public void setManagerRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField managerRole) {
        this.managerRole = managerRole;
    }


    /**
     * Gets the number value for this CampaignSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CampaignSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the offer value for this CampaignSearchBasic.
     * 
     * @return offer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this CampaignSearchBasic.
     * 
     * @param offer
     */
    public void setOffer(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField offer) {
        this.offer = offer;
    }


    /**
     * Gets the promoCode value for this CampaignSearchBasic.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this CampaignSearchBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the recipient value for this CampaignSearchBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CampaignSearchBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the response value for this CampaignSearchBasic.
     * 
     * @return response
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CampaignSearchBasic.
     * 
     * @param response
     */
    public void setResponse(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField response) {
        this.response = response;
    }


    /**
     * Gets the responseCategory value for this CampaignSearchBasic.
     * 
     * @return responseCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getResponseCategory() {
        return responseCategory;
    }


    /**
     * Sets the responseCategory value for this CampaignSearchBasic.
     * 
     * @param responseCategory
     */
    public void setResponseCategory(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField responseCategory) {
        this.responseCategory = responseCategory;
    }


    /**
     * Gets the responseCode value for this CampaignSearchBasic.
     * 
     * @return responseCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CampaignSearchBasic.
     * 
     * @param responseCode
     */
    public void setResponseCode(com.netsuite.webservices.platform.core_2019_1.SearchLongField responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseComments value for this CampaignSearchBasic.
     * 
     * @return responseComments
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getResponseComments() {
        return responseComments;
    }


    /**
     * Sets the responseComments value for this CampaignSearchBasic.
     * 
     * @param responseComments
     */
    public void setResponseComments(com.netsuite.webservices.platform.core_2019_1.SearchStringField responseComments) {
        this.responseComments = responseComments;
    }


    /**
     * Gets the responseDate value for this CampaignSearchBasic.
     * 
     * @return responseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getResponseDate() {
        return responseDate;
    }


    /**
     * Sets the responseDate value for this CampaignSearchBasic.
     * 
     * @param responseDate
     */
    public void setResponseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField responseDate) {
        this.responseDate = responseDate;
    }


    /**
     * Gets the scheduleDate value for this CampaignSearchBasic.
     * 
     * @return scheduleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this CampaignSearchBasic.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the searchEngine value for this CampaignSearchBasic.
     * 
     * @return searchEngine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSearchEngine() {
        return searchEngine;
    }


    /**
     * Sets the searchEngine value for this CampaignSearchBasic.
     * 
     * @param searchEngine
     */
    public void setSearchEngine(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField searchEngine) {
        this.searchEngine = searchEngine;
    }


    /**
     * Gets the startDate value for this CampaignSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CampaignSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this CampaignSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subscription value for this CampaignSearchBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this CampaignSearchBasic.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the template value for this CampaignSearchBasic.
     * 
     * @return template
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this CampaignSearchBasic.
     * 
     * @param template
     */
    public void setTemplate(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField template) {
        this.template = template;
    }


    /**
     * Gets the title value for this CampaignSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CampaignSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the vertical value for this CampaignSearchBasic.
     * 
     * @return vertical
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVertical() {
        return vertical;
    }


    /**
     * Sets the vertical value for this CampaignSearchBasic.
     * 
     * @param vertical
     */
    public void setVertical(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vertical) {
        this.vertical = vertical;
    }


    /**
     * Gets the customFieldList value for this CampaignSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CampaignSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSearchBasic)) return false;
        CampaignSearchBasic other = (CampaignSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audience==null && other.getAudience()==null) || 
             (this.audience!=null &&
              this.audience.equals(other.getAudience()))) &&
            ((this.baseCost==null && other.getBaseCost()==null) || 
             (this.baseCost!=null &&
              this.baseCost.equals(other.getBaseCost()))) &&
            ((this.campaignEventType==null && other.getCampaignEventType()==null) || 
             (this.campaignEventType!=null &&
              this.campaignEventType.equals(other.getCampaignEventType()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              this.family.equals(other.getFamily()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isSalesCampaign==null && other.getIsSalesCampaign()==null) || 
             (this.isSalesCampaign!=null &&
              this.isSalesCampaign.equals(other.getIsSalesCampaign()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.managerRole==null && other.getManagerRole()==null) || 
             (this.managerRole!=null &&
              this.managerRole.equals(other.getManagerRole()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.responseCategory==null && other.getResponseCategory()==null) || 
             (this.responseCategory!=null &&
              this.responseCategory.equals(other.getResponseCategory()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseComments==null && other.getResponseComments()==null) || 
             (this.responseComments!=null &&
              this.responseComments.equals(other.getResponseComments()))) &&
            ((this.responseDate==null && other.getResponseDate()==null) || 
             (this.responseDate!=null &&
              this.responseDate.equals(other.getResponseDate()))) &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.searchEngine==null && other.getSearchEngine()==null) || 
             (this.searchEngine!=null &&
              this.searchEngine.equals(other.getSearchEngine()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.vertical==null && other.getVertical()==null) || 
             (this.vertical!=null &&
              this.vertical.equals(other.getVertical()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getAudience() != null) {
            _hashCode += getAudience().hashCode();
        }
        if (getBaseCost() != null) {
            _hashCode += getBaseCost().hashCode();
        }
        if (getCampaignEventType() != null) {
            _hashCode += getCampaignEventType().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFamily() != null) {
            _hashCode += getFamily().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsSalesCampaign() != null) {
            _hashCode += getIsSalesCampaign().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getManagerRole() != null) {
            _hashCode += getManagerRole().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getResponseCategory() != null) {
            _hashCode += getResponseCategory().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseComments() != null) {
            _hashCode += getResponseComments().hashCode();
        }
        if (getResponseDate() != null) {
            _hashCode += getResponseDate().hashCode();
        }
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getSearchEngine() != null) {
            _hashCode += getSearchEngine().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getVertical() != null) {
            _hashCode += getVertical().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "campaignEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSalesCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "managerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
