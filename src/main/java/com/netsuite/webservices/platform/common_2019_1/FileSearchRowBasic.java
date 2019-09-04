/**
 * FileSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class FileSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableWithoutLogin;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] documentSize;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fileType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] folder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hostedPath;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAvailable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modified;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url;

    public FileSearchRowBasic() {
    }

    public FileSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableWithoutLogin,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateViewed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] documentSize,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fileType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] folder,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] hits,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hostedPath,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAvailable,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modified,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url) {
        this.availableWithoutLogin = availableWithoutLogin;
        this.created = created;
        this.dateViewed = dateViewed;
        this.description = description;
        this.documentSize = documentSize;
        this.externalId = externalId;
        this.fileType = fileType;
        this.folder = folder;
        this.hits = hits;
        this.hostedPath = hostedPath;
        this.internalId = internalId;
        this.isAvailable = isAvailable;
        this.modified = modified;
        this.name = name;
        this.owner = owner;
        this.url = url;
    }


    /**
     * Gets the availableWithoutLogin value for this FileSearchRowBasic.
     * 
     * @return availableWithoutLogin
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableWithoutLogin() {
        return availableWithoutLogin;
    }


    /**
     * Sets the availableWithoutLogin value for this FileSearchRowBasic.
     * 
     * @param availableWithoutLogin
     */
    public void setAvailableWithoutLogin(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableWithoutLogin) {
        this.availableWithoutLogin = availableWithoutLogin;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableWithoutLogin(int i) {
        return this.availableWithoutLogin[i];
    }

    public void setAvailableWithoutLogin(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableWithoutLogin[i] = _value;
    }


    /**
     * Gets the created value for this FileSearchRowBasic.
     * 
     * @return created
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FileSearchRowBasic.
     * 
     * @param created
     */
    public void setCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created) {
        this.created = created;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.created[i] = _value;
    }


    /**
     * Gets the dateViewed value for this FileSearchRowBasic.
     * 
     * @return dateViewed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this FileSearchRowBasic.
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
     * Gets the description value for this FileSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FileSearchRowBasic.
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
     * Gets the documentSize value for this FileSearchRowBasic.
     * 
     * @return documentSize
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDocumentSize() {
        return documentSize;
    }


    /**
     * Sets the documentSize value for this FileSearchRowBasic.
     * 
     * @param documentSize
     */
    public void setDocumentSize(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] documentSize) {
        this.documentSize = documentSize;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDocumentSize(int i) {
        return this.documentSize[i];
    }

    public void setDocumentSize(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.documentSize[i] = _value;
    }


    /**
     * Gets the externalId value for this FileSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FileSearchRowBasic.
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
     * Gets the fileType value for this FileSearchRowBasic.
     * 
     * @return fileType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this FileSearchRowBasic.
     * 
     * @param fileType
     */
    public void setFileType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] fileType) {
        this.fileType = fileType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getFileType(int i) {
        return this.fileType[i];
    }

    public void setFileType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.fileType[i] = _value;
    }


    /**
     * Gets the folder value for this FileSearchRowBasic.
     * 
     * @return folder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this FileSearchRowBasic.
     * 
     * @param folder
     */
    public void setFolder(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] folder) {
        this.folder = folder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getFolder(int i) {
        return this.folder[i];
    }

    public void setFolder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.folder[i] = _value;
    }


    /**
     * Gets the hits value for this FileSearchRowBasic.
     * 
     * @return hits
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this FileSearchRowBasic.
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
     * Gets the hostedPath value for this FileSearchRowBasic.
     * 
     * @return hostedPath
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHostedPath() {
        return hostedPath;
    }


    /**
     * Sets the hostedPath value for this FileSearchRowBasic.
     * 
     * @param hostedPath
     */
    public void setHostedPath(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] hostedPath) {
        this.hostedPath = hostedPath;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getHostedPath(int i) {
        return this.hostedPath[i];
    }

    public void setHostedPath(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.hostedPath[i] = _value;
    }


    /**
     * Gets the internalId value for this FileSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this FileSearchRowBasic.
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
     * Gets the isAvailable value for this FileSearchRowBasic.
     * 
     * @return isAvailable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this FileSearchRowBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAvailable) {
        this.isAvailable = isAvailable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsAvailable(int i) {
        return this.isAvailable[i];
    }

    public void setIsAvailable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isAvailable[i] = _value;
    }


    /**
     * Gets the modified value for this FileSearchRowBasic.
     * 
     * @return modified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this FileSearchRowBasic.
     * 
     * @param modified
     */
    public void setModified(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] modified) {
        this.modified = modified;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getModified(int i) {
        return this.modified[i];
    }

    public void setModified(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.modified[i] = _value;
    }


    /**
     * Gets the name value for this FileSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this FileSearchRowBasic.
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
     * Gets the owner value for this FileSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this FileSearchRowBasic.
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
     * Gets the url value for this FileSearchRowBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this FileSearchRowBasic.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileSearchRowBasic)) return false;
        FileSearchRowBasic other = (FileSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.availableWithoutLogin, other.getAvailableWithoutLogin()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              java.util.Arrays.equals(this.created, other.getCreated()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              java.util.Arrays.equals(this.dateViewed, other.getDateViewed()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.documentSize==null && other.getDocumentSize()==null) || 
             (this.documentSize!=null &&
              java.util.Arrays.equals(this.documentSize, other.getDocumentSize()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              java.util.Arrays.equals(this.fileType, other.getFileType()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              java.util.Arrays.equals(this.folder, other.getFolder()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.hostedPath==null && other.getHostedPath()==null) || 
             (this.hostedPath!=null &&
              java.util.Arrays.equals(this.hostedPath, other.getHostedPath()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              java.util.Arrays.equals(this.isAvailable, other.getIsAvailable()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              java.util.Arrays.equals(this.modified, other.getModified()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableWithoutLogin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableWithoutLogin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getDocumentSize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentSize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentSize(), i);
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
        if (getFileType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFolder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFolder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFolder(), i);
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
        if (getHostedPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostedPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostedPath(), i);
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
        if (getIsAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModified(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableWithoutLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableWithoutLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("documentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "documentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("hostedPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hostedPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
