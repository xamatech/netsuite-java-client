/**
 * FileSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class FileSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableWithoutLogin;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField created;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateViewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField documentSize;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fileType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField folder;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isLink;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField modified;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField url;

    public FileSearchBasic() {
    }

    public FileSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableWithoutLogin,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField created,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateViewed,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField documentSize,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fileType,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField folder,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isLink,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField modified,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField url) {
        this.availableWithoutLogin = availableWithoutLogin;
        this.created = created;
        this.dateViewed = dateViewed;
        this.description = description;
        this.documentSize = documentSize;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fileType = fileType;
        this.folder = folder;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isAvailable = isAvailable;
        this.isLink = isLink;
        this.modified = modified;
        this.name = name;
        this.owner = owner;
        this.url = url;
    }


    /**
     * Gets the availableWithoutLogin value for this FileSearchBasic.
     * 
     * @return availableWithoutLogin
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAvailableWithoutLogin() {
        return availableWithoutLogin;
    }


    /**
     * Sets the availableWithoutLogin value for this FileSearchBasic.
     * 
     * @param availableWithoutLogin
     */
    public void setAvailableWithoutLogin(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableWithoutLogin) {
        this.availableWithoutLogin = availableWithoutLogin;
    }


    /**
     * Gets the created value for this FileSearchBasic.
     * 
     * @return created
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FileSearchBasic.
     * 
     * @param created
     */
    public void setCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField created) {
        this.created = created;
    }


    /**
     * Gets the dateViewed value for this FileSearchBasic.
     * 
     * @return dateViewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this FileSearchBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateViewed) {
        this.dateViewed = dateViewed;
    }


    /**
     * Gets the description value for this FileSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FileSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2019_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the documentSize value for this FileSearchBasic.
     * 
     * @return documentSize
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDocumentSize() {
        return documentSize;
    }


    /**
     * Sets the documentSize value for this FileSearchBasic.
     * 
     * @param documentSize
     */
    public void setDocumentSize(com.netsuite.webservices.platform.core_2019_1.SearchLongField documentSize) {
        this.documentSize = documentSize;
    }


    /**
     * Gets the externalId value for this FileSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FileSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this FileSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this FileSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fileType value for this FileSearchBasic.
     * 
     * @return fileType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this FileSearchBasic.
     * 
     * @param fileType
     */
    public void setFileType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the folder value for this FileSearchBasic.
     * 
     * @return folder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this FileSearchBasic.
     * 
     * @param folder
     */
    public void setFolder(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField folder) {
        this.folder = folder;
    }


    /**
     * Gets the internalId value for this FileSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this FileSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this FileSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this FileSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isAvailable value for this FileSearchBasic.
     * 
     * @return isAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this FileSearchBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the isLink value for this FileSearchBasic.
     * 
     * @return isLink
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsLink() {
        return isLink;
    }


    /**
     * Sets the isLink value for this FileSearchBasic.
     * 
     * @param isLink
     */
    public void setIsLink(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isLink) {
        this.isLink = isLink;
    }


    /**
     * Gets the modified value for this FileSearchBasic.
     * 
     * @return modified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this FileSearchBasic.
     * 
     * @param modified
     */
    public void setModified(com.netsuite.webservices.platform.core_2019_1.SearchDateField modified) {
        this.modified = modified;
    }


    /**
     * Gets the name value for this FileSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this FileSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2019_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this FileSearchBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this FileSearchBasic.
     * 
     * @param owner
     */
    public void setOwner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField owner) {
        this.owner = owner;
    }


    /**
     * Gets the url value for this FileSearchBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUrl() {
        return url;
    }


    /**
     * Sets the url value for this FileSearchBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileSearchBasic)) return false;
        FileSearchBasic other = (FileSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableWithoutLogin==null && other.getAvailableWithoutLogin()==null) || 
             (this.availableWithoutLogin!=null &&
              this.availableWithoutLogin.equals(other.getAvailableWithoutLogin()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              this.dateViewed.equals(other.getDateViewed()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentSize==null && other.getDocumentSize()==null) || 
             (this.documentSize!=null &&
              this.documentSize.equals(other.getDocumentSize()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable()))) &&
            ((this.isLink==null && other.getIsLink()==null) || 
             (this.isLink!=null &&
              this.isLink.equals(other.getIsLink()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getAvailableWithoutLogin() != null) {
            _hashCode += getAvailableWithoutLogin().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDateViewed() != null) {
            _hashCode += getDateViewed().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentSize() != null) {
            _hashCode += getDocumentSize().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        if (getIsLink() != null) {
            _hashCode += getIsLink().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableWithoutLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableWithoutLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "documentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "folder"));
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
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
