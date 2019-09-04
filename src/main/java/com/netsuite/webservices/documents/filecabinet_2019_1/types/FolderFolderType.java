/**
 * FolderFolderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.documents.filecabinet_2019_1.types;

public class FolderFolderType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FolderFolderType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __appPackages = "_appPackages";
    public static final java.lang.String __attachmentsReceived = "_attachmentsReceived";
    public static final java.lang.String __attachmentsSent = "_attachmentsSent";
    public static final java.lang.String __certificates = "_certificates";
    public static final java.lang.String __documentsAndFiles = "_documentsAndFiles";
    public static final java.lang.String __emailTemplates = "_emailTemplates";
    public static final java.lang.String __faxTemplates = "_faxTemplates";
    public static final java.lang.String __images = "_images";
    public static final java.lang.String __letterTemplates = "_letterTemplates";
    public static final java.lang.String __mailMerge = "_mailMerge";
    public static final java.lang.String __marketingTemplates = "_marketingTemplates";
    public static final java.lang.String __pdfTemplates = "_pdfTemplates";
    public static final java.lang.String __suitebundles = "_suitebundles";
    public static final java.lang.String __suitecommerceAdvancedSiteTemplates = "_suitecommerceAdvancedSiteTemplates";
    public static final java.lang.String __suitescripts = "_suitescripts";
    public static final java.lang.String __templates = "_templates";
    public static final java.lang.String __webSiteHostingFiles = "_webSiteHostingFiles";
    public static final FolderFolderType _appPackages = new FolderFolderType(__appPackages);
    public static final FolderFolderType _attachmentsReceived = new FolderFolderType(__attachmentsReceived);
    public static final FolderFolderType _attachmentsSent = new FolderFolderType(__attachmentsSent);
    public static final FolderFolderType _certificates = new FolderFolderType(__certificates);
    public static final FolderFolderType _documentsAndFiles = new FolderFolderType(__documentsAndFiles);
    public static final FolderFolderType _emailTemplates = new FolderFolderType(__emailTemplates);
    public static final FolderFolderType _faxTemplates = new FolderFolderType(__faxTemplates);
    public static final FolderFolderType _images = new FolderFolderType(__images);
    public static final FolderFolderType _letterTemplates = new FolderFolderType(__letterTemplates);
    public static final FolderFolderType _mailMerge = new FolderFolderType(__mailMerge);
    public static final FolderFolderType _marketingTemplates = new FolderFolderType(__marketingTemplates);
    public static final FolderFolderType _pdfTemplates = new FolderFolderType(__pdfTemplates);
    public static final FolderFolderType _suitebundles = new FolderFolderType(__suitebundles);
    public static final FolderFolderType _suitecommerceAdvancedSiteTemplates = new FolderFolderType(__suitecommerceAdvancedSiteTemplates);
    public static final FolderFolderType _suitescripts = new FolderFolderType(__suitescripts);
    public static final FolderFolderType _templates = new FolderFolderType(__templates);
    public static final FolderFolderType _webSiteHostingFiles = new FolderFolderType(__webSiteHostingFiles);
    public java.lang.String getValue() { return _value_;}
    public static FolderFolderType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FolderFolderType enumeration = (FolderFolderType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FolderFolderType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FolderFolderType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2019_1.documents.webservices.netsuite.com", "FolderFolderType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
