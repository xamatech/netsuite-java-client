/**
 * SearchRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1.types;

public class SearchRecordType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchRecordType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _account = "account";
    public static final java.lang.String _accountingPeriod = "accountingPeriod";
    public static final java.lang.String _accountingTransaction = "accountingTransaction";
    public static final java.lang.String _billingAccount = "billingAccount";
    public static final java.lang.String _billingSchedule = "billingSchedule";
    public static final java.lang.String _bin = "bin";
    public static final java.lang.String _bom = "bom";
    public static final java.lang.String _bomRevision = "bomRevision";
    public static final java.lang.String _budget = "budget";
    public static final java.lang.String _calendarEvent = "calendarEvent";
    public static final java.lang.String _campaign = "campaign";
    public static final java.lang.String _charge = "charge";
    public static final java.lang.String _classification = "classification";
    public static final java.lang.String _contact = "contact";
    public static final java.lang.String _contactCategory = "contactCategory";
    public static final java.lang.String _contactRole = "contactRole";
    public static final java.lang.String _costCategory = "costCategory";
    public static final java.lang.String _consolidatedExchangeRate = "consolidatedExchangeRate";
    public static final java.lang.String _couponCode = "couponCode";
    public static final java.lang.String _currencyRate = "currencyRate";
    public static final java.lang.String _customer = "customer";
    public static final java.lang.String _customerCategory = "customerCategory";
    public static final java.lang.String _customerMessage = "customerMessage";
    public static final java.lang.String _customerStatus = "customerStatus";
    public static final java.lang.String _customerSubsidiaryRelationship = "customerSubsidiaryRelationship";
    public static final java.lang.String _customList = "customList";
    public static final java.lang.String _customRecord = "customRecord";
    public static final java.lang.String _department = "department";
    public static final java.lang.String _employee = "employee";
    public static final java.lang.String _entityGroup = "entityGroup";
    public static final java.lang.String _expenseCategory = "expenseCategory";
    public static final java.lang.String _fairValuePrice = "fairValuePrice";
    public static final java.lang.String _file = "file";
    public static final java.lang.String _folder = "folder";
    public static final java.lang.String _giftCertificate = "giftCertificate";
    public static final java.lang.String _globalAccountMapping = "globalAccountMapping";
    public static final java.lang.String _hcmJob = "hcmJob";
    public static final java.lang.String _inboundShipment = "inboundShipment";
    public static final java.lang.String _inventoryNumber = "inventoryNumber";
    public static final java.lang.String _item = "item";
    public static final java.lang.String _itemAccountMapping = "itemAccountMapping";
    public static final java.lang.String _itemDemandPlan = "itemDemandPlan";
    public static final java.lang.String _itemRevision = "itemRevision";
    public static final java.lang.String _itemSupplyPlan = "itemSupplyPlan";
    public static final java.lang.String _issue = "issue";
    public static final java.lang.String _job = "job";
    public static final java.lang.String _jobStatus = "jobStatus";
    public static final java.lang.String _jobType = "jobType";
    public static final java.lang.String _location = "location";
    public static final java.lang.String _manufacturingCostTemplate = "manufacturingCostTemplate";
    public static final java.lang.String _manufacturingOperationTask = "manufacturingOperationTask";
    public static final java.lang.String _manufacturingRouting = "manufacturingRouting";
    public static final java.lang.String _merchandiseHierarchyNode = "merchandiseHierarchyNode";
    public static final java.lang.String _message = "message";
    public static final java.lang.String _nexus = "nexus";
    public static final java.lang.String _note = "note";
    public static final java.lang.String _noteType = "noteType";
    public static final java.lang.String _opportunity = "opportunity";
    public static final java.lang.String _otherNameCategory = "otherNameCategory";
    public static final java.lang.String _partner = "partner";
    public static final java.lang.String _partnerCategory = "partnerCategory";
    public static final java.lang.String _paycheck = "paycheck";
    public static final java.lang.String _paymentMethod = "paymentMethod";
    public static final java.lang.String _payrollItem = "payrollItem";
    public static final java.lang.String _phoneCall = "phoneCall";
    public static final java.lang.String _priceLevel = "priceLevel";
    public static final java.lang.String _pricingGroup = "pricingGroup";
    public static final java.lang.String _projectTask = "projectTask";
    public static final java.lang.String _promotionCode = "promotionCode";
    public static final java.lang.String _resourceAllocation = "resourceAllocation";
    public static final java.lang.String _revRecSchedule = "revRecSchedule";
    public static final java.lang.String _revRecTemplate = "revRecTemplate";
    public static final java.lang.String _salesRole = "salesRole";
    public static final java.lang.String _salesTaxItem = "salesTaxItem";
    public static final java.lang.String _solution = "solution";
    public static final java.lang.String _siteCategory = "siteCategory";
    public static final java.lang.String _subsidiary = "subsidiary";
    public static final java.lang.String _supportCase = "supportCase";
    public static final java.lang.String _task = "task";
    public static final java.lang.String _taxGroup = "taxGroup";
    public static final java.lang.String _taxType = "taxType";
    public static final java.lang.String _term = "term";
    public static final java.lang.String _timeBill = "timeBill";
    public static final java.lang.String _timeSheet = "timeSheet";
    public static final java.lang.String _topic = "topic";
    public static final java.lang.String _transaction = "transaction";
    public static final java.lang.String _unitsType = "unitsType";
    public static final java.lang.String _usage = "usage";
    public static final java.lang.String _vendor = "vendor";
    public static final java.lang.String _vendorCategory = "vendorCategory";
    public static final java.lang.String _vendorSubsidiaryRelationship = "vendorSubsidiaryRelationship";
    public static final java.lang.String _winLossReason = "winLossReason";
    public static final SearchRecordType account = new SearchRecordType(_account);
    public static final SearchRecordType accountingPeriod = new SearchRecordType(_accountingPeriod);
    public static final SearchRecordType accountingTransaction = new SearchRecordType(_accountingTransaction);
    public static final SearchRecordType billingAccount = new SearchRecordType(_billingAccount);
    public static final SearchRecordType billingSchedule = new SearchRecordType(_billingSchedule);
    public static final SearchRecordType bin = new SearchRecordType(_bin);
    public static final SearchRecordType bom = new SearchRecordType(_bom);
    public static final SearchRecordType bomRevision = new SearchRecordType(_bomRevision);
    public static final SearchRecordType budget = new SearchRecordType(_budget);
    public static final SearchRecordType calendarEvent = new SearchRecordType(_calendarEvent);
    public static final SearchRecordType campaign = new SearchRecordType(_campaign);
    public static final SearchRecordType charge = new SearchRecordType(_charge);
    public static final SearchRecordType classification = new SearchRecordType(_classification);
    public static final SearchRecordType contact = new SearchRecordType(_contact);
    public static final SearchRecordType contactCategory = new SearchRecordType(_contactCategory);
    public static final SearchRecordType contactRole = new SearchRecordType(_contactRole);
    public static final SearchRecordType costCategory = new SearchRecordType(_costCategory);
    public static final SearchRecordType consolidatedExchangeRate = new SearchRecordType(_consolidatedExchangeRate);
    public static final SearchRecordType couponCode = new SearchRecordType(_couponCode);
    public static final SearchRecordType currencyRate = new SearchRecordType(_currencyRate);
    public static final SearchRecordType customer = new SearchRecordType(_customer);
    public static final SearchRecordType customerCategory = new SearchRecordType(_customerCategory);
    public static final SearchRecordType customerMessage = new SearchRecordType(_customerMessage);
    public static final SearchRecordType customerStatus = new SearchRecordType(_customerStatus);
    public static final SearchRecordType customerSubsidiaryRelationship = new SearchRecordType(_customerSubsidiaryRelationship);
    public static final SearchRecordType customList = new SearchRecordType(_customList);
    public static final SearchRecordType customRecord = new SearchRecordType(_customRecord);
    public static final SearchRecordType department = new SearchRecordType(_department);
    public static final SearchRecordType employee = new SearchRecordType(_employee);
    public static final SearchRecordType entityGroup = new SearchRecordType(_entityGroup);
    public static final SearchRecordType expenseCategory = new SearchRecordType(_expenseCategory);
    public static final SearchRecordType fairValuePrice = new SearchRecordType(_fairValuePrice);
    public static final SearchRecordType file = new SearchRecordType(_file);
    public static final SearchRecordType folder = new SearchRecordType(_folder);
    public static final SearchRecordType giftCertificate = new SearchRecordType(_giftCertificate);
    public static final SearchRecordType globalAccountMapping = new SearchRecordType(_globalAccountMapping);
    public static final SearchRecordType hcmJob = new SearchRecordType(_hcmJob);
    public static final SearchRecordType inboundShipment = new SearchRecordType(_inboundShipment);
    public static final SearchRecordType inventoryNumber = new SearchRecordType(_inventoryNumber);
    public static final SearchRecordType item = new SearchRecordType(_item);
    public static final SearchRecordType itemAccountMapping = new SearchRecordType(_itemAccountMapping);
    public static final SearchRecordType itemDemandPlan = new SearchRecordType(_itemDemandPlan);
    public static final SearchRecordType itemRevision = new SearchRecordType(_itemRevision);
    public static final SearchRecordType itemSupplyPlan = new SearchRecordType(_itemSupplyPlan);
    public static final SearchRecordType issue = new SearchRecordType(_issue);
    public static final SearchRecordType job = new SearchRecordType(_job);
    public static final SearchRecordType jobStatus = new SearchRecordType(_jobStatus);
    public static final SearchRecordType jobType = new SearchRecordType(_jobType);
    public static final SearchRecordType location = new SearchRecordType(_location);
    public static final SearchRecordType manufacturingCostTemplate = new SearchRecordType(_manufacturingCostTemplate);
    public static final SearchRecordType manufacturingOperationTask = new SearchRecordType(_manufacturingOperationTask);
    public static final SearchRecordType manufacturingRouting = new SearchRecordType(_manufacturingRouting);
    public static final SearchRecordType merchandiseHierarchyNode = new SearchRecordType(_merchandiseHierarchyNode);
    public static final SearchRecordType message = new SearchRecordType(_message);
    public static final SearchRecordType nexus = new SearchRecordType(_nexus);
    public static final SearchRecordType note = new SearchRecordType(_note);
    public static final SearchRecordType noteType = new SearchRecordType(_noteType);
    public static final SearchRecordType opportunity = new SearchRecordType(_opportunity);
    public static final SearchRecordType otherNameCategory = new SearchRecordType(_otherNameCategory);
    public static final SearchRecordType partner = new SearchRecordType(_partner);
    public static final SearchRecordType partnerCategory = new SearchRecordType(_partnerCategory);
    public static final SearchRecordType paycheck = new SearchRecordType(_paycheck);
    public static final SearchRecordType paymentMethod = new SearchRecordType(_paymentMethod);
    public static final SearchRecordType payrollItem = new SearchRecordType(_payrollItem);
    public static final SearchRecordType phoneCall = new SearchRecordType(_phoneCall);
    public static final SearchRecordType priceLevel = new SearchRecordType(_priceLevel);
    public static final SearchRecordType pricingGroup = new SearchRecordType(_pricingGroup);
    public static final SearchRecordType projectTask = new SearchRecordType(_projectTask);
    public static final SearchRecordType promotionCode = new SearchRecordType(_promotionCode);
    public static final SearchRecordType resourceAllocation = new SearchRecordType(_resourceAllocation);
    public static final SearchRecordType revRecSchedule = new SearchRecordType(_revRecSchedule);
    public static final SearchRecordType revRecTemplate = new SearchRecordType(_revRecTemplate);
    public static final SearchRecordType salesRole = new SearchRecordType(_salesRole);
    public static final SearchRecordType salesTaxItem = new SearchRecordType(_salesTaxItem);
    public static final SearchRecordType solution = new SearchRecordType(_solution);
    public static final SearchRecordType siteCategory = new SearchRecordType(_siteCategory);
    public static final SearchRecordType subsidiary = new SearchRecordType(_subsidiary);
    public static final SearchRecordType supportCase = new SearchRecordType(_supportCase);
    public static final SearchRecordType task = new SearchRecordType(_task);
    public static final SearchRecordType taxGroup = new SearchRecordType(_taxGroup);
    public static final SearchRecordType taxType = new SearchRecordType(_taxType);
    public static final SearchRecordType term = new SearchRecordType(_term);
    public static final SearchRecordType timeBill = new SearchRecordType(_timeBill);
    public static final SearchRecordType timeSheet = new SearchRecordType(_timeSheet);
    public static final SearchRecordType topic = new SearchRecordType(_topic);
    public static final SearchRecordType transaction = new SearchRecordType(_transaction);
    public static final SearchRecordType unitsType = new SearchRecordType(_unitsType);
    public static final SearchRecordType usage = new SearchRecordType(_usage);
    public static final SearchRecordType vendor = new SearchRecordType(_vendor);
    public static final SearchRecordType vendorCategory = new SearchRecordType(_vendorCategory);
    public static final SearchRecordType vendorSubsidiaryRelationship = new SearchRecordType(_vendorSubsidiaryRelationship);
    public static final SearchRecordType winLossReason = new SearchRecordType(_winLossReason);
    public java.lang.String getValue() { return _value_;}
    public static SearchRecordType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchRecordType enumeration = (SearchRecordType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchRecordType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchRecordType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "SearchRecordType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
