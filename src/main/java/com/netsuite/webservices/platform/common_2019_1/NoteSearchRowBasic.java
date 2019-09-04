/**
 * NoteSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class NoteSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] author;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] direction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] note;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] noteDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] noteType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public NoteSearchRowBasic() {
    }

    public NoteSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] author,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] direction,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] note,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] noteDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] noteType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.author = author;
        this.direction = direction;
        this.externalId = externalId;
        this.internalId = internalId;
        this.note = note;
        this.noteDate = noteDate;
        this.noteType = noteType;
        this.title = title;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the author value for this NoteSearchRowBasic.
     * 
     * @return author
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this NoteSearchRowBasic.
     * 
     * @param author
     */
    public void setAuthor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] author) {
        this.author = author;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.author[i] = _value;
    }


    /**
     * Gets the direction value for this NoteSearchRowBasic.
     * 
     * @return direction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this NoteSearchRowBasic.
     * 
     * @param direction
     */
    public void setDirection(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] direction) {
        this.direction = direction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDirection(int i) {
        return this.direction[i];
    }

    public void setDirection(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.direction[i] = _value;
    }


    /**
     * Gets the externalId value for this NoteSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this NoteSearchRowBasic.
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
     * Gets the internalId value for this NoteSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this NoteSearchRowBasic.
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
     * Gets the note value for this NoteSearchRowBasic.
     * 
     * @return note
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNote() {
        return note;
    }


    /**
     * Sets the note value for this NoteSearchRowBasic.
     * 
     * @param note
     */
    public void setNote(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] note) {
        this.note = note;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNote(int i) {
        return this.note[i];
    }

    public void setNote(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.note[i] = _value;
    }


    /**
     * Gets the noteDate value for this NoteSearchRowBasic.
     * 
     * @return noteDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this NoteSearchRowBasic.
     * 
     * @param noteDate
     */
    public void setNoteDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] noteDate) {
        this.noteDate = noteDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getNoteDate(int i) {
        return this.noteDate[i];
    }

    public void setNoteDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.noteDate[i] = _value;
    }


    /**
     * Gets the noteType value for this NoteSearchRowBasic.
     * 
     * @return noteType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this NoteSearchRowBasic.
     * 
     * @param noteType
     */
    public void setNoteType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] noteType) {
        this.noteType = noteType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getNoteType(int i) {
        return this.noteType[i];
    }

    public void setNoteType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.noteType[i] = _value;
    }


    /**
     * Gets the title value for this NoteSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NoteSearchRowBasic.
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
     * Gets the customFieldList value for this NoteSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this NoteSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteSearchRowBasic)) return false;
        NoteSearchRowBasic other = (NoteSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              java.util.Arrays.equals(this.author, other.getAuthor()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              java.util.Arrays.equals(this.direction, other.getDirection()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              java.util.Arrays.equals(this.note, other.getNote()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              java.util.Arrays.equals(this.noteDate, other.getNoteDate()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              java.util.Arrays.equals(this.noteType, other.getNoteType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
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
        if (getAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirection(), i);
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
        if (getNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoteDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoteDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoteDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoteType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoteType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoteType(), i);
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoteSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "noteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
