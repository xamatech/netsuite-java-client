/**
 * OriginatingLeadSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class OriginatingLeadSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressInternalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressLabel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altContact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altEmail;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assignedSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] assignedSiteId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] billCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCountryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billZipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingReason;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingTimeFrame;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccCustomerCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] ccDefault;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccExpDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccHolderName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccInternalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] ccState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccStateFrom;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] ccType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] comments;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] consolDaysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolDepositBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolOverdueBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] conversionDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] creditHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] creditHoldOverride;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditLimit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateClosed;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] defaultOrderPriority;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultTaxReg;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] depositBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] drAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] emailTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] entityId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] entityNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedBudget;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] explicitConversion;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] faxTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] firstName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] firstOrderDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] firstSaleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fxAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxConsolBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxConsolUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupPricingLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasDuplicates;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] homePhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] image;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBudgetApproved;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultBilling;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultShipping;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPerson;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemPricingLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] itemPricingUnitPrice;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobEndDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobProjectedEnd;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobStartDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] jobType;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] language;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lastName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastOrderDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastSaleDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] leadDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] level;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] manualCreditHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] middleName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mobilePhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] monthlyClosing;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] onCreditHold;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] overdueBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] partnerRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pec;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] permission;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phoneticName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prefCCProcessor;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pricingGroup;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pricingItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] printTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] prospectDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] receivablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] reminderDays;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] resaleNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] role;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesReadiness;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salutation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipComplete;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCountryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shippingItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] sourceSite;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sourceSiteId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stage;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] subscriptionDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] subscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxable;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] terms;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] territory;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vatRegNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] webLead;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public OriginatingLeadSearchRowBasic() {
    }

    public OriginatingLeadSearchRowBasic(
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressInternalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressLabel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altContact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altEmail,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assignedSite,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] assignedSiteId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddress3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAddressee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billAttention,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] billCountry,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billCountryCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billState,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billZipCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingReason,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingTimeFrame,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccCustomerCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] ccDefault,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccExpDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccHolderName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccInternalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] ccState,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccStateFrom,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] ccType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] comments,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] consolDaysOverdue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolDepositBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolOverdueBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contribution,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] contributionPrimary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] conversionDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] creditHold,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] creditHoldOverride,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditLimit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateClosed,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] daysOverdue,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] defaultOrderPriority,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultTaxReg,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] depositBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] drAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] emailPreference,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] emailTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] endDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] entityId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] entityNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] entityStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedBudget,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] explicitConversion,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] faxTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] firstName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] firstOrderDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] firstSaleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fxAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxConsolBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxConsolUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] giveAccess,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupPricingLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasDuplicates,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] homePhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] image,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBudgetApproved,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultBilling,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultShipping,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPerson,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isShipAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemPricingLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] itemPricingUnitPrice,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobEndDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobProjectedEnd,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobStartDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] jobType,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] language,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lastName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastOrderDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastSaleDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] leadDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] leadSource,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] level,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] manualCreditHold,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] middleName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mobilePhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] monthlyClosing,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] onCreditHold,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] overdueBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partner,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] partnerContribution,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] partnerRole,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] partnerTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pec,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] permission,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phoneticName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prefCCProcessor,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] priceLevel,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pricingGroup,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pricingItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] printTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] prospectDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] receivablesAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] reminderDays,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] resaleNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] role,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesReadiness,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesRep,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamMember,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] salesTeamRole,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salutation,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddressee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAttention,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] shipComplete,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCountry,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCountryCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shippingItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipState,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipZip,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] sourceSite,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sourceSiteId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stage,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] startDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] subscriptionDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] subscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxable,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] terms,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] territory,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vatRegNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] webLead,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zipCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.addressInternalId = addressInternalId;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.altContact = altContact;
        this.altEmail = altEmail;
        this.altName = altName;
        this.altPhone = altPhone;
        this.assignedSite = assignedSite;
        this.assignedSiteId = assignedSiteId;
        this.attention = attention;
        this.availableOffline = availableOffline;
        this.balance = balance;
        this.billAddress = billAddress;
        this.billAddress1 = billAddress1;
        this.billAddress2 = billAddress2;
        this.billAddress3 = billAddress3;
        this.billAddressee = billAddressee;
        this.billAttention = billAttention;
        this.billCity = billCity;
        this.billCountry = billCountry;
        this.billCountryCode = billCountryCode;
        this.billPhone = billPhone;
        this.billState = billState;
        this.billZipCode = billZipCode;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this.category = category;
        this.ccCustomerCode = ccCustomerCode;
        this.ccDefault = ccDefault;
        this.ccExpDate = ccExpDate;
        this.ccHolderName = ccHolderName;
        this.ccInternalId = ccInternalId;
        this.ccNumber = ccNumber;
        this.ccState = ccState;
        this.ccStateFrom = ccStateFrom;
        this.ccType = ccType;
        this.city = city;
        this.comments = comments;
        this.companyName = companyName;
        this.consolBalance = consolBalance;
        this.consolDaysOverdue = consolDaysOverdue;
        this.consolDepositBalance = consolDepositBalance;
        this.consolOverdueBalance = consolOverdueBalance;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.contact = contact;
        this.contribution = contribution;
        this.contributionPrimary = contributionPrimary;
        this.conversionDate = conversionDate;
        this.country = country;
        this.countryCode = countryCode;
        this.creditHold = creditHold;
        this.creditHoldOverride = creditHoldOverride;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.dateClosed = dateClosed;
        this.dateCreated = dateCreated;
        this.daysOverdue = daysOverdue;
        this.defaultOrderPriority = defaultOrderPriority;
        this.defaultTaxReg = defaultTaxReg;
        this.depositBalance = depositBalance;
        this.drAccount = drAccount;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.endDate = endDate;
        this.entityId = entityId;
        this.entityNumber = entityNumber;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.explicitConversion = explicitConversion;
        this.externalId = externalId;
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
        this.groupPricingLevel = groupPricingLevel;
        this.hasDuplicates = hasDuplicates;
        this.homePhone = homePhone;
        this.image = image;
        this.internalId = internalId;
        this.isBudgetApproved = isBudgetApproved;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isPerson = isPerson;
        this.isShipAddress = isShipAddress;
        this.itemPricingLevel = itemPricingLevel;
        this.itemPricingUnitPrice = itemPricingUnitPrice;
        this.jobEndDate = jobEndDate;
        this.jobProjectedEnd = jobProjectedEnd;
        this.jobStartDate = jobStartDate;
        this.jobType = jobType;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastOrderDate = lastOrderDate;
        this.lastSaleDate = lastSaleDate;
        this.leadDate = leadDate;
        this.leadSource = leadSource;
        this.level = level;
        this.manualCreditHold = manualCreditHold;
        this.middleName = middleName;
        this.mobilePhone = mobilePhone;
        this.monthlyClosing = monthlyClosing;
        this.onCreditHold = onCreditHold;
        this.overdueBalance = overdueBalance;
        this.parent = parent;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.prefCCProcessor = prefCCProcessor;
        this.priceLevel = priceLevel;
        this.pricingGroup = pricingGroup;
        this.pricingItem = pricingItem;
        this.printTransactions = printTransactions;
        this.prospectDate = prospectDate;
        this.receivablesAccount = receivablesAccount;
        this.reminderDays = reminderDays;
        this.resaleNumber = resaleNumber;
        this.role = role;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipAddress3 = shipAddress3;
        this.shipAddressee = shipAddressee;
        this.shipAttention = shipAttention;
        this.shipCity = shipCity;
        this.shipComplete = shipComplete;
        this.shipCountry = shipCountry;
        this.shipCountryCode = shipCountryCode;
        this.shipPhone = shipPhone;
        this.shippingItem = shippingItem;
        this.shipState = shipState;
        this.shipZip = shipZip;
        this.sourceSite = sourceSite;
        this.sourceSiteId = sourceSiteId;
        this.stage = stage;
        this.startDate = startDate;
        this.state = state;
        this.subscription = subscription;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionStatus = subscriptionStatus;
        this.subsidiary = subsidiary;
        this.taxable = taxable;
        this.taxItem = taxItem;
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
     * Gets the accountNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return accountNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] accountNumber) {
        this.accountNumber = accountNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAccountNumber(int i) {
        return this.accountNumber[i];
    }

    public void setAccountNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.accountNumber[i] = _value;
    }


    /**
     * Gets the address value for this OriginatingLeadSearchRowBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this OriginatingLeadSearchRowBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address) {
        this.address = address;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the address1 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return address1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this OriginatingLeadSearchRowBasic.
     * 
     * @param address1
     */
    public void setAddress1(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address1[i] = _value;
    }


    /**
     * Gets the address2 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return address2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this OriginatingLeadSearchRowBasic.
     * 
     * @param address2
     */
    public void setAddress2(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address2[i] = _value;
    }


    /**
     * Gets the address3 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return address3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this OriginatingLeadSearchRowBasic.
     * 
     * @param address3
     */
    public void setAddress3(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.address3[i] = _value;
    }


    /**
     * Gets the addressee value for this OriginatingLeadSearchRowBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this OriginatingLeadSearchRowBasic.
     * 
     * @param addressee
     */
    public void setAddressee(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressee) {
        this.addressee = addressee;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddressee(int i) {
        return this.addressee[i];
    }

    public void setAddressee(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.addressee[i] = _value;
    }


    /**
     * Gets the addressInternalId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return addressInternalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressInternalId() {
        return addressInternalId;
    }


    /**
     * Sets the addressInternalId value for this OriginatingLeadSearchRowBasic.
     * 
     * @param addressInternalId
     */
    public void setAddressInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressInternalId) {
        this.addressInternalId = addressInternalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddressInternalId(int i) {
        return this.addressInternalId[i];
    }

    public void setAddressInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.addressInternalId[i] = _value;
    }


    /**
     * Gets the addressLabel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return addressLabel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this OriginatingLeadSearchRowBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressLabel) {
        this.addressLabel = addressLabel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddressLabel(int i) {
        return this.addressLabel[i];
    }

    public void setAddressLabel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.addressLabel[i] = _value;
    }


    /**
     * Gets the addressPhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return addressPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] addressPhone) {
        this.addressPhone = addressPhone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAddressPhone(int i) {
        return this.addressPhone[i];
    }

    public void setAddressPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.addressPhone[i] = _value;
    }


    /**
     * Gets the altContact value for this OriginatingLeadSearchRowBasic.
     * 
     * @return altContact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltContact() {
        return altContact;
    }


    /**
     * Sets the altContact value for this OriginatingLeadSearchRowBasic.
     * 
     * @param altContact
     */
    public void setAltContact(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altContact) {
        this.altContact = altContact;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAltContact(int i) {
        return this.altContact[i];
    }

    public void setAltContact(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.altContact[i] = _value;
    }


    /**
     * Gets the altEmail value for this OriginatingLeadSearchRowBasic.
     * 
     * @return altEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this OriginatingLeadSearchRowBasic.
     * 
     * @param altEmail
     */
    public void setAltEmail(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altEmail) {
        this.altEmail = altEmail;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAltEmail(int i) {
        return this.altEmail[i];
    }

    public void setAltEmail(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.altEmail[i] = _value;
    }


    /**
     * Gets the altName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return altName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param altName
     */
    public void setAltName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.altName[i] = _value;
    }


    /**
     * Gets the altPhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return altPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @param altPhone
     */
    public void setAltPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] altPhone) {
        this.altPhone = altPhone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAltPhone(int i) {
        return this.altPhone[i];
    }

    public void setAltPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.altPhone[i] = _value;
    }


    /**
     * Gets the assignedSite value for this OriginatingLeadSearchRowBasic.
     * 
     * @return assignedSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getAssignedSite() {
        return assignedSite;
    }


    /**
     * Sets the assignedSite value for this OriginatingLeadSearchRowBasic.
     * 
     * @param assignedSite
     */
    public void setAssignedSite(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] assignedSite) {
        this.assignedSite = assignedSite;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getAssignedSite(int i) {
        return this.assignedSite[i];
    }

    public void setAssignedSite(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.assignedSite[i] = _value;
    }


    /**
     * Gets the assignedSiteId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return assignedSiteId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getAssignedSiteId() {
        return assignedSiteId;
    }


    /**
     * Sets the assignedSiteId value for this OriginatingLeadSearchRowBasic.
     * 
     * @param assignedSiteId
     */
    public void setAssignedSiteId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] assignedSiteId) {
        this.assignedSiteId = assignedSiteId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getAssignedSiteId(int i) {
        return this.assignedSiteId[i];
    }

    public void setAssignedSiteId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.assignedSiteId[i] = _value;
    }


    /**
     * Gets the attention value for this OriginatingLeadSearchRowBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this OriginatingLeadSearchRowBasic.
     * 
     * @param attention
     */
    public void setAttention(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention) {
        this.attention = attention;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getAttention(int i) {
        return this.attention[i];
    }

    public void setAttention(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.attention[i] = _value;
    }


    /**
     * Gets the availableOffline value for this OriginatingLeadSearchRowBasic.
     * 
     * @return availableOffline
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OriginatingLeadSearchRowBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }


    /**
     * Gets the balance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param balance
     */
    public void setBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the billAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billAddress1 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAddress1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billAddress2 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAddress2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billAddress3 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAddress3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress3() {
        return billAddress3;
    }


    /**
     * Sets the billAddress3 value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billAddressee value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billAttention value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billCity value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billCountry value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billCountryCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billPhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billState value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this OriginatingLeadSearchRowBasic.
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
     * Gets the billZipCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billZipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillZipCode() {
        return billZipCode;
    }


    /**
     * Sets the billZipCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @param billZipCode
     */
    public void setBillZipCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] billZipCode) {
        this.billZipCode = billZipCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBillZipCode(int i) {
        return this.billZipCode[i];
    }

    public void setBillZipCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.billZipCode[i] = _value;
    }


    /**
     * Gets the buyingReason value for this OriginatingLeadSearchRowBasic.
     * 
     * @return buyingReason
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OriginatingLeadSearchRowBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingReason) {
        this.buyingReason = buyingReason;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBuyingReason(int i) {
        return this.buyingReason[i];
    }

    public void setBuyingReason(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.buyingReason[i] = _value;
    }


    /**
     * Gets the buyingTimeFrame value for this OriginatingLeadSearchRowBasic.
     * 
     * @return buyingTimeFrame
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OriginatingLeadSearchRowBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getBuyingTimeFrame(int i) {
        return this.buyingTimeFrame[i];
    }

    public void setBuyingTimeFrame(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.buyingTimeFrame[i] = _value;
    }


    /**
     * Gets the category value for this OriginatingLeadSearchRowBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this OriginatingLeadSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category) {
        this.category = category;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the ccCustomerCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccCustomerCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this OriginatingLeadSearchRowBasic.
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
     * Gets the ccDefault value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccDefault
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCcDefault() {
        return ccDefault;
    }


    /**
     * Sets the ccDefault value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccDefault
     */
    public void setCcDefault(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] ccDefault) {
        this.ccDefault = ccDefault;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCcDefault(int i) {
        return this.ccDefault[i];
    }

    public void setCcDefault(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.ccDefault[i] = _value;
    }


    /**
     * Gets the ccExpDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccExpDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCcExpDate() {
        return ccExpDate;
    }


    /**
     * Sets the ccExpDate value for this OriginatingLeadSearchRowBasic.
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
     * Gets the ccHolderName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccHolderName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcHolderName() {
        return ccHolderName;
    }


    /**
     * Sets the ccHolderName value for this OriginatingLeadSearchRowBasic.
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
     * Gets the ccInternalId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccInternalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcInternalId() {
        return ccInternalId;
    }


    /**
     * Sets the ccInternalId value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccInternalId
     */
    public void setCcInternalId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] ccInternalId) {
        this.ccInternalId = ccInternalId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCcInternalId(int i) {
        return this.ccInternalId[i];
    }

    public void setCcInternalId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.ccInternalId[i] = _value;
    }


    /**
     * Gets the ccNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this OriginatingLeadSearchRowBasic.
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
     * Gets the ccState value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCcState() {
        return ccState;
    }


    /**
     * Sets the ccState value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccState
     */
    public void setCcState(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] ccState) {
        this.ccState = ccState;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCcState(int i) {
        return this.ccState[i];
    }

    public void setCcState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.ccState[i] = _value;
    }


    /**
     * Gets the ccStateFrom value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccStateFrom
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getCcStateFrom() {
        return ccStateFrom;
    }


    /**
     * Sets the ccStateFrom value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccStateFrom
     */
    public void setCcStateFrom(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] ccStateFrom) {
        this.ccStateFrom = ccStateFrom;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getCcStateFrom(int i) {
        return this.ccStateFrom[i];
    }

    public void setCcStateFrom(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.ccStateFrom[i] = _value;
    }


    /**
     * Gets the ccType value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCcType() {
        return ccType;
    }


    /**
     * Sets the ccType value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccType
     */
    public void setCcType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] ccType) {
        this.ccType = ccType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getCcType(int i) {
        return this.ccType[i];
    }

    public void setCcType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.ccType[i] = _value;
    }


    /**
     * Gets the city value for this OriginatingLeadSearchRowBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this OriginatingLeadSearchRowBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city) {
        this.city = city;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.city[i] = _value;
    }


    /**
     * Gets the comments value for this OriginatingLeadSearchRowBasic.
     * 
     * @return comments
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this OriginatingLeadSearchRowBasic.
     * 
     * @param comments
     */
    public void setComments(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] comments) {
        this.comments = comments;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the companyName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return companyName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param companyName
     */
    public void setCompanyName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyName) {
        this.companyName = companyName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCompanyName(int i) {
        return this.companyName[i];
    }

    public void setCompanyName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.companyName[i] = _value;
    }


    /**
     * Gets the consolBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return consolBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getConsolBalance() {
        return consolBalance;
    }


    /**
     * Sets the consolBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param consolBalance
     */
    public void setConsolBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolBalance) {
        this.consolBalance = consolBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getConsolBalance(int i) {
        return this.consolBalance[i];
    }

    public void setConsolBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.consolBalance[i] = _value;
    }


    /**
     * Gets the consolDaysOverdue value for this OriginatingLeadSearchRowBasic.
     * 
     * @return consolDaysOverdue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getConsolDaysOverdue() {
        return consolDaysOverdue;
    }


    /**
     * Sets the consolDaysOverdue value for this OriginatingLeadSearchRowBasic.
     * 
     * @param consolDaysOverdue
     */
    public void setConsolDaysOverdue(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] consolDaysOverdue) {
        this.consolDaysOverdue = consolDaysOverdue;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getConsolDaysOverdue(int i) {
        return this.consolDaysOverdue[i];
    }

    public void setConsolDaysOverdue(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.consolDaysOverdue[i] = _value;
    }


    /**
     * Gets the consolDepositBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return consolDepositBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getConsolDepositBalance() {
        return consolDepositBalance;
    }


    /**
     * Sets the consolDepositBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param consolDepositBalance
     */
    public void setConsolDepositBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getConsolDepositBalance(int i) {
        return this.consolDepositBalance[i];
    }

    public void setConsolDepositBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.consolDepositBalance[i] = _value;
    }


    /**
     * Gets the consolOverdueBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return consolOverdueBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getConsolOverdueBalance() {
        return consolOverdueBalance;
    }


    /**
     * Sets the consolOverdueBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param consolOverdueBalance
     */
    public void setConsolOverdueBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getConsolOverdueBalance(int i) {
        return this.consolOverdueBalance[i];
    }

    public void setConsolOverdueBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.consolOverdueBalance[i] = _value;
    }


    /**
     * Gets the consolUnbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @return consolUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }


    /**
     * Sets the consolUnbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @param consolUnbilledOrders
     */
    public void setConsolUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getConsolUnbilledOrders(int i) {
        return this.consolUnbilledOrders[i];
    }

    public void setConsolUnbilledOrders(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.consolUnbilledOrders[i] = _value;
    }


    /**
     * Gets the contact value for this OriginatingLeadSearchRowBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this OriginatingLeadSearchRowBasic.
     * 
     * @param contact
     */
    public void setContact(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contact) {
        this.contact = contact;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.contact[i] = _value;
    }


    /**
     * Gets the contribution value for this OriginatingLeadSearchRowBasic.
     * 
     * @return contribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OriginatingLeadSearchRowBasic.
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
     * Gets the contributionPrimary value for this OriginatingLeadSearchRowBasic.
     * 
     * @return contributionPrimary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getContributionPrimary() {
        return contributionPrimary;
    }


    /**
     * Sets the contributionPrimary value for this OriginatingLeadSearchRowBasic.
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
     * Gets the conversionDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return conversionDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getConversionDate() {
        return conversionDate;
    }


    /**
     * Sets the conversionDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param conversionDate
     */
    public void setConversionDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] conversionDate) {
        this.conversionDate = conversionDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getConversionDate(int i) {
        return this.conversionDate[i];
    }

    public void setConversionDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.conversionDate[i] = _value;
    }


    /**
     * Gets the country value for this OriginatingLeadSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this OriginatingLeadSearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the countryCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return countryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @param countryCode
     */
    public void setCountryCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode) {
        this.countryCode = countryCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getCountryCode(int i) {
        return this.countryCode[i];
    }

    public void setCountryCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.countryCode[i] = _value;
    }


    /**
     * Gets the creditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @return creditHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCreditHold() {
        return creditHold;
    }


    /**
     * Sets the creditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @param creditHold
     */
    public void setCreditHold(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] creditHold) {
        this.creditHold = creditHold;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getCreditHold(int i) {
        return this.creditHold[i];
    }

    public void setCreditHold(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.creditHold[i] = _value;
    }


    /**
     * Gets the creditHoldOverride value for this OriginatingLeadSearchRowBasic.
     * 
     * @return creditHoldOverride
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getCreditHoldOverride() {
        return creditHoldOverride;
    }


    /**
     * Sets the creditHoldOverride value for this OriginatingLeadSearchRowBasic.
     * 
     * @param creditHoldOverride
     */
    public void setCreditHoldOverride(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getCreditHoldOverride(int i) {
        return this.creditHoldOverride[i];
    }

    public void setCreditHoldOverride(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.creditHoldOverride[i] = _value;
    }


    /**
     * Gets the creditLimit value for this OriginatingLeadSearchRowBasic.
     * 
     * @return creditLimit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this OriginatingLeadSearchRowBasic.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.creditLimit[i] = _value;
    }


    /**
     * Gets the currency value for this OriginatingLeadSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OriginatingLeadSearchRowBasic.
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
     * Gets the dateClosed value for this OriginatingLeadSearchRowBasic.
     * 
     * @return dateClosed
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateClosed() {
        return dateClosed;
    }


    /**
     * Sets the dateClosed value for this OriginatingLeadSearchRowBasic.
     * 
     * @param dateClosed
     */
    public void setDateClosed(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateClosed) {
        this.dateClosed = dateClosed;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getDateClosed(int i) {
        return this.dateClosed[i];
    }

    public void setDateClosed(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.dateClosed[i] = _value;
    }


    /**
     * Gets the dateCreated value for this OriginatingLeadSearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this OriginatingLeadSearchRowBasic.
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
     * Gets the daysOverdue value for this OriginatingLeadSearchRowBasic.
     * 
     * @return daysOverdue
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this OriginatingLeadSearchRowBasic.
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
     * Gets the defaultOrderPriority value for this OriginatingLeadSearchRowBasic.
     * 
     * @return defaultOrderPriority
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDefaultOrderPriority() {
        return defaultOrderPriority;
    }


    /**
     * Sets the defaultOrderPriority value for this OriginatingLeadSearchRowBasic.
     * 
     * @param defaultOrderPriority
     */
    public void setDefaultOrderPriority(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] defaultOrderPriority) {
        this.defaultOrderPriority = defaultOrderPriority;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDefaultOrderPriority(int i) {
        return this.defaultOrderPriority[i];
    }

    public void setDefaultOrderPriority(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.defaultOrderPriority[i] = _value;
    }


    /**
     * Gets the defaultTaxReg value for this OriginatingLeadSearchRowBasic.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this OriginatingLeadSearchRowBasic.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getDefaultTaxReg(int i) {
        return this.defaultTaxReg[i];
    }

    public void setDefaultTaxReg(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.defaultTaxReg[i] = _value;
    }


    /**
     * Gets the depositBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return depositBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getDepositBalance() {
        return depositBalance;
    }


    /**
     * Sets the depositBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param depositBalance
     */
    public void setDepositBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] depositBalance) {
        this.depositBalance = depositBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getDepositBalance(int i) {
        return this.depositBalance[i];
    }

    public void setDepositBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.depositBalance[i] = _value;
    }


    /**
     * Gets the drAccount value for this OriginatingLeadSearchRowBasic.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this OriginatingLeadSearchRowBasic.
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
     * Gets the email value for this OriginatingLeadSearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this OriginatingLeadSearchRowBasic.
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
     * Gets the emailPreference value for this OriginatingLeadSearchRowBasic.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this OriginatingLeadSearchRowBasic.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] emailPreference) {
        this.emailPreference = emailPreference;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getEmailPreference(int i) {
        return this.emailPreference[i];
    }

    public void setEmailPreference(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.emailPreference[i] = _value;
    }


    /**
     * Gets the emailTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @return emailTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] emailTransactions) {
        this.emailTransactions = emailTransactions;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getEmailTransactions(int i) {
        return this.emailTransactions[i];
    }

    public void setEmailTransactions(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.emailTransactions[i] = _value;
    }


    /**
     * Gets the endDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this OriginatingLeadSearchRowBasic.
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
     * Gets the entityId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return entityId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this OriginatingLeadSearchRowBasic.
     * 
     * @param entityId
     */
    public void setEntityId(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] entityId) {
        this.entityId = entityId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getEntityId(int i) {
        return this.entityId[i];
    }

    public void setEntityId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.entityId[i] = _value;
    }


    /**
     * Gets the entityNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return entityNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getEntityNumber() {
        return entityNumber;
    }


    /**
     * Sets the entityNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param entityNumber
     */
    public void setEntityNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] entityNumber) {
        this.entityNumber = entityNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getEntityNumber(int i) {
        return this.entityNumber[i];
    }

    public void setEntityNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.entityNumber[i] = _value;
    }


    /**
     * Gets the entityStatus value for this OriginatingLeadSearchRowBasic.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OriginatingLeadSearchRowBasic.
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
     * Gets the estimatedBudget value for this OriginatingLeadSearchRowBasic.
     * 
     * @return estimatedBudget
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OriginatingLeadSearchRowBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getEstimatedBudget(int i) {
        return this.estimatedBudget[i];
    }

    public void setEstimatedBudget(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.estimatedBudget[i] = _value;
    }


    /**
     * Gets the explicitConversion value for this OriginatingLeadSearchRowBasic.
     * 
     * @return explicitConversion
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getExplicitConversion() {
        return explicitConversion;
    }


    /**
     * Sets the explicitConversion value for this OriginatingLeadSearchRowBasic.
     * 
     * @param explicitConversion
     */
    public void setExplicitConversion(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] explicitConversion) {
        this.explicitConversion = explicitConversion;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getExplicitConversion(int i) {
        return this.explicitConversion[i];
    }

    public void setExplicitConversion(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.explicitConversion[i] = _value;
    }


    /**
     * Gets the externalId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this OriginatingLeadSearchRowBasic.
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
     * Gets the fax value for this OriginatingLeadSearchRowBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this OriginatingLeadSearchRowBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax) {
        this.fax = fax;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFax(int i) {
        return this.fax[i];
    }

    public void setFax(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.fax[i] = _value;
    }


    /**
     * Gets the faxTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @return faxTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] faxTransactions) {
        this.faxTransactions = faxTransactions;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getFaxTransactions(int i) {
        return this.faxTransactions[i];
    }

    public void setFaxTransactions(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.faxTransactions[i] = _value;
    }


    /**
     * Gets the firstName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return firstName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param firstName
     */
    public void setFirstName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] firstName) {
        this.firstName = firstName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getFirstName(int i) {
        return this.firstName[i];
    }

    public void setFirstName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.firstName[i] = _value;
    }


    /**
     * Gets the firstOrderDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return firstOrderDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getFirstOrderDate() {
        return firstOrderDate;
    }


    /**
     * Sets the firstOrderDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param firstOrderDate
     */
    public void setFirstOrderDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getFirstOrderDate(int i) {
        return this.firstOrderDate[i];
    }

    public void setFirstOrderDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.firstOrderDate[i] = _value;
    }


    /**
     * Gets the firstSaleDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return firstSaleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getFirstSaleDate() {
        return firstSaleDate;
    }


    /**
     * Sets the firstSaleDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param firstSaleDate
     */
    public void setFirstSaleDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getFirstSaleDate(int i) {
        return this.firstSaleDate[i];
    }

    public void setFirstSaleDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.firstSaleDate[i] = _value;
    }


    /**
     * Gets the fxAccount value for this OriginatingLeadSearchRowBasic.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this OriginatingLeadSearchRowBasic.
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
     * Gets the fxBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return fxBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxBalance() {
        return fxBalance;
    }


    /**
     * Sets the fxBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param fxBalance
     */
    public void setFxBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxBalance) {
        this.fxBalance = fxBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxBalance(int i) {
        return this.fxBalance[i];
    }

    public void setFxBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxBalance[i] = _value;
    }


    /**
     * Gets the fxConsolBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return fxConsolBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxConsolBalance() {
        return fxConsolBalance;
    }


    /**
     * Sets the fxConsolBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param fxConsolBalance
     */
    public void setFxConsolBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxConsolBalance) {
        this.fxConsolBalance = fxConsolBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxConsolBalance(int i) {
        return this.fxConsolBalance[i];
    }

    public void setFxConsolBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxConsolBalance[i] = _value;
    }


    /**
     * Gets the fxConsolUnbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @return fxConsolUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxConsolUnbilledOrders() {
        return fxConsolUnbilledOrders;
    }


    /**
     * Sets the fxConsolUnbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @param fxConsolUnbilledOrders
     */
    public void setFxConsolUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxConsolUnbilledOrders) {
        this.fxConsolUnbilledOrders = fxConsolUnbilledOrders;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxConsolUnbilledOrders(int i) {
        return this.fxConsolUnbilledOrders[i];
    }

    public void setFxConsolUnbilledOrders(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxConsolUnbilledOrders[i] = _value;
    }


    /**
     * Gets the fxUnbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @return fxUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxUnbilledOrders() {
        return fxUnbilledOrders;
    }


    /**
     * Sets the fxUnbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @param fxUnbilledOrders
     */
    public void setFxUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxUnbilledOrders) {
        this.fxUnbilledOrders = fxUnbilledOrders;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getFxUnbilledOrders(int i) {
        return this.fxUnbilledOrders[i];
    }

    public void setFxUnbilledOrders(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.fxUnbilledOrders[i] = _value;
    }


    /**
     * Gets the giveAccess value for this OriginatingLeadSearchRowBasic.
     * 
     * @return giveAccess
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this OriginatingLeadSearchRowBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] giveAccess) {
        this.giveAccess = giveAccess;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getGiveAccess(int i) {
        return this.giveAccess[i];
    }

    public void setGiveAccess(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.giveAccess[i] = _value;
    }


    /**
     * Gets the globalSubscriptionStatus value for this OriginatingLeadSearchRowBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this OriginatingLeadSearchRowBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getGlobalSubscriptionStatus(int i) {
        return this.globalSubscriptionStatus[i];
    }

    public void setGlobalSubscriptionStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.globalSubscriptionStatus[i] = _value;
    }


    /**
     * Gets the groupPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return groupPricingLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getGroupPricingLevel() {
        return groupPricingLevel;
    }


    /**
     * Sets the groupPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @param groupPricingLevel
     */
    public void setGroupPricingLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] groupPricingLevel) {
        this.groupPricingLevel = groupPricingLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getGroupPricingLevel(int i) {
        return this.groupPricingLevel[i];
    }

    public void setGroupPricingLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.groupPricingLevel[i] = _value;
    }


    /**
     * Gets the hasDuplicates value for this OriginatingLeadSearchRowBasic.
     * 
     * @return hasDuplicates
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this OriginatingLeadSearchRowBasic.
     * 
     * @param hasDuplicates
     */
    public void setHasDuplicates(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getHasDuplicates(int i) {
        return this.hasDuplicates[i];
    }

    public void setHasDuplicates(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.hasDuplicates[i] = _value;
    }


    /**
     * Gets the homePhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return homePhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @param homePhone
     */
    public void setHomePhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] homePhone) {
        this.homePhone = homePhone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getHomePhone(int i) {
        return this.homePhone[i];
    }

    public void setHomePhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.homePhone[i] = _value;
    }


    /**
     * Gets the image value for this OriginatingLeadSearchRowBasic.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this OriginatingLeadSearchRowBasic.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] image) {
        this.image = image;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getImage(int i) {
        return this.image[i];
    }

    public void setImage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.image[i] = _value;
    }


    /**
     * Gets the internalId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this OriginatingLeadSearchRowBasic.
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
     * Gets the isBudgetApproved value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isBudgetApproved
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsBudgetApproved(int i) {
        return this.isBudgetApproved[i];
    }

    public void setIsBudgetApproved(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isBudgetApproved[i] = _value;
    }


    /**
     * Gets the isDefaultBilling value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isDefaultBilling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsDefaultBilling(int i) {
        return this.isDefaultBilling[i];
    }

    public void setIsDefaultBilling(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isDefaultBilling[i] = _value;
    }


    /**
     * Gets the isDefaultShipping value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isDefaultShipping
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsDefaultShipping(int i) {
        return this.isDefaultShipping[i];
    }

    public void setIsDefaultShipping(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isDefaultShipping[i] = _value;
    }


    /**
     * Gets the isInactive value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isPerson value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isPerson
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isPerson
     */
    public void setIsPerson(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPerson) {
        this.isPerson = isPerson;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsPerson(int i) {
        return this.isPerson[i];
    }

    public void setIsPerson(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isPerson[i] = _value;
    }


    /**
     * Gets the isShipAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isShipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this OriginatingLeadSearchRowBasic.
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
     * Gets the itemPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return itemPricingLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getItemPricingLevel() {
        return itemPricingLevel;
    }


    /**
     * Sets the itemPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @param itemPricingLevel
     */
    public void setItemPricingLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] itemPricingLevel) {
        this.itemPricingLevel = itemPricingLevel;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getItemPricingLevel(int i) {
        return this.itemPricingLevel[i];
    }

    public void setItemPricingLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.itemPricingLevel[i] = _value;
    }


    /**
     * Gets the itemPricingUnitPrice value for this OriginatingLeadSearchRowBasic.
     * 
     * @return itemPricingUnitPrice
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getItemPricingUnitPrice() {
        return itemPricingUnitPrice;
    }


    /**
     * Sets the itemPricingUnitPrice value for this OriginatingLeadSearchRowBasic.
     * 
     * @param itemPricingUnitPrice
     */
    public void setItemPricingUnitPrice(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] itemPricingUnitPrice) {
        this.itemPricingUnitPrice = itemPricingUnitPrice;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getItemPricingUnitPrice(int i) {
        return this.itemPricingUnitPrice[i];
    }

    public void setItemPricingUnitPrice(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.itemPricingUnitPrice[i] = _value;
    }


    /**
     * Gets the jobEndDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobEndDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getJobEndDate() {
        return jobEndDate;
    }


    /**
     * Sets the jobEndDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobEndDate
     */
    public void setJobEndDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getJobEndDate(int i) {
        return this.jobEndDate[i];
    }

    public void setJobEndDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.jobEndDate[i] = _value;
    }


    /**
     * Gets the jobProjectedEnd value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobProjectedEnd
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getJobProjectedEnd() {
        return jobProjectedEnd;
    }


    /**
     * Sets the jobProjectedEnd value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobProjectedEnd
     */
    public void setJobProjectedEnd(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobProjectedEnd) {
        this.jobProjectedEnd = jobProjectedEnd;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getJobProjectedEnd(int i) {
        return this.jobProjectedEnd[i];
    }

    public void setJobProjectedEnd(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.jobProjectedEnd[i] = _value;
    }


    /**
     * Gets the jobStartDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobStartDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getJobStartDate() {
        return jobStartDate;
    }


    /**
     * Sets the jobStartDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobStartDate
     */
    public void setJobStartDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getJobStartDate(int i) {
        return this.jobStartDate[i];
    }

    public void setJobStartDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.jobStartDate[i] = _value;
    }


    /**
     * Gets the jobType value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobType
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getJobType() {
        return jobType;
    }


    /**
     * Sets the jobType value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobType
     */
    public void setJobType(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] jobType) {
        this.jobType = jobType;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getJobType(int i) {
        return this.jobType[i];
    }

    public void setJobType(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.jobType[i] = _value;
    }


    /**
     * Gets the language value for this OriginatingLeadSearchRowBasic.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this OriginatingLeadSearchRowBasic.
     * 
     * @param language
     */
    public void setLanguage(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] language) {
        this.language = language;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.language[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OriginatingLeadSearchRowBasic.
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
     * Gets the lastName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return lastName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param lastName
     */
    public void setLastName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lastName) {
        this.lastName = lastName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getLastName(int i) {
        return this.lastName[i];
    }

    public void setLastName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.lastName[i] = _value;
    }


    /**
     * Gets the lastOrderDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return lastOrderDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastOrderDate() {
        return lastOrderDate;
    }


    /**
     * Sets the lastOrderDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param lastOrderDate
     */
    public void setLastOrderDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastOrderDate(int i) {
        return this.lastOrderDate[i];
    }

    public void setLastOrderDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastOrderDate[i] = _value;
    }


    /**
     * Gets the lastSaleDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return lastSaleDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastSaleDate() {
        return lastSaleDate;
    }


    /**
     * Sets the lastSaleDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param lastSaleDate
     */
    public void setLastSaleDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastSaleDate) {
        this.lastSaleDate = lastSaleDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLastSaleDate(int i) {
        return this.lastSaleDate[i];
    }

    public void setLastSaleDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.lastSaleDate[i] = _value;
    }


    /**
     * Gets the leadDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return leadDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLeadDate() {
        return leadDate;
    }


    /**
     * Sets the leadDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param leadDate
     */
    public void setLeadDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] leadDate) {
        this.leadDate = leadDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getLeadDate(int i) {
        return this.leadDate[i];
    }

    public void setLeadDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.leadDate[i] = _value;
    }


    /**
     * Gets the leadSource value for this OriginatingLeadSearchRowBasic.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OriginatingLeadSearchRowBasic.
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
     * Gets the level value for this OriginatingLeadSearchRowBasic.
     * 
     * @return level
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLevel() {
        return level;
    }


    /**
     * Sets the level value for this OriginatingLeadSearchRowBasic.
     * 
     * @param level
     */
    public void setLevel(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] level) {
        this.level = level;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getLevel(int i) {
        return this.level[i];
    }

    public void setLevel(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.level[i] = _value;
    }


    /**
     * Gets the manualCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @return manualCreditHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getManualCreditHold() {
        return manualCreditHold;
    }


    /**
     * Sets the manualCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @param manualCreditHold
     */
    public void setManualCreditHold(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] manualCreditHold) {
        this.manualCreditHold = manualCreditHold;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getManualCreditHold(int i) {
        return this.manualCreditHold[i];
    }

    public void setManualCreditHold(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.manualCreditHold[i] = _value;
    }


    /**
     * Gets the middleName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return middleName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] middleName) {
        this.middleName = middleName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMiddleName(int i) {
        return this.middleName[i];
    }

    public void setMiddleName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.middleName[i] = _value;
    }


    /**
     * Gets the mobilePhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return mobilePhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getMobilePhone(int i) {
        return this.mobilePhone[i];
    }

    public void setMobilePhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.mobilePhone[i] = _value;
    }


    /**
     * Gets the monthlyClosing value for this OriginatingLeadSearchRowBasic.
     * 
     * @return monthlyClosing
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getMonthlyClosing() {
        return monthlyClosing;
    }


    /**
     * Sets the monthlyClosing value for this OriginatingLeadSearchRowBasic.
     * 
     * @param monthlyClosing
     */
    public void setMonthlyClosing(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] monthlyClosing) {
        this.monthlyClosing = monthlyClosing;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getMonthlyClosing(int i) {
        return this.monthlyClosing[i];
    }

    public void setMonthlyClosing(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.monthlyClosing[i] = _value;
    }


    /**
     * Gets the onCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @return onCreditHold
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getOnCreditHold() {
        return onCreditHold;
    }


    /**
     * Sets the onCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @param onCreditHold
     */
    public void setOnCreditHold(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] onCreditHold) {
        this.onCreditHold = onCreditHold;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getOnCreditHold(int i) {
        return this.onCreditHold[i];
    }

    public void setOnCreditHold(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.onCreditHold[i] = _value;
    }


    /**
     * Gets the overdueBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return overdueBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getOverdueBalance() {
        return overdueBalance;
    }


    /**
     * Sets the overdueBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param overdueBalance
     */
    public void setOverdueBalance(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getOverdueBalance(int i) {
        return this.overdueBalance[i];
    }

    public void setOverdueBalance(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.overdueBalance[i] = _value;
    }


    /**
     * Gets the parent value for this OriginatingLeadSearchRowBasic.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this OriginatingLeadSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the partner value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OriginatingLeadSearchRowBasic.
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
     * Gets the partnerContribution value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partnerContribution
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OriginatingLeadSearchRowBasic.
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
     * Gets the partnerRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partnerRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.partnerRole[i] = _value;
    }


    /**
     * Gets the partnerTeamMember value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partnerTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OriginatingLeadSearchRowBasic.
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
     * Gets the pec value for this OriginatingLeadSearchRowBasic.
     * 
     * @return pec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this OriginatingLeadSearchRowBasic.
     * 
     * @param pec
     */
    public void setPec(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pec) {
        this.pec = pec;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPec(int i) {
        return this.pec[i];
    }

    public void setPec(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pec[i] = _value;
    }


    /**
     * Gets the permission value for this OriginatingLeadSearchRowBasic.
     * 
     * @return permission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this OriginatingLeadSearchRowBasic.
     * 
     * @param permission
     */
    public void setPermission(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] permission) {
        this.permission = permission;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getPermission(int i) {
        return this.permission[i];
    }

    public void setPermission(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.permission[i] = _value;
    }


    /**
     * Gets the phone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this OriginatingLeadSearchRowBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the phoneticName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return phoneticName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phoneticName) {
        this.phoneticName = phoneticName;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPhoneticName(int i) {
        return this.phoneticName[i];
    }

    public void setPhoneticName(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.phoneticName[i] = _value;
    }


    /**
     * Gets the prefCCProcessor value for this OriginatingLeadSearchRowBasic.
     * 
     * @return prefCCProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPrefCCProcessor() {
        return prefCCProcessor;
    }


    /**
     * Sets the prefCCProcessor value for this OriginatingLeadSearchRowBasic.
     * 
     * @param prefCCProcessor
     */
    public void setPrefCCProcessor(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] prefCCProcessor) {
        this.prefCCProcessor = prefCCProcessor;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPrefCCProcessor(int i) {
        return this.prefCCProcessor[i];
    }

    public void setPrefCCProcessor(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.prefCCProcessor[i] = _value;
    }


    /**
     * Gets the priceLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this OriginatingLeadSearchRowBasic.
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
     * Gets the pricingGroup value for this OriginatingLeadSearchRowBasic.
     * 
     * @return pricingGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this OriginatingLeadSearchRowBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPricingGroup(int i) {
        return this.pricingGroup[i];
    }

    public void setPricingGroup(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pricingGroup[i] = _value;
    }


    /**
     * Gets the pricingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @return pricingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPricingItem() {
        return pricingItem;
    }


    /**
     * Sets the pricingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @param pricingItem
     */
    public void setPricingItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pricingItem) {
        this.pricingItem = pricingItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPricingItem(int i) {
        return this.pricingItem[i];
    }

    public void setPricingItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.pricingItem[i] = _value;
    }


    /**
     * Gets the printTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @return printTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] printTransactions) {
        this.printTransactions = printTransactions;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getPrintTransactions(int i) {
        return this.printTransactions[i];
    }

    public void setPrintTransactions(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.printTransactions[i] = _value;
    }


    /**
     * Gets the prospectDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return prospectDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getProspectDate() {
        return prospectDate;
    }


    /**
     * Sets the prospectDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param prospectDate
     */
    public void setProspectDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] prospectDate) {
        this.prospectDate = prospectDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getProspectDate(int i) {
        return this.prospectDate[i];
    }

    public void setProspectDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.prospectDate[i] = _value;
    }


    /**
     * Gets the receivablesAccount value for this OriginatingLeadSearchRowBasic.
     * 
     * @return receivablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getReceivablesAccount() {
        return receivablesAccount;
    }


    /**
     * Sets the receivablesAccount value for this OriginatingLeadSearchRowBasic.
     * 
     * @param receivablesAccount
     */
    public void setReceivablesAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getReceivablesAccount(int i) {
        return this.receivablesAccount[i];
    }

    public void setReceivablesAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.receivablesAccount[i] = _value;
    }


    /**
     * Gets the reminderDays value for this OriginatingLeadSearchRowBasic.
     * 
     * @return reminderDays
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getReminderDays() {
        return reminderDays;
    }


    /**
     * Sets the reminderDays value for this OriginatingLeadSearchRowBasic.
     * 
     * @param reminderDays
     */
    public void setReminderDays(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] reminderDays) {
        this.reminderDays = reminderDays;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getReminderDays(int i) {
        return this.reminderDays[i];
    }

    public void setReminderDays(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.reminderDays[i] = _value;
    }


    /**
     * Gets the resaleNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return resaleNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getResaleNumber() {
        return resaleNumber;
    }


    /**
     * Sets the resaleNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param resaleNumber
     */
    public void setResaleNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] resaleNumber) {
        this.resaleNumber = resaleNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getResaleNumber(int i) {
        return this.resaleNumber[i];
    }

    public void setResaleNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.resaleNumber[i] = _value;
    }


    /**
     * Gets the role value for this OriginatingLeadSearchRowBasic.
     * 
     * @return role
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this OriginatingLeadSearchRowBasic.
     * 
     * @param role
     */
    public void setRole(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] role) {
        this.role = role;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.role[i] = _value;
    }


    /**
     * Gets the salesReadiness value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesReadiness
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OriginatingLeadSearchRowBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSalesReadiness(int i) {
        return this.salesReadiness[i];
    }

    public void setSalesReadiness(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.salesReadiness[i] = _value;
    }


    /**
     * Gets the salesRep value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OriginatingLeadSearchRowBasic.
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
     * Gets the salesTeamMember value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesTeamMember
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OriginatingLeadSearchRowBasic.
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
     * Gets the salesTeamRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesTeamRole
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OriginatingLeadSearchRowBasic.
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
     * Gets the salutation value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salutation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this OriginatingLeadSearchRowBasic.
     * 
     * @param salutation
     */
    public void setSalutation(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salutation) {
        this.salutation = salutation;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getSalutation(int i) {
        return this.salutation[i];
    }

    public void setSalutation(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.salutation[i] = _value;
    }


    /**
     * Gets the shipAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipAddress1 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipAddress2 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipAddress3 value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAddress3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress3() {
        return shipAddress3;
    }


    /**
     * Sets the shipAddress3 value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipAddressee value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipAttention value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipCity value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipComplete value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipComplete
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipCountry value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipCountryCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipPhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shippingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shippingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getShippingItem() {
        return shippingItem;
    }


    /**
     * Sets the shippingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @param shippingItem
     */
    public void setShippingItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] shippingItem) {
        this.shippingItem = shippingItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getShippingItem(int i) {
        return this.shippingItem[i];
    }

    public void setShippingItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.shippingItem[i] = _value;
    }


    /**
     * Gets the shipState value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipZip value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this OriginatingLeadSearchRowBasic.
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
     * Gets the sourceSite value for this OriginatingLeadSearchRowBasic.
     * 
     * @return sourceSite
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSourceSite() {
        return sourceSite;
    }


    /**
     * Sets the sourceSite value for this OriginatingLeadSearchRowBasic.
     * 
     * @param sourceSite
     */
    public void setSourceSite(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] sourceSite) {
        this.sourceSite = sourceSite;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getSourceSite(int i) {
        return this.sourceSite[i];
    }

    public void setSourceSite(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.sourceSite[i] = _value;
    }


    /**
     * Gets the sourceSiteId value for this OriginatingLeadSearchRowBasic.
     * 
     * @return sourceSiteId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getSourceSiteId() {
        return sourceSiteId;
    }


    /**
     * Sets the sourceSiteId value for this OriginatingLeadSearchRowBasic.
     * 
     * @param sourceSiteId
     */
    public void setSourceSiteId(com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField getSourceSiteId(int i) {
        return this.sourceSiteId[i];
    }

    public void setSourceSiteId(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField _value) {
        this.sourceSiteId[i] = _value;
    }


    /**
     * Gets the stage value for this OriginatingLeadSearchRowBasic.
     * 
     * @return stage
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this OriginatingLeadSearchRowBasic.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] stage) {
        this.stage = stage;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.stage[i] = _value;
    }


    /**
     * Gets the startDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this OriginatingLeadSearchRowBasic.
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
     * Gets the state value for this OriginatingLeadSearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this OriginatingLeadSearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the subscription value for this OriginatingLeadSearchRowBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this OriginatingLeadSearchRowBasic.
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
     * Gets the subscriptionDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return subscriptionDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getSubscriptionDate() {
        return subscriptionDate;
    }


    /**
     * Sets the subscriptionDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param subscriptionDate
     */
    public void setSubscriptionDate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField getSubscriptionDate(int i) {
        return this.subscriptionDate[i];
    }

    public void setSubscriptionDate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField _value) {
        this.subscriptionDate[i] = _value;
    }


    /**
     * Gets the subscriptionStatus value for this OriginatingLeadSearchRowBasic.
     * 
     * @return subscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this OriginatingLeadSearchRowBasic.
     * 
     * @param subscriptionStatus
     */
    public void setSubscriptionStatus(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getSubscriptionStatus(int i) {
        return this.subscriptionStatus[i];
    }

    public void setSubscriptionStatus(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.subscriptionStatus[i] = _value;
    }


    /**
     * Gets the subsidiary value for this OriginatingLeadSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this OriginatingLeadSearchRowBasic.
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
     * Gets the taxable value for this OriginatingLeadSearchRowBasic.
     * 
     * @return taxable
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this OriginatingLeadSearchRowBasic.
     * 
     * @param taxable
     */
    public void setTaxable(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] taxable) {
        this.taxable = taxable;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getTaxable(int i) {
        return this.taxable[i];
    }

    public void setTaxable(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.taxable[i] = _value;
    }


    /**
     * Gets the taxItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] taxItem) {
        this.taxItem = taxItem;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTaxItem(int i) {
        return this.taxItem[i];
    }

    public void setTaxItem(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.taxItem[i] = _value;
    }


    /**
     * Gets the terms value for this OriginatingLeadSearchRowBasic.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this OriginatingLeadSearchRowBasic.
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
     * Gets the territory value for this OriginatingLeadSearchRowBasic.
     * 
     * @return territory
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTerritory() {
        return territory;
    }


    /**
     * Sets the territory value for this OriginatingLeadSearchRowBasic.
     * 
     * @param territory
     */
    public void setTerritory(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] territory) {
        this.territory = territory;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTerritory(int i) {
        return this.territory[i];
    }

    public void setTerritory(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.territory[i] = _value;
    }


    /**
     * Gets the title value for this OriginatingLeadSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OriginatingLeadSearchRowBasic.
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
     * Gets the unbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @return unbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getUnbilledOrders(int i) {
        return this.unbilledOrders[i];
    }

    public void setUnbilledOrders(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.unbilledOrders[i] = _value;
    }


    /**
     * Gets the url value for this OriginatingLeadSearchRowBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this OriginatingLeadSearchRowBasic.
     * 
     * @param url
     */
    public void setUrl(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url) {
        this.url = url;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.url[i] = _value;
    }


    /**
     * Gets the vatRegNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return vatRegNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getVatRegNumber(int i) {
        return this.vatRegNumber[i];
    }

    public void setVatRegNumber(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.vatRegNumber[i] = _value;
    }


    /**
     * Gets the webLead value for this OriginatingLeadSearchRowBasic.
     * 
     * @return webLead
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getWebLead() {
        return webLead;
    }


    /**
     * Sets the webLead value for this OriginatingLeadSearchRowBasic.
     * 
     * @param webLead
     */
    public void setWebLead(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] webLead) {
        this.webLead = webLead;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getWebLead(int i) {
        return this.webLead[i];
    }

    public void setWebLead(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.webLead[i] = _value;
    }


    /**
     * Gets the zipCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return zipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zipCode) {
        this.zipCode = zipCode;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getZipCode(int i) {
        return this.zipCode[i];
    }

    public void setZipCode(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.zipCode[i] = _value;
    }


    /**
     * Gets the customFieldList value for this OriginatingLeadSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OriginatingLeadSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginatingLeadSearchRowBasic)) return false;
        OriginatingLeadSearchRowBasic other = (OriginatingLeadSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.accountNumber, other.getAccountNumber()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              java.util.Arrays.equals(this.address1, other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              java.util.Arrays.equals(this.address2, other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              java.util.Arrays.equals(this.address3, other.getAddress3()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              java.util.Arrays.equals(this.addressee, other.getAddressee()))) &&
            ((this.addressInternalId==null && other.getAddressInternalId()==null) || 
             (this.addressInternalId!=null &&
              java.util.Arrays.equals(this.addressInternalId, other.getAddressInternalId()))) &&
            ((this.addressLabel==null && other.getAddressLabel()==null) || 
             (this.addressLabel!=null &&
              java.util.Arrays.equals(this.addressLabel, other.getAddressLabel()))) &&
            ((this.addressPhone==null && other.getAddressPhone()==null) || 
             (this.addressPhone!=null &&
              java.util.Arrays.equals(this.addressPhone, other.getAddressPhone()))) &&
            ((this.altContact==null && other.getAltContact()==null) || 
             (this.altContact!=null &&
              java.util.Arrays.equals(this.altContact, other.getAltContact()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              java.util.Arrays.equals(this.altEmail, other.getAltEmail()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              java.util.Arrays.equals(this.altName, other.getAltName()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              java.util.Arrays.equals(this.altPhone, other.getAltPhone()))) &&
            ((this.assignedSite==null && other.getAssignedSite()==null) || 
             (this.assignedSite!=null &&
              java.util.Arrays.equals(this.assignedSite, other.getAssignedSite()))) &&
            ((this.assignedSiteId==null && other.getAssignedSiteId()==null) || 
             (this.assignedSiteId!=null &&
              java.util.Arrays.equals(this.assignedSiteId, other.getAssignedSiteId()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              java.util.Arrays.equals(this.attention, other.getAttention()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              java.util.Arrays.equals(this.availableOffline, other.getAvailableOffline()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
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
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              java.util.Arrays.equals(this.billPhone, other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              java.util.Arrays.equals(this.billState, other.getBillState()))) &&
            ((this.billZipCode==null && other.getBillZipCode()==null) || 
             (this.billZipCode!=null &&
              java.util.Arrays.equals(this.billZipCode, other.getBillZipCode()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              java.util.Arrays.equals(this.buyingReason, other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              java.util.Arrays.equals(this.buyingTimeFrame, other.getBuyingTimeFrame()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              java.util.Arrays.equals(this.ccCustomerCode, other.getCcCustomerCode()))) &&
            ((this.ccDefault==null && other.getCcDefault()==null) || 
             (this.ccDefault!=null &&
              java.util.Arrays.equals(this.ccDefault, other.getCcDefault()))) &&
            ((this.ccExpDate==null && other.getCcExpDate()==null) || 
             (this.ccExpDate!=null &&
              java.util.Arrays.equals(this.ccExpDate, other.getCcExpDate()))) &&
            ((this.ccHolderName==null && other.getCcHolderName()==null) || 
             (this.ccHolderName!=null &&
              java.util.Arrays.equals(this.ccHolderName, other.getCcHolderName()))) &&
            ((this.ccInternalId==null && other.getCcInternalId()==null) || 
             (this.ccInternalId!=null &&
              java.util.Arrays.equals(this.ccInternalId, other.getCcInternalId()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              java.util.Arrays.equals(this.ccNumber, other.getCcNumber()))) &&
            ((this.ccState==null && other.getCcState()==null) || 
             (this.ccState!=null &&
              java.util.Arrays.equals(this.ccState, other.getCcState()))) &&
            ((this.ccStateFrom==null && other.getCcStateFrom()==null) || 
             (this.ccStateFrom!=null &&
              java.util.Arrays.equals(this.ccStateFrom, other.getCcStateFrom()))) &&
            ((this.ccType==null && other.getCcType()==null) || 
             (this.ccType!=null &&
              java.util.Arrays.equals(this.ccType, other.getCcType()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              java.util.Arrays.equals(this.companyName, other.getCompanyName()))) &&
            ((this.consolBalance==null && other.getConsolBalance()==null) || 
             (this.consolBalance!=null &&
              java.util.Arrays.equals(this.consolBalance, other.getConsolBalance()))) &&
            ((this.consolDaysOverdue==null && other.getConsolDaysOverdue()==null) || 
             (this.consolDaysOverdue!=null &&
              java.util.Arrays.equals(this.consolDaysOverdue, other.getConsolDaysOverdue()))) &&
            ((this.consolDepositBalance==null && other.getConsolDepositBalance()==null) || 
             (this.consolDepositBalance!=null &&
              java.util.Arrays.equals(this.consolDepositBalance, other.getConsolDepositBalance()))) &&
            ((this.consolOverdueBalance==null && other.getConsolOverdueBalance()==null) || 
             (this.consolOverdueBalance!=null &&
              java.util.Arrays.equals(this.consolOverdueBalance, other.getConsolOverdueBalance()))) &&
            ((this.consolUnbilledOrders==null && other.getConsolUnbilledOrders()==null) || 
             (this.consolUnbilledOrders!=null &&
              java.util.Arrays.equals(this.consolUnbilledOrders, other.getConsolUnbilledOrders()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              java.util.Arrays.equals(this.contribution, other.getContribution()))) &&
            ((this.contributionPrimary==null && other.getContributionPrimary()==null) || 
             (this.contributionPrimary!=null &&
              java.util.Arrays.equals(this.contributionPrimary, other.getContributionPrimary()))) &&
            ((this.conversionDate==null && other.getConversionDate()==null) || 
             (this.conversionDate!=null &&
              java.util.Arrays.equals(this.conversionDate, other.getConversionDate()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
            ((this.creditHold==null && other.getCreditHold()==null) || 
             (this.creditHold!=null &&
              java.util.Arrays.equals(this.creditHold, other.getCreditHold()))) &&
            ((this.creditHoldOverride==null && other.getCreditHoldOverride()==null) || 
             (this.creditHoldOverride!=null &&
              java.util.Arrays.equals(this.creditHoldOverride, other.getCreditHoldOverride()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              java.util.Arrays.equals(this.creditLimit, other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.dateClosed==null && other.getDateClosed()==null) || 
             (this.dateClosed!=null &&
              java.util.Arrays.equals(this.dateClosed, other.getDateClosed()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              java.util.Arrays.equals(this.daysOverdue, other.getDaysOverdue()))) &&
            ((this.defaultOrderPriority==null && other.getDefaultOrderPriority()==null) || 
             (this.defaultOrderPriority!=null &&
              java.util.Arrays.equals(this.defaultOrderPriority, other.getDefaultOrderPriority()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              java.util.Arrays.equals(this.defaultTaxReg, other.getDefaultTaxReg()))) &&
            ((this.depositBalance==null && other.getDepositBalance()==null) || 
             (this.depositBalance!=null &&
              java.util.Arrays.equals(this.depositBalance, other.getDepositBalance()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              java.util.Arrays.equals(this.drAccount, other.getDrAccount()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              java.util.Arrays.equals(this.emailPreference, other.getEmailPreference()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              java.util.Arrays.equals(this.emailTransactions, other.getEmailTransactions()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              java.util.Arrays.equals(this.entityId, other.getEntityId()))) &&
            ((this.entityNumber==null && other.getEntityNumber()==null) || 
             (this.entityNumber!=null &&
              java.util.Arrays.equals(this.entityNumber, other.getEntityNumber()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              java.util.Arrays.equals(this.estimatedBudget, other.getEstimatedBudget()))) &&
            ((this.explicitConversion==null && other.getExplicitConversion()==null) || 
             (this.explicitConversion!=null &&
              java.util.Arrays.equals(this.explicitConversion, other.getExplicitConversion()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              java.util.Arrays.equals(this.faxTransactions, other.getFaxTransactions()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              java.util.Arrays.equals(this.firstName, other.getFirstName()))) &&
            ((this.firstOrderDate==null && other.getFirstOrderDate()==null) || 
             (this.firstOrderDate!=null &&
              java.util.Arrays.equals(this.firstOrderDate, other.getFirstOrderDate()))) &&
            ((this.firstSaleDate==null && other.getFirstSaleDate()==null) || 
             (this.firstSaleDate!=null &&
              java.util.Arrays.equals(this.firstSaleDate, other.getFirstSaleDate()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              java.util.Arrays.equals(this.fxAccount, other.getFxAccount()))) &&
            ((this.fxBalance==null && other.getFxBalance()==null) || 
             (this.fxBalance!=null &&
              java.util.Arrays.equals(this.fxBalance, other.getFxBalance()))) &&
            ((this.fxConsolBalance==null && other.getFxConsolBalance()==null) || 
             (this.fxConsolBalance!=null &&
              java.util.Arrays.equals(this.fxConsolBalance, other.getFxConsolBalance()))) &&
            ((this.fxConsolUnbilledOrders==null && other.getFxConsolUnbilledOrders()==null) || 
             (this.fxConsolUnbilledOrders!=null &&
              java.util.Arrays.equals(this.fxConsolUnbilledOrders, other.getFxConsolUnbilledOrders()))) &&
            ((this.fxUnbilledOrders==null && other.getFxUnbilledOrders()==null) || 
             (this.fxUnbilledOrders!=null &&
              java.util.Arrays.equals(this.fxUnbilledOrders, other.getFxUnbilledOrders()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              java.util.Arrays.equals(this.giveAccess, other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              java.util.Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus()))) &&
            ((this.groupPricingLevel==null && other.getGroupPricingLevel()==null) || 
             (this.groupPricingLevel!=null &&
              java.util.Arrays.equals(this.groupPricingLevel, other.getGroupPricingLevel()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              java.util.Arrays.equals(this.hasDuplicates, other.getHasDuplicates()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              java.util.Arrays.equals(this.homePhone, other.getHomePhone()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              java.util.Arrays.equals(this.isBudgetApproved, other.getIsBudgetApproved()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              java.util.Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              java.util.Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              java.util.Arrays.equals(this.isPerson, other.getIsPerson()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              java.util.Arrays.equals(this.isShipAddress, other.getIsShipAddress()))) &&
            ((this.itemPricingLevel==null && other.getItemPricingLevel()==null) || 
             (this.itemPricingLevel!=null &&
              java.util.Arrays.equals(this.itemPricingLevel, other.getItemPricingLevel()))) &&
            ((this.itemPricingUnitPrice==null && other.getItemPricingUnitPrice()==null) || 
             (this.itemPricingUnitPrice!=null &&
              java.util.Arrays.equals(this.itemPricingUnitPrice, other.getItemPricingUnitPrice()))) &&
            ((this.jobEndDate==null && other.getJobEndDate()==null) || 
             (this.jobEndDate!=null &&
              java.util.Arrays.equals(this.jobEndDate, other.getJobEndDate()))) &&
            ((this.jobProjectedEnd==null && other.getJobProjectedEnd()==null) || 
             (this.jobProjectedEnd!=null &&
              java.util.Arrays.equals(this.jobProjectedEnd, other.getJobProjectedEnd()))) &&
            ((this.jobStartDate==null && other.getJobStartDate()==null) || 
             (this.jobStartDate!=null &&
              java.util.Arrays.equals(this.jobStartDate, other.getJobStartDate()))) &&
            ((this.jobType==null && other.getJobType()==null) || 
             (this.jobType!=null &&
              java.util.Arrays.equals(this.jobType, other.getJobType()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.lastOrderDate==null && other.getLastOrderDate()==null) || 
             (this.lastOrderDate!=null &&
              java.util.Arrays.equals(this.lastOrderDate, other.getLastOrderDate()))) &&
            ((this.lastSaleDate==null && other.getLastSaleDate()==null) || 
             (this.lastSaleDate!=null &&
              java.util.Arrays.equals(this.lastSaleDate, other.getLastSaleDate()))) &&
            ((this.leadDate==null && other.getLeadDate()==null) || 
             (this.leadDate!=null &&
              java.util.Arrays.equals(this.leadDate, other.getLeadDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              java.util.Arrays.equals(this.leadSource, other.getLeadSource()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              java.util.Arrays.equals(this.level, other.getLevel()))) &&
            ((this.manualCreditHold==null && other.getManualCreditHold()==null) || 
             (this.manualCreditHold!=null &&
              java.util.Arrays.equals(this.manualCreditHold, other.getManualCreditHold()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              java.util.Arrays.equals(this.middleName, other.getMiddleName()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              java.util.Arrays.equals(this.mobilePhone, other.getMobilePhone()))) &&
            ((this.monthlyClosing==null && other.getMonthlyClosing()==null) || 
             (this.monthlyClosing!=null &&
              java.util.Arrays.equals(this.monthlyClosing, other.getMonthlyClosing()))) &&
            ((this.onCreditHold==null && other.getOnCreditHold()==null) || 
             (this.onCreditHold!=null &&
              java.util.Arrays.equals(this.onCreditHold, other.getOnCreditHold()))) &&
            ((this.overdueBalance==null && other.getOverdueBalance()==null) || 
             (this.overdueBalance!=null &&
              java.util.Arrays.equals(this.overdueBalance, other.getOverdueBalance()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
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
            ((this.pec==null && other.getPec()==null) || 
             (this.pec!=null &&
              java.util.Arrays.equals(this.pec, other.getPec()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              java.util.Arrays.equals(this.permission, other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              java.util.Arrays.equals(this.phoneticName, other.getPhoneticName()))) &&
            ((this.prefCCProcessor==null && other.getPrefCCProcessor()==null) || 
             (this.prefCCProcessor!=null &&
              java.util.Arrays.equals(this.prefCCProcessor, other.getPrefCCProcessor()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              java.util.Arrays.equals(this.priceLevel, other.getPriceLevel()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              java.util.Arrays.equals(this.pricingGroup, other.getPricingGroup()))) &&
            ((this.pricingItem==null && other.getPricingItem()==null) || 
             (this.pricingItem!=null &&
              java.util.Arrays.equals(this.pricingItem, other.getPricingItem()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              java.util.Arrays.equals(this.printTransactions, other.getPrintTransactions()))) &&
            ((this.prospectDate==null && other.getProspectDate()==null) || 
             (this.prospectDate!=null &&
              java.util.Arrays.equals(this.prospectDate, other.getProspectDate()))) &&
            ((this.receivablesAccount==null && other.getReceivablesAccount()==null) || 
             (this.receivablesAccount!=null &&
              java.util.Arrays.equals(this.receivablesAccount, other.getReceivablesAccount()))) &&
            ((this.reminderDays==null && other.getReminderDays()==null) || 
             (this.reminderDays!=null &&
              java.util.Arrays.equals(this.reminderDays, other.getReminderDays()))) &&
            ((this.resaleNumber==null && other.getResaleNumber()==null) || 
             (this.resaleNumber!=null &&
              java.util.Arrays.equals(this.resaleNumber, other.getResaleNumber()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              java.util.Arrays.equals(this.salesReadiness, other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              java.util.Arrays.equals(this.salesRep, other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              java.util.Arrays.equals(this.salesTeamMember, other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              java.util.Arrays.equals(this.salesTeamRole, other.getSalesTeamRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              java.util.Arrays.equals(this.salutation, other.getSalutation()))) &&
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
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              java.util.Arrays.equals(this.shipPhone, other.getShipPhone()))) &&
            ((this.shippingItem==null && other.getShippingItem()==null) || 
             (this.shippingItem!=null &&
              java.util.Arrays.equals(this.shippingItem, other.getShippingItem()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              java.util.Arrays.equals(this.shipState, other.getShipState()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              java.util.Arrays.equals(this.shipZip, other.getShipZip()))) &&
            ((this.sourceSite==null && other.getSourceSite()==null) || 
             (this.sourceSite!=null &&
              java.util.Arrays.equals(this.sourceSite, other.getSourceSite()))) &&
            ((this.sourceSiteId==null && other.getSourceSiteId()==null) || 
             (this.sourceSiteId!=null &&
              java.util.Arrays.equals(this.sourceSiteId, other.getSourceSiteId()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              java.util.Arrays.equals(this.stage, other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              java.util.Arrays.equals(this.subscription, other.getSubscription()))) &&
            ((this.subscriptionDate==null && other.getSubscriptionDate()==null) || 
             (this.subscriptionDate!=null &&
              java.util.Arrays.equals(this.subscriptionDate, other.getSubscriptionDate()))) &&
            ((this.subscriptionStatus==null && other.getSubscriptionStatus()==null) || 
             (this.subscriptionStatus!=null &&
              java.util.Arrays.equals(this.subscriptionStatus, other.getSubscriptionStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              java.util.Arrays.equals(this.taxable, other.getTaxable()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              java.util.Arrays.equals(this.taxItem, other.getTaxItem()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              java.util.Arrays.equals(this.terms, other.getTerms()))) &&
            ((this.territory==null && other.getTerritory()==null) || 
             (this.territory!=null &&
              java.util.Arrays.equals(this.territory, other.getTerritory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              java.util.Arrays.equals(this.unbilledOrders, other.getUnbilledOrders()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              java.util.Arrays.equals(this.vatRegNumber, other.getVatRegNumber()))) &&
            ((this.webLead==null && other.getWebLead()==null) || 
             (this.webLead!=null &&
              java.util.Arrays.equals(this.webLead, other.getWebLead()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              java.util.Arrays.equals(this.zipCode, other.getZipCode()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignedSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedSite(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignedSiteId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedSiteId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedSiteId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableOffline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableOffline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableOffline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
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
        if (getBillZipCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillZipCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillZipCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
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
        if (getCcDefault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcDefault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcDefault(), i);
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
        if (getCcInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcInternalId(), i);
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
        if (getCcState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcStateFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcStateFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcStateFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanyName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanyName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolDaysOverdue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolDaysOverdue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolDaysOverdue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolDepositBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolDepositBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolDepositBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolOverdueBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolOverdueBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolOverdueBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolUnbilledOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolUnbilledOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolUnbilledOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContact(), i);
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
        if (getConversionDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditHold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditHold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditHold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditHoldOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditHoldOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditHoldOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimit(), i);
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
        if (getDateClosed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateClosed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateClosed(), i);
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
        if (getDefaultOrderPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultOrderPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultOrderPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultTaxReg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultTaxReg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultTaxReg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositBalance(), i);
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
        if (getEmailPreference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailPreference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailPreference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailTransactions(), i);
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
        if (getEntityId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityNumber(), i);
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
        if (getEstimatedBudget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedBudget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedBudget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExplicitConversion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExplicitConversion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExplicitConversion(), i);
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
        if (getFax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaxTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaxTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaxTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstOrderDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstOrderDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstOrderDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstSaleDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstSaleDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstSaleDate(), i);
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
        if (getFxBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxConsolBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxConsolBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxConsolBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxConsolUnbilledOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxConsolUnbilledOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxConsolUnbilledOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxUnbilledOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxUnbilledOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxUnbilledOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiveAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiveAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiveAccess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalSubscriptionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalSubscriptionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalSubscriptionStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupPricingLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupPricingLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupPricingLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasDuplicates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHasDuplicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHasDuplicates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHomePhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHomePhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHomePhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
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
        if (getIsBudgetApproved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBudgetApproved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBudgetApproved(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDefaultBilling() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDefaultBilling());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDefaultBilling(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDefaultShipping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDefaultShipping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDefaultShipping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsPerson() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsPerson());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsPerson(), i);
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
        if (getItemPricingLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPricingLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPricingLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPricingUnitPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPricingUnitPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPricingUnitPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobProjectedEnd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobProjectedEnd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobProjectedEnd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
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
        if (getLastName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastOrderDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastOrderDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastOrderDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastSaleDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastSaleDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastSaleDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeadDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadDate(), i);
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
        if (getLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManualCreditHold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManualCreditHold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManualCreditHold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMiddleName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiddleName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiddleName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobilePhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobilePhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobilePhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonthlyClosing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonthlyClosing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonthlyClosing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnCreditHold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnCreditHold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnCreditHold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverdueBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverdueBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverdueBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
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
        if (getPec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermission(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhoneticName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneticName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneticName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrefCCProcessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrefCCProcessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrefCCProcessor(), i);
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
        if (getPricingGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProspectDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProspectDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProspectDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceivablesAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivablesAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivablesAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReminderDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReminderDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReminderDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResaleNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResaleNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResaleNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesReadiness() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesReadiness());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesReadiness(), i);
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
        if (getSalutation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalutation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalutation(), i);
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
        if (getShippingItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingItem(), i);
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
        if (getSourceSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceSite(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceSiteId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceSiteId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceSiteId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStage(), i);
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
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
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
        if (getSubscriptionDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionStatus(), i);
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
        if (getTaxable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxItem(), i);
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
        if (getTerritory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerritory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerritory(), i);
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
        if (getUnbilledOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnbilledOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnbilledOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVatRegNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVatRegNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVatRegNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebLead() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebLead());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebLead(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZipCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZipCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZipCode(), i);
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
        new org.apache.axis.description.TypeDesc(OriginatingLeadSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressInternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assignedSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "assignedSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("billZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "billZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("ccInternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccInternalId"));
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
        elemField.setFieldName("ccState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccStateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "ccType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDaysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolDaysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
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
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "conversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("dateClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "dateClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultOrderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "entityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explicitConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "explicitConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstSaleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "firstSaleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("fxBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxConsolBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxConsolBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxConsolUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxConsolUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "groupPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "image"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isDefaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isPerson"));
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
        elemField.setFieldName("itemPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "itemPricingUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobProjectedEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobProjectedEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "jobType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSaleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "lastSaleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "leadDate"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "manualCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyClosing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "monthlyClosing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "parent"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("pec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefCCProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "prefCCProcessor"));
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
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "pricingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prospectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "prospectDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "reminderDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "salutation"));
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
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sourceSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "sourceSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "stage"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
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
        elemField.setFieldName("subscriptionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "subscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("territory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "territory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "zipCode"));
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
