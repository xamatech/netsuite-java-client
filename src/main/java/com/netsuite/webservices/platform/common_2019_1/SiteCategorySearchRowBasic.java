/**
 * SiteCategorySearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class SiteCategorySearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromSitemap;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fullName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hidden;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] longDescription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pageTitle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] sitemapPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] urlComponent;

    public SiteCategorySearchRowBasic() {
    }

    public SiteCategorySearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromSitemap,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fullName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hidden,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] longDescription,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pageTitle,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] sitemapPriority,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] urlComponent) {
        this.dateViewed = dateViewed;
        this.description = description;
        this.excludeFromSitemap = excludeFromSitemap;
        this.externalId = externalId;
        this.fullName = fullName;
        this.hidden = hidden;
        this.hits = hits;
        this.internalId = internalId;
        this.longDescription = longDescription;
        this.name = name;
        this.pageTitle = pageTitle;
        this.sitemapPriority = sitemapPriority;
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the dateViewed value for this SiteCategorySearchRowBasic.
     * 
     * @return dateViewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this SiteCategorySearchRowBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed) {
        this.dateViewed = dateViewed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateViewed(int i) {
        return this.dateViewed[i];
    }

    public void setDateViewed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateViewed[i] = _value;
    }


    /**
     * Gets the description value for this SiteCategorySearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SiteCategorySearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the excludeFromSitemap value for this SiteCategorySearchRowBasic.
     * 
     * @return excludeFromSitemap
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this SiteCategorySearchRowBasic.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getExcludeFromSitemap(int i) {
        return this.excludeFromSitemap[i];
    }

    public void setExcludeFromSitemap(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.excludeFromSitemap[i] = _value;
    }


    /**
     * Gets the externalId value for this SiteCategorySearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SiteCategorySearchRowBasic.
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
     * Gets the fullName value for this SiteCategorySearchRowBasic.
     * 
     * @return fullName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this SiteCategorySearchRowBasic.
     * 
     * @param fullName
     */
    public void setFullName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fullName) {
        this.fullName = fullName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFullName(int i) {
        return this.fullName[i];
    }

    public void setFullName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.fullName[i] = _value;
    }


    /**
     * Gets the hidden value for this SiteCategorySearchRowBasic.
     * 
     * @return hidden
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this SiteCategorySearchRowBasic.
     * 
     * @param hidden
     */
    public void setHidden(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hidden) {
        this.hidden = hidden;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getHidden(int i) {
        return this.hidden[i];
    }

    public void setHidden(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.hidden[i] = _value;
    }


    /**
     * Gets the hits value for this SiteCategorySearchRowBasic.
     * 
     * @return hits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this SiteCategorySearchRowBasic.
     * 
     * @param hits
     */
    public void setHits(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits) {
        this.hits = hits;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getHits(int i) {
        return this.hits[i];
    }

    public void setHits(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.hits[i] = _value;
    }


    /**
     * Gets the internalId value for this SiteCategorySearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SiteCategorySearchRowBasic.
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
     * Gets the longDescription value for this SiteCategorySearchRowBasic.
     * 
     * @return longDescription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLongDescription() {
        return longDescription;
    }


    /**
     * Sets the longDescription value for this SiteCategorySearchRowBasic.
     * 
     * @param longDescription
     */
    public void setLongDescription(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] longDescription) {
        this.longDescription = longDescription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLongDescription(int i) {
        return this.longDescription[i];
    }

    public void setLongDescription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.longDescription[i] = _value;
    }


    /**
     * Gets the name value for this SiteCategorySearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this SiteCategorySearchRowBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name) {
        this.name = name;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the pageTitle value for this SiteCategorySearchRowBasic.
     * 
     * @return pageTitle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this SiteCategorySearchRowBasic.
     * 
     * @param pageTitle
     */
    public void setPageTitle(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pageTitle) {
        this.pageTitle = pageTitle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPageTitle(int i) {
        return this.pageTitle[i];
    }

    public void setPageTitle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pageTitle[i] = _value;
    }


    /**
     * Gets the sitemapPriority value for this SiteCategorySearchRowBasic.
     * 
     * @return sitemapPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this SiteCategorySearchRowBasic.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSitemapPriority(int i) {
        return this.sitemapPriority[i];
    }

    public void setSitemapPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.sitemapPriority[i] = _value;
    }


    /**
     * Gets the urlComponent value for this SiteCategorySearchRowBasic.
     * 
     * @return urlComponent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this SiteCategorySearchRowBasic.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] urlComponent) {
        this.urlComponent = urlComponent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUrlComponent(int i) {
        return this.urlComponent[i];
    }

    public void setUrlComponent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.urlComponent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteCategorySearchRowBasic)) return false;
        SiteCategorySearchRowBasic other = (SiteCategorySearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              java.util.Arrays.equals(this.dateViewed, other.getDateViewed()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              java.util.Arrays.equals(this.excludeFromSitemap, other.getExcludeFromSitemap()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              java.util.Arrays.equals(this.fullName, other.getFullName()))) &&
            ((this.hidden==null && other.getHidden()==null) || 
             (this.hidden!=null &&
              java.util.Arrays.equals(this.hidden, other.getHidden()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.longDescription==null && other.getLongDescription()==null) || 
             (this.longDescription!=null &&
              java.util.Arrays.equals(this.longDescription, other.getLongDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              java.util.Arrays.equals(this.pageTitle, other.getPageTitle()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              java.util.Arrays.equals(this.sitemapPriority, other.getSitemapPriority()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              java.util.Arrays.equals(this.urlComponent, other.getUrlComponent())));
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
        if (getDateViewed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateViewed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateViewed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeFromSitemap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeFromSitemap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeFromSitemap(), i);
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
        if (getFullName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFullName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFullName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHidden() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHidden());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHidden(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHits(), i);
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
        if (getLongDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLongDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLongDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSitemapPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitemapPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitemapPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlComponent(), i);
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
        new org.apache.axis.description.TypeDesc(SiteCategorySearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "SiteCategorySearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("longDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "longDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
