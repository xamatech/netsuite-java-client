/**
 * SiteCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.website_2019_1;

public class SiteCategory  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef website;

    private java.lang.String itemId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parentCategory;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef categoryListLayout;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemListLayout;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef relatedItemsListLayout;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef correlatedItemsListLayout;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isInactive;

    private java.lang.String description;

    private java.lang.String storeDetailedDescription;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage;

    private java.lang.String pageTitle;

    private java.lang.String metaTagHtml;

    private java.lang.Boolean excludeFromSitemap;

    private java.lang.String urlComponent;

    private com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority;

    private java.lang.String searchKeywords;

    private com.netsuite.webservices.lists.website_2019_1.SiteCategoryPresentationItemList presentationItemList;

    private com.netsuite.webservices.lists.website_2019_1.SiteCategoryTranslationList translationsList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public SiteCategory() {
    }

    public SiteCategory(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef website,
           java.lang.String itemId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parentCategory,
           com.netsuite.webservices.platform.core_2019_1.RecordRef categoryListLayout,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemListLayout,
           com.netsuite.webservices.platform.core_2019_1.RecordRef relatedItemsListLayout,
           com.netsuite.webservices.platform.core_2019_1.RecordRef correlatedItemsListLayout,
           java.lang.Boolean isOnline,
           java.lang.Boolean isInactive,
           java.lang.String description,
           java.lang.String storeDetailedDescription,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail,
           com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage,
           java.lang.String pageTitle,
           java.lang.String metaTagHtml,
           java.lang.Boolean excludeFromSitemap,
           java.lang.String urlComponent,
           com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority,
           java.lang.String searchKeywords,
           com.netsuite.webservices.lists.website_2019_1.SiteCategoryPresentationItemList presentationItemList,
           com.netsuite.webservices.lists.website_2019_1.SiteCategoryTranslationList translationsList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.website = website;
        this.itemId = itemId;
        this.parentCategory = parentCategory;
        this.categoryListLayout = categoryListLayout;
        this.itemListLayout = itemListLayout;
        this.relatedItemsListLayout = relatedItemsListLayout;
        this.correlatedItemsListLayout = correlatedItemsListLayout;
        this.isOnline = isOnline;
        this.isInactive = isInactive;
        this.description = description;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.storeDisplayImage = storeDisplayImage;
        this.pageTitle = pageTitle;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.urlComponent = urlComponent;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.presentationItemList = presentationItemList;
        this.translationsList = translationsList;
    }


    /**
     * Gets the website value for this SiteCategory.
     * 
     * @return website
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this SiteCategory.
     * 
     * @param website
     */
    public void setWebsite(com.netsuite.webservices.platform.core_2019_1.RecordRef website) {
        this.website = website;
    }


    /**
     * Gets the itemId value for this SiteCategory.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SiteCategory.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the parentCategory value for this SiteCategory.
     * 
     * @return parentCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParentCategory() {
        return parentCategory;
    }


    /**
     * Sets the parentCategory value for this SiteCategory.
     * 
     * @param parentCategory
     */
    public void setParentCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef parentCategory) {
        this.parentCategory = parentCategory;
    }


    /**
     * Gets the categoryListLayout value for this SiteCategory.
     * 
     * @return categoryListLayout
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategoryListLayout() {
        return categoryListLayout;
    }


    /**
     * Sets the categoryListLayout value for this SiteCategory.
     * 
     * @param categoryListLayout
     */
    public void setCategoryListLayout(com.netsuite.webservices.platform.core_2019_1.RecordRef categoryListLayout) {
        this.categoryListLayout = categoryListLayout;
    }


    /**
     * Gets the itemListLayout value for this SiteCategory.
     * 
     * @return itemListLayout
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemListLayout() {
        return itemListLayout;
    }


    /**
     * Sets the itemListLayout value for this SiteCategory.
     * 
     * @param itemListLayout
     */
    public void setItemListLayout(com.netsuite.webservices.platform.core_2019_1.RecordRef itemListLayout) {
        this.itemListLayout = itemListLayout;
    }


    /**
     * Gets the relatedItemsListLayout value for this SiteCategory.
     * 
     * @return relatedItemsListLayout
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRelatedItemsListLayout() {
        return relatedItemsListLayout;
    }


    /**
     * Sets the relatedItemsListLayout value for this SiteCategory.
     * 
     * @param relatedItemsListLayout
     */
    public void setRelatedItemsListLayout(com.netsuite.webservices.platform.core_2019_1.RecordRef relatedItemsListLayout) {
        this.relatedItemsListLayout = relatedItemsListLayout;
    }


    /**
     * Gets the correlatedItemsListLayout value for this SiteCategory.
     * 
     * @return correlatedItemsListLayout
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCorrelatedItemsListLayout() {
        return correlatedItemsListLayout;
    }


    /**
     * Sets the correlatedItemsListLayout value for this SiteCategory.
     * 
     * @param correlatedItemsListLayout
     */
    public void setCorrelatedItemsListLayout(com.netsuite.webservices.platform.core_2019_1.RecordRef correlatedItemsListLayout) {
        this.correlatedItemsListLayout = correlatedItemsListLayout;
    }


    /**
     * Gets the isOnline value for this SiteCategory.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this SiteCategory.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isInactive value for this SiteCategory.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SiteCategory.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the description value for this SiteCategory.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SiteCategory.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the storeDetailedDescription value for this SiteCategory.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this SiteCategory.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the storeDisplayThumbnail value for this SiteCategory.
     * 
     * @return storeDisplayThumbnail
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this SiteCategory.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the storeDisplayImage value for this SiteCategory.
     * 
     * @return storeDisplayImage
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this SiteCategory.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(com.netsuite.webservices.platform.core_2019_1.RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }


    /**
     * Gets the pageTitle value for this SiteCategory.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this SiteCategory.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the metaTagHtml value for this SiteCategory.
     * 
     * @return metaTagHtml
     */
    public java.lang.String getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this SiteCategory.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(java.lang.String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the excludeFromSitemap value for this SiteCategory.
     * 
     * @return excludeFromSitemap
     */
    public java.lang.Boolean getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this SiteCategory.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(java.lang.Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the urlComponent value for this SiteCategory.
     * 
     * @return urlComponent
     */
    public java.lang.String getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this SiteCategory.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(java.lang.String urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the sitemapPriority value for this SiteCategory.
     * 
     * @return sitemapPriority
     */
    public com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this SiteCategory.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(com.netsuite.webservices.platform.common_2019_1.types.SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the searchKeywords value for this SiteCategory.
     * 
     * @return searchKeywords
     */
    public java.lang.String getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this SiteCategory.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(java.lang.String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the presentationItemList value for this SiteCategory.
     * 
     * @return presentationItemList
     */
    public com.netsuite.webservices.lists.website_2019_1.SiteCategoryPresentationItemList getPresentationItemList() {
        return presentationItemList;
    }


    /**
     * Sets the presentationItemList value for this SiteCategory.
     * 
     * @param presentationItemList
     */
    public void setPresentationItemList(com.netsuite.webservices.lists.website_2019_1.SiteCategoryPresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }


    /**
     * Gets the translationsList value for this SiteCategory.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.lists.website_2019_1.SiteCategoryTranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this SiteCategory.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.lists.website_2019_1.SiteCategoryTranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the internalId value for this SiteCategory.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SiteCategory.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this SiteCategory.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SiteCategory.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteCategory)) return false;
        SiteCategory other = (SiteCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.parentCategory==null && other.getParentCategory()==null) || 
             (this.parentCategory!=null &&
              this.parentCategory.equals(other.getParentCategory()))) &&
            ((this.categoryListLayout==null && other.getCategoryListLayout()==null) || 
             (this.categoryListLayout!=null &&
              this.categoryListLayout.equals(other.getCategoryListLayout()))) &&
            ((this.itemListLayout==null && other.getItemListLayout()==null) || 
             (this.itemListLayout!=null &&
              this.itemListLayout.equals(other.getItemListLayout()))) &&
            ((this.relatedItemsListLayout==null && other.getRelatedItemsListLayout()==null) || 
             (this.relatedItemsListLayout!=null &&
              this.relatedItemsListLayout.equals(other.getRelatedItemsListLayout()))) &&
            ((this.correlatedItemsListLayout==null && other.getCorrelatedItemsListLayout()==null) || 
             (this.correlatedItemsListLayout!=null &&
              this.correlatedItemsListLayout.equals(other.getCorrelatedItemsListLayout()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              this.storeDetailedDescription.equals(other.getStoreDetailedDescription()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail()))) &&
            ((this.storeDisplayImage==null && other.getStoreDisplayImage()==null) || 
             (this.storeDisplayImage!=null &&
              this.storeDisplayImage.equals(other.getStoreDisplayImage()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              this.metaTagHtml.equals(other.getMetaTagHtml()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              this.excludeFromSitemap.equals(other.getExcludeFromSitemap()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              this.sitemapPriority.equals(other.getSitemapPriority()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              this.searchKeywords.equals(other.getSearchKeywords()))) &&
            ((this.presentationItemList==null && other.getPresentationItemList()==null) || 
             (this.presentationItemList!=null &&
              this.presentationItemList.equals(other.getPresentationItemList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getParentCategory() != null) {
            _hashCode += getParentCategory().hashCode();
        }
        if (getCategoryListLayout() != null) {
            _hashCode += getCategoryListLayout().hashCode();
        }
        if (getItemListLayout() != null) {
            _hashCode += getItemListLayout().hashCode();
        }
        if (getRelatedItemsListLayout() != null) {
            _hashCode += getRelatedItemsListLayout().hashCode();
        }
        if (getCorrelatedItemsListLayout() != null) {
            _hashCode += getCorrelatedItemsListLayout().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStoreDetailedDescription() != null) {
            _hashCode += getStoreDetailedDescription().hashCode();
        }
        if (getStoreDisplayThumbnail() != null) {
            _hashCode += getStoreDisplayThumbnail().hashCode();
        }
        if (getStoreDisplayImage() != null) {
            _hashCode += getStoreDisplayImage().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        if (getMetaTagHtml() != null) {
            _hashCode += getMetaTagHtml().hashCode();
        }
        if (getExcludeFromSitemap() != null) {
            _hashCode += getExcludeFromSitemap().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getSitemapPriority() != null) {
            _hashCode += getSitemapPriority().hashCode();
        }
        if (getSearchKeywords() != null) {
            _hashCode += getSearchKeywords().hashCode();
        }
        if (getPresentationItemList() != null) {
            _hashCode += getPresentationItemList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "SiteCategory"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "website"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "parentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryListLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "categoryListLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemListLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "itemListLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsListLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "relatedItemsListLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedItemsListLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "correlatedItemsListLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "SitemapPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "presentationItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "SiteCategoryPresentationItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:website_2019_1.lists.webservices.netsuite.com", "SiteCategoryTranslationList"));
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
