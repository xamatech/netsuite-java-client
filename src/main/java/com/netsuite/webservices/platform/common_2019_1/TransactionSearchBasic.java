/**
 * TransactionSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TransactionSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField accountType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField acctCorpCardExp;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField actualShipDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField altSalesAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField altSalesNetAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountPaid;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountUnbilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField anyLineItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField appliedToForeignAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField appliedToIsFxVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField appliedToLinkAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField appliedToLinkType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField appliedToTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField applyingForeignAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyingIsFxVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField applyingLinkAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField applyingLinkType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField applyingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField authCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoCalculateLag;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField avsStreetMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField avsZipMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField billCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billCounty;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField billedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billState;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField billVarianceStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField binNumberQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField bookSpecificTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField buildEntireAssembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField buildVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField built;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField canHaveStackablePromotions;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField catchUpPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField ccCustomerCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField ccExpireDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField ccName;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField ccNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField chargeType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField cleared;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField closed;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField closeDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField cogs;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField commissionEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField commit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField confirmationNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costComponentAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField costComponentCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField costComponentItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costComponentQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costComponentStandardCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costEstimateRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costEstimateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField createdBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField createdFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField cscMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customerSubOf;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customForm;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField customGL;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOpen;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField debitAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField deferredRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField depositDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField depositTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField drAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dueDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estGrossProfitPct;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField excludeCommission;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField excludeFromRateRequest;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedCloseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedReceiptDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField expenseCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField expenseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField finChrg;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField firmed;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField forecastType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fulfillingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fxAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxCostEstimateRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxTranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxVsoeAllocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxVsoeAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxVsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField gcoAvailabelToCharge;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField gcoAvailableToRefund;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField gcoAvsStreetMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField gcoAvsZipMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField gcoBuyerAccountAge;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoBuyerIp;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoChargeAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoChargebackAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoConfirmedChargedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoConfirmedRefundedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoCreditcardNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField gcoCscMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoFinancialState;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoFulfillmentState;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoOrderId;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoOrderTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoPromotionAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoPromotionName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoRefundAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoShippingTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoStateChangedDetail;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertificate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeInForecast;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField intercoStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField intercoTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField inventoryLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField inventorySubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAllocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBackflush;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoChargeback;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoChargeConfirmed;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoPaymentGuaranteed;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoRefundConfirmed;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInsideDelivery;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInsidePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isIntercompanyAdjustment;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInTransitPayment;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMultiShipTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPayPalMeth;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReversal;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isRevRecTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isScrap;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTransferPriceCosting;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoeAlloc;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWip;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField itemFulfillmentChoice;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemSubOf;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField landedCostPerLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField lineUniqueKey;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locationAutoAssigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField mainLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField mainName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingRouting;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matchBillToReceipt;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField memoMain;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField memorized;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField merchantAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField message;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField multiSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField nameText;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField netAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField nextBillDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField noAutoAssignLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nonReimbursable;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField number;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField oneTimeTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField opportunity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField orderPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchTextNumberField otherRefNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchTextNumberField otherRefNumNonDeposit;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField overheadParentItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField packageCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField paidTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentApproved;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField paymentEventDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField paymentEventHoldReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentEventPurchaseCardUsed;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentEventPurchaseDataSent;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField paymentEventResult;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField paymentEventType;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField paymentMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField paymentOption;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField payPalPending;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField payPalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField payPalTranId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField pnRefNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField poAsText;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField posting;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priceLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printedPickingTicket;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField probability;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projectedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField projectTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField promoCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityPacked;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityPicked;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityRevCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityShipRecv;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recognizedRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField recordType;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurAnnuallyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurMonthlyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurQuarterlyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField recurringBill;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurWeeklyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField refNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField revCommitStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField revCommittingStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revCommittingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField revenueStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField reversalDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField reversalNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField revRecEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField revRecOnRevCommitment;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField revRecStartDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField revRecTermInMonths;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField salesEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField schedulingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField serialNumberCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField serialNumberCostAdjustment;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField serialNumberQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumbers;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField shipCarrier;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField shipCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipCounty;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField shipDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField shipGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipping;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipRecvStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipRecvStatusLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipState;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField source;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField statistical;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField taxLine;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxPeriod;

    private com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate taxPeriodRelative;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField taxPointDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField terms;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField termsOfSale;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField toBeEmailed;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField toBePrinted;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField toSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField trackingNumbers;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField tranDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfitPct;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranFxEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField tranId;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField tranIsVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField transactionDiscount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField transactionLineType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField transactionNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField transferLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityPacked;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityPicked;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityReceived;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityShipped;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unit;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCostOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendType;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField visibleToCustomer;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField voided;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoeAllocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoeAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoeDeferral;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoePermitDiscount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField webSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public TransactionSearchBasic() {
    }


    /**
     * Gets the account value for this TransactionSearchBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TransactionSearchBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField account) {
        this.account = account;
    }


    /**
     * Gets the accountType value for this TransactionSearchBasic.
     * 
     * @return accountType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this TransactionSearchBasic.
     * 
     * @param accountType
     */
    public void setAccountType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the acctCorpCardExp value for this TransactionSearchBasic.
     * 
     * @return acctCorpCardExp
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAcctCorpCardExp() {
        return acctCorpCardExp;
    }


    /**
     * Sets the acctCorpCardExp value for this TransactionSearchBasic.
     * 
     * @param acctCorpCardExp
     */
    public void setAcctCorpCardExp(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField acctCorpCardExp) {
        this.acctCorpCardExp = acctCorpCardExp;
    }


    /**
     * Gets the actualShipDate value for this TransactionSearchBasic.
     * 
     * @return actualShipDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getActualShipDate() {
        return actualShipDate;
    }


    /**
     * Sets the actualShipDate value for this TransactionSearchBasic.
     * 
     * @param actualShipDate
     */
    public void setActualShipDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField actualShipDate) {
        this.actualShipDate = actualShipDate;
    }


    /**
     * Gets the altSalesAmount value for this TransactionSearchBasic.
     * 
     * @return altSalesAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAltSalesAmount() {
        return altSalesAmount;
    }


    /**
     * Sets the altSalesAmount value for this TransactionSearchBasic.
     * 
     * @param altSalesAmount
     */
    public void setAltSalesAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }


    /**
     * Gets the altSalesNetAmount value for this TransactionSearchBasic.
     * 
     * @return altSalesNetAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAltSalesNetAmount() {
        return altSalesNetAmount;
    }


    /**
     * Sets the altSalesNetAmount value for this TransactionSearchBasic.
     * 
     * @param altSalesNetAmount
     */
    public void setAltSalesNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }


    /**
     * Gets the amount value for this TransactionSearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountPaid value for this TransactionSearchBasic.
     * 
     * @return amountPaid
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this TransactionSearchBasic.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountPaid) {
        this.amountPaid = amountPaid;
    }


    /**
     * Gets the amountRemaining value for this TransactionSearchBasic.
     * 
     * @return amountRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this TransactionSearchBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }


    /**
     * Gets the amountUnbilled value for this TransactionSearchBasic.
     * 
     * @return amountUnbilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAmountUnbilled() {
        return amountUnbilled;
    }


    /**
     * Sets the amountUnbilled value for this TransactionSearchBasic.
     * 
     * @param amountUnbilled
     */
    public void setAmountUnbilled(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField amountUnbilled) {
        this.amountUnbilled = amountUnbilled;
    }


    /**
     * Gets the anyLineItem value for this TransactionSearchBasic.
     * 
     * @return anyLineItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAnyLineItem() {
        return anyLineItem;
    }


    /**
     * Sets the anyLineItem value for this TransactionSearchBasic.
     * 
     * @param anyLineItem
     */
    public void setAnyLineItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField anyLineItem) {
        this.anyLineItem = anyLineItem;
    }


    /**
     * Gets the appliedToForeignAmount value for this TransactionSearchBasic.
     * 
     * @return appliedToForeignAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAppliedToForeignAmount() {
        return appliedToForeignAmount;
    }


    /**
     * Sets the appliedToForeignAmount value for this TransactionSearchBasic.
     * 
     * @param appliedToForeignAmount
     */
    public void setAppliedToForeignAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField appliedToForeignAmount) {
        this.appliedToForeignAmount = appliedToForeignAmount;
    }


    /**
     * Gets the appliedToIsFxVariance value for this TransactionSearchBasic.
     * 
     * @return appliedToIsFxVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAppliedToIsFxVariance() {
        return appliedToIsFxVariance;
    }


    /**
     * Sets the appliedToIsFxVariance value for this TransactionSearchBasic.
     * 
     * @param appliedToIsFxVariance
     */
    public void setAppliedToIsFxVariance(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField appliedToIsFxVariance) {
        this.appliedToIsFxVariance = appliedToIsFxVariance;
    }


    /**
     * Gets the appliedToLinkAmount value for this TransactionSearchBasic.
     * 
     * @return appliedToLinkAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getAppliedToLinkAmount() {
        return appliedToLinkAmount;
    }


    /**
     * Sets the appliedToLinkAmount value for this TransactionSearchBasic.
     * 
     * @param appliedToLinkAmount
     */
    public void setAppliedToLinkAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField appliedToLinkAmount) {
        this.appliedToLinkAmount = appliedToLinkAmount;
    }


    /**
     * Gets the appliedToLinkType value for this TransactionSearchBasic.
     * 
     * @return appliedToLinkType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAppliedToLinkType() {
        return appliedToLinkType;
    }


    /**
     * Sets the appliedToLinkType value for this TransactionSearchBasic.
     * 
     * @param appliedToLinkType
     */
    public void setAppliedToLinkType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField appliedToLinkType) {
        this.appliedToLinkType = appliedToLinkType;
    }


    /**
     * Gets the appliedToTransaction value for this TransactionSearchBasic.
     * 
     * @return appliedToTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAppliedToTransaction() {
        return appliedToTransaction;
    }


    /**
     * Sets the appliedToTransaction value for this TransactionSearchBasic.
     * 
     * @param appliedToTransaction
     */
    public void setAppliedToTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField appliedToTransaction) {
        this.appliedToTransaction = appliedToTransaction;
    }


    /**
     * Gets the applyingForeignAmount value for this TransactionSearchBasic.
     * 
     * @return applyingForeignAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getApplyingForeignAmount() {
        return applyingForeignAmount;
    }


    /**
     * Sets the applyingForeignAmount value for this TransactionSearchBasic.
     * 
     * @param applyingForeignAmount
     */
    public void setApplyingForeignAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField applyingForeignAmount) {
        this.applyingForeignAmount = applyingForeignAmount;
    }


    /**
     * Gets the applyingIsFxVariance value for this TransactionSearchBasic.
     * 
     * @return applyingIsFxVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getApplyingIsFxVariance() {
        return applyingIsFxVariance;
    }


    /**
     * Sets the applyingIsFxVariance value for this TransactionSearchBasic.
     * 
     * @param applyingIsFxVariance
     */
    public void setApplyingIsFxVariance(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField applyingIsFxVariance) {
        this.applyingIsFxVariance = applyingIsFxVariance;
    }


    /**
     * Gets the applyingLinkAmount value for this TransactionSearchBasic.
     * 
     * @return applyingLinkAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getApplyingLinkAmount() {
        return applyingLinkAmount;
    }


    /**
     * Sets the applyingLinkAmount value for this TransactionSearchBasic.
     * 
     * @param applyingLinkAmount
     */
    public void setApplyingLinkAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField applyingLinkAmount) {
        this.applyingLinkAmount = applyingLinkAmount;
    }


    /**
     * Gets the applyingLinkType value for this TransactionSearchBasic.
     * 
     * @return applyingLinkType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getApplyingLinkType() {
        return applyingLinkType;
    }


    /**
     * Sets the applyingLinkType value for this TransactionSearchBasic.
     * 
     * @param applyingLinkType
     */
    public void setApplyingLinkType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField applyingLinkType) {
        this.applyingLinkType = applyingLinkType;
    }


    /**
     * Gets the applyingTransaction value for this TransactionSearchBasic.
     * 
     * @return applyingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getApplyingTransaction() {
        return applyingTransaction;
    }


    /**
     * Sets the applyingTransaction value for this TransactionSearchBasic.
     * 
     * @param applyingTransaction
     */
    public void setApplyingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }


    /**
     * Gets the approvalStatus value for this TransactionSearchBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TransactionSearchBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the authCode value for this TransactionSearchBasic.
     * 
     * @return authCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this TransactionSearchBasic.
     * 
     * @param authCode
     */
    public void setAuthCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the autoCalculateLag value for this TransactionSearchBasic.
     * 
     * @return autoCalculateLag
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this TransactionSearchBasic.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }


    /**
     * Gets the avsStreetMatch value for this TransactionSearchBasic.
     * 
     * @return avsStreetMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAvsStreetMatch() {
        return avsStreetMatch;
    }


    /**
     * Sets the avsStreetMatch value for this TransactionSearchBasic.
     * 
     * @param avsStreetMatch
     */
    public void setAvsStreetMatch(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField avsStreetMatch) {
        this.avsStreetMatch = avsStreetMatch;
    }


    /**
     * Gets the avsZipMatch value for this TransactionSearchBasic.
     * 
     * @return avsZipMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getAvsZipMatch() {
        return avsZipMatch;
    }


    /**
     * Sets the avsZipMatch value for this TransactionSearchBasic.
     * 
     * @param avsZipMatch
     */
    public void setAvsZipMatch(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField avsZipMatch) {
        this.avsZipMatch = avsZipMatch;
    }


    /**
     * Gets the billable value for this TransactionSearchBasic.
     * 
     * @return billable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TransactionSearchBasic.
     * 
     * @param billable
     */
    public void setBillable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the billAddress value for this TransactionSearchBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this TransactionSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the billAddressee value for this TransactionSearchBasic.
     * 
     * @return billAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this TransactionSearchBasic.
     * 
     * @param billAddressee
     */
    public void setBillAddressee(com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddressee) {
        this.billAddressee = billAddressee;
    }


    /**
     * Gets the billAttention value for this TransactionSearchBasic.
     * 
     * @return billAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this TransactionSearchBasic.
     * 
     * @param billAttention
     */
    public void setBillAttention(com.netsuite.webservices.platform.core_2019_1.SearchStringField billAttention) {
        this.billAttention = billAttention;
    }


    /**
     * Gets the billCity value for this TransactionSearchBasic.
     * 
     * @return billCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this TransactionSearchBasic.
     * 
     * @param billCity
     */
    public void setBillCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField billCity) {
        this.billCity = billCity;
    }


    /**
     * Gets the billCountry value for this TransactionSearchBasic.
     * 
     * @return billCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this TransactionSearchBasic.
     * 
     * @param billCountry
     */
    public void setBillCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField billCountry) {
        this.billCountry = billCountry;
    }


    /**
     * Gets the billCounty value for this TransactionSearchBasic.
     * 
     * @return billCounty
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillCounty() {
        return billCounty;
    }


    /**
     * Sets the billCounty value for this TransactionSearchBasic.
     * 
     * @param billCounty
     */
    public void setBillCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField billCounty) {
        this.billCounty = billCounty;
    }


    /**
     * Gets the billedDate value for this TransactionSearchBasic.
     * 
     * @return billedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getBilledDate() {
        return billedDate;
    }


    /**
     * Sets the billedDate value for this TransactionSearchBasic.
     * 
     * @param billedDate
     */
    public void setBilledDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField billedDate) {
        this.billedDate = billedDate;
    }


    /**
     * Gets the billingAccount value for this TransactionSearchBasic.
     * 
     * @return billingAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this TransactionSearchBasic.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the billingSchedule value for this TransactionSearchBasic.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this TransactionSearchBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the billingStatus value for this TransactionSearchBasic.
     * 
     * @return billingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this TransactionSearchBasic.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the billingTransaction value for this TransactionSearchBasic.
     * 
     * @return billingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBillingTransaction() {
        return billingTransaction;
    }


    /**
     * Sets the billingTransaction value for this TransactionSearchBasic.
     * 
     * @param billingTransaction
     */
    public void setBillingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField billingTransaction) {
        this.billingTransaction = billingTransaction;
    }


    /**
     * Gets the billPhone value for this TransactionSearchBasic.
     * 
     * @return billPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this TransactionSearchBasic.
     * 
     * @param billPhone
     */
    public void setBillPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField billPhone) {
        this.billPhone = billPhone;
    }


    /**
     * Gets the billState value for this TransactionSearchBasic.
     * 
     * @return billState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this TransactionSearchBasic.
     * 
     * @param billState
     */
    public void setBillState(com.netsuite.webservices.platform.core_2019_1.SearchStringField billState) {
        this.billState = billState;
    }


    /**
     * Gets the billVarianceStatus value for this TransactionSearchBasic.
     * 
     * @return billVarianceStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getBillVarianceStatus() {
        return billVarianceStatus;
    }


    /**
     * Sets the billVarianceStatus value for this TransactionSearchBasic.
     * 
     * @param billVarianceStatus
     */
    public void setBillVarianceStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }


    /**
     * Gets the billZip value for this TransactionSearchBasic.
     * 
     * @return billZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillZip() {
        return billZip;
    }


    /**
     * Sets the billZip value for this TransactionSearchBasic.
     * 
     * @param billZip
     */
    public void setBillZip(com.netsuite.webservices.platform.core_2019_1.SearchStringField billZip) {
        this.billZip = billZip;
    }


    /**
     * Gets the binNumber value for this TransactionSearchBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this TransactionSearchBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the binNumberQuantity value for this TransactionSearchBasic.
     * 
     * @return binNumberQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBinNumberQuantity() {
        return binNumberQuantity;
    }


    /**
     * Sets the binNumberQuantity value for this TransactionSearchBasic.
     * 
     * @param binNumberQuantity
     */
    public void setBinNumberQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField binNumberQuantity) {
        this.binNumberQuantity = binNumberQuantity;
    }


    /**
     * Gets the bomQuantity value for this TransactionSearchBasic.
     * 
     * @return bomQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this TransactionSearchBasic.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField bomQuantity) {
        this.bomQuantity = bomQuantity;
    }


    /**
     * Gets the bookSpecificTransaction value for this TransactionSearchBasic.
     * 
     * @return bookSpecificTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBookSpecificTransaction() {
        return bookSpecificTransaction;
    }


    /**
     * Sets the bookSpecificTransaction value for this TransactionSearchBasic.
     * 
     * @param bookSpecificTransaction
     */
    public void setBookSpecificTransaction(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField bookSpecificTransaction) {
        this.bookSpecificTransaction = bookSpecificTransaction;
    }


    /**
     * Gets the buildEntireAssembly value for this TransactionSearchBasic.
     * 
     * @return buildEntireAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this TransactionSearchBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }


    /**
     * Gets the buildVariance value for this TransactionSearchBasic.
     * 
     * @return buildVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBuildVariance() {
        return buildVariance;
    }


    /**
     * Sets the buildVariance value for this TransactionSearchBasic.
     * 
     * @param buildVariance
     */
    public void setBuildVariance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField buildVariance) {
        this.buildVariance = buildVariance;
    }


    /**
     * Gets the built value for this TransactionSearchBasic.
     * 
     * @return built
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBuilt() {
        return built;
    }


    /**
     * Sets the built value for this TransactionSearchBasic.
     * 
     * @param built
     */
    public void setBuilt(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField built) {
        this.built = built;
    }


    /**
     * Gets the canHaveStackablePromotions value for this TransactionSearchBasic.
     * 
     * @return canHaveStackablePromotions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCanHaveStackablePromotions() {
        return canHaveStackablePromotions;
    }


    /**
     * Sets the canHaveStackablePromotions value for this TransactionSearchBasic.
     * 
     * @param canHaveStackablePromotions
     */
    public void setCanHaveStackablePromotions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField canHaveStackablePromotions) {
        this.canHaveStackablePromotions = canHaveStackablePromotions;
    }


    /**
     * Gets the catchUpPeriod value for this TransactionSearchBasic.
     * 
     * @return catchUpPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCatchUpPeriod() {
        return catchUpPeriod;
    }


    /**
     * Sets the catchUpPeriod value for this TransactionSearchBasic.
     * 
     * @param catchUpPeriod
     */
    public void setCatchUpPeriod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }


    /**
     * Gets the ccCustomerCode value for this TransactionSearchBasic.
     * 
     * @return ccCustomerCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this TransactionSearchBasic.
     * 
     * @param ccCustomerCode
     */
    public void setCcCustomerCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }


    /**
     * Gets the ccExpireDate value for this TransactionSearchBasic.
     * 
     * @return ccExpireDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this TransactionSearchBasic.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this TransactionSearchBasic.
     * 
     * @return ccName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this TransactionSearchBasic.
     * 
     * @param ccName
     */
    public void setCcName(com.netsuite.webservices.platform.core_2019_1.SearchStringField ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccNumber value for this TransactionSearchBasic.
     * 
     * @return ccNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this TransactionSearchBasic.
     * 
     * @param ccNumber
     */
    public void setCcNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the chargeType value for this TransactionSearchBasic.
     * 
     * @return chargeType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this TransactionSearchBasic.
     * 
     * @param chargeType
     */
    public void setChargeType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the _class value for this TransactionSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TransactionSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the cleared value for this TransactionSearchBasic.
     * 
     * @return cleared
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCleared() {
        return cleared;
    }


    /**
     * Sets the cleared value for this TransactionSearchBasic.
     * 
     * @param cleared
     */
    public void setCleared(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField cleared) {
        this.cleared = cleared;
    }


    /**
     * Gets the closed value for this TransactionSearchBasic.
     * 
     * @return closed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this TransactionSearchBasic.
     * 
     * @param closed
     */
    public void setClosed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField closed) {
        this.closed = closed;
    }


    /**
     * Gets the closeDate value for this TransactionSearchBasic.
     * 
     * @return closeDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this TransactionSearchBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the cogs value for this TransactionSearchBasic.
     * 
     * @return cogs
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCogs() {
        return cogs;
    }


    /**
     * Sets the cogs value for this TransactionSearchBasic.
     * 
     * @param cogs
     */
    public void setCogs(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField cogs) {
        this.cogs = cogs;
    }


    /**
     * Gets the commissionEffectiveDate value for this TransactionSearchBasic.
     * 
     * @return commissionEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCommissionEffectiveDate() {
        return commissionEffectiveDate;
    }


    /**
     * Sets the commissionEffectiveDate value for this TransactionSearchBasic.
     * 
     * @param commissionEffectiveDate
     */
    public void setCommissionEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField commissionEffectiveDate) {
        this.commissionEffectiveDate = commissionEffectiveDate;
    }


    /**
     * Gets the commit value for this TransactionSearchBasic.
     * 
     * @return commit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this TransactionSearchBasic.
     * 
     * @param commit
     */
    public void setCommit(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField commit) {
        this.commit = commit;
    }


    /**
     * Gets the componentYield value for this TransactionSearchBasic.
     * 
     * @return componentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this TransactionSearchBasic.
     * 
     * @param componentYield
     */
    public void setComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField componentYield) {
        this.componentYield = componentYield;
    }


    /**
     * Gets the confirmationNumber value for this TransactionSearchBasic.
     * 
     * @return confirmationNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this TransactionSearchBasic.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the contribution value for this TransactionSearchBasic.
     * 
     * @return contribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this TransactionSearchBasic.
     * 
     * @param contribution
     */
    public void setContribution(com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the costComponentAmount value for this TransactionSearchBasic.
     * 
     * @return costComponentAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostComponentAmount() {
        return costComponentAmount;
    }


    /**
     * Sets the costComponentAmount value for this TransactionSearchBasic.
     * 
     * @param costComponentAmount
     */
    public void setCostComponentAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costComponentAmount) {
        this.costComponentAmount = costComponentAmount;
    }


    /**
     * Gets the costComponentCategory value for this TransactionSearchBasic.
     * 
     * @return costComponentCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCostComponentCategory() {
        return costComponentCategory;
    }


    /**
     * Sets the costComponentCategory value for this TransactionSearchBasic.
     * 
     * @param costComponentCategory
     */
    public void setCostComponentCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField costComponentCategory) {
        this.costComponentCategory = costComponentCategory;
    }


    /**
     * Gets the costComponentItem value for this TransactionSearchBasic.
     * 
     * @return costComponentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCostComponentItem() {
        return costComponentItem;
    }


    /**
     * Sets the costComponentItem value for this TransactionSearchBasic.
     * 
     * @param costComponentItem
     */
    public void setCostComponentItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField costComponentItem) {
        this.costComponentItem = costComponentItem;
    }


    /**
     * Gets the costComponentQuantity value for this TransactionSearchBasic.
     * 
     * @return costComponentQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostComponentQuantity() {
        return costComponentQuantity;
    }


    /**
     * Sets the costComponentQuantity value for this TransactionSearchBasic.
     * 
     * @param costComponentQuantity
     */
    public void setCostComponentQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costComponentQuantity) {
        this.costComponentQuantity = costComponentQuantity;
    }


    /**
     * Gets the costComponentStandardCost value for this TransactionSearchBasic.
     * 
     * @return costComponentStandardCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostComponentStandardCost() {
        return costComponentStandardCost;
    }


    /**
     * Sets the costComponentStandardCost value for this TransactionSearchBasic.
     * 
     * @param costComponentStandardCost
     */
    public void setCostComponentStandardCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costComponentStandardCost) {
        this.costComponentStandardCost = costComponentStandardCost;
    }


    /**
     * Gets the costEstimate value for this TransactionSearchBasic.
     * 
     * @return costEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this TransactionSearchBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the costEstimateRate value for this TransactionSearchBasic.
     * 
     * @return costEstimateRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCostEstimateRate() {
        return costEstimateRate;
    }


    /**
     * Sets the costEstimateRate value for this TransactionSearchBasic.
     * 
     * @param costEstimateRate
     */
    public void setCostEstimateRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField costEstimateRate) {
        this.costEstimateRate = costEstimateRate;
    }


    /**
     * Gets the costEstimateType value for this TransactionSearchBasic.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this TransactionSearchBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the createdBy value for this TransactionSearchBasic.
     * 
     * @return createdBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this TransactionSearchBasic.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdFrom value for this TransactionSearchBasic.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this TransactionSearchBasic.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the creditAmount value for this TransactionSearchBasic.
     * 
     * @return creditAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this TransactionSearchBasic.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the cscMatch value for this TransactionSearchBasic.
     * 
     * @return cscMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCscMatch() {
        return cscMatch;
    }


    /**
     * Sets the cscMatch value for this TransactionSearchBasic.
     * 
     * @param cscMatch
     */
    public void setCscMatch(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField cscMatch) {
        this.cscMatch = cscMatch;
    }


    /**
     * Gets the currency value for this TransactionSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TransactionSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the customerSubOf value for this TransactionSearchBasic.
     * 
     * @return customerSubOf
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomerSubOf() {
        return customerSubOf;
    }


    /**
     * Sets the customerSubOf value for this TransactionSearchBasic.
     * 
     * @param customerSubOf
     */
    public void setCustomerSubOf(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customerSubOf) {
        this.customerSubOf = customerSubOf;
    }


    /**
     * Gets the customForm value for this TransactionSearchBasic.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this TransactionSearchBasic.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the customGL value for this TransactionSearchBasic.
     * 
     * @return customGL
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCustomGL() {
        return customGL;
    }


    /**
     * Sets the customGL value for this TransactionSearchBasic.
     * 
     * @param customGL
     */
    public void setCustomGL(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField customGL) {
        this.customGL = customGL;
    }


    /**
     * Gets the custType value for this TransactionSearchBasic.
     * 
     * @return custType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this TransactionSearchBasic.
     * 
     * @param custType
     */
    public void setCustType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custType) {
        this.custType = custType;
    }


    /**
     * Gets the dateCreated value for this TransactionSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TransactionSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the daysOpen value for this TransactionSearchBasic.
     * 
     * @return daysOpen
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this TransactionSearchBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOpen) {
        this.daysOpen = daysOpen;
    }


    /**
     * Gets the daysOverdue value for this TransactionSearchBasic.
     * 
     * @return daysOverdue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this TransactionSearchBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }


    /**
     * Gets the debitAmount value for this TransactionSearchBasic.
     * 
     * @return debitAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this TransactionSearchBasic.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField debitAmount) {
        this.debitAmount = debitAmount;
    }


    /**
     * Gets the deferredRevenue value for this TransactionSearchBasic.
     * 
     * @return deferredRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this TransactionSearchBasic.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }


    /**
     * Gets the deferRevRec value for this TransactionSearchBasic.
     * 
     * @return deferRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this TransactionSearchBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the department value for this TransactionSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TransactionSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the depositDate value for this TransactionSearchBasic.
     * 
     * @return depositDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDepositDate() {
        return depositDate;
    }


    /**
     * Sets the depositDate value for this TransactionSearchBasic.
     * 
     * @param depositDate
     */
    public void setDepositDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField depositDate) {
        this.depositDate = depositDate;
    }


    /**
     * Gets the depositTransaction value for this TransactionSearchBasic.
     * 
     * @return depositTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDepositTransaction() {
        return depositTransaction;
    }


    /**
     * Sets the depositTransaction value for this TransactionSearchBasic.
     * 
     * @param depositTransaction
     */
    public void setDepositTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField depositTransaction) {
        this.depositTransaction = depositTransaction;
    }


    /**
     * Gets the drAccount value for this TransactionSearchBasic.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this TransactionSearchBasic.
     * 
     * @param drAccount
     */
    public void setDrAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField drAccount) {
        this.drAccount = drAccount;
    }


    /**
     * Gets the dueDate value for this TransactionSearchBasic.
     * 
     * @return dueDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this TransactionSearchBasic.
     * 
     * @param dueDate
     */
    public void setDueDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the email value for this TransactionSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TransactionSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the employee value for this TransactionSearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TransactionSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField employee) {
        this.employee = employee;
    }


    /**
     * Gets the endDate value for this TransactionSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TransactionSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the entity value for this TransactionSearchBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this TransactionSearchBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entity) {
        this.entity = entity;
    }


    /**
     * Gets the entityStatus value for this TransactionSearchBasic.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this TransactionSearchBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the estGrossProfit value for this TransactionSearchBasic.
     * 
     * @return estGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this TransactionSearchBasic.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @return estGrossProfitPct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstGrossProfitPct() {
        return estGrossProfitPct;
    }


    /**
     * Sets the estGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @param estGrossProfitPct
     */
    public void setEstGrossProfitPct(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estGrossProfitPct) {
        this.estGrossProfitPct = estGrossProfitPct;
    }


    /**
     * Gets the exchangeRate value for this TransactionSearchBasic.
     * 
     * @return exchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this TransactionSearchBasic.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the excludeCommission value for this TransactionSearchBasic.
     * 
     * @return excludeCommission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this TransactionSearchBasic.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField excludeCommission) {
        this.excludeCommission = excludeCommission;
    }


    /**
     * Gets the excludeFromRateRequest value for this TransactionSearchBasic.
     * 
     * @return excludeFromRateRequest
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getExcludeFromRateRequest() {
        return excludeFromRateRequest;
    }


    /**
     * Sets the excludeFromRateRequest value for this TransactionSearchBasic.
     * 
     * @param excludeFromRateRequest
     */
    public void setExcludeFromRateRequest(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }


    /**
     * Gets the expectedCloseDate value for this TransactionSearchBasic.
     * 
     * @return expectedCloseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this TransactionSearchBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }


    /**
     * Gets the expectedReceiptDate value for this TransactionSearchBasic.
     * 
     * @return expectedReceiptDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpectedReceiptDate() {
        return expectedReceiptDate;
    }


    /**
     * Sets the expectedReceiptDate value for this TransactionSearchBasic.
     * 
     * @param expectedReceiptDate
     */
    public void setExpectedReceiptDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }


    /**
     * Gets the expenseCategory value for this TransactionSearchBasic.
     * 
     * @return expenseCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExpenseCategory() {
        return expenseCategory;
    }


    /**
     * Sets the expenseCategory value for this TransactionSearchBasic.
     * 
     * @param expenseCategory
     */
    public void setExpenseCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField expenseCategory) {
        this.expenseCategory = expenseCategory;
    }


    /**
     * Gets the expenseDate value for this TransactionSearchBasic.
     * 
     * @return expenseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getExpenseDate() {
        return expenseDate;
    }


    /**
     * Sets the expenseDate value for this TransactionSearchBasic.
     * 
     * @param expenseDate
     */
    public void setExpenseDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField expenseDate) {
        this.expenseDate = expenseDate;
    }


    /**
     * Gets the externalId value for this TransactionSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TransactionSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TransactionSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TransactionSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the finChrg value for this TransactionSearchBasic.
     * 
     * @return finChrg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getFinChrg() {
        return finChrg;
    }


    /**
     * Sets the finChrg value for this TransactionSearchBasic.
     * 
     * @param finChrg
     */
    public void setFinChrg(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField finChrg) {
        this.finChrg = finChrg;
    }


    /**
     * Gets the firmed value for this TransactionSearchBasic.
     * 
     * @return firmed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getFirmed() {
        return firmed;
    }


    /**
     * Sets the firmed value for this TransactionSearchBasic.
     * 
     * @param firmed
     */
    public void setFirmed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField firmed) {
        this.firmed = firmed;
    }


    /**
     * Gets the forecastType value for this TransactionSearchBasic.
     * 
     * @return forecastType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this TransactionSearchBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField forecastType) {
        this.forecastType = forecastType;
    }


    /**
     * Gets the fulfillingTransaction value for this TransactionSearchBasic.
     * 
     * @return fulfillingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFulfillingTransaction() {
        return fulfillingTransaction;
    }


    /**
     * Sets the fulfillingTransaction value for this TransactionSearchBasic.
     * 
     * @param fulfillingTransaction
     */
    public void setFulfillingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fulfillingTransaction) {
        this.fulfillingTransaction = fulfillingTransaction;
    }


    /**
     * Gets the fxAccount value for this TransactionSearchBasic.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this TransactionSearchBasic.
     * 
     * @param fxAccount
     */
    public void setFxAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fxAccount) {
        this.fxAccount = fxAccount;
    }


    /**
     * Gets the fxAmount value for this TransactionSearchBasic.
     * 
     * @return fxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this TransactionSearchBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxAmount) {
        this.fxAmount = fxAmount;
    }


    /**
     * Gets the fxCostEstimate value for this TransactionSearchBasic.
     * 
     * @return fxCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxCostEstimate() {
        return fxCostEstimate;
    }


    /**
     * Sets the fxCostEstimate value for this TransactionSearchBasic.
     * 
     * @param fxCostEstimate
     */
    public void setFxCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxCostEstimate) {
        this.fxCostEstimate = fxCostEstimate;
    }


    /**
     * Gets the fxCostEstimateRate value for this TransactionSearchBasic.
     * 
     * @return fxCostEstimateRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxCostEstimateRate() {
        return fxCostEstimateRate;
    }


    /**
     * Sets the fxCostEstimateRate value for this TransactionSearchBasic.
     * 
     * @param fxCostEstimateRate
     */
    public void setFxCostEstimateRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxCostEstimateRate) {
        this.fxCostEstimateRate = fxCostEstimateRate;
    }


    /**
     * Gets the fxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @return fxEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxEstGrossProfit() {
        return fxEstGrossProfit;
    }


    /**
     * Sets the fxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @param fxEstGrossProfit
     */
    public void setFxEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxEstGrossProfit) {
        this.fxEstGrossProfit = fxEstGrossProfit;
    }


    /**
     * Gets the fxTranCostEstimate value for this TransactionSearchBasic.
     * 
     * @return fxTranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this TransactionSearchBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }


    /**
     * Gets the fxVsoeAllocation value for this TransactionSearchBasic.
     * 
     * @return fxVsoeAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxVsoeAllocation() {
        return fxVsoeAllocation;
    }


    /**
     * Sets the fxVsoeAllocation value for this TransactionSearchBasic.
     * 
     * @param fxVsoeAllocation
     */
    public void setFxVsoeAllocation(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxVsoeAllocation) {
        this.fxVsoeAllocation = fxVsoeAllocation;
    }


    /**
     * Gets the fxVsoeAmount value for this TransactionSearchBasic.
     * 
     * @return fxVsoeAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxVsoeAmount() {
        return fxVsoeAmount;
    }


    /**
     * Sets the fxVsoeAmount value for this TransactionSearchBasic.
     * 
     * @param fxVsoeAmount
     */
    public void setFxVsoeAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxVsoeAmount) {
        this.fxVsoeAmount = fxVsoeAmount;
    }


    /**
     * Gets the fxVsoePrice value for this TransactionSearchBasic.
     * 
     * @return fxVsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxVsoePrice() {
        return fxVsoePrice;
    }


    /**
     * Sets the fxVsoePrice value for this TransactionSearchBasic.
     * 
     * @param fxVsoePrice
     */
    public void setFxVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxVsoePrice) {
        this.fxVsoePrice = fxVsoePrice;
    }


    /**
     * Gets the gcoAvailabelToCharge value for this TransactionSearchBasic.
     * 
     * @return gcoAvailabelToCharge
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getGcoAvailabelToCharge() {
        return gcoAvailabelToCharge;
    }


    /**
     * Sets the gcoAvailabelToCharge value for this TransactionSearchBasic.
     * 
     * @param gcoAvailabelToCharge
     */
    public void setGcoAvailabelToCharge(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField gcoAvailabelToCharge) {
        this.gcoAvailabelToCharge = gcoAvailabelToCharge;
    }


    /**
     * Gets the gcoAvailableToRefund value for this TransactionSearchBasic.
     * 
     * @return gcoAvailableToRefund
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getGcoAvailableToRefund() {
        return gcoAvailableToRefund;
    }


    /**
     * Sets the gcoAvailableToRefund value for this TransactionSearchBasic.
     * 
     * @param gcoAvailableToRefund
     */
    public void setGcoAvailableToRefund(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField gcoAvailableToRefund) {
        this.gcoAvailableToRefund = gcoAvailableToRefund;
    }


    /**
     * Gets the gcoAvsStreetMatch value for this TransactionSearchBasic.
     * 
     * @return gcoAvsStreetMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGcoAvsStreetMatch() {
        return gcoAvsStreetMatch;
    }


    /**
     * Sets the gcoAvsStreetMatch value for this TransactionSearchBasic.
     * 
     * @param gcoAvsStreetMatch
     */
    public void setGcoAvsStreetMatch(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField gcoAvsStreetMatch) {
        this.gcoAvsStreetMatch = gcoAvsStreetMatch;
    }


    /**
     * Gets the gcoAvsZipMatch value for this TransactionSearchBasic.
     * 
     * @return gcoAvsZipMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGcoAvsZipMatch() {
        return gcoAvsZipMatch;
    }


    /**
     * Sets the gcoAvsZipMatch value for this TransactionSearchBasic.
     * 
     * @param gcoAvsZipMatch
     */
    public void setGcoAvsZipMatch(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField gcoAvsZipMatch) {
        this.gcoAvsZipMatch = gcoAvsZipMatch;
    }


    /**
     * Gets the gcoBuyerAccountAge value for this TransactionSearchBasic.
     * 
     * @return gcoBuyerAccountAge
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getGcoBuyerAccountAge() {
        return gcoBuyerAccountAge;
    }


    /**
     * Sets the gcoBuyerAccountAge value for this TransactionSearchBasic.
     * 
     * @param gcoBuyerAccountAge
     */
    public void setGcoBuyerAccountAge(com.netsuite.webservices.platform.core_2019_1.SearchLongField gcoBuyerAccountAge) {
        this.gcoBuyerAccountAge = gcoBuyerAccountAge;
    }


    /**
     * Gets the gcoBuyerIp value for this TransactionSearchBasic.
     * 
     * @return gcoBuyerIp
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoBuyerIp() {
        return gcoBuyerIp;
    }


    /**
     * Sets the gcoBuyerIp value for this TransactionSearchBasic.
     * 
     * @param gcoBuyerIp
     */
    public void setGcoBuyerIp(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoBuyerIp) {
        this.gcoBuyerIp = gcoBuyerIp;
    }


    /**
     * Gets the gcoChargeAmount value for this TransactionSearchBasic.
     * 
     * @return gcoChargeAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoChargeAmount() {
        return gcoChargeAmount;
    }


    /**
     * Sets the gcoChargeAmount value for this TransactionSearchBasic.
     * 
     * @param gcoChargeAmount
     */
    public void setGcoChargeAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoChargeAmount) {
        this.gcoChargeAmount = gcoChargeAmount;
    }


    /**
     * Gets the gcoChargebackAmount value for this TransactionSearchBasic.
     * 
     * @return gcoChargebackAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoChargebackAmount() {
        return gcoChargebackAmount;
    }


    /**
     * Sets the gcoChargebackAmount value for this TransactionSearchBasic.
     * 
     * @param gcoChargebackAmount
     */
    public void setGcoChargebackAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoChargebackAmount) {
        this.gcoChargebackAmount = gcoChargebackAmount;
    }


    /**
     * Gets the gcoConfirmedChargedTotal value for this TransactionSearchBasic.
     * 
     * @return gcoConfirmedChargedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoConfirmedChargedTotal() {
        return gcoConfirmedChargedTotal;
    }


    /**
     * Sets the gcoConfirmedChargedTotal value for this TransactionSearchBasic.
     * 
     * @param gcoConfirmedChargedTotal
     */
    public void setGcoConfirmedChargedTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoConfirmedChargedTotal) {
        this.gcoConfirmedChargedTotal = gcoConfirmedChargedTotal;
    }


    /**
     * Gets the gcoConfirmedRefundedTotal value for this TransactionSearchBasic.
     * 
     * @return gcoConfirmedRefundedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoConfirmedRefundedTotal() {
        return gcoConfirmedRefundedTotal;
    }


    /**
     * Sets the gcoConfirmedRefundedTotal value for this TransactionSearchBasic.
     * 
     * @param gcoConfirmedRefundedTotal
     */
    public void setGcoConfirmedRefundedTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoConfirmedRefundedTotal) {
        this.gcoConfirmedRefundedTotal = gcoConfirmedRefundedTotal;
    }


    /**
     * Gets the gcoCreditcardNumber value for this TransactionSearchBasic.
     * 
     * @return gcoCreditcardNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoCreditcardNumber() {
        return gcoCreditcardNumber;
    }


    /**
     * Sets the gcoCreditcardNumber value for this TransactionSearchBasic.
     * 
     * @param gcoCreditcardNumber
     */
    public void setGcoCreditcardNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoCreditcardNumber) {
        this.gcoCreditcardNumber = gcoCreditcardNumber;
    }


    /**
     * Gets the gcoCscMatch value for this TransactionSearchBasic.
     * 
     * @return gcoCscMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGcoCscMatch() {
        return gcoCscMatch;
    }


    /**
     * Sets the gcoCscMatch value for this TransactionSearchBasic.
     * 
     * @param gcoCscMatch
     */
    public void setGcoCscMatch(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField gcoCscMatch) {
        this.gcoCscMatch = gcoCscMatch;
    }


    /**
     * Gets the gcoFinancialState value for this TransactionSearchBasic.
     * 
     * @return gcoFinancialState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoFinancialState() {
        return gcoFinancialState;
    }


    /**
     * Sets the gcoFinancialState value for this TransactionSearchBasic.
     * 
     * @param gcoFinancialState
     */
    public void setGcoFinancialState(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoFinancialState) {
        this.gcoFinancialState = gcoFinancialState;
    }


    /**
     * Gets the gcoFulfillmentState value for this TransactionSearchBasic.
     * 
     * @return gcoFulfillmentState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoFulfillmentState() {
        return gcoFulfillmentState;
    }


    /**
     * Sets the gcoFulfillmentState value for this TransactionSearchBasic.
     * 
     * @param gcoFulfillmentState
     */
    public void setGcoFulfillmentState(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoFulfillmentState) {
        this.gcoFulfillmentState = gcoFulfillmentState;
    }


    /**
     * Gets the gcoOrderId value for this TransactionSearchBasic.
     * 
     * @return gcoOrderId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoOrderId() {
        return gcoOrderId;
    }


    /**
     * Sets the gcoOrderId value for this TransactionSearchBasic.
     * 
     * @param gcoOrderId
     */
    public void setGcoOrderId(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoOrderId) {
        this.gcoOrderId = gcoOrderId;
    }


    /**
     * Gets the gcoOrderTotal value for this TransactionSearchBasic.
     * 
     * @return gcoOrderTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoOrderTotal() {
        return gcoOrderTotal;
    }


    /**
     * Sets the gcoOrderTotal value for this TransactionSearchBasic.
     * 
     * @param gcoOrderTotal
     */
    public void setGcoOrderTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoOrderTotal) {
        this.gcoOrderTotal = gcoOrderTotal;
    }


    /**
     * Gets the gcoPromotionAmount value for this TransactionSearchBasic.
     * 
     * @return gcoPromotionAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoPromotionAmount() {
        return gcoPromotionAmount;
    }


    /**
     * Sets the gcoPromotionAmount value for this TransactionSearchBasic.
     * 
     * @param gcoPromotionAmount
     */
    public void setGcoPromotionAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoPromotionAmount) {
        this.gcoPromotionAmount = gcoPromotionAmount;
    }


    /**
     * Gets the gcoPromotionName value for this TransactionSearchBasic.
     * 
     * @return gcoPromotionName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoPromotionName() {
        return gcoPromotionName;
    }


    /**
     * Sets the gcoPromotionName value for this TransactionSearchBasic.
     * 
     * @param gcoPromotionName
     */
    public void setGcoPromotionName(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoPromotionName) {
        this.gcoPromotionName = gcoPromotionName;
    }


    /**
     * Gets the gcoRefundAmount value for this TransactionSearchBasic.
     * 
     * @return gcoRefundAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoRefundAmount() {
        return gcoRefundAmount;
    }


    /**
     * Sets the gcoRefundAmount value for this TransactionSearchBasic.
     * 
     * @param gcoRefundAmount
     */
    public void setGcoRefundAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoRefundAmount) {
        this.gcoRefundAmount = gcoRefundAmount;
    }


    /**
     * Gets the gcoShippingTotal value for this TransactionSearchBasic.
     * 
     * @return gcoShippingTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGcoShippingTotal() {
        return gcoShippingTotal;
    }


    /**
     * Sets the gcoShippingTotal value for this TransactionSearchBasic.
     * 
     * @param gcoShippingTotal
     */
    public void setGcoShippingTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField gcoShippingTotal) {
        this.gcoShippingTotal = gcoShippingTotal;
    }


    /**
     * Gets the gcoStateChangedDetail value for this TransactionSearchBasic.
     * 
     * @return gcoStateChangedDetail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGcoStateChangedDetail() {
        return gcoStateChangedDetail;
    }


    /**
     * Sets the gcoStateChangedDetail value for this TransactionSearchBasic.
     * 
     * @param gcoStateChangedDetail
     */
    public void setGcoStateChangedDetail(com.netsuite.webservices.platform.core_2019_1.SearchStringField gcoStateChangedDetail) {
        this.gcoStateChangedDetail = gcoStateChangedDetail;
    }


    /**
     * Gets the giftCertificate value for this TransactionSearchBasic.
     * 
     * @return giftCertificate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getGiftCertificate() {
        return giftCertificate;
    }


    /**
     * Sets the giftCertificate value for this TransactionSearchBasic.
     * 
     * @param giftCertificate
     */
    public void setGiftCertificate(com.netsuite.webservices.platform.core_2019_1.SearchStringField giftCertificate) {
        this.giftCertificate = giftCertificate;
    }


    /**
     * Gets the grossAmount value for this TransactionSearchBasic.
     * 
     * @return grossAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this TransactionSearchBasic.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the includeInForecast value for this TransactionSearchBasic.
     * 
     * @return includeInForecast
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIncludeInForecast() {
        return includeInForecast;
    }


    /**
     * Sets the includeInForecast value for this TransactionSearchBasic.
     * 
     * @param includeInForecast
     */
    public void setIncludeInForecast(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField includeInForecast) {
        this.includeInForecast = includeInForecast;
    }


    /**
     * Gets the incoterm value for this TransactionSearchBasic.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this TransactionSearchBasic.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField incoterm) {
        this.incoterm = incoterm;
    }


    /**
     * Gets the intercoStatus value for this TransactionSearchBasic.
     * 
     * @return intercoStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getIntercoStatus() {
        return intercoStatus;
    }


    /**
     * Sets the intercoStatus value for this TransactionSearchBasic.
     * 
     * @param intercoStatus
     */
    public void setIntercoStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField intercoStatus) {
        this.intercoStatus = intercoStatus;
    }


    /**
     * Gets the intercoTransaction value for this TransactionSearchBasic.
     * 
     * @return intercoTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getIntercoTransaction() {
        return intercoTransaction;
    }


    /**
     * Sets the intercoTransaction value for this TransactionSearchBasic.
     * 
     * @param intercoTransaction
     */
    public void setIntercoTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }


    /**
     * Gets the internalId value for this TransactionSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TransactionSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TransactionSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TransactionSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the inventoryLocation value for this TransactionSearchBasic.
     * 
     * @return inventoryLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this TransactionSearchBasic.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }


    /**
     * Gets the inventorySubsidiary value for this TransactionSearchBasic.
     * 
     * @return inventorySubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInventorySubsidiary() {
        return inventorySubsidiary;
    }


    /**
     * Sets the inventorySubsidiary value for this TransactionSearchBasic.
     * 
     * @param inventorySubsidiary
     */
    public void setInventorySubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField inventorySubsidiary) {
        this.inventorySubsidiary = inventorySubsidiary;
    }


    /**
     * Gets the inVsoeBundle value for this TransactionSearchBasic.
     * 
     * @return inVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getInVsoeBundle() {
        return inVsoeBundle;
    }


    /**
     * Sets the inVsoeBundle value for this TransactionSearchBasic.
     * 
     * @param inVsoeBundle
     */
    public void setInVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField inVsoeBundle) {
        this.inVsoeBundle = inVsoeBundle;
    }


    /**
     * Gets the isAllocation value for this TransactionSearchBasic.
     * 
     * @return isAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsAllocation() {
        return isAllocation;
    }


    /**
     * Sets the isAllocation value for this TransactionSearchBasic.
     * 
     * @param isAllocation
     */
    public void setIsAllocation(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isAllocation) {
        this.isAllocation = isAllocation;
    }


    /**
     * Gets the isBackflush value for this TransactionSearchBasic.
     * 
     * @return isBackflush
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsBackflush() {
        return isBackflush;
    }


    /**
     * Sets the isBackflush value for this TransactionSearchBasic.
     * 
     * @param isBackflush
     */
    public void setIsBackflush(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBackflush) {
        this.isBackflush = isBackflush;
    }


    /**
     * Gets the isGcoChargeback value for this TransactionSearchBasic.
     * 
     * @return isGcoChargeback
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsGcoChargeback() {
        return isGcoChargeback;
    }


    /**
     * Sets the isGcoChargeback value for this TransactionSearchBasic.
     * 
     * @param isGcoChargeback
     */
    public void setIsGcoChargeback(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoChargeback) {
        this.isGcoChargeback = isGcoChargeback;
    }


    /**
     * Gets the isGcoChargeConfirmed value for this TransactionSearchBasic.
     * 
     * @return isGcoChargeConfirmed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsGcoChargeConfirmed() {
        return isGcoChargeConfirmed;
    }


    /**
     * Sets the isGcoChargeConfirmed value for this TransactionSearchBasic.
     * 
     * @param isGcoChargeConfirmed
     */
    public void setIsGcoChargeConfirmed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoChargeConfirmed) {
        this.isGcoChargeConfirmed = isGcoChargeConfirmed;
    }


    /**
     * Gets the isGcoPaymentGuaranteed value for this TransactionSearchBasic.
     * 
     * @return isGcoPaymentGuaranteed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsGcoPaymentGuaranteed() {
        return isGcoPaymentGuaranteed;
    }


    /**
     * Sets the isGcoPaymentGuaranteed value for this TransactionSearchBasic.
     * 
     * @param isGcoPaymentGuaranteed
     */
    public void setIsGcoPaymentGuaranteed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoPaymentGuaranteed) {
        this.isGcoPaymentGuaranteed = isGcoPaymentGuaranteed;
    }


    /**
     * Gets the isGcoRefundConfirmed value for this TransactionSearchBasic.
     * 
     * @return isGcoRefundConfirmed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsGcoRefundConfirmed() {
        return isGcoRefundConfirmed;
    }


    /**
     * Sets the isGcoRefundConfirmed value for this TransactionSearchBasic.
     * 
     * @param isGcoRefundConfirmed
     */
    public void setIsGcoRefundConfirmed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isGcoRefundConfirmed) {
        this.isGcoRefundConfirmed = isGcoRefundConfirmed;
    }


    /**
     * Gets the isInsideDelivery value for this TransactionSearchBasic.
     * 
     * @return isInsideDelivery
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInsideDelivery() {
        return isInsideDelivery;
    }


    /**
     * Sets the isInsideDelivery value for this TransactionSearchBasic.
     * 
     * @param isInsideDelivery
     */
    public void setIsInsideDelivery(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInsideDelivery) {
        this.isInsideDelivery = isInsideDelivery;
    }


    /**
     * Gets the isInsidePickup value for this TransactionSearchBasic.
     * 
     * @return isInsidePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInsidePickup() {
        return isInsidePickup;
    }


    /**
     * Sets the isInsidePickup value for this TransactionSearchBasic.
     * 
     * @param isInsidePickup
     */
    public void setIsInsidePickup(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInsidePickup) {
        this.isInsidePickup = isInsidePickup;
    }


    /**
     * Gets the isIntercompanyAdjustment value for this TransactionSearchBasic.
     * 
     * @return isIntercompanyAdjustment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsIntercompanyAdjustment() {
        return isIntercompanyAdjustment;
    }


    /**
     * Sets the isIntercompanyAdjustment value for this TransactionSearchBasic.
     * 
     * @param isIntercompanyAdjustment
     */
    public void setIsIntercompanyAdjustment(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isIntercompanyAdjustment) {
        this.isIntercompanyAdjustment = isIntercompanyAdjustment;
    }


    /**
     * Gets the isInTransitPayment value for this TransactionSearchBasic.
     * 
     * @return isInTransitPayment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInTransitPayment() {
        return isInTransitPayment;
    }


    /**
     * Sets the isInTransitPayment value for this TransactionSearchBasic.
     * 
     * @param isInTransitPayment
     */
    public void setIsInTransitPayment(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInTransitPayment) {
        this.isInTransitPayment = isInTransitPayment;
    }


    /**
     * Gets the isMultiShipTo value for this TransactionSearchBasic.
     * 
     * @return isMultiShipTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsMultiShipTo() {
        return isMultiShipTo;
    }


    /**
     * Sets the isMultiShipTo value for this TransactionSearchBasic.
     * 
     * @param isMultiShipTo
     */
    public void setIsMultiShipTo(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }


    /**
     * Gets the isPayPalMeth value for this TransactionSearchBasic.
     * 
     * @return isPayPalMeth
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPayPalMeth() {
        return isPayPalMeth;
    }


    /**
     * Sets the isPayPalMeth value for this TransactionSearchBasic.
     * 
     * @param isPayPalMeth
     */
    public void setIsPayPalMeth(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPayPalMeth) {
        this.isPayPalMeth = isPayPalMeth;
    }


    /**
     * Gets the isReversal value for this TransactionSearchBasic.
     * 
     * @return isReversal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsReversal() {
        return isReversal;
    }


    /**
     * Sets the isReversal value for this TransactionSearchBasic.
     * 
     * @param isReversal
     */
    public void setIsReversal(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReversal) {
        this.isReversal = isReversal;
    }


    /**
     * Gets the isRevRecTransaction value for this TransactionSearchBasic.
     * 
     * @return isRevRecTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsRevRecTransaction() {
        return isRevRecTransaction;
    }


    /**
     * Sets the isRevRecTransaction value for this TransactionSearchBasic.
     * 
     * @param isRevRecTransaction
     */
    public void setIsRevRecTransaction(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isRevRecTransaction) {
        this.isRevRecTransaction = isRevRecTransaction;
    }


    /**
     * Gets the isScrap value for this TransactionSearchBasic.
     * 
     * @return isScrap
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsScrap() {
        return isScrap;
    }


    /**
     * Sets the isScrap value for this TransactionSearchBasic.
     * 
     * @param isScrap
     */
    public void setIsScrap(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isScrap) {
        this.isScrap = isScrap;
    }


    /**
     * Gets the isShipAddress value for this TransactionSearchBasic.
     * 
     * @return isShipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this TransactionSearchBasic.
     * 
     * @param isShipAddress
     */
    public void setIsShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShipAddress) {
        this.isShipAddress = isShipAddress;
    }


    /**
     * Gets the isTransferPriceCosting value for this TransactionSearchBasic.
     * 
     * @return isTransferPriceCosting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsTransferPriceCosting() {
        return isTransferPriceCosting;
    }


    /**
     * Sets the isTransferPriceCosting value for this TransactionSearchBasic.
     * 
     * @param isTransferPriceCosting
     */
    public void setIsTransferPriceCosting(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isTransferPriceCosting) {
        this.isTransferPriceCosting = isTransferPriceCosting;
    }


    /**
     * Gets the isVsoeAlloc value for this TransactionSearchBasic.
     * 
     * @return isVsoeAlloc
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsVsoeAlloc() {
        return isVsoeAlloc;
    }


    /**
     * Sets the isVsoeAlloc value for this TransactionSearchBasic.
     * 
     * @param isVsoeAlloc
     */
    public void setIsVsoeAlloc(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isVsoeAlloc) {
        this.isVsoeAlloc = isVsoeAlloc;
    }


    /**
     * Gets the isWip value for this TransactionSearchBasic.
     * 
     * @return isWip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsWip() {
        return isWip;
    }


    /**
     * Sets the isWip value for this TransactionSearchBasic.
     * 
     * @param isWip
     */
    public void setIsWip(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isWip) {
        this.isWip = isWip;
    }


    /**
     * Gets the item value for this TransactionSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransactionSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the itemFulfillmentChoice value for this TransactionSearchBasic.
     * 
     * @return itemFulfillmentChoice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getItemFulfillmentChoice() {
        return itemFulfillmentChoice;
    }


    /**
     * Sets the itemFulfillmentChoice value for this TransactionSearchBasic.
     * 
     * @param itemFulfillmentChoice
     */
    public void setItemFulfillmentChoice(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField itemFulfillmentChoice) {
        this.itemFulfillmentChoice = itemFulfillmentChoice;
    }


    /**
     * Gets the itemRevision value for this TransactionSearchBasic.
     * 
     * @return itemRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemRevision() {
        return itemRevision;
    }


    /**
     * Sets the itemRevision value for this TransactionSearchBasic.
     * 
     * @param itemRevision
     */
    public void setItemRevision(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemRevision) {
        this.itemRevision = itemRevision;
    }


    /**
     * Gets the itemSubOf value for this TransactionSearchBasic.
     * 
     * @return itemSubOf
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemSubOf() {
        return itemSubOf;
    }


    /**
     * Sets the itemSubOf value for this TransactionSearchBasic.
     * 
     * @param itemSubOf
     */
    public void setItemSubOf(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemSubOf) {
        this.itemSubOf = itemSubOf;
    }


    /**
     * Gets the landedCostPerLine value for this TransactionSearchBasic.
     * 
     * @return landedCostPerLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getLandedCostPerLine() {
        return landedCostPerLine;
    }


    /**
     * Sets the landedCostPerLine value for this TransactionSearchBasic.
     * 
     * @param landedCostPerLine
     */
    public void setLandedCostPerLine(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }


    /**
     * Gets the lastModifiedDate value for this TransactionSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TransactionSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this TransactionSearchBasic.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this TransactionSearchBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the lineUniqueKey value for this TransactionSearchBasic.
     * 
     * @return lineUniqueKey
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getLineUniqueKey() {
        return lineUniqueKey;
    }


    /**
     * Sets the lineUniqueKey value for this TransactionSearchBasic.
     * 
     * @param lineUniqueKey
     */
    public void setLineUniqueKey(com.netsuite.webservices.platform.core_2019_1.SearchLongField lineUniqueKey) {
        this.lineUniqueKey = lineUniqueKey;
    }


    /**
     * Gets the location value for this TransactionSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TransactionSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the locationAutoAssigned value for this TransactionSearchBasic.
     * 
     * @return locationAutoAssigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getLocationAutoAssigned() {
        return locationAutoAssigned;
    }


    /**
     * Sets the locationAutoAssigned value for this TransactionSearchBasic.
     * 
     * @param locationAutoAssigned
     */
    public void setLocationAutoAssigned(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField locationAutoAssigned) {
        this.locationAutoAssigned = locationAutoAssigned;
    }


    /**
     * Gets the mainLine value for this TransactionSearchBasic.
     * 
     * @return mainLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMainLine() {
        return mainLine;
    }


    /**
     * Sets the mainLine value for this TransactionSearchBasic.
     * 
     * @param mainLine
     */
    public void setMainLine(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField mainLine) {
        this.mainLine = mainLine;
    }


    /**
     * Gets the mainName value for this TransactionSearchBasic.
     * 
     * @return mainName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getMainName() {
        return mainName;
    }


    /**
     * Sets the mainName value for this TransactionSearchBasic.
     * 
     * @param mainName
     */
    public void setMainName(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField mainName) {
        this.mainName = mainName;
    }


    /**
     * Gets the manufacturingRouting value for this TransactionSearchBasic.
     * 
     * @return manufacturingRouting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getManufacturingRouting() {
        return manufacturingRouting;
    }


    /**
     * Sets the manufacturingRouting value for this TransactionSearchBasic.
     * 
     * @param manufacturingRouting
     */
    public void setManufacturingRouting(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField manufacturingRouting) {
        this.manufacturingRouting = manufacturingRouting;
    }


    /**
     * Gets the matchBillToReceipt value for this TransactionSearchBasic.
     * 
     * @return matchBillToReceipt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this TransactionSearchBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }


    /**
     * Gets the memo value for this TransactionSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TransactionSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the memoMain value for this TransactionSearchBasic.
     * 
     * @return memoMain
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMemoMain() {
        return memoMain;
    }


    /**
     * Sets the memoMain value for this TransactionSearchBasic.
     * 
     * @param memoMain
     */
    public void setMemoMain(com.netsuite.webservices.platform.core_2019_1.SearchStringField memoMain) {
        this.memoMain = memoMain;
    }


    /**
     * Gets the memorized value for this TransactionSearchBasic.
     * 
     * @return memorized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMemorized() {
        return memorized;
    }


    /**
     * Sets the memorized value for this TransactionSearchBasic.
     * 
     * @param memorized
     */
    public void setMemorized(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField memorized) {
        this.memorized = memorized;
    }


    /**
     * Gets the merchantAccount value for this TransactionSearchBasic.
     * 
     * @return merchantAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this TransactionSearchBasic.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(com.netsuite.webservices.platform.core_2019_1.SearchStringField merchantAccount) {
        this.merchantAccount = merchantAccount;
    }


    /**
     * Gets the message value for this TransactionSearchBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TransactionSearchBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the multiSubsidiary value for this TransactionSearchBasic.
     * 
     * @return multiSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getMultiSubsidiary() {
        return multiSubsidiary;
    }


    /**
     * Sets the multiSubsidiary value for this TransactionSearchBasic.
     * 
     * @param multiSubsidiary
     */
    public void setMultiSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }


    /**
     * Gets the nameText value for this TransactionSearchBasic.
     * 
     * @return nameText
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getNameText() {
        return nameText;
    }


    /**
     * Sets the nameText value for this TransactionSearchBasic.
     * 
     * @param nameText
     */
    public void setNameText(com.netsuite.webservices.platform.core_2019_1.SearchStringField nameText) {
        this.nameText = nameText;
    }


    /**
     * Gets the netAmount value for this TransactionSearchBasic.
     * 
     * @return netAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this TransactionSearchBasic.
     * 
     * @param netAmount
     */
    public void setNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the nextApprover value for this TransactionSearchBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this TransactionSearchBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the nextBillDate value for this TransactionSearchBasic.
     * 
     * @return nextBillDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this TransactionSearchBasic.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField nextBillDate) {
        this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the noAutoAssignLocation value for this TransactionSearchBasic.
     * 
     * @return noAutoAssignLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getNoAutoAssignLocation() {
        return noAutoAssignLocation;
    }


    /**
     * Sets the noAutoAssignLocation value for this TransactionSearchBasic.
     * 
     * @param noAutoAssignLocation
     */
    public void setNoAutoAssignLocation(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField noAutoAssignLocation) {
        this.noAutoAssignLocation = noAutoAssignLocation;
    }


    /**
     * Gets the nonReimbursable value for this TransactionSearchBasic.
     * 
     * @return nonReimbursable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getNonReimbursable() {
        return nonReimbursable;
    }


    /**
     * Sets the nonReimbursable value for this TransactionSearchBasic.
     * 
     * @param nonReimbursable
     */
    public void setNonReimbursable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField nonReimbursable) {
        this.nonReimbursable = nonReimbursable;
    }


    /**
     * Gets the number value for this TransactionSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TransactionSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the oneTimeTotal value for this TransactionSearchBasic.
     * 
     * @return oneTimeTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOneTimeTotal() {
        return oneTimeTotal;
    }


    /**
     * Sets the oneTimeTotal value for this TransactionSearchBasic.
     * 
     * @param oneTimeTotal
     */
    public void setOneTimeTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField oneTimeTotal) {
        this.oneTimeTotal = oneTimeTotal;
    }


    /**
     * Gets the opportunity value for this TransactionSearchBasic.
     * 
     * @return opportunity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this TransactionSearchBasic.
     * 
     * @param opportunity
     */
    public void setOpportunity(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the orderPriority value for this TransactionSearchBasic.
     * 
     * @return orderPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOrderPriority() {
        return orderPriority;
    }


    /**
     * Sets the orderPriority value for this TransactionSearchBasic.
     * 
     * @param orderPriority
     */
    public void setOrderPriority(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField orderPriority) {
        this.orderPriority = orderPriority;
    }


    /**
     * Gets the otherRefNum value for this TransactionSearchBasic.
     * 
     * @return otherRefNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchTextNumberField getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this TransactionSearchBasic.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(com.netsuite.webservices.platform.core_2019_1.SearchTextNumberField otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the otherRefNumNonDeposit value for this TransactionSearchBasic.
     * 
     * @return otherRefNumNonDeposit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchTextNumberField getOtherRefNumNonDeposit() {
        return otherRefNumNonDeposit;
    }


    /**
     * Sets the otherRefNumNonDeposit value for this TransactionSearchBasic.
     * 
     * @param otherRefNumNonDeposit
     */
    public void setOtherRefNumNonDeposit(com.netsuite.webservices.platform.core_2019_1.SearchTextNumberField otherRefNumNonDeposit) {
        this.otherRefNumNonDeposit = otherRefNumNonDeposit;
    }


    /**
     * Gets the overheadParentItem value for this TransactionSearchBasic.
     * 
     * @return overheadParentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getOverheadParentItem() {
        return overheadParentItem;
    }


    /**
     * Sets the overheadParentItem value for this TransactionSearchBasic.
     * 
     * @param overheadParentItem
     */
    public void setOverheadParentItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField overheadParentItem) {
        this.overheadParentItem = overheadParentItem;
    }


    /**
     * Gets the packageCount value for this TransactionSearchBasic.
     * 
     * @return packageCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this TransactionSearchBasic.
     * 
     * @param packageCount
     */
    public void setPackageCount(com.netsuite.webservices.platform.core_2019_1.SearchLongField packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the paidTransaction value for this TransactionSearchBasic.
     * 
     * @return paidTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPaidTransaction() {
        return paidTransaction;
    }


    /**
     * Sets the paidTransaction value for this TransactionSearchBasic.
     * 
     * @param paidTransaction
     */
    public void setPaidTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField paidTransaction) {
        this.paidTransaction = paidTransaction;
    }


    /**
     * Gets the parent value for this TransactionSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this TransactionSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchLongField parent) {
        this.parent = parent;
    }


    /**
     * Gets the partner value for this TransactionSearchBasic.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this TransactionSearchBasic.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner) {
        this.partner = partner;
    }


    /**
     * Gets the partnerContribution value for this TransactionSearchBasic.
     * 
     * @return partnerContribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this TransactionSearchBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }


    /**
     * Gets the partnerRole value for this TransactionSearchBasic.
     * 
     * @return partnerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this TransactionSearchBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }


    /**
     * Gets the partnerTeamMember value for this TransactionSearchBasic.
     * 
     * @return partnerTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this TransactionSearchBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }


    /**
     * Gets the payingTransaction value for this TransactionSearchBasic.
     * 
     * @return payingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPayingTransaction() {
        return payingTransaction;
    }


    /**
     * Sets the payingTransaction value for this TransactionSearchBasic.
     * 
     * @param payingTransaction
     */
    public void setPayingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField payingTransaction) {
        this.payingTransaction = payingTransaction;
    }


    /**
     * Gets the paymentApproved value for this TransactionSearchBasic.
     * 
     * @return paymentApproved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaymentApproved() {
        return paymentApproved;
    }


    /**
     * Sets the paymentApproved value for this TransactionSearchBasic.
     * 
     * @param paymentApproved
     */
    public void setPaymentApproved(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentApproved) {
        this.paymentApproved = paymentApproved;
    }


    /**
     * Gets the paymentEventDate value for this TransactionSearchBasic.
     * 
     * @return paymentEventDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getPaymentEventDate() {
        return paymentEventDate;
    }


    /**
     * Sets the paymentEventDate value for this TransactionSearchBasic.
     * 
     * @param paymentEventDate
     */
    public void setPaymentEventDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }


    /**
     * Gets the paymentEventHoldReason value for this TransactionSearchBasic.
     * 
     * @return paymentEventHoldReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }


    /**
     * Sets the paymentEventHoldReason value for this TransactionSearchBasic.
     * 
     * @param paymentEventHoldReason
     */
    public void setPaymentEventHoldReason(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }


    /**
     * Gets the paymentEventPurchaseCardUsed value for this TransactionSearchBasic.
     * 
     * @return paymentEventPurchaseCardUsed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaymentEventPurchaseCardUsed() {
        return paymentEventPurchaseCardUsed;
    }


    /**
     * Sets the paymentEventPurchaseCardUsed value for this TransactionSearchBasic.
     * 
     * @param paymentEventPurchaseCardUsed
     */
    public void setPaymentEventPurchaseCardUsed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentEventPurchaseCardUsed) {
        this.paymentEventPurchaseCardUsed = paymentEventPurchaseCardUsed;
    }


    /**
     * Gets the paymentEventPurchaseDataSent value for this TransactionSearchBasic.
     * 
     * @return paymentEventPurchaseDataSent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaymentEventPurchaseDataSent() {
        return paymentEventPurchaseDataSent;
    }


    /**
     * Sets the paymentEventPurchaseDataSent value for this TransactionSearchBasic.
     * 
     * @param paymentEventPurchaseDataSent
     */
    public void setPaymentEventPurchaseDataSent(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentEventPurchaseDataSent) {
        this.paymentEventPurchaseDataSent = paymentEventPurchaseDataSent;
    }


    /**
     * Gets the paymentEventResult value for this TransactionSearchBasic.
     * 
     * @return paymentEventResult
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPaymentEventResult() {
        return paymentEventResult;
    }


    /**
     * Sets the paymentEventResult value for this TransactionSearchBasic.
     * 
     * @param paymentEventResult
     */
    public void setPaymentEventResult(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }


    /**
     * Gets the paymentEventType value for this TransactionSearchBasic.
     * 
     * @return paymentEventType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPaymentEventType() {
        return paymentEventType;
    }


    /**
     * Sets the paymentEventType value for this TransactionSearchBasic.
     * 
     * @param paymentEventType
     */
    public void setPaymentEventType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField paymentEventType) {
        this.paymentEventType = paymentEventType;
    }


    /**
     * Gets the paymentHold value for this TransactionSearchBasic.
     * 
     * @return paymentHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPaymentHold() {
        return paymentHold;
    }


    /**
     * Sets the paymentHold value for this TransactionSearchBasic.
     * 
     * @param paymentHold
     */
    public void setPaymentHold(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField paymentHold) {
        this.paymentHold = paymentHold;
    }


    /**
     * Gets the paymentMethod value for this TransactionSearchBasic.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TransactionSearchBasic.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the paymentOption value for this TransactionSearchBasic.
     * 
     * @return paymentOption
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPaymentOption() {
        return paymentOption;
    }


    /**
     * Sets the paymentOption value for this TransactionSearchBasic.
     * 
     * @param paymentOption
     */
    public void setPaymentOption(com.netsuite.webservices.platform.core_2019_1.SearchStringField paymentOption) {
        this.paymentOption = paymentOption;
    }


    /**
     * Gets the payPalPending value for this TransactionSearchBasic.
     * 
     * @return payPalPending
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPayPalPending() {
        return payPalPending;
    }


    /**
     * Sets the payPalPending value for this TransactionSearchBasic.
     * 
     * @param payPalPending
     */
    public void setPayPalPending(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField payPalPending) {
        this.payPalPending = payPalPending;
    }


    /**
     * Gets the payPalStatus value for this TransactionSearchBasic.
     * 
     * @return payPalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPayPalStatus() {
        return payPalStatus;
    }


    /**
     * Sets the payPalStatus value for this TransactionSearchBasic.
     * 
     * @param payPalStatus
     */
    public void setPayPalStatus(com.netsuite.webservices.platform.core_2019_1.SearchStringField payPalStatus) {
        this.payPalStatus = payPalStatus;
    }


    /**
     * Gets the payPalTranId value for this TransactionSearchBasic.
     * 
     * @return payPalTranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPayPalTranId() {
        return payPalTranId;
    }


    /**
     * Sets the payPalTranId value for this TransactionSearchBasic.
     * 
     * @param payPalTranId
     */
    public void setPayPalTranId(com.netsuite.webservices.platform.core_2019_1.SearchStringField payPalTranId) {
        this.payPalTranId = payPalTranId;
    }


    /**
     * Gets the pnRefNum value for this TransactionSearchBasic.
     * 
     * @return pnRefNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this TransactionSearchBasic.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(com.netsuite.webservices.platform.core_2019_1.SearchStringField pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the poAsText value for this TransactionSearchBasic.
     * 
     * @return poAsText
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPoAsText() {
        return poAsText;
    }


    /**
     * Sets the poAsText value for this TransactionSearchBasic.
     * 
     * @param poAsText
     */
    public void setPoAsText(com.netsuite.webservices.platform.core_2019_1.SearchStringField poAsText) {
        this.poAsText = poAsText;
    }


    /**
     * Gets the posting value for this TransactionSearchBasic.
     * 
     * @return posting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPosting() {
        return posting;
    }


    /**
     * Sets the posting value for this TransactionSearchBasic.
     * 
     * @param posting
     */
    public void setPosting(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField posting) {
        this.posting = posting;
    }


    /**
     * Gets the postingPeriod value for this TransactionSearchBasic.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this TransactionSearchBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the postingPeriodRelative value for this TransactionSearchBasic.
     * 
     * @return postingPeriodRelative
     */
    public com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }


    /**
     * Sets the postingPeriodRelative value for this TransactionSearchBasic.
     * 
     * @param postingPeriodRelative
     */
    public void setPostingPeriodRelative(com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }


    /**
     * Gets the priceLevel value for this TransactionSearchBasic.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this TransactionSearchBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the printedPickingTicket value for this TransactionSearchBasic.
     * 
     * @return printedPickingTicket
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPrintedPickingTicket() {
        return printedPickingTicket;
    }


    /**
     * Sets the printedPickingTicket value for this TransactionSearchBasic.
     * 
     * @param printedPickingTicket
     */
    public void setPrintedPickingTicket(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printedPickingTicket) {
        this.printedPickingTicket = printedPickingTicket;
    }


    /**
     * Gets the probability value for this TransactionSearchBasic.
     * 
     * @return probability
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this TransactionSearchBasic.
     * 
     * @param probability
     */
    public void setProbability(com.netsuite.webservices.platform.core_2019_1.SearchLongField probability) {
        this.probability = probability;
    }


    /**
     * Gets the projectedAmount value for this TransactionSearchBasic.
     * 
     * @return projectedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getProjectedAmount() {
        return projectedAmount;
    }


    /**
     * Sets the projectedAmount value for this TransactionSearchBasic.
     * 
     * @param projectedAmount
     */
    public void setProjectedAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField projectedAmount) {
        this.projectedAmount = projectedAmount;
    }


    /**
     * Gets the projectTask value for this TransactionSearchBasic.
     * 
     * @return projectTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getProjectTask() {
        return projectTask;
    }


    /**
     * Sets the projectTask value for this TransactionSearchBasic.
     * 
     * @param projectTask
     */
    public void setProjectTask(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField projectTask) {
        this.projectTask = projectTask;
    }


    /**
     * Gets the promoCode value for this TransactionSearchBasic.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this TransactionSearchBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the purchaseOrder value for this TransactionSearchBasic.
     * 
     * @return purchaseOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this TransactionSearchBasic.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }


    /**
     * Gets the quantity value for this TransactionSearchBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TransactionSearchBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quantityBilled value for this TransactionSearchBasic.
     * 
     * @return quantityBilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this TransactionSearchBasic.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityBilled) {
        this.quantityBilled = quantityBilled;
    }


    /**
     * Gets the quantityCommitted value for this TransactionSearchBasic.
     * 
     * @return quantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this TransactionSearchBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityPacked value for this TransactionSearchBasic.
     * 
     * @return quantityPacked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityPacked() {
        return quantityPacked;
    }


    /**
     * Sets the quantityPacked value for this TransactionSearchBasic.
     * 
     * @param quantityPacked
     */
    public void setQuantityPacked(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityPacked) {
        this.quantityPacked = quantityPacked;
    }


    /**
     * Gets the quantityPicked value for this TransactionSearchBasic.
     * 
     * @return quantityPicked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityPicked() {
        return quantityPicked;
    }


    /**
     * Sets the quantityPicked value for this TransactionSearchBasic.
     * 
     * @param quantityPicked
     */
    public void setQuantityPicked(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityPicked) {
        this.quantityPicked = quantityPicked;
    }


    /**
     * Gets the quantityRevCommitted value for this TransactionSearchBasic.
     * 
     * @return quantityRevCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityRevCommitted() {
        return quantityRevCommitted;
    }


    /**
     * Sets the quantityRevCommitted value for this TransactionSearchBasic.
     * 
     * @param quantityRevCommitted
     */
    public void setQuantityRevCommitted(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }


    /**
     * Gets the quantityShipRecv value for this TransactionSearchBasic.
     * 
     * @return quantityShipRecv
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getQuantityShipRecv() {
        return quantityShipRecv;
    }


    /**
     * Sets the quantityShipRecv value for this TransactionSearchBasic.
     * 
     * @param quantityShipRecv
     */
    public void setQuantityShipRecv(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField quantityShipRecv) {
        this.quantityShipRecv = quantityShipRecv;
    }


    /**
     * Gets the recognizedRevenue value for this TransactionSearchBasic.
     * 
     * @return recognizedRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this TransactionSearchBasic.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the recordType value for this TransactionSearchBasic.
     * 
     * @return recordType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this TransactionSearchBasic.
     * 
     * @param recordType
     */
    public void setRecordType(com.netsuite.webservices.platform.core_2019_1.SearchStringField recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recurAnnuallyTotal value for this TransactionSearchBasic.
     * 
     * @return recurAnnuallyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRecurAnnuallyTotal() {
        return recurAnnuallyTotal;
    }


    /**
     * Sets the recurAnnuallyTotal value for this TransactionSearchBasic.
     * 
     * @param recurAnnuallyTotal
     */
    public void setRecurAnnuallyTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurAnnuallyTotal) {
        this.recurAnnuallyTotal = recurAnnuallyTotal;
    }


    /**
     * Gets the recurMonthlyTotal value for this TransactionSearchBasic.
     * 
     * @return recurMonthlyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRecurMonthlyTotal() {
        return recurMonthlyTotal;
    }


    /**
     * Sets the recurMonthlyTotal value for this TransactionSearchBasic.
     * 
     * @param recurMonthlyTotal
     */
    public void setRecurMonthlyTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurMonthlyTotal) {
        this.recurMonthlyTotal = recurMonthlyTotal;
    }


    /**
     * Gets the recurQuarterlyTotal value for this TransactionSearchBasic.
     * 
     * @return recurQuarterlyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRecurQuarterlyTotal() {
        return recurQuarterlyTotal;
    }


    /**
     * Sets the recurQuarterlyTotal value for this TransactionSearchBasic.
     * 
     * @param recurQuarterlyTotal
     */
    public void setRecurQuarterlyTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurQuarterlyTotal) {
        this.recurQuarterlyTotal = recurQuarterlyTotal;
    }


    /**
     * Gets the recurringBill value for this TransactionSearchBasic.
     * 
     * @return recurringBill
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getRecurringBill() {
        return recurringBill;
    }


    /**
     * Sets the recurringBill value for this TransactionSearchBasic.
     * 
     * @param recurringBill
     */
    public void setRecurringBill(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField recurringBill) {
        this.recurringBill = recurringBill;
    }


    /**
     * Gets the recurWeeklyTotal value for this TransactionSearchBasic.
     * 
     * @return recurWeeklyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getRecurWeeklyTotal() {
        return recurWeeklyTotal;
    }


    /**
     * Sets the recurWeeklyTotal value for this TransactionSearchBasic.
     * 
     * @param recurWeeklyTotal
     */
    public void setRecurWeeklyTotal(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField recurWeeklyTotal) {
        this.recurWeeklyTotal = recurWeeklyTotal;
    }


    /**
     * Gets the refNumber value for this TransactionSearchBasic.
     * 
     * @return refNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getRefNumber() {
        return refNumber;
    }


    /**
     * Sets the refNumber value for this TransactionSearchBasic.
     * 
     * @param refNumber
     */
    public void setRefNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField refNumber) {
        this.refNumber = refNumber;
    }


    /**
     * Gets the revCommitStatus value for this TransactionSearchBasic.
     * 
     * @return revCommitStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this TransactionSearchBasic.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }


    /**
     * Gets the revCommittingStatus value for this TransactionSearchBasic.
     * 
     * @return revCommittingStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getRevCommittingStatus() {
        return revCommittingStatus;
    }


    /**
     * Sets the revCommittingStatus value for this TransactionSearchBasic.
     * 
     * @param revCommittingStatus
     */
    public void setRevCommittingStatus(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField revCommittingStatus) {
        this.revCommittingStatus = revCommittingStatus;
    }


    /**
     * Gets the revCommittingTransaction value for this TransactionSearchBasic.
     * 
     * @return revCommittingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRevCommittingTransaction() {
        return revCommittingTransaction;
    }


    /**
     * Sets the revCommittingTransaction value for this TransactionSearchBasic.
     * 
     * @param revCommittingTransaction
     */
    public void setRevCommittingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField revCommittingTransaction) {
        this.revCommittingTransaction = revCommittingTransaction;
    }


    /**
     * Gets the revenueStatus value for this TransactionSearchBasic.
     * 
     * @return revenueStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this TransactionSearchBasic.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the reversalDate value for this TransactionSearchBasic.
     * 
     * @return reversalDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getReversalDate() {
        return reversalDate;
    }


    /**
     * Sets the reversalDate value for this TransactionSearchBasic.
     * 
     * @param reversalDate
     */
    public void setReversalDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField reversalDate) {
        this.reversalDate = reversalDate;
    }


    /**
     * Gets the reversalNumber value for this TransactionSearchBasic.
     * 
     * @return reversalNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getReversalNumber() {
        return reversalNumber;
    }


    /**
     * Sets the reversalNumber value for this TransactionSearchBasic.
     * 
     * @param reversalNumber
     */
    public void setReversalNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField reversalNumber) {
        this.reversalNumber = reversalNumber;
    }


    /**
     * Gets the revRecEndDate value for this TransactionSearchBasic.
     * 
     * @return revRecEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this TransactionSearchBasic.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the revRecOnRevCommitment value for this TransactionSearchBasic.
     * 
     * @return revRecOnRevCommitment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this TransactionSearchBasic.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the revRecStartDate value for this TransactionSearchBasic.
     * 
     * @return revRecStartDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this TransactionSearchBasic.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecTermInMonths value for this TransactionSearchBasic.
     * 
     * @return revRecTermInMonths
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getRevRecTermInMonths() {
        return revRecTermInMonths;
    }


    /**
     * Sets the revRecTermInMonths value for this TransactionSearchBasic.
     * 
     * @param revRecTermInMonths
     */
    public void setRevRecTermInMonths(com.netsuite.webservices.platform.core_2019_1.SearchLongField revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
    }


    /**
     * Gets the salesEffectiveDate value for this TransactionSearchBasic.
     * 
     * @return salesEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this TransactionSearchBasic.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }


    /**
     * Gets the salesOrder value for this TransactionSearchBasic.
     * 
     * @return salesOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesOrder() {
        return salesOrder;
    }


    /**
     * Sets the salesOrder value for this TransactionSearchBasic.
     * 
     * @param salesOrder
     */
    public void setSalesOrder(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesOrder) {
        this.salesOrder = salesOrder;
    }


    /**
     * Gets the salesRep value for this TransactionSearchBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this TransactionSearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesTeamMember value for this TransactionSearchBasic.
     * 
     * @return salesTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this TransactionSearchBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }


    /**
     * Gets the salesTeamRole value for this TransactionSearchBasic.
     * 
     * @return salesTeamRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this TransactionSearchBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }


    /**
     * Gets the schedulingMethod value for this TransactionSearchBasic.
     * 
     * @return schedulingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSchedulingMethod() {
        return schedulingMethod;
    }


    /**
     * Sets the schedulingMethod value for this TransactionSearchBasic.
     * 
     * @param schedulingMethod
     */
    public void setSchedulingMethod(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }


    /**
     * Gets the serialNumber value for this TransactionSearchBasic.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this TransactionSearchBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the serialNumberCost value for this TransactionSearchBasic.
     * 
     * @return serialNumberCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getSerialNumberCost() {
        return serialNumberCost;
    }


    /**
     * Sets the serialNumberCost value for this TransactionSearchBasic.
     * 
     * @param serialNumberCost
     */
    public void setSerialNumberCost(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField serialNumberCost) {
        this.serialNumberCost = serialNumberCost;
    }


    /**
     * Gets the serialNumberCostAdjustment value for this TransactionSearchBasic.
     * 
     * @return serialNumberCostAdjustment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getSerialNumberCostAdjustment() {
        return serialNumberCostAdjustment;
    }


    /**
     * Sets the serialNumberCostAdjustment value for this TransactionSearchBasic.
     * 
     * @param serialNumberCostAdjustment
     */
    public void setSerialNumberCostAdjustment(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField serialNumberCostAdjustment) {
        this.serialNumberCostAdjustment = serialNumberCostAdjustment;
    }


    /**
     * Gets the serialNumberQuantity value for this TransactionSearchBasic.
     * 
     * @return serialNumberQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getSerialNumberQuantity() {
        return serialNumberQuantity;
    }


    /**
     * Sets the serialNumberQuantity value for this TransactionSearchBasic.
     * 
     * @param serialNumberQuantity
     */
    public void setSerialNumberQuantity(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField serialNumberQuantity) {
        this.serialNumberQuantity = serialNumberQuantity;
    }


    /**
     * Gets the serialNumbers value for this TransactionSearchBasic.
     * 
     * @return serialNumbers
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this TransactionSearchBasic.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(com.netsuite.webservices.platform.core_2019_1.SearchStringField serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the shipAddress value for this TransactionSearchBasic.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this TransactionSearchBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipAddressee value for this TransactionSearchBasic.
     * 
     * @return shipAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this TransactionSearchBasic.
     * 
     * @param shipAddressee
     */
    public void setShipAddressee(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddressee) {
        this.shipAddressee = shipAddressee;
    }


    /**
     * Gets the shipAttention value for this TransactionSearchBasic.
     * 
     * @return shipAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this TransactionSearchBasic.
     * 
     * @param shipAttention
     */
    public void setShipAttention(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAttention) {
        this.shipAttention = shipAttention;
    }


    /**
     * Gets the shipCarrier value for this TransactionSearchBasic.
     * 
     * @return shipCarrier
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getShipCarrier() {
        return shipCarrier;
    }


    /**
     * Sets the shipCarrier value for this TransactionSearchBasic.
     * 
     * @param shipCarrier
     */
    public void setShipCarrier(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField shipCarrier) {
        this.shipCarrier = shipCarrier;
    }


    /**
     * Gets the shipCity value for this TransactionSearchBasic.
     * 
     * @return shipCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this TransactionSearchBasic.
     * 
     * @param shipCity
     */
    public void setShipCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipCity) {
        this.shipCity = shipCity;
    }


    /**
     * Gets the shipComplete value for this TransactionSearchBasic.
     * 
     * @return shipComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this TransactionSearchBasic.
     * 
     * @param shipComplete
     */
    public void setShipComplete(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the shipCountry value for this TransactionSearchBasic.
     * 
     * @return shipCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this TransactionSearchBasic.
     * 
     * @param shipCountry
     */
    public void setShipCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField shipCountry) {
        this.shipCountry = shipCountry;
    }


    /**
     * Gets the shipCounty value for this TransactionSearchBasic.
     * 
     * @return shipCounty
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipCounty() {
        return shipCounty;
    }


    /**
     * Sets the shipCounty value for this TransactionSearchBasic.
     * 
     * @param shipCounty
     */
    public void setShipCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipCounty) {
        this.shipCounty = shipCounty;
    }


    /**
     * Gets the shipDate value for this TransactionSearchBasic.
     * 
     * @return shipDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this TransactionSearchBasic.
     * 
     * @param shipDate
     */
    public void setShipDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipGroup value for this TransactionSearchBasic.
     * 
     * @return shipGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this TransactionSearchBasic.
     * 
     * @param shipGroup
     */
    public void setShipGroup(com.netsuite.webservices.platform.core_2019_1.SearchLongField shipGroup) {
        this.shipGroup = shipGroup;
    }


    /**
     * Gets the shipMethod value for this TransactionSearchBasic.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this TransactionSearchBasic.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the shipPhone value for this TransactionSearchBasic.
     * 
     * @return shipPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this TransactionSearchBasic.
     * 
     * @param shipPhone
     */
    public void setShipPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipPhone) {
        this.shipPhone = shipPhone;
    }


    /**
     * Gets the shipping value for this TransactionSearchBasic.
     * 
     * @return shipping
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this TransactionSearchBasic.
     * 
     * @param shipping
     */
    public void setShipping(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the shipRecvStatus value for this TransactionSearchBasic.
     * 
     * @return shipRecvStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShipRecvStatus() {
        return shipRecvStatus;
    }


    /**
     * Sets the shipRecvStatus value for this TransactionSearchBasic.
     * 
     * @param shipRecvStatus
     */
    public void setShipRecvStatus(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipRecvStatus) {
        this.shipRecvStatus = shipRecvStatus;
    }


    /**
     * Gets the shipRecvStatusLine value for this TransactionSearchBasic.
     * 
     * @return shipRecvStatusLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShipRecvStatusLine() {
        return shipRecvStatusLine;
    }


    /**
     * Sets the shipRecvStatusLine value for this TransactionSearchBasic.
     * 
     * @param shipRecvStatusLine
     */
    public void setShipRecvStatusLine(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipRecvStatusLine) {
        this.shipRecvStatusLine = shipRecvStatusLine;
    }


    /**
     * Gets the shipState value for this TransactionSearchBasic.
     * 
     * @return shipState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this TransactionSearchBasic.
     * 
     * @param shipState
     */
    public void setShipState(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipState) {
        this.shipState = shipState;
    }


    /**
     * Gets the shipTo value for this TransactionSearchBasic.
     * 
     * @return shipTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this TransactionSearchBasic.
     * 
     * @param shipTo
     */
    public void setShipTo(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipZip value for this TransactionSearchBasic.
     * 
     * @return shipZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this TransactionSearchBasic.
     * 
     * @param shipZip
     */
    public void setShipZip(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipZip) {
        this.shipZip = shipZip;
    }


    /**
     * Gets the source value for this TransactionSearchBasic.
     * 
     * @return source
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getSource() {
        return source;
    }


    /**
     * Sets the source value for this TransactionSearchBasic.
     * 
     * @param source
     */
    public void setSource(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField source) {
        this.source = source;
    }


    /**
     * Gets the startDate value for this TransactionSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TransactionSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the statistical value for this TransactionSearchBasic.
     * 
     * @return statistical
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getStatistical() {
        return statistical;
    }


    /**
     * Sets the statistical value for this TransactionSearchBasic.
     * 
     * @param statistical
     */
    public void setStatistical(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField statistical) {
        this.statistical = statistical;
    }


    /**
     * Gets the status value for this TransactionSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subscription value for this TransactionSearchBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this TransactionSearchBasic.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the subscriptionLine value for this TransactionSearchBasic.
     * 
     * @return subscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubscriptionLine() {
        return subscriptionLine;
    }


    /**
     * Sets the subscriptionLine value for this TransactionSearchBasic.
     * 
     * @param subscriptionLine
     */
    public void setSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }


    /**
     * Gets the subsidiary value for this TransactionSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TransactionSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxItem value for this TransactionSearchBasic.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this TransactionSearchBasic.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxLine value for this TransactionSearchBasic.
     * 
     * @return taxLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getTaxLine() {
        return taxLine;
    }


    /**
     * Sets the taxLine value for this TransactionSearchBasic.
     * 
     * @param taxLine
     */
    public void setTaxLine(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField taxLine) {
        this.taxLine = taxLine;
    }


    /**
     * Gets the taxPeriod value for this TransactionSearchBasic.
     * 
     * @return taxPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this TransactionSearchBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef taxPeriod) {
        this.taxPeriod = taxPeriod;
    }


    /**
     * Gets the taxPeriodRelative value for this TransactionSearchBasic.
     * 
     * @return taxPeriodRelative
     */
    public com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate getTaxPeriodRelative() {
        return taxPeriodRelative;
    }


    /**
     * Sets the taxPeriodRelative value for this TransactionSearchBasic.
     * 
     * @param taxPeriodRelative
     */
    public void setTaxPeriodRelative(com.netsuite.webservices.platform.common_2019_1.types.PostingPeriodDate taxPeriodRelative) {
        this.taxPeriodRelative = taxPeriodRelative;
    }


    /**
     * Gets the taxPointDate value for this TransactionSearchBasic.
     * 
     * @return taxPointDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this TransactionSearchBasic.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField taxPointDate) {
        this.taxPointDate = taxPointDate;
    }


    /**
     * Gets the taxRate value for this TransactionSearchBasic.
     * 
     * @return taxRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TransactionSearchBasic.
     * 
     * @param taxRate
     */
    public void setTaxRate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the terms value for this TransactionSearchBasic.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this TransactionSearchBasic.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField terms) {
        this.terms = terms;
    }


    /**
     * Gets the termsOfSale value for this TransactionSearchBasic.
     * 
     * @return termsOfSale
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getTermsOfSale() {
        return termsOfSale;
    }


    /**
     * Sets the termsOfSale value for this TransactionSearchBasic.
     * 
     * @param termsOfSale
     */
    public void setTermsOfSale(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField termsOfSale) {
        this.termsOfSale = termsOfSale;
    }


    /**
     * Gets the title value for this TransactionSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TransactionSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the toBeEmailed value for this TransactionSearchBasic.
     * 
     * @return toBeEmailed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this TransactionSearchBasic.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the toBePrinted value for this TransactionSearchBasic.
     * 
     * @return toBePrinted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this TransactionSearchBasic.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toSubsidiary value for this TransactionSearchBasic.
     * 
     * @return toSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this TransactionSearchBasic.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the totalAmount value for this TransactionSearchBasic.
     * 
     * @return totalAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this TransactionSearchBasic.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the trackingNumbers value for this TransactionSearchBasic.
     * 
     * @return trackingNumbers
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this TransactionSearchBasic.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(com.netsuite.webservices.platform.core_2019_1.SearchStringField trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the tranCostEstimate value for this TransactionSearchBasic.
     * 
     * @return tranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranCostEstimate() {
        return tranCostEstimate;
    }


    /**
     * Sets the tranCostEstimate value for this TransactionSearchBasic.
     * 
     * @param tranCostEstimate
     */
    public void setTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }


    /**
     * Gets the tranDate value for this TransactionSearchBasic.
     * 
     * @return tranDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this TransactionSearchBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @return tranEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }


    /**
     * Gets the tranEstGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @return tranEstGrossProfitPct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }


    /**
     * Sets the tranEstGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @param tranEstGrossProfitPct
     */
    public void setTranEstGrossProfitPct(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }


    /**
     * Gets the tranId value for this TransactionSearchBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TransactionSearchBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2019_1.SearchStringField tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the tranIsVsoeBundle value for this TransactionSearchBasic.
     * 
     * @return tranIsVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this TransactionSearchBasic.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the transactionDiscount value for this TransactionSearchBasic.
     * 
     * @return transactionDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getTransactionDiscount() {
        return transactionDiscount;
    }


    /**
     * Sets the transactionDiscount value for this TransactionSearchBasic.
     * 
     * @param transactionDiscount
     */
    public void setTransactionDiscount(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField transactionDiscount) {
        this.transactionDiscount = transactionDiscount;
    }


    /**
     * Gets the transactionLineType value for this TransactionSearchBasic.
     * 
     * @return transactionLineType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getTransactionLineType() {
        return transactionLineType;
    }


    /**
     * Sets the transactionLineType value for this TransactionSearchBasic.
     * 
     * @param transactionLineType
     */
    public void setTransactionLineType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField transactionLineType) {
        this.transactionLineType = transactionLineType;
    }


    /**
     * Gets the transactionNumber value for this TransactionSearchBasic.
     * 
     * @return transactionNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this TransactionSearchBasic.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField transactionNumber) {
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the transferLocation value for this TransactionSearchBasic.
     * 
     * @return transferLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTransferLocation() {
        return transferLocation;
    }


    /**
     * Sets the transferLocation value for this TransactionSearchBasic.
     * 
     * @param transferLocation
     */
    public void setTransferLocation(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField transferLocation) {
        this.transferLocation = transferLocation;
    }


    /**
     * Gets the transferOrderQuantityCommitted value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTransferOrderQuantityCommitted() {
        return transferOrderQuantityCommitted;
    }


    /**
     * Sets the transferOrderQuantityCommitted value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityCommitted
     */
    public void setTransferOrderQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityCommitted) {
        this.transferOrderQuantityCommitted = transferOrderQuantityCommitted;
    }


    /**
     * Gets the transferOrderQuantityPacked value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityPacked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTransferOrderQuantityPacked() {
        return transferOrderQuantityPacked;
    }


    /**
     * Sets the transferOrderQuantityPacked value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityPacked
     */
    public void setTransferOrderQuantityPacked(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityPacked) {
        this.transferOrderQuantityPacked = transferOrderQuantityPacked;
    }


    /**
     * Gets the transferOrderQuantityPicked value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityPicked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTransferOrderQuantityPicked() {
        return transferOrderQuantityPicked;
    }


    /**
     * Sets the transferOrderQuantityPicked value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityPicked
     */
    public void setTransferOrderQuantityPicked(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityPicked) {
        this.transferOrderQuantityPicked = transferOrderQuantityPicked;
    }


    /**
     * Gets the transferOrderQuantityReceived value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityReceived
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTransferOrderQuantityReceived() {
        return transferOrderQuantityReceived;
    }


    /**
     * Sets the transferOrderQuantityReceived value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityReceived
     */
    public void setTransferOrderQuantityReceived(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityReceived) {
        this.transferOrderQuantityReceived = transferOrderQuantityReceived;
    }


    /**
     * Gets the transferOrderQuantityShipped value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityShipped
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getTransferOrderQuantityShipped() {
        return transferOrderQuantityShipped;
    }


    /**
     * Sets the transferOrderQuantityShipped value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityShipped
     */
    public void setTransferOrderQuantityShipped(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField transferOrderQuantityShipped) {
        this.transferOrderQuantityShipped = transferOrderQuantityShipped;
    }


    /**
     * Gets the type value for this TransactionSearchBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this TransactionSearchBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the unit value for this TransactionSearchBasic.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this TransactionSearchBasic.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unit) {
        this.unit = unit;
    }


    /**
     * Gets the unitCostOverride value for this TransactionSearchBasic.
     * 
     * @return unitCostOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnitCostOverride() {
        return unitCostOverride;
    }


    /**
     * Sets the unitCostOverride value for this TransactionSearchBasic.
     * 
     * @param unitCostOverride
     */
    public void setUnitCostOverride(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unitCostOverride) {
        this.unitCostOverride = unitCostOverride;
    }


    /**
     * Gets the unitsType value for this TransactionSearchBasic.
     * 
     * @return unitsType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this TransactionSearchBasic.
     * 
     * @param unitsType
     */
    public void setUnitsType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the vendType value for this TransactionSearchBasic.
     * 
     * @return vendType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getVendType() {
        return vendType;
    }


    /**
     * Sets the vendType value for this TransactionSearchBasic.
     * 
     * @param vendType
     */
    public void setVendType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField vendType) {
        this.vendType = vendType;
    }


    /**
     * Gets the visibleToCustomer value for this TransactionSearchBasic.
     * 
     * @return visibleToCustomer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getVisibleToCustomer() {
        return visibleToCustomer;
    }


    /**
     * Sets the visibleToCustomer value for this TransactionSearchBasic.
     * 
     * @param visibleToCustomer
     */
    public void setVisibleToCustomer(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }


    /**
     * Gets the voided value for this TransactionSearchBasic.
     * 
     * @return voided
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getVoided() {
        return voided;
    }


    /**
     * Sets the voided value for this TransactionSearchBasic.
     * 
     * @param voided
     */
    public void setVoided(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField voided) {
        this.voided = voided;
    }


    /**
     * Gets the vsoeAllocation value for this TransactionSearchBasic.
     * 
     * @return vsoeAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this TransactionSearchBasic.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the vsoeAmount value for this TransactionSearchBasic.
     * 
     * @return vsoeAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this TransactionSearchBasic.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }


    /**
     * Gets the vsoeDeferral value for this TransactionSearchBasic.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this TransactionSearchBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoeDelivered value for this TransactionSearchBasic.
     * 
     * @return vsoeDelivered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this TransactionSearchBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the vsoePermitDiscount value for this TransactionSearchBasic.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this TransactionSearchBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoePrice value for this TransactionSearchBasic.
     * 
     * @return vsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this TransactionSearchBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the webSite value for this TransactionSearchBasic.
     * 
     * @return webSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this TransactionSearchBasic.
     * 
     * @param webSite
     */
    public void setWebSite(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField webSite) {
        this.webSite = webSite;
    }


    /**
     * Gets the customFieldList value for this TransactionSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TransactionSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchBasic)) return false;
        TransactionSearchBasic other = (TransactionSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.acctCorpCardExp==null && other.getAcctCorpCardExp()==null) || 
             (this.acctCorpCardExp!=null &&
              this.acctCorpCardExp.equals(other.getAcctCorpCardExp()))) &&
            ((this.actualShipDate==null && other.getActualShipDate()==null) || 
             (this.actualShipDate!=null &&
              this.actualShipDate.equals(other.getActualShipDate()))) &&
            ((this.altSalesAmount==null && other.getAltSalesAmount()==null) || 
             (this.altSalesAmount!=null &&
              this.altSalesAmount.equals(other.getAltSalesAmount()))) &&
            ((this.altSalesNetAmount==null && other.getAltSalesNetAmount()==null) || 
             (this.altSalesNetAmount!=null &&
              this.altSalesNetAmount.equals(other.getAltSalesNetAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              this.amountPaid.equals(other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              this.amountRemaining.equals(other.getAmountRemaining()))) &&
            ((this.amountUnbilled==null && other.getAmountUnbilled()==null) || 
             (this.amountUnbilled!=null &&
              this.amountUnbilled.equals(other.getAmountUnbilled()))) &&
            ((this.anyLineItem==null && other.getAnyLineItem()==null) || 
             (this.anyLineItem!=null &&
              this.anyLineItem.equals(other.getAnyLineItem()))) &&
            ((this.appliedToForeignAmount==null && other.getAppliedToForeignAmount()==null) || 
             (this.appliedToForeignAmount!=null &&
              this.appliedToForeignAmount.equals(other.getAppliedToForeignAmount()))) &&
            ((this.appliedToIsFxVariance==null && other.getAppliedToIsFxVariance()==null) || 
             (this.appliedToIsFxVariance!=null &&
              this.appliedToIsFxVariance.equals(other.getAppliedToIsFxVariance()))) &&
            ((this.appliedToLinkAmount==null && other.getAppliedToLinkAmount()==null) || 
             (this.appliedToLinkAmount!=null &&
              this.appliedToLinkAmount.equals(other.getAppliedToLinkAmount()))) &&
            ((this.appliedToLinkType==null && other.getAppliedToLinkType()==null) || 
             (this.appliedToLinkType!=null &&
              this.appliedToLinkType.equals(other.getAppliedToLinkType()))) &&
            ((this.appliedToTransaction==null && other.getAppliedToTransaction()==null) || 
             (this.appliedToTransaction!=null &&
              this.appliedToTransaction.equals(other.getAppliedToTransaction()))) &&
            ((this.applyingForeignAmount==null && other.getApplyingForeignAmount()==null) || 
             (this.applyingForeignAmount!=null &&
              this.applyingForeignAmount.equals(other.getApplyingForeignAmount()))) &&
            ((this.applyingIsFxVariance==null && other.getApplyingIsFxVariance()==null) || 
             (this.applyingIsFxVariance!=null &&
              this.applyingIsFxVariance.equals(other.getApplyingIsFxVariance()))) &&
            ((this.applyingLinkAmount==null && other.getApplyingLinkAmount()==null) || 
             (this.applyingLinkAmount!=null &&
              this.applyingLinkAmount.equals(other.getApplyingLinkAmount()))) &&
            ((this.applyingLinkType==null && other.getApplyingLinkType()==null) || 
             (this.applyingLinkType!=null &&
              this.applyingLinkType.equals(other.getApplyingLinkType()))) &&
            ((this.applyingTransaction==null && other.getApplyingTransaction()==null) || 
             (this.applyingTransaction!=null &&
              this.applyingTransaction.equals(other.getApplyingTransaction()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.autoCalculateLag==null && other.getAutoCalculateLag()==null) || 
             (this.autoCalculateLag!=null &&
              this.autoCalculateLag.equals(other.getAutoCalculateLag()))) &&
            ((this.avsStreetMatch==null && other.getAvsStreetMatch()==null) || 
             (this.avsStreetMatch!=null &&
              this.avsStreetMatch.equals(other.getAvsStreetMatch()))) &&
            ((this.avsZipMatch==null && other.getAvsZipMatch()==null) || 
             (this.avsZipMatch!=null &&
              this.avsZipMatch.equals(other.getAvsZipMatch()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.billAddressee==null && other.getBillAddressee()==null) || 
             (this.billAddressee!=null &&
              this.billAddressee.equals(other.getBillAddressee()))) &&
            ((this.billAttention==null && other.getBillAttention()==null) || 
             (this.billAttention!=null &&
              this.billAttention.equals(other.getBillAttention()))) &&
            ((this.billCity==null && other.getBillCity()==null) || 
             (this.billCity!=null &&
              this.billCity.equals(other.getBillCity()))) &&
            ((this.billCountry==null && other.getBillCountry()==null) || 
             (this.billCountry!=null &&
              this.billCountry.equals(other.getBillCountry()))) &&
            ((this.billCounty==null && other.getBillCounty()==null) || 
             (this.billCounty!=null &&
              this.billCounty.equals(other.getBillCounty()))) &&
            ((this.billedDate==null && other.getBilledDate()==null) || 
             (this.billedDate!=null &&
              this.billedDate.equals(other.getBilledDate()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
            ((this.billingTransaction==null && other.getBillingTransaction()==null) || 
             (this.billingTransaction!=null &&
              this.billingTransaction.equals(other.getBillingTransaction()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              this.billPhone.equals(other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              this.billState.equals(other.getBillState()))) &&
            ((this.billVarianceStatus==null && other.getBillVarianceStatus()==null) || 
             (this.billVarianceStatus!=null &&
              this.billVarianceStatus.equals(other.getBillVarianceStatus()))) &&
            ((this.billZip==null && other.getBillZip()==null) || 
             (this.billZip!=null &&
              this.billZip.equals(other.getBillZip()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.binNumberQuantity==null && other.getBinNumberQuantity()==null) || 
             (this.binNumberQuantity!=null &&
              this.binNumberQuantity.equals(other.getBinNumberQuantity()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              this.bomQuantity.equals(other.getBomQuantity()))) &&
            ((this.bookSpecificTransaction==null && other.getBookSpecificTransaction()==null) || 
             (this.bookSpecificTransaction!=null &&
              this.bookSpecificTransaction.equals(other.getBookSpecificTransaction()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              this.buildEntireAssembly.equals(other.getBuildEntireAssembly()))) &&
            ((this.buildVariance==null && other.getBuildVariance()==null) || 
             (this.buildVariance!=null &&
              this.buildVariance.equals(other.getBuildVariance()))) &&
            ((this.built==null && other.getBuilt()==null) || 
             (this.built!=null &&
              this.built.equals(other.getBuilt()))) &&
            ((this.canHaveStackablePromotions==null && other.getCanHaveStackablePromotions()==null) || 
             (this.canHaveStackablePromotions!=null &&
              this.canHaveStackablePromotions.equals(other.getCanHaveStackablePromotions()))) &&
            ((this.catchUpPeriod==null && other.getCatchUpPeriod()==null) || 
             (this.catchUpPeriod!=null &&
              this.catchUpPeriod.equals(other.getCatchUpPeriod()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              this.ccCustomerCode.equals(other.getCcCustomerCode()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.cleared==null && other.getCleared()==null) || 
             (this.cleared!=null &&
              this.cleared.equals(other.getCleared()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.cogs==null && other.getCogs()==null) || 
             (this.cogs!=null &&
              this.cogs.equals(other.getCogs()))) &&
            ((this.commissionEffectiveDate==null && other.getCommissionEffectiveDate()==null) || 
             (this.commissionEffectiveDate!=null &&
              this.commissionEffectiveDate.equals(other.getCommissionEffectiveDate()))) &&
            ((this.commit==null && other.getCommit()==null) || 
             (this.commit!=null &&
              this.commit.equals(other.getCommit()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              this.componentYield.equals(other.getComponentYield()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.costComponentAmount==null && other.getCostComponentAmount()==null) || 
             (this.costComponentAmount!=null &&
              this.costComponentAmount.equals(other.getCostComponentAmount()))) &&
            ((this.costComponentCategory==null && other.getCostComponentCategory()==null) || 
             (this.costComponentCategory!=null &&
              this.costComponentCategory.equals(other.getCostComponentCategory()))) &&
            ((this.costComponentItem==null && other.getCostComponentItem()==null) || 
             (this.costComponentItem!=null &&
              this.costComponentItem.equals(other.getCostComponentItem()))) &&
            ((this.costComponentQuantity==null && other.getCostComponentQuantity()==null) || 
             (this.costComponentQuantity!=null &&
              this.costComponentQuantity.equals(other.getCostComponentQuantity()))) &&
            ((this.costComponentStandardCost==null && other.getCostComponentStandardCost()==null) || 
             (this.costComponentStandardCost!=null &&
              this.costComponentStandardCost.equals(other.getCostComponentStandardCost()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.costEstimateRate==null && other.getCostEstimateRate()==null) || 
             (this.costEstimateRate!=null &&
              this.costEstimateRate.equals(other.getCostEstimateRate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.cscMatch==null && other.getCscMatch()==null) || 
             (this.cscMatch!=null &&
              this.cscMatch.equals(other.getCscMatch()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customerSubOf==null && other.getCustomerSubOf()==null) || 
             (this.customerSubOf!=null &&
              this.customerSubOf.equals(other.getCustomerSubOf()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.customGL==null && other.getCustomGL()==null) || 
             (this.customGL!=null &&
              this.customGL.equals(other.getCustomGL()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              this.custType.equals(other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              this.daysOpen.equals(other.getDaysOpen()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              this.daysOverdue.equals(other.getDaysOverdue()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              this.debitAmount.equals(other.getDebitAmount()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              this.deferredRevenue.equals(other.getDeferredRevenue()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.depositDate==null && other.getDepositDate()==null) || 
             (this.depositDate!=null &&
              this.depositDate.equals(other.getDepositDate()))) &&
            ((this.depositTransaction==null && other.getDepositTransaction()==null) || 
             (this.depositTransaction!=null &&
              this.depositTransaction.equals(other.getDepositTransaction()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              this.drAccount.equals(other.getDrAccount()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPct==null && other.getEstGrossProfitPct()==null) || 
             (this.estGrossProfitPct!=null &&
              this.estGrossProfitPct.equals(other.getEstGrossProfitPct()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              this.excludeCommission.equals(other.getExcludeCommission()))) &&
            ((this.excludeFromRateRequest==null && other.getExcludeFromRateRequest()==null) || 
             (this.excludeFromRateRequest!=null &&
              this.excludeFromRateRequest.equals(other.getExcludeFromRateRequest()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              this.expectedCloseDate.equals(other.getExpectedCloseDate()))) &&
            ((this.expectedReceiptDate==null && other.getExpectedReceiptDate()==null) || 
             (this.expectedReceiptDate!=null &&
              this.expectedReceiptDate.equals(other.getExpectedReceiptDate()))) &&
            ((this.expenseCategory==null && other.getExpenseCategory()==null) || 
             (this.expenseCategory!=null &&
              this.expenseCategory.equals(other.getExpenseCategory()))) &&
            ((this.expenseDate==null && other.getExpenseDate()==null) || 
             (this.expenseDate!=null &&
              this.expenseDate.equals(other.getExpenseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.finChrg==null && other.getFinChrg()==null) || 
             (this.finChrg!=null &&
              this.finChrg.equals(other.getFinChrg()))) &&
            ((this.firmed==null && other.getFirmed()==null) || 
             (this.firmed!=null &&
              this.firmed.equals(other.getFirmed()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              this.forecastType.equals(other.getForecastType()))) &&
            ((this.fulfillingTransaction==null && other.getFulfillingTransaction()==null) || 
             (this.fulfillingTransaction!=null &&
              this.fulfillingTransaction.equals(other.getFulfillingTransaction()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              this.fxAccount.equals(other.getFxAccount()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              this.fxAmount.equals(other.getFxAmount()))) &&
            ((this.fxCostEstimate==null && other.getFxCostEstimate()==null) || 
             (this.fxCostEstimate!=null &&
              this.fxCostEstimate.equals(other.getFxCostEstimate()))) &&
            ((this.fxCostEstimateRate==null && other.getFxCostEstimateRate()==null) || 
             (this.fxCostEstimateRate!=null &&
              this.fxCostEstimateRate.equals(other.getFxCostEstimateRate()))) &&
            ((this.fxEstGrossProfit==null && other.getFxEstGrossProfit()==null) || 
             (this.fxEstGrossProfit!=null &&
              this.fxEstGrossProfit.equals(other.getFxEstGrossProfit()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              this.fxTranCostEstimate.equals(other.getFxTranCostEstimate()))) &&
            ((this.fxVsoeAllocation==null && other.getFxVsoeAllocation()==null) || 
             (this.fxVsoeAllocation!=null &&
              this.fxVsoeAllocation.equals(other.getFxVsoeAllocation()))) &&
            ((this.fxVsoeAmount==null && other.getFxVsoeAmount()==null) || 
             (this.fxVsoeAmount!=null &&
              this.fxVsoeAmount.equals(other.getFxVsoeAmount()))) &&
            ((this.fxVsoePrice==null && other.getFxVsoePrice()==null) || 
             (this.fxVsoePrice!=null &&
              this.fxVsoePrice.equals(other.getFxVsoePrice()))) &&
            ((this.gcoAvailabelToCharge==null && other.getGcoAvailabelToCharge()==null) || 
             (this.gcoAvailabelToCharge!=null &&
              this.gcoAvailabelToCharge.equals(other.getGcoAvailabelToCharge()))) &&
            ((this.gcoAvailableToRefund==null && other.getGcoAvailableToRefund()==null) || 
             (this.gcoAvailableToRefund!=null &&
              this.gcoAvailableToRefund.equals(other.getGcoAvailableToRefund()))) &&
            ((this.gcoAvsStreetMatch==null && other.getGcoAvsStreetMatch()==null) || 
             (this.gcoAvsStreetMatch!=null &&
              this.gcoAvsStreetMatch.equals(other.getGcoAvsStreetMatch()))) &&
            ((this.gcoAvsZipMatch==null && other.getGcoAvsZipMatch()==null) || 
             (this.gcoAvsZipMatch!=null &&
              this.gcoAvsZipMatch.equals(other.getGcoAvsZipMatch()))) &&
            ((this.gcoBuyerAccountAge==null && other.getGcoBuyerAccountAge()==null) || 
             (this.gcoBuyerAccountAge!=null &&
              this.gcoBuyerAccountAge.equals(other.getGcoBuyerAccountAge()))) &&
            ((this.gcoBuyerIp==null && other.getGcoBuyerIp()==null) || 
             (this.gcoBuyerIp!=null &&
              this.gcoBuyerIp.equals(other.getGcoBuyerIp()))) &&
            ((this.gcoChargeAmount==null && other.getGcoChargeAmount()==null) || 
             (this.gcoChargeAmount!=null &&
              this.gcoChargeAmount.equals(other.getGcoChargeAmount()))) &&
            ((this.gcoChargebackAmount==null && other.getGcoChargebackAmount()==null) || 
             (this.gcoChargebackAmount!=null &&
              this.gcoChargebackAmount.equals(other.getGcoChargebackAmount()))) &&
            ((this.gcoConfirmedChargedTotal==null && other.getGcoConfirmedChargedTotal()==null) || 
             (this.gcoConfirmedChargedTotal!=null &&
              this.gcoConfirmedChargedTotal.equals(other.getGcoConfirmedChargedTotal()))) &&
            ((this.gcoConfirmedRefundedTotal==null && other.getGcoConfirmedRefundedTotal()==null) || 
             (this.gcoConfirmedRefundedTotal!=null &&
              this.gcoConfirmedRefundedTotal.equals(other.getGcoConfirmedRefundedTotal()))) &&
            ((this.gcoCreditcardNumber==null && other.getGcoCreditcardNumber()==null) || 
             (this.gcoCreditcardNumber!=null &&
              this.gcoCreditcardNumber.equals(other.getGcoCreditcardNumber()))) &&
            ((this.gcoCscMatch==null && other.getGcoCscMatch()==null) || 
             (this.gcoCscMatch!=null &&
              this.gcoCscMatch.equals(other.getGcoCscMatch()))) &&
            ((this.gcoFinancialState==null && other.getGcoFinancialState()==null) || 
             (this.gcoFinancialState!=null &&
              this.gcoFinancialState.equals(other.getGcoFinancialState()))) &&
            ((this.gcoFulfillmentState==null && other.getGcoFulfillmentState()==null) || 
             (this.gcoFulfillmentState!=null &&
              this.gcoFulfillmentState.equals(other.getGcoFulfillmentState()))) &&
            ((this.gcoOrderId==null && other.getGcoOrderId()==null) || 
             (this.gcoOrderId!=null &&
              this.gcoOrderId.equals(other.getGcoOrderId()))) &&
            ((this.gcoOrderTotal==null && other.getGcoOrderTotal()==null) || 
             (this.gcoOrderTotal!=null &&
              this.gcoOrderTotal.equals(other.getGcoOrderTotal()))) &&
            ((this.gcoPromotionAmount==null && other.getGcoPromotionAmount()==null) || 
             (this.gcoPromotionAmount!=null &&
              this.gcoPromotionAmount.equals(other.getGcoPromotionAmount()))) &&
            ((this.gcoPromotionName==null && other.getGcoPromotionName()==null) || 
             (this.gcoPromotionName!=null &&
              this.gcoPromotionName.equals(other.getGcoPromotionName()))) &&
            ((this.gcoRefundAmount==null && other.getGcoRefundAmount()==null) || 
             (this.gcoRefundAmount!=null &&
              this.gcoRefundAmount.equals(other.getGcoRefundAmount()))) &&
            ((this.gcoShippingTotal==null && other.getGcoShippingTotal()==null) || 
             (this.gcoShippingTotal!=null &&
              this.gcoShippingTotal.equals(other.getGcoShippingTotal()))) &&
            ((this.gcoStateChangedDetail==null && other.getGcoStateChangedDetail()==null) || 
             (this.gcoStateChangedDetail!=null &&
              this.gcoStateChangedDetail.equals(other.getGcoStateChangedDetail()))) &&
            ((this.giftCertificate==null && other.getGiftCertificate()==null) || 
             (this.giftCertificate!=null &&
              this.giftCertificate.equals(other.getGiftCertificate()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.includeInForecast==null && other.getIncludeInForecast()==null) || 
             (this.includeInForecast!=null &&
              this.includeInForecast.equals(other.getIncludeInForecast()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              this.incoterm.equals(other.getIncoterm()))) &&
            ((this.intercoStatus==null && other.getIntercoStatus()==null) || 
             (this.intercoStatus!=null &&
              this.intercoStatus.equals(other.getIntercoStatus()))) &&
            ((this.intercoTransaction==null && other.getIntercoTransaction()==null) || 
             (this.intercoTransaction!=null &&
              this.intercoTransaction.equals(other.getIntercoTransaction()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              this.inventoryLocation.equals(other.getInventoryLocation()))) &&
            ((this.inventorySubsidiary==null && other.getInventorySubsidiary()==null) || 
             (this.inventorySubsidiary!=null &&
              this.inventorySubsidiary.equals(other.getInventorySubsidiary()))) &&
            ((this.inVsoeBundle==null && other.getInVsoeBundle()==null) || 
             (this.inVsoeBundle!=null &&
              this.inVsoeBundle.equals(other.getInVsoeBundle()))) &&
            ((this.isAllocation==null && other.getIsAllocation()==null) || 
             (this.isAllocation!=null &&
              this.isAllocation.equals(other.getIsAllocation()))) &&
            ((this.isBackflush==null && other.getIsBackflush()==null) || 
             (this.isBackflush!=null &&
              this.isBackflush.equals(other.getIsBackflush()))) &&
            ((this.isGcoChargeback==null && other.getIsGcoChargeback()==null) || 
             (this.isGcoChargeback!=null &&
              this.isGcoChargeback.equals(other.getIsGcoChargeback()))) &&
            ((this.isGcoChargeConfirmed==null && other.getIsGcoChargeConfirmed()==null) || 
             (this.isGcoChargeConfirmed!=null &&
              this.isGcoChargeConfirmed.equals(other.getIsGcoChargeConfirmed()))) &&
            ((this.isGcoPaymentGuaranteed==null && other.getIsGcoPaymentGuaranteed()==null) || 
             (this.isGcoPaymentGuaranteed!=null &&
              this.isGcoPaymentGuaranteed.equals(other.getIsGcoPaymentGuaranteed()))) &&
            ((this.isGcoRefundConfirmed==null && other.getIsGcoRefundConfirmed()==null) || 
             (this.isGcoRefundConfirmed!=null &&
              this.isGcoRefundConfirmed.equals(other.getIsGcoRefundConfirmed()))) &&
            ((this.isInsideDelivery==null && other.getIsInsideDelivery()==null) || 
             (this.isInsideDelivery!=null &&
              this.isInsideDelivery.equals(other.getIsInsideDelivery()))) &&
            ((this.isInsidePickup==null && other.getIsInsidePickup()==null) || 
             (this.isInsidePickup!=null &&
              this.isInsidePickup.equals(other.getIsInsidePickup()))) &&
            ((this.isIntercompanyAdjustment==null && other.getIsIntercompanyAdjustment()==null) || 
             (this.isIntercompanyAdjustment!=null &&
              this.isIntercompanyAdjustment.equals(other.getIsIntercompanyAdjustment()))) &&
            ((this.isInTransitPayment==null && other.getIsInTransitPayment()==null) || 
             (this.isInTransitPayment!=null &&
              this.isInTransitPayment.equals(other.getIsInTransitPayment()))) &&
            ((this.isMultiShipTo==null && other.getIsMultiShipTo()==null) || 
             (this.isMultiShipTo!=null &&
              this.isMultiShipTo.equals(other.getIsMultiShipTo()))) &&
            ((this.isPayPalMeth==null && other.getIsPayPalMeth()==null) || 
             (this.isPayPalMeth!=null &&
              this.isPayPalMeth.equals(other.getIsPayPalMeth()))) &&
            ((this.isReversal==null && other.getIsReversal()==null) || 
             (this.isReversal!=null &&
              this.isReversal.equals(other.getIsReversal()))) &&
            ((this.isRevRecTransaction==null && other.getIsRevRecTransaction()==null) || 
             (this.isRevRecTransaction!=null &&
              this.isRevRecTransaction.equals(other.getIsRevRecTransaction()))) &&
            ((this.isScrap==null && other.getIsScrap()==null) || 
             (this.isScrap!=null &&
              this.isScrap.equals(other.getIsScrap()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              this.isShipAddress.equals(other.getIsShipAddress()))) &&
            ((this.isTransferPriceCosting==null && other.getIsTransferPriceCosting()==null) || 
             (this.isTransferPriceCosting!=null &&
              this.isTransferPriceCosting.equals(other.getIsTransferPriceCosting()))) &&
            ((this.isVsoeAlloc==null && other.getIsVsoeAlloc()==null) || 
             (this.isVsoeAlloc!=null &&
              this.isVsoeAlloc.equals(other.getIsVsoeAlloc()))) &&
            ((this.isWip==null && other.getIsWip()==null) || 
             (this.isWip!=null &&
              this.isWip.equals(other.getIsWip()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemFulfillmentChoice==null && other.getItemFulfillmentChoice()==null) || 
             (this.itemFulfillmentChoice!=null &&
              this.itemFulfillmentChoice.equals(other.getItemFulfillmentChoice()))) &&
            ((this.itemRevision==null && other.getItemRevision()==null) || 
             (this.itemRevision!=null &&
              this.itemRevision.equals(other.getItemRevision()))) &&
            ((this.itemSubOf==null && other.getItemSubOf()==null) || 
             (this.itemSubOf!=null &&
              this.itemSubOf.equals(other.getItemSubOf()))) &&
            ((this.landedCostPerLine==null && other.getLandedCostPerLine()==null) || 
             (this.landedCostPerLine!=null &&
              this.landedCostPerLine.equals(other.getLandedCostPerLine()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.lineUniqueKey==null && other.getLineUniqueKey()==null) || 
             (this.lineUniqueKey!=null &&
              this.lineUniqueKey.equals(other.getLineUniqueKey()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.locationAutoAssigned==null && other.getLocationAutoAssigned()==null) || 
             (this.locationAutoAssigned!=null &&
              this.locationAutoAssigned.equals(other.getLocationAutoAssigned()))) &&
            ((this.mainLine==null && other.getMainLine()==null) || 
             (this.mainLine!=null &&
              this.mainLine.equals(other.getMainLine()))) &&
            ((this.mainName==null && other.getMainName()==null) || 
             (this.mainName!=null &&
              this.mainName.equals(other.getMainName()))) &&
            ((this.manufacturingRouting==null && other.getManufacturingRouting()==null) || 
             (this.manufacturingRouting!=null &&
              this.manufacturingRouting.equals(other.getManufacturingRouting()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              this.matchBillToReceipt.equals(other.getMatchBillToReceipt()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.memoMain==null && other.getMemoMain()==null) || 
             (this.memoMain!=null &&
              this.memoMain.equals(other.getMemoMain()))) &&
            ((this.memorized==null && other.getMemorized()==null) || 
             (this.memorized!=null &&
              this.memorized.equals(other.getMemorized()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              this.merchantAccount.equals(other.getMerchantAccount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.multiSubsidiary==null && other.getMultiSubsidiary()==null) || 
             (this.multiSubsidiary!=null &&
              this.multiSubsidiary.equals(other.getMultiSubsidiary()))) &&
            ((this.nameText==null && other.getNameText()==null) || 
             (this.nameText!=null &&
              this.nameText.equals(other.getNameText()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate()))) &&
            ((this.noAutoAssignLocation==null && other.getNoAutoAssignLocation()==null) || 
             (this.noAutoAssignLocation!=null &&
              this.noAutoAssignLocation.equals(other.getNoAutoAssignLocation()))) &&
            ((this.nonReimbursable==null && other.getNonReimbursable()==null) || 
             (this.nonReimbursable!=null &&
              this.nonReimbursable.equals(other.getNonReimbursable()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.oneTimeTotal==null && other.getOneTimeTotal()==null) || 
             (this.oneTimeTotal!=null &&
              this.oneTimeTotal.equals(other.getOneTimeTotal()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.orderPriority==null && other.getOrderPriority()==null) || 
             (this.orderPriority!=null &&
              this.orderPriority.equals(other.getOrderPriority()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.otherRefNumNonDeposit==null && other.getOtherRefNumNonDeposit()==null) || 
             (this.otherRefNumNonDeposit!=null &&
              this.otherRefNumNonDeposit.equals(other.getOtherRefNumNonDeposit()))) &&
            ((this.overheadParentItem==null && other.getOverheadParentItem()==null) || 
             (this.overheadParentItem!=null &&
              this.overheadParentItem.equals(other.getOverheadParentItem()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.paidTransaction==null && other.getPaidTransaction()==null) || 
             (this.paidTransaction!=null &&
              this.paidTransaction.equals(other.getPaidTransaction()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              this.partnerContribution.equals(other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              this.partnerRole.equals(other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              this.partnerTeamMember.equals(other.getPartnerTeamMember()))) &&
            ((this.payingTransaction==null && other.getPayingTransaction()==null) || 
             (this.payingTransaction!=null &&
              this.payingTransaction.equals(other.getPayingTransaction()))) &&
            ((this.paymentApproved==null && other.getPaymentApproved()==null) || 
             (this.paymentApproved!=null &&
              this.paymentApproved.equals(other.getPaymentApproved()))) &&
            ((this.paymentEventDate==null && other.getPaymentEventDate()==null) || 
             (this.paymentEventDate!=null &&
              this.paymentEventDate.equals(other.getPaymentEventDate()))) &&
            ((this.paymentEventHoldReason==null && other.getPaymentEventHoldReason()==null) || 
             (this.paymentEventHoldReason!=null &&
              this.paymentEventHoldReason.equals(other.getPaymentEventHoldReason()))) &&
            ((this.paymentEventPurchaseCardUsed==null && other.getPaymentEventPurchaseCardUsed()==null) || 
             (this.paymentEventPurchaseCardUsed!=null &&
              this.paymentEventPurchaseCardUsed.equals(other.getPaymentEventPurchaseCardUsed()))) &&
            ((this.paymentEventPurchaseDataSent==null && other.getPaymentEventPurchaseDataSent()==null) || 
             (this.paymentEventPurchaseDataSent!=null &&
              this.paymentEventPurchaseDataSent.equals(other.getPaymentEventPurchaseDataSent()))) &&
            ((this.paymentEventResult==null && other.getPaymentEventResult()==null) || 
             (this.paymentEventResult!=null &&
              this.paymentEventResult.equals(other.getPaymentEventResult()))) &&
            ((this.paymentEventType==null && other.getPaymentEventType()==null) || 
             (this.paymentEventType!=null &&
              this.paymentEventType.equals(other.getPaymentEventType()))) &&
            ((this.paymentHold==null && other.getPaymentHold()==null) || 
             (this.paymentHold!=null &&
              this.paymentHold.equals(other.getPaymentHold()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.paymentOption==null && other.getPaymentOption()==null) || 
             (this.paymentOption!=null &&
              this.paymentOption.equals(other.getPaymentOption()))) &&
            ((this.payPalPending==null && other.getPayPalPending()==null) || 
             (this.payPalPending!=null &&
              this.payPalPending.equals(other.getPayPalPending()))) &&
            ((this.payPalStatus==null && other.getPayPalStatus()==null) || 
             (this.payPalStatus!=null &&
              this.payPalStatus.equals(other.getPayPalStatus()))) &&
            ((this.payPalTranId==null && other.getPayPalTranId()==null) || 
             (this.payPalTranId!=null &&
              this.payPalTranId.equals(other.getPayPalTranId()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.poAsText==null && other.getPoAsText()==null) || 
             (this.poAsText!=null &&
              this.poAsText.equals(other.getPoAsText()))) &&
            ((this.posting==null && other.getPosting()==null) || 
             (this.posting!=null &&
              this.posting.equals(other.getPosting()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.postingPeriodRelative==null && other.getPostingPeriodRelative()==null) || 
             (this.postingPeriodRelative!=null &&
              this.postingPeriodRelative.equals(other.getPostingPeriodRelative()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.printedPickingTicket==null && other.getPrintedPickingTicket()==null) || 
             (this.printedPickingTicket!=null &&
              this.printedPickingTicket.equals(other.getPrintedPickingTicket()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.projectedAmount==null && other.getProjectedAmount()==null) || 
             (this.projectedAmount!=null &&
              this.projectedAmount.equals(other.getProjectedAmount()))) &&
            ((this.projectTask==null && other.getProjectTask()==null) || 
             (this.projectTask!=null &&
              this.projectTask.equals(other.getProjectTask()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              this.purchaseOrder.equals(other.getPurchaseOrder()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              this.quantityBilled.equals(other.getQuantityBilled()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityPacked==null && other.getQuantityPacked()==null) || 
             (this.quantityPacked!=null &&
              this.quantityPacked.equals(other.getQuantityPacked()))) &&
            ((this.quantityPicked==null && other.getQuantityPicked()==null) || 
             (this.quantityPicked!=null &&
              this.quantityPicked.equals(other.getQuantityPicked()))) &&
            ((this.quantityRevCommitted==null && other.getQuantityRevCommitted()==null) || 
             (this.quantityRevCommitted!=null &&
              this.quantityRevCommitted.equals(other.getQuantityRevCommitted()))) &&
            ((this.quantityShipRecv==null && other.getQuantityShipRecv()==null) || 
             (this.quantityShipRecv!=null &&
              this.quantityShipRecv.equals(other.getQuantityShipRecv()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              this.recognizedRevenue.equals(other.getRecognizedRevenue()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recurAnnuallyTotal==null && other.getRecurAnnuallyTotal()==null) || 
             (this.recurAnnuallyTotal!=null &&
              this.recurAnnuallyTotal.equals(other.getRecurAnnuallyTotal()))) &&
            ((this.recurMonthlyTotal==null && other.getRecurMonthlyTotal()==null) || 
             (this.recurMonthlyTotal!=null &&
              this.recurMonthlyTotal.equals(other.getRecurMonthlyTotal()))) &&
            ((this.recurQuarterlyTotal==null && other.getRecurQuarterlyTotal()==null) || 
             (this.recurQuarterlyTotal!=null &&
              this.recurQuarterlyTotal.equals(other.getRecurQuarterlyTotal()))) &&
            ((this.recurringBill==null && other.getRecurringBill()==null) || 
             (this.recurringBill!=null &&
              this.recurringBill.equals(other.getRecurringBill()))) &&
            ((this.recurWeeklyTotal==null && other.getRecurWeeklyTotal()==null) || 
             (this.recurWeeklyTotal!=null &&
              this.recurWeeklyTotal.equals(other.getRecurWeeklyTotal()))) &&
            ((this.refNumber==null && other.getRefNumber()==null) || 
             (this.refNumber!=null &&
              this.refNumber.equals(other.getRefNumber()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              this.revCommitStatus.equals(other.getRevCommitStatus()))) &&
            ((this.revCommittingStatus==null && other.getRevCommittingStatus()==null) || 
             (this.revCommittingStatus!=null &&
              this.revCommittingStatus.equals(other.getRevCommittingStatus()))) &&
            ((this.revCommittingTransaction==null && other.getRevCommittingTransaction()==null) || 
             (this.revCommittingTransaction!=null &&
              this.revCommittingTransaction.equals(other.getRevCommittingTransaction()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              this.revenueStatus.equals(other.getRevenueStatus()))) &&
            ((this.reversalDate==null && other.getReversalDate()==null) || 
             (this.reversalDate!=null &&
              this.reversalDate.equals(other.getReversalDate()))) &&
            ((this.reversalNumber==null && other.getReversalNumber()==null) || 
             (this.reversalNumber!=null &&
              this.reversalNumber.equals(other.getReversalNumber()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecTermInMonths==null && other.getRevRecTermInMonths()==null) || 
             (this.revRecTermInMonths!=null &&
              this.revRecTermInMonths.equals(other.getRevRecTermInMonths()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              this.salesEffectiveDate.equals(other.getSalesEffectiveDate()))) &&
            ((this.salesOrder==null && other.getSalesOrder()==null) || 
             (this.salesOrder!=null &&
              this.salesOrder.equals(other.getSalesOrder()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              this.salesTeamMember.equals(other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              this.salesTeamRole.equals(other.getSalesTeamRole()))) &&
            ((this.schedulingMethod==null && other.getSchedulingMethod()==null) || 
             (this.schedulingMethod!=null &&
              this.schedulingMethod.equals(other.getSchedulingMethod()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.serialNumberCost==null && other.getSerialNumberCost()==null) || 
             (this.serialNumberCost!=null &&
              this.serialNumberCost.equals(other.getSerialNumberCost()))) &&
            ((this.serialNumberCostAdjustment==null && other.getSerialNumberCostAdjustment()==null) || 
             (this.serialNumberCostAdjustment!=null &&
              this.serialNumberCostAdjustment.equals(other.getSerialNumberCostAdjustment()))) &&
            ((this.serialNumberQuantity==null && other.getSerialNumberQuantity()==null) || 
             (this.serialNumberQuantity!=null &&
              this.serialNumberQuantity.equals(other.getSerialNumberQuantity()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipAddressee==null && other.getShipAddressee()==null) || 
             (this.shipAddressee!=null &&
              this.shipAddressee.equals(other.getShipAddressee()))) &&
            ((this.shipAttention==null && other.getShipAttention()==null) || 
             (this.shipAttention!=null &&
              this.shipAttention.equals(other.getShipAttention()))) &&
            ((this.shipCarrier==null && other.getShipCarrier()==null) || 
             (this.shipCarrier!=null &&
              this.shipCarrier.equals(other.getShipCarrier()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              this.shipCity.equals(other.getShipCity()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              this.shipCountry.equals(other.getShipCountry()))) &&
            ((this.shipCounty==null && other.getShipCounty()==null) || 
             (this.shipCounty!=null &&
              this.shipCounty.equals(other.getShipCounty()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              this.shipGroup.equals(other.getShipGroup()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              this.shipPhone.equals(other.getShipPhone()))) &&
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.shipRecvStatus==null && other.getShipRecvStatus()==null) || 
             (this.shipRecvStatus!=null &&
              this.shipRecvStatus.equals(other.getShipRecvStatus()))) &&
            ((this.shipRecvStatusLine==null && other.getShipRecvStatusLine()==null) || 
             (this.shipRecvStatusLine!=null &&
              this.shipRecvStatusLine.equals(other.getShipRecvStatusLine()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              this.shipState.equals(other.getShipState()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              this.shipZip.equals(other.getShipZip()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.statistical==null && other.getStatistical()==null) || 
             (this.statistical!=null &&
              this.statistical.equals(other.getStatistical()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.subscriptionLine==null && other.getSubscriptionLine()==null) || 
             (this.subscriptionLine!=null &&
              this.subscriptionLine.equals(other.getSubscriptionLine()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.taxLine==null && other.getTaxLine()==null) || 
             (this.taxLine!=null &&
              this.taxLine.equals(other.getTaxLine()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              this.taxPeriod.equals(other.getTaxPeriod()))) &&
            ((this.taxPeriodRelative==null && other.getTaxPeriodRelative()==null) || 
             (this.taxPeriodRelative!=null &&
              this.taxPeriodRelative.equals(other.getTaxPeriodRelative()))) &&
            ((this.taxPointDate==null && other.getTaxPointDate()==null) || 
             (this.taxPointDate!=null &&
              this.taxPointDate.equals(other.getTaxPointDate()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.termsOfSale==null && other.getTermsOfSale()==null) || 
             (this.termsOfSale!=null &&
              this.termsOfSale.equals(other.getTermsOfSale()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              this.toBeEmailed.equals(other.getToBeEmailed()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              this.toSubsidiary.equals(other.getToSubsidiary()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.tranCostEstimate==null && other.getTranCostEstimate()==null) || 
             (this.tranCostEstimate!=null &&
              this.tranCostEstimate.equals(other.getTranCostEstimate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              this.tranEstGrossProfit.equals(other.getTranEstGrossProfit()))) &&
            ((this.tranEstGrossProfitPct==null && other.getTranEstGrossProfitPct()==null) || 
             (this.tranEstGrossProfitPct!=null &&
              this.tranEstGrossProfitPct.equals(other.getTranEstGrossProfitPct()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              this.tranFxEstGrossProfit.equals(other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.transactionDiscount==null && other.getTransactionDiscount()==null) || 
             (this.transactionDiscount!=null &&
              this.transactionDiscount.equals(other.getTransactionDiscount()))) &&
            ((this.transactionLineType==null && other.getTransactionLineType()==null) || 
             (this.transactionLineType!=null &&
              this.transactionLineType.equals(other.getTransactionLineType()))) &&
            ((this.transactionNumber==null && other.getTransactionNumber()==null) || 
             (this.transactionNumber!=null &&
              this.transactionNumber.equals(other.getTransactionNumber()))) &&
            ((this.transferLocation==null && other.getTransferLocation()==null) || 
             (this.transferLocation!=null &&
              this.transferLocation.equals(other.getTransferLocation()))) &&
            ((this.transferOrderQuantityCommitted==null && other.getTransferOrderQuantityCommitted()==null) || 
             (this.transferOrderQuantityCommitted!=null &&
              this.transferOrderQuantityCommitted.equals(other.getTransferOrderQuantityCommitted()))) &&
            ((this.transferOrderQuantityPacked==null && other.getTransferOrderQuantityPacked()==null) || 
             (this.transferOrderQuantityPacked!=null &&
              this.transferOrderQuantityPacked.equals(other.getTransferOrderQuantityPacked()))) &&
            ((this.transferOrderQuantityPicked==null && other.getTransferOrderQuantityPicked()==null) || 
             (this.transferOrderQuantityPicked!=null &&
              this.transferOrderQuantityPicked.equals(other.getTransferOrderQuantityPicked()))) &&
            ((this.transferOrderQuantityReceived==null && other.getTransferOrderQuantityReceived()==null) || 
             (this.transferOrderQuantityReceived!=null &&
              this.transferOrderQuantityReceived.equals(other.getTransferOrderQuantityReceived()))) &&
            ((this.transferOrderQuantityShipped==null && other.getTransferOrderQuantityShipped()==null) || 
             (this.transferOrderQuantityShipped!=null &&
              this.transferOrderQuantityShipped.equals(other.getTransferOrderQuantityShipped()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.unitCostOverride==null && other.getUnitCostOverride()==null) || 
             (this.unitCostOverride!=null &&
              this.unitCostOverride.equals(other.getUnitCostOverride()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.vendType==null && other.getVendType()==null) || 
             (this.vendType!=null &&
              this.vendType.equals(other.getVendType()))) &&
            ((this.visibleToCustomer==null && other.getVisibleToCustomer()==null) || 
             (this.visibleToCustomer!=null &&
              this.visibleToCustomer.equals(other.getVisibleToCustomer()))) &&
            ((this.voided==null && other.getVoided()==null) || 
             (this.voided!=null &&
              this.voided.equals(other.getVoided()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              this.vsoeAllocation.equals(other.getVsoeAllocation()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              this.vsoeAmount.equals(other.getVsoeAmount()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              this.webSite.equals(other.getWebSite()))) &&
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAcctCorpCardExp() != null) {
            _hashCode += getAcctCorpCardExp().hashCode();
        }
        if (getActualShipDate() != null) {
            _hashCode += getActualShipDate().hashCode();
        }
        if (getAltSalesAmount() != null) {
            _hashCode += getAltSalesAmount().hashCode();
        }
        if (getAltSalesNetAmount() != null) {
            _hashCode += getAltSalesNetAmount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountPaid() != null) {
            _hashCode += getAmountPaid().hashCode();
        }
        if (getAmountRemaining() != null) {
            _hashCode += getAmountRemaining().hashCode();
        }
        if (getAmountUnbilled() != null) {
            _hashCode += getAmountUnbilled().hashCode();
        }
        if (getAnyLineItem() != null) {
            _hashCode += getAnyLineItem().hashCode();
        }
        if (getAppliedToForeignAmount() != null) {
            _hashCode += getAppliedToForeignAmount().hashCode();
        }
        if (getAppliedToIsFxVariance() != null) {
            _hashCode += getAppliedToIsFxVariance().hashCode();
        }
        if (getAppliedToLinkAmount() != null) {
            _hashCode += getAppliedToLinkAmount().hashCode();
        }
        if (getAppliedToLinkType() != null) {
            _hashCode += getAppliedToLinkType().hashCode();
        }
        if (getAppliedToTransaction() != null) {
            _hashCode += getAppliedToTransaction().hashCode();
        }
        if (getApplyingForeignAmount() != null) {
            _hashCode += getApplyingForeignAmount().hashCode();
        }
        if (getApplyingIsFxVariance() != null) {
            _hashCode += getApplyingIsFxVariance().hashCode();
        }
        if (getApplyingLinkAmount() != null) {
            _hashCode += getApplyingLinkAmount().hashCode();
        }
        if (getApplyingLinkType() != null) {
            _hashCode += getApplyingLinkType().hashCode();
        }
        if (getApplyingTransaction() != null) {
            _hashCode += getApplyingTransaction().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getAutoCalculateLag() != null) {
            _hashCode += getAutoCalculateLag().hashCode();
        }
        if (getAvsStreetMatch() != null) {
            _hashCode += getAvsStreetMatch().hashCode();
        }
        if (getAvsZipMatch() != null) {
            _hashCode += getAvsZipMatch().hashCode();
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getBillAddressee() != null) {
            _hashCode += getBillAddressee().hashCode();
        }
        if (getBillAttention() != null) {
            _hashCode += getBillAttention().hashCode();
        }
        if (getBillCity() != null) {
            _hashCode += getBillCity().hashCode();
        }
        if (getBillCountry() != null) {
            _hashCode += getBillCountry().hashCode();
        }
        if (getBillCounty() != null) {
            _hashCode += getBillCounty().hashCode();
        }
        if (getBilledDate() != null) {
            _hashCode += getBilledDate().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        if (getBillingTransaction() != null) {
            _hashCode += getBillingTransaction().hashCode();
        }
        if (getBillPhone() != null) {
            _hashCode += getBillPhone().hashCode();
        }
        if (getBillState() != null) {
            _hashCode += getBillState().hashCode();
        }
        if (getBillVarianceStatus() != null) {
            _hashCode += getBillVarianceStatus().hashCode();
        }
        if (getBillZip() != null) {
            _hashCode += getBillZip().hashCode();
        }
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getBinNumberQuantity() != null) {
            _hashCode += getBinNumberQuantity().hashCode();
        }
        if (getBomQuantity() != null) {
            _hashCode += getBomQuantity().hashCode();
        }
        if (getBookSpecificTransaction() != null) {
            _hashCode += getBookSpecificTransaction().hashCode();
        }
        if (getBuildEntireAssembly() != null) {
            _hashCode += getBuildEntireAssembly().hashCode();
        }
        if (getBuildVariance() != null) {
            _hashCode += getBuildVariance().hashCode();
        }
        if (getBuilt() != null) {
            _hashCode += getBuilt().hashCode();
        }
        if (getCanHaveStackablePromotions() != null) {
            _hashCode += getCanHaveStackablePromotions().hashCode();
        }
        if (getCatchUpPeriod() != null) {
            _hashCode += getCatchUpPeriod().hashCode();
        }
        if (getCcCustomerCode() != null) {
            _hashCode += getCcCustomerCode().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCleared() != null) {
            _hashCode += getCleared().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCogs() != null) {
            _hashCode += getCogs().hashCode();
        }
        if (getCommissionEffectiveDate() != null) {
            _hashCode += getCommissionEffectiveDate().hashCode();
        }
        if (getCommit() != null) {
            _hashCode += getCommit().hashCode();
        }
        if (getComponentYield() != null) {
            _hashCode += getComponentYield().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getCostComponentAmount() != null) {
            _hashCode += getCostComponentAmount().hashCode();
        }
        if (getCostComponentCategory() != null) {
            _hashCode += getCostComponentCategory().hashCode();
        }
        if (getCostComponentItem() != null) {
            _hashCode += getCostComponentItem().hashCode();
        }
        if (getCostComponentQuantity() != null) {
            _hashCode += getCostComponentQuantity().hashCode();
        }
        if (getCostComponentStandardCost() != null) {
            _hashCode += getCostComponentStandardCost().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getCostEstimateRate() != null) {
            _hashCode += getCostEstimateRate().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getCscMatch() != null) {
            _hashCode += getCscMatch().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomerSubOf() != null) {
            _hashCode += getCustomerSubOf().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCustomGL() != null) {
            _hashCode += getCustomGL().hashCode();
        }
        if (getCustType() != null) {
            _hashCode += getCustType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDaysOpen() != null) {
            _hashCode += getDaysOpen().hashCode();
        }
        if (getDaysOverdue() != null) {
            _hashCode += getDaysOverdue().hashCode();
        }
        if (getDebitAmount() != null) {
            _hashCode += getDebitAmount().hashCode();
        }
        if (getDeferredRevenue() != null) {
            _hashCode += getDeferredRevenue().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDepositDate() != null) {
            _hashCode += getDepositDate().hashCode();
        }
        if (getDepositTransaction() != null) {
            _hashCode += getDepositTransaction().hashCode();
        }
        if (getDrAccount() != null) {
            _hashCode += getDrAccount().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getEstGrossProfit() != null) {
            _hashCode += getEstGrossProfit().hashCode();
        }
        if (getEstGrossProfitPct() != null) {
            _hashCode += getEstGrossProfitPct().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getExcludeCommission() != null) {
            _hashCode += getExcludeCommission().hashCode();
        }
        if (getExcludeFromRateRequest() != null) {
            _hashCode += getExcludeFromRateRequest().hashCode();
        }
        if (getExpectedCloseDate() != null) {
            _hashCode += getExpectedCloseDate().hashCode();
        }
        if (getExpectedReceiptDate() != null) {
            _hashCode += getExpectedReceiptDate().hashCode();
        }
        if (getExpenseCategory() != null) {
            _hashCode += getExpenseCategory().hashCode();
        }
        if (getExpenseDate() != null) {
            _hashCode += getExpenseDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFinChrg() != null) {
            _hashCode += getFinChrg().hashCode();
        }
        if (getFirmed() != null) {
            _hashCode += getFirmed().hashCode();
        }
        if (getForecastType() != null) {
            _hashCode += getForecastType().hashCode();
        }
        if (getFulfillingTransaction() != null) {
            _hashCode += getFulfillingTransaction().hashCode();
        }
        if (getFxAccount() != null) {
            _hashCode += getFxAccount().hashCode();
        }
        if (getFxAmount() != null) {
            _hashCode += getFxAmount().hashCode();
        }
        if (getFxCostEstimate() != null) {
            _hashCode += getFxCostEstimate().hashCode();
        }
        if (getFxCostEstimateRate() != null) {
            _hashCode += getFxCostEstimateRate().hashCode();
        }
        if (getFxEstGrossProfit() != null) {
            _hashCode += getFxEstGrossProfit().hashCode();
        }
        if (getFxTranCostEstimate() != null) {
            _hashCode += getFxTranCostEstimate().hashCode();
        }
        if (getFxVsoeAllocation() != null) {
            _hashCode += getFxVsoeAllocation().hashCode();
        }
        if (getFxVsoeAmount() != null) {
            _hashCode += getFxVsoeAmount().hashCode();
        }
        if (getFxVsoePrice() != null) {
            _hashCode += getFxVsoePrice().hashCode();
        }
        if (getGcoAvailabelToCharge() != null) {
            _hashCode += getGcoAvailabelToCharge().hashCode();
        }
        if (getGcoAvailableToRefund() != null) {
            _hashCode += getGcoAvailableToRefund().hashCode();
        }
        if (getGcoAvsStreetMatch() != null) {
            _hashCode += getGcoAvsStreetMatch().hashCode();
        }
        if (getGcoAvsZipMatch() != null) {
            _hashCode += getGcoAvsZipMatch().hashCode();
        }
        if (getGcoBuyerAccountAge() != null) {
            _hashCode += getGcoBuyerAccountAge().hashCode();
        }
        if (getGcoBuyerIp() != null) {
            _hashCode += getGcoBuyerIp().hashCode();
        }
        if (getGcoChargeAmount() != null) {
            _hashCode += getGcoChargeAmount().hashCode();
        }
        if (getGcoChargebackAmount() != null) {
            _hashCode += getGcoChargebackAmount().hashCode();
        }
        if (getGcoConfirmedChargedTotal() != null) {
            _hashCode += getGcoConfirmedChargedTotal().hashCode();
        }
        if (getGcoConfirmedRefundedTotal() != null) {
            _hashCode += getGcoConfirmedRefundedTotal().hashCode();
        }
        if (getGcoCreditcardNumber() != null) {
            _hashCode += getGcoCreditcardNumber().hashCode();
        }
        if (getGcoCscMatch() != null) {
            _hashCode += getGcoCscMatch().hashCode();
        }
        if (getGcoFinancialState() != null) {
            _hashCode += getGcoFinancialState().hashCode();
        }
        if (getGcoFulfillmentState() != null) {
            _hashCode += getGcoFulfillmentState().hashCode();
        }
        if (getGcoOrderId() != null) {
            _hashCode += getGcoOrderId().hashCode();
        }
        if (getGcoOrderTotal() != null) {
            _hashCode += getGcoOrderTotal().hashCode();
        }
        if (getGcoPromotionAmount() != null) {
            _hashCode += getGcoPromotionAmount().hashCode();
        }
        if (getGcoPromotionName() != null) {
            _hashCode += getGcoPromotionName().hashCode();
        }
        if (getGcoRefundAmount() != null) {
            _hashCode += getGcoRefundAmount().hashCode();
        }
        if (getGcoShippingTotal() != null) {
            _hashCode += getGcoShippingTotal().hashCode();
        }
        if (getGcoStateChangedDetail() != null) {
            _hashCode += getGcoStateChangedDetail().hashCode();
        }
        if (getGiftCertificate() != null) {
            _hashCode += getGiftCertificate().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getIncludeInForecast() != null) {
            _hashCode += getIncludeInForecast().hashCode();
        }
        if (getIncoterm() != null) {
            _hashCode += getIncoterm().hashCode();
        }
        if (getIntercoStatus() != null) {
            _hashCode += getIntercoStatus().hashCode();
        }
        if (getIntercoTransaction() != null) {
            _hashCode += getIntercoTransaction().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getInventoryLocation() != null) {
            _hashCode += getInventoryLocation().hashCode();
        }
        if (getInventorySubsidiary() != null) {
            _hashCode += getInventorySubsidiary().hashCode();
        }
        if (getInVsoeBundle() != null) {
            _hashCode += getInVsoeBundle().hashCode();
        }
        if (getIsAllocation() != null) {
            _hashCode += getIsAllocation().hashCode();
        }
        if (getIsBackflush() != null) {
            _hashCode += getIsBackflush().hashCode();
        }
        if (getIsGcoChargeback() != null) {
            _hashCode += getIsGcoChargeback().hashCode();
        }
        if (getIsGcoChargeConfirmed() != null) {
            _hashCode += getIsGcoChargeConfirmed().hashCode();
        }
        if (getIsGcoPaymentGuaranteed() != null) {
            _hashCode += getIsGcoPaymentGuaranteed().hashCode();
        }
        if (getIsGcoRefundConfirmed() != null) {
            _hashCode += getIsGcoRefundConfirmed().hashCode();
        }
        if (getIsInsideDelivery() != null) {
            _hashCode += getIsInsideDelivery().hashCode();
        }
        if (getIsInsidePickup() != null) {
            _hashCode += getIsInsidePickup().hashCode();
        }
        if (getIsIntercompanyAdjustment() != null) {
            _hashCode += getIsIntercompanyAdjustment().hashCode();
        }
        if (getIsInTransitPayment() != null) {
            _hashCode += getIsInTransitPayment().hashCode();
        }
        if (getIsMultiShipTo() != null) {
            _hashCode += getIsMultiShipTo().hashCode();
        }
        if (getIsPayPalMeth() != null) {
            _hashCode += getIsPayPalMeth().hashCode();
        }
        if (getIsReversal() != null) {
            _hashCode += getIsReversal().hashCode();
        }
        if (getIsRevRecTransaction() != null) {
            _hashCode += getIsRevRecTransaction().hashCode();
        }
        if (getIsScrap() != null) {
            _hashCode += getIsScrap().hashCode();
        }
        if (getIsShipAddress() != null) {
            _hashCode += getIsShipAddress().hashCode();
        }
        if (getIsTransferPriceCosting() != null) {
            _hashCode += getIsTransferPriceCosting().hashCode();
        }
        if (getIsVsoeAlloc() != null) {
            _hashCode += getIsVsoeAlloc().hashCode();
        }
        if (getIsWip() != null) {
            _hashCode += getIsWip().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemFulfillmentChoice() != null) {
            _hashCode += getItemFulfillmentChoice().hashCode();
        }
        if (getItemRevision() != null) {
            _hashCode += getItemRevision().hashCode();
        }
        if (getItemSubOf() != null) {
            _hashCode += getItemSubOf().hashCode();
        }
        if (getLandedCostPerLine() != null) {
            _hashCode += getLandedCostPerLine().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLineUniqueKey() != null) {
            _hashCode += getLineUniqueKey().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLocationAutoAssigned() != null) {
            _hashCode += getLocationAutoAssigned().hashCode();
        }
        if (getMainLine() != null) {
            _hashCode += getMainLine().hashCode();
        }
        if (getMainName() != null) {
            _hashCode += getMainName().hashCode();
        }
        if (getManufacturingRouting() != null) {
            _hashCode += getManufacturingRouting().hashCode();
        }
        if (getMatchBillToReceipt() != null) {
            _hashCode += getMatchBillToReceipt().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getMemoMain() != null) {
            _hashCode += getMemoMain().hashCode();
        }
        if (getMemorized() != null) {
            _hashCode += getMemorized().hashCode();
        }
        if (getMerchantAccount() != null) {
            _hashCode += getMerchantAccount().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMultiSubsidiary() != null) {
            _hashCode += getMultiSubsidiary().hashCode();
        }
        if (getNameText() != null) {
            _hashCode += getNameText().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
        }
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        if (getNoAutoAssignLocation() != null) {
            _hashCode += getNoAutoAssignLocation().hashCode();
        }
        if (getNonReimbursable() != null) {
            _hashCode += getNonReimbursable().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOneTimeTotal() != null) {
            _hashCode += getOneTimeTotal().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getOrderPriority() != null) {
            _hashCode += getOrderPriority().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getOtherRefNumNonDeposit() != null) {
            _hashCode += getOtherRefNumNonDeposit().hashCode();
        }
        if (getOverheadParentItem() != null) {
            _hashCode += getOverheadParentItem().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getPaidTransaction() != null) {
            _hashCode += getPaidTransaction().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getPartnerContribution() != null) {
            _hashCode += getPartnerContribution().hashCode();
        }
        if (getPartnerRole() != null) {
            _hashCode += getPartnerRole().hashCode();
        }
        if (getPartnerTeamMember() != null) {
            _hashCode += getPartnerTeamMember().hashCode();
        }
        if (getPayingTransaction() != null) {
            _hashCode += getPayingTransaction().hashCode();
        }
        if (getPaymentApproved() != null) {
            _hashCode += getPaymentApproved().hashCode();
        }
        if (getPaymentEventDate() != null) {
            _hashCode += getPaymentEventDate().hashCode();
        }
        if (getPaymentEventHoldReason() != null) {
            _hashCode += getPaymentEventHoldReason().hashCode();
        }
        if (getPaymentEventPurchaseCardUsed() != null) {
            _hashCode += getPaymentEventPurchaseCardUsed().hashCode();
        }
        if (getPaymentEventPurchaseDataSent() != null) {
            _hashCode += getPaymentEventPurchaseDataSent().hashCode();
        }
        if (getPaymentEventResult() != null) {
            _hashCode += getPaymentEventResult().hashCode();
        }
        if (getPaymentEventType() != null) {
            _hashCode += getPaymentEventType().hashCode();
        }
        if (getPaymentHold() != null) {
            _hashCode += getPaymentHold().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getPaymentOption() != null) {
            _hashCode += getPaymentOption().hashCode();
        }
        if (getPayPalPending() != null) {
            _hashCode += getPayPalPending().hashCode();
        }
        if (getPayPalStatus() != null) {
            _hashCode += getPayPalStatus().hashCode();
        }
        if (getPayPalTranId() != null) {
            _hashCode += getPayPalTranId().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getPoAsText() != null) {
            _hashCode += getPoAsText().hashCode();
        }
        if (getPosting() != null) {
            _hashCode += getPosting().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPostingPeriodRelative() != null) {
            _hashCode += getPostingPeriodRelative().hashCode();
        }
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getPrintedPickingTicket() != null) {
            _hashCode += getPrintedPickingTicket().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProjectedAmount() != null) {
            _hashCode += getProjectedAmount().hashCode();
        }
        if (getProjectTask() != null) {
            _hashCode += getProjectTask().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getPurchaseOrder() != null) {
            _hashCode += getPurchaseOrder().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuantityBilled() != null) {
            _hashCode += getQuantityBilled().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityPacked() != null) {
            _hashCode += getQuantityPacked().hashCode();
        }
        if (getQuantityPicked() != null) {
            _hashCode += getQuantityPicked().hashCode();
        }
        if (getQuantityRevCommitted() != null) {
            _hashCode += getQuantityRevCommitted().hashCode();
        }
        if (getQuantityShipRecv() != null) {
            _hashCode += getQuantityShipRecv().hashCode();
        }
        if (getRecognizedRevenue() != null) {
            _hashCode += getRecognizedRevenue().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecurAnnuallyTotal() != null) {
            _hashCode += getRecurAnnuallyTotal().hashCode();
        }
        if (getRecurMonthlyTotal() != null) {
            _hashCode += getRecurMonthlyTotal().hashCode();
        }
        if (getRecurQuarterlyTotal() != null) {
            _hashCode += getRecurQuarterlyTotal().hashCode();
        }
        if (getRecurringBill() != null) {
            _hashCode += getRecurringBill().hashCode();
        }
        if (getRecurWeeklyTotal() != null) {
            _hashCode += getRecurWeeklyTotal().hashCode();
        }
        if (getRefNumber() != null) {
            _hashCode += getRefNumber().hashCode();
        }
        if (getRevCommitStatus() != null) {
            _hashCode += getRevCommitStatus().hashCode();
        }
        if (getRevCommittingStatus() != null) {
            _hashCode += getRevCommittingStatus().hashCode();
        }
        if (getRevCommittingTransaction() != null) {
            _hashCode += getRevCommittingTransaction().hashCode();
        }
        if (getRevenueStatus() != null) {
            _hashCode += getRevenueStatus().hashCode();
        }
        if (getReversalDate() != null) {
            _hashCode += getReversalDate().hashCode();
        }
        if (getReversalNumber() != null) {
            _hashCode += getReversalNumber().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getRevRecOnRevCommitment() != null) {
            _hashCode += getRevRecOnRevCommitment().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecTermInMonths() != null) {
            _hashCode += getRevRecTermInMonths().hashCode();
        }
        if (getSalesEffectiveDate() != null) {
            _hashCode += getSalesEffectiveDate().hashCode();
        }
        if (getSalesOrder() != null) {
            _hashCode += getSalesOrder().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getSalesTeamMember() != null) {
            _hashCode += getSalesTeamMember().hashCode();
        }
        if (getSalesTeamRole() != null) {
            _hashCode += getSalesTeamRole().hashCode();
        }
        if (getSchedulingMethod() != null) {
            _hashCode += getSchedulingMethod().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSerialNumberCost() != null) {
            _hashCode += getSerialNumberCost().hashCode();
        }
        if (getSerialNumberCostAdjustment() != null) {
            _hashCode += getSerialNumberCostAdjustment().hashCode();
        }
        if (getSerialNumberQuantity() != null) {
            _hashCode += getSerialNumberQuantity().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipAddressee() != null) {
            _hashCode += getShipAddressee().hashCode();
        }
        if (getShipAttention() != null) {
            _hashCode += getShipAttention().hashCode();
        }
        if (getShipCarrier() != null) {
            _hashCode += getShipCarrier().hashCode();
        }
        if (getShipCity() != null) {
            _hashCode += getShipCity().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getShipCountry() != null) {
            _hashCode += getShipCountry().hashCode();
        }
        if (getShipCounty() != null) {
            _hashCode += getShipCounty().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getShipGroup() != null) {
            _hashCode += getShipGroup().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getShipPhone() != null) {
            _hashCode += getShipPhone().hashCode();
        }
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getShipRecvStatus() != null) {
            _hashCode += getShipRecvStatus().hashCode();
        }
        if (getShipRecvStatusLine() != null) {
            _hashCode += getShipRecvStatusLine().hashCode();
        }
        if (getShipState() != null) {
            _hashCode += getShipState().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getShipZip() != null) {
            _hashCode += getShipZip().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatistical() != null) {
            _hashCode += getStatistical().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getSubscriptionLine() != null) {
            _hashCode += getSubscriptionLine().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getTaxLine() != null) {
            _hashCode += getTaxLine().hashCode();
        }
        if (getTaxPeriod() != null) {
            _hashCode += getTaxPeriod().hashCode();
        }
        if (getTaxPeriodRelative() != null) {
            _hashCode += getTaxPeriodRelative().hashCode();
        }
        if (getTaxPointDate() != null) {
            _hashCode += getTaxPointDate().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getTermsOfSale() != null) {
            _hashCode += getTermsOfSale().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getToBeEmailed() != null) {
            _hashCode += getToBeEmailed().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getToSubsidiary() != null) {
            _hashCode += getToSubsidiary().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getTranCostEstimate() != null) {
            _hashCode += getTranCostEstimate().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranEstGrossProfit() != null) {
            _hashCode += getTranEstGrossProfit().hashCode();
        }
        if (getTranEstGrossProfitPct() != null) {
            _hashCode += getTranEstGrossProfitPct().hashCode();
        }
        if (getTranFxEstGrossProfit() != null) {
            _hashCode += getTranFxEstGrossProfit().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getTransactionDiscount() != null) {
            _hashCode += getTransactionDiscount().hashCode();
        }
        if (getTransactionLineType() != null) {
            _hashCode += getTransactionLineType().hashCode();
        }
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        if (getTransferLocation() != null) {
            _hashCode += getTransferLocation().hashCode();
        }
        if (getTransferOrderQuantityCommitted() != null) {
            _hashCode += getTransferOrderQuantityCommitted().hashCode();
        }
        if (getTransferOrderQuantityPacked() != null) {
            _hashCode += getTransferOrderQuantityPacked().hashCode();
        }
        if (getTransferOrderQuantityPicked() != null) {
            _hashCode += getTransferOrderQuantityPicked().hashCode();
        }
        if (getTransferOrderQuantityReceived() != null) {
            _hashCode += getTransferOrderQuantityReceived().hashCode();
        }
        if (getTransferOrderQuantityShipped() != null) {
            _hashCode += getTransferOrderQuantityShipped().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getUnitCostOverride() != null) {
            _hashCode += getUnitCostOverride().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getVendType() != null) {
            _hashCode += getVendType().hashCode();
        }
        if (getVisibleToCustomer() != null) {
            _hashCode += getVisibleToCustomer().hashCode();
        }
        if (getVoided() != null) {
            _hashCode += getVoided().hashCode();
        }
        if (getVsoeAllocation() != null) {
            _hashCode += getVsoeAllocation().hashCode();
        }
        if (getVsoeAmount() != null) {
            _hashCode += getVsoeAmount().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getWebSite() != null) {
            _hashCode += getWebSite().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctCorpCardExp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "acctCorpCardExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUnbilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountUnbilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "anyLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "avsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "avsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookSpecificTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bookSpecificTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "built"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canHaveStackablePromotions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "canHaveStackablePromotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleared");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cleared"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cogs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "commissionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "confirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentStandardCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentStandardCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSubOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customerSubOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "depositDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "depositTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromRateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeFromRateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("finChrg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "finChrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fulfillingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxCostEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxVsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxVsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxVsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailabelToCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvailabelToCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailableToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvailableToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerAccountAge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoBuyerAccountAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoBuyerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargebackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoChargebackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedChargedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoConfirmedChargedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedRefundedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoConfirmedRefundedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCreditcardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoCreditcardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoCscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFinancialState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoFinancialState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFulfillmentState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoFulfillmentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoOrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoPromotionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoPromotionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoShippingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoShippingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoStateChangedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoStateChangedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeInForecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoTransaction"));
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
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventorySubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBackflush");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBackflush"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoChargeback"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoChargeConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoPaymentGuaranteed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoPaymentGuaranteed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoRefundConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoRefundConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInsideDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInsideDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInsidePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInsidePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIntercompanyAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isIntercompanyAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInTransitPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInTransitPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPayPalMeth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPayPalMeth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReversal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isReversal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRevRecTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isRevRecTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isScrap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isScrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTransferPriceCosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isTransferPriceCosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoeAlloc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isVsoeAlloc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFulfillmentChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemFulfillmentChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSubOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemSubOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAutoAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAutoAssigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingRouting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingRouting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoMain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memoMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nameText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noAutoAssignLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "noAutoAssignLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonReimbursable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nonReimbursable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "oneTimeTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNumNonDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherRefNumNonDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overheadParentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overheadParentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "packageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventPurchaseCardUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventPurchaseCardUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventPurchaseDataSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventPurchaseDataSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payPalPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poAsText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "poAsText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printedPickingTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "printedPickingTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShipRecv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityShipRecv"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurAnnuallyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurAnnuallyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurMonthlyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurMonthlyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurQuarterlyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurQuarterlyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringBill");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurringBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurWeeklyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurWeeklyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "refNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revCommittingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revCommittingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reversalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberCostAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberCostAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipRecvStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipRecvStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipRecvStatusLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipRecvStatusLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "statistical"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsOfSale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "termsOfSale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionLineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitCostOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voided");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "voided"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
