/**
 * CampaignSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CampaignSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] audience;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] baseCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] campaignId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] channel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] event;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] executedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] expectedRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] family;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSalesCampaign;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] keyword;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] managerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] offer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] promoCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] recipient;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] response;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] responseCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] responseCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] responseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] responseNotes;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] revenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] roi;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] scheduledDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] searchEngine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vertical;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public CampaignSearchRowBasic() {
    }

    public CampaignSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] audience,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] baseCost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] campaignId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] channel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] event,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] executedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] expectedRevenue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] family,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSalesCampaign,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] keyword,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] managerRole,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] offer,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] promoCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] recipient,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] response,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] responseCategory,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] responseCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] responseDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] responseNotes,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] revenue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] roi,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] scheduledDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] searchEngine,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vertical,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.audience = audience;
        this.baseCost = baseCost;
        this.campaignId = campaignId;
        this.category = category;
        this.channel = channel;
        this.cost = cost;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.event = event;
        this.executedDate = executedDate;
        this.expectedRevenue = expectedRevenue;
        this.externalId = externalId;
        this.family = family;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.isSalesCampaign = isSalesCampaign;
        this.item = item;
        this.keyword = keyword;
        this.lastModifiedDate = lastModifiedDate;
        this.managerRole = managerRole;
        this.message = message;
        this.offer = offer;
        this.owner = owner;
        this.promoCode = promoCode;
        this.recipient = recipient;
        this.response = response;
        this.responseCategory = responseCategory;
        this.responseCode = responseCode;
        this.responseDate = responseDate;
        this.responseNotes = responseNotes;
        this.revenue = revenue;
        this.roi = roi;
        this.scheduledDate = scheduledDate;
        this.searchEngine = searchEngine;
        this.startDate = startDate;
        this.status = status;
        this.subscription = subscription;
        this.title = title;
        this.url = url;
        this.vertical = vertical;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the audience value for this CampaignSearchRowBasic.
     * 
     * @return audience
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this CampaignSearchRowBasic.
     * 
     * @param audience
     */
    public void setAudience(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] audience) {
        this.audience = audience;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAudience(int i) {
        return this.audience[i];
    }

    public void setAudience(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.audience[i] = _value;
    }


    /**
     * Gets the baseCost value for this CampaignSearchRowBasic.
     * 
     * @return baseCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBaseCost() {
        return baseCost;
    }


    /**
     * Sets the baseCost value for this CampaignSearchRowBasic.
     * 
     * @param baseCost
     */
    public void setBaseCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] baseCost) {
        this.baseCost = baseCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBaseCost(int i) {
        return this.baseCost[i];
    }

    public void setBaseCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.baseCost[i] = _value;
    }


    /**
     * Gets the campaignId value for this CampaignSearchRowBasic.
     * 
     * @return campaignId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignSearchRowBasic.
     * 
     * @param campaignId
     */
    public void setCampaignId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] campaignId) {
        this.campaignId = campaignId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCampaignId(int i) {
        return this.campaignId[i];
    }

    public void setCampaignId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.campaignId[i] = _value;
    }


    /**
     * Gets the category value for this CampaignSearchRowBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CampaignSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category) {
        this.category = category;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the channel value for this CampaignSearchRowBasic.
     * 
     * @return channel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CampaignSearchRowBasic.
     * 
     * @param channel
     */
    public void setChannel(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] channel) {
        this.channel = channel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getChannel(int i) {
        return this.channel[i];
    }

    public void setChannel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.channel[i] = _value;
    }


    /**
     * Gets the cost value for this CampaignSearchRowBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CampaignSearchRowBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }


    /**
     * Gets the createdDate value for this CampaignSearchRowBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CampaignSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the endDate value for this CampaignSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CampaignSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the event value for this CampaignSearchRowBasic.
     * 
     * @return event
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEvent() {
        return event;
    }


    /**
     * Sets the event value for this CampaignSearchRowBasic.
     * 
     * @param event
     */
    public void setEvent(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] event) {
        this.event = event;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEvent(int i) {
        return this.event[i];
    }

    public void setEvent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.event[i] = _value;
    }


    /**
     * Gets the executedDate value for this CampaignSearchRowBasic.
     * 
     * @return executedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExecutedDate() {
        return executedDate;
    }


    /**
     * Sets the executedDate value for this CampaignSearchRowBasic.
     * 
     * @param executedDate
     */
    public void setExecutedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] executedDate) {
        this.executedDate = executedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExecutedDate(int i) {
        return this.executedDate[i];
    }

    public void setExecutedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.executedDate[i] = _value;
    }


    /**
     * Gets the expectedRevenue value for this CampaignSearchRowBasic.
     * 
     * @return expectedRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this CampaignSearchRowBasic.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getExpectedRevenue(int i) {
        return this.expectedRevenue[i];
    }

    public void setExpectedRevenue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.expectedRevenue[i] = _value;
    }


    /**
     * Gets the externalId value for this CampaignSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CampaignSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the family value for this CampaignSearchRowBasic.
     * 
     * @return family
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getFamily() {
        return family;
    }


    /**
     * Sets the family value for this CampaignSearchRowBasic.
     * 
     * @param family
     */
    public void setFamily(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] family) {
        this.family = family;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getFamily(int i) {
        return this.family[i];
    }

    public void setFamily(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.family[i] = _value;
    }


    /**
     * Gets the internalId value for this CampaignSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isInactive value for this CampaignSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CampaignSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isSalesCampaign value for this CampaignSearchRowBasic.
     * 
     * @return isSalesCampaign
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsSalesCampaign() {
        return isSalesCampaign;
    }


    /**
     * Sets the isSalesCampaign value for this CampaignSearchRowBasic.
     * 
     * @param isSalesCampaign
     */
    public void setIsSalesCampaign(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isSalesCampaign) {
        this.isSalesCampaign = isSalesCampaign;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsSalesCampaign(int i) {
        return this.isSalesCampaign[i];
    }

    public void setIsSalesCampaign(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isSalesCampaign[i] = _value;
    }


    /**
     * Gets the item value for this CampaignSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this CampaignSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the keyword value for this CampaignSearchRowBasic.
     * 
     * @return keyword
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this CampaignSearchRowBasic.
     * 
     * @param keyword
     */
    public void setKeyword(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] keyword) {
        this.keyword = keyword;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getKeyword(int i) {
        return this.keyword[i];
    }

    public void setKeyword(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.keyword[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this CampaignSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CampaignSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the managerRole value for this CampaignSearchRowBasic.
     * 
     * @return managerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getManagerRole() {
        return managerRole;
    }


    /**
     * Sets the managerRole value for this CampaignSearchRowBasic.
     * 
     * @param managerRole
     */
    public void setManagerRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] managerRole) {
        this.managerRole = managerRole;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getManagerRole(int i) {
        return this.managerRole[i];
    }

    public void setManagerRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.managerRole[i] = _value;
    }


    /**
     * Gets the message value for this CampaignSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CampaignSearchRowBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message) {
        this.message = message;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.message[i] = _value;
    }


    /**
     * Gets the offer value for this CampaignSearchRowBasic.
     * 
     * @return offer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this CampaignSearchRowBasic.
     * 
     * @param offer
     */
    public void setOffer(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] offer) {
        this.offer = offer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOffer(int i) {
        return this.offer[i];
    }

    public void setOffer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.offer[i] = _value;
    }


    /**
     * Gets the owner value for this CampaignSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CampaignSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the promoCode value for this CampaignSearchRowBasic.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this CampaignSearchRowBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] promoCode) {
        this.promoCode = promoCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.promoCode[i] = _value;
    }


    /**
     * Gets the recipient value for this CampaignSearchRowBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CampaignSearchRowBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] recipient) {
        this.recipient = recipient;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRecipient(int i) {
        return this.recipient[i];
    }

    public void setRecipient(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.recipient[i] = _value;
    }


    /**
     * Gets the response value for this CampaignSearchRowBasic.
     * 
     * @return response
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CampaignSearchRowBasic.
     * 
     * @param response
     */
    public void setResponse(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] response) {
        this.response = response;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getResponse(int i) {
        return this.response[i];
    }

    public void setResponse(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.response[i] = _value;
    }


    /**
     * Gets the responseCategory value for this CampaignSearchRowBasic.
     * 
     * @return responseCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getResponseCategory() {
        return responseCategory;
    }


    /**
     * Sets the responseCategory value for this CampaignSearchRowBasic.
     * 
     * @param responseCategory
     */
    public void setResponseCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] responseCategory) {
        this.responseCategory = responseCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getResponseCategory(int i) {
        return this.responseCategory[i];
    }

    public void setResponseCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.responseCategory[i] = _value;
    }


    /**
     * Gets the responseCode value for this CampaignSearchRowBasic.
     * 
     * @return responseCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CampaignSearchRowBasic.
     * 
     * @param responseCode
     */
    public void setResponseCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] responseCode) {
        this.responseCode = responseCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getResponseCode(int i) {
        return this.responseCode[i];
    }

    public void setResponseCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.responseCode[i] = _value;
    }


    /**
     * Gets the responseDate value for this CampaignSearchRowBasic.
     * 
     * @return responseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getResponseDate() {
        return responseDate;
    }


    /**
     * Sets the responseDate value for this CampaignSearchRowBasic.
     * 
     * @param responseDate
     */
    public void setResponseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] responseDate) {
        this.responseDate = responseDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getResponseDate(int i) {
        return this.responseDate[i];
    }

    public void setResponseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.responseDate[i] = _value;
    }


    /**
     * Gets the responseNotes value for this CampaignSearchRowBasic.
     * 
     * @return responseNotes
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getResponseNotes() {
        return responseNotes;
    }


    /**
     * Sets the responseNotes value for this CampaignSearchRowBasic.
     * 
     * @param responseNotes
     */
    public void setResponseNotes(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] responseNotes) {
        this.responseNotes = responseNotes;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getResponseNotes(int i) {
        return this.responseNotes[i];
    }

    public void setResponseNotes(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.responseNotes[i] = _value;
    }


    /**
     * Gets the revenue value for this CampaignSearchRowBasic.
     * 
     * @return revenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRevenue() {
        return revenue;
    }


    /**
     * Sets the revenue value for this CampaignSearchRowBasic.
     * 
     * @param revenue
     */
    public void setRevenue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] revenue) {
        this.revenue = revenue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRevenue(int i) {
        return this.revenue[i];
    }

    public void setRevenue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.revenue[i] = _value;
    }


    /**
     * Gets the roi value for this CampaignSearchRowBasic.
     * 
     * @return roi
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRoi() {
        return roi;
    }


    /**
     * Sets the roi value for this CampaignSearchRowBasic.
     * 
     * @param roi
     */
    public void setRoi(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] roi) {
        this.roi = roi;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRoi(int i) {
        return this.roi[i];
    }

    public void setRoi(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.roi[i] = _value;
    }


    /**
     * Gets the scheduledDate value for this CampaignSearchRowBasic.
     * 
     * @return scheduledDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getScheduledDate() {
        return scheduledDate;
    }


    /**
     * Sets the scheduledDate value for this CampaignSearchRowBasic.
     * 
     * @param scheduledDate
     */
    public void setScheduledDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getScheduledDate(int i) {
        return this.scheduledDate[i];
    }

    public void setScheduledDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.scheduledDate[i] = _value;
    }


    /**
     * Gets the searchEngine value for this CampaignSearchRowBasic.
     * 
     * @return searchEngine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSearchEngine() {
        return searchEngine;
    }


    /**
     * Sets the searchEngine value for this CampaignSearchRowBasic.
     * 
     * @param searchEngine
     */
    public void setSearchEngine(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] searchEngine) {
        this.searchEngine = searchEngine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSearchEngine(int i) {
        return this.searchEngine[i];
    }

    public void setSearchEngine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.searchEngine[i] = _value;
    }


    /**
     * Gets the startDate value for this CampaignSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CampaignSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the status value for this CampaignSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the subscription value for this CampaignSearchRowBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this CampaignSearchRowBasic.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription) {
        this.subscription = subscription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subscription[i] = _value;
    }


    /**
     * Gets the title value for this CampaignSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CampaignSearchRowBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title) {
        this.title = title;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the url value for this CampaignSearchRowBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this CampaignSearchRowBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url) {
        this.url = url;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.url[i] = _value;
    }


    /**
     * Gets the vertical value for this CampaignSearchRowBasic.
     * 
     * @return vertical
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVertical() {
        return vertical;
    }


    /**
     * Sets the vertical value for this CampaignSearchRowBasic.
     * 
     * @param vertical
     */
    public void setVertical(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vertical) {
        this.vertical = vertical;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVertical(int i) {
        return this.vertical[i];
    }

    public void setVertical(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.vertical[i] = _value;
    }


    /**
     * Gets the customFieldList value for this CampaignSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CampaignSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSearchRowBasic)) return false;
        CampaignSearchRowBasic other = (CampaignSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.audience, other.getAudience()))) &&
            ((this.baseCost==null && other.getBaseCost()==null) || 
             (this.baseCost!=null &&
              java.util.Arrays.equals(this.baseCost, other.getBaseCost()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              java.util.Arrays.equals(this.campaignId, other.getCampaignId()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              java.util.Arrays.equals(this.event, other.getEvent()))) &&
            ((this.executedDate==null && other.getExecutedDate()==null) || 
             (this.executedDate!=null &&
              java.util.Arrays.equals(this.executedDate, other.getExecutedDate()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              java.util.Arrays.equals(this.expectedRevenue, other.getExpectedRevenue()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              java.util.Arrays.equals(this.family, other.getFamily()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isSalesCampaign==null && other.getIsSalesCampaign()==null) || 
             (this.isSalesCampaign!=null &&
              java.util.Arrays.equals(this.isSalesCampaign, other.getIsSalesCampaign()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              java.util.Arrays.equals(this.keyword, other.getKeyword()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.managerRole==null && other.getManagerRole()==null) || 
             (this.managerRole!=null &&
              java.util.Arrays.equals(this.managerRole, other.getManagerRole()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              java.util.Arrays.equals(this.offer, other.getOffer()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              java.util.Arrays.equals(this.promoCode, other.getPromoCode()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              java.util.Arrays.equals(this.recipient, other.getRecipient()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse()))) &&
            ((this.responseCategory==null && other.getResponseCategory()==null) || 
             (this.responseCategory!=null &&
              java.util.Arrays.equals(this.responseCategory, other.getResponseCategory()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              java.util.Arrays.equals(this.responseCode, other.getResponseCode()))) &&
            ((this.responseDate==null && other.getResponseDate()==null) || 
             (this.responseDate!=null &&
              java.util.Arrays.equals(this.responseDate, other.getResponseDate()))) &&
            ((this.responseNotes==null && other.getResponseNotes()==null) || 
             (this.responseNotes!=null &&
              java.util.Arrays.equals(this.responseNotes, other.getResponseNotes()))) &&
            ((this.revenue==null && other.getRevenue()==null) || 
             (this.revenue!=null &&
              java.util.Arrays.equals(this.revenue, other.getRevenue()))) &&
            ((this.roi==null && other.getRoi()==null) || 
             (this.roi!=null &&
              java.util.Arrays.equals(this.roi, other.getRoi()))) &&
            ((this.scheduledDate==null && other.getScheduledDate()==null) || 
             (this.scheduledDate!=null &&
              java.util.Arrays.equals(this.scheduledDate, other.getScheduledDate()))) &&
            ((this.searchEngine==null && other.getSearchEngine()==null) || 
             (this.searchEngine!=null &&
              java.util.Arrays.equals(this.searchEngine, other.getSearchEngine()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              java.util.Arrays.equals(this.subscription, other.getSubscription()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl()))) &&
            ((this.vertical==null && other.getVertical()==null) || 
             (this.vertical!=null &&
              java.util.Arrays.equals(this.vertical, other.getVertical()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudience());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudience(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExecutedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExecutedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExecutedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFamily() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamily());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamily(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSalesCampaign() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSalesCampaign());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSalesCampaign(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeyword() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyword());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyword(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagerRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagerRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagerRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOffer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOffer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOffer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromoCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduledDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchEngine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchEngine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchEngine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVertical() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVertical());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVertical(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "executedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isSalesCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "managerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "responseNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "roi"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "scheduledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
