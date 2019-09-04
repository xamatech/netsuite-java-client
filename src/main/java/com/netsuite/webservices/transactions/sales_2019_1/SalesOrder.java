/**
 * SalesOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class SalesOrder  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum;

    private java.lang.String source;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderOrderStatus orderStatus;

    private java.util.Calendar nextBill;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep;

    private java.lang.String contribPct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef partner;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup;

    private java.lang.Boolean syncSalesTeams;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.String otherRefNum;

    private java.lang.String memo;

    private java.util.Calendar salesEffectiveDate;

    private java.lang.Boolean excludeCommission;

    private java.lang.Double totalCostEstimate;

    private java.lang.Double estGrossProfit;

    private java.lang.Double estGrossProfitPercent;

    private java.lang.Double exchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode;

    private java.lang.String currencyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem;

    private java.lang.String discountRate;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem;

    private java.lang.Double taxRate;

    private java.lang.Boolean toBePrinted;

    private java.lang.Boolean toBeEmailed;

    private java.lang.String email;

    private java.lang.Boolean toBeFaxed;

    private java.lang.String fax;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel;

    private java.lang.String message;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption;

    private java.lang.String inputAuthCode;

    private java.lang.String inputReferenceCode;

    private java.lang.String checkNumber;

    private java.lang.String paymentCardCsc;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile;

    private com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderHandlingMode handlingMode;

    private java.lang.String outputAuthCode;

    private java.lang.String outputReferenceCode;

    private com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderPaymentOperation paymentOperation;

    private java.lang.String dynamicDescriptor;

    private com.netsuite.webservices.platform.common_2019_1.Address billingAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList;

    private com.netsuite.webservices.platform.common_2019_1.Address shippingAddress;

    private java.lang.Boolean shipIsResidential;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList;

    private java.lang.String fob;

    private java.util.Calendar shipDate;

    private java.util.Calendar actualShipDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod;

    private java.lang.Double shippingCost;

    private java.lang.Double shippingTax1Rate;

    private java.lang.Boolean isMultiShipTo;

    private java.lang.String shippingTax2Rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode;

    private java.lang.Double handlingTax1Rate;

    private java.lang.String handlingTax2Rate;

    private java.lang.Double handlingCost;

    private java.lang.String trackingNumbers;

    private java.lang.String linkedTrackingNumbers;

    private java.lang.Boolean shipComplete;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod;

    private java.lang.String shopperIpAddress;

    private java.lang.Boolean saveOnAuthDecline;

    private java.lang.Boolean canHaveStackable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard;

    private com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus;

    private java.lang.Double recognizedRevenue;

    private java.lang.Double deferredRevenue;

    private java.lang.Boolean revRecOnRevCommitment;

    private com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus revCommitStatus;

    private java.lang.String ccNumber;

    private java.util.Calendar ccExpireDate;

    private java.lang.String ccName;

    private java.lang.String ccStreet;

    private java.lang.String ccZipCode;

    private java.lang.String payPalStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor;

    private java.lang.String payPalTranId;

    private java.lang.Boolean ccApproved;

    private java.lang.Boolean getAuth;

    private java.lang.String authCode;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch;

    private java.lang.Boolean isRecurringPayment;

    private com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch;

    private java.lang.Double altSalesTotal;

    private java.lang.Boolean ignoreAvs;

    private com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventResult paymentEventResult;

    private com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventHoldReason paymentEventHoldReason;

    private com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventType paymentEventType;

    private java.util.Calendar paymentEventDate;

    private java.lang.String paymentEventUpdatedBy;

    private java.lang.Double subTotal;

    private java.lang.Double discountTotal;

    private java.lang.Double taxTotal;

    private java.lang.Double altShippingCost;

    private java.lang.Double altHandlingCost;

    private java.lang.Double total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule;

    private java.util.Calendar revRecStartDate;

    private java.util.Calendar revRecEndDate;

    private java.lang.String paypalAuthId;

    private java.lang.Double balance;

    private java.lang.Boolean paypalProcess;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private java.lang.String ccSecurityCode;

    private java.lang.String threeDStatusCode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction;

    private com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus;

    private java.lang.String debitCardIssueNo;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.util.Calendar taxPointDate;

    private java.lang.Boolean taxDetailsOverride;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private java.lang.String pnRefNum;

    private java.lang.String status;

    private java.lang.Double tax2Total;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terms;

    private java.util.Calendar validFrom;

    private java.lang.String vatRegNum;

    private java.lang.Double giftCertApplied;

    private java.lang.Double oneTime;

    private java.lang.Double recurWeekly;

    private java.lang.Double recurMonthly;

    private java.lang.Double recurQuarterly;

    private java.lang.Double recurAnnually;

    private java.lang.Boolean tranIsVsoeBundle;

    private java.lang.Boolean vsoeAutoCalc;

    private java.lang.Boolean syncPartnerTeams;

    private com.netsuite.webservices.transactions.sales_2019_1.SalesOrderSalesTeamList salesTeamList;

    private com.netsuite.webservices.transactions.sales_2019_1.SalesOrderPartnersList partnersList;

    private com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList giftCertRedemptionList;

    private com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList;

    private com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItemList itemList;

    private com.netsuite.webservices.transactions.sales_2019_1.SalesOrderShipGroupList shipGroupList;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public SalesOrder() {
    }

    public SalesOrder(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum,
           java.lang.String source,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderOrderStatus orderStatus,
           java.util.Calendar nextBill,
           com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep,
           java.lang.String contribPct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef partner,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup,
           java.lang.Boolean syncSalesTeams,
           com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.String otherRefNum,
           java.lang.String memo,
           java.util.Calendar salesEffectiveDate,
           java.lang.Boolean excludeCommission,
           java.lang.Double totalCostEstimate,
           java.lang.Double estGrossProfit,
           java.lang.Double estGrossProfitPercent,
           java.lang.Double exchangeRate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode,
           java.lang.String currencyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem,
           java.lang.String discountRate,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem,
           java.lang.Double taxRate,
           java.lang.Boolean toBePrinted,
           java.lang.Boolean toBeEmailed,
           java.lang.String email,
           java.lang.Boolean toBeFaxed,
           java.lang.String fax,
           com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel,
           java.lang.String message,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption,
           java.lang.String inputAuthCode,
           java.lang.String inputReferenceCode,
           java.lang.String checkNumber,
           java.lang.String paymentCardCsc,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile,
           com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderHandlingMode handlingMode,
           java.lang.String outputAuthCode,
           java.lang.String outputReferenceCode,
           com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderPaymentOperation paymentOperation,
           java.lang.String dynamicDescriptor,
           com.netsuite.webservices.platform.common_2019_1.Address billingAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList,
           com.netsuite.webservices.platform.common_2019_1.Address shippingAddress,
           java.lang.Boolean shipIsResidential,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList,
           java.lang.String fob,
           java.util.Calendar shipDate,
           java.util.Calendar actualShipDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod,
           java.lang.Double shippingCost,
           java.lang.Double shippingTax1Rate,
           java.lang.Boolean isMultiShipTo,
           java.lang.String shippingTax2Rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode,
           java.lang.Double handlingTax1Rate,
           java.lang.String handlingTax2Rate,
           java.lang.Double handlingCost,
           java.lang.String trackingNumbers,
           java.lang.String linkedTrackingNumbers,
           java.lang.Boolean shipComplete,
           com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod,
           java.lang.String shopperIpAddress,
           java.lang.Boolean saveOnAuthDecline,
           java.lang.Boolean canHaveStackable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard,
           com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus,
           java.lang.Double recognizedRevenue,
           java.lang.Double deferredRevenue,
           java.lang.Boolean revRecOnRevCommitment,
           com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus revCommitStatus,
           java.lang.String ccNumber,
           java.util.Calendar ccExpireDate,
           java.lang.String ccName,
           java.lang.String ccStreet,
           java.lang.String ccZipCode,
           java.lang.String payPalStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor,
           java.lang.String payPalTranId,
           java.lang.Boolean ccApproved,
           java.lang.Boolean getAuth,
           java.lang.String authCode,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch,
           java.lang.Boolean isRecurringPayment,
           com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch,
           java.lang.Double altSalesTotal,
           java.lang.Boolean ignoreAvs,
           com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventResult paymentEventResult,
           com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventHoldReason paymentEventHoldReason,
           com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventType paymentEventType,
           java.util.Calendar paymentEventDate,
           java.lang.String paymentEventUpdatedBy,
           java.lang.Double subTotal,
           java.lang.Double discountTotal,
           java.lang.Double taxTotal,
           java.lang.Double altShippingCost,
           java.lang.Double altHandlingCost,
           java.lang.Double total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule,
           java.util.Calendar revRecStartDate,
           java.util.Calendar revRecEndDate,
           java.lang.String paypalAuthId,
           java.lang.Double balance,
           java.lang.Boolean paypalProcess,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           java.lang.String ccSecurityCode,
           java.lang.String threeDStatusCode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction,
           com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus,
           java.lang.String debitCardIssueNo,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum,
           java.lang.Boolean taxRegOverride,
           java.util.Calendar taxPointDate,
           java.lang.Boolean taxDetailsOverride,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           java.lang.String pnRefNum,
           java.lang.String status,
           java.lang.Double tax2Total,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terms,
           java.util.Calendar validFrom,
           java.lang.String vatRegNum,
           java.lang.Double giftCertApplied,
           java.lang.Double oneTime,
           java.lang.Double recurWeekly,
           java.lang.Double recurMonthly,
           java.lang.Double recurQuarterly,
           java.lang.Double recurAnnually,
           java.lang.Boolean tranIsVsoeBundle,
           java.lang.Boolean vsoeAutoCalc,
           java.lang.Boolean syncPartnerTeams,
           com.netsuite.webservices.transactions.sales_2019_1.SalesOrderSalesTeamList salesTeamList,
           com.netsuite.webservices.transactions.sales_2019_1.SalesOrderPartnersList partnersList,
           com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList giftCertRedemptionList,
           com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList,
           com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItemList itemList,
           com.netsuite.webservices.transactions.sales_2019_1.SalesOrderShipGroupList shipGroupList,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.customForm = customForm;
        this.entity = entity;
        this.job = job;
        this.currency = currency;
        this.drAccount = drAccount;
        this.fxAccount = fxAccount;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.source = source;
        this.createdFrom = createdFrom;
        this.orderStatus = orderStatus;
        this.nextBill = nextBill;
        this.opportunity = opportunity;
        this.salesRep = salesRep;
        this.contribPct = contribPct;
        this.partner = partner;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.leadSource = leadSource;
        this.startDate = startDate;
        this.endDate = endDate;
        this.otherRefNum = otherRefNum;
        this.memo = memo;
        this.salesEffectiveDate = salesEffectiveDate;
        this.excludeCommission = excludeCommission;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.exchangeRate = exchangeRate;
        this.promoCode = promoCode;
        this.currencyName = currencyName;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.messageSel = messageSel;
        this.message = message;
        this.paymentOption = paymentOption;
        this.inputAuthCode = inputAuthCode;
        this.inputReferenceCode = inputReferenceCode;
        this.checkNumber = checkNumber;
        this.paymentCardCsc = paymentCardCsc;
        this.paymentProcessingProfile = paymentProcessingProfile;
        this.handlingMode = handlingMode;
        this.outputAuthCode = outputAuthCode;
        this.outputReferenceCode = outputReferenceCode;
        this.paymentOperation = paymentOperation;
        this.dynamicDescriptor = dynamicDescriptor;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.fob = fob;
        this.shipDate = shipDate;
        this.actualShipDate = actualShipDate;
        this.shipMethod = shipMethod;
        this.shippingCost = shippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.isMultiShipTo = isMultiShipTo;
        this.shippingTax2Rate = shippingTax2Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingTax2Rate = handlingTax2Rate;
        this.handlingCost = handlingCost;
        this.trackingNumbers = trackingNumbers;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.shipComplete = shipComplete;
        this.paymentMethod = paymentMethod;
        this.shopperIpAddress = shopperIpAddress;
        this.saveOnAuthDecline = saveOnAuthDecline;
        this.canHaveStackable = canHaveStackable;
        this.creditCard = creditCard;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revCommitStatus = revCommitStatus;
        this.ccNumber = ccNumber;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.payPalStatus = payPalStatus;
        this.creditCardProcessor = creditCardProcessor;
        this.payPalTranId = payPalTranId;
        this.ccApproved = ccApproved;
        this.getAuth = getAuth;
        this.authCode = authCode;
        this.ccAvsStreetMatch = ccAvsStreetMatch;
        this.ccAvsZipMatch = ccAvsZipMatch;
        this.isRecurringPayment = isRecurringPayment;
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
        this.altSalesTotal = altSalesTotal;
        this.ignoreAvs = ignoreAvs;
        this.paymentEventResult = paymentEventResult;
        this.paymentEventHoldReason = paymentEventHoldReason;
        this.paymentEventType = paymentEventType;
        this.paymentEventDate = paymentEventDate;
        this.paymentEventUpdatedBy = paymentEventUpdatedBy;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.altShippingCost = altShippingCost;
        this.altHandlingCost = altHandlingCost;
        this.total = total;
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.paypalAuthId = paypalAuthId;
        this.balance = balance;
        this.paypalProcess = paypalProcess;
        this.billingSchedule = billingSchedule;
        this.ccSecurityCode = ccSecurityCode;
        this.threeDStatusCode = threeDStatusCode;
        this._class = _class;
        this.department = department;
        this.subsidiary = subsidiary;
        this.intercoTransaction = intercoTransaction;
        this.intercoStatus = intercoStatus;
        this.debitCardIssueNo = debitCardIssueNo;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxPointDate = taxPointDate;
        this.taxDetailsOverride = taxDetailsOverride;
        this.location = location;
        this.pnRefNum = pnRefNum;
        this.status = status;
        this.tax2Total = tax2Total;
        this.terms = terms;
        this.validFrom = validFrom;
        this.vatRegNum = vatRegNum;
        this.giftCertApplied = giftCertApplied;
        this.oneTime = oneTime;
        this.recurWeekly = recurWeekly;
        this.recurMonthly = recurMonthly;
        this.recurQuarterly = recurQuarterly;
        this.recurAnnually = recurAnnually;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.giftCertRedemptionList = giftCertRedemptionList;
        this.promotionsList = promotionsList;
        this.itemList = itemList;
        this.shipGroupList = shipGroupList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this SalesOrder.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SalesOrder.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customForm value for this SalesOrder.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this SalesOrder.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entity value for this SalesOrder.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this SalesOrder.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the job value for this SalesOrder.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this SalesOrder.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the currency value for this SalesOrder.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this SalesOrder.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the drAccount value for this SalesOrder.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this SalesOrder.
     * 
     * @param drAccount
     */
    public void setDrAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount) {
        this.drAccount = drAccount;
    }


    /**
     * Gets the fxAccount value for this SalesOrder.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this SalesOrder.
     * 
     * @param fxAccount
     */
    public void setFxAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount) {
        this.fxAccount = fxAccount;
    }


    /**
     * Gets the tranDate value for this SalesOrder.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this SalesOrder.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this SalesOrder.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this SalesOrder.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the entityTaxRegNum value for this SalesOrder.
     * 
     * @return entityTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }


    /**
     * Sets the entityTaxRegNum value for this SalesOrder.
     * 
     * @param entityTaxRegNum
     */
    public void setEntityTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }


    /**
     * Gets the source value for this SalesOrder.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this SalesOrder.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the createdFrom value for this SalesOrder.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this SalesOrder.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the orderStatus value for this SalesOrder.
     * 
     * @return orderStatus
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderOrderStatus getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this SalesOrder.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the nextBill value for this SalesOrder.
     * 
     * @return nextBill
     */
    public java.util.Calendar getNextBill() {
        return nextBill;
    }


    /**
     * Sets the nextBill value for this SalesOrder.
     * 
     * @param nextBill
     */
    public void setNextBill(java.util.Calendar nextBill) {
        this.nextBill = nextBill;
    }


    /**
     * Gets the opportunity value for this SalesOrder.
     * 
     * @return opportunity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this SalesOrder.
     * 
     * @param opportunity
     */
    public void setOpportunity(com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the salesRep value for this SalesOrder.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this SalesOrder.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the contribPct value for this SalesOrder.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this SalesOrder.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the partner value for this SalesOrder.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this SalesOrder.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the salesGroup value for this SalesOrder.
     * 
     * @return salesGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this SalesOrder.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the syncSalesTeams value for this SalesOrder.
     * 
     * @return syncSalesTeams
     */
    public java.lang.Boolean getSyncSalesTeams() {
        return syncSalesTeams;
    }


    /**
     * Sets the syncSalesTeams value for this SalesOrder.
     * 
     * @param syncSalesTeams
     */
    public void setSyncSalesTeams(java.lang.Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }


    /**
     * Gets the leadSource value for this SalesOrder.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this SalesOrder.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the startDate value for this SalesOrder.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SalesOrder.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SalesOrder.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SalesOrder.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the otherRefNum value for this SalesOrder.
     * 
     * @return otherRefNum
     */
    public java.lang.String getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this SalesOrder.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(java.lang.String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the memo value for this SalesOrder.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this SalesOrder.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the salesEffectiveDate value for this SalesOrder.
     * 
     * @return salesEffectiveDate
     */
    public java.util.Calendar getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this SalesOrder.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(java.util.Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }


    /**
     * Gets the excludeCommission value for this SalesOrder.
     * 
     * @return excludeCommission
     */
    public java.lang.Boolean getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this SalesOrder.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(java.lang.Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
    }


    /**
     * Gets the totalCostEstimate value for this SalesOrder.
     * 
     * @return totalCostEstimate
     */
    public java.lang.Double getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this SalesOrder.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(java.lang.Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }


    /**
     * Gets the estGrossProfit value for this SalesOrder.
     * 
     * @return estGrossProfit
     */
    public java.lang.Double getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this SalesOrder.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(java.lang.Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPercent value for this SalesOrder.
     * 
     * @return estGrossProfitPercent
     */
    public java.lang.Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this SalesOrder.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(java.lang.Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }


    /**
     * Gets the exchangeRate value for this SalesOrder.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this SalesOrder.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the promoCode value for this SalesOrder.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this SalesOrder.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the currencyName value for this SalesOrder.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this SalesOrder.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the discountItem value for this SalesOrder.
     * 
     * @return discountItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDiscountItem() {
        return discountItem;
    }


    /**
     * Sets the discountItem value for this SalesOrder.
     * 
     * @param discountItem
     */
    public void setDiscountItem(com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem) {
        this.discountItem = discountItem;
    }


    /**
     * Gets the discountRate value for this SalesOrder.
     * 
     * @return discountRate
     */
    public java.lang.String getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this SalesOrder.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.lang.String discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the isTaxable value for this SalesOrder.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this SalesOrder.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the taxItem value for this SalesOrder.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this SalesOrder.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxRate value for this SalesOrder.
     * 
     * @return taxRate
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this SalesOrder.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the toBePrinted value for this SalesOrder.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this SalesOrder.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toBeEmailed value for this SalesOrder.
     * 
     * @return toBeEmailed
     */
    public java.lang.Boolean getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this SalesOrder.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(java.lang.Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the email value for this SalesOrder.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SalesOrder.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the toBeFaxed value for this SalesOrder.
     * 
     * @return toBeFaxed
     */
    public java.lang.Boolean getToBeFaxed() {
        return toBeFaxed;
    }


    /**
     * Sets the toBeFaxed value for this SalesOrder.
     * 
     * @param toBeFaxed
     */
    public void setToBeFaxed(java.lang.Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }


    /**
     * Gets the fax value for this SalesOrder.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this SalesOrder.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the messageSel value for this SalesOrder.
     * 
     * @return messageSel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMessageSel() {
        return messageSel;
    }


    /**
     * Sets the messageSel value for this SalesOrder.
     * 
     * @param messageSel
     */
    public void setMessageSel(com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel) {
        this.messageSel = messageSel;
    }


    /**
     * Gets the message value for this SalesOrder.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SalesOrder.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the paymentOption value for this SalesOrder.
     * 
     * @return paymentOption
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentOption() {
        return paymentOption;
    }


    /**
     * Sets the paymentOption value for this SalesOrder.
     * 
     * @param paymentOption
     */
    public void setPaymentOption(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentOption) {
        this.paymentOption = paymentOption;
    }


    /**
     * Gets the inputAuthCode value for this SalesOrder.
     * 
     * @return inputAuthCode
     */
    public java.lang.String getInputAuthCode() {
        return inputAuthCode;
    }


    /**
     * Sets the inputAuthCode value for this SalesOrder.
     * 
     * @param inputAuthCode
     */
    public void setInputAuthCode(java.lang.String inputAuthCode) {
        this.inputAuthCode = inputAuthCode;
    }


    /**
     * Gets the inputReferenceCode value for this SalesOrder.
     * 
     * @return inputReferenceCode
     */
    public java.lang.String getInputReferenceCode() {
        return inputReferenceCode;
    }


    /**
     * Sets the inputReferenceCode value for this SalesOrder.
     * 
     * @param inputReferenceCode
     */
    public void setInputReferenceCode(java.lang.String inputReferenceCode) {
        this.inputReferenceCode = inputReferenceCode;
    }


    /**
     * Gets the checkNumber value for this SalesOrder.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this SalesOrder.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the paymentCardCsc value for this SalesOrder.
     * 
     * @return paymentCardCsc
     */
    public java.lang.String getPaymentCardCsc() {
        return paymentCardCsc;
    }


    /**
     * Sets the paymentCardCsc value for this SalesOrder.
     * 
     * @param paymentCardCsc
     */
    public void setPaymentCardCsc(java.lang.String paymentCardCsc) {
        this.paymentCardCsc = paymentCardCsc;
    }


    /**
     * Gets the paymentProcessingProfile value for this SalesOrder.
     * 
     * @return paymentProcessingProfile
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentProcessingProfile() {
        return paymentProcessingProfile;
    }


    /**
     * Sets the paymentProcessingProfile value for this SalesOrder.
     * 
     * @param paymentProcessingProfile
     */
    public void setPaymentProcessingProfile(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentProcessingProfile) {
        this.paymentProcessingProfile = paymentProcessingProfile;
    }


    /**
     * Gets the handlingMode value for this SalesOrder.
     * 
     * @return handlingMode
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderHandlingMode getHandlingMode() {
        return handlingMode;
    }


    /**
     * Sets the handlingMode value for this SalesOrder.
     * 
     * @param handlingMode
     */
    public void setHandlingMode(com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderHandlingMode handlingMode) {
        this.handlingMode = handlingMode;
    }


    /**
     * Gets the outputAuthCode value for this SalesOrder.
     * 
     * @return outputAuthCode
     */
    public java.lang.String getOutputAuthCode() {
        return outputAuthCode;
    }


    /**
     * Sets the outputAuthCode value for this SalesOrder.
     * 
     * @param outputAuthCode
     */
    public void setOutputAuthCode(java.lang.String outputAuthCode) {
        this.outputAuthCode = outputAuthCode;
    }


    /**
     * Gets the outputReferenceCode value for this SalesOrder.
     * 
     * @return outputReferenceCode
     */
    public java.lang.String getOutputReferenceCode() {
        return outputReferenceCode;
    }


    /**
     * Sets the outputReferenceCode value for this SalesOrder.
     * 
     * @param outputReferenceCode
     */
    public void setOutputReferenceCode(java.lang.String outputReferenceCode) {
        this.outputReferenceCode = outputReferenceCode;
    }


    /**
     * Gets the paymentOperation value for this SalesOrder.
     * 
     * @return paymentOperation
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderPaymentOperation getPaymentOperation() {
        return paymentOperation;
    }


    /**
     * Sets the paymentOperation value for this SalesOrder.
     * 
     * @param paymentOperation
     */
    public void setPaymentOperation(com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }


    /**
     * Gets the dynamicDescriptor value for this SalesOrder.
     * 
     * @return dynamicDescriptor
     */
    public java.lang.String getDynamicDescriptor() {
        return dynamicDescriptor;
    }


    /**
     * Sets the dynamicDescriptor value for this SalesOrder.
     * 
     * @param dynamicDescriptor
     */
    public void setDynamicDescriptor(java.lang.String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
    }


    /**
     * Gets the billingAddress value for this SalesOrder.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this SalesOrder.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2019_1.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billAddressList value for this SalesOrder.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this SalesOrder.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the shippingAddress value for this SalesOrder.
     * 
     * @return shippingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this SalesOrder.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.netsuite.webservices.platform.common_2019_1.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the shipIsResidential value for this SalesOrder.
     * 
     * @return shipIsResidential
     */
    public java.lang.Boolean getShipIsResidential() {
        return shipIsResidential;
    }


    /**
     * Sets the shipIsResidential value for this SalesOrder.
     * 
     * @param shipIsResidential
     */
    public void setShipIsResidential(java.lang.Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }


    /**
     * Gets the shipAddressList value for this SalesOrder.
     * 
     * @return shipAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this SalesOrder.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the fob value for this SalesOrder.
     * 
     * @return fob
     */
    public java.lang.String getFob() {
        return fob;
    }


    /**
     * Sets the fob value for this SalesOrder.
     * 
     * @param fob
     */
    public void setFob(java.lang.String fob) {
        this.fob = fob;
    }


    /**
     * Gets the shipDate value for this SalesOrder.
     * 
     * @return shipDate
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this SalesOrder.
     * 
     * @param shipDate
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the actualShipDate value for this SalesOrder.
     * 
     * @return actualShipDate
     */
    public java.util.Calendar getActualShipDate() {
        return actualShipDate;
    }


    /**
     * Sets the actualShipDate value for this SalesOrder.
     * 
     * @param actualShipDate
     */
    public void setActualShipDate(java.util.Calendar actualShipDate) {
        this.actualShipDate = actualShipDate;
    }


    /**
     * Gets the shipMethod value for this SalesOrder.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this SalesOrder.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the shippingCost value for this SalesOrder.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this SalesOrder.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the shippingTax1Rate value for this SalesOrder.
     * 
     * @return shippingTax1Rate
     */
    public java.lang.Double getShippingTax1Rate() {
        return shippingTax1Rate;
    }


    /**
     * Sets the shippingTax1Rate value for this SalesOrder.
     * 
     * @param shippingTax1Rate
     */
    public void setShippingTax1Rate(java.lang.Double shippingTax1Rate) {
        this.shippingTax1Rate = shippingTax1Rate;
    }


    /**
     * Gets the isMultiShipTo value for this SalesOrder.
     * 
     * @return isMultiShipTo
     */
    public java.lang.Boolean getIsMultiShipTo() {
        return isMultiShipTo;
    }


    /**
     * Sets the isMultiShipTo value for this SalesOrder.
     * 
     * @param isMultiShipTo
     */
    public void setIsMultiShipTo(java.lang.Boolean isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }


    /**
     * Gets the shippingTax2Rate value for this SalesOrder.
     * 
     * @return shippingTax2Rate
     */
    public java.lang.String getShippingTax2Rate() {
        return shippingTax2Rate;
    }


    /**
     * Sets the shippingTax2Rate value for this SalesOrder.
     * 
     * @param shippingTax2Rate
     */
    public void setShippingTax2Rate(java.lang.String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }


    /**
     * Gets the shippingTaxCode value for this SalesOrder.
     * 
     * @return shippingTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }


    /**
     * Sets the shippingTaxCode value for this SalesOrder.
     * 
     * @param shippingTaxCode
     */
    public void setShippingTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }


    /**
     * Gets the handlingTaxCode value for this SalesOrder.
     * 
     * @return handlingTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }


    /**
     * Sets the handlingTaxCode value for this SalesOrder.
     * 
     * @param handlingTaxCode
     */
    public void setHandlingTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }


    /**
     * Gets the handlingTax1Rate value for this SalesOrder.
     * 
     * @return handlingTax1Rate
     */
    public java.lang.Double getHandlingTax1Rate() {
        return handlingTax1Rate;
    }


    /**
     * Sets the handlingTax1Rate value for this SalesOrder.
     * 
     * @param handlingTax1Rate
     */
    public void setHandlingTax1Rate(java.lang.Double handlingTax1Rate) {
        this.handlingTax1Rate = handlingTax1Rate;
    }


    /**
     * Gets the handlingTax2Rate value for this SalesOrder.
     * 
     * @return handlingTax2Rate
     */
    public java.lang.String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }


    /**
     * Sets the handlingTax2Rate value for this SalesOrder.
     * 
     * @param handlingTax2Rate
     */
    public void setHandlingTax2Rate(java.lang.String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }


    /**
     * Gets the handlingCost value for this SalesOrder.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this SalesOrder.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the trackingNumbers value for this SalesOrder.
     * 
     * @return trackingNumbers
     */
    public java.lang.String getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this SalesOrder.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(java.lang.String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the linkedTrackingNumbers value for this SalesOrder.
     * 
     * @return linkedTrackingNumbers
     */
    public java.lang.String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }


    /**
     * Sets the linkedTrackingNumbers value for this SalesOrder.
     * 
     * @param linkedTrackingNumbers
     */
    public void setLinkedTrackingNumbers(java.lang.String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }


    /**
     * Gets the shipComplete value for this SalesOrder.
     * 
     * @return shipComplete
     */
    public java.lang.Boolean getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this SalesOrder.
     * 
     * @param shipComplete
     */
    public void setShipComplete(java.lang.Boolean shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the paymentMethod value for this SalesOrder.
     * 
     * @return paymentMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this SalesOrder.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the shopperIpAddress value for this SalesOrder.
     * 
     * @return shopperIpAddress
     */
    public java.lang.String getShopperIpAddress() {
        return shopperIpAddress;
    }


    /**
     * Sets the shopperIpAddress value for this SalesOrder.
     * 
     * @param shopperIpAddress
     */
    public void setShopperIpAddress(java.lang.String shopperIpAddress) {
        this.shopperIpAddress = shopperIpAddress;
    }


    /**
     * Gets the saveOnAuthDecline value for this SalesOrder.
     * 
     * @return saveOnAuthDecline
     */
    public java.lang.Boolean getSaveOnAuthDecline() {
        return saveOnAuthDecline;
    }


    /**
     * Sets the saveOnAuthDecline value for this SalesOrder.
     * 
     * @param saveOnAuthDecline
     */
    public void setSaveOnAuthDecline(java.lang.Boolean saveOnAuthDecline) {
        this.saveOnAuthDecline = saveOnAuthDecline;
    }


    /**
     * Gets the canHaveStackable value for this SalesOrder.
     * 
     * @return canHaveStackable
     */
    public java.lang.Boolean getCanHaveStackable() {
        return canHaveStackable;
    }


    /**
     * Sets the canHaveStackable value for this SalesOrder.
     * 
     * @param canHaveStackable
     */
    public void setCanHaveStackable(java.lang.Boolean canHaveStackable) {
        this.canHaveStackable = canHaveStackable;
    }


    /**
     * Gets the creditCard value for this SalesOrder.
     * 
     * @return creditCard
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this SalesOrder.
     * 
     * @param creditCard
     */
    public void setCreditCard(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the revenueStatus value for this SalesOrder.
     * 
     * @return revenueStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this SalesOrder.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the recognizedRevenue value for this SalesOrder.
     * 
     * @return recognizedRevenue
     */
    public java.lang.Double getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this SalesOrder.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(java.lang.Double recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the deferredRevenue value for this SalesOrder.
     * 
     * @return deferredRevenue
     */
    public java.lang.Double getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this SalesOrder.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(java.lang.Double deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }


    /**
     * Gets the revRecOnRevCommitment value for this SalesOrder.
     * 
     * @return revRecOnRevCommitment
     */
    public java.lang.Boolean getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this SalesOrder.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(java.lang.Boolean revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the revCommitStatus value for this SalesOrder.
     * 
     * @return revCommitStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this SalesOrder.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(com.netsuite.webservices.platform.common_2019_1.types.RevenueCommitStatus revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }


    /**
     * Gets the ccNumber value for this SalesOrder.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this SalesOrder.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccExpireDate value for this SalesOrder.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this SalesOrder.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this SalesOrder.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this SalesOrder.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccStreet value for this SalesOrder.
     * 
     * @return ccStreet
     */
    public java.lang.String getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this SalesOrder.
     * 
     * @param ccStreet
     */
    public void setCcStreet(java.lang.String ccStreet) {
        this.ccStreet = ccStreet;
    }


    /**
     * Gets the ccZipCode value for this SalesOrder.
     * 
     * @return ccZipCode
     */
    public java.lang.String getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this SalesOrder.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(java.lang.String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }


    /**
     * Gets the payPalStatus value for this SalesOrder.
     * 
     * @return payPalStatus
     */
    public java.lang.String getPayPalStatus() {
        return payPalStatus;
    }


    /**
     * Sets the payPalStatus value for this SalesOrder.
     * 
     * @param payPalStatus
     */
    public void setPayPalStatus(java.lang.String payPalStatus) {
        this.payPalStatus = payPalStatus;
    }


    /**
     * Gets the creditCardProcessor value for this SalesOrder.
     * 
     * @return creditCardProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }


    /**
     * Sets the creditCardProcessor value for this SalesOrder.
     * 
     * @param creditCardProcessor
     */
    public void setCreditCardProcessor(com.netsuite.webservices.platform.core_2019_1.RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }


    /**
     * Gets the payPalTranId value for this SalesOrder.
     * 
     * @return payPalTranId
     */
    public java.lang.String getPayPalTranId() {
        return payPalTranId;
    }


    /**
     * Sets the payPalTranId value for this SalesOrder.
     * 
     * @param payPalTranId
     */
    public void setPayPalTranId(java.lang.String payPalTranId) {
        this.payPalTranId = payPalTranId;
    }


    /**
     * Gets the ccApproved value for this SalesOrder.
     * 
     * @return ccApproved
     */
    public java.lang.Boolean getCcApproved() {
        return ccApproved;
    }


    /**
     * Sets the ccApproved value for this SalesOrder.
     * 
     * @param ccApproved
     */
    public void setCcApproved(java.lang.Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }


    /**
     * Gets the getAuth value for this SalesOrder.
     * 
     * @return getAuth
     */
    public java.lang.Boolean getGetAuth() {
        return getAuth;
    }


    /**
     * Sets the getAuth value for this SalesOrder.
     * 
     * @param getAuth
     */
    public void setGetAuth(java.lang.Boolean getAuth) {
        this.getAuth = getAuth;
    }


    /**
     * Gets the authCode value for this SalesOrder.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this SalesOrder.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the ccAvsStreetMatch value for this SalesOrder.
     * 
     * @return ccAvsStreetMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcAvsStreetMatch() {
        return ccAvsStreetMatch;
    }


    /**
     * Sets the ccAvsStreetMatch value for this SalesOrder.
     * 
     * @param ccAvsStreetMatch
     */
    public void setCcAvsStreetMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsStreetMatch) {
        this.ccAvsStreetMatch = ccAvsStreetMatch;
    }


    /**
     * Gets the ccAvsZipMatch value for this SalesOrder.
     * 
     * @return ccAvsZipMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcAvsZipMatch() {
        return ccAvsZipMatch;
    }


    /**
     * Sets the ccAvsZipMatch value for this SalesOrder.
     * 
     * @param ccAvsZipMatch
     */
    public void setCcAvsZipMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccAvsZipMatch) {
        this.ccAvsZipMatch = ccAvsZipMatch;
    }


    /**
     * Gets the isRecurringPayment value for this SalesOrder.
     * 
     * @return isRecurringPayment
     */
    public java.lang.Boolean getIsRecurringPayment() {
        return isRecurringPayment;
    }


    /**
     * Sets the isRecurringPayment value for this SalesOrder.
     * 
     * @param isRecurringPayment
     */
    public void setIsRecurringPayment(java.lang.Boolean isRecurringPayment) {
        this.isRecurringPayment = isRecurringPayment;
    }


    /**
     * Gets the ccSecurityCodeMatch value for this SalesOrder.
     * 
     * @return ccSecurityCodeMatch
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode getCcSecurityCodeMatch() {
        return ccSecurityCodeMatch;
    }


    /**
     * Sets the ccSecurityCodeMatch value for this SalesOrder.
     * 
     * @param ccSecurityCodeMatch
     */
    public void setCcSecurityCodeMatch(com.netsuite.webservices.platform.common_2019_1.types.AvsMatchCode ccSecurityCodeMatch) {
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
    }


    /**
     * Gets the altSalesTotal value for this SalesOrder.
     * 
     * @return altSalesTotal
     */
    public java.lang.Double getAltSalesTotal() {
        return altSalesTotal;
    }


    /**
     * Sets the altSalesTotal value for this SalesOrder.
     * 
     * @param altSalesTotal
     */
    public void setAltSalesTotal(java.lang.Double altSalesTotal) {
        this.altSalesTotal = altSalesTotal;
    }


    /**
     * Gets the ignoreAvs value for this SalesOrder.
     * 
     * @return ignoreAvs
     */
    public java.lang.Boolean getIgnoreAvs() {
        return ignoreAvs;
    }


    /**
     * Sets the ignoreAvs value for this SalesOrder.
     * 
     * @param ignoreAvs
     */
    public void setIgnoreAvs(java.lang.Boolean ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }


    /**
     * Gets the paymentEventResult value for this SalesOrder.
     * 
     * @return paymentEventResult
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventResult getPaymentEventResult() {
        return paymentEventResult;
    }


    /**
     * Sets the paymentEventResult value for this SalesOrder.
     * 
     * @param paymentEventResult
     */
    public void setPaymentEventResult(com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventResult paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }


    /**
     * Gets the paymentEventHoldReason value for this SalesOrder.
     * 
     * @return paymentEventHoldReason
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventHoldReason getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }


    /**
     * Sets the paymentEventHoldReason value for this SalesOrder.
     * 
     * @param paymentEventHoldReason
     */
    public void setPaymentEventHoldReason(com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventHoldReason paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }


    /**
     * Gets the paymentEventType value for this SalesOrder.
     * 
     * @return paymentEventType
     */
    public com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventType getPaymentEventType() {
        return paymentEventType;
    }


    /**
     * Sets the paymentEventType value for this SalesOrder.
     * 
     * @param paymentEventType
     */
    public void setPaymentEventType(com.netsuite.webservices.transactions.sales_2019_1.types.TransactionPaymentEventType paymentEventType) {
        this.paymentEventType = paymentEventType;
    }


    /**
     * Gets the paymentEventDate value for this SalesOrder.
     * 
     * @return paymentEventDate
     */
    public java.util.Calendar getPaymentEventDate() {
        return paymentEventDate;
    }


    /**
     * Sets the paymentEventDate value for this SalesOrder.
     * 
     * @param paymentEventDate
     */
    public void setPaymentEventDate(java.util.Calendar paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }


    /**
     * Gets the paymentEventUpdatedBy value for this SalesOrder.
     * 
     * @return paymentEventUpdatedBy
     */
    public java.lang.String getPaymentEventUpdatedBy() {
        return paymentEventUpdatedBy;
    }


    /**
     * Sets the paymentEventUpdatedBy value for this SalesOrder.
     * 
     * @param paymentEventUpdatedBy
     */
    public void setPaymentEventUpdatedBy(java.lang.String paymentEventUpdatedBy) {
        this.paymentEventUpdatedBy = paymentEventUpdatedBy;
    }


    /**
     * Gets the subTotal value for this SalesOrder.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this SalesOrder.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the discountTotal value for this SalesOrder.
     * 
     * @return discountTotal
     */
    public java.lang.Double getDiscountTotal() {
        return discountTotal;
    }


    /**
     * Sets the discountTotal value for this SalesOrder.
     * 
     * @param discountTotal
     */
    public void setDiscountTotal(java.lang.Double discountTotal) {
        this.discountTotal = discountTotal;
    }


    /**
     * Gets the taxTotal value for this SalesOrder.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this SalesOrder.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the altShippingCost value for this SalesOrder.
     * 
     * @return altShippingCost
     */
    public java.lang.Double getAltShippingCost() {
        return altShippingCost;
    }


    /**
     * Sets the altShippingCost value for this SalesOrder.
     * 
     * @param altShippingCost
     */
    public void setAltShippingCost(java.lang.Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }


    /**
     * Gets the altHandlingCost value for this SalesOrder.
     * 
     * @return altHandlingCost
     */
    public java.lang.Double getAltHandlingCost() {
        return altHandlingCost;
    }


    /**
     * Sets the altHandlingCost value for this SalesOrder.
     * 
     * @param altHandlingCost
     */
    public void setAltHandlingCost(java.lang.Double altHandlingCost) {
        this.altHandlingCost = altHandlingCost;
    }


    /**
     * Gets the total value for this SalesOrder.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this SalesOrder.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the revRecSchedule value for this SalesOrder.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this SalesOrder.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the revRecStartDate value for this SalesOrder.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this SalesOrder.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecEndDate value for this SalesOrder.
     * 
     * @return revRecEndDate
     */
    public java.util.Calendar getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this SalesOrder.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(java.util.Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the paypalAuthId value for this SalesOrder.
     * 
     * @return paypalAuthId
     */
    public java.lang.String getPaypalAuthId() {
        return paypalAuthId;
    }


    /**
     * Sets the paypalAuthId value for this SalesOrder.
     * 
     * @param paypalAuthId
     */
    public void setPaypalAuthId(java.lang.String paypalAuthId) {
        this.paypalAuthId = paypalAuthId;
    }


    /**
     * Gets the balance value for this SalesOrder.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this SalesOrder.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the paypalProcess value for this SalesOrder.
     * 
     * @return paypalProcess
     */
    public java.lang.Boolean getPaypalProcess() {
        return paypalProcess;
    }


    /**
     * Sets the paypalProcess value for this SalesOrder.
     * 
     * @param paypalProcess
     */
    public void setPaypalProcess(java.lang.Boolean paypalProcess) {
        this.paypalProcess = paypalProcess;
    }


    /**
     * Gets the billingSchedule value for this SalesOrder.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this SalesOrder.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the ccSecurityCode value for this SalesOrder.
     * 
     * @return ccSecurityCode
     */
    public java.lang.String getCcSecurityCode() {
        return ccSecurityCode;
    }


    /**
     * Sets the ccSecurityCode value for this SalesOrder.
     * 
     * @param ccSecurityCode
     */
    public void setCcSecurityCode(java.lang.String ccSecurityCode) {
        this.ccSecurityCode = ccSecurityCode;
    }


    /**
     * Gets the threeDStatusCode value for this SalesOrder.
     * 
     * @return threeDStatusCode
     */
    public java.lang.String getThreeDStatusCode() {
        return threeDStatusCode;
    }


    /**
     * Sets the threeDStatusCode value for this SalesOrder.
     * 
     * @param threeDStatusCode
     */
    public void setThreeDStatusCode(java.lang.String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
    }


    /**
     * Gets the _class value for this SalesOrder.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this SalesOrder.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this SalesOrder.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this SalesOrder.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the subsidiary value for this SalesOrder.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this SalesOrder.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the intercoTransaction value for this SalesOrder.
     * 
     * @return intercoTransaction
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getIntercoTransaction() {
        return intercoTransaction;
    }


    /**
     * Sets the intercoTransaction value for this SalesOrder.
     * 
     * @param intercoTransaction
     */
    public void setIntercoTransaction(com.netsuite.webservices.platform.core_2019_1.RecordRef intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }


    /**
     * Gets the intercoStatus value for this SalesOrder.
     * 
     * @return intercoStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus getIntercoStatus() {
        return intercoStatus;
    }


    /**
     * Sets the intercoStatus value for this SalesOrder.
     * 
     * @param intercoStatus
     */
    public void setIntercoStatus(com.netsuite.webservices.platform.common_2019_1.types.IntercoStatus intercoStatus) {
        this.intercoStatus = intercoStatus;
    }


    /**
     * Gets the debitCardIssueNo value for this SalesOrder.
     * 
     * @return debitCardIssueNo
     */
    public java.lang.String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }


    /**
     * Sets the debitCardIssueNo value for this SalesOrder.
     * 
     * @param debitCardIssueNo
     */
    public void setDebitCardIssueNo(java.lang.String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }


    /**
     * Gets the lastModifiedDate value for this SalesOrder.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SalesOrder.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nexus value for this SalesOrder.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this SalesOrder.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the subsidiaryTaxRegNum value for this SalesOrder.
     * 
     * @return subsidiaryTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }


    /**
     * Sets the subsidiaryTaxRegNum value for this SalesOrder.
     * 
     * @param subsidiaryTaxRegNum
     */
    public void setSubsidiaryTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this SalesOrder.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this SalesOrder.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the taxPointDate value for this SalesOrder.
     * 
     * @return taxPointDate
     */
    public java.util.Calendar getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this SalesOrder.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(java.util.Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }


    /**
     * Gets the taxDetailsOverride value for this SalesOrder.
     * 
     * @return taxDetailsOverride
     */
    public java.lang.Boolean getTaxDetailsOverride() {
        return taxDetailsOverride;
    }


    /**
     * Sets the taxDetailsOverride value for this SalesOrder.
     * 
     * @param taxDetailsOverride
     */
    public void setTaxDetailsOverride(java.lang.Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }


    /**
     * Gets the location value for this SalesOrder.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this SalesOrder.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the pnRefNum value for this SalesOrder.
     * 
     * @return pnRefNum
     */
    public java.lang.String getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this SalesOrder.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(java.lang.String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the status value for this SalesOrder.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SalesOrder.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the tax2Total value for this SalesOrder.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this SalesOrder.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the terms value for this SalesOrder.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this SalesOrder.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the validFrom value for this SalesOrder.
     * 
     * @return validFrom
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this SalesOrder.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the vatRegNum value for this SalesOrder.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this SalesOrder.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the giftCertApplied value for this SalesOrder.
     * 
     * @return giftCertApplied
     */
    public java.lang.Double getGiftCertApplied() {
        return giftCertApplied;
    }


    /**
     * Sets the giftCertApplied value for this SalesOrder.
     * 
     * @param giftCertApplied
     */
    public void setGiftCertApplied(java.lang.Double giftCertApplied) {
        this.giftCertApplied = giftCertApplied;
    }


    /**
     * Gets the oneTime value for this SalesOrder.
     * 
     * @return oneTime
     */
    public java.lang.Double getOneTime() {
        return oneTime;
    }


    /**
     * Sets the oneTime value for this SalesOrder.
     * 
     * @param oneTime
     */
    public void setOneTime(java.lang.Double oneTime) {
        this.oneTime = oneTime;
    }


    /**
     * Gets the recurWeekly value for this SalesOrder.
     * 
     * @return recurWeekly
     */
    public java.lang.Double getRecurWeekly() {
        return recurWeekly;
    }


    /**
     * Sets the recurWeekly value for this SalesOrder.
     * 
     * @param recurWeekly
     */
    public void setRecurWeekly(java.lang.Double recurWeekly) {
        this.recurWeekly = recurWeekly;
    }


    /**
     * Gets the recurMonthly value for this SalesOrder.
     * 
     * @return recurMonthly
     */
    public java.lang.Double getRecurMonthly() {
        return recurMonthly;
    }


    /**
     * Sets the recurMonthly value for this SalesOrder.
     * 
     * @param recurMonthly
     */
    public void setRecurMonthly(java.lang.Double recurMonthly) {
        this.recurMonthly = recurMonthly;
    }


    /**
     * Gets the recurQuarterly value for this SalesOrder.
     * 
     * @return recurQuarterly
     */
    public java.lang.Double getRecurQuarterly() {
        return recurQuarterly;
    }


    /**
     * Sets the recurQuarterly value for this SalesOrder.
     * 
     * @param recurQuarterly
     */
    public void setRecurQuarterly(java.lang.Double recurQuarterly) {
        this.recurQuarterly = recurQuarterly;
    }


    /**
     * Gets the recurAnnually value for this SalesOrder.
     * 
     * @return recurAnnually
     */
    public java.lang.Double getRecurAnnually() {
        return recurAnnually;
    }


    /**
     * Sets the recurAnnually value for this SalesOrder.
     * 
     * @param recurAnnually
     */
    public void setRecurAnnually(java.lang.Double recurAnnually) {
        this.recurAnnually = recurAnnually;
    }


    /**
     * Gets the tranIsVsoeBundle value for this SalesOrder.
     * 
     * @return tranIsVsoeBundle
     */
    public java.lang.Boolean getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this SalesOrder.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(java.lang.Boolean tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the vsoeAutoCalc value for this SalesOrder.
     * 
     * @return vsoeAutoCalc
     */
    public java.lang.Boolean getVsoeAutoCalc() {
        return vsoeAutoCalc;
    }


    /**
     * Sets the vsoeAutoCalc value for this SalesOrder.
     * 
     * @param vsoeAutoCalc
     */
    public void setVsoeAutoCalc(java.lang.Boolean vsoeAutoCalc) {
        this.vsoeAutoCalc = vsoeAutoCalc;
    }


    /**
     * Gets the syncPartnerTeams value for this SalesOrder.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this SalesOrder.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the salesTeamList value for this SalesOrder.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.SalesOrderSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this SalesOrder.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.transactions.sales_2019_1.SalesOrderSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the partnersList value for this SalesOrder.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.SalesOrderPartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this SalesOrder.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.transactions.sales_2019_1.SalesOrderPartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the giftCertRedemptionList value for this SalesOrder.
     * 
     * @return giftCertRedemptionList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList getGiftCertRedemptionList() {
        return giftCertRedemptionList;
    }


    /**
     * Sets the giftCertRedemptionList value for this SalesOrder.
     * 
     * @param giftCertRedemptionList
     */
    public void setGiftCertRedemptionList(com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList giftCertRedemptionList) {
        this.giftCertRedemptionList = giftCertRedemptionList;
    }


    /**
     * Gets the promotionsList value for this SalesOrder.
     * 
     * @return promotionsList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.PromotionsList getPromotionsList() {
        return promotionsList;
    }


    /**
     * Sets the promotionsList value for this SalesOrder.
     * 
     * @param promotionsList
     */
    public void setPromotionsList(com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList) {
        this.promotionsList = promotionsList;
    }


    /**
     * Gets the itemList value for this SalesOrder.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this SalesOrder.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the shipGroupList value for this SalesOrder.
     * 
     * @return shipGroupList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.SalesOrderShipGroupList getShipGroupList() {
        return shipGroupList;
    }


    /**
     * Sets the shipGroupList value for this SalesOrder.
     * 
     * @param shipGroupList
     */
    public void setShipGroupList(com.netsuite.webservices.transactions.sales_2019_1.SalesOrderShipGroupList shipGroupList) {
        this.shipGroupList = shipGroupList;
    }


    /**
     * Gets the accountingBookDetailList value for this SalesOrder.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this SalesOrder.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the taxDetailsList value for this SalesOrder.
     * 
     * @return taxDetailsList
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }


    /**
     * Sets the taxDetailsList value for this SalesOrder.
     * 
     * @param taxDetailsList
     */
    public void setTaxDetailsList(com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
    }


    /**
     * Gets the customFieldList value for this SalesOrder.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SalesOrder.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this SalesOrder.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SalesOrder.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this SalesOrder.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SalesOrder.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesOrder)) return false;
        SalesOrder other = (SalesOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              this.drAccount.equals(other.getDrAccount()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              this.fxAccount.equals(other.getFxAccount()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.entityTaxRegNum==null && other.getEntityTaxRegNum()==null) || 
             (this.entityTaxRegNum!=null &&
              this.entityTaxRegNum.equals(other.getEntityTaxRegNum()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.nextBill==null && other.getNextBill()==null) || 
             (this.nextBill!=null &&
              this.nextBill.equals(other.getNextBill()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.syncSalesTeams==null && other.getSyncSalesTeams()==null) || 
             (this.syncSalesTeams!=null &&
              this.syncSalesTeams.equals(other.getSyncSalesTeams()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              this.salesEffectiveDate.equals(other.getSalesEffectiveDate()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              this.excludeCommission.equals(other.getExcludeCommission()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              this.totalCostEstimate.equals(other.getTotalCostEstimate()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.discountItem==null && other.getDiscountItem()==null) || 
             (this.discountItem!=null &&
              this.discountItem.equals(other.getDiscountItem()))) &&
            ((this.discountRate==null && other.getDiscountRate()==null) || 
             (this.discountRate!=null &&
              this.discountRate.equals(other.getDiscountRate()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              this.toBeEmailed.equals(other.getToBeEmailed()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.toBeFaxed==null && other.getToBeFaxed()==null) || 
             (this.toBeFaxed!=null &&
              this.toBeFaxed.equals(other.getToBeFaxed()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.messageSel==null && other.getMessageSel()==null) || 
             (this.messageSel!=null &&
              this.messageSel.equals(other.getMessageSel()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.paymentOption==null && other.getPaymentOption()==null) || 
             (this.paymentOption!=null &&
              this.paymentOption.equals(other.getPaymentOption()))) &&
            ((this.inputAuthCode==null && other.getInputAuthCode()==null) || 
             (this.inputAuthCode!=null &&
              this.inputAuthCode.equals(other.getInputAuthCode()))) &&
            ((this.inputReferenceCode==null && other.getInputReferenceCode()==null) || 
             (this.inputReferenceCode!=null &&
              this.inputReferenceCode.equals(other.getInputReferenceCode()))) &&
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.paymentCardCsc==null && other.getPaymentCardCsc()==null) || 
             (this.paymentCardCsc!=null &&
              this.paymentCardCsc.equals(other.getPaymentCardCsc()))) &&
            ((this.paymentProcessingProfile==null && other.getPaymentProcessingProfile()==null) || 
             (this.paymentProcessingProfile!=null &&
              this.paymentProcessingProfile.equals(other.getPaymentProcessingProfile()))) &&
            ((this.handlingMode==null && other.getHandlingMode()==null) || 
             (this.handlingMode!=null &&
              this.handlingMode.equals(other.getHandlingMode()))) &&
            ((this.outputAuthCode==null && other.getOutputAuthCode()==null) || 
             (this.outputAuthCode!=null &&
              this.outputAuthCode.equals(other.getOutputAuthCode()))) &&
            ((this.outputReferenceCode==null && other.getOutputReferenceCode()==null) || 
             (this.outputReferenceCode!=null &&
              this.outputReferenceCode.equals(other.getOutputReferenceCode()))) &&
            ((this.paymentOperation==null && other.getPaymentOperation()==null) || 
             (this.paymentOperation!=null &&
              this.paymentOperation.equals(other.getPaymentOperation()))) &&
            ((this.dynamicDescriptor==null && other.getDynamicDescriptor()==null) || 
             (this.dynamicDescriptor!=null &&
              this.dynamicDescriptor.equals(other.getDynamicDescriptor()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.billAddressList==null && other.getBillAddressList()==null) || 
             (this.billAddressList!=null &&
              this.billAddressList.equals(other.getBillAddressList()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            ((this.shipIsResidential==null && other.getShipIsResidential()==null) || 
             (this.shipIsResidential!=null &&
              this.shipIsResidential.equals(other.getShipIsResidential()))) &&
            ((this.shipAddressList==null && other.getShipAddressList()==null) || 
             (this.shipAddressList!=null &&
              this.shipAddressList.equals(other.getShipAddressList()))) &&
            ((this.fob==null && other.getFob()==null) || 
             (this.fob!=null &&
              this.fob.equals(other.getFob()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.actualShipDate==null && other.getActualShipDate()==null) || 
             (this.actualShipDate!=null &&
              this.actualShipDate.equals(other.getActualShipDate()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.shippingTax1Rate==null && other.getShippingTax1Rate()==null) || 
             (this.shippingTax1Rate!=null &&
              this.shippingTax1Rate.equals(other.getShippingTax1Rate()))) &&
            ((this.isMultiShipTo==null && other.getIsMultiShipTo()==null) || 
             (this.isMultiShipTo!=null &&
              this.isMultiShipTo.equals(other.getIsMultiShipTo()))) &&
            ((this.shippingTax2Rate==null && other.getShippingTax2Rate()==null) || 
             (this.shippingTax2Rate!=null &&
              this.shippingTax2Rate.equals(other.getShippingTax2Rate()))) &&
            ((this.shippingTaxCode==null && other.getShippingTaxCode()==null) || 
             (this.shippingTaxCode!=null &&
              this.shippingTaxCode.equals(other.getShippingTaxCode()))) &&
            ((this.handlingTaxCode==null && other.getHandlingTaxCode()==null) || 
             (this.handlingTaxCode!=null &&
              this.handlingTaxCode.equals(other.getHandlingTaxCode()))) &&
            ((this.handlingTax1Rate==null && other.getHandlingTax1Rate()==null) || 
             (this.handlingTax1Rate!=null &&
              this.handlingTax1Rate.equals(other.getHandlingTax1Rate()))) &&
            ((this.handlingTax2Rate==null && other.getHandlingTax2Rate()==null) || 
             (this.handlingTax2Rate!=null &&
              this.handlingTax2Rate.equals(other.getHandlingTax2Rate()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.linkedTrackingNumbers==null && other.getLinkedTrackingNumbers()==null) || 
             (this.linkedTrackingNumbers!=null &&
              this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.shopperIpAddress==null && other.getShopperIpAddress()==null) || 
             (this.shopperIpAddress!=null &&
              this.shopperIpAddress.equals(other.getShopperIpAddress()))) &&
            ((this.saveOnAuthDecline==null && other.getSaveOnAuthDecline()==null) || 
             (this.saveOnAuthDecline!=null &&
              this.saveOnAuthDecline.equals(other.getSaveOnAuthDecline()))) &&
            ((this.canHaveStackable==null && other.getCanHaveStackable()==null) || 
             (this.canHaveStackable!=null &&
              this.canHaveStackable.equals(other.getCanHaveStackable()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              this.revenueStatus.equals(other.getRevenueStatus()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              this.recognizedRevenue.equals(other.getRecognizedRevenue()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              this.deferredRevenue.equals(other.getDeferredRevenue()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              this.revCommitStatus.equals(other.getRevCommitStatus()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              this.ccStreet.equals(other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              this.ccZipCode.equals(other.getCcZipCode()))) &&
            ((this.payPalStatus==null && other.getPayPalStatus()==null) || 
             (this.payPalStatus!=null &&
              this.payPalStatus.equals(other.getPayPalStatus()))) &&
            ((this.creditCardProcessor==null && other.getCreditCardProcessor()==null) || 
             (this.creditCardProcessor!=null &&
              this.creditCardProcessor.equals(other.getCreditCardProcessor()))) &&
            ((this.payPalTranId==null && other.getPayPalTranId()==null) || 
             (this.payPalTranId!=null &&
              this.payPalTranId.equals(other.getPayPalTranId()))) &&
            ((this.ccApproved==null && other.getCcApproved()==null) || 
             (this.ccApproved!=null &&
              this.ccApproved.equals(other.getCcApproved()))) &&
            ((this.getAuth==null && other.getGetAuth()==null) || 
             (this.getAuth!=null &&
              this.getAuth.equals(other.getGetAuth()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.ccAvsStreetMatch==null && other.getCcAvsStreetMatch()==null) || 
             (this.ccAvsStreetMatch!=null &&
              this.ccAvsStreetMatch.equals(other.getCcAvsStreetMatch()))) &&
            ((this.ccAvsZipMatch==null && other.getCcAvsZipMatch()==null) || 
             (this.ccAvsZipMatch!=null &&
              this.ccAvsZipMatch.equals(other.getCcAvsZipMatch()))) &&
            ((this.isRecurringPayment==null && other.getIsRecurringPayment()==null) || 
             (this.isRecurringPayment!=null &&
              this.isRecurringPayment.equals(other.getIsRecurringPayment()))) &&
            ((this.ccSecurityCodeMatch==null && other.getCcSecurityCodeMatch()==null) || 
             (this.ccSecurityCodeMatch!=null &&
              this.ccSecurityCodeMatch.equals(other.getCcSecurityCodeMatch()))) &&
            ((this.altSalesTotal==null && other.getAltSalesTotal()==null) || 
             (this.altSalesTotal!=null &&
              this.altSalesTotal.equals(other.getAltSalesTotal()))) &&
            ((this.ignoreAvs==null && other.getIgnoreAvs()==null) || 
             (this.ignoreAvs!=null &&
              this.ignoreAvs.equals(other.getIgnoreAvs()))) &&
            ((this.paymentEventResult==null && other.getPaymentEventResult()==null) || 
             (this.paymentEventResult!=null &&
              this.paymentEventResult.equals(other.getPaymentEventResult()))) &&
            ((this.paymentEventHoldReason==null && other.getPaymentEventHoldReason()==null) || 
             (this.paymentEventHoldReason!=null &&
              this.paymentEventHoldReason.equals(other.getPaymentEventHoldReason()))) &&
            ((this.paymentEventType==null && other.getPaymentEventType()==null) || 
             (this.paymentEventType!=null &&
              this.paymentEventType.equals(other.getPaymentEventType()))) &&
            ((this.paymentEventDate==null && other.getPaymentEventDate()==null) || 
             (this.paymentEventDate!=null &&
              this.paymentEventDate.equals(other.getPaymentEventDate()))) &&
            ((this.paymentEventUpdatedBy==null && other.getPaymentEventUpdatedBy()==null) || 
             (this.paymentEventUpdatedBy!=null &&
              this.paymentEventUpdatedBy.equals(other.getPaymentEventUpdatedBy()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.discountTotal==null && other.getDiscountTotal()==null) || 
             (this.discountTotal!=null &&
              this.discountTotal.equals(other.getDiscountTotal()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.altShippingCost==null && other.getAltShippingCost()==null) || 
             (this.altShippingCost!=null &&
              this.altShippingCost.equals(other.getAltShippingCost()))) &&
            ((this.altHandlingCost==null && other.getAltHandlingCost()==null) || 
             (this.altHandlingCost!=null &&
              this.altHandlingCost.equals(other.getAltHandlingCost()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.paypalAuthId==null && other.getPaypalAuthId()==null) || 
             (this.paypalAuthId!=null &&
              this.paypalAuthId.equals(other.getPaypalAuthId()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.paypalProcess==null && other.getPaypalProcess()==null) || 
             (this.paypalProcess!=null &&
              this.paypalProcess.equals(other.getPaypalProcess()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.ccSecurityCode==null && other.getCcSecurityCode()==null) || 
             (this.ccSecurityCode!=null &&
              this.ccSecurityCode.equals(other.getCcSecurityCode()))) &&
            ((this.threeDStatusCode==null && other.getThreeDStatusCode()==null) || 
             (this.threeDStatusCode!=null &&
              this.threeDStatusCode.equals(other.getThreeDStatusCode()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.intercoTransaction==null && other.getIntercoTransaction()==null) || 
             (this.intercoTransaction!=null &&
              this.intercoTransaction.equals(other.getIntercoTransaction()))) &&
            ((this.intercoStatus==null && other.getIntercoStatus()==null) || 
             (this.intercoStatus!=null &&
              this.intercoStatus.equals(other.getIntercoStatus()))) &&
            ((this.debitCardIssueNo==null && other.getDebitCardIssueNo()==null) || 
             (this.debitCardIssueNo!=null &&
              this.debitCardIssueNo.equals(other.getDebitCardIssueNo()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.nexus==null && other.getNexus()==null) || 
             (this.nexus!=null &&
              this.nexus.equals(other.getNexus()))) &&
            ((this.subsidiaryTaxRegNum==null && other.getSubsidiaryTaxRegNum()==null) || 
             (this.subsidiaryTaxRegNum!=null &&
              this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum()))) &&
            ((this.taxRegOverride==null && other.getTaxRegOverride()==null) || 
             (this.taxRegOverride!=null &&
              this.taxRegOverride.equals(other.getTaxRegOverride()))) &&
            ((this.taxPointDate==null && other.getTaxPointDate()==null) || 
             (this.taxPointDate!=null &&
              this.taxPointDate.equals(other.getTaxPointDate()))) &&
            ((this.taxDetailsOverride==null && other.getTaxDetailsOverride()==null) || 
             (this.taxDetailsOverride!=null &&
              this.taxDetailsOverride.equals(other.getTaxDetailsOverride()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
            ((this.giftCertApplied==null && other.getGiftCertApplied()==null) || 
             (this.giftCertApplied!=null &&
              this.giftCertApplied.equals(other.getGiftCertApplied()))) &&
            ((this.oneTime==null && other.getOneTime()==null) || 
             (this.oneTime!=null &&
              this.oneTime.equals(other.getOneTime()))) &&
            ((this.recurWeekly==null && other.getRecurWeekly()==null) || 
             (this.recurWeekly!=null &&
              this.recurWeekly.equals(other.getRecurWeekly()))) &&
            ((this.recurMonthly==null && other.getRecurMonthly()==null) || 
             (this.recurMonthly!=null &&
              this.recurMonthly.equals(other.getRecurMonthly()))) &&
            ((this.recurQuarterly==null && other.getRecurQuarterly()==null) || 
             (this.recurQuarterly!=null &&
              this.recurQuarterly.equals(other.getRecurQuarterly()))) &&
            ((this.recurAnnually==null && other.getRecurAnnually()==null) || 
             (this.recurAnnually!=null &&
              this.recurAnnually.equals(other.getRecurAnnually()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.vsoeAutoCalc==null && other.getVsoeAutoCalc()==null) || 
             (this.vsoeAutoCalc!=null &&
              this.vsoeAutoCalc.equals(other.getVsoeAutoCalc()))) &&
            ((this.syncPartnerTeams==null && other.getSyncPartnerTeams()==null) || 
             (this.syncPartnerTeams!=null &&
              this.syncPartnerTeams.equals(other.getSyncPartnerTeams()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              this.salesTeamList.equals(other.getSalesTeamList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
            ((this.giftCertRedemptionList==null && other.getGiftCertRedemptionList()==null) || 
             (this.giftCertRedemptionList!=null &&
              this.giftCertRedemptionList.equals(other.getGiftCertRedemptionList()))) &&
            ((this.promotionsList==null && other.getPromotionsList()==null) || 
             (this.promotionsList!=null &&
              this.promotionsList.equals(other.getPromotionsList()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.shipGroupList==null && other.getShipGroupList()==null) || 
             (this.shipGroupList!=null &&
              this.shipGroupList.equals(other.getShipGroupList()))) &&
            ((this.accountingBookDetailList==null && other.getAccountingBookDetailList()==null) || 
             (this.accountingBookDetailList!=null &&
              this.accountingBookDetailList.equals(other.getAccountingBookDetailList()))) &&
            ((this.taxDetailsList==null && other.getTaxDetailsList()==null) || 
             (this.taxDetailsList!=null &&
              this.taxDetailsList.equals(other.getTaxDetailsList()))) &&
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDrAccount() != null) {
            _hashCode += getDrAccount().hashCode();
        }
        if (getFxAccount() != null) {
            _hashCode += getFxAccount().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getEntityTaxRegNum() != null) {
            _hashCode += getEntityTaxRegNum().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getNextBill() != null) {
            _hashCode += getNextBill().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getContribPct() != null) {
            _hashCode += getContribPct().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSyncSalesTeams() != null) {
            _hashCode += getSyncSalesTeams().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getSalesEffectiveDate() != null) {
            _hashCode += getSalesEffectiveDate().hashCode();
        }
        if (getExcludeCommission() != null) {
            _hashCode += getExcludeCommission().hashCode();
        }
        if (getTotalCostEstimate() != null) {
            _hashCode += getTotalCostEstimate().hashCode();
        }
        if (getEstGrossProfit() != null) {
            _hashCode += getEstGrossProfit().hashCode();
        }
        if (getEstGrossProfitPercent() != null) {
            _hashCode += getEstGrossProfitPercent().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getDiscountItem() != null) {
            _hashCode += getDiscountItem().hashCode();
        }
        if (getDiscountRate() != null) {
            _hashCode += getDiscountRate().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getToBeEmailed() != null) {
            _hashCode += getToBeEmailed().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getToBeFaxed() != null) {
            _hashCode += getToBeFaxed().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getMessageSel() != null) {
            _hashCode += getMessageSel().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPaymentOption() != null) {
            _hashCode += getPaymentOption().hashCode();
        }
        if (getInputAuthCode() != null) {
            _hashCode += getInputAuthCode().hashCode();
        }
        if (getInputReferenceCode() != null) {
            _hashCode += getInputReferenceCode().hashCode();
        }
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getPaymentCardCsc() != null) {
            _hashCode += getPaymentCardCsc().hashCode();
        }
        if (getPaymentProcessingProfile() != null) {
            _hashCode += getPaymentProcessingProfile().hashCode();
        }
        if (getHandlingMode() != null) {
            _hashCode += getHandlingMode().hashCode();
        }
        if (getOutputAuthCode() != null) {
            _hashCode += getOutputAuthCode().hashCode();
        }
        if (getOutputReferenceCode() != null) {
            _hashCode += getOutputReferenceCode().hashCode();
        }
        if (getPaymentOperation() != null) {
            _hashCode += getPaymentOperation().hashCode();
        }
        if (getDynamicDescriptor() != null) {
            _hashCode += getDynamicDescriptor().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getBillAddressList() != null) {
            _hashCode += getBillAddressList().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        if (getShipIsResidential() != null) {
            _hashCode += getShipIsResidential().hashCode();
        }
        if (getShipAddressList() != null) {
            _hashCode += getShipAddressList().hashCode();
        }
        if (getFob() != null) {
            _hashCode += getFob().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getActualShipDate() != null) {
            _hashCode += getActualShipDate().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getShippingTax1Rate() != null) {
            _hashCode += getShippingTax1Rate().hashCode();
        }
        if (getIsMultiShipTo() != null) {
            _hashCode += getIsMultiShipTo().hashCode();
        }
        if (getShippingTax2Rate() != null) {
            _hashCode += getShippingTax2Rate().hashCode();
        }
        if (getShippingTaxCode() != null) {
            _hashCode += getShippingTaxCode().hashCode();
        }
        if (getHandlingTaxCode() != null) {
            _hashCode += getHandlingTaxCode().hashCode();
        }
        if (getHandlingTax1Rate() != null) {
            _hashCode += getHandlingTax1Rate().hashCode();
        }
        if (getHandlingTax2Rate() != null) {
            _hashCode += getHandlingTax2Rate().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getLinkedTrackingNumbers() != null) {
            _hashCode += getLinkedTrackingNumbers().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getShopperIpAddress() != null) {
            _hashCode += getShopperIpAddress().hashCode();
        }
        if (getSaveOnAuthDecline() != null) {
            _hashCode += getSaveOnAuthDecline().hashCode();
        }
        if (getCanHaveStackable() != null) {
            _hashCode += getCanHaveStackable().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getRevenueStatus() != null) {
            _hashCode += getRevenueStatus().hashCode();
        }
        if (getRecognizedRevenue() != null) {
            _hashCode += getRecognizedRevenue().hashCode();
        }
        if (getDeferredRevenue() != null) {
            _hashCode += getDeferredRevenue().hashCode();
        }
        if (getRevRecOnRevCommitment() != null) {
            _hashCode += getRevRecOnRevCommitment().hashCode();
        }
        if (getRevCommitStatus() != null) {
            _hashCode += getRevCommitStatus().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcStreet() != null) {
            _hashCode += getCcStreet().hashCode();
        }
        if (getCcZipCode() != null) {
            _hashCode += getCcZipCode().hashCode();
        }
        if (getPayPalStatus() != null) {
            _hashCode += getPayPalStatus().hashCode();
        }
        if (getCreditCardProcessor() != null) {
            _hashCode += getCreditCardProcessor().hashCode();
        }
        if (getPayPalTranId() != null) {
            _hashCode += getPayPalTranId().hashCode();
        }
        if (getCcApproved() != null) {
            _hashCode += getCcApproved().hashCode();
        }
        if (getGetAuth() != null) {
            _hashCode += getGetAuth().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getCcAvsStreetMatch() != null) {
            _hashCode += getCcAvsStreetMatch().hashCode();
        }
        if (getCcAvsZipMatch() != null) {
            _hashCode += getCcAvsZipMatch().hashCode();
        }
        if (getIsRecurringPayment() != null) {
            _hashCode += getIsRecurringPayment().hashCode();
        }
        if (getCcSecurityCodeMatch() != null) {
            _hashCode += getCcSecurityCodeMatch().hashCode();
        }
        if (getAltSalesTotal() != null) {
            _hashCode += getAltSalesTotal().hashCode();
        }
        if (getIgnoreAvs() != null) {
            _hashCode += getIgnoreAvs().hashCode();
        }
        if (getPaymentEventResult() != null) {
            _hashCode += getPaymentEventResult().hashCode();
        }
        if (getPaymentEventHoldReason() != null) {
            _hashCode += getPaymentEventHoldReason().hashCode();
        }
        if (getPaymentEventType() != null) {
            _hashCode += getPaymentEventType().hashCode();
        }
        if (getPaymentEventDate() != null) {
            _hashCode += getPaymentEventDate().hashCode();
        }
        if (getPaymentEventUpdatedBy() != null) {
            _hashCode += getPaymentEventUpdatedBy().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getDiscountTotal() != null) {
            _hashCode += getDiscountTotal().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getAltShippingCost() != null) {
            _hashCode += getAltShippingCost().hashCode();
        }
        if (getAltHandlingCost() != null) {
            _hashCode += getAltHandlingCost().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getPaypalAuthId() != null) {
            _hashCode += getPaypalAuthId().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getPaypalProcess() != null) {
            _hashCode += getPaypalProcess().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getCcSecurityCode() != null) {
            _hashCode += getCcSecurityCode().hashCode();
        }
        if (getThreeDStatusCode() != null) {
            _hashCode += getThreeDStatusCode().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getIntercoTransaction() != null) {
            _hashCode += getIntercoTransaction().hashCode();
        }
        if (getIntercoStatus() != null) {
            _hashCode += getIntercoStatus().hashCode();
        }
        if (getDebitCardIssueNo() != null) {
            _hashCode += getDebitCardIssueNo().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getNexus() != null) {
            _hashCode += getNexus().hashCode();
        }
        if (getSubsidiaryTaxRegNum() != null) {
            _hashCode += getSubsidiaryTaxRegNum().hashCode();
        }
        if (getTaxRegOverride() != null) {
            _hashCode += getTaxRegOverride().hashCode();
        }
        if (getTaxPointDate() != null) {
            _hashCode += getTaxPointDate().hashCode();
        }
        if (getTaxDetailsOverride() != null) {
            _hashCode += getTaxDetailsOverride().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
        }
        if (getGiftCertApplied() != null) {
            _hashCode += getGiftCertApplied().hashCode();
        }
        if (getOneTime() != null) {
            _hashCode += getOneTime().hashCode();
        }
        if (getRecurWeekly() != null) {
            _hashCode += getRecurWeekly().hashCode();
        }
        if (getRecurMonthly() != null) {
            _hashCode += getRecurMonthly().hashCode();
        }
        if (getRecurQuarterly() != null) {
            _hashCode += getRecurQuarterly().hashCode();
        }
        if (getRecurAnnually() != null) {
            _hashCode += getRecurAnnually().hashCode();
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getVsoeAutoCalc() != null) {
            _hashCode += getVsoeAutoCalc().hashCode();
        }
        if (getSyncPartnerTeams() != null) {
            _hashCode += getSyncPartnerTeams().hashCode();
        }
        if (getSalesTeamList() != null) {
            _hashCode += getSalesTeamList().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
        }
        if (getGiftCertRedemptionList() != null) {
            _hashCode += getGiftCertRedemptionList().hashCode();
        }
        if (getPromotionsList() != null) {
            _hashCode += getPromotionsList().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getShipGroupList() != null) {
            _hashCode += getShipGroupList().hashCode();
        }
        if (getAccountingBookDetailList() != null) {
            _hashCode += getAccountingBookDetailList().hashCode();
        }
        if (getTaxDetailsList() != null) {
            _hashCode += getTaxDetailsList().hashCode();
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
        new org.apache.axis.description.TypeDesc(SalesOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "SalesOrder"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBill");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "nextBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "messageSel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inputAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "inputReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "checkNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCardCsc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentCardCsc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentProcessingProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentProcessingProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderHandlingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "outputAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "outputReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderPaymentOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "dynamicDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "fob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shopperIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveOnAuthDecline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "saveOnAuthDecline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canHaveStackable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "canHaveStackable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RevenueStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "RevenueCommitStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "getAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAvsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccAvsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAvsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccAvsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecurringPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "isRecurringPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSecurityCodeMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccSecurityCodeMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altSalesTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreAvs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ignoreAvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionPaymentEventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2019_1.transactions.webservices.netsuite.com", "TransactionPaymentEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventUpdatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paymentEventUpdatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altShippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altShippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altHandlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "altHandlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalAuthId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paypalAuthId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paypalProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "paypalProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccSecurityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "ccSecurityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "threeDStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "IntercoStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "oneTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurWeekly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurWeekly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurMonthly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurMonthly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurQuarterly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurQuarterly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurAnnually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurAnnually"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAutoCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "vsoeAutoCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRedemptionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "giftCertRedemptionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "GiftCertRedemptionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "promotionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "PromotionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "SalesOrderShipGroupList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "customFieldList"));
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
