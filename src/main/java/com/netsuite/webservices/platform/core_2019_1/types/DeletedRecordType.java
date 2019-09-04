/**
 * DeletedRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2019_1.types;

public class DeletedRecordType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeletedRecordType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _advInterCompanyJournalEntry = "advInterCompanyJournalEntry";
    public static final java.lang.String _assemblyBuild = "assemblyBuild";
    public static final java.lang.String _assemblyItem = "assemblyItem";
    public static final java.lang.String _assemblyUnbuild = "assemblyUnbuild";
    public static final java.lang.String _billingSchedule = "billingSchedule";
    public static final java.lang.String _bin = "bin";
    public static final java.lang.String _binTransfer = "binTransfer";
    public static final java.lang.String _binWorksheet = "binWorksheet";
    public static final java.lang.String _bom = "bom";
    public static final java.lang.String _bomRevision = "bomRevision";
    public static final java.lang.String _calendarEvent = "calendarEvent";
    public static final java.lang.String _campaign = "campaign";
    public static final java.lang.String _cashRefund = "cashRefund";
    public static final java.lang.String _cashSale = "cashSale";
    public static final java.lang.String _charge = "charge";
    public static final java.lang.String _check = "check";
    public static final java.lang.String _contact = "contact";
    public static final java.lang.String _contactCategory = "contactCategory";
    public static final java.lang.String _costCategory = "costCategory";
    public static final java.lang.String _couponCode = "couponCode";
    public static final java.lang.String _creditMemo = "creditMemo";
    public static final java.lang.String _currencyRate = "currencyRate";
    public static final java.lang.String _customRecord = "customRecord";
    public static final java.lang.String _customTransaction = "customTransaction";
    public static final java.lang.String _customer = "customer";
    public static final java.lang.String _customerCategory = "customerCategory";
    public static final java.lang.String _customerMessage = "customerMessage";
    public static final java.lang.String _customerDeposit = "customerDeposit";
    public static final java.lang.String _customerPayment = "customerPayment";
    public static final java.lang.String _customerRefund = "customerRefund";
    public static final java.lang.String _customerStatus = "customerStatus";
    public static final java.lang.String _customerSubsidiaryRelationship = "customerSubsidiaryRelationship";
    public static final java.lang.String _deposit = "deposit";
    public static final java.lang.String _depositApplication = "depositApplication";
    public static final java.lang.String _descriptionItem = "descriptionItem";
    public static final java.lang.String _discountItem = "discountItem";
    public static final java.lang.String _downloadItem = "downloadItem";
    public static final java.lang.String _employee = "employee";
    public static final java.lang.String _estimate = "estimate";
    public static final java.lang.String _expenseReport = "expenseReport";
    public static final java.lang.String _file = "file";
    public static final java.lang.String _folder = "folder";
    public static final java.lang.String _giftCertificateItem = "giftCertificateItem";
    public static final java.lang.String _globalAccountMapping = "globalAccountMapping";
    public static final java.lang.String _interCompanyJournalEntry = "interCompanyJournalEntry";
    public static final java.lang.String _interCompanyTransferOrder = "interCompanyTransferOrder";
    public static final java.lang.String _inventoryAdjustment = "inventoryAdjustment";
    public static final java.lang.String _inventoryCostRevaluation = "inventoryCostRevaluation";
    public static final java.lang.String _inventoryItem = "inventoryItem";
    public static final java.lang.String _inventoryNumber = "inventoryNumber";
    public static final java.lang.String _inventoryTransfer = "inventoryTransfer";
    public static final java.lang.String _invoice = "invoice";
    public static final java.lang.String _issue = "issue";
    public static final java.lang.String _itemAccountMapping = "itemAccountMapping";
    public static final java.lang.String _itemDemandPlan = "itemDemandPlan";
    public static final java.lang.String _itemFulfillment = "itemFulfillment";
    public static final java.lang.String _itemSupplyPlan = "itemSupplyPlan";
    public static final java.lang.String _itemGroup = "itemGroup";
    public static final java.lang.String _itemReceipt = "itemReceipt";
    public static final java.lang.String _itemRevision = "itemRevision";
    public static final java.lang.String _job = "job";
    public static final java.lang.String _jobStatus = "jobStatus";
    public static final java.lang.String _journalEntry = "journalEntry";
    public static final java.lang.String _kitItem = "kitItem";
    public static final java.lang.String _lotNumberedAssemblyItem = "lotNumberedAssemblyItem";
    public static final java.lang.String _lotNumberedInventoryItem = "lotNumberedInventoryItem";
    public static final java.lang.String _markupItem = "markupItem";
    public static final java.lang.String _message = "message";
    public static final java.lang.String _manufacturingCostTemplate = "manufacturingCostTemplate";
    public static final java.lang.String _manufacturingOperationTask = "manufacturingOperationTask";
    public static final java.lang.String _manufacturingRouting = "manufacturingRouting";
    public static final java.lang.String _merchandiseHierarchyNode = "merchandiseHierarchyNode";
    public static final java.lang.String _nexus = "nexus";
    public static final java.lang.String _nonInventoryPurchaseItem = "nonInventoryPurchaseItem";
    public static final java.lang.String _nonInventoryResaleItem = "nonInventoryResaleItem";
    public static final java.lang.String _nonInventorySaleItem = "nonInventorySaleItem";
    public static final java.lang.String _note = "note";
    public static final java.lang.String _noteType = "noteType";
    public static final java.lang.String _opportunity = "opportunity";
    public static final java.lang.String _otherChargePurchaseItem = "otherChargePurchaseItem";
    public static final java.lang.String _otherChargeResaleItem = "otherChargeResaleItem";
    public static final java.lang.String _otherChargeSaleItem = "otherChargeSaleItem";
    public static final java.lang.String _otherNameCategory = "otherNameCategory";
    public static final java.lang.String _partner = "partner";
    public static final java.lang.String _paycheck = "paycheck";
    public static final java.lang.String _paymentItem = "paymentItem";
    public static final java.lang.String _paymentMethod = "paymentMethod";
    public static final java.lang.String _payrollItem = "payrollItem";
    public static final java.lang.String _periodEndJournal = "periodEndJournal";
    public static final java.lang.String _phoneCall = "phoneCall";
    public static final java.lang.String _priceLevel = "priceLevel";
    public static final java.lang.String _pricingGroup = "pricingGroup";
    public static final java.lang.String _projectTask = "projectTask";
    public static final java.lang.String _promotionCode = "promotionCode";
    public static final java.lang.String _purchaseOrder = "purchaseOrder";
    public static final java.lang.String _purchaseRequisition = "purchaseRequisition";
    public static final java.lang.String _resourceAllocation = "resourceAllocation";
    public static final java.lang.String _returnAuthorization = "returnAuthorization";
    public static final java.lang.String _salesOrder = "salesOrder";
    public static final java.lang.String _salesTaxItem = "salesTaxItem";
    public static final java.lang.String _serializedAssemblyItem = "serializedAssemblyItem";
    public static final java.lang.String _serializedInventoryItem = "serializedInventoryItem";
    public static final java.lang.String _servicePurchaseItem = "servicePurchaseItem";
    public static final java.lang.String _serviceResaleItem = "serviceResaleItem";
    public static final java.lang.String _serviceSaleItem = "serviceSaleItem";
    public static final java.lang.String _statisticalJournalEntry = "statisticalJournalEntry";
    public static final java.lang.String _subtotalItem = "subtotalItem";
    public static final java.lang.String _supportCase = "supportCase";
    public static final java.lang.String _supportCaseIssue = "supportCaseIssue";
    public static final java.lang.String _supportCaseOrigin = "supportCaseOrigin";
    public static final java.lang.String _supportCasePriority = "supportCasePriority";
    public static final java.lang.String _supportCaseStatus = "supportCaseStatus";
    public static final java.lang.String _supportCaseType = "supportCaseType";
    public static final java.lang.String _task = "task";
    public static final java.lang.String _term = "term";
    public static final java.lang.String _timeSheet = "timeSheet";
    public static final java.lang.String _transferOrder = "transferOrder";
    public static final java.lang.String _usage = "usage";
    public static final java.lang.String _vendor = "vendor";
    public static final java.lang.String _vendorBill = "vendorBill";
    public static final java.lang.String _vendorCredit = "vendorCredit";
    public static final java.lang.String _vendorPayment = "vendorPayment";
    public static final java.lang.String _vendorReturnAuthorization = "vendorReturnAuthorization";
    public static final java.lang.String _vendorSubsidiaryRelationship = "vendorSubsidiaryRelationship";
    public static final java.lang.String _winLossReason = "winLossReason";
    public static final java.lang.String _workOrder = "workOrder";
    public static final java.lang.String _workOrderIssue = "workOrderIssue";
    public static final java.lang.String _workOrderCompletion = "workOrderCompletion";
    public static final java.lang.String _workOrderClose = "workOrderClose";
    public static final DeletedRecordType advInterCompanyJournalEntry = new DeletedRecordType(_advInterCompanyJournalEntry);
    public static final DeletedRecordType assemblyBuild = new DeletedRecordType(_assemblyBuild);
    public static final DeletedRecordType assemblyItem = new DeletedRecordType(_assemblyItem);
    public static final DeletedRecordType assemblyUnbuild = new DeletedRecordType(_assemblyUnbuild);
    public static final DeletedRecordType billingSchedule = new DeletedRecordType(_billingSchedule);
    public static final DeletedRecordType bin = new DeletedRecordType(_bin);
    public static final DeletedRecordType binTransfer = new DeletedRecordType(_binTransfer);
    public static final DeletedRecordType binWorksheet = new DeletedRecordType(_binWorksheet);
    public static final DeletedRecordType bom = new DeletedRecordType(_bom);
    public static final DeletedRecordType bomRevision = new DeletedRecordType(_bomRevision);
    public static final DeletedRecordType calendarEvent = new DeletedRecordType(_calendarEvent);
    public static final DeletedRecordType campaign = new DeletedRecordType(_campaign);
    public static final DeletedRecordType cashRefund = new DeletedRecordType(_cashRefund);
    public static final DeletedRecordType cashSale = new DeletedRecordType(_cashSale);
    public static final DeletedRecordType charge = new DeletedRecordType(_charge);
    public static final DeletedRecordType check = new DeletedRecordType(_check);
    public static final DeletedRecordType contact = new DeletedRecordType(_contact);
    public static final DeletedRecordType contactCategory = new DeletedRecordType(_contactCategory);
    public static final DeletedRecordType costCategory = new DeletedRecordType(_costCategory);
    public static final DeletedRecordType couponCode = new DeletedRecordType(_couponCode);
    public static final DeletedRecordType creditMemo = new DeletedRecordType(_creditMemo);
    public static final DeletedRecordType currencyRate = new DeletedRecordType(_currencyRate);
    public static final DeletedRecordType customRecord = new DeletedRecordType(_customRecord);
    public static final DeletedRecordType customTransaction = new DeletedRecordType(_customTransaction);
    public static final DeletedRecordType customer = new DeletedRecordType(_customer);
    public static final DeletedRecordType customerCategory = new DeletedRecordType(_customerCategory);
    public static final DeletedRecordType customerMessage = new DeletedRecordType(_customerMessage);
    public static final DeletedRecordType customerDeposit = new DeletedRecordType(_customerDeposit);
    public static final DeletedRecordType customerPayment = new DeletedRecordType(_customerPayment);
    public static final DeletedRecordType customerRefund = new DeletedRecordType(_customerRefund);
    public static final DeletedRecordType customerStatus = new DeletedRecordType(_customerStatus);
    public static final DeletedRecordType customerSubsidiaryRelationship = new DeletedRecordType(_customerSubsidiaryRelationship);
    public static final DeletedRecordType deposit = new DeletedRecordType(_deposit);
    public static final DeletedRecordType depositApplication = new DeletedRecordType(_depositApplication);
    public static final DeletedRecordType descriptionItem = new DeletedRecordType(_descriptionItem);
    public static final DeletedRecordType discountItem = new DeletedRecordType(_discountItem);
    public static final DeletedRecordType downloadItem = new DeletedRecordType(_downloadItem);
    public static final DeletedRecordType employee = new DeletedRecordType(_employee);
    public static final DeletedRecordType estimate = new DeletedRecordType(_estimate);
    public static final DeletedRecordType expenseReport = new DeletedRecordType(_expenseReport);
    public static final DeletedRecordType file = new DeletedRecordType(_file);
    public static final DeletedRecordType folder = new DeletedRecordType(_folder);
    public static final DeletedRecordType giftCertificateItem = new DeletedRecordType(_giftCertificateItem);
    public static final DeletedRecordType globalAccountMapping = new DeletedRecordType(_globalAccountMapping);
    public static final DeletedRecordType interCompanyJournalEntry = new DeletedRecordType(_interCompanyJournalEntry);
    public static final DeletedRecordType interCompanyTransferOrder = new DeletedRecordType(_interCompanyTransferOrder);
    public static final DeletedRecordType inventoryAdjustment = new DeletedRecordType(_inventoryAdjustment);
    public static final DeletedRecordType inventoryCostRevaluation = new DeletedRecordType(_inventoryCostRevaluation);
    public static final DeletedRecordType inventoryItem = new DeletedRecordType(_inventoryItem);
    public static final DeletedRecordType inventoryNumber = new DeletedRecordType(_inventoryNumber);
    public static final DeletedRecordType inventoryTransfer = new DeletedRecordType(_inventoryTransfer);
    public static final DeletedRecordType invoice = new DeletedRecordType(_invoice);
    public static final DeletedRecordType issue = new DeletedRecordType(_issue);
    public static final DeletedRecordType itemAccountMapping = new DeletedRecordType(_itemAccountMapping);
    public static final DeletedRecordType itemDemandPlan = new DeletedRecordType(_itemDemandPlan);
    public static final DeletedRecordType itemFulfillment = new DeletedRecordType(_itemFulfillment);
    public static final DeletedRecordType itemSupplyPlan = new DeletedRecordType(_itemSupplyPlan);
    public static final DeletedRecordType itemGroup = new DeletedRecordType(_itemGroup);
    public static final DeletedRecordType itemReceipt = new DeletedRecordType(_itemReceipt);
    public static final DeletedRecordType itemRevision = new DeletedRecordType(_itemRevision);
    public static final DeletedRecordType job = new DeletedRecordType(_job);
    public static final DeletedRecordType jobStatus = new DeletedRecordType(_jobStatus);
    public static final DeletedRecordType journalEntry = new DeletedRecordType(_journalEntry);
    public static final DeletedRecordType kitItem = new DeletedRecordType(_kitItem);
    public static final DeletedRecordType lotNumberedAssemblyItem = new DeletedRecordType(_lotNumberedAssemblyItem);
    public static final DeletedRecordType lotNumberedInventoryItem = new DeletedRecordType(_lotNumberedInventoryItem);
    public static final DeletedRecordType markupItem = new DeletedRecordType(_markupItem);
    public static final DeletedRecordType message = new DeletedRecordType(_message);
    public static final DeletedRecordType manufacturingCostTemplate = new DeletedRecordType(_manufacturingCostTemplate);
    public static final DeletedRecordType manufacturingOperationTask = new DeletedRecordType(_manufacturingOperationTask);
    public static final DeletedRecordType manufacturingRouting = new DeletedRecordType(_manufacturingRouting);
    public static final DeletedRecordType merchandiseHierarchyNode = new DeletedRecordType(_merchandiseHierarchyNode);
    public static final DeletedRecordType nexus = new DeletedRecordType(_nexus);
    public static final DeletedRecordType nonInventoryPurchaseItem = new DeletedRecordType(_nonInventoryPurchaseItem);
    public static final DeletedRecordType nonInventoryResaleItem = new DeletedRecordType(_nonInventoryResaleItem);
    public static final DeletedRecordType nonInventorySaleItem = new DeletedRecordType(_nonInventorySaleItem);
    public static final DeletedRecordType note = new DeletedRecordType(_note);
    public static final DeletedRecordType noteType = new DeletedRecordType(_noteType);
    public static final DeletedRecordType opportunity = new DeletedRecordType(_opportunity);
    public static final DeletedRecordType otherChargePurchaseItem = new DeletedRecordType(_otherChargePurchaseItem);
    public static final DeletedRecordType otherChargeResaleItem = new DeletedRecordType(_otherChargeResaleItem);
    public static final DeletedRecordType otherChargeSaleItem = new DeletedRecordType(_otherChargeSaleItem);
    public static final DeletedRecordType otherNameCategory = new DeletedRecordType(_otherNameCategory);
    public static final DeletedRecordType partner = new DeletedRecordType(_partner);
    public static final DeletedRecordType paycheck = new DeletedRecordType(_paycheck);
    public static final DeletedRecordType paymentItem = new DeletedRecordType(_paymentItem);
    public static final DeletedRecordType paymentMethod = new DeletedRecordType(_paymentMethod);
    public static final DeletedRecordType payrollItem = new DeletedRecordType(_payrollItem);
    public static final DeletedRecordType periodEndJournal = new DeletedRecordType(_periodEndJournal);
    public static final DeletedRecordType phoneCall = new DeletedRecordType(_phoneCall);
    public static final DeletedRecordType priceLevel = new DeletedRecordType(_priceLevel);
    public static final DeletedRecordType pricingGroup = new DeletedRecordType(_pricingGroup);
    public static final DeletedRecordType projectTask = new DeletedRecordType(_projectTask);
    public static final DeletedRecordType promotionCode = new DeletedRecordType(_promotionCode);
    public static final DeletedRecordType purchaseOrder = new DeletedRecordType(_purchaseOrder);
    public static final DeletedRecordType purchaseRequisition = new DeletedRecordType(_purchaseRequisition);
    public static final DeletedRecordType resourceAllocation = new DeletedRecordType(_resourceAllocation);
    public static final DeletedRecordType returnAuthorization = new DeletedRecordType(_returnAuthorization);
    public static final DeletedRecordType salesOrder = new DeletedRecordType(_salesOrder);
    public static final DeletedRecordType salesTaxItem = new DeletedRecordType(_salesTaxItem);
    public static final DeletedRecordType serializedAssemblyItem = new DeletedRecordType(_serializedAssemblyItem);
    public static final DeletedRecordType serializedInventoryItem = new DeletedRecordType(_serializedInventoryItem);
    public static final DeletedRecordType servicePurchaseItem = new DeletedRecordType(_servicePurchaseItem);
    public static final DeletedRecordType serviceResaleItem = new DeletedRecordType(_serviceResaleItem);
    public static final DeletedRecordType serviceSaleItem = new DeletedRecordType(_serviceSaleItem);
    public static final DeletedRecordType statisticalJournalEntry = new DeletedRecordType(_statisticalJournalEntry);
    public static final DeletedRecordType subtotalItem = new DeletedRecordType(_subtotalItem);
    public static final DeletedRecordType supportCase = new DeletedRecordType(_supportCase);
    public static final DeletedRecordType supportCaseIssue = new DeletedRecordType(_supportCaseIssue);
    public static final DeletedRecordType supportCaseOrigin = new DeletedRecordType(_supportCaseOrigin);
    public static final DeletedRecordType supportCasePriority = new DeletedRecordType(_supportCasePriority);
    public static final DeletedRecordType supportCaseStatus = new DeletedRecordType(_supportCaseStatus);
    public static final DeletedRecordType supportCaseType = new DeletedRecordType(_supportCaseType);
    public static final DeletedRecordType task = new DeletedRecordType(_task);
    public static final DeletedRecordType term = new DeletedRecordType(_term);
    public static final DeletedRecordType timeSheet = new DeletedRecordType(_timeSheet);
    public static final DeletedRecordType transferOrder = new DeletedRecordType(_transferOrder);
    public static final DeletedRecordType usage = new DeletedRecordType(_usage);
    public static final DeletedRecordType vendor = new DeletedRecordType(_vendor);
    public static final DeletedRecordType vendorBill = new DeletedRecordType(_vendorBill);
    public static final DeletedRecordType vendorCredit = new DeletedRecordType(_vendorCredit);
    public static final DeletedRecordType vendorPayment = new DeletedRecordType(_vendorPayment);
    public static final DeletedRecordType vendorReturnAuthorization = new DeletedRecordType(_vendorReturnAuthorization);
    public static final DeletedRecordType vendorSubsidiaryRelationship = new DeletedRecordType(_vendorSubsidiaryRelationship);
    public static final DeletedRecordType winLossReason = new DeletedRecordType(_winLossReason);
    public static final DeletedRecordType workOrder = new DeletedRecordType(_workOrder);
    public static final DeletedRecordType workOrderIssue = new DeletedRecordType(_workOrderIssue);
    public static final DeletedRecordType workOrderCompletion = new DeletedRecordType(_workOrderCompletion);
    public static final DeletedRecordType workOrderClose = new DeletedRecordType(_workOrderClose);
    public java.lang.String getValue() { return _value_;}
    public static DeletedRecordType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeletedRecordType enumeration = (DeletedRecordType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeletedRecordType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeletedRecordType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2019_1.platform.webservices.netsuite.com", "DeletedRecordType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
