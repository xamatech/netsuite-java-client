/**
 * Note.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.general.communication_2019_1;

public class Note  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.lang.String title;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef noteType;

    private com.netsuite.webservices.general.communication_2019_1.types.NoteDirection direction;

    private java.util.Calendar noteDate;

    private java.lang.String note;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef activity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef author;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef folder;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef item;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef media;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef record;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef recordType;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef topic;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef transaction;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Note() {
    }

    public Note(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String title,
           com.netsuite.webservices.platform.core_2019_1.RecordRef noteType,
           com.netsuite.webservices.general.communication_2019_1.types.NoteDirection direction,
           java.util.Calendar noteDate,
           java.lang.String note,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef activity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef author,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef folder,
           com.netsuite.webservices.platform.core_2019_1.RecordRef item,
           com.netsuite.webservices.platform.core_2019_1.RecordRef media,
           com.netsuite.webservices.platform.core_2019_1.RecordRef record,
           com.netsuite.webservices.platform.core_2019_1.RecordRef recordType,
           com.netsuite.webservices.platform.core_2019_1.RecordRef topic,
           com.netsuite.webservices.platform.core_2019_1.RecordRef transaction,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.title = title;
        this.noteType = noteType;
        this.direction = direction;
        this.noteDate = noteDate;
        this.note = note;
        this.lastModifiedDate = lastModifiedDate;
        this.activity = activity;
        this.author = author;
        this.entity = entity;
        this.folder = folder;
        this.item = item;
        this.media = media;
        this.record = record;
        this.recordType = recordType;
        this.topic = topic;
        this.transaction = transaction;
        this.customForm = customForm;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the title value for this Note.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Note.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the noteType value for this Note.
     * 
     * @return noteType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this Note.
     * 
     * @param noteType
     */
    public void setNoteType(com.netsuite.webservices.platform.core_2019_1.RecordRef noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the direction value for this Note.
     * 
     * @return direction
     */
    public com.netsuite.webservices.general.communication_2019_1.types.NoteDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this Note.
     * 
     * @param direction
     */
    public void setDirection(com.netsuite.webservices.general.communication_2019_1.types.NoteDirection direction) {
        this.direction = direction;
    }


    /**
     * Gets the noteDate value for this Note.
     * 
     * @return noteDate
     */
    public java.util.Calendar getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this Note.
     * 
     * @param noteDate
     */
    public void setNoteDate(java.util.Calendar noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the note value for this Note.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Note.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the lastModifiedDate value for this Note.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Note.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the activity value for this Note.
     * 
     * @return activity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this Note.
     * 
     * @param activity
     */
    public void setActivity(com.netsuite.webservices.platform.core_2019_1.RecordRef activity) {
        this.activity = activity;
    }


    /**
     * Gets the author value for this Note.
     * 
     * @return author
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Note.
     * 
     * @param author
     */
    public void setAuthor(com.netsuite.webservices.platform.core_2019_1.RecordRef author) {
        this.author = author;
    }


    /**
     * Gets the entity value for this Note.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Note.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the folder value for this Note.
     * 
     * @return folder
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this Note.
     * 
     * @param folder
     */
    public void setFolder(com.netsuite.webservices.platform.core_2019_1.RecordRef folder) {
        this.folder = folder;
    }


    /**
     * Gets the item value for this Note.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this Note.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the media value for this Note.
     * 
     * @return media
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMedia() {
        return media;
    }


    /**
     * Sets the media value for this Note.
     * 
     * @param media
     */
    public void setMedia(com.netsuite.webservices.platform.core_2019_1.RecordRef media) {
        this.media = media;
    }


    /**
     * Gets the record value for this Note.
     * 
     * @return record
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecord() {
        return record;
    }


    /**
     * Sets the record value for this Note.
     * 
     * @param record
     */
    public void setRecord(com.netsuite.webservices.platform.core_2019_1.RecordRef record) {
        this.record = record;
    }


    /**
     * Gets the recordType value for this Note.
     * 
     * @return recordType
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Note.
     * 
     * @param recordType
     */
    public void setRecordType(com.netsuite.webservices.platform.core_2019_1.RecordRef recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the topic value for this Note.
     * 
     * @return topic
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTopic() {
        return topic;
    }


    /**
     * Sets the topic value for this Note.
     * 
     * @param topic
     */
    public void setTopic(com.netsuite.webservices.platform.core_2019_1.RecordRef topic) {
        this.topic = topic;
    }


    /**
     * Gets the transaction value for this Note.
     * 
     * @return transaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this Note.
     * 
     * @param transaction
     */
    public void setTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the customForm value for this Note.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Note.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the customFieldList value for this Note.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Note.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Note.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Note.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Note.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Note.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Note)) return false;
        Note other = (Note) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              this.noteDate.equals(other.getNoteDate()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia()))) &&
            ((this.record==null && other.getRecord()==null) || 
             (this.record!=null &&
              this.record.equals(other.getRecord()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.topic==null && other.getTopic()==null) || 
             (this.topic!=null &&
              this.topic.equals(other.getTopic()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getNoteDate() != null) {
            _hashCode += getNoteDate().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getMedia() != null) {
            _hashCode += getMedia().hashCode();
        }
        if (getRecord() != null) {
            _hashCode += getRecord().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getTopic() != null) {
            _hashCode += getTopic().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Note.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "Note"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.communication_2019_1.general.webservices.netsuite.com", "NoteDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "noteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "media"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "record"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "topic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2019_1.general.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
