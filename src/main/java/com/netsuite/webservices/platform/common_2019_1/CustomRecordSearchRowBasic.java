/**
 * CustomRecordSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CustomRecordSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef recType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModified;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] lastModifiedBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public CustomRecordSearchRowBasic() {
    }

    public CustomRecordSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.RecordRef recType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] created,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModified,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] lastModifiedBy,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] name,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] owner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.recType = recType;
        this.altName = altName;
        this.availableOffline = availableOffline;
        this.created = created;
        this.externalId = externalId;
        this.id = id;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.lastModified = lastModified;
        this.lastModifiedBy = lastModifiedBy;
        this.name = name;
        this.owner = owner;
        this.parent = parent;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the recType value for this CustomRecordSearchRowBasic.
     * 
     * @return recType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecType() {
        return recType;
    }


    /**
     * Sets the recType value for this CustomRecordSearchRowBasic.
     * 
     * @param recType
     */
    public void setRecType(com.netsuite.webservices.platform.core_2019_1.RecordRef recType) {
        this.recType = recType;
    }


    /**
     * Gets the altName value for this CustomRecordSearchRowBasic.
     * 
     * @return altName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this CustomRecordSearchRowBasic.
     * 
     * @param altName
     */
    public void setAltName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.altName[i] = _value;
    }


    /**
     * Gets the availableOffline value for this CustomRecordSearchRowBasic.
     * 
     * @return availableOffline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this CustomRecordSearchRowBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }


    /**
     * Gets the created value for this CustomRecordSearchRowBasic.
     * 
     * @return created
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCreated() {
        return created;
    }


    /**
     * Sets the created value for this CustomRecordSearchRowBasic.
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
     * Gets the externalId value for this CustomRecordSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomRecordSearchRowBasic.
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
     * Gets the id value for this CustomRecordSearchRowBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomRecordSearchRowBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] id) {
        this.id = id;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the internalId value for this CustomRecordSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomRecordSearchRowBasic.
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
     * Gets the isInactive value for this CustomRecordSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomRecordSearchRowBasic.
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
     * Gets the lastModified value for this CustomRecordSearchRowBasic.
     * 
     * @return lastModified
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this CustomRecordSearchRowBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModified) {
        this.lastModified = lastModified;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModified(int i) {
        return this.lastModified[i];
    }

    public void setLastModified(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModified[i] = _value;
    }


    /**
     * Gets the lastModifiedBy value for this CustomRecordSearchRowBasic.
     * 
     * @return lastModifiedBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CustomRecordSearchRowBasic.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLastModifiedBy(int i) {
        return this.lastModifiedBy[i];
    }

    public void setLastModifiedBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.lastModifiedBy[i] = _value;
    }


    /**
     * Gets the name value for this CustomRecordSearchRowBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomRecordSearchRowBasic.
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
     * Gets the owner value for this CustomRecordSearchRowBasic.
     * 
     * @return owner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CustomRecordSearchRowBasic.
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
     * Gets the parent value for this CustomRecordSearchRowBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CustomRecordSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the customFieldList value for this CustomRecordSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomRecordSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordSearchRowBasic)) return false;
        CustomRecordSearchRowBasic other = (CustomRecordSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recType==null && other.getRecType()==null) || 
             (this.recType!=null &&
              this.recType.equals(other.getRecType()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              java.util.Arrays.equals(this.altName, other.getAltName()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              java.util.Arrays.equals(this.availableOffline, other.getAvailableOffline()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              java.util.Arrays.equals(this.created, other.getCreated()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              java.util.Arrays.equals(this.lastModified, other.getLastModified()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              java.util.Arrays.equals(this.lastModifiedBy, other.getLastModifiedBy()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
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
        if (getRecType() != null) {
            _hashCode += getRecType().hashCode();
        }
        if (getAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableOffline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableOffline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableOffline(), i);
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
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
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
        if (getLastModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModified(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedBy(), i);
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
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomRecordSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableOffline"));
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
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "id"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
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
