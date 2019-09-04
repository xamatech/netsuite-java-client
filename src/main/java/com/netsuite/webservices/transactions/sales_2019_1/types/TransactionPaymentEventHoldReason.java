/**
 * TransactionPaymentEventHoldReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class TransactionPaymentEventHoldReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionPaymentEventHoldReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __amountExceedsMaximumAllowedAmount = "_amountExceedsMaximumAllowedAmount";
    public static final java.lang.String __authorizationDecline = "_authorizationDecline";
    public static final java.lang.String __cardExpired = "_cardExpired";
    public static final java.lang.String __cardInvalid = "_cardInvalid";
    public static final java.lang.String __confirmationOfTheOperationIsPending = "_confirmationOfTheOperationIsPending";
    public static final java.lang.String __externalFraudRejection = "_externalFraudRejection";
    public static final java.lang.String __externalFraudReview = "_externalFraudReview";
    public static final java.lang.String __failedToPrimeDevice = "_failedToPrimeDevice";
    public static final java.lang.String __fatalError = "_fatalError";
    public static final java.lang.String __forwardedToPayerAuthentication = "_forwardedToPayerAuthentication";
    public static final java.lang.String __forwardRequested = "_forwardRequested";
    public static final java.lang.String __gatewayAsynchronousNotification = "_gatewayAsynchronousNotification";
    public static final java.lang.String __gatewayError = "_gatewayError";
    public static final java.lang.String __generalHold = "_generalHold";
    public static final java.lang.String __generalReject = "_generalReject";
    public static final java.lang.String __operationWasSuccessful = "_operationWasSuccessful";
    public static final java.lang.String __operationWasTerminated = "_operationWasTerminated";
    public static final java.lang.String __overridenBy = "_overridenBy";
    public static final java.lang.String __partnerDecline = "_partnerDecline";
    public static final java.lang.String __paymentDeviceWasPrimed = "_paymentDeviceWasPrimed";
    public static final java.lang.String __paymentOperationWasCanceled = "_paymentOperationWasCanceled";
    public static final java.lang.String __systemError = "_systemError";
    public static final java.lang.String __verbalAuthorizationRequested = "_verbalAuthorizationRequested";
    public static final java.lang.String __verificationRejection = "_verificationRejection";
    public static final java.lang.String __verificationRequired = "_verificationRequired";
    public static final TransactionPaymentEventHoldReason _amountExceedsMaximumAllowedAmount = new TransactionPaymentEventHoldReason(__amountExceedsMaximumAllowedAmount);
    public static final TransactionPaymentEventHoldReason _authorizationDecline = new TransactionPaymentEventHoldReason(__authorizationDecline);
    public static final TransactionPaymentEventHoldReason _cardExpired = new TransactionPaymentEventHoldReason(__cardExpired);
    public static final TransactionPaymentEventHoldReason _cardInvalid = new TransactionPaymentEventHoldReason(__cardInvalid);
    public static final TransactionPaymentEventHoldReason _confirmationOfTheOperationIsPending = new TransactionPaymentEventHoldReason(__confirmationOfTheOperationIsPending);
    public static final TransactionPaymentEventHoldReason _externalFraudRejection = new TransactionPaymentEventHoldReason(__externalFraudRejection);
    public static final TransactionPaymentEventHoldReason _externalFraudReview = new TransactionPaymentEventHoldReason(__externalFraudReview);
    public static final TransactionPaymentEventHoldReason _failedToPrimeDevice = new TransactionPaymentEventHoldReason(__failedToPrimeDevice);
    public static final TransactionPaymentEventHoldReason _fatalError = new TransactionPaymentEventHoldReason(__fatalError);
    public static final TransactionPaymentEventHoldReason _forwardedToPayerAuthentication = new TransactionPaymentEventHoldReason(__forwardedToPayerAuthentication);
    public static final TransactionPaymentEventHoldReason _forwardRequested = new TransactionPaymentEventHoldReason(__forwardRequested);
    public static final TransactionPaymentEventHoldReason _gatewayAsynchronousNotification = new TransactionPaymentEventHoldReason(__gatewayAsynchronousNotification);
    public static final TransactionPaymentEventHoldReason _gatewayError = new TransactionPaymentEventHoldReason(__gatewayError);
    public static final TransactionPaymentEventHoldReason _generalHold = new TransactionPaymentEventHoldReason(__generalHold);
    public static final TransactionPaymentEventHoldReason _generalReject = new TransactionPaymentEventHoldReason(__generalReject);
    public static final TransactionPaymentEventHoldReason _operationWasSuccessful = new TransactionPaymentEventHoldReason(__operationWasSuccessful);
    public static final TransactionPaymentEventHoldReason _operationWasTerminated = new TransactionPaymentEventHoldReason(__operationWasTerminated);
    public static final TransactionPaymentEventHoldReason _overridenBy = new TransactionPaymentEventHoldReason(__overridenBy);
    public static final TransactionPaymentEventHoldReason _partnerDecline = new TransactionPaymentEventHoldReason(__partnerDecline);
    public static final TransactionPaymentEventHoldReason _paymentDeviceWasPrimed = new TransactionPaymentEventHoldReason(__paymentDeviceWasPrimed);
    public static final TransactionPaymentEventHoldReason _paymentOperationWasCanceled = new TransactionPaymentEventHoldReason(__paymentOperationWasCanceled);
    public static final TransactionPaymentEventHoldReason _systemError = new TransactionPaymentEventHoldReason(__systemError);
    public static final TransactionPaymentEventHoldReason _verbalAuthorizationRequested = new TransactionPaymentEventHoldReason(__verbalAuthorizationRequested);
    public static final TransactionPaymentEventHoldReason _verificationRejection = new TransactionPaymentEventHoldReason(__verificationRejection);
    public static final TransactionPaymentEventHoldReason _verificationRequired = new TransactionPaymentEventHoldReason(__verificationRequired);
    public java.lang.String getValue() { return _value_;}
    public static TransactionPaymentEventHoldReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionPaymentEventHoldReason enumeration = (TransactionPaymentEventHoldReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionPaymentEventHoldReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionPaymentEventHoldReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
