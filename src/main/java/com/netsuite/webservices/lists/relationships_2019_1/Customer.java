/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2019_1;

public class Customer  extends com.netsuite.webservices.platform.core_2019_1.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2019_1.RecordRef customForm;

    private java.lang.String entityId;

    private java.lang.String altName;

    private java.lang.Boolean isPerson;

    private java.lang.String phoneticName;

    private java.lang.String salutation;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String companyName;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef parent;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String url;

    private java.lang.String defaultAddress;

    private java.lang.Boolean isInactive;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef category;

    private java.lang.String title;

    private java.lang.String printOnCheckAs;

    private java.lang.String altPhone;

    private java.lang.String homePhone;

    private java.lang.String mobilePhone;

    private java.lang.String altEmail;

    private com.netsuite.webservices.platform.common_2019_1.types.Language language;

    private java.lang.String comments;

    private com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNumberFormat numberFormat;

    private com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNegativeNumberFormat negativeNumberFormat;

    private java.util.Calendar dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef image;

    private com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef representingSubsidiary;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef territory;

    private java.lang.String contribPct;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef partner;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup;

    private java.lang.String vatRegNumber;

    private java.lang.String accountNumber;

    private java.lang.Boolean taxExempt;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef terms;

    private java.lang.Double creditLimit;

    private com.netsuite.webservices.lists.relationships_2019_1.types.CustomerCreditHoldOverride creditHoldOverride;

    private com.netsuite.webservices.lists.relationships_2019_1.types.CustomerMonthlyClosing monthlyClosing;

    private java.lang.Boolean overrideCurrencyFormat;

    private java.lang.String displaySymbol;

    private com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement symbolPlacement;

    private java.lang.Double balance;

    private java.lang.Double overdueBalance;

    private java.lang.Long daysOverdue;

    private java.lang.Double unbilledOrders;

    private java.lang.Double consolUnbilledOrders;

    private java.lang.Double consolOverdueBalance;

    private java.lang.Double consolDepositBalance;

    private java.lang.Double consolBalance;

    private java.lang.Double consolAging;

    private java.lang.Double consolAging1;

    private java.lang.Double consolAging2;

    private java.lang.Double consolAging3;

    private java.lang.Double consolAging4;

    private java.lang.Long consolDaysOverdue;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef priceLevel;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef currency;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef prefCCProcessor;

    private java.lang.Double depositBalance;

    private java.lang.Boolean shipComplete;

    private java.lang.Boolean taxable;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem;

    private java.lang.String resaleNumber;

    private java.lang.Double aging;

    private java.lang.Double aging1;

    private java.lang.Double aging2;

    private java.lang.Double aging3;

    private java.lang.Double aging4;

    private java.util.Calendar startDate;

    private com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType alcoholRecipientType;

    private java.util.Calendar endDate;

    private java.lang.Long reminderDays;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef shippingItem;

    private java.lang.String thirdPartyAcct;

    private java.lang.String thirdPartyZipcode;

    private com.netsuite.webservices.platform.common_2019_1.types.Country thirdPartyCountry;

    private java.lang.Boolean giveAccess;

    private java.lang.Double estimatedBudget;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef accessRole;

    private java.lang.Boolean sendEmail;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef assignedWebSite;

    private java.lang.String password;

    private java.lang.String password2;

    private java.lang.Boolean requirePwdChange;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef campaignCategory;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef sourceWebSite;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef receivablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount;

    private java.lang.Double defaultOrderPriority;

    private java.lang.String webLead;

    private java.lang.String referrer;

    private java.lang.String keywords;

    private java.lang.String clickStream;

    private java.lang.String lastPageVisited;

    private java.lang.Long visits;

    private java.util.Calendar firstVisit;

    private java.util.Calendar lastVisit;

    private java.lang.Boolean billPay;

    private java.lang.Double openingBalance;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar openingBalanceDate;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount;

    private com.netsuite.webservices.lists.relationships_2019_1.types.CustomerStage stage;

    private java.lang.Boolean emailTransactions;

    private java.lang.Boolean printTransactions;

    private java.lang.Boolean faxTransactions;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg;

    private java.lang.Boolean syncPartnerTeams;

    private java.lang.Boolean isBudgetApproved;

    private com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef salesReadiness;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerSalesTeamList salesTeamList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef buyingReason;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerDownloadList downloadList;

    private com.netsuite.webservices.platform.core_2019_1.RecordRef buyingTimeFrame;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerAddressbookList addressbookList;

    private com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList;

    private com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList contactRolesList;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerCurrencyList currencyList;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerCreditCardsList creditCardsList;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerPartnersList partnersList;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricingList groupPricingList;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricingList itemPricingList;

    private com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistrationList taxRegistrationList;

    private com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Customer() {
    }

    public Customer(
           com.netsuite.webservices.platform.core_2019_1.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2019_1.RecordRef customForm,
           java.lang.String entityId,
           java.lang.String altName,
           java.lang.Boolean isPerson,
           java.lang.String phoneticName,
           java.lang.String salutation,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String companyName,
           com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef parent,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String url,
           java.lang.String defaultAddress,
           java.lang.Boolean isInactive,
           com.netsuite.webservices.platform.core_2019_1.RecordRef category,
           java.lang.String title,
           java.lang.String printOnCheckAs,
           java.lang.String altPhone,
           java.lang.String homePhone,
           java.lang.String mobilePhone,
           java.lang.String altEmail,
           com.netsuite.webservices.platform.common_2019_1.types.Language language,
           java.lang.String comments,
           com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNumberFormat numberFormat,
           com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNegativeNumberFormat negativeNumberFormat,
           java.util.Calendar dateCreated,
           com.netsuite.webservices.platform.core_2019_1.RecordRef image,
           com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference,
           com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef representingSubsidiary,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep,
           com.netsuite.webservices.platform.core_2019_1.RecordRef territory,
           java.lang.String contribPct,
           com.netsuite.webservices.platform.core_2019_1.RecordRef partner,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup,
           java.lang.String vatRegNumber,
           java.lang.String accountNumber,
           java.lang.Boolean taxExempt,
           com.netsuite.webservices.platform.core_2019_1.RecordRef terms,
           java.lang.Double creditLimit,
           com.netsuite.webservices.lists.relationships_2019_1.types.CustomerCreditHoldOverride creditHoldOverride,
           com.netsuite.webservices.lists.relationships_2019_1.types.CustomerMonthlyClosing monthlyClosing,
           java.lang.Boolean overrideCurrencyFormat,
           java.lang.String displaySymbol,
           com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement symbolPlacement,
           java.lang.Double balance,
           java.lang.Double overdueBalance,
           java.lang.Long daysOverdue,
           java.lang.Double unbilledOrders,
           java.lang.Double consolUnbilledOrders,
           java.lang.Double consolOverdueBalance,
           java.lang.Double consolDepositBalance,
           java.lang.Double consolBalance,
           java.lang.Double consolAging,
           java.lang.Double consolAging1,
           java.lang.Double consolAging2,
           java.lang.Double consolAging3,
           java.lang.Double consolAging4,
           java.lang.Long consolDaysOverdue,
           com.netsuite.webservices.platform.core_2019_1.RecordRef priceLevel,
           com.netsuite.webservices.platform.core_2019_1.RecordRef currency,
           com.netsuite.webservices.platform.core_2019_1.RecordRef prefCCProcessor,
           java.lang.Double depositBalance,
           java.lang.Boolean shipComplete,
           java.lang.Boolean taxable,
           com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem,
           java.lang.String resaleNumber,
           java.lang.Double aging,
           java.lang.Double aging1,
           java.lang.Double aging2,
           java.lang.Double aging3,
           java.lang.Double aging4,
           java.util.Calendar startDate,
           com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType alcoholRecipientType,
           java.util.Calendar endDate,
           java.lang.Long reminderDays,
           com.netsuite.webservices.platform.core_2019_1.RecordRef shippingItem,
           java.lang.String thirdPartyAcct,
           java.lang.String thirdPartyZipcode,
           com.netsuite.webservices.platform.common_2019_1.types.Country thirdPartyCountry,
           java.lang.Boolean giveAccess,
           java.lang.Double estimatedBudget,
           com.netsuite.webservices.platform.core_2019_1.RecordRef accessRole,
           java.lang.Boolean sendEmail,
           com.netsuite.webservices.platform.core_2019_1.RecordRef assignedWebSite,
           java.lang.String password,
           java.lang.String password2,
           java.lang.Boolean requirePwdChange,
           com.netsuite.webservices.platform.core_2019_1.RecordRef campaignCategory,
           com.netsuite.webservices.platform.core_2019_1.RecordRef sourceWebSite,
           com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource,
           com.netsuite.webservices.platform.core_2019_1.RecordRef receivablesAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount,
           com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount,
           java.lang.Double defaultOrderPriority,
           java.lang.String webLead,
           java.lang.String referrer,
           java.lang.String keywords,
           java.lang.String clickStream,
           java.lang.String lastPageVisited,
           java.lang.Long visits,
           java.util.Calendar firstVisit,
           java.util.Calendar lastVisit,
           java.lang.Boolean billPay,
           java.lang.Double openingBalance,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar openingBalanceDate,
           com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount,
           com.netsuite.webservices.lists.relationships_2019_1.types.CustomerStage stage,
           java.lang.Boolean emailTransactions,
           java.lang.Boolean printTransactions,
           java.lang.Boolean faxTransactions,
           com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg,
           java.lang.Boolean syncPartnerTeams,
           java.lang.Boolean isBudgetApproved,
           com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.RecordRef salesReadiness,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerSalesTeamList salesTeamList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef buyingReason,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerDownloadList downloadList,
           com.netsuite.webservices.platform.core_2019_1.RecordRef buyingTimeFrame,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerAddressbookList addressbookList,
           com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList,
           com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList contactRolesList,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerCurrencyList currencyList,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerCreditCardsList creditCardsList,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerPartnersList partnersList,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricingList groupPricingList,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricingList itemPricingList,
           com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistrationList taxRegistrationList,
           com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.isPerson = isPerson;
        this.phoneticName = phoneticName;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.entityStatus = entityStatus;
        this.parent = parent;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.url = url;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.category = category;
        this.title = title;
        this.printOnCheckAs = printOnCheckAs;
        this.altPhone = altPhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.altEmail = altEmail;
        this.language = language;
        this.comments = comments;
        this.numberFormat = numberFormat;
        this.negativeNumberFormat = negativeNumberFormat;
        this.dateCreated = dateCreated;
        this.image = image;
        this.emailPreference = emailPreference;
        this.subsidiary = subsidiary;
        this.representingSubsidiary = representingSubsidiary;
        this.salesRep = salesRep;
        this.territory = territory;
        this.contribPct = contribPct;
        this.partner = partner;
        this.salesGroup = salesGroup;
        this.vatRegNumber = vatRegNumber;
        this.accountNumber = accountNumber;
        this.taxExempt = taxExempt;
        this.terms = terms;
        this.creditLimit = creditLimit;
        this.creditHoldOverride = creditHoldOverride;
        this.monthlyClosing = monthlyClosing;
        this.overrideCurrencyFormat = overrideCurrencyFormat;
        this.displaySymbol = displaySymbol;
        this.symbolPlacement = symbolPlacement;
        this.balance = balance;
        this.overdueBalance = overdueBalance;
        this.daysOverdue = daysOverdue;
        this.unbilledOrders = unbilledOrders;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.consolOverdueBalance = consolOverdueBalance;
        this.consolDepositBalance = consolDepositBalance;
        this.consolBalance = consolBalance;
        this.consolAging = consolAging;
        this.consolAging1 = consolAging1;
        this.consolAging2 = consolAging2;
        this.consolAging3 = consolAging3;
        this.consolAging4 = consolAging4;
        this.consolDaysOverdue = consolDaysOverdue;
        this.priceLevel = priceLevel;
        this.currency = currency;
        this.prefCCProcessor = prefCCProcessor;
        this.depositBalance = depositBalance;
        this.shipComplete = shipComplete;
        this.taxable = taxable;
        this.taxItem = taxItem;
        this.resaleNumber = resaleNumber;
        this.aging = aging;
        this.aging1 = aging1;
        this.aging2 = aging2;
        this.aging3 = aging3;
        this.aging4 = aging4;
        this.startDate = startDate;
        this.alcoholRecipientType = alcoholRecipientType;
        this.endDate = endDate;
        this.reminderDays = reminderDays;
        this.shippingItem = shippingItem;
        this.thirdPartyAcct = thirdPartyAcct;
        this.thirdPartyZipcode = thirdPartyZipcode;
        this.thirdPartyCountry = thirdPartyCountry;
        this.giveAccess = giveAccess;
        this.estimatedBudget = estimatedBudget;
        this.accessRole = accessRole;
        this.sendEmail = sendEmail;
        this.assignedWebSite = assignedWebSite;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.campaignCategory = campaignCategory;
        this.sourceWebSite = sourceWebSite;
        this.leadSource = leadSource;
        this.receivablesAccount = receivablesAccount;
        this.drAccount = drAccount;
        this.fxAccount = fxAccount;
        this.defaultOrderPriority = defaultOrderPriority;
        this.webLead = webLead;
        this.referrer = referrer;
        this.keywords = keywords;
        this.clickStream = clickStream;
        this.lastPageVisited = lastPageVisited;
        this.visits = visits;
        this.firstVisit = firstVisit;
        this.lastVisit = lastVisit;
        this.billPay = billPay;
        this.openingBalance = openingBalance;
        this.lastModifiedDate = lastModifiedDate;
        this.openingBalanceDate = openingBalanceDate;
        this.openingBalanceAccount = openingBalanceAccount;
        this.stage = stage;
        this.emailTransactions = emailTransactions;
        this.printTransactions = printTransactions;
        this.faxTransactions = faxTransactions;
        this.defaultTaxReg = defaultTaxReg;
        this.syncPartnerTeams = syncPartnerTeams;
        this.isBudgetApproved = isBudgetApproved;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.salesReadiness = salesReadiness;
        this.salesTeamList = salesTeamList;
        this.buyingReason = buyingReason;
        this.downloadList = downloadList;
        this.buyingTimeFrame = buyingTimeFrame;
        this.addressbookList = addressbookList;
        this.subscriptionsList = subscriptionsList;
        this.contactRolesList = contactRolesList;
        this.currencyList = currencyList;
        this.creditCardsList = creditCardsList;
        this.partnersList = partnersList;
        this.groupPricingList = groupPricingList;
        this.itemPricingList = itemPricingList;
        this.taxRegistrationList = taxRegistrationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Customer.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Customer.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2019_1.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entityId value for this Customer.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Customer.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the altName value for this Customer.
     * 
     * @return altName
     */
    public java.lang.String getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this Customer.
     * 
     * @param altName
     */
    public void setAltName(java.lang.String altName) {
        this.altName = altName;
    }


    /**
     * Gets the isPerson value for this Customer.
     * 
     * @return isPerson
     */
    public java.lang.Boolean getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this Customer.
     * 
     * @param isPerson
     */
    public void setIsPerson(java.lang.Boolean isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the phoneticName value for this Customer.
     * 
     * @return phoneticName
     */
    public java.lang.String getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this Customer.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(java.lang.String phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the salutation value for this Customer.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Customer.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the firstName value for this Customer.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Customer.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this Customer.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Customer.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this Customer.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Customer.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the companyName value for this Customer.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Customer.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the entityStatus value for this Customer.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this Customer.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2019_1.RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the parent value for this Customer.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Customer.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2019_1.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the phone value for this Customer.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Customer.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this Customer.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Customer.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Customer.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Customer.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the url value for this Customer.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Customer.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the defaultAddress value for this Customer.
     * 
     * @return defaultAddress
     */
    public java.lang.String getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this Customer.
     * 
     * @param defaultAddress
     */
    public void setDefaultAddress(java.lang.String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the isInactive value for this Customer.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Customer.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the category value for this Customer.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Customer.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the title value for this Customer.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Customer.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the printOnCheckAs value for this Customer.
     * 
     * @return printOnCheckAs
     */
    public java.lang.String getPrintOnCheckAs() {
        return printOnCheckAs;
    }


    /**
     * Sets the printOnCheckAs value for this Customer.
     * 
     * @param printOnCheckAs
     */
    public void setPrintOnCheckAs(java.lang.String printOnCheckAs) {
        this.printOnCheckAs = printOnCheckAs;
    }


    /**
     * Gets the altPhone value for this Customer.
     * 
     * @return altPhone
     */
    public java.lang.String getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this Customer.
     * 
     * @param altPhone
     */
    public void setAltPhone(java.lang.String altPhone) {
        this.altPhone = altPhone;
    }


    /**
     * Gets the homePhone value for this Customer.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Customer.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the mobilePhone value for this Customer.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Customer.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the altEmail value for this Customer.
     * 
     * @return altEmail
     */
    public java.lang.String getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this Customer.
     * 
     * @param altEmail
     */
    public void setAltEmail(java.lang.String altEmail) {
        this.altEmail = altEmail;
    }


    /**
     * Gets the language value for this Customer.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Customer.
     * 
     * @param language
     */
    public void setLanguage(com.netsuite.webservices.platform.common_2019_1.types.Language language) {
        this.language = language;
    }


    /**
     * Gets the comments value for this Customer.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Customer.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the numberFormat value for this Customer.
     * 
     * @return numberFormat
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNumberFormat getNumberFormat() {
        return numberFormat;
    }


    /**
     * Sets the numberFormat value for this Customer.
     * 
     * @param numberFormat
     */
    public void setNumberFormat(com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }


    /**
     * Gets the negativeNumberFormat value for this Customer.
     * 
     * @return negativeNumberFormat
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNegativeNumberFormat getNegativeNumberFormat() {
        return negativeNumberFormat;
    }


    /**
     * Sets the negativeNumberFormat value for this Customer.
     * 
     * @param negativeNumberFormat
     */
    public void setNegativeNumberFormat(com.netsuite.webservices.lists.relationships_2019_1.types.CustomerNegativeNumberFormat negativeNumberFormat) {
        this.negativeNumberFormat = negativeNumberFormat;
    }


    /**
     * Gets the dateCreated value for this Customer.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Customer.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the image value for this Customer.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getImage() {
        return image;
    }


    /**
     * Sets the image value for this Customer.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2019_1.RecordRef image) {
        this.image = image;
    }


    /**
     * Gets the emailPreference value for this Customer.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this Customer.
     * 
     * @param emailPreference
     */
    public void setEmailPreference(com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }


    /**
     * Gets the subsidiary value for this Customer.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Customer.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the representingSubsidiary value for this Customer.
     * 
     * @return representingSubsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getRepresentingSubsidiary() {
        return representingSubsidiary;
    }


    /**
     * Sets the representingSubsidiary value for this Customer.
     * 
     * @param representingSubsidiary
     */
    public void setRepresentingSubsidiary(com.netsuite.webservices.platform.core_2019_1.RecordRef representingSubsidiary) {
        this.representingSubsidiary = representingSubsidiary;
    }


    /**
     * Gets the salesRep value for this Customer.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this Customer.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2019_1.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the territory value for this Customer.
     * 
     * @return territory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerritory() {
        return territory;
    }


    /**
     * Sets the territory value for this Customer.
     * 
     * @param territory
     */
    public void setTerritory(com.netsuite.webservices.platform.core_2019_1.RecordRef territory) {
        this.territory = territory;
    }


    /**
     * Gets the contribPct value for this Customer.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this Customer.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the partner value for this Customer.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this Customer.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2019_1.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the salesGroup value for this Customer.
     * 
     * @return salesGroup
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this Customer.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(com.netsuite.webservices.platform.core_2019_1.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the vatRegNumber value for this Customer.
     * 
     * @return vatRegNumber
     */
    public java.lang.String getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this Customer.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(java.lang.String vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }


    /**
     * Gets the accountNumber value for this Customer.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Customer.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the taxExempt value for this Customer.
     * 
     * @return taxExempt
     */
    public java.lang.Boolean getTaxExempt() {
        return taxExempt;
    }


    /**
     * Sets the taxExempt value for this Customer.
     * 
     * @param taxExempt
     */
    public void setTaxExempt(java.lang.Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }


    /**
     * Gets the terms value for this Customer.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this Customer.
     * 
     * @param terms
     */
    public void setTerms(com.netsuite.webservices.platform.core_2019_1.RecordRef terms) {
        this.terms = terms;
    }


    /**
     * Gets the creditLimit value for this Customer.
     * 
     * @return creditLimit
     */
    public java.lang.Double getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this Customer.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Double creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the creditHoldOverride value for this Customer.
     * 
     * @return creditHoldOverride
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.CustomerCreditHoldOverride getCreditHoldOverride() {
        return creditHoldOverride;
    }


    /**
     * Sets the creditHoldOverride value for this Customer.
     * 
     * @param creditHoldOverride
     */
    public void setCreditHoldOverride(com.netsuite.webservices.lists.relationships_2019_1.types.CustomerCreditHoldOverride creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }


    /**
     * Gets the monthlyClosing value for this Customer.
     * 
     * @return monthlyClosing
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.CustomerMonthlyClosing getMonthlyClosing() {
        return monthlyClosing;
    }


    /**
     * Sets the monthlyClosing value for this Customer.
     * 
     * @param monthlyClosing
     */
    public void setMonthlyClosing(com.netsuite.webservices.lists.relationships_2019_1.types.CustomerMonthlyClosing monthlyClosing) {
        this.monthlyClosing = monthlyClosing;
    }


    /**
     * Gets the overrideCurrencyFormat value for this Customer.
     * 
     * @return overrideCurrencyFormat
     */
    public java.lang.Boolean getOverrideCurrencyFormat() {
        return overrideCurrencyFormat;
    }


    /**
     * Sets the overrideCurrencyFormat value for this Customer.
     * 
     * @param overrideCurrencyFormat
     */
    public void setOverrideCurrencyFormat(java.lang.Boolean overrideCurrencyFormat) {
        this.overrideCurrencyFormat = overrideCurrencyFormat;
    }


    /**
     * Gets the displaySymbol value for this Customer.
     * 
     * @return displaySymbol
     */
    public java.lang.String getDisplaySymbol() {
        return displaySymbol;
    }


    /**
     * Sets the displaySymbol value for this Customer.
     * 
     * @param displaySymbol
     */
    public void setDisplaySymbol(java.lang.String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }


    /**
     * Gets the symbolPlacement value for this Customer.
     * 
     * @return symbolPlacement
     */
    public com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement getSymbolPlacement() {
        return symbolPlacement;
    }


    /**
     * Sets the symbolPlacement value for this Customer.
     * 
     * @param symbolPlacement
     */
    public void setSymbolPlacement(com.netsuite.webservices.platform.common_2019_1.types.CurrencySymbolPlacement symbolPlacement) {
        this.symbolPlacement = symbolPlacement;
    }


    /**
     * Gets the balance value for this Customer.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Customer.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the overdueBalance value for this Customer.
     * 
     * @return overdueBalance
     */
    public java.lang.Double getOverdueBalance() {
        return overdueBalance;
    }


    /**
     * Sets the overdueBalance value for this Customer.
     * 
     * @param overdueBalance
     */
    public void setOverdueBalance(java.lang.Double overdueBalance) {
        this.overdueBalance = overdueBalance;
    }


    /**
     * Gets the daysOverdue value for this Customer.
     * 
     * @return daysOverdue
     */
    public java.lang.Long getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this Customer.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(java.lang.Long daysOverdue) {
        this.daysOverdue = daysOverdue;
    }


    /**
     * Gets the unbilledOrders value for this Customer.
     * 
     * @return unbilledOrders
     */
    public java.lang.Double getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this Customer.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(java.lang.Double unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the consolUnbilledOrders value for this Customer.
     * 
     * @return consolUnbilledOrders
     */
    public java.lang.Double getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }


    /**
     * Sets the consolUnbilledOrders value for this Customer.
     * 
     * @param consolUnbilledOrders
     */
    public void setConsolUnbilledOrders(java.lang.Double consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }


    /**
     * Gets the consolOverdueBalance value for this Customer.
     * 
     * @return consolOverdueBalance
     */
    public java.lang.Double getConsolOverdueBalance() {
        return consolOverdueBalance;
    }


    /**
     * Sets the consolOverdueBalance value for this Customer.
     * 
     * @param consolOverdueBalance
     */
    public void setConsolOverdueBalance(java.lang.Double consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }


    /**
     * Gets the consolDepositBalance value for this Customer.
     * 
     * @return consolDepositBalance
     */
    public java.lang.Double getConsolDepositBalance() {
        return consolDepositBalance;
    }


    /**
     * Sets the consolDepositBalance value for this Customer.
     * 
     * @param consolDepositBalance
     */
    public void setConsolDepositBalance(java.lang.Double consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }


    /**
     * Gets the consolBalance value for this Customer.
     * 
     * @return consolBalance
     */
    public java.lang.Double getConsolBalance() {
        return consolBalance;
    }


    /**
     * Sets the consolBalance value for this Customer.
     * 
     * @param consolBalance
     */
    public void setConsolBalance(java.lang.Double consolBalance) {
        this.consolBalance = consolBalance;
    }


    /**
     * Gets the consolAging value for this Customer.
     * 
     * @return consolAging
     */
    public java.lang.Double getConsolAging() {
        return consolAging;
    }


    /**
     * Sets the consolAging value for this Customer.
     * 
     * @param consolAging
     */
    public void setConsolAging(java.lang.Double consolAging) {
        this.consolAging = consolAging;
    }


    /**
     * Gets the consolAging1 value for this Customer.
     * 
     * @return consolAging1
     */
    public java.lang.Double getConsolAging1() {
        return consolAging1;
    }


    /**
     * Sets the consolAging1 value for this Customer.
     * 
     * @param consolAging1
     */
    public void setConsolAging1(java.lang.Double consolAging1) {
        this.consolAging1 = consolAging1;
    }


    /**
     * Gets the consolAging2 value for this Customer.
     * 
     * @return consolAging2
     */
    public java.lang.Double getConsolAging2() {
        return consolAging2;
    }


    /**
     * Sets the consolAging2 value for this Customer.
     * 
     * @param consolAging2
     */
    public void setConsolAging2(java.lang.Double consolAging2) {
        this.consolAging2 = consolAging2;
    }


    /**
     * Gets the consolAging3 value for this Customer.
     * 
     * @return consolAging3
     */
    public java.lang.Double getConsolAging3() {
        return consolAging3;
    }


    /**
     * Sets the consolAging3 value for this Customer.
     * 
     * @param consolAging3
     */
    public void setConsolAging3(java.lang.Double consolAging3) {
        this.consolAging3 = consolAging3;
    }


    /**
     * Gets the consolAging4 value for this Customer.
     * 
     * @return consolAging4
     */
    public java.lang.Double getConsolAging4() {
        return consolAging4;
    }


    /**
     * Sets the consolAging4 value for this Customer.
     * 
     * @param consolAging4
     */
    public void setConsolAging4(java.lang.Double consolAging4) {
        this.consolAging4 = consolAging4;
    }


    /**
     * Gets the consolDaysOverdue value for this Customer.
     * 
     * @return consolDaysOverdue
     */
    public java.lang.Long getConsolDaysOverdue() {
        return consolDaysOverdue;
    }


    /**
     * Sets the consolDaysOverdue value for this Customer.
     * 
     * @param consolDaysOverdue
     */
    public void setConsolDaysOverdue(java.lang.Long consolDaysOverdue) {
        this.consolDaysOverdue = consolDaysOverdue;
    }


    /**
     * Gets the priceLevel value for this Customer.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this Customer.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2019_1.RecordRef priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the currency value for this Customer.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Customer.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2019_1.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the prefCCProcessor value for this Customer.
     * 
     * @return prefCCProcessor
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getPrefCCProcessor() {
        return prefCCProcessor;
    }


    /**
     * Sets the prefCCProcessor value for this Customer.
     * 
     * @param prefCCProcessor
     */
    public void setPrefCCProcessor(com.netsuite.webservices.platform.core_2019_1.RecordRef prefCCProcessor) {
        this.prefCCProcessor = prefCCProcessor;
    }


    /**
     * Gets the depositBalance value for this Customer.
     * 
     * @return depositBalance
     */
    public java.lang.Double getDepositBalance() {
        return depositBalance;
    }


    /**
     * Sets the depositBalance value for this Customer.
     * 
     * @param depositBalance
     */
    public void setDepositBalance(java.lang.Double depositBalance) {
        this.depositBalance = depositBalance;
    }


    /**
     * Gets the shipComplete value for this Customer.
     * 
     * @return shipComplete
     */
    public java.lang.Boolean getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this Customer.
     * 
     * @param shipComplete
     */
    public void setShipComplete(java.lang.Boolean shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the taxable value for this Customer.
     * 
     * @return taxable
     */
    public java.lang.Boolean getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this Customer.
     * 
     * @param taxable
     */
    public void setTaxable(java.lang.Boolean taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the taxItem value for this Customer.
     * 
     * @return taxItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this Customer.
     * 
     * @param taxItem
     */
    public void setTaxItem(com.netsuite.webservices.platform.core_2019_1.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the resaleNumber value for this Customer.
     * 
     * @return resaleNumber
     */
    public java.lang.String getResaleNumber() {
        return resaleNumber;
    }


    /**
     * Sets the resaleNumber value for this Customer.
     * 
     * @param resaleNumber
     */
    public void setResaleNumber(java.lang.String resaleNumber) {
        this.resaleNumber = resaleNumber;
    }


    /**
     * Gets the aging value for this Customer.
     * 
     * @return aging
     */
    public java.lang.Double getAging() {
        return aging;
    }


    /**
     * Sets the aging value for this Customer.
     * 
     * @param aging
     */
    public void setAging(java.lang.Double aging) {
        this.aging = aging;
    }


    /**
     * Gets the aging1 value for this Customer.
     * 
     * @return aging1
     */
    public java.lang.Double getAging1() {
        return aging1;
    }


    /**
     * Sets the aging1 value for this Customer.
     * 
     * @param aging1
     */
    public void setAging1(java.lang.Double aging1) {
        this.aging1 = aging1;
    }


    /**
     * Gets the aging2 value for this Customer.
     * 
     * @return aging2
     */
    public java.lang.Double getAging2() {
        return aging2;
    }


    /**
     * Sets the aging2 value for this Customer.
     * 
     * @param aging2
     */
    public void setAging2(java.lang.Double aging2) {
        this.aging2 = aging2;
    }


    /**
     * Gets the aging3 value for this Customer.
     * 
     * @return aging3
     */
    public java.lang.Double getAging3() {
        return aging3;
    }


    /**
     * Sets the aging3 value for this Customer.
     * 
     * @param aging3
     */
    public void setAging3(java.lang.Double aging3) {
        this.aging3 = aging3;
    }


    /**
     * Gets the aging4 value for this Customer.
     * 
     * @return aging4
     */
    public java.lang.Double getAging4() {
        return aging4;
    }


    /**
     * Sets the aging4 value for this Customer.
     * 
     * @param aging4
     */
    public void setAging4(java.lang.Double aging4) {
        this.aging4 = aging4;
    }


    /**
     * Gets the startDate value for this Customer.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Customer.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the alcoholRecipientType value for this Customer.
     * 
     * @return alcoholRecipientType
     */
    public com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType getAlcoholRecipientType() {
        return alcoholRecipientType;
    }


    /**
     * Sets the alcoholRecipientType value for this Customer.
     * 
     * @param alcoholRecipientType
     */
    public void setAlcoholRecipientType(com.netsuite.webservices.platform.common_2019_1.types.AlcoholRecipientType alcoholRecipientType) {
        this.alcoholRecipientType = alcoholRecipientType;
    }


    /**
     * Gets the endDate value for this Customer.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Customer.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the reminderDays value for this Customer.
     * 
     * @return reminderDays
     */
    public java.lang.Long getReminderDays() {
        return reminderDays;
    }


    /**
     * Sets the reminderDays value for this Customer.
     * 
     * @param reminderDays
     */
    public void setReminderDays(java.lang.Long reminderDays) {
        this.reminderDays = reminderDays;
    }


    /**
     * Gets the shippingItem value for this Customer.
     * 
     * @return shippingItem
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getShippingItem() {
        return shippingItem;
    }


    /**
     * Sets the shippingItem value for this Customer.
     * 
     * @param shippingItem
     */
    public void setShippingItem(com.netsuite.webservices.platform.core_2019_1.RecordRef shippingItem) {
        this.shippingItem = shippingItem;
    }


    /**
     * Gets the thirdPartyAcct value for this Customer.
     * 
     * @return thirdPartyAcct
     */
    public java.lang.String getThirdPartyAcct() {
        return thirdPartyAcct;
    }


    /**
     * Sets the thirdPartyAcct value for this Customer.
     * 
     * @param thirdPartyAcct
     */
    public void setThirdPartyAcct(java.lang.String thirdPartyAcct) {
        this.thirdPartyAcct = thirdPartyAcct;
    }


    /**
     * Gets the thirdPartyZipcode value for this Customer.
     * 
     * @return thirdPartyZipcode
     */
    public java.lang.String getThirdPartyZipcode() {
        return thirdPartyZipcode;
    }


    /**
     * Sets the thirdPartyZipcode value for this Customer.
     * 
     * @param thirdPartyZipcode
     */
    public void setThirdPartyZipcode(java.lang.String thirdPartyZipcode) {
        this.thirdPartyZipcode = thirdPartyZipcode;
    }


    /**
     * Gets the thirdPartyCountry value for this Customer.
     * 
     * @return thirdPartyCountry
     */
    public com.netsuite.webservices.platform.common_2019_1.types.Country getThirdPartyCountry() {
        return thirdPartyCountry;
    }


    /**
     * Sets the thirdPartyCountry value for this Customer.
     * 
     * @param thirdPartyCountry
     */
    public void setThirdPartyCountry(com.netsuite.webservices.platform.common_2019_1.types.Country thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }


    /**
     * Gets the giveAccess value for this Customer.
     * 
     * @return giveAccess
     */
    public java.lang.Boolean getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this Customer.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(java.lang.Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the estimatedBudget value for this Customer.
     * 
     * @return estimatedBudget
     */
    public java.lang.Double getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this Customer.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(java.lang.Double estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }


    /**
     * Gets the accessRole value for this Customer.
     * 
     * @return accessRole
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAccessRole() {
        return accessRole;
    }


    /**
     * Sets the accessRole value for this Customer.
     * 
     * @param accessRole
     */
    public void setAccessRole(com.netsuite.webservices.platform.core_2019_1.RecordRef accessRole) {
        this.accessRole = accessRole;
    }


    /**
     * Gets the sendEmail value for this Customer.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this Customer.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the assignedWebSite value for this Customer.
     * 
     * @return assignedWebSite
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getAssignedWebSite() {
        return assignedWebSite;
    }


    /**
     * Sets the assignedWebSite value for this Customer.
     * 
     * @param assignedWebSite
     */
    public void setAssignedWebSite(com.netsuite.webservices.platform.core_2019_1.RecordRef assignedWebSite) {
        this.assignedWebSite = assignedWebSite;
    }


    /**
     * Gets the password value for this Customer.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Customer.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the password2 value for this Customer.
     * 
     * @return password2
     */
    public java.lang.String getPassword2() {
        return password2;
    }


    /**
     * Sets the password2 value for this Customer.
     * 
     * @param password2
     */
    public void setPassword2(java.lang.String password2) {
        this.password2 = password2;
    }


    /**
     * Gets the requirePwdChange value for this Customer.
     * 
     * @return requirePwdChange
     */
    public java.lang.Boolean getRequirePwdChange() {
        return requirePwdChange;
    }


    /**
     * Sets the requirePwdChange value for this Customer.
     * 
     * @param requirePwdChange
     */
    public void setRequirePwdChange(java.lang.Boolean requirePwdChange) {
        this.requirePwdChange = requirePwdChange;
    }


    /**
     * Gets the campaignCategory value for this Customer.
     * 
     * @return campaignCategory
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getCampaignCategory() {
        return campaignCategory;
    }


    /**
     * Sets the campaignCategory value for this Customer.
     * 
     * @param campaignCategory
     */
    public void setCampaignCategory(com.netsuite.webservices.platform.core_2019_1.RecordRef campaignCategory) {
        this.campaignCategory = campaignCategory;
    }


    /**
     * Gets the sourceWebSite value for this Customer.
     * 
     * @return sourceWebSite
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSourceWebSite() {
        return sourceWebSite;
    }


    /**
     * Sets the sourceWebSite value for this Customer.
     * 
     * @param sourceWebSite
     */
    public void setSourceWebSite(com.netsuite.webservices.platform.core_2019_1.RecordRef sourceWebSite) {
        this.sourceWebSite = sourceWebSite;
    }


    /**
     * Gets the leadSource value for this Customer.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Customer.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2019_1.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the receivablesAccount value for this Customer.
     * 
     * @return receivablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getReceivablesAccount() {
        return receivablesAccount;
    }


    /**
     * Sets the receivablesAccount value for this Customer.
     * 
     * @param receivablesAccount
     */
    public void setReceivablesAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }


    /**
     * Gets the drAccount value for this Customer.
     * 
     * @return drAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDrAccount() {
        return drAccount;
    }


    /**
     * Sets the drAccount value for this Customer.
     * 
     * @param drAccount
     */
    public void setDrAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef drAccount) {
        this.drAccount = drAccount;
    }


    /**
     * Gets the fxAccount value for this Customer.
     * 
     * @return fxAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getFxAccount() {
        return fxAccount;
    }


    /**
     * Sets the fxAccount value for this Customer.
     * 
     * @param fxAccount
     */
    public void setFxAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef fxAccount) {
        this.fxAccount = fxAccount;
    }


    /**
     * Gets the defaultOrderPriority value for this Customer.
     * 
     * @return defaultOrderPriority
     */
    public java.lang.Double getDefaultOrderPriority() {
        return defaultOrderPriority;
    }


    /**
     * Sets the defaultOrderPriority value for this Customer.
     * 
     * @param defaultOrderPriority
     */
    public void setDefaultOrderPriority(java.lang.Double defaultOrderPriority) {
        this.defaultOrderPriority = defaultOrderPriority;
    }


    /**
     * Gets the webLead value for this Customer.
     * 
     * @return webLead
     */
    public java.lang.String getWebLead() {
        return webLead;
    }


    /**
     * Sets the webLead value for this Customer.
     * 
     * @param webLead
     */
    public void setWebLead(java.lang.String webLead) {
        this.webLead = webLead;
    }


    /**
     * Gets the referrer value for this Customer.
     * 
     * @return referrer
     */
    public java.lang.String getReferrer() {
        return referrer;
    }


    /**
     * Sets the referrer value for this Customer.
     * 
     * @param referrer
     */
    public void setReferrer(java.lang.String referrer) {
        this.referrer = referrer;
    }


    /**
     * Gets the keywords value for this Customer.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this Customer.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the clickStream value for this Customer.
     * 
     * @return clickStream
     */
    public java.lang.String getClickStream() {
        return clickStream;
    }


    /**
     * Sets the clickStream value for this Customer.
     * 
     * @param clickStream
     */
    public void setClickStream(java.lang.String clickStream) {
        this.clickStream = clickStream;
    }


    /**
     * Gets the lastPageVisited value for this Customer.
     * 
     * @return lastPageVisited
     */
    public java.lang.String getLastPageVisited() {
        return lastPageVisited;
    }


    /**
     * Sets the lastPageVisited value for this Customer.
     * 
     * @param lastPageVisited
     */
    public void setLastPageVisited(java.lang.String lastPageVisited) {
        this.lastPageVisited = lastPageVisited;
    }


    /**
     * Gets the visits value for this Customer.
     * 
     * @return visits
     */
    public java.lang.Long getVisits() {
        return visits;
    }


    /**
     * Sets the visits value for this Customer.
     * 
     * @param visits
     */
    public void setVisits(java.lang.Long visits) {
        this.visits = visits;
    }


    /**
     * Gets the firstVisit value for this Customer.
     * 
     * @return firstVisit
     */
    public java.util.Calendar getFirstVisit() {
        return firstVisit;
    }


    /**
     * Sets the firstVisit value for this Customer.
     * 
     * @param firstVisit
     */
    public void setFirstVisit(java.util.Calendar firstVisit) {
        this.firstVisit = firstVisit;
    }


    /**
     * Gets the lastVisit value for this Customer.
     * 
     * @return lastVisit
     */
    public java.util.Calendar getLastVisit() {
        return lastVisit;
    }


    /**
     * Sets the lastVisit value for this Customer.
     * 
     * @param lastVisit
     */
    public void setLastVisit(java.util.Calendar lastVisit) {
        this.lastVisit = lastVisit;
    }


    /**
     * Gets the billPay value for this Customer.
     * 
     * @return billPay
     */
    public java.lang.Boolean getBillPay() {
        return billPay;
    }


    /**
     * Sets the billPay value for this Customer.
     * 
     * @param billPay
     */
    public void setBillPay(java.lang.Boolean billPay) {
        this.billPay = billPay;
    }


    /**
     * Gets the openingBalance value for this Customer.
     * 
     * @return openingBalance
     */
    public java.lang.Double getOpeningBalance() {
        return openingBalance;
    }


    /**
     * Sets the openingBalance value for this Customer.
     * 
     * @param openingBalance
     */
    public void setOpeningBalance(java.lang.Double openingBalance) {
        this.openingBalance = openingBalance;
    }


    /**
     * Gets the lastModifiedDate value for this Customer.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Customer.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the openingBalanceDate value for this Customer.
     * 
     * @return openingBalanceDate
     */
    public java.util.Calendar getOpeningBalanceDate() {
        return openingBalanceDate;
    }


    /**
     * Sets the openingBalanceDate value for this Customer.
     * 
     * @param openingBalanceDate
     */
    public void setOpeningBalanceDate(java.util.Calendar openingBalanceDate) {
        this.openingBalanceDate = openingBalanceDate;
    }


    /**
     * Gets the openingBalanceAccount value for this Customer.
     * 
     * @return openingBalanceAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getOpeningBalanceAccount() {
        return openingBalanceAccount;
    }


    /**
     * Sets the openingBalanceAccount value for this Customer.
     * 
     * @param openingBalanceAccount
     */
    public void setOpeningBalanceAccount(com.netsuite.webservices.platform.core_2019_1.RecordRef openingBalanceAccount) {
        this.openingBalanceAccount = openingBalanceAccount;
    }


    /**
     * Gets the stage value for this Customer.
     * 
     * @return stage
     */
    public com.netsuite.webservices.lists.relationships_2019_1.types.CustomerStage getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this Customer.
     * 
     * @param stage
     */
    public void setStage(com.netsuite.webservices.lists.relationships_2019_1.types.CustomerStage stage) {
        this.stage = stage;
    }


    /**
     * Gets the emailTransactions value for this Customer.
     * 
     * @return emailTransactions
     */
    public java.lang.Boolean getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this Customer.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(java.lang.Boolean emailTransactions) {
        this.emailTransactions = emailTransactions;
    }


    /**
     * Gets the printTransactions value for this Customer.
     * 
     * @return printTransactions
     */
    public java.lang.Boolean getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this Customer.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(java.lang.Boolean printTransactions) {
        this.printTransactions = printTransactions;
    }


    /**
     * Gets the faxTransactions value for this Customer.
     * 
     * @return faxTransactions
     */
    public java.lang.Boolean getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this Customer.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(java.lang.Boolean faxTransactions) {
        this.faxTransactions = faxTransactions;
    }


    /**
     * Gets the defaultTaxReg value for this Customer.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this Customer.
     * 
     * @param defaultTaxReg
     */
    public void setDefaultTaxReg(com.netsuite.webservices.platform.core_2019_1.RecordRef defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }


    /**
     * Gets the syncPartnerTeams value for this Customer.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this Customer.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the isBudgetApproved value for this Customer.
     * 
     * @return isBudgetApproved
     */
    public java.lang.Boolean getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this Customer.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(java.lang.Boolean isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }


    /**
     * Gets the globalSubscriptionStatus value for this Customer.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this Customer.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(com.netsuite.webservices.platform.common_2019_1.types.GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the salesReadiness value for this Customer.
     * 
     * @return salesReadiness
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this Customer.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(com.netsuite.webservices.platform.core_2019_1.RecordRef salesReadiness) {
        this.salesReadiness = salesReadiness;
    }


    /**
     * Gets the salesTeamList value for this Customer.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this Customer.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.lists.relationships_2019_1.CustomerSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the buyingReason value for this Customer.
     * 
     * @return buyingReason
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this Customer.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(com.netsuite.webservices.platform.core_2019_1.RecordRef buyingReason) {
        this.buyingReason = buyingReason;
    }


    /**
     * Gets the downloadList value for this Customer.
     * 
     * @return downloadList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerDownloadList getDownloadList() {
        return downloadList;
    }


    /**
     * Sets the downloadList value for this Customer.
     * 
     * @param downloadList
     */
    public void setDownloadList(com.netsuite.webservices.lists.relationships_2019_1.CustomerDownloadList downloadList) {
        this.downloadList = downloadList;
    }


    /**
     * Gets the buyingTimeFrame value for this Customer.
     * 
     * @return buyingTimeFrame
     */
    public com.netsuite.webservices.platform.core_2019_1.RecordRef getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this Customer.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(com.netsuite.webservices.platform.core_2019_1.RecordRef buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }


    /**
     * Gets the addressbookList value for this Customer.
     * 
     * @return addressbookList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerAddressbookList getAddressbookList() {
        return addressbookList;
    }


    /**
     * Sets the addressbookList value for this Customer.
     * 
     * @param addressbookList
     */
    public void setAddressbookList(com.netsuite.webservices.lists.relationships_2019_1.CustomerAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }


    /**
     * Gets the subscriptionsList value for this Customer.
     * 
     * @return subscriptionsList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }


    /**
     * Sets the subscriptionsList value for this Customer.
     * 
     * @param subscriptionsList
     */
    public void setSubscriptionsList(com.netsuite.webservices.lists.relationships_2019_1.SubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }


    /**
     * Gets the contactRolesList value for this Customer.
     * 
     * @return contactRolesList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList getContactRolesList() {
        return contactRolesList;
    }


    /**
     * Sets the contactRolesList value for this Customer.
     * 
     * @param contactRolesList
     */
    public void setContactRolesList(com.netsuite.webservices.lists.relationships_2019_1.ContactAccessRolesList contactRolesList) {
        this.contactRolesList = contactRolesList;
    }


    /**
     * Gets the currencyList value for this Customer.
     * 
     * @return currencyList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerCurrencyList getCurrencyList() {
        return currencyList;
    }


    /**
     * Sets the currencyList value for this Customer.
     * 
     * @param currencyList
     */
    public void setCurrencyList(com.netsuite.webservices.lists.relationships_2019_1.CustomerCurrencyList currencyList) {
        this.currencyList = currencyList;
    }


    /**
     * Gets the creditCardsList value for this Customer.
     * 
     * @return creditCardsList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerCreditCardsList getCreditCardsList() {
        return creditCardsList;
    }


    /**
     * Sets the creditCardsList value for this Customer.
     * 
     * @param creditCardsList
     */
    public void setCreditCardsList(com.netsuite.webservices.lists.relationships_2019_1.CustomerCreditCardsList creditCardsList) {
        this.creditCardsList = creditCardsList;
    }


    /**
     * Gets the partnersList value for this Customer.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerPartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this Customer.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.lists.relationships_2019_1.CustomerPartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the groupPricingList value for this Customer.
     * 
     * @return groupPricingList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricingList getGroupPricingList() {
        return groupPricingList;
    }


    /**
     * Sets the groupPricingList value for this Customer.
     * 
     * @param groupPricingList
     */
    public void setGroupPricingList(com.netsuite.webservices.lists.relationships_2019_1.CustomerGroupPricingList groupPricingList) {
        this.groupPricingList = groupPricingList;
    }


    /**
     * Gets the itemPricingList value for this Customer.
     * 
     * @return itemPricingList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricingList getItemPricingList() {
        return itemPricingList;
    }


    /**
     * Sets the itemPricingList value for this Customer.
     * 
     * @param itemPricingList
     */
    public void setItemPricingList(com.netsuite.webservices.lists.relationships_2019_1.CustomerItemPricingList itemPricingList) {
        this.itemPricingList = itemPricingList;
    }


    /**
     * Gets the taxRegistrationList value for this Customer.
     * 
     * @return taxRegistrationList
     */
    public com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistrationList getTaxRegistrationList() {
        return taxRegistrationList;
    }


    /**
     * Sets the taxRegistrationList value for this Customer.
     * 
     * @param taxRegistrationList
     */
    public void setTaxRegistrationList(com.netsuite.webservices.lists.relationships_2019_1.CustomerTaxRegistrationList taxRegistrationList) {
        this.taxRegistrationList = taxRegistrationList;
    }


    /**
     * Gets the customFieldList value for this Customer.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Customer.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Customer.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Customer.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Customer.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Customer.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              this.altName.equals(other.getAltName()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              this.isPerson.equals(other.getIsPerson()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.defaultAddress==null && other.getDefaultAddress()==null) || 
             (this.defaultAddress!=null &&
              this.defaultAddress.equals(other.getDefaultAddress()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.printOnCheckAs==null && other.getPrintOnCheckAs()==null) || 
             (this.printOnCheckAs!=null &&
              this.printOnCheckAs.equals(other.getPrintOnCheckAs()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              this.altPhone.equals(other.getAltPhone()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              this.altEmail.equals(other.getAltEmail()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.numberFormat==null && other.getNumberFormat()==null) || 
             (this.numberFormat!=null &&
              this.numberFormat.equals(other.getNumberFormat()))) &&
            ((this.negativeNumberFormat==null && other.getNegativeNumberFormat()==null) || 
             (this.negativeNumberFormat!=null &&
              this.negativeNumberFormat.equals(other.getNegativeNumberFormat()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              this.emailPreference.equals(other.getEmailPreference()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.representingSubsidiary==null && other.getRepresentingSubsidiary()==null) || 
             (this.representingSubsidiary!=null &&
              this.representingSubsidiary.equals(other.getRepresentingSubsidiary()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.territory==null && other.getTerritory()==null) || 
             (this.territory!=null &&
              this.territory.equals(other.getTerritory()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              this.vatRegNumber.equals(other.getVatRegNumber()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.taxExempt==null && other.getTaxExempt()==null) || 
             (this.taxExempt!=null &&
              this.taxExempt.equals(other.getTaxExempt()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.creditHoldOverride==null && other.getCreditHoldOverride()==null) || 
             (this.creditHoldOverride!=null &&
              this.creditHoldOverride.equals(other.getCreditHoldOverride()))) &&
            ((this.monthlyClosing==null && other.getMonthlyClosing()==null) || 
             (this.monthlyClosing!=null &&
              this.monthlyClosing.equals(other.getMonthlyClosing()))) &&
            ((this.overrideCurrencyFormat==null && other.getOverrideCurrencyFormat()==null) || 
             (this.overrideCurrencyFormat!=null &&
              this.overrideCurrencyFormat.equals(other.getOverrideCurrencyFormat()))) &&
            ((this.displaySymbol==null && other.getDisplaySymbol()==null) || 
             (this.displaySymbol!=null &&
              this.displaySymbol.equals(other.getDisplaySymbol()))) &&
            ((this.symbolPlacement==null && other.getSymbolPlacement()==null) || 
             (this.symbolPlacement!=null &&
              this.symbolPlacement.equals(other.getSymbolPlacement()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.overdueBalance==null && other.getOverdueBalance()==null) || 
             (this.overdueBalance!=null &&
              this.overdueBalance.equals(other.getOverdueBalance()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              this.daysOverdue.equals(other.getDaysOverdue()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.consolUnbilledOrders==null && other.getConsolUnbilledOrders()==null) || 
             (this.consolUnbilledOrders!=null &&
              this.consolUnbilledOrders.equals(other.getConsolUnbilledOrders()))) &&
            ((this.consolOverdueBalance==null && other.getConsolOverdueBalance()==null) || 
             (this.consolOverdueBalance!=null &&
              this.consolOverdueBalance.equals(other.getConsolOverdueBalance()))) &&
            ((this.consolDepositBalance==null && other.getConsolDepositBalance()==null) || 
             (this.consolDepositBalance!=null &&
              this.consolDepositBalance.equals(other.getConsolDepositBalance()))) &&
            ((this.consolBalance==null && other.getConsolBalance()==null) || 
             (this.consolBalance!=null &&
              this.consolBalance.equals(other.getConsolBalance()))) &&
            ((this.consolAging==null && other.getConsolAging()==null) || 
             (this.consolAging!=null &&
              this.consolAging.equals(other.getConsolAging()))) &&
            ((this.consolAging1==null && other.getConsolAging1()==null) || 
             (this.consolAging1!=null &&
              this.consolAging1.equals(other.getConsolAging1()))) &&
            ((this.consolAging2==null && other.getConsolAging2()==null) || 
             (this.consolAging2!=null &&
              this.consolAging2.equals(other.getConsolAging2()))) &&
            ((this.consolAging3==null && other.getConsolAging3()==null) || 
             (this.consolAging3!=null &&
              this.consolAging3.equals(other.getConsolAging3()))) &&
            ((this.consolAging4==null && other.getConsolAging4()==null) || 
             (this.consolAging4!=null &&
              this.consolAging4.equals(other.getConsolAging4()))) &&
            ((this.consolDaysOverdue==null && other.getConsolDaysOverdue()==null) || 
             (this.consolDaysOverdue!=null &&
              this.consolDaysOverdue.equals(other.getConsolDaysOverdue()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.prefCCProcessor==null && other.getPrefCCProcessor()==null) || 
             (this.prefCCProcessor!=null &&
              this.prefCCProcessor.equals(other.getPrefCCProcessor()))) &&
            ((this.depositBalance==null && other.getDepositBalance()==null) || 
             (this.depositBalance!=null &&
              this.depositBalance.equals(other.getDepositBalance()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.resaleNumber==null && other.getResaleNumber()==null) || 
             (this.resaleNumber!=null &&
              this.resaleNumber.equals(other.getResaleNumber()))) &&
            ((this.aging==null && other.getAging()==null) || 
             (this.aging!=null &&
              this.aging.equals(other.getAging()))) &&
            ((this.aging1==null && other.getAging1()==null) || 
             (this.aging1!=null &&
              this.aging1.equals(other.getAging1()))) &&
            ((this.aging2==null && other.getAging2()==null) || 
             (this.aging2!=null &&
              this.aging2.equals(other.getAging2()))) &&
            ((this.aging3==null && other.getAging3()==null) || 
             (this.aging3!=null &&
              this.aging3.equals(other.getAging3()))) &&
            ((this.aging4==null && other.getAging4()==null) || 
             (this.aging4!=null &&
              this.aging4.equals(other.getAging4()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.alcoholRecipientType==null && other.getAlcoholRecipientType()==null) || 
             (this.alcoholRecipientType!=null &&
              this.alcoholRecipientType.equals(other.getAlcoholRecipientType()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.reminderDays==null && other.getReminderDays()==null) || 
             (this.reminderDays!=null &&
              this.reminderDays.equals(other.getReminderDays()))) &&
            ((this.shippingItem==null && other.getShippingItem()==null) || 
             (this.shippingItem!=null &&
              this.shippingItem.equals(other.getShippingItem()))) &&
            ((this.thirdPartyAcct==null && other.getThirdPartyAcct()==null) || 
             (this.thirdPartyAcct!=null &&
              this.thirdPartyAcct.equals(other.getThirdPartyAcct()))) &&
            ((this.thirdPartyZipcode==null && other.getThirdPartyZipcode()==null) || 
             (this.thirdPartyZipcode!=null &&
              this.thirdPartyZipcode.equals(other.getThirdPartyZipcode()))) &&
            ((this.thirdPartyCountry==null && other.getThirdPartyCountry()==null) || 
             (this.thirdPartyCountry!=null &&
              this.thirdPartyCountry.equals(other.getThirdPartyCountry()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              this.estimatedBudget.equals(other.getEstimatedBudget()))) &&
            ((this.accessRole==null && other.getAccessRole()==null) || 
             (this.accessRole!=null &&
              this.accessRole.equals(other.getAccessRole()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.assignedWebSite==null && other.getAssignedWebSite()==null) || 
             (this.assignedWebSite!=null &&
              this.assignedWebSite.equals(other.getAssignedWebSite()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.password2==null && other.getPassword2()==null) || 
             (this.password2!=null &&
              this.password2.equals(other.getPassword2()))) &&
            ((this.requirePwdChange==null && other.getRequirePwdChange()==null) || 
             (this.requirePwdChange!=null &&
              this.requirePwdChange.equals(other.getRequirePwdChange()))) &&
            ((this.campaignCategory==null && other.getCampaignCategory()==null) || 
             (this.campaignCategory!=null &&
              this.campaignCategory.equals(other.getCampaignCategory()))) &&
            ((this.sourceWebSite==null && other.getSourceWebSite()==null) || 
             (this.sourceWebSite!=null &&
              this.sourceWebSite.equals(other.getSourceWebSite()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.receivablesAccount==null && other.getReceivablesAccount()==null) || 
             (this.receivablesAccount!=null &&
              this.receivablesAccount.equals(other.getReceivablesAccount()))) &&
            ((this.drAccount==null && other.getDrAccount()==null) || 
             (this.drAccount!=null &&
              this.drAccount.equals(other.getDrAccount()))) &&
            ((this.fxAccount==null && other.getFxAccount()==null) || 
             (this.fxAccount!=null &&
              this.fxAccount.equals(other.getFxAccount()))) &&
            ((this.defaultOrderPriority==null && other.getDefaultOrderPriority()==null) || 
             (this.defaultOrderPriority!=null &&
              this.defaultOrderPriority.equals(other.getDefaultOrderPriority()))) &&
            ((this.webLead==null && other.getWebLead()==null) || 
             (this.webLead!=null &&
              this.webLead.equals(other.getWebLead()))) &&
            ((this.referrer==null && other.getReferrer()==null) || 
             (this.referrer!=null &&
              this.referrer.equals(other.getReferrer()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.clickStream==null && other.getClickStream()==null) || 
             (this.clickStream!=null &&
              this.clickStream.equals(other.getClickStream()))) &&
            ((this.lastPageVisited==null && other.getLastPageVisited()==null) || 
             (this.lastPageVisited!=null &&
              this.lastPageVisited.equals(other.getLastPageVisited()))) &&
            ((this.visits==null && other.getVisits()==null) || 
             (this.visits!=null &&
              this.visits.equals(other.getVisits()))) &&
            ((this.firstVisit==null && other.getFirstVisit()==null) || 
             (this.firstVisit!=null &&
              this.firstVisit.equals(other.getFirstVisit()))) &&
            ((this.lastVisit==null && other.getLastVisit()==null) || 
             (this.lastVisit!=null &&
              this.lastVisit.equals(other.getLastVisit()))) &&
            ((this.billPay==null && other.getBillPay()==null) || 
             (this.billPay!=null &&
              this.billPay.equals(other.getBillPay()))) &&
            ((this.openingBalance==null && other.getOpeningBalance()==null) || 
             (this.openingBalance!=null &&
              this.openingBalance.equals(other.getOpeningBalance()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.openingBalanceDate==null && other.getOpeningBalanceDate()==null) || 
             (this.openingBalanceDate!=null &&
              this.openingBalanceDate.equals(other.getOpeningBalanceDate()))) &&
            ((this.openingBalanceAccount==null && other.getOpeningBalanceAccount()==null) || 
             (this.openingBalanceAccount!=null &&
              this.openingBalanceAccount.equals(other.getOpeningBalanceAccount()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              this.emailTransactions.equals(other.getEmailTransactions()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              this.printTransactions.equals(other.getPrintTransactions()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              this.faxTransactions.equals(other.getFaxTransactions()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              this.defaultTaxReg.equals(other.getDefaultTaxReg()))) &&
            ((this.syncPartnerTeams==null && other.getSyncPartnerTeams()==null) || 
             (this.syncPartnerTeams!=null &&
              this.syncPartnerTeams.equals(other.getSyncPartnerTeams()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              this.isBudgetApproved.equals(other.getIsBudgetApproved()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              this.salesReadiness.equals(other.getSalesReadiness()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              this.salesTeamList.equals(other.getSalesTeamList()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              this.buyingReason.equals(other.getBuyingReason()))) &&
            ((this.downloadList==null && other.getDownloadList()==null) || 
             (this.downloadList!=null &&
              this.downloadList.equals(other.getDownloadList()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              this.buyingTimeFrame.equals(other.getBuyingTimeFrame()))) &&
            ((this.addressbookList==null && other.getAddressbookList()==null) || 
             (this.addressbookList!=null &&
              this.addressbookList.equals(other.getAddressbookList()))) &&
            ((this.subscriptionsList==null && other.getSubscriptionsList()==null) || 
             (this.subscriptionsList!=null &&
              this.subscriptionsList.equals(other.getSubscriptionsList()))) &&
            ((this.contactRolesList==null && other.getContactRolesList()==null) || 
             (this.contactRolesList!=null &&
              this.contactRolesList.equals(other.getContactRolesList()))) &&
            ((this.currencyList==null && other.getCurrencyList()==null) || 
             (this.currencyList!=null &&
              this.currencyList.equals(other.getCurrencyList()))) &&
            ((this.creditCardsList==null && other.getCreditCardsList()==null) || 
             (this.creditCardsList!=null &&
              this.creditCardsList.equals(other.getCreditCardsList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
            ((this.groupPricingList==null && other.getGroupPricingList()==null) || 
             (this.groupPricingList!=null &&
              this.groupPricingList.equals(other.getGroupPricingList()))) &&
            ((this.itemPricingList==null && other.getItemPricingList()==null) || 
             (this.itemPricingList!=null &&
              this.itemPricingList.equals(other.getItemPricingList()))) &&
            ((this.taxRegistrationList==null && other.getTaxRegistrationList()==null) || 
             (this.taxRegistrationList!=null &&
              this.taxRegistrationList.equals(other.getTaxRegistrationList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getAltName() != null) {
            _hashCode += getAltName().hashCode();
        }
        if (getIsPerson() != null) {
            _hashCode += getIsPerson().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDefaultAddress() != null) {
            _hashCode += getDefaultAddress().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPrintOnCheckAs() != null) {
            _hashCode += getPrintOnCheckAs().hashCode();
        }
        if (getAltPhone() != null) {
            _hashCode += getAltPhone().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getAltEmail() != null) {
            _hashCode += getAltEmail().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getNumberFormat() != null) {
            _hashCode += getNumberFormat().hashCode();
        }
        if (getNegativeNumberFormat() != null) {
            _hashCode += getNegativeNumberFormat().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getEmailPreference() != null) {
            _hashCode += getEmailPreference().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getRepresentingSubsidiary() != null) {
            _hashCode += getRepresentingSubsidiary().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getTerritory() != null) {
            _hashCode += getTerritory().hashCode();
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
        if (getVatRegNumber() != null) {
            _hashCode += getVatRegNumber().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getTaxExempt() != null) {
            _hashCode += getTaxExempt().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getCreditHoldOverride() != null) {
            _hashCode += getCreditHoldOverride().hashCode();
        }
        if (getMonthlyClosing() != null) {
            _hashCode += getMonthlyClosing().hashCode();
        }
        if (getOverrideCurrencyFormat() != null) {
            _hashCode += getOverrideCurrencyFormat().hashCode();
        }
        if (getDisplaySymbol() != null) {
            _hashCode += getDisplaySymbol().hashCode();
        }
        if (getSymbolPlacement() != null) {
            _hashCode += getSymbolPlacement().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getOverdueBalance() != null) {
            _hashCode += getOverdueBalance().hashCode();
        }
        if (getDaysOverdue() != null) {
            _hashCode += getDaysOverdue().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getConsolUnbilledOrders() != null) {
            _hashCode += getConsolUnbilledOrders().hashCode();
        }
        if (getConsolOverdueBalance() != null) {
            _hashCode += getConsolOverdueBalance().hashCode();
        }
        if (getConsolDepositBalance() != null) {
            _hashCode += getConsolDepositBalance().hashCode();
        }
        if (getConsolBalance() != null) {
            _hashCode += getConsolBalance().hashCode();
        }
        if (getConsolAging() != null) {
            _hashCode += getConsolAging().hashCode();
        }
        if (getConsolAging1() != null) {
            _hashCode += getConsolAging1().hashCode();
        }
        if (getConsolAging2() != null) {
            _hashCode += getConsolAging2().hashCode();
        }
        if (getConsolAging3() != null) {
            _hashCode += getConsolAging3().hashCode();
        }
        if (getConsolAging4() != null) {
            _hashCode += getConsolAging4().hashCode();
        }
        if (getConsolDaysOverdue() != null) {
            _hashCode += getConsolDaysOverdue().hashCode();
        }
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPrefCCProcessor() != null) {
            _hashCode += getPrefCCProcessor().hashCode();
        }
        if (getDepositBalance() != null) {
            _hashCode += getDepositBalance().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getResaleNumber() != null) {
            _hashCode += getResaleNumber().hashCode();
        }
        if (getAging() != null) {
            _hashCode += getAging().hashCode();
        }
        if (getAging1() != null) {
            _hashCode += getAging1().hashCode();
        }
        if (getAging2() != null) {
            _hashCode += getAging2().hashCode();
        }
        if (getAging3() != null) {
            _hashCode += getAging3().hashCode();
        }
        if (getAging4() != null) {
            _hashCode += getAging4().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getAlcoholRecipientType() != null) {
            _hashCode += getAlcoholRecipientType().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getReminderDays() != null) {
            _hashCode += getReminderDays().hashCode();
        }
        if (getShippingItem() != null) {
            _hashCode += getShippingItem().hashCode();
        }
        if (getThirdPartyAcct() != null) {
            _hashCode += getThirdPartyAcct().hashCode();
        }
        if (getThirdPartyZipcode() != null) {
            _hashCode += getThirdPartyZipcode().hashCode();
        }
        if (getThirdPartyCountry() != null) {
            _hashCode += getThirdPartyCountry().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getEstimatedBudget() != null) {
            _hashCode += getEstimatedBudget().hashCode();
        }
        if (getAccessRole() != null) {
            _hashCode += getAccessRole().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getAssignedWebSite() != null) {
            _hashCode += getAssignedWebSite().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPassword2() != null) {
            _hashCode += getPassword2().hashCode();
        }
        if (getRequirePwdChange() != null) {
            _hashCode += getRequirePwdChange().hashCode();
        }
        if (getCampaignCategory() != null) {
            _hashCode += getCampaignCategory().hashCode();
        }
        if (getSourceWebSite() != null) {
            _hashCode += getSourceWebSite().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getReceivablesAccount() != null) {
            _hashCode += getReceivablesAccount().hashCode();
        }
        if (getDrAccount() != null) {
            _hashCode += getDrAccount().hashCode();
        }
        if (getFxAccount() != null) {
            _hashCode += getFxAccount().hashCode();
        }
        if (getDefaultOrderPriority() != null) {
            _hashCode += getDefaultOrderPriority().hashCode();
        }
        if (getWebLead() != null) {
            _hashCode += getWebLead().hashCode();
        }
        if (getReferrer() != null) {
            _hashCode += getReferrer().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getClickStream() != null) {
            _hashCode += getClickStream().hashCode();
        }
        if (getLastPageVisited() != null) {
            _hashCode += getLastPageVisited().hashCode();
        }
        if (getVisits() != null) {
            _hashCode += getVisits().hashCode();
        }
        if (getFirstVisit() != null) {
            _hashCode += getFirstVisit().hashCode();
        }
        if (getLastVisit() != null) {
            _hashCode += getLastVisit().hashCode();
        }
        if (getBillPay() != null) {
            _hashCode += getBillPay().hashCode();
        }
        if (getOpeningBalance() != null) {
            _hashCode += getOpeningBalance().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getOpeningBalanceDate() != null) {
            _hashCode += getOpeningBalanceDate().hashCode();
        }
        if (getOpeningBalanceAccount() != null) {
            _hashCode += getOpeningBalanceAccount().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getEmailTransactions() != null) {
            _hashCode += getEmailTransactions().hashCode();
        }
        if (getPrintTransactions() != null) {
            _hashCode += getPrintTransactions().hashCode();
        }
        if (getFaxTransactions() != null) {
            _hashCode += getFaxTransactions().hashCode();
        }
        if (getDefaultTaxReg() != null) {
            _hashCode += getDefaultTaxReg().hashCode();
        }
        if (getSyncPartnerTeams() != null) {
            _hashCode += getSyncPartnerTeams().hashCode();
        }
        if (getIsBudgetApproved() != null) {
            _hashCode += getIsBudgetApproved().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getSalesReadiness() != null) {
            _hashCode += getSalesReadiness().hashCode();
        }
        if (getSalesTeamList() != null) {
            _hashCode += getSalesTeamList().hashCode();
        }
        if (getBuyingReason() != null) {
            _hashCode += getBuyingReason().hashCode();
        }
        if (getDownloadList() != null) {
            _hashCode += getDownloadList().hashCode();
        }
        if (getBuyingTimeFrame() != null) {
            _hashCode += getBuyingTimeFrame().hashCode();
        }
        if (getAddressbookList() != null) {
            _hashCode += getAddressbookList().hashCode();
        }
        if (getSubscriptionsList() != null) {
            _hashCode += getSubscriptionsList().hashCode();
        }
        if (getContactRolesList() != null) {
            _hashCode += getContactRolesList().hashCode();
        }
        if (getCurrencyList() != null) {
            _hashCode += getCurrencyList().hashCode();
        }
        if (getCreditCardsList() != null) {
            _hashCode += getCreditCardsList().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
        }
        if (getGroupPricingList() != null) {
            _hashCode += getGroupPricingList().hashCode();
        }
        if (getItemPricingList() != null) {
            _hashCode += getItemPricingList().hashCode();
        }
        if (getTaxRegistrationList() != null) {
            _hashCode += getTaxRegistrationList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "Customer"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printOnCheckAs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "printOnCheckAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "numberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerNumberFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeNumberFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "negativeNumberFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerNegativeNumberFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "EmailPreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representingSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "representingSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "territory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerCreditHoldOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyClosing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "monthlyClosing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerMonthlyClosing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideCurrencyFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "overrideCurrencyFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "displaySymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbolPlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "symbolPlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "CurrencySymbolPlacement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolAging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolAging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolAging1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolAging1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolAging2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolAging2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolAging3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolAging3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolAging4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolAging4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolDaysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "consolDaysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefCCProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "prefCCProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "aging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aging1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "aging1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aging2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "aging2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aging3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "aging3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aging4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "aging4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholRecipientType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "alcoholRecipientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "AlcoholRecipientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "reminderDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "thirdPartyAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyZipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "thirdPartyZipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "thirdPartyCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "accessRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedWebSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "assignedWebSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirePwdChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "requirePwdChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "campaignCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceWebSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "sourceWebSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrderPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultOrderPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referrer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "referrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickStream");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "clickStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPageVisited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastPageVisited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "visits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstVisit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "firstVisit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastVisit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastVisit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "openingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalanceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "openingBalanceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalanceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "openingBalanceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2019_1.lists.webservices.netsuite.com", "CustomerStage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2019_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "downloadList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerDownloadList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "SubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactRolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "contactRolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "ContactAccessRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "creditCardsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerCreditCardsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPricingList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "groupPricingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerGroupPricingList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "itemPricingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerItemPricingList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRegistrationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "taxRegistrationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "CustomerTaxRegistrationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:relationships_2019_1.lists.webservices.netsuite.com", "customFieldList"));
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
