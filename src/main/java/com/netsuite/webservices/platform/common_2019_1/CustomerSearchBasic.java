/**
 * CustomerSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class CustomerSearchBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField address;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignedSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignedSiteId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField attention;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableOffline;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField boughtAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField boughtDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingTimeFrame;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField ccCustomerCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField ccDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField ccExpDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField ccHolderName;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField ccNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField ccState;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField ccStateFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField ccType;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField city;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField classBought;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField comments;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField companyName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField consolDaysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolDepositBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolOverdueBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField conversionDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField county;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField creditHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField creditHoldOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custStage;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateClosed;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField defaultOrderPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField depositBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField deptBought;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField drAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField email;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField emailTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedBudget;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField explicitConversion;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField faxTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField firstName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField firstOrderDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField firstSaleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fxAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxConsolBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxConsolUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupPricingLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasDuplicates;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField image;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBudgetApproved;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPerson;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReportedLead;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemPricingLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField itemPricingUnitPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemsBought;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemsOrdered;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField lastName;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastOrderDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField lastSaleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField leadDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locationBought;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField manualCreditHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField merchantAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField middleName;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField monthlyClosing;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField onCreditHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField orderedAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField orderedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField otherRelationships;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField overdueBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parentItemsBought;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parentItemsOrdered;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner;

    private com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField pec;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priceLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField prospectDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField pstExempt;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField receivablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField reminderDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField resaleNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField role;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesReadiness;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField salutation;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shippingItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceSiteId;

    private com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage;

    private com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField state;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidBought;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField taxable;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField terms;

    private com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField territory;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField title;

    private com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField url;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField vatRegNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchBooleanField webLead;

    private com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList;

    public CustomerSearchBasic() {
    }

    public CustomerSearchBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField address,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignedSite,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignedSiteId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField attention,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableOffline,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField boughtAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField boughtDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingReason,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingTimeFrame,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField ccCustomerCode,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField ccDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField ccExpDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField ccHolderName,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField ccNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField ccState,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField ccStateFrom,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField ccType,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField city,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField classBought,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField comments,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField companyName,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField consolDaysOverdue,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolDepositBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolOverdueBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField contact,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField conversionDate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField county,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField creditHold,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField creditHoldOverride,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custStage,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateClosed,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOverdue,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField defaultOrderPriority,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField depositBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField deptBought,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField drAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField email,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField emailPreference,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField emailTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedBudget,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField explicitConversion,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField fax,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField faxTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField firstName,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField firstOrderDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField firstSaleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fxAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxConsolBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxConsolUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupPricingLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasDuplicates,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField image,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBudgetApproved,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPerson,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReportedLead,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShipAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemPricingLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField itemPricingUnitPrice,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemsBought,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemsOrdered,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField lastName,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastOrderDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField lastSaleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField leadDate,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locationBought,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField manualCreditHold,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField merchantAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField middleName,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField monthlyClosing,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField onCreditHold,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField orderedAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField orderedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField otherRelationships,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField overdueBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parentItemsBought,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parentItemsOrdered,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner,
           com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField pec,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phone,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priceLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingGroup,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingItem,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField prospectDate,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField pstExempt,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField receivablesAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField reminderDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField resaleNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField role,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesReadiness,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField salutation,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shippingItem,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceSite,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceSiteId,
           com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage,
           com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField state,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidBought,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField taxable,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField terms,
           com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField territory,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField title,
           com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField url,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField vatRegNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchBooleanField webLead,
           com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode,
           com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.assignedSite = assignedSite;
        this.assignedSiteId = assignedSiteId;
        this.attention = attention;
        this.availableOffline = availableOffline;
        this.balance = balance;
        this.billAddress = billAddress;
        this.boughtAmount = boughtAmount;
        this.boughtDate = boughtDate;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this.category = category;
        this.ccCustomerCode = ccCustomerCode;
        this.ccDefault = ccDefault;
        this.ccExpDate = ccExpDate;
        this.ccHolderName = ccHolderName;
        this.ccNumber = ccNumber;
        this.ccState = ccState;
        this.ccStateFrom = ccStateFrom;
        this.ccType = ccType;
        this.city = city;
        this.classBought = classBought;
        this.comments = comments;
        this.companyName = companyName;
        this.consolBalance = consolBalance;
        this.consolDaysOverdue = consolDaysOverdue;
        this.consolDepositBalance = consolDepositBalance;
        this.consolOverdueBalance = consolOverdueBalance;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.contact = contact;
        this.contribution = contribution;
        this.conversionDate = conversionDate;
        this.country = country;
        this.county = county;
        this.creditHold = creditHold;
        this.creditHoldOverride = creditHoldOverride;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.custStage = custStage;
        this.custStatus = custStatus;
        this.dateClosed = dateClosed;
        this.dateCreated = dateCreated;
        this.daysOverdue = daysOverdue;
        this.defaultOrderPriority = defaultOrderPriority;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.depositBalance = depositBalance;
        this.deptBought = deptBought;
        this.drAccount = drAccount;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.endDate = endDate;
        this.entityId = entityId;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.explicitConversion = explicitConversion;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.faxTransactions = faxTransactions;
        this.firstName = firstName;
        this.firstOrderDate = firstOrderDate;
        this.firstSaleDate = firstSaleDate;
        this.fxAccount = fxAccount;
        this.fxBalance = fxBalance;
        this.fxConsolBalance = fxConsolBalance;
        this.fxConsolUnbilledOrders = fxConsolUnbilledOrders;
        this.fxUnbilledOrders = fxUnbilledOrders;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.groupPricingLevel = groupPricingLevel;
        this.hasDuplicates = hasDuplicates;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isBudgetApproved = isBudgetApproved;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isPerson = isPerson;
        this.isReportedLead = isReportedLead;
        this.isShipAddress = isShipAddress;
        this.itemPricingLevel = itemPricingLevel;
        this.itemPricingUnitPrice = itemPricingUnitPrice;
        this.itemsBought = itemsBought;
        this.itemsOrdered = itemsOrdered;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastOrderDate = lastOrderDate;
        this.lastSaleDate = lastSaleDate;
        this.leadDate = leadDate;
        this.leadSource = leadSource;
        this.level = level;
        this.locationBought = locationBought;
        this.manualCreditHold = manualCreditHold;
        this.merchantAccount = merchantAccount;
        this.middleName = middleName;
        this.monthlyClosing = monthlyClosing;
        this.onCreditHold = onCreditHold;
        this.orderedAmount = orderedAmount;
        this.orderedDate = orderedDate;
        this.otherRelationships = otherRelationships;
        this.overdueBalance = overdueBalance;
        this.parent = parent;
        this.parentItemsBought = parentItemsBought;
        this.parentItemsOrdered = parentItemsOrdered;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.priceLevel = priceLevel;
        this.pricingGroup = pricingGroup;
        this.pricingItem = pricingItem;
        this.printTransactions = printTransactions;
        this.prospectDate = prospectDate;
        this.pstExempt = pstExempt;
        this.receivablesAccount = receivablesAccount;
        this.reminderDate = reminderDate;
        this.resaleNumber = resaleNumber;
        this.role = role;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.shipComplete = shipComplete;
        this.shippingItem = shippingItem;
        this.sourceSite = sourceSite;
        this.sourceSiteId = sourceSiteId;
        this.stage = stage;
        this.startDate = startDate;
        this.state = state;
        this.subsidBought = subsidBought;
        this.subsidiary = subsidiary;
        this.taxable = taxable;
        this.terms = terms;
        this.territory = territory;
        this.title = title;
        this.unbilledOrders = unbilledOrders;
        this.url = url;
        this.vatRegNumber = vatRegNumber;
        this.webLead = webLead;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this CustomerSearchBasic.
     * 
     * @return accountNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CustomerSearchBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the address value for this CustomerSearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CustomerSearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this CustomerSearchBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this CustomerSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this CustomerSearchBasic.
     * 
     * @return addressLabel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this CustomerSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this CustomerSearchBasic.
     * 
     * @return addressPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this CustomerSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the assignedSite value for this CustomerSearchBasic.
     * 
     * @return assignedSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssignedSite() {
        return assignedSite;
    }


    /**
     * Sets the assignedSite value for this CustomerSearchBasic.
     * 
     * @param assignedSite
     */
    public void setAssignedSite(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignedSite) {
        this.assignedSite = assignedSite;
    }


    /**
     * Gets the assignedSiteId value for this CustomerSearchBasic.
     * 
     * @return assignedSiteId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getAssignedSiteId() {
        return assignedSiteId;
    }


    /**
     * Sets the assignedSiteId value for this CustomerSearchBasic.
     * 
     * @param assignedSiteId
     */
    public void setAssignedSiteId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField assignedSiteId) {
        this.assignedSiteId = assignedSiteId;
    }


    /**
     * Gets the attention value for this CustomerSearchBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this CustomerSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(com.netsuite.webservices.platform.core_2019_1.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the availableOffline value for this CustomerSearchBasic.
     * 
     * @return availableOffline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this CustomerSearchBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
    }


    /**
     * Gets the balance value for this CustomerSearchBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CustomerSearchBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField balance) {
        this.balance = balance;
    }


    /**
     * Gets the billAddress value for this CustomerSearchBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this CustomerSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the boughtAmount value for this CustomerSearchBasic.
     * 
     * @return boughtAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getBoughtAmount() {
        return boughtAmount;
    }


    /**
     * Sets the boughtAmount value for this CustomerSearchBasic.
     * 
     * @param boughtAmount
     */
    public void setBoughtAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField boughtAmount) {
        this.boughtAmount = boughtAmount;
    }


    /**
     * Gets the boughtDate value for this CustomerSearchBasic.
     * 
     * @return boughtDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getBoughtDate() {
        return boughtDate;
    }


    /**
     * Sets the boughtDate value for this CustomerSearchBasic.
     * 
     * @param boughtDate
     */
    public void setBoughtDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField boughtDate) {
        this.boughtDate = boughtDate;
    }


    /**
     * Gets the buyingReason value for this CustomerSearchBasic.
     * 
     * @return buyingReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this CustomerSearchBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingReason) {
        this.buyingReason = buyingReason;
    }


    /**
     * Gets the buyingTimeFrame value for this CustomerSearchBasic.
     * 
     * @return buyingTimeFrame
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this CustomerSearchBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }


    /**
     * Gets the category value for this CustomerSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CustomerSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the ccCustomerCode value for this CustomerSearchBasic.
     * 
     * @return ccCustomerCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this CustomerSearchBasic.
     * 
     * @param ccCustomerCode
     */
    public void setCcCustomerCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }


    /**
     * Gets the ccDefault value for this CustomerSearchBasic.
     * 
     * @return ccDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCcDefault() {
        return ccDefault;
    }


    /**
     * Sets the ccDefault value for this CustomerSearchBasic.
     * 
     * @param ccDefault
     */
    public void setCcDefault(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField ccDefault) {
        this.ccDefault = ccDefault;
    }


    /**
     * Gets the ccExpDate value for this CustomerSearchBasic.
     * 
     * @return ccExpDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCcExpDate() {
        return ccExpDate;
    }


    /**
     * Sets the ccExpDate value for this CustomerSearchBasic.
     * 
     * @param ccExpDate
     */
    public void setCcExpDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField ccExpDate) {
        this.ccExpDate = ccExpDate;
    }


    /**
     * Gets the ccHolderName value for this CustomerSearchBasic.
     * 
     * @return ccHolderName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCcHolderName() {
        return ccHolderName;
    }


    /**
     * Sets the ccHolderName value for this CustomerSearchBasic.
     * 
     * @param ccHolderName
     */
    public void setCcHolderName(com.netsuite.webservices.platform.core_2019_1.SearchStringField ccHolderName) {
        this.ccHolderName = ccHolderName;
    }


    /**
     * Gets the ccNumber value for this CustomerSearchBasic.
     * 
     * @return ccNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this CustomerSearchBasic.
     * 
     * @param ccNumber
     */
    public void setCcNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccState value for this CustomerSearchBasic.
     * 
     * @return ccState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCcState() {
        return ccState;
    }


    /**
     * Sets the ccState value for this CustomerSearchBasic.
     * 
     * @param ccState
     */
    public void setCcState(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField ccState) {
        this.ccState = ccState;
    }


    /**
     * Gets the ccStateFrom value for this CustomerSearchBasic.
     * 
     * @return ccStateFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getCcStateFrom() {
        return ccStateFrom;
    }


    /**
     * Sets the ccStateFrom value for this CustomerSearchBasic.
     * 
     * @param ccStateFrom
     */
    public void setCcStateFrom(com.netsuite.webservices.platform.core_2019_1.SearchDateField ccStateFrom) {
        this.ccStateFrom = ccStateFrom;
    }


    /**
     * Gets the ccType value for this CustomerSearchBasic.
     * 
     * @return ccType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCcType() {
        return ccType;
    }


    /**
     * Sets the ccType value for this CustomerSearchBasic.
     * 
     * @param ccType
     */
    public void setCcType(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField ccType) {
        this.ccType = ccType;
    }


    /**
     * Gets the city value for this CustomerSearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this CustomerSearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the classBought value for this CustomerSearchBasic.
     * 
     * @return classBought
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getClassBought() {
        return classBought;
    }


    /**
     * Sets the classBought value for this CustomerSearchBasic.
     * 
     * @param classBought
     */
    public void setClassBought(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField classBought) {
        this.classBought = classBought;
    }


    /**
     * Gets the comments value for this CustomerSearchBasic.
     * 
     * @return comments
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CustomerSearchBasic.
     * 
     * @param comments
     */
    public void setComments(com.netsuite.webservices.platform.core_2019_1.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the companyName value for this CustomerSearchBasic.
     * 
     * @return companyName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this CustomerSearchBasic.
     * 
     * @param companyName
     */
    public void setCompanyName(com.netsuite.webservices.platform.core_2019_1.SearchStringField companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the consolBalance value for this CustomerSearchBasic.
     * 
     * @return consolBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getConsolBalance() {
        return consolBalance;
    }


    /**
     * Sets the consolBalance value for this CustomerSearchBasic.
     * 
     * @param consolBalance
     */
    public void setConsolBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolBalance) {
        this.consolBalance = consolBalance;
    }


    /**
     * Gets the consolDaysOverdue value for this CustomerSearchBasic.
     * 
     * @return consolDaysOverdue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getConsolDaysOverdue() {
        return consolDaysOverdue;
    }


    /**
     * Sets the consolDaysOverdue value for this CustomerSearchBasic.
     * 
     * @param consolDaysOverdue
     */
    public void setConsolDaysOverdue(com.netsuite.webservices.platform.core_2019_1.SearchLongField consolDaysOverdue) {
        this.consolDaysOverdue = consolDaysOverdue;
    }


    /**
     * Gets the consolDepositBalance value for this CustomerSearchBasic.
     * 
     * @return consolDepositBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getConsolDepositBalance() {
        return consolDepositBalance;
    }


    /**
     * Sets the consolDepositBalance value for this CustomerSearchBasic.
     * 
     * @param consolDepositBalance
     */
    public void setConsolDepositBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }


    /**
     * Gets the consolOverdueBalance value for this CustomerSearchBasic.
     * 
     * @return consolOverdueBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getConsolOverdueBalance() {
        return consolOverdueBalance;
    }


    /**
     * Sets the consolOverdueBalance value for this CustomerSearchBasic.
     * 
     * @param consolOverdueBalance
     */
    public void setConsolOverdueBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }


    /**
     * Gets the consolUnbilledOrders value for this CustomerSearchBasic.
     * 
     * @return consolUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }


    /**
     * Sets the consolUnbilledOrders value for this CustomerSearchBasic.
     * 
     * @param consolUnbilledOrders
     */
    public void setConsolUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }


    /**
     * Gets the contact value for this CustomerSearchBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this CustomerSearchBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the contribution value for this CustomerSearchBasic.
     * 
     * @return contribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this CustomerSearchBasic.
     * 
     * @param contribution
     */
    public void setContribution(com.netsuite.webservices.platform.core_2019_1.SearchLongField contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the conversionDate value for this CustomerSearchBasic.
     * 
     * @return conversionDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getConversionDate() {
        return conversionDate;
    }


    /**
     * Sets the conversionDate value for this CustomerSearchBasic.
     * 
     * @param conversionDate
     */
    public void setConversionDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField conversionDate) {
        this.conversionDate = conversionDate;
    }


    /**
     * Gets the country value for this CustomerSearchBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CustomerSearchBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this CustomerSearchBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this CustomerSearchBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2019_1.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the creditHold value for this CustomerSearchBasic.
     * 
     * @return creditHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getCreditHold() {
        return creditHold;
    }


    /**
     * Sets the creditHold value for this CustomerSearchBasic.
     * 
     * @param creditHold
     */
    public void setCreditHold(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField creditHold) {
        this.creditHold = creditHold;
    }


    /**
     * Gets the creditHoldOverride value for this CustomerSearchBasic.
     * 
     * @return creditHoldOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getCreditHoldOverride() {
        return creditHoldOverride;
    }


    /**
     * Sets the creditHoldOverride value for this CustomerSearchBasic.
     * 
     * @param creditHoldOverride
     */
    public void setCreditHoldOverride(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }


    /**
     * Gets the creditLimit value for this CustomerSearchBasic.
     * 
     * @return creditLimit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this CustomerSearchBasic.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the currency value for this CustomerSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CustomerSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the custStage value for this CustomerSearchBasic.
     * 
     * @return custStage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustStage() {
        return custStage;
    }


    /**
     * Sets the custStage value for this CustomerSearchBasic.
     * 
     * @param custStage
     */
    public void setCustStage(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custStage) {
        this.custStage = custStage;
    }


    /**
     * Gets the custStatus value for this CustomerSearchBasic.
     * 
     * @return custStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getCustStatus() {
        return custStatus;
    }


    /**
     * Sets the custStatus value for this CustomerSearchBasic.
     * 
     * @param custStatus
     */
    public void setCustStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField custStatus) {
        this.custStatus = custStatus;
    }


    /**
     * Gets the dateClosed value for this CustomerSearchBasic.
     * 
     * @return dateClosed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateClosed() {
        return dateClosed;
    }


    /**
     * Sets the dateClosed value for this CustomerSearchBasic.
     * 
     * @param dateClosed
     */
    public void setDateClosed(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateClosed) {
        this.dateClosed = dateClosed;
    }


    /**
     * Gets the dateCreated value for this CustomerSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this CustomerSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2019_1.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the daysOverdue value for this CustomerSearchBasic.
     * 
     * @return daysOverdue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this CustomerSearchBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(com.netsuite.webservices.platform.core_2019_1.SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }


    /**
     * Gets the defaultOrderPriority value for this CustomerSearchBasic.
     * 
     * @return defaultOrderPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDefaultOrderPriority() {
        return defaultOrderPriority;
    }


    /**
     * Sets the defaultOrderPriority value for this CustomerSearchBasic.
     * 
     * @param defaultOrderPriority
     */
    public void setDefaultOrderPriority(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField defaultOrderPriority) {
        this.defaultOrderPriority = defaultOrderPriority;
    }


    /**
     * Gets the defaultTaxReg value for this CustomerSearchBasic.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this CustomerSearchBasic.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }


    /**
     * Gets the defaultTaxRegText value for this CustomerSearchBasic.
     * 
     * @return defaultTaxRegText
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getDefaultTaxRegText() {
        return defaultTaxRegText;
    }


    /**
     * Sets the defaultTaxRegText value for this CustomerSearchBasic.
     * 
     * @param defaultTaxRegText
     */
    public void setDefaultTaxRegText(com.netsuite.webservices.platform.core_2019_1.SearchStringField defaultTaxRegText) {
        this.defaultTaxRegText = defaultTaxRegText;
    }


    /**
     * Gets the depositBalance value for this CustomerSearchBasic.
     * 
     * @return depositBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getDepositBalance() {
        return depositBalance;
    }


    /**
     * Sets the depositBalance value for this CustomerSearchBasic.
     * 
     * @param depositBalance
     */
    public void setDepositBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField depositBalance) {
        this.depositBalance = depositBalance;
    }


    /**
     * Gets the deptBought value for this CustomerSearchBasic.
     * 
     * @return deptBought
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDeptBought() {
        return deptBought;
    }


    /**
     * Sets the deptBought value for this CustomerSearchBasic.
     * 
     * @param deptBought
     */
    public void setDeptBought(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField deptBought) {
        this.deptBought = deptBought;
    }


    /**
     * Gets the drAccount value for this CustomerSearchBasic.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this CustomerSearchBasic.
     * 
     * @param drAccount
     */
    public void setDrAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField drAccount) {
        this.drAccount = drAccount;
    }


    /**
     * Gets the email value for this CustomerSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CustomerSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2019_1.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the emailPreference value for this CustomerSearchBasic.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this CustomerSearchBasic.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField emailPreference) {
        this.emailPreference = emailPreference;
    }


    /**
     * Gets the emailTransactions value for this CustomerSearchBasic.
     * 
     * @return emailTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this CustomerSearchBasic.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField emailTransactions) {
        this.emailTransactions = emailTransactions;
    }


    /**
     * Gets the endDate value for this CustomerSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CustomerSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the entityId value for this CustomerSearchBasic.
     * 
     * @return entityId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this CustomerSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(com.netsuite.webservices.platform.core_2019_1.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the entityStatus value for this CustomerSearchBasic.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this CustomerSearchBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the estimatedBudget value for this CustomerSearchBasic.
     * 
     * @return estimatedBudget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this CustomerSearchBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }


    /**
     * Gets the explicitConversion value for this CustomerSearchBasic.
     * 
     * @return explicitConversion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getExplicitConversion() {
        return explicitConversion;
    }


    /**
     * Sets the explicitConversion value for this CustomerSearchBasic.
     * 
     * @param explicitConversion
     */
    public void setExplicitConversion(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField explicitConversion) {
        this.explicitConversion = explicitConversion;
    }


    /**
     * Gets the externalId value for this CustomerSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomerSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this CustomerSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this CustomerSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2019_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this CustomerSearchBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this CustomerSearchBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2019_1.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the faxTransactions value for this CustomerSearchBasic.
     * 
     * @return faxTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this CustomerSearchBasic.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField faxTransactions) {
        this.faxTransactions = faxTransactions;
    }


    /**
     * Gets the firstName value for this CustomerSearchBasic.
     * 
     * @return firstName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CustomerSearchBasic.
     * 
     * @param firstName
     */
    public void setFirstName(com.netsuite.webservices.platform.core_2019_1.SearchStringField firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the firstOrderDate value for this CustomerSearchBasic.
     * 
     * @return firstOrderDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getFirstOrderDate() {
        return firstOrderDate;
    }


    /**
     * Sets the firstOrderDate value for this CustomerSearchBasic.
     * 
     * @param firstOrderDate
     */
    public void setFirstOrderDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }


    /**
     * Gets the firstSaleDate value for this CustomerSearchBasic.
     * 
     * @return firstSaleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getFirstSaleDate() {
        return firstSaleDate;
    }


    /**
     * Sets the firstSaleDate value for this CustomerSearchBasic.
     * 
     * @param firstSaleDate
     */
    public void setFirstSaleDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }


    /**
     * Gets the fxAccount value for this CustomerSearchBasic.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this CustomerSearchBasic.
     * 
     * @param fxAccount
     */
    public void setFxAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField fxAccount) {
        this.fxAccount = fxAccount;
    }


    /**
     * Gets the fxBalance value for this CustomerSearchBasic.
     * 
     * @return fxBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxBalance() {
        return fxBalance;
    }


    /**
     * Sets the fxBalance value for this CustomerSearchBasic.
     * 
     * @param fxBalance
     */
    public void setFxBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxBalance) {
        this.fxBalance = fxBalance;
    }


    /**
     * Gets the fxConsolBalance value for this CustomerSearchBasic.
     * 
     * @return fxConsolBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxConsolBalance() {
        return fxConsolBalance;
    }


    /**
     * Sets the fxConsolBalance value for this CustomerSearchBasic.
     * 
     * @param fxConsolBalance
     */
    public void setFxConsolBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxConsolBalance) {
        this.fxConsolBalance = fxConsolBalance;
    }


    /**
     * Gets the fxConsolUnbilledOrders value for this CustomerSearchBasic.
     * 
     * @return fxConsolUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxConsolUnbilledOrders() {
        return fxConsolUnbilledOrders;
    }


    /**
     * Sets the fxConsolUnbilledOrders value for this CustomerSearchBasic.
     * 
     * @param fxConsolUnbilledOrders
     */
    public void setFxConsolUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxConsolUnbilledOrders) {
        this.fxConsolUnbilledOrders = fxConsolUnbilledOrders;
    }


    /**
     * Gets the fxUnbilledOrders value for this CustomerSearchBasic.
     * 
     * @return fxUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getFxUnbilledOrders() {
        return fxUnbilledOrders;
    }


    /**
     * Sets the fxUnbilledOrders value for this CustomerSearchBasic.
     * 
     * @param fxUnbilledOrders
     */
    public void setFxUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField fxUnbilledOrders) {
        this.fxUnbilledOrders = fxUnbilledOrders;
    }


    /**
     * Gets the giveAccess value for this CustomerSearchBasic.
     * 
     * @return giveAccess
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this CustomerSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this CustomerSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this CustomerSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the group value for this CustomerSearchBasic.
     * 
     * @return group
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CustomerSearchBasic.
     * 
     * @param group
     */
    public void setGroup(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the groupPricingLevel value for this CustomerSearchBasic.
     * 
     * @return groupPricingLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getGroupPricingLevel() {
        return groupPricingLevel;
    }


    /**
     * Sets the groupPricingLevel value for this CustomerSearchBasic.
     * 
     * @param groupPricingLevel
     */
    public void setGroupPricingLevel(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField groupPricingLevel) {
        this.groupPricingLevel = groupPricingLevel;
    }


    /**
     * Gets the hasDuplicates value for this CustomerSearchBasic.
     * 
     * @return hasDuplicates
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this CustomerSearchBasic.
     * 
     * @param hasDuplicates
     */
    public void setHasDuplicates(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }


    /**
     * Gets the image value for this CustomerSearchBasic.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this CustomerSearchBasic.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the internalId value for this CustomerSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CustomerSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CustomerSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2019_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isBudgetApproved value for this CustomerSearchBasic.
     * 
     * @return isBudgetApproved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this CustomerSearchBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }


    /**
     * Gets the isDefaultBilling value for this CustomerSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this CustomerSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this CustomerSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this CustomerSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isInactive value for this CustomerSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomerSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isPerson value for this CustomerSearchBasic.
     * 
     * @return isPerson
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this CustomerSearchBasic.
     * 
     * @param isPerson
     */
    public void setIsPerson(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the isReportedLead value for this CustomerSearchBasic.
     * 
     * @return isReportedLead
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsReportedLead() {
        return isReportedLead;
    }


    /**
     * Sets the isReportedLead value for this CustomerSearchBasic.
     * 
     * @param isReportedLead
     */
    public void setIsReportedLead(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isReportedLead) {
        this.isReportedLead = isReportedLead;
    }


    /**
     * Gets the isShipAddress value for this CustomerSearchBasic.
     * 
     * @return isShipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this CustomerSearchBasic.
     * 
     * @param isShipAddress
     */
    public void setIsShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField isShipAddress) {
        this.isShipAddress = isShipAddress;
    }


    /**
     * Gets the itemPricingLevel value for this CustomerSearchBasic.
     * 
     * @return itemPricingLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemPricingLevel() {
        return itemPricingLevel;
    }


    /**
     * Sets the itemPricingLevel value for this CustomerSearchBasic.
     * 
     * @param itemPricingLevel
     */
    public void setItemPricingLevel(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemPricingLevel) {
        this.itemPricingLevel = itemPricingLevel;
    }


    /**
     * Gets the itemPricingUnitPrice value for this CustomerSearchBasic.
     * 
     * @return itemPricingUnitPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getItemPricingUnitPrice() {
        return itemPricingUnitPrice;
    }


    /**
     * Sets the itemPricingUnitPrice value for this CustomerSearchBasic.
     * 
     * @param itemPricingUnitPrice
     */
    public void setItemPricingUnitPrice(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField itemPricingUnitPrice) {
        this.itemPricingUnitPrice = itemPricingUnitPrice;
    }


    /**
     * Gets the itemsBought value for this CustomerSearchBasic.
     * 
     * @return itemsBought
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemsBought() {
        return itemsBought;
    }


    /**
     * Sets the itemsBought value for this CustomerSearchBasic.
     * 
     * @param itemsBought
     */
    public void setItemsBought(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemsBought) {
        this.itemsBought = itemsBought;
    }


    /**
     * Gets the itemsOrdered value for this CustomerSearchBasic.
     * 
     * @return itemsOrdered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getItemsOrdered() {
        return itemsOrdered;
    }


    /**
     * Sets the itemsOrdered value for this CustomerSearchBasic.
     * 
     * @param itemsOrdered
     */
    public void setItemsOrdered(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }


    /**
     * Gets the language value for this CustomerSearchBasic.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this CustomerSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedDate value for this CustomerSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CustomerSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this CustomerSearchBasic.
     * 
     * @return lastName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CustomerSearchBasic.
     * 
     * @param lastName
     */
    public void setLastName(com.netsuite.webservices.platform.core_2019_1.SearchStringField lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastOrderDate value for this CustomerSearchBasic.
     * 
     * @return lastOrderDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastOrderDate() {
        return lastOrderDate;
    }


    /**
     * Sets the lastOrderDate value for this CustomerSearchBasic.
     * 
     * @param lastOrderDate
     */
    public void setLastOrderDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }


    /**
     * Gets the lastSaleDate value for this CustomerSearchBasic.
     * 
     * @return lastSaleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLastSaleDate() {
        return lastSaleDate;
    }


    /**
     * Sets the lastSaleDate value for this CustomerSearchBasic.
     * 
     * @param lastSaleDate
     */
    public void setLastSaleDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField lastSaleDate) {
        this.lastSaleDate = lastSaleDate;
    }


    /**
     * Gets the leadDate value for this CustomerSearchBasic.
     * 
     * @return leadDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getLeadDate() {
        return leadDate;
    }


    /**
     * Sets the leadDate value for this CustomerSearchBasic.
     * 
     * @param leadDate
     */
    public void setLeadDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField leadDate) {
        this.leadDate = leadDate;
    }


    /**
     * Gets the leadSource value for this CustomerSearchBasic.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this CustomerSearchBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the level value for this CustomerSearchBasic.
     * 
     * @return level
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this CustomerSearchBasic.
     * 
     * @param level
     */
    public void setLevel(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the locationBought value for this CustomerSearchBasic.
     * 
     * @return locationBought
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getLocationBought() {
        return locationBought;
    }


    /**
     * Sets the locationBought value for this CustomerSearchBasic.
     * 
     * @param locationBought
     */
    public void setLocationBought(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField locationBought) {
        this.locationBought = locationBought;
    }


    /**
     * Gets the manualCreditHold value for this CustomerSearchBasic.
     * 
     * @return manualCreditHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getManualCreditHold() {
        return manualCreditHold;
    }


    /**
     * Sets the manualCreditHold value for this CustomerSearchBasic.
     * 
     * @param manualCreditHold
     */
    public void setManualCreditHold(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField manualCreditHold) {
        this.manualCreditHold = manualCreditHold;
    }


    /**
     * Gets the merchantAccount value for this CustomerSearchBasic.
     * 
     * @return merchantAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this CustomerSearchBasic.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField merchantAccount) {
        this.merchantAccount = merchantAccount;
    }


    /**
     * Gets the middleName value for this CustomerSearchBasic.
     * 
     * @return middleName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this CustomerSearchBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(com.netsuite.webservices.platform.core_2019_1.SearchStringField middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the monthlyClosing value for this CustomerSearchBasic.
     * 
     * @return monthlyClosing
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getMonthlyClosing() {
        return monthlyClosing;
    }


    /**
     * Sets the monthlyClosing value for this CustomerSearchBasic.
     * 
     * @param monthlyClosing
     */
    public void setMonthlyClosing(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField monthlyClosing) {
        this.monthlyClosing = monthlyClosing;
    }


    /**
     * Gets the onCreditHold value for this CustomerSearchBasic.
     * 
     * @return onCreditHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getOnCreditHold() {
        return onCreditHold;
    }


    /**
     * Sets the onCreditHold value for this CustomerSearchBasic.
     * 
     * @param onCreditHold
     */
    public void setOnCreditHold(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField onCreditHold) {
        this.onCreditHold = onCreditHold;
    }


    /**
     * Gets the orderedAmount value for this CustomerSearchBasic.
     * 
     * @return orderedAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOrderedAmount() {
        return orderedAmount;
    }


    /**
     * Sets the orderedAmount value for this CustomerSearchBasic.
     * 
     * @param orderedAmount
     */
    public void setOrderedAmount(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField orderedAmount) {
        this.orderedAmount = orderedAmount;
    }


    /**
     * Gets the orderedDate value for this CustomerSearchBasic.
     * 
     * @return orderedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getOrderedDate() {
        return orderedDate;
    }


    /**
     * Sets the orderedDate value for this CustomerSearchBasic.
     * 
     * @param orderedDate
     */
    public void setOrderedDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField orderedDate) {
        this.orderedDate = orderedDate;
    }


    /**
     * Gets the otherRelationships value for this CustomerSearchBasic.
     * 
     * @return otherRelationships
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }


    /**
     * Sets the otherRelationships value for this CustomerSearchBasic.
     * 
     * @param otherRelationships
     */
    public void setOtherRelationships(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }


    /**
     * Gets the overdueBalance value for this CustomerSearchBasic.
     * 
     * @return overdueBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getOverdueBalance() {
        return overdueBalance;
    }


    /**
     * Sets the overdueBalance value for this CustomerSearchBasic.
     * 
     * @param overdueBalance
     */
    public void setOverdueBalance(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField overdueBalance) {
        this.overdueBalance = overdueBalance;
    }


    /**
     * Gets the parent value for this CustomerSearchBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CustomerSearchBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentItemsBought value for this CustomerSearchBasic.
     * 
     * @return parentItemsBought
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParentItemsBought() {
        return parentItemsBought;
    }


    /**
     * Sets the parentItemsBought value for this CustomerSearchBasic.
     * 
     * @param parentItemsBought
     */
    public void setParentItemsBought(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parentItemsBought) {
        this.parentItemsBought = parentItemsBought;
    }


    /**
     * Gets the parentItemsOrdered value for this CustomerSearchBasic.
     * 
     * @return parentItemsOrdered
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getParentItemsOrdered() {
        return parentItemsOrdered;
    }


    /**
     * Sets the parentItemsOrdered value for this CustomerSearchBasic.
     * 
     * @param parentItemsOrdered
     */
    public void setParentItemsOrdered(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField parentItemsOrdered) {
        this.parentItemsOrdered = parentItemsOrdered;
    }


    /**
     * Gets the partner value for this CustomerSearchBasic.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this CustomerSearchBasic.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partner) {
        this.partner = partner;
    }


    /**
     * Gets the partnerContribution value for this CustomerSearchBasic.
     * 
     * @return partnerContribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchLongField getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this CustomerSearchBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(com.netsuite.webservices.platform.core_2019_1.SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }


    /**
     * Gets the partnerRole value for this CustomerSearchBasic.
     * 
     * @return partnerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this CustomerSearchBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }


    /**
     * Gets the partnerTeamMember value for this CustomerSearchBasic.
     * 
     * @return partnerTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this CustomerSearchBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }


    /**
     * Gets the pec value for this CustomerSearchBasic.
     * 
     * @return pec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this CustomerSearchBasic.
     * 
     * @param pec
     */
    public void setPec(com.netsuite.webservices.platform.core_2019_1.SearchStringField pec) {
        this.pec = pec;
    }


    /**
     * Gets the permission value for this CustomerSearchBasic.
     * 
     * @return permission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this CustomerSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the phone value for this CustomerSearchBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this CustomerSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this CustomerSearchBasic.
     * 
     * @return phoneticName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this CustomerSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(com.netsuite.webservices.platform.core_2019_1.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the priceLevel value for this CustomerSearchBasic.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this CustomerSearchBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the pricingGroup value for this CustomerSearchBasic.
     * 
     * @return pricingGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this CustomerSearchBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the pricingItem value for this CustomerSearchBasic.
     * 
     * @return pricingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getPricingItem() {
        return pricingItem;
    }


    /**
     * Sets the pricingItem value for this CustomerSearchBasic.
     * 
     * @param pricingItem
     */
    public void setPricingItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField pricingItem) {
        this.pricingItem = pricingItem;
    }


    /**
     * Gets the printTransactions value for this CustomerSearchBasic.
     * 
     * @return printTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this CustomerSearchBasic.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField printTransactions) {
        this.printTransactions = printTransactions;
    }


    /**
     * Gets the prospectDate value for this CustomerSearchBasic.
     * 
     * @return prospectDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getProspectDate() {
        return prospectDate;
    }


    /**
     * Sets the prospectDate value for this CustomerSearchBasic.
     * 
     * @param prospectDate
     */
    public void setProspectDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField prospectDate) {
        this.prospectDate = prospectDate;
    }


    /**
     * Gets the pstExempt value for this CustomerSearchBasic.
     * 
     * @return pstExempt
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getPstExempt() {
        return pstExempt;
    }


    /**
     * Sets the pstExempt value for this CustomerSearchBasic.
     * 
     * @param pstExempt
     */
    public void setPstExempt(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField pstExempt) {
        this.pstExempt = pstExempt;
    }


    /**
     * Gets the receivablesAccount value for this CustomerSearchBasic.
     * 
     * @return receivablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getReceivablesAccount() {
        return receivablesAccount;
    }


    /**
     * Sets the receivablesAccount value for this CustomerSearchBasic.
     * 
     * @param receivablesAccount
     */
    public void setReceivablesAccount(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }


    /**
     * Gets the reminderDate value for this CustomerSearchBasic.
     * 
     * @return reminderDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getReminderDate() {
        return reminderDate;
    }


    /**
     * Sets the reminderDate value for this CustomerSearchBasic.
     * 
     * @param reminderDate
     */
    public void setReminderDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField reminderDate) {
        this.reminderDate = reminderDate;
    }


    /**
     * Gets the resaleNumber value for this CustomerSearchBasic.
     * 
     * @return resaleNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getResaleNumber() {
        return resaleNumber;
    }


    /**
     * Sets the resaleNumber value for this CustomerSearchBasic.
     * 
     * @param resaleNumber
     */
    public void setResaleNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField resaleNumber) {
        this.resaleNumber = resaleNumber;
    }


    /**
     * Gets the role value for this CustomerSearchBasic.
     * 
     * @return role
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getRole() {
        return role;
    }


    /**
     * Sets the role value for this CustomerSearchBasic.
     * 
     * @param role
     */
    public void setRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField role) {
        this.role = role;
    }


    /**
     * Gets the salesReadiness value for this CustomerSearchBasic.
     * 
     * @return salesReadiness
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this CustomerSearchBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesReadiness) {
        this.salesReadiness = salesReadiness;
    }


    /**
     * Gets the salesRep value for this CustomerSearchBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this CustomerSearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesTeamMember value for this CustomerSearchBasic.
     * 
     * @return salesTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this CustomerSearchBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }


    /**
     * Gets the salesTeamRole value for this CustomerSearchBasic.
     * 
     * @return salesTeamRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this CustomerSearchBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }


    /**
     * Gets the salutation value for this CustomerSearchBasic.
     * 
     * @return salutation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this CustomerSearchBasic.
     * 
     * @param salutation
     */
    public void setSalutation(com.netsuite.webservices.platform.core_2019_1.SearchStringField salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the shipAddress value for this CustomerSearchBasic.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this CustomerSearchBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(com.netsuite.webservices.platform.core_2019_1.SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipComplete value for this CustomerSearchBasic.
     * 
     * @return shipComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this CustomerSearchBasic.
     * 
     * @param shipComplete
     */
    public void setShipComplete(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the shippingItem value for this CustomerSearchBasic.
     * 
     * @return shippingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getShippingItem() {
        return shippingItem;
    }


    /**
     * Sets the shippingItem value for this CustomerSearchBasic.
     * 
     * @param shippingItem
     */
    public void setShippingItem(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField shippingItem) {
        this.shippingItem = shippingItem;
    }


    /**
     * Gets the sourceSite value for this CustomerSearchBasic.
     * 
     * @return sourceSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSourceSite() {
        return sourceSite;
    }


    /**
     * Sets the sourceSite value for this CustomerSearchBasic.
     * 
     * @param sourceSite
     */
    public void setSourceSite(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceSite) {
        this.sourceSite = sourceSite;
    }


    /**
     * Gets the sourceSiteId value for this CustomerSearchBasic.
     * 
     * @return sourceSiteId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSourceSiteId() {
        return sourceSiteId;
    }


    /**
     * Sets the sourceSiteId value for this CustomerSearchBasic.
     * 
     * @param sourceSiteId
     */
    public void setSourceSiteId(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }


    /**
     * Gets the stage value for this CustomerSearchBasic.
     * 
     * @return stage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this CustomerSearchBasic.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.platform.core_2019_1.SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }


    /**
     * Gets the startDate value for this CustomerSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CustomerSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2019_1.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the state value for this CustomerSearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this CustomerSearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidBought value for this CustomerSearchBasic.
     * 
     * @return subsidBought
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidBought() {
        return subsidBought;
    }


    /**
     * Sets the subsidBought value for this CustomerSearchBasic.
     * 
     * @param subsidBought
     */
    public void setSubsidBought(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidBought) {
        this.subsidBought = subsidBought;
    }


    /**
     * Gets the subsidiary value for this CustomerSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this CustomerSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxable value for this CustomerSearchBasic.
     * 
     * @return taxable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this CustomerSearchBasic.
     * 
     * @param taxable
     */
    public void setTaxable(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the terms value for this CustomerSearchBasic.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this CustomerSearchBasic.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField terms) {
        this.terms = terms;
    }


    /**
     * Gets the territory value for this CustomerSearchBasic.
     * 
     * @return territory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField getTerritory() {
        return territory;
    }


    /**
     * Sets the territory value for this CustomerSearchBasic.
     * 
     * @param territory
     */
    public void setTerritory(com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField territory) {
        this.territory = territory;
    }


    /**
     * Gets the title value for this CustomerSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CustomerSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2019_1.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the unbilledOrders value for this CustomerSearchBasic.
     * 
     * @return unbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchDoubleField getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this CustomerSearchBasic.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchDoubleField unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the url value for this CustomerSearchBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getUrl() {
        return url;
    }


    /**
     * Sets the url value for this CustomerSearchBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchStringField url) {
        this.url = url;
    }


    /**
     * Gets the vatRegNumber value for this CustomerSearchBasic.
     * 
     * @return vatRegNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this CustomerSearchBasic.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(com.netsuite.webservices.platform.core_2019_1.SearchStringField vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }


    /**
     * Gets the webLead value for this CustomerSearchBasic.
     * 
     * @return webLead
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchBooleanField getWebLead() {
        return webLead;
    }


    /**
     * Sets the webLead value for this CustomerSearchBasic.
     * 
     * @param webLead
     */
    public void setWebLead(com.netsuite.webservices.platform.core_2019_1.SearchBooleanField webLead) {
        this.webLead = webLead;
    }


    /**
     * Gets the zipCode value for this CustomerSearchBasic.
     * 
     * @return zipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this CustomerSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(com.netsuite.webservices.platform.core_2019_1.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this CustomerSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomerSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSearchBasic)) return false;
        CustomerSearchBasic other = (CustomerSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addressLabel==null && other.getAddressLabel()==null) || 
             (this.addressLabel!=null &&
              this.addressLabel.equals(other.getAddressLabel()))) &&
            ((this.addressPhone==null && other.getAddressPhone()==null) || 
             (this.addressPhone!=null &&
              this.addressPhone.equals(other.getAddressPhone()))) &&
            ((this.assignedSite==null && other.getAssignedSite()==null) || 
             (this.assignedSite!=null &&
              this.assignedSite.equals(other.getAssignedSite()))) &&
            ((this.assignedSiteId==null && other.getAssignedSiteId()==null) || 
             (this.assignedSiteId!=null &&
              this.assignedSiteId.equals(other.getAssignedSiteId()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              this.availableOffline.equals(other.getAvailableOffline()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.boughtAmount==null && other.getBoughtAmount()==null) || 
             (this.boughtAmount!=null &&
              this.boughtAmount.equals(other.getBoughtAmount()))) &&
            ((this.boughtDate==null && other.getBoughtDate()==null) || 
             (this.boughtDate!=null &&
              this.boughtDate.equals(other.getBoughtDate()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              this.buyingReason.equals(other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              this.buyingTimeFrame.equals(other.getBuyingTimeFrame()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              this.ccCustomerCode.equals(other.getCcCustomerCode()))) &&
            ((this.ccDefault==null && other.getCcDefault()==null) || 
             (this.ccDefault!=null &&
              this.ccDefault.equals(other.getCcDefault()))) &&
            ((this.ccExpDate==null && other.getCcExpDate()==null) || 
             (this.ccExpDate!=null &&
              this.ccExpDate.equals(other.getCcExpDate()))) &&
            ((this.ccHolderName==null && other.getCcHolderName()==null) || 
             (this.ccHolderName!=null &&
              this.ccHolderName.equals(other.getCcHolderName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccState==null && other.getCcState()==null) || 
             (this.ccState!=null &&
              this.ccState.equals(other.getCcState()))) &&
            ((this.ccStateFrom==null && other.getCcStateFrom()==null) || 
             (this.ccStateFrom!=null &&
              this.ccStateFrom.equals(other.getCcStateFrom()))) &&
            ((this.ccType==null && other.getCcType()==null) || 
             (this.ccType!=null &&
              this.ccType.equals(other.getCcType()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.classBought==null && other.getClassBought()==null) || 
             (this.classBought!=null &&
              this.classBought.equals(other.getClassBought()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.consolBalance==null && other.getConsolBalance()==null) || 
             (this.consolBalance!=null &&
              this.consolBalance.equals(other.getConsolBalance()))) &&
            ((this.consolDaysOverdue==null && other.getConsolDaysOverdue()==null) || 
             (this.consolDaysOverdue!=null &&
              this.consolDaysOverdue.equals(other.getConsolDaysOverdue()))) &&
            ((this.consolDepositBalance==null && other.getConsolDepositBalance()==null) || 
             (this.consolDepositBalance!=null &&
              this.consolDepositBalance.equals(other.getConsolDepositBalance()))) &&
            ((this.consolOverdueBalance==null && other.getConsolOverdueBalance()==null) || 
             (this.consolOverdueBalance!=null &&
              this.consolOverdueBalance.equals(other.getConsolOverdueBalance()))) &&
            ((this.consolUnbilledOrders==null && other.getConsolUnbilledOrders()==null) || 
             (this.consolUnbilledOrders!=null &&
              this.consolUnbilledOrders.equals(other.getConsolUnbilledOrders()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.conversionDate==null && other.getConversionDate()==null) || 
             (this.conversionDate!=null &&
              this.conversionDate.equals(other.getConversionDate()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.creditHold==null && other.getCreditHold()==null) || 
             (this.creditHold!=null &&
              this.creditHold.equals(other.getCreditHold()))) &&
            ((this.creditHoldOverride==null && other.getCreditHoldOverride()==null) || 
             (this.creditHoldOverride!=null &&
              this.creditHoldOverride.equals(other.getCreditHoldOverride()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.custStage==null && other.getCustStage()==null) || 
             (this.custStage!=null &&
              this.custStage.equals(other.getCustStage()))) &&
            ((this.custStatus==null && other.getCustStatus()==null) || 
             (this.custStatus!=null &&
              this.custStatus.equals(other.getCustStatus()))) &&
            ((this.dateClosed==null && other.getDateClosed()==null) || 
             (this.dateClosed!=null &&
              this.dateClosed.equals(other.getDateClosed()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              this.daysOverdue.equals(other.getDaysOverdue()))) &&
            ((this.defaultOrderPriority==null && other.getDefaultOrderPriority()==null) || 
             (this.defaultOrderPriority!=null &&
              this.defaultOrderPriority.equals(other.getDefaultOrderPriority()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              this.defaultTaxReg.equals(other.getDefaultTaxReg()))) &&
            ((this.defaultTaxRegText==null && other.getDefaultTaxRegText()==null) || 
             (this.defaultTaxRegText!=null &&
              this.defaultTaxRegText.equals(other.getDefaultTaxRegText()))) &&
            ((this.depositBalance==null && other.getDepositBalance()==null) || 
             (this.depositBalance!=null &&
              this.depositBalance.equals(other.getDepositBalance()))) &&
            ((this.deptBought==null && other.getDeptBought()==null) || 
             (this.deptBought!=null &&
              this.deptBought.equals(other.getDeptBought()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              this.drAccount.equals(other.getDrAccount()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              this.emailPreference.equals(other.getEmailPreference()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              this.emailTransactions.equals(other.getEmailTransactions()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              this.estimatedBudget.equals(other.getEstimatedBudget()))) &&
            ((this.explicitConversion==null && other.getExplicitConversion()==null) || 
             (this.explicitConversion!=null &&
              this.explicitConversion.equals(other.getExplicitConversion()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              this.faxTransactions.equals(other.getFaxTransactions()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.firstOrderDate==null && other.getFirstOrderDate()==null) || 
             (this.firstOrderDate!=null &&
              this.firstOrderDate.equals(other.getFirstOrderDate()))) &&
            ((this.firstSaleDate==null && other.getFirstSaleDate()==null) || 
             (this.firstSaleDate!=null &&
              this.firstSaleDate.equals(other.getFirstSaleDate()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              this.fxAccount.equals(other.getFxAccount()))) &&
            ((this.fxBalance==null && other.getFxBalance()==null) || 
             (this.fxBalance!=null &&
              this.fxBalance.equals(other.getFxBalance()))) &&
            ((this.fxConsolBalance==null && other.getFxConsolBalance()==null) || 
             (this.fxConsolBalance!=null &&
              this.fxConsolBalance.equals(other.getFxConsolBalance()))) &&
            ((this.fxConsolUnbilledOrders==null && other.getFxConsolUnbilledOrders()==null) || 
             (this.fxConsolUnbilledOrders!=null &&
              this.fxConsolUnbilledOrders.equals(other.getFxConsolUnbilledOrders()))) &&
            ((this.fxUnbilledOrders==null && other.getFxUnbilledOrders()==null) || 
             (this.fxUnbilledOrders!=null &&
              this.fxUnbilledOrders.equals(other.getFxUnbilledOrders()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.groupPricingLevel==null && other.getGroupPricingLevel()==null) || 
             (this.groupPricingLevel!=null &&
              this.groupPricingLevel.equals(other.getGroupPricingLevel()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              this.hasDuplicates.equals(other.getHasDuplicates()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              this.isBudgetApproved.equals(other.getIsBudgetApproved()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              this.isDefaultBilling.equals(other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              this.isDefaultShipping.equals(other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              this.isPerson.equals(other.getIsPerson()))) &&
            ((this.isReportedLead==null && other.getIsReportedLead()==null) || 
             (this.isReportedLead!=null &&
              this.isReportedLead.equals(other.getIsReportedLead()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              this.isShipAddress.equals(other.getIsShipAddress()))) &&
            ((this.itemPricingLevel==null && other.getItemPricingLevel()==null) || 
             (this.itemPricingLevel!=null &&
              this.itemPricingLevel.equals(other.getItemPricingLevel()))) &&
            ((this.itemPricingUnitPrice==null && other.getItemPricingUnitPrice()==null) || 
             (this.itemPricingUnitPrice!=null &&
              this.itemPricingUnitPrice.equals(other.getItemPricingUnitPrice()))) &&
            ((this.itemsBought==null && other.getItemsBought()==null) || 
             (this.itemsBought!=null &&
              this.itemsBought.equals(other.getItemsBought()))) &&
            ((this.itemsOrdered==null && other.getItemsOrdered()==null) || 
             (this.itemsOrdered!=null &&
              this.itemsOrdered.equals(other.getItemsOrdered()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastOrderDate==null && other.getLastOrderDate()==null) || 
             (this.lastOrderDate!=null &&
              this.lastOrderDate.equals(other.getLastOrderDate()))) &&
            ((this.lastSaleDate==null && other.getLastSaleDate()==null) || 
             (this.lastSaleDate!=null &&
              this.lastSaleDate.equals(other.getLastSaleDate()))) &&
            ((this.leadDate==null && other.getLeadDate()==null) || 
             (this.leadDate!=null &&
              this.leadDate.equals(other.getLeadDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.locationBought==null && other.getLocationBought()==null) || 
             (this.locationBought!=null &&
              this.locationBought.equals(other.getLocationBought()))) &&
            ((this.manualCreditHold==null && other.getManualCreditHold()==null) || 
             (this.manualCreditHold!=null &&
              this.manualCreditHold.equals(other.getManualCreditHold()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              this.merchantAccount.equals(other.getMerchantAccount()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.monthlyClosing==null && other.getMonthlyClosing()==null) || 
             (this.monthlyClosing!=null &&
              this.monthlyClosing.equals(other.getMonthlyClosing()))) &&
            ((this.onCreditHold==null && other.getOnCreditHold()==null) || 
             (this.onCreditHold!=null &&
              this.onCreditHold.equals(other.getOnCreditHold()))) &&
            ((this.orderedAmount==null && other.getOrderedAmount()==null) || 
             (this.orderedAmount!=null &&
              this.orderedAmount.equals(other.getOrderedAmount()))) &&
            ((this.orderedDate==null && other.getOrderedDate()==null) || 
             (this.orderedDate!=null &&
              this.orderedDate.equals(other.getOrderedDate()))) &&
            ((this.otherRelationships==null && other.getOtherRelationships()==null) || 
             (this.otherRelationships!=null &&
              this.otherRelationships.equals(other.getOtherRelationships()))) &&
            ((this.overdueBalance==null && other.getOverdueBalance()==null) || 
             (this.overdueBalance!=null &&
              this.overdueBalance.equals(other.getOverdueBalance()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentItemsBought==null && other.getParentItemsBought()==null) || 
             (this.parentItemsBought!=null &&
              this.parentItemsBought.equals(other.getParentItemsBought()))) &&
            ((this.parentItemsOrdered==null && other.getParentItemsOrdered()==null) || 
             (this.parentItemsOrdered!=null &&
              this.parentItemsOrdered.equals(other.getParentItemsOrdered()))) &&
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
            ((this.pec==null && other.getPec()==null) || 
             (this.pec!=null &&
              this.pec.equals(other.getPec()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.pricingItem==null && other.getPricingItem()==null) || 
             (this.pricingItem!=null &&
              this.pricingItem.equals(other.getPricingItem()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              this.printTransactions.equals(other.getPrintTransactions()))) &&
            ((this.prospectDate==null && other.getProspectDate()==null) || 
             (this.prospectDate!=null &&
              this.prospectDate.equals(other.getProspectDate()))) &&
            ((this.pstExempt==null && other.getPstExempt()==null) || 
             (this.pstExempt!=null &&
              this.pstExempt.equals(other.getPstExempt()))) &&
            ((this.receivablesAccount==null && other.getReceivablesAccount()==null) || 
             (this.receivablesAccount!=null &&
              this.receivablesAccount.equals(other.getReceivablesAccount()))) &&
            ((this.reminderDate==null && other.getReminderDate()==null) || 
             (this.reminderDate!=null &&
              this.reminderDate.equals(other.getReminderDate()))) &&
            ((this.resaleNumber==null && other.getResaleNumber()==null) || 
             (this.resaleNumber!=null &&
              this.resaleNumber.equals(other.getResaleNumber()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              this.salesReadiness.equals(other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              this.salesTeamMember.equals(other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              this.salesTeamRole.equals(other.getSalesTeamRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.shippingItem==null && other.getShippingItem()==null) || 
             (this.shippingItem!=null &&
              this.shippingItem.equals(other.getShippingItem()))) &&
            ((this.sourceSite==null && other.getSourceSite()==null) || 
             (this.sourceSite!=null &&
              this.sourceSite.equals(other.getSourceSite()))) &&
            ((this.sourceSiteId==null && other.getSourceSiteId()==null) || 
             (this.sourceSiteId!=null &&
              this.sourceSiteId.equals(other.getSourceSiteId()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidBought==null && other.getSubsidBought()==null) || 
             (this.subsidBought!=null &&
              this.subsidBought.equals(other.getSubsidBought()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.territory==null && other.getTerritory()==null) || 
             (this.territory!=null &&
              this.territory.equals(other.getTerritory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              this.vatRegNumber.equals(other.getVatRegNumber()))) &&
            ((this.webLead==null && other.getWebLead()==null) || 
             (this.webLead!=null &&
              this.webLead.equals(other.getWebLead()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddressLabel() != null) {
            _hashCode += getAddressLabel().hashCode();
        }
        if (getAddressPhone() != null) {
            _hashCode += getAddressPhone().hashCode();
        }
        if (getAssignedSite() != null) {
            _hashCode += getAssignedSite().hashCode();
        }
        if (getAssignedSiteId() != null) {
            _hashCode += getAssignedSiteId().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAvailableOffline() != null) {
            _hashCode += getAvailableOffline().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getBoughtAmount() != null) {
            _hashCode += getBoughtAmount().hashCode();
        }
        if (getBoughtDate() != null) {
            _hashCode += getBoughtDate().hashCode();
        }
        if (getBuyingReason() != null) {
            _hashCode += getBuyingReason().hashCode();
        }
        if (getBuyingTimeFrame() != null) {
            _hashCode += getBuyingTimeFrame().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCcCustomerCode() != null) {
            _hashCode += getCcCustomerCode().hashCode();
        }
        if (getCcDefault() != null) {
            _hashCode += getCcDefault().hashCode();
        }
        if (getCcExpDate() != null) {
            _hashCode += getCcExpDate().hashCode();
        }
        if (getCcHolderName() != null) {
            _hashCode += getCcHolderName().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcState() != null) {
            _hashCode += getCcState().hashCode();
        }
        if (getCcStateFrom() != null) {
            _hashCode += getCcStateFrom().hashCode();
        }
        if (getCcType() != null) {
            _hashCode += getCcType().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getClassBought() != null) {
            _hashCode += getClassBought().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getConsolBalance() != null) {
            _hashCode += getConsolBalance().hashCode();
        }
        if (getConsolDaysOverdue() != null) {
            _hashCode += getConsolDaysOverdue().hashCode();
        }
        if (getConsolDepositBalance() != null) {
            _hashCode += getConsolDepositBalance().hashCode();
        }
        if (getConsolOverdueBalance() != null) {
            _hashCode += getConsolOverdueBalance().hashCode();
        }
        if (getConsolUnbilledOrders() != null) {
            _hashCode += getConsolUnbilledOrders().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getConversionDate() != null) {
            _hashCode += getConversionDate().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCreditHold() != null) {
            _hashCode += getCreditHold().hashCode();
        }
        if (getCreditHoldOverride() != null) {
            _hashCode += getCreditHoldOverride().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustStage() != null) {
            _hashCode += getCustStage().hashCode();
        }
        if (getCustStatus() != null) {
            _hashCode += getCustStatus().hashCode();
        }
        if (getDateClosed() != null) {
            _hashCode += getDateClosed().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDaysOverdue() != null) {
            _hashCode += getDaysOverdue().hashCode();
        }
        if (getDefaultOrderPriority() != null) {
            _hashCode += getDefaultOrderPriority().hashCode();
        }
        if (getDefaultTaxReg() != null) {
            _hashCode += getDefaultTaxReg().hashCode();
        }
        if (getDefaultTaxRegText() != null) {
            _hashCode += getDefaultTaxRegText().hashCode();
        }
        if (getDepositBalance() != null) {
            _hashCode += getDepositBalance().hashCode();
        }
        if (getDeptBought() != null) {
            _hashCode += getDeptBought().hashCode();
        }
        if (getDrAccount() != null) {
            _hashCode += getDrAccount().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailPreference() != null) {
            _hashCode += getEmailPreference().hashCode();
        }
        if (getEmailTransactions() != null) {
            _hashCode += getEmailTransactions().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getEstimatedBudget() != null) {
            _hashCode += getEstimatedBudget().hashCode();
        }
        if (getExplicitConversion() != null) {
            _hashCode += getExplicitConversion().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFaxTransactions() != null) {
            _hashCode += getFaxTransactions().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFirstOrderDate() != null) {
            _hashCode += getFirstOrderDate().hashCode();
        }
        if (getFirstSaleDate() != null) {
            _hashCode += getFirstSaleDate().hashCode();
        }
        if (getFxAccount() != null) {
            _hashCode += getFxAccount().hashCode();
        }
        if (getFxBalance() != null) {
            _hashCode += getFxBalance().hashCode();
        }
        if (getFxConsolBalance() != null) {
            _hashCode += getFxConsolBalance().hashCode();
        }
        if (getFxConsolUnbilledOrders() != null) {
            _hashCode += getFxConsolUnbilledOrders().hashCode();
        }
        if (getFxUnbilledOrders() != null) {
            _hashCode += getFxUnbilledOrders().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getGroupPricingLevel() != null) {
            _hashCode += getGroupPricingLevel().hashCode();
        }
        if (getHasDuplicates() != null) {
            _hashCode += getHasDuplicates().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsBudgetApproved() != null) {
            _hashCode += getIsBudgetApproved().hashCode();
        }
        if (getIsDefaultBilling() != null) {
            _hashCode += getIsDefaultBilling().hashCode();
        }
        if (getIsDefaultShipping() != null) {
            _hashCode += getIsDefaultShipping().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsPerson() != null) {
            _hashCode += getIsPerson().hashCode();
        }
        if (getIsReportedLead() != null) {
            _hashCode += getIsReportedLead().hashCode();
        }
        if (getIsShipAddress() != null) {
            _hashCode += getIsShipAddress().hashCode();
        }
        if (getItemPricingLevel() != null) {
            _hashCode += getItemPricingLevel().hashCode();
        }
        if (getItemPricingUnitPrice() != null) {
            _hashCode += getItemPricingUnitPrice().hashCode();
        }
        if (getItemsBought() != null) {
            _hashCode += getItemsBought().hashCode();
        }
        if (getItemsOrdered() != null) {
            _hashCode += getItemsOrdered().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastOrderDate() != null) {
            _hashCode += getLastOrderDate().hashCode();
        }
        if (getLastSaleDate() != null) {
            _hashCode += getLastSaleDate().hashCode();
        }
        if (getLeadDate() != null) {
            _hashCode += getLeadDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getLocationBought() != null) {
            _hashCode += getLocationBought().hashCode();
        }
        if (getManualCreditHold() != null) {
            _hashCode += getManualCreditHold().hashCode();
        }
        if (getMerchantAccount() != null) {
            _hashCode += getMerchantAccount().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getMonthlyClosing() != null) {
            _hashCode += getMonthlyClosing().hashCode();
        }
        if (getOnCreditHold() != null) {
            _hashCode += getOnCreditHold().hashCode();
        }
        if (getOrderedAmount() != null) {
            _hashCode += getOrderedAmount().hashCode();
        }
        if (getOrderedDate() != null) {
            _hashCode += getOrderedDate().hashCode();
        }
        if (getOtherRelationships() != null) {
            _hashCode += getOtherRelationships().hashCode();
        }
        if (getOverdueBalance() != null) {
            _hashCode += getOverdueBalance().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentItemsBought() != null) {
            _hashCode += getParentItemsBought().hashCode();
        }
        if (getParentItemsOrdered() != null) {
            _hashCode += getParentItemsOrdered().hashCode();
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
        if (getPec() != null) {
            _hashCode += getPec().hashCode();
        }
        if (getPermission() != null) {
            _hashCode += getPermission().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getPricingItem() != null) {
            _hashCode += getPricingItem().hashCode();
        }
        if (getPrintTransactions() != null) {
            _hashCode += getPrintTransactions().hashCode();
        }
        if (getProspectDate() != null) {
            _hashCode += getProspectDate().hashCode();
        }
        if (getPstExempt() != null) {
            _hashCode += getPstExempt().hashCode();
        }
        if (getReceivablesAccount() != null) {
            _hashCode += getReceivablesAccount().hashCode();
        }
        if (getReminderDate() != null) {
            _hashCode += getReminderDate().hashCode();
        }
        if (getResaleNumber() != null) {
            _hashCode += getResaleNumber().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getSalesReadiness() != null) {
            _hashCode += getSalesReadiness().hashCode();
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
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getShippingItem() != null) {
            _hashCode += getShippingItem().hashCode();
        }
        if (getSourceSite() != null) {
            _hashCode += getSourceSite().hashCode();
        }
        if (getSourceSiteId() != null) {
            _hashCode += getSourceSiteId().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidBought() != null) {
            _hashCode += getSubsidBought().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getTerritory() != null) {
            _hashCode += getTerritory().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getVatRegNumber() != null) {
            _hashCode += getVatRegNumber().hashCode();
        }
        if (getWebLead() != null) {
            _hashCode += getWebLead().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assignedSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assignedSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("boughtAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "boughtAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boughtDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "boughtDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
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
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccHolderName"));
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
        elemField.setFieldName("ccState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccStateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "classBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDaysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolDaysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
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
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "conversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("custStage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "custStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultOrderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTaxRegText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultTaxRegText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "deptBought"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explicitConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "explicitConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstSaleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstSaleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("fxBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxConsolBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxConsolBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxConsolUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxConsolUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReportedLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isReportedLead"));
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
        elemField.setFieldName("itemPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemPricingUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemsOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSaleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastSaleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadDate"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "locationBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manualCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyClosing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "monthlyClosing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "orderedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "otherRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItemsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parentItemsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItemsOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parentItemsOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("pec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prospectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "prospectDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pstExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reminderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesReadiness"));
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
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salutation"));
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
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sourceSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sourceSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stage"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subsidBought"));
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
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("territory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "territory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchStringField"));
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
