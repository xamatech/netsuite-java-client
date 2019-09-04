/**
 * TransactionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1.types;

public class TransactionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __billCancelled = "_billCancelled";
    public static final java.lang.String __billOpen = "_billOpen";
    public static final java.lang.String __billPaidInFull = "_billPaidInFull";
    public static final java.lang.String __billPaymentApproved = "_billPaymentApproved";
    public static final java.lang.String __billPaymentConfirmed = "_billPaymentConfirmed";
    public static final java.lang.String __billPaymentDeclined = "_billPaymentDeclined";
    public static final java.lang.String __billPaymentInTransit = "_billPaymentInTransit";
    public static final java.lang.String __billPaymentOnlineBillPayPendingAccountingApproval = "_billPaymentOnlineBillPayPendingAccountingApproval";
    public static final java.lang.String __billPaymentPendingApproval = "_billPaymentPendingApproval";
    public static final java.lang.String __billPaymentRejected = "_billPaymentRejected";
    public static final java.lang.String __billPaymentVoided = "_billPaymentVoided";
    public static final java.lang.String __billPendingApproval = "_billPendingApproval";
    public static final java.lang.String __billRejected = "_billRejected";
    public static final java.lang.String __cashSaleDeposited = "_cashSaleDeposited";
    public static final java.lang.String __cashSaleNotDeposited = "_cashSaleNotDeposited";
    public static final java.lang.String __cashSaleUnapprovedPayment = "_cashSaleUnapprovedPayment";
    public static final java.lang.String __checkOnlineBillPayPendingAccountingApproval = "_checkOnlineBillPayPendingAccountingApproval";
    public static final java.lang.String __checkVoided = "_checkVoided";
    public static final java.lang.String __commissionOverpaid = "_commissionOverpaid";
    public static final java.lang.String __commissionPaidInFull = "_commissionPaidInFull";
    public static final java.lang.String __commissionPendingAccountingApproval = "_commissionPendingAccountingApproval";
    public static final java.lang.String __commissionPendingPayment = "_commissionPendingPayment";
    public static final java.lang.String __commissionRejectedByAccounting = "_commissionRejectedByAccounting";
    public static final java.lang.String __creditMemoFullyApplied = "_creditMemoFullyApplied";
    public static final java.lang.String __creditMemoOpen = "_creditMemoOpen";
    public static final java.lang.String __creditMemoVoided = "_creditMemoVoided";
    public static final java.lang.String __customerDepositDeposited = "_customerDepositDeposited";
    public static final java.lang.String __customerDepositFullyApplied = "_customerDepositFullyApplied";
    public static final java.lang.String __customerDepositNotDeposited = "_customerDepositNotDeposited";
    public static final java.lang.String __customerDepositUnapprovedPayment = "_customerDepositUnapprovedPayment";
    public static final java.lang.String __customerRefundVoided = "_customerRefundVoided";
    public static final java.lang.String __estimateClosed = "_estimateClosed";
    public static final java.lang.String __estimateExpired = "_estimateExpired";
    public static final java.lang.String __estimateOpen = "_estimateOpen";
    public static final java.lang.String __estimateProcessed = "_estimateProcessed";
    public static final java.lang.String __estimateVoided = "_estimateVoided";
    public static final java.lang.String __expenseReportApprovedByAccounting = "_expenseReportApprovedByAccounting";
    public static final java.lang.String __expenseReportApprovedOverriddenByAccounting = "_expenseReportApprovedOverriddenByAccounting";
    public static final java.lang.String __expenseReportInProgress = "_expenseReportInProgress";
    public static final java.lang.String __expenseReportPaidInFull = "_expenseReportPaidInFull";
    public static final java.lang.String __expenseReportPaymentInTransit = "_expenseReportPaymentInTransit";
    public static final java.lang.String __expenseReportPendingAccountingApproval = "_expenseReportPendingAccountingApproval";
    public static final java.lang.String __expenseReportPendingSupervisorApproval = "_expenseReportPendingSupervisorApproval";
    public static final java.lang.String __expenseReportRejectedByAccounting = "_expenseReportRejectedByAccounting";
    public static final java.lang.String __expenseReportRejectedBySupervisor = "_expenseReportRejectedBySupervisor";
    public static final java.lang.String __expenseReportRejectedOverriddenByAccounting = "_expenseReportRejectedOverriddenByAccounting";
    public static final java.lang.String __expenseReportVoided = "_expenseReportVoided";
    public static final java.lang.String __invoiceOpen = "_invoiceOpen";
    public static final java.lang.String __invoicePaidInFull = "_invoicePaidInFull";
    public static final java.lang.String __invoicePendingApproval = "_invoicePendingApproval";
    public static final java.lang.String __invoiceRejected = "_invoiceRejected";
    public static final java.lang.String __invoiceVoided = "_invoiceVoided";
    public static final java.lang.String __itemFulfillmentPacked = "_itemFulfillmentPacked";
    public static final java.lang.String __itemFulfillmentPicked = "_itemFulfillmentPicked";
    public static final java.lang.String __itemFulfillmentShipped = "_itemFulfillmentShipped";
    public static final java.lang.String __journalApprovedForPosting = "_journalApprovedForPosting";
    public static final java.lang.String __journalPendingApproval = "_journalPendingApproval";
    public static final java.lang.String __journalRejected = "_journalRejected";
    public static final java.lang.String __opportunityClosedLost = "_opportunityClosedLost";
    public static final java.lang.String __opportunityClosedWon = "_opportunityClosedWon";
    public static final java.lang.String __opportunityInProgress = "_opportunityInProgress";
    public static final java.lang.String __opportunityIssuedEstimate = "_opportunityIssuedEstimate";
    public static final java.lang.String __paycheckCommitted = "_paycheckCommitted";
    public static final java.lang.String __paycheckCreated = "_paycheckCreated";
    public static final java.lang.String __paycheckError = "_paycheckError";
    public static final java.lang.String __paycheckPendingCommitment = "_paycheckPendingCommitment";
    public static final java.lang.String __paycheckPendingTaxCalculation = "_paycheckPendingTaxCalculation";
    public static final java.lang.String __paycheckPreview = "_paycheckPreview";
    public static final java.lang.String __paycheckReversed = "_paycheckReversed";
    public static final java.lang.String __paymentDeposited = "_paymentDeposited";
    public static final java.lang.String __paymentNotDeposited = "_paymentNotDeposited";
    public static final java.lang.String __paymentUnapprovedPayment = "_paymentUnapprovedPayment";
    public static final java.lang.String __payrollLiabilityCheckVoided = "_payrollLiabilityCheckVoided";
    public static final java.lang.String __periodEndJournalApprovedForPosting = "_periodEndJournalApprovedForPosting";
    public static final java.lang.String __periodEndJournalPendingApproval = "_periodEndJournalPendingApproval";
    public static final java.lang.String __periodEndJournalRejected = "_periodEndJournalRejected";
    public static final java.lang.String __purchaseOrderClosed = "_purchaseOrderClosed";
    public static final java.lang.String __purchaseOrderFullyBilled = "_purchaseOrderFullyBilled";
    public static final java.lang.String __purchaseOrderPartiallyReceived = "_purchaseOrderPartiallyReceived";
    public static final java.lang.String __purchaseOrderPendingBill = "_purchaseOrderPendingBill";
    public static final java.lang.String __purchaseOrderPendingBillingPartiallyReceived = "_purchaseOrderPendingBillingPartiallyReceived";
    public static final java.lang.String __purchaseOrderPendingReceipt = "_purchaseOrderPendingReceipt";
    public static final java.lang.String __purchaseOrderPendingSupervisorApproval = "_purchaseOrderPendingSupervisorApproval";
    public static final java.lang.String __purchaseOrderPlanned = "_purchaseOrderPlanned";
    public static final java.lang.String __purchaseOrderRejectedBySupervisor = "_purchaseOrderRejectedBySupervisor";
    public static final java.lang.String __requisitionCancelled = "_requisitionCancelled";
    public static final java.lang.String __requisitionClosed = "_requisitionClosed";
    public static final java.lang.String __requisitionFullyOrdered = "_requisitionFullyOrdered";
    public static final java.lang.String __requisitionFullyReceived = "_requisitionFullyReceived";
    public static final java.lang.String __requisitionPartiallyOrdered = "_requisitionPartiallyOrdered";
    public static final java.lang.String __requisitionPartiallyReceived = "_requisitionPartiallyReceived";
    public static final java.lang.String __requisitionPendingApproval = "_requisitionPendingApproval";
    public static final java.lang.String __requisitionPendingOrder = "_requisitionPendingOrder";
    public static final java.lang.String __requisitionRejected = "_requisitionRejected";
    public static final java.lang.String __returnAuthorizationCancelled = "_returnAuthorizationCancelled";
    public static final java.lang.String __returnAuthorizationClosed = "_returnAuthorizationClosed";
    public static final java.lang.String __returnAuthorizationPartiallyReceived = "_returnAuthorizationPartiallyReceived";
    public static final java.lang.String __returnAuthorizationPendingApproval = "_returnAuthorizationPendingApproval";
    public static final java.lang.String __returnAuthorizationPendingReceipt = "_returnAuthorizationPendingReceipt";
    public static final java.lang.String __returnAuthorizationPendingRefund = "_returnAuthorizationPendingRefund";
    public static final java.lang.String __returnAuthorizationPendingRefundPartiallyReceived = "_returnAuthorizationPendingRefundPartiallyReceived";
    public static final java.lang.String __returnAuthorizationRefunded = "_returnAuthorizationRefunded";
    public static final java.lang.String __salesOrderBilled = "_salesOrderBilled";
    public static final java.lang.String __salesOrderCancelled = "_salesOrderCancelled";
    public static final java.lang.String __salesOrderClosed = "_salesOrderClosed";
    public static final java.lang.String __salesOrderPartiallyFulfilled = "_salesOrderPartiallyFulfilled";
    public static final java.lang.String __salesOrderPendingApproval = "_salesOrderPendingApproval";
    public static final java.lang.String __salesOrderPendingBilling = "_salesOrderPendingBilling";
    public static final java.lang.String __salesOrderPendingBillingPartiallyFulfilled = "_salesOrderPendingBillingPartiallyFulfilled";
    public static final java.lang.String __salesOrderPendingFulfillment = "_salesOrderPendingFulfillment";
    public static final java.lang.String __salesTaxPaymentOnlineBillPayPendingAccountingApproval = "_salesTaxPaymentOnlineBillPayPendingAccountingApproval";
    public static final java.lang.String __salesTaxPaymentVoided = "_salesTaxPaymentVoided";
    public static final java.lang.String __statementChargeOpen = "_statementChargeOpen";
    public static final java.lang.String __statementChargePaidInFull = "_statementChargePaidInFull";
    public static final java.lang.String __taxLiabilityChequeVoided = "_taxLiabilityChequeVoided";
    public static final java.lang.String __tegataPayableEndorsed = "_tegataPayableEndorsed";
    public static final java.lang.String __tegataPayableIssued = "_tegataPayableIssued";
    public static final java.lang.String __tegataPayablePaid = "_tegataPayablePaid";
    public static final java.lang.String __tegataReceivablesCollected = "_tegataReceivablesCollected";
    public static final java.lang.String __tegataReceivablesDiscounted = "_tegataReceivablesDiscounted";
    public static final java.lang.String __tegataReceivablesEndorsed = "_tegataReceivablesEndorsed";
    public static final java.lang.String __tegataReceivablesHolding = "_tegataReceivablesHolding";
    public static final java.lang.String __tegataReceivablesVoided = "_tegataReceivablesVoided";
    public static final java.lang.String __transferOrderClosed = "_transferOrderClosed";
    public static final java.lang.String __transferOrderPartiallyFulfilled = "_transferOrderPartiallyFulfilled";
    public static final java.lang.String __transferOrderPendingApproval = "_transferOrderPendingApproval";
    public static final java.lang.String __transferOrderPendingFulfillment = "_transferOrderPendingFulfillment";
    public static final java.lang.String __transferOrderPendingReceipt = "_transferOrderPendingReceipt";
    public static final java.lang.String __transferOrderPendingReceiptPartiallyFulfilled = "_transferOrderPendingReceiptPartiallyFulfilled";
    public static final java.lang.String __transferOrderReceived = "_transferOrderReceived";
    public static final java.lang.String __transferOrderRejected = "_transferOrderRejected";
    public static final java.lang.String __vendorReturnAuthorizationCancelled = "_vendorReturnAuthorizationCancelled";
    public static final java.lang.String __vendorReturnAuthorizationClosed = "_vendorReturnAuthorizationClosed";
    public static final java.lang.String __vendorReturnAuthorizationCredited = "_vendorReturnAuthorizationCredited";
    public static final java.lang.String __vendorReturnAuthorizationPartiallyReturned = "_vendorReturnAuthorizationPartiallyReturned";
    public static final java.lang.String __vendorReturnAuthorizationPendingApproval = "_vendorReturnAuthorizationPendingApproval";
    public static final java.lang.String __vendorReturnAuthorizationPendingCredit = "_vendorReturnAuthorizationPendingCredit";
    public static final java.lang.String __vendorReturnAuthorizationPendingCreditPartiallyReturned = "_vendorReturnAuthorizationPendingCreditPartiallyReturned";
    public static final java.lang.String __vendorReturnAuthorizationPendingReturn = "_vendorReturnAuthorizationPendingReturn";
    public static final java.lang.String __workOrderBuilt = "_workOrderBuilt";
    public static final java.lang.String __workOrderCancelled = "_workOrderCancelled";
    public static final java.lang.String __workOrderClosed = "_workOrderClosed";
    public static final java.lang.String __workOrderPartiallyBuilt = "_workOrderPartiallyBuilt";
    public static final java.lang.String __workOrderPendingBuild = "_workOrderPendingBuild";
    public static final java.lang.String __workOrderPlanned = "_workOrderPlanned";
    public static final TransactionStatus _billCancelled = new TransactionStatus(__billCancelled);
    public static final TransactionStatus _billOpen = new TransactionStatus(__billOpen);
    public static final TransactionStatus _billPaidInFull = new TransactionStatus(__billPaidInFull);
    public static final TransactionStatus _billPaymentApproved = new TransactionStatus(__billPaymentApproved);
    public static final TransactionStatus _billPaymentConfirmed = new TransactionStatus(__billPaymentConfirmed);
    public static final TransactionStatus _billPaymentDeclined = new TransactionStatus(__billPaymentDeclined);
    public static final TransactionStatus _billPaymentInTransit = new TransactionStatus(__billPaymentInTransit);
    public static final TransactionStatus _billPaymentOnlineBillPayPendingAccountingApproval = new TransactionStatus(__billPaymentOnlineBillPayPendingAccountingApproval);
    public static final TransactionStatus _billPaymentPendingApproval = new TransactionStatus(__billPaymentPendingApproval);
    public static final TransactionStatus _billPaymentRejected = new TransactionStatus(__billPaymentRejected);
    public static final TransactionStatus _billPaymentVoided = new TransactionStatus(__billPaymentVoided);
    public static final TransactionStatus _billPendingApproval = new TransactionStatus(__billPendingApproval);
    public static final TransactionStatus _billRejected = new TransactionStatus(__billRejected);
    public static final TransactionStatus _cashSaleDeposited = new TransactionStatus(__cashSaleDeposited);
    public static final TransactionStatus _cashSaleNotDeposited = new TransactionStatus(__cashSaleNotDeposited);
    public static final TransactionStatus _cashSaleUnapprovedPayment = new TransactionStatus(__cashSaleUnapprovedPayment);
    public static final TransactionStatus _checkOnlineBillPayPendingAccountingApproval = new TransactionStatus(__checkOnlineBillPayPendingAccountingApproval);
    public static final TransactionStatus _checkVoided = new TransactionStatus(__checkVoided);
    public static final TransactionStatus _commissionOverpaid = new TransactionStatus(__commissionOverpaid);
    public static final TransactionStatus _commissionPaidInFull = new TransactionStatus(__commissionPaidInFull);
    public static final TransactionStatus _commissionPendingAccountingApproval = new TransactionStatus(__commissionPendingAccountingApproval);
    public static final TransactionStatus _commissionPendingPayment = new TransactionStatus(__commissionPendingPayment);
    public static final TransactionStatus _commissionRejectedByAccounting = new TransactionStatus(__commissionRejectedByAccounting);
    public static final TransactionStatus _creditMemoFullyApplied = new TransactionStatus(__creditMemoFullyApplied);
    public static final TransactionStatus _creditMemoOpen = new TransactionStatus(__creditMemoOpen);
    public static final TransactionStatus _creditMemoVoided = new TransactionStatus(__creditMemoVoided);
    public static final TransactionStatus _customerDepositDeposited = new TransactionStatus(__customerDepositDeposited);
    public static final TransactionStatus _customerDepositFullyApplied = new TransactionStatus(__customerDepositFullyApplied);
    public static final TransactionStatus _customerDepositNotDeposited = new TransactionStatus(__customerDepositNotDeposited);
    public static final TransactionStatus _customerDepositUnapprovedPayment = new TransactionStatus(__customerDepositUnapprovedPayment);
    public static final TransactionStatus _customerRefundVoided = new TransactionStatus(__customerRefundVoided);
    public static final TransactionStatus _estimateClosed = new TransactionStatus(__estimateClosed);
    public static final TransactionStatus _estimateExpired = new TransactionStatus(__estimateExpired);
    public static final TransactionStatus _estimateOpen = new TransactionStatus(__estimateOpen);
    public static final TransactionStatus _estimateProcessed = new TransactionStatus(__estimateProcessed);
    public static final TransactionStatus _estimateVoided = new TransactionStatus(__estimateVoided);
    public static final TransactionStatus _expenseReportApprovedByAccounting = new TransactionStatus(__expenseReportApprovedByAccounting);
    public static final TransactionStatus _expenseReportApprovedOverriddenByAccounting = new TransactionStatus(__expenseReportApprovedOverriddenByAccounting);
    public static final TransactionStatus _expenseReportInProgress = new TransactionStatus(__expenseReportInProgress);
    public static final TransactionStatus _expenseReportPaidInFull = new TransactionStatus(__expenseReportPaidInFull);
    public static final TransactionStatus _expenseReportPaymentInTransit = new TransactionStatus(__expenseReportPaymentInTransit);
    public static final TransactionStatus _expenseReportPendingAccountingApproval = new TransactionStatus(__expenseReportPendingAccountingApproval);
    public static final TransactionStatus _expenseReportPendingSupervisorApproval = new TransactionStatus(__expenseReportPendingSupervisorApproval);
    public static final TransactionStatus _expenseReportRejectedByAccounting = new TransactionStatus(__expenseReportRejectedByAccounting);
    public static final TransactionStatus _expenseReportRejectedBySupervisor = new TransactionStatus(__expenseReportRejectedBySupervisor);
    public static final TransactionStatus _expenseReportRejectedOverriddenByAccounting = new TransactionStatus(__expenseReportRejectedOverriddenByAccounting);
    public static final TransactionStatus _expenseReportVoided = new TransactionStatus(__expenseReportVoided);
    public static final TransactionStatus _invoiceOpen = new TransactionStatus(__invoiceOpen);
    public static final TransactionStatus _invoicePaidInFull = new TransactionStatus(__invoicePaidInFull);
    public static final TransactionStatus _invoicePendingApproval = new TransactionStatus(__invoicePendingApproval);
    public static final TransactionStatus _invoiceRejected = new TransactionStatus(__invoiceRejected);
    public static final TransactionStatus _invoiceVoided = new TransactionStatus(__invoiceVoided);
    public static final TransactionStatus _itemFulfillmentPacked = new TransactionStatus(__itemFulfillmentPacked);
    public static final TransactionStatus _itemFulfillmentPicked = new TransactionStatus(__itemFulfillmentPicked);
    public static final TransactionStatus _itemFulfillmentShipped = new TransactionStatus(__itemFulfillmentShipped);
    public static final TransactionStatus _journalApprovedForPosting = new TransactionStatus(__journalApprovedForPosting);
    public static final TransactionStatus _journalPendingApproval = new TransactionStatus(__journalPendingApproval);
    public static final TransactionStatus _journalRejected = new TransactionStatus(__journalRejected);
    public static final TransactionStatus _opportunityClosedLost = new TransactionStatus(__opportunityClosedLost);
    public static final TransactionStatus _opportunityClosedWon = new TransactionStatus(__opportunityClosedWon);
    public static final TransactionStatus _opportunityInProgress = new TransactionStatus(__opportunityInProgress);
    public static final TransactionStatus _opportunityIssuedEstimate = new TransactionStatus(__opportunityIssuedEstimate);
    public static final TransactionStatus _paycheckCommitted = new TransactionStatus(__paycheckCommitted);
    public static final TransactionStatus _paycheckCreated = new TransactionStatus(__paycheckCreated);
    public static final TransactionStatus _paycheckError = new TransactionStatus(__paycheckError);
    public static final TransactionStatus _paycheckPendingCommitment = new TransactionStatus(__paycheckPendingCommitment);
    public static final TransactionStatus _paycheckPendingTaxCalculation = new TransactionStatus(__paycheckPendingTaxCalculation);
    public static final TransactionStatus _paycheckPreview = new TransactionStatus(__paycheckPreview);
    public static final TransactionStatus _paycheckReversed = new TransactionStatus(__paycheckReversed);
    public static final TransactionStatus _paymentDeposited = new TransactionStatus(__paymentDeposited);
    public static final TransactionStatus _paymentNotDeposited = new TransactionStatus(__paymentNotDeposited);
    public static final TransactionStatus _paymentUnapprovedPayment = new TransactionStatus(__paymentUnapprovedPayment);
    public static final TransactionStatus _payrollLiabilityCheckVoided = new TransactionStatus(__payrollLiabilityCheckVoided);
    public static final TransactionStatus _periodEndJournalApprovedForPosting = new TransactionStatus(__periodEndJournalApprovedForPosting);
    public static final TransactionStatus _periodEndJournalPendingApproval = new TransactionStatus(__periodEndJournalPendingApproval);
    public static final TransactionStatus _periodEndJournalRejected = new TransactionStatus(__periodEndJournalRejected);
    public static final TransactionStatus _purchaseOrderClosed = new TransactionStatus(__purchaseOrderClosed);
    public static final TransactionStatus _purchaseOrderFullyBilled = new TransactionStatus(__purchaseOrderFullyBilled);
    public static final TransactionStatus _purchaseOrderPartiallyReceived = new TransactionStatus(__purchaseOrderPartiallyReceived);
    public static final TransactionStatus _purchaseOrderPendingBill = new TransactionStatus(__purchaseOrderPendingBill);
    public static final TransactionStatus _purchaseOrderPendingBillingPartiallyReceived = new TransactionStatus(__purchaseOrderPendingBillingPartiallyReceived);
    public static final TransactionStatus _purchaseOrderPendingReceipt = new TransactionStatus(__purchaseOrderPendingReceipt);
    public static final TransactionStatus _purchaseOrderPendingSupervisorApproval = new TransactionStatus(__purchaseOrderPendingSupervisorApproval);
    public static final TransactionStatus _purchaseOrderPlanned = new TransactionStatus(__purchaseOrderPlanned);
    public static final TransactionStatus _purchaseOrderRejectedBySupervisor = new TransactionStatus(__purchaseOrderRejectedBySupervisor);
    public static final TransactionStatus _requisitionCancelled = new TransactionStatus(__requisitionCancelled);
    public static final TransactionStatus _requisitionClosed = new TransactionStatus(__requisitionClosed);
    public static final TransactionStatus _requisitionFullyOrdered = new TransactionStatus(__requisitionFullyOrdered);
    public static final TransactionStatus _requisitionFullyReceived = new TransactionStatus(__requisitionFullyReceived);
    public static final TransactionStatus _requisitionPartiallyOrdered = new TransactionStatus(__requisitionPartiallyOrdered);
    public static final TransactionStatus _requisitionPartiallyReceived = new TransactionStatus(__requisitionPartiallyReceived);
    public static final TransactionStatus _requisitionPendingApproval = new TransactionStatus(__requisitionPendingApproval);
    public static final TransactionStatus _requisitionPendingOrder = new TransactionStatus(__requisitionPendingOrder);
    public static final TransactionStatus _requisitionRejected = new TransactionStatus(__requisitionRejected);
    public static final TransactionStatus _returnAuthorizationCancelled = new TransactionStatus(__returnAuthorizationCancelled);
    public static final TransactionStatus _returnAuthorizationClosed = new TransactionStatus(__returnAuthorizationClosed);
    public static final TransactionStatus _returnAuthorizationPartiallyReceived = new TransactionStatus(__returnAuthorizationPartiallyReceived);
    public static final TransactionStatus _returnAuthorizationPendingApproval = new TransactionStatus(__returnAuthorizationPendingApproval);
    public static final TransactionStatus _returnAuthorizationPendingReceipt = new TransactionStatus(__returnAuthorizationPendingReceipt);
    public static final TransactionStatus _returnAuthorizationPendingRefund = new TransactionStatus(__returnAuthorizationPendingRefund);
    public static final TransactionStatus _returnAuthorizationPendingRefundPartiallyReceived = new TransactionStatus(__returnAuthorizationPendingRefundPartiallyReceived);
    public static final TransactionStatus _returnAuthorizationRefunded = new TransactionStatus(__returnAuthorizationRefunded);
    public static final TransactionStatus _salesOrderBilled = new TransactionStatus(__salesOrderBilled);
    public static final TransactionStatus _salesOrderCancelled = new TransactionStatus(__salesOrderCancelled);
    public static final TransactionStatus _salesOrderClosed = new TransactionStatus(__salesOrderClosed);
    public static final TransactionStatus _salesOrderPartiallyFulfilled = new TransactionStatus(__salesOrderPartiallyFulfilled);
    public static final TransactionStatus _salesOrderPendingApproval = new TransactionStatus(__salesOrderPendingApproval);
    public static final TransactionStatus _salesOrderPendingBilling = new TransactionStatus(__salesOrderPendingBilling);
    public static final TransactionStatus _salesOrderPendingBillingPartiallyFulfilled = new TransactionStatus(__salesOrderPendingBillingPartiallyFulfilled);
    public static final TransactionStatus _salesOrderPendingFulfillment = new TransactionStatus(__salesOrderPendingFulfillment);
    public static final TransactionStatus _salesTaxPaymentOnlineBillPayPendingAccountingApproval = new TransactionStatus(__salesTaxPaymentOnlineBillPayPendingAccountingApproval);
    public static final TransactionStatus _salesTaxPaymentVoided = new TransactionStatus(__salesTaxPaymentVoided);
    public static final TransactionStatus _statementChargeOpen = new TransactionStatus(__statementChargeOpen);
    public static final TransactionStatus _statementChargePaidInFull = new TransactionStatus(__statementChargePaidInFull);
    public static final TransactionStatus _taxLiabilityChequeVoided = new TransactionStatus(__taxLiabilityChequeVoided);
    public static final TransactionStatus _tegataPayableEndorsed = new TransactionStatus(__tegataPayableEndorsed);
    public static final TransactionStatus _tegataPayableIssued = new TransactionStatus(__tegataPayableIssued);
    public static final TransactionStatus _tegataPayablePaid = new TransactionStatus(__tegataPayablePaid);
    public static final TransactionStatus _tegataReceivablesCollected = new TransactionStatus(__tegataReceivablesCollected);
    public static final TransactionStatus _tegataReceivablesDiscounted = new TransactionStatus(__tegataReceivablesDiscounted);
    public static final TransactionStatus _tegataReceivablesEndorsed = new TransactionStatus(__tegataReceivablesEndorsed);
    public static final TransactionStatus _tegataReceivablesHolding = new TransactionStatus(__tegataReceivablesHolding);
    public static final TransactionStatus _tegataReceivablesVoided = new TransactionStatus(__tegataReceivablesVoided);
    public static final TransactionStatus _transferOrderClosed = new TransactionStatus(__transferOrderClosed);
    public static final TransactionStatus _transferOrderPartiallyFulfilled = new TransactionStatus(__transferOrderPartiallyFulfilled);
    public static final TransactionStatus _transferOrderPendingApproval = new TransactionStatus(__transferOrderPendingApproval);
    public static final TransactionStatus _transferOrderPendingFulfillment = new TransactionStatus(__transferOrderPendingFulfillment);
    public static final TransactionStatus _transferOrderPendingReceipt = new TransactionStatus(__transferOrderPendingReceipt);
    public static final TransactionStatus _transferOrderPendingReceiptPartiallyFulfilled = new TransactionStatus(__transferOrderPendingReceiptPartiallyFulfilled);
    public static final TransactionStatus _transferOrderReceived = new TransactionStatus(__transferOrderReceived);
    public static final TransactionStatus _transferOrderRejected = new TransactionStatus(__transferOrderRejected);
    public static final TransactionStatus _vendorReturnAuthorizationCancelled = new TransactionStatus(__vendorReturnAuthorizationCancelled);
    public static final TransactionStatus _vendorReturnAuthorizationClosed = new TransactionStatus(__vendorReturnAuthorizationClosed);
    public static final TransactionStatus _vendorReturnAuthorizationCredited = new TransactionStatus(__vendorReturnAuthorizationCredited);
    public static final TransactionStatus _vendorReturnAuthorizationPartiallyReturned = new TransactionStatus(__vendorReturnAuthorizationPartiallyReturned);
    public static final TransactionStatus _vendorReturnAuthorizationPendingApproval = new TransactionStatus(__vendorReturnAuthorizationPendingApproval);
    public static final TransactionStatus _vendorReturnAuthorizationPendingCredit = new TransactionStatus(__vendorReturnAuthorizationPendingCredit);
    public static final TransactionStatus _vendorReturnAuthorizationPendingCreditPartiallyReturned = new TransactionStatus(__vendorReturnAuthorizationPendingCreditPartiallyReturned);
    public static final TransactionStatus _vendorReturnAuthorizationPendingReturn = new TransactionStatus(__vendorReturnAuthorizationPendingReturn);
    public static final TransactionStatus _workOrderBuilt = new TransactionStatus(__workOrderBuilt);
    public static final TransactionStatus _workOrderCancelled = new TransactionStatus(__workOrderCancelled);
    public static final TransactionStatus _workOrderClosed = new TransactionStatus(__workOrderClosed);
    public static final TransactionStatus _workOrderPartiallyBuilt = new TransactionStatus(__workOrderPartiallyBuilt);
    public static final TransactionStatus _workOrderPendingBuild = new TransactionStatus(__workOrderPendingBuild);
    public static final TransactionStatus _workOrderPlanned = new TransactionStatus(__workOrderPlanned);
    public java.lang.String getValue() { return _value_;}
    public static TransactionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionStatus enumeration = (TransactionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
