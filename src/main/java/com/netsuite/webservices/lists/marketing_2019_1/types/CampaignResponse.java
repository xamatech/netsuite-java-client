/**
 * CampaignResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.marketing_2019_1.types;

public class CampaignResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __clickedThrough = "_clickedThrough";
    public static final java.lang.String __failedDeliveryFailure = "_failedDeliveryFailure";
    public static final java.lang.String __failedInvalidAddress = "_failedInvalidAddress";
    public static final java.lang.String __failedOther = "_failedOther";
    public static final java.lang.String __failedSpam = "_failedSpam";
    public static final java.lang.String __failedTemplateError = "_failedTemplateError";
    public static final java.lang.String __failedUnexpectedError = "_failedUnexpectedError";
    public static final java.lang.String __invalidSenderAddress = "_invalidSenderAddress";
    public static final java.lang.String __mailboxDisabled = "_mailboxDisabled";
    public static final java.lang.String __mailboxIsFull = "_mailboxIsFull";
    public static final java.lang.String __mailboxNotAcceptingMessages = "_mailboxNotAcceptingMessages";
    public static final java.lang.String __mailProtocolIssues = "_mailProtocolIssues";
    public static final java.lang.String __mediaError = "_mediaError";
    public static final java.lang.String __messageExceedsSizeLengthLimits = "_messageExceedsSizeLengthLimits";
    public static final java.lang.String __networkServerIssues = "_networkServerIssues";
    public static final java.lang.String __opened = "_opened";
    public static final java.lang.String __purchased = "_purchased";
    public static final java.lang.String __queued = "_queued";
    public static final java.lang.String __received = "_received";
    public static final java.lang.String __responded = "_responded";
    public static final java.lang.String __securityIssues = "_securityIssues";
    public static final java.lang.String __sent = "_sent";
    public static final java.lang.String __skippedDueToPreviousHardBounce = "_skippedDueToPreviousHardBounce";
    public static final java.lang.String __subscribed = "_subscribed";
    public static final java.lang.String __tooManyRecipients = "_tooManyRecipients";
    public static final java.lang.String __unsubscribed = "_unsubscribed";
    public static final java.lang.String __unsubscribedByFeedbackLoop = "_unsubscribedByFeedbackLoop";
    public static final CampaignResponse _clickedThrough = new CampaignResponse(__clickedThrough);
    public static final CampaignResponse _failedDeliveryFailure = new CampaignResponse(__failedDeliveryFailure);
    public static final CampaignResponse _failedInvalidAddress = new CampaignResponse(__failedInvalidAddress);
    public static final CampaignResponse _failedOther = new CampaignResponse(__failedOther);
    public static final CampaignResponse _failedSpam = new CampaignResponse(__failedSpam);
    public static final CampaignResponse _failedTemplateError = new CampaignResponse(__failedTemplateError);
    public static final CampaignResponse _failedUnexpectedError = new CampaignResponse(__failedUnexpectedError);
    public static final CampaignResponse _invalidSenderAddress = new CampaignResponse(__invalidSenderAddress);
    public static final CampaignResponse _mailboxDisabled = new CampaignResponse(__mailboxDisabled);
    public static final CampaignResponse _mailboxIsFull = new CampaignResponse(__mailboxIsFull);
    public static final CampaignResponse _mailboxNotAcceptingMessages = new CampaignResponse(__mailboxNotAcceptingMessages);
    public static final CampaignResponse _mailProtocolIssues = new CampaignResponse(__mailProtocolIssues);
    public static final CampaignResponse _mediaError = new CampaignResponse(__mediaError);
    public static final CampaignResponse _messageExceedsSizeLengthLimits = new CampaignResponse(__messageExceedsSizeLengthLimits);
    public static final CampaignResponse _networkServerIssues = new CampaignResponse(__networkServerIssues);
    public static final CampaignResponse _opened = new CampaignResponse(__opened);
    public static final CampaignResponse _purchased = new CampaignResponse(__purchased);
    public static final CampaignResponse _queued = new CampaignResponse(__queued);
    public static final CampaignResponse _received = new CampaignResponse(__received);
    public static final CampaignResponse _responded = new CampaignResponse(__responded);
    public static final CampaignResponse _securityIssues = new CampaignResponse(__securityIssues);
    public static final CampaignResponse _sent = new CampaignResponse(__sent);
    public static final CampaignResponse _skippedDueToPreviousHardBounce = new CampaignResponse(__skippedDueToPreviousHardBounce);
    public static final CampaignResponse _subscribed = new CampaignResponse(__subscribed);
    public static final CampaignResponse _tooManyRecipients = new CampaignResponse(__tooManyRecipients);
    public static final CampaignResponse _unsubscribed = new CampaignResponse(__unsubscribed);
    public static final CampaignResponse _unsubscribedByFeedbackLoop = new CampaignResponse(__unsubscribedByFeedbackLoop);
    public java.lang.String getValue() { return _value_;}
    public static CampaignResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignResponse enumeration = (CampaignResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2019_1.lists.webservices.netsuite.com", "CampaignResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
