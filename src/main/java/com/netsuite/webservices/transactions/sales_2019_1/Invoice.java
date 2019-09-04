/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2019_1;

public class Invoice  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nexus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum;

    private java.lang.Boolean taxRegOverride;

    private java.lang.Boolean taxDetailsOverride;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingAccount;

    private java.lang.Boolean recurringBill;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum;

    private java.util.Calendar taxPointDate;

    private java.lang.String source;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef department;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef _class;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terms;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef location;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private java.util.Calendar dueDate;

    private java.util.Calendar discountDate;

    private java.lang.Double discountAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep;

    private java.lang.String contribPct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef partner;

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

    private com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule;

    private java.util.Calendar revRecStartDate;

    private java.util.Calendar revRecEndDate;

    private java.lang.Double amountPaid;

    private java.lang.Double amountRemaining;

    private java.lang.Double balance;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef account;

    private java.lang.String onCreditHold;

    private java.lang.Double exchangeRate;

    private java.lang.String currencyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem;

    private java.lang.String discountRate;

    private java.lang.Boolean isTaxable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem;

    private java.lang.Double taxRate;

    private java.lang.Boolean toBePrinted;

    private java.lang.Boolean toBeEmailed;

    private java.lang.Boolean toBeFaxed;

    private java.lang.String fax;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel;

    private java.lang.String message;

    private com.netsuite.webservices.platform.common_2019_1.Address billingAddress;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList;

    private com.netsuite.webservices.platform.common_2019_1.Address shippingAddress;

    private java.lang.Boolean shipIsResidential;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList;

    private java.lang.String fob;

    private java.util.Calendar shipDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod;

    private java.lang.Double shippingCost;

    private java.lang.Double shippingTax1Rate;

    private java.lang.String shippingTax2Rate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode;

    private java.lang.Double handlingTax1Rate;

    private java.lang.Double handlingCost;

    private java.lang.String handlingTax2Rate;

    private java.lang.String trackingNumbers;

    private java.lang.String linkedTrackingNumbers;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup;

    private java.lang.Double subTotal;

    private java.lang.Boolean canHaveStackable;

    private com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus;

    private java.lang.Double recognizedRevenue;

    private java.lang.Double deferredRevenue;

    private java.lang.Boolean revRecOnRevCommitment;

    private java.lang.Boolean syncSalesTeams;

    private java.lang.Double discountTotal;

    private java.lang.Double taxTotal;

    private java.lang.Double altShippingCost;

    private java.lang.Double altHandlingCost;

    private java.lang.Double total;

    private java.lang.String status;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef job;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule;

    private java.lang.String email;

    private java.lang.Double tax2Total;

    private java.lang.String vatRegNum;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expCostDiscount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemCostDiscount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef timeDiscount;

    private java.lang.String expCostDiscRate;

    private java.lang.String itemCostDiscRate;

    private java.lang.String timeDiscRate;

    private java.lang.Double expCostDiscAmount;

    private java.lang.Double expCostTaxRate1;

    private java.lang.Double expCostTaxRate2;

    private java.lang.Double itemCostDiscAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef expCostTaxCode;

    private java.lang.Double expCostDiscTax1Amt;

    private java.lang.Double itemCostTaxRate1;

    private java.lang.Double timeDiscAmount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef itemCostTaxCode;

    private java.lang.Boolean expCostDiscTaxable;

    private java.lang.Boolean itemCostDiscTaxable;

    private java.lang.Double itemCostTaxRate2;

    private java.lang.Double itemCostDiscTax1Amt;

    private java.lang.Boolean itemCostDiscPrint;

    private java.lang.Boolean timeDiscTaxable;

    private java.lang.Double timeTaxRate1;

    private java.lang.Boolean expCostDiscPrint;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef timeTaxCode;

    private java.lang.Boolean timeDiscPrint;

    private java.lang.Double giftCertApplied;

    private java.lang.Double timeDiscTax1Amt;

    private java.lang.Boolean tranIsVsoeBundle;

    private java.lang.Double timeTaxRate2;

    private java.lang.Boolean vsoeAutoCalc;

    private java.lang.Boolean syncPartnerTeams;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceSalesTeamList salesTeamList;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoicePartnersList partnersList;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemList itemList;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCostList itemCostList;

    private com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList giftCertRedemptionList;

    private com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceExpCostList expCostList;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceTimeList timeList;

    private com.netsuite.webservices.transactions.sales_2019_1.InvoiceShipGroupList shipGroupList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus;

    private com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList;

    private com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Invoice() {
    }

    public Invoice(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nexus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum,
           java.lang.Boolean taxRegOverride,
           java.lang.Boolean taxDetailsOverride,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingAccount,
           java.lang.Boolean recurringBill,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum,
           java.util.Calendar taxPointDate,
           java.lang.String source,
           com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom,
           com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod,
           com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity,
           com.netsuite.webservices.platform.core_2019_1.RecordRef department,
           com.netsuite.webservices.platform.core_2019_1.RecordRef _class,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terms,
           com.netsuite.webservices.platform.core_2019_1.RecordRef location,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           java.util.Calendar dueDate,
           java.util.Calendar discountDate,
           java.lang.Double discountAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep,
           java.lang.String contribPct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef partner,
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
           com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule,
           java.util.Calendar revRecStartDate,
           java.util.Calendar revRecEndDate,
           java.lang.Double amountPaid,
           java.lang.Double amountRemaining,
           java.lang.Double balance,
           com.netsuite.webservices.platform.core_2019_1.RecordRef account,
           java.lang.String onCreditHold,
           java.lang.Double exchangeRate,
           java.lang.String currencyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem,
           java.lang.String discountRate,
           java.lang.Boolean isTaxable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem,
           java.lang.Double taxRate,
           java.lang.Boolean toBePrinted,
           java.lang.Boolean toBeEmailed,
           java.lang.Boolean toBeFaxed,
           java.lang.String fax,
           com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel,
           java.lang.String message,
           com.netsuite.webservices.platform.common_2019_1.Address billingAddress,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList,
           com.netsuite.webservices.platform.common_2019_1.Address shippingAddress,
           java.lang.Boolean shipIsResidential,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList,
           java.lang.String fob,
           java.util.Calendar shipDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod,
           java.lang.Double shippingCost,
           java.lang.Double shippingTax1Rate,
           java.lang.String shippingTax2Rate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode,
           com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode,
           java.lang.Double handlingTax1Rate,
           java.lang.Double handlingCost,
           java.lang.String handlingTax2Rate,
           java.lang.String trackingNumbers,
           java.lang.String linkedTrackingNumbers,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup,
           java.lang.Double subTotal,
           java.lang.Boolean canHaveStackable,
           com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus,
           java.lang.Double recognizedRevenue,
           java.lang.Double deferredRevenue,
           java.lang.Boolean revRecOnRevCommitment,
           java.lang.Boolean syncSalesTeams,
           java.lang.Double discountTotal,
           java.lang.Double taxTotal,
           java.lang.Double altShippingCost,
           java.lang.Double altHandlingCost,
           java.lang.Double total,
           java.lang.String status,
           com.netsuite.webservices.platform.core_2019_1.RecordRef job,
           com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule,
           java.lang.String email,
           java.lang.Double tax2Total,
           java.lang.String vatRegNum,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expCostDiscount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemCostDiscount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef timeDiscount,
           java.lang.String expCostDiscRate,
           java.lang.String itemCostDiscRate,
           java.lang.String timeDiscRate,
           java.lang.Double expCostDiscAmount,
           java.lang.Double expCostTaxRate1,
           java.lang.Double expCostTaxRate2,
           java.lang.Double itemCostDiscAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef expCostTaxCode,
           java.lang.Double expCostDiscTax1Amt,
           java.lang.Double itemCostTaxRate1,
           java.lang.Double timeDiscAmount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef itemCostTaxCode,
           java.lang.Boolean expCostDiscTaxable,
           java.lang.Boolean itemCostDiscTaxable,
           java.lang.Double itemCostTaxRate2,
           java.lang.Double itemCostDiscTax1Amt,
           java.lang.Boolean itemCostDiscPrint,
           java.lang.Boolean timeDiscTaxable,
           java.lang.Double timeTaxRate1,
           java.lang.Boolean expCostDiscPrint,
           com.netsuite.webservices.platform.core_2019_1.RecordRef timeTaxCode,
           java.lang.Boolean timeDiscPrint,
           java.lang.Double giftCertApplied,
           java.lang.Double timeDiscTax1Amt,
           java.lang.Boolean tranIsVsoeBundle,
           java.lang.Double timeTaxRate2,
           java.lang.Boolean vsoeAutoCalc,
           java.lang.Boolean syncPartnerTeams,
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceSalesTeamList salesTeamList,
           com.netsuite.webservices.transactions.sales_2019_1.InvoicePartnersList partnersList,
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemList itemList,
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCostList itemCostList,
           com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList giftCertRedemptionList,
           com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList,
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceExpCostList expCostList,
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceTimeList timeList,
           com.netsuite.webservices.transactions.sales_2019_1.InvoiceShipGroupList shipGroupList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus,
           com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList,
           com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.customForm = customForm;
        this.nextApprover = nextApprover;
        this.entity = entity;
        this.billingAccount = billingAccount;
        this.recurringBill = recurringBill;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.source = source;
        this.createdFrom = createdFrom;
        this.postingPeriod = postingPeriod;
        this.opportunity = opportunity;
        this.department = department;
        this._class = _class;
        this.terms = terms;
        this.location = location;
        this.subsidiary = subsidiary;
        this.currency = currency;
        this.dueDate = dueDate;
        this.discountDate = discountDate;
        this.discountAmount = discountAmount;
        this.salesRep = salesRep;
        this.contribPct = contribPct;
        this.partner = partner;
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
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.amountPaid = amountPaid;
        this.amountRemaining = amountRemaining;
        this.balance = balance;
        this.account = account;
        this.onCreditHold = onCreditHold;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.promoCode = promoCode;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.messageSel = messageSel;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.fob = fob;
        this.shipDate = shipDate;
        this.shipMethod = shipMethod;
        this.shippingCost = shippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.shippingTax2Rate = shippingTax2Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingCost = handlingCost;
        this.handlingTax2Rate = handlingTax2Rate;
        this.trackingNumbers = trackingNumbers;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.salesGroup = salesGroup;
        this.subTotal = subTotal;
        this.canHaveStackable = canHaveStackable;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.syncSalesTeams = syncSalesTeams;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.altShippingCost = altShippingCost;
        this.altHandlingCost = altHandlingCost;
        this.total = total;
        this.status = status;
        this.job = job;
        this.billingSchedule = billingSchedule;
        this.email = email;
        this.tax2Total = tax2Total;
        this.vatRegNum = vatRegNum;
        this.expCostDiscount = expCostDiscount;
        this.itemCostDiscount = itemCostDiscount;
        this.timeDiscount = timeDiscount;
        this.expCostDiscRate = expCostDiscRate;
        this.itemCostDiscRate = itemCostDiscRate;
        this.timeDiscRate = timeDiscRate;
        this.expCostDiscAmount = expCostDiscAmount;
        this.expCostTaxRate1 = expCostTaxRate1;
        this.expCostTaxRate2 = expCostTaxRate2;
        this.itemCostDiscAmount = itemCostDiscAmount;
        this.expCostTaxCode = expCostTaxCode;
        this.expCostDiscTax1Amt = expCostDiscTax1Amt;
        this.itemCostTaxRate1 = itemCostTaxRate1;
        this.timeDiscAmount = timeDiscAmount;
        this.itemCostTaxCode = itemCostTaxCode;
        this.expCostDiscTaxable = expCostDiscTaxable;
        this.itemCostDiscTaxable = itemCostDiscTaxable;
        this.itemCostTaxRate2 = itemCostTaxRate2;
        this.itemCostDiscTax1Amt = itemCostDiscTax1Amt;
        this.itemCostDiscPrint = itemCostDiscPrint;
        this.timeDiscTaxable = timeDiscTaxable;
        this.timeTaxRate1 = timeTaxRate1;
        this.expCostDiscPrint = expCostDiscPrint;
        this.timeTaxCode = timeTaxCode;
        this.timeDiscPrint = timeDiscPrint;
        this.giftCertApplied = giftCertApplied;
        this.timeDiscTax1Amt = timeDiscTax1Amt;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.timeTaxRate2 = timeTaxRate2;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.itemList = itemList;
        this.itemCostList = itemCostList;
        this.giftCertRedemptionList = giftCertRedemptionList;
        this.promotionsList = promotionsList;
        this.expCostList = expCostList;
        this.timeList = timeList;
        this.shipGroupList = shipGroupList;
        this.approvalStatus = approvalStatus;
        this.accountingBookDetailList = accountingBookDetailList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this Invoice.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Invoice.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this Invoice.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Invoice.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nexus value for this Invoice.
     * 
     * @return nexus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNexus() {
        return nexus;
    }


    /**
     * Sets the nexus value for this Invoice.
     * 
     * @param nexus
     */
    public void setNexus(com.netsuite.webservices.platform.core_2019_1.RecordRef nexus) {
        this.nexus = nexus;
    }


    /**
     * Gets the subsidiaryTaxRegNum value for this Invoice.
     * 
     * @return subsidiaryTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }


    /**
     * Sets the subsidiaryTaxRegNum value for this Invoice.
     * 
     * @param subsidiaryTaxRegNum
     */
    public void setSubsidiaryTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }


    /**
     * Gets the taxRegOverride value for this Invoice.
     * 
     * @return taxRegOverride
     */
    public java.lang.Boolean getTaxRegOverride() {
        return taxRegOverride;
    }


    /**
     * Sets the taxRegOverride value for this Invoice.
     * 
     * @param taxRegOverride
     */
    public void setTaxRegOverride(java.lang.Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }


    /**
     * Gets the taxDetailsOverride value for this Invoice.
     * 
     * @return taxDetailsOverride
     */
    public java.lang.Boolean getTaxDetailsOverride() {
        return taxDetailsOverride;
    }


    /**
     * Sets the taxDetailsOverride value for this Invoice.
     * 
     * @param taxDetailsOverride
     */
    public void setTaxDetailsOverride(java.lang.Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }


    /**
     * Gets the customForm value for this Invoice.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Invoice.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the nextApprover value for this Invoice.
     * 
     * @return nextApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getNextApprover() {
        return nextApprover;
    }


    /**
     * Sets the nextApprover value for this Invoice.
     * 
     * @param nextApprover
     */
    public void setNextApprover(com.netsuite.webservices.platform.core_2019_1.RecordRef nextApprover) {
        this.nextApprover = nextApprover;
    }


    /**
     * Gets the entity value for this Invoice.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Invoice.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2019_1.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the billingAccount value for this Invoice.
     * 
     * @return billingAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this Invoice.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the recurringBill value for this Invoice.
     * 
     * @return recurringBill
     */
    public java.lang.Boolean getRecurringBill() {
        return recurringBill;
    }


    /**
     * Sets the recurringBill value for this Invoice.
     * 
     * @param recurringBill
     */
    public void setRecurringBill(java.lang.Boolean recurringBill) {
        this.recurringBill = recurringBill;
    }


    /**
     * Gets the tranDate value for this Invoice.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this Invoice.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this Invoice.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this Invoice.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the entityTaxRegNum value for this Invoice.
     * 
     * @return entityTaxRegNum
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }


    /**
     * Sets the entityTaxRegNum value for this Invoice.
     * 
     * @param entityTaxRegNum
     */
    public void setEntityTaxRegNum(com.netsuite.webservices.platform.core_2019_1.RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }


    /**
     * Gets the taxPointDate value for this Invoice.
     * 
     * @return taxPointDate
     */
    public java.util.Calendar getTaxPointDate() {
        return taxPointDate;
    }


    /**
     * Sets the taxPointDate value for this Invoice.
     * 
     * @param taxPointDate
     */
    public void setTaxPointDate(java.util.Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }


    /**
     * Gets the source value for this Invoice.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Invoice.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the createdFrom value for this Invoice.
     * 
     * @return createdFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this Invoice.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(com.netsuite.webservices.platform.core_2019_1.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the postingPeriod value for this Invoice.
     * 
     * @return postingPeriod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this Invoice.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(com.netsuite.webservices.platform.core_2019_1.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the opportunity value for this Invoice.
     * 
     * @return opportunity
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this Invoice.
     * 
     * @param opportunity
     */
    public void setOpportunity(com.netsuite.webservices.platform.core_2019_1.RecordRef opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the department value for this Invoice.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Invoice.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2019_1.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this Invoice.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Invoice.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2019_1.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the terms value for this Invoice.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this Invoice.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the location value for this Invoice.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Invoice.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2019_1.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this Invoice.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Invoice.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the currency value for this Invoice.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Invoice.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the dueDate value for this Invoice.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Invoice.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the discountDate value for this Invoice.
     * 
     * @return discountDate
     */
    public java.util.Calendar getDiscountDate() {
        return discountDate;
    }


    /**
     * Sets the discountDate value for this Invoice.
     * 
     * @param discountDate
     */
    public void setDiscountDate(java.util.Calendar discountDate) {
        this.discountDate = discountDate;
    }


    /**
     * Gets the discountAmount value for this Invoice.
     * 
     * @return discountAmount
     */
    public java.lang.Double getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this Invoice.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.Double discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the salesRep value for this Invoice.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this Invoice.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the contribPct value for this Invoice.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this Invoice.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the partner value for this Invoice.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this Invoice.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the leadSource value for this Invoice.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Invoice.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the startDate value for this Invoice.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Invoice.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Invoice.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Invoice.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the otherRefNum value for this Invoice.
     * 
     * @return otherRefNum
     */
    public java.lang.String getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this Invoice.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(java.lang.String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the memo value for this Invoice.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this Invoice.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the salesEffectiveDate value for this Invoice.
     * 
     * @return salesEffectiveDate
     */
    public java.util.Calendar getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this Invoice.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(java.util.Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }


    /**
     * Gets the excludeCommission value for this Invoice.
     * 
     * @return excludeCommission
     */
    public java.lang.Boolean getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this Invoice.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(java.lang.Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
    }


    /**
     * Gets the totalCostEstimate value for this Invoice.
     * 
     * @return totalCostEstimate
     */
    public java.lang.Double getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this Invoice.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(java.lang.Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }


    /**
     * Gets the estGrossProfit value for this Invoice.
     * 
     * @return estGrossProfit
     */
    public java.lang.Double getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this Invoice.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(java.lang.Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPercent value for this Invoice.
     * 
     * @return estGrossProfitPercent
     */
    public java.lang.Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this Invoice.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(java.lang.Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }


    /**
     * Gets the revRecSchedule value for this Invoice.
     * 
     * @return revRecSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this Invoice.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the revRecStartDate value for this Invoice.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this Invoice.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecEndDate value for this Invoice.
     * 
     * @return revRecEndDate
     */
    public java.util.Calendar getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this Invoice.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(java.util.Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the amountPaid value for this Invoice.
     * 
     * @return amountPaid
     */
    public java.lang.Double getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this Invoice.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(java.lang.Double amountPaid) {
        this.amountPaid = amountPaid;
    }


    /**
     * Gets the amountRemaining value for this Invoice.
     * 
     * @return amountRemaining
     */
    public java.lang.Double getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this Invoice.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(java.lang.Double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }


    /**
     * Gets the balance value for this Invoice.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Invoice.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the account value for this Invoice.
     * 
     * @return account
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Invoice.
     * 
     * @param account
     */
    public void setAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the onCreditHold value for this Invoice.
     * 
     * @return onCreditHold
     */
    public java.lang.String getOnCreditHold() {
        return onCreditHold;
    }


    /**
     * Sets the onCreditHold value for this Invoice.
     * 
     * @param onCreditHold
     */
    public void setOnCreditHold(java.lang.String onCreditHold) {
        this.onCreditHold = onCreditHold;
    }


    /**
     * Gets the exchangeRate value for this Invoice.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Invoice.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the currencyName value for this Invoice.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this Invoice.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the promoCode value for this Invoice.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this Invoice.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2019_1.RecordRef promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the discountItem value for this Invoice.
     * 
     * @return discountItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDiscountItem() {
        return discountItem;
    }


    /**
     * Sets the discountItem value for this Invoice.
     * 
     * @param discountItem
     */
    public void setDiscountItem(com.netsuite.webservices.platform.core_2019_1.RecordRef discountItem) {
        this.discountItem = discountItem;
    }


    /**
     * Gets the discountRate value for this Invoice.
     * 
     * @return discountRate
     */
    public java.lang.String getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this Invoice.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.lang.String discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the isTaxable value for this Invoice.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this Invoice.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the taxItem value for this Invoice.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this Invoice.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxRate value for this Invoice.
     * 
     * @return taxRate
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this Invoice.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the toBePrinted value for this Invoice.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this Invoice.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toBeEmailed value for this Invoice.
     * 
     * @return toBeEmailed
     */
    public java.lang.Boolean getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this Invoice.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(java.lang.Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the toBeFaxed value for this Invoice.
     * 
     * @return toBeFaxed
     */
    public java.lang.Boolean getToBeFaxed() {
        return toBeFaxed;
    }


    /**
     * Sets the toBeFaxed value for this Invoice.
     * 
     * @param toBeFaxed
     */
    public void setToBeFaxed(java.lang.Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }


    /**
     * Gets the fax value for this Invoice.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Invoice.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the messageSel value for this Invoice.
     * 
     * @return messageSel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getMessageSel() {
        return messageSel;
    }


    /**
     * Sets the messageSel value for this Invoice.
     * 
     * @param messageSel
     */
    public void setMessageSel(com.netsuite.webservices.platform.core_2019_1.RecordRef messageSel) {
        this.messageSel = messageSel;
    }


    /**
     * Gets the message value for this Invoice.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Invoice.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the billingAddress value for this Invoice.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this Invoice.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2019_1.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billAddressList value for this Invoice.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this Invoice.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the shippingAddress value for this Invoice.
     * 
     * @return shippingAddress
     */
    public com.netsuite.webservices.platform.common_2019_1.Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this Invoice.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.netsuite.webservices.platform.common_2019_1.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the shipIsResidential value for this Invoice.
     * 
     * @return shipIsResidential
     */
    public java.lang.Boolean getShipIsResidential() {
        return shipIsResidential;
    }


    /**
     * Sets the shipIsResidential value for this Invoice.
     * 
     * @param shipIsResidential
     */
    public void setShipIsResidential(java.lang.Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }


    /**
     * Gets the shipAddressList value for this Invoice.
     * 
     * @return shipAddressList
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this Invoice.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(com.netsuite.webservices.platform.core_2019_1.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the fob value for this Invoice.
     * 
     * @return fob
     */
    public java.lang.String getFob() {
        return fob;
    }


    /**
     * Sets the fob value for this Invoice.
     * 
     * @param fob
     */
    public void setFob(java.lang.String fob) {
        this.fob = fob;
    }


    /**
     * Gets the shipDate value for this Invoice.
     * 
     * @return shipDate
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this Invoice.
     * 
     * @param shipDate
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipMethod value for this Invoice.
     * 
     * @return shipMethod
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this Invoice.
     * 
     * @param shipMethod
     */
    public void setShipMethod(com.netsuite.webservices.platform.core_2019_1.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the shippingCost value for this Invoice.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this Invoice.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the shippingTax1Rate value for this Invoice.
     * 
     * @return shippingTax1Rate
     */
    public java.lang.Double getShippingTax1Rate() {
        return shippingTax1Rate;
    }


    /**
     * Sets the shippingTax1Rate value for this Invoice.
     * 
     * @param shippingTax1Rate
     */
    public void setShippingTax1Rate(java.lang.Double shippingTax1Rate) {
        this.shippingTax1Rate = shippingTax1Rate;
    }


    /**
     * Gets the shippingTax2Rate value for this Invoice.
     * 
     * @return shippingTax2Rate
     */
    public java.lang.String getShippingTax2Rate() {
        return shippingTax2Rate;
    }


    /**
     * Sets the shippingTax2Rate value for this Invoice.
     * 
     * @param shippingTax2Rate
     */
    public void setShippingTax2Rate(java.lang.String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }


    /**
     * Gets the shippingTaxCode value for this Invoice.
     * 
     * @return shippingTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }


    /**
     * Sets the shippingTaxCode value for this Invoice.
     * 
     * @param shippingTaxCode
     */
    public void setShippingTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }


    /**
     * Gets the handlingTaxCode value for this Invoice.
     * 
     * @return handlingTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }


    /**
     * Sets the handlingTaxCode value for this Invoice.
     * 
     * @param handlingTaxCode
     */
    public void setHandlingTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }


    /**
     * Gets the handlingTax1Rate value for this Invoice.
     * 
     * @return handlingTax1Rate
     */
    public java.lang.Double getHandlingTax1Rate() {
        return handlingTax1Rate;
    }


    /**
     * Sets the handlingTax1Rate value for this Invoice.
     * 
     * @param handlingTax1Rate
     */
    public void setHandlingTax1Rate(java.lang.Double handlingTax1Rate) {
        this.handlingTax1Rate = handlingTax1Rate;
    }


    /**
     * Gets the handlingCost value for this Invoice.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this Invoice.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the handlingTax2Rate value for this Invoice.
     * 
     * @return handlingTax2Rate
     */
    public java.lang.String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }


    /**
     * Sets the handlingTax2Rate value for this Invoice.
     * 
     * @param handlingTax2Rate
     */
    public void setHandlingTax2Rate(java.lang.String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }


    /**
     * Gets the trackingNumbers value for this Invoice.
     * 
     * @return trackingNumbers
     */
    public java.lang.String getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this Invoice.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(java.lang.String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the linkedTrackingNumbers value for this Invoice.
     * 
     * @return linkedTrackingNumbers
     */
    public java.lang.String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }


    /**
     * Sets the linkedTrackingNumbers value for this Invoice.
     * 
     * @param linkedTrackingNumbers
     */
    public void setLinkedTrackingNumbers(java.lang.String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }


    /**
     * Gets the salesGroup value for this Invoice.
     * 
     * @return salesGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this Invoice.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the subTotal value for this Invoice.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this Invoice.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the canHaveStackable value for this Invoice.
     * 
     * @return canHaveStackable
     */
    public java.lang.Boolean getCanHaveStackable() {
        return canHaveStackable;
    }


    /**
     * Sets the canHaveStackable value for this Invoice.
     * 
     * @param canHaveStackable
     */
    public void setCanHaveStackable(java.lang.Boolean canHaveStackable) {
        this.canHaveStackable = canHaveStackable;
    }


    /**
     * Gets the revenueStatus value for this Invoice.
     * 
     * @return revenueStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this Invoice.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(com.netsuite.webservices.platform.common_2019_1.types.RevenueStatus revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the recognizedRevenue value for this Invoice.
     * 
     * @return recognizedRevenue
     */
    public java.lang.Double getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this Invoice.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(java.lang.Double recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the deferredRevenue value for this Invoice.
     * 
     * @return deferredRevenue
     */
    public java.lang.Double getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this Invoice.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(java.lang.Double deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }


    /**
     * Gets the revRecOnRevCommitment value for this Invoice.
     * 
     * @return revRecOnRevCommitment
     */
    public java.lang.Boolean getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this Invoice.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(java.lang.Boolean revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the syncSalesTeams value for this Invoice.
     * 
     * @return syncSalesTeams
     */
    public java.lang.Boolean getSyncSalesTeams() {
        return syncSalesTeams;
    }


    /**
     * Sets the syncSalesTeams value for this Invoice.
     * 
     * @param syncSalesTeams
     */
    public void setSyncSalesTeams(java.lang.Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }


    /**
     * Gets the discountTotal value for this Invoice.
     * 
     * @return discountTotal
     */
    public java.lang.Double getDiscountTotal() {
        return discountTotal;
    }


    /**
     * Sets the discountTotal value for this Invoice.
     * 
     * @param discountTotal
     */
    public void setDiscountTotal(java.lang.Double discountTotal) {
        this.discountTotal = discountTotal;
    }


    /**
     * Gets the taxTotal value for this Invoice.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this Invoice.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the altShippingCost value for this Invoice.
     * 
     * @return altShippingCost
     */
    public java.lang.Double getAltShippingCost() {
        return altShippingCost;
    }


    /**
     * Sets the altShippingCost value for this Invoice.
     * 
     * @param altShippingCost
     */
    public void setAltShippingCost(java.lang.Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }


    /**
     * Gets the altHandlingCost value for this Invoice.
     * 
     * @return altHandlingCost
     */
    public java.lang.Double getAltHandlingCost() {
        return altHandlingCost;
    }


    /**
     * Sets the altHandlingCost value for this Invoice.
     * 
     * @param altHandlingCost
     */
    public void setAltHandlingCost(java.lang.Double altHandlingCost) {
        this.altHandlingCost = altHandlingCost;
    }


    /**
     * Gets the total value for this Invoice.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Invoice.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the status value for this Invoice.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Invoice.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the job value for this Invoice.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this Invoice.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2019_1.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the billingSchedule value for this Invoice.
     * 
     * @return billingSchedule
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this Invoice.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(com.netsuite.webservices.platform.core_2019_1.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the email value for this Invoice.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Invoice.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the tax2Total value for this Invoice.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this Invoice.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the vatRegNum value for this Invoice.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this Invoice.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the expCostDiscount value for this Invoice.
     * 
     * @return expCostDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpCostDiscount() {
        return expCostDiscount;
    }


    /**
     * Sets the expCostDiscount value for this Invoice.
     * 
     * @param expCostDiscount
     */
    public void setExpCostDiscount(com.netsuite.webservices.platform.core_2019_1.RecordRef expCostDiscount) {
        this.expCostDiscount = expCostDiscount;
    }


    /**
     * Gets the itemCostDiscount value for this Invoice.
     * 
     * @return itemCostDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemCostDiscount() {
        return itemCostDiscount;
    }


    /**
     * Sets the itemCostDiscount value for this Invoice.
     * 
     * @param itemCostDiscount
     */
    public void setItemCostDiscount(com.netsuite.webservices.platform.core_2019_1.RecordRef itemCostDiscount) {
        this.itemCostDiscount = itemCostDiscount;
    }


    /**
     * Gets the timeDiscount value for this Invoice.
     * 
     * @return timeDiscount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTimeDiscount() {
        return timeDiscount;
    }


    /**
     * Sets the timeDiscount value for this Invoice.
     * 
     * @param timeDiscount
     */
    public void setTimeDiscount(com.netsuite.webservices.platform.core_2019_1.RecordRef timeDiscount) {
        this.timeDiscount = timeDiscount;
    }


    /**
     * Gets the expCostDiscRate value for this Invoice.
     * 
     * @return expCostDiscRate
     */
    public java.lang.String getExpCostDiscRate() {
        return expCostDiscRate;
    }


    /**
     * Sets the expCostDiscRate value for this Invoice.
     * 
     * @param expCostDiscRate
     */
    public void setExpCostDiscRate(java.lang.String expCostDiscRate) {
        this.expCostDiscRate = expCostDiscRate;
    }


    /**
     * Gets the itemCostDiscRate value for this Invoice.
     * 
     * @return itemCostDiscRate
     */
    public java.lang.String getItemCostDiscRate() {
        return itemCostDiscRate;
    }


    /**
     * Sets the itemCostDiscRate value for this Invoice.
     * 
     * @param itemCostDiscRate
     */
    public void setItemCostDiscRate(java.lang.String itemCostDiscRate) {
        this.itemCostDiscRate = itemCostDiscRate;
    }


    /**
     * Gets the timeDiscRate value for this Invoice.
     * 
     * @return timeDiscRate
     */
    public java.lang.String getTimeDiscRate() {
        return timeDiscRate;
    }


    /**
     * Sets the timeDiscRate value for this Invoice.
     * 
     * @param timeDiscRate
     */
    public void setTimeDiscRate(java.lang.String timeDiscRate) {
        this.timeDiscRate = timeDiscRate;
    }


    /**
     * Gets the expCostDiscAmount value for this Invoice.
     * 
     * @return expCostDiscAmount
     */
    public java.lang.Double getExpCostDiscAmount() {
        return expCostDiscAmount;
    }


    /**
     * Sets the expCostDiscAmount value for this Invoice.
     * 
     * @param expCostDiscAmount
     */
    public void setExpCostDiscAmount(java.lang.Double expCostDiscAmount) {
        this.expCostDiscAmount = expCostDiscAmount;
    }


    /**
     * Gets the expCostTaxRate1 value for this Invoice.
     * 
     * @return expCostTaxRate1
     */
    public java.lang.Double getExpCostTaxRate1() {
        return expCostTaxRate1;
    }


    /**
     * Sets the expCostTaxRate1 value for this Invoice.
     * 
     * @param expCostTaxRate1
     */
    public void setExpCostTaxRate1(java.lang.Double expCostTaxRate1) {
        this.expCostTaxRate1 = expCostTaxRate1;
    }


    /**
     * Gets the expCostTaxRate2 value for this Invoice.
     * 
     * @return expCostTaxRate2
     */
    public java.lang.Double getExpCostTaxRate2() {
        return expCostTaxRate2;
    }


    /**
     * Sets the expCostTaxRate2 value for this Invoice.
     * 
     * @param expCostTaxRate2
     */
    public void setExpCostTaxRate2(java.lang.Double expCostTaxRate2) {
        this.expCostTaxRate2 = expCostTaxRate2;
    }


    /**
     * Gets the itemCostDiscAmount value for this Invoice.
     * 
     * @return itemCostDiscAmount
     */
    public java.lang.Double getItemCostDiscAmount() {
        return itemCostDiscAmount;
    }


    /**
     * Sets the itemCostDiscAmount value for this Invoice.
     * 
     * @param itemCostDiscAmount
     */
    public void setItemCostDiscAmount(java.lang.Double itemCostDiscAmount) {
        this.itemCostDiscAmount = itemCostDiscAmount;
    }


    /**
     * Gets the expCostTaxCode value for this Invoice.
     * 
     * @return expCostTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getExpCostTaxCode() {
        return expCostTaxCode;
    }


    /**
     * Sets the expCostTaxCode value for this Invoice.
     * 
     * @param expCostTaxCode
     */
    public void setExpCostTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef expCostTaxCode) {
        this.expCostTaxCode = expCostTaxCode;
    }


    /**
     * Gets the expCostDiscTax1Amt value for this Invoice.
     * 
     * @return expCostDiscTax1Amt
     */
    public java.lang.Double getExpCostDiscTax1Amt() {
        return expCostDiscTax1Amt;
    }


    /**
     * Sets the expCostDiscTax1Amt value for this Invoice.
     * 
     * @param expCostDiscTax1Amt
     */
    public void setExpCostDiscTax1Amt(java.lang.Double expCostDiscTax1Amt) {
        this.expCostDiscTax1Amt = expCostDiscTax1Amt;
    }


    /**
     * Gets the itemCostTaxRate1 value for this Invoice.
     * 
     * @return itemCostTaxRate1
     */
    public java.lang.Double getItemCostTaxRate1() {
        return itemCostTaxRate1;
    }


    /**
     * Sets the itemCostTaxRate1 value for this Invoice.
     * 
     * @param itemCostTaxRate1
     */
    public void setItemCostTaxRate1(java.lang.Double itemCostTaxRate1) {
        this.itemCostTaxRate1 = itemCostTaxRate1;
    }


    /**
     * Gets the timeDiscAmount value for this Invoice.
     * 
     * @return timeDiscAmount
     */
    public java.lang.Double getTimeDiscAmount() {
        return timeDiscAmount;
    }


    /**
     * Sets the timeDiscAmount value for this Invoice.
     * 
     * @param timeDiscAmount
     */
    public void setTimeDiscAmount(java.lang.Double timeDiscAmount) {
        this.timeDiscAmount = timeDiscAmount;
    }


    /**
     * Gets the itemCostTaxCode value for this Invoice.
     * 
     * @return itemCostTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getItemCostTaxCode() {
        return itemCostTaxCode;
    }


    /**
     * Sets the itemCostTaxCode value for this Invoice.
     * 
     * @param itemCostTaxCode
     */
    public void setItemCostTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef itemCostTaxCode) {
        this.itemCostTaxCode = itemCostTaxCode;
    }


    /**
     * Gets the expCostDiscTaxable value for this Invoice.
     * 
     * @return expCostDiscTaxable
     */
    public java.lang.Boolean getExpCostDiscTaxable() {
        return expCostDiscTaxable;
    }


    /**
     * Sets the expCostDiscTaxable value for this Invoice.
     * 
     * @param expCostDiscTaxable
     */
    public void setExpCostDiscTaxable(java.lang.Boolean expCostDiscTaxable) {
        this.expCostDiscTaxable = expCostDiscTaxable;
    }


    /**
     * Gets the itemCostDiscTaxable value for this Invoice.
     * 
     * @return itemCostDiscTaxable
     */
    public java.lang.Boolean getItemCostDiscTaxable() {
        return itemCostDiscTaxable;
    }


    /**
     * Sets the itemCostDiscTaxable value for this Invoice.
     * 
     * @param itemCostDiscTaxable
     */
    public void setItemCostDiscTaxable(java.lang.Boolean itemCostDiscTaxable) {
        this.itemCostDiscTaxable = itemCostDiscTaxable;
    }


    /**
     * Gets the itemCostTaxRate2 value for this Invoice.
     * 
     * @return itemCostTaxRate2
     */
    public java.lang.Double getItemCostTaxRate2() {
        return itemCostTaxRate2;
    }


    /**
     * Sets the itemCostTaxRate2 value for this Invoice.
     * 
     * @param itemCostTaxRate2
     */
    public void setItemCostTaxRate2(java.lang.Double itemCostTaxRate2) {
        this.itemCostTaxRate2 = itemCostTaxRate2;
    }


    /**
     * Gets the itemCostDiscTax1Amt value for this Invoice.
     * 
     * @return itemCostDiscTax1Amt
     */
    public java.lang.Double getItemCostDiscTax1Amt() {
        return itemCostDiscTax1Amt;
    }


    /**
     * Sets the itemCostDiscTax1Amt value for this Invoice.
     * 
     * @param itemCostDiscTax1Amt
     */
    public void setItemCostDiscTax1Amt(java.lang.Double itemCostDiscTax1Amt) {
        this.itemCostDiscTax1Amt = itemCostDiscTax1Amt;
    }


    /**
     * Gets the itemCostDiscPrint value for this Invoice.
     * 
     * @return itemCostDiscPrint
     */
    public java.lang.Boolean getItemCostDiscPrint() {
        return itemCostDiscPrint;
    }


    /**
     * Sets the itemCostDiscPrint value for this Invoice.
     * 
     * @param itemCostDiscPrint
     */
    public void setItemCostDiscPrint(java.lang.Boolean itemCostDiscPrint) {
        this.itemCostDiscPrint = itemCostDiscPrint;
    }


    /**
     * Gets the timeDiscTaxable value for this Invoice.
     * 
     * @return timeDiscTaxable
     */
    public java.lang.Boolean getTimeDiscTaxable() {
        return timeDiscTaxable;
    }


    /**
     * Sets the timeDiscTaxable value for this Invoice.
     * 
     * @param timeDiscTaxable
     */
    public void setTimeDiscTaxable(java.lang.Boolean timeDiscTaxable) {
        this.timeDiscTaxable = timeDiscTaxable;
    }


    /**
     * Gets the timeTaxRate1 value for this Invoice.
     * 
     * @return timeTaxRate1
     */
    public java.lang.Double getTimeTaxRate1() {
        return timeTaxRate1;
    }


    /**
     * Sets the timeTaxRate1 value for this Invoice.
     * 
     * @param timeTaxRate1
     */
    public void setTimeTaxRate1(java.lang.Double timeTaxRate1) {
        this.timeTaxRate1 = timeTaxRate1;
    }


    /**
     * Gets the expCostDiscPrint value for this Invoice.
     * 
     * @return expCostDiscPrint
     */
    public java.lang.Boolean getExpCostDiscPrint() {
        return expCostDiscPrint;
    }


    /**
     * Sets the expCostDiscPrint value for this Invoice.
     * 
     * @param expCostDiscPrint
     */
    public void setExpCostDiscPrint(java.lang.Boolean expCostDiscPrint) {
        this.expCostDiscPrint = expCostDiscPrint;
    }


    /**
     * Gets the timeTaxCode value for this Invoice.
     * 
     * @return timeTaxCode
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTimeTaxCode() {
        return timeTaxCode;
    }


    /**
     * Sets the timeTaxCode value for this Invoice.
     * 
     * @param timeTaxCode
     */
    public void setTimeTaxCode(com.netsuite.webservices.platform.core_2019_1.RecordRef timeTaxCode) {
        this.timeTaxCode = timeTaxCode;
    }


    /**
     * Gets the timeDiscPrint value for this Invoice.
     * 
     * @return timeDiscPrint
     */
    public java.lang.Boolean getTimeDiscPrint() {
        return timeDiscPrint;
    }


    /**
     * Sets the timeDiscPrint value for this Invoice.
     * 
     * @param timeDiscPrint
     */
    public void setTimeDiscPrint(java.lang.Boolean timeDiscPrint) {
        this.timeDiscPrint = timeDiscPrint;
    }


    /**
     * Gets the giftCertApplied value for this Invoice.
     * 
     * @return giftCertApplied
     */
    public java.lang.Double getGiftCertApplied() {
        return giftCertApplied;
    }


    /**
     * Sets the giftCertApplied value for this Invoice.
     * 
     * @param giftCertApplied
     */
    public void setGiftCertApplied(java.lang.Double giftCertApplied) {
        this.giftCertApplied = giftCertApplied;
    }


    /**
     * Gets the timeDiscTax1Amt value for this Invoice.
     * 
     * @return timeDiscTax1Amt
     */
    public java.lang.Double getTimeDiscTax1Amt() {
        return timeDiscTax1Amt;
    }


    /**
     * Sets the timeDiscTax1Amt value for this Invoice.
     * 
     * @param timeDiscTax1Amt
     */
    public void setTimeDiscTax1Amt(java.lang.Double timeDiscTax1Amt) {
        this.timeDiscTax1Amt = timeDiscTax1Amt;
    }


    /**
     * Gets the tranIsVsoeBundle value for this Invoice.
     * 
     * @return tranIsVsoeBundle
     */
    public java.lang.Boolean getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this Invoice.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(java.lang.Boolean tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the timeTaxRate2 value for this Invoice.
     * 
     * @return timeTaxRate2
     */
    public java.lang.Double getTimeTaxRate2() {
        return timeTaxRate2;
    }


    /**
     * Sets the timeTaxRate2 value for this Invoice.
     * 
     * @param timeTaxRate2
     */
    public void setTimeTaxRate2(java.lang.Double timeTaxRate2) {
        this.timeTaxRate2 = timeTaxRate2;
    }


    /**
     * Gets the vsoeAutoCalc value for this Invoice.
     * 
     * @return vsoeAutoCalc
     */
    public java.lang.Boolean getVsoeAutoCalc() {
        return vsoeAutoCalc;
    }


    /**
     * Sets the vsoeAutoCalc value for this Invoice.
     * 
     * @param vsoeAutoCalc
     */
    public void setVsoeAutoCalc(java.lang.Boolean vsoeAutoCalc) {
        this.vsoeAutoCalc = vsoeAutoCalc;
    }


    /**
     * Gets the syncPartnerTeams value for this Invoice.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this Invoice.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the salesTeamList value for this Invoice.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this Invoice.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.transactions.sales_2019_1.InvoiceSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the partnersList value for this Invoice.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoicePartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this Invoice.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.transactions.sales_2019_1.InvoicePartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the itemList value for this Invoice.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this Invoice.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the itemCostList value for this Invoice.
     * 
     * @return itemCostList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCostList getItemCostList() {
        return itemCostList;
    }


    /**
     * Sets the itemCostList value for this Invoice.
     * 
     * @param itemCostList
     */
    public void setItemCostList(com.netsuite.webservices.transactions.sales_2019_1.InvoiceItemCostList itemCostList) {
        this.itemCostList = itemCostList;
    }


    /**
     * Gets the giftCertRedemptionList value for this Invoice.
     * 
     * @return giftCertRedemptionList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList getGiftCertRedemptionList() {
        return giftCertRedemptionList;
    }


    /**
     * Sets the giftCertRedemptionList value for this Invoice.
     * 
     * @param giftCertRedemptionList
     */
    public void setGiftCertRedemptionList(com.netsuite.webservices.transactions.sales_2019_1.GiftCertRedemptionList giftCertRedemptionList) {
        this.giftCertRedemptionList = giftCertRedemptionList;
    }


    /**
     * Gets the promotionsList value for this Invoice.
     * 
     * @return promotionsList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.PromotionsList getPromotionsList() {
        return promotionsList;
    }


    /**
     * Sets the promotionsList value for this Invoice.
     * 
     * @param promotionsList
     */
    public void setPromotionsList(com.netsuite.webservices.transactions.sales_2019_1.PromotionsList promotionsList) {
        this.promotionsList = promotionsList;
    }


    /**
     * Gets the expCostList value for this Invoice.
     * 
     * @return expCostList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceExpCostList getExpCostList() {
        return expCostList;
    }


    /**
     * Sets the expCostList value for this Invoice.
     * 
     * @param expCostList
     */
    public void setExpCostList(com.netsuite.webservices.transactions.sales_2019_1.InvoiceExpCostList expCostList) {
        this.expCostList = expCostList;
    }


    /**
     * Gets the timeList value for this Invoice.
     * 
     * @return timeList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceTimeList getTimeList() {
        return timeList;
    }


    /**
     * Sets the timeList value for this Invoice.
     * 
     * @param timeList
     */
    public void setTimeList(com.netsuite.webservices.transactions.sales_2019_1.InvoiceTimeList timeList) {
        this.timeList = timeList;
    }


    /**
     * Gets the shipGroupList value for this Invoice.
     * 
     * @return shipGroupList
     */
    public com.netsuite.webservices.transactions.sales_2019_1.InvoiceShipGroupList getShipGroupList() {
        return shipGroupList;
    }


    /**
     * Sets the shipGroupList value for this Invoice.
     * 
     * @param shipGroupList
     */
    public void setShipGroupList(com.netsuite.webservices.transactions.sales_2019_1.InvoiceShipGroupList shipGroupList) {
        this.shipGroupList = shipGroupList;
    }


    /**
     * Gets the approvalStatus value for this Invoice.
     * 
     * @return approvalStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this Invoice.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the accountingBookDetailList value for this Invoice.
     * 
     * @return accountingBookDetailList
     */
    public com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }


    /**
     * Sets the accountingBookDetailList value for this Invoice.
     * 
     * @param accountingBookDetailList
     */
    public void setAccountingBookDetailList(com.netsuite.webservices.platform.common_2019_1.AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }


    /**
     * Gets the taxDetailsList value for this Invoice.
     * 
     * @return taxDetailsList
     */
    public com.netsuite.webservices.platform.common_2019_1.TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }


    /**
     * Sets the taxDetailsList value for this Invoice.
     * 
     * @param taxDetailsList
     */
    public void setTaxDetailsList(com.netsuite.webservices.platform.common_2019_1.TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
    }


    /**
     * Gets the customFieldList value for this Invoice.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Invoice.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Invoice.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Invoice.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Invoice.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Invoice.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
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
            ((this.taxDetailsOverride==null && other.getTaxDetailsOverride()==null) || 
             (this.taxDetailsOverride!=null &&
              this.taxDetailsOverride.equals(other.getTaxDetailsOverride()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.nextApprover==null && other.getNextApprover()==null) || 
             (this.nextApprover!=null &&
              this.nextApprover.equals(other.getNextApprover()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.recurringBill==null && other.getRecurringBill()==null) || 
             (this.recurringBill!=null &&
              this.recurringBill.equals(other.getRecurringBill()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.entityTaxRegNum==null && other.getEntityTaxRegNum()==null) || 
             (this.entityTaxRegNum!=null &&
              this.entityTaxRegNum.equals(other.getEntityTaxRegNum()))) &&
            ((this.taxPointDate==null && other.getTaxPointDate()==null) || 
             (this.taxPointDate!=null &&
              this.taxPointDate.equals(other.getTaxPointDate()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.discountDate==null && other.getDiscountDate()==null) || 
             (this.discountDate!=null &&
              this.discountDate.equals(other.getDiscountDate()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
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
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              this.amountPaid.equals(other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              this.amountRemaining.equals(other.getAmountRemaining()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.onCreditHold==null && other.getOnCreditHold()==null) || 
             (this.onCreditHold!=null &&
              this.onCreditHold.equals(other.getOnCreditHold()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
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
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.shippingTax1Rate==null && other.getShippingTax1Rate()==null) || 
             (this.shippingTax1Rate!=null &&
              this.shippingTax1Rate.equals(other.getShippingTax1Rate()))) &&
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
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.handlingTax2Rate==null && other.getHandlingTax2Rate()==null) || 
             (this.handlingTax2Rate!=null &&
              this.handlingTax2Rate.equals(other.getHandlingTax2Rate()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.linkedTrackingNumbers==null && other.getLinkedTrackingNumbers()==null) || 
             (this.linkedTrackingNumbers!=null &&
              this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.canHaveStackable==null && other.getCanHaveStackable()==null) || 
             (this.canHaveStackable!=null &&
              this.canHaveStackable.equals(other.getCanHaveStackable()))) &&
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
            ((this.syncSalesTeams==null && other.getSyncSalesTeams()==null) || 
             (this.syncSalesTeams!=null &&
              this.syncSalesTeams.equals(other.getSyncSalesTeams()))) &&
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
            ((this.expCostDiscount==null && other.getExpCostDiscount()==null) || 
             (this.expCostDiscount!=null &&
              this.expCostDiscount.equals(other.getExpCostDiscount()))) &&
            ((this.itemCostDiscount==null && other.getItemCostDiscount()==null) || 
             (this.itemCostDiscount!=null &&
              this.itemCostDiscount.equals(other.getItemCostDiscount()))) &&
            ((this.timeDiscount==null && other.getTimeDiscount()==null) || 
             (this.timeDiscount!=null &&
              this.timeDiscount.equals(other.getTimeDiscount()))) &&
            ((this.expCostDiscRate==null && other.getExpCostDiscRate()==null) || 
             (this.expCostDiscRate!=null &&
              this.expCostDiscRate.equals(other.getExpCostDiscRate()))) &&
            ((this.itemCostDiscRate==null && other.getItemCostDiscRate()==null) || 
             (this.itemCostDiscRate!=null &&
              this.itemCostDiscRate.equals(other.getItemCostDiscRate()))) &&
            ((this.timeDiscRate==null && other.getTimeDiscRate()==null) || 
             (this.timeDiscRate!=null &&
              this.timeDiscRate.equals(other.getTimeDiscRate()))) &&
            ((this.expCostDiscAmount==null && other.getExpCostDiscAmount()==null) || 
             (this.expCostDiscAmount!=null &&
              this.expCostDiscAmount.equals(other.getExpCostDiscAmount()))) &&
            ((this.expCostTaxRate1==null && other.getExpCostTaxRate1()==null) || 
             (this.expCostTaxRate1!=null &&
              this.expCostTaxRate1.equals(other.getExpCostTaxRate1()))) &&
            ((this.expCostTaxRate2==null && other.getExpCostTaxRate2()==null) || 
             (this.expCostTaxRate2!=null &&
              this.expCostTaxRate2.equals(other.getExpCostTaxRate2()))) &&
            ((this.itemCostDiscAmount==null && other.getItemCostDiscAmount()==null) || 
             (this.itemCostDiscAmount!=null &&
              this.itemCostDiscAmount.equals(other.getItemCostDiscAmount()))) &&
            ((this.expCostTaxCode==null && other.getExpCostTaxCode()==null) || 
             (this.expCostTaxCode!=null &&
              this.expCostTaxCode.equals(other.getExpCostTaxCode()))) &&
            ((this.expCostDiscTax1Amt==null && other.getExpCostDiscTax1Amt()==null) || 
             (this.expCostDiscTax1Amt!=null &&
              this.expCostDiscTax1Amt.equals(other.getExpCostDiscTax1Amt()))) &&
            ((this.itemCostTaxRate1==null && other.getItemCostTaxRate1()==null) || 
             (this.itemCostTaxRate1!=null &&
              this.itemCostTaxRate1.equals(other.getItemCostTaxRate1()))) &&
            ((this.timeDiscAmount==null && other.getTimeDiscAmount()==null) || 
             (this.timeDiscAmount!=null &&
              this.timeDiscAmount.equals(other.getTimeDiscAmount()))) &&
            ((this.itemCostTaxCode==null && other.getItemCostTaxCode()==null) || 
             (this.itemCostTaxCode!=null &&
              this.itemCostTaxCode.equals(other.getItemCostTaxCode()))) &&
            ((this.expCostDiscTaxable==null && other.getExpCostDiscTaxable()==null) || 
             (this.expCostDiscTaxable!=null &&
              this.expCostDiscTaxable.equals(other.getExpCostDiscTaxable()))) &&
            ((this.itemCostDiscTaxable==null && other.getItemCostDiscTaxable()==null) || 
             (this.itemCostDiscTaxable!=null &&
              this.itemCostDiscTaxable.equals(other.getItemCostDiscTaxable()))) &&
            ((this.itemCostTaxRate2==null && other.getItemCostTaxRate2()==null) || 
             (this.itemCostTaxRate2!=null &&
              this.itemCostTaxRate2.equals(other.getItemCostTaxRate2()))) &&
            ((this.itemCostDiscTax1Amt==null && other.getItemCostDiscTax1Amt()==null) || 
             (this.itemCostDiscTax1Amt!=null &&
              this.itemCostDiscTax1Amt.equals(other.getItemCostDiscTax1Amt()))) &&
            ((this.itemCostDiscPrint==null && other.getItemCostDiscPrint()==null) || 
             (this.itemCostDiscPrint!=null &&
              this.itemCostDiscPrint.equals(other.getItemCostDiscPrint()))) &&
            ((this.timeDiscTaxable==null && other.getTimeDiscTaxable()==null) || 
             (this.timeDiscTaxable!=null &&
              this.timeDiscTaxable.equals(other.getTimeDiscTaxable()))) &&
            ((this.timeTaxRate1==null && other.getTimeTaxRate1()==null) || 
             (this.timeTaxRate1!=null &&
              this.timeTaxRate1.equals(other.getTimeTaxRate1()))) &&
            ((this.expCostDiscPrint==null && other.getExpCostDiscPrint()==null) || 
             (this.expCostDiscPrint!=null &&
              this.expCostDiscPrint.equals(other.getExpCostDiscPrint()))) &&
            ((this.timeTaxCode==null && other.getTimeTaxCode()==null) || 
             (this.timeTaxCode!=null &&
              this.timeTaxCode.equals(other.getTimeTaxCode()))) &&
            ((this.timeDiscPrint==null && other.getTimeDiscPrint()==null) || 
             (this.timeDiscPrint!=null &&
              this.timeDiscPrint.equals(other.getTimeDiscPrint()))) &&
            ((this.giftCertApplied==null && other.getGiftCertApplied()==null) || 
             (this.giftCertApplied!=null &&
              this.giftCertApplied.equals(other.getGiftCertApplied()))) &&
            ((this.timeDiscTax1Amt==null && other.getTimeDiscTax1Amt()==null) || 
             (this.timeDiscTax1Amt!=null &&
              this.timeDiscTax1Amt.equals(other.getTimeDiscTax1Amt()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.timeTaxRate2==null && other.getTimeTaxRate2()==null) || 
             (this.timeTaxRate2!=null &&
              this.timeTaxRate2.equals(other.getTimeTaxRate2()))) &&
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
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.itemCostList==null && other.getItemCostList()==null) || 
             (this.itemCostList!=null &&
              this.itemCostList.equals(other.getItemCostList()))) &&
            ((this.giftCertRedemptionList==null && other.getGiftCertRedemptionList()==null) || 
             (this.giftCertRedemptionList!=null &&
              this.giftCertRedemptionList.equals(other.getGiftCertRedemptionList()))) &&
            ((this.promotionsList==null && other.getPromotionsList()==null) || 
             (this.promotionsList!=null &&
              this.promotionsList.equals(other.getPromotionsList()))) &&
            ((this.expCostList==null && other.getExpCostList()==null) || 
             (this.expCostList!=null &&
              this.expCostList.equals(other.getExpCostList()))) &&
            ((this.timeList==null && other.getTimeList()==null) || 
             (this.timeList!=null &&
              this.timeList.equals(other.getTimeList()))) &&
            ((this.shipGroupList==null && other.getShipGroupList()==null) || 
             (this.shipGroupList!=null &&
              this.shipGroupList.equals(other.getShipGroupList()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
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
        if (getTaxDetailsOverride() != null) {
            _hashCode += getTaxDetailsOverride().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getNextApprover() != null) {
            _hashCode += getNextApprover().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getRecurringBill() != null) {
            _hashCode += getRecurringBill().hashCode();
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
        if (getTaxPointDate() != null) {
            _hashCode += getTaxPointDate().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getDiscountDate() != null) {
            _hashCode += getDiscountDate().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
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
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getAmountPaid() != null) {
            _hashCode += getAmountPaid().hashCode();
        }
        if (getAmountRemaining() != null) {
            _hashCode += getAmountRemaining().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getOnCreditHold() != null) {
            _hashCode += getOnCreditHold().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
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
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getShippingTax1Rate() != null) {
            _hashCode += getShippingTax1Rate().hashCode();
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
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getHandlingTax2Rate() != null) {
            _hashCode += getHandlingTax2Rate().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getLinkedTrackingNumbers() != null) {
            _hashCode += getLinkedTrackingNumbers().hashCode();
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getCanHaveStackable() != null) {
            _hashCode += getCanHaveStackable().hashCode();
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
        if (getSyncSalesTeams() != null) {
            _hashCode += getSyncSalesTeams().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
        }
        if (getExpCostDiscount() != null) {
            _hashCode += getExpCostDiscount().hashCode();
        }
        if (getItemCostDiscount() != null) {
            _hashCode += getItemCostDiscount().hashCode();
        }
        if (getTimeDiscount() != null) {
            _hashCode += getTimeDiscount().hashCode();
        }
        if (getExpCostDiscRate() != null) {
            _hashCode += getExpCostDiscRate().hashCode();
        }
        if (getItemCostDiscRate() != null) {
            _hashCode += getItemCostDiscRate().hashCode();
        }
        if (getTimeDiscRate() != null) {
            _hashCode += getTimeDiscRate().hashCode();
        }
        if (getExpCostDiscAmount() != null) {
            _hashCode += getExpCostDiscAmount().hashCode();
        }
        if (getExpCostTaxRate1() != null) {
            _hashCode += getExpCostTaxRate1().hashCode();
        }
        if (getExpCostTaxRate2() != null) {
            _hashCode += getExpCostTaxRate2().hashCode();
        }
        if (getItemCostDiscAmount() != null) {
            _hashCode += getItemCostDiscAmount().hashCode();
        }
        if (getExpCostTaxCode() != null) {
            _hashCode += getExpCostTaxCode().hashCode();
        }
        if (getExpCostDiscTax1Amt() != null) {
            _hashCode += getExpCostDiscTax1Amt().hashCode();
        }
        if (getItemCostTaxRate1() != null) {
            _hashCode += getItemCostTaxRate1().hashCode();
        }
        if (getTimeDiscAmount() != null) {
            _hashCode += getTimeDiscAmount().hashCode();
        }
        if (getItemCostTaxCode() != null) {
            _hashCode += getItemCostTaxCode().hashCode();
        }
        if (getExpCostDiscTaxable() != null) {
            _hashCode += getExpCostDiscTaxable().hashCode();
        }
        if (getItemCostDiscTaxable() != null) {
            _hashCode += getItemCostDiscTaxable().hashCode();
        }
        if (getItemCostTaxRate2() != null) {
            _hashCode += getItemCostTaxRate2().hashCode();
        }
        if (getItemCostDiscTax1Amt() != null) {
            _hashCode += getItemCostDiscTax1Amt().hashCode();
        }
        if (getItemCostDiscPrint() != null) {
            _hashCode += getItemCostDiscPrint().hashCode();
        }
        if (getTimeDiscTaxable() != null) {
            _hashCode += getTimeDiscTaxable().hashCode();
        }
        if (getTimeTaxRate1() != null) {
            _hashCode += getTimeTaxRate1().hashCode();
        }
        if (getExpCostDiscPrint() != null) {
            _hashCode += getExpCostDiscPrint().hashCode();
        }
        if (getTimeTaxCode() != null) {
            _hashCode += getTimeTaxCode().hashCode();
        }
        if (getTimeDiscPrint() != null) {
            _hashCode += getTimeDiscPrint().hashCode();
        }
        if (getGiftCertApplied() != null) {
            _hashCode += getGiftCertApplied().hashCode();
        }
        if (getTimeDiscTax1Amt() != null) {
            _hashCode += getTimeDiscTax1Amt().hashCode();
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getTimeTaxRate2() != null) {
            _hashCode += getTimeTaxRate2().hashCode();
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
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getItemCostList() != null) {
            _hashCode += getItemCostList().hashCode();
        }
        if (getGiftCertRedemptionList() != null) {
            _hashCode += getGiftCertRedemptionList().hashCode();
        }
        if (getPromotionsList() != null) {
            _hashCode += getPromotionsList().hashCode();
        }
        if (getExpCostList() != null) {
            _hashCode += getExpCostList().hashCode();
        }
        if (getTimeList() != null) {
            _hashCode += getTimeList().hashCode();
        }
        if (getShipGroupList() != null) {
            _hashCode += getShipGroupList().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "Invoice"));
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
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "nextApprover"));
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
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringBill");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "recurringBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "subsidiary"));
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "handlingCost"));
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
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("canHaveStackable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "canHaveStackable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("expCostDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostDiscRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostDiscRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostDiscRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostDiscRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDiscRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeDiscRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostDiscAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostDiscAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostTaxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostTaxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostTaxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostTaxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostDiscAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostDiscAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostDiscTax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostDiscTax1Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostTaxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostTaxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDiscAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeDiscAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostDiscTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostDiscTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostDiscTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostDiscTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostTaxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostTaxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostDiscTax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostDiscTax1Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostDiscPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostDiscPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDiscTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeDiscTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTaxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeTaxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expCostDiscPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostDiscPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDiscPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeDiscPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("timeDiscTax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeDiscTax1Amt"));
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
        elemField.setFieldName("timeTaxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeTaxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoicePartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCostList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "itemCostList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceItemCostList"));
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
        elemField.setFieldName("expCostList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "expCostList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceExpCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "timeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceTimeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "shipGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "InvoiceShipGroupList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2019_1.transactions.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
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
