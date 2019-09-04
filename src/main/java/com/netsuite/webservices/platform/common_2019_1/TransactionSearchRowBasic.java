/**
 * TransactionSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class TransactionSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] abbrev;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] accountType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] acctCorpCardExp;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualShipDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesNetAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountPaid;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountRemaining;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountUnbilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] appliedToForeignAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] appliedToIsFxVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] appliedToLinkAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] appliedToLinkType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] appliedToTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] applyingForeignAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] applyingIsFxVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] applyingLinkAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] applyingLinkType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] applyingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] approvalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] authCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoCalculateLag;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] avsStreetMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] avsZipMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] billable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] billCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCountryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] billedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] billingAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingSchedule;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] billVarianceStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] binNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] binNumberQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] buildEntireAssembly;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] buildVariance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] built;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] canHaveStackablePromotions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] catchUpPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccCustomerCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccExpDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccHolderName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccStreet;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccZipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] cleared;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] closed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closeDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cogsAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] commissionEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] commit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] confirmationNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costComponentAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] costComponentCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] costComponentItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costComponentQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costComponentStandardCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costEstimateRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costEstimateType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] createdBy;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] createdFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] cscMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customForm;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customGL;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] custType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOpen;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] debitAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] deferredRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] depositDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] depositTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] docUnit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] drAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dueDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] effectiveRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estGrossProfitPct;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estGrossProfitPercent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeCommission;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromRateRequest;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedCloseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedReceiptDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseCategory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expenseDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] firmed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] forecastType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fulfillingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fxAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxCostEstimateRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxTranCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxVsoeAllocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxVsoeAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxVsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcoAvailabelToCharge;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcoAvailableToRefund;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] gcoAvsStreetMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] gcoAvsZipMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] gcoBuyerAccountAge;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoBuyerIp;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoChargeAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoChargebackAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoConfirmedChargedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoConfirmedRefundedTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoCreditcardNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] gcoCscMatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoFinancialState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoFulfillmentState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoOrderId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoOrderTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoPromotionAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoPromotionName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoRefundAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoShippingTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoStateChangedDetail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCert;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeInForecast;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] intercoStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] intercoTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventorySubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAllocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBackflush;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoChargeback;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoChargeConfirmed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoPaymentGuaranteed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoRefundConfirmed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInsideDelivery;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInsidePickup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isIntercompanyAdjustment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInTransitPayment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMultiShipTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isReversal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isRevRecTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isScrap;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTransferPriceCosting;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] itemFulfillmentChoice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemRevision;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] landedCostPerLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] line;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineSequenceNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineUniqueKey;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locationAutoAssigned;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] mainLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mainName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingRouting;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] matchBillToReceipt;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memoMain;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] memorized;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] merchantAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multiSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmountNoTax;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextBillDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] noAutoAssignLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nonReimbursable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] oneTimeTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] opportunity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] options;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] orderPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] originator;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnTextNumberField[] otherRefNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] overheadParentItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] packageCount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] paidAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] paidTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] payingAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentApproved;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] paymentEventDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] paymentEventHoldReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentEventPurchaseCardUsed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentEventPurchaseDataSent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] paymentEventResult;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] paymentEventType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] paymentMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] paymentOption;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] payPalPending;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] payPalStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] payPalTranId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] payrollBatch;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pnRefNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] posting;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] print;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] probability;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projectedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] projectTask;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] promoCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBilled;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityPacked;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityPicked;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRevCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityShipRecv;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] realizedGainPostingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recognizedRevenue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recordType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurAnnuallyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurMonthlyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurQuarterlyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] recurringBill;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurWeeklyTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] refNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revCommitStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revCommittingTransaction;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revenueStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] reversalDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] reversalNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] revRecOnRevCommitment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecStartDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] rgAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rgAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] salesEffectiveDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesOrder;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] schedulingMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] serialNumberCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] serialNumberCostAdjustment;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] serialNumberQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumbers;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCarrier;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCountryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] shipDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] shipGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipMethod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] shippingAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipRecvStatusLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipTo;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] signedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] source;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscriptionLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxPeriod;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] taxPointDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxTotal;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] termInMonths;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] terms;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] termsOfSale;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] toBeEmailed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] toBePrinted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] toSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] total;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalCostEstimate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] trackingNumbers;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] tranDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranFxEstGrossProfit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] tranIsVsoeBundle;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] transactionDiscount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] transactionLineType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] transactionNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transferLocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] transferOrderItemLine;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityCommitted;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityPacked;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityPicked;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityReceived;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityShipped;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] unit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCostOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] visibleToCustomer;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAllocation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoeDeferral;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] vsoeDelivered;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoePermitDiscount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoePrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] webSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public TransactionSearchRowBasic() {
    }


    /**
     * Gets the abbrev value for this TransactionSearchRowBasic.
     * 
     * @return abbrev
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAbbrev() {
        return abbrev;
    }


    /**
     * Sets the abbrev value for this TransactionSearchRowBasic.
     * 
     * @param abbrev
     */
    public void setAbbrev(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] abbrev) {
        this.abbrev = abbrev;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAbbrev(int i) {
        return this.abbrev[i];
    }

    public void setAbbrev(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.abbrev[i] = _value;
    }


    /**
     * Gets the account value for this TransactionSearchRowBasic.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TransactionSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] account) {
        this.account = account;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the accountType value for this TransactionSearchRowBasic.
     * 
     * @return accountType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this TransactionSearchRowBasic.
     * 
     * @param accountType
     */
    public void setAccountType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] accountType) {
        this.accountType = accountType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.accountType[i] = _value;
    }


    /**
     * Gets the acctCorpCardExp value for this TransactionSearchRowBasic.
     * 
     * @return acctCorpCardExp
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAcctCorpCardExp() {
        return acctCorpCardExp;
    }


    /**
     * Sets the acctCorpCardExp value for this TransactionSearchRowBasic.
     * 
     * @param acctCorpCardExp
     */
    public void setAcctCorpCardExp(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] acctCorpCardExp) {
        this.acctCorpCardExp = acctCorpCardExp;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAcctCorpCardExp(int i) {
        return this.acctCorpCardExp[i];
    }

    public void setAcctCorpCardExp(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.acctCorpCardExp[i] = _value;
    }


    /**
     * Gets the actualShipDate value for this TransactionSearchRowBasic.
     * 
     * @return actualShipDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getActualShipDate() {
        return actualShipDate;
    }


    /**
     * Sets the actualShipDate value for this TransactionSearchRowBasic.
     * 
     * @param actualShipDate
     */
    public void setActualShipDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] actualShipDate) {
        this.actualShipDate = actualShipDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getActualShipDate(int i) {
        return this.actualShipDate[i];
    }

    public void setActualShipDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.actualShipDate[i] = _value;
    }


    /**
     * Gets the altSalesAmount value for this TransactionSearchRowBasic.
     * 
     * @return altSalesAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAltSalesAmount() {
        return altSalesAmount;
    }


    /**
     * Sets the altSalesAmount value for this TransactionSearchRowBasic.
     * 
     * @param altSalesAmount
     */
    public void setAltSalesAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAltSalesAmount(int i) {
        return this.altSalesAmount[i];
    }

    public void setAltSalesAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.altSalesAmount[i] = _value;
    }


    /**
     * Gets the altSalesNetAmount value for this TransactionSearchRowBasic.
     * 
     * @return altSalesNetAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAltSalesNetAmount() {
        return altSalesNetAmount;
    }


    /**
     * Sets the altSalesNetAmount value for this TransactionSearchRowBasic.
     * 
     * @param altSalesNetAmount
     */
    public void setAltSalesNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAltSalesNetAmount(int i) {
        return this.altSalesNetAmount[i];
    }

    public void setAltSalesNetAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.altSalesNetAmount[i] = _value;
    }


    /**
     * Gets the amount value for this TransactionSearchRowBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the amountPaid value for this TransactionSearchRowBasic.
     * 
     * @return amountPaid
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this TransactionSearchRowBasic.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountPaid) {
        this.amountPaid = amountPaid;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmountPaid(int i) {
        return this.amountPaid[i];
    }

    public void setAmountPaid(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amountPaid[i] = _value;
    }


    /**
     * Gets the amountRemaining value for this TransactionSearchRowBasic.
     * 
     * @return amountRemaining
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this TransactionSearchRowBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }


    /**
     * Gets the amountUnbilled value for this TransactionSearchRowBasic.
     * 
     * @return amountUnbilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAmountUnbilled() {
        return amountUnbilled;
    }


    /**
     * Sets the amountUnbilled value for this TransactionSearchRowBasic.
     * 
     * @param amountUnbilled
     */
    public void setAmountUnbilled(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] amountUnbilled) {
        this.amountUnbilled = amountUnbilled;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAmountUnbilled(int i) {
        return this.amountUnbilled[i];
    }

    public void setAmountUnbilled(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.amountUnbilled[i] = _value;
    }


    /**
     * Gets the appliedToForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @return appliedToForeignAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAppliedToForeignAmount() {
        return appliedToForeignAmount;
    }


    /**
     * Sets the appliedToForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @param appliedToForeignAmount
     */
    public void setAppliedToForeignAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] appliedToForeignAmount) {
        this.appliedToForeignAmount = appliedToForeignAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAppliedToForeignAmount(int i) {
        return this.appliedToForeignAmount[i];
    }

    public void setAppliedToForeignAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.appliedToForeignAmount[i] = _value;
    }


    /**
     * Gets the appliedToIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @return appliedToIsFxVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAppliedToIsFxVariance() {
        return appliedToIsFxVariance;
    }


    /**
     * Sets the appliedToIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @param appliedToIsFxVariance
     */
    public void setAppliedToIsFxVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] appliedToIsFxVariance) {
        this.appliedToIsFxVariance = appliedToIsFxVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAppliedToIsFxVariance(int i) {
        return this.appliedToIsFxVariance[i];
    }

    public void setAppliedToIsFxVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.appliedToIsFxVariance[i] = _value;
    }


    /**
     * Gets the appliedToLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @return appliedToLinkAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getAppliedToLinkAmount() {
        return appliedToLinkAmount;
    }


    /**
     * Sets the appliedToLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @param appliedToLinkAmount
     */
    public void setAppliedToLinkAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] appliedToLinkAmount) {
        this.appliedToLinkAmount = appliedToLinkAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getAppliedToLinkAmount(int i) {
        return this.appliedToLinkAmount[i];
    }

    public void setAppliedToLinkAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.appliedToLinkAmount[i] = _value;
    }


    /**
     * Gets the appliedToLinkType value for this TransactionSearchRowBasic.
     * 
     * @return appliedToLinkType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAppliedToLinkType() {
        return appliedToLinkType;
    }


    /**
     * Sets the appliedToLinkType value for this TransactionSearchRowBasic.
     * 
     * @param appliedToLinkType
     */
    public void setAppliedToLinkType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] appliedToLinkType) {
        this.appliedToLinkType = appliedToLinkType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAppliedToLinkType(int i) {
        return this.appliedToLinkType[i];
    }

    public void setAppliedToLinkType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.appliedToLinkType[i] = _value;
    }


    /**
     * Gets the appliedToTransaction value for this TransactionSearchRowBasic.
     * 
     * @return appliedToTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAppliedToTransaction() {
        return appliedToTransaction;
    }


    /**
     * Sets the appliedToTransaction value for this TransactionSearchRowBasic.
     * 
     * @param appliedToTransaction
     */
    public void setAppliedToTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] appliedToTransaction) {
        this.appliedToTransaction = appliedToTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAppliedToTransaction(int i) {
        return this.appliedToTransaction[i];
    }

    public void setAppliedToTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.appliedToTransaction[i] = _value;
    }


    /**
     * Gets the applyingForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @return applyingForeignAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getApplyingForeignAmount() {
        return applyingForeignAmount;
    }


    /**
     * Sets the applyingForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @param applyingForeignAmount
     */
    public void setApplyingForeignAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] applyingForeignAmount) {
        this.applyingForeignAmount = applyingForeignAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getApplyingForeignAmount(int i) {
        return this.applyingForeignAmount[i];
    }

    public void setApplyingForeignAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.applyingForeignAmount[i] = _value;
    }


    /**
     * Gets the applyingIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @return applyingIsFxVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getApplyingIsFxVariance() {
        return applyingIsFxVariance;
    }


    /**
     * Sets the applyingIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @param applyingIsFxVariance
     */
    public void setApplyingIsFxVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] applyingIsFxVariance) {
        this.applyingIsFxVariance = applyingIsFxVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getApplyingIsFxVariance(int i) {
        return this.applyingIsFxVariance[i];
    }

    public void setApplyingIsFxVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.applyingIsFxVariance[i] = _value;
    }


    /**
     * Gets the applyingLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @return applyingLinkAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getApplyingLinkAmount() {
        return applyingLinkAmount;
    }


    /**
     * Sets the applyingLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @param applyingLinkAmount
     */
    public void setApplyingLinkAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] applyingLinkAmount) {
        this.applyingLinkAmount = applyingLinkAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getApplyingLinkAmount(int i) {
        return this.applyingLinkAmount[i];
    }

    public void setApplyingLinkAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.applyingLinkAmount[i] = _value;
    }


    /**
     * Gets the applyingLinkType value for this TransactionSearchRowBasic.
     * 
     * @return applyingLinkType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getApplyingLinkType() {
        return applyingLinkType;
    }


    /**
     * Sets the applyingLinkType value for this TransactionSearchRowBasic.
     * 
     * @param applyingLinkType
     */
    public void setApplyingLinkType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] applyingLinkType) {
        this.applyingLinkType = applyingLinkType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getApplyingLinkType(int i) {
        return this.applyingLinkType[i];
    }

    public void setApplyingLinkType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.applyingLinkType[i] = _value;
    }


    /**
     * Gets the applyingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return applyingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getApplyingTransaction() {
        return applyingTransaction;
    }


    /**
     * Sets the applyingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param applyingTransaction
     */
    public void setApplyingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getApplyingTransaction(int i) {
        return this.applyingTransaction[i];
    }

    public void setApplyingTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.applyingTransaction[i] = _value;
    }


    /**
     * Gets the approvalStatus value for this TransactionSearchRowBasic.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this TransactionSearchRowBasic.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getApprovalStatus(int i) {
        return this.approvalStatus[i];
    }

    public void setApprovalStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.approvalStatus[i] = _value;
    }


    /**
     * Gets the authCode value for this TransactionSearchRowBasic.
     * 
     * @return authCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this TransactionSearchRowBasic.
     * 
     * @param authCode
     */
    public void setAuthCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] authCode) {
        this.authCode = authCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAuthCode(int i) {
        return this.authCode[i];
    }

    public void setAuthCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.authCode[i] = _value;
    }


    /**
     * Gets the autoCalculateLag value for this TransactionSearchRowBasic.
     * 
     * @return autoCalculateLag
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this TransactionSearchRowBasic.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAutoCalculateLag(int i) {
        return this.autoCalculateLag[i];
    }

    public void setAutoCalculateLag(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.autoCalculateLag[i] = _value;
    }


    /**
     * Gets the avsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @return avsStreetMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAvsStreetMatch() {
        return avsStreetMatch;
    }


    /**
     * Sets the avsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @param avsStreetMatch
     */
    public void setAvsStreetMatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] avsStreetMatch) {
        this.avsStreetMatch = avsStreetMatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAvsStreetMatch(int i) {
        return this.avsStreetMatch[i];
    }

    public void setAvsStreetMatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.avsStreetMatch[i] = _value;
    }


    /**
     * Gets the avsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @return avsZipMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getAvsZipMatch() {
        return avsZipMatch;
    }


    /**
     * Sets the avsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @param avsZipMatch
     */
    public void setAvsZipMatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] avsZipMatch) {
        this.avsZipMatch = avsZipMatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getAvsZipMatch(int i) {
        return this.avsZipMatch[i];
    }

    public void setAvsZipMatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.avsZipMatch[i] = _value;
    }


    /**
     * Gets the billable value for this TransactionSearchRowBasic.
     * 
     * @return billable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TransactionSearchRowBasic.
     * 
     * @param billable
     */
    public void setBillable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] billable) {
        this.billable = billable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getBillable(int i) {
        return this.billable[i];
    }

    public void setBillable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.billable[i] = _value;
    }


    /**
     * Gets the billAddress value for this TransactionSearchRowBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this TransactionSearchRowBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress) {
        this.billAddress = billAddress;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillAddress(int i) {
        return this.billAddress[i];
    }

    public void setBillAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billAddress[i] = _value;
    }


    /**
     * Gets the billAddress1 value for this TransactionSearchRowBasic.
     * 
     * @return billAddress1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this TransactionSearchRowBasic.
     * 
     * @param billAddress1
     */
    public void setBillAddress1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress1) {
        this.billAddress1 = billAddress1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillAddress1(int i) {
        return this.billAddress1[i];
    }

    public void setBillAddress1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billAddress1[i] = _value;
    }


    /**
     * Gets the billAddress2 value for this TransactionSearchRowBasic.
     * 
     * @return billAddress2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this TransactionSearchRowBasic.
     * 
     * @param billAddress2
     */
    public void setBillAddress2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress2) {
        this.billAddress2 = billAddress2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillAddress2(int i) {
        return this.billAddress2[i];
    }

    public void setBillAddress2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billAddress2[i] = _value;
    }


    /**
     * Gets the billAddress3 value for this TransactionSearchRowBasic.
     * 
     * @return billAddress3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress3() {
        return billAddress3;
    }


    /**
     * Sets the billAddress3 value for this TransactionSearchRowBasic.
     * 
     * @param billAddress3
     */
    public void setBillAddress3(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress3) {
        this.billAddress3 = billAddress3;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillAddress3(int i) {
        return this.billAddress3[i];
    }

    public void setBillAddress3(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billAddress3[i] = _value;
    }


    /**
     * Gets the billAddressee value for this TransactionSearchRowBasic.
     * 
     * @return billAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this TransactionSearchRowBasic.
     * 
     * @param billAddressee
     */
    public void setBillAddressee(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddressee) {
        this.billAddressee = billAddressee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillAddressee(int i) {
        return this.billAddressee[i];
    }

    public void setBillAddressee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billAddressee[i] = _value;
    }


    /**
     * Gets the billAttention value for this TransactionSearchRowBasic.
     * 
     * @return billAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this TransactionSearchRowBasic.
     * 
     * @param billAttention
     */
    public void setBillAttention(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAttention) {
        this.billAttention = billAttention;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillAttention(int i) {
        return this.billAttention[i];
    }

    public void setBillAttention(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billAttention[i] = _value;
    }


    /**
     * Gets the billCity value for this TransactionSearchRowBasic.
     * 
     * @return billCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this TransactionSearchRowBasic.
     * 
     * @param billCity
     */
    public void setBillCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCity) {
        this.billCity = billCity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillCity(int i) {
        return this.billCity[i];
    }

    public void setBillCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billCity[i] = _value;
    }


    /**
     * Gets the billCountry value for this TransactionSearchRowBasic.
     * 
     * @return billCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this TransactionSearchRowBasic.
     * 
     * @param billCountry
     */
    public void setBillCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] billCountry) {
        this.billCountry = billCountry;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getBillCountry(int i) {
        return this.billCountry[i];
    }

    public void setBillCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.billCountry[i] = _value;
    }


    /**
     * Gets the billCountryCode value for this TransactionSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this TransactionSearchRowBasic.
     * 
     * @param billCountryCode
     */
    public void setBillCountryCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillCountryCode(int i) {
        return this.billCountryCode[i];
    }

    public void setBillCountryCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billCountryCode[i] = _value;
    }


    /**
     * Gets the billedDate value for this TransactionSearchRowBasic.
     * 
     * @return billedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getBilledDate() {
        return billedDate;
    }


    /**
     * Sets the billedDate value for this TransactionSearchRowBasic.
     * 
     * @param billedDate
     */
    public void setBilledDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] billedDate) {
        this.billedDate = billedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getBilledDate(int i) {
        return this.billedDate[i];
    }

    public void setBilledDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.billedDate[i] = _value;
    }


    /**
     * Gets the billingAccount value for this TransactionSearchRowBasic.
     * 
     * @return billingAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this TransactionSearchRowBasic.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingAccount) {
        this.billingAccount = billingAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingAccount(int i) {
        return this.billingAccount[i];
    }

    public void setBillingAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingAccount[i] = _value;
    }


    /**
     * Gets the billingAmount value for this TransactionSearchRowBasic.
     * 
     * @return billingAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBillingAmount() {
        return billingAmount;
    }


    /**
     * Sets the billingAmount value for this TransactionSearchRowBasic.
     * 
     * @param billingAmount
     */
    public void setBillingAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] billingAmount) {
        this.billingAmount = billingAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBillingAmount(int i) {
        return this.billingAmount[i];
    }

    public void setBillingAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.billingAmount[i] = _value;
    }


    /**
     * Gets the billingSchedule value for this TransactionSearchRowBasic.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this TransactionSearchRowBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingSchedule(int i) {
        return this.billingSchedule[i];
    }

    public void setBillingSchedule(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingSchedule[i] = _value;
    }


    /**
     * Gets the billingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return billingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getBillingTransaction() {
        return billingTransaction;
    }


    /**
     * Sets the billingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param billingTransaction
     */
    public void setBillingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] billingTransaction) {
        this.billingTransaction = billingTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getBillingTransaction(int i) {
        return this.billingTransaction[i];
    }

    public void setBillingTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.billingTransaction[i] = _value;
    }


    /**
     * Gets the billPhone value for this TransactionSearchRowBasic.
     * 
     * @return billPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this TransactionSearchRowBasic.
     * 
     * @param billPhone
     */
    public void setBillPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billPhone) {
        this.billPhone = billPhone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillPhone(int i) {
        return this.billPhone[i];
    }

    public void setBillPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billPhone[i] = _value;
    }


    /**
     * Gets the billState value for this TransactionSearchRowBasic.
     * 
     * @return billState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this TransactionSearchRowBasic.
     * 
     * @param billState
     */
    public void setBillState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billState) {
        this.billState = billState;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillState(int i) {
        return this.billState[i];
    }

    public void setBillState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billState[i] = _value;
    }


    /**
     * Gets the billVarianceStatus value for this TransactionSearchRowBasic.
     * 
     * @return billVarianceStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getBillVarianceStatus() {
        return billVarianceStatus;
    }


    /**
     * Sets the billVarianceStatus value for this TransactionSearchRowBasic.
     * 
     * @param billVarianceStatus
     */
    public void setBillVarianceStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getBillVarianceStatus(int i) {
        return this.billVarianceStatus[i];
    }

    public void setBillVarianceStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.billVarianceStatus[i] = _value;
    }


    /**
     * Gets the billZip value for this TransactionSearchRowBasic.
     * 
     * @return billZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillZip() {
        return billZip;
    }


    /**
     * Sets the billZip value for this TransactionSearchRowBasic.
     * 
     * @param billZip
     */
    public void setBillZip(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billZip) {
        this.billZip = billZip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillZip(int i) {
        return this.billZip[i];
    }

    public void setBillZip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billZip[i] = _value;
    }


    /**
     * Gets the binNumber value for this TransactionSearchRowBasic.
     * 
     * @return binNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this TransactionSearchRowBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }


    /**
     * Gets the binNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @return binNumberQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBinNumberQuantity() {
        return binNumberQuantity;
    }


    /**
     * Sets the binNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @param binNumberQuantity
     */
    public void setBinNumberQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] binNumberQuantity) {
        this.binNumberQuantity = binNumberQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBinNumberQuantity(int i) {
        return this.binNumberQuantity[i];
    }

    public void setBinNumberQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.binNumberQuantity[i] = _value;
    }


    /**
     * Gets the bomQuantity value for this TransactionSearchRowBasic.
     * 
     * @return bomQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBomQuantity() {
        return bomQuantity;
    }


    /**
     * Sets the bomQuantity value for this TransactionSearchRowBasic.
     * 
     * @param bomQuantity
     */
    public void setBomQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBomQuantity(int i) {
        return this.bomQuantity[i];
    }

    public void setBomQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.bomQuantity[i] = _value;
    }


    /**
     * Gets the buildEntireAssembly value for this TransactionSearchRowBasic.
     * 
     * @return buildEntireAssembly
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this TransactionSearchRowBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getBuildEntireAssembly(int i) {
        return this.buildEntireAssembly[i];
    }

    public void setBuildEntireAssembly(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.buildEntireAssembly[i] = _value;
    }


    /**
     * Gets the buildVariance value for this TransactionSearchRowBasic.
     * 
     * @return buildVariance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBuildVariance() {
        return buildVariance;
    }


    /**
     * Sets the buildVariance value for this TransactionSearchRowBasic.
     * 
     * @param buildVariance
     */
    public void setBuildVariance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] buildVariance) {
        this.buildVariance = buildVariance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBuildVariance(int i) {
        return this.buildVariance[i];
    }

    public void setBuildVariance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.buildVariance[i] = _value;
    }


    /**
     * Gets the built value for this TransactionSearchRowBasic.
     * 
     * @return built
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBuilt() {
        return built;
    }


    /**
     * Sets the built value for this TransactionSearchRowBasic.
     * 
     * @param built
     */
    public void setBuilt(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] built) {
        this.built = built;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBuilt(int i) {
        return this.built[i];
    }

    public void setBuilt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.built[i] = _value;
    }


    /**
     * Gets the canHaveStackablePromotions value for this TransactionSearchRowBasic.
     * 
     * @return canHaveStackablePromotions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCanHaveStackablePromotions() {
        return canHaveStackablePromotions;
    }


    /**
     * Sets the canHaveStackablePromotions value for this TransactionSearchRowBasic.
     * 
     * @param canHaveStackablePromotions
     */
    public void setCanHaveStackablePromotions(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] canHaveStackablePromotions) {
        this.canHaveStackablePromotions = canHaveStackablePromotions;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCanHaveStackablePromotions(int i) {
        return this.canHaveStackablePromotions[i];
    }

    public void setCanHaveStackablePromotions(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.canHaveStackablePromotions[i] = _value;
    }


    /**
     * Gets the catchUpPeriod value for this TransactionSearchRowBasic.
     * 
     * @return catchUpPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCatchUpPeriod() {
        return catchUpPeriod;
    }


    /**
     * Sets the catchUpPeriod value for this TransactionSearchRowBasic.
     * 
     * @param catchUpPeriod
     */
    public void setCatchUpPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCatchUpPeriod(int i) {
        return this.catchUpPeriod[i];
    }

    public void setCatchUpPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.catchUpPeriod[i] = _value;
    }


    /**
     * Gets the ccCustomerCode value for this TransactionSearchRowBasic.
     * 
     * @return ccCustomerCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this TransactionSearchRowBasic.
     * 
     * @param ccCustomerCode
     */
    public void setCcCustomerCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCcCustomerCode(int i) {
        return this.ccCustomerCode[i];
    }

    public void setCcCustomerCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.ccCustomerCode[i] = _value;
    }


    /**
     * Gets the ccExpDate value for this TransactionSearchRowBasic.
     * 
     * @return ccExpDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCcExpDate() {
        return ccExpDate;
    }


    /**
     * Sets the ccExpDate value for this TransactionSearchRowBasic.
     * 
     * @param ccExpDate
     */
    public void setCcExpDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccExpDate) {
        this.ccExpDate = ccExpDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCcExpDate(int i) {
        return this.ccExpDate[i];
    }

    public void setCcExpDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.ccExpDate[i] = _value;
    }


    /**
     * Gets the ccHolderName value for this TransactionSearchRowBasic.
     * 
     * @return ccHolderName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcHolderName() {
        return ccHolderName;
    }


    /**
     * Sets the ccHolderName value for this TransactionSearchRowBasic.
     * 
     * @param ccHolderName
     */
    public void setCcHolderName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccHolderName) {
        this.ccHolderName = ccHolderName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCcHolderName(int i) {
        return this.ccHolderName[i];
    }

    public void setCcHolderName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.ccHolderName[i] = _value;
    }


    /**
     * Gets the ccNumber value for this TransactionSearchRowBasic.
     * 
     * @return ccNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this TransactionSearchRowBasic.
     * 
     * @param ccNumber
     */
    public void setCcNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccNumber) {
        this.ccNumber = ccNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCcNumber(int i) {
        return this.ccNumber[i];
    }

    public void setCcNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.ccNumber[i] = _value;
    }


    /**
     * Gets the ccStreet value for this TransactionSearchRowBasic.
     * 
     * @return ccStreet
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this TransactionSearchRowBasic.
     * 
     * @param ccStreet
     */
    public void setCcStreet(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccStreet) {
        this.ccStreet = ccStreet;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCcStreet(int i) {
        return this.ccStreet[i];
    }

    public void setCcStreet(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.ccStreet[i] = _value;
    }


    /**
     * Gets the ccZipCode value for this TransactionSearchRowBasic.
     * 
     * @return ccZipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this TransactionSearchRowBasic.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccZipCode) {
        this.ccZipCode = ccZipCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCcZipCode(int i) {
        return this.ccZipCode[i];
    }

    public void setCcZipCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.ccZipCode[i] = _value;
    }


    /**
     * Gets the _class value for this TransactionSearchRowBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TransactionSearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the cleared value for this TransactionSearchRowBasic.
     * 
     * @return cleared
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCleared() {
        return cleared;
    }


    /**
     * Sets the cleared value for this TransactionSearchRowBasic.
     * 
     * @param cleared
     */
    public void setCleared(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] cleared) {
        this.cleared = cleared;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCleared(int i) {
        return this.cleared[i];
    }

    public void setCleared(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.cleared[i] = _value;
    }


    /**
     * Gets the closed value for this TransactionSearchRowBasic.
     * 
     * @return closed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this TransactionSearchRowBasic.
     * 
     * @param closed
     */
    public void setClosed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.closed[i] = _value;
    }


    /**
     * Gets the closeDate value for this TransactionSearchRowBasic.
     * 
     * @return closeDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this TransactionSearchRowBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] closeDate) {
        this.closeDate = closeDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCloseDate(int i) {
        return this.closeDate[i];
    }

    public void setCloseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.closeDate[i] = _value;
    }


    /**
     * Gets the cogsAmount value for this TransactionSearchRowBasic.
     * 
     * @return cogsAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCogsAmount() {
        return cogsAmount;
    }


    /**
     * Sets the cogsAmount value for this TransactionSearchRowBasic.
     * 
     * @param cogsAmount
     */
    public void setCogsAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] cogsAmount) {
        this.cogsAmount = cogsAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCogsAmount(int i) {
        return this.cogsAmount[i];
    }

    public void setCogsAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.cogsAmount[i] = _value;
    }


    /**
     * Gets the commissionEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @return commissionEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCommissionEffectiveDate() {
        return commissionEffectiveDate;
    }


    /**
     * Sets the commissionEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @param commissionEffectiveDate
     */
    public void setCommissionEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] commissionEffectiveDate) {
        this.commissionEffectiveDate = commissionEffectiveDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCommissionEffectiveDate(int i) {
        return this.commissionEffectiveDate[i];
    }

    public void setCommissionEffectiveDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.commissionEffectiveDate[i] = _value;
    }


    /**
     * Gets the commit value for this TransactionSearchRowBasic.
     * 
     * @return commit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this TransactionSearchRowBasic.
     * 
     * @param commit
     */
    public void setCommit(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] commit) {
        this.commit = commit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCommit(int i) {
        return this.commit[i];
    }

    public void setCommit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.commit[i] = _value;
    }


    /**
     * Gets the componentYield value for this TransactionSearchRowBasic.
     * 
     * @return componentYield
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getComponentYield() {
        return componentYield;
    }


    /**
     * Sets the componentYield value for this TransactionSearchRowBasic.
     * 
     * @param componentYield
     */
    public void setComponentYield(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] componentYield) {
        this.componentYield = componentYield;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getComponentYield(int i) {
        return this.componentYield[i];
    }

    public void setComponentYield(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.componentYield[i] = _value;
    }


    /**
     * Gets the confirmationNumber value for this TransactionSearchRowBasic.
     * 
     * @return confirmationNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this TransactionSearchRowBasic.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getConfirmationNumber(int i) {
        return this.confirmationNumber[i];
    }

    public void setConfirmationNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.confirmationNumber[i] = _value;
    }


    /**
     * Gets the contribution value for this TransactionSearchRowBasic.
     * 
     * @return contribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this TransactionSearchRowBasic.
     * 
     * @param contribution
     */
    public void setContribution(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution) {
        this.contribution = contribution;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getContribution(int i) {
        return this.contribution[i];
    }

    public void setContribution(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.contribution[i] = _value;
    }


    /**
     * Gets the contributionPrimary value for this TransactionSearchRowBasic.
     * 
     * @return contributionPrimary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getContributionPrimary() {
        return contributionPrimary;
    }


    /**
     * Sets the contributionPrimary value for this TransactionSearchRowBasic.
     * 
     * @param contributionPrimary
     */
    public void setContributionPrimary(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary) {
        this.contributionPrimary = contributionPrimary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getContributionPrimary(int i) {
        return this.contributionPrimary[i];
    }

    public void setContributionPrimary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.contributionPrimary[i] = _value;
    }


    /**
     * Gets the costComponentAmount value for this TransactionSearchRowBasic.
     * 
     * @return costComponentAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostComponentAmount() {
        return costComponentAmount;
    }


    /**
     * Sets the costComponentAmount value for this TransactionSearchRowBasic.
     * 
     * @param costComponentAmount
     */
    public void setCostComponentAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costComponentAmount) {
        this.costComponentAmount = costComponentAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostComponentAmount(int i) {
        return this.costComponentAmount[i];
    }

    public void setCostComponentAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costComponentAmount[i] = _value;
    }


    /**
     * Gets the costComponentCategory value for this TransactionSearchRowBasic.
     * 
     * @return costComponentCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCostComponentCategory() {
        return costComponentCategory;
    }


    /**
     * Sets the costComponentCategory value for this TransactionSearchRowBasic.
     * 
     * @param costComponentCategory
     */
    public void setCostComponentCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] costComponentCategory) {
        this.costComponentCategory = costComponentCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCostComponentCategory(int i) {
        return this.costComponentCategory[i];
    }

    public void setCostComponentCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.costComponentCategory[i] = _value;
    }


    /**
     * Gets the costComponentItem value for this TransactionSearchRowBasic.
     * 
     * @return costComponentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCostComponentItem() {
        return costComponentItem;
    }


    /**
     * Sets the costComponentItem value for this TransactionSearchRowBasic.
     * 
     * @param costComponentItem
     */
    public void setCostComponentItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] costComponentItem) {
        this.costComponentItem = costComponentItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCostComponentItem(int i) {
        return this.costComponentItem[i];
    }

    public void setCostComponentItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.costComponentItem[i] = _value;
    }


    /**
     * Gets the costComponentQuantity value for this TransactionSearchRowBasic.
     * 
     * @return costComponentQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostComponentQuantity() {
        return costComponentQuantity;
    }


    /**
     * Sets the costComponentQuantity value for this TransactionSearchRowBasic.
     * 
     * @param costComponentQuantity
     */
    public void setCostComponentQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costComponentQuantity) {
        this.costComponentQuantity = costComponentQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostComponentQuantity(int i) {
        return this.costComponentQuantity[i];
    }

    public void setCostComponentQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costComponentQuantity[i] = _value;
    }


    /**
     * Gets the costComponentStandardCost value for this TransactionSearchRowBasic.
     * 
     * @return costComponentStandardCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostComponentStandardCost() {
        return costComponentStandardCost;
    }


    /**
     * Sets the costComponentStandardCost value for this TransactionSearchRowBasic.
     * 
     * @param costComponentStandardCost
     */
    public void setCostComponentStandardCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costComponentStandardCost) {
        this.costComponentStandardCost = costComponentStandardCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostComponentStandardCost(int i) {
        return this.costComponentStandardCost[i];
    }

    public void setCostComponentStandardCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costComponentStandardCost[i] = _value;
    }


    /**
     * Gets the costEstimate value for this TransactionSearchRowBasic.
     * 
     * @return costEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this TransactionSearchRowBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costEstimate) {
        this.costEstimate = costEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostEstimate(int i) {
        return this.costEstimate[i];
    }

    public void setCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costEstimate[i] = _value;
    }


    /**
     * Gets the costEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @return costEstimateRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCostEstimateRate() {
        return costEstimateRate;
    }


    /**
     * Sets the costEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @param costEstimateRate
     */
    public void setCostEstimateRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] costEstimateRate) {
        this.costEstimateRate = costEstimateRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCostEstimateRate(int i) {
        return this.costEstimateRate[i];
    }

    public void setCostEstimateRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.costEstimateRate[i] = _value;
    }


    /**
     * Gets the costEstimateType value for this TransactionSearchRowBasic.
     * 
     * @return costEstimateType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this TransactionSearchRowBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCostEstimateType(int i) {
        return this.costEstimateType[i];
    }

    public void setCostEstimateType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.costEstimateType[i] = _value;
    }


    /**
     * Gets the createdBy value for this TransactionSearchRowBasic.
     * 
     * @return createdBy
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this TransactionSearchRowBasic.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] createdBy) {
        this.createdBy = createdBy;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCreatedBy(int i) {
        return this.createdBy[i];
    }

    public void setCreatedBy(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.createdBy[i] = _value;
    }


    /**
     * Gets the createdFrom value for this TransactionSearchRowBasic.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this TransactionSearchRowBasic.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] createdFrom) {
        this.createdFrom = createdFrom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCreatedFrom(int i) {
        return this.createdFrom[i];
    }

    public void setCreatedFrom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.createdFrom[i] = _value;
    }


    /**
     * Gets the creditAmount value for this TransactionSearchRowBasic.
     * 
     * @return creditAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this TransactionSearchRowBasic.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditAmount) {
        this.creditAmount = creditAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCreditAmount(int i) {
        return this.creditAmount[i];
    }

    public void setCreditAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.creditAmount[i] = _value;
    }


    /**
     * Gets the cscMatch value for this TransactionSearchRowBasic.
     * 
     * @return cscMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCscMatch() {
        return cscMatch;
    }


    /**
     * Sets the cscMatch value for this TransactionSearchRowBasic.
     * 
     * @param cscMatch
     */
    public void setCscMatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] cscMatch) {
        this.cscMatch = cscMatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCscMatch(int i) {
        return this.cscMatch[i];
    }

    public void setCscMatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.cscMatch[i] = _value;
    }


    /**
     * Gets the currency value for this TransactionSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TransactionSearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the customForm value for this TransactionSearchRowBasic.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this TransactionSearchRowBasic.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] customForm) {
        this.customForm = customForm;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCustomForm(int i) {
        return this.customForm[i];
    }

    public void setCustomForm(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.customForm[i] = _value;
    }


    /**
     * Gets the customGL value for this TransactionSearchRowBasic.
     * 
     * @return customGL
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCustomGL() {
        return customGL;
    }


    /**
     * Sets the customGL value for this TransactionSearchRowBasic.
     * 
     * @param customGL
     */
    public void setCustomGL(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] customGL) {
        this.customGL = customGL;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCustomGL(int i) {
        return this.customGL[i];
    }

    public void setCustomGL(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.customGL[i] = _value;
    }


    /**
     * Gets the custType value for this TransactionSearchRowBasic.
     * 
     * @return custType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this TransactionSearchRowBasic.
     * 
     * @param custType
     */
    public void setCustType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] custType) {
        this.custType = custType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCustType(int i) {
        return this.custType[i];
    }

    public void setCustType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.custType[i] = _value;
    }


    /**
     * Gets the dateCreated value for this TransactionSearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TransactionSearchRowBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }


    /**
     * Gets the daysOpen value for this TransactionSearchRowBasic.
     * 
     * @return daysOpen
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this TransactionSearchRowBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOpen) {
        this.daysOpen = daysOpen;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDaysOpen(int i) {
        return this.daysOpen[i];
    }

    public void setDaysOpen(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.daysOpen[i] = _value;
    }


    /**
     * Gets the daysOverdue value for this TransactionSearchRowBasic.
     * 
     * @return daysOverdue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this TransactionSearchRowBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getDaysOverdue(int i) {
        return this.daysOverdue[i];
    }

    public void setDaysOverdue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.daysOverdue[i] = _value;
    }


    /**
     * Gets the debitAmount value for this TransactionSearchRowBasic.
     * 
     * @return debitAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this TransactionSearchRowBasic.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] debitAmount) {
        this.debitAmount = debitAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDebitAmount(int i) {
        return this.debitAmount[i];
    }

    public void setDebitAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.debitAmount[i] = _value;
    }


    /**
     * Gets the deferredRevenue value for this TransactionSearchRowBasic.
     * 
     * @return deferredRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this TransactionSearchRowBasic.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDeferredRevenue(int i) {
        return this.deferredRevenue[i];
    }

    public void setDeferredRevenue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.deferredRevenue[i] = _value;
    }


    /**
     * Gets the deferRevRec value for this TransactionSearchRowBasic.
     * 
     * @return deferRevRec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this TransactionSearchRowBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
    }


    /**
     * Gets the department value for this TransactionSearchRowBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TransactionSearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] department) {
        this.department = department;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the depositDate value for this TransactionSearchRowBasic.
     * 
     * @return depositDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDepositDate() {
        return depositDate;
    }


    /**
     * Sets the depositDate value for this TransactionSearchRowBasic.
     * 
     * @param depositDate
     */
    public void setDepositDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] depositDate) {
        this.depositDate = depositDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDepositDate(int i) {
        return this.depositDate[i];
    }

    public void setDepositDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.depositDate[i] = _value;
    }


    /**
     * Gets the depositTransaction value for this TransactionSearchRowBasic.
     * 
     * @return depositTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getDepositTransaction() {
        return depositTransaction;
    }


    /**
     * Sets the depositTransaction value for this TransactionSearchRowBasic.
     * 
     * @param depositTransaction
     */
    public void setDepositTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] depositTransaction) {
        this.depositTransaction = depositTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getDepositTransaction(int i) {
        return this.depositTransaction[i];
    }

    public void setDepositTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.depositTransaction[i] = _value;
    }


    /**
     * Gets the discountAmount value for this TransactionSearchRowBasic.
     * 
     * @return discountAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this TransactionSearchRowBasic.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] discountAmount) {
        this.discountAmount = discountAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDiscountAmount(int i) {
        return this.discountAmount[i];
    }

    public void setDiscountAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.discountAmount[i] = _value;
    }


    /**
     * Gets the docUnit value for this TransactionSearchRowBasic.
     * 
     * @return docUnit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDocUnit() {
        return docUnit;
    }


    /**
     * Sets the docUnit value for this TransactionSearchRowBasic.
     * 
     * @param docUnit
     */
    public void setDocUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] docUnit) {
        this.docUnit = docUnit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDocUnit(int i) {
        return this.docUnit[i];
    }

    public void setDocUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.docUnit[i] = _value;
    }


    /**
     * Gets the drAccount value for this TransactionSearchRowBasic.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this TransactionSearchRowBasic.
     * 
     * @param drAccount
     */
    public void setDrAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] drAccount) {
        this.drAccount = drAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDrAccount(int i) {
        return this.drAccount[i];
    }

    public void setDrAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.drAccount[i] = _value;
    }


    /**
     * Gets the dueDate value for this TransactionSearchRowBasic.
     * 
     * @return dueDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this TransactionSearchRowBasic.
     * 
     * @param dueDate
     */
    public void setDueDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dueDate) {
        this.dueDate = dueDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dueDate[i] = _value;
    }


    /**
     * Gets the effectiveRate value for this TransactionSearchRowBasic.
     * 
     * @return effectiveRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEffectiveRate() {
        return effectiveRate;
    }


    /**
     * Sets the effectiveRate value for this TransactionSearchRowBasic.
     * 
     * @param effectiveRate
     */
    public void setEffectiveRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] effectiveRate) {
        this.effectiveRate = effectiveRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEffectiveRate(int i) {
        return this.effectiveRate[i];
    }

    public void setEffectiveRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.effectiveRate[i] = _value;
    }


    /**
     * Gets the email value for this TransactionSearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TransactionSearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email) {
        this.email = email;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the endDate value for this TransactionSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TransactionSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the entity value for this TransactionSearchRowBasic.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this TransactionSearchRowBasic.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the entityStatus value for this TransactionSearchRowBasic.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this TransactionSearchRowBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.entityStatus[i] = _value;
    }


    /**
     * Gets the estGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return estGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstGrossProfit(int i) {
        return this.estGrossProfit[i];
    }

    public void setEstGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estGrossProfit[i] = _value;
    }


    /**
     * Gets the estGrossProfitPct value for this TransactionSearchRowBasic.
     * 
     * @return estGrossProfitPct
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstGrossProfitPct() {
        return estGrossProfitPct;
    }


    /**
     * Sets the estGrossProfitPct value for this TransactionSearchRowBasic.
     * 
     * @param estGrossProfitPct
     */
    public void setEstGrossProfitPct(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estGrossProfitPct) {
        this.estGrossProfitPct = estGrossProfitPct;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstGrossProfitPct(int i) {
        return this.estGrossProfitPct[i];
    }

    public void setEstGrossProfitPct(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estGrossProfitPct[i] = _value;
    }


    /**
     * Gets the estGrossProfitPercent value for this TransactionSearchRowBasic.
     * 
     * @return estGrossProfitPercent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this TransactionSearchRowBasic.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstGrossProfitPercent(int i) {
        return this.estGrossProfitPercent[i];
    }

    public void setEstGrossProfitPercent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estGrossProfitPercent[i] = _value;
    }


    /**
     * Gets the exchangeRate value for this TransactionSearchRowBasic.
     * 
     * @return exchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this TransactionSearchRowBasic.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getExchangeRate(int i) {
        return this.exchangeRate[i];
    }

    public void setExchangeRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.exchangeRate[i] = _value;
    }


    /**
     * Gets the excludeCommission value for this TransactionSearchRowBasic.
     * 
     * @return excludeCommission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this TransactionSearchRowBasic.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeCommission) {
        this.excludeCommission = excludeCommission;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getExcludeCommission(int i) {
        return this.excludeCommission[i];
    }

    public void setExcludeCommission(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.excludeCommission[i] = _value;
    }


    /**
     * Gets the excludeFromRateRequest value for this TransactionSearchRowBasic.
     * 
     * @return excludeFromRateRequest
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getExcludeFromRateRequest() {
        return excludeFromRateRequest;
    }


    /**
     * Sets the excludeFromRateRequest value for this TransactionSearchRowBasic.
     * 
     * @param excludeFromRateRequest
     */
    public void setExcludeFromRateRequest(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getExcludeFromRateRequest(int i) {
        return this.excludeFromRateRequest[i];
    }

    public void setExcludeFromRateRequest(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.excludeFromRateRequest[i] = _value;
    }


    /**
     * Gets the expectedCloseDate value for this TransactionSearchRowBasic.
     * 
     * @return expectedCloseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this TransactionSearchRowBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpectedCloseDate(int i) {
        return this.expectedCloseDate[i];
    }

    public void setExpectedCloseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expectedCloseDate[i] = _value;
    }


    /**
     * Gets the expectedReceiptDate value for this TransactionSearchRowBasic.
     * 
     * @return expectedReceiptDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpectedReceiptDate() {
        return expectedReceiptDate;
    }


    /**
     * Sets the expectedReceiptDate value for this TransactionSearchRowBasic.
     * 
     * @param expectedReceiptDate
     */
    public void setExpectedReceiptDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpectedReceiptDate(int i) {
        return this.expectedReceiptDate[i];
    }

    public void setExpectedReceiptDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expectedReceiptDate[i] = _value;
    }


    /**
     * Gets the expenseCategory value for this TransactionSearchRowBasic.
     * 
     * @return expenseCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExpenseCategory() {
        return expenseCategory;
    }


    /**
     * Sets the expenseCategory value for this TransactionSearchRowBasic.
     * 
     * @param expenseCategory
     */
    public void setExpenseCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExpenseCategory(int i) {
        return this.expenseCategory[i];
    }

    public void setExpenseCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.expenseCategory[i] = _value;
    }


    /**
     * Gets the expenseDate value for this TransactionSearchRowBasic.
     * 
     * @return expenseDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getExpenseDate() {
        return expenseDate;
    }


    /**
     * Sets the expenseDate value for this TransactionSearchRowBasic.
     * 
     * @param expenseDate
     */
    public void setExpenseDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] expenseDate) {
        this.expenseDate = expenseDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getExpenseDate(int i) {
        return this.expenseDate[i];
    }

    public void setExpenseDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.expenseDate[i] = _value;
    }


    /**
     * Gets the externalId value for this TransactionSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TransactionSearchRowBasic.
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
     * Gets the firmed value for this TransactionSearchRowBasic.
     * 
     * @return firmed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getFirmed() {
        return firmed;
    }


    /**
     * Sets the firmed value for this TransactionSearchRowBasic.
     * 
     * @param firmed
     */
    public void setFirmed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] firmed) {
        this.firmed = firmed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getFirmed(int i) {
        return this.firmed[i];
    }

    public void setFirmed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.firmed[i] = _value;
    }


    /**
     * Gets the forecastType value for this TransactionSearchRowBasic.
     * 
     * @return forecastType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this TransactionSearchRowBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] forecastType) {
        this.forecastType = forecastType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getForecastType(int i) {
        return this.forecastType[i];
    }

    public void setForecastType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.forecastType[i] = _value;
    }


    /**
     * Gets the fulfillingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return fulfillingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getFulfillingTransaction() {
        return fulfillingTransaction;
    }


    /**
     * Sets the fulfillingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param fulfillingTransaction
     */
    public void setFulfillingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] fulfillingTransaction) {
        this.fulfillingTransaction = fulfillingTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getFulfillingTransaction(int i) {
        return this.fulfillingTransaction[i];
    }

    public void setFulfillingTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.fulfillingTransaction[i] = _value;
    }


    /**
     * Gets the fxAccount value for this TransactionSearchRowBasic.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this TransactionSearchRowBasic.
     * 
     * @param fxAccount
     */
    public void setFxAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fxAccount) {
        this.fxAccount = fxAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFxAccount(int i) {
        return this.fxAccount[i];
    }

    public void setFxAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.fxAccount[i] = _value;
    }


    /**
     * Gets the fxAmount value for this TransactionSearchRowBasic.
     * 
     * @return fxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this TransactionSearchRowBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }


    /**
     * Gets the fxCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @return fxCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxCostEstimate() {
        return fxCostEstimate;
    }


    /**
     * Sets the fxCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @param fxCostEstimate
     */
    public void setFxCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxCostEstimate) {
        this.fxCostEstimate = fxCostEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxCostEstimate(int i) {
        return this.fxCostEstimate[i];
    }

    public void setFxCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxCostEstimate[i] = _value;
    }


    /**
     * Gets the fxCostEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @return fxCostEstimateRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxCostEstimateRate() {
        return fxCostEstimateRate;
    }


    /**
     * Sets the fxCostEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @param fxCostEstimateRate
     */
    public void setFxCostEstimateRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxCostEstimateRate) {
        this.fxCostEstimateRate = fxCostEstimateRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxCostEstimateRate(int i) {
        return this.fxCostEstimateRate[i];
    }

    public void setFxCostEstimateRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxCostEstimateRate[i] = _value;
    }


    /**
     * Gets the fxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return fxEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxEstGrossProfit() {
        return fxEstGrossProfit;
    }


    /**
     * Sets the fxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param fxEstGrossProfit
     */
    public void setFxEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxEstGrossProfit) {
        this.fxEstGrossProfit = fxEstGrossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxEstGrossProfit(int i) {
        return this.fxEstGrossProfit[i];
    }

    public void setFxEstGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxEstGrossProfit[i] = _value;
    }


    /**
     * Gets the fxTranCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @return fxTranCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxTranCostEstimate(int i) {
        return this.fxTranCostEstimate[i];
    }

    public void setFxTranCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxTranCostEstimate[i] = _value;
    }


    /**
     * Gets the fxVsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @return fxVsoeAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxVsoeAllocation() {
        return fxVsoeAllocation;
    }


    /**
     * Sets the fxVsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @param fxVsoeAllocation
     */
    public void setFxVsoeAllocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxVsoeAllocation) {
        this.fxVsoeAllocation = fxVsoeAllocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxVsoeAllocation(int i) {
        return this.fxVsoeAllocation[i];
    }

    public void setFxVsoeAllocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxVsoeAllocation[i] = _value;
    }


    /**
     * Gets the fxVsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @return fxVsoeAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxVsoeAmount() {
        return fxVsoeAmount;
    }


    /**
     * Sets the fxVsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @param fxVsoeAmount
     */
    public void setFxVsoeAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxVsoeAmount) {
        this.fxVsoeAmount = fxVsoeAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxVsoeAmount(int i) {
        return this.fxVsoeAmount[i];
    }

    public void setFxVsoeAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxVsoeAmount[i] = _value;
    }


    /**
     * Gets the fxVsoePrice value for this TransactionSearchRowBasic.
     * 
     * @return fxVsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxVsoePrice() {
        return fxVsoePrice;
    }


    /**
     * Sets the fxVsoePrice value for this TransactionSearchRowBasic.
     * 
     * @param fxVsoePrice
     */
    public void setFxVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxVsoePrice) {
        this.fxVsoePrice = fxVsoePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxVsoePrice(int i) {
        return this.fxVsoePrice[i];
    }

    public void setFxVsoePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxVsoePrice[i] = _value;
    }


    /**
     * Gets the gcoAvailabelToCharge value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvailabelToCharge
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGcoAvailabelToCharge() {
        return gcoAvailabelToCharge;
    }


    /**
     * Sets the gcoAvailabelToCharge value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvailabelToCharge
     */
    public void setGcoAvailabelToCharge(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcoAvailabelToCharge) {
        this.gcoAvailabelToCharge = gcoAvailabelToCharge;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getGcoAvailabelToCharge(int i) {
        return this.gcoAvailabelToCharge[i];
    }

    public void setGcoAvailabelToCharge(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.gcoAvailabelToCharge[i] = _value;
    }


    /**
     * Gets the gcoAvailableToRefund value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvailableToRefund
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGcoAvailableToRefund() {
        return gcoAvailableToRefund;
    }


    /**
     * Sets the gcoAvailableToRefund value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvailableToRefund
     */
    public void setGcoAvailableToRefund(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] gcoAvailableToRefund) {
        this.gcoAvailableToRefund = gcoAvailableToRefund;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getGcoAvailableToRefund(int i) {
        return this.gcoAvailableToRefund[i];
    }

    public void setGcoAvailableToRefund(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.gcoAvailableToRefund[i] = _value;
    }


    /**
     * Gets the gcoAvsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvsStreetMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGcoAvsStreetMatch() {
        return gcoAvsStreetMatch;
    }


    /**
     * Sets the gcoAvsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvsStreetMatch
     */
    public void setGcoAvsStreetMatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] gcoAvsStreetMatch) {
        this.gcoAvsStreetMatch = gcoAvsStreetMatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getGcoAvsStreetMatch(int i) {
        return this.gcoAvsStreetMatch[i];
    }

    public void setGcoAvsStreetMatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.gcoAvsStreetMatch[i] = _value;
    }


    /**
     * Gets the gcoAvsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvsZipMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGcoAvsZipMatch() {
        return gcoAvsZipMatch;
    }


    /**
     * Sets the gcoAvsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvsZipMatch
     */
    public void setGcoAvsZipMatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] gcoAvsZipMatch) {
        this.gcoAvsZipMatch = gcoAvsZipMatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getGcoAvsZipMatch(int i) {
        return this.gcoAvsZipMatch[i];
    }

    public void setGcoAvsZipMatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.gcoAvsZipMatch[i] = _value;
    }


    /**
     * Gets the gcoBuyerAccountAge value for this TransactionSearchRowBasic.
     * 
     * @return gcoBuyerAccountAge
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getGcoBuyerAccountAge() {
        return gcoBuyerAccountAge;
    }


    /**
     * Sets the gcoBuyerAccountAge value for this TransactionSearchRowBasic.
     * 
     * @param gcoBuyerAccountAge
     */
    public void setGcoBuyerAccountAge(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] gcoBuyerAccountAge) {
        this.gcoBuyerAccountAge = gcoBuyerAccountAge;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getGcoBuyerAccountAge(int i) {
        return this.gcoBuyerAccountAge[i];
    }

    public void setGcoBuyerAccountAge(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.gcoBuyerAccountAge[i] = _value;
    }


    /**
     * Gets the gcoBuyerIp value for this TransactionSearchRowBasic.
     * 
     * @return gcoBuyerIp
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoBuyerIp() {
        return gcoBuyerIp;
    }


    /**
     * Sets the gcoBuyerIp value for this TransactionSearchRowBasic.
     * 
     * @param gcoBuyerIp
     */
    public void setGcoBuyerIp(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoBuyerIp) {
        this.gcoBuyerIp = gcoBuyerIp;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoBuyerIp(int i) {
        return this.gcoBuyerIp[i];
    }

    public void setGcoBuyerIp(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoBuyerIp[i] = _value;
    }


    /**
     * Gets the gcoChargeAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoChargeAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoChargeAmount() {
        return gcoChargeAmount;
    }


    /**
     * Sets the gcoChargeAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoChargeAmount
     */
    public void setGcoChargeAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoChargeAmount) {
        this.gcoChargeAmount = gcoChargeAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoChargeAmount(int i) {
        return this.gcoChargeAmount[i];
    }

    public void setGcoChargeAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoChargeAmount[i] = _value;
    }


    /**
     * Gets the gcoChargebackAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoChargebackAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoChargebackAmount() {
        return gcoChargebackAmount;
    }


    /**
     * Sets the gcoChargebackAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoChargebackAmount
     */
    public void setGcoChargebackAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoChargebackAmount) {
        this.gcoChargebackAmount = gcoChargebackAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoChargebackAmount(int i) {
        return this.gcoChargebackAmount[i];
    }

    public void setGcoChargebackAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoChargebackAmount[i] = _value;
    }


    /**
     * Gets the gcoConfirmedChargedTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoConfirmedChargedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoConfirmedChargedTotal() {
        return gcoConfirmedChargedTotal;
    }


    /**
     * Sets the gcoConfirmedChargedTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoConfirmedChargedTotal
     */
    public void setGcoConfirmedChargedTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoConfirmedChargedTotal) {
        this.gcoConfirmedChargedTotal = gcoConfirmedChargedTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoConfirmedChargedTotal(int i) {
        return this.gcoConfirmedChargedTotal[i];
    }

    public void setGcoConfirmedChargedTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoConfirmedChargedTotal[i] = _value;
    }


    /**
     * Gets the gcoConfirmedRefundedTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoConfirmedRefundedTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoConfirmedRefundedTotal() {
        return gcoConfirmedRefundedTotal;
    }


    /**
     * Sets the gcoConfirmedRefundedTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoConfirmedRefundedTotal
     */
    public void setGcoConfirmedRefundedTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoConfirmedRefundedTotal) {
        this.gcoConfirmedRefundedTotal = gcoConfirmedRefundedTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoConfirmedRefundedTotal(int i) {
        return this.gcoConfirmedRefundedTotal[i];
    }

    public void setGcoConfirmedRefundedTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoConfirmedRefundedTotal[i] = _value;
    }


    /**
     * Gets the gcoCreditcardNumber value for this TransactionSearchRowBasic.
     * 
     * @return gcoCreditcardNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoCreditcardNumber() {
        return gcoCreditcardNumber;
    }


    /**
     * Sets the gcoCreditcardNumber value for this TransactionSearchRowBasic.
     * 
     * @param gcoCreditcardNumber
     */
    public void setGcoCreditcardNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoCreditcardNumber) {
        this.gcoCreditcardNumber = gcoCreditcardNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoCreditcardNumber(int i) {
        return this.gcoCreditcardNumber[i];
    }

    public void setGcoCreditcardNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoCreditcardNumber[i] = _value;
    }


    /**
     * Gets the gcoCscMatch value for this TransactionSearchRowBasic.
     * 
     * @return gcoCscMatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGcoCscMatch() {
        return gcoCscMatch;
    }


    /**
     * Sets the gcoCscMatch value for this TransactionSearchRowBasic.
     * 
     * @param gcoCscMatch
     */
    public void setGcoCscMatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] gcoCscMatch) {
        this.gcoCscMatch = gcoCscMatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getGcoCscMatch(int i) {
        return this.gcoCscMatch[i];
    }

    public void setGcoCscMatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.gcoCscMatch[i] = _value;
    }


    /**
     * Gets the gcoFinancialState value for this TransactionSearchRowBasic.
     * 
     * @return gcoFinancialState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoFinancialState() {
        return gcoFinancialState;
    }


    /**
     * Sets the gcoFinancialState value for this TransactionSearchRowBasic.
     * 
     * @param gcoFinancialState
     */
    public void setGcoFinancialState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoFinancialState) {
        this.gcoFinancialState = gcoFinancialState;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoFinancialState(int i) {
        return this.gcoFinancialState[i];
    }

    public void setGcoFinancialState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoFinancialState[i] = _value;
    }


    /**
     * Gets the gcoFulfillmentState value for this TransactionSearchRowBasic.
     * 
     * @return gcoFulfillmentState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoFulfillmentState() {
        return gcoFulfillmentState;
    }


    /**
     * Sets the gcoFulfillmentState value for this TransactionSearchRowBasic.
     * 
     * @param gcoFulfillmentState
     */
    public void setGcoFulfillmentState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoFulfillmentState) {
        this.gcoFulfillmentState = gcoFulfillmentState;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoFulfillmentState(int i) {
        return this.gcoFulfillmentState[i];
    }

    public void setGcoFulfillmentState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoFulfillmentState[i] = _value;
    }


    /**
     * Gets the gcoOrderId value for this TransactionSearchRowBasic.
     * 
     * @return gcoOrderId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoOrderId() {
        return gcoOrderId;
    }


    /**
     * Sets the gcoOrderId value for this TransactionSearchRowBasic.
     * 
     * @param gcoOrderId
     */
    public void setGcoOrderId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoOrderId) {
        this.gcoOrderId = gcoOrderId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoOrderId(int i) {
        return this.gcoOrderId[i];
    }

    public void setGcoOrderId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoOrderId[i] = _value;
    }


    /**
     * Gets the gcoOrderTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoOrderTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoOrderTotal() {
        return gcoOrderTotal;
    }


    /**
     * Sets the gcoOrderTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoOrderTotal
     */
    public void setGcoOrderTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoOrderTotal) {
        this.gcoOrderTotal = gcoOrderTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoOrderTotal(int i) {
        return this.gcoOrderTotal[i];
    }

    public void setGcoOrderTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoOrderTotal[i] = _value;
    }


    /**
     * Gets the gcoPromotionAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoPromotionAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoPromotionAmount() {
        return gcoPromotionAmount;
    }


    /**
     * Sets the gcoPromotionAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoPromotionAmount
     */
    public void setGcoPromotionAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoPromotionAmount) {
        this.gcoPromotionAmount = gcoPromotionAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoPromotionAmount(int i) {
        return this.gcoPromotionAmount[i];
    }

    public void setGcoPromotionAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoPromotionAmount[i] = _value;
    }


    /**
     * Gets the gcoPromotionName value for this TransactionSearchRowBasic.
     * 
     * @return gcoPromotionName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoPromotionName() {
        return gcoPromotionName;
    }


    /**
     * Sets the gcoPromotionName value for this TransactionSearchRowBasic.
     * 
     * @param gcoPromotionName
     */
    public void setGcoPromotionName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoPromotionName) {
        this.gcoPromotionName = gcoPromotionName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoPromotionName(int i) {
        return this.gcoPromotionName[i];
    }

    public void setGcoPromotionName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoPromotionName[i] = _value;
    }


    /**
     * Gets the gcoRefundAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoRefundAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoRefundAmount() {
        return gcoRefundAmount;
    }


    /**
     * Sets the gcoRefundAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoRefundAmount
     */
    public void setGcoRefundAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoRefundAmount) {
        this.gcoRefundAmount = gcoRefundAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoRefundAmount(int i) {
        return this.gcoRefundAmount[i];
    }

    public void setGcoRefundAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoRefundAmount[i] = _value;
    }


    /**
     * Gets the gcoShippingTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoShippingTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGcoShippingTotal() {
        return gcoShippingTotal;
    }


    /**
     * Sets the gcoShippingTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoShippingTotal
     */
    public void setGcoShippingTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] gcoShippingTotal) {
        this.gcoShippingTotal = gcoShippingTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGcoShippingTotal(int i) {
        return this.gcoShippingTotal[i];
    }

    public void setGcoShippingTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.gcoShippingTotal[i] = _value;
    }


    /**
     * Gets the gcoStateChangedDetail value for this TransactionSearchRowBasic.
     * 
     * @return gcoStateChangedDetail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGcoStateChangedDetail() {
        return gcoStateChangedDetail;
    }


    /**
     * Sets the gcoStateChangedDetail value for this TransactionSearchRowBasic.
     * 
     * @param gcoStateChangedDetail
     */
    public void setGcoStateChangedDetail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] gcoStateChangedDetail) {
        this.gcoStateChangedDetail = gcoStateChangedDetail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGcoStateChangedDetail(int i) {
        return this.gcoStateChangedDetail[i];
    }

    public void setGcoStateChangedDetail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.gcoStateChangedDetail[i] = _value;
    }


    /**
     * Gets the giftCert value for this TransactionSearchRowBasic.
     * 
     * @return giftCert
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGiftCert() {
        return giftCert;
    }


    /**
     * Sets the giftCert value for this TransactionSearchRowBasic.
     * 
     * @param giftCert
     */
    public void setGiftCert(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] giftCert) {
        this.giftCert = giftCert;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGiftCert(int i) {
        return this.giftCert[i];
    }

    public void setGiftCert(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.giftCert[i] = _value;
    }


    /**
     * Gets the grossAmount value for this TransactionSearchRowBasic.
     * 
     * @return grossAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this TransactionSearchRowBasic.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] grossAmount) {
        this.grossAmount = grossAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getGrossAmount(int i) {
        return this.grossAmount[i];
    }

    public void setGrossAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.grossAmount[i] = _value;
    }


    /**
     * Gets the includeInForecast value for this TransactionSearchRowBasic.
     * 
     * @return includeInForecast
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIncludeInForecast() {
        return includeInForecast;
    }


    /**
     * Sets the includeInForecast value for this TransactionSearchRowBasic.
     * 
     * @param includeInForecast
     */
    public void setIncludeInForecast(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] includeInForecast) {
        this.includeInForecast = includeInForecast;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIncludeInForecast(int i) {
        return this.includeInForecast[i];
    }

    public void setIncludeInForecast(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.includeInForecast[i] = _value;
    }


    /**
     * Gets the incoterm value for this TransactionSearchRowBasic.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this TransactionSearchRowBasic.
     * 
     * @param incoterm
     */
    public void setIncoterm(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm) {
        this.incoterm = incoterm;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getIncoterm(int i) {
        return this.incoterm[i];
    }

    public void setIncoterm(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.incoterm[i] = _value;
    }


    /**
     * Gets the intercoStatus value for this TransactionSearchRowBasic.
     * 
     * @return intercoStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getIntercoStatus() {
        return intercoStatus;
    }


    /**
     * Sets the intercoStatus value for this TransactionSearchRowBasic.
     * 
     * @param intercoStatus
     */
    public void setIntercoStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] intercoStatus) {
        this.intercoStatus = intercoStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getIntercoStatus(int i) {
        return this.intercoStatus[i];
    }

    public void setIntercoStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.intercoStatus[i] = _value;
    }


    /**
     * Gets the intercoTransaction value for this TransactionSearchRowBasic.
     * 
     * @return intercoTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getIntercoTransaction() {
        return intercoTransaction;
    }


    /**
     * Sets the intercoTransaction value for this TransactionSearchRowBasic.
     * 
     * @param intercoTransaction
     */
    public void setIntercoTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getIntercoTransaction(int i) {
        return this.intercoTransaction[i];
    }

    public void setIntercoTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.intercoTransaction[i] = _value;
    }


    /**
     * Gets the internalId value for this TransactionSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TransactionSearchRowBasic.
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
     * Gets the inventoryLocation value for this TransactionSearchRowBasic.
     * 
     * @return inventoryLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this TransactionSearchRowBasic.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInventoryLocation(int i) {
        return this.inventoryLocation[i];
    }

    public void setInventoryLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.inventoryLocation[i] = _value;
    }


    /**
     * Gets the inventorySubsidiary value for this TransactionSearchRowBasic.
     * 
     * @return inventorySubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInventorySubsidiary() {
        return inventorySubsidiary;
    }


    /**
     * Sets the inventorySubsidiary value for this TransactionSearchRowBasic.
     * 
     * @param inventorySubsidiary
     */
    public void setInventorySubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] inventorySubsidiary) {
        this.inventorySubsidiary = inventorySubsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getInventorySubsidiary(int i) {
        return this.inventorySubsidiary[i];
    }

    public void setInventorySubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.inventorySubsidiary[i] = _value;
    }


    /**
     * Gets the inVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @return inVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getInVsoeBundle() {
        return inVsoeBundle;
    }


    /**
     * Sets the inVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @param inVsoeBundle
     */
    public void setInVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] inVsoeBundle) {
        this.inVsoeBundle = inVsoeBundle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getInVsoeBundle(int i) {
        return this.inVsoeBundle[i];
    }

    public void setInVsoeBundle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.inVsoeBundle[i] = _value;
    }


    /**
     * Gets the isAllocation value for this TransactionSearchRowBasic.
     * 
     * @return isAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsAllocation() {
        return isAllocation;
    }


    /**
     * Sets the isAllocation value for this TransactionSearchRowBasic.
     * 
     * @param isAllocation
     */
    public void setIsAllocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isAllocation) {
        this.isAllocation = isAllocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsAllocation(int i) {
        return this.isAllocation[i];
    }

    public void setIsAllocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isAllocation[i] = _value;
    }


    /**
     * Gets the isBackflush value for this TransactionSearchRowBasic.
     * 
     * @return isBackflush
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsBackflush() {
        return isBackflush;
    }


    /**
     * Sets the isBackflush value for this TransactionSearchRowBasic.
     * 
     * @param isBackflush
     */
    public void setIsBackflush(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBackflush) {
        this.isBackflush = isBackflush;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsBackflush(int i) {
        return this.isBackflush[i];
    }

    public void setIsBackflush(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isBackflush[i] = _value;
    }


    /**
     * Gets the isGcoChargeback value for this TransactionSearchRowBasic.
     * 
     * @return isGcoChargeback
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsGcoChargeback() {
        return isGcoChargeback;
    }


    /**
     * Sets the isGcoChargeback value for this TransactionSearchRowBasic.
     * 
     * @param isGcoChargeback
     */
    public void setIsGcoChargeback(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoChargeback) {
        this.isGcoChargeback = isGcoChargeback;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsGcoChargeback(int i) {
        return this.isGcoChargeback[i];
    }

    public void setIsGcoChargeback(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isGcoChargeback[i] = _value;
    }


    /**
     * Gets the isGcoChargeConfirmed value for this TransactionSearchRowBasic.
     * 
     * @return isGcoChargeConfirmed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsGcoChargeConfirmed() {
        return isGcoChargeConfirmed;
    }


    /**
     * Sets the isGcoChargeConfirmed value for this TransactionSearchRowBasic.
     * 
     * @param isGcoChargeConfirmed
     */
    public void setIsGcoChargeConfirmed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoChargeConfirmed) {
        this.isGcoChargeConfirmed = isGcoChargeConfirmed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsGcoChargeConfirmed(int i) {
        return this.isGcoChargeConfirmed[i];
    }

    public void setIsGcoChargeConfirmed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isGcoChargeConfirmed[i] = _value;
    }


    /**
     * Gets the isGcoPaymentGuaranteed value for this TransactionSearchRowBasic.
     * 
     * @return isGcoPaymentGuaranteed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsGcoPaymentGuaranteed() {
        return isGcoPaymentGuaranteed;
    }


    /**
     * Sets the isGcoPaymentGuaranteed value for this TransactionSearchRowBasic.
     * 
     * @param isGcoPaymentGuaranteed
     */
    public void setIsGcoPaymentGuaranteed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoPaymentGuaranteed) {
        this.isGcoPaymentGuaranteed = isGcoPaymentGuaranteed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsGcoPaymentGuaranteed(int i) {
        return this.isGcoPaymentGuaranteed[i];
    }

    public void setIsGcoPaymentGuaranteed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isGcoPaymentGuaranteed[i] = _value;
    }


    /**
     * Gets the isGcoRefundConfirmed value for this TransactionSearchRowBasic.
     * 
     * @return isGcoRefundConfirmed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsGcoRefundConfirmed() {
        return isGcoRefundConfirmed;
    }


    /**
     * Sets the isGcoRefundConfirmed value for this TransactionSearchRowBasic.
     * 
     * @param isGcoRefundConfirmed
     */
    public void setIsGcoRefundConfirmed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isGcoRefundConfirmed) {
        this.isGcoRefundConfirmed = isGcoRefundConfirmed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsGcoRefundConfirmed(int i) {
        return this.isGcoRefundConfirmed[i];
    }

    public void setIsGcoRefundConfirmed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isGcoRefundConfirmed[i] = _value;
    }


    /**
     * Gets the isInsideDelivery value for this TransactionSearchRowBasic.
     * 
     * @return isInsideDelivery
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInsideDelivery() {
        return isInsideDelivery;
    }


    /**
     * Sets the isInsideDelivery value for this TransactionSearchRowBasic.
     * 
     * @param isInsideDelivery
     */
    public void setIsInsideDelivery(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInsideDelivery) {
        this.isInsideDelivery = isInsideDelivery;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInsideDelivery(int i) {
        return this.isInsideDelivery[i];
    }

    public void setIsInsideDelivery(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInsideDelivery[i] = _value;
    }


    /**
     * Gets the isInsidePickup value for this TransactionSearchRowBasic.
     * 
     * @return isInsidePickup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInsidePickup() {
        return isInsidePickup;
    }


    /**
     * Sets the isInsidePickup value for this TransactionSearchRowBasic.
     * 
     * @param isInsidePickup
     */
    public void setIsInsidePickup(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInsidePickup) {
        this.isInsidePickup = isInsidePickup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInsidePickup(int i) {
        return this.isInsidePickup[i];
    }

    public void setIsInsidePickup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInsidePickup[i] = _value;
    }


    /**
     * Gets the isIntercompanyAdjustment value for this TransactionSearchRowBasic.
     * 
     * @return isIntercompanyAdjustment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsIntercompanyAdjustment() {
        return isIntercompanyAdjustment;
    }


    /**
     * Sets the isIntercompanyAdjustment value for this TransactionSearchRowBasic.
     * 
     * @param isIntercompanyAdjustment
     */
    public void setIsIntercompanyAdjustment(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isIntercompanyAdjustment) {
        this.isIntercompanyAdjustment = isIntercompanyAdjustment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsIntercompanyAdjustment(int i) {
        return this.isIntercompanyAdjustment[i];
    }

    public void setIsIntercompanyAdjustment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isIntercompanyAdjustment[i] = _value;
    }


    /**
     * Gets the isInTransitPayment value for this TransactionSearchRowBasic.
     * 
     * @return isInTransitPayment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInTransitPayment() {
        return isInTransitPayment;
    }


    /**
     * Sets the isInTransitPayment value for this TransactionSearchRowBasic.
     * 
     * @param isInTransitPayment
     */
    public void setIsInTransitPayment(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInTransitPayment) {
        this.isInTransitPayment = isInTransitPayment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInTransitPayment(int i) {
        return this.isInTransitPayment[i];
    }

    public void setIsInTransitPayment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInTransitPayment[i] = _value;
    }


    /**
     * Gets the isMultiShipTo value for this TransactionSearchRowBasic.
     * 
     * @return isMultiShipTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsMultiShipTo() {
        return isMultiShipTo;
    }


    /**
     * Sets the isMultiShipTo value for this TransactionSearchRowBasic.
     * 
     * @param isMultiShipTo
     */
    public void setIsMultiShipTo(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsMultiShipTo(int i) {
        return this.isMultiShipTo[i];
    }

    public void setIsMultiShipTo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isMultiShipTo[i] = _value;
    }


    /**
     * Gets the isReversal value for this TransactionSearchRowBasic.
     * 
     * @return isReversal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsReversal() {
        return isReversal;
    }


    /**
     * Sets the isReversal value for this TransactionSearchRowBasic.
     * 
     * @param isReversal
     */
    public void setIsReversal(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isReversal) {
        this.isReversal = isReversal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsReversal(int i) {
        return this.isReversal[i];
    }

    public void setIsReversal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isReversal[i] = _value;
    }


    /**
     * Gets the isRevRecTransaction value for this TransactionSearchRowBasic.
     * 
     * @return isRevRecTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsRevRecTransaction() {
        return isRevRecTransaction;
    }


    /**
     * Sets the isRevRecTransaction value for this TransactionSearchRowBasic.
     * 
     * @param isRevRecTransaction
     */
    public void setIsRevRecTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isRevRecTransaction) {
        this.isRevRecTransaction = isRevRecTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsRevRecTransaction(int i) {
        return this.isRevRecTransaction[i];
    }

    public void setIsRevRecTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isRevRecTransaction[i] = _value;
    }


    /**
     * Gets the isScrap value for this TransactionSearchRowBasic.
     * 
     * @return isScrap
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsScrap() {
        return isScrap;
    }


    /**
     * Sets the isScrap value for this TransactionSearchRowBasic.
     * 
     * @param isScrap
     */
    public void setIsScrap(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isScrap) {
        this.isScrap = isScrap;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsScrap(int i) {
        return this.isScrap[i];
    }

    public void setIsScrap(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isScrap[i] = _value;
    }


    /**
     * Gets the isShipAddress value for this TransactionSearchRowBasic.
     * 
     * @return isShipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this TransactionSearchRowBasic.
     * 
     * @param isShipAddress
     */
    public void setIsShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShipAddress) {
        this.isShipAddress = isShipAddress;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsShipAddress(int i) {
        return this.isShipAddress[i];
    }

    public void setIsShipAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isShipAddress[i] = _value;
    }


    /**
     * Gets the isTransferPriceCosting value for this TransactionSearchRowBasic.
     * 
     * @return isTransferPriceCosting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsTransferPriceCosting() {
        return isTransferPriceCosting;
    }


    /**
     * Sets the isTransferPriceCosting value for this TransactionSearchRowBasic.
     * 
     * @param isTransferPriceCosting
     */
    public void setIsTransferPriceCosting(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isTransferPriceCosting) {
        this.isTransferPriceCosting = isTransferPriceCosting;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsTransferPriceCosting(int i) {
        return this.isTransferPriceCosting[i];
    }

    public void setIsTransferPriceCosting(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isTransferPriceCosting[i] = _value;
    }


    /**
     * Gets the isWip value for this TransactionSearchRowBasic.
     * 
     * @return isWip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsWip() {
        return isWip;
    }


    /**
     * Sets the isWip value for this TransactionSearchRowBasic.
     * 
     * @param isWip
     */
    public void setIsWip(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isWip) {
        this.isWip = isWip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsWip(int i) {
        return this.isWip[i];
    }

    public void setIsWip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isWip[i] = _value;
    }


    /**
     * Gets the item value for this TransactionSearchRowBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransactionSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the itemFulfillmentChoice value for this TransactionSearchRowBasic.
     * 
     * @return itemFulfillmentChoice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getItemFulfillmentChoice() {
        return itemFulfillmentChoice;
    }


    /**
     * Sets the itemFulfillmentChoice value for this TransactionSearchRowBasic.
     * 
     * @param itemFulfillmentChoice
     */
    public void setItemFulfillmentChoice(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] itemFulfillmentChoice) {
        this.itemFulfillmentChoice = itemFulfillmentChoice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getItemFulfillmentChoice(int i) {
        return this.itemFulfillmentChoice[i];
    }

    public void setItemFulfillmentChoice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.itemFulfillmentChoice[i] = _value;
    }


    /**
     * Gets the itemRevision value for this TransactionSearchRowBasic.
     * 
     * @return itemRevision
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getItemRevision() {
        return itemRevision;
    }


    /**
     * Sets the itemRevision value for this TransactionSearchRowBasic.
     * 
     * @param itemRevision
     */
    public void setItemRevision(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] itemRevision) {
        this.itemRevision = itemRevision;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getItemRevision(int i) {
        return this.itemRevision[i];
    }

    public void setItemRevision(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.itemRevision[i] = _value;
    }


    /**
     * Gets the landedCostPerLine value for this TransactionSearchRowBasic.
     * 
     * @return landedCostPerLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getLandedCostPerLine() {
        return landedCostPerLine;
    }


    /**
     * Sets the landedCostPerLine value for this TransactionSearchRowBasic.
     * 
     * @param landedCostPerLine
     */
    public void setLandedCostPerLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getLandedCostPerLine(int i) {
        return this.landedCostPerLine[i];
    }

    public void setLandedCostPerLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.landedCostPerLine[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this TransactionSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TransactionSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the leadSource value for this TransactionSearchRowBasic.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this TransactionSearchRowBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource) {
        this.leadSource = leadSource;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLeadSource(int i) {
        return this.leadSource[i];
    }

    public void setLeadSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.leadSource[i] = _value;
    }


    /**
     * Gets the line value for this TransactionSearchRowBasic.
     * 
     * @return line
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLine() {
        return line;
    }


    /**
     * Sets the line value for this TransactionSearchRowBasic.
     * 
     * @param line
     */
    public void setLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] line) {
        this.line = line;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLine(int i) {
        return this.line[i];
    }

    public void setLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.line[i] = _value;
    }


    /**
     * Gets the lineSequenceNumber value for this TransactionSearchRowBasic.
     * 
     * @return lineSequenceNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLineSequenceNumber() {
        return lineSequenceNumber;
    }


    /**
     * Sets the lineSequenceNumber value for this TransactionSearchRowBasic.
     * 
     * @param lineSequenceNumber
     */
    public void setLineSequenceNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineSequenceNumber) {
        this.lineSequenceNumber = lineSequenceNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLineSequenceNumber(int i) {
        return this.lineSequenceNumber[i];
    }

    public void setLineSequenceNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.lineSequenceNumber[i] = _value;
    }


    /**
     * Gets the lineUniqueKey value for this TransactionSearchRowBasic.
     * 
     * @return lineUniqueKey
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getLineUniqueKey() {
        return lineUniqueKey;
    }


    /**
     * Sets the lineUniqueKey value for this TransactionSearchRowBasic.
     * 
     * @param lineUniqueKey
     */
    public void setLineUniqueKey(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] lineUniqueKey) {
        this.lineUniqueKey = lineUniqueKey;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getLineUniqueKey(int i) {
        return this.lineUniqueKey[i];
    }

    public void setLineUniqueKey(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.lineUniqueKey[i] = _value;
    }


    /**
     * Gets the location value for this TransactionSearchRowBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TransactionSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the locationAutoAssigned value for this TransactionSearchRowBasic.
     * 
     * @return locationAutoAssigned
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getLocationAutoAssigned() {
        return locationAutoAssigned;
    }


    /**
     * Sets the locationAutoAssigned value for this TransactionSearchRowBasic.
     * 
     * @param locationAutoAssigned
     */
    public void setLocationAutoAssigned(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] locationAutoAssigned) {
        this.locationAutoAssigned = locationAutoAssigned;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getLocationAutoAssigned(int i) {
        return this.locationAutoAssigned[i];
    }

    public void setLocationAutoAssigned(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.locationAutoAssigned[i] = _value;
    }


    /**
     * Gets the mainLine value for this TransactionSearchRowBasic.
     * 
     * @return mainLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMainLine() {
        return mainLine;
    }


    /**
     * Sets the mainLine value for this TransactionSearchRowBasic.
     * 
     * @param mainLine
     */
    public void setMainLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] mainLine) {
        this.mainLine = mainLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMainLine(int i) {
        return this.mainLine[i];
    }

    public void setMainLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.mainLine[i] = _value;
    }


    /**
     * Gets the mainName value for this TransactionSearchRowBasic.
     * 
     * @return mainName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMainName() {
        return mainName;
    }


    /**
     * Sets the mainName value for this TransactionSearchRowBasic.
     * 
     * @param mainName
     */
    public void setMainName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mainName) {
        this.mainName = mainName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMainName(int i) {
        return this.mainName[i];
    }

    public void setMainName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.mainName[i] = _value;
    }


    /**
     * Gets the manufacturingRouting value for this TransactionSearchRowBasic.
     * 
     * @return manufacturingRouting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getManufacturingRouting() {
        return manufacturingRouting;
    }


    /**
     * Sets the manufacturingRouting value for this TransactionSearchRowBasic.
     * 
     * @param manufacturingRouting
     */
    public void setManufacturingRouting(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] manufacturingRouting) {
        this.manufacturingRouting = manufacturingRouting;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getManufacturingRouting(int i) {
        return this.manufacturingRouting[i];
    }

    public void setManufacturingRouting(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.manufacturingRouting[i] = _value;
    }


    /**
     * Gets the matchBillToReceipt value for this TransactionSearchRowBasic.
     * 
     * @return matchBillToReceipt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this TransactionSearchRowBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMatchBillToReceipt(int i) {
        return this.matchBillToReceipt[i];
    }

    public void setMatchBillToReceipt(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.matchBillToReceipt[i] = _value;
    }


    /**
     * Gets the memo value for this TransactionSearchRowBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TransactionSearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the memoMain value for this TransactionSearchRowBasic.
     * 
     * @return memoMain
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMemoMain() {
        return memoMain;
    }


    /**
     * Sets the memoMain value for this TransactionSearchRowBasic.
     * 
     * @param memoMain
     */
    public void setMemoMain(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] memoMain) {
        this.memoMain = memoMain;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMemoMain(int i) {
        return this.memoMain[i];
    }

    public void setMemoMain(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.memoMain[i] = _value;
    }


    /**
     * Gets the memorized value for this TransactionSearchRowBasic.
     * 
     * @return memorized
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMemorized() {
        return memorized;
    }


    /**
     * Sets the memorized value for this TransactionSearchRowBasic.
     * 
     * @param memorized
     */
    public void setMemorized(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] memorized) {
        this.memorized = memorized;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMemorized(int i) {
        return this.memorized[i];
    }

    public void setMemorized(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.memorized[i] = _value;
    }


    /**
     * Gets the merchantAccount value for this TransactionSearchRowBasic.
     * 
     * @return merchantAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this TransactionSearchRowBasic.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getMerchantAccount(int i) {
        return this.merchantAccount[i];
    }

    public void setMerchantAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.merchantAccount[i] = _value;
    }


    /**
     * Gets the message value for this TransactionSearchRowBasic.
     * 
     * @return message
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TransactionSearchRowBasic.
     * 
     * @param message
     */
    public void setMessage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] message) {
        this.message = message;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.message[i] = _value;
    }


    /**
     * Gets the multiSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @return multiSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getMultiSubsidiary() {
        return multiSubsidiary;
    }


    /**
     * Sets the multiSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @param multiSubsidiary
     */
    public void setMultiSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getMultiSubsidiary(int i) {
        return this.multiSubsidiary[i];
    }

    public void setMultiSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.multiSubsidiary[i] = _value;
    }


    /**
     * Gets the netAmount value for this TransactionSearchRowBasic.
     * 
     * @return netAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this TransactionSearchRowBasic.
     * 
     * @param netAmount
     */
    public void setNetAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmount) {
        this.netAmount = netAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getNetAmount(int i) {
        return this.netAmount[i];
    }

    public void setNetAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.netAmount[i] = _value;
    }


    /**
     * Gets the netAmountNoTax value for this TransactionSearchRowBasic.
     * 
     * @return netAmountNoTax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getNetAmountNoTax() {
        return netAmountNoTax;
    }


    /**
     * Sets the netAmountNoTax value for this TransactionSearchRowBasic.
     * 
     * @param netAmountNoTax
     */
    public void setNetAmountNoTax(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] netAmountNoTax) {
        this.netAmountNoTax = netAmountNoTax;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getNetAmountNoTax(int i) {
        return this.netAmountNoTax[i];
    }

    public void setNetAmountNoTax(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.netAmountNoTax[i] = _value;
    }


    /**
     * Gets the nextApprover value for this TransactionSearchRowBasic.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this TransactionSearchRowBasic.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] nextApprover) {
        this.nextApprover = nextApprover;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getNextApprover(int i) {
        return this.nextApprover[i];
    }

    public void setNextApprover(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.nextApprover[i] = _value;
    }


    /**
     * Gets the nextBillDate value for this TransactionSearchRowBasic.
     * 
     * @return nextBillDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this TransactionSearchRowBasic.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getNextBillDate(int i) {
        return this.nextBillDate[i];
    }

    public void setNextBillDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.nextBillDate[i] = _value;
    }


    /**
     * Gets the noAutoAssignLocation value for this TransactionSearchRowBasic.
     * 
     * @return noAutoAssignLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getNoAutoAssignLocation() {
        return noAutoAssignLocation;
    }


    /**
     * Sets the noAutoAssignLocation value for this TransactionSearchRowBasic.
     * 
     * @param noAutoAssignLocation
     */
    public void setNoAutoAssignLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] noAutoAssignLocation) {
        this.noAutoAssignLocation = noAutoAssignLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getNoAutoAssignLocation(int i) {
        return this.noAutoAssignLocation[i];
    }

    public void setNoAutoAssignLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.noAutoAssignLocation[i] = _value;
    }


    /**
     * Gets the nonReimbursable value for this TransactionSearchRowBasic.
     * 
     * @return nonReimbursable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getNonReimbursable() {
        return nonReimbursable;
    }


    /**
     * Sets the nonReimbursable value for this TransactionSearchRowBasic.
     * 
     * @param nonReimbursable
     */
    public void setNonReimbursable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] nonReimbursable) {
        this.nonReimbursable = nonReimbursable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getNonReimbursable(int i) {
        return this.nonReimbursable[i];
    }

    public void setNonReimbursable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.nonReimbursable[i] = _value;
    }


    /**
     * Gets the oneTimeTotal value for this TransactionSearchRowBasic.
     * 
     * @return oneTimeTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOneTimeTotal() {
        return oneTimeTotal;
    }


    /**
     * Sets the oneTimeTotal value for this TransactionSearchRowBasic.
     * 
     * @param oneTimeTotal
     */
    public void setOneTimeTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] oneTimeTotal) {
        this.oneTimeTotal = oneTimeTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOneTimeTotal(int i) {
        return this.oneTimeTotal[i];
    }

    public void setOneTimeTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.oneTimeTotal[i] = _value;
    }


    /**
     * Gets the opportunity value for this TransactionSearchRowBasic.
     * 
     * @return opportunity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this TransactionSearchRowBasic.
     * 
     * @param opportunity
     */
    public void setOpportunity(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] opportunity) {
        this.opportunity = opportunity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOpportunity(int i) {
        return this.opportunity[i];
    }

    public void setOpportunity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.opportunity[i] = _value;
    }


    /**
     * Gets the options value for this TransactionSearchRowBasic.
     * 
     * @return options
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this TransactionSearchRowBasic.
     * 
     * @param options
     */
    public void setOptions(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] options) {
        this.options = options;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the orderPriority value for this TransactionSearchRowBasic.
     * 
     * @return orderPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOrderPriority() {
        return orderPriority;
    }


    /**
     * Sets the orderPriority value for this TransactionSearchRowBasic.
     * 
     * @param orderPriority
     */
    public void setOrderPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] orderPriority) {
        this.orderPriority = orderPriority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOrderPriority(int i) {
        return this.orderPriority[i];
    }

    public void setOrderPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.orderPriority[i] = _value;
    }


    /**
     * Gets the originator value for this TransactionSearchRowBasic.
     * 
     * @return originator
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getOriginator() {
        return originator;
    }


    /**
     * Sets the originator value for this TransactionSearchRowBasic.
     * 
     * @param originator
     */
    public void setOriginator(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] originator) {
        this.originator = originator;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getOriginator(int i) {
        return this.originator[i];
    }

    public void setOriginator(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.originator[i] = _value;
    }


    /**
     * Gets the otherRefNum value for this TransactionSearchRowBasic.
     * 
     * @return otherRefNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnTextNumberField[] getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this TransactionSearchRowBasic.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(com.netsuite.webservices.platform.core_2019_1.SearchColumnTextNumberField[] otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnTextNumberField getOtherRefNum(int i) {
        return this.otherRefNum[i];
    }

    public void setOtherRefNum(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnTextNumberField _value) {
        this.otherRefNum[i] = _value;
    }


    /**
     * Gets the overheadParentItem value for this TransactionSearchRowBasic.
     * 
     * @return overheadParentItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getOverheadParentItem() {
        return overheadParentItem;
    }


    /**
     * Sets the overheadParentItem value for this TransactionSearchRowBasic.
     * 
     * @param overheadParentItem
     */
    public void setOverheadParentItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] overheadParentItem) {
        this.overheadParentItem = overheadParentItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getOverheadParentItem(int i) {
        return this.overheadParentItem[i];
    }

    public void setOverheadParentItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.overheadParentItem[i] = _value;
    }


    /**
     * Gets the packageCount value for this TransactionSearchRowBasic.
     * 
     * @return packageCount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this TransactionSearchRowBasic.
     * 
     * @param packageCount
     */
    public void setPackageCount(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] packageCount) {
        this.packageCount = packageCount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getPackageCount(int i) {
        return this.packageCount[i];
    }

    public void setPackageCount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.packageCount[i] = _value;
    }


    /**
     * Gets the paidAmount value for this TransactionSearchRowBasic.
     * 
     * @return paidAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPaidAmount() {
        return paidAmount;
    }


    /**
     * Sets the paidAmount value for this TransactionSearchRowBasic.
     * 
     * @param paidAmount
     */
    public void setPaidAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] paidAmount) {
        this.paidAmount = paidAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPaidAmount(int i) {
        return this.paidAmount[i];
    }

    public void setPaidAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.paidAmount[i] = _value;
    }


    /**
     * Gets the paidTransaction value for this TransactionSearchRowBasic.
     * 
     * @return paidTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPaidTransaction() {
        return paidTransaction;
    }


    /**
     * Sets the paidTransaction value for this TransactionSearchRowBasic.
     * 
     * @param paidTransaction
     */
    public void setPaidTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] paidTransaction) {
        this.paidTransaction = paidTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPaidTransaction(int i) {
        return this.paidTransaction[i];
    }

    public void setPaidTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.paidTransaction[i] = _value;
    }


    /**
     * Gets the partner value for this TransactionSearchRowBasic.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this TransactionSearchRowBasic.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner) {
        this.partner = partner;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPartner(int i) {
        return this.partner[i];
    }

    public void setPartner(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.partner[i] = _value;
    }


    /**
     * Gets the partnerContribution value for this TransactionSearchRowBasic.
     * 
     * @return partnerContribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this TransactionSearchRowBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPartnerContribution(int i) {
        return this.partnerContribution[i];
    }

    public void setPartnerContribution(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.partnerContribution[i] = _value;
    }


    /**
     * Gets the partnerRole value for this TransactionSearchRowBasic.
     * 
     * @return partnerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this TransactionSearchRowBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.partnerRole[i] = _value;
    }


    /**
     * Gets the partnerTeamMember value for this TransactionSearchRowBasic.
     * 
     * @return partnerTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this TransactionSearchRowBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPartnerTeamMember(int i) {
        return this.partnerTeamMember[i];
    }

    public void setPartnerTeamMember(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.partnerTeamMember[i] = _value;
    }


    /**
     * Gets the payingAmount value for this TransactionSearchRowBasic.
     * 
     * @return payingAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPayingAmount() {
        return payingAmount;
    }


    /**
     * Sets the payingAmount value for this TransactionSearchRowBasic.
     * 
     * @param payingAmount
     */
    public void setPayingAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] payingAmount) {
        this.payingAmount = payingAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPayingAmount(int i) {
        return this.payingAmount[i];
    }

    public void setPayingAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.payingAmount[i] = _value;
    }


    /**
     * Gets the payingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return payingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPayingTransaction() {
        return payingTransaction;
    }


    /**
     * Sets the payingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param payingTransaction
     */
    public void setPayingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payingTransaction) {
        this.payingTransaction = payingTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPayingTransaction(int i) {
        return this.payingTransaction[i];
    }

    public void setPayingTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.payingTransaction[i] = _value;
    }


    /**
     * Gets the paymentApproved value for this TransactionSearchRowBasic.
     * 
     * @return paymentApproved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPaymentApproved() {
        return paymentApproved;
    }


    /**
     * Sets the paymentApproved value for this TransactionSearchRowBasic.
     * 
     * @param paymentApproved
     */
    public void setPaymentApproved(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentApproved) {
        this.paymentApproved = paymentApproved;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPaymentApproved(int i) {
        return this.paymentApproved[i];
    }

    public void setPaymentApproved(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.paymentApproved[i] = _value;
    }


    /**
     * Gets the paymentEventDate value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getPaymentEventDate() {
        return paymentEventDate;
    }


    /**
     * Sets the paymentEventDate value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventDate
     */
    public void setPaymentEventDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getPaymentEventDate(int i) {
        return this.paymentEventDate[i];
    }

    public void setPaymentEventDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.paymentEventDate[i] = _value;
    }


    /**
     * Gets the paymentEventHoldReason value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventHoldReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }


    /**
     * Sets the paymentEventHoldReason value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventHoldReason
     */
    public void setPaymentEventHoldReason(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getPaymentEventHoldReason(int i) {
        return this.paymentEventHoldReason[i];
    }

    public void setPaymentEventHoldReason(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.paymentEventHoldReason[i] = _value;
    }


    /**
     * Gets the paymentEventPurchaseCardUsed value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventPurchaseCardUsed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPaymentEventPurchaseCardUsed() {
        return paymentEventPurchaseCardUsed;
    }


    /**
     * Sets the paymentEventPurchaseCardUsed value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventPurchaseCardUsed
     */
    public void setPaymentEventPurchaseCardUsed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentEventPurchaseCardUsed) {
        this.paymentEventPurchaseCardUsed = paymentEventPurchaseCardUsed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPaymentEventPurchaseCardUsed(int i) {
        return this.paymentEventPurchaseCardUsed[i];
    }

    public void setPaymentEventPurchaseCardUsed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.paymentEventPurchaseCardUsed[i] = _value;
    }


    /**
     * Gets the paymentEventPurchaseDataSent value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventPurchaseDataSent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPaymentEventPurchaseDataSent() {
        return paymentEventPurchaseDataSent;
    }


    /**
     * Sets the paymentEventPurchaseDataSent value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventPurchaseDataSent
     */
    public void setPaymentEventPurchaseDataSent(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentEventPurchaseDataSent) {
        this.paymentEventPurchaseDataSent = paymentEventPurchaseDataSent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPaymentEventPurchaseDataSent(int i) {
        return this.paymentEventPurchaseDataSent[i];
    }

    public void setPaymentEventPurchaseDataSent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.paymentEventPurchaseDataSent[i] = _value;
    }


    /**
     * Gets the paymentEventResult value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventResult
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPaymentEventResult() {
        return paymentEventResult;
    }


    /**
     * Sets the paymentEventResult value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventResult
     */
    public void setPaymentEventResult(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getPaymentEventResult(int i) {
        return this.paymentEventResult[i];
    }

    public void setPaymentEventResult(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.paymentEventResult[i] = _value;
    }


    /**
     * Gets the paymentEventType value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPaymentEventType() {
        return paymentEventType;
    }


    /**
     * Sets the paymentEventType value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventType
     */
    public void setPaymentEventType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] paymentEventType) {
        this.paymentEventType = paymentEventType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getPaymentEventType(int i) {
        return this.paymentEventType[i];
    }

    public void setPaymentEventType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.paymentEventType[i] = _value;
    }


    /**
     * Gets the paymentHold value for this TransactionSearchRowBasic.
     * 
     * @return paymentHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPaymentHold() {
        return paymentHold;
    }


    /**
     * Sets the paymentHold value for this TransactionSearchRowBasic.
     * 
     * @param paymentHold
     */
    public void setPaymentHold(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] paymentHold) {
        this.paymentHold = paymentHold;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPaymentHold(int i) {
        return this.paymentHold[i];
    }

    public void setPaymentHold(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.paymentHold[i] = _value;
    }


    /**
     * Gets the paymentMethod value for this TransactionSearchRowBasic.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TransactionSearchRowBasic.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }


    /**
     * Gets the paymentOption value for this TransactionSearchRowBasic.
     * 
     * @return paymentOption
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPaymentOption() {
        return paymentOption;
    }


    /**
     * Sets the paymentOption value for this TransactionSearchRowBasic.
     * 
     * @param paymentOption
     */
    public void setPaymentOption(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] paymentOption) {
        this.paymentOption = paymentOption;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPaymentOption(int i) {
        return this.paymentOption[i];
    }

    public void setPaymentOption(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.paymentOption[i] = _value;
    }


    /**
     * Gets the payPalPending value for this TransactionSearchRowBasic.
     * 
     * @return payPalPending
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPayPalPending() {
        return payPalPending;
    }


    /**
     * Sets the payPalPending value for this TransactionSearchRowBasic.
     * 
     * @param payPalPending
     */
    public void setPayPalPending(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] payPalPending) {
        this.payPalPending = payPalPending;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPayPalPending(int i) {
        return this.payPalPending[i];
    }

    public void setPayPalPending(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.payPalPending[i] = _value;
    }


    /**
     * Gets the payPalStatus value for this TransactionSearchRowBasic.
     * 
     * @return payPalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPayPalStatus() {
        return payPalStatus;
    }


    /**
     * Sets the payPalStatus value for this TransactionSearchRowBasic.
     * 
     * @param payPalStatus
     */
    public void setPayPalStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] payPalStatus) {
        this.payPalStatus = payPalStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPayPalStatus(int i) {
        return this.payPalStatus[i];
    }

    public void setPayPalStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.payPalStatus[i] = _value;
    }


    /**
     * Gets the payPalTranId value for this TransactionSearchRowBasic.
     * 
     * @return payPalTranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPayPalTranId() {
        return payPalTranId;
    }


    /**
     * Sets the payPalTranId value for this TransactionSearchRowBasic.
     * 
     * @param payPalTranId
     */
    public void setPayPalTranId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] payPalTranId) {
        this.payPalTranId = payPalTranId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPayPalTranId(int i) {
        return this.payPalTranId[i];
    }

    public void setPayPalTranId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.payPalTranId[i] = _value;
    }


    /**
     * Gets the payrollBatch value for this TransactionSearchRowBasic.
     * 
     * @return payrollBatch
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPayrollBatch() {
        return payrollBatch;
    }


    /**
     * Sets the payrollBatch value for this TransactionSearchRowBasic.
     * 
     * @param payrollBatch
     */
    public void setPayrollBatch(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] payrollBatch) {
        this.payrollBatch = payrollBatch;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPayrollBatch(int i) {
        return this.payrollBatch[i];
    }

    public void setPayrollBatch(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.payrollBatch[i] = _value;
    }


    /**
     * Gets the pnRefNum value for this TransactionSearchRowBasic.
     * 
     * @return pnRefNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this TransactionSearchRowBasic.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPnRefNum(int i) {
        return this.pnRefNum[i];
    }

    public void setPnRefNum(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pnRefNum[i] = _value;
    }


    /**
     * Gets the poRate value for this TransactionSearchRowBasic.
     * 
     * @return poRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this TransactionSearchRowBasic.
     * 
     * @param poRate
     */
    public void setPoRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] poRate) {
        this.poRate = poRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPoRate(int i) {
        return this.poRate[i];
    }

    public void setPoRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.poRate[i] = _value;
    }


    /**
     * Gets the posting value for this TransactionSearchRowBasic.
     * 
     * @return posting
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPosting() {
        return posting;
    }


    /**
     * Sets the posting value for this TransactionSearchRowBasic.
     * 
     * @param posting
     */
    public void setPosting(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] posting) {
        this.posting = posting;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPosting(int i) {
        return this.posting[i];
    }

    public void setPosting(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.posting[i] = _value;
    }


    /**
     * Gets the postingPeriod value for this TransactionSearchRowBasic.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this TransactionSearchRowBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPostingPeriod(int i) {
        return this.postingPeriod[i];
    }

    public void setPostingPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.postingPeriod[i] = _value;
    }


    /**
     * Gets the priceLevel value for this TransactionSearchRowBasic.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this TransactionSearchRowBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel) {
        this.priceLevel = priceLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPriceLevel(int i) {
        return this.priceLevel[i];
    }

    public void setPriceLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.priceLevel[i] = _value;
    }


    /**
     * Gets the print value for this TransactionSearchRowBasic.
     * 
     * @return print
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPrint() {
        return print;
    }


    /**
     * Sets the print value for this TransactionSearchRowBasic.
     * 
     * @param print
     */
    public void setPrint(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] print) {
        this.print = print;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPrint(int i) {
        return this.print[i];
    }

    public void setPrint(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.print[i] = _value;
    }


    /**
     * Gets the probability value for this TransactionSearchRowBasic.
     * 
     * @return probability
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this TransactionSearchRowBasic.
     * 
     * @param probability
     */
    public void setProbability(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] probability) {
        this.probability = probability;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getProbability(int i) {
        return this.probability[i];
    }

    public void setProbability(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.probability[i] = _value;
    }


    /**
     * Gets the projectedAmount value for this TransactionSearchRowBasic.
     * 
     * @return projectedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getProjectedAmount() {
        return projectedAmount;
    }


    /**
     * Sets the projectedAmount value for this TransactionSearchRowBasic.
     * 
     * @param projectedAmount
     */
    public void setProjectedAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] projectedAmount) {
        this.projectedAmount = projectedAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getProjectedAmount(int i) {
        return this.projectedAmount[i];
    }

    public void setProjectedAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.projectedAmount[i] = _value;
    }


    /**
     * Gets the projectTask value for this TransactionSearchRowBasic.
     * 
     * @return projectTask
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getProjectTask() {
        return projectTask;
    }


    /**
     * Sets the projectTask value for this TransactionSearchRowBasic.
     * 
     * @param projectTask
     */
    public void setProjectTask(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] projectTask) {
        this.projectTask = projectTask;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getProjectTask(int i) {
        return this.projectTask[i];
    }

    public void setProjectTask(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.projectTask[i] = _value;
    }


    /**
     * Gets the promoCode value for this TransactionSearchRowBasic.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this TransactionSearchRowBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] promoCode) {
        this.promoCode = promoCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.promoCode[i] = _value;
    }


    /**
     * Gets the purchaseOrder value for this TransactionSearchRowBasic.
     * 
     * @return purchaseOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this TransactionSearchRowBasic.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPurchaseOrder(int i) {
        return this.purchaseOrder[i];
    }

    public void setPurchaseOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.purchaseOrder[i] = _value;
    }


    /**
     * Gets the quantity value for this TransactionSearchRowBasic.
     * 
     * @return quantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TransactionSearchRowBasic.
     * 
     * @param quantity
     */
    public void setQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }


    /**
     * Gets the quantityBilled value for this TransactionSearchRowBasic.
     * 
     * @return quantityBilled
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this TransactionSearchRowBasic.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityBilled(int i) {
        return this.quantityBilled[i];
    }

    public void setQuantityBilled(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityBilled[i] = _value;
    }


    /**
     * Gets the quantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @return quantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityCommitted(int i) {
        return this.quantityCommitted[i];
    }

    public void setQuantityCommitted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityCommitted[i] = _value;
    }


    /**
     * Gets the quantityPacked value for this TransactionSearchRowBasic.
     * 
     * @return quantityPacked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityPacked() {
        return quantityPacked;
    }


    /**
     * Sets the quantityPacked value for this TransactionSearchRowBasic.
     * 
     * @param quantityPacked
     */
    public void setQuantityPacked(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityPacked) {
        this.quantityPacked = quantityPacked;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityPacked(int i) {
        return this.quantityPacked[i];
    }

    public void setQuantityPacked(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityPacked[i] = _value;
    }


    /**
     * Gets the quantityPicked value for this TransactionSearchRowBasic.
     * 
     * @return quantityPicked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityPicked() {
        return quantityPicked;
    }


    /**
     * Sets the quantityPicked value for this TransactionSearchRowBasic.
     * 
     * @param quantityPicked
     */
    public void setQuantityPicked(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityPicked) {
        this.quantityPicked = quantityPicked;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityPicked(int i) {
        return this.quantityPicked[i];
    }

    public void setQuantityPicked(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityPicked[i] = _value;
    }


    /**
     * Gets the quantityRevCommitted value for this TransactionSearchRowBasic.
     * 
     * @return quantityRevCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityRevCommitted() {
        return quantityRevCommitted;
    }


    /**
     * Sets the quantityRevCommitted value for this TransactionSearchRowBasic.
     * 
     * @param quantityRevCommitted
     */
    public void setQuantityRevCommitted(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityRevCommitted(int i) {
        return this.quantityRevCommitted[i];
    }

    public void setQuantityRevCommitted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityRevCommitted[i] = _value;
    }


    /**
     * Gets the quantityShipRecv value for this TransactionSearchRowBasic.
     * 
     * @return quantityShipRecv
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityShipRecv() {
        return quantityShipRecv;
    }


    /**
     * Sets the quantityShipRecv value for this TransactionSearchRowBasic.
     * 
     * @param quantityShipRecv
     */
    public void setQuantityShipRecv(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityShipRecv) {
        this.quantityShipRecv = quantityShipRecv;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityShipRecv(int i) {
        return this.quantityShipRecv[i];
    }

    public void setQuantityShipRecv(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityShipRecv[i] = _value;
    }


    /**
     * Gets the quantityUom value for this TransactionSearchRowBasic.
     * 
     * @return quantityUom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getQuantityUom() {
        return quantityUom;
    }


    /**
     * Sets the quantityUom value for this TransactionSearchRowBasic.
     * 
     * @param quantityUom
     */
    public void setQuantityUom(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] quantityUom) {
        this.quantityUom = quantityUom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getQuantityUom(int i) {
        return this.quantityUom[i];
    }

    public void setQuantityUom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.quantityUom[i] = _value;
    }


    /**
     * Gets the rate value for this TransactionSearchRowBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TransactionSearchRowBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }


    /**
     * Gets the realizedGainPostingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return realizedGainPostingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRealizedGainPostingTransaction() {
        return realizedGainPostingTransaction;
    }


    /**
     * Sets the realizedGainPostingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param realizedGainPostingTransaction
     */
    public void setRealizedGainPostingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] realizedGainPostingTransaction) {
        this.realizedGainPostingTransaction = realizedGainPostingTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRealizedGainPostingTransaction(int i) {
        return this.realizedGainPostingTransaction[i];
    }

    public void setRealizedGainPostingTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.realizedGainPostingTransaction[i] = _value;
    }


    /**
     * Gets the recognizedRevenue value for this TransactionSearchRowBasic.
     * 
     * @return recognizedRevenue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this TransactionSearchRowBasic.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecognizedRevenue(int i) {
        return this.recognizedRevenue[i];
    }

    public void setRecognizedRevenue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recognizedRevenue[i] = _value;
    }


    /**
     * Gets the recordType value for this TransactionSearchRowBasic.
     * 
     * @return recordType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this TransactionSearchRowBasic.
     * 
     * @param recordType
     */
    public void setRecordType(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] recordType) {
        this.recordType = recordType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRecordType(int i) {
        return this.recordType[i];
    }

    public void setRecordType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.recordType[i] = _value;
    }


    /**
     * Gets the recurAnnuallyTotal value for this TransactionSearchRowBasic.
     * 
     * @return recurAnnuallyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecurAnnuallyTotal() {
        return recurAnnuallyTotal;
    }


    /**
     * Sets the recurAnnuallyTotal value for this TransactionSearchRowBasic.
     * 
     * @param recurAnnuallyTotal
     */
    public void setRecurAnnuallyTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurAnnuallyTotal) {
        this.recurAnnuallyTotal = recurAnnuallyTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecurAnnuallyTotal(int i) {
        return this.recurAnnuallyTotal[i];
    }

    public void setRecurAnnuallyTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recurAnnuallyTotal[i] = _value;
    }


    /**
     * Gets the recurMonthlyTotal value for this TransactionSearchRowBasic.
     * 
     * @return recurMonthlyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecurMonthlyTotal() {
        return recurMonthlyTotal;
    }


    /**
     * Sets the recurMonthlyTotal value for this TransactionSearchRowBasic.
     * 
     * @param recurMonthlyTotal
     */
    public void setRecurMonthlyTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurMonthlyTotal) {
        this.recurMonthlyTotal = recurMonthlyTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecurMonthlyTotal(int i) {
        return this.recurMonthlyTotal[i];
    }

    public void setRecurMonthlyTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recurMonthlyTotal[i] = _value;
    }


    /**
     * Gets the recurQuarterlyTotal value for this TransactionSearchRowBasic.
     * 
     * @return recurQuarterlyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecurQuarterlyTotal() {
        return recurQuarterlyTotal;
    }


    /**
     * Sets the recurQuarterlyTotal value for this TransactionSearchRowBasic.
     * 
     * @param recurQuarterlyTotal
     */
    public void setRecurQuarterlyTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurQuarterlyTotal) {
        this.recurQuarterlyTotal = recurQuarterlyTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecurQuarterlyTotal(int i) {
        return this.recurQuarterlyTotal[i];
    }

    public void setRecurQuarterlyTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recurQuarterlyTotal[i] = _value;
    }


    /**
     * Gets the recurringBill value for this TransactionSearchRowBasic.
     * 
     * @return recurringBill
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getRecurringBill() {
        return recurringBill;
    }


    /**
     * Sets the recurringBill value for this TransactionSearchRowBasic.
     * 
     * @param recurringBill
     */
    public void setRecurringBill(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] recurringBill) {
        this.recurringBill = recurringBill;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getRecurringBill(int i) {
        return this.recurringBill[i];
    }

    public void setRecurringBill(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.recurringBill[i] = _value;
    }


    /**
     * Gets the recurWeeklyTotal value for this TransactionSearchRowBasic.
     * 
     * @return recurWeeklyTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRecurWeeklyTotal() {
        return recurWeeklyTotal;
    }


    /**
     * Sets the recurWeeklyTotal value for this TransactionSearchRowBasic.
     * 
     * @param recurWeeklyTotal
     */
    public void setRecurWeeklyTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] recurWeeklyTotal) {
        this.recurWeeklyTotal = recurWeeklyTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRecurWeeklyTotal(int i) {
        return this.recurWeeklyTotal[i];
    }

    public void setRecurWeeklyTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.recurWeeklyTotal[i] = _value;
    }


    /**
     * Gets the refNumber value for this TransactionSearchRowBasic.
     * 
     * @return refNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getRefNumber() {
        return refNumber;
    }


    /**
     * Sets the refNumber value for this TransactionSearchRowBasic.
     * 
     * @param refNumber
     */
    public void setRefNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] refNumber) {
        this.refNumber = refNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getRefNumber(int i) {
        return this.refNumber[i];
    }

    public void setRefNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.refNumber[i] = _value;
    }


    /**
     * Gets the revCommitStatus value for this TransactionSearchRowBasic.
     * 
     * @return revCommitStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this TransactionSearchRowBasic.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getRevCommitStatus(int i) {
        return this.revCommitStatus[i];
    }

    public void setRevCommitStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.revCommitStatus[i] = _value;
    }


    /**
     * Gets the revCommittingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return revCommittingTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRevCommittingTransaction() {
        return revCommittingTransaction;
    }


    /**
     * Sets the revCommittingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param revCommittingTransaction
     */
    public void setRevCommittingTransaction(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] revCommittingTransaction) {
        this.revCommittingTransaction = revCommittingTransaction;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRevCommittingTransaction(int i) {
        return this.revCommittingTransaction[i];
    }

    public void setRevCommittingTransaction(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.revCommittingTransaction[i] = _value;
    }


    /**
     * Gets the revenueStatus value for this TransactionSearchRowBasic.
     * 
     * @return revenueStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this TransactionSearchRowBasic.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getRevenueStatus(int i) {
        return this.revenueStatus[i];
    }

    public void setRevenueStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.revenueStatus[i] = _value;
    }


    /**
     * Gets the reversalDate value for this TransactionSearchRowBasic.
     * 
     * @return reversalDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getReversalDate() {
        return reversalDate;
    }


    /**
     * Sets the reversalDate value for this TransactionSearchRowBasic.
     * 
     * @param reversalDate
     */
    public void setReversalDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] reversalDate) {
        this.reversalDate = reversalDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getReversalDate(int i) {
        return this.reversalDate[i];
    }

    public void setReversalDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.reversalDate[i] = _value;
    }


    /**
     * Gets the reversalNumber value for this TransactionSearchRowBasic.
     * 
     * @return reversalNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getReversalNumber() {
        return reversalNumber;
    }


    /**
     * Sets the reversalNumber value for this TransactionSearchRowBasic.
     * 
     * @param reversalNumber
     */
    public void setReversalNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] reversalNumber) {
        this.reversalNumber = reversalNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getReversalNumber(int i) {
        return this.reversalNumber[i];
    }

    public void setReversalNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.reversalNumber[i] = _value;
    }


    /**
     * Gets the revRecEndDate value for this TransactionSearchRowBasic.
     * 
     * @return revRecEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this TransactionSearchRowBasic.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getRevRecEndDate(int i) {
        return this.revRecEndDate[i];
    }

    public void setRevRecEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.revRecEndDate[i] = _value;
    }


    /**
     * Gets the revRecOnRevCommitment value for this TransactionSearchRowBasic.
     * 
     * @return revRecOnRevCommitment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this TransactionSearchRowBasic.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getRevRecOnRevCommitment(int i) {
        return this.revRecOnRevCommitment[i];
    }

    public void setRevRecOnRevCommitment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.revRecOnRevCommitment[i] = _value;
    }


    /**
     * Gets the revRecStartDate value for this TransactionSearchRowBasic.
     * 
     * @return revRecStartDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this TransactionSearchRowBasic.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getRevRecStartDate(int i) {
        return this.revRecStartDate[i];
    }

    public void setRevRecStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.revRecStartDate[i] = _value;
    }


    /**
     * Gets the rgAccount value for this TransactionSearchRowBasic.
     * 
     * @return rgAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getRgAccount() {
        return rgAccount;
    }


    /**
     * Sets the rgAccount value for this TransactionSearchRowBasic.
     * 
     * @param rgAccount
     */
    public void setRgAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] rgAccount) {
        this.rgAccount = rgAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getRgAccount(int i) {
        return this.rgAccount[i];
    }

    public void setRgAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.rgAccount[i] = _value;
    }


    /**
     * Gets the rgAmount value for this TransactionSearchRowBasic.
     * 
     * @return rgAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getRgAmount() {
        return rgAmount;
    }


    /**
     * Sets the rgAmount value for this TransactionSearchRowBasic.
     * 
     * @param rgAmount
     */
    public void setRgAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] rgAmount) {
        this.rgAmount = rgAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getRgAmount(int i) {
        return this.rgAmount[i];
    }

    public void setRgAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.rgAmount[i] = _value;
    }


    /**
     * Gets the salesEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @return salesEffectiveDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getSalesEffectiveDate(int i) {
        return this.salesEffectiveDate[i];
    }

    public void setSalesEffectiveDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.salesEffectiveDate[i] = _value;
    }


    /**
     * Gets the salesOrder value for this TransactionSearchRowBasic.
     * 
     * @return salesOrder
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesOrder() {
        return salesOrder;
    }


    /**
     * Sets the salesOrder value for this TransactionSearchRowBasic.
     * 
     * @param salesOrder
     */
    public void setSalesOrder(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesOrder) {
        this.salesOrder = salesOrder;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesOrder(int i) {
        return this.salesOrder[i];
    }

    public void setSalesOrder(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesOrder[i] = _value;
    }


    /**
     * Gets the salesRep value for this TransactionSearchRowBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this TransactionSearchRowBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep) {
        this.salesRep = salesRep;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesRep(int i) {
        return this.salesRep[i];
    }

    public void setSalesRep(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesRep[i] = _value;
    }


    /**
     * Gets the salesTeamMember value for this TransactionSearchRowBasic.
     * 
     * @return salesTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this TransactionSearchRowBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesTeamMember(int i) {
        return this.salesTeamMember[i];
    }

    public void setSalesTeamMember(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesTeamMember[i] = _value;
    }


    /**
     * Gets the salesTeamRole value for this TransactionSearchRowBasic.
     * 
     * @return salesTeamRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this TransactionSearchRowBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSalesTeamRole(int i) {
        return this.salesTeamRole[i];
    }

    public void setSalesTeamRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.salesTeamRole[i] = _value;
    }


    /**
     * Gets the schedulingMethod value for this TransactionSearchRowBasic.
     * 
     * @return schedulingMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getSchedulingMethod() {
        return schedulingMethod;
    }


    /**
     * Sets the schedulingMethod value for this TransactionSearchRowBasic.
     * 
     * @param schedulingMethod
     */
    public void setSchedulingMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getSchedulingMethod(int i) {
        return this.schedulingMethod[i];
    }

    public void setSchedulingMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.schedulingMethod[i] = _value;
    }


    /**
     * Gets the serialNumber value for this TransactionSearchRowBasic.
     * 
     * @return serialNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this TransactionSearchRowBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }


    /**
     * Gets the serialNumberCost value for this TransactionSearchRowBasic.
     * 
     * @return serialNumberCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSerialNumberCost() {
        return serialNumberCost;
    }


    /**
     * Sets the serialNumberCost value for this TransactionSearchRowBasic.
     * 
     * @param serialNumberCost
     */
    public void setSerialNumberCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] serialNumberCost) {
        this.serialNumberCost = serialNumberCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSerialNumberCost(int i) {
        return this.serialNumberCost[i];
    }

    public void setSerialNumberCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.serialNumberCost[i] = _value;
    }


    /**
     * Gets the serialNumberCostAdjustment value for this TransactionSearchRowBasic.
     * 
     * @return serialNumberCostAdjustment
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSerialNumberCostAdjustment() {
        return serialNumberCostAdjustment;
    }


    /**
     * Sets the serialNumberCostAdjustment value for this TransactionSearchRowBasic.
     * 
     * @param serialNumberCostAdjustment
     */
    public void setSerialNumberCostAdjustment(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] serialNumberCostAdjustment) {
        this.serialNumberCostAdjustment = serialNumberCostAdjustment;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSerialNumberCostAdjustment(int i) {
        return this.serialNumberCostAdjustment[i];
    }

    public void setSerialNumberCostAdjustment(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.serialNumberCostAdjustment[i] = _value;
    }


    /**
     * Gets the serialNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @return serialNumberQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSerialNumberQuantity() {
        return serialNumberQuantity;
    }


    /**
     * Sets the serialNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @param serialNumberQuantity
     */
    public void setSerialNumberQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] serialNumberQuantity) {
        this.serialNumberQuantity = serialNumberQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSerialNumberQuantity(int i) {
        return this.serialNumberQuantity[i];
    }

    public void setSerialNumberQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.serialNumberQuantity[i] = _value;
    }


    /**
     * Gets the serialNumbers value for this TransactionSearchRowBasic.
     * 
     * @return serialNumbers
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this TransactionSearchRowBasic.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSerialNumbers(int i) {
        return this.serialNumbers[i];
    }

    public void setSerialNumbers(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.serialNumbers[i] = _value;
    }


    /**
     * Gets the shipAddress value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this TransactionSearchRowBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress) {
        this.shipAddress = shipAddress;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipAddress(int i) {
        return this.shipAddress[i];
    }

    public void setShipAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipAddress[i] = _value;
    }


    /**
     * Gets the shipAddress1 value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this TransactionSearchRowBasic.
     * 
     * @param shipAddress1
     */
    public void setShipAddress1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipAddress1(int i) {
        return this.shipAddress1[i];
    }

    public void setShipAddress1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipAddress1[i] = _value;
    }


    /**
     * Gets the shipAddress2 value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this TransactionSearchRowBasic.
     * 
     * @param shipAddress2
     */
    public void setShipAddress2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipAddress2(int i) {
        return this.shipAddress2[i];
    }

    public void setShipAddress2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipAddress2[i] = _value;
    }


    /**
     * Gets the shipAddress3 value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress3() {
        return shipAddress3;
    }


    /**
     * Sets the shipAddress3 value for this TransactionSearchRowBasic.
     * 
     * @param shipAddress3
     */
    public void setShipAddress3(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress3) {
        this.shipAddress3 = shipAddress3;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipAddress3(int i) {
        return this.shipAddress3[i];
    }

    public void setShipAddress3(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipAddress3[i] = _value;
    }


    /**
     * Gets the shipAddressee value for this TransactionSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this TransactionSearchRowBasic.
     * 
     * @param shipAddressee
     */
    public void setShipAddressee(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipAddressee(int i) {
        return this.shipAddressee[i];
    }

    public void setShipAddressee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipAddressee[i] = _value;
    }


    /**
     * Gets the shipAttention value for this TransactionSearchRowBasic.
     * 
     * @return shipAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this TransactionSearchRowBasic.
     * 
     * @param shipAttention
     */
    public void setShipAttention(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAttention) {
        this.shipAttention = shipAttention;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipAttention(int i) {
        return this.shipAttention[i];
    }

    public void setShipAttention(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipAttention[i] = _value;
    }


    /**
     * Gets the shipCarrier value for this TransactionSearchRowBasic.
     * 
     * @return shipCarrier
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getShipCarrier() {
        return shipCarrier;
    }


    /**
     * Sets the shipCarrier value for this TransactionSearchRowBasic.
     * 
     * @param shipCarrier
     */
    public void setShipCarrier(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCarrier) {
        this.shipCarrier = shipCarrier;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getShipCarrier(int i) {
        return this.shipCarrier[i];
    }

    public void setShipCarrier(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.shipCarrier[i] = _value;
    }


    /**
     * Gets the shipCity value for this TransactionSearchRowBasic.
     * 
     * @return shipCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this TransactionSearchRowBasic.
     * 
     * @param shipCity
     */
    public void setShipCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCity) {
        this.shipCity = shipCity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipCity(int i) {
        return this.shipCity[i];
    }

    public void setShipCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipCity[i] = _value;
    }


    /**
     * Gets the shipComplete value for this TransactionSearchRowBasic.
     * 
     * @return shipComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this TransactionSearchRowBasic.
     * 
     * @param shipComplete
     */
    public void setShipComplete(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipComplete) {
        this.shipComplete = shipComplete;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getShipComplete(int i) {
        return this.shipComplete[i];
    }

    public void setShipComplete(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.shipComplete[i] = _value;
    }


    /**
     * Gets the shipCountry value for this TransactionSearchRowBasic.
     * 
     * @return shipCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this TransactionSearchRowBasic.
     * 
     * @param shipCountry
     */
    public void setShipCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCountry) {
        this.shipCountry = shipCountry;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getShipCountry(int i) {
        return this.shipCountry[i];
    }

    public void setShipCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.shipCountry[i] = _value;
    }


    /**
     * Gets the shipCountryCode value for this TransactionSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this TransactionSearchRowBasic.
     * 
     * @param shipCountryCode
     */
    public void setShipCountryCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipCountryCode(int i) {
        return this.shipCountryCode[i];
    }

    public void setShipCountryCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipCountryCode[i] = _value;
    }


    /**
     * Gets the shipDate value for this TransactionSearchRowBasic.
     * 
     * @return shipDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this TransactionSearchRowBasic.
     * 
     * @param shipDate
     */
    public void setShipDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] shipDate) {
        this.shipDate = shipDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getShipDate(int i) {
        return this.shipDate[i];
    }

    public void setShipDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.shipDate[i] = _value;
    }


    /**
     * Gets the shipGroup value for this TransactionSearchRowBasic.
     * 
     * @return shipGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this TransactionSearchRowBasic.
     * 
     * @param shipGroup
     */
    public void setShipGroup(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] shipGroup) {
        this.shipGroup = shipGroup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getShipGroup(int i) {
        return this.shipGroup[i];
    }

    public void setShipGroup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.shipGroup[i] = _value;
    }


    /**
     * Gets the shipMethod value for this TransactionSearchRowBasic.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this TransactionSearchRowBasic.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipMethod) {
        this.shipMethod = shipMethod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getShipMethod(int i) {
        return this.shipMethod[i];
    }

    public void setShipMethod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.shipMethod[i] = _value;
    }


    /**
     * Gets the shipPhone value for this TransactionSearchRowBasic.
     * 
     * @return shipPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this TransactionSearchRowBasic.
     * 
     * @param shipPhone
     */
    public void setShipPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipPhone) {
        this.shipPhone = shipPhone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipPhone(int i) {
        return this.shipPhone[i];
    }

    public void setShipPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipPhone[i] = _value;
    }


    /**
     * Gets the shippingAmount value for this TransactionSearchRowBasic.
     * 
     * @return shippingAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this TransactionSearchRowBasic.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getShippingAmount(int i) {
        return this.shippingAmount[i];
    }

    public void setShippingAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.shippingAmount[i] = _value;
    }


    /**
     * Gets the shipRecvStatusLine value for this TransactionSearchRowBasic.
     * 
     * @return shipRecvStatusLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getShipRecvStatusLine() {
        return shipRecvStatusLine;
    }


    /**
     * Sets the shipRecvStatusLine value for this TransactionSearchRowBasic.
     * 
     * @param shipRecvStatusLine
     */
    public void setShipRecvStatusLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipRecvStatusLine) {
        this.shipRecvStatusLine = shipRecvStatusLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getShipRecvStatusLine(int i) {
        return this.shipRecvStatusLine[i];
    }

    public void setShipRecvStatusLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.shipRecvStatusLine[i] = _value;
    }


    /**
     * Gets the shipState value for this TransactionSearchRowBasic.
     * 
     * @return shipState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this TransactionSearchRowBasic.
     * 
     * @param shipState
     */
    public void setShipState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipState) {
        this.shipState = shipState;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipState(int i) {
        return this.shipState[i];
    }

    public void setShipState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipState[i] = _value;
    }


    /**
     * Gets the shipTo value for this TransactionSearchRowBasic.
     * 
     * @return shipTo
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this TransactionSearchRowBasic.
     * 
     * @param shipTo
     */
    public void setShipTo(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shipTo) {
        this.shipTo = shipTo;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getShipTo(int i) {
        return this.shipTo[i];
    }

    public void setShipTo(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.shipTo[i] = _value;
    }


    /**
     * Gets the shipZip value for this TransactionSearchRowBasic.
     * 
     * @return shipZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this TransactionSearchRowBasic.
     * 
     * @param shipZip
     */
    public void setShipZip(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipZip) {
        this.shipZip = shipZip;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getShipZip(int i) {
        return this.shipZip[i];
    }

    public void setShipZip(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.shipZip[i] = _value;
    }


    /**
     * Gets the signedAmount value for this TransactionSearchRowBasic.
     * 
     * @return signedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getSignedAmount() {
        return signedAmount;
    }


    /**
     * Sets the signedAmount value for this TransactionSearchRowBasic.
     * 
     * @param signedAmount
     */
    public void setSignedAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] signedAmount) {
        this.signedAmount = signedAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getSignedAmount(int i) {
        return this.signedAmount[i];
    }

    public void setSignedAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.signedAmount[i] = _value;
    }


    /**
     * Gets the source value for this TransactionSearchRowBasic.
     * 
     * @return source
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this TransactionSearchRowBasic.
     * 
     * @param source
     */
    public void setSource(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] source) {
        this.source = source;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the startDate value for this TransactionSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TransactionSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the status value for this TransactionSearchRowBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the subscription value for this TransactionSearchRowBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this TransactionSearchRowBasic.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription) {
        this.subscription = subscription;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subscription[i] = _value;
    }


    /**
     * Gets the subscriptionLine value for this TransactionSearchRowBasic.
     * 
     * @return subscriptionLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubscriptionLine() {
        return subscriptionLine;
    }


    /**
     * Sets the subscriptionLine value for this TransactionSearchRowBasic.
     * 
     * @param subscriptionLine
     */
    public void setSubscriptionLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubscriptionLine(int i) {
        return this.subscriptionLine[i];
    }

    public void setSubscriptionLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subscriptionLine[i] = _value;
    }


    /**
     * Gets the subsidiary value for this TransactionSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TransactionSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the taxAmount value for this TransactionSearchRowBasic.
     * 
     * @return taxAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TransactionSearchRowBasic.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxAmount) {
        this.taxAmount = taxAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTaxAmount(int i) {
        return this.taxAmount[i];
    }

    public void setTaxAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.taxAmount[i] = _value;
    }


    /**
     * Gets the taxCode value for this TransactionSearchRowBasic.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TransactionSearchRowBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxCode) {
        this.taxCode = taxCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxCode(int i) {
        return this.taxCode[i];
    }

    public void setTaxCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxCode[i] = _value;
    }


    /**
     * Gets the taxLine value for this TransactionSearchRowBasic.
     * 
     * @return taxLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTaxLine() {
        return taxLine;
    }


    /**
     * Sets the taxLine value for this TransactionSearchRowBasic.
     * 
     * @param taxLine
     */
    public void setTaxLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxLine) {
        this.taxLine = taxLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTaxLine(int i) {
        return this.taxLine[i];
    }

    public void setTaxLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.taxLine[i] = _value;
    }


    /**
     * Gets the taxPeriod value for this TransactionSearchRowBasic.
     * 
     * @return taxPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this TransactionSearchRowBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxPeriod(int i) {
        return this.taxPeriod[i];
    }

    public void setTaxPeriod(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxPeriod[i] = _value;
    }


    /**
     * Gets the taxPointDate value for this TransactionSearchRowBasic.
     * 
     * @return taxPointDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this TransactionSearchRowBasic.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getTaxPointDate(int i) {
        return this.taxPointDate[i];
    }

    public void setTaxPointDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.taxPointDate[i] = _value;
    }


    /**
     * Gets the taxTotal value for this TransactionSearchRowBasic.
     * 
     * @return taxTotal
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this TransactionSearchRowBasic.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] taxTotal) {
        this.taxTotal = taxTotal;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTaxTotal(int i) {
        return this.taxTotal[i];
    }

    public void setTaxTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.taxTotal[i] = _value;
    }


    /**
     * Gets the termInMonths value for this TransactionSearchRowBasic.
     * 
     * @return termInMonths
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getTermInMonths() {
        return termInMonths;
    }


    /**
     * Sets the termInMonths value for this TransactionSearchRowBasic.
     * 
     * @param termInMonths
     */
    public void setTermInMonths(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] termInMonths) {
        this.termInMonths = termInMonths;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getTermInMonths(int i) {
        return this.termInMonths[i];
    }

    public void setTermInMonths(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.termInMonths[i] = _value;
    }


    /**
     * Gets the terms value for this TransactionSearchRowBasic.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this TransactionSearchRowBasic.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] terms) {
        this.terms = terms;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTerms(int i) {
        return this.terms[i];
    }

    public void setTerms(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.terms[i] = _value;
    }


    /**
     * Gets the termsOfSale value for this TransactionSearchRowBasic.
     * 
     * @return termsOfSale
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTermsOfSale() {
        return termsOfSale;
    }


    /**
     * Sets the termsOfSale value for this TransactionSearchRowBasic.
     * 
     * @param termsOfSale
     */
    public void setTermsOfSale(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTermsOfSale(int i) {
        return this.termsOfSale[i];
    }

    public void setTermsOfSale(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.termsOfSale[i] = _value;
    }


    /**
     * Gets the title value for this TransactionSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TransactionSearchRowBasic.
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
     * Gets the toBeEmailed value for this TransactionSearchRowBasic.
     * 
     * @return toBeEmailed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this TransactionSearchRowBasic.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getToBeEmailed(int i) {
        return this.toBeEmailed[i];
    }

    public void setToBeEmailed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.toBeEmailed[i] = _value;
    }


    /**
     * Gets the toBePrinted value for this TransactionSearchRowBasic.
     * 
     * @return toBePrinted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this TransactionSearchRowBasic.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getToBePrinted(int i) {
        return this.toBePrinted[i];
    }

    public void setToBePrinted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.toBePrinted[i] = _value;
    }


    /**
     * Gets the toSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @return toSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getToSubsidiary(int i) {
        return this.toSubsidiary[i];
    }

    public void setToSubsidiary(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.toSubsidiary[i] = _value;
    }


    /**
     * Gets the total value for this TransactionSearchRowBasic.
     * 
     * @return total
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTotal() {
        return total;
    }


    /**
     * Sets the total value for this TransactionSearchRowBasic.
     * 
     * @param total
     */
    public void setTotal(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] total) {
        this.total = total;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTotal(int i) {
        return this.total[i];
    }

    public void setTotal(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.total[i] = _value;
    }


    /**
     * Gets the totalCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @return totalCostEstimate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTotalCostEstimate(int i) {
        return this.totalCostEstimate[i];
    }

    public void setTotalCostEstimate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.totalCostEstimate[i] = _value;
    }


    /**
     * Gets the trackingNumbers value for this TransactionSearchRowBasic.
     * 
     * @return trackingNumbers
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this TransactionSearchRowBasic.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTrackingNumbers(int i) {
        return this.trackingNumbers[i];
    }

    public void setTrackingNumbers(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.trackingNumbers[i] = _value;
    }


    /**
     * Gets the tranDate value for this TransactionSearchRowBasic.
     * 
     * @return tranDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this TransactionSearchRowBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] tranDate) {
        this.tranDate = tranDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getTranDate(int i) {
        return this.tranDate[i];
    }

    public void setTranDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.tranDate[i] = _value;
    }


    /**
     * Gets the tranEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return tranEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTranEstGrossProfit(int i) {
        return this.tranEstGrossProfit[i];
    }

    public void setTranEstGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.tranEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTranFxEstGrossProfit(int i) {
        return this.tranFxEstGrossProfit[i];
    }

    public void setTranFxEstGrossProfit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.tranFxEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranId value for this TransactionSearchRowBasic.
     * 
     * @return tranId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TransactionSearchRowBasic.
     * 
     * @param tranId
     */
    public void setTranId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] tranId) {
        this.tranId = tranId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.tranId[i] = _value;
    }


    /**
     * Gets the tranIsVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @return tranIsVsoeBundle
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTranIsVsoeBundle(int i) {
        return this.tranIsVsoeBundle[i];
    }

    public void setTranIsVsoeBundle(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.tranIsVsoeBundle[i] = _value;
    }


    /**
     * Gets the transactionDiscount value for this TransactionSearchRowBasic.
     * 
     * @return transactionDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTransactionDiscount() {
        return transactionDiscount;
    }


    /**
     * Sets the transactionDiscount value for this TransactionSearchRowBasic.
     * 
     * @param transactionDiscount
     */
    public void setTransactionDiscount(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] transactionDiscount) {
        this.transactionDiscount = transactionDiscount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTransactionDiscount(int i) {
        return this.transactionDiscount[i];
    }

    public void setTransactionDiscount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.transactionDiscount[i] = _value;
    }


    /**
     * Gets the transactionLineType value for this TransactionSearchRowBasic.
     * 
     * @return transactionLineType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getTransactionLineType() {
        return transactionLineType;
    }


    /**
     * Sets the transactionLineType value for this TransactionSearchRowBasic.
     * 
     * @param transactionLineType
     */
    public void setTransactionLineType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] transactionLineType) {
        this.transactionLineType = transactionLineType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getTransactionLineType(int i) {
        return this.transactionLineType[i];
    }

    public void setTransactionLineType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.transactionLineType[i] = _value;
    }


    /**
     * Gets the transactionNumber value for this TransactionSearchRowBasic.
     * 
     * @return transactionNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this TransactionSearchRowBasic.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTransactionNumber(int i) {
        return this.transactionNumber[i];
    }

    public void setTransactionNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.transactionNumber[i] = _value;
    }


    /**
     * Gets the transferLocation value for this TransactionSearchRowBasic.
     * 
     * @return transferLocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTransferLocation() {
        return transferLocation;
    }


    /**
     * Sets the transferLocation value for this TransactionSearchRowBasic.
     * 
     * @param transferLocation
     */
    public void setTransferLocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] transferLocation) {
        this.transferLocation = transferLocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTransferLocation(int i) {
        return this.transferLocation[i];
    }

    public void setTransferLocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.transferLocation[i] = _value;
    }


    /**
     * Gets the transferOrderItemLine value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderItemLine
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTransferOrderItemLine() {
        return transferOrderItemLine;
    }


    /**
     * Sets the transferOrderItemLine value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderItemLine
     */
    public void setTransferOrderItemLine(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] transferOrderItemLine) {
        this.transferOrderItemLine = transferOrderItemLine;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTransferOrderItemLine(int i) {
        return this.transferOrderItemLine[i];
    }

    public void setTransferOrderItemLine(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.transferOrderItemLine[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityCommitted
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTransferOrderQuantityCommitted() {
        return transferOrderQuantityCommitted;
    }


    /**
     * Sets the transferOrderQuantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityCommitted
     */
    public void setTransferOrderQuantityCommitted(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityCommitted) {
        this.transferOrderQuantityCommitted = transferOrderQuantityCommitted;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTransferOrderQuantityCommitted(int i) {
        return this.transferOrderQuantityCommitted[i];
    }

    public void setTransferOrderQuantityCommitted(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.transferOrderQuantityCommitted[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityPacked value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityPacked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTransferOrderQuantityPacked() {
        return transferOrderQuantityPacked;
    }


    /**
     * Sets the transferOrderQuantityPacked value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityPacked
     */
    public void setTransferOrderQuantityPacked(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityPacked) {
        this.transferOrderQuantityPacked = transferOrderQuantityPacked;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTransferOrderQuantityPacked(int i) {
        return this.transferOrderQuantityPacked[i];
    }

    public void setTransferOrderQuantityPacked(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.transferOrderQuantityPacked[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityPicked value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityPicked
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTransferOrderQuantityPicked() {
        return transferOrderQuantityPicked;
    }


    /**
     * Sets the transferOrderQuantityPicked value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityPicked
     */
    public void setTransferOrderQuantityPicked(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityPicked) {
        this.transferOrderQuantityPicked = transferOrderQuantityPicked;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTransferOrderQuantityPicked(int i) {
        return this.transferOrderQuantityPicked[i];
    }

    public void setTransferOrderQuantityPicked(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.transferOrderQuantityPicked[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityReceived value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityReceived
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTransferOrderQuantityReceived() {
        return transferOrderQuantityReceived;
    }


    /**
     * Sets the transferOrderQuantityReceived value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityReceived
     */
    public void setTransferOrderQuantityReceived(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityReceived) {
        this.transferOrderQuantityReceived = transferOrderQuantityReceived;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTransferOrderQuantityReceived(int i) {
        return this.transferOrderQuantityReceived[i];
    }

    public void setTransferOrderQuantityReceived(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.transferOrderQuantityReceived[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityShipped value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityShipped
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getTransferOrderQuantityShipped() {
        return transferOrderQuantityShipped;
    }


    /**
     * Sets the transferOrderQuantityShipped value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityShipped
     */
    public void setTransferOrderQuantityShipped(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] transferOrderQuantityShipped) {
        this.transferOrderQuantityShipped = transferOrderQuantityShipped;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getTransferOrderQuantityShipped(int i) {
        return this.transferOrderQuantityShipped[i];
    }

    public void setTransferOrderQuantityShipped(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.transferOrderQuantityShipped[i] = _value;
    }


    /**
     * Gets the type value for this TransactionSearchRowBasic.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this TransactionSearchRowBasic.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the unit value for this TransactionSearchRowBasic.
     * 
     * @return unit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this TransactionSearchRowBasic.
     * 
     * @param unit
     */
    public void setUnit(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] unit) {
        this.unit = unit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUnit(int i) {
        return this.unit[i];
    }

    public void setUnit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.unit[i] = _value;
    }


    /**
     * Gets the unitCostOverride value for this TransactionSearchRowBasic.
     * 
     * @return unitCostOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnitCostOverride() {
        return unitCostOverride;
    }


    /**
     * Sets the unitCostOverride value for this TransactionSearchRowBasic.
     * 
     * @param unitCostOverride
     */
    public void setUnitCostOverride(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unitCostOverride) {
        this.unitCostOverride = unitCostOverride;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnitCostOverride(int i) {
        return this.unitCostOverride[i];
    }

    public void setUnitCostOverride(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unitCostOverride[i] = _value;
    }


    /**
     * Gets the vendType value for this TransactionSearchRowBasic.
     * 
     * @return vendType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getVendType() {
        return vendType;
    }


    /**
     * Sets the vendType value for this TransactionSearchRowBasic.
     * 
     * @param vendType
     */
    public void setVendType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] vendType) {
        this.vendType = vendType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getVendType(int i) {
        return this.vendType[i];
    }

    public void setVendType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.vendType[i] = _value;
    }


    /**
     * Gets the visibleToCustomer value for this TransactionSearchRowBasic.
     * 
     * @return visibleToCustomer
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getVisibleToCustomer() {
        return visibleToCustomer;
    }


    /**
     * Sets the visibleToCustomer value for this TransactionSearchRowBasic.
     * 
     * @param visibleToCustomer
     */
    public void setVisibleToCustomer(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getVisibleToCustomer(int i) {
        return this.visibleToCustomer[i];
    }

    public void setVisibleToCustomer(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.visibleToCustomer[i] = _value;
    }


    /**
     * Gets the vsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @return vsoeAllocation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVsoeAllocation(int i) {
        return this.vsoeAllocation[i];
    }

    public void setVsoeAllocation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vsoeAllocation[i] = _value;
    }


    /**
     * Gets the vsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @return vsoeAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVsoeAmount(int i) {
        return this.vsoeAmount[i];
    }

    public void setVsoeAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vsoeAmount[i] = _value;
    }


    /**
     * Gets the vsoeDeferral value for this TransactionSearchRowBasic.
     * 
     * @return vsoeDeferral
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this TransactionSearchRowBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getVsoeDeferral(int i) {
        return this.vsoeDeferral[i];
    }

    public void setVsoeDeferral(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.vsoeDeferral[i] = _value;
    }


    /**
     * Gets the vsoeDelivered value for this TransactionSearchRowBasic.
     * 
     * @return vsoeDelivered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this TransactionSearchRowBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getVsoeDelivered(int i) {
        return this.vsoeDelivered[i];
    }

    public void setVsoeDelivered(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.vsoeDelivered[i] = _value;
    }


    /**
     * Gets the vsoePermitDiscount value for this TransactionSearchRowBasic.
     * 
     * @return vsoePermitDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this TransactionSearchRowBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getVsoePermitDiscount(int i) {
        return this.vsoePermitDiscount[i];
    }

    public void setVsoePermitDiscount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.vsoePermitDiscount[i] = _value;
    }


    /**
     * Gets the vsoePrice value for this TransactionSearchRowBasic.
     * 
     * @return vsoePrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this TransactionSearchRowBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getVsoePrice(int i) {
        return this.vsoePrice[i];
    }

    public void setVsoePrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.vsoePrice[i] = _value;
    }


    /**
     * Gets the webSite value for this TransactionSearchRowBasic.
     * 
     * @return webSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this TransactionSearchRowBasic.
     * 
     * @param webSite
     */
    public void setWebSite(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] webSite) {
        this.webSite = webSite;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getWebSite(int i) {
        return this.webSite[i];
    }

    public void setWebSite(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.webSite[i] = _value;
    }


    /**
     * Gets the customFieldList value for this TransactionSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TransactionSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchRowBasic)) return false;
        TransactionSearchRowBasic other = (TransactionSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.abbrev==null && other.getAbbrev()==null) || 
             (this.abbrev!=null &&
              java.util.Arrays.equals(this.abbrev, other.getAbbrev()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              java.util.Arrays.equals(this.accountType, other.getAccountType()))) &&
            ((this.acctCorpCardExp==null && other.getAcctCorpCardExp()==null) || 
             (this.acctCorpCardExp!=null &&
              java.util.Arrays.equals(this.acctCorpCardExp, other.getAcctCorpCardExp()))) &&
            ((this.actualShipDate==null && other.getActualShipDate()==null) || 
             (this.actualShipDate!=null &&
              java.util.Arrays.equals(this.actualShipDate, other.getActualShipDate()))) &&
            ((this.altSalesAmount==null && other.getAltSalesAmount()==null) || 
             (this.altSalesAmount!=null &&
              java.util.Arrays.equals(this.altSalesAmount, other.getAltSalesAmount()))) &&
            ((this.altSalesNetAmount==null && other.getAltSalesNetAmount()==null) || 
             (this.altSalesNetAmount!=null &&
              java.util.Arrays.equals(this.altSalesNetAmount, other.getAltSalesNetAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              java.util.Arrays.equals(this.amountPaid, other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              java.util.Arrays.equals(this.amountRemaining, other.getAmountRemaining()))) &&
            ((this.amountUnbilled==null && other.getAmountUnbilled()==null) || 
             (this.amountUnbilled!=null &&
              java.util.Arrays.equals(this.amountUnbilled, other.getAmountUnbilled()))) &&
            ((this.appliedToForeignAmount==null && other.getAppliedToForeignAmount()==null) || 
             (this.appliedToForeignAmount!=null &&
              java.util.Arrays.equals(this.appliedToForeignAmount, other.getAppliedToForeignAmount()))) &&
            ((this.appliedToIsFxVariance==null && other.getAppliedToIsFxVariance()==null) || 
             (this.appliedToIsFxVariance!=null &&
              java.util.Arrays.equals(this.appliedToIsFxVariance, other.getAppliedToIsFxVariance()))) &&
            ((this.appliedToLinkAmount==null && other.getAppliedToLinkAmount()==null) || 
             (this.appliedToLinkAmount!=null &&
              java.util.Arrays.equals(this.appliedToLinkAmount, other.getAppliedToLinkAmount()))) &&
            ((this.appliedToLinkType==null && other.getAppliedToLinkType()==null) || 
             (this.appliedToLinkType!=null &&
              java.util.Arrays.equals(this.appliedToLinkType, other.getAppliedToLinkType()))) &&
            ((this.appliedToTransaction==null && other.getAppliedToTransaction()==null) || 
             (this.appliedToTransaction!=null &&
              java.util.Arrays.equals(this.appliedToTransaction, other.getAppliedToTransaction()))) &&
            ((this.applyingForeignAmount==null && other.getApplyingForeignAmount()==null) || 
             (this.applyingForeignAmount!=null &&
              java.util.Arrays.equals(this.applyingForeignAmount, other.getApplyingForeignAmount()))) &&
            ((this.applyingIsFxVariance==null && other.getApplyingIsFxVariance()==null) || 
             (this.applyingIsFxVariance!=null &&
              java.util.Arrays.equals(this.applyingIsFxVariance, other.getApplyingIsFxVariance()))) &&
            ((this.applyingLinkAmount==null && other.getApplyingLinkAmount()==null) || 
             (this.applyingLinkAmount!=null &&
              java.util.Arrays.equals(this.applyingLinkAmount, other.getApplyingLinkAmount()))) &&
            ((this.applyingLinkType==null && other.getApplyingLinkType()==null) || 
             (this.applyingLinkType!=null &&
              java.util.Arrays.equals(this.applyingLinkType, other.getApplyingLinkType()))) &&
            ((this.applyingTransaction==null && other.getApplyingTransaction()==null) || 
             (this.applyingTransaction!=null &&
              java.util.Arrays.equals(this.applyingTransaction, other.getApplyingTransaction()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              java.util.Arrays.equals(this.approvalStatus, other.getApprovalStatus()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              java.util.Arrays.equals(this.authCode, other.getAuthCode()))) &&
            ((this.autoCalculateLag==null && other.getAutoCalculateLag()==null) || 
             (this.autoCalculateLag!=null &&
              java.util.Arrays.equals(this.autoCalculateLag, other.getAutoCalculateLag()))) &&
            ((this.avsStreetMatch==null && other.getAvsStreetMatch()==null) || 
             (this.avsStreetMatch!=null &&
              java.util.Arrays.equals(this.avsStreetMatch, other.getAvsStreetMatch()))) &&
            ((this.avsZipMatch==null && other.getAvsZipMatch()==null) || 
             (this.avsZipMatch!=null &&
              java.util.Arrays.equals(this.avsZipMatch, other.getAvsZipMatch()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              java.util.Arrays.equals(this.billable, other.getBillable()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              java.util.Arrays.equals(this.billAddress, other.getBillAddress()))) &&
            ((this.billAddress1==null && other.getBillAddress1()==null) || 
             (this.billAddress1!=null &&
              java.util.Arrays.equals(this.billAddress1, other.getBillAddress1()))) &&
            ((this.billAddress2==null && other.getBillAddress2()==null) || 
             (this.billAddress2!=null &&
              java.util.Arrays.equals(this.billAddress2, other.getBillAddress2()))) &&
            ((this.billAddress3==null && other.getBillAddress3()==null) || 
             (this.billAddress3!=null &&
              java.util.Arrays.equals(this.billAddress3, other.getBillAddress3()))) &&
            ((this.billAddressee==null && other.getBillAddressee()==null) || 
             (this.billAddressee!=null &&
              java.util.Arrays.equals(this.billAddressee, other.getBillAddressee()))) &&
            ((this.billAttention==null && other.getBillAttention()==null) || 
             (this.billAttention!=null &&
              java.util.Arrays.equals(this.billAttention, other.getBillAttention()))) &&
            ((this.billCity==null && other.getBillCity()==null) || 
             (this.billCity!=null &&
              java.util.Arrays.equals(this.billCity, other.getBillCity()))) &&
            ((this.billCountry==null && other.getBillCountry()==null) || 
             (this.billCountry!=null &&
              java.util.Arrays.equals(this.billCountry, other.getBillCountry()))) &&
            ((this.billCountryCode==null && other.getBillCountryCode()==null) || 
             (this.billCountryCode!=null &&
              java.util.Arrays.equals(this.billCountryCode, other.getBillCountryCode()))) &&
            ((this.billedDate==null && other.getBilledDate()==null) || 
             (this.billedDate!=null &&
              java.util.Arrays.equals(this.billedDate, other.getBilledDate()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              java.util.Arrays.equals(this.billingAccount, other.getBillingAccount()))) &&
            ((this.billingAmount==null && other.getBillingAmount()==null) || 
             (this.billingAmount!=null &&
              java.util.Arrays.equals(this.billingAmount, other.getBillingAmount()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              java.util.Arrays.equals(this.billingSchedule, other.getBillingSchedule()))) &&
            ((this.billingTransaction==null && other.getBillingTransaction()==null) || 
             (this.billingTransaction!=null &&
              java.util.Arrays.equals(this.billingTransaction, other.getBillingTransaction()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              java.util.Arrays.equals(this.billPhone, other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              java.util.Arrays.equals(this.billState, other.getBillState()))) &&
            ((this.billVarianceStatus==null && other.getBillVarianceStatus()==null) || 
             (this.billVarianceStatus!=null &&
              java.util.Arrays.equals(this.billVarianceStatus, other.getBillVarianceStatus()))) &&
            ((this.billZip==null && other.getBillZip()==null) || 
             (this.billZip!=null &&
              java.util.Arrays.equals(this.billZip, other.getBillZip()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.binNumberQuantity==null && other.getBinNumberQuantity()==null) || 
             (this.binNumberQuantity!=null &&
              java.util.Arrays.equals(this.binNumberQuantity, other.getBinNumberQuantity()))) &&
            ((this.bomQuantity==null && other.getBomQuantity()==null) || 
             (this.bomQuantity!=null &&
              java.util.Arrays.equals(this.bomQuantity, other.getBomQuantity()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              java.util.Arrays.equals(this.buildEntireAssembly, other.getBuildEntireAssembly()))) &&
            ((this.buildVariance==null && other.getBuildVariance()==null) || 
             (this.buildVariance!=null &&
              java.util.Arrays.equals(this.buildVariance, other.getBuildVariance()))) &&
            ((this.built==null && other.getBuilt()==null) || 
             (this.built!=null &&
              java.util.Arrays.equals(this.built, other.getBuilt()))) &&
            ((this.canHaveStackablePromotions==null && other.getCanHaveStackablePromotions()==null) || 
             (this.canHaveStackablePromotions!=null &&
              java.util.Arrays.equals(this.canHaveStackablePromotions, other.getCanHaveStackablePromotions()))) &&
            ((this.catchUpPeriod==null && other.getCatchUpPeriod()==null) || 
             (this.catchUpPeriod!=null &&
              java.util.Arrays.equals(this.catchUpPeriod, other.getCatchUpPeriod()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              java.util.Arrays.equals(this.ccCustomerCode, other.getCcCustomerCode()))) &&
            ((this.ccExpDate==null && other.getCcExpDate()==null) || 
             (this.ccExpDate!=null &&
              java.util.Arrays.equals(this.ccExpDate, other.getCcExpDate()))) &&
            ((this.ccHolderName==null && other.getCcHolderName()==null) || 
             (this.ccHolderName!=null &&
              java.util.Arrays.equals(this.ccHolderName, other.getCcHolderName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              java.util.Arrays.equals(this.ccNumber, other.getCcNumber()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              java.util.Arrays.equals(this.ccStreet, other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              java.util.Arrays.equals(this.ccZipCode, other.getCcZipCode()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.cleared==null && other.getCleared()==null) || 
             (this.cleared!=null &&
              java.util.Arrays.equals(this.cleared, other.getCleared()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              java.util.Arrays.equals(this.closed, other.getClosed()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              java.util.Arrays.equals(this.closeDate, other.getCloseDate()))) &&
            ((this.cogsAmount==null && other.getCogsAmount()==null) || 
             (this.cogsAmount!=null &&
              java.util.Arrays.equals(this.cogsAmount, other.getCogsAmount()))) &&
            ((this.commissionEffectiveDate==null && other.getCommissionEffectiveDate()==null) || 
             (this.commissionEffectiveDate!=null &&
              java.util.Arrays.equals(this.commissionEffectiveDate, other.getCommissionEffectiveDate()))) &&
            ((this.commit==null && other.getCommit()==null) || 
             (this.commit!=null &&
              java.util.Arrays.equals(this.commit, other.getCommit()))) &&
            ((this.componentYield==null && other.getComponentYield()==null) || 
             (this.componentYield!=null &&
              java.util.Arrays.equals(this.componentYield, other.getComponentYield()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              java.util.Arrays.equals(this.confirmationNumber, other.getConfirmationNumber()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              java.util.Arrays.equals(this.contribution, other.getContribution()))) &&
            ((this.contributionPrimary==null && other.getContributionPrimary()==null) || 
             (this.contributionPrimary!=null &&
              java.util.Arrays.equals(this.contributionPrimary, other.getContributionPrimary()))) &&
            ((this.costComponentAmount==null && other.getCostComponentAmount()==null) || 
             (this.costComponentAmount!=null &&
              java.util.Arrays.equals(this.costComponentAmount, other.getCostComponentAmount()))) &&
            ((this.costComponentCategory==null && other.getCostComponentCategory()==null) || 
             (this.costComponentCategory!=null &&
              java.util.Arrays.equals(this.costComponentCategory, other.getCostComponentCategory()))) &&
            ((this.costComponentItem==null && other.getCostComponentItem()==null) || 
             (this.costComponentItem!=null &&
              java.util.Arrays.equals(this.costComponentItem, other.getCostComponentItem()))) &&
            ((this.costComponentQuantity==null && other.getCostComponentQuantity()==null) || 
             (this.costComponentQuantity!=null &&
              java.util.Arrays.equals(this.costComponentQuantity, other.getCostComponentQuantity()))) &&
            ((this.costComponentStandardCost==null && other.getCostComponentStandardCost()==null) || 
             (this.costComponentStandardCost!=null &&
              java.util.Arrays.equals(this.costComponentStandardCost, other.getCostComponentStandardCost()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              java.util.Arrays.equals(this.costEstimate, other.getCostEstimate()))) &&
            ((this.costEstimateRate==null && other.getCostEstimateRate()==null) || 
             (this.costEstimateRate!=null &&
              java.util.Arrays.equals(this.costEstimateRate, other.getCostEstimateRate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              java.util.Arrays.equals(this.costEstimateType, other.getCostEstimateType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              java.util.Arrays.equals(this.createdBy, other.getCreatedBy()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              java.util.Arrays.equals(this.createdFrom, other.getCreatedFrom()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              java.util.Arrays.equals(this.creditAmount, other.getCreditAmount()))) &&
            ((this.cscMatch==null && other.getCscMatch()==null) || 
             (this.cscMatch!=null &&
              java.util.Arrays.equals(this.cscMatch, other.getCscMatch()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              java.util.Arrays.equals(this.customForm, other.getCustomForm()))) &&
            ((this.customGL==null && other.getCustomGL()==null) || 
             (this.customGL!=null &&
              java.util.Arrays.equals(this.customGL, other.getCustomGL()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              java.util.Arrays.equals(this.custType, other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              java.util.Arrays.equals(this.daysOpen, other.getDaysOpen()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              java.util.Arrays.equals(this.daysOverdue, other.getDaysOverdue()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              java.util.Arrays.equals(this.debitAmount, other.getDebitAmount()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              java.util.Arrays.equals(this.deferredRevenue, other.getDeferredRevenue()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              java.util.Arrays.equals(this.deferRevRec, other.getDeferRevRec()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.depositDate==null && other.getDepositDate()==null) || 
             (this.depositDate!=null &&
              java.util.Arrays.equals(this.depositDate, other.getDepositDate()))) &&
            ((this.depositTransaction==null && other.getDepositTransaction()==null) || 
             (this.depositTransaction!=null &&
              java.util.Arrays.equals(this.depositTransaction, other.getDepositTransaction()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              java.util.Arrays.equals(this.discountAmount, other.getDiscountAmount()))) &&
            ((this.docUnit==null && other.getDocUnit()==null) || 
             (this.docUnit!=null &&
              java.util.Arrays.equals(this.docUnit, other.getDocUnit()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              java.util.Arrays.equals(this.drAccount, other.getDrAccount()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              java.util.Arrays.equals(this.dueDate, other.getDueDate()))) &&
            ((this.effectiveRate==null && other.getEffectiveRate()==null) || 
             (this.effectiveRate!=null &&
              java.util.Arrays.equals(this.effectiveRate, other.getEffectiveRate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              java.util.Arrays.equals(this.estGrossProfit, other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPct==null && other.getEstGrossProfitPct()==null) || 
             (this.estGrossProfitPct!=null &&
              java.util.Arrays.equals(this.estGrossProfitPct, other.getEstGrossProfitPct()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              java.util.Arrays.equals(this.estGrossProfitPercent, other.getEstGrossProfitPercent()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              java.util.Arrays.equals(this.exchangeRate, other.getExchangeRate()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              java.util.Arrays.equals(this.excludeCommission, other.getExcludeCommission()))) &&
            ((this.excludeFromRateRequest==null && other.getExcludeFromRateRequest()==null) || 
             (this.excludeFromRateRequest!=null &&
              java.util.Arrays.equals(this.excludeFromRateRequest, other.getExcludeFromRateRequest()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              java.util.Arrays.equals(this.expectedCloseDate, other.getExpectedCloseDate()))) &&
            ((this.expectedReceiptDate==null && other.getExpectedReceiptDate()==null) || 
             (this.expectedReceiptDate!=null &&
              java.util.Arrays.equals(this.expectedReceiptDate, other.getExpectedReceiptDate()))) &&
            ((this.expenseCategory==null && other.getExpenseCategory()==null) || 
             (this.expenseCategory!=null &&
              java.util.Arrays.equals(this.expenseCategory, other.getExpenseCategory()))) &&
            ((this.expenseDate==null && other.getExpenseDate()==null) || 
             (this.expenseDate!=null &&
              java.util.Arrays.equals(this.expenseDate, other.getExpenseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.firmed==null && other.getFirmed()==null) || 
             (this.firmed!=null &&
              java.util.Arrays.equals(this.firmed, other.getFirmed()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              java.util.Arrays.equals(this.forecastType, other.getForecastType()))) &&
            ((this.fulfillingTransaction==null && other.getFulfillingTransaction()==null) || 
             (this.fulfillingTransaction!=null &&
              java.util.Arrays.equals(this.fulfillingTransaction, other.getFulfillingTransaction()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              java.util.Arrays.equals(this.fxAccount, other.getFxAccount()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              java.util.Arrays.equals(this.fxAmount, other.getFxAmount()))) &&
            ((this.fxCostEstimate==null && other.getFxCostEstimate()==null) || 
             (this.fxCostEstimate!=null &&
              java.util.Arrays.equals(this.fxCostEstimate, other.getFxCostEstimate()))) &&
            ((this.fxCostEstimateRate==null && other.getFxCostEstimateRate()==null) || 
             (this.fxCostEstimateRate!=null &&
              java.util.Arrays.equals(this.fxCostEstimateRate, other.getFxCostEstimateRate()))) &&
            ((this.fxEstGrossProfit==null && other.getFxEstGrossProfit()==null) || 
             (this.fxEstGrossProfit!=null &&
              java.util.Arrays.equals(this.fxEstGrossProfit, other.getFxEstGrossProfit()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              java.util.Arrays.equals(this.fxTranCostEstimate, other.getFxTranCostEstimate()))) &&
            ((this.fxVsoeAllocation==null && other.getFxVsoeAllocation()==null) || 
             (this.fxVsoeAllocation!=null &&
              java.util.Arrays.equals(this.fxVsoeAllocation, other.getFxVsoeAllocation()))) &&
            ((this.fxVsoeAmount==null && other.getFxVsoeAmount()==null) || 
             (this.fxVsoeAmount!=null &&
              java.util.Arrays.equals(this.fxVsoeAmount, other.getFxVsoeAmount()))) &&
            ((this.fxVsoePrice==null && other.getFxVsoePrice()==null) || 
             (this.fxVsoePrice!=null &&
              java.util.Arrays.equals(this.fxVsoePrice, other.getFxVsoePrice()))) &&
            ((this.gcoAvailabelToCharge==null && other.getGcoAvailabelToCharge()==null) || 
             (this.gcoAvailabelToCharge!=null &&
              java.util.Arrays.equals(this.gcoAvailabelToCharge, other.getGcoAvailabelToCharge()))) &&
            ((this.gcoAvailableToRefund==null && other.getGcoAvailableToRefund()==null) || 
             (this.gcoAvailableToRefund!=null &&
              java.util.Arrays.equals(this.gcoAvailableToRefund, other.getGcoAvailableToRefund()))) &&
            ((this.gcoAvsStreetMatch==null && other.getGcoAvsStreetMatch()==null) || 
             (this.gcoAvsStreetMatch!=null &&
              java.util.Arrays.equals(this.gcoAvsStreetMatch, other.getGcoAvsStreetMatch()))) &&
            ((this.gcoAvsZipMatch==null && other.getGcoAvsZipMatch()==null) || 
             (this.gcoAvsZipMatch!=null &&
              java.util.Arrays.equals(this.gcoAvsZipMatch, other.getGcoAvsZipMatch()))) &&
            ((this.gcoBuyerAccountAge==null && other.getGcoBuyerAccountAge()==null) || 
             (this.gcoBuyerAccountAge!=null &&
              java.util.Arrays.equals(this.gcoBuyerAccountAge, other.getGcoBuyerAccountAge()))) &&
            ((this.gcoBuyerIp==null && other.getGcoBuyerIp()==null) || 
             (this.gcoBuyerIp!=null &&
              java.util.Arrays.equals(this.gcoBuyerIp, other.getGcoBuyerIp()))) &&
            ((this.gcoChargeAmount==null && other.getGcoChargeAmount()==null) || 
             (this.gcoChargeAmount!=null &&
              java.util.Arrays.equals(this.gcoChargeAmount, other.getGcoChargeAmount()))) &&
            ((this.gcoChargebackAmount==null && other.getGcoChargebackAmount()==null) || 
             (this.gcoChargebackAmount!=null &&
              java.util.Arrays.equals(this.gcoChargebackAmount, other.getGcoChargebackAmount()))) &&
            ((this.gcoConfirmedChargedTotal==null && other.getGcoConfirmedChargedTotal()==null) || 
             (this.gcoConfirmedChargedTotal!=null &&
              java.util.Arrays.equals(this.gcoConfirmedChargedTotal, other.getGcoConfirmedChargedTotal()))) &&
            ((this.gcoConfirmedRefundedTotal==null && other.getGcoConfirmedRefundedTotal()==null) || 
             (this.gcoConfirmedRefundedTotal!=null &&
              java.util.Arrays.equals(this.gcoConfirmedRefundedTotal, other.getGcoConfirmedRefundedTotal()))) &&
            ((this.gcoCreditcardNumber==null && other.getGcoCreditcardNumber()==null) || 
             (this.gcoCreditcardNumber!=null &&
              java.util.Arrays.equals(this.gcoCreditcardNumber, other.getGcoCreditcardNumber()))) &&
            ((this.gcoCscMatch==null && other.getGcoCscMatch()==null) || 
             (this.gcoCscMatch!=null &&
              java.util.Arrays.equals(this.gcoCscMatch, other.getGcoCscMatch()))) &&
            ((this.gcoFinancialState==null && other.getGcoFinancialState()==null) || 
             (this.gcoFinancialState!=null &&
              java.util.Arrays.equals(this.gcoFinancialState, other.getGcoFinancialState()))) &&
            ((this.gcoFulfillmentState==null && other.getGcoFulfillmentState()==null) || 
             (this.gcoFulfillmentState!=null &&
              java.util.Arrays.equals(this.gcoFulfillmentState, other.getGcoFulfillmentState()))) &&
            ((this.gcoOrderId==null && other.getGcoOrderId()==null) || 
             (this.gcoOrderId!=null &&
              java.util.Arrays.equals(this.gcoOrderId, other.getGcoOrderId()))) &&
            ((this.gcoOrderTotal==null && other.getGcoOrderTotal()==null) || 
             (this.gcoOrderTotal!=null &&
              java.util.Arrays.equals(this.gcoOrderTotal, other.getGcoOrderTotal()))) &&
            ((this.gcoPromotionAmount==null && other.getGcoPromotionAmount()==null) || 
             (this.gcoPromotionAmount!=null &&
              java.util.Arrays.equals(this.gcoPromotionAmount, other.getGcoPromotionAmount()))) &&
            ((this.gcoPromotionName==null && other.getGcoPromotionName()==null) || 
             (this.gcoPromotionName!=null &&
              java.util.Arrays.equals(this.gcoPromotionName, other.getGcoPromotionName()))) &&
            ((this.gcoRefundAmount==null && other.getGcoRefundAmount()==null) || 
             (this.gcoRefundAmount!=null &&
              java.util.Arrays.equals(this.gcoRefundAmount, other.getGcoRefundAmount()))) &&
            ((this.gcoShippingTotal==null && other.getGcoShippingTotal()==null) || 
             (this.gcoShippingTotal!=null &&
              java.util.Arrays.equals(this.gcoShippingTotal, other.getGcoShippingTotal()))) &&
            ((this.gcoStateChangedDetail==null && other.getGcoStateChangedDetail()==null) || 
             (this.gcoStateChangedDetail!=null &&
              java.util.Arrays.equals(this.gcoStateChangedDetail, other.getGcoStateChangedDetail()))) &&
            ((this.giftCert==null && other.getGiftCert()==null) || 
             (this.giftCert!=null &&
              java.util.Arrays.equals(this.giftCert, other.getGiftCert()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              java.util.Arrays.equals(this.grossAmount, other.getGrossAmount()))) &&
            ((this.includeInForecast==null && other.getIncludeInForecast()==null) || 
             (this.includeInForecast!=null &&
              java.util.Arrays.equals(this.includeInForecast, other.getIncludeInForecast()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              java.util.Arrays.equals(this.incoterm, other.getIncoterm()))) &&
            ((this.intercoStatus==null && other.getIntercoStatus()==null) || 
             (this.intercoStatus!=null &&
              java.util.Arrays.equals(this.intercoStatus, other.getIntercoStatus()))) &&
            ((this.intercoTransaction==null && other.getIntercoTransaction()==null) || 
             (this.intercoTransaction!=null &&
              java.util.Arrays.equals(this.intercoTransaction, other.getIntercoTransaction()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              java.util.Arrays.equals(this.inventoryLocation, other.getInventoryLocation()))) &&
            ((this.inventorySubsidiary==null && other.getInventorySubsidiary()==null) || 
             (this.inventorySubsidiary!=null &&
              java.util.Arrays.equals(this.inventorySubsidiary, other.getInventorySubsidiary()))) &&
            ((this.inVsoeBundle==null && other.getInVsoeBundle()==null) || 
             (this.inVsoeBundle!=null &&
              java.util.Arrays.equals(this.inVsoeBundle, other.getInVsoeBundle()))) &&
            ((this.isAllocation==null && other.getIsAllocation()==null) || 
             (this.isAllocation!=null &&
              java.util.Arrays.equals(this.isAllocation, other.getIsAllocation()))) &&
            ((this.isBackflush==null && other.getIsBackflush()==null) || 
             (this.isBackflush!=null &&
              java.util.Arrays.equals(this.isBackflush, other.getIsBackflush()))) &&
            ((this.isGcoChargeback==null && other.getIsGcoChargeback()==null) || 
             (this.isGcoChargeback!=null &&
              java.util.Arrays.equals(this.isGcoChargeback, other.getIsGcoChargeback()))) &&
            ((this.isGcoChargeConfirmed==null && other.getIsGcoChargeConfirmed()==null) || 
             (this.isGcoChargeConfirmed!=null &&
              java.util.Arrays.equals(this.isGcoChargeConfirmed, other.getIsGcoChargeConfirmed()))) &&
            ((this.isGcoPaymentGuaranteed==null && other.getIsGcoPaymentGuaranteed()==null) || 
             (this.isGcoPaymentGuaranteed!=null &&
              java.util.Arrays.equals(this.isGcoPaymentGuaranteed, other.getIsGcoPaymentGuaranteed()))) &&
            ((this.isGcoRefundConfirmed==null && other.getIsGcoRefundConfirmed()==null) || 
             (this.isGcoRefundConfirmed!=null &&
              java.util.Arrays.equals(this.isGcoRefundConfirmed, other.getIsGcoRefundConfirmed()))) &&
            ((this.isInsideDelivery==null && other.getIsInsideDelivery()==null) || 
             (this.isInsideDelivery!=null &&
              java.util.Arrays.equals(this.isInsideDelivery, other.getIsInsideDelivery()))) &&
            ((this.isInsidePickup==null && other.getIsInsidePickup()==null) || 
             (this.isInsidePickup!=null &&
              java.util.Arrays.equals(this.isInsidePickup, other.getIsInsidePickup()))) &&
            ((this.isIntercompanyAdjustment==null && other.getIsIntercompanyAdjustment()==null) || 
             (this.isIntercompanyAdjustment!=null &&
              java.util.Arrays.equals(this.isIntercompanyAdjustment, other.getIsIntercompanyAdjustment()))) &&
            ((this.isInTransitPayment==null && other.getIsInTransitPayment()==null) || 
             (this.isInTransitPayment!=null &&
              java.util.Arrays.equals(this.isInTransitPayment, other.getIsInTransitPayment()))) &&
            ((this.isMultiShipTo==null && other.getIsMultiShipTo()==null) || 
             (this.isMultiShipTo!=null &&
              java.util.Arrays.equals(this.isMultiShipTo, other.getIsMultiShipTo()))) &&
            ((this.isReversal==null && other.getIsReversal()==null) || 
             (this.isReversal!=null &&
              java.util.Arrays.equals(this.isReversal, other.getIsReversal()))) &&
            ((this.isRevRecTransaction==null && other.getIsRevRecTransaction()==null) || 
             (this.isRevRecTransaction!=null &&
              java.util.Arrays.equals(this.isRevRecTransaction, other.getIsRevRecTransaction()))) &&
            ((this.isScrap==null && other.getIsScrap()==null) || 
             (this.isScrap!=null &&
              java.util.Arrays.equals(this.isScrap, other.getIsScrap()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              java.util.Arrays.equals(this.isShipAddress, other.getIsShipAddress()))) &&
            ((this.isTransferPriceCosting==null && other.getIsTransferPriceCosting()==null) || 
             (this.isTransferPriceCosting!=null &&
              java.util.Arrays.equals(this.isTransferPriceCosting, other.getIsTransferPriceCosting()))) &&
            ((this.isWip==null && other.getIsWip()==null) || 
             (this.isWip!=null &&
              java.util.Arrays.equals(this.isWip, other.getIsWip()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.itemFulfillmentChoice==null && other.getItemFulfillmentChoice()==null) || 
             (this.itemFulfillmentChoice!=null &&
              java.util.Arrays.equals(this.itemFulfillmentChoice, other.getItemFulfillmentChoice()))) &&
            ((this.itemRevision==null && other.getItemRevision()==null) || 
             (this.itemRevision!=null &&
              java.util.Arrays.equals(this.itemRevision, other.getItemRevision()))) &&
            ((this.landedCostPerLine==null && other.getLandedCostPerLine()==null) || 
             (this.landedCostPerLine!=null &&
              java.util.Arrays.equals(this.landedCostPerLine, other.getLandedCostPerLine()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              java.util.Arrays.equals(this.leadSource, other.getLeadSource()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              java.util.Arrays.equals(this.line, other.getLine()))) &&
            ((this.lineSequenceNumber==null && other.getLineSequenceNumber()==null) || 
             (this.lineSequenceNumber!=null &&
              java.util.Arrays.equals(this.lineSequenceNumber, other.getLineSequenceNumber()))) &&
            ((this.lineUniqueKey==null && other.getLineUniqueKey()==null) || 
             (this.lineUniqueKey!=null &&
              java.util.Arrays.equals(this.lineUniqueKey, other.getLineUniqueKey()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.locationAutoAssigned==null && other.getLocationAutoAssigned()==null) || 
             (this.locationAutoAssigned!=null &&
              java.util.Arrays.equals(this.locationAutoAssigned, other.getLocationAutoAssigned()))) &&
            ((this.mainLine==null && other.getMainLine()==null) || 
             (this.mainLine!=null &&
              java.util.Arrays.equals(this.mainLine, other.getMainLine()))) &&
            ((this.mainName==null && other.getMainName()==null) || 
             (this.mainName!=null &&
              java.util.Arrays.equals(this.mainName, other.getMainName()))) &&
            ((this.manufacturingRouting==null && other.getManufacturingRouting()==null) || 
             (this.manufacturingRouting!=null &&
              java.util.Arrays.equals(this.manufacturingRouting, other.getManufacturingRouting()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              java.util.Arrays.equals(this.matchBillToReceipt, other.getMatchBillToReceipt()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.memoMain==null && other.getMemoMain()==null) || 
             (this.memoMain!=null &&
              java.util.Arrays.equals(this.memoMain, other.getMemoMain()))) &&
            ((this.memorized==null && other.getMemorized()==null) || 
             (this.memorized!=null &&
              java.util.Arrays.equals(this.memorized, other.getMemorized()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              java.util.Arrays.equals(this.merchantAccount, other.getMerchantAccount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.multiSubsidiary==null && other.getMultiSubsidiary()==null) || 
             (this.multiSubsidiary!=null &&
              java.util.Arrays.equals(this.multiSubsidiary, other.getMultiSubsidiary()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              java.util.Arrays.equals(this.netAmount, other.getNetAmount()))) &&
            ((this.netAmountNoTax==null && other.getNetAmountNoTax()==null) || 
             (this.netAmountNoTax!=null &&
              java.util.Arrays.equals(this.netAmountNoTax, other.getNetAmountNoTax()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              java.util.Arrays.equals(this.nextApprover, other.getNextApprover()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              java.util.Arrays.equals(this.nextBillDate, other.getNextBillDate()))) &&
            ((this.noAutoAssignLocation==null && other.getNoAutoAssignLocation()==null) || 
             (this.noAutoAssignLocation!=null &&
              java.util.Arrays.equals(this.noAutoAssignLocation, other.getNoAutoAssignLocation()))) &&
            ((this.nonReimbursable==null && other.getNonReimbursable()==null) || 
             (this.nonReimbursable!=null &&
              java.util.Arrays.equals(this.nonReimbursable, other.getNonReimbursable()))) &&
            ((this.oneTimeTotal==null && other.getOneTimeTotal()==null) || 
             (this.oneTimeTotal!=null &&
              java.util.Arrays.equals(this.oneTimeTotal, other.getOneTimeTotal()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              java.util.Arrays.equals(this.opportunity, other.getOpportunity()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.orderPriority==null && other.getOrderPriority()==null) || 
             (this.orderPriority!=null &&
              java.util.Arrays.equals(this.orderPriority, other.getOrderPriority()))) &&
            ((this.originator==null && other.getOriginator()==null) || 
             (this.originator!=null &&
              java.util.Arrays.equals(this.originator, other.getOriginator()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              java.util.Arrays.equals(this.otherRefNum, other.getOtherRefNum()))) &&
            ((this.overheadParentItem==null && other.getOverheadParentItem()==null) || 
             (this.overheadParentItem!=null &&
              java.util.Arrays.equals(this.overheadParentItem, other.getOverheadParentItem()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              java.util.Arrays.equals(this.packageCount, other.getPackageCount()))) &&
            ((this.paidAmount==null && other.getPaidAmount()==null) || 
             (this.paidAmount!=null &&
              java.util.Arrays.equals(this.paidAmount, other.getPaidAmount()))) &&
            ((this.paidTransaction==null && other.getPaidTransaction()==null) || 
             (this.paidTransaction!=null &&
              java.util.Arrays.equals(this.paidTransaction, other.getPaidTransaction()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              java.util.Arrays.equals(this.partner, other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              java.util.Arrays.equals(this.partnerContribution, other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              java.util.Arrays.equals(this.partnerRole, other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              java.util.Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember()))) &&
            ((this.payingAmount==null && other.getPayingAmount()==null) || 
             (this.payingAmount!=null &&
              java.util.Arrays.equals(this.payingAmount, other.getPayingAmount()))) &&
            ((this.payingTransaction==null && other.getPayingTransaction()==null) || 
             (this.payingTransaction!=null &&
              java.util.Arrays.equals(this.payingTransaction, other.getPayingTransaction()))) &&
            ((this.paymentApproved==null && other.getPaymentApproved()==null) || 
             (this.paymentApproved!=null &&
              java.util.Arrays.equals(this.paymentApproved, other.getPaymentApproved()))) &&
            ((this.paymentEventDate==null && other.getPaymentEventDate()==null) || 
             (this.paymentEventDate!=null &&
              java.util.Arrays.equals(this.paymentEventDate, other.getPaymentEventDate()))) &&
            ((this.paymentEventHoldReason==null && other.getPaymentEventHoldReason()==null) || 
             (this.paymentEventHoldReason!=null &&
              java.util.Arrays.equals(this.paymentEventHoldReason, other.getPaymentEventHoldReason()))) &&
            ((this.paymentEventPurchaseCardUsed==null && other.getPaymentEventPurchaseCardUsed()==null) || 
             (this.paymentEventPurchaseCardUsed!=null &&
              java.util.Arrays.equals(this.paymentEventPurchaseCardUsed, other.getPaymentEventPurchaseCardUsed()))) &&
            ((this.paymentEventPurchaseDataSent==null && other.getPaymentEventPurchaseDataSent()==null) || 
             (this.paymentEventPurchaseDataSent!=null &&
              java.util.Arrays.equals(this.paymentEventPurchaseDataSent, other.getPaymentEventPurchaseDataSent()))) &&
            ((this.paymentEventResult==null && other.getPaymentEventResult()==null) || 
             (this.paymentEventResult!=null &&
              java.util.Arrays.equals(this.paymentEventResult, other.getPaymentEventResult()))) &&
            ((this.paymentEventType==null && other.getPaymentEventType()==null) || 
             (this.paymentEventType!=null &&
              java.util.Arrays.equals(this.paymentEventType, other.getPaymentEventType()))) &&
            ((this.paymentHold==null && other.getPaymentHold()==null) || 
             (this.paymentHold!=null &&
              java.util.Arrays.equals(this.paymentHold, other.getPaymentHold()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              java.util.Arrays.equals(this.paymentMethod, other.getPaymentMethod()))) &&
            ((this.paymentOption==null && other.getPaymentOption()==null) || 
             (this.paymentOption!=null &&
              java.util.Arrays.equals(this.paymentOption, other.getPaymentOption()))) &&
            ((this.payPalPending==null && other.getPayPalPending()==null) || 
             (this.payPalPending!=null &&
              java.util.Arrays.equals(this.payPalPending, other.getPayPalPending()))) &&
            ((this.payPalStatus==null && other.getPayPalStatus()==null) || 
             (this.payPalStatus!=null &&
              java.util.Arrays.equals(this.payPalStatus, other.getPayPalStatus()))) &&
            ((this.payPalTranId==null && other.getPayPalTranId()==null) || 
             (this.payPalTranId!=null &&
              java.util.Arrays.equals(this.payPalTranId, other.getPayPalTranId()))) &&
            ((this.payrollBatch==null && other.getPayrollBatch()==null) || 
             (this.payrollBatch!=null &&
              java.util.Arrays.equals(this.payrollBatch, other.getPayrollBatch()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              java.util.Arrays.equals(this.pnRefNum, other.getPnRefNum()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              java.util.Arrays.equals(this.poRate, other.getPoRate()))) &&
            ((this.posting==null && other.getPosting()==null) || 
             (this.posting!=null &&
              java.util.Arrays.equals(this.posting, other.getPosting()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              java.util.Arrays.equals(this.postingPeriod, other.getPostingPeriod()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              java.util.Arrays.equals(this.priceLevel, other.getPriceLevel()))) &&
            ((this.print==null && other.getPrint()==null) || 
             (this.print!=null &&
              java.util.Arrays.equals(this.print, other.getPrint()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              java.util.Arrays.equals(this.probability, other.getProbability()))) &&
            ((this.projectedAmount==null && other.getProjectedAmount()==null) || 
             (this.projectedAmount!=null &&
              java.util.Arrays.equals(this.projectedAmount, other.getProjectedAmount()))) &&
            ((this.projectTask==null && other.getProjectTask()==null) || 
             (this.projectTask!=null &&
              java.util.Arrays.equals(this.projectTask, other.getProjectTask()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              java.util.Arrays.equals(this.promoCode, other.getPromoCode()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              java.util.Arrays.equals(this.purchaseOrder, other.getPurchaseOrder()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              java.util.Arrays.equals(this.quantityBilled, other.getQuantityBilled()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              java.util.Arrays.equals(this.quantityCommitted, other.getQuantityCommitted()))) &&
            ((this.quantityPacked==null && other.getQuantityPacked()==null) || 
             (this.quantityPacked!=null &&
              java.util.Arrays.equals(this.quantityPacked, other.getQuantityPacked()))) &&
            ((this.quantityPicked==null && other.getQuantityPicked()==null) || 
             (this.quantityPicked!=null &&
              java.util.Arrays.equals(this.quantityPicked, other.getQuantityPicked()))) &&
            ((this.quantityRevCommitted==null && other.getQuantityRevCommitted()==null) || 
             (this.quantityRevCommitted!=null &&
              java.util.Arrays.equals(this.quantityRevCommitted, other.getQuantityRevCommitted()))) &&
            ((this.quantityShipRecv==null && other.getQuantityShipRecv()==null) || 
             (this.quantityShipRecv!=null &&
              java.util.Arrays.equals(this.quantityShipRecv, other.getQuantityShipRecv()))) &&
            ((this.quantityUom==null && other.getQuantityUom()==null) || 
             (this.quantityUom!=null &&
              java.util.Arrays.equals(this.quantityUom, other.getQuantityUom()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate()))) &&
            ((this.realizedGainPostingTransaction==null && other.getRealizedGainPostingTransaction()==null) || 
             (this.realizedGainPostingTransaction!=null &&
              java.util.Arrays.equals(this.realizedGainPostingTransaction, other.getRealizedGainPostingTransaction()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              java.util.Arrays.equals(this.recognizedRevenue, other.getRecognizedRevenue()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              java.util.Arrays.equals(this.recordType, other.getRecordType()))) &&
            ((this.recurAnnuallyTotal==null && other.getRecurAnnuallyTotal()==null) || 
             (this.recurAnnuallyTotal!=null &&
              java.util.Arrays.equals(this.recurAnnuallyTotal, other.getRecurAnnuallyTotal()))) &&
            ((this.recurMonthlyTotal==null && other.getRecurMonthlyTotal()==null) || 
             (this.recurMonthlyTotal!=null &&
              java.util.Arrays.equals(this.recurMonthlyTotal, other.getRecurMonthlyTotal()))) &&
            ((this.recurQuarterlyTotal==null && other.getRecurQuarterlyTotal()==null) || 
             (this.recurQuarterlyTotal!=null &&
              java.util.Arrays.equals(this.recurQuarterlyTotal, other.getRecurQuarterlyTotal()))) &&
            ((this.recurringBill==null && other.getRecurringBill()==null) || 
             (this.recurringBill!=null &&
              java.util.Arrays.equals(this.recurringBill, other.getRecurringBill()))) &&
            ((this.recurWeeklyTotal==null && other.getRecurWeeklyTotal()==null) || 
             (this.recurWeeklyTotal!=null &&
              java.util.Arrays.equals(this.recurWeeklyTotal, other.getRecurWeeklyTotal()))) &&
            ((this.refNumber==null && other.getRefNumber()==null) || 
             (this.refNumber!=null &&
              java.util.Arrays.equals(this.refNumber, other.getRefNumber()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              java.util.Arrays.equals(this.revCommitStatus, other.getRevCommitStatus()))) &&
            ((this.revCommittingTransaction==null && other.getRevCommittingTransaction()==null) || 
             (this.revCommittingTransaction!=null &&
              java.util.Arrays.equals(this.revCommittingTransaction, other.getRevCommittingTransaction()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              java.util.Arrays.equals(this.revenueStatus, other.getRevenueStatus()))) &&
            ((this.reversalDate==null && other.getReversalDate()==null) || 
             (this.reversalDate!=null &&
              java.util.Arrays.equals(this.reversalDate, other.getReversalDate()))) &&
            ((this.reversalNumber==null && other.getReversalNumber()==null) || 
             (this.reversalNumber!=null &&
              java.util.Arrays.equals(this.reversalNumber, other.getReversalNumber()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              java.util.Arrays.equals(this.revRecEndDate, other.getRevRecEndDate()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              java.util.Arrays.equals(this.revRecOnRevCommitment, other.getRevRecOnRevCommitment()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              java.util.Arrays.equals(this.revRecStartDate, other.getRevRecStartDate()))) &&
            ((this.rgAccount==null && other.getRgAccount()==null) || 
             (this.rgAccount!=null &&
              java.util.Arrays.equals(this.rgAccount, other.getRgAccount()))) &&
            ((this.rgAmount==null && other.getRgAmount()==null) || 
             (this.rgAmount!=null &&
              java.util.Arrays.equals(this.rgAmount, other.getRgAmount()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              java.util.Arrays.equals(this.salesEffectiveDate, other.getSalesEffectiveDate()))) &&
            ((this.salesOrder==null && other.getSalesOrder()==null) || 
             (this.salesOrder!=null &&
              java.util.Arrays.equals(this.salesOrder, other.getSalesOrder()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              java.util.Arrays.equals(this.salesRep, other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              java.util.Arrays.equals(this.salesTeamMember, other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              java.util.Arrays.equals(this.salesTeamRole, other.getSalesTeamRole()))) &&
            ((this.schedulingMethod==null && other.getSchedulingMethod()==null) || 
             (this.schedulingMethod!=null &&
              java.util.Arrays.equals(this.schedulingMethod, other.getSchedulingMethod()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              java.util.Arrays.equals(this.serialNumber, other.getSerialNumber()))) &&
            ((this.serialNumberCost==null && other.getSerialNumberCost()==null) || 
             (this.serialNumberCost!=null &&
              java.util.Arrays.equals(this.serialNumberCost, other.getSerialNumberCost()))) &&
            ((this.serialNumberCostAdjustment==null && other.getSerialNumberCostAdjustment()==null) || 
             (this.serialNumberCostAdjustment!=null &&
              java.util.Arrays.equals(this.serialNumberCostAdjustment, other.getSerialNumberCostAdjustment()))) &&
            ((this.serialNumberQuantity==null && other.getSerialNumberQuantity()==null) || 
             (this.serialNumberQuantity!=null &&
              java.util.Arrays.equals(this.serialNumberQuantity, other.getSerialNumberQuantity()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              java.util.Arrays.equals(this.serialNumbers, other.getSerialNumbers()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              java.util.Arrays.equals(this.shipAddress, other.getShipAddress()))) &&
            ((this.shipAddress1==null && other.getShipAddress1()==null) || 
             (this.shipAddress1!=null &&
              java.util.Arrays.equals(this.shipAddress1, other.getShipAddress1()))) &&
            ((this.shipAddress2==null && other.getShipAddress2()==null) || 
             (this.shipAddress2!=null &&
              java.util.Arrays.equals(this.shipAddress2, other.getShipAddress2()))) &&
            ((this.shipAddress3==null && other.getShipAddress3()==null) || 
             (this.shipAddress3!=null &&
              java.util.Arrays.equals(this.shipAddress3, other.getShipAddress3()))) &&
            ((this.shipAddressee==null && other.getShipAddressee()==null) || 
             (this.shipAddressee!=null &&
              java.util.Arrays.equals(this.shipAddressee, other.getShipAddressee()))) &&
            ((this.shipAttention==null && other.getShipAttention()==null) || 
             (this.shipAttention!=null &&
              java.util.Arrays.equals(this.shipAttention, other.getShipAttention()))) &&
            ((this.shipCarrier==null && other.getShipCarrier()==null) || 
             (this.shipCarrier!=null &&
              java.util.Arrays.equals(this.shipCarrier, other.getShipCarrier()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              java.util.Arrays.equals(this.shipCity, other.getShipCity()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              java.util.Arrays.equals(this.shipComplete, other.getShipComplete()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              java.util.Arrays.equals(this.shipCountry, other.getShipCountry()))) &&
            ((this.shipCountryCode==null && other.getShipCountryCode()==null) || 
             (this.shipCountryCode!=null &&
              java.util.Arrays.equals(this.shipCountryCode, other.getShipCountryCode()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              java.util.Arrays.equals(this.shipDate, other.getShipDate()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              java.util.Arrays.equals(this.shipGroup, other.getShipGroup()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              java.util.Arrays.equals(this.shipMethod, other.getShipMethod()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              java.util.Arrays.equals(this.shipPhone, other.getShipPhone()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              java.util.Arrays.equals(this.shippingAmount, other.getShippingAmount()))) &&
            ((this.shipRecvStatusLine==null && other.getShipRecvStatusLine()==null) || 
             (this.shipRecvStatusLine!=null &&
              java.util.Arrays.equals(this.shipRecvStatusLine, other.getShipRecvStatusLine()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              java.util.Arrays.equals(this.shipState, other.getShipState()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              java.util.Arrays.equals(this.shipTo, other.getShipTo()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              java.util.Arrays.equals(this.shipZip, other.getShipZip()))) &&
            ((this.signedAmount==null && other.getSignedAmount()==null) || 
             (this.signedAmount!=null &&
              java.util.Arrays.equals(this.signedAmount, other.getSignedAmount()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              java.util.Arrays.equals(this.subscription, other.getSubscription()))) &&
            ((this.subscriptionLine==null && other.getSubscriptionLine()==null) || 
             (this.subscriptionLine!=null &&
              java.util.Arrays.equals(this.subscriptionLine, other.getSubscriptionLine()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              java.util.Arrays.equals(this.taxAmount, other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              java.util.Arrays.equals(this.taxCode, other.getTaxCode()))) &&
            ((this.taxLine==null && other.getTaxLine()==null) || 
             (this.taxLine!=null &&
              java.util.Arrays.equals(this.taxLine, other.getTaxLine()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              java.util.Arrays.equals(this.taxPeriod, other.getTaxPeriod()))) &&
            ((this.taxPointDate==null && other.getTaxPointDate()==null) || 
             (this.taxPointDate!=null &&
              java.util.Arrays.equals(this.taxPointDate, other.getTaxPointDate()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              java.util.Arrays.equals(this.taxTotal, other.getTaxTotal()))) &&
            ((this.termInMonths==null && other.getTermInMonths()==null) || 
             (this.termInMonths!=null &&
              java.util.Arrays.equals(this.termInMonths, other.getTermInMonths()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              java.util.Arrays.equals(this.terms, other.getTerms()))) &&
            ((this.termsOfSale==null && other.getTermsOfSale()==null) || 
             (this.termsOfSale!=null &&
              java.util.Arrays.equals(this.termsOfSale, other.getTermsOfSale()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              java.util.Arrays.equals(this.toBeEmailed, other.getToBeEmailed()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              java.util.Arrays.equals(this.toBePrinted, other.getToBePrinted()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              java.util.Arrays.equals(this.toSubsidiary, other.getToSubsidiary()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              java.util.Arrays.equals(this.total, other.getTotal()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              java.util.Arrays.equals(this.totalCostEstimate, other.getTotalCostEstimate()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              java.util.Arrays.equals(this.trackingNumbers, other.getTrackingNumbers()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              java.util.Arrays.equals(this.tranDate, other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranEstGrossProfit, other.getTranEstGrossProfit()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranFxEstGrossProfit, other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              java.util.Arrays.equals(this.tranId, other.getTranId()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              java.util.Arrays.equals(this.tranIsVsoeBundle, other.getTranIsVsoeBundle()))) &&
            ((this.transactionDiscount==null && other.getTransactionDiscount()==null) || 
             (this.transactionDiscount!=null &&
              java.util.Arrays.equals(this.transactionDiscount, other.getTransactionDiscount()))) &&
            ((this.transactionLineType==null && other.getTransactionLineType()==null) || 
             (this.transactionLineType!=null &&
              java.util.Arrays.equals(this.transactionLineType, other.getTransactionLineType()))) &&
            ((this.transactionNumber==null && other.getTransactionNumber()==null) || 
             (this.transactionNumber!=null &&
              java.util.Arrays.equals(this.transactionNumber, other.getTransactionNumber()))) &&
            ((this.transferLocation==null && other.getTransferLocation()==null) || 
             (this.transferLocation!=null &&
              java.util.Arrays.equals(this.transferLocation, other.getTransferLocation()))) &&
            ((this.transferOrderItemLine==null && other.getTransferOrderItemLine()==null) || 
             (this.transferOrderItemLine!=null &&
              java.util.Arrays.equals(this.transferOrderItemLine, other.getTransferOrderItemLine()))) &&
            ((this.transferOrderQuantityCommitted==null && other.getTransferOrderQuantityCommitted()==null) || 
             (this.transferOrderQuantityCommitted!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityCommitted, other.getTransferOrderQuantityCommitted()))) &&
            ((this.transferOrderQuantityPacked==null && other.getTransferOrderQuantityPacked()==null) || 
             (this.transferOrderQuantityPacked!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityPacked, other.getTransferOrderQuantityPacked()))) &&
            ((this.transferOrderQuantityPicked==null && other.getTransferOrderQuantityPicked()==null) || 
             (this.transferOrderQuantityPicked!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityPicked, other.getTransferOrderQuantityPicked()))) &&
            ((this.transferOrderQuantityReceived==null && other.getTransferOrderQuantityReceived()==null) || 
             (this.transferOrderQuantityReceived!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityReceived, other.getTransferOrderQuantityReceived()))) &&
            ((this.transferOrderQuantityShipped==null && other.getTransferOrderQuantityShipped()==null) || 
             (this.transferOrderQuantityShipped!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityShipped, other.getTransferOrderQuantityShipped()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              java.util.Arrays.equals(this.unit, other.getUnit()))) &&
            ((this.unitCostOverride==null && other.getUnitCostOverride()==null) || 
             (this.unitCostOverride!=null &&
              java.util.Arrays.equals(this.unitCostOverride, other.getUnitCostOverride()))) &&
            ((this.vendType==null && other.getVendType()==null) || 
             (this.vendType!=null &&
              java.util.Arrays.equals(this.vendType, other.getVendType()))) &&
            ((this.visibleToCustomer==null && other.getVisibleToCustomer()==null) || 
             (this.visibleToCustomer!=null &&
              java.util.Arrays.equals(this.visibleToCustomer, other.getVisibleToCustomer()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              java.util.Arrays.equals(this.vsoeAllocation, other.getVsoeAllocation()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              java.util.Arrays.equals(this.vsoeAmount, other.getVsoeAmount()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              java.util.Arrays.equals(this.vsoeDeferral, other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              java.util.Arrays.equals(this.vsoeDelivered, other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              java.util.Arrays.equals(this.vsoePermitDiscount, other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              java.util.Arrays.equals(this.vsoePrice, other.getVsoePrice()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              java.util.Arrays.equals(this.webSite, other.getWebSite()))) &&
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
        if (getAbbrev() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbbrev());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbbrev(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctCorpCardExp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctCorpCardExp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctCorpCardExp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualShipDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualShipDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualShipDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSalesAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSalesAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSalesNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSalesNetAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountPaid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountPaid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountPaid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountRemaining(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountUnbilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountUnbilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountUnbilled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToForeignAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToForeignAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToForeignAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToIsFxVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToIsFxVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToIsFxVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToLinkAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToLinkAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToLinkAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToLinkType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToLinkType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToLinkType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingForeignAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingForeignAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingForeignAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingIsFxVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingIsFxVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingIsFxVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingLinkAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingLinkAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingLinkAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingLinkType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingLinkType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingLinkType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoCalculateLag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoCalculateLag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoCalculateLag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvsStreetMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvsStreetMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvsStreetMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvsZipMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvsZipMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvsZipMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBilledDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBilledDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBilledDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillVarianceStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillVarianceStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillVarianceStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinNumberQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumberQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumberQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBomQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBomQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBomQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildEntireAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildEntireAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildEntireAssembly(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuilt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuilt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuilt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCanHaveStackablePromotions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCanHaveStackablePromotions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCanHaveStackablePromotions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCatchUpPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatchUpPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatchUpPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcCustomerCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcCustomerCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcCustomerCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcExpDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcExpDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcExpDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcHolderName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcHolderName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcHolderName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcStreet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcStreet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcStreet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcZipCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcZipCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcZipCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCleared() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCleared());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCleared(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCogsAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCogsAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCogsAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommissionEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommissionEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommissionEffectiveDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentYield() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponentYield());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponentYield(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfirmationNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfirmationNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfirmationNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContributionPrimary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContributionPrimary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContributionPrimary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostComponentAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostComponentAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostComponentAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostComponentCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostComponentCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostComponentCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostComponentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostComponentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostComponentItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostComponentQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostComponentQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostComponentQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostComponentStandardCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostComponentStandardCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostComponentStandardCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimateRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimateRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimateRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCscMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCscMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCscMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomForm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomGL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomGL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomGL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysOpen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOpen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOpen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysOverdue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOverdue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOverdue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebitAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebitAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebitAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferRevRec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferRevRec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferRevRec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDueDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDueDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDueDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstGrossProfitPct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstGrossProfitPct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstGrossProfitPct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstGrossProfitPercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstGrossProfitPercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstGrossProfitPercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExchangeRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeCommission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeCommission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeCommission(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeFromRateRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeFromRateRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeFromRateRequest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedReceiptDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedReceiptDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedReceiptDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseDate(), i);
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
        if (getFirmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForecastType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFulfillingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxCostEstimateRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxCostEstimateRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxCostEstimateRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxTranCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxTranCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxTranCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxVsoeAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxVsoeAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxVsoeAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxVsoeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxVsoeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxVsoeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxVsoePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvailabelToCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvailabelToCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvailabelToCharge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvailableToRefund() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvailableToRefund());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvailableToRefund(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvsStreetMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvsStreetMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvsStreetMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvsZipMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvsZipMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvsZipMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoBuyerAccountAge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoBuyerAccountAge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoBuyerAccountAge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoBuyerIp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoBuyerIp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoBuyerIp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoChargeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoChargeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoChargeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoChargebackAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoChargebackAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoChargebackAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoConfirmedChargedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoConfirmedChargedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoConfirmedChargedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoConfirmedRefundedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoConfirmedRefundedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoConfirmedRefundedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoCreditcardNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoCreditcardNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoCreditcardNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoCscMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoCscMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoCscMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoFinancialState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoFinancialState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoFinancialState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoFulfillmentState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoFulfillmentState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoFulfillmentState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoOrderId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoOrderId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoOrderId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoOrderTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoOrderTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoOrderTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoPromotionAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoPromotionAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoPromotionAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoPromotionName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoPromotionName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoPromotionName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoRefundAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoRefundAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoRefundAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoShippingTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoShippingTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoShippingTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoStateChangedDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoStateChangedDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoStateChangedDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeInForecast() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeInForecast());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeInForecast(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncoterm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncoterm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncoterm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntercoStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntercoStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntercoStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntercoTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntercoTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntercoTransaction(), i);
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
        if (getInventoryLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventoryLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventoryLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInventorySubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventorySubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventorySubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsBackflush() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBackflush());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBackflush(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoChargeback() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoChargeback());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoChargeback(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoChargeConfirmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoChargeConfirmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoChargeConfirmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoPaymentGuaranteed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoPaymentGuaranteed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoPaymentGuaranteed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoRefundConfirmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoRefundConfirmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoRefundConfirmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInsideDelivery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInsideDelivery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInsideDelivery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInsidePickup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInsidePickup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInsidePickup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsIntercompanyAdjustment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsIntercompanyAdjustment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsIntercompanyAdjustment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInTransitPayment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInTransitPayment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInTransitPayment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsMultiShipTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsMultiShipTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsMultiShipTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsReversal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsReversal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsReversal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsRevRecTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsRevRecTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsRevRecTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsScrap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsScrap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsScrap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsShipAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsShipAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsShipAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsTransferPriceCosting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsTransferPriceCosting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsTransferPriceCosting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsWip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsWip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsWip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemFulfillmentChoice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemFulfillmentChoice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemFulfillmentChoice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemRevision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemRevision());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemRevision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandedCostPerLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostPerLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostPerLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeadSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineSequenceNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineSequenceNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineSequenceNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineUniqueKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineUniqueKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineUniqueKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationAutoAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationAutoAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationAutoAssigned(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingRouting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingRouting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingRouting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchBillToReceipt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchBillToReceipt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchBillToReceipt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemoMain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemoMain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemoMain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemorized() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemorized());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemorized(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMerchantAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultiSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetAmountNoTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetAmountNoTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetAmountNoTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextBillDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextBillDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextBillDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoAutoAssignLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoAutoAssignLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoAutoAssignLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNonReimbursable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonReimbursable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonReimbursable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOneTimeTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOneTimeTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOneTimeTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherRefNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherRefNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherRefNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverheadParentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverheadParentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverheadParentItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaidAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaidAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaidAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaidTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaidTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaidTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayingAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayingAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentApproved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentApproved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentApproved(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventHoldReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventHoldReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventHoldReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventPurchaseCardUsed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventPurchaseCardUsed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventPurchaseCardUsed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventPurchaseDataSent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventPurchaseDataSent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventPurchaseDataSent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentHold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentHold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentHold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalPending() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayPalPending());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayPalPending(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayPalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayPalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayPalTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayPalTranId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollBatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollBatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollBatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPnRefNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnRefNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnRefNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPosting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostingPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostingPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostingPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProbability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProbability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProbability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectTask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromoCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityBilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityBilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityBilled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityPacked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityPacked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityPacked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityPicked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityPicked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityPicked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityRevCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityRevCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityRevCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityShipRecv() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityShipRecv());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityShipRecv(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityUom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityUom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityUom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealizedGainPostingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRealizedGainPostingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRealizedGainPostingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecognizedRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecognizedRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecognizedRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurAnnuallyTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurAnnuallyTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurAnnuallyTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurMonthlyTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurMonthlyTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurMonthlyTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurQuarterlyTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurQuarterlyTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurQuarterlyTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurringBill() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurringBill());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurringBill(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecurWeeklyTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurWeeklyTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurWeeklyTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRefNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevCommitStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevCommitStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevCommitStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevCommittingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevCommittingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevCommittingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenueStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenueStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenueStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReversalDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReversalDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReversalDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReversalNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReversalNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReversalNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecOnRevCommitment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecOnRevCommitment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecOnRevCommitment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRgAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRgAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRgAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRgAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRgAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRgAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesEffectiveDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesRep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesRep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesRep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchedulingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedulingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedulingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumberCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumberCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumberCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumberCostAdjustment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumberCostAdjustment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumberCostAdjustment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumberQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumberQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumberQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipRecvStatusLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipRecvStatusLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipRecvStatusLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignedAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignedAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignedAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxPointDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxPointDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxPointDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTermInMonths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTermInMonths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTermInMonths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTermsOfSale() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTermsOfSale());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTermsOfSale(), i);
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
        if (getToBeEmailed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToBeEmailed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToBeEmailed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToBePrinted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToBePrinted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToBePrinted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranFxEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranFxEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranFxEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranIsVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranIsVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranIsVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionLineType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionLineType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionLineType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderItemLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderItemLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderItemLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityPacked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityPacked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityPacked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityPicked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityPicked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityPicked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityReceived() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityReceived());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityReceived(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityShipped() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityShipped());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityShipped(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitCostOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitCostOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitCostOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisibleToCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisibleToCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisibleToCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDeferral() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDeferral());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDeferral(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDelivered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDelivered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDelivered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePermitDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePermitDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePermitDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebSite(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbrev");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "abbrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctCorpCardExp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "acctCorpCardExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUnbilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "amountUnbilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "appliedToTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "applyingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "avsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "avsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "binNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buildVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "built"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canHaveStackablePromotions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "canHaveStackablePromotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleared");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cleared"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cogsAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "commissionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "confirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contributionPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contributionPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costComponentStandardCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costComponentStandardCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "cscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "depositDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "depositTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "docUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "effectiveRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromRateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "excludeFromRateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseDate"));
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
        elemField.setFieldName("firmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fulfillingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxCostEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxVsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxVsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxVsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailabelToCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvailabelToCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailableToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvailableToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoAvsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerAccountAge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoBuyerAccountAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoBuyerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargebackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoChargebackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedChargedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoConfirmedChargedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedRefundedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoConfirmedRefundedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCreditcardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoCreditcardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoCscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFinancialState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoFinancialState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFulfillmentState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoFulfillmentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoOrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoPromotionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoPromotionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoShippingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoShippingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoStateChangedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "gcoStateChangedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giftCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "includeInForecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "intercoTransaction"));
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
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inventorySubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "inVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBackflush");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBackflush"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoChargeback"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoChargeConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoPaymentGuaranteed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoPaymentGuaranteed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoRefundConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isGcoRefundConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInsideDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInsideDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInsidePickup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInsidePickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIntercompanyAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isIntercompanyAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInTransitPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInTransitPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReversal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isReversal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRevRecTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isRevRecTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isScrap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isScrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTransferPriceCosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isTransferPriceCosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFulfillmentChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemFulfillmentChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lineUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAutoAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationAutoAssigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingRouting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manufacturingRouting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoMain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memoMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "memorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmountNoTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "netAmountNoTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nextBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noAutoAssignLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "noAutoAssignLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonReimbursable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "nonReimbursable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "oneTimeTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "originator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overheadParentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overheadParentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "packageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paidTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventPurchaseCardUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventPurchaseCardUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventPurchaseDataSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventPurchaseDataSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payPalPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payrollBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("print");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "print"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShipRecv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityShipRecv"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "quantityUom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realizedGainPostingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "realizedGainPostingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurAnnuallyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurAnnuallyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurMonthlyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurMonthlyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurQuarterlyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurQuarterlyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringBill");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurringBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurWeeklyTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "recurWeeklyTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "refNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revCommittingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reversalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rgAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "rgAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberCostAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberCostAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipRecvStatusLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipRecvStatusLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "signedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "termInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsOfSale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "termsOfSale"));
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
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionLineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderItemLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderItemLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "transferOrderQuantityShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unitCostOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vendType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "webSite"));
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
