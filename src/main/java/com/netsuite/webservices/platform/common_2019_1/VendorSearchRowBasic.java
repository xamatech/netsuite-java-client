/**
 * VendorSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2019_1;

public class VendorSearchRowBasic  extends com.netsuite.webservices.platform.core_2019_1.SearchRowBasic  implements java.io.Serializable {
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

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention;

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

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] comments;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contact;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditLimit;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] currentExchangeRate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultTaxReg;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] eligibleForCommission;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] emailPreference;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] emailTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] entityId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] entityNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] faxTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] firstName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxBalance;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxUnbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] giveAccess;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasDuplicates;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] homePhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] image;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] is1099Eligible;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultBilling;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultShipping;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isJobResourceVend;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPerson;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] laborCost;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] language;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lastName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] level;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] middleName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mobilePhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payablesAccount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pec;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] permission;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phoneticName;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] printOnCheckAs;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] printTransactions;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salutation;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress1;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress2;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress3;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddressee;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAttention;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCity;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCountry;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCountryCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipPhone;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipState;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipZip;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] subscriptionDate;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] subscriptionStatus;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxIdNum;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] terms;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] timeApprover;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledOrders;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vatRegNumber;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] zipCode;

    private com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList;

    public VendorSearchRowBasic() {
    }

    public VendorSearchRowBasic(
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
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] attention,
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
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] category,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] city,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] comments,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] companyName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] contact,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] country,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] countryCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] creditLimit,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] currency,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] currentExchangeRate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] dateCreated,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] defaultTaxReg,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] eligibleForCommission,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] email,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] emailPreference,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] emailTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] entityId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] entityNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] externalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] fax,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] faxTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] firstName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxBalance,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] fxUnbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] giveAccess,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] hasDuplicates,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] homePhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] image,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] incoterm,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] is1099Eligible,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultBilling,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isDefaultShipping,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isInactive,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isJobResourceVend,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isPerson,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] laborCost,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] language,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] lastModifiedDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] lastName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] level,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] middleName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] mobilePhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payablesAccount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] pec,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] permission,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] phoneticName,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] printOnCheckAs,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] printTransactions,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] salutation,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress1,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress2,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddress3,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAddressee,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipAttention,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCity,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] shipCountry,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipCountryCode,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipPhone,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipState,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] shipZip,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subscription,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] subscriptionDate,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] subscriptionStatus,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] subsidiary,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxIdNum,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] terms,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] timeApprover,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] title,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] unbilledOrders,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] url,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] vatRegNumber,
           com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar,
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
        this.attention = attention;
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
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.companyName = companyName;
        this.contact = contact;
        this.country = country;
        this.countryCode = countryCode;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.currentExchangeRate = currentExchangeRate;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.entityId = entityId;
        this.entityNumber = entityNumber;
        this.expenseAccount = expenseAccount;
        this.externalId = externalId;
        this.fax = fax;
        this.faxTransactions = faxTransactions;
        this.firstName = firstName;
        this.fxBalance = fxBalance;
        this.fxUnbilledOrders = fxUnbilledOrders;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.hasDuplicates = hasDuplicates;
        this.homePhone = homePhone;
        this.image = image;
        this.incoterm = incoterm;
        this.internalId = internalId;
        this.is1099Eligible = is1099Eligible;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobResourceVend = isJobResourceVend;
        this.isPerson = isPerson;
        this.laborCost = laborCost;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.level = level;
        this.middleName = middleName;
        this.mobilePhone = mobilePhone;
        this.payablesAccount = payablesAccount;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.printOnCheckAs = printOnCheckAs;
        this.printTransactions = printTransactions;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipAddress3 = shipAddress3;
        this.shipAddressee = shipAddressee;
        this.shipAttention = shipAttention;
        this.shipCity = shipCity;
        this.shipCountry = shipCountry;
        this.shipCountryCode = shipCountryCode;
        this.shipPhone = shipPhone;
        this.shipState = shipState;
        this.shipZip = shipZip;
        this.state = state;
        this.subscription = subscription;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionStatus = subscriptionStatus;
        this.subsidiary = subsidiary;
        this.taxIdNum = taxIdNum;
        this.terms = terms;
        this.timeApprover = timeApprover;
        this.title = title;
        this.unbilledOrders = unbilledOrders;
        this.url = url;
        this.vatRegNumber = vatRegNumber;
        this.workCalendar = workCalendar;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this VendorSearchRowBasic.
     * 
     * @return accountNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this VendorSearchRowBasic.
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
     * Gets the address value for this VendorSearchRowBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this VendorSearchRowBasic.
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
     * Gets the address1 value for this VendorSearchRowBasic.
     * 
     * @return address1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this VendorSearchRowBasic.
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
     * Gets the address2 value for this VendorSearchRowBasic.
     * 
     * @return address2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this VendorSearchRowBasic.
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
     * Gets the address3 value for this VendorSearchRowBasic.
     * 
     * @return address3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this VendorSearchRowBasic.
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
     * Gets the addressee value for this VendorSearchRowBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this VendorSearchRowBasic.
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
     * Gets the addressInternalId value for this VendorSearchRowBasic.
     * 
     * @return addressInternalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressInternalId() {
        return addressInternalId;
    }


    /**
     * Sets the addressInternalId value for this VendorSearchRowBasic.
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
     * Gets the addressLabel value for this VendorSearchRowBasic.
     * 
     * @return addressLabel
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this VendorSearchRowBasic.
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
     * Gets the addressPhone value for this VendorSearchRowBasic.
     * 
     * @return addressPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this VendorSearchRowBasic.
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
     * Gets the altContact value for this VendorSearchRowBasic.
     * 
     * @return altContact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltContact() {
        return altContact;
    }


    /**
     * Sets the altContact value for this VendorSearchRowBasic.
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
     * Gets the altEmail value for this VendorSearchRowBasic.
     * 
     * @return altEmail
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this VendorSearchRowBasic.
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
     * Gets the altName value for this VendorSearchRowBasic.
     * 
     * @return altName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this VendorSearchRowBasic.
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
     * Gets the altPhone value for this VendorSearchRowBasic.
     * 
     * @return altPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this VendorSearchRowBasic.
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
     * Gets the attention value for this VendorSearchRowBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this VendorSearchRowBasic.
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
     * Gets the balance value for this VendorSearchRowBasic.
     * 
     * @return balance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this VendorSearchRowBasic.
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
     * Gets the billAddress value for this VendorSearchRowBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this VendorSearchRowBasic.
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
     * Gets the billAddress1 value for this VendorSearchRowBasic.
     * 
     * @return billAddress1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this VendorSearchRowBasic.
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
     * Gets the billAddress2 value for this VendorSearchRowBasic.
     * 
     * @return billAddress2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this VendorSearchRowBasic.
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
     * Gets the billAddress3 value for this VendorSearchRowBasic.
     * 
     * @return billAddress3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddress3() {
        return billAddress3;
    }


    /**
     * Sets the billAddress3 value for this VendorSearchRowBasic.
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
     * Gets the billAddressee value for this VendorSearchRowBasic.
     * 
     * @return billAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this VendorSearchRowBasic.
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
     * Gets the billAttention value for this VendorSearchRowBasic.
     * 
     * @return billAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this VendorSearchRowBasic.
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
     * Gets the billCity value for this VendorSearchRowBasic.
     * 
     * @return billCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this VendorSearchRowBasic.
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
     * Gets the billCountry value for this VendorSearchRowBasic.
     * 
     * @return billCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this VendorSearchRowBasic.
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
     * Gets the billCountryCode value for this VendorSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this VendorSearchRowBasic.
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
     * Gets the billPhone value for this VendorSearchRowBasic.
     * 
     * @return billPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this VendorSearchRowBasic.
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
     * Gets the billState value for this VendorSearchRowBasic.
     * 
     * @return billState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this VendorSearchRowBasic.
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
     * Gets the billZipCode value for this VendorSearchRowBasic.
     * 
     * @return billZipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getBillZipCode() {
        return billZipCode;
    }


    /**
     * Sets the billZipCode value for this VendorSearchRowBasic.
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
     * Gets the category value for this VendorSearchRowBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this VendorSearchRowBasic.
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
     * Gets the city value for this VendorSearchRowBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this VendorSearchRowBasic.
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
     * Gets the comments value for this VendorSearchRowBasic.
     * 
     * @return comments
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this VendorSearchRowBasic.
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
     * Gets the companyName value for this VendorSearchRowBasic.
     * 
     * @return companyName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this VendorSearchRowBasic.
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
     * Gets the contact value for this VendorSearchRowBasic.
     * 
     * @return contact
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this VendorSearchRowBasic.
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
     * Gets the country value for this VendorSearchRowBasic.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this VendorSearchRowBasic.
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
     * Gets the countryCode value for this VendorSearchRowBasic.
     * 
     * @return countryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this VendorSearchRowBasic.
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
     * Gets the creditLimit value for this VendorSearchRowBasic.
     * 
     * @return creditLimit
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this VendorSearchRowBasic.
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
     * Gets the currency value for this VendorSearchRowBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this VendorSearchRowBasic.
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
     * Gets the currentExchangeRate value for this VendorSearchRowBasic.
     * 
     * @return currentExchangeRate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getCurrentExchangeRate() {
        return currentExchangeRate;
    }


    /**
     * Sets the currentExchangeRate value for this VendorSearchRowBasic.
     * 
     * @param currentExchangeRate
     */
    public void setCurrentExchangeRate(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] currentExchangeRate) {
        this.currentExchangeRate = currentExchangeRate;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getCurrentExchangeRate(int i) {
        return this.currentExchangeRate[i];
    }

    public void setCurrentExchangeRate(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.currentExchangeRate[i] = _value;
    }


    /**
     * Gets the dateCreated value for this VendorSearchRowBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this VendorSearchRowBasic.
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
     * Gets the defaultTaxReg value for this VendorSearchRowBasic.
     * 
     * @return defaultTaxReg
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getDefaultTaxReg() {
        return defaultTaxReg;
    }


    /**
     * Sets the defaultTaxReg value for this VendorSearchRowBasic.
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
     * Gets the eligibleForCommission value for this VendorSearchRowBasic.
     * 
     * @return eligibleForCommission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this VendorSearchRowBasic.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getEligibleForCommission(int i) {
        return this.eligibleForCommission[i];
    }

    public void setEligibleForCommission(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.eligibleForCommission[i] = _value;
    }


    /**
     * Gets the email value for this VendorSearchRowBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this VendorSearchRowBasic.
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
     * Gets the emailPreference value for this VendorSearchRowBasic.
     * 
     * @return emailPreference
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getEmailPreference() {
        return emailPreference;
    }


    /**
     * Sets the emailPreference value for this VendorSearchRowBasic.
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
     * Gets the emailTransactions value for this VendorSearchRowBasic.
     * 
     * @return emailTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this VendorSearchRowBasic.
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
     * Gets the entityId value for this VendorSearchRowBasic.
     * 
     * @return entityId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this VendorSearchRowBasic.
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
     * Gets the entityNumber value for this VendorSearchRowBasic.
     * 
     * @return entityNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnLongField[] getEntityNumber() {
        return entityNumber;
    }


    /**
     * Sets the entityNumber value for this VendorSearchRowBasic.
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
     * Gets the expenseAccount value for this VendorSearchRowBasic.
     * 
     * @return expenseAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this VendorSearchRowBasic.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getExpenseAccount(int i) {
        return this.expenseAccount[i];
    }

    public void setExpenseAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.expenseAccount[i] = _value;
    }


    /**
     * Gets the externalId value for this VendorSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this VendorSearchRowBasic.
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
     * Gets the fax value for this VendorSearchRowBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this VendorSearchRowBasic.
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
     * Gets the faxTransactions value for this VendorSearchRowBasic.
     * 
     * @return faxTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this VendorSearchRowBasic.
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
     * Gets the firstName value for this VendorSearchRowBasic.
     * 
     * @return firstName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this VendorSearchRowBasic.
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
     * Gets the fxBalance value for this VendorSearchRowBasic.
     * 
     * @return fxBalance
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxBalance() {
        return fxBalance;
    }


    /**
     * Sets the fxBalance value for this VendorSearchRowBasic.
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
     * Gets the fxUnbilledOrders value for this VendorSearchRowBasic.
     * 
     * @return fxUnbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getFxUnbilledOrders() {
        return fxUnbilledOrders;
    }


    /**
     * Sets the fxUnbilledOrders value for this VendorSearchRowBasic.
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
     * Gets the giveAccess value for this VendorSearchRowBasic.
     * 
     * @return giveAccess
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this VendorSearchRowBasic.
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
     * Gets the globalSubscriptionStatus value for this VendorSearchRowBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this VendorSearchRowBasic.
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
     * Gets the hasDuplicates value for this VendorSearchRowBasic.
     * 
     * @return hasDuplicates
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this VendorSearchRowBasic.
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
     * Gets the homePhone value for this VendorSearchRowBasic.
     * 
     * @return homePhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this VendorSearchRowBasic.
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
     * Gets the image value for this VendorSearchRowBasic.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this VendorSearchRowBasic.
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
     * Gets the incoterm value for this VendorSearchRowBasic.
     * 
     * @return incoterm
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getIncoterm() {
        return incoterm;
    }


    /**
     * Sets the incoterm value for this VendorSearchRowBasic.
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
     * Gets the internalId value for this VendorSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this VendorSearchRowBasic.
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
     * Gets the is1099Eligible value for this VendorSearchRowBasic.
     * 
     * @return is1099Eligible
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIs1099Eligible() {
        return is1099Eligible;
    }


    /**
     * Sets the is1099Eligible value for this VendorSearchRowBasic.
     * 
     * @param is1099Eligible
     */
    public void setIs1099Eligible(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] is1099Eligible) {
        this.is1099Eligible = is1099Eligible;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIs1099Eligible(int i) {
        return this.is1099Eligible[i];
    }

    public void setIs1099Eligible(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.is1099Eligible[i] = _value;
    }


    /**
     * Gets the isDefaultBilling value for this VendorSearchRowBasic.
     * 
     * @return isDefaultBilling
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this VendorSearchRowBasic.
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
     * Gets the isDefaultShipping value for this VendorSearchRowBasic.
     * 
     * @return isDefaultShipping
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this VendorSearchRowBasic.
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
     * Gets the isInactive value for this VendorSearchRowBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this VendorSearchRowBasic.
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
     * Gets the isJobResourceVend value for this VendorSearchRowBasic.
     * 
     * @return isJobResourceVend
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsJobResourceVend() {
        return isJobResourceVend;
    }


    /**
     * Sets the isJobResourceVend value for this VendorSearchRowBasic.
     * 
     * @param isJobResourceVend
     */
    public void setIsJobResourceVend(com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] isJobResourceVend) {
        this.isJobResourceVend = isJobResourceVend;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField getIsJobResourceVend(int i) {
        return this.isJobResourceVend[i];
    }

    public void setIsJobResourceVend(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField _value) {
        this.isJobResourceVend[i] = _value;
    }


    /**
     * Gets the isPerson value for this VendorSearchRowBasic.
     * 
     * @return isPerson
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this VendorSearchRowBasic.
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
     * Gets the laborCost value for this VendorSearchRowBasic.
     * 
     * @return laborCost
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this VendorSearchRowBasic.
     * 
     * @param laborCost
     */
    public void setLaborCost(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] laborCost) {
        this.laborCost = laborCost;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getLaborCost(int i) {
        return this.laborCost[i];
    }

    public void setLaborCost(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.laborCost[i] = _value;
    }


    /**
     * Gets the language value for this VendorSearchRowBasic.
     * 
     * @return language
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this VendorSearchRowBasic.
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
     * Gets the lastModifiedDate value for this VendorSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this VendorSearchRowBasic.
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
     * Gets the lastName value for this VendorSearchRowBasic.
     * 
     * @return lastName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this VendorSearchRowBasic.
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
     * Gets the level value for this VendorSearchRowBasic.
     * 
     * @return level
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getLevel() {
        return level;
    }


    /**
     * Sets the level value for this VendorSearchRowBasic.
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
     * Gets the middleName value for this VendorSearchRowBasic.
     * 
     * @return middleName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this VendorSearchRowBasic.
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
     * Gets the mobilePhone value for this VendorSearchRowBasic.
     * 
     * @return mobilePhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this VendorSearchRowBasic.
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
     * Gets the payablesAccount value for this VendorSearchRowBasic.
     * 
     * @return payablesAccount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getPayablesAccount() {
        return payablesAccount;
    }


    /**
     * Sets the payablesAccount value for this VendorSearchRowBasic.
     * 
     * @param payablesAccount
     */
    public void setPayablesAccount(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] payablesAccount) {
        this.payablesAccount = payablesAccount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getPayablesAccount(int i) {
        return this.payablesAccount[i];
    }

    public void setPayablesAccount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.payablesAccount[i] = _value;
    }


    /**
     * Gets the pec value for this VendorSearchRowBasic.
     * 
     * @return pec
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this VendorSearchRowBasic.
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
     * Gets the permission value for this VendorSearchRowBasic.
     * 
     * @return permission
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this VendorSearchRowBasic.
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
     * Gets the phone value for this VendorSearchRowBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this VendorSearchRowBasic.
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
     * Gets the phoneticName value for this VendorSearchRowBasic.
     * 
     * @return phoneticName
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this VendorSearchRowBasic.
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
     * Gets the printOnCheckAs value for this VendorSearchRowBasic.
     * 
     * @return printOnCheckAs
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getPrintOnCheckAs() {
        return printOnCheckAs;
    }


    /**
     * Sets the printOnCheckAs value for this VendorSearchRowBasic.
     * 
     * @param printOnCheckAs
     */
    public void setPrintOnCheckAs(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] printOnCheckAs) {
        this.printOnCheckAs = printOnCheckAs;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getPrintOnCheckAs(int i) {
        return this.printOnCheckAs[i];
    }

    public void setPrintOnCheckAs(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.printOnCheckAs[i] = _value;
    }


    /**
     * Gets the printTransactions value for this VendorSearchRowBasic.
     * 
     * @return printTransactions
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this VendorSearchRowBasic.
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
     * Gets the purchaseOrderAmount value for this VendorSearchRowBasic.
     * 
     * @return purchaseOrderAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }


    /**
     * Sets the purchaseOrderAmount value for this VendorSearchRowBasic.
     * 
     * @param purchaseOrderAmount
     */
    public void setPurchaseOrderAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderAmount(int i) {
        return this.purchaseOrderAmount[i];
    }

    public void setPurchaseOrderAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderAmount[i] = _value;
    }


    /**
     * Gets the purchaseOrderQuantity value for this VendorSearchRowBasic.
     * 
     * @return purchaseOrderQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }


    /**
     * Sets the purchaseOrderQuantity value for this VendorSearchRowBasic.
     * 
     * @param purchaseOrderQuantity
     */
    public void setPurchaseOrderQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderQuantity(int i) {
        return this.purchaseOrderQuantity[i];
    }

    public void setPurchaseOrderQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderQuantity[i] = _value;
    }


    /**
     * Gets the purchaseOrderQuantityDiff value for this VendorSearchRowBasic.
     * 
     * @return purchaseOrderQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }


    /**
     * Sets the purchaseOrderQuantityDiff value for this VendorSearchRowBasic.
     * 
     * @param purchaseOrderQuantityDiff
     */
    public void setPurchaseOrderQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getPurchaseOrderQuantityDiff(int i) {
        return this.purchaseOrderQuantityDiff[i];
    }

    public void setPurchaseOrderQuantityDiff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.purchaseOrderQuantityDiff[i] = _value;
    }


    /**
     * Gets the receiptAmount value for this VendorSearchRowBasic.
     * 
     * @return receiptAmount
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptAmount() {
        return receiptAmount;
    }


    /**
     * Sets the receiptAmount value for this VendorSearchRowBasic.
     * 
     * @param receiptAmount
     */
    public void setReceiptAmount(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptAmount(int i) {
        return this.receiptAmount[i];
    }

    public void setReceiptAmount(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptAmount[i] = _value;
    }


    /**
     * Gets the receiptQuantity value for this VendorSearchRowBasic.
     * 
     * @return receiptQuantity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptQuantity() {
        return receiptQuantity;
    }


    /**
     * Sets the receiptQuantity value for this VendorSearchRowBasic.
     * 
     * @param receiptQuantity
     */
    public void setReceiptQuantity(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptQuantity(int i) {
        return this.receiptQuantity[i];
    }

    public void setReceiptQuantity(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptQuantity[i] = _value;
    }


    /**
     * Gets the receiptQuantityDiff value for this VendorSearchRowBasic.
     * 
     * @return receiptQuantityDiff
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }


    /**
     * Sets the receiptQuantityDiff value for this VendorSearchRowBasic.
     * 
     * @param receiptQuantityDiff
     */
    public void setReceiptQuantityDiff(com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField getReceiptQuantityDiff(int i) {
        return this.receiptQuantityDiff[i];
    }

    public void setReceiptQuantityDiff(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField _value) {
        this.receiptQuantityDiff[i] = _value;
    }


    /**
     * Gets the salutation value for this VendorSearchRowBasic.
     * 
     * @return salutation
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this VendorSearchRowBasic.
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
     * Gets the shipAddress value for this VendorSearchRowBasic.
     * 
     * @return shipAddress
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this VendorSearchRowBasic.
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
     * Gets the shipAddress1 value for this VendorSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this VendorSearchRowBasic.
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
     * Gets the shipAddress2 value for this VendorSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this VendorSearchRowBasic.
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
     * Gets the shipAddress3 value for this VendorSearchRowBasic.
     * 
     * @return shipAddress3
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddress3() {
        return shipAddress3;
    }


    /**
     * Sets the shipAddress3 value for this VendorSearchRowBasic.
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
     * Gets the shipAddressee value for this VendorSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this VendorSearchRowBasic.
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
     * Gets the shipAttention value for this VendorSearchRowBasic.
     * 
     * @return shipAttention
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this VendorSearchRowBasic.
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
     * Gets the shipCity value for this VendorSearchRowBasic.
     * 
     * @return shipCity
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this VendorSearchRowBasic.
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
     * Gets the shipCountry value for this VendorSearchRowBasic.
     * 
     * @return shipCountry
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this VendorSearchRowBasic.
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
     * Gets the shipCountryCode value for this VendorSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this VendorSearchRowBasic.
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
     * Gets the shipPhone value for this VendorSearchRowBasic.
     * 
     * @return shipPhone
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this VendorSearchRowBasic.
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
     * Gets the shipState value for this VendorSearchRowBasic.
     * 
     * @return shipState
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this VendorSearchRowBasic.
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
     * Gets the shipZip value for this VendorSearchRowBasic.
     * 
     * @return shipZip
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this VendorSearchRowBasic.
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
     * Gets the state value for this VendorSearchRowBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this VendorSearchRowBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] state) {
        this.state = state;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the subscription value for this VendorSearchRowBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this VendorSearchRowBasic.
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
     * Gets the subscriptionDate value for this VendorSearchRowBasic.
     * 
     * @return subscriptionDate
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDateField[] getSubscriptionDate() {
        return subscriptionDate;
    }


    /**
     * Sets the subscriptionDate value for this VendorSearchRowBasic.
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
     * Gets the subscriptionStatus value for this VendorSearchRowBasic.
     * 
     * @return subscriptionStatus
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnBooleanField[] getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this VendorSearchRowBasic.
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
     * Gets the subsidiary value for this VendorSearchRowBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this VendorSearchRowBasic.
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
     * Gets the taxIdNum value for this VendorSearchRowBasic.
     * 
     * @return taxIdNum
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this VendorSearchRowBasic.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField getTaxIdNum(int i) {
        return this.taxIdNum[i];
    }

    public void setTaxIdNum(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField _value) {
        this.taxIdNum[i] = _value;
    }


    /**
     * Gets the terms value for this VendorSearchRowBasic.
     * 
     * @return terms
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this VendorSearchRowBasic.
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
     * Gets the timeApprover value for this VendorSearchRowBasic.
     * 
     * @return timeApprover
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getTimeApprover() {
        return timeApprover;
    }


    /**
     * Sets the timeApprover value for this VendorSearchRowBasic.
     * 
     * @param timeApprover
     */
    public void setTimeApprover(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] timeApprover) {
        this.timeApprover = timeApprover;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getTimeApprover(int i) {
        return this.timeApprover[i];
    }

    public void setTimeApprover(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.timeApprover[i] = _value;
    }


    /**
     * Gets the title value for this VendorSearchRowBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this VendorSearchRowBasic.
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
     * Gets the unbilledOrders value for this VendorSearchRowBasic.
     * 
     * @return unbilledOrders
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnDoubleField[] getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this VendorSearchRowBasic.
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
     * Gets the url value for this VendorSearchRowBasic.
     * 
     * @return url
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this VendorSearchRowBasic.
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
     * Gets the vatRegNumber value for this VendorSearchRowBasic.
     * 
     * @return vatRegNumber
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this VendorSearchRowBasic.
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
     * Gets the workCalendar value for this VendorSearchRowBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this VendorSearchRowBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, com.netsuite.webservices.platform.core_2019_1.SearchColumnSelectField _value) {
        this.workCalendar[i] = _value;
    }


    /**
     * Gets the zipCode value for this VendorSearchRowBasic.
     * 
     * @return zipCode
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField[] getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this VendorSearchRowBasic.
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
     * Gets the customFieldList value for this VendorSearchRowBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this VendorSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2019_1.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorSearchRowBasic)) return false;
        VendorSearchRowBasic other = (VendorSearchRowBasic) obj;
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
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              java.util.Arrays.equals(this.attention, other.getAttention()))) &&
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
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              java.util.Arrays.equals(this.companyName, other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              java.util.Arrays.equals(this.creditLimit, other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.currentExchangeRate==null && other.getCurrentExchangeRate()==null) || 
             (this.currentExchangeRate!=null &&
              java.util.Arrays.equals(this.currentExchangeRate, other.getCurrentExchangeRate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.defaultTaxReg==null && other.getDefaultTaxReg()==null) || 
             (this.defaultTaxReg!=null &&
              java.util.Arrays.equals(this.defaultTaxReg, other.getDefaultTaxReg()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              java.util.Arrays.equals(this.eligibleForCommission, other.getEligibleForCommission()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.emailPreference==null && other.getEmailPreference()==null) || 
             (this.emailPreference!=null &&
              java.util.Arrays.equals(this.emailPreference, other.getEmailPreference()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              java.util.Arrays.equals(this.emailTransactions, other.getEmailTransactions()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              java.util.Arrays.equals(this.entityId, other.getEntityId()))) &&
            ((this.entityNumber==null && other.getEntityNumber()==null) || 
             (this.entityNumber!=null &&
              java.util.Arrays.equals(this.entityNumber, other.getEntityNumber()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              java.util.Arrays.equals(this.expenseAccount, other.getExpenseAccount()))) &&
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
            ((this.fxBalance==null && other.getFxBalance()==null) || 
             (this.fxBalance!=null &&
              java.util.Arrays.equals(this.fxBalance, other.getFxBalance()))) &&
            ((this.fxUnbilledOrders==null && other.getFxUnbilledOrders()==null) || 
             (this.fxUnbilledOrders!=null &&
              java.util.Arrays.equals(this.fxUnbilledOrders, other.getFxUnbilledOrders()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              java.util.Arrays.equals(this.giveAccess, other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              java.util.Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              java.util.Arrays.equals(this.hasDuplicates, other.getHasDuplicates()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              java.util.Arrays.equals(this.homePhone, other.getHomePhone()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.incoterm==null && other.getIncoterm()==null) || 
             (this.incoterm!=null &&
              java.util.Arrays.equals(this.incoterm, other.getIncoterm()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.is1099Eligible==null && other.getIs1099Eligible()==null) || 
             (this.is1099Eligible!=null &&
              java.util.Arrays.equals(this.is1099Eligible, other.getIs1099Eligible()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              java.util.Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              java.util.Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isJobResourceVend==null && other.getIsJobResourceVend()==null) || 
             (this.isJobResourceVend!=null &&
              java.util.Arrays.equals(this.isJobResourceVend, other.getIsJobResourceVend()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              java.util.Arrays.equals(this.isPerson, other.getIsPerson()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              java.util.Arrays.equals(this.laborCost, other.getLaborCost()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              java.util.Arrays.equals(this.level, other.getLevel()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              java.util.Arrays.equals(this.middleName, other.getMiddleName()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              java.util.Arrays.equals(this.mobilePhone, other.getMobilePhone()))) &&
            ((this.payablesAccount==null && other.getPayablesAccount()==null) || 
             (this.payablesAccount!=null &&
              java.util.Arrays.equals(this.payablesAccount, other.getPayablesAccount()))) &&
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
            ((this.printOnCheckAs==null && other.getPrintOnCheckAs()==null) || 
             (this.printOnCheckAs!=null &&
              java.util.Arrays.equals(this.printOnCheckAs, other.getPrintOnCheckAs()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              java.util.Arrays.equals(this.printTransactions, other.getPrintTransactions()))) &&
            ((this.purchaseOrderAmount==null && other.getPurchaseOrderAmount()==null) || 
             (this.purchaseOrderAmount!=null &&
              java.util.Arrays.equals(this.purchaseOrderAmount, other.getPurchaseOrderAmount()))) &&
            ((this.purchaseOrderQuantity==null && other.getPurchaseOrderQuantity()==null) || 
             (this.purchaseOrderQuantity!=null &&
              java.util.Arrays.equals(this.purchaseOrderQuantity, other.getPurchaseOrderQuantity()))) &&
            ((this.purchaseOrderQuantityDiff==null && other.getPurchaseOrderQuantityDiff()==null) || 
             (this.purchaseOrderQuantityDiff!=null &&
              java.util.Arrays.equals(this.purchaseOrderQuantityDiff, other.getPurchaseOrderQuantityDiff()))) &&
            ((this.receiptAmount==null && other.getReceiptAmount()==null) || 
             (this.receiptAmount!=null &&
              java.util.Arrays.equals(this.receiptAmount, other.getReceiptAmount()))) &&
            ((this.receiptQuantity==null && other.getReceiptQuantity()==null) || 
             (this.receiptQuantity!=null &&
              java.util.Arrays.equals(this.receiptQuantity, other.getReceiptQuantity()))) &&
            ((this.receiptQuantityDiff==null && other.getReceiptQuantityDiff()==null) || 
             (this.receiptQuantityDiff!=null &&
              java.util.Arrays.equals(this.receiptQuantityDiff, other.getReceiptQuantityDiff()))) &&
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
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              java.util.Arrays.equals(this.shipCountry, other.getShipCountry()))) &&
            ((this.shipCountryCode==null && other.getShipCountryCode()==null) || 
             (this.shipCountryCode!=null &&
              java.util.Arrays.equals(this.shipCountryCode, other.getShipCountryCode()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              java.util.Arrays.equals(this.shipPhone, other.getShipPhone()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              java.util.Arrays.equals(this.shipState, other.getShipState()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              java.util.Arrays.equals(this.shipZip, other.getShipZip()))) &&
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
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              java.util.Arrays.equals(this.taxIdNum, other.getTaxIdNum()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              java.util.Arrays.equals(this.terms, other.getTerms()))) &&
            ((this.timeApprover==null && other.getTimeApprover()==null) || 
             (this.timeApprover!=null &&
              java.util.Arrays.equals(this.timeApprover, other.getTimeApprover()))) &&
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
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              java.util.Arrays.equals(this.workCalendar, other.getWorkCalendar()))) &&
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
        if (getCurrentExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentExchangeRate(), i);
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
        if (getEligibleForCommission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEligibleForCommission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEligibleForCommission(), i);
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
        if (getExpenseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseAccount(), i);
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
        if (getIs1099Eligible() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIs1099Eligible());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIs1099Eligible(), i);
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
        if (getIsJobResourceVend() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsJobResourceVend());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsJobResourceVend(), i);
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
        if (getLaborCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLaborCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLaborCost(), i);
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
        if (getPayablesAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayablesAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayablesAccount(), i);
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
        if (getPrintOnCheckAs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintOnCheckAs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintOnCheckAs(), i);
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
        if (getPurchaseOrderAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderQuantityDiff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderQuantityDiff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderQuantityDiff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptQuantityDiff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptQuantityDiff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptQuantityDiff(), i);
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
        if (getTaxIdNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxIdNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxIdNum(), i);
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
        if (getTimeApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeApprover(), i);
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
        if (getWorkCalendar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkCalendar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkCalendar(), i);
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
        new org.apache.axis.description.TypeDesc(VendorSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
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
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "category"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("currentExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "currentExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("fxBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "fxBalance"));
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
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "incoterm"));
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
        elemField.setFieldName("is1099Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "is1099Eligible"));
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
        elemField.setFieldName("isJobResourceVend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "isJobResourceVend"));
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
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "payablesAccount"));
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
        elemField.setFieldName("printOnCheckAs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "printOnCheckAs"));
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
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "timeApprover"));
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
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2019_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2019_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
